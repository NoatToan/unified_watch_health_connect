package com.miui.tsmclient.entity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.util.LogUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class CustomFeeInfo extends FeeInfo {
    public static final Parcelable.Creator<CustomFeeInfo> CREATOR = new Parcelable.Creator<CustomFeeInfo>() { // from class: com.miui.tsmclient.entity.CustomFeeInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomFeeInfo createFromParcel(Parcel parcel) {
            return new CustomFeeInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CustomFeeInfo[] newArray(int i) {
            return new CustomFeeInfo[i];
        }
    };
    private static final int INVALID_CUSTOM_FEE = Integer.MIN_VALUE;
    private String mActivityType;
    private int mCustomFee;
    private CustomInfo mCustomInfo;

    @Override // com.miui.tsmclient.entity.FeeInfo, android.os.Parcelable
    public int describeContents() {
        return super.describeContents();
    }

    @Override // com.miui.tsmclient.entity.FeeInfo
    public Bundle getCustomFeeExtra(PayableCardInfo payableCardInfo) {
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(TSMAuthContants.CONFIG_ID, this.mCustomInfo.getCustomConfigId());
            jSONObject.put(TSMAuthContants.USE_CUSTOM_FEE, true);
            jSONObject.put(TSMAuthContants.CUSTOM_ISSUE_FEE, getIssueFee());
            jSONObject.put(TSMAuthContants.CUSTOM_RECHARGE_FEE, getRechargeFee());
            jSONObject.put("actionType", (payableCardInfo.mHasIssue ? CardActionType.RECHARGE : CardActionType.ISSUE).name());
            if (!TextUtils.isEmpty(this.mActivityType)) {
                jSONObject.put("activityType", this.mActivityType);
            }
            bundle.putString(TSMAuthContants.EXTRA_CUSTOM_FEE, jSONObject.toString());
        } catch (JSONException e) {
            LogUtils.e("getCustomFeeExtra called, but occur a error.", e);
        }
        return bundle;
    }

    @Override // com.miui.tsmclient.entity.FeeInfo
    public int getIssueFee() {
        return this.mCustomInfo.getCustomIssueFee();
    }

    public int getMaxFee() {
        return this.mCustomInfo.getMaxFee();
    }

    public int getMinFee() {
        return this.mCustomInfo.getMinFee();
    }

    @Override // com.miui.tsmclient.entity.FeeInfo
    public int getPayFee() {
        int issueFee = getIssueFee();
        return isValidRechargeFee() ? issueFee + getRechargeFee() : issueFee;
    }

    @Override // com.miui.tsmclient.entity.FeeInfo
    public int getRechargeFee() {
        return this.mCustomFee;
    }

    @Override // com.miui.tsmclient.entity.FeeInfo
    public boolean isCustomFee() {
        return true;
    }

    public boolean isLessValidSection(int i) {
        return i < this.mCustomInfo.getMinFee();
    }

    public boolean isValid() {
        return this.mCustomInfo != null;
    }

    @Override // com.miui.tsmclient.entity.FeeInfo
    public boolean isValidRechargeFee() {
        return isValidSection(this.mCustomFee);
    }

    public boolean isValidSection(int i) {
        return i >= this.mCustomInfo.getMinFee() && i <= this.mCustomInfo.getMaxFee();
    }

    @Override // com.miui.tsmclient.entity.FeeInfo
    public void readFromParcel(Parcel parcel) {
        super.readFromParcel(parcel);
        this.mCustomInfo = (CustomInfo) parcel.readParcelable(CustomInfo.class.getClassLoader());
        this.mCustomFee = parcel.readInt();
    }

    @Override // com.miui.tsmclient.entity.FeeInfo
    public void restoreIssueFee() {
        this.mCustomInfo.restoreCustomIssueFee();
    }

    @Override // com.miui.tsmclient.entity.FeeInfo
    public void restoreRechargeFee() {
        this.mCustomFee = Integer.MIN_VALUE;
    }

    @Override // com.miui.tsmclient.entity.FeeInfo, com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        return new JSONObject();
    }

    public void setActivityType(String str) {
        this.mActivityType = str;
    }

    @Override // com.miui.tsmclient.entity.FeeInfo
    public void setRechargeFee(int i) {
        if (isValidSection(i)) {
            this.mCustomFee = i;
        }
    }

    @Override // com.miui.tsmclient.entity.FeeInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.mCustomInfo, i);
        parcel.writeInt(this.mCustomFee);
    }

    public CustomFeeInfo(CustomInfo customInfo) {
        this.mCustomFee = Integer.MIN_VALUE;
        this.mCustomInfo = customInfo;
    }

    private CustomFeeInfo(Parcel parcel) {
        this.mCustomFee = Integer.MIN_VALUE;
        readFromParcel(parcel);
    }
}
