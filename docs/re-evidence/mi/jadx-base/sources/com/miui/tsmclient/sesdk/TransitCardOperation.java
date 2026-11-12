package com.miui.tsmclient.sesdk;

import android.os.Looper;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.common.net.Response;
import com.miui.tsmclient.entity.ConfigInfo;
import com.miui.tsmclient.entity.ReturnCardReasonResponseInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.net.TSMAuthManager;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import defpackage.f9s;
import defpackage.zus;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class TransitCardOperation {
    private SeCard mSeCard;

    public TransitCardOperation(SeCard seCard) {
        this.mSeCard = seCard;
    }

    private void ensureNotOnMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("calling this from your main thread can lead to anr");
        }
    }

    public BaseResponse queryRefundNotes() {
        ensureNotOnMainThread();
        BaseResponse baseResponse = new BaseResponse();
        try {
            Response responseExecute = HttpClient.getInstance(EnvironmentConfig.getContext()).execute(new zus(this.mSeCard.mCardInfo.mCardType, null));
            if (responseExecute.getResult() == null) {
                baseResponse.mResultCode = -1;
                baseResponse.mMsg = "failed to queryRefundNotes";
                return baseResponse;
            }
            if (responseExecute.isSuccess()) {
                baseResponse.mDatas = new Object[]{((ConfigInfo) responseExecute.getResult()).getContentByConfigKey(ConfigInfo.REFUND_FEE_NOTES)};
                baseResponse.mResultCode = 0;
                LogUtils.d("queryRefundNotes success!");
            } else {
                baseResponse.mResultCode = responseExecute.getErrorInfo().mErrorCode;
                baseResponse.mMsg = responseExecute.getErrorInfo().mErrorDesc;
                LogUtils.e("queryRefundNotes fail!");
            }
            return baseResponse;
        } catch (IOException e) {
            LogUtils.e("failed to queryRefundNotes:", e);
            baseResponse.mResultCode = -1;
            baseResponse.mMsg = "failed to queryRefundNotes";
        }
    }

    public BaseResponse queryReturnCardReason() {
        ensureNotOnMainThread();
        BaseResponse baseResponse = new BaseResponse();
        try {
            Response responseExecute = HttpClient.getInstance(EnvironmentConfig.getContext()).execute(new f9s());
            if (responseExecute.getResult() == null) {
                baseResponse.mResultCode = -1;
                baseResponse.mMsg = "failed to queryReturnCardReason";
                return baseResponse;
            }
            if (responseExecute.isSuccess()) {
                baseResponse.mDatas = new Object[]{(ReturnCardReasonResponseInfo) responseExecute.getResult()};
                baseResponse.mResultCode = 0;
                LogUtils.d("queryReturnCardReason success!");
            } else {
                baseResponse.mResultCode = responseExecute.getErrorInfo().mErrorCode;
                baseResponse.mMsg = responseExecute.getErrorInfo().mErrorDesc;
                LogUtils.e("queryReturnCardReason fail!");
            }
            return baseResponse;
        } catch (IOException e) {
            LogUtils.e("failed to queryReturnCardReason:", e);
            baseResponse.mResultCode = -1;
            baseResponse.mMsg = "failed to queryReturnCardReason";
        }
    }

    public BaseResponse queryServiceFeeRefundStatus() {
        ensureNotOnMainThread();
        BaseResponse baseResponse = new BaseResponse();
        try {
            String strQueryRefundStatus = new TSMAuthManager().queryRefundStatus(EnvironmentConfig.getContext(), this.mSeCard.getId());
            baseResponse.mResultCode = 0;
            baseResponse.mMsg = strQueryRefundStatus;
            baseResponse.mDatas = new Object[]{ServiceFeeRefundInfo.fromJson(strQueryRefundStatus)};
        } catch (AuthApiException e) {
            LogUtils.e("queryServiceFeeRefundStatus failed ", e);
            baseResponse.mMsg = e.mErrorMsg;
            baseResponse.mResultCode = e.mErrorCode;
        }
        return baseResponse;
    }

    public BaseResponse refundServiceFee() {
        ensureNotOnMainThread();
        BaseResponse baseResponse = new BaseResponse();
        if (!TransitCardDetail.fromJson(this.mSeCard.getDetail()).isSupportServiceFeeRefund()) {
            baseResponse.mResultCode = 17;
            return baseResponse;
        }
        try {
            baseResponse.mMsg = new TSMAuthManager().refundServiceFee(EnvironmentConfig.getContext(), this.mSeCard.getId());
            baseResponse.mResultCode = 0;
        } catch (AuthApiException e) {
            LogUtils.e("refundServiceFee failed ", e);
            baseResponse.mMsg = e.mErrorMsg;
            baseResponse.mResultCode = e.mErrorCode;
        }
        return baseResponse;
    }
}
