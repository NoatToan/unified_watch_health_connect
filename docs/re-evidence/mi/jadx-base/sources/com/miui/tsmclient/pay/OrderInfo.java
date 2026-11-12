package com.miui.tsmclient.pay;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.entity.ActionToken;
import com.miui.tsmclient.entity.ObjectParser;
import com.miui.tsmclient.util.LogUtils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class OrderInfo implements Parcelable, ObjectParser<OrderInfo> {
    public static final Parcelable.Creator<OrderInfo> CREATOR = new Parcelable.Creator<OrderInfo>() { // from class: com.miui.tsmclient.pay.OrderInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OrderInfo createFromParcel(Parcel parcel) {
            return new OrderInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OrderInfo[] newArray(int i) {
            return new OrderInfo[i];
        }
    };
    public static final String KEY_ACTIONTOKEN = "actionToken";
    public static final String KEY_DESC = "statusDesc";
    public static final String KEY_NEED_PAY = "needPay";
    public static final String KEY_ORDERID = "orderId";
    public static final String KEY_ORDERSTATUS = "orderStatus";
    public static final String KEY_ORIGIN_COUNT = "originCount";
    public static final String KEY_PAYFEE = "payFee";
    public static final String KEY_PAYSTRING = "payString";
    public static final String KEY_PAYTIME = "payTime";
    public static final String KEY_QR_TOKEN = "qrToken";
    public static final String KEY_REST_COUNT = "restCount";
    public static final String KEY_SINGLE_COST = "singleCost";

    @SerializedName(KEY_ACTIONTOKEN)
    public List<ActionToken> mActionTokens;

    @SerializedName("cardName")
    public String mCardType;
    public String mCityId;
    public boolean mNeedPay;

    @SerializedName("orderId")
    public String mOrderId;

    @SerializedName(KEY_ORDERSTATUS)
    public OrderStatus mOrderStatus;
    public int mOriginCount;
    public String mPayExtra;

    @SerializedName("payFee")
    public int mPayFee;

    @SerializedName(KEY_PAYTIME)
    public long mPayTime;
    public PayType mPayType;
    public String mQrToken;
    public int mRestCount;
    public int mSingleCost;

    @SerializedName("statusDesc")
    private String mStatusDesc;

    public enum OrderStatus {
        finish(0),
        waitingpay(1),
        paid(2),
        payFailed(3);

        private int mId;

        OrderStatus(int i) {
            this.mId = i;
        }

        public static OrderStatus newInstance(int i) {
            for (OrderStatus orderStatus : values()) {
                if (orderStatus.mId == i) {
                    return orderStatus;
                }
            }
            return null;
        }
    }

    public static class OrderStatusDeserializer implements JsonDeserializer<OrderStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public OrderStatus deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return OrderStatus.newInstance(jsonElement.getAsInt());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ActionToken getIssueOrWithdrawOrderToken() {
        List<ActionToken> list = this.mActionTokens;
        if (list == null) {
            return null;
        }
        for (ActionToken actionToken : list) {
            if (actionToken.shouldAutoIssueOrWithdraw()) {
                return actionToken;
            }
        }
        return null;
    }

    public int getRechargeAmount() {
        List<ActionToken> list = this.mActionTokens;
        if (list == null) {
            return 0;
        }
        for (ActionToken actionToken : list) {
            if (actionToken.isRechargeType()) {
                return actionToken.mRechargeAmount;
            }
        }
        return 0;
    }

    public String getStatusDesc() {
        return this.mStatusDesc;
    }

    public boolean isIssueAndRechargeOrder() {
        List<ActionToken> list = this.mActionTokens;
        if (list == null) {
            return false;
        }
        Iterator<ActionToken> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isIssueAndRechargeType()) {
                return true;
            }
        }
        return false;
    }

    public boolean isIssueOrWithdrawOrder() {
        List<ActionToken> list = this.mActionTokens;
        if (list == null) {
            return false;
        }
        Iterator<ActionToken> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().shouldAutoIssueOrWithdraw()) {
                return true;
            }
        }
        return false;
    }

    public boolean isIssueOrder() {
        List<ActionToken> list = this.mActionTokens;
        if (list == null) {
            return false;
        }
        Iterator<ActionToken> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isIssueType()) {
                return true;
            }
        }
        return false;
    }

    public boolean isPaid() {
        return this.mOrderStatus == OrderStatus.paid;
    }

    public boolean isPayFailed() {
        return this.mOrderStatus == OrderStatus.payFailed;
    }

    public boolean isRechargeOrder() {
        List<ActionToken> list = this.mActionTokens;
        if (list == null) {
            return false;
        }
        Iterator<ActionToken> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isRechargeType()) {
                return true;
            }
        }
        return false;
    }

    public void readFromParcel(Parcel parcel) {
        this.mOrderId = parcel.readString();
        String string = parcel.readString();
        if (!TextUtils.isEmpty(string)) {
            this.mOrderStatus = OrderStatus.valueOf(string);
        }
        this.mActionTokens = parcel.readArrayList(ActionToken.class.getClassLoader());
        this.mPayExtra = parcel.readString();
        this.mQrToken = parcel.readString();
        String string2 = parcel.readString();
        if (!TextUtils.isEmpty(string2)) {
            this.mPayType = PayType.valueOf(string2);
        }
        this.mPayTime = parcel.readLong();
        this.mPayFee = parcel.readInt();
        this.mCardType = parcel.readString();
        this.mCityId = parcel.readString();
        this.mSingleCost = parcel.readInt();
        this.mOriginCount = parcel.readInt();
        this.mRestCount = parcel.readInt();
        this.mNeedPay = parcel.readByte() != 0;
        this.mStatusDesc = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mOrderId);
        OrderStatus orderStatus = this.mOrderStatus;
        parcel.writeString(orderStatus == null ? "" : orderStatus.name());
        parcel.writeList(this.mActionTokens);
        parcel.writeString(this.mPayExtra);
        parcel.writeString(this.mQrToken);
        PayType payType = this.mPayType;
        parcel.writeString(payType != null ? payType.name() : "");
        parcel.writeLong(this.mPayTime);
        parcel.writeInt(this.mPayFee);
        parcel.writeString(this.mCardType);
        parcel.writeString(this.mCityId);
        parcel.writeInt(this.mSingleCost);
        parcel.writeInt(this.mOriginCount);
        parcel.writeInt(this.mRestCount);
        parcel.writeByte(this.mNeedPay ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mStatusDesc);
    }

    private OrderInfo(Parcel parcel) {
        this.mPayType = PayType.Mipay;
        readFromParcel(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.miui.tsmclient.entity.ObjectParser
    public OrderInfo parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mOrderId = jSONObject.optString("orderId");
            if (jSONObject.has(KEY_ORDERSTATUS)) {
                this.mOrderStatus = OrderStatus.newInstance(jSONObject.optInt(KEY_ORDERSTATUS));
            }
            this.mPayExtra = jSONObject.optString("payString");
            this.mQrToken = jSONObject.optString(KEY_QR_TOKEN);
            this.mPayTime = jSONObject.optLong(KEY_PAYTIME);
            this.mPayFee = jSONObject.optInt("payFee");
            this.mCardType = jSONObject.optString("cardName");
            this.mCityId = jSONObject.optString("cityId");
            this.mSingleCost = jSONObject.optInt(KEY_SINGLE_COST);
            this.mOriginCount = jSONObject.optInt(KEY_ORIGIN_COUNT);
            this.mRestCount = jSONObject.optInt(KEY_REST_COUNT);
            this.mNeedPay = jSONObject.optBoolean(KEY_NEED_PAY);
            this.mStatusDesc = jSONObject.optString("statusDesc");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(KEY_ACTIONTOKEN);
            if (jSONArrayOptJSONArray != null) {
                this.mActionTokens = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    try {
                        this.mActionTokens.add(new ActionToken().parse(jSONArrayOptJSONArray.getJSONObject(i)));
                    } catch (JSONException e) {
                        LogUtils.e("parse action token failed.", e);
                    }
                }
            }
        }
        return this;
    }

    public OrderInfo() {
        this.mPayType = PayType.Mipay;
    }
}
