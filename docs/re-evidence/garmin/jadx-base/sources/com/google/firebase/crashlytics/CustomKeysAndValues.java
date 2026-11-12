package com.google.firebase.crashlytics;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CustomKeysAndValues {
    final Map<String, String> keysAndValues;

    public static class Builder {
        private Map<String, String> keysAndValues = new HashMap();

        public CustomKeysAndValues build() {
            return new CustomKeysAndValues(this);
        }

        public Builder putBoolean(String str, boolean z14) {
            this.keysAndValues.put(str, Boolean.toString(z14));
            return this;
        }

        public Builder putDouble(String str, double d14) {
            this.keysAndValues.put(str, Double.toString(d14));
            return this;
        }

        public Builder putFloat(String str, float f14) {
            this.keysAndValues.put(str, Float.toString(f14));
            return this;
        }

        public Builder putInt(String str, int i14) {
            this.keysAndValues.put(str, Integer.toString(i14));
            return this;
        }

        public Builder putLong(String str, long j8) {
            this.keysAndValues.put(str, Long.toString(j8));
            return this;
        }

        public Builder putString(String str, String str2) {
            this.keysAndValues.put(str, str2);
            return this;
        }
    }

    public CustomKeysAndValues(Builder builder) {
        this.keysAndValues = builder.keysAndValues;
    }
}
