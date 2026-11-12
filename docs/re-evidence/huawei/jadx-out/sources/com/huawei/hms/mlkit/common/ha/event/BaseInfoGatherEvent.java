package com.huawei.hms.mlkit.common.ha.event;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.huawei.hms.mlkit.common.ha.HianalyticsLogProvider;
import com.huawei.hms.mlkit.common.ha.a;
import com.huawei.hms.mlkit.common.ha.c;
import com.huawei.hms.network.embedded.r3;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BaseInfoGatherEvent {
    public static final int TYPE_MAINT = 2;
    public static final int TYPE_OPERATE = 1;
    public static final int TYPE_PRELOAD = 4;

    private LinkedHashMap<String, String> getCommonData(Context context) {
        a aVarA = c.a(context, getAppInfo());
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("package", aVarA.f14317a);
        linkedHashMap.put("appid", aVarA.f14318b);
        linkedHashMap.put("appName", aVarA.d);
        linkedHashMap.put("version", aVarA.f14319c);
        linkedHashMap.put("service", "MLKit");
        linkedHashMap.put("transId", HianalyticsLogProvider.getInstance().getTransId());
        Context applicationContext = context.getApplicationContext();
        linkedHashMap.put("operator", applicationContext == null ? "" : ((TelephonyManager) applicationContext.getSystemService("phone")).getNetworkOperator());
        linkedHashMap.put(r3.y, c.a(context.getApplicationContext()));
        linkedHashMap.put("apkVersion", getModelApkVersion());
        linkedHashMap.put("apiName", getApiName());
        linkedHashMap.put("countryCode", aVarA.f);
        linkedHashMap.put("deviceType", Build.MODEL);
        linkedHashMap.put(FaqConstants.FAQ_EMUIVERSION, c.a());
        linkedHashMap.put("moduleName", getModuleName());
        linkedHashMap.put("moduleVersion", getModuleVersion());
        linkedHashMap.put("deviceCategory", "");
        return linkedHashMap;
    }

    public abstract String getApiName();

    public abstract Bundle getAppInfo();

    public abstract LinkedHashMap<String, String> getCustomizedData();

    public final LinkedHashMap<String, String> getEventData(Context context) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.putAll(getCommonData(context));
        linkedHashMap.putAll(getCustomizedData());
        return linkedHashMap;
    }

    public abstract String getEventId();

    public abstract String getExtension(String str);

    public abstract String getModelApkVersion();

    public abstract String getModuleName();

    public abstract String getModuleVersion();
}
