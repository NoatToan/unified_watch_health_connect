package com.huawei.wearengine.p2p;

import android.os.RemoteException;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwservicesmgr.IOTAResultAIDLCallback;

/* JADX INFO: loaded from: classes20.dex */
public class SendFileCallbackProxy extends IOTAResultAIDLCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SendFileCallbackCleanup f30775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30777c;
    private String d;
    private P2pSendCallback e;

    public SendFileCallbackProxy(SendFileCallbackCleanup sendFileCallbackCleanup, P2pSendCallback p2pSendCallback, String str, String str2, String str3) {
        this.f30775a = sendFileCallbackCleanup;
        this.e = p2pSendCallback;
        this.f30777c = str;
        this.f30776b = str2;
        this.d = str3;
    }

    @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
    public void onFileTransferState(int i) throws RemoteException {
        LogUtil.d("WearEngine_SendFileCallbackProxy", "onFileTransferState enter");
        this.e.onSendProgress(i);
    }

    @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
    public void onUpgradeFailed(int i, String str) throws RemoteException {
        LogUtil.d("WearEngine_SendFileCallbackProxy", "onUpgradeFailed enter");
        this.e.onSendResult(b(i));
        this.f30775a.onCleanup(this, this.f30777c, this.f30776b, this.d);
    }

    @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
    public void onFileRespond(int i) throws RemoteException {
        LogUtil.d("WearEngine_SendFileCallbackProxy", "onFileRespond enter");
        this.e.onSendResult(b(i));
        this.f30775a.onCleanup(this, this.f30777c, this.f30776b, this.d);
    }

    @Override // com.huawei.hwservicesmgr.IOTAResultAIDLCallback
    public void onFileTransferReport(String str) throws RemoteException {
        LogUtil.d("WearEngine_SendFileCallbackProxy", "onFileTransferReport enter, transferWay:", str);
        this.e.onFileTransferReport(str);
    }

    private int b(int i) {
        LogUtil.a("WearEngine_SendFileCallbackProxy", "getInnerErrorCode old errorCode:" + i);
        if (i == 1) {
            return a.w;
        }
        int iAbs = (Math.abs(i) % ExceptionCode.CRASH_EXCEPTION) + 1990000000;
        LogUtil.a("WearEngine_SendFileCallbackProxy", "getInnerErrorCode new errorCode:" + iAbs);
        return iAbs;
    }
}
