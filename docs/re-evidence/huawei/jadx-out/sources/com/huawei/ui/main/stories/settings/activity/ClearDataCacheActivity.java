package com.huawei.ui.main.stories.settings.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.common.dfx.storage.StorageMonitor;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.algorithm.api.SleepMonitorAlgorithmApi;
import com.huawei.health.course.api.CourseApi;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.h5pro.jsbridge.system.storage.StorageUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.pluginachievement.gltexture.util.FileUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.ddj;
import defpackage.fua;
import defpackage.jdv;
import defpackage.jem;
import defpackage.lmf;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.wub;
import defpackage.wuz;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes19.dex */
public class ClearDataCacheActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomViewDialog f28795a;
    private LinearLayout ac;
    private ImageView ae;
    private HealthTextView ag;
    private HealthCheckBox al;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f28797c;
    private ImageView e;
    private LinearLayout f;
    private ImageView g;
    private HealthTextView h;
    private NoTitleCustomAlertDialog i;
    private HealthTextView j;
    private LinearLayout k;
    private ImageView l;
    private LinearLayout m;
    private ImageView n;
    private HealthTextView o;
    private HealthTextView p;
    private ImageView q;
    private LinearLayout r;
    private HealthTextView s;
    private ImageView t;
    private HealthTextView v;
    private LinearLayout x;
    private String y;
    private Context u = null;
    private String ai = null;
    private String w = null;
    private String ad = null;
    private String ab = null;
    private String aa = null;
    private String af = null;
    private boolean d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f28796b = null;
    private HashSet<String> an = new HashSet<>();
    private String ah = null;
    private boolean z = true;

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LogUtil.a("ClearDataCacheActivity", "onCreate()");
        setContentView(R.layout.activity_clear_data_cache);
        this.u = this;
        this.y = qrs.a((Context) this, 0L);
        h();
        o();
        StorageMonitor.b(false);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        qrs.e();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("ClearDataCacheActivity", "onDestroy()");
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.i;
        if (noTitleCustomAlertDialog == null || !noTitleCustomAlertDialog.isShowing()) {
            return;
        }
        this.i.dismiss();
    }

    private void o() {
        this.e = (ImageView) findViewById(R.id.hw_clear_device_data_right_arrow);
        this.g = (ImageView) findViewById(R.id.hw_clear_fitness_data_right_arrow);
        this.n = (ImageView) findViewById(R.id.hw_clear_medal_data_right_arrow);
        this.l = (ImageView) findViewById(R.id.hw_clear_other_data_right_arrow);
        if (findViewById(R.id.hw_clear_daydream_snore_featured_data_right_arrow) instanceof ImageView) {
            this.t = (ImageView) findViewById(R.id.hw_clear_daydream_snore_featured_data_right_arrow);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.clear_device_data_cache_layout);
        this.f28797c = linearLayout;
        linearLayout.setOnClickListener(this);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.clear_fitness_data_cache_layout);
        this.f = linearLayout2;
        linearLayout2.setOnClickListener(this);
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.clear_medal_data_cache_layout);
        this.k = linearLayout3;
        linearLayout3.setOnClickListener(this);
        LinearLayout linearLayout4 = (LinearLayout) findViewById(R.id.clear_other_data_cache_layout);
        this.m = linearLayout4;
        linearLayout4.setOnClickListener(this);
        if (findViewById(R.id.clear_daydream_snore_featured_data_cache_layout) instanceof LinearLayout) {
            LinearLayout linearLayout5 = (LinearLayout) findViewById(R.id.clear_daydream_snore_featured_data_cache_layout);
            this.r = linearLayout5;
            linearLayout5.setOnClickListener(this);
            if (getIntent().getBooleanExtra("showSleepAlertDialog", false)) {
                HandlerExecutor.c(new Runnable() { // from class: wlx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f52164c.b();
                    }
                });
            }
        }
        if (!fua.c(this.u)) {
            this.r.setVisibility(8);
            ((HealthDivider) findViewById(R.id.daydream_snore_cache_divider)).setVisibility(8);
        }
        this.j = (HealthTextView) findViewById(R.id.hw_show_clear_device_text);
        this.h = (HealthTextView) findViewById(R.id.hw_show_clear_fitness_text);
        this.o = (HealthTextView) findViewById(R.id.hw_show_clear_medal_text);
        this.s = (HealthTextView) findViewById(R.id.hw_show_clear_other_text);
        this.p = (HealthTextView) findViewById(R.id.hw_show_clear_daydream_snore_featured_text);
        this.x = (LinearLayout) findViewById(R.id.clear_smart_coach_data_cache_layout);
        this.v = (HealthTextView) findViewById(R.id.hw_show_clear_smart_coach_text);
        this.q = (ImageView) findViewById(R.id.hw_clear_smart_coach_data_right_arrow);
        this.x.setOnClickListener(this);
        this.ac = (LinearLayout) findViewById(R.id.sleep_music_cache_layout);
        this.ag = (HealthTextView) findViewById(R.id.sleep_music_cache_size_text);
        this.ae = (ImageView) findViewById(R.id.sleep_music_cache_icon);
        this.ac.setOnClickListener(this);
        g();
        this.z = jem.i() || qrs.ah(this.u) || !LanguageUtil.l(this.u) || Utils.o();
        k();
        l();
    }

    public /* synthetic */ void b() {
        this.r.performClick();
    }

    private void k() {
        this.x.setVisibility(this.z ? 8 : 0);
        ((HealthDivider) findViewById(R.id.smart_coach_data_cache_divider)).setVisibility(this.z ? 8 : 0);
        if (Utils.k()) {
            this.f.setVisibility(8);
            ((HealthDivider) findViewById(R.id.fitness_cache_divider)).setVisibility(8);
            this.k.setVisibility(8);
            ((HealthDivider) findViewById(R.id.medal_cache_divider)).setVisibility(8);
            this.ac.setVisibility(8);
            ((HealthDivider) findViewById(R.id.sleep_music_cache_divider)).setVisibility(8);
        }
    }

    private void g() {
        String str = this.ai;
        if (str != null) {
            this.j.setText(str);
        } else {
            this.j.setText(qrs.a(this.u, 0L));
        }
        String str2 = this.w;
        if (str2 != null) {
            this.h.setText(str2);
        } else {
            this.h.setText(qrs.a(this.u, 0L));
        }
        String str3 = this.ad;
        if (str3 != null) {
            this.o.setText(str3);
        } else {
            this.o.setText(qrs.a(this.u, 0L));
        }
        String str4 = this.ab;
        if (str4 != null) {
            this.s.setText(str4);
        } else {
            this.s.setText(qrs.a(this.u, 0L));
        }
        String str5 = this.aa;
        if (str5 != null) {
            this.p.setText(str5);
        } else {
            this.p.setText(qrs.a(this.u, 0L));
        }
        String str6 = this.ah;
        if (str6 != null) {
            this.v.setText(str6);
        } else {
            this.v.setText(qrs.a(this.u, 0L));
        }
        if (!TextUtils.isEmpty(this.af)) {
            this.ag.setText(this.af);
        } else {
            this.ag.setText(qrs.a(this.u, 0L));
        }
    }

    private void l() {
        if (LanguageUtil.ba(this.u)) {
            Drawable drawable = getResources().getDrawable(R.drawable.common_ui_arrow_left);
            this.e.setBackground(drawable);
            this.g.setBackground(drawable);
            this.n.setBackground(drawable);
            this.q.setBackground(drawable);
            this.l.setBackground(drawable);
            this.t.setBackground(drawable);
            this.ae.setBackground(drawable);
            return;
        }
        Drawable drawable2 = getResources().getDrawable(R.drawable.common_ui_arrow_right);
        this.e.setBackground(drawable2);
        this.g.setBackground(drawable2);
        this.n.setBackground(drawable2);
        this.q.setBackground(drawable2);
        this.l.setBackground(drawable2);
        this.t.setBackground(drawable2);
        this.ae.setBackground(drawable2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f) {
            this.f28796b = "fitness";
            String str = this.w;
            if (str == null || str.equals(this.y)) {
                return;
            }
            n();
            return;
        }
        if (view == this.k) {
            this.f28796b = "medal";
            String str2 = this.ad;
            if (str2 == null || str2.equals(this.y)) {
                return;
            }
            n();
            return;
        }
        if (view == this.m) {
            this.f28796b = "other";
            String str3 = this.ab;
            if (str3 == null || str3.equals(this.y)) {
                return;
            }
            n();
            return;
        }
        if (view == this.f28797c) {
            this.f28796b = "device";
            String str4 = this.ai;
            if (str4 == null || str4.equals(this.y)) {
                return;
            }
            n();
            return;
        }
        b(view);
    }

    private void b(View view) {
        if (view == this.x) {
            this.f28796b = "smartCoach";
            String str = this.ah;
            if (str == null || str.equals(this.y)) {
                return;
            }
            n();
            return;
        }
        if (view == this.r) {
            this.f28796b = "sleep";
            String str2 = this.aa;
            if (str2 == null || str2.equals(this.y)) {
                return;
            }
            m();
            return;
        }
        if (view == this.ac) {
            this.f28796b = "music";
            if (TextUtils.isEmpty(this.af) || this.af.equals(this.y)) {
                return;
            }
            n();
            return;
        }
        LogUtil.j("ClearDataCacheActivity", "clickOtherCacheLayout else branch");
    }

    private void h() {
        HashSet<String> hashSetH = wub.h(this.u);
        this.an = hashSetH;
        this.ai = qrs.a(this.u, wub.a(hashSetH) + wuz.d().e());
        LogUtil.a("ClearDataCacheActivity", "getAllCacheSize mOtherCacheSizeUi is ", this.ab);
        this.w = qrs.a(this.u, wub.c());
        Context context = this.u;
        this.ad = qrs.a(context, wub.a(context));
        Context context2 = this.u;
        this.ah = qrs.a(context2, wub.d(context2));
        Context context3 = this.u;
        this.ab = qrs.a(context3, wub.b(context3));
        Context context4 = this.u;
        this.aa = qrs.a(context4, wub.e(context4, "sleepMonitor"));
        Context context5 = this.u;
        this.af = qrs.a(context5, wub.e(context5));
    }

    private void n() {
        if (qrs.c(500)) {
            LogUtil.j("ClearDataCacheActivity", "onClick too fast");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.u).a(this.u.getResources().getString(R.string.IDS_clear_cache_tips)).d(R.string.IDS_device_privacy_clear, R.color.common_text_red_color, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.settings.activity.ClearDataCacheActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClearDataCacheActivity.this.i.dismiss();
                ClearDataCacheActivity.this.i();
            }
        }).e(R.string.IDS_settings_button_cancal_ios_btn, R.color.common_ui_text_color, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.settings.activity.ClearDataCacheActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClearDataCacheActivity.this.i.dismiss();
            }
        }).c();
        this.i = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        if (isFinishing()) {
            return;
        }
        this.i.show();
    }

    private void m() {
        if (qrs.c(500)) {
            LogUtil.j("ClearDataCacheActivity", "onClick too fast");
            return;
        }
        View viewInflate = View.inflate(this.u, R.layout.activity_sleep_radio_box, null);
        CustomViewDialog.Builder builderC = new CustomViewDialog.Builder(this.u).d(viewInflate).a(this.u.getResources().getString(R.string.IDS_clear_dream_talk_cache_tips)).d(R.string.IDS_device_privacy_clear, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.settings.activity.ClearDataCacheActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClearDataCacheActivity.this.f28795a.dismiss();
                ClearDataCacheActivity.this.i();
            }
        }).c(R.string.IDS_settings_button_cancal_ios_btn, new View.OnClickListener() { // from class: com.huawei.ui.main.stories.settings.activity.ClearDataCacheActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClearDataCacheActivity.this.f28795a.dismiss();
            }
        });
        this.f28795a = builderC.d();
        builderC.d(builderC.c(), R.color.emui_toolbar_text);
        builderC.b(builderC.a(), 8);
        HealthCheckBox healthCheckBox = (HealthCheckBox) viewInflate.findViewById(R.id.radiobutton1);
        this.al = healthCheckBox;
        healthCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.main.stories.settings.activity.ClearDataCacheActivity.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ClearDataCacheActivity.this.d = z;
                LogUtil.a("ClearDataCacheActivity", " isChecked" + ClearDataCacheActivity.this.d + z);
            }
        });
        this.f28795a.setCancelable(false);
        if (isFinishing()) {
            return;
        }
        this.f28795a.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        LogUtil.d("ClearDataCacheActivity", "enter confirm clear cache");
        if (this.f28796b.equals("fitness")) {
            e();
            return;
        }
        if (this.f28796b.equals("medal")) {
            FileUtil.e(this.u).a();
            this.o.setText(this.y);
            this.ad = this.y;
            d(AnalyticsValue.HEALTH_CLEAR_CACHE_DATA_SUCCEED_2040053.value(), "1");
            qpx.e(BaseApplication.getContext(), this.u.getResources().getString(R.string.IDS_clear_cache_complish));
            return;
        }
        if (this.f28796b.equals("other")) {
            f();
            this.s.setText(this.y);
            this.ab = this.y;
            d(AnalyticsValue.HEALTH_CLEAR_CACHE_DATA_SUCCEED_2040053.value(), "2");
            qpx.e(BaseApplication.getContext(), this.u.getResources().getString(R.string.IDS_clear_cache_complish));
            return;
        }
        if (this.f28796b.equals("device")) {
            j();
            wuz.d().b();
            this.j.setText(this.y);
            this.ai = this.y;
            d(AnalyticsValue.HEALTH_CLEAR_CACHE_DATA_SUCCEED_2040053.value(), "4");
            qpx.e(BaseApplication.getContext(), this.u.getResources().getString(R.string.IDS_clear_cache_complish));
            return;
        }
        if (this.f28796b.equals("smartCoach")) {
            FileUtils.d(new File(jdv.f38440a));
            this.v.setText(this.y);
            this.ah = this.y;
            d(AnalyticsValue.HEALTH_CLEAR_CACHE_DATA_SUCCEED_2040053.value(), "3");
            qpx.e(BaseApplication.getContext(), this.u.getResources().getString(R.string.IDS_clear_cache_complish));
            return;
        }
        if (this.f28796b.equals("sleep")) {
            d();
            return;
        }
        if (this.f28796b.equals("music")) {
            FileUtils.d(new File(StorageUtil.getNativeFilePath(this.u, "h5hosting-drcn.dbankcdn.cn/operationmusic")));
            FileUtils.d(new File(StorageUtil.getNativeFilePath(this.u, "operationmusic")));
            FileUtils.d(new File(StorageUtil.getNativeFilePath(this.u, "com.huawei.health.h5.sleeping-music/sleeping-music")));
            this.ag.setText(this.y);
            this.af = this.y;
            d(AnalyticsValue.HEALTH_CLEAR_CACHE_DATA_SUCCEED_2040053.value(), "6");
            qpx.e(BaseApplication.getContext(), this.u.getResources().getString(R.string.IDS_clear_cache_complish));
            return;
        }
        LogUtil.j("ClearDataCacheActivity", "confirm clear else branch");
    }

    private void d() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: wlt
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a();
            }
        });
    }

    public /* synthetic */ void a() {
        if (this.d) {
            String str = this.u.getFilesDir() + File.separator + "sleepMonitor" + File.separator;
            String str2 = "SLEEP_MONITOR" + LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
            FileUtils.d(new File(str));
            SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10000), str2);
            this.aa = this.y;
        } else {
            SleepMonitorAlgorithmApi sleepMonitorAlgorithmApi = (SleepMonitorAlgorithmApi) Services.b("SleepMonitor", SleepMonitorAlgorithmApi.class);
            for (ddj ddjVar : sleepMonitorAlgorithmApi.querySleepVoiceInfo(0L, System.currentTimeMillis())) {
                if (!ddjVar.b()) {
                    sleepMonitorAlgorithmApi.forceDeleteAudioFile(ddjVar.c().d());
                } else {
                    LogUtil.j("handleSleepCache no audio favorites", new Object[0]);
                }
            }
            Context context = this.u;
            this.aa = qrs.a(context, wub.e(context, "sleepMonitor"));
        }
        HandlerExecutor.c(new Runnable() { // from class: wlv
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c();
            }
        });
    }

    public /* synthetic */ void c() {
        this.p.setText(this.aa);
        d(AnalyticsValue.HEALTH_CLEAR_CACHE_DATA_SUCCEED_2040053.value(), "5");
        qpx.e(BaseApplication.getContext(), this.u.getResources().getString(R.string.IDS_clear_cache_complish));
    }

    private void e() {
        CourseApi courseApi = (CourseApi) Services.d("CoursePlanService", CourseApi.class);
        if (courseApi == null) {
            LogUtil.j("ClearDataCacheActivity", "confirmClearCache courseApi == null");
        } else {
            courseApi.delCourseUseCache(new UiCallback<Boolean>() { // from class: com.huawei.ui.main.stories.settings.activity.ClearDataCacheActivity.6
                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                public void onFailure(int i, String str) {
                    LogUtil.e("ClearDataCacheActivity", "confirmClearCache delUseCache onFailure errorCode = ", Integer.valueOf(i), ", errorInfo = ", str);
                }

                @Override // com.huawei.basefitnessadvice.callback.UiCallback
                /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                public void onSuccess(Boolean bool) {
                    ClearDataCacheActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.main.stories.settings.activity.ClearDataCacheActivity.6.4
                        @Override // java.lang.Runnable
                        public void run() {
                            ClearDataCacheActivity.this.h.setText(ClearDataCacheActivity.this.y);
                            ClearDataCacheActivity.this.w = ClearDataCacheActivity.this.y;
                            ClearDataCacheActivity.this.d(AnalyticsValue.HEALTH_CLEAR_CACHE_DATA_SUCCEED_2040053.value(), "0");
                            qpx.e(BaseApplication.getContext(), ClearDataCacheActivity.this.u.getResources().getString(R.string.IDS_clear_cache_complish));
                        }
                    });
                }
            });
        }
    }

    private void j() {
        for (String str : this.an) {
            String[] strArrSplit = str.split("/plugins/");
            if (strArrSplit.length > 1) {
                ResourceManager.c().j(strArrSplit[1]);
            }
            FileUtils.d(new File(str));
        }
    }

    private void f() {
        Iterator<File> it = wub.c(this.u).iterator();
        while (it.hasNext()) {
            FileUtils.d(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(this.u, str, map, 0);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
