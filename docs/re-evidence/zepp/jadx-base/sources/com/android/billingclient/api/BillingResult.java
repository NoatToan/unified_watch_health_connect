package com.android.billingclient.api;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingResult {
    private int a;
    private String b;

    public static class Builder {
        private int a;
        private String b = "";

        private Builder() {
        }

        public /* synthetic */ Builder(i iVar) {
        }

        @NonNull
        public BillingResult build() {
            BillingResult billingResult = new BillingResult();
            billingResult.a = this.a;
            billingResult.b = this.b;
            return billingResult;
        }

        @NonNull
        public Builder setDebugMessage(@NonNull String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public Builder setResponseCode(int i) {
            this.a = i;
            return this;
        }
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @NonNull
    public String getDebugMessage() {
        return this.b;
    }

    public int getResponseCode() {
        return this.a;
    }
}
