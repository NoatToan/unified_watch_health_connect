package com.miui.tsmclient.sesdk.tsmsdkcard;

import android.text.TextUtils;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.ProprietaryCarKeyCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.sesdk.ProprietaryCarKeyCardDetail;
import com.miui.tsmclient.sesdk.SeCard;
import com.miui.tsmclient.util.EnvironmentConfig;

/* JADX INFO: loaded from: classes6.dex */
public class ProprietaryCarKeyCard extends SeCard {
    public ProprietaryCarKeyCard(CardInfo cardInfo, boolean z) {
        super(cardInfo, z);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public void cloneExtraCardInfo() {
        ProprietaryCarKeyCardInfo proprietaryCarKeyCardInfo = (ProprietaryCarKeyCardInfo) this.mCardInfo;
        this.mCardFace = proprietaryCarKeyCardInfo.mCardArt;
        this.mProductId = proprietaryCarKeyCardInfo.getProductId();
        this.mIsIssued = !TextUtils.isEmpty(this.mCardInfo.mAid);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public SeCard.IOnlineProperties createOnlineProperties() {
        return new ProprietaryCarKeyCardDetail(this);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse delete(String str) {
        return this.mCardOperation.b(EnvironmentConfig.getContext(), this.mCardInfo, buildExtras(str));
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public CardCategory getCategory() {
        return CardCategory.PROPRIETARY_CAR_KEY;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public String getDetail() {
        return new ProprietaryCarKeyCardDetail(this).toJson();
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse issue(String str) {
        BaseResponse baseResponseL = this.mCardOperation.l(EnvironmentConfig.getContext(), this.mCardInfo, buildExtras(str));
        if (baseResponseL.isSuccess()) {
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
        return this.mCardOperation.b(EnvironmentConfig.getContext(), this.mCardInfo);
    }
}
