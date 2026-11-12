package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.GrsQueryCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartResponseWrapper;
import com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartHttpCallback;
import com.huawei.hwsmartinteractmgr.smarthttpmodel.SmartObserver;
import com.huawei.hwsmartinteractmgr.smarthttpmodel.smarthttpparser.SmartHttpBaseParser;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.connectivity.config.AUserProfile;
import com.huawei.thirdloginbasemodule.ThirdLoginDataStorageUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ntc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f43658a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ntc f43659b = new ntc();
    private AUserProfile f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<Integer, List<SmartObserver>> f43660c = new HashMap(5);
    private Map<Integer, SmartHttpBaseParser> e = new HashMap(5);
    private Context d = BaseApplication.getContext();

    private ntc() {
    }

    public static ntc c() {
        return f43659b;
    }

    public void e(int i, Map<String, String> map, SmartHttpCallback smartHttpCallback) {
        AUserProfile aUserProfileQ = otl.b(this.d).q();
        this.f = aUserProfileQ;
        e(i, aUserProfileQ, map, smartHttpCallback);
    }

    public <R> void e(final int i, final AUserProfile aUserProfile, final Map<String, String> map, final SmartHttpCallback<R> smartHttpCallback) {
        LogUtil.a("SMART_SmartHttpUtil", "enter pullData():contentType =  ", Integer.valueOf(i));
        if (aUserProfile == null) {
            return;
        }
        if (Utils.o()) {
            LogUtil.a("SMART_SmartHttpUtil", "request, isNoCloudVersion, return");
            if (smartHttpCallback != null) {
                smartHttpCallback.onResponse(-1, null);
                return;
            }
            return;
        }
        if (i == 1) {
            LogUtil.a("SMART_SmartHttpUtil", "user label contentType = ", Integer.valueOf(i));
            SmartResponseWrapper smartResponseWrapper = new SmartResponseWrapper(0, "", i);
            smartResponseWrapper.setResponse(b());
            c(i, smartResponseWrapper);
            return;
        }
        GRSManager.c(this.d).d(a(i), new GrsQueryCallback() { // from class: ntc.1
            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackSuccess(String str) {
                LogUtil.a("SMART_SmartHttpUtil", "GET KEY SUCCESS");
                String str2 = str + ntc.this.e(i);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                nte.e(str2, ntc.this.a(aUserProfile, map), ntc.this.d(i), new IBaseResponseCallback() { // from class: ntc.1.5
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i2, Object obj) {
                        LogUtil.a("SMART_SmartHttpUtil", "onFinished:resCode=", Integer.valueOf(i2), " contentType=", Integer.valueOf(i));
                        if (obj instanceof String) {
                            ntc.this.c(i2, (String) obj, i, smartHttpCallback);
                        } else {
                            smartHttpCallback.onResponse(-1, null);
                        }
                    }
                });
            }

            @Override // com.huawei.hwcloudmodel.callback.GrsQueryCallback
            public void onCallBackFail(int i2) {
                LogUtil.a("SMART_SmartHttpUtil", "onCallBackFail errorCode = ", Integer.valueOf(i2));
            }
        });
    }

    private List<String> b() {
        LogUtil.a("SMART_SmartHttpUtil", "getAllLabels()");
        ArrayList arrayList = new ArrayList(5);
        List<String> allLabels = ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).getAllLabels(LoginInit.getInstance(this.d).getAccountInfo(1011));
        return njy.b((Object) allLabels, String.class) ? allLabels : arrayList;
    }

    private String a(int i) {
        if (i == 0) {
            return "activityUrl";
        }
        if (i == 1 || i == 2 || i == 3) {
            return "healthRecommendUrl";
        }
        LogUtil.a("SMART_SmartHttpUtil", "getUrl invalid contentType");
        return "";
    }

    public String e(int i) {
        if (i == 0) {
            return "/activity/getActivities";
        }
        if (i == 1) {
            return "/dataRecommend/label/getUserLabel";
        }
        if (i == 2) {
            return "/dataRecommend/goal/achieveGoal";
        }
        if (i == 3) {
            return "/dataRecommend/goal/getCompletionNum";
        }
        LogUtil.a("SMART_SmartHttpUtil", "getUrl invalid contentType");
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public <V> void c(int i, String str, int i2, SmartHttpCallback<V> smartHttpCallback) {
        if (i != 200) {
            LogUtil.a("SMART_SmartHttpUtil", "smartCenter connection failed, errCode = ", Integer.valueOf(i));
            if (smartHttpCallback != 0) {
                smartHttpCallback.onResponse(-1, null);
                return;
            }
            return;
        }
        SmartHttpBaseParser smartHttpBaseParser = this.e.get(Integer.valueOf(i2));
        if (smartHttpBaseParser == null) {
            LogUtil.e("SMART_SmartHttpUtil", "parser in null");
            return;
        }
        SmartResponseWrapper smartResponseWrapper = smartHttpBaseParser.parse(str);
        LogUtil.d("SMART_SmartHttpUtil", "processData wrapper = ", smartResponseWrapper.getResponse());
        if (smartHttpCallback != 0) {
            smartHttpCallback.onResponse(0, smartResponseWrapper.getResponse());
        }
        c(i2, smartResponseWrapper);
    }

    private void c(int i, final SmartResponseWrapper smartResponseWrapper) {
        synchronized (f43658a) {
            List<SmartObserver> list = this.f43660c.get(Integer.valueOf(i));
            if (list != null && !list.isEmpty()) {
                LogUtil.a("SMART_SmartHttpUtil", "notifyCorrespondSubscriber size is ", Integer.valueOf(list.size()));
                for (final SmartObserver smartObserver : list) {
                    ThreadPoolManager.c().execute(new Runnable() { // from class: ntc.5
                        @Override // java.lang.Runnable
                        public void run() {
                            smartObserver.onDataChanged(smartResponseWrapper);
                        }
                    });
                }
                return;
            }
            LogUtil.a("SMART_SmartHttpUtil", "subscriber ", Integer.valueOf(i), " is already unregitered or never register!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> d(int i) {
        HashMap<String, String> map = new HashMap<>(5);
        map.put("x-version", CommonUtil.c(this.d));
        if (i == 0 && TextUtils.isEmpty(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008))) {
            LogUtil.j("SMART_SmartHttpUtil", "getHeaders mapHeaders isActivitiesInvalid");
        } else {
            map.put("x-huid", KeyValDbManager.d(this.d).c("user_id"));
        }
        LogUtil.d("SMART_SmartHttpUtil", "getHeaders mapHeaders:", map.toString());
        return map;
    }

    private HashMap<String, String> b(AUserProfile aUserProfile) {
        HashMap<String, String> map = new HashMap<>(5);
        String appPackage = "com.huawei.bone";
        if ("com.huawei.bone".equals(BaseApplication.getAppPackage())) {
            map.put("appType", String.valueOf(2));
        } else {
            map.put("appType", String.valueOf(1));
        }
        map.put("ts", String.valueOf(System.currentTimeMillis()));
        map.put("tokenType", String.valueOf(ThirdLoginDataStorageUtil.getTokenTypeValue()));
        map.put("token", a());
        if (LoginInit.getInstance(this.d).isLoginedByWear()) {
            LogUtil.a("SMART_SmartHttpUtil", "callService appid wear logined");
        } else {
            LogUtil.a("SMART_SmartHttpUtil", "callService appid health logined");
            appPackage = BaseApplication.getAppPackage();
        }
        map.put("appId", appPackage);
        map.put("deviceType", String.valueOf(CommonUtil.h(this.d)));
        String deviceId = LoginInit.getInstance(BaseApplication.getContext()).getDeviceId();
        if (TextUtils.isEmpty(deviceId)) {
            deviceId = "clientnull";
        }
        map.put("deviceId", deviceId);
        map.put("sysVersion", Build.VERSION.RELEASE);
        map.put("bindDeviceType", aUserProfile != null ? aUserProfile.getBindDeviceType() : "");
        map.put("iVersion", String.valueOf(Utils.e()));
        map.put("language", LanguageUtil.b(BaseApplication.getContext()));
        map.put("environment", String.valueOf(CommonUtil.o(this.d)));
        map.put("upDeviceType", LoginInit.getInstance(BaseApplication.getContext()).getDeviceType());
        LogUtil.d("SMART_SmartHttpUtil", "getPublicParams->mapParams:", map.toString());
        return map;
    }

    private void e(HashMap<String, String> map, Map<String, String> map2) {
        if (map == null || map2 == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key)) {
                map.put(key, String.valueOf(value));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> a(AUserProfile aUserProfile, Map<String, String> map) {
        HashMap<String, String> mapB = b(aUserProfile);
        e(mapB, map);
        return mapB;
    }

    public void b(int i, SmartObserver smartObserver) {
        synchronized (f43658a) {
            List<SmartObserver> arrayList = this.f43660c.get(Integer.valueOf(i));
            if (arrayList == null) {
                arrayList = new ArrayList<>(5);
                this.f43660c.put(Integer.valueOf(i), arrayList);
            }
            if (smartObserver != null) {
                arrayList.add(smartObserver);
            }
        }
    }

    public void d(int i, SmartObserver smartObserver) {
        synchronized (f43658a) {
            List<SmartObserver> list = this.f43660c.get(Integer.valueOf(i));
            if (list != null && smartObserver != null) {
                list.remove(smartObserver);
            }
        }
    }

    public <I> void e(int i, SmartHttpBaseParser<I> smartHttpBaseParser) {
        if (smartHttpBaseParser == null || this.e.containsKey(Integer.valueOf(i))) {
            return;
        }
        this.e.put(Integer.valueOf(i), smartHttpBaseParser);
    }

    public void d() {
        LogUtil.a("SMART_SmartHttpUtil", "release smartInteract resources");
        e();
        j();
    }

    private void j() {
        this.e.clear();
    }

    private void e() {
        synchronized (f43658a) {
            Iterator<Map.Entry<Integer, List<SmartObserver>>> it = this.f43660c.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().clear();
            }
            this.f43660c.clear();
        }
    }

    private String a() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1008);
        if (!TextUtils.isEmpty(accountInfo)) {
            try {
                return URLEncoder.encode(accountInfo, StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e) {
                LogUtil.e("SMART_SmartHttpUtil", "token encode Exception ", e.toString());
            }
        }
        return accountInfo;
    }
}
