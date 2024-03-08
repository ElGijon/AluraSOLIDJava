package br.com.alura.rh.service;

public class ReajusteService {

    public void ReajusteSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento){
        BigDecimal salarioAtual = funcionario,getSalario();
        BigDecimal percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP);
        if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
        }

        funcionario.atualizarSalario();

    }
}