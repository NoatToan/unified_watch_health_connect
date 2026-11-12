package com.huawei.wearengine.p2p;

import android.os.RemoteException;
import defpackage.yis;
import defpackage.ykb;
import defpackage.ykf;

/* JADX INFO: loaded from: classes46.dex */
public class P2pClient$12 extends ReceiverCallback.Stub {
    final /* synthetic */ ykb this$0;
    final /* synthetic */ Receiver val$receiver;

    P2pClient$12(ykb ykbVar, Receiver receiver) {
        this.this$0 = ykbVar;
        this.val$receiver = receiver;
    }

    @Override // com.huawei.wearengine.p2p.ReceiverCallback
    public void onReceiveMessage(byte[] bArr) throws RemoteException {
        yis.b("P2pClient", "onReceiveMessage enter!");
        ykf.d dVar = new ykf.d();
        dVar.d(bArr);
        this.val$receiver.onReceiveMessage(dVar.b());
    }

    @Override // com.huawei.wearengine.p2p.ReceiverCallback
    public void onReceiveFileMessage(MessageParcel messageParcel) throws RemoteException {
        yis.b("P2pClient", "onReceiveFileMessage enter!");
        this.this$0.b(this.val$receiver, messageParcel);
    }
}
