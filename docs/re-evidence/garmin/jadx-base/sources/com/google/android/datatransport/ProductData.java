package com.google.android.datatransport;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes13.dex */
@AutoValue
public abstract class ProductData {
    public static ProductData withProductId(Integer num) {
        return new AutoValue_ProductData(num);
    }

    public abstract Integer getProductId();
}
