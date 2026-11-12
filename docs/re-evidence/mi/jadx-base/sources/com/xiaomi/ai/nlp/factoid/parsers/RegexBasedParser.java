package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.code.regexp.Pattern;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import defpackage.a8f;
import defpackage.dq5;
import defpackage.hl8;
import defpackage.pr5;
import defpackage.yb8;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class RegexBasedParser extends Parser {
    @Override // com.xiaomi.ai.nlp.factoid.parsers.Parser
    public void g(hl8 hl8Var, boolean z) {
        pr5 pr5VarD = hl8Var.d();
        String strG = hl8Var.g();
        dq5 dq5VarH = hl8Var.h();
        StringBuilder sb = new StringBuilder();
        TreeMap treeMap = new TreeMap();
        ParseResult parseResultE = e(hl8Var, j());
        String strB = parseResultE.b();
        TreeMap<Integer, yb8> treeMapA = parseResultE.a();
        a8f a8fVarMatcher = k().matcher(strB);
        int iEnd = 0;
        int length = 0;
        while (a8fVarMatcher.c(iEnd)) {
            String str = strG;
            int i = iEnd;
            a8f a8fVar = a8fVarMatcher;
            yb8 yb8VarL = l(strG, a8fVarMatcher, treeMapA, dq5VarH, pr5VarD, z);
            if (yb8VarL != null) {
                sb.append(strB.substring(i, a8fVar.start()));
                sb.append(yb8VarL.c());
                treeMap.put(Integer.valueOf(a8fVar.start() + length), yb8VarL);
                length += yb8VarL.c().length() - (a8fVar.end() - a8fVar.start());
            } else {
                sb.append(strB.substring(i, a8fVar.end()));
            }
            iEnd = a8fVar.end();
            strG = str;
            a8fVarMatcher = a8fVar;
        }
        sb.append(strB.substring(iEnd));
        if (treeMap.size() > 0) {
            ParseResult parseResult = new ParseResult(sb.toString(), treeMap);
            hl8Var.i(i(), parseResult);
            if (z) {
                f(pr5VarD, parseResult);
            }
        }
    }

    public void h(boolean z, pr5 pr5Var, String str) {
        if (z) {
            pr5Var.a(String.format("matching group <%s> in parser <%s>", str, getClass().getName()));
        }
    }

    public abstract EntityType i();

    public abstract List<EntityType> j();

    public abstract Pattern k();

    public abstract yb8 l(String str, a8f a8fVar, TreeMap<Integer, yb8> treeMap, dq5 dq5Var, pr5 pr5Var, boolean z);
}
