package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.Tasks;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.AchieveNavigationApi;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.connectivity.https.HttpResCallBack;
import com.huawei.pluginachievement.impl.PersonalDataCallback;
import com.huawei.pluginachievement.jsmodule.AchieveUtil;
import com.huawei.pluginachievement.jsmodule.CloudUtil;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.pluginachievement.manager.model.PersonalData;
import com.huawei.pluginachievement.manager.service.LanguageResReceiver;
import com.huawei.pluginachievement.manager.service.OnceMovementReceiver;
import com.huawei.pluginachievement.report.datahlr.AchieveAnnualDataHlr;
import com.huawei.pluginbase.PluginBaseAdapter;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.ui.commonui.base.BaseDialog;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class oru extends pbx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile oru f44614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AchieveNavigationApi f44615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PluginAchieveAdapter f44616c;
    private Context d;

    private oru(Context context) {
        if (context != null) {
            this.d = context.getApplicationContext();
        } else {
            this.d = BaseApplication.getContext();
        }
        this.f44615b = (AchieveNavigationApi) Services.d("PluginAchievement", AchieveNavigationApi.class);
    }

    public static oru a(Context context) {
        if (f44614a == null) {
            synchronized (oru.class) {
                if (f44614a == null) {
                    f44614a = new oru(context);
                }
            }
        }
        if (f44614a.getAdapter() == null) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "mPluginForAchieveAdapter == null ");
            p();
        }
        return f44614a;
    }

    @Override // defpackage.pbx
    public void finish() {
        LogUtil.a("PLGACHIEVE_PluginAchieve", "finish()");
        t();
        super.finish();
    }

    @Override // defpackage.pbx
    public void setAdapter(PluginBaseAdapter pluginBaseAdapter) {
        super.setAdapter(pluginBaseAdapter);
        if (pluginBaseAdapter instanceof PluginAchieveAdapter) {
            this.f44616c = (PluginAchieveAdapter) pluginBaseAdapter;
        }
    }

    @Override // defpackage.pbx
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public PluginAchieveAdapter getAdapter() {
        return this.f44616c;
    }

    private static void p() {
        try {
            Object objNewInstance = Class.forName("com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl").newInstance();
            if (objNewInstance instanceof PluginAchieveAdapter) {
                f44614a.setAdapter((PluginAchieveAdapter) objNewInstance);
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException e) {
            LogUtil.e("PLGACHIEVE_PluginAchieve", e.getMessage());
        }
    }

    private void t() {
        LogUtil.a("PLGACHIEVE_PluginAchieve", "release()");
        otl.d();
    }

    public LanguageResReceiver l() {
        otl otlVarB = otl.b(this.d);
        if (otlVarB != null) {
            return otlVarB.k();
        }
        return null;
    }

    public OnceMovementReceiver i() {
        otl otlVarB = otl.b(this.d);
        if (otlVarB != null) {
            return otlVarB.p();
        }
        return null;
    }

    public void r() {
        otl otlVarB = otl.b(this.d);
        if (otlVarB != null) {
            otlVarB.x();
        }
    }

    public void c(boolean z) {
        LogUtil.a("PLGACHIEVE_PluginAchieve", "popAchieveDialog()");
        if (q()) {
            return;
        }
        final otl otlVarB = otl.b(this.d);
        if (otlVarB == null) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "achieveDataManager is null");
        }
        if (z) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: oru.4
                @Override // java.lang.Runnable
                public void run() {
                    otlVarB.u();
                }
            }, 5000L);
        } else {
            otlVarB.u();
        }
    }

    public boolean o() {
        Activity activity = BaseApplication.getActivity();
        if (BaseDialog.sSplashAdViewId == 0 || BaseDialog.sSplashAdViewId == -1 || activity == null) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "Ad is not showing, exception.");
            return false;
        }
        if (activity.findViewById(BaseDialog.sSplashAdViewId) != null) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "Ad is showing, can not show dialog");
            return true;
        }
        LogUtil.a("PLGACHIEVE_PluginAchieve", "Ad is not showing, show dialog");
        return false;
    }

    private boolean q() {
        if (this.d == null) {
            LogUtil.a("PLGACHIEVE_PluginAchieve", "popAchieveDialog() Context is null");
            return true;
        }
        if (d()) {
            return false;
        }
        LogUtil.a("PLGACHIEVE_PluginAchieve", "popAchieveDialog() does not support Achieve!");
        return true;
    }

    public void m() {
        LogUtil.a("PLGACHIEVE_PluginAchieve", "noticeAchieveDialog()");
        if (q()) {
            return;
        }
        otl otlVarB = otl.b(this.d);
        if (otlVarB != null) {
            otlVarB.v();
        } else {
            LogUtil.a("PLGACHIEVE_PluginAchieve", "achieveDataManager is null");
        }
    }

    public void g() {
        LogUtil.a("PLGACHIEVE_PluginAchieve", "generateReportMessage()");
        if (this.d == null) {
            LogUtil.a("PLGACHIEVE_PluginAchieve", "generateReportMessage() Context is null");
        } else if (!d()) {
            LogUtil.a("PLGACHIEVE_PluginAchieve", "generateReportMessage() does not support Achieve!");
        } else {
            otl.b(this.d).f();
        }
    }

    public void e() {
        if (this.d == null) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "generateReportHealthData() Context is null");
            return;
        }
        long jC = pal.c(-4, System.currentTimeMillis(), 1);
        LogUtil.a("PLGACHIEVE_PluginAchieve", "showReport_generateReportHealthData() startTime-now", Long.valueOf(jC));
        otx.b(this.d).a(jC, System.currentTimeMillis(), 11, null);
    }

    public void a() {
        LogUtil.a("PLGACHIEVE_PluginAchieve", "generateKakaMessage()");
        if (this.d == null) {
            LogUtil.a("PLGACHIEVE_PluginAchieve", "generateKakaMessage() Context is null");
        } else if (Utils.o()) {
            LogUtil.a("PLGACHIEVE_PluginAchieve", "generateKakaMessage() does not support Achieve!");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: orz
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.k();
                }
            });
        }
    }

    /* synthetic */ void k() {
        otl.b(this.d).i();
    }

    public void c() {
        LogUtil.a("PLGACHIEVE_PluginAchieve", "generateHistoryBestMessage()");
        if (this.d == null) {
            LogUtil.a("PLGACHIEVE_PluginAchieve", "generateHistoryBestMessage() Context is null");
        } else if (!d()) {
            LogUtil.a("PLGACHIEVE_PluginAchieve", "generateHistoryBestMessage() does not support Achieve!");
        } else {
            otl.b(this.d).h();
        }
    }

    public PersonalData b(PersonalDataCallback personalDataCallback, Context context) {
        LogUtil.a("PLGACHIEVE_PluginAchieve", "getPersonalData()");
        if (context != null && personalDataCallback != null && d()) {
            return otl.b(context).c(personalDataCallback, context);
        }
        LogUtil.j("PLGACHIEVE_PluginAchieve", "getPersonalData: context/callback is null or does not support Achieve");
        return null;
    }

    public PersonalData e(Context context) {
        LogUtil.a("PLGACHIEVE_PluginAchieve", "getPersonalDataFromSql");
        if (context != null && d()) {
            return otl.b(context).c(context);
        }
        LogUtil.j("PLGACHIEVE_PluginAchieve", "getPersonalDataFromSQL: context is null or does not support Achieve");
        return null;
    }

    public ArrayList<String> b(Context context) {
        LogUtil.a("PLGACHIEVE_PluginAchieve", "getPersonalMedalData()");
        if (context == null) {
            LogUtil.a("PLGACHIEVE_PluginAchieve", "context == null");
            return new ArrayList<>();
        }
        if (!d()) {
            LogUtil.a("PLGACHIEVE_PluginAchieve", "getPersonalMedalData() does not support Achieve!");
            return new ArrayList<>();
        }
        return otl.b(context).r();
    }

    public void j(Context context) {
        AchieveNavigationApi achieveNavigationApi = this.f44615b;
        if (achieveNavigationApi == null) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "showAchieveReport: achieveNavigationApi is null");
        } else {
            achieveNavigationApi.showAchieveReport(context);
        }
    }

    public void l(Context context) {
        if (context == null) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "showExchangePointActivity context is null.");
            return;
        }
        LogUtil.a("PLGACHIEVE_PluginAchieve", "showExchangePointActivity enter");
        Intent intent = new Intent();
        intent.setClassName(context, PersonalData.CLASS_NAME_PERSONAL_KAKA_EXCHANGE_POINT);
        context.startActivity(intent);
    }

    public void k(Context context) {
        if (context == null) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "showKakaGiftMorePage context is null.");
            return;
        }
        LogUtil.a("PLGACHIEVE_PluginAchieve", "showKakaGiftMorePage enter");
        ddv.b().initH5Pro();
        H5ProClient.startH5MiniProgram(context, KakaConstants.KAKA_H5_PACKAGE_NAME, new H5ProLaunchOption.Builder().addPath("#/gift").setImmerse().showStatusBar().addCustomizeJsModule("CloudUtil", CloudUtil.class).addCustomizeJsModule("AchieveUtil", AchieveUtil.class).setBackgroundColor(Color.rgb(252, 203, 130)).build());
    }

    public void d(Context context) {
        if (context == null) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "initKaka context = null");
            return;
        }
        otl otlVarB = otl.b(context.getApplicationContext());
        if (otlVarB.q() == null || otlVarB.q().getHuid() == null) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "showAchieveKaka userProfile or uid is null!");
            otlVarB.ac();
        }
    }

    public void c(Context context) {
        AchieveNavigationApi achieveNavigationApi = this.f44615b;
        if (achieveNavigationApi == null) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "showAchieveKaka: achieveNavigationApi is null");
        } else {
            achieveNavigationApi.showAchieveKaka(context);
        }
    }

    public void o(Context context) {
        AchieveNavigationApi achieveNavigationApi = this.f44615b;
        if (achieveNavigationApi == null) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "showMyAwardPage: achieveNavigationApi is null");
        } else {
            achieveNavigationApi.showMyAwardPage(context);
        }
    }

    public void g(Context context) {
        if (context == null) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "showAnnualReport context null");
            return;
        }
        LogUtil.a("PLGACHIEVE_PluginAchieve", "showAnnualReport()");
        Intent intent = new Intent();
        intent.setClassName(context, PersonalData.CLASS_NAME_WEEK_AND_MONTH);
        context.startActivity(intent);
        oun.a(context);
    }

    public void h(Context context) {
        AchieveNavigationApi achieveNavigationApi = this.f44615b;
        if (achieveNavigationApi == null) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "showAchieveMedal: achieveNavigationApi is null");
        } else {
            achieveNavigationApi.showAchieveMedal(context);
        }
    }

    public void e(Context context, String str, String str2) {
        if (b(context, str)) {
            LogUtil.a("PLGACHIEVE_PluginAchieve", "showAchieveMedalById()");
            Intent intent = new Intent();
            intent.putExtra("medal_res_id", str);
            intent.putExtra("from", 1);
            intent.putExtra("real_from", str2);
            intent.setClassName(context, PersonalData.CLASS_NAME_PERSONAL_MEDAL_DETAIL);
            iov.d(context, intent);
        }
    }

    private boolean b(Context context, String str) {
        if (context == null) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "checkjumpMedalDetailProbability context null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "checkjumpMedalDetailProbability medalId null");
            h(context);
            return false;
        }
        if (oun.a(context, str)) {
            return true;
        }
        LogUtil.j("PLGACHIEVE_PluginAchieve", "checkjumpMedalDetailProbability ResourceIsComplete return");
        h(context);
        return false;
    }

    public void i(Context context) {
        if (context == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_PluginAchieve", "showAchieveLevel()");
        Intent intent = new Intent();
        if (CommonUtil.ca()) {
            intent.setClassName(context, PersonalData.CLASS_NAME_PERSONAL_LEVEL);
        } else {
            intent.setClassName(context, PersonalData.CLASS_NAME_PERSONAL_NEW_LEVEL);
        }
        context.startActivity(intent);
    }

    public void c(Context context, int i, IBaseResponseCallback iBaseResponseCallback) {
        if (context == null) {
            LogUtil.a("PLGACHIEVE_PluginAchieve", "getAnnualReportData context null!");
        } else {
            AchieveAnnualDataHlr.getInstance(context).getAnnualReportJson(i, iBaseResponseCallback);
        }
    }

    public void e(Context context, int i, int i2, int i3) {
        if (context == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_PluginAchieve", "showReportActivity()");
        Intent intent = new Intent();
        if (i3 == 0) {
            intent.setClassName(context, PersonalData.CLASS_NAME_ACHIEVE_MONTH_REPORT_ACTIVITY);
        } else {
            intent.setClassName(context, PersonalData.CLASS_NAME_ACHIEVE_WEEK_REPORT_ACTIVITY);
        }
        intent.putExtra("max_report_no", String.valueOf(i2));
        intent.putExtra("min_report_no", String.valueOf(i));
        intent.putExtra("report_stype", String.valueOf(i3));
        intent.setFlags(276824064);
        context.startActivity(intent);
    }

    public void a(Context context, String str, String str2) {
        if (context == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_PluginAchieve", "showLotteryShareActivity()");
        Intent intent = new Intent();
        intent.setClassName(context, PersonalData.CLASS_NAME_PERSONAL_LOTTERY_SHARE);
        intent.putExtra("imgUrl", str);
        intent.putExtra("awardName", str2);
        context.startActivity(intent);
    }

    public static boolean d() {
        return Utils.h();
    }

    public static boolean c(int i) {
        if (!Utils.o()) {
            LogUtil.a("PLGACHIEVE_PluginAchieve", "Not Oversea");
            return true;
        }
        if (Utils.h()) {
            if (i == 7 || i == 8) {
                LogUtil.a("PLGACHIEVE_PluginAchieve", "isSupportRequest is AllowLogin!(medal type)");
                return true;
            }
            if (i <= 4 && i >= 0 && i != 1) {
                LogUtil.a("PLGACHIEVE_PluginAchieve", "isSupportRequest is AllowLogin!");
                return true;
            }
        }
        LogUtil.a("PLGACHIEVE_PluginAchieve", "Not AllowLogin!");
        return false;
    }

    public static boolean b() {
        return Utils.h() && Utils.o();
    }

    public int c(Context context, String str, Map<String, Object> map) {
        if (context == null || TextUtils.isEmpty(str)) {
            return -1;
        }
        if (Utils.o()) {
            LogUtil.a("PLGACHIEVE_PluginAchieve", "setEvent does not support Achieve!");
            d(context, str, map);
            e(context, str, map);
            return -1;
        }
        otu.b(context).c(str, map);
        return 0;
    }

    private void e(Context context, String str, Map<String, Object> map) {
        if (context == null || TextUtils.isEmpty(str) || map == null) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "dealDeleteRunTrack context or map or key is empty");
            return;
        }
        if (String.valueOf(1).equals(str)) {
            try {
                int i = Integer.parseInt(String.valueOf(map.get("type")));
                LogUtil.a("PLGACHIEVE_PluginAchieve", "dealDeleteTrackData type=", Integer.valueOf(i));
                if (oun.e(i)) {
                    otu.b(context).c(str, map);
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("PLGACHIEVE_PluginAchieve", "dealDeleteRunTrack NumberFormatException");
            }
        }
    }

    private void d(Context context, String str, Map<String, Object> map) {
        if (context == null || TextUtils.isEmpty(str) || map == null) {
            LogUtil.j("PLGACHIEVE_PluginAchieve", "dealDeleteRunTrack context or map or key is empty");
            return;
        }
        if (String.valueOf(1).equals(str)) {
            try {
                int i = Integer.parseInt(String.valueOf(map.get("type")));
                LogUtil.a("PLGACHIEVE_PluginAchieve", "dealDeleteTrackData type=", Integer.valueOf(i));
                if (oun.a(i)) {
                    LogUtil.a("PLGACHIEVE_PluginAchieve", "getSyncChangeResult dealDeleteTrackData SYNC_SPORT_DELETE_INFO = DELETE");
                    osa.b(context, "_syncDeleteData", ProfileRequestConstants.DELETE_TYPE);
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("PLGACHIEVE_PluginAchieve", "dealDeleteRunTrack NumberFormatException");
            }
        }
    }

    public Task<List<osg>> b(final int i, final int i2, final int[] iArr) {
        return Tasks.callInBackground(new Callable<List<osg>>() { // from class: oru.2
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public List<osg> call() throws IllegalStateException {
                LogUtil.a("PLGACHIEVE_PluginAchieve", "getTaskInfoList");
                return otu.b(BaseApplication.getContext()).a(i, i2, iArr);
            }
        });
    }

    public Task<osd> b(final List<osj> list) {
        return Tasks.callInBackground(new Callable<osd>() { // from class: oru.3
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public osd call() throws IllegalStateException {
                LogUtil.a("PLGACHIEVE_PluginAchieve", "receiveKakaTask");
                return otu.b(BaseApplication.getContext()).a(list, 2, 1);
            }
        });
    }

    public Task<osd> c(final int i, final String[] strArr) {
        return Tasks.callInBackground(new Callable<osd>() { // from class: oru.5
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public osd call() throws IllegalStateException {
                LogUtil.a("PLGACHIEVE_PluginAchieve", "receiveKakaTask");
                return otu.b(BaseApplication.getContext()).a(i, strArr);
            }
        });
    }

    public Task<Integer> n() {
        return Tasks.callInBackground(new Callable<Integer>() { // from class: oru.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Integer call() throws IllegalStateException {
                PersonalData personalDataB = oru.this.b(new PersonalDataCallback() { // from class: oru.1.1
                    @Override // com.huawei.pluginachievement.impl.PersonalDataCallback
                    public void onPersonalDataChange(PersonalData personalData) {
                    }
                }, BaseApplication.getContext());
                if (personalDataB != null) {
                    return Integer.valueOf(personalDataB.getSumKakaNum());
                }
                throw new IllegalStateException("Current user is not supported achieve");
            }
        });
    }

    public Task<ArrayList<our>> f() {
        return Tasks.callInBackground(new Callable<ArrayList<our>>() { // from class: oru.8
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ArrayList<our> call() {
                return otl.b(BaseApplication.getContext()).n();
            }
        });
    }

    public Map<String, ouq> h() {
        return otl.b(BaseApplication.getContext()).m();
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        otl.b(BaseApplication.getContext()).c(iBaseResponseCallback);
    }

    public void e(String str, JSONObject jSONObject, HashMap<String, String> map, HttpResCallBack httpResCallBack) {
        osk.a(str, jSONObject, map, httpResCallBack);
    }

    public void d(Context context, osg osgVar) {
        otu.b(BaseApplication.getContext()).a(oyx.c(osgVar), context);
    }

    public Task<Boolean> b(final int[] iArr) {
        return Tasks.callInBackground(new Callable<Boolean>() { // from class: oru.7
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Boolean call() throws IllegalStateException {
                LogUtil.a("PLGACHIEVE_PluginAchieve", "checkKakaTaskIsFinished");
                int[] iArr2 = iArr;
                int i = 0;
                if (iArr2 == null || iArr2.length == 0) {
                    LogUtil.j("PLGACHIEVE_PluginAchieve", "checkKakaTaskIsFinished taskRuleIds is empty");
                    return false;
                }
                CountDownLatch countDownLatch = new CountDownLatch(iArr.length);
                while (true) {
                    int[] iArr3 = iArr;
                    if (i < iArr3.length) {
                        oru.this.d(iArr3[i], countDownLatch);
                        i++;
                    } else {
                        try {
                            break;
                        } catch (InterruptedException unused) {
                            LogUtil.e("PLGACHIEVE_PluginAchieve", "checkKakaTaskIsFinished is interruputed");
                        }
                    }
                }
                countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, CountDownLatch countDownLatch) {
        LogUtil.a("PLGACHIEVE_PluginAchieve", "checkKakaTaskIsFinished taskRuleId = ", Integer.valueOf(i));
        if (i == 30002) {
            otu.b(BaseApplication.getContext()).j(countDownLatch);
            return;
        }
        if (i == 30006) {
            otu.b(BaseApplication.getContext()).b(countDownLatch, 2103);
            return;
        }
        if (i == 30010) {
            otu.b(BaseApplication.getContext()).d(countDownLatch);
            return;
        }
        if (i == 30012) {
            otu.b(BaseApplication.getContext()).a(countDownLatch);
            return;
        }
        if (i != 30015) {
            switch (i) {
                case 20001:
                    otl.b(BaseApplication.getContext()).b(countDownLatch);
                    break;
                case 20002:
                case 20003:
                case 20005:
                case 20006:
                    otl.b(BaseApplication.getContext()).e(countDownLatch);
                    break;
                case 20004:
                    otu.b(BaseApplication.getContext()).b(countDownLatch);
                    break;
                case 20007:
                    otu.b(BaseApplication.getContext()).c(countDownLatch);
                    break;
                default:
                    LogUtil.j("PLGACHIEVE_PluginAchieve", "checkKakaTaskIsFinished invalid taskRuleId");
                    pap.a(countDownLatch);
                    break;
            }
            return;
        }
        otu.b(BaseApplication.getContext()).e(countDownLatch);
    }

    public void f(Context context) {
        if (context == null) {
            return;
        }
        LogUtil.a("PLGACHIEVE_PluginAchieve", "showAchievement");
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.pluginachievement.ui.AchieveReportActivity");
        context.startActivity(intent);
    }
}
