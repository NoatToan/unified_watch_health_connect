package com.huawei.ui.device.activity.temperature;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.numberpicker.HealthNumberPicker;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import defpackage.eej;
import defpackage.lmf;
import defpackage.mbu;
import defpackage.mbw;
import defpackage.mgg;
import defpackage.mhs;
import defpackage.mim;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class TemperatureMonitoringActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthTextView f24752a;
    private HealthTextView aa;
    private int ab;
    private HealthTextView ac;
    private LinearLayout ad;
    private LinearLayout ae;
    private HealthSwitchButton af;
    private HealthTextView ag;
    private BroadcastReceiver ah;
    private int ai;
    private LinearLayout aj;
    private int ak;
    private HealthTextView al;
    private ImageView am;
    private HealthTextView an;
    private HealthTextView ar;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<HealthTextView> f24754c;
    private boolean d;
    private CustomTitleBar e;
    private DeviceSettingsInteractors f;
    private DeviceCapability g;
    private int h;
    private HealthDivider i;
    private ImageView k;
    private boolean l;
    private View m;
    private mhs n;
    private boolean o;
    private HealthTextView p;
    private HealthTextView q;
    private int s;
    private LinearLayout w;
    private RelativeLayout x;
    private HealthSubHeader y;
    private HealthTextView z;
    private HealthNumberPicker v = null;
    private String[] aq = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f24753b = null;
    private a u = new a(Looper.getMainLooper(), this);
    private CheckedChangeListener t = new CheckedChangeListener() { // from class: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.5
        @Override // com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.CheckedChangeListener
        public void onRealCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                if (!Utils.o() && !TemperatureMonitoringActivity.this.l) {
                    TemperatureMonitoringActivity.this.e(1, 0, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.5.1
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i, Object obj) {
                            if (i == 0) {
                                a(true);
                            } else {
                                closeSwitchButton();
                            }
                        }
                    });
                } else {
                    a(true);
                }
                HashMap map = new HashMap(16);
                map.put("click", 1);
                TemperatureMonitoringActivity.this.d(AnalyticsValue.CONTINUOUS_TEMPERATURE_MEASUREMENT.value(), map);
                return;
            }
            a(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(boolean z) {
            TemperatureMonitoringActivity.this.f.a(1, z ? 1 : 0, -1);
        }
    };
    private CheckedChangeListener r = new CheckedChangeListener() { // from class: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.2
        @Override // com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.CheckedChangeListener
        public void onRealCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                if (TemperatureMonitoringActivity.this.l) {
                    TemperatureMonitoringActivity.this.b(1);
                    return;
                } else {
                    TemperatureMonitoringActivity.this.e(2, 0, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.2.2
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i, Object obj) {
                            if (i == -1) {
                                closeSwitchButton();
                            }
                        }
                    });
                    return;
                }
            }
            TemperatureMonitoringActivity.this.b(0);
        }
    };
    private DialogInterface.OnClickListener j = new DialogInterface.OnClickListener() { // from class: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.4
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            int value = TemperatureMonitoringActivity.this.v.getValue();
            if (TemperatureMonitoringActivity.this.l || value == 0) {
                TemperatureMonitoringActivity.this.b(3, value);
            } else {
                TemperatureMonitoringActivity.this.e(3, value, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.4.5
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i2, Object obj) {
                        LogUtil.a("TemperatureMonitoringActivity", "createOpenHeartRateMonitoringDialog errorCode: ", Integer.valueOf(i2));
                    }
                });
            }
            if (TemperatureMonitoringActivity.this.l || value != 0) {
                return;
            }
            TemperatureMonitoringActivity.this.b(3, value);
        }
    };

    public static /* synthetic */ void b(DialogInterface dialogInterface, int i) {
    }

    abstract class CheckedChangeListener implements CompoundButton.OnCheckedChangeListener {
        private boolean ignoreSwitch;

        public abstract void onRealCheckedChanged(CompoundButton compoundButton, boolean z);

        private CheckedChangeListener() {
            this.ignoreSwitch = false;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!this.ignoreSwitch) {
                if (!TemperatureMonitoringActivity.this.af.isPressed()) {
                    LogUtil.a("TemperatureMonitoringActivity", "mOnCheckedChangeListener isn't pressed");
                    return;
                } else {
                    if (mbw.a()) {
                        LogUtil.a("TemperatureMonitoringActivity", "mOnCheckedChangeListener, isChecked:", Boolean.valueOf(z), ", mIsHeartRateSwitchStatus:", Boolean.valueOf(TemperatureMonitoringActivity.this.l));
                        onRealCheckedChanged(compoundButton, z);
                        return;
                    }
                    LogUtil.j("TemperatureMonitoringActivity", "mOnCheckedChangeListener isn't Sport Temperature.");
                    return;
                }
            }
            this.ignoreSwitch = false;
        }

        public void closeSwitchButton() {
            this.ignoreSwitch = true;
            TemperatureMonitoringActivity.this.af.setChecked(false);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_temperature_monitoring);
        clearBackgroundDrawable();
        this.f24753b = this;
        this.n = mhs.a();
        this.f = DeviceSettingsInteractors.e(BaseApplication.getContext());
        this.g = eej.c();
        this.d = mbw.d();
        mbu.e().c(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0 && (obj instanceof Boolean)) {
                    TemperatureMonitoringActivity.this.l = ((Boolean) obj).booleanValue();
                }
            }
        });
        this.o = UnitUtil.a();
        h();
        j();
    }

    private void h() {
        this.e = (CustomTitleBar) findViewById(R.id.temp_monitoring_title);
        this.f24752a = (HealthTextView) findViewById(R.id.classification_remind);
        this.x = (RelativeLayout) findViewById(R.id.temp_monitoring_switch_layout);
        this.ac = (HealthTextView) findViewById(R.id.temp_monitoring_content);
        this.ag = (HealthTextView) findViewById(R.id.temp_monitoring_desc);
        this.m = findViewById(R.id.divide_temp);
        this.y = (HealthSubHeader) findViewById(R.id.temp_remind);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.temp_upper_remind_layout);
        this.aj = linearLayout;
        linearLayout.setOnClickListener(this);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.temp_lower_remind_layout);
        this.ad = linearLayout2;
        linearLayout2.setOnClickListener(this);
        this.an = (HealthTextView) findViewById(R.id.temperature_upper_subtitle);
        this.q = (HealthTextView) findViewById(R.id.temperature_lower_subtitle);
        this.ar = (HealthTextView) findViewById(R.id.temp_upper_value_view);
        this.p = (HealthTextView) findViewById(R.id.temp_lower_value_view);
        this.am = (ImageView) findViewById(R.id.temp_upper_arrow_right_view);
        this.k = (ImageView) findViewById(R.id.temp_lower_arrow_right_view);
        this.af = (HealthSwitchButton) findViewById(R.id.temp_monitoring_switch);
        this.aa = (HealthTextView) findViewById(R.id.temp_monitoring_note);
        this.i = (HealthDivider) findViewById(R.id.divide_line);
        this.ae = (LinearLayout) findViewById(R.id.ll_temp_study_layout);
        this.al = (HealthTextView) findViewById(R.id.temp_upper_title);
        this.z = (HealthTextView) findViewById(R.id.temp_lower_title);
        this.w = (LinearLayout) findViewById(R.id.temp_linear_layout);
        if (Utils.o()) {
            this.af.setOnCheckedChangeListener(this.t);
            this.e.setTitleText(getResources().getString(R.string.IDS_continuous_monitoring_skins));
            this.ac.setText(getResources().getString(R.string.IDS_continuous_monitoring_skins));
            this.ag.setText(getResources().getString(R.string.IDS_skins_temp_subtitle));
            this.m.setVisibility(8);
            this.y.setVisibility(8);
            this.aj.setVisibility(8);
            this.ad.setVisibility(8);
            this.i.setVisibility(8);
            this.aa.setText(getResources().getString(R.string.IDS_temp_overseas_desc));
            return;
        }
        if (this.d) {
            this.af.setOnCheckedChangeListener(this.r);
            this.e.setTitleText(getResources().getString(R.string.IDS_temp_slightly_upper_remind));
            this.ac.setText(getResources().getString(R.string.IDS_temp_slightly_upper_remind));
            this.ag.setText(getResources().getString(R.string.IDS_temp_upper_subtitle, 10, mbu.e().a(this.o)));
            this.f24752a.setVisibility(0);
            this.m.setVisibility(8);
            this.y.setVisibility(8);
            this.aj.setVisibility(8);
            this.ad.setVisibility(8);
            this.i.setVisibility(8);
            this.aa.setText(getResources().getString(R.string.IDS_temp_desc_once_other, 1, 18, 2, 3));
            f();
        } else {
            this.e.setTitleText(getResources().getString(R.string.IDS_temp_monitoring));
            this.x.setVisibility(8);
            this.ag.setVisibility(8);
            this.m.setVisibility(8);
            this.aa.setText(getResources().getString(R.string.IDS_temp_desc_once_other, 1, 18, 2, 3));
            k();
        }
        g();
    }

    private void f() {
        findViewById(R.id.temperature_root_layout).setBackgroundColor(getColor(R.color.colorSubBackground));
        this.e.setTitleBarBackgroundColor(getColor(R.color.colorSubBackground));
        if (this.ae.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.ae.getLayoutParams();
            layoutParams.topMargin = (int) getResources().getDimension(R.dimen.health_common_8dp);
            layoutParams.setMarginStart((int) getResources().getDimension(R.dimen.defaultPaddingStart));
            layoutParams.setMarginEnd((int) getResources().getDimension(R.dimen.defaultPaddingStart));
            this.ae.setLayoutParams(layoutParams);
        }
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.resource_error);
        healthTextView.setTextSize(0, getResources().getDimension(com.huawei.pluginachievement.R.dimen.textSizeBody1));
        healthTextView.setTextColor(getColor(R.color.colorError));
        if (this.x.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.x.getLayoutParams();
            layoutParams2.setMarginStart((int) getResources().getDimension(R.dimen.defaultPaddingStart));
            layoutParams2.setMarginEnd((int) getResources().getDimension(R.dimen.defaultPaddingEnd));
            layoutParams2.height = (int) getResources().getDimension(R.dimen.health_common_56dp);
            this.x.setLayoutParams(layoutParams2);
        }
        this.x.setGravity(16);
        this.x.setPadding((int) getResources().getDimension(R.dimen.defaultPaddingStart), 0, (int) getResources().getDimension(R.dimen.defaultPaddingEnd), 0);
        this.x.setBackground(getDrawable(R.drawable.temperature_classification_syitch_layout_bg));
        if (this.ag.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.ag.getLayoutParams();
            layoutParams3.topMargin = (int) getResources().getDimension(R.dimen.health_common_8dp);
            this.ag.setLayoutParams(layoutParams3);
        }
    }

    private void k() {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.am.setBackgroundResource(R.drawable.common_ui_arrow_left);
            this.k.setBackgroundResource(R.drawable.common_ui_arrow_left);
        } else {
            this.am.setBackgroundResource(R.drawable.common_ui_arrow_right);
            this.k.setBackgroundResource(R.drawable.common_ui_arrow_right);
        }
    }

    private void g() {
        if (!mbw.b()) {
            LogUtil.a("TemperatureMonitoringActivity", "initTemperatureStudy not support tempStudy");
            c(true);
            return;
        }
        this.ah = new BroadcastReceiver() { // from class: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.7
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                if (intent == null || TextUtils.isEmpty(intent.getAction())) {
                    LogUtil.j("TemperatureMonitoringActivity", "mTempDataReceiver intent is null or action is empty");
                    return;
                }
                if (!mbw.a() || !mbw.b()) {
                    LogUtil.j("TemperatureMonitoringActivity", "mTempDataReceiver isn't Sport Temperature or temperatureStudy.");
                } else if (!intent.getAction().equals(mbw.c("tempStudyStatus"))) {
                    LogUtil.j("TemperatureMonitoringActivity", "mTempDataReceiver default");
                } else {
                    LogUtil.a("TemperatureMonitoringActivity", "mTempDataReceiver is tempStudyAction");
                    TemperatureMonitoringActivity.this.i();
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(mbw.c("tempStudyStatus"));
        BroadcastManagerUtil.d(this.f24753b, this.ah, intentFilter, LocalBroadcast.f36595c, null);
        mbu.e().b();
    }

    /* JADX INFO: renamed from: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity$6, reason: invalid class name */
    class AnonymousClass6 implements Runnable {
        AnonymousClass6() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ThreadPoolManager.c().a("TemperatureMonitoringActivity", new Runnable() { // from class: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.6.2
                @Override // java.lang.Runnable
                public void run() {
                    final String strC = mbw.c(mgg.c("TemperatureMonitoringActivity"));
                    if (TextUtils.isEmpty(strC)) {
                        LogUtil.j("TemperatureMonitoringActivity", "mTempDataReceiver studyDbKey is empty");
                    } else {
                        final String switchSettingFromDb = mhs.a().getSwitchSettingFromDb(strC);
                        TemperatureMonitoringActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.6.2.3
                            @Override // java.lang.Runnable
                            public void run() {
                                TemperatureMonitoringActivity.this.c(CommonUtil.n(BaseApplication.getContext(), switchSettingFromDb) == 1);
                                mhs.a().setSwitchSettingToDb(strC, "");
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.u.postDelayed(new AnonymousClass6(), 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        LogUtil.a("TemperatureMonitoringActivity", "setViewStatusByTemperatureStudy isJoin : ", Boolean.valueOf(z));
        if (Utils.o()) {
            LogUtil.a("TemperatureMonitoringActivity", "setViewStatusByTemperatureStudy isOversea");
            return;
        }
        this.ae.setVisibility(z ? 8 : 0);
        int color = getResources().getColor(R.color.colorTertiary);
        if (z) {
            color = getResources().getColor(R.color.textColorSecondary);
        }
        if (this.d) {
            this.ac.setTextColor(color);
            this.af.setEnabled(z);
            return;
        }
        if (this.f24754c == null) {
            ArrayList arrayList = new ArrayList(16);
            this.f24754c = arrayList;
            arrayList.add(this.al);
            this.f24754c.add(this.ar);
            this.f24754c.add(this.an);
            this.f24754c.add(this.z);
            this.f24754c.add(this.p);
            this.f24754c.add(this.q);
        }
        this.aj.setEnabled(z);
        this.ad.setEnabled(z);
        Iterator<HealthTextView> it = this.f24754c.iterator();
        while (it.hasNext()) {
            it.next().setTextColor(color);
        }
    }

    private void j() {
        this.ak = 0;
        this.s = 0;
        this.ai = mbu.e().c(0, String.valueOf(37.5f), this.o);
        this.ab = mbu.e().c(1, String.valueOf(35.5f), this.o);
        if (Utils.o()) {
            d();
        } else {
            e();
        }
    }

    private void e() {
        mbu.e().c(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0 && (obj instanceof Boolean)) {
                    TemperatureMonitoringActivity.this.l = ((Boolean) obj).booleanValue();
                }
                TemperatureMonitoringActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.9.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (TemperatureMonitoringActivity.this.l) {
                            if (TemperatureMonitoringActivity.this.d) {
                                TemperatureMonitoringActivity.this.b();
                                return;
                            } else {
                                TemperatureMonitoringActivity.this.a();
                                TemperatureMonitoringActivity.this.c();
                                return;
                            }
                        }
                        mbu.e().c();
                        if (TemperatureMonitoringActivity.this.d) {
                            TemperatureMonitoringActivity.this.af.setChecked(false);
                            return;
                        }
                        String strC = TemperatureMonitoringActivity.this.c(0, -1, null);
                        String strB = TemperatureMonitoringActivity.this.b(0, -1, (Object) null);
                        TemperatureMonitoringActivity.this.an.setText(strC);
                        TemperatureMonitoringActivity.this.ar.setText(strB);
                        TemperatureMonitoringActivity.this.ak = 0;
                        String strC2 = TemperatureMonitoringActivity.this.c(1, -1, null);
                        String strB2 = TemperatureMonitoringActivity.this.b(1, -1, (Object) null);
                        TemperatureMonitoringActivity.this.q.setText(strC2);
                        TemperatureMonitoringActivity.this.p.setText(strB2);
                        TemperatureMonitoringActivity.this.s = 0;
                    }
                });
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BroadcastReceiver broadcastReceiver = this.ah;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        ThreadPoolManager.c().d("TemperatureMonitoringActivity", (Runnable) null);
        super.onDestroy();
    }

    private void c(int i) {
        int i2;
        LogUtil.a("TemperatureMonitoringActivity", "createTemperatureRemindDialog()");
        this.h = i;
        mbu.e().c(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.8
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                if (i3 == 0 && (obj instanceof Boolean)) {
                    TemperatureMonitoringActivity.this.l = ((Boolean) obj).booleanValue();
                }
            }
        });
        View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(R.layout.dialog_temperature_remind, (ViewGroup) null);
        this.v = (HealthNumberPicker) viewInflate.findViewById(R.id.remind_number_picker);
        this.aq = mbu.e().b(this.o, i);
        l();
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this);
        if (i == 0) {
            i2 = R.string.IDS_temp_upper_remind;
        } else {
            i2 = R.string.IDS_temp_lower_remind;
        }
        builder.d(i2).a(viewInflate).a(R.string.IDS_settings_button_cancal_ios_btn, new DialogInterface.OnClickListener() { // from class: raf
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                TemperatureMonitoringActivity.b(dialogInterface, i3);
            }
        }).d(R.string.IDS_contact_confirm_ios_btn, this.j);
        builder.b().show();
    }

    private String d(int i) {
        if (this.h == 0) {
            if (i == 0) {
                return getResources().getString(R.string.IDS_temp_upper_default, 10);
            }
            return getResources().getString(R.string.IDS_temp_upper_subtitle, 10, this.aq[i]);
        }
        if (i == 0) {
            return getResources().getString(R.string.IDS_temp_lower_default, 10);
        }
        return getResources().getString(R.string.IDS_temp_lower_subtitle, 10, this.aq[i]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final int i, final int i2, final IBaseResponseCallback iBaseResponseCallback) {
        int i3;
        CustomTextAlertDialog.Builder builderE = new CustomTextAlertDialog.Builder(this).e(getResources().getString(R.string.IDS_temp_enable_heart_rate));
        if (this.d) {
            i3 = R.string.IDS_temp_slightly_upper_enable_content_once;
        } else {
            i3 = R.string.IDS_temp_enable_content_once;
        }
        CustomTextAlertDialog customTextAlertDialogB = builderE.b(i3).e(R.string.IDS_settings_button_cancal_ios_btn, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                iBaseResponseCallback.a(-1, null);
                LogUtil.j("TemperatureMonitoringActivity", "createOpenHeartRateMonitoringDialog, cancel");
            }
        }).a(R.string.IDS_open_immediately_string, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                iBaseResponseCallback.a(0, null);
                if (i != 1) {
                    if (TemperatureMonitoringActivity.this.g == null || !TemperatureMonitoringActivity.this.g.isSupportContinueHeartRate()) {
                        if (TemperatureMonitoringActivity.this.g != null && TemperatureMonitoringActivity.this.g.isSupportHeartRateEnable() && !TemperatureMonitoringActivity.this.g.isSupportContinueHeartRate()) {
                            LogUtil.a("TemperatureMonitoringActivity", "createOpenHeartRateMonitoringDialog, isSupportHeartRateEnable");
                            TemperatureMonitoringActivity.this.f.c(true);
                            TemperatureMonitoringActivity temperatureMonitoringActivity = TemperatureMonitoringActivity.this;
                            qpx.e(temperatureMonitoringActivity, temperatureMonitoringActivity.getResources().getString(R.string.IDS_temp_enable_heart_toast));
                            TemperatureMonitoringActivity.this.l = true;
                            TemperatureMonitoringActivity.this.b(i, i2);
                            return;
                        }
                        LogUtil.j("TemperatureMonitoringActivity", "createOpenHeartRateMonitoringDialog isn't support heart rate.");
                        return;
                    }
                    LogUtil.a("TemperatureMonitoringActivity", "createOpenHeartRateMonitoringDialog, isSupportContinueHeartRate");
                    TemperatureMonitoringActivity.this.d(i, i2);
                    return;
                }
                TemperatureMonitoringActivity temperatureMonitoringActivity2 = TemperatureMonitoringActivity.this;
                qpx.e(temperatureMonitoringActivity2, temperatureMonitoringActivity2.getResources().getString(R.string.IDS_temp_enable_heart_toast));
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        if (customTextAlertDialogB.isShowing()) {
            return;
        }
        customTextAlertDialogB.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final int i, final int i2) {
        if (!this.g.isSupportHeartRateEnable()) {
            this.f.c(1);
            LogUtil.a("TemperatureMonitoringActivity", "openContinueMeasureHeartRate open continue measure heart rate");
            qpx.e(this, getResources().getString(R.string.IDS_temp_enable_heart_toast));
            this.l = true;
            b(i, i2);
            return;
        }
        LogUtil.a("TemperatureMonitoringActivity", "openContinueMeasureHeartRate isSupportHeartRateEnable");
        this.n.getSwitchSetting("heart_rate_mode", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                final int i4;
                if (i3 == 0 && (obj instanceof String)) {
                    try {
                        i4 = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        LogUtil.a("TemperatureMonitoringActivity", "initItemSelect NumberFormatException");
                        i4 = 1;
                    }
                } else {
                    i4 = 1;
                }
                TemperatureMonitoringActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.temperature.TemperatureMonitoringActivity.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (i4 == 1) {
                            TemperatureMonitoringActivity.this.f.a(1);
                            LogUtil.a("TemperatureMonitoringActivity", "openContinueMeasureHeartRate open cycle measure heart rate");
                        } else {
                            TemperatureMonitoringActivity.this.f.c(1);
                            LogUtil.a("TemperatureMonitoringActivity", "openContinueMeasureHeartRate open continue measure heart rate");
                        }
                        qpx.e(TemperatureMonitoringActivity.this, TemperatureMonitoringActivity.this.getResources().getString(R.string.IDS_temp_enable_heart_toast));
                        TemperatureMonitoringActivity.this.l = true;
                        TemperatureMonitoringActivity.this.b(i, i2);
                    }
                });
            }
        });
    }

    private void l() {
        this.v.setDisplayedValues(this.aq);
        this.v.setMinValue(0);
        this.v.setMaxValue(this.aq.length - 1);
        this.v.setWrapSelectorWheel(false);
        if (this.h == 0) {
            int iE = e(this.aq.length, this.ak);
            this.ak = iE;
            if (iE == 0) {
                int length = this.aq.length;
                int i = this.ai;
                if (length > i) {
                    iE = i;
                }
            }
            this.v.setValue(iE);
            return;
        }
        int iE2 = e(this.aq.length, this.s);
        this.s = iE2;
        if (iE2 == 0) {
            int length2 = this.aq.length;
            int i2 = this.ab;
            if (length2 > i2) {
                iE2 = i2;
            }
        }
        this.v.setValue(iE2);
    }

    private int e(int i, int i2) {
        LogUtil.a("TemperatureMonitoringActivity", "checkTempPosition length : ", Integer.valueOf(i), ", position : ", Integer.valueOf(i2));
        if (i2 < 0 || i2 >= i) {
            return 0;
        }
        return i2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.r()) {
            return;
        }
        int id = view.getId();
        if (id == R.id.temp_upper_remind_layout) {
            c(0);
        } else if (id == R.id.temp_lower_remind_layout) {
            c(1);
        } else {
            LogUtil.j("TemperatureMonitoringActivity", "onClick default");
        }
    }

    private void d() {
        String strD = mim.d("continuous_temp_monitoring");
        LogUtil.a("TemperatureMonitoringActivity", "switch checked is ", strD);
        if (CommonUtil.n(this, strD) == 1) {
            this.af.setChecked(true);
        } else {
            this.af.setChecked(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        boolean z;
        try {
            z = ((int) (Float.parseFloat(mim.d("temperature_upper_remind")) * 10.0f)) > 0;
        } catch (NumberFormatException unused) {
            LogUtil.e("TemperatureMonitoringActivity", "getTempClassificationUpperRemindFromCloud NumberFormatException");
        }
        this.af.setChecked(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        String strD = mim.d("temperature_upper_remind");
        int i = TextUtils.isEmpty(strD) ? -1 : 0;
        this.ak = mbu.e().c(0, strD, this.o);
        String strC = c(0, i, strD);
        String strB = b(0, i, strD);
        this.an.setText(strC);
        this.ar.setText(strB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        String strD = mim.d("temperature_lower_remind");
        int i = TextUtils.isEmpty(strD) ? -1 : 0;
        this.s = mbu.e().c(1, strD, this.o);
        String strC = c(1, i, strD);
        String strB = b(1, i, strD);
        this.q.setText(strC);
        this.p.setText(strB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(int i, int i2, Object obj) {
        String string = getResources().getString(R.string.IDS_settings_about_huawei_cloud_service_action_turn_off);
        if (obj != null) {
            try {
                if (!obj.equals("0") && i2 == 0 && (obj instanceof String)) {
                    String strA = mbw.a((String) obj);
                    LogUtil.a("TemperatureMonitoringActivity", "initRemindValue, data value:", strA);
                    if (this.o && Float.parseFloat(strA) > 90.0f) {
                        strA = mbw.d(Float.parseFloat(strA));
                    }
                    if (!this.o && Float.parseFloat(strA) < 90.0f) {
                        strA = mbw.d(strA);
                    }
                    if (b(strA, i)) {
                        DecimalFormat decimalFormatE = mbw.e("0.0");
                        if (decimalFormatE != null) {
                            strA = decimalFormatE.format(Float.parseFloat(strA));
                        }
                        return getResources().getString(this.o ? R.string.IDS_settings_health_temperature_unit : R.string.IDS_temp_unit_fahrenheit, strA);
                    }
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("TemperatureMonitoringActivity", "getTempUpperRemindFromCloud, NumberFormatException.");
            }
        }
        return string;
    }

    private boolean b(String str, int i) {
        float f;
        try {
            f = Float.parseFloat(str) * 10.0f;
        } catch (NumberFormatException unused) {
            LogUtil.e("TemperatureMonitoringActivity", "isCorrectValue fixedValue : ", Float.valueOf(0.0f));
            f = 0.0f;
        }
        if (f == 0.0f) {
            return false;
        }
        if (i == 0) {
            boolean z = this.o;
            if (z && (f > 385.0f || f < 372.0f)) {
                return false;
            }
            if (z) {
                return true;
            }
            return f <= 1013.0f && f >= 990.0f;
        }
        boolean z2 = this.o;
        if (z2 && (f > 360.0f || f < 340.0f)) {
            return false;
        }
        if (z2) {
            return true;
        }
        return f <= 968.0f && f >= 932.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(int i, int i2, Object obj) {
        int i3;
        if (i2 == 0) {
            try {
                if (obj instanceof String) {
                    String strB = b(i, i2, obj);
                    if (!obj.equals("0") && !obj.equals("0.0")) {
                        Resources resources = getResources();
                        if (i == 0) {
                            i3 = R.string.IDS_temp_upper_subtitle;
                        } else {
                            i3 = R.string.IDS_temp_lower_subtitle;
                        }
                        return resources.getString(i3, 10, strB);
                    }
                    return getResources().getString(i == 0 ? R.string.IDS_temp_upper_default : R.string.IDS_temp_lower_default, 10);
                }
            } catch (NumberFormatException unused) {
                LogUtil.e("TemperatureMonitoringActivity", "getTempUpperRemindFromCloud, NumberFormatException.");
                return "";
            }
        }
        return getResources().getString(i == 0 ? R.string.IDS_temp_upper_default : R.string.IDS_temp_lower_default, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        a(i);
        c(this.ag.getText().toString(), AnalyticsValue.TEMPERATURE_UPPER_LIMIT.value());
    }

    private void a(int i) {
        this.f.a(2, i, i == 1 ? 372 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, int i2) {
        boolean z = this.l;
        if (z) {
            if (i != 1) {
                if (i == 2) {
                    LogUtil.a("TemperatureMonitoringActivity", "setTempLimitValue TEMPERATURE_REMIND_TYPE_CLASSIFICATION");
                    b(1);
                    return;
                }
                int[] iArrC = mbu.e().c(this.o, this.h);
                String strD = d(i2);
                int iC = 0;
                int i3 = i2 == 0 ? 0 : 1;
                if (i2 != 0) {
                    iC = iArrC[i2 - 1];
                    if (!this.o) {
                        iC = mbw.c(iC);
                    }
                }
                if (this.h == 0) {
                    this.an.setText(strD);
                    this.ar.setText(this.aq[i2]);
                    this.ak = i2;
                    this.f.a(2, i3, iC);
                    c(strD, AnalyticsValue.TEMPERATURE_UPPER_LIMIT.value());
                    return;
                }
                this.q.setText(strD);
                this.p.setText(this.aq[i2]);
                this.s = i2;
                this.f.a(3, i3, iC);
                c(strD, AnalyticsValue.TEMPERATURE_LOWER_LIMIT.value());
                return;
            }
        }
        LogUtil.j("TemperatureMonitoringActivity", "setTempLimitValue, error status:", Boolean.valueOf(z));
    }

    private void c(String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("tempLimitValue", str);
        d(str2, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, Map<String, Object> map) {
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    static class a extends BaseHandler<TemperatureMonitoringActivity> {
        public a(Looper looper, TemperatureMonitoringActivity temperatureMonitoringActivity) {
            super(looper, temperatureMonitoringActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(TemperatureMonitoringActivity temperatureMonitoringActivity, Message message) {
            LogUtil.j("TemperatureMonitoringActivity", "TempHandler handleMessageWhenReferenceNotNull");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
