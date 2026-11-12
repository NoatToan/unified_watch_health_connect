package com.huawei.health.algorithm.api;

import android.app.Activity;
import com.huawei.health.breathe.bean.BreatheBean;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import defpackage.dcv;

/* JADX INFO: loaded from: classes6.dex */
public interface BreathTrainApi {
    void breathControl(dcv dcvVar, int i, IBaseResponseCallback iBaseResponseCallback);

    int canFinish(Activity activity);

    int getJanusDeviceConnect();

    void insert(BreatheBean breatheBean);

    void registerBreatheCallback(BreatheWearAppInterface breatheWearAppInterface);
}
