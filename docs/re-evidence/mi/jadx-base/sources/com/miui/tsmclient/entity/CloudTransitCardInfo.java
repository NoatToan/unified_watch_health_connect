package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miui.tsmclient.pay.OrderInfo;
import com.miui.tsmclient.util.LogUtils;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class CloudTransitCardInfo extends PayableCardInfo {
    public static final Parcelable.Creator<CloudTransitCardInfo> CREATOR = new Parcelable.Creator<CloudTransitCardInfo>() { // from class: com.miui.tsmclient.entity.CloudTransitCardInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CloudTransitCardInfo createFromParcel(Parcel parcel) {
            CloudTransitCardInfo cloudTransitCardInfo = new CloudTransitCardInfo(null, null);
            cloudTransitCardInfo.readFromParcel(parcel);
            return cloudTransitCardInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CloudTransitCardInfo[] newArray(int i) {
            return new CloudTransitCardInfo[i];
        }
    };
    private static final String KEY_CARD_LAST_USED_DEVICE_MODEL = "fromDeviceModel";
    private static final String KEY_CARD_TITLE_FORM_EXTRA = "cardTitle";
    private static final String KEY_CARD_TRANSFER_ORDER = "transferOrder";
    private String mCardBalanceTitle;
    private String mCardLastUsedDeviceModel;

    public CloudTransitCardInfo(String str, JSONObject jSONObject) {
        super(str);
        this.mCardLastUsedDeviceModel = "";
        parse(jSONObject);
        parseExtra();
    }

    private void parseExtra() {
        try {
            if (TextUtils.isEmpty(getExtra())) {
                return;
            }
            JSONObject jSONObject = new JSONObject(getExtra());
            this.mCardBalanceTitle = jSONObject.optString(KEY_CARD_TITLE_FORM_EXTRA);
            this.mCardLastUsedDeviceModel = jSONObject.optString(KEY_CARD_LAST_USED_DEVICE_MODEL);
            String strOptString = jSONObject.optString(KEY_CARD_TRANSFER_ORDER);
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            OrderInfo orderInfo = new OrderInfo();
            orderInfo.parse(new JSONObject(strOptString));
            ArrayList arrayList = new ArrayList();
            arrayList.add(orderInfo);
            this.mUnfinishOrderInfos = arrayList;
        } catch (JSONException e) {
            LogUtils.e("parse card extra failed", e);
        }
    }

    @Override // com.miui.tsmclient.entity.PayableCardInfo, com.miui.tsmclient.entity.CardInfo
    public boolean canTransferIn() {
        return hasTransferInOrder();
    }

    @Override // com.miui.tsmclient.entity.PayableCardInfo, com.miui.tsmclient.entity.CardInfo
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudTransitCardInfo)) {
            return false;
        }
        CardInfo cardInfo = (CardInfo) obj;
        return TextUtils.equals(this.mCardType, cardInfo.mCardType) && TextUtils.equals(this.mCardDevice, cardInfo.mCardDevice);
    }

    public String getCardBalanceTitle() {
        return this.mCardBalanceTitle;
    }

    public String getCardLastUsedDeviceModel() {
        return this.mCardLastUsedDeviceModel;
    }

    public String getCloudCardOrderId() {
        if (TextUtils.isEmpty(getExtra())) {
            return "";
        }
        try {
            return new JSONObject(getExtra()).optString("orderId");
        } catch (JSONException e) {
            LogUtils.e("getCloudCardOrderId parse failed", e);
            return "";
        }
    }

    public CardInfo parseToPayableCardInfo() {
        CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(this.mCardType, serialize());
        if (cardInfoMakeCardInfo instanceof PayableCardInfo) {
            cardInfoMakeCardInfo.mHasIssue = false;
            cardInfoMakeCardInfo.mIsReadSECorrectly = true;
            ((PayableCardInfo) cardInfoMakeCardInfo).mUnfinishOrderInfos = this.mUnfinishOrderInfos;
        }
        return cardInfoMakeCardInfo;
    }

    @Override // com.miui.tsmclient.entity.PayableCardInfo, com.miui.tsmclient.entity.CardInfo
    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        this.mCardBalanceTitle = parcel.readString();
        this.mCardLastUsedDeviceModel = parcel.readString();
    }

    public CardInfo removeUnfinishedOrder() {
        CardInfo cardInfoMakeCardInfo = CardInfoFactory.makeCardInfo(this.mCardType, serialize());
        if (cardInfoMakeCardInfo instanceof PayableCardInfo) {
            cardInfoMakeCardInfo.mHasIssue = false;
            cardInfoMakeCardInfo.mIsReadSECorrectly = true;
            ((PayableCardInfo) cardInfoMakeCardInfo).mUnfinishOrderInfos = new ArrayList();
        }
        return cardInfoMakeCardInfo;
    }

    @Override // com.miui.tsmclient.entity.PayableCardInfo, com.miui.tsmclient.entity.CardInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.mCardBalanceTitle);
        parcel.writeString(this.mCardLastUsedDeviceModel);
    }
}
