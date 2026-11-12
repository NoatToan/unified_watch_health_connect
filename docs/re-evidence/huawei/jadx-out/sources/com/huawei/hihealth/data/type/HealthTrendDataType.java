package com.huawei.hihealth.data.type;

import com.huawei.operation.ble.BleConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HealthTrendDataType {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f12252c;

    static {
        ArrayList arrayList = new ArrayList();
        f12252c = arrayList;
        arrayList.add("RestingHeartRate");
        arrayList.add(BleConstants.BLOOD_OXYGEN);
        arrayList.add("Stress");
        arrayList.add("AllSleepTime");
        arrayList.add("Step");
        arrayList.add("ExerciseIntensity");
        arrayList.add("Calorie");
        arrayList.add("ActiveHour");
    }

    private HealthTrendDataType() {
    }

    public static List<String> a() {
        return Collections.unmodifiableList(f12252c);
    }
}
