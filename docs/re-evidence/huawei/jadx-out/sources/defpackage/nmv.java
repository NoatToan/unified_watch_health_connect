package defpackage;

import com.huawei.hwidauth.api.Result;

/* JADX INFO: loaded from: classes38.dex */
public class nmv implements Result {
    private nms d;

    public nmv(nms nmsVar) {
        this.d = nmsVar;
    }

    @Override // com.huawei.hwidauth.api.Result
    public nms getStatus() {
        return this.d;
    }
}
