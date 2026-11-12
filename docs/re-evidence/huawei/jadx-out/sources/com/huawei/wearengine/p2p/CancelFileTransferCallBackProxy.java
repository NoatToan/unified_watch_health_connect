package com.huawei.wearengine.p2p;

import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwservicesmgr.IBaseCallback;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes20.dex */
public class CancelFileTransferCallBackProxy extends IBaseCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f30772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f30773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f30774c;
    private SendFileCallbackCleanup d;
    private P2pCancelFileTransferCallBack e;

    public CancelFileTransferCallBackProxy(SendFileCallbackCleanup sendFileCallbackCleanup, P2pCancelFileTransferCallBack p2pCancelFileTransferCallBack, String str, String str2, String str3) {
        this.d = sendFileCallbackCleanup;
        this.e = p2pCancelFileTransferCallBack;
        this.f30773b = str;
        this.f30772a = str2;
        this.f30774c = str3;
    }

    @Override // com.huawei.hwservicesmgr.IBaseCallback
    public void onResponse(int i, String str) {
        LogUtil.a("WearEngine_CancelFileTransferCallBackProxy", "CancelFileTransferCallBackProxy onResponse enter, errCode: " + i);
        try {
            this.e.onCancelFileTransferResult(c(i), str);
        } catch (Exception unused) {
            LogUtil.c("WearEngine_CancelFileTransferCallBackProxy", "CancelFileTransferCallBackProxy onResponse Exception");
        }
        this.d.onCleanupCancelFileTransfer(this, this.f30773b, this.f30772a, this.f30774c);
    }

    private int c(int i) {
        LogUtil.a("WearEngine_CancelFileTransferCallBackProxy", "getInnerErrorCode old errorCode:" + i);
        if (i == 20003) {
            return a.w;
        }
        int iAbs = (Math.abs(i) % ExceptionCode.CRASH_EXCEPTION) + 1990000000;
        LogUtil.a("WearEngine_CancelFileTransferCallBackProxy", "getInnerErrorCode new errorCode:" + iAbs);
        return iAbs;
    }
}
