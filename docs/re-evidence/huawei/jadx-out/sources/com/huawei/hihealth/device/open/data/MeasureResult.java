package com.huawei.hihealth.device.open.data;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface MeasureResult {
    MeasureRecord createAndJoinRecord();

    MeasureRecord createRecord();

    ArrayList<MeasureRecord> getRecords();

    void joinRecord(MeasureRecord measureRecord);
}
