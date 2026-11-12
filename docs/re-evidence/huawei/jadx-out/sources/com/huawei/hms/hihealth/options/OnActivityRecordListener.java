package com.huawei.hms.hihealth.options;

import com.huawei.hms.hihealth.data.SamplePoint;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public interface OnActivityRecordListener {
    default void onReceive(List<SamplePoint> list) {
    }

    void onStatusChange(int i);
}
