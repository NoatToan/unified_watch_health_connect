package com.huawei.health;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.m.s.e;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.knit.ui.KnitFragment;
import com.huawei.health.sportservice.SportDataOutputApi;
import com.huawei.healthcloud.plugintrack.ui.activity.SportBaseActivity;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.activity.IndoorEquipConnectedActivity;
import com.huawei.indoorequip.activity.IndoorEquipDisplayActivity;
import com.huawei.indoorequip.activity.IndoorEquipLandDisplayActivity;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import defpackage.hcb;
import defpackage.ive;
import defpackage.jaq;
import defpackage.lmf;
import defpackage.lmn;
import defpackage.nwa;
import defpackage.peh;
import defpackage.pvb;
import defpackage.qrs;
import defpackage.xjo;
import health.compact.a.AuthorizationUtils;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class ShortcutsActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6163a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f6164c = -1;
    private Context d;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        boolean zIsSportServiceRunning;
        super.onCreate(bundle);
        this.d = this;
        this.f6163a = b();
        e();
        ReleaseLogUtil.d("R_ShortcutsActivity", "mShortcutId: ", this.f6163a);
        if (AuthorizationUtils.c(this.d)) {
            c();
        }
        int iD = hcb.a().d();
        boolean z = true;
        boolean z2 = iD == 2 || iD == 5;
        boolean isLogined = LoginInit.getInstance(this.d).getIsLogined();
        SportDataOutputApi sportDataOutputApi = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
        if (sportDataOutputApi != null) {
            zIsSportServiceRunning = sportDataOutputApi.isSportServiceRunning();
            if (!zIsSportServiceRunning || !sportDataOutputApi.isDeviceMirrorLink()) {
                z = false;
            }
        } else {
            z = false;
            zIsSportServiceRunning = false;
        }
        LogUtil.a("ShortcutsActivity", "PluginSportTrack.getInstance().isSportingStatus()", Boolean.valueOf(ive.c().r()));
        LogUtil.a("ShortcutsActivity", "PluginSportTrack.getInstance().isSupportAutoTrackStatus()", Boolean.valueOf(ive.c().t()));
        if (ive.c().r() && ive.c().t()) {
            ive.c().z();
            finish();
            return;
        }
        if (ive.c().r() || z) {
            startActivity(new Intent(this.d, (Class<?>) TrackMainMapActivity.class));
        } else if (z2) {
            AppRouter.c("/PluginFitnessAdvice/CoachActivity").b(this.d);
        } else if (isLogined && zIsSportServiceRunning && AuthorizationUtils.c(this.d)) {
            d(sportDataOutputApi);
        } else {
            if (TextUtils.isEmpty(this.f6163a)) {
                LogUtil.j("ShortcutsActivity", "shortcutId is empty");
                finish();
                return;
            }
            b(this.f6163a);
        }
        overridePendingTransition(0, 0);
        finish();
    }

    private void d(SportDataOutputApi sportDataOutputApi) {
        Intent intent = new Intent();
        if (sportDataOutputApi.getSportType() == 283) {
            d(sportDataOutputApi, intent);
        } else {
            a(intent);
        }
        startActivity(intent);
    }

    private void d(SportDataOutputApi sportDataOutputApi, Intent intent) {
        if (sportDataOutputApi.getDataSource() == 7) {
            intent.setClass(this.d, SportBaseActivity.class);
        }
        if (sportDataOutputApi.getDataSource() == 5) {
            if (nwa.n().s()) {
                a(intent);
            } else {
                intent.setClass(this.d, SportBaseActivity.class);
            }
        }
    }

    private void a(Intent intent) {
        if (nwa.n().r()) {
            intent.setClass(this.d, IndoorEquipDisplayActivity.class);
        } else if (nwa.n().y()) {
            intent.setClass(this.d, IndoorEquipLandDisplayActivity.class);
        } else {
            intent.setClass(this.d, IndoorEquipConnectedActivity.class);
        }
    }

    private void c() {
        LogUtil.a("ShortcutsActivity", "need init");
        Context context = BaseApplication.getContext();
        lmf.d().c(LoginInit.getInstance(context).getAccountInfo(1011));
        lmf.d().a(LoginInit.getInstance(context).getAccountInfo(1010));
        OpAnalyticsUtil.getInstance().init(context, new IBaseResponseCallback() { // from class: dcn
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.d.d(i, obj);
            }
        });
        c(this.f6163a);
    }

    public /* synthetic */ void d(int i, Object obj) {
        LogUtil.a("ShortcutsActivity", "BiEvent create shortcuts shortcutId", this.f6163a);
        if (i == 0) {
            if ("SC_FA_CARD_EXERCISE".equals(this.f6163a) || "SC_FA_CARD_MAIN".equals(this.f6163a)) {
                pvb.b(this.d, this.f6163a, this.f6164c);
            }
        }
    }

    private void c(String str) {
        ReleaseLogUtil.d("R_ShortcutsActivity", "enter handleShortcutEvent");
        String strValue = AnalyticsValue.HEALTH_LOGIN_APP_WHITE_2050007.value();
        if (g(str)) {
            e(strValue, a(str));
        } else {
            j(strValue);
        }
    }

    private boolean g(String str) {
        return "SC_DEVICE".equals(str) || "SC_EXERCISE".equals(str) || "SC_KAKA".equals(str) || "diet_photography".equals(str);
    }

    private void j(String str) {
        ReleaseLogUtil.d("R_ShortcutsActivity", "enter sendGenericBiEvent");
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("from", 3);
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    public void e(String str, lmn lmnVar) {
        lmf.d().a(BaseApplication.getContext(), str, lmnVar, 0);
    }

    private lmn a(String str) {
        HashMap map = new HashMap();
        map.put("sessionId", Long.valueOf(System.currentTimeMillis()));
        map.put("pageId", "Initial_page");
        HashMap map2 = new HashMap();
        map2.put("event", 0);
        map2.put(FunctionSetBeanReader.BI_ELEMENT, "b0");
        map2.put("from", 3);
        map2.put("fromValue", str);
        map2.put("moduleName", "basic_framework");
        lmn lmnVar = new lmn();
        lmnVar.d(map);
        lmnVar.e(map2);
        return lmnVar;
    }

    private lmn e(String str) {
        HashMap map = new HashMap();
        map.put("sessionId", Long.valueOf(System.currentTimeMillis()));
        map.put("pageId", "Initial_page");
        HashMap map2 = new HashMap();
        map2.put("event", 1);
        map2.put("type", str);
        lmn lmnVar = new lmn();
        lmnVar.d(map);
        lmnVar.e(map2);
        return lmnVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    private void b(String str) {
        str.hashCode();
        switch (str) {
            case "SC_MALL":
            case "SC_EXERCISE":
            case "SC_DEVICE":
                pvb.c(this.d, str);
                break;
            case "SC_FA_CARD_NEW_SPORT":
                pvb.d(this.d);
                d();
                break;
            case "SC_FA_CARD_MAIN":
                pvb.c(this.d, "SC_FA_CARD_MAIN");
                break;
            case "SC_FA_CARD_STEP":
                pvb.e(this.d, a());
                break;
            case "SC_FA_CARD_EXERCISE":
                pvb.c(this.d, "SC_FA_CARD_EXERCISE");
                break;
            case "SC_FA_CARD_TODAY_NOT_COMPLETE_GOAL":
            case "SC_FA_CARD_LOW_STEP":
            case "SC_FA_CARD_MULTI_DAY_COMPLETE_GOAL":
            case "SC_FA_CARD_MULTI_DAY_NOT_COMPLETE_GOAL":
                pvb.b(this.d);
                d();
                break;
            case "SC_FA_CARD_REFRESH":
                d();
                break;
            case "diet_photography":
                if (!pvb.a(this.d)) {
                    pvb.c(this.d, str);
                    break;
                } else {
                    ReleaseLogUtil.d("R_ShortcutsActivity", "jump to recognize h5");
                    e(AnalyticsValue.HEALTH_SHORTCUTS_CLICK_2190003.value(), e(str));
                    AppRouter.e(Uri.parse("huaweischeme://healthapp/router/openwith?address=com.huawei.health.h5.diet-diary?h5pro=true&urlType=4&pName=com.huawei.health&path=photoIdentify&from=6&pullfrom=appQuickAccess")).b(this.d);
                    break;
                }
                break;
            default:
                d(str);
                break;
        }
    }

    private String b() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("ShortcutsActivity", "intent == null");
            return null;
        }
        String dataString = intent.getDataString();
        if (dataString == null && intent.hasExtra(e.n)) {
            Map<String, String> mapB = peh.b(intent.getStringExtra(e.n));
            if (mapB.containsKey("shortcutId")) {
                String str = mapB.get("shortcutId");
                LogUtil.d("ShortcutsActivity", "facard shortcutId :", str);
                return str;
            }
        }
        return dataString;
    }

    private void e() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("ShortcutsActivity", "initFaCardSize intent == null");
            return;
        }
        if (intent.hasExtra(e.n)) {
            Map<String, String> mapB = peh.b(intent.getStringExtra(e.n));
            if (mapB.containsKey("cardSize")) {
                String str = mapB.get("cardSize");
                if (qrs.d(str)) {
                    this.f6164c = Integer.parseInt(str);
                }
                LogUtil.d("ShortcutsActivity", "initFaCardSize cardSizeString :", str);
            }
        }
    }

    private String a() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("ShortcutsActivity", "getFaCardSportType intent == null");
            return "";
        }
        if (intent.hasExtra(e.n)) {
            Map<String, String> mapB = peh.b(intent.getStringExtra(e.n));
            if (mapB.containsKey("sport_type")) {
                return mapB.get("sport_type");
            }
        }
        return "";
    }

    private void d() {
        String str;
        String str2;
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("ShortcutsActivity", "dealFaCardClick intent == null");
            return;
        }
        if (intent.hasExtra(e.n)) {
            Map<String, String> mapB = peh.b(intent.getStringExtra(e.n));
            String str3 = "";
            if (mapB.containsKey("scene_id")) {
                str = mapB.get("scene_id");
                LogUtil.a("ShortcutsActivity", "dealFaCardClick FA_SCENE_CODE :", str);
            } else {
                str = "";
            }
            if (mapB.containsKey("view_code")) {
                str2 = mapB.get("view_code");
                LogUtil.a("ShortcutsActivity", "dealFaCardClick FA_CLICK_VIEW_CODE :", str2);
            } else {
                str2 = "";
            }
            if (mapB.containsKey(KnitFragment.KEY_EXTRA)) {
                str3 = mapB.get(KnitFragment.KEY_EXTRA);
                LogUtil.a("ShortcutsActivity", "dealFaCardClick FA_EXTRA :", str3);
            }
            pvb.c(this.d, str, str2, str3);
        }
    }

    private void d(String str) {
        if (jaq.e() || !pvb.a(this.d)) {
            pvb.c(this.d, str);
            return;
        }
        if (!"SC_KAKA".equals(str)) {
            LogUtil.j("ShortcutsActivity", "dealOtherShortcutsId shortcutsId not match");
            return;
        }
        pvb.b(this.d, str);
        if (i()) {
            LogUtil.a("ShortcutsActivity", "dealOtherShortcutsId isEfficientResting");
            AppRouter.c("/PluginSleepBriefs/EfficientRestActivity").b(this.d);
        } else if (f()) {
            LogUtil.a("ShortcutsActivity", "dealOtherShortcutsId isRecordSleep");
            AppRouter.c("/PluginSleepDetection/SleepDetectionActivity").b(this.d);
        } else {
            xjo.e(this.d);
        }
    }

    private boolean f() {
        String strE = SharedPreferenceManager.e(this.d, Integer.toString(10000), "sp_key_record_sleep");
        try {
            return !TextUtils.isEmpty(strE) && Boolean.parseBoolean(strE);
        } catch (NumberFormatException e) {
            LogUtil.e("ShortcutsActivity", "isRecordSleep exception : ", e.getMessage());
            return false;
        }
    }

    private boolean i() {
        String strE = SharedPreferenceManager.e(this.d, Integer.toString(10000), "sp_key_briefs_is_resting");
        try {
            return !TextUtils.isEmpty(strE) && Boolean.parseBoolean(strE);
        } catch (NumberFormatException e) {
            LogUtil.e("ShortcutsActivity", "showEfficientRest exception : ", e.getMessage());
            return false;
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        ReleaseLogUtil.d("R_ShortcutsActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ReleaseLogUtil.d("R_ShortcutsActivity", "onDestroy");
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
