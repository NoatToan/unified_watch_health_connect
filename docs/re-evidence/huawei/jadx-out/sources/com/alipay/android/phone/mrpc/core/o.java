package com.alipay.android.phone.mrpc.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* JADX INFO: loaded from: classes4.dex */
public class o extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f2005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f2006c;
    private boolean g;
    private ArrayList<Header> e = new ArrayList<>();
    private Map<String, String> f = new HashMap();
    private String d = "application/x-www-form-urlencoded";

    public String toString() {
        return String.format("Url : %s,HttpHeader: %s", a(), d());
    }

    public int hashCode() {
        Map<String, String> map = this.f;
        int iHashCode = (map == null || !map.containsKey("id")) ? 1 : this.f.get("id").hashCode() + 31;
        String str = this.f2005b;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        byte[] bArr = this.f2006c;
        if (bArr == null) {
            if (oVar.f2006c != null) {
                return false;
            }
        } else if (!bArr.equals(oVar.f2006c)) {
            return false;
        }
        String str = this.f2005b;
        String str2 = oVar.f2005b;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public boolean e() {
        return this.g;
    }

    public ArrayList<Header> d() {
        return this.e;
    }

    public String c() {
        return this.d;
    }

    public byte[] b() {
        return this.f2006c;
    }

    public String b(String str) {
        Map<String, String> map = this.f;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public void a(byte[] bArr) {
        this.f2006c = bArr;
    }

    public void a(boolean z) {
        this.g = z;
    }

    public void a(Header header) {
        this.e.add(header);
    }

    public void a(String str, String str2) {
        if (this.f == null) {
            this.f = new HashMap();
        }
        this.f.put(str, str2);
    }

    public void a(String str) {
        this.d = str;
    }

    public String a() {
        return this.f2005b;
    }

    public o(String str) {
        this.f2005b = str;
    }
}
