package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class ConsumeParams {
    private String a;

    public static final class Builder {
        private String a;

        private Builder() {
        }

        public /* synthetic */ Builder(k kVar) {
        }

        @NonNull
        public ConsumeParams build() {
            if (this.a == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            ConsumeParams consumeParams = new ConsumeParams(null);
            consumeParams.a = this.a;
            return consumeParams;
        }

        @NonNull
        public Builder setPurchaseToken(@NonNull String str) {
            this.a = str;
            return this;
        }
    }

    private ConsumeParams() {
    }

    public /* synthetic */ ConsumeParams(k kVar) {
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
