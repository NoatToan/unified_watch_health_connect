package com.miui.tsmclient.sesdk;

import android.os.Looper;
import com.miui.tsmclient.entity.RefundChannelInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.net.TSMAuthManager;
import com.miui.tsmclient.util.EnvironmentConfig;

/* JADX INFO: loaded from: classes6.dex */
public class RefundAuthorizationOperation {
    private SeCard mSeCard;

    public RefundAuthorizationOperation(SeCard seCard) {
        this.mSeCard = seCard;
    }

    private void ensureNotOnMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("calling this from your main thread can lead to anr");
        }
    }

    public BaseResponse bindAuthorization(RefundChannelInfo refundChannelInfo, String str) {
        ensureNotOnMainThread();
        return new TSMAuthManager().bindAuthorization(EnvironmentConfig.getContext(), this.mSeCard.mCardInfo, str, refundChannelInfo.getChannelName());
    }

    public BaseResponse getAuthInfo(RefundChannelInfo refundChannelInfo) {
        ensureNotOnMainThread();
        return new TSMAuthManager().getAuthInfo(EnvironmentConfig.getContext(), refundChannelInfo, this.mSeCard.mCardInfo);
    }

    public BaseResponse queryRefundChannels() {
        ensureNotOnMainThread();
        return new TSMAuthManager().queryRefundChannels(EnvironmentConfig.getContext(), this.mSeCard.mCardInfo);
    }
}
