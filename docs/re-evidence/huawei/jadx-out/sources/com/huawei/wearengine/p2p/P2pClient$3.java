package com.huawei.wearengine.p2p;

import defpackage.ykb;

/* JADX INFO: loaded from: classes46.dex */
public class P2pClient$3 extends P2pSendCallback.Stub {
    final /* synthetic */ ykb this$0;
    final /* synthetic */ SendCallback val$sendInternalCallback;

    P2pClient$3(ykb ykbVar, SendCallback sendCallback) {
        this.this$0 = ykbVar;
        this.val$sendInternalCallback = sendCallback;
    }

    @Override // com.huawei.wearengine.p2p.P2pSendCallback
    public void onSendResult(int i) {
        this.val$sendInternalCallback.onSendResult(i);
    }

    @Override // com.huawei.wearengine.p2p.P2pSendCallback
    public void onSendProgress(long j) {
        this.val$sendInternalCallback.onSendProgress(j);
    }

    @Override // com.huawei.wearengine.p2p.P2pSendCallback
    public void onFileTransferReport(String str) {
        SendCallback sendCallback = this.val$sendInternalCallback;
        if (sendCallback instanceof SendExtraCallback) {
            ((SendExtraCallback) sendCallback).onFileTransferReport(str);
        }
    }
}
