package com.miui.tsmclient.entity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miui.tsmclient.util.EnvironmentConfig;
import com.miui.tsmclientsdk.MiTsmConstants;
import com.tsmclient.smartcard.ByteArray;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class InAppTransData implements Parcelable {
    public static final Parcelable.Creator<InAppTransData> CREATOR = new Parcelable.Creator<InAppTransData>() { // from class: com.miui.tsmclient.entity.InAppTransData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InAppTransData createFromParcel(Parcel parcel) {
            return new InAppTransData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InAppTransData[] newArray(int i) {
            return new InAppTransData[i];
        }
    };
    public static final String PAY_SUPPORT_CARD_ALL = "00";
    public static final String PAY_SUPPORT_CARD_CREDIT = "02";
    public static final String PAY_SUPPORT_CARD_DEBIT = "01";
    private static final String SCAN_PAY_SUPPORT_ORDER_TYPE_TEN_PAY = "16";
    private static final String SCAN_PAY_SUPPORT_ORDER_TYPE_WX_PAY = "31";
    public static final int VERIFY_METHOD_FINGER = 1;
    public static final int VERIFY_METHOD_PASSWORD = 2;
    private int mActionType;
    private int mChannel;
    private String mCurrencyCode;
    private long mDiscountAmount;
    private String mEncryptPayAmount;
    private String mIccData;
    private String mMerchantId;
    private String mMerchantName;
    private int mMiTsmSignKeyIndex;
    private String mMiTsmSignedData;
    private long mOrderAmount;
    private String mOrderNumber;
    private long mPayAmount;
    private String mPayCardAppletAid;
    private String mPayCardPan;
    private String mPayCardVcReferenceId;
    private String mPromotionValue;
    private String mQueryId;
    private int mSignKeyIndex;
    private String mSignedData;
    private String mSupCardAttr;
    private String mTransactionNo;
    private int mVerifyMethod;

    public InAppTransData() {
    }

    public static InAppTransData newInstance(Bundle bundle) {
        InAppTransData inAppTransData = new InAppTransData();
        if (bundle != null) {
            inAppTransData.mOrderNumber = bundle.getString(MiTsmConstants.KEY_INAPP_ORDER_NUMBER, "");
            inAppTransData.mMerchantName = bundle.getString(MiTsmConstants.KEY_INAPP_MERCHANT_NAME, "");
            inAppTransData.mMerchantId = bundle.getString(MiTsmConstants.KEY_INAPP_MERCHANT_ID, "");
            inAppTransData.mOrderAmount = bundle.getLong(MiTsmConstants.KEY_INAPP_ORDER_AMOUNT, 0L);
            inAppTransData.mDiscountAmount = bundle.getLong(MiTsmConstants.KEY_INAPP_DISCOUNT_AMOUNT, 0L);
            inAppTransData.mPayAmount = bundle.getLong(MiTsmConstants.KEY_INAPP_PAY_AMOUNT, 0L);
            inAppTransData.mSignedData = bundle.getString(MiTsmConstants.KEY_INAPP_SIGNED_DATA, "");
            inAppTransData.mSignKeyIndex = bundle.getInt(MiTsmConstants.KEY_INAPP_SIGN_KEY_INDEX, 0);
            inAppTransData.mCurrencyCode = bundle.getString(MiTsmConstants.KEY_INAPP_CURRENCY_CODE, "");
            inAppTransData.mEncryptPayAmount = bundle.getString(MiTsmConstants.KEY_INAPP_ENCRYPT_PAY_AMOUNT, "");
            inAppTransData.mChannel = bundle.getInt(MiTsmConstants.KEY_INAPP_CHANNEL, -1);
            inAppTransData.mQueryId = bundle.getString(MiTsmConstants.KEY_INAPP_QUERY_ID, "");
            inAppTransData.mPromotionValue = bundle.getString(MiTsmConstants.KEY_INAPP_PROMOTION_VALUE, "");
            inAppTransData.mSupCardAttr = bundle.getString(MiTsmConstants.KEY_INAPP_ORDER_SUP_CARD_ATTR, "00");
            inAppTransData.mTransactionNo = bundle.getString(MiTsmConstants.KEY_TRANSACTION_NO);
        }
        return inAppTransData;
    }

    public static Bundle transitionToInAppTransDataBundle(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            if (bundle.containsKey(MiTsmConstants.KEY_ORDER_NO)) {
                bundle2.putString(MiTsmConstants.KEY_INAPP_ORDER_NUMBER, bundle.getString(MiTsmConstants.KEY_ORDER_NO));
            }
            if (bundle.containsKey("orderDesc")) {
                bundle2.putString(MiTsmConstants.KEY_INAPP_MERCHANT_NAME, bundle.getString("orderDesc"));
            }
            if (bundle.containsKey(MiTsmConstants.KEY_TRANSACTION_AMOUNT)) {
                long j = Long.parseLong(bundle.getString(MiTsmConstants.KEY_TRANSACTION_AMOUNT));
                bundle2.putLong(MiTsmConstants.KEY_INAPP_ORDER_AMOUNT, j);
                bundle2.putLong(MiTsmConstants.KEY_INAPP_PAY_AMOUNT, j);
            }
            if (bundle.containsKey(MiTsmConstants.KEY_SIGNATURE)) {
                bundle2.putString(MiTsmConstants.KEY_INAPP_SIGNED_DATA, bundle.getString(MiTsmConstants.KEY_SIGNATURE));
            }
            if (bundle.containsKey(MiTsmConstants.KEY_CURRENCY_CODE)) {
                bundle2.putString(MiTsmConstants.KEY_INAPP_CURRENCY_CODE, bundle.getString(MiTsmConstants.KEY_CURRENCY_CODE));
            }
            if (bundle.containsKey(MiTsmConstants.KEY_TRANSACTION_NO)) {
                bundle2.putString(MiTsmConstants.KEY_TRANSACTION_NO, bundle.getString(MiTsmConstants.KEY_TRANSACTION_NO));
            }
            bundle2.putBoolean(MiTsmConstants.EXTRA_IS_STANDARD_MODE, true);
            bundle2.putString(MiTsmConstants.KEY_INAPP_QUERY_ID, "0");
            String string = bundle.getString(MiTsmConstants.KEY_ORDER_TYPE);
            if (TextUtils.equals(string, "31") || TextUtils.equals(string, SCAN_PAY_SUPPORT_ORDER_TYPE_TEN_PAY)) {
                bundle2.putString(MiTsmConstants.KEY_INAPP_ORDER_SUP_CARD_ATTR, "01");
            }
        }
        return bundle2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void fillPayCardInfo(BankCardInfo bankCardInfo) {
        if (bankCardInfo != null) {
            this.mPayCardPan = bankCardInfo.mVCardNumber;
            this.mPayCardVcReferenceId = bankCardInfo.mVCReferenceId;
            this.mPayCardAppletAid = bankCardInfo.mAid;
        }
    }

    public void fillTransResponseData(ByteArray byteArray) {
        if (byteArray != null) {
            this.mIccData = byteArray.toString();
        }
    }

    public int getActionType() {
        return this.mActionType;
    }

    public int getChannel() {
        return this.mChannel;
    }

    public String getCurrencyCode() {
        String str = this.mCurrencyCode;
        return str == null ? "" : str;
    }

    public long getDiscountAmount() {
        return this.mDiscountAmount;
    }

    public String getEncryptPayAmount() {
        String str = this.mEncryptPayAmount;
        return str == null ? "" : str;
    }

    public String getIccData() {
        return this.mIccData;
    }

    public String getMerchantId() {
        String str = this.mMerchantId;
        return str == null ? "" : str;
    }

    public String getMerchantName() {
        String str = this.mMerchantName;
        return str == null ? "" : str;
    }

    public long getOrderAmount() {
        return this.mOrderAmount;
    }

    public String getOrderNumber() {
        String str = this.mOrderNumber;
        return str == null ? "" : str;
    }

    public String getPan() {
        String str = this.mPayCardPan;
        return str == null ? "" : str;
    }

    public long getPayAmount() {
        return this.mPayAmount;
    }

    public String getPayCardAppletAid() {
        String str = this.mPayCardAppletAid;
        return str == null ? "" : str;
    }

    public String getPromotionValue() {
        return this.mPromotionValue;
    }

    public String getQueryId() {
        return this.mQueryId;
    }

    public int getSignKeyIndex() {
        return this.mSignKeyIndex;
    }

    public String getSignedData() {
        String str = this.mSignedData;
        return str == null ? "" : str;
    }

    public String getSupCardAttr() {
        return TextUtils.isEmpty(this.mSupCardAttr) ? "00" : this.mSupCardAttr;
    }

    public String getTransactionNo() {
        return this.mTransactionNo;
    }

    public int getVerifyMethod() {
        return this.mVerifyMethod;
    }

    public boolean isOrderSupPayCard(BankCardInfo bankCardInfo) {
        if (bankCardInfo == null) {
            return false;
        }
        String supCardAttr = getSupCardAttr();
        if (2 == bankCardInfo.mBankCardType) {
            return "00".equals(supCardAttr) || "02".equals(supCardAttr);
        }
        return "00".equals(supCardAttr) || "01".equals(supCardAttr);
    }

    public boolean isSinged() {
        return !TextUtils.isEmpty(this.mMiTsmSignedData);
    }

    public void setCurrencyCode(String str) {
        this.mCurrencyCode = str;
    }

    public void setDiscountAmount(long j) {
        this.mDiscountAmount = j;
    }

    public void setMerchantName(String str) {
        this.mMerchantName = str;
    }

    public void setMiTsmSignKeyIndex(int i) {
        this.mMiTsmSignKeyIndex = i;
    }

    public void setMiTsmSignedData(String str) {
        this.mMiTsmSignedData = str;
    }

    public void setOrderAmount(long j) {
        this.mOrderAmount = j;
    }

    public void setOrderNumber(String str) {
        this.mOrderNumber = str;
    }

    public void setPayAmount(long j) {
        this.mPayAmount = j;
    }

    public void setPromotionValue(String str) {
        this.mPromotionValue = str;
    }

    public void setQrToken(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mPayCardPan = str;
    }

    public void setSignedData(String str) {
        this.mSignedData = str;
    }

    public void setTransactionNo(String str) {
        this.mTransactionNo = str;
    }

    public void setVerifyMethod(int i) {
        this.mVerifyMethod = i;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(MiTsmConstants.KEY_INAPP_ORDER_NUMBER, this.mOrderNumber);
        bundle.putString(MiTsmConstants.KEY_INAPP_MERCHANT_NAME, this.mMerchantName);
        bundle.putString(MiTsmConstants.KEY_INAPP_MERCHANT_ID, this.mMerchantId);
        bundle.putString(MiTsmConstants.KEY_INAPP_SIGNED_DATA, this.mMiTsmSignedData);
        bundle.putString(MiTsmConstants.KEY_INAPP_CURRENCY_CODE, this.mCurrencyCode);
        bundle.putString(MiTsmConstants.KEY_INAPP_VC_REFERENCE_ID, this.mPayCardVcReferenceId);
        bundle.putLong(MiTsmConstants.KEY_INAPP_ORDER_AMOUNT, this.mOrderAmount);
        bundle.putLong(MiTsmConstants.KEY_INAPP_DISCOUNT_AMOUNT, this.mDiscountAmount);
        bundle.putLong(MiTsmConstants.KEY_INAPP_PAY_AMOUNT, this.mPayAmount);
        bundle.putString(MiTsmConstants.KEY_INAPP_ENCRYPT_PAY_AMOUNT, this.mEncryptPayAmount);
        bundle.putInt(MiTsmConstants.KEY_INAPP_SIGN_KEY_INDEX, this.mMiTsmSignKeyIndex);
        bundle.putInt(MiTsmConstants.KEY_INAPP_VERIFY_METHOD, this.mVerifyMethod);
        bundle.putString(MiTsmConstants.KEY_INAPP_ORDER_SUP_CARD_ATTR, this.mSupCardAttr);
        bundle.putString(MiTsmConstants.KEY_INAPP_QUERY_ID, this.mQueryId);
        bundle.putString(MiTsmConstants.KEY_INAPP_PROMOTION_VALUE, this.mPromotionValue);
        bundle.putString(MiTsmConstants.KEY_INAPP_PAN, this.mPayCardPan);
        if (EnvironmentConfig.isSupportNfc()) {
            bundle.putString(MiTsmConstants.KEY_INAPP_ICC_DATA, this.mIccData);
        }
        return bundle;
    }

    public String toString() {
        return "InAppTransData{mOrderNumber='" + this.mOrderNumber + "', mMerchantName='" + this.mMerchantName + "', mMerchantId='" + this.mMerchantId + "', mEncryptPayAmount='" + this.mEncryptPayAmount + "', mSignedData='" + this.mSignedData + "', mCurrencyCode='" + this.mCurrencyCode + "', mSupCardAttr='" + this.mSupCardAttr + "', mOrderAmount=" + this.mOrderAmount + ", mDiscountAmount=" + this.mDiscountAmount + ", mPayAmount=" + this.mPayAmount + ", mSignKeyIndex=" + this.mSignKeyIndex + ", mChannel=" + this.mChannel + ", mQueryId=" + this.mQueryId + ", mPromotionValue=" + this.mPromotionValue + ", mPayCardAppletAid='" + this.mPayCardAppletAid + "', mPayCardPan='" + this.mPayCardPan + "', mPayCardVcReferenceId='" + this.mPayCardVcReferenceId + "', mIccData='" + this.mIccData + "', mMiTsmSignedData='" + this.mMiTsmSignedData + "', mVerifyMethod=" + this.mVerifyMethod + ", mMiTsmSignKeyIndex=" + this.mMiTsmSignKeyIndex + ", mTransactionNo=" + this.mTransactionNo + ", mActionType=" + this.mActionType + AbstractJsonLexerKt.END_OBJ;
    }

    public void update(Bundle bundle) {
        if (bundle != null) {
            if (bundle.containsKey(MiTsmConstants.KEY_INAPP_ORDER_NUMBER)) {
                this.mOrderNumber = bundle.getString(MiTsmConstants.KEY_INAPP_ORDER_NUMBER, "");
            }
            if (bundle.containsKey(MiTsmConstants.KEY_INAPP_MERCHANT_NAME)) {
                this.mMerchantName = bundle.getString(MiTsmConstants.KEY_INAPP_MERCHANT_NAME, "");
            }
            if (bundle.containsKey(MiTsmConstants.KEY_INAPP_MERCHANT_ID)) {
                this.mMerchantId = bundle.getString(MiTsmConstants.KEY_INAPP_MERCHANT_ID, "");
            }
            if (bundle.containsKey(MiTsmConstants.KEY_INAPP_ORDER_AMOUNT)) {
                this.mOrderAmount = bundle.getLong(MiTsmConstants.KEY_INAPP_ORDER_AMOUNT, 0L);
            }
            if (bundle.containsKey(MiTsmConstants.KEY_INAPP_DISCOUNT_AMOUNT)) {
                this.mDiscountAmount = bundle.getLong(MiTsmConstants.KEY_INAPP_DISCOUNT_AMOUNT, 0L);
            }
            if (bundle.containsKey(MiTsmConstants.KEY_INAPP_PAY_AMOUNT)) {
                this.mPayAmount = bundle.getLong(MiTsmConstants.KEY_INAPP_PAY_AMOUNT, 0L);
            }
            if (bundle.containsKey(MiTsmConstants.KEY_INAPP_SIGNED_DATA)) {
                this.mSignedData = bundle.getString(MiTsmConstants.KEY_INAPP_SIGNED_DATA, "");
            }
            if (bundle.containsKey(MiTsmConstants.KEY_INAPP_SIGN_KEY_INDEX)) {
                this.mSignKeyIndex = bundle.getInt(MiTsmConstants.KEY_INAPP_SIGN_KEY_INDEX, 0);
            }
            if (bundle.containsKey(MiTsmConstants.KEY_INAPP_CURRENCY_CODE)) {
                this.mCurrencyCode = bundle.getString(MiTsmConstants.KEY_INAPP_CURRENCY_CODE, "");
            }
            if (bundle.containsKey(MiTsmConstants.KEY_INAPP_ENCRYPT_PAY_AMOUNT)) {
                this.mEncryptPayAmount = bundle.getString(MiTsmConstants.KEY_INAPP_ENCRYPT_PAY_AMOUNT, "");
            }
            if (bundle.containsKey(MiTsmConstants.KEY_INAPP_CHANNEL)) {
                this.mChannel = bundle.getInt(MiTsmConstants.KEY_INAPP_CHANNEL, -1);
            }
            if (bundle.containsKey(MiTsmConstants.KEY_INAPP_QUERY_ID)) {
                this.mQueryId = bundle.getString(MiTsmConstants.KEY_INAPP_QUERY_ID, "");
            }
            if (bundle.containsKey(MiTsmConstants.KEY_INAPP_PROMOTION_VALUE)) {
                this.mPromotionValue = bundle.getString(MiTsmConstants.KEY_INAPP_PROMOTION_VALUE, "");
            }
            if (bundle.containsKey(MiTsmConstants.KEY_INAPP_ORDER_SUP_CARD_ATTR)) {
                this.mSupCardAttr = bundle.getString(MiTsmConstants.KEY_INAPP_ORDER_SUP_CARD_ATTR, "00");
            }
            if (bundle.containsKey(MiTsmConstants.KEY_INAPP_ACTION_TYPE)) {
                this.mActionType = bundle.getInt(MiTsmConstants.KEY_INAPP_ACTION_TYPE, 0);
            }
            this.mMiTsmSignedData = "";
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mOrderNumber);
        parcel.writeString(this.mMerchantName);
        parcel.writeString(this.mMerchantId);
        parcel.writeString(this.mEncryptPayAmount);
        parcel.writeString(this.mSignedData);
        parcel.writeString(this.mCurrencyCode);
        parcel.writeString(this.mSupCardAttr);
        parcel.writeLong(this.mOrderAmount);
        parcel.writeLong(this.mDiscountAmount);
        parcel.writeLong(this.mPayAmount);
        parcel.writeInt(this.mSignKeyIndex);
        parcel.writeInt(this.mChannel);
        parcel.writeString(this.mQueryId);
        parcel.writeString(this.mPromotionValue);
        parcel.writeString(this.mPayCardAppletAid);
        parcel.writeString(this.mPayCardPan);
        parcel.writeString(this.mPayCardVcReferenceId);
        parcel.writeString(this.mIccData);
        parcel.writeString(this.mMiTsmSignedData);
        parcel.writeInt(this.mVerifyMethod);
        parcel.writeInt(this.mMiTsmSignKeyIndex);
        parcel.writeString(this.mTransactionNo);
        parcel.writeInt(this.mActionType);
    }

    public InAppTransData(Parcel parcel) {
        this.mOrderNumber = parcel.readString();
        this.mMerchantName = parcel.readString();
        this.mMerchantId = parcel.readString();
        this.mEncryptPayAmount = parcel.readString();
        this.mSignedData = parcel.readString();
        this.mCurrencyCode = parcel.readString();
        this.mSupCardAttr = parcel.readString();
        this.mOrderAmount = parcel.readLong();
        this.mDiscountAmount = parcel.readLong();
        this.mPayAmount = parcel.readLong();
        this.mSignKeyIndex = parcel.readInt();
        this.mChannel = parcel.readInt();
        this.mQueryId = parcel.readString();
        this.mPromotionValue = parcel.readString();
        this.mPayCardAppletAid = parcel.readString();
        this.mPayCardPan = parcel.readString();
        this.mPayCardVcReferenceId = parcel.readString();
        this.mIccData = parcel.readString();
        this.mMiTsmSignedData = parcel.readString();
        this.mVerifyMethod = parcel.readInt();
        this.mMiTsmSignKeyIndex = parcel.readInt();
        this.mTransactionNo = parcel.readString();
        this.mActionType = parcel.readInt();
    }
}
