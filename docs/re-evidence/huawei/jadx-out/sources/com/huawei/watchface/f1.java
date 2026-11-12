package com.huawei.watchface;

import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.WatchFaceSignBean;
import com.huawei.watchface.mvp.model.helper.systemparam.SystemParamInfo;
import com.huawei.watchface.mvp.model.thread.BaseHttpRequest;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class f1 extends BaseHttpRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30143a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30144b = 0;

    private String f() {
        StringBuffer stringBuffer = new StringBuffer("sign=");
        HwLog.i("GetSystemParam", "getRequestParams deviceType:" + this.f30144b);
        WatchFaceSignBean watchFaceSignBeanC = this.f30144b == 0 ? WatchFaceHttpUtil.C() : WatchFaceHttpUtil.u();
        if (watchFaceSignBeanC != null) {
            stringBuffer.append(watchFaceSignBeanC.getSign());
        } else {
            HwLog.e("GetSystemParam", "getRequestParams, sign is null!");
        }
        stringBuffer.append("&themeVersion=10.0");
        if (this.f30144b == 0) {
            stringBuffer.append("&buildNumber=").append(HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceModel());
        } else {
            stringBuffer.append("&buildNumber=").append(MobileInfoHelper.getDeviceName());
        }
        stringBuffer.append("&versionCode=" + CommonUtils.getVersionCode());
        stringBuffer.append("&paramCode=").append(this.f30143a);
        return stringBuffer.toString();
    }

    public void a(int i) {
        this.f30144b = i;
    }

    public SystemParamInfo b(String str) {
        if (str == null) {
            HwLog.i("GetSystemParam", "handleJsonData json is null");
            return null;
        }
        try {
            if (new JSONObject(str).getInt("resultcode") == 0) {
                return (SystemParamInfo) c5.a().a(str, SystemParamInfo.class);
            }
            HwLog.i("GetSystemParam", "handleJsonData response unknown error");
            return null;
        } catch (Exception e) {
            HwLog.e("GetSystemParam", "SystemParam hitop exception " + HwLog.printException(e));
            return null;
        }
    }

    public String c(String str) {
        HwLog.i("GetSystemParam", "getResponse url");
        return a(WatchFaceHttpUtil.E() + f(), str, e());
    }

    public void d(String str) {
        e(str);
    }

    public final void e(String str) {
        this.f30143a = str;
    }

    private LinkedHashMap e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(FaqConstants.FAQ_EMUIVERSION, HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceMaxVersonBySurport());
        return linkedHashMap;
    }
}
