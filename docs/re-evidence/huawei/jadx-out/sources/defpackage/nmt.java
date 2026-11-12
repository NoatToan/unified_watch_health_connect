package defpackage;

import com.huawei.hwidauth.api.Result;

/* JADX INFO: loaded from: classes2.dex */
public class nmt implements Result {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private nms f43299a;

    public nmt(nms nmsVar) {
        this.f43299a = nmsVar;
    }

    @Override // com.huawei.hwidauth.api.Result
    public nms getStatus() {
        return this.f43299a;
    }
}
