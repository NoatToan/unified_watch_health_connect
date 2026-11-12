package defpackage;

import com.huawei.hwidauth.api.Result;

/* JADX INFO: loaded from: classes2.dex */
public class nmw implements Result {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private nms f43301b;

    public nmw(nms nmsVar) {
        this.f43301b = nmsVar;
    }

    @Override // com.huawei.hwidauth.api.Result
    public nms getStatus() {
        return this.f43301b;
    }
}
