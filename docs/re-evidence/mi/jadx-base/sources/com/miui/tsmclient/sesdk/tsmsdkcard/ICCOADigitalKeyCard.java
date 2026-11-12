package com.miui.tsmclient.sesdk.tsmsdkcard;

import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.ICCOACarKeyCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.sesdk.ICCOADigitalKeyCardDetail;
import com.miui.tsmclient.sesdk.SDKConstants;
import com.miui.tsmclient.sesdk.SeCard;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ObjectUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
class ICCOADigitalKeyCard extends DigitalKeyCard {
    public ICCOADigitalKeyCard(CardInfo cardInfo, boolean z) {
        super(cardInfo, z);
    }

    @Override // com.miui.tsmclient.sesdk.tsmsdkcard.DigitalKeyCard, com.miui.tsmclient.sesdk.SeCard
    public SeCard.IOnlineProperties createOnlineProperties() {
        return new ICCOADigitalKeyCardDetail(this);
    }

    @Override // com.miui.tsmclient.sesdk.tsmsdkcard.DigitalKeyCard, com.miui.tsmclient.sesdk.SeCard
    public CardCategory getCategory() {
        return CardCategory.ICCOA_DIGITAL_KEY;
    }

    @Override // com.miui.tsmclient.sesdk.tsmsdkcard.DigitalKeyCard, com.miui.tsmclient.sesdk.SeCard
    public String getDetail() {
        return new ICCOADigitalKeyCardDetail(this).toJson();
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse issue(String str) {
        Bundle bundle = new Bundle();
        try {
            ICCOADigitalKeyParamInfo iCCOADigitalKeyParamInfo = new ICCOADigitalKeyParamInfo.Builder().build().parse(new JSONObject(str));
            String strCreateDigitalKeyId = DigitalKeyIdUtils.createDigitalKeyId(iCCOADigitalKeyParamInfo.getVehicleId());
            iCCOADigitalKeyParamInfo.setKeyId(strCreateDigitalKeyId);
            bundle.putInt(SDKConstants.SOURCE_TYPE, iCCOADigitalKeyParamInfo.getSourceType());
            bundle.putString("extraData", iCCOADigitalKeyParamInfo.toString());
            bundle.putBoolean("share", true);
            BaseResponse baseResponseL = this.mCardOperation.l(EnvironmentConfig.getContext(), this.mCardInfo, bundle);
            if (baseResponseL.isSuccess()) {
                ((ICCOACarKeyCardInfo) this.mCardInfo).setKeyId(strCreateDigitalKeyId);
                updateContent(null);
            }
            return baseResponseL;
        } catch (JSONException e) {
            LogUtils.e("parse params", e);
            return new BaseResponse(1, new Object[0]);
        }
    }

    @Override // com.miui.tsmclient.sesdk.tsmsdkcard.DigitalKeyCard, com.miui.tsmclient.sesdk.SeCard
    public BaseResponse updateContent() {
        CardInfo cardInfo = this.mCardInfo;
        if (cardInfo == null || TextUtils.isEmpty(cardInfo.getCardId())) {
            return new BaseResponse(1, new Object[0]);
        }
        if (this.mCardInfo.isCardActive()) {
            return new BaseResponse(0, new Object[0]);
        }
        Bundle bundle = new Bundle();
        bundle.putString("operation", SDKConstants.KEY_CARD_OPERATION_UPDATE_STATUS);
        return updateContent(bundle);
    }

    private BaseResponse updateContent(Bundle bundle) {
        Object[] objArr;
        BaseResponse baseResponseK = this.mCardOperation.k(EnvironmentConfig.getContext(), this.mCardInfo, bundle);
        if (baseResponseK.isSuccess() && (objArr = baseResponseK.mDatas) != null && objArr.length > 0) {
            List list = (List) objArr[0];
            if (!ObjectUtils.isCollectionEmpty((List<?>) list)) {
                CardInfo cardInfo = (CardInfo) list.get(0);
                this.mCardInfo = cardInfo;
                cloneCard(cardInfo);
                this.mIsIssued = true;
                this.mCardInfo.mHasIssue = true;
            }
        }
        return baseResponseK;
    }
}
