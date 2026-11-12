package com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import defpackage.ees;
import defpackage.mva;
import defpackage.mvi;
import defpackage.xiu;

/* JADX INFO: loaded from: classes11.dex */
public interface DictionaryActionInterface {
    xiu buildSendMessage(mvi mviVar);

    mvi genCacheDicInfo(int i, long j, long j2);

    void insertToHiHealth(mva mvaVar, HiDataOperateListener hiDataOperateListener);

    mva parsePointData(ees eesVar);

    void readHiHealthData(int i, DeviceInfo deviceInfo, HiDataReadResultListener hiDataReadResultListener);

    boolean syncNextInfo(mva mvaVar, mvi mviVar);
}
