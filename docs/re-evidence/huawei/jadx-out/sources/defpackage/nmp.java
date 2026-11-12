package defpackage;

import com.huawei.hwidauth.api.Result;

/* JADX INFO: loaded from: classes3.dex */
public class nmp implements Result {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private nms f43293b;

    public nmp(nms nmsVar) {
        this.f43293b = nmsVar;
    }

    @Override // com.huawei.hwidauth.api.Result
    public nms getStatus() {
        return this.f43293b;
    }
}
