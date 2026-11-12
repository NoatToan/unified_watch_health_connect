package defpackage;

import com.huawei.hwidauth.api.Result;

/* JADX INFO: loaded from: classes2.dex */
public class nmu implements Result {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private nms f43300b;
    private String e;

    public nmu(String str, nms nmsVar) {
        this.e = str;
        this.f43300b = nmsVar;
    }

    public String a() {
        return this.e;
    }

    @Override // com.huawei.hwidauth.api.Result
    public nms getStatus() {
        return this.f43300b;
    }

    public boolean d() {
        return this.f43300b.d();
    }
}
