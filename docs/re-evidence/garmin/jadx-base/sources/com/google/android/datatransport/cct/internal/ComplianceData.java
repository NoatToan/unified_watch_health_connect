package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes13.dex */
@AutoValue
public abstract class ComplianceData {

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract ComplianceData build();

        public abstract Builder setPrivacyContext(ExternalPrivacyContext externalPrivacyContext);

        public abstract Builder setProductIdOrigin(ProductIdOrigin productIdOrigin);
    }

    public enum ProductIdOrigin {
        NOT_SET(0),
        EVENT_OVERRIDE(5);

        private static final SparseArray<ProductIdOrigin> valueMap;
        private final int value;

        static {
            ProductIdOrigin productIdOrigin = NOT_SET;
            ProductIdOrigin productIdOrigin2 = EVENT_OVERRIDE;
            SparseArray<ProductIdOrigin> sparseArray = new SparseArray<>();
            valueMap = sparseArray;
            sparseArray.put(0, productIdOrigin);
            sparseArray.put(5, productIdOrigin2);
        }

        ProductIdOrigin(int i14) {
            this.value = i14;
        }

        public static ProductIdOrigin forNumber(int i14) {
            return valueMap.get(i14);
        }

        public int getValue() {
            return this.value;
        }
    }

    public static Builder builder() {
        return new AutoValue_ComplianceData.Builder();
    }

    public abstract ExternalPrivacyContext getPrivacyContext();

    public abstract ProductIdOrigin getProductIdOrigin();
}
