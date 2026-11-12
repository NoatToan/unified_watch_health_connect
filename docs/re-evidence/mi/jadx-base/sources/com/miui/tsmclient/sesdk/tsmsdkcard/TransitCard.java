package com.miui.tsmclient.sesdk.tsmsdkcard;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.entity.ActionToken;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardUIInfo;
import com.miui.tsmclient.entity.PayableCardInfo;
import com.miui.tsmclient.entity.ServiceAvailableInfo;
import com.miui.tsmclient.model.BaseModel;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.model.BaseTransitCardModel;
import com.miui.tsmclient.model.n;
import com.miui.tsmclient.model.r;
import com.miui.tsmclient.model.s;
import com.miui.tsmclient.pay.OrderInfo;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.sesdk.OrderData;
import com.miui.tsmclient.sesdk.SeCard;
import com.miui.tsmclient.sesdk.ServiceProtocolData;
import com.miui.tsmclient.sesdk.TransitCardDetail;
import com.miui.tsmclient.util.Constants;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import defpackage.ijs;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class TransitCard extends SeCard {
    private boolean mIsSupportTransferOut;
    private OrderData mOrderData;
    private BaseTransitCardModel mTransitCardModel;

    public TransitCard(CardInfo cardInfo) {
        super(cardInfo);
        this.mTransitCardModel = (BaseTransitCardModel) BaseModel.create(EnvironmentConfig.getContext(), BaseTransitCardModel.class);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public void cloneExtraCardInfo() {
        CardUIInfo cardUIInfo = this.mCardInfo.mCardUIInfo;
        if (cardUIInfo != null) {
            this.mCardFace = cardUIInfo.getBackground();
            this.mIsIssued = this.mCardInfo.mHasIssue;
        }
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public SeCard.IOnlineProperties createOnlineProperties() {
        return new TransitCardDetail(this);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public CardCategory getCategory() {
        return CardCategory.TRANSIT;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public SeCard.SeData getContent() {
        return this.mSeData;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public String getDetail() {
        return new TransitCardDetail(this).toJson();
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public int getExtraFlag() {
        if (this.mCardInfo.mSupportWearableReturnCard) {
            return 1;
        }
        return super.getExtraFlag();
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public OrderData getOrderData() {
        if (this.mOrderData == null) {
            this.mOrderData = new OrderData(this, this.mCardInfo.mIssueFee);
        }
        return this.mOrderData;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public ServiceProtocolData getServiceProtocolData() throws IOException {
        return getServiceProtocolData(this.mCardInfo.mCardType);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public boolean isSupportReturnCard() {
        CardInfo cardInfo = this.mCardInfo;
        return cardInfo.mSupportMoveCardReturnCard || cardInfo.mSupportWearableReturnCard;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public boolean isSupportTransferOut() {
        return this.mIsSupportTransferOut;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse issue(String str) {
        Bundle bundleBuildExtras = buildExtras(str);
        String str2 = this.mCityId;
        if (str2 != null) {
            bundleBuildExtras.putString("extra_city_id", str2);
        }
        String str3 = this.mChannel;
        if (str3 != null) {
            bundleBuildExtras.putString("extra_source_channel", str3);
        }
        BaseResponse baseResponseL = this.mCardOperation.l(EnvironmentConfig.getContext(), this.mCardInfo, bundleBuildExtras);
        if (baseResponseL.isSuccess()) {
            this.mIsIssued = true;
        }
        return baseResponseL;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse recharge(String str) {
        OrderInfo orderInfo;
        n nVar = (n) this.mCardOperation;
        Bundle bundleBuildExtras = buildExtras(str);
        if (bundleBuildExtras.getBoolean(Constants.EXTRA_OUT_OPERATION)) {
            orderInfo = null;
        } else {
            OrderInfo orderInfo2 = new OrderInfo();
            orderInfo2.mCityId = this.mCityId;
            orderInfo2.mActionTokens = new ArrayList();
            ActionToken actionToken = new ActionToken();
            actionToken.mType = ActionToken.TokenType.recharge;
            actionToken.mToken = str;
            orderInfo2.mActionTokens.add(actionToken);
            orderInfo = orderInfo2;
        }
        return nVar.a(EnvironmentConfig.getContext(), (PayableCardInfo) this.mCardInfo, orderInfo, null, bundleBuildExtras);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse returnCard(String str) {
        if (TextUtils.isEmpty(str)) {
            return ((r) BaseModel.create(EnvironmentConfig.getContext(), r.class)).b((PayableCardInfo) this.mCardInfo, this.mExtras);
        }
        Bundle bundleBuildExtras = buildExtras(str);
        if (bundleBuildExtras.getBoolean(Constants.EXTRA_OUT_OPERATION)) {
            return this.mCardOperation.g(EnvironmentConfig.getContext(), this.mCardInfo, bundleBuildExtras);
        }
        throw new IllegalStateException("delete transit card must be call by authorised apps");
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse transferIn(String str) {
        return this.mCardOperation.a(EnvironmentConfig.getContext(), this.mCardInfo, buildExtras(str));
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse transferOut() {
        return ((s) BaseModel.create(EnvironmentConfig.getContext(), s.class)).c((PayableCardInfo) this.mCardInfo);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse updateContent() {
        ensureNotOnMainThread();
        Context context = EnvironmentConfig.getContext();
        CardInfo cardFromNetwork = this.mTransitCardModel.getCardFromNetwork(getId());
        if (cardFromNetwork != null) {
            this.mCardInfo = cardFromNetwork;
            LogUtils.v("updateContent card:" + cardFromNetwork.mHasIssue);
        }
        CardInfo cardInfo = this.mCardInfo;
        this.mIsIssued = cardInfo.mHasIssue;
        try {
            CommonResponseInfo commonResponseInfo = (CommonResponseInfo) HttpClient.getInstance(context).execute(new ijs(context, new ServiceAvailableInfo(cardInfo, ServiceAvailableInfo.ActionType.TRANSFER_OUT), null)).getResult();
            if (commonResponseInfo != null) {
                this.mIsSupportTransferOut = commonResponseInfo.isSuccess();
            }
        } catch (IOException e) {
            LogUtils.e("updateContent:isSupportTransferOut failed", e);
        }
        if (!this.mIsIssued) {
            this.mSeData = new SeCard.SeData(null);
            this.mIsSupportTransferOut = false;
            return new BaseResponse(0, new Object[0]);
        }
        BaseResponse baseResponseC = this.mCardOperation.c(context, this.mCardInfo, null);
        if (!baseResponseC.isSuccess()) {
            return new BaseResponse(baseResponseC.mResultCode, baseResponseC.mMsg, new Object[0]);
        }
        cloneExtraCardInfo();
        this.mSeData = new SeCard.SeData(this.mCardInfo);
        return new BaseResponse(0, new Object[0]);
    }
}
