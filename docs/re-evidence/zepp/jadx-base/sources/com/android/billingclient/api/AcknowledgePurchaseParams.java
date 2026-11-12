package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AcknowledgePurchaseParams {
    private String a;

    public static final class Builder {
        private String a;

        private Builder() {
        }

        public /* synthetic */ Builder(b bVar) {
        }

        @NonNull
        public AcknowledgePurchaseParams build() {
            if (this.a == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            AcknowledgePurchaseParams acknowledgePurchaseParams = new AcknowledgePurchaseParams(null);
            acknowledgePurchaseParams.a = this.a;
            return acknowledgePurchaseParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.a = str;
            return this;
        }
    }

    private AcknowledgePurchaseParams() {
    }

    public /* synthetic */ AcknowledgePurchaseParams(b bVar) {
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getPurchaseToken() {
        return this.a;
    }
}
