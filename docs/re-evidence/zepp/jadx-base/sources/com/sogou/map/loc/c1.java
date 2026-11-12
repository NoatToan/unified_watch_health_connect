package com.sogou.map.loc;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
final class c1 {
    public final List a;
    private long b;

    public c1(List list, long j) {
        this.a = list;
        this.b = j;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            JSONObject jSONObjectA = ((e1) it2.next()).a();
            j0.j(jSONObjectA, "gainTime", Long.valueOf(this.b));
            jSONArray.put(jSONObjectA);
        }
        return jSONArray;
    }
}
