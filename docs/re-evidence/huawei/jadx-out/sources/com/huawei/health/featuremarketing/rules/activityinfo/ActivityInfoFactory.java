package com.huawei.health.featuremarketing.rules.activityinfo;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ParamsFactory;
import com.huawei.operation.utils.AppTypeUtils;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.operation.utils.PhoneInfoUtils;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import defpackage.fxl;
import defpackage.lsl;
import defpackage.ofe;
import defpackage.pjn;
import health.compact.a.CommonUtil;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public class ActivityInfoFactory implements ParamsFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f6691c;

    public ActivityInfoFactory(Context context) {
        this.f6691c = context;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, String> getHeaders() {
        HashMap map = new HashMap(16);
        String accountInfo = LoginInit.getInstance(this.f6691c).getAccountInfo(1011);
        if (accountInfo != null) {
            map.put("x-huid", accountInfo);
        }
        map.put("x-version", CommonUtil.c(this.f6691c));
        map.put("Content-Type", "application/json; charset=utf-8");
        return map;
    }

    @Override // com.huawei.networkclient.ParamsFactory
    public Map<String, Object> getBody(Object obj) {
        Map map = obj == null ? new HashMap() : ofe.a(obj);
        map.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        String accountInfo = LoginInit.getInstance(this.f6691c).getAccountInfo(1008);
        if (!TextUtils.isEmpty(accountInfo)) {
            try {
                map.put("token", URLEncoder.encode(accountInfo, StandardCharsets.UTF_8.name()));
            } catch (UnsupportedEncodingException e) {
                LogUtil.e("ActivityInfoFactory", "token encode Exception ", e.toString());
            }
        }
        map.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        map.put("siteId", LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        map.put("appId", BaseApplication.getAppPackage());
        String deviceId = LoginInit.getInstance(this.f6691c).getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            deviceId = "clientnull";
        }
        map.put("deviceId", deviceId);
        map.put("deviceType", PhoneInfoUtils.getDeviceModel());
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put("appType", String.valueOf(AppTypeUtils.getAppType()));
        map.put("iVersion", "2");
        map.put("language", pjn.b(null));
        map.put("timeZone", lsl.q(System.currentTimeMillis()));
        map.put("countryCode", LoginInit.getInstance(this.f6691c).getAccountInfo(1010));
        map.put("phoneType", PhoneInfoUtils.getPhoneType());
        map.put("ts", String.valueOf(System.currentTimeMillis()));
        map.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        map.put("queryType", "0");
        return map;
    }
}
