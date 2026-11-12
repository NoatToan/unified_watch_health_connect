package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class SkuDetailsParams {
    private String a;
    private List<String> b;

    public static class Builder {
        private String a;
        private List<String> b;

        private Builder() {
        }

        public /* synthetic */ Builder(m mVar) {
        }

        @NonNull
        public SkuDetailsParams build() {
            if (this.a == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.b == null) {
                throw new IllegalArgumentException("SKU list or SkuWithOffer list must be set");
            }
            SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
            skuDetailsParams.a = this.a;
            skuDetailsParams.b = this.b;
            return skuDetailsParams;
        }

        @NonNull
        public Builder setSkusList(@NonNull List<String> list) {
            this.b = new ArrayList(list);
            return this;
        }

        @NonNull
        public Builder setType(@NonNull String str) {
            this.a = str;
            return this;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getSkuType() {
        return this.a;
    }

    @NonNull
    public List<String> getSkusList() {
        return this.b;
    }
}
