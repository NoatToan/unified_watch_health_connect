package com.xiaomi.ai.nlp.factoid.parsers;

import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import defpackage.hl8;
import defpackage.i2h;
import defpackage.jlo;
import defpackage.ljh;
import defpackage.m2h;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public class NumberParser extends Parser {
    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public String c() {
        return "NumberParser";
    }

    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public void g(hl8 hl8Var, boolean z) {
        int i;
        String strH = i2h.h(hl8Var.g());
        if (jlo.b(strH)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        TreeMap treeMap = new TreeMap();
        int length = 0;
        int i2 = 0;
        while (i2 < strH.length()) {
            char cCharAt = strH.charAt(i2);
            if (i2h.a(cCharAt)) {
                ljh<Double, Integer> ljhVarE = i2h.e(strH.substring(i2));
                double dDoubleValue = ljhVarE.a().doubleValue();
                int iIntValue = ljhVarE.b().intValue();
                if (iIntValue > 0) {
                    i = i2 + iIntValue;
                    m2h m2hVar = new m2h(i2, i, strH.substring(i2, i), dDoubleValue);
                    treeMap.put(Integer.valueOf(i2 + length), m2hVar);
                    sb.append(m2hVar.c());
                    length += m2hVar.c().length() - iIntValue;
                } else {
                    i = i2 + 1;
                }
                i2 = i;
            } else {
                sb.append(cCharAt);
                i2++;
            }
        }
        ParseResult parseResult = new ParseResult(i2h.g(sb.toString()), treeMap);
        hl8Var.i(EntityType.Number, parseResult);
        if (z) {
            f(hl8Var.d(), parseResult);
        }
    }
}
