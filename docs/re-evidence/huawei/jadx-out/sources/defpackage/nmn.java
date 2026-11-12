package defpackage;

import com.huawei.hwidauth.api.Result;

/* JADX INFO: loaded from: classes2.dex */
public class nmn implements Result {
    private nms e;

    public nmn(nms nmsVar) {
        this.e = nmsVar;
    }

    @Override // com.huawei.hwidauth.api.Result
    public nms getStatus() {
        return this.e;
    }
}
