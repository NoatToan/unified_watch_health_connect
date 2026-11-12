package defpackage;

import com.huawei.hwidauth.api.Result;

/* JADX INFO: loaded from: classes3.dex */
public class nml implements Result {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nms f43283a;

    public nml(nms nmsVar) {
        this.f43283a = nmsVar;
    }

    @Override // com.huawei.hwidauth.api.Result
    public nms getStatus() {
        return this.f43283a;
    }

    public boolean a() {
        return this.f43283a.d();
    }
}
