package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class SkuDetails {
    private final String a;
    private final JSONObject b;

    public SkuDetails(@NonNull String str) throws JSONException {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public final String a() {
        return this.b.optString("skuDetailsToken");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.a, ((SkuDetails) obj).a);
        }
        return false;
    }

    @NonNull
    public String getDescription() {
        return this.b.optString("description");
    }

    @NonNull
    public String getFreeTrialPeriod() {
        return this.b.optString("freeTrialPeriod");
    }

    @NonNull
    public String getIconUrl() {
        return this.b.optString("iconUrl");
    }

    @NonNull
    public String getIntroductoryPrice() {
        return this.b.optString("introductoryPrice");
    }

    public long getIntroductoryPriceAmountMicros() {
        return this.b.optLong("introductoryPriceAmountMicros");
    }

    public int getIntroductoryPriceCycles() {
        return this.b.optInt("introductoryPriceCycles");
    }

    @NonNull
    public String getIntroductoryPricePeriod() {
        return this.b.optString("introductoryPricePeriod");
    }

    @NonNull
    public String getOriginalJson() {
        return this.a;
    }

    @NonNull
    public String getOriginalPrice() {
        return this.b.has("original_price") ? this.b.optString("original_price") : getPrice();
    }

    public long getOriginalPriceAmountMicros() {
        return this.b.has("original_price_micros") ? this.b.optLong("original_price_micros") : getPriceAmountMicros();
    }

    @NonNull
    public String getPrice() {
        return this.b.optString(FirebaseAnalytics.Param.PRICE);
    }

    public long getPriceAmountMicros() {
        return this.b.optLong("price_amount_micros");
    }

    @NonNull
    public String getPriceCurrencyCode() {
        return this.b.optString("price_currency_code");
    }

    @NonNull
    public String getSku() {
        return this.b.optString("productId");
    }

    @NonNull
    public String getSubscriptionPeriod() {
        return this.b.optString("subscriptionPeriod");
    }

    @NonNull
    public String getTitle() {
        return this.b.optString("title");
    }

    @NonNull
    public String getType() {
        return this.b.optString("type");
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NonNull
    public String toString() {
        String strValueOf = String.valueOf(this.a);
        return strValueOf.length() != 0 ? "SkuDetails: ".concat(strValueOf) : new String("SkuDetails: ");
    }

    public int zza() {
        return this.b.optInt("offer_type");
    }

    @NonNull
    public String zzb() {
        return this.b.optString("offer_id");
    }

    @NonNull
    public final String zzc() {
        return this.b.optString("packageName");
    }

    @NonNull
    public String zzd() {
        return this.b.optString("serializedDocid");
    }
}
