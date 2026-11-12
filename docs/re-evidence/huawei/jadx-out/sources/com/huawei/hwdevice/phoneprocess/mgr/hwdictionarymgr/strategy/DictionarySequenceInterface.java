package com.huawei.hwdevice.phoneprocess.mgr.hwdictionarymgr.strategy;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.unitedevice.hwcommonfilemgr.entity.RequestFileInfo;
import defpackage.mvf;
import defpackage.mvg;

/* JADX INFO: loaded from: classes11.dex */
public interface DictionarySequenceInterface {
    RequestFileInfo buildSendMessage(mvf mvfVar);

    mvf genCacheDicInfo(int i, int i2, int i3);

    void insertToHiHealth(mvg mvgVar, HiDataOperateListener hiDataOperateListener);

    mvg parseSequenceData(String str);

    void readHiHealthData(int i, DeviceInfo deviceInfo, HiDataReadResultListener hiDataReadResultListener);

    boolean syncNextInfo(mvg mvgVar, mvf mvfVar);
}
