package com.miui.tsmclient.sesdk.tsmsdkcard;

import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.MifareCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.net.AuthApiException;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.sesdk.KeyCardDetail;
import com.miui.tsmclient.sesdk.SeCard;
import com.miui.tsmclient.sesdk.SeCardStatus;
import com.miui.tsmclient.sesdk.ServiceProtocolData;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
class KeyCard extends SeCard {
    public KeyCard(CardInfo cardInfo, boolean z) {
        super(cardInfo, z);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse activate(String str) {
        String message;
        int i;
        LogUtils.d("activateCode:" + str);
        ensureNotOnMainThread();
        try {
            this.mCardInfo.parseCardFromJson(this.mTSMAuthManager.updateCardBaseInfo(EnvironmentConfig.getContext(), this.mCardInfo.getUpdateArtContent()));
            ((MifareCardInfo) this.mCardInfo).mVCStatus = SeCardStatus.ACTIVE.ordinal();
            cloneCard(this.mCardInfo);
            message = "";
            i = 0;
        } catch (AuthApiException e) {
            LogUtils.e("activate failed", e);
            message = e.getMessage();
            i = 7;
        }
        return new BaseResponse(i, message, new Object[0]);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse backup() {
        return this.mCardOperation.a(EnvironmentConfig.getContext(), this.mCardInfo);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public void cloneExtraCardInfo() {
        MifareCardInfo mifareCardInfo = (MifareCardInfo) this.mCardInfo;
        this.mCardFace = mifareCardInfo.mCardArt;
        this.mProductId = mifareCardInfo.getProductId();
        this.mIsIssued = !TextUtils.isEmpty(this.mCardInfo.mAid);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public SeCard.IOnlineProperties createOnlineProperties() {
        return new KeyCardDetail(this);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse delete(String str) {
        return this.mCardOperation.b(EnvironmentConfig.getContext(), this.mCardInfo, buildExtras(str));
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public CardCategory getCategory() {
        return CardCategory.DOOR;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public SeCard.SeData getContent() {
        return this.mSeData;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public String getDetail() {
        return new KeyCardDetail(this).toJson();
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public ServiceProtocolData getServiceProtocolData() throws IOException {
        return getServiceProtocolData(Constants.DOORCARD_PRIVACY);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse issue(String str) {
        Bundle bundleBuildExtras = buildExtras(str);
        String str2 = this.mProductId;
        if (str2 != null) {
            bundleBuildExtras.putString(Constants.EXTRA_DOOR_CARD_PRODUCT_ID, str2);
        }
        BaseResponse baseResponseL = this.mCardOperation.l(EnvironmentConfig.getContext(), this.mCardInfo, bundleBuildExtras);
        if (baseResponseL.isSuccess()) {
            this.mIsIssued = true;
            cloneCard(this.mCardInfo);
        }
        return baseResponseL;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public void setCardName(String str) {
        this.mCardName = str;
        this.mCardInfo.mCardName = str;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse updateContent() {
        ensureNotOnMainThread();
        LogUtils.d("updateContent door card aid = " + this.mCardInfo.mAid);
        BaseResponse baseResponseB = this.mCardOperation.b(EnvironmentConfig.getContext(), this.mCardInfo);
        if (!baseResponseB.isSuccess()) {
            return new BaseResponse(baseResponseB.mResultCode, baseResponseB.mMsg, new Object[0]);
        }
        cloneCard(this.mCardInfo);
        CardInfo cardInfo = this.mCardInfo;
        cardInfo.mHasIssue = this.mIsIssued;
        this.mSeData = new SeCard.SeData(cardInfo, ((MifareCardInfo) cardInfo).mVCStatus);
        return new BaseResponse(0, new Object[0]);
    }
}
