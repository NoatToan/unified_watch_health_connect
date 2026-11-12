package com.huawei.arkuidevice;

import android.graphics.Bitmap;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import defpackage.cmy;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface DeviceBridgeApi {
    void getDeviceInfo(BaseResponseCallback<DeviceInfo> baseResponseCallback);

    Bitmap getWearDeviceBitmap(DeviceInfo deviceInfo);

    void startDiscoveringByNative(ScanMode scanMode, List<cmy> list, IBaseResponseCallback iBaseResponseCallback);
}
