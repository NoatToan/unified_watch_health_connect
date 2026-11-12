package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.appgallery.agd.api.AgdApiClient;
import com.huawei.appgallery.agd.api.ApiStatusCodes;
import com.huawei.appgallery.agd.api.ConnectionResult;
import com.huawei.appgallery.agd.api.OpenDetailResult;
import com.huawei.appgallery.agd.api.ResultCallback;
import com.huawei.appgallery.agd.api.ServiceInfo;
import com.huawei.appmarket.framework.coreservice.Status;
import com.huawei.appmarket.service.externalservice.distribution.opendetail.ModuleInfo;
import com.huawei.appmarket.service.externalservice.distribution.opendetail.OpenFADetailRequest;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.facardagds.FACard;
import com.huawei.health.facardagds.FaCardAgdsApi;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
@ApiDefine(uri = FaCardAgdsApi.class)
@Singleton
public class crj implements FaCardAgdsApi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f31290c = Collections.unmodifiableMap(new HashMap<String, String>() { // from class: crj.1
        private static final long serialVersionUID = -6952984575158174724L;

        {
            put("1*2", "1x2");
            put("2*2", "2x2");
            put("2*4", "2x4");
            put("4*4", "4x4");
        }
    });
    private static final Map<String, Integer> d = Collections.unmodifiableMap(new HashMap<String, Integer>() { // from class: crj.5
        private static final long serialVersionUID = 2665717746699023356L;

        {
            put(FaCardAgdsApi.SLEEP_FA_CARD, 2);
            put(FaCardAgdsApi.DIET_FA_CARD, 4);
            put(FaCardAgdsApi.SPORT_FA_CARD, 3);
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AgdApiClient f31291a;

    private int b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 2 || i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.huawei.health.facardagds.FaCardAgdsApi
    public int getResultcodeAgreeProtocol() {
        return 1001;
    }

    @Override // com.huawei.health.facardagds.FaCardAgdsApi
    public int getResultcodeNotAgreeProtocol() {
        return 1002;
    }

    @Override // com.huawei.health.facardagds.FaCardAgdsApi
    public void open(int i, String str, FaCardAgdsApi.OpenAgdsResultCallback openAgdsResultCallback) {
        ReleaseLogUtil.d("R_FaCardAgdsImpl", "open requestCode: ", Integer.valueOf(i), ", faCardModuleName: ", str);
        Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            ReleaseLogUtil.d("R_FaCardAgdsImpl", "open fail , activity is null");
            return;
        }
        AgdApiClient agdApiClientBuild = new AgdApiClient.Builder(activity).addConnectionCallbacks(new e(i, str, openAgdsResultCallback)).build();
        this.f31291a = agdApiClientBuild;
        agdApiClientBuild.connect();
    }

    @Override // com.huawei.health.facardagds.FaCardAgdsApi
    public void close() {
        AgdApiClient agdApiClient = this.f31291a;
        if (agdApiClient != null) {
            agdApiClient.disconnect();
        }
    }

    @Override // com.huawei.health.facardagds.FaCardAgdsApi
    public int getLoadResultCode(Intent intent) {
        OpenDetailResult openDetailResultFrom = OpenDetailResult.from(intent);
        if (openDetailResultFrom == null) {
            return -1;
        }
        int loadResult = openDetailResultFrom.getLoadResult();
        ReleaseLogUtil.d("R_FaCardAgdsImpl", "loadResult: ", Integer.valueOf(loadResult), "loadResultDesc:", openDetailResultFrom.getLoadResultDesc());
        return loadResult;
    }

    @Override // com.huawei.health.facardagds.FaCardAgdsApi
    public int faQuickServicesBiEvent(int i, int i2, int i3, String str) {
        HashMap map = new HashMap();
        map.put("event", Integer.valueOf(i));
        map.put("click", 1);
        if (i == 0 || i == 1 || i == 2 || i == 3) {
            map.put("from", Integer.valueOf(i2));
        }
        if (i == 1 || i == 2 || i == 3) {
            map.put("card_id", Integer.valueOf(i3));
        }
        if (i == 2 || i == 3) {
            map.put("card_type", str);
        }
        return lmf.d().c(BaseApplication.getContext(), AnalyticsValue.FA_QUICK_SERVICES_EVENT_VALUE.value(), map, 0);
    }

    @Override // com.huawei.health.facardagds.FaCardAgdsApi
    public int faQuickServicesBiEvent(int i, int i2) {
        return faQuickServicesBiEvent(i, i2, 0, "");
    }

    @Override // com.huawei.health.facardagds.FaCardAgdsApi
    public int faQuickServicesBiEvent(int i, int i2, int i3) {
        return faQuickServicesBiEvent(i, i2, i3, "");
    }

    private void d(String str, String str2, String str3, int i, int i2) {
        ReleaseLogUtil.d("R_FaCardAgdsImpl", "moduleName: ", str, ", formName:", str2, ", dimension: ", str3);
        faQuickServicesBiEvent(i2, i, b(str, str2), d(str3));
    }

    @Override // com.huawei.health.facardagds.FaCardAgdsApi
    public void addToDeskTopBi(Intent intent, int i) {
        List<ModuleInfo> modules;
        OpenDetailResult openDetailResultFrom = OpenDetailResult.from(intent);
        if (openDetailResultFrom == null || (modules = openDetailResultFrom.getModules()) == null) {
            return;
        }
        for (ModuleInfo moduleInfo : modules) {
            String moduleName = moduleInfo.getModuleName();
            String formName = moduleInfo.getFormName();
            String dimension = moduleInfo.getDimension();
            ReleaseLogUtil.d("R_FaCardAgdsImpl", "moduleName: ", moduleName, ", formName:", formName, ", dimension: ", dimension);
            String strD = d(dimension);
            int iB = b(moduleName, formName);
            if (moduleInfo.isAddedToDeskTop()) {
                ReleaseLogUtil.d("R_FaCardAgdsImpl", "addedToDeskTop isBiEvent20401301: ", Integer.valueOf(faQuickServicesBiEvent(3, i, iB, strD)), ", isBiEvent2040129: ", Integer.valueOf(e(iB, strD, b(i), 2)));
            }
            if (moduleInfo.isAddedToHiBoard()) {
                ReleaseLogUtil.d("R_FaCardAgdsImpl", "addedToHiBoard isBiEvent20401301: ", Integer.valueOf(faQuickServicesBiEvent(2, i, iB, strD)), ", isBiEvent2040129: ", Integer.valueOf(e(iB, strD, b(i), 1)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    public static ServiceInfo c(String str) {
        byte b2;
        List<ServiceInfo.FormInfo> arrayList = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();
        str.hashCode();
        switch (str) {
            case "dietfacard":
                b2 = 0;
                break;
            case "sportfacard":
                b2 = 1;
                break;
            case "sleepfacard":
                b2 = 2;
                break;
            case "default":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            arrayList = a();
            arrayList2 = Collections.singletonList(str);
        } else if (b2 == 1) {
            arrayList = b();
            arrayList2 = Collections.singletonList(str);
        } else if (b2 == 2) {
            arrayList = c();
            arrayList2 = Collections.singletonList(str);
        } else if (b2 == 3) {
            arrayList.addAll(c());
            arrayList.addAll(b());
            arrayList.addAll(a());
            arrayList2 = Arrays.asList(FaCardAgdsApi.SLEEP_FA_CARD, FaCardAgdsApi.SPORT_FA_CARD, FaCardAgdsApi.DIET_FA_CARD);
        } else {
            ReleaseLogUtil.e("R_FaCardAgdsImpl", "getServiceInfo constructed empty serviceInfo");
        }
        ServiceInfo serviceInfo = new ServiceInfo(FaCardAgdsApi.FA_CARD_PACKAGE_NAME);
        if (njy.b(arrayList)) {
            serviceInfo.setFormInfos(arrayList);
        }
        if (njy.b(arrayList2)) {
            serviceInfo.setModuleNames(arrayList2);
        }
        return serviceInfo;
    }

    private static List<ServiceInfo.FormInfo> c() {
        ServiceInfo.FormInfo formInfo = new ServiceInfo.FormInfo(FaCardAgdsApi.SLEEP_FA_CARD, "sleep_card_medium");
        ServiceInfo.FormInfo formInfo2 = new ServiceInfo.FormInfo(FaCardAgdsApi.SLEEP_FA_CARD, "sleep_data_mini");
        ServiceInfo.FormInfo formInfo3 = new ServiceInfo.FormInfo(FaCardAgdsApi.SLEEP_FA_CARD, "sleep_music_mini");
        ArrayList arrayList = new ArrayList();
        arrayList.add(formInfo);
        arrayList.add(formInfo2);
        arrayList.add(formInfo3);
        return arrayList;
    }

    private static List<ServiceInfo.FormInfo> a() {
        ServiceInfo.FormInfo formInfo = new ServiceInfo.FormInfo(FaCardAgdsApi.DIET_FA_CARD, "diet_diary_medium");
        ServiceInfo.FormInfo formInfo2 = new ServiceInfo.FormInfo(FaCardAgdsApi.DIET_FA_CARD, "diet_diary_mini");
        ArrayList arrayList = new ArrayList();
        arrayList.add(formInfo);
        arrayList.add(formInfo2);
        return arrayList;
    }

    private static List<ServiceInfo.FormInfo> b() {
        ServiceInfo.FormInfo formInfo = new ServiceInfo.FormInfo(FaCardAgdsApi.SPORT_FA_CARD, "fitness_courses_medium");
        ArrayList arrayList = new ArrayList();
        arrayList.add(formInfo);
        return arrayList;
    }

    private static String d(String str) {
        String str2 = f31290c.get(str);
        return str2 == null ? "" : str2;
    }

    private int e(int i, String str, int i2, int i3) {
        HashMap map = new HashMap();
        map.put("card_id", Integer.valueOf(i));
        map.put("card_type", str);
        map.put("from", Integer.valueOf(i2));
        map.put("click", 1);
        map.put("setPage", Integer.valueOf(i3));
        return lmf.d().c(BaseApplication.getContext(), AnalyticsValue.GREATE_FA_CARD_TYPE_EVENT_VALUE.value(), map, 0);
    }

    private int b(String str, String str2) {
        Map<String, Integer> map = d;
        if (!map.containsKey(str) || map.get(str) == null) {
            return 2;
        }
        if (str2.equals("sleep_data_mini")) {
            return 8;
        }
        return map.get(str).intValue();
    }

    @Override // com.huawei.health.facardagds.FaCardAgdsApi
    public void addFACardToDesktop(int i, String str, FaCardAgdsApi.OpenAgdsResultCallback openAgdsResultCallback) {
        FACard fACard = FACard.get(str);
        if (fACard == null) {
            LogUtil.e("FaCardAgdsImpl", "addFACardToDesktop params invalid");
            openAgdsResultCallback.onResponse(1);
            return;
        }
        if (c(fACard)) {
            int iC = c(fACard.mBundleName, fACard.mAbilityName, fACard.mModuleName, str, FaCardAgdsApi.DimensionType.getType(fACard.mDimensionName));
            if (iC == 0) {
                iC = 10;
            }
            openAgdsResultCallback.onResponse(iC);
            d(fACard.mModuleName, fACard.mFormName, fACard.mDimensionName, 4, 3);
            return;
        }
        if (fACard.mModuleName.equals(FaCardAgdsApi.FA_CARD)) {
            openAgdsResultCallback.onResponse(5);
        } else {
            open(i, fACard.mModuleName, openAgdsResultCallback);
            d(fACard.mModuleName, fACard.mFormName, fACard.mDimensionName, 4, 1);
        }
    }

    private boolean c(FACard fACard) {
        if (fACard.mModuleName.equals(FaCardAgdsApi.FA_CARD)) {
            return CommonUtil.h(BaseApplication.getContext(), FaCardAgdsApi.STEP_FA_CARD_PACKAGE_NAME);
        }
        return e(BaseApplication.getContext(), FaCardAgdsApi.FA_CARD_PACKAGE_NAME, fACard.mModuleName);
    }

    private static boolean e(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.j("FaCardAgdsImpl", "isFACardInstalled param is null");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            LogUtil.j("FaCardAgdsImpl", "isFACardInstalled,PackageManager is null");
            return false;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            return packageInfo != null && Arrays.asList(packageInfo.splitNames).contains(str2);
        } catch (PackageManager.NameNotFoundException e2) {
            ReleaseLogUtil.a("R_FaCardAgdsImpl", "isFACardInstalled fail ", e2.getMessage());
        }
    }

    private int c(String str, String str2, String str3, String str4, int i) {
        LogUtil.a("FaCardAgdsImpl", "enter addAbilityFormToLauncher, moduleName=", str3, " ,formName=", str4);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || i <= 0) {
            return 1;
        }
        Bundle bundle = new Bundle();
        bundle.putString("bundleName", str);
        bundle.putString("abilityName", str2);
        bundle.putString("ohos.extra.param.key.module_name", str3);
        bundle.putString("ohos.extra.param.key.form_name", str4);
        bundle.putInt("ohos.extra.param.key.form_dimension", i);
        Bundle bundleCall = null;
        try {
            bundleCall = BaseApplication.getContext().getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/settings/"), "addAbilityForm", (String) null, bundle);
        } catch (Exception e2) {
            ReleaseLogUtil.a("R_FaCardAgdsImpl", "addAbilityFormToLauncher: Exception" + e2);
        }
        if (bundleCall == null) {
            ReleaseLogUtil.e("R_FaCardAgdsImpl", "bundle is null");
            return 8;
        }
        int i2 = bundleCall.getInt("resultType");
        ReleaseLogUtil.d("R_FaCardAgdsImpl", "addAbilityFormToLauncher get result type=" + i2);
        return i2;
    }

    class e implements AgdApiClient.ConnectionCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f31292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f31293b;
        private final long d = SystemClock.elapsedRealtime();
        private final FaCardAgdsApi.OpenAgdsResultCallback e;

        e(int i, String str, FaCardAgdsApi.OpenAgdsResultCallback openAgdsResultCallback) {
            this.f31292a = i;
            this.f31293b = str;
            this.e = openAgdsResultCallback;
        }

        @Override // com.huawei.appgallery.agd.api.AgdApiClient.ConnectionCallbacks
        public void onConnected() {
            ReleaseLogUtil.d("R_FaCardAgdsImpl", "onConnected Success, duration=", Long.valueOf(c()));
            a();
        }

        @Override // com.huawei.appgallery.agd.api.AgdApiClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            ReleaseLogUtil.d("R_FaCardAgdsImpl", "onConnectionSuspended cause: ", Integer.valueOf(i), ", totalDuration=", Long.valueOf(c()));
            this.e.onResponse(1000);
        }

        @Override // com.huawei.appgallery.agd.api.AgdApiClient.ConnectionCallbacks
        public void onConnectionFailed(ConnectionResult connectionResult) {
            ReleaseLogUtil.d("R_FaCardAgdsImpl", "onConnectionFailed ", connectionResult.getErrorMessage(), ", duration=", Long.valueOf(c()));
            this.e.onResponse(1001);
            try {
                Activity activity = BaseApplication.getActivity();
                if (activity == null) {
                    ReleaseLogUtil.d("R_FaCardAgdsImpl", "onConnectionFailed startResolutionForResult fail 101, activity is null, totalDuration=", Long.valueOf(c()));
                } else {
                    connectionResult.startResolutionForResult(activity, 101);
                    ReleaseLogUtil.a("R_FaCardAgdsImpl", "onConnectionFailed end, totalDuration=", Long.valueOf(c()));
                }
            } catch (IntentSender.SendIntentException e) {
                ReleaseLogUtil.a("R_FaCardAgdsImpl", "onConnectionFailed error: ", ExceptionUtils.c(e));
            }
        }

        private long c() {
            return SystemClock.elapsedRealtime() - this.d;
        }

        private void a() {
            new OpenFADetailRequest.Builder(crj.this.f31291a).serviceInfo(crj.c(this.f31293b)).callback(new ResultCallback() { // from class: crk
                @Override // com.huawei.appgallery.agd.api.ResultCallback
                public final void onResult(Status status) {
                    this.f31295a.c(status);
                }
            }).send();
        }

        /* synthetic */ void c(Status status) {
            ReleaseLogUtil.d("R_FaCardAgdsImpl", "onConnected onStatus: ", ApiStatusCodes.getStatusCodeString(status.getStatusCode()), ", duration=", Long.valueOf(c()));
            ReleaseLogUtil.d("R_FaCardAgdsImpl", "onConnected Code: ", Integer.valueOf(status.getStatusCode()));
            int statusCode = status.getStatusCode();
            if (statusCode == 6) {
                try {
                    this.e.onResponse(0);
                    Activity activity = BaseApplication.getActivity();
                    if (activity == null) {
                        ReleaseLogUtil.d("R_FaCardAgdsImpl", "onConnected startResolutionForResult fail 6, activity is null, totalDuration=", Long.valueOf(c()));
                    } else {
                        status.startResolutionForResult(activity, this.f31292a);
                        ReleaseLogUtil.d("R_FaCardAgdsImpl", "onConnected startResolution end, totalDuration=", Long.valueOf(c()));
                    }
                } catch (IntentSender.SendIntentException e) {
                    this.e.onResponse(1002);
                    ReleaseLogUtil.a("R_FaCardAgdsImpl", "onConnected startResolution error:", ExceptionUtils.c(e));
                }
            } else {
                if (statusCode == 15 || statusCode == 2) {
                    try {
                        Activity activity2 = BaseApplication.getActivity();
                        if (activity2 == null) {
                            ReleaseLogUtil.d("R_FaCardAgdsImpl", "onConnected startResolutionForResult fail 100, activity is null, totalDuration=", Long.valueOf(c()));
                            return;
                        }
                        status.startResolutionForResult(activity2, 100);
                    } catch (IntentSender.SendIntentException e2) {
                        ReleaseLogUtil.a("R_FaCardAgdsImpl", "onConnected startResolution error:", ExceptionUtils.c(e2));
                    }
                }
                this.e.onResponse(1002);
                ReleaseLogUtil.d("R_FaCardAgdsImpl", "onConnected startResolution end, totalDuration=", Long.valueOf(c()));
            }
        }
    }
}
