package com.huawei.health;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.router.AppRouter;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.health.interactor.MainInteractors;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.hwauthutil.HsfSignValidator;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.nfc.PluginPay;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity;
import com.huawei.ui.device.activity.adddevice.AddDeviceIntroActivity;
import com.huawei.ui.main.stories.smartcenter.activity.SmartMsgSkipActivity;
import defpackage.ddy;
import defpackage.hcb;
import defpackage.ive;
import defpackage.lmf;
import defpackage.nac;
import defpackage.pvh;
import defpackage.tqp;
import defpackage.wvi;
import health.compact.a.AuthorizationUtils;
import health.compact.a.Services;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class StartHealthActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f6168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f6169b;
    private Context e;
    private d i;
    private String j;
    private LinearLayout l;
    Map<String, String> d = new HashMap<String, String>() { // from class: com.huawei.health.StartHealthActivity.3
        {
            put("com.huawei.health.MULTI_SIM_AUTH", "com.huawei.sim.multisim.MultiSimAuth");
            put("com.google.android.wearable.action.CONFIGURE_CELLULAR", "com.huawei.sim.esim.view.WirelessManagerActivity");
            put("com.google.android.wearable.action.CONFIGURE_PAYMENTS", ComponentInfo.PluginPay_A_31);
            put("com.google.android.wearable.action.CONFIGURE_ADDBANK", "com.huawei.nfc.carrera.ui.cardlist.AddBankOrBusCardActivity");
            put("com.huawei.health.CORE_SLEEP", "com.huawei.ui.device.activity.coresleep.CoreSleepSelectorActivity");
            put("com.huawei.health.GALILEO_OPEN_APP_ESIM_ACTION", "com.huawei.sim.esim.view.EsimManagerActivity");
        }
    };
    private int o = -1;
    private int m = -1;
    private int g = -1;
    private String h = "";
    private boolean f = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6170c = "";
    private Runnable n = new Runnable() { // from class: com.huawei.health.StartHealthActivity.1
        @Override // java.lang.Runnable
        public void run() {
            LogUtil.a("Login_StartHealthActivity", "mWizardRunnable run");
            if (StartHealthActivity.this.e == null) {
                StartHealthActivity.this.j();
                return;
            }
            try {
                Intent intent = new Intent();
                intent.setClassName(StartHealthActivity.this.e, "com.huawei.health.MainActivity");
                intent.setFlags(67108864);
                StartHealthActivity.this.e.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                LogUtil.e("Login_StartHealthActivity", "startActivity catch e:", e.getMessage());
            }
            StartHealthActivity.this.j();
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        BaseActivity.setNavigationBarVisibility(this, 8);
        if (getIntent() == null) {
            j();
            return;
        }
        if (!h()) {
            j();
            return;
        }
        this.e = this;
        this.i = new d();
        String action = getIntent().getAction();
        this.f6169b = action;
        if ("com.huawei.health.CORE_SLEEP".equals(action)) {
            f();
            return;
        }
        if (!TextUtils.isEmpty(this.f6169b) && b(this.f6169b)) {
            LogUtil.a("Login_StartHealthActivity", "get actionName not null==", this.f6169b);
            MainInteractors.c(this.d.get(this.f6169b));
            b();
            e(this.f6169b);
            return;
        }
        a();
        LoginInit loginInit = LoginInit.getInstance(this.e);
        LogUtil.a("Login_StartHealthActivity", "loginit_isLogined", Boolean.valueOf(loginInit.getIsLogined()));
        if (!MainInteractors.e() || !loginInit.getIsLogined()) {
            LogUtil.a("Login_StartHealthActivity", "StartHealth to MainActivity");
            Intent intent = new Intent();
            intent.putExtra("health_smartmsg_id", this.o);
            intent.putExtra("health_smartmsg_type", this.m);
            intent.putExtra("health_smartmsg_content", this.j);
            intent.putExtra(DeviceCategoryFragment.DEVICE_TYPE, this.g);
            intent.putExtra("dname", this.h);
            intent.putExtra("isPorc", this.f);
            intent.putExtra("isFromWear", true);
            intent.setClass(this.e, MainActivity.class);
            this.e.startActivity(intent);
            j();
            return;
        }
        i();
    }

    private void a() {
        if (getIntent() != null) {
            try {
                this.o = getIntent().getIntExtra("health_smartmsg_id", -1);
                this.m = getIntent().getIntExtra("health_smartmsg_type", -1);
                this.j = getIntent().getStringExtra("health_smartmsg_content");
                this.g = getIntent().getIntExtra("produceType", -1);
                this.h = getIntent().getStringExtra("produceName");
                this.f = getIntent().getBooleanExtra("isPorc", false);
                String stringExtra = getIntent().getStringExtra("health_activity_id");
                this.f6168a = stringExtra;
                if (TextUtils.isEmpty(stringExtra)) {
                    return;
                }
                if (!nac.f42807a) {
                    j();
                }
                nac.f42807a = false;
            } catch (Exception unused) {
                LogUtil.e("Login_StartHealthActivity", "getIntentData Exception.");
            }
        }
    }

    private void i() {
        if (this.o != -1 || this.m != -1 || this.j != null) {
            int iD = ((PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class)) != null ? hcb.a().d() : -1;
            int iG = ive.c().getAdapter() != null ? ive.c().g() : 0;
            LogUtil.a("Login_StartHealthActivity", "sportState=", Integer.valueOf(iG), ", fitState=", Integer.valueOf(iD));
            if (iG == 1 || iG == 2 || iD == 2 || iD == 5) {
                j();
                return;
            } else {
                d();
                return;
            }
        }
        if (!TextUtils.isEmpty(this.f6168a)) {
            LogUtil.a("Login_StartHealthActivity", "activityID=", this.f6168a);
            b();
            d(this.f6168a);
            j();
            return;
        }
        LogUtil.j("Login_StartHealthActivity", "judgeSkipActivity is other condition");
    }

    private void f() {
        String callingPackage = getCallingPackage();
        LogUtil.a("Login_StartHealthActivity", "callingPackage : ", callingPackage);
        if (!TextUtils.isEmpty(callingPackage)) {
            if (!HsfSignValidator.c(callingPackage)) {
                j();
                return;
            }
            if (!AuthorizationUtils.c(this.e) || !LoginInit.getInstance(BaseApplication.getContext()).getIsLogined()) {
                startActivity(getPackageManager().getLaunchIntentForPackage(getPackageName()));
                j();
                return;
            }
            Intent intent = new Intent();
            intent.setFlags(67108864);
            intent.setPackage(BaseApplication.getAppPackage());
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.device.activity.coresleep.CoreSleepSelectorActivity");
            this.e.startActivity(intent);
            j();
            return;
        }
        LogUtil.j("Login_StartHealthActivity", "callingPackage is empty.");
        j();
    }

    private void d() {
        if (this.o == -1) {
            int i = this.m;
            if (i == 1) {
                m();
            } else if (i == 2) {
                n();
            } else if (i == 3) {
                l();
            } else {
                LogUtil.j("Login_StartHealthActivity", "checkSkipActivity is other condition");
            }
        } else {
            o();
        }
        j();
    }

    private void n() {
        LogUtil.a("Login_StartHealthActivity", "startFitnessExerciseActivity");
        c(AnalyticsValue.HEALTH_HOME_FROM_NEGATIVE_BUTTON_CLICK_2010053.value(), "2");
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion == null) {
            Intent intent = new Intent(this.e, (Class<?>) MainActivity.class);
            intent.putExtra("id", this.o);
            intent.putExtra("msgContent", this.j);
            intent.putExtra("msgType", this.m);
            this.e.startActivity(intent);
            return;
        }
        if (pluginSuggestion.isInitComplete()) {
            Bundle bundle = new Bundle();
            bundle.putString("SKIP_ALL_COURSE_KEY", "");
            AppRouter.c("/PluginFitnessAdvice/SportAllCourseActivity").d(bundle).d(268435456).b(this.e);
        }
    }

    private void l() {
        LogUtil.a("Login_StartHealthActivity", "startPairDeviceActivity deviceType:", Integer.valueOf(this.g));
        Intent intent = new Intent();
        intent.putExtra("id", this.o);
        intent.putExtra("msgContent", this.j);
        intent.putExtra("msgType", this.m);
        intent.setFlags(268435456);
        if (this.g == 11) {
            LogUtil.a("Login_StartHealthActivity", "startPairDeviceActivity is r1 ");
            intent.putExtra(TtmlNode.TAG_STYLE, 4);
            intent.putExtra("isFromWearR1", true);
            intent.setClass(this.e, AddDeviceChildActivity.class);
        } else {
            LogUtil.a("Login_StartHealthActivity", "startPairDeviceActivity is not r1 ");
            intent.putExtra(DeviceCategoryFragment.DEVICE_TYPE, this.g);
            intent.putExtra("dname", this.h);
            intent.putExtra("isPorc", this.f);
            intent.putExtra("isFromWear", true);
            intent.setClass(this.e, AddDeviceIntroActivity.class);
        }
        this.e.startActivity(intent);
    }

    private void m() {
        LogUtil.a("Login_StartHealthActivity", "startSportActivity");
        c(AnalyticsValue.HEALTH_HOME_FROM_NEGATIVE_BUTTON_CLICK_2010053.value(), "1");
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) MainActivity.class);
        intent.setFlags(67108864);
        intent.putExtra(BleConstants.SPORT_TYPE, 0);
        intent.putExtra("isToSportTab", true);
        intent.putExtra("mLaunchSource", 3);
        LogUtil.a("Login_StartHealthActivity", "negative button to params");
        startActivity(intent);
    }

    private void o() {
        LogUtil.a("Login_StartHealthActivity", "startSmartMsgSkipActivity");
        c(AnalyticsValue.HEALTH_HOME_FROM_NEGATIVE_SMARTCARD_CLICK_2010054.value(), String.valueOf(this.m));
        Intent intent = new Intent();
        intent.putExtra("id", this.o);
        intent.putExtra("msgContent", this.j);
        intent.putExtra("msgType", this.m);
        intent.putExtra("from", 1);
        intent.setClass(this, SmartMsgSkipActivity.class);
        startActivity(intent);
    }

    private boolean c() {
        return pvh.b(this.e).e();
    }

    private boolean e() {
        return PluginPay.getInstance(this.e).isShowPay();
    }

    private void d(String str) {
        if (("com.huawei.sim.esim.view.WirelessManagerActivity".equals(str) || "com.huawei.sim.esim.view.EsimManagerActivity".equals(str) || "com.huawei.sim.esim.view.EsimActivationActivity".equals(str)) && c()) {
            LogUtil.d("Login_StartHealthActivity", "startActivityByClassName already in esim");
            return;
        }
        if ("com.huawei.nfc.carrera.ui.cardlist.AddBankOrBusCardActivity".equals(str)) {
            if (e()) {
                LogUtil.d("Login_StartHealthActivity", "startActivityByClassName already in wallet");
                return;
            } else if (!ddy.e().isPluginAvaiable()) {
                LogUtil.a("Login_StartHealthActivity", "startActivityByClassName not PluginAvailable");
                str = "com.huawei.health.MainActivity";
            } else {
                tqp.d(this.e, "");
                return;
            }
        }
        if (this.e == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(this.e, str);
            this.e.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("Login_StartHealthActivity", "startActivity catch e:", e.getMessage());
        }
    }

    private void c(String str, String str2) {
        HashMap map = new HashMap();
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(this.e, str, map, 0);
    }

    private boolean b(String str) {
        return this.d.get(str) != null;
    }

    private void e(String str) {
        LoginInit loginInit = LoginInit.getInstance(this.e);
        LogUtil.a("Login_StartHealthActivity", "loginit_isLogined", Boolean.valueOf(loginInit.getIsLogined()));
        if (!MainInteractors.e() || !loginInit.getIsLogined()) {
            LogUtil.a("Login_StartHealthActivity", "StartHealth to MainActivity");
            Intent intent = new Intent();
            intent.setClass(this.e, MainActivity.class);
            this.e.startActivity(intent);
            j();
            return;
        }
        setContentView(R.layout.layout_activity_mainui);
        e(0);
        String str2 = this.d.get(str);
        this.f6170c = str2;
        LogUtil.a("Login_StartHealthActivity", "showStartUpPageAndSkip activity", str2);
        this.i.removeCallbacks(this.n);
        this.i.postDelayed(this.n, 1000L);
    }

    private void e(int i) {
        if (this.l == null) {
            if (i == 8) {
                return;
            }
            ViewStub viewStub = (ViewStub) findViewById(R.id.viewstub_mainui_startpage);
            if (viewStub == null) {
                LogUtil.a("Login_StartHealthActivity", "setStartPageVisibility ViewStub is loaded fail.");
                return;
            }
            View viewInflate = viewStub.inflate();
            if (viewInflate instanceof LinearLayout) {
                this.l = (LinearLayout) viewInflate;
            }
            LogUtil.a("Login_StartHealthActivity", "init start page ok.");
        }
        LinearLayout linearLayout = this.l;
        if (linearLayout == null) {
            LogUtil.j("Login_StartHealthActivity", "mStartPage==null");
        } else {
            ((HealthTextView) linearLayout.findViewById(R.id.hw_copyrights)).setText(wvi.b());
            this.l.setVisibility(i);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        LinearLayout linearLayout = this.l;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            g();
        }
        super.onConfigurationChanged(configuration);
    }

    static class d extends Handler {
        private d() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                LogUtil.a("Login_StartHealthActivity", "Enter MSG_PAGE_SKIP");
            } else {
                LogUtil.d("Login_StartHealthActivity", "enter default");
            }
        }
    }

    private void b() {
        tqp.b(this.e);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.a("Login_StartHealthActivity", "onActivityResult requesetCode ", Integer.valueOf(i), ";resultCode:", Integer.valueOf(i2));
        if (i == 1) {
            if (i2 == 2 && intent != null) {
                c(intent.getStringExtra("device_id"));
            }
            j();
        }
        super.onActivityResult(i, i2, intent);
    }

    private void c(String str) {
        Intent intent = new Intent();
        intent.setClassName(this, "com.huawei.ui.homewear21.home.WearHomeActivity");
        intent.putExtra("device_id", str);
        startActivity(intent);
    }

    private boolean h() {
        String stringExtra;
        if (getIntent() == null) {
            return false;
        }
        try {
            stringExtra = getIntent().getStringExtra("health_activity_id");
        } catch (Exception unused) {
            LogUtil.e("Login_StartHealthActivity", "Check Activity Exception.");
            stringExtra = "";
        }
        if (TextUtils.isEmpty(stringExtra)) {
            return true;
        }
        Iterator<String> it = this.d.values().iterator();
        while (it.hasNext()) {
            if (it.next().equals(stringExtra)) {
                return true;
            }
        }
        LogUtil.a("Login_StartHealthActivity", "this params is not in white lists");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        setIntent(null);
        finish();
    }

    private void g() {
        this.l.findViewById(R.id.hw_health_start_page).setBackgroundResource(R.drawable.splash_bg);
    }
}
