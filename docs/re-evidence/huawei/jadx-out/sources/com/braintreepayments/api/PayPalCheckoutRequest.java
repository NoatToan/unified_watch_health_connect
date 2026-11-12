package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amap.api.services.district.DistrictSearchQuery;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.openalliance.ad.constant.SpKeys;
import defpackage.tf;
import defpackage.tj;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class PayPalCheckoutRequest extends PayPalRequest implements Parcelable {
    public static final Parcelable.Creator<PayPalCheckoutRequest> CREATOR = new Parcelable.Creator<PayPalCheckoutRequest>() { // from class: com.braintreepayments.api.PayPalCheckoutRequest.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PayPalCheckoutRequest createFromParcel(Parcel parcel) {
            return new PayPalCheckoutRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public PayPalCheckoutRequest[] newArray(int i) {
            return new PayPalCheckoutRequest[i];
        }
    };
    public static final String USER_ACTION_COMMIT = "commit";
    public static final String USER_ACTION_DEFAULT = "";
    private final String amount;
    private String currencyCode;
    private String intent;
    private boolean shouldOfferPayLater;
    private boolean shouldRequestBillingAgreement;
    private String userAction;

    @Override // com.braintreepayments.api.PayPalRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public PayPalCheckoutRequest(String str) {
        this(str, false);
    }

    public PayPalCheckoutRequest(String str, boolean z) {
        super(z);
        this.intent = PayPalPaymentIntent.AUTHORIZE;
        this.userAction = "";
        this.amount = str;
    }

    public void setCurrencyCode(String str) {
        this.currencyCode = str;
    }

    public void setIntent(String str) {
        this.intent = str;
    }

    public void setUserAction(String str) {
        this.userAction = str;
    }

    public void setShouldOfferPayLater(boolean z) {
        this.shouldOfferPayLater = z;
    }

    public void setShouldRequestBillingAgreement(boolean z) {
        this.shouldRequestBillingAgreement = z;
    }

    public String getAmount() {
        return this.amount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public String getIntent() {
        return this.intent;
    }

    public String getUserAction() {
        return this.userAction;
    }

    public boolean getShouldOfferPayLater() {
        return this.shouldOfferPayLater;
    }

    public boolean getShouldRequestBillingAgreement() {
        return this.shouldRequestBillingAgreement;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.braintreepayments.api.PayPalRequest
    public String createRequestBody(tf tfVar, Authorization authorization, String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("return_url", str).put("cancel_url", str2).put("offer_pay_later", this.shouldOfferPayLater);
        if (authorization instanceof tj) {
            jSONObjectPut.put("authorization_fingerprint", authorization.getD());
        } else {
            jSONObjectPut.put("client_key", authorization.getD());
        }
        if (this.shouldRequestBillingAgreement) {
            jSONObjectPut.put("request_billing_agreement", true);
        }
        String billingAgreementDescription = getBillingAgreementDescription();
        if (this.shouldRequestBillingAgreement && !TextUtils.isEmpty(billingAgreementDescription)) {
            jSONObjectPut.put("billing_agreement_details", new JSONObject().put("description", billingAgreementDescription));
        }
        if (this.userAuthenticationEmail != null && !this.userAuthenticationEmail.isEmpty()) {
            jSONObjectPut.put("payer_email", this.userAuthenticationEmail);
        }
        String currencyCode = getCurrencyCode();
        if (currencyCode == null) {
            currencyCode = tfVar.getAn();
        }
        jSONObjectPut.put(HwPayConstant.KEY_AMOUNT, this.amount).put("currency_iso_code", currencyCode).put(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, this.intent);
        if (!getLineItems().isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<PayPalLineItem> it = getLineItems().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJson());
            }
            jSONObjectPut.put("line_items", jSONArray);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("no_shipping", !isShippingAddressRequired());
        jSONObject.put("landing_page_type", getLandingPageType());
        String displayName = getDisplayName();
        if (TextUtils.isEmpty(displayName)) {
            displayName = tfVar.getAs();
        }
        jSONObject.put("brand_name", displayName);
        if (getLocaleCode() != null) {
            jSONObject.put("locale_code", getLocaleCode());
        }
        if (getUserAction() != "") {
            jSONObject.put("user_action", getUserAction());
        }
        if (getShippingAddressOverride() != null) {
            jSONObject.put("address_override", !isShippingAddressEditable());
            PostalAddress shippingAddressOverride = getShippingAddressOverride();
            jSONObjectPut.put("line1", shippingAddressOverride.getStreetAddress());
            jSONObjectPut.put("line2", shippingAddressOverride.getExtendedAddress());
            jSONObjectPut.put(DistrictSearchQuery.KEYWORDS_CITY, shippingAddressOverride.getLocality());
            jSONObjectPut.put("state", shippingAddressOverride.getRegion());
            jSONObjectPut.put("postal_code", shippingAddressOverride.getPostalCode());
            jSONObjectPut.put(SpKeys.BELONG_COUNTRY_CODE, shippingAddressOverride.getCountryCodeAlpha2());
            jSONObjectPut.put("recipient_name", shippingAddressOverride.getRecipientName());
        } else {
            jSONObject.put("address_override", false);
        }
        if (getMerchantAccountId() != null) {
            jSONObjectPut.put("merchant_account_id", getMerchantAccountId());
        }
        if (getRiskCorrelationId() != null) {
            jSONObjectPut.put("correlation_id", getRiskCorrelationId());
        }
        jSONObjectPut.put("experience_profile", jSONObject);
        return jSONObjectPut.toString();
    }

    PayPalCheckoutRequest(Parcel parcel) {
        super(parcel);
        this.intent = PayPalPaymentIntent.AUTHORIZE;
        this.userAction = "";
        this.intent = parcel.readString();
        this.userAction = parcel.readString();
        this.amount = parcel.readString();
        this.currencyCode = parcel.readString();
        this.shouldRequestBillingAgreement = parcel.readByte() != 0;
        this.shouldOfferPayLater = parcel.readByte() != 0;
    }

    @Override // com.braintreepayments.api.PayPalRequest, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.intent);
        parcel.writeString(this.userAction);
        parcel.writeString(this.amount);
        parcel.writeString(this.currencyCode);
        parcel.writeByte(this.shouldRequestBillingAgreement ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.shouldOfferPayLater ? (byte) 1 : (byte) 0);
    }
}
