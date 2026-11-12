package com.miui.tsmclient.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.StringUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class BankCardInfo extends CardInfo {
    public static final String BANK_CARD_TYPE_CREDIT = "CREDIT";
    public static final String BANK_CARD_TYPE_DEBIT = "DEBIT";
    public static final String CARD_ART = "card_art";
    private static final String CARD_BANK_CARD_PHONE_NO = "phone_no";
    private static final String CARD_BANK_CARD_TYPE_URL = "web_url";
    private static final String CARD_ELEMENTS_OPTION = "card_element_option";
    public static final String CARD_INFO_FIELD_BANK_CARD_FRONT_COLOR = "bank_card_front_color";
    public static final String CARD_INFO_FIELD_BANK_CARD_ISSUER_CHANNEL = "bank_card_issuer_channel";
    public static final String CARD_INFO_FIELD_BANK_CARD_ISSUER_ID = "bank_card_issuer_id";
    public static final String CARD_INFO_FIELD_BANK_CARD_PAN = "bank_card_pan";
    public static final String CARD_INFO_FIELD_BANK_CARD_PAN_LAST_DIGITS = "bank_card_pan_last_digits";
    public static final String CARD_INFO_FIELD_BANK_CARD_PRODUCT_NAME = "bank_card_product_name";
    public static final String CARD_INFO_FIELD_BANK_CARD_PRODUCT_TYPE_ID = "bank_card_product_id";
    public static final String CARD_INFO_FIELD_BANK_CARD_TYPE = "bank_card_type";
    public static final String CARD_INFO_FIELD_BANK_CARD_VC_NUM = "bank_card_vc_card_num";
    public static final String CARD_INFO_FIELD_BANK_CARD_VC_REFERENCE_ID = "bank_card_vc_reference_id";
    public static final String CARD_INFO_FIELD_BANK_CONTACT_NUM = "bank_contact_num";
    public static final String CARD_INFO_FIELD_BANK_LOGO_URL = "bank_logo_url";
    public static final String CARD_INFO_FIELD_BANK_LOGO_WITH_NAME_URL = "bank_logo_with_name_url";
    public static final String CARD_INFO_FIELD_BANK_NAME = "bank_name";
    private static final String CARD_IS_NEED_OTP = "is_need_otp";
    private static final String CARD_IS_SUPPORTED_TOKEN_V2 = "is_supported_token_v2";
    private static final String CARD_QR_TOKEN = "card_qr_token";
    private static final String CARD_SERVICE_HOTLINE = "card_service_hotline";
    private static final String CARD_SUGGESTION = "card_suggestion";
    public static final String CARD_USER_TERMS = "card_user_terms";
    public static final String CARD_VC_STATUS = "card_vc_status";
    public static final Parcelable.Creator<BankCardInfo> CREATOR = new Parcelable.Creator<BankCardInfo>() { // from class: com.miui.tsmclient.entity.BankCardInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankCardInfo createFromParcel(Parcel parcel) {
            BankCardInfo bankCardInfo = new BankCardInfo();
            bankCardInfo.readFromParcel(parcel);
            return bankCardInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BankCardInfo[] newArray(int i) {
            return new BankCardInfo[i];
        }
    };
    public static final int CREDIT = 2;
    public static final int DEBIT = 1;
    public static final String DEFAULT_VC_REFERENCE_ID = "0";
    private static final int ELEMENT_OPT_EXPIRE = 2;
    private static final int ELEMENT_OPT_PASSWORD = 1;
    public static final int GUIDE_TYPE_AUTH = 1;
    public static final int GUIDE_TYPE_REAL_NAME = 2;
    public static final int ISSUER_CHANNEL_CMB = 2;
    public static final int ISSUER_CHANNEL_UP = 1;
    public static final String TOKEN_TYPE_NFC_QR = "00";
    public static final String TOKEN_TYPE_QR = "01";
    public static final int VC_STATUS_ACTIVATED = 0;
    public static final int VC_STATUS_DELETE = 3;
    public static final int VC_STATUS_LOCK = 2;
    public static final int VC_STATUS_PERSONALIZE = 5;
    public static final int VC_STATUS_WAIT_ACTIVATE = 1;
    private boolean isNeedOtp;
    private boolean isSendOtpSuccess;
    private boolean isSupportedTokenV2;
    private String mAccountId;
    public String mBankCardPan;
    public int mBankCardType;
    private String mBankCardTypeWebUrl;
    public String mBankContactNum;
    public String mBankLogoUrl;
    public String mBankLogoWithNameUrl;
    public String mBankName;
    public String mCardArt;
    private int mCardElementsOption;
    public String mCardFrontColor;
    public String mCardProductName;
    public String mCardProductTypeId;
    private int mGuideType;
    public boolean mHasQRToken;
    public int mIssuerChannel;
    public String mIssuerId;
    private boolean mNeedEnhance;
    private String mOtpErrorMsg;
    public String mPanLastDigits;
    public String mPhoneLastDigits;
    private String mPhoneNo;
    public String mServiceHotline;
    public boolean mShowBankNameSuffix;
    public String mSuggestion;
    public String mUserTerms;
    public String mVCReferenceId;
    public int mVCStatus;
    public String mVCardNumber;

    public BankCardInfo() {
        this(CardInfo.CARD_TYPE_BANKCARD);
    }

    public String getAccountId() {
        return this.mAccountId;
    }

    public String getBankCardType() {
        return this.mBankCardType == 1 ? BANK_CARD_TYPE_DEBIT : BANK_CARD_TYPE_CREDIT;
    }

    public String getBankCardTypeWebUrl() {
        return TextUtils.isEmpty(this.mBankCardTypeWebUrl) ? "" : this.mBankCardTypeWebUrl;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public String getContentDescription(Map<Class<? extends CardInfo>, String> map) {
        String str;
        return (map == null || (str = map.get(getClass())) == null) ? super.getContentDescription(null) : String.format(str, this.mBankName, this.mPanLastDigits);
    }

    public int getGuideType() {
        return this.mGuideType;
    }

    public String getOtpErrorMsg() {
        return this.mOtpErrorMsg;
    }

    public String getPhoneNo() {
        return StringUtils.tail(this.mPhoneNo, 4);
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean hasQRProperty() {
        return true;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean hasQRToken() {
        return this.mHasQRToken;
    }

    public boolean isActivateTimeOut() {
        return "DELETE".equals(this.mSuggestion);
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isBankCard() {
        return true;
    }

    public boolean isBankCardLocked() {
        return this.mVCStatus == 2;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isCardActive() {
        return this.mVCStatus == 0;
    }

    public boolean isCardPersonalized() {
        return this.mVCStatus == 5;
    }

    public boolean isDebitCard() {
        return this.mBankCardType == 1;
    }

    public boolean isNeedEnhance() {
        return this.mNeedEnhance;
    }

    public boolean isNeedExpireCardElement() {
        return (this.mCardElementsOption & 2) > 0;
    }

    public boolean isNeedOtp() {
        return this.isNeedOtp;
    }

    public boolean isNeedPwdCardElement() {
        return (this.mCardElementsOption & 1) > 0;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public boolean isQrBankCard() {
        return false;
    }

    public boolean isSendOtpSuccess() {
        return this.isSendOtpSuccess;
    }

    public boolean isSupportedTokenV2() {
        return this.isSupportedTokenV2;
    }

    @Override // com.miui.tsmclient.entity.CardInfo
    public void readFromParcel(Parcel parcel) {
        this.mCardName = parcel.readString();
        this.mCardNo = parcel.readString();
        this.mAid = parcel.readString();
        this.mBankCardPan = parcel.readString();
        this.mBankCardType = parcel.readInt();
        this.mVCReferenceId = parcel.readString();
        this.mVCardNumber = parcel.readString();
        this.mCardProductTypeId = parcel.readString();
        this.mIssuerId = parcel.readString();
        this.mCardProductName = parcel.readString();
        this.mUserTerms = parcel.readString();
        this.mCardArt = parcel.readString();
        this.mVCStatus = parcel.readInt();
        this.mPhoneLastDigits = parcel.readString();
        this.mIssuerChannel = parcel.readInt();
        this.mPanLastDigits = parcel.readString();
        this.mBankName = parcel.readString();
        this.mBankLogoUrl = parcel.readString();
        this.mBankLogoWithNameUrl = parcel.readString();
        this.mCardFrontColor = parcel.readString();
        this.mBankContactNum = parcel.readString();
        this.mHasQRToken = parcel.readInt() == 0;
        this.mServiceHotline = parcel.readString();
        this.mShowBankNameSuffix = parcel.readInt() == 1;
        this.mCardElementsOption = parcel.readInt();
        this.isSupportedTokenV2 = parcel.readInt() == 1;
        this.mBankCardTypeWebUrl = parcel.readString();
        this.isNeedOtp = parcel.readInt() == 1;
        this.mPhoneNo = parcel.readString();
        this.isSendOtpSuccess = parcel.readInt() == 1;
        this.mOtpErrorMsg = parcel.readString();
        this.mTechType = parcel.readInt();
    }

    @Override // com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.database.JSONSerializable
    public JSONObject serialize() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("title", this.mCardName);
            jSONObject.put("card_no", this.mCardNo);
            jSONObject.put("aid", this.mAid);
            jSONObject.put(CARD_INFO_FIELD_BANK_CARD_PAN, this.mBankCardPan);
            jSONObject.put("bank_card_type", this.mBankCardType);
            jSONObject.put(CARD_INFO_FIELD_BANK_CARD_VC_REFERENCE_ID, this.mVCReferenceId);
            jSONObject.put(CARD_INFO_FIELD_BANK_CARD_VC_NUM, this.mVCardNumber);
            jSONObject.put(CARD_INFO_FIELD_BANK_CARD_PRODUCT_TYPE_ID, this.mCardProductTypeId);
            jSONObject.put(CARD_INFO_FIELD_BANK_CARD_ISSUER_ID, this.mIssuerId);
            jSONObject.put(CARD_INFO_FIELD_BANK_CARD_PRODUCT_NAME, this.mCardProductName);
            jSONObject.put("card_user_terms", this.mUserTerms);
            jSONObject.put("card_art", this.mCardArt);
            jSONObject.put("card_vc_status", this.mVCStatus);
            jSONObject.put(CARD_INFO_FIELD_BANK_CARD_ISSUER_CHANNEL, this.mIssuerChannel);
            jSONObject.put(CARD_INFO_FIELD_BANK_CARD_PAN_LAST_DIGITS, this.mPanLastDigits);
            jSONObject.put("bank_name", this.mBankName);
            jSONObject.put(CARD_INFO_FIELD_BANK_LOGO_URL, this.mBankLogoUrl);
            jSONObject.put(CARD_INFO_FIELD_BANK_LOGO_WITH_NAME_URL, this.mBankLogoWithNameUrl);
            jSONObject.put(CARD_INFO_FIELD_BANK_CARD_FRONT_COLOR, this.mCardFrontColor);
            jSONObject.put(CARD_INFO_FIELD_BANK_CONTACT_NUM, this.mBankContactNum);
            jSONObject.put(CARD_QR_TOKEN, this.mHasQRToken);
            jSONObject.put(CARD_SERVICE_HOTLINE, this.mServiceHotline);
            jSONObject.put(CARD_SUGGESTION, this.mSuggestion);
            jSONObject.put(CARD_ELEMENTS_OPTION, this.mCardElementsOption);
            jSONObject.put(CARD_IS_SUPPORTED_TOKEN_V2, this.isSupportedTokenV2);
            jSONObject.put(CARD_BANK_CARD_TYPE_URL, this.mBankCardTypeWebUrl);
            jSONObject.put(CARD_IS_NEED_OTP, this.isNeedOtp);
            jSONObject.put(CARD_BANK_CARD_PHONE_NO, this.mPhoneNo);
            jSONObject.put(CardInfo.KEY_TECH_TYPE, this.mTechType);
        } catch (JSONException e) {
            LogUtils.e("serialize bankcard info to json object failed!", e);
        }
        return jSONObject;
    }

    public void setAccountId(String str) {
        this.mAccountId = str;
    }

    public void setBankCardTypeWebUrl(String str) {
        this.mBankCardTypeWebUrl = str;
    }

    public void setCardElementsOption(int i) {
        this.mCardElementsOption = i;
    }

    public void setGuideType(int i) {
        this.mGuideType = i;
    }

    public void setNeedEnhance(boolean z) {
        this.mNeedEnhance = z;
    }

    public void setNeedOtp(boolean z) {
        this.isNeedOtp = z;
    }

    public void setOtpErrorMsg(String str) {
        this.mOtpErrorMsg = str;
    }

    public void setPhoneNo(String str) {
        this.mPhoneNo = str;
    }

    public void setSendOtpSuccess(boolean z) {
        this.isSendOtpSuccess = z;
    }

    public void setSupportedTokenV2(boolean z) {
        this.isSupportedTokenV2 = z;
    }

    @Override // com.miui.tsmclient.entity.CardInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCardName);
        parcel.writeString(this.mCardNo);
        parcel.writeString(this.mAid);
        parcel.writeString(this.mBankCardPan);
        parcel.writeInt(this.mBankCardType);
        parcel.writeString(this.mVCReferenceId);
        parcel.writeString(this.mVCardNumber);
        parcel.writeString(this.mCardProductTypeId);
        parcel.writeString(this.mIssuerId);
        parcel.writeString(this.mCardProductName);
        parcel.writeString(this.mUserTerms);
        parcel.writeString(this.mCardArt);
        parcel.writeInt(this.mVCStatus);
        parcel.writeString(this.mPhoneLastDigits);
        parcel.writeInt(this.mIssuerChannel);
        parcel.writeString(this.mPanLastDigits);
        parcel.writeString(this.mBankName);
        parcel.writeString(this.mBankLogoUrl);
        parcel.writeString(this.mBankLogoWithNameUrl);
        parcel.writeString(this.mCardFrontColor);
        parcel.writeString(this.mBankContactNum);
        parcel.writeInt(!this.mHasQRToken ? 1 : 0);
        parcel.writeString(this.mServiceHotline);
        parcel.writeInt(this.mShowBankNameSuffix ? 1 : 0);
        parcel.writeInt(this.mCardElementsOption);
        parcel.writeInt(this.isSupportedTokenV2 ? 1 : 0);
        parcel.writeString(this.mBankCardTypeWebUrl);
        parcel.writeInt(this.isNeedOtp ? 1 : 0);
        parcel.writeString(this.mPhoneNo);
        parcel.writeInt(this.isSendOtpSuccess ? 1 : 0);
        parcel.writeString(this.mOtpErrorMsg);
        parcel.writeInt(this.mTechType);
    }

    public BankCardInfo(String str) {
        super(str);
        this.mShowBankNameSuffix = true;
        this.mCardName = "Mi Pay";
        this.mIsSecure = true;
        this.mCardGroupId = CardGroupType.BANKCARD.getId();
    }

    @Override // com.miui.tsmclient.entity.CardInfo, com.miui.tsmclient.entity.ObjectParser
    public CardInfo parse(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.mCardName = jSONObject.optString("title");
            if (jSONObject.has("card_no")) {
                this.mCardNo = jSONObject.optString("card_no");
            }
            this.mAid = jSONObject.optString("aid");
            this.mBankCardPan = jSONObject.optString(CARD_INFO_FIELD_BANK_CARD_PAN);
            this.mBankCardType = jSONObject.optInt("bank_card_type");
            this.mVCReferenceId = jSONObject.optString(CARD_INFO_FIELD_BANK_CARD_VC_REFERENCE_ID);
            this.mVCardNumber = jSONObject.optString(CARD_INFO_FIELD_BANK_CARD_VC_NUM);
            this.mCardProductTypeId = jSONObject.optString(CARD_INFO_FIELD_BANK_CARD_PRODUCT_TYPE_ID);
            this.mIssuerId = jSONObject.optString(CARD_INFO_FIELD_BANK_CARD_ISSUER_ID);
            this.mCardProductName = jSONObject.optString(CARD_INFO_FIELD_BANK_CARD_PRODUCT_NAME);
            this.mUserTerms = jSONObject.optString("card_user_terms");
            this.mCardArt = jSONObject.optString("card_art");
            this.mVCStatus = jSONObject.optInt("card_vc_status");
            this.mIssuerChannel = jSONObject.optInt(CARD_INFO_FIELD_BANK_CARD_ISSUER_CHANNEL);
            this.mPanLastDigits = jSONObject.optString(CARD_INFO_FIELD_BANK_CARD_PAN_LAST_DIGITS);
            this.mBankName = jSONObject.optString("bank_name");
            this.mBankLogoUrl = jSONObject.optString(CARD_INFO_FIELD_BANK_LOGO_URL);
            this.mBankLogoWithNameUrl = jSONObject.optString(CARD_INFO_FIELD_BANK_LOGO_WITH_NAME_URL);
            this.mCardFrontColor = jSONObject.optString(CARD_INFO_FIELD_BANK_CARD_FRONT_COLOR);
            this.mBankContactNum = jSONObject.optString(CARD_INFO_FIELD_BANK_CONTACT_NUM);
            this.mHasQRToken = jSONObject.optBoolean(CARD_QR_TOKEN);
            this.mServiceHotline = jSONObject.optString(CARD_SERVICE_HOTLINE);
            this.mSuggestion = jSONObject.optString(CARD_SUGGESTION);
            this.mCardElementsOption = jSONObject.optInt(CARD_ELEMENTS_OPTION);
            this.isSupportedTokenV2 = jSONObject.optBoolean(CARD_IS_SUPPORTED_TOKEN_V2);
            this.mBankCardTypeWebUrl = jSONObject.optString(CARD_BANK_CARD_TYPE_URL);
            this.isNeedOtp = jSONObject.optBoolean(CARD_IS_NEED_OTP);
            this.mPhoneNo = jSONObject.optString(CARD_BANK_CARD_PHONE_NO);
            this.mTechType = jSONObject.optInt(CardInfo.KEY_TECH_TYPE);
        }
        return this;
    }
}
