package com.xiaomi.push;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
class p {
    private String a;
    private final ArrayList<ag> b = new ArrayList<>();

    public p() {
    }

    public p(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        this.a = str;
    }

    public synchronized ag a() {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            ag agVar = this.b.get(size);
            if (agVar.m3494a()) {
                ak.a().m3499a(agVar.a());
                return agVar;
            }
        }
        return null;
    }

    public synchronized p b(JSONObject jSONObject) {
        this.a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.b.add(new ag(this.a).a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    public String c() {
        return this.a;
    }

    public ArrayList<ag> d() {
        return this.b;
    }

    public synchronized JSONObject e() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("host", this.a);
        JSONArray jSONArray = new JSONArray();
        Iterator<ag> it2 = this.b.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().m3492a());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    public synchronized void f(ag agVar) {
        int i = 0;
        while (i < this.b.size()) {
            if (this.b.get(i).a(agVar)) {
                this.b.set(i, agVar);
                break;
            }
            i++;
        }
        if (i >= this.b.size()) {
            this.b.add(agVar);
        }
    }

    public synchronized void g(boolean z) {
        ArrayList<ag> arrayList;
        for (int size = this.b.size() - 1; size >= 0; size--) {
            ag agVar = this.b.get(size);
            if (z) {
                if (agVar.d()) {
                    arrayList = this.b;
                    arrayList.remove(size);
                }
            } else if (!agVar.b()) {
                arrayList = this.b;
                arrayList.remove(size);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("\n");
        Iterator<ag> it2 = this.b.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
        }
        return sb.toString();
    }
}
