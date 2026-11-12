package com.huawei.wearengine.p2p;

import defpackage.ykb;
import defpackage.ykg;

/* JADX INFO: loaded from: classes46.dex */
public class P2pClient$8 extends P2pSendCallback.Stub {
    final /* synthetic */ ykb this$0;
    final /* synthetic */ ykg val$resendTask;
    final /* synthetic */ SendCallback val$sendCallback;

    P2pClient$8(ykb ykbVar, ykg ykgVar, SendCallback sendCallback) {
        this.this$0 = ykbVar;
        this.val$resendTask = ykgVar;
        this.val$sendCallback = sendCallback;
    }

    @Override // com.huawei.wearengine.p2p.P2pSendCallback
    public void onSendResult(int i) {
        synchronized (this.val$resendTask.c()) {
            this.this$0.b(i, this.val$resendTask, this.val$sendCallback);
        }
    }

    @Override // com.huawei.wearengine.p2p.P2pSendCallback
    public void onSendProgress(long j) {
        this.val$sendCallback.onSendProgress(j);
    }

    @Override // com.huawei.wearengine.p2p.P2pSendCallback
    public void onFileTransferReport(String str) {
        SendCallback sendCallback = this.val$sendCallback;
        if (sendCallback instanceof SendExtraCallback) {
            ((SendExtraCallback) sendCallback).onFileTransferReport(str);
        }
    }
}
