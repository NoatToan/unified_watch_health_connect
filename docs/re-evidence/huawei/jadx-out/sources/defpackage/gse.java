package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.main.api.CloudAuthApi;
import com.huawei.health.main.model.AppLangItem;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealthservice.HiHealthKitApi;
import com.huawei.hwauthutil.HsfSignValidator;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class gse {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    public static LinkedHashMap<String, Object> c(String[] strArr) {
        byte b2;
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>(strArr.length);
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("SingleMotionDetectionUtil", "has empty name");
            } else {
                str.hashCode();
                switch (str) {
                    case "detection_has_bind_app":
                        b2 = 0;
                        break;
                    case "detection_has_unsync_data":
                        b2 = 1;
                        break;
                    case "detection_sport_data_switch":
                        b2 = 2;
                        break;
                    case "detection_at_valid":
                        b2 = 3;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    ArrayList<String> arrayListA = a();
                    ArrayList<String> arrayListE = e();
                    JSONArray jSONArray = new JSONArray();
                    Iterator<String> it = arrayListA.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next());
                    }
                    Iterator<String> it2 = arrayListE.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next());
                    }
                    LogUtil.a("SingleMotionDetectionUtil", "apps:", jSONArray.toString());
                    linkedHashMap.put("detection_has_bind_app", jSONArray);
                } else if (b2 == 1) {
                    boolean zHasUnSyncSportData = ((HiHealthKitApi) Services.b("HealthKit", HiHealthKitApi.class)).hasUnSyncSportData();
                    LogUtil.a("SingleMotionDetectionUtil", "hasUnSyncSportData = ", Boolean.valueOf(zHasUnSyncSportData));
                    linkedHashMap.put("detection_has_unsync_data", Boolean.valueOf(zHasUnSyncSportData));
                } else if (b2 == 2) {
                    ioi ioiVarD = ioi.d();
                    String strC = ioiVarD.c(2);
                    String strC2 = ioiVarD.c(3);
                    String strC3 = ioiVarD.c(7);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("person", "true".equals(strC) ? 1 : 0);
                        jSONObject.put("sport", "true".equals(strC2) ? 1 : 0);
                        jSONObject.put("health", "true".equals(strC3) ? 1 : 0);
                    } catch (JSONException unused) {
                        LogUtil.e("SingleMotionDetectionUtil", "jsonException");
                    }
                    LogUtil.a("SingleMotionDetectionUtil", "object:", jSONObject.toString());
                    linkedHashMap.put("detection_sport_data_switch", jSONObject);
                } else if (b2 == 3) {
                    boolean z = CommonUtil.i(LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1016)) - System.currentTimeMillis() > 0;
                    LogUtil.a("SingleMotionDetectionUtil", "isAtValid:", Boolean.valueOf(z));
                    linkedHashMap.put("detection_at_valid", Boolean.valueOf(z));
                }
            }
        }
        return linkedHashMap;
    }

    private static ArrayList<String> e() {
        CloudAuthApi cloudAuthApi = (CloudAuthApi) Services.b("Main", CloudAuthApi.class);
        String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1015);
        cloudAuthApi.constructInstance(BaseApplication.b(), accountInfo);
        LogUtil.d("SingleMotionDetectionUtil", "Get UserAt : ", accountInfo);
        String lang = cloudAuthApi.getLang();
        LogUtil.d("SingleMotionDetectionUtil", "getUserId: ", LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011));
        String appLangItemUrl = cloudAuthApi.getAppLangItemUrl(lang, "2");
        LogUtil.a("SingleMotionDetectionUtil", "Get appLangItemUrl : ", appLangItemUrl);
        List<AppLangItem> appLangItem = cloudAuthApi.getAppLangItem(accountInfo, "GET", appLangItemUrl);
        List<AppLangItem> appLangItem2 = cloudAuthApi.getAppLangItem(accountInfo, "GET", cloudAuthApi.getAppLangItemUrl(lang, "3"));
        if (appLangItem2 != null) {
            LogUtil.a("SingleMotionDetectionUtil", "healthAccountAppInfoList length: ", Integer.valueOf(appLangItem2.size()));
            appLangItem = a(appLangItem, appLangItem2);
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (njy.b(appLangItem)) {
            Iterator<AppLangItem> it = appLangItem.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAppName());
            }
        }
        return arrayList;
    }

    private static List<AppLangItem> a(List<AppLangItem> list, List<AppLangItem> list2) {
        if (njy.e(list)) {
            return list2;
        }
        for (AppLangItem appLangItem : list2) {
            Iterator<AppLangItem> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    list.add(appLangItem);
                    break;
                }
            } while (!it.next().getAppId().equals(appLangItem.getAppId()));
        }
        return list;
    }

    private static ArrayList<String> a() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final ArrayList<String> arrayList = new ArrayList<>();
        HiHealthNativeApi.a(BaseApplication.b()).queryKitAppInfo(new HiDataOperateListener() { // from class: gsg
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                gse.a(countDownLatch, arrayList, i, obj);
            }
        });
        try {
            LogUtil.a("SingleMotionDetectionUtil", "getLocalThirdPartyAppInfo countReachedZero: ", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
            return arrayList;
        } catch (InterruptedException unused) {
            LogUtil.e("SingleMotionDetectionUtil", "getLocalThirdPartyAppInfo interruptedException");
            return arrayList;
        }
    }

    static /* synthetic */ void a(CountDownLatch countDownLatch, ArrayList arrayList, int i, Object obj) {
        if (!(obj instanceof List)) {
            LogUtil.j("SingleMotionDetectionUtil", "getLocalThirdPartyAppInfo onResult data not list");
            countDownLatch.countDown();
            return;
        }
        List list = (List) obj;
        if (njy.e(list)) {
            LogUtil.j("SingleMotionDetectionUtil", "getLocalThirdPartyAppInfo onResult tempAppInfoList empty");
            countDownLatch.countDown();
            return;
        }
        boolean zB = b(Constants.FAST_APP_PKG);
        for (Object obj2 : list) {
            if (obj2 instanceof HiAppInfo) {
                HiAppInfo hiAppInfo = (HiAppInfo) obj2;
                if (b(hiAppInfo.getPackageName()) && d(BaseApplication.b(), hiAppInfo)) {
                    arrayList.add(hiAppInfo.getAppName());
                }
                if (zB && hiAppInfo.getAppName() != null && hiAppInfo.getAppName().startsWith("QuickApp_")) {
                    arrayList.add(hiAppInfo.getAppName());
                }
            }
        }
        countDownLatch.countDown();
    }

    private static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            BaseApplication.b().getPackageManager().getApplicationInfo(str, 8192);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.a("SingleMotionDetectionUtil", "checkApkExist NameNotFoundException");
            return false;
        }
    }

    private static boolean d(Context context, HiAppInfo hiAppInfo) {
        if (hiAppInfo == null) {
            LogUtil.j("SingleMotionDetectionUtil", "checkApkValid() hiAppInfo is null");
            return false;
        }
        String packageName = hiAppInfo.getPackageName();
        String signature = hiAppInfo.getSignature();
        if (TextUtils.isEmpty(packageName) || TextUtils.isEmpty(signature)) {
            LogUtil.j("SingleMotionDetectionUtil", "checkApkValid() packageName or signature is null");
            return false;
        }
        try {
            return HsfSignValidator.a(context, packageName).equals(ljo.c(signature)) && ljo.a(signature) == context.getPackageManager().getApplicationInfo(packageName, 0).uid;
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("SingleMotionDetectionUtil", "checkApkValid() NameNotFoundException");
            return false;
        }
    }
}
