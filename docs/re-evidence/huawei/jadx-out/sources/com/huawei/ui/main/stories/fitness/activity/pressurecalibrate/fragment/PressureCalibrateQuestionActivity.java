package com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.fragment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.activity.PressureCalibrateResultActivity;
import com.huawei.ui.main.stories.fitness.activity.pressurecalibrate.fragment.PressureCalibrateQuestionActivity;
import com.huawei.ui.main.stories.health.activity.healthdata.KnitPressureActivity;
import defpackage.mgg;
import defpackage.orf;
import defpackage.qsp;
import defpackage.uey;
import defpackage.ufn;
import defpackage.ugb;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class PressureCalibrateQuestionActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthViewPager f26973a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CustomTitleBar f26975c;
    private boolean d;
    private Context e;
    private Intent f;
    private boolean g;
    private boolean i;
    private int j;
    private LinearLayout l;
    private ufn n;
    private MessageReceiver o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26974b = "unknown";
    private String k = "";
    private String m = "";
    private Handler h = new Handler(Looper.getMainLooper());

    public static /* synthetic */ boolean b(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_pressure_calibrate_question);
        this.e = this;
        ugb.b().s();
        Intent intent = getIntent();
        this.f = intent;
        if (intent != null) {
            this.g = intent.getBooleanExtra("pressure_is_have_datas", false);
            this.f26974b = this.f.getStringExtra("health_device_type");
            this.k = this.f.getStringExtra("health_wifi_device_userId");
            this.m = this.f.getStringExtra("health_wifi_device_productId");
            this.d = this.f.getBooleanExtra("from_health_record", false);
            this.j = this.f.getIntExtra(ArkUIXConstants.FROM_TYPE, 0);
            ugb.b().e(this.f26974b);
            ugb.b().b(this.k);
            ugb.b().c(this.m);
            ugb.b().e(this.d);
            ugb.b().b(this.j);
            if (!"wifi_device".equals(this.f26974b)) {
                ugb.b().d(this.g);
                this.i = this.f.getBooleanExtra("press_auto_monitor", false);
                ugb.b().c(this.i);
            }
        }
        if (a()) {
            return;
        }
        j();
        d();
        e();
    }

    private boolean a() {
        DeviceInfo deviceInfoC = mgg.c("PressureCalibrateQuestionActivity");
        if ("wifi_device".equals(this.f26974b)) {
            return false;
        }
        if (deviceInfoC != null && deviceInfoC.getDeviceConnectState() == 2) {
            return false;
        }
        ReleaseLogUtil.d("PressureCalibrateQuestionActivity", "Device is null or disconnected");
        Intent intent = new Intent(this, (Class<?>) PressureCalibrateResultActivity.class);
        intent.putExtra("stopTimer", true);
        intent.putExtra(ArkUIXConstants.FROM_TYPE, this.j);
        orf.a(this, intent);
        finish();
        return true;
    }

    private void e() {
        this.o = new MessageReceiver(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.ui.pressure.question.next");
        intentFilter.addAction("com.huawei.ui.pressure.question.previous");
        intentFilter.addAction("com.huawei.ui.pressure.calibrate.err");
        BroadcastManagerUtil.d(this, this.o, intentFilter, LocalBroadcast.f36595c, null);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        d();
    }

    private void d() {
        this.l = (LinearLayout) findViewById(R.id.hw_pressure_calibrate_viewpager_layout);
        this.f26973a = (HealthViewPager) findViewById(R.id.hw_pressure_calibrate_question_viewpager);
        cancelLayoutById(this.l);
        ReleaseLogUtil.d("R_PressureCalibrateQuestionActivity", "mDeviceType is ", this.f26974b);
        if (!"wifi_device".equals(this.f26974b)) {
            uey.a().d(1, new d());
            uey.a().e(4, 60, 2);
        } else {
            c();
        }
        ugb.b().c(System.currentTimeMillis());
        this.f26973a.setCurrentItem(0);
        ArrayList arrayList = new ArrayList(12);
        for (int i = 0; i < 12; i++) {
            arrayList.add(QuestionItemFragment.a(i));
        }
        ufn ufnVar = new ufn(getSupportFragmentManager(), arrayList);
        this.n = ufnVar;
        this.f26973a.setAdapter(ufnVar);
        this.f26973a.setIsScroll(false);
        this.f26973a.setOnTouchListener(new View.OnTouchListener() { // from class: uft
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return PressureCalibrateQuestionActivity.b(view, motionEvent);
            }
        });
        uey.a().a((PressureCalibrateQuestionActivity) new WeakReference(this).get());
    }

    static class d implements IBaseResponseCallback {
        private final WeakReference<PressureCalibrateQuestionActivity> e;

        private d(PressureCalibrateQuestionActivity pressureCalibrateQuestionActivity) {
            this.e = new WeakReference<>(pressureCalibrateQuestionActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            PressureCalibrateQuestionActivity pressureCalibrateQuestionActivity = this.e.get();
            if (pressureCalibrateQuestionActivity != null) {
                pressureCalibrateQuestionActivity.b(i);
            } else {
                LogUtil.e("PressureCalibrateQuestionActivity", "mReference is null");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        ReleaseLogUtil.d("R_PressureCalibrateQuestionActivity", "errCode: ", Integer.valueOf(i));
        if (i == 126007) {
            i();
        } else {
            this.h.postDelayed(new Runnable() { // from class: ufp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f50038b.c();
                }
            }, 300L);
        }
    }

    private void j() {
        CustomTitleBar customTitleBar = (CustomTitleBar) findViewById(R.id.hw_pressure_calibrate_title_layout);
        this.f26975c = customTitleBar;
        customTitleBar.setLeftButtonClickable(true);
        this.f26975c.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: ufr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f50039b.e(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        if (ugb.b().g()) {
            return;
        }
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        int currentItem = this.f26973a.getCurrentItem();
        LogUtil.a("PressureCalibrateQuestionActivity", "customViewPager position = " + this.f26973a);
        this.f26973a.setCurrentItem(currentItem + 1, false);
        ugb.b().h(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        int currentItem = this.f26973a.getCurrentItem();
        LogUtil.a("PressureCalibrateQuestionActivity", "customViewPager position = " + this.f26973a);
        this.f26973a.setCurrentItem(currentItem + (-1), false);
        ugb.b().h(false);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        MessageReceiver messageReceiver = this.o;
        if (messageReceiver != null) {
            unregisterReceiver(messageReceiver);
        }
        if (!ugb.b().g() && !ugb.b().n()) {
            uey.a().x();
            uey.a().u();
        }
        finish();
        super.onDestroy();
        LogUtil.a("PressureCalibrateQuestionActivity", "pressure calibrate question onDestroy");
    }

    private void f() {
        String string = this.e.getResources().getString(R.string.IDS_hw_show_card_pressure_calibrate_dialog_notify);
        String string2 = this.e.getResources().getString(R.string.IDS_hw_show_card_pressure_calibrate_dialog_text);
        String string3 = this.e.getResources().getString(R.string.IDS_hw_common_ui_dialog_cancel);
        String string4 = this.e.getResources().getString(R.string.IDS_hw_show_card_pressure_measure_dialog_button_stop);
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.e);
        builder.e(string).a(string2).b(string4, new View.OnClickListener() { // from class: ufq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        }).a(string3, new View.OnClickListener() { // from class: ufs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("PressureCalibrateQuestionActivity", "calibrate button click cancel");
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public /* synthetic */ void b(View view) {
        d(KnitPressureActivity.class);
        LogUtil.a("PressureCalibrateQuestionActivity", "Question have data = " + this.g);
        finish();
    }

    private void d(Class cls) {
        if ("wifi_device".equals(this.f26974b)) {
            uey.a().u();
            ugb.b().w();
            finish();
            return;
        }
        uey.a().x();
        if (this.i || this.d || this.j == 1) {
            uey.a().u();
            ugb.b().w();
            finish();
            return;
        }
        Intent intent = new Intent(this.e, (Class<?>) cls);
        this.f = intent;
        intent.putExtra("pressure_is_have_datas", this.g);
        startActivity(this.f);
        uey.a().u();
        ugb.b().w();
        finish();
    }

    private void i() {
        Intent intent = new Intent(this, (Class<?>) PressureCalibrateResultActivity.class);
        intent.putExtra("stopTimer", true);
        intent.putExtra("MovementMode", true);
        intent.putExtra(ArkUIXConstants.FROM_TYPE, this.j);
        orf.a(this, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        qsp.c(findViewById(R.id.pressure_loading_layout), 8);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (ugb.b().g()) {
                return false;
            }
            f();
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public static class MessageReceiver extends BroadcastReceiver {
        private WeakReference<PressureCalibrateQuestionActivity> e;

        MessageReceiver(PressureCalibrateQuestionActivity pressureCalibrateQuestionActivity) {
            this.e = new WeakReference<>(pressureCalibrateQuestionActivity);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            final PressureCalibrateQuestionActivity pressureCalibrateQuestionActivity = this.e.get();
            if (pressureCalibrateQuestionActivity == null || intent == null || context == null) {
                LogUtil.j("PressureCalibrateQuestionActivity", "onReceive activity or intent or content is null");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("PressureCalibrateQuestionActivity", "onReceive action:", action);
            if ("com.huawei.ui.pressure.question.next".equals(action)) {
                Handler handler = pressureCalibrateQuestionActivity.h;
                Objects.requireNonNull(pressureCalibrateQuestionActivity);
                handler.postDelayed(new Runnable() { // from class: ufy
                    @Override // java.lang.Runnable
                    public final void run() {
                        pressureCalibrateQuestionActivity.b();
                    }
                }, 300L);
                return;
            }
            if ("com.huawei.ui.pressure.question.previous".equals(action)) {
                Handler handler2 = pressureCalibrateQuestionActivity.h;
                Objects.requireNonNull(pressureCalibrateQuestionActivity);
                handler2.post(new Runnable() { // from class: ufx
                    @Override // java.lang.Runnable
                    public final void run() {
                        pressureCalibrateQuestionActivity.h();
                    }
                });
            } else {
                if (!"com.huawei.ui.pressure.calibrate.err".equals(action)) {
                    LogUtil.j("PressureCalibrateQuestionActivity", "onReceive other action");
                    return;
                }
                Intent intent2 = new Intent(pressureCalibrateQuestionActivity, (Class<?>) PressureCalibrateResultActivity.class);
                intent2.putExtra("stopTimer", true);
                intent2.putExtra("mIsFromNoData", pressureCalibrateQuestionActivity.g);
                intent2.putExtra("press_auto_monitor", pressureCalibrateQuestionActivity.i);
                intent2.putExtra("from_health_record", pressureCalibrateQuestionActivity.d);
                intent2.putExtra("no_privacy", intent.getBooleanExtra("no_privacy", false));
                intent2.putExtra(ArkUIXConstants.FROM_TYPE, pressureCalibrateQuestionActivity.j);
                pressureCalibrateQuestionActivity.startActivity(intent2);
                pressureCalibrateQuestionActivity.finish();
            }
        }
    }
}
