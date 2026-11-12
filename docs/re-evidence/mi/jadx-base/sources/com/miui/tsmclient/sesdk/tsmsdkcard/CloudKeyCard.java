package com.miui.tsmclient.sesdk.tsmsdkcard;

import com.miui.tsmclient.common.net.ErrorInfo;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.MifareCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.sesdk.CloudKeyCardDetail;
import com.miui.tsmclient.sesdk.SeCard;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import defpackage.tns;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class CloudKeyCard extends SeCard {
    public CloudKeyCard(CardInfo cardInfo) {
        super(cardInfo);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public void cloneExtraCardInfo() {
        MifareCardInfo mifareCardInfo = (MifareCardInfo) this.mCardInfo;
        this.mCardFace = mifareCardInfo.mCardArt;
        this.mProductId = mifareCardInfo.getProductId();
        this.mIsIssued = mifareCardInfo.mHasIssue;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public SeCard.IOnlineProperties createOnlineProperties() {
        return new CloudKeyCardDetail(this);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse delete(String str) {
        String message;
        int i;
        LogUtils.d("CloudKeyCard delete token:" + str);
        try {
            tns tnsVar = new tns(getId(), null);
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

    @Override // com.miui.tsmclient.sesdk.SeCard
    public CardCategory getCategory() {
        return CardCategory.CLOUD_DOOR;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public String getDetail() {
        return new CloudKeyCardDetail(this).toJson();
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public String getId() {
        return ((MifareCardInfo) this.mCardInfo).getCloudCid();
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse transferIn(String str) {
        LogUtils.d("CloudKeyCard transferIn token:" + str);
        return this.mCardOperation.a(EnvironmentConfig.getContext(), this.mCardInfo, buildExtras(str));
    }
}
