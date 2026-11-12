package com.xmlywind.volley;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes22.dex */
public final class e {
    private final String a;
    private final String b;

    public e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            if (!TextUtils.equals(this.a, eVar.a) || !TextUtils.equals(this.b, eVar.b)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.a + ",value=" + this.b + "]";
    }
}
