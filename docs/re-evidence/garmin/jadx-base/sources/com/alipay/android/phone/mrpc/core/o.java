package com.alipay.android.phone.mrpc.core;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.Header;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f28310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f28311c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28315g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<Header> f28313e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, String> f28314f = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28312d = "application/x-www-form-urlencoded";

    public o(String str) {
        this.f28310b = str;
    }

    public final void a(String str, String str2) {
        if (this.f28314f == null) {
            this.f28314f = new HashMap();
        }
        this.f28314f.put(str, str2);
    }

    public final String b(String str) {
        Map<String, String> map = this.f28314f;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final String c() {
        return this.f28312d;
    }

    public final ArrayList<Header> d() {
        return this.f28313e;
    }

    public final boolean e() {
        return this.f28315g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        byte[] bArr = this.f28311c;
        byte[] bArr2 = oVar.f28311c;
        if (bArr == null) {
            if (bArr2 != null) {
                return false;
            }
        } else if (!bArr.equals(bArr2)) {
            return false;
        }
        String str = this.f28310b;
        String str2 = oVar.f28310b;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Map<String, String> map = this.f28314f;
        int iHashCode = ((map == null || !map.containsKey(TtmlNode.ATTR_ID)) ? 1 : this.f28314f.get(TtmlNode.ATTR_ID).hashCode() + 31) * 31;
        String str = this.f28310b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return String.format("Url : %s,HttpHeader: %s", this.f28310b, this.f28313e);
    }

    public final byte[] b() {
        return this.f28311c;
    }

    public final void a(String str) {
        this.f28312d = str;
    }

    public final String a() {
        return this.f28310b;
    }

    public final void a(Header header) {
        this.f28313e.add(header);
    }

    public final void a(boolean z14) {
        this.f28315g = z14;
    }

    public final void a(byte[] bArr) {
        this.f28311c = bArr;
    }
}
