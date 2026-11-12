package com.xiaomi.push;

import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
class t implements Comparable<t> {
    private final LinkedList<af> a;
    public String b;
    private long c;
    public int d;

    public t() {
        this(null, 0);
    }

    public t(String str) {
        this(str, 0);
    }

    public t(String str, int i) {
        this.a = new LinkedList<>();
        this.c = 0L;
        this.b = str;
        this.d = i;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(t tVar) {
        if (tVar == null) {
            return 1;
        }
        return tVar.d - this.d;
    }

    public synchronized t b(JSONObject jSONObject) {
        this.c = jSONObject.getLong(com.google.android.exoplayer2.text.ttml.b.n);
        this.d = jSONObject.getInt("wt");
        this.b = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("ah");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.a.add(new af().a(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    public synchronized JSONObject c() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put(com.google.android.exoplayer2.text.ttml.b.n, this.c);
        jSONObject.put("wt", this.d);
        jSONObject.put("host", this.b);
        JSONArray jSONArray = new JSONArray();
        Iterator<af> it2 = this.a.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().m3490a());
        }
        jSONObject.put("ah", jSONArray);
        return jSONObject;
    }

    public synchronized void d(af afVar) {
        if (afVar != null) {
            this.a.add(afVar);
            int iA = afVar.a();
            if (iA > 0) {
                this.d += afVar.a();
            } else {
                int i = 0;
                for (int size = this.a.size() - 1; size >= 0 && this.a.get(size).a() < 0; size--) {
                    i++;
                }
                this.d += iA * i;
            }
            if (this.a.size() > 30) {
                this.d -= this.a.remove().a();
            }
        }
    }

    public String toString() {
        return this.b + ":" + this.d;
    }
}
