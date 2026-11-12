package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amap.api.services.district.DistrictSearchQuery;
import com.huawei.openalliance.ad.constant.SpKeys;
import defpackage.tf;
import defpackage.tj;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class PayPalVaultRequest extends PayPalRequest implements Parcelable {
    public static final Parcelable.Creator<PayPalVaultRequest> CREATOR = new Parcelable.Creator<PayPalVaultRequest>() { // from class: com.braintreepayments.api.PayPalVaultRequest.2
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PayPalVaultRequest createFromParcel(Parcel parcel) {
            return new PayPalVaultRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PayPalVaultRequest[] newArray(int i) {
            return new PayPalVaultRequest[i];
        }
    };
    private boolean shouldOfferCredit;

    @Override // com.braintreepayments.api.PayPalRequest, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public PayPalVaultRequest() {
        super(false);
    }

    public PayPalVaultRequest(boolean z) {
        super(z);
    }

    public void setShouldOfferCredit(boolean z) {
        this.shouldOfferCredit = z;
    }

    public boolean getShouldOfferCredit() {
        return this.shouldOfferCredit;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.braintreepayments.api.PayPalRequest
    public String createRequestBody(tf tfVar, Authorization authorization, String str, String str2) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("return_url", str).put("cancel_url", str2).put("offer_paypal_credit", this.shouldOfferCredit);
        if (authorization instanceof tj) {
            jSONObjectPut.put("authorization_fingerprint", authorization.getD());
        } else {
            jSONObjectPut.put("client_key", authorization.getD());
        }
        String billingAgreementDescription = getBillingAgreementDescription();
        if (!TextUtils.isEmpty(billingAgreementDescription)) {
            jSONObjectPut.put("description", billingAgreementDescription);
        }
        jSONObjectPut.putOpt("payer_email", this.userAuthenticationEmail);
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
        if (getShippingAddressOverride() != null) {
            jSONObject.put("address_override", !isShippingAddressEditable());
            JSONObject jSONObject2 = new JSONObject();
            jSONObjectPut.put("shipping_address", jSONObject2);
            PostalAddress shippingAddressOverride = getShippingAddressOverride();
            jSONObject2.put("line1", shippingAddressOverride.getStreetAddress());
            jSONObject2.put("line2", shippingAddressOverride.getExtendedAddress());
            jSONObject2.put(DistrictSearchQuery.KEYWORDS_CITY, shippingAddressOverride.getLocality());
            jSONObject2.put("state", shippingAddressOverride.getRegion());
            jSONObject2.put("postal_code", shippingAddressOverride.getPostalCode());
            jSONObject2.put(SpKeys.BELONG_COUNTRY_CODE, shippingAddressOverride.getCountryCodeAlpha2());
            jSONObject2.put("recipient_name", shippingAddressOverride.getRecipientName());
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

    PayPalVaultRequest(Parcel parcel) {
        super(parcel);
        this.shouldOfferCredit = parcel.readByte() != 0;
    }

    @Override // com.braintreepayments.api.PayPalRequest, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.shouldOfferCredit ? (byte) 1 : (byte) 0);
    }
}
