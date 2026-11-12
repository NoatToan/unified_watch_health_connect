package com.huawei.hms.hihealth.options;

import com.huawei.hms.hihealth.data.SamplePoint;

/* JADX INFO: loaded from: classes34.dex */
public interface OnSamplePointListener {
    default void onException(int i, String str) {
    }

    void onSamplePoint(SamplePoint samplePoint);
}
