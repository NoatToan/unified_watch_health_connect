package com.huawei.hihealthservice.postprocessing;

import com.huawei.hihealth.HiHealthData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public interface HiPostProcessAction {
    boolean beforePostProcessAction(HiHealthData hiHealthData, int i);

    Set<Integer> getDataTypes();

    boolean postProcessAction(HiHealthData hiHealthData, int i);
}
