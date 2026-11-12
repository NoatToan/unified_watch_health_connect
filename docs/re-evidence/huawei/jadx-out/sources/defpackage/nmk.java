package defpackage;

import com.huawei.hwidauth.api.Result;

/* JADX INFO: loaded from: classes2.dex */
public class nmk implements Result {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private nms f43281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f43282c;

    public nmk(String str, nms nmsVar) {
        this.f43282c = str;
        this.f43281b = nmsVar;
    }

    @Override // com.huawei.hwidauth.api.Result
    public nms getStatus() {
        return this.f43281b;
    }
}
