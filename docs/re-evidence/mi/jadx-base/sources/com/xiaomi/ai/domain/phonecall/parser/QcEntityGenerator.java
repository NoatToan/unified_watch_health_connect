package com.xiaomi.ai.domain.phonecall.parser;

import com.google.gson.JsonObject;
import com.xiaomi.ai.nlp.contact.common.a;
import defpackage.brk;
import defpackage.ovg;
import defpackage.xb8;
import defpackage.y2e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class QcEntityGenerator {
    private Map<String, List<ResourceItem>> qcTokenMap = new HashMap();

    public class ResourceItem {
        private JsonObject metaInfo;
        private String normToken;
        private String token;

        public ResourceItem(String str, String str2, JsonObject jsonObject) {
            this.token = str;
            this.normToken = str2;
            this.metaInfo = jsonObject;
        }

        public JsonObject getMetaInfo() {
            return this.metaInfo;
        }

        public String getNormToken() {
            return this.normToken;
        }

        public String getToken() {
            return this.token;
        }
    }

    public QcEntityGenerator(brk brkVar) {
        for (brk.a aVar : brkVar.getResources("operation")) {
            String strC = aVar.c();
            Iterator<a.C0349a> it = a.b().f(strC, false).iterator();
            while (it.hasNext()) {
                String strC2 = it.next().c();
                if (!this.qcTokenMap.containsKey(strC2)) {
                    this.qcTokenMap.put(strC2, new ArrayList());
                }
                this.qcTokenMap.get(strC2).add(new ResourceItem(strC, aVar.b(), aVar.a()));
            }
        }
    }

    public List<xb8> addQcEntity(y2e y2eVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, ovg>> it = y2eVar.n().entrySet().iterator();
        while (it.hasNext()) {
            xb8 xb8VarI = it.next().getValue().i();
            Iterator<a.C0349a> it2 = a.b().f(xb8VarI.h(), false).iterator();
            while (it2.hasNext()) {
                String strC = it2.next().c();
                if (this.qcTokenMap.containsKey(strC)) {
                    for (ResourceItem resourceItem : this.qcTokenMap.get(strC)) {
                        arrayList.add(new xb8(xb8VarI.a(), xb8VarI.b(), resourceItem.getToken(), resourceItem.getNormToken(), "operation", xb8VarI.g(), xb8VarI.c(), resourceItem.getMetaInfo()));
                    }
                    this = this;
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            y2eVar.d((xb8) it3.next());
        }
        return arrayList;
    }

    public String getQc(String str, List<xb8> list) {
        StringBuilder sb = new StringBuilder(str);
        for (xb8 xb8Var : list) {
            int iA = xb8Var.a();
            int iB = xb8Var.b();
            for (int i = iA; i < iB; i++) {
                sb.setCharAt(i, xb8Var.h().charAt(i - iA));
            }
        }
        return sb.toString();
    }
}
