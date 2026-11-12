package com.xiaomi.ai.nlp.factoid.parsers;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import defpackage.a8f;
import defpackage.hl8;
import defpackage.pr5;
import defpackage.yb8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Parser {
    public int a(a8f a8fVar, String str, yb8 yb8Var) {
        if (yb8Var == null) {
            return -1;
        }
        return yb8Var.b() + (a8fVar.end() - a8fVar.a(str));
    }

    public int b(a8f a8fVar, String str, yb8 yb8Var) {
        if (yb8Var == null) {
            return -1;
        }
        return yb8Var.d() - (a8fVar.f(str) - a8fVar.start());
    }

    public abstract String c();

    public int d(int i, TreeMap<Integer, yb8> treeMap) {
        yb8 value = null;
        int length = 0;
        for (Map.Entry<Integer, yb8> entry : treeMap.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if (iIntValue >= i) {
                break;
            }
            value = entry.getValue();
            length = value.c().length() + iIntValue;
        }
        return value != null ? (value.b() + i) - length : i;
    }

    public ParseResult e(hl8 hl8Var, List<EntityType> list) {
        String strG = hl8Var.g();
        ArrayList arrayList = new ArrayList(16);
        for (EntityType entityType : list) {
            if (hl8Var.b(entityType)) {
                Iterator<ParseResult> it = hl8Var.e(entityType).iterator();
                while (it.hasNext()) {
                    arrayList.addAll(it.next().a().values());
                }
            }
        }
        Collections.sort(arrayList, new Comparator<yb8>() { // from class: com.xiaomi.ai.nlp.factoid.parsers.Parser.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(yb8 yb8Var, yb8 yb8Var2) {
                int iD = yb8Var.d() - yb8Var2.d();
                return iD == 0 ? yb8Var2.b() - yb8Var.b() : iD;
            }
        });
        TreeMap treeMap = new TreeMap();
        StringBuilder sb = new StringBuilder();
        int iB = 0;
        int length = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            yb8 yb8Var = (yb8) arrayList.get(i);
            int iD = yb8Var.d();
            int iB2 = yb8Var.b();
            String strC = yb8Var.c();
            if (iD >= iB) {
                sb.append(strG.substring(iB, iD));
                sb.append(strC);
                treeMap.put(Integer.valueOf(iD + length), yb8Var);
                length += strC.length() - (iB2 - iD);
                iB = yb8Var.b();
            }
        }
        sb.append(strG.substring(iB));
        return new ParseResult(sb.toString(), treeMap);
    }

    public void f(pr5 pr5Var, ParseResult parseResult) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("parser", getClass().getName());
        jsonObject.addProperty("pattern", parseResult.b());
        JsonArray jsonArray = new JsonArray();
        Iterator<Map.Entry<Integer, yb8>> it = parseResult.a().entrySet().iterator();
        while (it.hasNext()) {
            jsonArray.add(it.next().getValue().i());
        }
        jsonObject.add("entities", jsonArray);
        pr5Var.a(jsonObject.toString());
    }

    public abstract void g(hl8 hl8Var, boolean z);
}
