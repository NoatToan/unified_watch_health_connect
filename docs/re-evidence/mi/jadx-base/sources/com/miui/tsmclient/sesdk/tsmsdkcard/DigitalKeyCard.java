package com.miui.tsmclient.sesdk.tsmsdkcard;

import android.os.Bundle;
import com.miui.tsmclient.entity.CarKeyCardInfo;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.Product;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.sesdk.DigitalKeyCardDetail;
import com.miui.tsmclient.sesdk.SeCard;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.ObjectUtils;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
class DigitalKeyCard extends SeCard {
    public DigitalKeyCard(CardInfo cardInfo, boolean z) {
        super(cardInfo, z);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public void cloneExtraCardInfo() {
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public SeCard.IOnlineProperties createOnlineProperties() {
        return new DigitalKeyCardDetail(this);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse delete(String str) {
        return this.mCardOperation.b(EnvironmentConfig.getContext(), this.mCardInfo, new Bundle());
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public String getCardFace() {
        Product product = ((CarKeyCardInfo) this.mCardInfo).getProduct();
        return product != null ? product.getCardArt() : super.getCardFace();
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public CardCategory getCategory() {
        return CardCategory.DIGITAL_KEY;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public String getDetail() {
        return new DigitalKeyCardDetail(this).toJson();
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public String getId() {
        return this.mCardInfo.getCardId();
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public String getName() {
        return this.mCardInfo.getCardName();
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse updateContent() {
        BaseResponse baseResponseC = this.mCardOperation.c(EnvironmentConfig.getContext(), this.mCardInfo, new Bundle());
        if (!baseResponseC.isSuccess()) {
            return new BaseResponse(baseResponseC.mResultCode, baseResponseC.mMsg, new Object[0]);
        }
        Object[] objArr = baseResponseC.mDatas;
        if (objArr != null && objArr.length > 0) {
            List list = (List) objArr[0];
            if (!ObjectUtils.isCollectionEmpty((List<?>) list)) {
                CardInfo cardInfo = (CardInfo) list.get(0);
                this.mCardInfo = cardInfo;
                cloneCard(cardInfo);
                this.mIsIssued = true;
                this.mCardInfo.mHasIssue = true;
                return new BaseResponse(0, new Object[0]);
            }
        }
        return new BaseResponse(-1, baseResponseC.mMsg, new Object[0]);
    }
}
