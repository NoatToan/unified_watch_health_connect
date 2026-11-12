package com.huawei.watchface;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.JsonSyntaxException;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.GetmarkeHitopIdBean;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.thread.BaseHttpRequest;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes45.dex */
public class c1 extends BaseHttpRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30099a;

    public c1(String str) {
        this.f30099a = str;
    }

    private LinkedHashMap e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b(linkedHashMap);
        linkedHashMap.put(FaqConstants.FAQ_EMUIVERSION, HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchVersion());
        linkedHashMap.put("versionCode", CommonUtils.getVersionCode() + "");
        linkedHashMap.put(WatchFaceConstant.X_CLIENTTRACEID, MobileInfoHelper.generateUUID());
        linkedHashMap.put("x-hc", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode());
        linkedHashMap.put(ProfileRequestConstants.X_APPID_KEY, "10003");
        linkedHashMap.put("x-devicemodel", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceModel());
        linkedHashMap.put("deviceid", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceIdAsTheme(true));
        linkedHashMap.put("deviceType", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceType());
        linkedHashMap.put("x-brandChannel", String.valueOf(q0.d()));
        linkedHashMap.put("x-accountBrand", String.valueOf(q0.b()));
        linkedHashMap.put("x-appBrand", String.valueOf(q0.b()));
        linkedHashMap.put(WatchFaceConstant.X_UID, HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getUserId());
        if (WatchFaceHttpUtil.A() != null) {
            linkedHashMap.put(WatchFaceConstant.X_SIGN, WatchFaceHttpUtil.A().getSign());
        }
        linkedHashMap.put("Content-Type", "application/json");
        linkedHashMap.put("terminalType", "1");
        linkedHashMap.put(WatchFaceConstant.CIPHER_VERSION, "2");
        linkedHashMap.put("childrenVisible", c2.a(Environment.getApplicationContext()).u() ? "1" : "0");
        linkedHashMap.put(ProfileRequestConstants.X_LANGUAGE_KEY, HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode());
        c2.a(Environment.getApplicationContext()).a(linkedHashMap, d());
        return linkedHashMap;
    }

    private String f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("hitopid", this.f30099a);
        linkedHashMap.put("contentType", SmartMsgConstant.SHOW_METHOD_SMART_CARD);
        linkedHashMap.put("isFilter", "1");
        linkedHashMap.put(TypedValues.Custom.S_DIMENSION, "1");
        linkedHashMap.put("contentPrivType", "1");
        linkedHashMap.put("themeVersion", HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchVersion());
        return GsonHelper.toJson(linkedHashMap);
    }

    public GetmarkeHitopIdBean b(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i("GetMarketHitTopIdThread", "dealReceive json is empty");
            return null;
        }
        try {
            return (GetmarkeHitopIdBean) c5.a().a(str, GetmarkeHitopIdBean.class);
        } catch (JsonSyntaxException e) {
            HwLog.e("GetMarketHitTopIdThread", "dealReceive " + HwLog.printException((Exception) e));
            return null;
        }
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public String c() {
        return CommonUtils.getVersionCode() + "";
    }

    public String g() {
        return a(WatchFaceHttpUtil.o(), f(), e());
    }

    public GetmarkeHitopIdBean.ListBean c(String str) {
        GetmarkeHitopIdBean.ListBean listBean;
        GetmarkeHitopIdBean getmarkeHitopIdBeanB = b(str);
        if (getmarkeHitopIdBeanB == null || (listBean = (GetmarkeHitopIdBean.ListBean) ArrayUtils.a(getmarkeHitopIdBeanB.getList(), 0)) == null) {
            return null;
        }
        return listBean;
    }
}
