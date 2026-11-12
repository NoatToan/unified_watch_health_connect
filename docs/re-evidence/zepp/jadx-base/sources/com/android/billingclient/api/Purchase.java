package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Purchase {
    private final String a;
    private final String b;
    private final JSONObject c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PurchaseState {
        public static final int PENDING = 2;
        public static final int PURCHASED = 1;
        public static final int UNSPECIFIED_STATE = 0;
    }

    public static class PurchasesResult {

        @Nullable
        private final List<Purchase> a;
        private final BillingResult b;

        public PurchasesResult(@NonNull BillingResult billingResult, @Nullable List<Purchase> list) {
            this.a = list;
            this.b = billingResult;
        }

        @NonNull
        public BillingResult getBillingResult() {
            return this.b;
        }

        @Nullable
        public List<Purchase> getPurchasesList() {
            return this.a;
        }

        public int getResponseCode() {
            return getBillingResult().getResponseCode();
        }
    }

    public Purchase(@NonNull String str, @NonNull String str2) throws JSONException {
        this.a = str;
        this.b = str2;
        this.c = new JSONObject(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.a, purchase.getOriginalJson()) && TextUtils.equals(this.b, purchase.getSignature());
    }

    @Nullable
    public AccountIdentifiers getAccountIdentifiers() {
        String strOptString = this.c.optString("obfuscatedAccountId");
        String strOptString2 = this.c.optString("obfuscatedProfileId");
        if (strOptString == null && strOptString2 == null) {
            return null;
        }
        return new AccountIdentifiers(strOptString, strOptString2);
    }

    @NonNull
    public String getDeveloperPayload() {
        return this.c.optString("developerPayload");
    }

    @NonNull
    public String getOrderId() {
        return this.c.optString("orderId");
    }

    @NonNull
    public String getOriginalJson() {
        return this.a;
    }

    @NonNull
    public String getPackageName() {
        return this.c.optString("packageName");
    }

    public int getPurchaseState() {
        return this.c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long getPurchaseTime() {
        return this.c.optLong("purchaseTime");
    }

    @NonNull
    public String getPurchaseToken() {
        JSONObject jSONObject = this.c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    @zzd
    public int getQuantity() {
        return this.c.optInt(FirebaseAnalytics.Param.QUANTITY, 1);
    }

    @NonNull
    public String getSignature() {
        return this.b;
    }

    @NonNull
    @zzc
    public ArrayList<String> getSkus() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (this.c.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = this.c.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
            }
        } else if (this.c.has("productId")) {
            arrayList.add(this.c.optString("productId"));
        }
        return arrayList;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isAcknowledged() {
        return this.c.optBoolean("acknowledged", true);
    }

    public boolean isAutoRenewing() {
        return this.c.optBoolean("autoRenewing");
    }

    @NonNull
    public String toString() {
        String strValueOf = String.valueOf(this.a);
        return strValueOf.length() != 0 ? "Purchase. Json: ".concat(strValueOf) : new String("Purchase. Json: ");
    }
}
