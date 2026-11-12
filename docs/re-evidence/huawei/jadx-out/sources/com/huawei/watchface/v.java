package com.huawei.watchface;

import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.watchface.mvp.model.thread.BaseHttpRequest;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes45.dex */
public abstract class v extends BaseHttpRequest {
    public LinkedHashMap e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strGenerateDeviceIDWithSeparator = MobileInfoHelper.generateDeviceIDWithSeparator();
        if (strGenerateDeviceIDWithSeparator.contains(":") && strGenerateDeviceIDWithSeparator.contains("=")) {
            linkedHashMap.put("x-deviceid", SafeString.substring(strGenerateDeviceIDWithSeparator, 0, strGenerateDeviceIDWithSeparator.indexOf(":")) + ";type=" + SafeString.substring(strGenerateDeviceIDWithSeparator, strGenerateDeviceIDWithSeparator.indexOf("=") + 1));
        }
        linkedHashMap.put(WatchFaceConstant.X_CLIENTTRACEID, l4.a().b());
        linkedHashMap.put(CloudParamKeys.X_CLIENT_VERSION, MobileInfoHelper.getVersion());
        return linkedHashMap;
    }
}
