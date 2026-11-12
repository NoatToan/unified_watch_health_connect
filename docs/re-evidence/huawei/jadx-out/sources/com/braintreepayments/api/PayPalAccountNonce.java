package com.braintreepayments.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tu;
import defpackage.ul;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class PayPalAccountNonce extends PaymentMethodNonce {
    private static final String ACCOUNT_ADDRESS_KEY = "accountAddress";
    static final String API_RESOURCE_KEY = "paypalAccounts";
    private static final String BILLING_ADDRESS_KEY = "billingAddress";
    private static final String CLIENT_METADATA_ID_KEY = "correlationId";
    public static final Parcelable.Creator<PayPalAccountNonce> CREATOR = new Parcelable.Creator<PayPalAccountNonce>() { // from class: com.braintreepayments.api.PayPalAccountNonce.3
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public PayPalAccountNonce createFromParcel(Parcel parcel) {
            return new PayPalAccountNonce(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PayPalAccountNonce[] newArray(int i) {
            return new PayPalAccountNonce[i];
        }
    };
    private static final String CREDIT_FINANCING_KEY = "creditFinancingOffered";
    private static final String DETAILS_KEY = "details";
    private static final String EMAIL_KEY = "email";
    private static final String FIRST_NAME_KEY = "firstName";
    private static final String LAST_NAME_KEY = "lastName";
    private static final String PAYER_ID_KEY = "payerId";
    private static final String PAYER_INFO_KEY = "payerInfo";
    private static final String PAYMENT_METHOD_DATA_KEY = "paymentMethodData";
    private static final String PAYMENT_METHOD_DEFAULT_KEY = "default";
    private static final String PAYMENT_METHOD_NONCE_KEY = "nonce";
    private static final String PHONE_KEY = "phone";
    private static final String SHIPPING_ADDRESS_KEY = "shippingAddress";
    private static final String TOKENIZATION_DATA_KEY = "tokenizationData";
    private static final String TOKEN_KEY = "token";
    private final String authenticateUrl;
    private final PostalAddress billingAddress;
    private final String clientMetadataId;
    private final PayPalCreditFinancing creditFinancing;
    private final String email;
    private final String firstName;
    private final String lastName;
    private final String payerId;
    private final String phone;
    private final PostalAddress shippingAddress;

    /* JADX WARN: Code duplicated, block: B:12:0x006f A[Catch: JSONException -> 0x00c4, TRY_LEAVE, TryCatch #1 {JSONException -> 0x00c4, blocks: (B:10:0x0069, B:12:0x006f), top: B:42:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0078  */
    /* JADX WARN: Code duplicated, block: B:17:0x008b A[Catch: JSONException -> 0x00c3, TryCatch #0 {JSONException -> 0x00c3, blocks: (B:15:0x0079, B:17:0x008b, B:18:0x008f), top: B:40:0x0079 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x00b5 A[Catch: JSONException -> 0x00c8, TRY_LEAVE, TryCatch #2 {JSONException -> 0x00c8, blocks: (B:21:0x00ad, B:23:0x00b5), top: B:44:0x00ad }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00db  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    public static PayPalAccountNonce fromJSON(JSONObject jSONObject) throws JSONException {
        boolean z;
        PayPalCreditFinancing payPalCreditFinancing;
        JSONObject jSONObject2;
        String strE;
        String strE2;
        String strE3;
        String strE4;
        PayPalCreditFinancing payPalCreditFinancingFromJson;
        PostalAddress postalAddress;
        PayPalCreditFinancing payPalCreditFinancing2;
        String str;
        PostalAddress postalAddress2;
        PostalAddress postalAddressD;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject3;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObject4 = jSONObject;
        String strE5 = "";
        try {
            try {
                try {
                    try {
                        try {
                            if (jSONObject4.has(API_RESOURCE_KEY)) {
                                jSONObject4 = jSONObject4.getJSONArray(API_RESOURCE_KEY).getJSONObject(0);
                            } else {
                                if (jSONObject4.has(PAYMENT_METHOD_DATA_KEY)) {
                                    jSONObject4 = new JSONObject(jSONObject4.getJSONObject(PAYMENT_METHOD_DATA_KEY).getJSONObject(TOKENIZATION_DATA_KEY).getString("token")).getJSONArray(API_RESOURCE_KEY).getJSONObject(0);
                                    z = true;
                                }
                                String string = jSONObject4.getString("nonce");
                                boolean zOptBoolean = jSONObject4.optBoolean("default", false);
                                payPalCreditFinancing = null;
                                String strE6 = tu.e(jSONObject4, "authenticateUrl", null);
                                jSONObject2 = jSONObject4.getJSONObject(DETAILS_KEY);
                                strE = tu.e(jSONObject2, "email", null);
                                String strE7 = tu.e(jSONObject2, CLIENT_METADATA_ID_KEY, null);
                                if (jSONObject2.has(CREDIT_FINANCING_KEY)) {
                                    payPalCreditFinancingFromJson = PayPalCreditFinancing.fromJson(jSONObject2.getJSONObject(CREDIT_FINANCING_KEY));
                                } else {
                                    payPalCreditFinancingFromJson = null;
                                }
                                jSONObject3 = jSONObject2.getJSONObject(PAYER_INFO_KEY);
                                jSONObjectOptJSONObject2 = jSONObject3.optJSONObject(BILLING_ADDRESS_KEY);
                                if (jSONObject3.has(ACCOUNT_ADDRESS_KEY)) {
                                    jSONObjectOptJSONObject2 = jSONObject3.optJSONObject(ACCOUNT_ADDRESS_KEY);
                                }
                                postalAddress2 = ul.d(jSONObject3.optJSONObject(SHIPPING_ADDRESS_KEY));
                                postalAddress = ul.d(jSONObjectOptJSONObject2);
                                strE2 = tu.e(jSONObject3, FIRST_NAME_KEY, "");
                                strE3 = tu.e(jSONObject3, LAST_NAME_KEY, "");
                                strE4 = tu.e(jSONObject3, PHONE_KEY, "");
                                strE5 = tu.e(jSONObject3, PAYER_ID_KEY, "");
                                if (strE == null) {
                                    strE = tu.e(jSONObject3, "email", null);
                                }
                                payPalCreditFinancing2 = payPalCreditFinancingFromJson;
                                str = strE5;
                                String str2 = strE;
                                if (z || (jSONObjectOptJSONObject = jSONObject4.optJSONObject(SHIPPING_ADDRESS_KEY)) == null) {
                                    postalAddressD = postalAddress2;
                                } else {
                                    postalAddressD = ul.d(jSONObjectOptJSONObject);
                                }
                                return new PayPalAccountNonce(strE7, postalAddress, postalAddressD, strE2, strE3, strE4, str2, str, payPalCreditFinancing2, strE6, string, zOptBoolean);
                            }
                            strE5 = tu.e(jSONObject3, PAYER_ID_KEY, "");
                            if (strE == null) {
                                strE = tu.e(jSONObject3, "email", null);
                            }
                            payPalCreditFinancing2 = payPalCreditFinancingFromJson;
                            str = strE5;
                        } catch (JSONException unused) {
                            postalAddress = new PostalAddress();
                            payPalCreditFinancing2 = payPalCreditFinancingFromJson;
                            str = strE5;
                            postalAddress2 = new PostalAddress();
                        }
                        strE4 = tu.e(jSONObject3, PHONE_KEY, "");
                    } catch (JSONException unused2) {
                        strE4 = "";
                    }
                    strE3 = tu.e(jSONObject3, LAST_NAME_KEY, "");
                } catch (JSONException unused3) {
                    strE3 = "";
                    strE4 = strE3;
                }
                jSONObject3 = jSONObject2.getJSONObject(PAYER_INFO_KEY);
                jSONObjectOptJSONObject2 = jSONObject3.optJSONObject(BILLING_ADDRESS_KEY);
                if (jSONObject3.has(ACCOUNT_ADDRESS_KEY)) {
                    jSONObjectOptJSONObject2 = jSONObject3.optJSONObject(ACCOUNT_ADDRESS_KEY);
                }
                postalAddress2 = ul.d(jSONObject3.optJSONObject(SHIPPING_ADDRESS_KEY));
                postalAddress = ul.d(jSONObjectOptJSONObject2);
                strE2 = tu.e(jSONObject3, FIRST_NAME_KEY, "");
            } catch (JSONException unused4) {
                payPalCreditFinancing = payPalCreditFinancingFromJson;
                strE2 = "";
                strE3 = strE2;
                strE4 = strE3;
                payPalCreditFinancingFromJson = payPalCreditFinancing;
                postalAddress = new PostalAddress();
                payPalCreditFinancing2 = payPalCreditFinancingFromJson;
                str = strE5;
                postalAddress2 = new PostalAddress();
                String str3 = strE;
                if (z) {
                    postalAddressD = postalAddress2;
                } else {
                    postalAddressD = postalAddress2;
                }
                return new PayPalAccountNonce(strE7, postalAddress, postalAddressD, strE2, strE3, strE4, str3, str, payPalCreditFinancing2, strE6, string, zOptBoolean);
            }
            if (jSONObject2.has(CREDIT_FINANCING_KEY)) {
                payPalCreditFinancingFromJson = PayPalCreditFinancing.fromJson(jSONObject2.getJSONObject(CREDIT_FINANCING_KEY));
            } else {
                payPalCreditFinancingFromJson = null;
            }
        } catch (JSONException unused5) {
        }
        z = false;
        String string2 = jSONObject4.getString("nonce");
        boolean zOptBoolean2 = jSONObject4.optBoolean("default", false);
        payPalCreditFinancing = null;
        String strE8 = tu.e(jSONObject4, "authenticateUrl", null);
        jSONObject2 = jSONObject4.getJSONObject(DETAILS_KEY);
        strE = tu.e(jSONObject2, "email", null);
        String strE9 = tu.e(jSONObject2, CLIENT_METADATA_ID_KEY, null);
        String str4 = strE;
        if (z) {
            postalAddressD = postalAddress2;
        } else {
            postalAddressD = postalAddress2;
        }
        return new PayPalAccountNonce(strE9, postalAddress, postalAddressD, strE2, strE3, strE4, str4, str, payPalCreditFinancing2, strE8, string2, zOptBoolean2);
    }

    private PayPalAccountNonce(String str, PostalAddress postalAddress, PostalAddress postalAddress2, String str2, String str3, String str4, String str5, String str6, PayPalCreditFinancing payPalCreditFinancing, String str7, String str8, boolean z) {
        super(str8, z);
        this.clientMetadataId = str;
        this.billingAddress = postalAddress;
        this.shippingAddress = postalAddress2;
        this.firstName = str2;
        this.lastName = str3;
        this.phone = str4;
        this.email = str5;
        this.payerId = str6;
        this.creditFinancing = payPalCreditFinancing;
        this.authenticateUrl = str7;
    }

    public String getEmail() {
        return this.email;
    }

    public PostalAddress getBillingAddress() {
        return this.billingAddress;
    }

    public PostalAddress getShippingAddress() {
        return this.shippingAddress;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getClientMetadataId() {
        return this.clientMetadataId;
    }

    public String getPayerId() {
        return this.payerId;
    }

    public PayPalCreditFinancing getCreditFinancing() {
        return this.creditFinancing;
    }

    public String getAuthenticateUrl() {
        return this.authenticateUrl;
    }

    @Override // com.braintreepayments.api.PaymentMethodNonce, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.clientMetadataId);
        parcel.writeParcelable(this.billingAddress, i);
        parcel.writeParcelable(this.shippingAddress, i);
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.email);
        parcel.writeString(this.phone);
        parcel.writeString(this.payerId);
        parcel.writeParcelable(this.creditFinancing, i);
        parcel.writeString(this.authenticateUrl);
    }

    private PayPalAccountNonce(Parcel parcel) {
        super(parcel);
        this.clientMetadataId = parcel.readString();
        this.billingAddress = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.shippingAddress = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.email = parcel.readString();
        this.phone = parcel.readString();
        this.payerId = parcel.readString();
        this.creditFinancing = (PayPalCreditFinancing) parcel.readParcelable(PayPalCreditFinancing.class.getClassLoader());
        this.authenticateUrl = parcel.readString();
    }
}
