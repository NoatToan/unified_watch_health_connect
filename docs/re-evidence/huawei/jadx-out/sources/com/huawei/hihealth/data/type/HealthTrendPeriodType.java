package com.huawei.hihealth.data.type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class HealthTrendPeriodType {
    private static final List<Integer> d;

    static {
        ArrayList arrayList = new ArrayList();
        d = arrayList;
        arrayList.add(1);
        arrayList.add(2);
    }

    private HealthTrendPeriodType() {
    }

    public static List<Integer> d() {
        return Collections.unmodifiableList(d);
    }
}
