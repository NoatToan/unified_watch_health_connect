package com.xiaomi.push;

import android.text.TextUtils;
import com.twitter.sdk.android.core.identity.AuthHandler;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class ag {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    private long i;
    private String k;
    private ArrayList<t> j = new ArrayList<>();
    private double l = 0.1d;
    private String m = "s.mi1.cc";
    private long n = 86400000;

    public ag(String str) {
        this.a = "";
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        this.i = System.currentTimeMillis();
        this.j.add(new t(str, -1));
        this.a = ak.f();
        this.b = str;
    }

    private synchronized void c(String str) {
        Iterator<t> it2 = this.j.iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(it2.next().b, str)) {
                it2.remove();
            }
        }
    }

    public synchronized ag a(JSONObject jSONObject) {
        this.a = jSONObject.optString(com.alipay.sdk.m.k.b.k);
        this.n = jSONObject.getLong("ttl");
        this.l = jSONObject.getDouble("pct");
        this.i = jSONObject.getLong(AuthHandler.d);
        this.d = jSONObject.optString("city");
        this.c = jSONObject.optString("prv");
        this.g = jSONObject.optString("cty");
        this.e = jSONObject.optString("isp");
        this.f = jSONObject.optString("ip");
        this.b = jSONObject.optString("host");
        this.h = jSONObject.optString("xf");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            b(new t().b(jSONArray.getJSONObject(i)));
        }
        return this;
    }

    public synchronized String a() {
        if (!TextUtils.isEmpty(this.k)) {
            return this.k;
        }
        if (TextUtils.isEmpty(this.e)) {
            return "hardcode_isp";
        }
        String strA = ad.a(new String[]{this.e, this.c, this.d, this.g, this.f}, "_");
        this.k = strA;
        return strA;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized ArrayList<String> m3491a() {
        return a(false);
    }

    public ArrayList<String> a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the url is empty.");
        }
        URL url = new URL(str);
        if (!TextUtils.equals(url.getHost(), this.b)) {
            throw new IllegalArgumentException("the url is not supported by the fallback");
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String> it2 = a(true).iterator();
        while (it2.hasNext()) {
            ai aiVarA = ai.a(it2.next(), url.getPort());
            arrayList.add(new URL(url.getProtocol(), aiVarA.m3496a(), aiVarA.a(), url.getFile()).toString());
        }
        return arrayList;
    }

    public synchronized ArrayList<String> a(boolean z) {
        ArrayList<String> arrayList;
        int iIndexOf;
        int size = this.j.size();
        t[] tVarArr = new t[size];
        this.j.toArray(tVarArr);
        Arrays.sort(tVarArr);
        arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            t tVar = tVarArr[i];
            String strSubstring = (z || (iIndexOf = tVar.b.indexOf(":")) == -1) ? tVar.b : tVar.b.substring(0, iIndexOf);
            arrayList.add(strSubstring);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized JSONObject m3492a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put(com.alipay.sdk.m.k.b.k, this.a);
        jSONObject.put("ttl", this.n);
        jSONObject.put("pct", this.l);
        jSONObject.put(AuthHandler.d, this.i);
        jSONObject.put("city", this.d);
        jSONObject.put("prv", this.c);
        jSONObject.put("cty", this.g);
        jSONObject.put("isp", this.e);
        jSONObject.put("ip", this.f);
        jSONObject.put("host", this.b);
        jSONObject.put("xf", this.h);
        JSONArray jSONArray = new JSONArray();
        Iterator<t> it2 = this.j.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().c());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    public void a(double d) {
        this.l = d;
    }

    public void a(long j) {
        if (j > 0) {
            this.n = j;
            return;
        }
        throw new IllegalArgumentException("the duration is invalid " + j);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized void m3493a(String str) {
        b(new t(str));
    }

    public void a(String str, int i, long j, long j2, Exception exc) {
        a(str, new af(i, j, j2, exc));
    }

    public void a(String str, long j, long j2) {
        try {
            b(new URL(str).getHost(), j, j2);
        } catch (MalformedURLException unused) {
        }
    }

    public void a(String str, long j, long j2, Exception exc) {
        try {
            b(new URL(str).getHost(), j, j2, exc);
        } catch (MalformedURLException unused) {
        }
    }

    public synchronized void a(String str, af afVar) {
        for (t tVar : this.j) {
            if (TextUtils.equals(str, tVar.b)) {
                tVar.d(afVar);
                break;
            }
        }
    }

    public synchronized void a(String[] strArr) {
        int i;
        int size = this.j.size() - 1;
        while (true) {
            i = 0;
            if (size < 0) {
                break;
            }
            int length = strArr.length;
            while (i < length) {
                if (TextUtils.equals(this.j.get(size).b, strArr[i])) {
                    this.j.remove(size);
                    break;
                }
                i++;
            }
            size--;
        }
        Iterator<t> it2 = this.j.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            int i3 = it2.next().d;
            if (i3 > i2) {
                i2 = i3;
            }
        }
        while (i < strArr.length) {
            b(new t(strArr[i], (strArr.length + i2) - i));
            i++;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m3494a() {
        return TextUtils.equals(this.a, ak.f());
    }

    public boolean a(ag agVar) {
        return TextUtils.equals(this.a, agVar.a);
    }

    public synchronized void b(t tVar) {
        c(tVar.b);
        this.j.add(tVar);
    }

    public void b(String str) {
        this.m = str;
    }

    public void b(String str, long j, long j2) {
        a(str, 0, j, j2, null);
    }

    public void b(String str, long j, long j2, Exception exc) {
        a(str, -1, j, j2, exc);
    }

    public boolean b() {
        return System.currentTimeMillis() - this.i < this.n;
    }

    public boolean d() {
        long j = this.n;
        if (864000000 >= j) {
            j = 864000000;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.i;
        return jCurrentTimeMillis - j2 > j || (jCurrentTimeMillis - j2 > this.n && this.a.startsWith("WIFI-"));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("\n");
        sb.append(a());
        for (t tVar : this.j) {
            sb.append("\n");
            sb.append(tVar.toString());
        }
        sb.append("\n");
        return sb.toString();
    }
}
