package com.miui.tsmclient.sesdk.tsmsdkcard;

import android.content.Context;
import com.miui.tsmclient.common.net.HttpClient;
import com.miui.tsmclient.entity.CardInfo;
import com.miui.tsmclient.entity.CardUIInfo;
import com.miui.tsmclient.entity.OrderResponseInfo;
import com.miui.tsmclient.entity.PayableCardInfo;
import com.miui.tsmclient.model.BaseResponse;
import com.miui.tsmclient.sesdk.CardCategory;
import com.miui.tsmclient.sesdk.CloudTransitCardDetail;
import com.miui.tsmclient.sesdk.SeCard;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclient.util.LogUtils;
import defpackage.tis;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
class CloudTransitCard extends SeCard {
    public CloudTransitCard(CardInfo cardInfo) {
        super(cardInfo);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public void cloneExtraCardInfo() {
        CardUIInfo cardUIInfo = this.mCardInfo.mCardUIInfo;
        if (cardUIInfo != null) {
            this.mCardFace = cardUIInfo.getBackground();
        }
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public SeCard.IOnlineProperties createOnlineProperties() {
        return new CloudTransitCardDetail(this);
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public CardCategory getCategory() {
        return CardCategory.CLOUD_TRANSIT;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public String getDetail() {
        return new CloudTransitCardDetail(this).toJson();
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public boolean isSupportReturnCard() {
        return this.mCardInfo.mSupportCloudReturnCard;
    }

    @Override // com.miui.tsmclient.sesdk.SeCard
    public BaseResponse transferIn(String str) {
        Context context = EnvironmentConfig.getContext();
        CardInfo cardInfo = this.mCardInfo;
        if (!(cardInfo instanceof PayableCardInfo)) {
            return new BaseResponse(1, new Object[0]);
        }
        PayableCardInfo payableCardInfo = (PayableCardInfo) cardInfo;
        if (!payableCardInfo.hasTransferInOrder()) {
            LogUtils.e("cloud card has no transfer order");
            return new BaseResponse(1, new Object[0]);
        }
        tis tisVar = new tis(context, payableCardInfo, null);
        try {
            OrderResponseInfo orderResponseInfo = (OrderResponseInfo) HttpClient.getInstance(context).execute(tisVar).getResult();
            if (!tisVar.isSuccess()) {
                return new BaseResponse(orderResponseInfo.getErrorCode(), orderResponseInfo.getErrorDesc(), new Object[0]);
            }
            if (orderResponseInfo.getOrderInfo() != null && orderResponseInfo.getOrderInfo().getIssueOrWithdrawOrderToken() != null) {
                str = orderResponseInfo.getOrderInfo().getIssueOrWithdrawOrderToken().mToken;
            }
            return this.mCardOperation.a(EnvironmentConfig.getContext(), this.mCardInfo, buildExtras(str));
        } catch (IOException e) {
            LogUtils.e("StartTransferInRequest failed", e);
            return new BaseResponse(2, new Object[0]);
        }
    }
}
