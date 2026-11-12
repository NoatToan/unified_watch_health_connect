package com.tencent.open.a;

import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31008c;
    private int d;
    private String e;
    private Map<String, List<String>> f = new HashMap();

    public c(HttpURLConnection httpURLConnection, String str, int i, int i2, int i3, String str2) {
        Map<String, List<String>> headerFields;
        this.f31006a = str;
        this.f31007b = i;
        this.f31008c = i2;
        this.d = i3;
        this.e = str2;
        if (httpURLConnection == null || (headerFields = httpURLConnection.getHeaderFields()) == null) {
            return;
        }
        this.f.putAll(headerFields);
    }

    @Override // com.tencent.open.a.g
    public String a() {
        return this.f31006a;
    }

    @Override // com.tencent.open.a.g
    public int b() {
        return this.f31007b;
    }

    @Override // com.tencent.open.a.g
    public int c() {
        return this.f31008c;
    }

    @Override // com.tencent.open.a.g
    public int d() {
        return this.d;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + hashCode() + "\ncontent = [" + this.f31006a + "]\nresponseSize = " + this.f31007b + "\nrequestSize = " + this.f31008c + "\nresultCode = " + this.d + "\nerrorMsg = " + this.e;
    }
}
