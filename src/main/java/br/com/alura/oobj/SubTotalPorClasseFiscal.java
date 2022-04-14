package br.com.alura.oobj;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeMap;

public class SubTotalPorClasseFiscal {
    private TreeMap<String, BigDecimal> subTotalPorClasseFiscal = new TreeMap<String, BigDecimal>();

    public BigDecimal adicionarSubtotal (String classeFiscal, BigDecimal subTotal) {
        return this.subTotalPorClasseFiscal.put(classeFiscal, subTotal);
    }

    public BigDecimal obterSubtotal (String classeFiscal) {
        return this.subTotalPorClasseFiscal.get(classeFiscal);
    }
    public Set<String> obterClassesFiscais() {
        return this.subTotalPorClasseFiscal.keySet();
    }
}
