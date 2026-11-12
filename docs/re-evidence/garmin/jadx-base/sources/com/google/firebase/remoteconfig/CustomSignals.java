package com.google.firebase.remoteconfig;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CustomSignals {
    final Map<String, String> customSignals;

    public CustomSignals(Builder builder) {
        this.customSignals = builder.customSignals;
    }

    public static class Builder {
        private Map<String, String> customSignals = new HashMap();

        public CustomSignals build() {
            return new CustomSignals(this);
        }

        public Builder put(String str, long j8) {
            this.customSignals.put(str, Long.toString(j8));
            return this;
        }

        public Builder put(String str, String str2) {
            this.customSignals.put(str, str2);
            return this;
        }

        public Builder put(String str, double d14) {
            this.customSignals.put(str, Double.toString(d14));
            return this;
        }
    }
}
