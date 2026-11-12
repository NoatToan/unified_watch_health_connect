package com.tencent.open.a;

import java.io.IOException;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes20.dex */
class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Response f31009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31010b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f31011c;
    private int d;
    private int e;

    d(Response response, int i) {
        this.f31009a = response;
        this.d = i;
        this.f31011c = response.code();
        ResponseBody responseBodyBody = this.f31009a.body();
        if (responseBodyBody != null) {
            this.e = (int) responseBodyBody.get$contentLength();
        } else {
            this.e = 0;
        }
    }

    @Override // com.tencent.open.a.g
    public String a() throws IOException {
        if (this.f31010b == null) {
            ResponseBody responseBodyBody = this.f31009a.body();
            if (responseBodyBody != null) {
                this.f31010b = responseBodyBody.string();
            }
            if (this.f31010b == null) {
                this.f31010b = "";
            }
        }
        return this.f31010b;
    }

    @Override // com.tencent.open.a.g
    public int b() {
        return this.e;
    }

    @Override // com.tencent.open.a.g
    public int c() {
        return this.d;
    }

    @Override // com.tencent.open.a.g
    public int d() {
        return this.f31011c;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + hashCode() + this.f31010b + this.f31011c + this.d + this.e;
    }
}
