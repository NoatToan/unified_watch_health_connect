package com.miui.tsmclient.entity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclientsdk.MiTsmConstants;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class InAppPayResult implements Parcelable {
    public static final Parcelable.Creator<InAppPayResult> CREATOR = new Parcelable.Creator<InAppPayResult>() { // from class: com.miui.tsmclient.entity.InAppPayResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InAppPayResult createFromParcel(Parcel parcel) {
            return new InAppPayResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InAppPayResult[] newArray(int i) {
            return new InAppPayResult[i];
        }
    };
    private static final String JSON_KEY_DISCOUNT_AMOUNT = "discount_amt";
    private static final String JSON_KEY_PAY_AMOUNT = "pay_amt";
    private static final String RESULT_ERROR_PIN = "4";
    private static final String RESULT_ERROR_PIN_EXCCEED_MAX_VALUE = "5";
    private static final String RESULT_EXCESS_AMOUNT = "6";
    private static final String RESULT_FAILED_UNKOWN = "2";
    private static final String RESULT_INSUFFICIENT_BALANCE = "1";
    private static final String RESULT_NO_PIN = "3";
    private static final String RESULT_SUCCESS = "0";
    private String mDiscountAmount;
    private String mPayAmount;
    private String mResultCode;
    private String mResultMsg;

    public static Bundle assemblePayResult(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            long j = bundle.getLong(MiTsmConstants.KEY_INAPP_ORDER_AMOUNT);
            long j2 = bundle.getLong(MiTsmConstants.KEY_INAPP_DISCOUNT_AMOUNT);
            jSONObject.put(JSON_KEY_PAY_AMOUNT, toFloat(j - j2));
            jSONObject.put(JSON_KEY_DISCOUNT_AMOUNT, toFloat(j2));
        } catch (JSONException e) {
            LogUtils.e("failed to put more pay result info", e);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString(MiTsmConstants.KEY_RESULT_CODE, "0");
        bundle2.putString(MiTsmConstants.KEY_RESULT_MSG, "");
        bundle2.putString(MiTsmConstants.KEY_EXTRA_INFO, jSONObject.toString());
        return bundle2;
    }

    private void pareMoreInfo(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.mPayAmount = jSONObject.optString(JSON_KEY_PAY_AMOUNT);
            this.mDiscountAmount = jSONObject.optString(JSON_KEY_DISCOUNT_AMOUNT);
        } catch (JSONException e) {
            LogUtils.e("failed to parse more pay result info", e);
        }
    }

    private static float toFloat(long j) {
        return new BigDecimal(j).divide(new BigDecimal(100), 2, 4).floatValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDiscountAmount() {
        return this.mDiscountAmount;
    }

    public String getPayAmount() {
        return this.mPayAmount;
    }

    public int getResultCode() {
        return Integer.valueOf(this.mResultCode).intValue();
    }

    public String getResultMsg() {
        return this.mResultMsg;
    }

    public boolean hasDiscount() {
        return !TextUtils.isEmpty(this.mDiscountAmount);
    }

    public boolean isOrderAllowedRetry() {
        return "1".equals(this.mResultCode) || "4".equals(this.mResultCode);
    }

    public boolean isPaySucceed() {
        return "0".equals(this.mResultCode);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mResultCode);
        parcel.writeString(this.mResultMsg);
        parcel.writeString(this.mPayAmount);
        parcel.writeString(this.mDiscountAmount);
    }

    public InAppPayResult() {
    }

    private InAppPayResult(Parcel parcel) {
        this.mResultCode = parcel.readString();
        this.mResultMsg = parcel.readString();
        this.mPayAmount = parcel.readString();
        this.mDiscountAmount = parcel.readString();
    }

    public InAppPayResult(Bundle bundle) {
        if (bundle != null) {
            this.mResultCode = bundle.getString(MiTsmConstants.KEY_RESULT_CODE);
            this.mResultMsg = bundle.getString(MiTsmConstants.KEY_RESULT_MSG);
            if (isPaySucceed()) {
                pareMoreInfo(bundle.getString(MiTsmConstants.KEY_EXTRA_INFO));
            }
        }
    }
}
