package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class BillingFlowParams {

    @NonNull
    public static final String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";

    @NonNull
    public static final String EXTRA_PARAM_KEY_OLD_SKUS = "skusToReplace";

    @NonNull
    public static final String EXTRA_PARAM_KEY_OLD_SKU_PURCHASE_TOKEN = "oldSkuPurchaseToken";

    @NonNull
    public static final String EXTRA_PARAM_KEY_REPLACE_SKUS_PRORATION_MODE = "prorationMode";

    @NonNull
    public static final String EXTRA_PARAM_KEY_VR = "vr";
    private boolean a;
    private String b;
    private String c;
    private String d;
    private int e = 0;
    private ArrayList<SkuDetails> f;
    private boolean g;

    public static class Builder {
        private String a;
        private String b;
        private String c;
        private int d = 0;
        private ArrayList<SkuDetails> e;
        private boolean f;

        private Builder() {
        }

        public /* synthetic */ Builder(h hVar) {
        }

        @NonNull
        public BillingFlowParams build() {
            ArrayList<SkuDetails> arrayList = this.e;
            if (arrayList == null || arrayList.isEmpty()) {
                throw new IllegalArgumentException("SkuDetails must be provided.");
            }
            ArrayList<SkuDetails> arrayList2 = this.e;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (arrayList2.get(i) == null) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                i = i2;
            }
            if (this.e.size() > 1) {
                SkuDetails skuDetails = this.e.get(0);
                String type = skuDetails.getType();
                ArrayList<SkuDetails> arrayList3 = this.e;
                int size2 = arrayList3.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    SkuDetails skuDetails2 = arrayList3.get(i3);
                    if (!type.equals("play_pass_subs") && !skuDetails2.getType().equals("play_pass_subs") && !type.equals(skuDetails2.getType())) {
                        throw new IllegalArgumentException("SKUs should have the same type.");
                    }
                }
                String strZzc = skuDetails.zzc();
                ArrayList<SkuDetails> arrayList4 = this.e;
                int size3 = arrayList4.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    SkuDetails skuDetails3 = arrayList4.get(i4);
                    if (!type.equals("play_pass_subs") && !skuDetails3.getType().equals("play_pass_subs") && !strZzc.equals(skuDetails3.zzc())) {
                        throw new IllegalArgumentException("All SKUs must have the same package name.");
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams(null);
            billingFlowParams.a = true ^ this.e.get(0).zzc().isEmpty();
            billingFlowParams.b = this.a;
            billingFlowParams.d = this.c;
            billingFlowParams.c = this.b;
            billingFlowParams.e = this.d;
            billingFlowParams.f = this.e;
            billingFlowParams.g = this.f;
            return billingFlowParams;
        }

        @NonNull
        public Builder setObfuscatedAccountId(@NonNull String str) {
            this.a = str;
            return this;
        }

        @NonNull
        public Builder setObfuscatedProfileId(@NonNull String str) {
            this.c = str;
            return this;
        }

        @NonNull
        public Builder setSkuDetails(@NonNull SkuDetails skuDetails) {
            ArrayList<SkuDetails> arrayList = new ArrayList<>();
            arrayList.add(skuDetails);
            this.e = arrayList;
            return this;
        }

        @NonNull
        @zzc
        public Builder setSubscriptionUpdateParams(@NonNull SubscriptionUpdateParams subscriptionUpdateParams) {
            this.b = subscriptionUpdateParams.a();
            this.d = subscriptionUpdateParams.b();
            return this;
        }

        @NonNull
        public Builder setVrPurchaseFlow(boolean z) {
            this.f = z;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProrationMode {
        public static final int DEFERRED = 4;

        @zzb
        public static final int IMMEDIATE_AND_CHARGE_FULL_PRICE = 5;
        public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;
        public static final int IMMEDIATE_WITHOUT_PRORATION = 3;
        public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;
        public static final int UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY = 0;
    }

    @zzc
    public static class SubscriptionUpdateParams {
        private String a;
        private int b = 0;

        @zzc
        public static class Builder {
            private String a;
            private int b = 0;

            private Builder() {
            }

            public /* synthetic */ Builder(h hVar) {
            }

            @NonNull
            @zzc
            public SubscriptionUpdateParams build() {
                h hVar = null;
                if (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(null)) {
                    throw new IllegalArgumentException("Old SKU purchase token/id must be provided.");
                }
                SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams(hVar);
                subscriptionUpdateParams.a = this.a;
                subscriptionUpdateParams.b = this.b;
                return subscriptionUpdateParams;
            }

            @NonNull
            @zzc
            public Builder setOldSkuPurchaseToken(@NonNull String str) {
                this.a = str;
                return this;
            }

            @NonNull
            @zzc
            public Builder setReplaceSkusProrationMode(int i) {
                this.b = i;
                return this;
            }
        }

        private SubscriptionUpdateParams() {
        }

        public /* synthetic */ SubscriptionUpdateParams(h hVar) {
        }

        @NonNull
        @zzc
        public static Builder newBuilder() {
            return new Builder(null);
        }

        @zzc
        public String a() {
            return this.a;
        }

        @zzc
        public int b() {
            return this.b;
        }
    }

    private BillingFlowParams() {
    }

    public /* synthetic */ BillingFlowParams(h hVar) {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    public boolean getVrPurchaseFlow() {
        return this.g;
    }

    public final boolean h() {
        return (!this.g && this.b == null && this.d == null && this.e == 0 && !this.a) ? false : true;
    }

    public final int zzb() {
        return this.e;
    }

    @Nullable
    public final String zzf() {
        return this.b;
    }

    @Nullable
    public final String zzg() {
        return this.d;
    }

    @Nullable
    public final String zzh() {
        return this.c;
    }

    @NonNull
    public final ArrayList<SkuDetails> zzj() {
        ArrayList<SkuDetails> arrayList = new ArrayList<>();
        arrayList.addAll(this.f);
        return arrayList;
    }
}
