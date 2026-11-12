package com.huawei.health.ecologydevice.manager;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.huawei.common.util.Utils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.ecologydevice.fitness.datastruct.SettingStatusData;
import com.huawei.health.ecologydevice.networkclient.AuthorizationData;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.ecologydevice.networkclient.OnRequestCallBack;
import com.huawei.health.ecologydevice.open.data.model.CommonUiResponse;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProAppLoader;
import com.huawei.health.h5pro.webkit.QuickPackageManager;
import com.huawei.health.main.api.CloudAuthApi;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hms.hihealth.data.Scopes;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.AchieveDataApi;
import defpackage.dmz;
import defpackage.elh;
import defpackage.emh;
import defpackage.emr;
import defpackage.era;
import defpackage.etn;
import defpackage.fwp;
import defpackage.iov;
import defpackage.njy;
import defpackage.osc;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class RopeCloudAuthManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f6556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f6557b;
    private DonwHkpListen d;
    private String f;
    private String h;
    private HashMap<Integer, a> i;
    private int[] j;
    private String e = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6558c = false;

    public interface DonwHkpListen {
        void downHpkSuccessReSend();
    }

    public RopeCloudAuthManager(Context context, String str, String str2) {
        HashMap<Integer, a> map = new HashMap<>();
        this.i = map;
        this.f6556a = context;
        this.f = str;
        this.h = str2;
        map.put(1, new a(1));
        this.i.put(2, new a(2));
    }

    public void e() {
        this.e = "";
        this.d = null;
    }

    public String a(String str, DonwHkpListen donwHkpListen) {
        LogUtil.a("RopeCloudAuthManager", "downLoadHpk");
        if (!"true".equals(era.a("isSupportWeight", str))) {
            LogUtil.a("RopeCloudAuthManager", "device isSupportWeight is false");
            return this.e;
        }
        if (!TextUtils.isEmpty(this.e)) {
            this.f6558c = true;
            return this.e;
        }
        this.d = donwHkpListen;
        final QuickPackageManager quickPackageManager = new QuickPackageManager(this.f6556a);
        final String str2 = "com.huawei.health.device." + str;
        quickPackageManager.installApp(str2, new H5ProAppLoader.H5ProPreloadCbk() { // from class: com.huawei.health.ecologydevice.manager.RopeCloudAuthManager.3
            @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader.H5ProPreloadCbk
            public void onSuccess() {
                LogUtil.a("RopeCloudAuthManager", "download hpk success");
                RopeCloudAuthManager.this.e(quickPackageManager.getAppInfo(str2));
            }

            @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader.H5ProPreloadCbk
            public void onFailure(int i, String str3) {
                LogUtil.e("RopeCloudAuthManager", "download hpk fail ", str3);
            }
        });
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(H5ProAppInfo h5ProAppInfo) {
        DonwHkpListen donwHkpListen;
        if (h5ProAppInfo == null) {
            LogUtil.j("RopeCloudAuthManager", "downHpkSuccess h5ProAppInfo is null");
            return;
        }
        this.e = h5ProAppInfo.getAppId();
        if (!this.f6558c || (donwHkpListen = this.d) == null) {
            return;
        }
        this.f6558c = false;
        donwHkpListen.downHpkSuccessReSend();
    }

    public void d() {
        a(false, true);
    }

    public void c(boolean z) {
        if (TextUtils.isEmpty(this.e)) {
            LogUtil.j("RopeCloudAuthManager", "getUserInfoFromRope mAppId is null");
            this.f6558c = true;
            return;
        }
        boolean zC = c(this.e);
        LogUtil.a("RopeCloudAuthManager", "onDeviceStateChanged isConnected:", Boolean.valueOf(z), " mIsUseDenyAuthorization:", Boolean.valueOf(zC));
        if (z && zC) {
            a();
        }
    }

    private void a() {
        if (era.j(this.f)) {
            emh.b().b(2, 0, new int[]{GlMapUtil.DEVICE_DISPLAY_DPI_HIGH});
        } else {
            emh.b().b(2, 0, new int[]{256});
        }
    }

    public void c(boolean z, SettingStatusData settingStatusData) {
        if (settingStatusData == null) {
            LogUtil.a("RopeCloudAuthManager", "settingStatusData is null; isConnect = ", Boolean.valueOf(z));
            if (z) {
                a();
                return;
            } else {
                a(false, false);
                return;
            }
        }
        c(settingStatusData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final boolean z, final boolean z2) {
        if (TextUtils.isEmpty(a(this.f, this.d))) {
            LogUtil.a("RopeCloudAuthManager", "appId is null");
            this.f6558c = true;
            return;
        }
        final CloudAuthApi cloudAuthApi = (CloudAuthApi) Services.b("Main", CloudAuthApi.class);
        final String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1015);
        cloudAuthApi.constructInstance(this.f6556a, accountInfo);
        final String scopeLangItemUrl = cloudAuthApi.getScopeLangItemUrl(this.e, cloudAuthApi.getLang());
        LogUtil.a("RopeCloudAuthManager", "Get cloudAuthApi in ThirdPartServiceActivity: ", scopeLangItemUrl);
        ThreadPoolManager.c().execute(new Runnable() { // from class: emb
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c(cloudAuthApi, accountInfo, scopeLangItemUrl, z, z2);
            }
        });
    }

    public /* synthetic */ void c(CloudAuthApi cloudAuthApi, String str, String str2, boolean z, boolean z2) {
        fwp scopeLangItem = cloudAuthApi.getScopeLangItem(str, "GET", str2);
        if (scopeLangItem == null || scopeLangItem.j() == null) {
            LogUtil.j("RopeCloudAuthManager", "scopeLangItem get null.");
            c(z, z2, false);
            return;
        }
        Map<String, String> mapJ = scopeLangItem.j();
        LogUtil.a("RopeCloudAuthManager", "getScopeLangItem scopeLangItem:", scopeLangItem);
        Set<String> setKeySet = mapJ.keySet();
        this.i.get(1).c(setKeySet.contains(Scopes.HEALTHKIT_HEIGHTWEIGHT_READ));
        LogUtil.a("RopeCloudAuthManager", "HEIGHT_WEIGHT_READ_SEND_TYPE HasPermission: ", Boolean.valueOf(setKeySet.contains(Scopes.HEALTHKIT_HEIGHTWEIGHT_READ)));
        ((a) Objects.requireNonNull(this.i.get(2))).c(setKeySet.contains(Scopes.HEALTHKIT_EXTEND_SPORT_READ));
        LogUtil.a("RopeCloudAuthManager", "HEALTHKIT_EXTEND_SPORT_READ HasPermission: ", Boolean.valueOf(setKeySet.contains(Scopes.HEALTHKIT_EXTEND_SPORT_READ)));
        c(z, z2, this.i.get(1).d() || this.i.get(2).d());
    }

    private void a(final boolean z, final boolean z2) {
        ReleaseLogUtil.d("DEVMGR_RopeCloudAuthManager", "checkAuthorization");
        if (TextUtils.isEmpty(a(this.f, this.d))) {
            ReleaseLogUtil.d("DEVMGR_RopeCloudAuthManager", "appId is null");
            this.f6558c = true;
            return;
        }
        HashMap map = new HashMap(10);
        map.put("nsp_svc", "nsp.scope.app.get");
        map.put("nsp_fmt", "json");
        map.put("appid", this.e);
        map.put("type", "2");
        String url = Utils.getUrl("com.huawei.health", "domainScopeOauth");
        ReleaseLogUtil.d("DEVMGR_RopeCloudAuthManager", "appId:", this.e);
        new HealthEngineRequestManager.RequestParamsBuilder().setTag("RopeCloudAuthManager").setUrl(url).setQueryParams(map).setHeaderParam(new HashMap(10)).setMethod("GET").setRequestCallBack(new OnRequestCallBack<AuthorizationData>() { // from class: com.huawei.health.ecologydevice.manager.RopeCloudAuthManager.2
            @Override // com.huawei.health.ecologydevice.networkclient.OnRequestCallBack
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(AuthorizationData authorizationData) {
                if (RopeCloudAuthManager.this.e(authorizationData.getScopes())) {
                    RopeCloudAuthManager.this.d(z, z2);
                } else {
                    LogUtil.a("RopeCloudAuthManager", "The user does not apply for permission.");
                }
            }

            @Override // com.huawei.health.ecologydevice.networkclient.OnRequestCallBack
            public void onFail(int i, Throwable th) {
                ReleaseLogUtil.a("DEVMGR_RopeCloudAuthManager", "checkAuthorization fail:", Integer.valueOf(i));
            }
        }).create().request();
    }

    public void c(SettingStatusData settingStatusData) {
        if (era.j(this.f)) {
            e(settingStatusData);
        }
        b(settingStatusData);
    }

    public void b(final SettingStatusData settingStatusData) {
        LogUtil.a("RopeCloudAuthManager", "getUserInfoFromApp");
        if (this.f6556a == null || settingStatusData == null) {
            LogUtil.j("RopeCloudAuthManager", "contrastCalorieInfoForApp mainActivity or mRopeDeviceDataManager is null");
        } else {
            emr.d().c(this.f6556a, new CommonUiResponse() { // from class: ema
                @Override // com.huawei.health.ecologydevice.open.data.model.CommonUiResponse
                public final void onResponse(int i, Object obj) {
                    this.f33166a.e(settingStatusData, i, (HiUserInfo) obj);
                }
            });
        }
    }

    public /* synthetic */ void e(SettingStatusData settingStatusData, int i, HiUserInfo hiUserInfo) {
        int weight = (int) (hiUserInfo.getWeight() * 10.0f);
        int height = hiUserInfo.getHeight();
        LogUtil.a("RopeCloudAuthManager", "weight is same ", Boolean.valueOf(weight == settingStatusData.getWeight()), " height is same ", Boolean.valueOf(height == settingStatusData.getHeight()));
        boolean z = weight == settingStatusData.getWeight() && height == settingStatusData.getHeight();
        boolean z2 = settingStatusData.getHeight() == 255 || settingStatusData.getWeight() == 65535;
        boolean z3 = (z2 || z) ? false : true;
        boolean zF = f(this.f);
        LogUtil.a("RopeCloudAuthManager", "isSame = ", Boolean.valueOf(z), " isErrorValue ", Boolean.valueOf(z2), " isFirst ", Boolean.valueOf(zF));
        this.j = new int[]{weight, height, 255};
        this.i.get(1).d(z3);
        LogUtil.a("RopeCloudAuthManager", "isSend HEIGHT_WEIGHT_READ_SEND_TYPE: ", Boolean.valueOf(this.i.get(1).e()), " isSend SPORT_READ_SEND_TYPE: ", Boolean.valueOf(this.i.get(2).e()));
        if (zF) {
            a(true, false);
            return;
        }
        if (z2) {
            LogUtil.a("RopeCloudAuthManager", "Data exception");
        } else if (this.i.get(1).e() || this.i.get(2).e()) {
            a(true, false);
        }
    }

    public static void a(String str) {
        b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(List<AuthorizationData.Scopes> list) {
        boolean z = false;
        if (njy.e(list)) {
            return false;
        }
        this.i.get(1).c(false);
        this.i.get(2).a(false);
        for (AuthorizationData.Scopes scopes : list) {
            if (Scopes.HEALTHKIT_HEIGHTWEIGHT_READ.equals(scopes.getUri())) {
                LogUtil.a("RopeCloudAuthManager", "checkScopeUrl Has HEALTH_KIT_HEIGHT_WEIGHT_READ_SCOPE_URL");
                this.i.get(1).a(true);
                z = true;
            }
            if (Scopes.HEALTHKIT_EXTEND_SPORT_READ.equals(scopes.getUri())) {
                LogUtil.a("RopeCloudAuthManager", "checkScopeUrl Has HEALTHKIT_EXTEND_SPORT_READ");
                this.i.get(2).a(true);
                z = true;
            }
        }
        return z;
    }

    private void c(boolean z, boolean z2, boolean z3) {
        LogUtil.a("RopeCloudAuthManager", "isNeedUpdate = ", Boolean.valueOf(z), " isAuthorization = ", Boolean.valueOf(z3), " getRejectSignInStatus() = ", Boolean.valueOf(c(this.e)), " isSelectFunction = ", Boolean.valueOf(z2));
        d(this.f);
        if (z2) {
            b(z3, this.f, this.h);
            return;
        }
        if (!c(this.e) && !z3) {
            LogUtil.a("RopeCloudAuthManager", "User Deny Authorization");
            return;
        }
        if (!z3) {
            etn.c(this.f6556a, this.f, this.h, "#/?type=signInPage");
            b(this.e);
            return;
        }
        h(this.e);
        if (z) {
            if (b(1)) {
                LogUtil.a("RopeCloudAuthManager", "SendDevice UserInfo");
                a(9, b());
            }
            if (b(2)) {
                LogUtil.a("RopeCloudAuthManager", "SendDevice Achievements");
                a(7, this.f6557b);
            }
        }
    }

    private boolean b(int i) {
        LogUtil.a("RopeCloudAuthManager", "isSendDeviceData TYPE:", Integer.valueOf(i), " isNeedSend: ", Boolean.valueOf(((a) Objects.requireNonNull(this.i.get(Integer.valueOf(i)))).e()), " isHasPermission:", Boolean.valueOf(((a) Objects.requireNonNull(this.i.get(Integer.valueOf(i)))).d()), " isHasScopeUrl:", Boolean.valueOf(((a) Objects.requireNonNull(this.i.get(Integer.valueOf(i)))).c()));
        if (era.j(this.f) && this.i.get(2).d() && this.i.get(2).c()) {
            return this.i.get(Integer.valueOf(i)).e();
        }
        return this.i.get(Integer.valueOf(i)).e() && this.i.get(Integer.valueOf(i)).d() && this.i.get(Integer.valueOf(i)).c();
    }

    private void b(boolean z, String str, String str2) {
        if (z) {
            a(this.f6556a);
        } else {
            etn.c(this.f6556a, str, str2, "#/?type=signInPage");
        }
    }

    private void a(Context context) {
        if (TextUtils.isEmpty(this.e) || context == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.ui.main.stories.me.activity.thirdparty.HealthKitThirdPartyAccountAuthActivity");
        intent.putExtra("app_id", this.e);
        iov.d(context, intent);
    }

    private void a(int i, int[] iArr) {
        emh.b().b(2, i, iArr);
    }

    public static void b(String str) {
        d(str, "1");
    }

    private static void h(String str) {
        d(str, "");
    }

    public static boolean c(String str) {
        String strI = i(str);
        LogUtil.a("RopeCloudAuthManager", "getRejectSignInStatus ", strI);
        return TextUtils.isEmpty(strI);
    }

    public static void e(String str) {
        String strB = era.b(str);
        elh elhVarD = ResourceManager.c().d(str);
        LogUtil.d("RopeCloudAuthManager", "smartProId = ", strB, " productInfo is null? ", Boolean.valueOf(elhVarD == null));
        if (elhVarD == null && dmz.ac.contains(strB)) {
            d("download_" + str, "1");
        }
    }

    public static void d(String str) {
        d("download_" + str, "");
    }

    private static boolean f(String str) {
        String strI = i("download_" + str);
        LogUtil.a("RopeCloudAuthManager", "download flag = ", strI);
        return !TextUtils.isEmpty(strI);
    }

    private int[] b() {
        return this.j;
    }

    private static void d(String str, String str2) {
        SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(10000), str, str2, new StorageParams(0));
    }

    private static String i(String str) {
        return SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(10000), str);
    }

    public void e(SettingStatusData settingStatusData) {
        LogUtil.a("RopeCloudAuthManager", "getRopeAchievementsFromApp");
        if (this.f6556a == null || settingStatusData == null) {
            LogUtil.j("RopeCloudAuthManager", "getRopeAchievementsFromApp mContext or settingStatusData is null");
            return;
        }
        AchieveDataApi achieveDataApi = (AchieveDataApi) Services.d("PluginAchievement", AchieveDataApi.class);
        if (achieveDataApi == null) {
            LogUtil.j("RopeCloudAuthManager", "getRopeAchievementsFromApp achieveDataApi is null.");
            return;
        }
        LogUtil.a("RopeCloudAuthManager", "settingStatusData BestNumberSingleJumps: ", Integer.valueOf(settingStatusData.getSettingBestNumberSingleJumps()), " BestRopeContinuousCount: ", Integer.valueOf(settingStatusData.getSettingBestNumberConsecutiveJumps()), " BestRopeSpeed: ", Integer.valueOf(settingStatusData.getSettingBestSkippingSpeed()), " BestRopeDuration: ", Integer.valueOf(settingStatusData.getSettingBestSkippingDuration()));
        osc singleDayData = achieveDataApi.getSingleDayData();
        if (!e(singleDayData)) {
            LogUtil.j("RopeCloudAuthManager", "getRopeAchievementsFromApp checkSingleDayData is false.");
            return;
        }
        LogUtil.a("RopeCloudAuthManager", "getBestRopeSingCount: ", singleDayData.i(), " getBestRopeContinuousCount: ", singleDayData.f(), " getBestRopeSpeed: ", singleDayData.g(), " getBestRopeDuration: ", singleDayData.j());
        int i = Integer.parseInt(singleDayData.i());
        int i2 = Integer.parseInt(singleDayData.f());
        int i3 = Integer.parseInt(singleDayData.g());
        int i4 = Integer.parseInt(singleDayData.j());
        boolean z = false;
        boolean z2 = settingStatusData.getSettingBestNumberSingleJumps() == i && settingStatusData.getSettingBestNumberConsecutiveJumps() == i2;
        boolean z3 = settingStatusData.getSettingBestSkippingDuration() == i4 && settingStatusData.getSettingBestSkippingSpeed() == i3;
        this.f6557b = new int[]{i, i2, i4, i3};
        this.i.get(2).d((z2 && z3) ? false : true);
        if (z2 && z3) {
            z = true;
        }
        LogUtil.a("RopeCloudAuthManager", "RopeAchievements is same:", Boolean.valueOf(z));
    }

    private boolean e(osc oscVar) {
        return (oscVar == null || TextUtils.isEmpty(oscVar.i()) || TextUtils.isEmpty(oscVar.f()) || TextUtils.isEmpty(oscVar.g()) || TextUtils.isEmpty(oscVar.j())) ? false : true;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f6563a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f6564c;
        private boolean d;
        private boolean e;

        a(int i) {
            this.f6564c = i;
        }

        public boolean d() {
            return this.f6563a;
        }

        public void c(boolean z) {
            this.f6563a = z;
        }

        public boolean c() {
            return this.e;
        }

        public void a(boolean z) {
            this.e = z;
        }

        public boolean e() {
            return this.d;
        }

        public void d(boolean z) {
            this.d = z;
        }
    }
}
