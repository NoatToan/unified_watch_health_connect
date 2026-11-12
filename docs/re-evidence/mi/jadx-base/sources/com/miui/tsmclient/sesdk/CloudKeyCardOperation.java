package com.miui.tsmclient.sesdk;

import com.miui.tsmclient.common.net.ErrorInfo;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardInfoFactory;
import com.miui.tsmclient.entity.MifareCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.g;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import defpackage.c5t;
import defpackage.las;
import defpackage.tns;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class CloudKeyCardOperation {
    private SeCard mSeCard;

    public CloudKeyCardOperation(SeCard seCard) {
        this.mSeCard = seCard;
    }

    public BaseResponse backupAllCloudMifareCard() {
        return ((las) g.a(CardInfoFactory.makeCardInfo(CardInfo.CARD_TYPE_MIFARE, null).mCardType)).a(EnvironmentConfig.getContext(), null);
    }

    public BaseResponse delete() {
        String message;
        int i;
        LogUtils.d("CloudKeyCard delete:");
        try {
            tns tnsVar = new tns(((MifareCardInfo) this.mSeCard.mCardInfo).getCloudCid(), null);
            HttpClient.getInstance(EnvironmentConfig.getContext()).execute(tnsVar);
            if (tnsVar.isSuccess()) {
                message = "";
                i = 0;
            } else {
                ErrorInfo errorInfo = tnsVar.getResponse().getErrorInfo();
                i = errorInfo.mErrorCode;
                message = errorInfo.mErrorDesc;
            }
        } catch (IOException e) {
            LogUtils.e("CloudKeyCard delete failed", e);
            message = e.getMessage();
            i = 12;
        }
        return new BaseResponse(i, message, new Object[0]);
    }

    public BaseResponse queryUserCloudMifareCardBackupStatus() {
        String message;
        int i;
        LogUtils.d("queryUserCloudMifareCardBackupStatus:");
        try {
            c5t c5tVar = new c5t(null);
            c5t.a aVar = (c5t.a) HttpClient.getInstance(EnvironmentConfig.getContext()).execute(c5tVar).getResult();
            if (c5tVar.isSuccess()) {
                return new BaseResponse(0, "", Boolean.valueOf(aVar.a()));
            }
            ErrorInfo errorInfo = c5tVar.getResponse().getErrorInfo();
            i = errorInfo.mErrorCode;
            message = errorInfo.mErrorDesc;
            return new BaseResponse(i, message, new Object[0]);
        } catch (IOException e) {
            LogUtils.e("queryUserCloudMifareCardBackupStatus failed", e);
            message = e.getMessage();
            i = 12;
        }
    }

    public BaseResponse saveUserCloudMifareCardBackupStatus(boolean z) {
        String message;
        int i;
        LogUtils.d("saveUserCloudMifareCardBackupStatus:" + z);
        try {
            c5t c5tVar = new c5t(z, null);
            HttpClient.getInstance(EnvironmentConfig.getContext()).execute(c5tVar);
            if (c5tVar.isSuccess()) {
                message = "";
                i = 0;
            } else {
                ErrorInfo errorInfo = c5tVar.getResponse().getErrorInfo();
                i = errorInfo.mErrorCode;
                message = errorInfo.mErrorDesc;
            }
        } catch (IOException e) {
            LogUtils.e("saveUserCloudMifareCardBackupStatus failed", e);
            message = e.getMessage();
            i = 12;
        }
        return new BaseResponse(i, message, new Object[0]);
    }
}
