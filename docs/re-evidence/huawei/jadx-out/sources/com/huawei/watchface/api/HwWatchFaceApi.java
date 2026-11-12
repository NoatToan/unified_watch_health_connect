package com.huawei.watchface.api;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.hihealthkit.auth.IAuthorizationListener;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.secure.android.common.activity.SafeService;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.secure.android.common.util.UrlUtil;
import com.huawei.watchface.R;
import com.huawei.watchface.c2;
import com.huawei.watchface.d5;
import com.huawei.watchface.e2;
import com.huawei.watchface.e4;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.f5;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.h0;
import com.huawei.watchface.j2;
import com.huawei.watchface.k3;
import com.huawei.watchface.k5;
import com.huawei.watchface.l3;
import com.huawei.watchface.m;
import com.huawei.watchface.mvp.model.datatype.TransFileInfo;
import com.huawei.watchface.mvp.model.datatype.TransferBusiType;
import com.huawei.watchface.mvp.model.datatype.TransferFileReqType;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.helper.JsSafeUrlSystemParamManager;
import com.huawei.watchface.q1;
import com.huawei.watchface.q4;
import com.huawei.watchface.r0;
import com.huawei.watchface.s0;
import com.huawei.watchface.utils.ArrayUtils;
import com.huawei.watchface.utils.BackgroundTaskUtils;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.FileHelper;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.WatchFaceBitmapUtil;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.WebViewUtils;
import com.huawei.watchface.utils.callback.IAppTransferFileResultAIDLCallback;
import com.huawei.watchface.utils.callback.IBaseResponseCallback;
import com.huawei.watchface.utils.callback.ILoginCallback;
import com.huawei.watchface.utils.callback.IPhotoFileCallback;
import com.huawei.watchface.utils.callback.PluginOperationAdapter;
import com.huawei.watchface.utils.callback.WatchFaceHealthResponseListener;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import com.huawei.watchface.utils.permission.PermissionUtil;
import com.huawei.watchface.v0;
import com.huawei.watchface.v2;
import com.huawei.watchface.y2;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.FutureTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class HwWatchFaceApi extends PluginBase {
    public static final String ACTION_FOREGROUND_STATUS = "com.huawei.haf.intent.action.FOREGROUND_STATUS_CHANGE";
    private static final String DEFAULT_WATCHFACE_SITE = "watchFace";
    private static final int GOTO_WATCHFACE_SHOP = -1;
    public static final String IS_UPDATE_PINNED_SHORTCUT_URL = "isUpdateShortCutUrl";
    public static final String SUPPORT_MAC_CUT = "1";
    private static final String TAG = "HwWatchFaceApi";
    private static final int TRUE_VERSION = 1;
    private static final String URL_DETAIL_SUFFIX = "#/dial-detail";
    private static final String URL_END_SUFFIX = "cch5/health/watchFace/index.html";
    private static final String URL_FROM_SHORTCUTSE = "?from=shortcutse";
    private static final String URL_FROM_SUFFIX = "from=health_app";
    private static final String URL_INDEX_SUFFIX = "#/index";
    private static final String URL_PAY_VIP_COUPONS_SUFFIX = "#/member-coupon";
    private static final String URL_PAY_VIP_SUFFIX = "#/member-pay";
    private static final String URL_SUFFIX = "#/detail/native/";
    private static final String URL_SUFFIX_FROM = "?from=";
    private static final String URL_SUFFIX_FROM_SUB = "&from_sub=";
    private static final String WATCH_FACE_BETA_URL = "sandbox/cch5/health/watchFace/index.html";
    private static volatile HwWatchFaceApi sInstance;
    private Integer connectStatus;
    private volatile String countryCodeCache;
    private h0 crashReport;
    Map<String, Object> mAccountInfoMap;
    private Context mContext;
    Map<String, String> mDeviceInfo;
    private List<Map<String, String>> mDisableWearInfoList;
    private HwWatchFaceAdapter mHwWatchFaceAdapter;
    Map<String, Integer> mVersionInfo;
    private long initTime = 0;
    private boolean releaseLogSwitches = true;
    private boolean isColdStart = true;
    private BroadcastReceiver mBackgroundReceiver = new BroadcastReceiver(this) { // from class: com.huawei.watchface.api.HwWatchFaceApi.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                boolean booleanExtra = intent.getBooleanExtra("isForeground", false);
                long longExtra = intent.getLongExtra("time", 0L);
                CommonUtils.b(booleanExtra);
                if (Environment.getApplicationContext() != null) {
                    HwWatchFaceManager.getInstance(Environment.getApplicationContext()).notifyBackgroundChange(booleanExtra);
                }
                HwLog.i(HwWatchFaceApi.TAG, "isForeground:" + booleanExtra + ",time:" + longExtra);
            } catch (Exception e) {
                HwLog.e(HwWatchFaceApi.TAG, "onReceive isForeground Exception:" + HwLog.printException(e));
            }
        }
    };

    public static class MyAsyncTask extends AsyncTask<Void, Void, String> {
        private WeakReference<Activity> mObj;
        private int position;

        public MyAsyncTask(Activity activity, int i) {
            this.position = i;
            this.mObj = new WeakReference<>(activity);
        }

        @Override // android.os.AsyncTask
        public String doInBackground(Void... voidArr) {
            if (this.mObj.get() == null) {
                HwLog.i(HwWatchFaceApi.TAG, "doInBackground() activity is null.");
                return "";
            }
            return v0.a().a("watchFaceH5", HwWatchFaceApi.getInstance(this.mObj.get()).getCommonCountryCode());
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(String str) {
            String str2;
            super.onPostExecute(str);
            WeakReference<Activity> weakReference = this.mObj;
            if (weakReference == null || weakReference.get() == null) {
                HwLog.e(HwWatchFaceApi.TAG, "onPostExecute() activity is null.");
                return;
            }
            if (TextUtils.isEmpty(str)) {
                HwLog.e(HwWatchFaceApi.TAG, "onPostExecute() httpUrl is empty.");
                return;
            }
            Intent intent = new Intent();
            intent.setClass(this.mObj.get(), WebViewActivity.class);
            if (this.position != -1) {
                if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isTestVersion()) {
                    str2 = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getWatchfaceTestSite(str) + HwWatchFaceApi.URL_SUFFIX + this.position;
                } else {
                    str2 = str + HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getWatchfaceSite() + HwWatchFaceApi.URL_SUFFIX + this.position;
                }
            } else if (HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isTestVersion()) {
                str2 = HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getWatchfaceTestSite(str) + HwWatchFaceApi.URL_INDEX_SUFFIX;
            } else {
                str2 = str + HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getWatchfaceSite() + HwWatchFaceApi.URL_INDEX_SUFFIX;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str2.contains("?") ? "&" : "?");
            sb.append(HwWatchFaceApi.URL_FROM_SUFFIX);
            intent.putExtra("url", sb.toString());
            Activity activity = this.mObj.get();
            if (activity != null) {
                try {
                    activity.startActivityForResult(intent, 102);
                } catch (Exception e) {
                    HwLog.e(HwWatchFaceApi.TAG, "gotoActivity " + HwLog.printException(e));
                }
            }
        }
    }

    public interface RefreshAccessTokenListener {
        void onLoginFailed(Object obj);

        void onLoginSuccess(Object obj);
    }

    public static class ShortCutService extends SafeService {
        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return null;
        }

        @Override // com.huawei.secure.android.common.activity.SafeService, android.app.Service
        public int onStartCommand(Intent intent, int i, int i2) {
            super.onStartCommand(intent, i, i2);
            String str = HwWatchFaceApi.TAG;
            HwLog.i(str, "ShortCutService onStartCommand");
            if (Environment.getApplicationContext() == null) {
                HwLog.i(str, "Environment.getApplicationContext is null");
                stopSelf(i2);
                return 2;
            }
            HwWatchFaceManager.getInstance(Environment.getApplicationContext()).notifyGetShortCutIsCreate();
            stopSelf(i2);
            return 2;
        }
    }

    private HwWatchFaceApi(Context context) {
        clearCountryCode();
        this.mContext = context;
        Environment.setApplication((Application) context);
        registerBackgroundBroadcast();
        initCrashConfig();
        initNetworkClient();
    }

    private boolean checkLeftSpaceAndIsWatchfaceFull(IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback, long j) {
        if (HwWatchFaceBtManager.getInstance(this.mContext).ismIsWatchfaceFull()) {
            iAppTransferFileResultAIDLCallback.onUpgradeFailed(140004, "");
            return true;
        }
        if (HwWatchFaceBtManager.getInstance(this.mContext).isLeftSpaceAllow(j)) {
            return false;
        }
        iAppTransferFileResultAIDLCallback.onUpgradeFailed(140009, "");
        return true;
    }

    private String getCustomAppWatchFaceUrl() {
        Object healthSettingInfo = getHealthSettingInfo("appWatchFace");
        if (healthSettingInfo != null) {
            return healthSettingInfo instanceof String ? (String) healthSettingInfo : "";
        }
        HwLog.e(TAG, "getCustomAppWatchFaceUrl() developerObJ is null.");
        return "";
    }

    private String getDeveloperInfo() {
        Object healthSettingInfo = getHealthSettingInfo("developer");
        if (healthSettingInfo != null) {
            return healthSettingInfo instanceof String ? (String) healthSettingInfo : "";
        }
        HwLog.e(TAG, "getDeveloperInfo() developerObJ is null.");
        return "";
    }

    private String getDeviceIdAsTheme() {
        if (!CommonUtils.u()) {
            String deviceId = getDeviceId();
            HwLog.i(TAG, "getDeviceIdAsTheme() !isEmui&SDK>=26.");
            return deviceId;
        }
        String strGenerateDeviceIDWithSeparator = MobileInfoHelper.generateDeviceIDWithSeparator();
        String strSubstring = SafeString.substring(strGenerateDeviceIDWithSeparator, 0, strGenerateDeviceIDWithSeparator.indexOf(":"));
        HwLog.i(TAG, "getDeviceIdAsTheme() isEmui&SDK>=26.");
        return strSubstring;
    }

    private String getDeviceIdForH5() {
        if (!CommonUtils.u()) {
            String strGenerateUUID = MobileInfoHelper.generateUUID();
            HwLog.i(TAG, "getDeviceIdForH5() !isEmui&SDK>=26.");
            return strGenerateUUID;
        }
        String strGenerateDeviceIDWithSeparator = MobileInfoHelper.generateDeviceIDWithSeparator();
        String strSubstring = SafeString.substring(strGenerateDeviceIDWithSeparator, 0, strGenerateDeviceIDWithSeparator.indexOf(":"));
        HwLog.i(TAG, "getDeviceIdForH5() isEmui&SDK>=26.");
        return strSubstring;
    }

    private String getDeviceInfoByKey(String str) {
        String virtualWatchInfo = "";
        if (this.mHwWatchFaceAdapter == null) {
            HwLog.e(TAG, "getDeviceInfoByKey() mHwWatchFaceAdapter is null.");
            return "";
        }
        Map<String, String> deviceInfo = getDeviceInfo();
        if (deviceInfo == null) {
            HwLog.e(TAG, "getDeviceInfoByKey() infoMap is null.");
            return "";
        }
        if (ArrayUtils.a(deviceInfo)) {
            String disableWearInfoByKey = getDisableWearInfoByKey(str);
            if (!TextUtils.isEmpty(disableWearInfoByKey)) {
                HwLog.i(TAG, "getDeviceInfoByKey() infoMap is null key from DisableWearInfo");
                logDeviceInfo(str, disableWearInfoByKey);
                return disableWearInfoByKey;
            }
            String strA = k5.a(f5.a(str), "storagePw");
            if (!TextUtils.isEmpty(strA)) {
                HwLog.i(TAG, "getDeviceInfoByKey() infoMap is null key from sp");
                logDeviceInfo(str, strA);
                return strA;
            }
            virtualWatchInfo = HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getVirtualWatchInfo(str);
            if (!TextUtils.isEmpty(virtualWatchInfo)) {
                HwLog.i(TAG, "getDeviceInfoByKey() infoMap is null key from VirtualWatchInfo");
                logDeviceInfo(str, virtualWatchInfo);
                return virtualWatchInfo;
            }
        }
        if (TextUtils.isEmpty(virtualWatchInfo)) {
            virtualWatchInfo = deviceInfo.get(str);
        }
        logDeviceInfo(str, virtualWatchInfo);
        if (!TextUtils.isEmpty(virtualWatchInfo)) {
            f5.a(str, k5.c(virtualWatchInfo, "storagePw"));
        }
        return virtualWatchInfo;
    }

    private String getDeviceNameOrLast(String str) {
        if (this.mHwWatchFaceAdapter == null) {
            HwLog.e(TAG, "getDeviceInfoByKey() mHwWatchFaceAdapter is null.");
            return "";
        }
        Map<String, String> deviceInfo = getDeviceInfo();
        if (!ArrayUtils.a(deviceInfo)) {
            return deviceInfo.get(str);
        }
        List<Map<String, String>> disableWearInfo = this.mHwWatchFaceAdapter.getDisableWearInfo();
        if (ArrayUtils.isEmpty(disableWearInfo)) {
            return "";
        }
        Collections.sort(disableWearInfo, new Comparator() { // from class: com.huawei.watchface.api.HwWatchFaceApi$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return HwWatchFaceApi.lambda$getDeviceNameOrLast$1((Map) obj, (Map) obj2);
            }
        });
        return disableWearInfo.get(0).get(str);
    }

    private Object getHealthSettingInfo(String str) {
        HwWatchFaceAdapter hwWatchFaceAdapter = this.mHwWatchFaceAdapter;
        if (hwWatchFaceAdapter == null) {
            HwLog.e(TAG, "getHealthSettingInfo() mHwWatchFaceAdapter is null.");
            return null;
        }
        Map<String, Object> healthSettingInfo = hwWatchFaceAdapter.getHealthSettingInfo();
        if (healthSettingInfo != null) {
            return healthSettingInfo.get(str);
        }
        HwLog.e(TAG, "getHealthSettingInfo() infoMap is null.");
        return null;
    }

    public static HwWatchFaceApi getInstance(Context context) {
        if (context == null) {
            return null;
        }
        if (sInstance == null) {
            synchronized (HwWatchFaceApi.class) {
                if (sInstance == null) {
                    sInstance = new HwWatchFaceApi(context.getApplicationContext());
                }
            }
        }
        return sInstance;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (android.text.TextUtils.isEmpty((java.lang.String) r2) == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Object getSingleAccountInfo(String str) {
        String str2 = TAG;
        HwLog.i(str2, "getSingleAccountInfo key:" + str);
        try {
            if (this.mHwWatchFaceAdapter == null) {
                HwLog.e(str2, "getSingleAccountInfo() mHwWatchFaceAdapter is null.");
                return "";
            }
            if (!ArrayUtils.a(this.mAccountInfoMap)) {
                Object obj = this.mAccountInfoMap.get(str);
                if (!TextUtils.equals("uid", str)) {
                    if (!TextUtils.equals("watchfacePersonalSwitch", str)) {
                    }
                    return obj;
                }
                if (obj instanceof String) {
                }
            }
            this.mAccountInfoMap = this.mHwWatchFaceAdapter.getHmsLiteAccountInfo(this.mContext);
            HwLog.i(str2, "getSingleAccountInfo() getHmsLiteAccountInfo.");
            Map<String, Object> map = this.mAccountInfoMap;
            if (map != null) {
                return map.get(str);
            }
            HwLog.e(str2, "getSingleAccountInfo() infoMap is null.");
            return "";
        } catch (NullPointerException e) {
            HwLog.e(TAG, "getSingleAccountInfo() NullPointerException:" + HwLog.printException((Exception) e));
            return "";
        } catch (Exception e2) {
            HwLog.e(TAG, "getSingleAccountInfo() Exception:" + HwLog.printException(e2));
            return "";
        }
    }

    private String getUrl(final String str, String str2) {
        String strA;
        if (!isBetaVersion()) {
            FutureTask futureTask = new FutureTask(new Callable() { // from class: com.huawei.watchface.api.HwWatchFaceApi$$ExternalSyntheticLambda2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return v0.a().a("watchFaceH5", str);
                }
            });
            WatchFaceHttpUtil.f30613c.execute(futureTask);
            try {
                strA = (String) futureTask.get();
            } catch (Exception e) {
                HwLog.e(TAG, "getBaseUrl Exception" + HwLog.printException(e));
                strA = "";
            }
            if (TextUtils.isEmpty(strA)) {
                strA = v0.a().a("watchFaceH5", str);
            }
            if (getInstance(Environment.getApplicationContext()).isTestVersion()) {
                return getWatchfaceTestSite(strA) + str2;
            }
            return strA + getWatchfaceSite() + str2;
        }
        String str3 = TAG;
        HwLog.i(str3, "getWatchFaceUrl() gotoWatchFace BetaVersion.");
        String developerInfo = getDeveloperInfo();
        HwLog.i(str3, "getWatchFaceUrl() developer: " + developerInfo);
        String strA2 = v0.a().a("watchFaceH5", str);
        if (TextUtils.isEmpty(developerInfo) || !developerInfo.equals("1")) {
            return strA2 + WATCH_FACE_BETA_URL + str2;
        }
        String customAppWatchFaceUrl = getCustomAppWatchFaceUrl();
        HwLog.i(str3, "getWatchFaceUrl() appWatchFace:" + customAppWatchFaceUrl);
        if (TextUtils.isEmpty(customAppWatchFaceUrl)) {
            customAppWatchFaceUrl = DEFAULT_WATCHFACE_SITE;
        }
        return strA2 + ("sandbox/cch5/health/" + customAppWatchFaceUrl + "/index.html") + str2;
    }

    private String getWatchFaceLoadUrl(String str, String str2, String str3) {
        Matcher matcher = Pattern.compile("\\/sandbox\\/cch5\\/health\\/[^\\/]+\\/").matcher(str);
        if (matcher == null || !matcher.find()) {
            return str.replaceFirst("\\/cch5\\/health\\/[^\\/]+\\/", str2 + str3 + "/");
        }
        return str.replaceFirst("\\/sandbox\\/cch5\\/health\\/[^\\/]+\\/", str2 + str3 + "/");
    }

    private void goDetailOrMarket(Activity activity, int i) {
        String str;
        String str2 = TAG;
        HwLog.i(str2, "gotoDetailOrMarket() gotoWatchFace position：" + i);
        if (!isBetaVersion() && !isDebugVersion()) {
            new MyAsyncTask(activity, i).execute(new Void[0]);
            return;
        }
        HwLog.i(str2, "gotoDetailOrMarket() gotoWatchFace BetaVersion.");
        Intent intent = new Intent();
        intent.setClass(activity, WebViewActivity.class);
        String developerInfo = getDeveloperInfo();
        HwLog.i(str2, "gotoDetailOrMarket() developer: " + developerInfo);
        String strA = v0.a().a("watchFaceH5", getCommonCountryCode());
        if (!TextUtils.isEmpty(developerInfo) && developerInfo.equals("1")) {
            String customAppWatchFaceUrl = getCustomAppWatchFaceUrl();
            HwLog.i(str2, "gotoDetailOrMarket() appWatchFace:" + customAppWatchFaceUrl);
            if (customAppWatchFaceUrl.length() == 0) {
                customAppWatchFaceUrl = DEFAULT_WATCHFACE_SITE;
            }
            String str3 = "sandbox/cch5/health/" + customAppWatchFaceUrl + "/index.html";
            if (i != -1) {
                str = strA + str3 + URL_SUFFIX + i;
            } else {
                str = strA + str3 + URL_INDEX_SUFFIX;
            }
        } else if (i != -1) {
            str = strA + "sandbox/cch5/health/watchFace/index.html#/detail/native/" + i;
        } else {
            str = strA + "sandbox/cch5/health/watchFace/index.html#/index";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str.contains("?") ? "&" : "?");
        sb.append(URL_FROM_SUFFIX);
        intent.putExtra("url", sb.toString());
        try {
            activity.startActivityForResult(intent, 102);
        } catch (Exception e) {
            HwLog.e(TAG, "gotoActivity " + HwLog.printException(e));
        }
    }

    private void initCrashConfig() {
        this.crashReport = new h0();
    }

    private void initNetworkClient() {
        try {
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.api.HwWatchFaceApi$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    y2.b().d();
                }
            });
        } catch (Exception e) {
            HwLog.e(TAG, "initNetworkClient  Exception : " + HwLog.printException(e));
        }
    }

    private void initOperationAdapter(Context context) {
        String str = TAG;
        HwLog.i(str, "initOperationAdapter() enter.");
        if (((PluginOperationAdapter) k3.a(context).getAdapter()) == null) {
            HwLog.i(str, "initOperationAdapter() adapter is null.");
            k3 k3VarA = k3.a(context);
            k3VarA.setAdapter(l3.a(context));
            k3VarA.init(context);
        }
    }

    private void initSDK() {
        try {
            BackgroundTaskUtils.submit(new Runnable() { // from class: com.huawei.watchface.api.HwWatchFaceApi$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$initSDK$5();
                }
            });
        } catch (Exception e) {
            HwLog.e(TAG, "initHiAnalytics  Exception : " + HwLog.printException(e));
        }
    }

    private boolean isKeyVersion(String str) {
        if (this.mHwWatchFaceAdapter == null) {
            HwLog.e(TAG, "isKeyVersion() mHwWatchFaceAdapter is null.");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.mVersionInfo == null) {
            this.mVersionInfo = this.mHwWatchFaceAdapter.getHealthVersionType();
        }
        Map<String, Integer> map = this.mVersionInfo;
        if (map == null) {
            HwLog.e(TAG, "isKeyVersion() versionInfo is null.");
            return false;
        }
        Integer num = map.get(str);
        if (num != null) {
            return num.intValue() == 1;
        }
        HwLog.e(TAG, "isKeyVersion() version is null.");
        return false;
    }

    private void judgeDataShareAuth(final Activity activity, final int i) {
        if (Environment.sIsAarInTheme) {
            HwWatchFaceBtManager.getInstance(activity).judgeDataShareAuth(new IBaseResponseCallback() { // from class: com.huawei.watchface.api.HwWatchFaceApi$$ExternalSyntheticLambda0
                @Override // com.huawei.watchface.utils.callback.IBaseResponseCallback
                public final void onResponse(int i2, Object obj) {
                    this.f$0.lambda$judgeDataShareAuth$3(activity, i, i2, obj);
                }
            });
        } else {
            goDetailOrMarket(activity, i);
        }
    }

    static /* synthetic */ int lambda$getDeviceNameOrLast$1(Map map, Map map2) {
        try {
            return (int) (Long.parseLong((String) map2.get("last_connected_time")) - Long.parseLong((String) map.get("last_connected_time")));
        } catch (Exception unused) {
            HwLog.d(TAG, "getDeviceNameOrLast NumberFormatException");
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSDK$5() {
        m.d().a(this.mContext);
        q4.e().i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$judgeDataShareAuth$3(Activity activity, int i, int i2, Object obj) {
        HwLog.i(TAG, "judgeDataShareAuth() err_code: " + i2);
        if (101 == i2) {
            JsSafeUrlSystemParamManager.getInstance().f();
            goDetailOrMarket(activity, i);
        } else {
            if (2 == i2) {
                return;
            }
            requestAuthorization();
        }
    }

    private static void logDeviceInfo(String str, String str2) {
        if (TextUtils.equals(str, "device_Identify") || TextUtils.equals(str, "deviceIdCutStr")) {
            FlavorConfig.safeHwLog(TAG, "getDeviceInfoByKey() key: " + str + ", value: " + str2);
            return;
        }
        HwLog.i(TAG, "getDeviceInfoByKey() key: " + str + ", value: " + str2);
    }

    private void registerBackgroundBroadcast() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_FOREGROUND_STATUS);
        CommonUtils.a(this.mBackgroundReceiver, intentFilter, WatchFaceConstant.f30620a);
    }

    private void requestAuthorization() {
        HwLog.i(TAG, "requestAuthorization() enter.");
        q1.a(this.mContext, new IAuthorizationListener() { // from class: com.huawei.watchface.api.HwWatchFaceApi$$ExternalSyntheticLambda4
            @Override // com.huawei.hihealthkit.auth.IAuthorizationListener
            public final void onResult(int i, Object obj) {
                HwLog.i(HwWatchFaceApi.TAG, "requestAuthorization() onResult i: " + i);
            }
        });
    }

    public void clearCountryCode() {
        synchronized (this) {
            if (!TextUtils.isEmpty(this.countryCodeCache)) {
                this.countryCodeCache = "";
                HwLog.i(TAG, "clearCountryCode");
            }
        }
    }

    public void commonStopTransfer(String str, int i, IBaseResponseCallback iBaseResponseCallback) {
        HwWatchFaceAdapter hwWatchFaceAdapter = this.mHwWatchFaceAdapter;
        if (hwWatchFaceAdapter == null) {
            HwLog.e(TAG, "commonStopTransfer() mHwWatchFaceAdapter is null.");
        } else {
            hwWatchFaceAdapter.commonStopTransfer(str, i, iBaseResponseCallback);
        }
    }

    public void commonTransferFile(String str, String str2, int i, IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback) {
        if (this.mHwWatchFaceAdapter == null) {
            HwLog.e(TAG, "commonTransferFile() mHwWatchFaceAdapter is null.");
            return;
        }
        String str3 = TAG;
        FlavorConfig.safeHwLog(str3, "commonTransferFile filePath: " + str);
        FlavorConfig.safeHwLog(str3, "commonTransferFile fileName: " + str2);
        TransFileInfo transFileInfo = new TransFileInfo();
        transFileInfo.setFilePath(str);
        transFileInfo.setFileName(str2);
        transFileInfo.setFileType(i);
        transFileInfo.setRequestType(TransferFileReqType.APP_DELIVERY);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        transFileInfo.setAttentionTypes(arrayList);
        if (v2.a().b(str2)) {
            v2.a().a(str2);
        }
        r0 r0VarA = s0.a().a(str2, FlavorConfig.SERVICE_WATCH_FACE);
        if (r0VarA == null || r0VarA.a() == null) {
            HwLog.e(str3, "FileContent is null");
            iAppTransferFileResultAIDLCallback.onUpgradeFailed(20000, "");
            return;
        }
        try {
            if (checkLeftSpaceAndIsWatchfaceFull(iAppTransferFileResultAIDLCallback, r0VarA.a().length)) {
                HwLog.i(str3, "checkLeftSpaceAndIsWatchfaceFull true");
                return;
            }
            v2.a().a(r0VarA.a(), str2);
            v2.a aVarC = v2.a().c(str2);
            if (aVarC != null && aVarC.a() != null) {
                this.mHwWatchFaceAdapter.commonTransferFile(TransferBusiType.FIVE_FORTY, transFileInfo, aVarC.a(), aVarC.b(), iAppTransferFileResultAIDLCallback);
            } else {
                FileHelper.a(r0VarA.a(), new File(str));
                this.mHwWatchFaceAdapter.commonTransferFile(TransferBusiType.FIVE_FORTY, transFileInfo, iAppTransferFileResultAIDLCallback);
            }
        } catch (IllegalArgumentException e) {
            HwLog.e(TAG, "commonTransferFile IllegalArgumentException:" + HwLog.printException((Exception) e));
        } catch (Exception e2) {
            HwLog.e(TAG, "commonTransferFile Exception:" + HwLog.printException(e2));
        }
    }

    public void createBinFile(String str, String str2, int i) {
        if (TextUtils.isEmpty(str)) {
            HwLog.e(TAG, "createBinFile() pngFilePath is null.");
        } else if (TextUtils.isEmpty(str2)) {
            HwLog.e(TAG, "createBinFile() binFilePath is null.");
        } else {
            WatchFaceBitmapUtil.getInstance().a(str, str2, i);
        }
    }

    public void createBitPngFile(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            HwLog.e(TAG, "createBitPngFile() binFilePath is null.");
        } else if (TextUtils.isEmpty(str2)) {
            HwLog.e(TAG, "createBitPngFile() pngFilePath is null.");
        } else {
            WatchFaceBitmapUtil.getInstance().a(str, str2);
        }
    }

    public boolean createPinnedShortcut(String str, String str2, IconCompat iconCompat, String str3) {
        PendingIntent service;
        String str4 = TAG;
        HwLog.i(str4, "createPinnedShortcut() enter");
        if (!ShortcutManagerCompat.isRequestPinShortcutSupported(this.mContext)) {
            HwLog.e(str4, "createPinnedShortcut not support");
            return false;
        }
        HwLog.i(str4, "createPinnedShortcut() int Build.VERSION");
        ShortcutManager shortcutManager = (ShortcutManager) this.mContext.getSystemService(ShortcutManager.class);
        Intent intent = new Intent();
        String str5 = getInstance(this.mContext).getWatchFaceUrl(true) + URL_FROM_SHORTCUTSE;
        intent.setAction(str3);
        intent.setClassName(this.mContext.getPackageName(), "com.huawei.health.browseraction.HwHealthBrowserActionActivity");
        intent.setData(Uri.parse("huaweihealth://huaweihealth.app/openwith?type=aar&isNeedLogin=true&address=" + str5));
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        ShortcutInfoCompat shortcutInfoCompatBuild = new ShortcutInfoCompat.Builder(this.mContext, str).setIcon(iconCompat).setShortLabel(str2).setIntent(intent).build();
        try {
            service = PendingIntent.getService(this.mContext, 0, new Intent(this.mContext, (Class<?>) ShortCutService.class), CommonUtils.n() ? 167772160 : 134217728);
        } catch (Exception unused) {
            HwLog.e(TAG, "get successCallback error");
            service = null;
        }
        if (service == null) {
            HwLog.e(TAG, "successCallback is null");
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        String str6 = TAG;
        HwLog.i(str6, "createPinnedShortcut foreground sdk: " + i + "::" + isExistShortCut(str));
        if (!isExistShortCut(str)) {
            boolean zX = CommonUtils.x();
            HwLog.i(str6, "createPinnedShortcut foreground : " + zX);
            if (zX) {
                boolean zRequestPinShortcut = ShortcutManagerCompat.requestPinShortcut(this.mContext, shortcutInfoCompatBuild, service.getIntentSender());
                if (!zRequestPinShortcut) {
                    PermissionUtil.j(this.mContext);
                }
                HwLog.i(str6, "createPinnedShortcut requestPinShortcut : " + zRequestPinShortcut);
                return zRequestPinShortcut;
            }
        } else {
            if (shortcutManager == null) {
                return false;
            }
            HwLog.i(str6, "createPinnedShortcut foreground sdk: null ");
            shortcutManager.enableShortcuts(Collections.singletonList(str));
            shortcutManager.updateShortcuts(Collections.singletonList(shortcutInfoCompatBuild.toShortcutInfo()));
        }
        return false;
    }

    public boolean createShortcuts() {
        String str = TAG;
        HwLog.e(str, "CreateShortcuts() int .");
        int iA = PermissionUtil.a(this.mContext);
        if (iA == -1) {
            HwLog.e(str, "CreateShortcuts() PERMISSION_DENIED.");
            PermissionUtil.j(this.mContext);
            return false;
        }
        if (iA != 0) {
            HwLog.e(str, "CreateShortcuts() PERMISSION_UNKNOWN");
            return createPinnedShortcut("watchface_supermarket", DensityUtil.getStringById(R.string.dial_market_new), IconCompat.createWithResource(this.mContext, R.drawable.watchface_ic_shortcut), CommonConstant.ACTION.HWID_SCHEME_URL);
        }
        HwLog.e(str, "CreateShortcuts() PERMISSION_GRANTED.");
        return createPinnedShortcut("watchface_supermarket", DensityUtil.getStringById(R.string.dial_market_new), IconCompat.createWithResource(this.mContext, R.drawable.watchface_ic_shortcut), CommonConstant.ACTION.HWID_SCHEME_URL);
    }

    public void destroy() {
        HwWatchFaceManager.getInstance(this.mContext).destroy();
        e2.b(this.mContext).a();
        j2.g().e();
        c2.a(this.mContext).b();
    }

    @Override // com.huawei.watchface.api.PluginBase
    public void finish() {
        super.finish();
    }

    public String getAccessToken() {
        if (this.mHwWatchFaceAdapter == null) {
            HwLog.e(TAG, "getAccessToken() mHwWatchFaceAdapter is null.");
            return "";
        }
        String str = TAG;
        HwLog.d(str, "getAccessToken() enter.");
        String accessToken = this.mHwWatchFaceAdapter.getAccessToken();
        if (!TextUtils.isEmpty(accessToken)) {
            return accessToken;
        }
        HwLog.e(str, "getAccessToken() accessToken is empty.");
        return "";
    }

    public int getAccessTokenType() {
        return 2;
    }

    public String getAccountBrand() {
        Object singleAccountInfo = getSingleAccountInfo("appBrand");
        if (!(singleAccountInfo instanceof String)) {
            HwLog.i(TAG, "getAccountBrand() accountBrandObj not instanceof String.");
            return "1";
        }
        HwLog.i(TAG, "getAccountBrand() accountBrandObj instanceof String.");
        String str = (String) singleAccountInfo;
        return TextUtils.isEmpty(str) ? "1" : str;
    }

    public String getAccountToken() {
        String str = TAG;
        HwLog.i(str, "getAccountToken() enter");
        String accessToken = 2 == getAccessTokenType() ? getAccessToken() : "";
        HwLog.i(str, "getAccountToken---isNull:" + TextUtils.isEmpty(accessToken));
        return accessToken;
    }

    public String getCommonCountryCode() {
        if (this.mHwWatchFaceAdapter == null) {
            HwLog.e(TAG, "getCommonCountryCode() mHwWatchFaceAdapter is null.");
            return "";
        }
        String str = this.countryCodeCache;
        if (TextUtils.isEmpty(str)) {
            synchronized (this) {
                str = this.countryCodeCache;
                if (TextUtils.isEmpty(str)) {
                    this.countryCodeCache = this.mHwWatchFaceAdapter.getCommonCountryCode();
                    HwLog.i(TAG, "getCommonCountryCode() from mWatchFaceAdapter");
                    str = this.countryCodeCache;
                }
            }
        }
        HwLog.i(TAG, "getCommonCountryCode() countryCodeCache: " + str);
        return str;
    }

    public String getConnectedEquipment() {
        return Environment.sIsAarInTheme ? HwWatchFaceBtManager.getInstance(this.mContext).getDeviceName() : getDeviceNameOrLast("device_name");
    }

    public int getDeviceConnectState() {
        int i;
        if (ArrayUtils.a(getDeviceInfo())) {
            i = !TextUtils.isEmpty(getDisableWearInfo()) ? 2 : 0;
        } else {
            i = 1;
        }
        HwLog.i(TAG, "getDeviceConnectState connectState==" + i);
        return i;
    }

    public int getDeviceConnectStateForAnalytics() {
        Integer num = this.connectStatus;
        if (num != null) {
            return num.intValue();
        }
        int deviceConnectState = getDeviceConnectState();
        Integer numValueOf = Integer.valueOf(deviceConnectState);
        this.connectStatus = numValueOf;
        numValueOf.getClass();
        return deviceConnectState;
    }

    public String getDeviceId() {
        String str;
        Object singleAccountInfo = getSingleAccountInfo("deviceId");
        if (singleAccountInfo instanceof String) {
            HwLog.i(TAG, "getDeviceId() deviceIdObj instanceof String.");
            str = (String) singleAccountInfo;
        } else {
            HwLog.i(TAG, "getDeviceId() deviceIdObj not instanceof String.");
            str = "";
        }
        FlavorConfig.safeHwLog(TAG, "getDeviceId deviceId:" + str);
        return str;
    }

    public String getDeviceIdentify() {
        return getDeviceInfoByKey("deviceIdCutStr");
    }

    public String getDeviceIdentifyByCapability() {
        if (!HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).isSupportWatchfaceSignature()) {
            HwLog.i(TAG, "getDeviceIdentifyByCapability deviceId cutStr");
            return getDeviceInfoByKey("deviceIdCutStr");
        }
        if (TextUtils.equals(getDeviceInfoByKey("isSupportMacCut"), "1")) {
            HwLog.i(TAG, "getDeviceIdentifyByCapability isSupportMacCut deviceIdCutStr");
            return getDeviceInfoByKey("deviceIdCutStr");
        }
        HwLog.i(TAG, "getDeviceIdentifyByCapability device_Identify");
        return getDeviceInfoByKey("device_Identify");
    }

    public Map<String, String> getDeviceInfo() {
        if (!ArrayUtils.a(this.mDeviceInfo)) {
            return this.mDeviceInfo;
        }
        HwWatchFaceAdapter hwWatchFaceAdapter = this.mHwWatchFaceAdapter;
        if (hwWatchFaceAdapter == null) {
            HwLog.e(TAG, "getDeviceInfo() mHwWatchFaceAdapter is null.");
            return null;
        }
        this.mDeviceInfo = hwWatchFaceAdapter.getDeviceInfo();
        HwLog.i(TAG, "mHwWatchFaceAdapter getDeviceInfo.");
        return this.mDeviceInfo;
    }

    public String getDeviceModel() {
        return Environment.sIsAarInTheme ? HwWatchFaceBtManager.getInstance(this.mContext).getDeviceModel() : getDeviceInfoByKey("device_model");
    }

    public String getDeviceName() {
        return Environment.sIsAarInTheme ? HwWatchFaceBtManager.getInstance(this.mContext).getDeviceName() : getDeviceInfoByKey("device_name");
    }

    public String getDeviceType() {
        String str;
        Object singleAccountInfo = getSingleAccountInfo("deviceType");
        if (singleAccountInfo instanceof String) {
            HwLog.i(TAG, "getDeviceType() deviceTypeObj instanceof String.");
            str = (String) singleAccountInfo;
        } else {
            HwLog.i(TAG, "getDeviceType() deviceTypeObj not instanceof String.");
            str = "";
        }
        HwLog.i(TAG, "getDeviceType() deviceType: " + str);
        return str;
    }

    public String getDeviceTypeNew() {
        if (!CommonUtils.u()) {
            String deviceType = getDeviceType();
            HwLog.i(TAG, "getDeviceTypeNew() !isEmui&SDK>=26.");
            return deviceType;
        }
        String strGenerateDeviceIDWithSeparator = MobileInfoHelper.generateDeviceIDWithSeparator();
        String strSubstring = SafeString.substring(strGenerateDeviceIDWithSeparator, strGenerateDeviceIDWithSeparator.indexOf("=") + 1);
        HwLog.i(TAG, "getDeviceTypeNew() isEmui&SDK>=26.");
        return strSubstring;
    }

    public String getDisableWearInfo() {
        synchronized (this) {
            String json = "";
            HwWatchFaceAdapter hwWatchFaceAdapter = this.mHwWatchFaceAdapter;
            if (hwWatchFaceAdapter == null) {
                HwLog.e(TAG, "getDisableWearInfo() mHwWatchFaceAdapter is null.");
                return "";
            }
            List<Map<String, String>> list = this.mDisableWearInfoList;
            if (list != null) {
                if (list.isEmpty()) {
                    return "";
                }
                return GsonHelper.toJson(this.mDisableWearInfoList);
            }
            List<Map<String, String>> disableWearInfo = hwWatchFaceAdapter.getDisableWearInfo();
            this.mDisableWearInfoList = disableWearInfo;
            if (ArrayUtils.isEmpty(disableWearInfo)) {
                this.mDisableWearInfoList = new CopyOnWriteArrayList();
                HwLog.i(TAG, "getDisableWearInfo DisableWearInfo is null");
            } else {
                json = GsonHelper.toJson(this.mDisableWearInfoList);
            }
            return json;
        }
    }

    public String getGalleryWatchFaceUrl() {
        HwLog.i(TAG, "getWatchFaceUrl() enter");
        return getUrl(getCommonCountryCode(), "");
    }

    public String getHeadUrl() {
        if (this.mHwWatchFaceAdapter != null) {
            return " ";
        }
        HwLog.e(TAG, "getHeadUrl() mHwWatchFaceAdapter is null.");
        return " ";
    }

    public long getInitTime() {
        return this.initTime;
    }

    public String getIsSupportMyWatchface() {
        return getDeviceInfoByKey("isSupportMyWatch");
    }

    public boolean getIsTaskExecuting() {
        HwWatchFaceAdapter hwWatchFaceAdapter = this.mHwWatchFaceAdapter;
        if (hwWatchFaceAdapter != null) {
            return hwWatchFaceAdapter.getIsTaskExecuting();
        }
        HwLog.e(TAG, "getIsTaskExecuting() mHwWatchFaceAdapter is null.");
        return false;
    }

    public String getMagicWatchFaceDetailUrl(String str, String str2, String str3, String str4) {
        HwLog.i(TAG, "getMagicWatchFaceDetailUrl() enter");
        StringBuilder sb = new StringBuilder("#/dial-detail?hitopId=");
        sb.append(str);
        if (!TextUtils.isEmpty(str2)) {
            sb.append(Constants.VERSION);
            sb.append(str2);
        }
        sb.append("&from=");
        sb.append(str3);
        sb.append(URL_SUFFIX_FROM_SUB);
        sb.append(str4);
        return getUrl(getCommonCountryCode(), sb.toString());
    }

    public String getNickName() {
        if (this.mHwWatchFaceAdapter != null) {
            return " ";
        }
        HwLog.e(TAG, "getNickName() mHwWatchFaceAdapter is null.");
        return " ";
    }

    public Integer getNonPersonalizedAdSwitch(String str) {
        Integer num;
        Object singleAccountInfo = getSingleAccountInfo(str);
        String str2 = TAG;
        HwLog.i(str2, "getNonPersonalizedAdSwitch:" + singleAccountInfo);
        Integer num2 = 1;
        if (singleAccountInfo instanceof Integer) {
            HwLog.i(str2, "getNonPersonalizedAdSwitch() nonPersonalizedAdObj instanceof Integer.");
            num = (Integer) singleAccountInfo;
        } else {
            num = num2;
        }
        num2 = num.intValue() == 0 ? num : 1;
        HwLog.i(str2, "getNonPersonalizedAdSwitch type:" + str + ",value:" + num2);
        return num2;
    }

    public int getServerMode() {
        if (this.mHwWatchFaceAdapter == null) {
            HwLog.e(TAG, "getServerMode() mHwWatchFaceAdapter is null.");
            return 1;
        }
        if (isTestVersion()) {
            return 2;
        }
        return (!isOversea() || TextUtils.equals("CN", getCommonCountryCode())) ? 1 : 3;
    }

    public int getSiteId() {
        int iIntValue;
        Object singleAccountInfo = getSingleAccountInfo("siteId");
        if (singleAccountInfo instanceof Integer) {
            HwLog.i(TAG, "getSiteId() siteIdObj instanceof Integer.");
            iIntValue = ((Integer) singleAccountInfo).intValue();
        } else {
            HwLog.i(TAG, "getSiteId() siteIdObj not instanceof Integer.");
            iIntValue = -1;
        }
        FlavorConfig.safeHwLog(TAG, "siteId:" + iIntValue);
        return iIntValue;
    }

    public String getSoftVersion() {
        return Environment.sIsAarInTheme ? HwWatchFaceBtManager.getInstance(this.mContext).getSoftVersion() : getDeviceInfoByKey(PluginPayAdapter.KEY_DEVICE_INFO_SOFT_VERSION);
    }

    public String getToken() {
        if (this.mHwWatchFaceAdapter == null) {
            HwLog.e(TAG, "getToken() mHwWatchFaceAdapter is null.");
            return "";
        }
        String str = TAG;
        HwLog.d(str, "getToken() enter.");
        String strK = c2.a(this.mContext).k();
        if (!TextUtils.isEmpty(strK)) {
            return strK;
        }
        HwLog.e(str, "getToken() token is empty.");
        return "";
    }

    public String getUserId() {
        Object singleAccountInfo = getSingleAccountInfo("uid");
        if (singleAccountInfo instanceof String) {
            HwLog.i(TAG, "getUsetId() userIdObj instanceof String.");
            return (String) singleAccountInfo;
        }
        HwLog.i(TAG, "getUsetId() userIdObj not instanceof String.");
        return "";
    }

    public String getVipCouponsUrl(String str, String str2) {
        HwLog.i(TAG, "getVipCouponsUrl() enter");
        return getUrl(getCommonCountryCode(), "#/member-coupon?from=" + str + URL_SUFFIX_FROM_SUB + str2);
    }

    public String getVipPayUrl(String str, String str2) {
        HwLog.i(TAG, "getVipPayUrl() enter");
        return getUrl(getCommonCountryCode(), "#/member-pay?from=" + str + URL_SUFFIX_FROM_SUB + str2);
    }

    public String getWatchFaceUrl(boolean z) {
        HwLog.i(TAG, "getWatchFaceUrl() enter");
        return getUrl(getCommonCountryCode(), z ? URL_INDEX_SUFFIX : URL_DETAIL_SUFFIX);
    }

    public Map<String, String> getWatchFaceUrlMap(String str) {
        HashMap map = new HashMap();
        try {
            map.put(DEFAULT_WATCHFACE_SITE, WatchFaceHttpUtil.d(str));
            map.put("watchFaceH5", WatchFaceHttpUtil.c(str));
            return map;
        } catch (Exception e) {
            HwLog.e(TAG, "getWatchFaceUrlMap Exception:" + HwLog.printException(e));
            return map;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0032  */
    public String getWatchfacePersonalSwitch() {
        String str;
        Object singleAccountInfo = getSingleAccountInfo("watchfacePersonalSwitch");
        String str2 = TAG;
        HwLog.i(str2, "getWatchfacePersonalSwitch:" + singleAccountInfo);
        if (singleAccountInfo instanceof String) {
            String str3 = (String) singleAccountInfo;
            str = "1";
            if (!"1".equals(str3)) {
                str = "0";
                if (!"0".equals(str3)) {
                    str = "-1";
                }
            }
        } else {
            str = "-1";
        }
        HwLog.i(str2, "getWatchfacePersonalSwitch value:".concat(str));
        return str;
    }

    public String getWatchfaceSiteForAll() {
        if (!isBetaVersion()) {
            return isTestVersion() ? getWatchfaceTestSite(v0.a().a("watchFaceH5", getCommonCountryCode())) : getWatchfaceSite();
        }
        String developerInfo = getDeveloperInfo();
        if (TextUtils.isEmpty(developerInfo) || !developerInfo.equals("1")) {
            return WATCH_FACE_BETA_URL;
        }
        String customAppWatchFaceUrl = getCustomAppWatchFaceUrl();
        if (TextUtils.isEmpty(customAppWatchFaceUrl)) {
            customAppWatchFaceUrl = DEFAULT_WATCHFACE_SITE;
        }
        return "sandbox/cch5/health/" + customAppWatchFaceUrl + "/index.html";
    }

    public void gotoDetailOrMarket(Activity activity, int i) {
        if (CommonUtils.k(activity)) {
            judgeDataShareAuth(activity, i);
        } else {
            HwLog.e(TAG, "gotoDetailOrMarket() context is null.");
        }
    }

    public boolean ifAllowLogin() {
        HwWatchFaceAdapter hwWatchFaceAdapter = this.mHwWatchFaceAdapter;
        if (hwWatchFaceAdapter != null) {
            return hwWatchFaceAdapter.ifAllowLogin();
        }
        HwLog.e(TAG, "ifAllowLogin() mHwWatchFaceAdapter is null.");
        return false;
    }

    public void installApp(String str) {
        if (this.mHwWatchFaceAdapter == null) {
            HwLog.e(TAG, "installApp() mHwWatchFaceAdapter is null.");
        } else if (TextUtils.isEmpty(str)) {
            HwLog.e(TAG, "installApp() packageName is null.");
        } else {
            this.mHwWatchFaceAdapter.installApp(str);
        }
    }

    public boolean isBetaVersion() {
        return isKeyVersion("Beta");
    }

    public boolean isColdStart() {
        return this.isColdStart;
    }

    public boolean isDebugVersion() {
        return isKeyVersion("Debug");
    }

    public boolean isGooglePlayOemDisable() {
        return isKeyVersion("GooglePlayOemDisable");
    }

    public boolean isHmsLiteEnable() {
        HwWatchFaceAdapter hwWatchFaceAdapter = this.mHwWatchFaceAdapter;
        if (hwWatchFaceAdapter != null) {
            return hwWatchFaceAdapter.isHmsLiteEnable(this.mContext);
        }
        HwLog.e(TAG, "isHmsLiteEnable() mHwWatchFaceAdapter is null.");
        return false;
    }

    public boolean isLogin() {
        return -1 != getSiteId();
    }

    public boolean isLoginParamSuitable() {
        return (TextUtils.isEmpty(getUserId()) || TextUtils.equals("0", getUserId()) || TextUtils.isEmpty(getToken()) || TextUtils.isEmpty(getDeviceType())) ? false : true;
    }

    public boolean isOversea() {
        boolean zIsKeyVersion = isKeyVersion("NoCloudVersion");
        HwLog.i(TAG, "isOversea() isOverSea: " + zIsKeyVersion);
        return zIsKeyVersion;
    }

    public boolean isRelease() {
        return isKeyVersion("Release");
    }

    public boolean isSupportedH5TitleBar() {
        HwWatchFaceAdapter hwWatchFaceAdapter = this.mHwWatchFaceAdapter;
        if (hwWatchFaceAdapter == null) {
            HwLog.e(TAG, "isSupportedH5TitleBar() mHwWatchFaceAdapter is null.");
            return false;
        }
        if (hwWatchFaceAdapter instanceof HwWatchFaceExtendAdapter) {
            return ((HwWatchFaceExtendAdapter) hwWatchFaceAdapter).isSupportedH5TitleBar();
        }
        return true;
    }

    public boolean isTestVersion() {
        return isKeyVersion("Test");
    }

    public void jumpOtherUrlActivity(Context context, String str) {
        try {
            String strOptString = new JSONObject(str).optString("url");
            if (TextUtils.isEmpty(strOptString) || !UrlUtil.isValidUrl(strOptString)) {
                return;
            }
            WebViewUtils.a(context, strOptString);
        } catch (JSONException e) {
            HwLog.e(TAG, "jumpOtherUrlActivity error =" + HwLog.printException((Exception) e));
        }
    }

    public void loginByHealthHms(Context context, ILoginCallback iLoginCallback) {
        HwWatchFaceAdapter hwWatchFaceAdapter = this.mHwWatchFaceAdapter;
        if (hwWatchFaceAdapter == null) {
            HwLog.e(TAG, "loginByHealthHms() mHwWatchFaceAdapter is null.");
        } else {
            hwWatchFaceAdapter.loginByHealthHms(context, iLoginCallback);
        }
    }

    public void loginByHealthHmsLite(Context context, IBaseResponseCallback iBaseResponseCallback) {
        HwWatchFaceAdapter hwWatchFaceAdapter = this.mHwWatchFaceAdapter;
        if (hwWatchFaceAdapter == null) {
            HwLog.e(TAG, "loginByHealthHmsLite() mHwWatchFaceAdapter is null.");
        } else {
            hwWatchFaceAdapter.loginByHealthHmsLite(context, iBaseResponseCallback);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    public void openPlugin(Activity activity, String str, String str2) {
        byte b2;
        HwLog.i(TAG, "openPlugin " + str);
        Intent intent = new Intent();
        intent.setFlags(268435456);
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "wearPlugin":
                b2 = 0;
                break;
            case "kaleidoscopePlugin":
                b2 = 1;
                break;
            case "galleryPlugin":
                b2 = 2;
                break;
            case "videoPlugin":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            intent.setClassName(this.mContext.getPackageName(), ComponentInfo.PluginWatchFace_A_4);
        } else if (b2 == 1) {
            intent.setClassName(this.mContext.getPackageName(), ComponentInfo.PluginWatchFace_A_0);
        } else if (b2 == 2) {
            intent.setClassName(this.mContext.getPackageName(), ComponentInfo.PluginWatchFace_A_3);
        } else if (b2 == 3) {
            intent.setClassName(this.mContext.getPackageName(), ComponentInfo.PluginWatchFace_A_1);
        }
        intent.putExtra("url", str2);
        this.mHwWatchFaceAdapter.launchActivity(activity, intent);
    }

    public void printBetaLog(String str, String str2, int i, String str3) {
        HwWatchFaceAdapter hwWatchFaceAdapter = this.mHwWatchFaceAdapter;
        if (hwWatchFaceAdapter == null) {
            d5.a(str, str2, i, str3);
        } else {
            hwWatchFaceAdapter.printLog(str, str2, i, str3);
        }
    }

    public void printLog(String str, String str2, int i, String str3) {
        HwWatchFaceAdapter hwWatchFaceAdapter = this.mHwWatchFaceAdapter;
        if (hwWatchFaceAdapter == null) {
            d5.a(str, str2, i, str3);
        } else if (this.releaseLogSwitches) {
            hwWatchFaceAdapter.printReleaseLog(str, str2, i, str3);
        } else {
            hwWatchFaceAdapter.printLog(str, str2, i, str3);
        }
    }

    public void refreshAccessToken(final RefreshAccessTokenListener refreshAccessTokenListener) {
        if (refreshAccessTokenListener == null) {
            HwLog.e(TAG, "refreshAccessToken() refreshAccessTokenListener is null.");
            return;
        }
        HwWatchFaceAdapter hwWatchFaceAdapter = this.mHwWatchFaceAdapter;
        if (hwWatchFaceAdapter != null) {
            hwWatchFaceAdapter.refreshAccessToken(new ILoginCallback() { // from class: com.huawei.watchface.api.HwWatchFaceApi.2
                @Override // com.huawei.watchface.utils.callback.ILoginCallback
                public void onLoginFailed(Object obj) {
                    refreshAccessTokenListener.onLoginFailed(obj);
                }

                @Override // com.huawei.watchface.utils.callback.ILoginCallback
                public void onLoginSuccess(Object obj) {
                    if (!(obj instanceof String)) {
                        refreshAccessTokenListener.onLoginFailed("AccessToken should be string");
                        return;
                    }
                    String accessToken = (String) obj;
                    if (TextUtils.isEmpty(accessToken)) {
                        accessToken = HwWatchFaceApi.this.mHwWatchFaceAdapter.getAccessToken();
                    }
                    refreshAccessTokenListener.onLoginSuccess(accessToken);
                }
            });
        } else {
            HwLog.e(TAG, "refreshAccessToken() mHwWatchFaceAdapter is null.");
            refreshAccessTokenListener.onLoginFailed("Adapter can not be null");
        }
    }

    public void registerHealthResponseListener(WatchFaceHealthResponseListener watchFaceHealthResponseListener) {
        if (this.mHwWatchFaceAdapter == null) {
            HwLog.e(TAG, "registerHealthResponseListener() mHwWatchFaceAdapter is null.");
        } else {
            HwLog.i(TAG, "registerHealthResponseListener() enter.");
            this.mHwWatchFaceAdapter.registerHealthResponseListener(watchFaceHealthResponseListener);
        }
    }

    public void registerPhotoAndVideoCallback(IAppTransferFileResultAIDLCallback iAppTransferFileResultAIDLCallback, List<Integer> list, TransferFileReqType transferFileReqType) {
        if (this.mHwWatchFaceAdapter == null) {
            HwLog.e(TAG, "registerPhotoAndVideoCallback() mHwWatchFaceAdapter is null.");
            return;
        }
        TransFileInfo transFileInfo = new TransFileInfo();
        transFileInfo.setRequestType(transferFileReqType);
        transFileInfo.setAttentionTypes(list);
        this.mHwWatchFaceAdapter.commonTransferFile(TransferBusiType.FIVE_FORTY, transFileInfo, iAppTransferFileResultAIDLCallback);
    }

    public void reportInterceptedCrash(Throwable th, Boolean bool) {
        h0 h0Var = this.crashReport;
        if (h0Var != null) {
            h0Var.a(th, bool);
        }
    }

    public String requestSign() {
        if (this.mHwWatchFaceAdapter != null) {
            return " ";
        }
        HwLog.e(TAG, "requestSign() mHwWatchFaceAdapter is null.");
        return " ";
    }

    public void sendBluetoothCommand(int i, int i2, ByteBuffer byteBuffer) {
        HwWatchFaceAdapter hwWatchFaceAdapter = this.mHwWatchFaceAdapter;
        if (hwWatchFaceAdapter == null) {
            HwLog.e(TAG, "sendBluetoothCommand() mHwWatchFaceAdapter is null.");
        } else {
            hwWatchFaceAdapter.sendBluetoothCommand(i, i2, byteBuffer);
        }
    }

    public void sendLocalBroadcast(Intent intent) {
        if (this.mHwWatchFaceAdapter == null) {
            HwLog.e(TAG, "sendLocalBroadcast() mHwWatchFaceAdapter is null.");
        } else {
            HwLog.i(TAG, "sendLocalBroadcast enter");
            this.mHwWatchFaceAdapter.sendLocalBroadcast(intent);
        }
    }

    public void setAccountInfoMap(Map<String, Object> map) {
        this.mAccountInfoMap = map;
    }

    @Override // com.huawei.watchface.api.PluginBase
    public void setAdapter(PluginBaseAdapter pluginBaseAdapter) {
        super.setAdapter(pluginBaseAdapter);
        if (pluginBaseAdapter instanceof HwWatchFaceAdapter) {
            this.initTime = System.currentTimeMillis();
            this.mHwWatchFaceAdapter = (HwWatchFaceAdapter) pluginBaseAdapter;
            clearCountryCode();
            getInstance(this.mContext).setDeviceInfo(null);
            getInstance(this.mContext).setAccountInfoMap(null);
            HwWatchFaceManager.getInstance(this.mContext).init();
            c2.a(this.mContext).d(false);
            initOperationAdapter(this.mContext);
            updatePinnedShortcutUrl("watchface_supermarket", DensityUtil.getStringById(R.string.dial_market_new));
        }
        HwWatchFaceAdapter hwWatchFaceAdapter = this.mHwWatchFaceAdapter;
        if (hwWatchFaceAdapter != null) {
            hwWatchFaceAdapter.initFullSdkGrs();
            initSDK();
            JsSafeUrlSystemParamManager.getInstance().d();
        }
    }

    public void setColdStart(boolean z) {
        this.isColdStart = z;
    }

    public void setConnectStatus(Integer num) {
        this.connectStatus = num;
    }

    public void setDeviceInfo(Map<String, String> map) {
        this.mDeviceInfo = map;
    }

    public void setDisableWearInfoList(List<Map<String, String>> list) {
        this.mDisableWearInfoList = list;
    }

    public void setInitTime(long j) {
        this.initTime = j;
    }

    public void setReleaseLogSwitches(boolean z) {
        HwLog.i(TAG, "setReleaseLogSwitches:" + z);
        this.releaseLogSwitches = z;
    }

    public void shareLink(String str) {
        HwWatchFaceAdapter hwWatchFaceAdapter = this.mHwWatchFaceAdapter;
        if (hwWatchFaceAdapter == null) {
            HwLog.e(TAG, "shareLink() mHwWatchFaceAdapter is null.");
        } else {
            hwWatchFaceAdapter.shareLink(str);
        }
    }

    public void showHealthAppSettingGuide(Context context, String str) {
        if (this.mHwWatchFaceAdapter == null) {
            HwLog.e(TAG, "showHealthAppSettingGuide() mHwWatchFaceAdapter is null.");
            return;
        }
        HwLog.i(TAG, "showHealthAppSettingGuide permission:" + str);
        this.mHwWatchFaceAdapter.showHealthAppSettingGuide(context, str, null, null);
    }

    public void startRequestFile(String str, int i, boolean z, IPhotoFileCallback iPhotoFileCallback) {
        HwWatchFaceAdapter hwWatchFaceAdapter = this.mHwWatchFaceAdapter;
        if (hwWatchFaceAdapter == null) {
            HwLog.e(TAG, "startRequestFile() mHwWatchFaceAdapter is null.");
        } else {
            hwWatchFaceAdapter.startRequestFile(str, i, z, iPhotoFileCallback);
        }
    }

    public void unRegisterHealthResponseListener() {
        if (this.mHwWatchFaceAdapter == null) {
            HwLog.e(TAG, "unRegisterHealthResponseListener() mHwWatchFaceAdapter is null.");
        } else {
            HwLog.i(TAG, "unRegisterHealthResponseListener() enter.");
            this.mHwWatchFaceAdapter.unRegisterHealthResponseListener();
        }
    }

    public void updateInstallAppState(int i) {
        if (this.mHwWatchFaceAdapter == null) {
            HwLog.e(TAG, "updateInstallAppState() mHwWatchFaceAdapter is null.");
            return;
        }
        HwLog.i(TAG, "updateInstallAppState() state:" + i);
    }

    public boolean updatePinnedShortcut(String str, String str2, IconCompat iconCompat) {
        PendingIntent service;
        String str3 = TAG;
        HwLog.i(str3, "updatePinnedShortcut() enter");
        if (!ShortcutManagerCompat.isRequestPinShortcutSupported(this.mContext)) {
            HwLog.e(str3, "updatePinnedShortcut not support");
            return false;
        }
        ShortcutManager shortcutManager = (ShortcutManager) this.mContext.getSystemService(ShortcutManager.class);
        ShortcutInfo existShortCut = getExistShortCut(str);
        if (shortcutManager == null || existShortCut == null) {
            HwLog.e(str3, "mShortcutManager is null or existShortCutInfo is null");
            return false;
        }
        ShortcutInfoCompat shortcutInfoCompatBuild = new ShortcutInfoCompat.Builder(this.mContext, str).setIcon(iconCompat).setShortLabel(str2).setIntent(existShortCut.getIntent()).build();
        try {
            service = PendingIntent.getService(this.mContext, 0, new Intent(this.mContext, (Class<?>) ShortCutService.class), CommonUtils.n() ? 167772160 : 134217728);
        } catch (Exception unused) {
            HwLog.e(TAG, "get successCallback error");
            service = null;
        }
        if (service == null) {
            HwLog.e(TAG, "successCallback is null");
            return false;
        }
        if (!isExistShortCut(str)) {
            return false;
        }
        HwLog.i(TAG, "updatePinnedShortcut success ");
        shortcutManager.enableShortcuts(Collections.singletonList(str));
        shortcutManager.updateShortcuts(Collections.singletonList(shortcutInfoCompatBuild.toShortcutInfo()));
        return true;
    }

    public void updatePinnedShortcutUrl(String str, String str2) {
        PendingIntent service;
        if (e4.d(IS_UPDATE_PINNED_SHORTCUT_URL)) {
            HwLog.i(TAG, "updatePinnedShortcutUrl is true");
            return;
        }
        e4.b(IS_UPDATE_PINNED_SHORTCUT_URL, true);
        if (!getInstance(this.mContext).isExistShortCut(str)) {
            HwLog.i(TAG, "updatePinnedShortcutUrl isExistShortCut false");
            return;
        }
        if (!ShortcutManagerCompat.isRequestPinShortcutSupported(this.mContext)) {
            HwLog.e(TAG, "updatePinnedShortcutUrl not support");
            return;
        }
        ShortcutManager shortcutManager = (ShortcutManager) this.mContext.getSystemService(ShortcutManager.class);
        Intent intent = new Intent();
        String str3 = getInstance(this.mContext).getWatchFaceUrl(true) + URL_FROM_SHORTCUTSE;
        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setClassName(this.mContext.getPackageName(), "com.huawei.health.browseraction.HwHealthBrowserActionActivity");
        intent.setData(Uri.parse("huaweihealth://huaweihealth.app/openwith?type=aar&isNeedLogin=true&address=" + str3));
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        if (shortcutManager == null) {
            HwLog.e(TAG, "updatePinnedShortcutUrl is null or existShortCutInfo is null");
            return;
        }
        ShortcutInfoCompat shortcutInfoCompatBuild = new ShortcutInfoCompat.Builder(this.mContext, str).setIcon(IconCompat.createWithResource(this.mContext, R.drawable.watchface_ic_shortcut)).setShortLabel(str2).setIntent(intent).build();
        try {
            service = PendingIntent.getService(this.mContext, 0, new Intent(this.mContext, (Class<?>) ShortCutService.class), CommonUtils.n() ? 167772160 : 134217728);
        } catch (Exception unused) {
            HwLog.e(TAG, "get successCallback error");
            service = null;
        }
        if (service == null || !isExistShortCut(str)) {
            HwLog.e(TAG, "successCallback is null");
            return;
        }
        HwLog.i(TAG, "updatePinnedShortcutUrl success ");
        shortcutManager.enableShortcuts(Collections.singletonList(str));
        shortcutManager.updateShortcuts(Collections.singletonList(shortcutInfoCompatBuild.toShortcutInfo()));
    }

    private String getDisableWearInfoByKey(String str) {
        String disableWearInfo = getDisableWearInfo();
        if (TextUtils.isEmpty(disableWearInfo)) {
            return "";
        }
        List<Map> list = (List) GsonHelper.fromJson(disableWearInfo, new TypeToken<List<Map<String, String>>>(this) { // from class: com.huawei.watchface.api.HwWatchFaceApi.3
        }.getType());
        if (ArrayUtils.isEmpty(list)) {
            return "";
        }
        for (Map map : list) {
            if (map.containsKey(str)) {
                return (String) map.get(str);
            }
        }
        return "";
    }

    @Override // com.huawei.watchface.api.PluginBase
    public HwWatchFaceAdapter getAdapter() {
        return this.mHwWatchFaceAdapter;
    }

    public boolean isExistShortCut(String str) {
        List<ShortcutInfo> pinnedShortcuts = ((ShortcutManager) this.mContext.getSystemService(ShortcutManager.class)).getPinnedShortcuts();
        if (pinnedShortcuts == null) {
            return false;
        }
        for (ShortcutInfo shortcutInfo : pinnedShortcuts) {
            if (shortcutInfo != null && !TextUtils.isEmpty(shortcutInfo.getId()) && shortcutInfo.getId().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public String getWatchfaceReleaseSite(String str) {
        if (str == null) {
            return null;
        }
        String strB = JsSafeUrlSystemParamManager.getInstance().b();
        if (TextUtils.isEmpty(strB)) {
            String str2 = TAG;
            HwLog.i(str2, "getWatchfaceReleaseSite greyWatchface is null");
            if (!getInstance(this.mContext).isRelease()) {
                return str;
            }
            String watchFaceLoadUrl = getWatchFaceLoadUrl(str, com.huawei.operation.utils.Constants.H5_URL_BASE_PATH_RELEASE, DEFAULT_WATCHFACE_SITE);
            HwLog.i(str2, "getWatchfaceReleaseSite isRelease watchfaceSite");
            FlavorConfig.safeHwLog(str2, "getWatchfaceReleaseSite isRelease watchfaceSite:" + watchFaceLoadUrl);
            return watchFaceLoadUrl;
        }
        String watchFaceLoadUrl2 = getWatchFaceLoadUrl(str, com.huawei.operation.utils.Constants.H5_URL_BASE_PATH_BETA, strB);
        String str3 = TAG;
        HwLog.i(str3, "getWatchfaceReleaseSite watchfaceSite end");
        FlavorConfig.safeHwLog(str3, "getWatchfaceReleaseSite watchfaceSite:" + watchFaceLoadUrl2);
        return watchFaceLoadUrl2;
    }

    public String getWatchfaceTestSite(String str) {
        String developerInfo = getDeveloperInfo();
        String customAppWatchFaceUrl = getCustomAppWatchFaceUrl();
        String str2 = TAG;
        HwLog.i(str2, "getWatchfaceTestSite() developer: " + developerInfo);
        HwLog.i(str2, "getWatchfaceTestSite() appWatchFace:" + customAppWatchFaceUrl);
        if (TextUtils.equals(developerInfo, "1") && !TextUtils.isEmpty(customAppWatchFaceUrl)) {
            return str.replaceFirst("\\/sandbox\\/cch5\\/health\\/[^\\/]+\\/", com.huawei.operation.utils.Constants.H5_URL_BASE_PATH_BETA + customAppWatchFaceUrl + "/");
        }
        String strB = JsSafeUrlSystemParamManager.getInstance().b();
        if (!TextUtils.isEmpty(strB)) {
            str = str.replaceFirst("\\/sandbox\\/cch5\\/health\\/[^\\/]+\\/", com.huawei.operation.utils.Constants.H5_URL_BASE_PATH_BETA + strB + "/");
        }
        HwLog.i(str2, "getWatchfaceTestSite watchfaceSite:" + str);
        return str;
    }

    public ShortcutInfo getExistShortCut(String str) {
        List<ShortcutInfo> pinnedShortcuts = ((ShortcutManager) this.mContext.getSystemService(ShortcutManager.class)).getPinnedShortcuts();
        if (pinnedShortcuts == null) {
            HwLog.i(TAG, "getExistShortCut pinnedShortcuts is null");
            return null;
        }
        for (ShortcutInfo shortcutInfo : pinnedShortcuts) {
            if (shortcutInfo != null && !TextUtils.isEmpty(shortcutInfo.getId()) && shortcutInfo.getId().equals(str)) {
                return shortcutInfo;
            }
        }
        return null;
    }

    public String getWatchfaceSite() {
        String strB = JsSafeUrlSystemParamManager.getInstance().b();
        if (TextUtils.isEmpty(strB)) {
            return URL_END_SUFFIX;
        }
        String strReplace = SafeString.replace(WATCH_FACE_BETA_URL, DEFAULT_WATCHFACE_SITE, strB);
        HwLog.i(TAG, "getWatchfaceSite replace greyWatchface:" + strB);
        return strReplace;
    }

    public void showHealthAppSettingGuide(Context context, String str, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        if (this.mHwWatchFaceAdapter == null) {
            HwLog.e(TAG, "showHealthAppSettingGuide() mHwWatchFaceAdapter is null.");
            return;
        }
        HwLog.i(TAG, "showHealthAppSettingGuide permission:" + str);
        this.mHwWatchFaceAdapter.showHealthAppSettingGuide(context, str, onClickListener, onClickListener2);
    }

    public String getDeviceIdAsTheme(boolean z) {
        if (z) {
            String strB = k5.b(f5.b("device_id_phone"), "savePw");
            if (!TextUtils.isEmpty(strB) && (!strB.matches("^\\d{15}$") || !CommonUtils.u())) {
                return strB;
            }
            String deviceIdAsTheme = getDeviceIdAsTheme();
            f5.b("device_id_phone", k5.c(deviceIdAsTheme, "savePw"));
            return deviceIdAsTheme;
        }
        return getDeviceIdAsTheme();
    }

    public String getDeviceIdForH5(boolean z) {
        if (z) {
            String strB = k5.b(f5.b("phone_device_id_h5"), "savePw");
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
            String deviceIdForH5 = getDeviceIdForH5();
            f5.b("phone_device_id_h5", k5.c(deviceIdForH5, "savePw"));
            return deviceIdForH5;
        }
        return getDeviceIdForH5();
    }
}
