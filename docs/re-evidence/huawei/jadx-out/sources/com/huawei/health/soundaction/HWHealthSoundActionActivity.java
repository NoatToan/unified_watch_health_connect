package com.huawei.health.soundaction;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.MainActivity;
import com.huawei.health.R;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.sportservice.SportDataOutputApi;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity;
import com.huawei.hms.hihealth.HiHealthActivities;
import com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import defpackage.esj;
import defpackage.fhz;
import defpackage.gyn;
import defpackage.gyo;
import defpackage.gyp;
import defpackage.gyq;
import defpackage.gyw;
import defpackage.ive;
import defpackage.iwy;
import defpackage.jaq;
import defpackage.jbg;
import defpackage.nwa;
import defpackage.qrs;
import defpackage.tfi;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.StorageParams;

/* JADX INFO: loaded from: classes31.dex */
public class HWHealthSoundActionActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f8778a;
    private SportDataOutputApi i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8780c = true;
    private Intent e = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8779b = true;
    private Handler d = new Handler() { // from class: com.huawei.health.soundaction.HWHealthSoundActionActivity.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 10086) {
                HWHealthSoundActionActivity.this.a(message.arg1);
            }
        }
    };

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        LogUtil.d("Track_HWHealthSoundActionActivity", "onCreate()");
        super.onCreate(bundle);
        this.f8778a = this;
        LoginInit loginInit = LoginInit.getInstance(this);
        LogUtil.a("Track_HWHealthSoundActionActivity", "loginit_isLogined", Boolean.valueOf(loginInit.getIsLogined()));
        if (!AuthorizationUtils.c(this.f8778a) || !loginInit.getIsLogined()) {
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage != null) {
                startActivity(launchIntentForPackage);
            }
        } else {
            a(15);
        }
        if (this.f8779b) {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (this.f8780c) {
            this.e = getIntent();
            this.f8780c = false;
        }
        if (i > 0) {
            boolean zC = fhz.d().c();
            LogUtil.a("Track_HWHealthSoundActionActivity", "initVoiceManager : retryTimes", Integer.valueOf(i), " ret ", Boolean.valueOf(zC));
            if (!zC) {
                Message messageObtainMessage = this.d.obtainMessage(10086);
                messageObtainMessage.arg1 = i - 1;
                this.d.removeMessages(10086);
                this.d.sendMessageDelayed(messageObtainMessage, 100L);
                return;
            }
        }
        e();
        gyo.e().d();
        gyp.d().b();
        this.i = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
        SharedPreferences sharedPreferences = this.f8778a.getSharedPreferences("IndoorEquipServiceRunning" + CommonUtil.a(this.f8778a), 0);
        if (sharedPreferences != null) {
            boolean z = sharedPreferences.getBoolean("IsIndoorEquipServiceRunning" + CommonUtil.a(this.f8778a), false);
            long jElapsedRealtime = SystemClock.elapsedRealtime() - sharedPreferences.getLong("elapsedRealtime", 0L);
            if (z && jElapsedRealtime < 2000 && jElapsedRealtime > 0) {
                d();
            }
        }
        try {
            b(this.e);
        } catch (Exception e) {
            LogUtil.j("Track_HWHealthSoundActionActivity", LogAnonymous.b(e));
        }
    }

    private void e() {
        ive.c().setAdapter(PluginHealthTrackAdapterImpl.getInstance(this.f8778a));
        ive.c().init(this.f8778a);
        if (((PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class)) == null) {
            Services.c("PluginFitnessAdvice", PluginSuggestion.class, BaseApplication.b(), new Consumer<PluginSuggestion>() { // from class: com.huawei.health.soundaction.HWHealthSoundActionActivity.2
                @Override // com.huawei.framework.servicemgr.Consumer
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void accept(PluginSuggestion pluginSuggestion) {
                    if (pluginSuggestion == null) {
                        LogUtil.j("Track_HWHealthSoundActionActivity", "PluginSuggestion is null.");
                    } else {
                        pluginSuggestion.init(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
                    }
                }
            }, true);
        }
    }

    public void b(Intent intent) {
        LogUtil.d("Track_HWHealthSoundActionActivity", "handleCommand(Intent intent)");
        if (intent == null) {
            LogUtil.d("Track_HWHealthSoundActionActivity", "handleCommand(Intent intent) intent == null");
            return;
        }
        Uri data = intent.getData();
        if (data == null) {
            LogUtil.d("Track_HWHealthSoundActionActivity", "handleCommand(Intent intent) data == null");
            return;
        }
        LogUtil.d("Track_HWHealthSoundActionActivity", "handleCommand data = ", data);
        String host = data.getHost();
        LogUtil.d("Track_HWHealthSoundActionActivity", "Host ", host);
        if ("com.android.mediacenter".equals(host)) {
            a(intent);
            c(intent);
            return;
        }
        try {
            String queryParameter = data.getQueryParameter("action");
            LogUtil.d("Track_HWHealthSoundActionActivity", "handleCommand(Intent intent) queryParameter = ", queryParameter);
            if (gyw.a() == 2) {
                LogUtil.j("Track_HWHealthSoundActionActivity", "handleCommand conflict");
                if (nwa.n().s()) {
                    return;
                }
                gyq.e().a(R.raw.girls_handle_failed_start_sport_during_fitness);
                return;
            }
            d(data, queryParameter);
        } catch (IllegalArgumentException e) {
            LogUtil.e("Track_HWHealthSoundActionActivity", "handleCommand IllegalArgumentException:", LogAnonymous.b(e));
        } catch (Exception e2) {
            LogUtil.e("Track_HWHealthSoundActionActivity", "handleCommand Exception:", LogAnonymous.b(e2));
        }
    }

    private void d(Uri uri, String str) {
        if ("start".equals(str)) {
            ive.c().c(2);
            a(e(uri), uri);
            return;
        }
        if ("pause".equals(str)) {
            ive.c().c(2);
            c();
        } else if ("resume".equals(str)) {
            ive.c().c(2);
            a();
        } else if ("stop".equals(str)) {
            ive.c().c(2);
            b();
        } else {
            ive.c().c(2);
            gyn.a().dispatchEvent(uri);
        }
    }

    private void a(Intent intent) {
        try {
            int iF = tfi.f(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
            LogUtil.a("Track_HWHealthSoundActionActivity", "contentId ", intent.getStringExtra("contentId"), " ", "contentElement ", intent.getStringExtra("contentElement"), " ", "operatorType ", Integer.valueOf(intent.getIntExtra("operatorType", 0)), " sportType = ", Integer.valueOf(iF));
            jaq jaqVar = new jaq(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), new StorageParams(), Integer.toString(20002));
            jaqVar.b(intent.getIntExtra("operatorType", 0), iF);
            jaqVar.c(intent.getStringExtra("contentType"), iF);
            jaqVar.b(intent.getStringExtra("contentId"), iF);
            jaqVar.d(intent.getStringExtra("contentElement"), iF);
        } catch (Exception e) {
            LogUtil.e("Track_HWHealthSoundActionActivity", LogAnonymous.b(e));
        }
    }

    private void c(Intent intent) {
        LogUtil.a("Track_HWHealthSoundActionActivity", "handleHwMusicRequest");
        boolean zD = d(intent);
        iwy iwyVarA = iwy.a(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
        if (iwyVarA.ay()) {
            if (iwyVarA.p() == 1 && intent != null) {
                a(258, intent.getData());
                return;
            }
            Intent intent2 = new Intent(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), (Class<?>) TrackMainMapActivity.class);
            intent2.setFlags(67108864);
            intent2.putExtra("isSelected", zD);
            LogUtil.a("Track_HWHealthSoundActionActivity", "huaweimusic to sporting");
            startActivity(intent2);
            return;
        }
        if (ive.c().j()) {
            LogUtil.a("Track_HWHealthSoundActionActivity", "huaweimusic to sportIntent");
            Object paras = this.i.getParas(SportParamsType.SPORT_LAUNCH_PARAS);
            SportLaunchParams sportLaunchParams = paras instanceof SportLaunchParams ? (SportLaunchParams) paras : null;
            if (sportLaunchParams == null) {
                LogUtil.e("Track_HWHealthSoundActionActivity", "handleHwMusicRequest sportLaunchParams is null.");
                return;
            }
            if (sportLaunchParams.getLaunchActivity() == null || sportLaunchParams.getLaunchActivity().isEmpty()) {
                return;
            }
            Intent intent3 = new Intent();
            intent3.setClassName(com.huawei.hwcommonmodel.application.BaseApplication.getContext().getPackageName(), sportLaunchParams.getLaunchActivity());
            intent3.setFlags(67108864);
            intent3.putExtra("bundle_key_sport_launch_paras", sportLaunchParams);
            intent3.putExtra("isSelected", zD);
            startActivity(intent3);
            return;
        }
        if (esj.c().b()) {
            Intent intent4 = new Intent(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), (Class<?>) DeviceMainActivity.class);
            intent4.setFlags(603979776);
            startActivity(intent4);
            return;
        }
        Intent intent5 = new Intent(com.huawei.hwcommonmodel.application.BaseApplication.getContext(), (Class<?>) MainActivity.class);
        intent5.setFlags(67108864);
        intent5.putExtra("isSelected", zD);
        intent5.putExtra(BleConstants.SPORT_TYPE, 258);
        intent5.putExtra("isToSportTab", true);
        intent5.putExtra("mLaunchSource", 1);
        LogUtil.a("Track_HWHealthSoundActionActivity", "huaweimusic to params");
        startActivity(intent5);
    }

    private boolean d(Intent intent) {
        if (intent != null) {
            try {
                boolean booleanExtra = intent.getBooleanExtra("isSelected", false);
                LogUtil.a("Track_HWHealthSoundActionActivity", "huaweimusic isSelected", Boolean.valueOf(booleanExtra));
                return booleanExtra;
            } catch (BadParcelableException e) {
                LogUtil.j("Track_HWHealthSoundActionActivity", LogAnonymous.b(e));
            }
        }
        return false;
    }

    private int e(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if ("running".equals(lastPathSegment)) {
            return 258;
        }
        if ("walking".equals(lastPathSegment)) {
            return 257;
        }
        if (HiHealthActivities.CYCLING.equals(lastPathSegment)) {
            return 259;
        }
        return "indoorRunning".equals(lastPathSegment) ? 264 : 0;
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f8785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f8786b;

        private b() {
            this.f8786b = -1;
            this.f8785a = -1.0f;
        }

        public int c() {
            return this.f8786b;
        }

        public void a(int i) {
            this.f8786b = i;
        }

        public float b() {
            return this.f8785a;
        }

        public void a(float f) {
            this.f8785a = f;
        }
    }

    private void a(int i, Uri uri) {
        gyw.d("start");
        if (d(i)) {
            return;
        }
        b bVar = new b();
        if (c(i, uri, bVar) || e(uri, bVar)) {
            return;
        }
        a(uri, bVar);
        iwy iwyVarA = iwy.a(jbg.a());
        if (ive.c().g() == 1 && iwyVarA.p() != 1) {
            LogUtil.j("Track_HWHealthSoundActionActivity", "gotoSport already sporting");
            if (nwa.n().s()) {
                return;
            }
            gyq.e().a(R.raw.girls_handle_failed_during_sport);
            return;
        }
        if (ive.c().g() == 2 && iwyVarA.p() != 1) {
            LogUtil.j("Track_HWHealthSoundActionActivity", "gotoSport pausing");
            a();
            return;
        }
        ive.c().e(0, i, bVar.c(), bVar.b(), (ISportDataCallback) null, this.f8778a);
        int iC = bVar.c();
        float fB = bVar.b();
        tfi.b(this.f8778a, i, iC);
        tfi.a(this.f8778a, fB, i);
        LogUtil.d("Track_HWHealthSoundActionActivity", "", Integer.valueOf(i), ":", Integer.valueOf(bVar.c()), ":", Float.valueOf(bVar.b()));
        if (iC == -1 || fB == -1.0f || Math.abs(fB) <= 1.0E-6d) {
            return;
        }
        tfi.a(this.f8778a, i, true);
        tfi.b(this.f8778a, i, iC, fB);
    }

    private void a(Uri uri, b bVar) {
        String queryParameter = uri.getQueryParameter("marathon");
        if (TextUtils.isEmpty(queryParameter)) {
            return;
        }
        if ("marathon".equals(queryParameter)) {
            bVar.a(b("42.195"));
        } else if ("half_marathon".equals(queryParameter)) {
            bVar.a(b("21.0975"));
        }
        bVar.a(1);
    }

    private boolean e(Uri uri, b bVar) {
        String queryParameter = uri.getQueryParameter("duration");
        if (!TextUtils.isEmpty(queryParameter)) {
            bVar.a(b(queryParameter));
            if (b(bVar.b())) {
                return true;
            }
            bVar.a(0);
        }
        return false;
    }

    private float b(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            LogUtil.e("Track_HWHealthSoundActionActivity", "throwExceptionToDeal NumberFormatException:", LogAnonymous.b(e));
            return 0.0f;
        }
    }

    private boolean c(int i, Uri uri, b bVar) {
        String queryParameter = uri.getQueryParameter("unit");
        if ("cal".equals(queryParameter)) {
            String queryParameter2 = uri.getQueryParameter("number");
            if (TextUtils.isEmpty(queryParameter2)) {
                bVar.a(-1);
                return false;
            }
            float fB = b(queryParameter2) * 1000.0f;
            bVar.a(fB);
            if (d(fB)) {
                return true;
            }
            bVar.a(2);
            return false;
        }
        if ("km".equals(queryParameter)) {
            String queryParameter3 = uri.getQueryParameter("number");
            if (TextUtils.isEmpty(queryParameter3)) {
                bVar.a(-1);
                return false;
            }
            bVar.a(b(queryParameter3));
            if (e(i, bVar.b())) {
                return true;
            }
            bVar.a(1);
            return false;
        }
        if ("metre".equals(queryParameter)) {
            String queryParameter4 = uri.getQueryParameter("number");
            if (TextUtils.isEmpty(queryParameter4)) {
                bVar.a(-1);
                return false;
            }
            float fB2 = b(queryParameter4) / 1000.0f;
            bVar.a(fB2);
            if (e(i, fB2)) {
                return true;
            }
            bVar.a(1);
            return false;
        }
        LogUtil.a("Track_HWHealthSoundActionActivity", "gotoSport slot value = ", queryParameter);
        return false;
    }

    private boolean d(float f) {
        if (f >= 100000.0f && f <= 5000000.0f) {
            return false;
        }
        if (nwa.n().s()) {
            return true;
        }
        gyq.e().a(R.raw.girls_handle_sport_calorie_beyond_limit);
        return true;
    }

    private boolean b(float f) {
        if (f >= 600.0f && f <= 86400.0f) {
            return false;
        }
        if (nwa.n().s()) {
            return true;
        }
        gyq.e().a(R.raw.girls_handle_sport_time_beyond_limit);
        return true;
    }

    private boolean e(int i, float f) {
        if (i != 259 && (Float.compare(f, 0.1f) < 0 || Float.compare(f, 100.0f) > 0)) {
            if (!nwa.n().s()) {
                gyq.e().a(R.raw.girls_handle_sport_distance_beyond_limit);
            }
            return true;
        }
        if (i != 259) {
            return false;
        }
        if (Float.compare(f, 0.1f) >= 0 && Float.compare(f, 200.0f) <= 0) {
            return false;
        }
        if (!nwa.n().s()) {
            gyq.e().a(R.raw.girls_handle_sport_ride_distance_beyond_limit);
        }
        return true;
    }

    private boolean d(int i) {
        PermissionUtil.PermissionType permissionTypeE = PermissionUtil.e(i);
        if (PermissionUtil.e(this.f8778a, permissionTypeE) != PermissionUtil.PermissionResult.FOREVER_DENIED) {
            return false;
        }
        this.f8779b = false;
        if (isFinishing()) {
            return true;
        }
        try {
            b(this.f8778a, permissionTypeE);
            return true;
        } catch (WindowManager.BadTokenException e) {
            LogUtil.j("Track_HWHealthSoundActionActivity", "showHealthAppSettingGuide exception ", LogAnonymous.b(e));
            return true;
        }
    }

    private void c() {
        gyw.d("pause");
        if (ive.c().g() == 0) {
            LogUtil.j("Track_HWHealthSoundActionActivity", "pauseSport failed");
            if (nwa.n().s()) {
                return;
            }
            gyq.e().a(R.raw.girls_handle_failed_start_sport_during_idle);
            return;
        }
        if (ive.c().g() == 2) {
            LogUtil.j("Track_HWHealthSoundActionActivity", "pauseSport failed");
            if (nwa.n().s()) {
                return;
            }
            gyq.e().a(R.raw.girls_handle_failed_control_during_pause);
            return;
        }
        ive.c().v();
    }

    private void a() {
        gyw.d("resume");
        if (ive.c().g() == 0) {
            LogUtil.j("Track_HWHealthSoundActionActivity", "resumeSport failed");
            if (nwa.n().s()) {
                return;
            }
            gyq.e().a(R.raw.girls_handle_failed_resume_sport_during_idle);
            return;
        }
        if (ive.c().g() == 1) {
            LogUtil.j("Track_HWHealthSoundActionActivity", "resumeSport failed");
            if (nwa.n().s()) {
                return;
            }
            gyq.e().a(R.raw.girls_handle_failed_resumt_sport_during_pause);
            return;
        }
        ive.c().y();
    }

    private void b() {
        gyw.d("stop");
        if (ive.c().g() == 0) {
            LogUtil.j("Track_HWHealthSoundActionActivity", "stopSport failed");
            if (nwa.n().s()) {
                return;
            }
            gyq.e().a(R.raw.girls_handle_failed_stop_sport_during_idle);
            return;
        }
        ive.c().b(new ISportDataCallback() { // from class: com.huawei.health.soundaction.HWHealthSoundActionActivity.3
            @Override // com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback
            public void getSportInfo(Bundle bundle) {
            }

            @Override // com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback
            public void onSummary(MotionPathSimplify motionPathSimplify) {
            }
        });
    }

    private void b(final Context context, PermissionUtil.PermissionType permissionType) {
        if (!(context instanceof Activity)) {
            LogUtil.j("Track_HWHealthSoundActionActivity", "showHealthAppSettingGuide context is not activity context.");
            return;
        }
        new CustomTextAlertDialog.Builder(context).a(R.string.IDS_hwh_home_other_permissions_title).a(context.getResources().getString(qrs.b(permissionType))).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.soundaction.HWHealthSoundActionActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("Track_HWHealthSoundActionActivity", "showPermissionSettingGuide cancel");
                HWHealthSoundActionActivity.this.d();
            }
        }).a(R.string.IDS_hwh_motiontrack_permission_guide_go_set, new View.OnClickListener() { // from class: com.huawei.health.soundaction.HWHealthSoundActionActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d("Track_HWHealthSoundActionActivity", "showPermissionSettingGuide cancel");
                qrs.al(context);
                HWHealthSoundActionActivity.this.d();
            }
        }).b().show();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        setIntent(null);
        finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
