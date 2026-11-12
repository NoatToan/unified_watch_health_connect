package com.miui.tsmclient.sesdk;

import android.os.Looper;
import com.miui.tsmclient.entity.CheckMifareIssuedResponse;
import com.miui.tsmclient.entity.MifareTag;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.TSMAuthManager;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;

/* JADX INFO: loaded from: classes6.dex */
public class KeyCardOperation {
    private SeCard mSeCard;

    public KeyCardOperation(SeCard seCard) {
        this.mSeCard = seCard;
    }

    private void ensureNotOnMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("calling this from your main thread can lead to anr");
        }
    }

    public boolean checkMifareIssued(String str) {
        ensureNotOnMainThread();
        MifareTag mifareTag = new MifareTag();
        mifareTag.setUid(str);
        try {
            CheckMifareIssuedResponse checkMifareIssuedResponseCheckMifareIssued = new TSMAuthManager().checkMifareIssued(EnvironmentConfig.getContext(), mifareTag);
            if (checkMifareIssuedResponseCheckMifareIssued != null) {
                return checkMifareIssuedResponseCheckMifareIssued.isExist();
            }
            return false;
        } catch (AuthApiException unused) {
            LogUtils.e("AuthApiException happens when checkMifareIssued");
            return false;
        }
    }

    public BaseResponse getMifareIssuedState(String str) {
        ensureNotOnMainThread();
        MifareTag mifareTag = new MifareTag();
        mifareTag.setUid(str);
        try {
            return new BaseResponse(0, "", new TSMAuthManager().checkMifareIssued(EnvironmentConfig.getContext(), mifareTag));
        } catch (AuthApiException e) {
            LogUtils.e("AuthApiException happens when checkMifareIssued");
            return new BaseResponse(e.mErrorCode, e.mErrorMsg, new Object[0]);
        }
    }
}
