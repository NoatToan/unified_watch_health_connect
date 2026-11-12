package com.huawei.ui.device.activity.donotdisturb;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.datatype.DataDeviceAvoidDisturbInfo;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.timepicker.HealthTimePickerDialog;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.interactors.NotificationPushInteractor;
import defpackage.eej;
import defpackage.lmf;
import defpackage.ltb;
import defpackage.mhs;
import defpackage.qpx;
import defpackage.qsl;
import defpackage.qsp;
import defpackage.rcv;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class NoDisturbSettingActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f24310a;
    private HealthSwitchButton aa;
    private HealthTextView ab;
    private RelativeLayout ac;
    private HealthTimePickerDialog ad;
    private HealthTextView ae;
    private ImageView af;
    private LinearLayout ah;
    private RelativeLayout aj;
    private HealthSwitchButton ak;
    private HealthTextView am;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CustomTitleBar f24311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthSubHeader f24312c;
    private DeviceSettingsInteractors g;
    private HealthTextView h;
    private rcv i;
    private DataDeviceAvoidDisturbInfo j;
    private LinearLayout k;
    private HealthTextView l;
    private ImageView m;
    private mhs q;
    private int r;
    private HealthTextView t;
    private NotificationPushInteractor u;
    private HealthSwitchButton v;
    private HealthTextView w;
    private RelativeLayout x;
    private RelativeLayout y;
    private HealthSwitchButton z;
    private DeviceCapability f = null;
    private boolean p = false;
    private int ai = 0;
    private int o = 0;
    private String ag = "";
    private String n = "";
    private Handler s = new b(this);
    private String e = "";
    private CompoundButton.OnCheckedChangeListener d = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.donotdisturb.NoDisturbSettingActivity.2
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            LogUtil.a("NoDisturbSettingActivity", "mNotificationSwitchOnlyWear clicked isChecked is:", Boolean.valueOf(z));
            if (eej.a(NoDisturbSettingActivity.this.e) == null || !eej.a(NoDisturbSettingActivity.this.e).isSupportWearMessagePush()) {
                qpx.b(NoDisturbSettingActivity.this.f24310a, R.string.IDS_music_management_operation_failed);
            } else {
                NoDisturbSettingActivity.this.u.d(z, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.donotdisturb.NoDisturbSettingActivity.2.4
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i, Object obj) {
                        LogUtil.a("NoDisturbSettingActivity", 1, "NoDisturbSettingActivity", "setWearMessagePushSwitchStatus errorCode is:", Integer.valueOf(i), " objectData is:", obj);
                        NoDisturbSettingActivity.this.o();
                    }
                });
            }
        }
    };

    class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<NoDisturbSettingActivity> f24322a;

        b(NoDisturbSettingActivity noDisturbSettingActivity) {
            this.f24322a = new WeakReference<>(noDisturbSettingActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("NoDisturbSettingActivity", "handleMessage message is null");
                return;
            }
            super.handleMessage(message);
            if (this.f24322a.get() == null) {
                LogUtil.j("NoDisturbSettingActivity", "handleMessage activity is null");
                return;
            }
            int i = message.what;
            if (i == 2) {
                NoDisturbSettingActivity.this.j();
                return;
            }
            if (i == 3) {
                NoDisturbSettingActivity.this.a();
                return;
            }
            if (i == 4) {
                NoDisturbSettingActivity.this.m();
                NoDisturbSettingActivity.this.q();
                if (NoDisturbSettingActivity.this.p) {
                    return;
                }
                NoDisturbSettingActivity.this.o();
                return;
            }
            if (i != 5) {
                LogUtil.j("NoDisturbSettingActivity", "handleMessage default:", Integer.valueOf(message.what));
            } else if (message.obj instanceof Boolean) {
                NoDisturbSettingActivity.this.a(((Boolean) message.obj).booleanValue());
            } else {
                LogUtil.j("NoDisturbSettingActivity", "handleMessage message.obj not instanceof Boolean");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_device_settings_nodisturb);
        this.u = new NotificationPushInteractor(this.f24310a);
        this.y = (RelativeLayout) qsp.a(this, R.id.setting_device_notification_only_wearable);
        this.w = (HealthTextView) qsp.a(this, R.id.content_only_wearable);
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) qsp.a(this, R.id.switch_button_notification_only_wearable);
        this.v = healthSwitchButton;
        healthSwitchButton.setChecked(this.u.a());
        this.v.setOnCheckedChangeListener(this.d);
        f();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.u.a()) {
            LogUtil.a("NoDisturbSettingActivity", "onResume isWearPushEnabled is true");
            this.v.setChecked(true);
        } else {
            LogUtil.a("NoDisturbSettingActivity", "onResume isWearPushEnabled is false");
            this.v.setChecked(false);
        }
        if (eej.a(this.e) != null && eej.a(this.e).isSupportWearMessagePush()) {
            this.y.setVisibility(0);
        } else {
            this.y.setVisibility(8);
        }
    }

    private void f() {
        LogUtil.a("NoDisturbSettingActivity", "initData");
        Context applicationContext = getApplicationContext();
        this.f24310a = applicationContext;
        this.g = DeviceSettingsInteractors.e(applicationContext);
        this.i = rcv.a(this.f24310a);
        this.q = mhs.a();
        if (this.g == null || this.i == null) {
            LogUtil.j("NoDisturbSettingActivity", "initData mDeviceSettingsInteractors is null or mDeviceInteractors is null");
            return;
        }
        Intent intent = getIntent();
        if (intent != null) {
            LogUtil.j("NoDisturbSettingActivity", "initData intent is null");
            this.e = intent.getStringExtra("device_id");
        }
        this.f = eej.a(this.e);
        e();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        this.r = calendar.get(11);
    }

    private void e() {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.q.getSwitchSetting("custom.avoid_disturb", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.donotdisturb.NoDisturbSettingActivity.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("DEVMGR_NoDisturbSettingActivity", "getAvoidDisturb time: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
                if (NoDisturbSettingActivity.this.isFinishing() || NoDisturbSettingActivity.this.isDestroyed()) {
                    ReleaseLogUtil.d("DEVMGR_NoDisturbSettingActivity", "onResponse isFinishing() or isDestroyed()");
                    return;
                }
                List arrayList = new ArrayList(16);
                if (i == 0 && (obj instanceof String)) {
                    String str = (String) obj;
                    ReleaseLogUtil.d("DEVMGR_NoDisturbSettingActivity", "getAvoidDisturb value = ", str);
                    try {
                        arrayList = (List) new Gson().fromJson(str, new TypeToken<List<DataDeviceAvoidDisturbInfo>>() { // from class: com.huawei.ui.device.activity.donotdisturb.NoDisturbSettingActivity.2.1
                        }.getType());
                    } catch (JsonSyntaxException unused) {
                        LogUtil.e("NoDisturbSettingActivity", "getAvoidDisturb JsonSyntaxException");
                    }
                }
                if (arrayList.isEmpty()) {
                    LogUtil.a("NoDisturbSettingActivity", "getAvoidDisturb avoidDisturbInfoList is invalid");
                    arrayList.add(new DataDeviceAvoidDisturbInfo());
                }
                NoDisturbSettingActivity.this.k();
                NoDisturbSettingActivity.this.j = (DataDeviceAvoidDisturbInfo) arrayList.get(0);
                LogUtil.a("NoDisturbSettingActivity", "getAvoidDisturb mDataDeviceAvoidDisturbInfo is:", NoDisturbSettingActivity.this.j);
                NoDisturbSettingActivity noDisturbSettingActivity = NoDisturbSettingActivity.this;
                noDisturbSettingActivity.ai = noDisturbSettingActivity.j.getDeviceAvoidDisturbStartTime();
                NoDisturbSettingActivity noDisturbSettingActivity2 = NoDisturbSettingActivity.this;
                noDisturbSettingActivity2.o = noDisturbSettingActivity2.j.getDeviceAvoidDisturbEndTime();
                NoDisturbSettingActivity.this.n();
                Message messageObtainMessage = NoDisturbSettingActivity.this.s.obtainMessage();
                messageObtainMessage.what = 4;
                NoDisturbSettingActivity.this.s.sendMessage(messageObtainMessage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        DeviceCapability deviceCapability = this.f;
        if (deviceCapability == null || !deviceCapability.isSupportQueryAllowDisturbContent()) {
            return;
        }
        int iC = this.i.c(this.e);
        if ((iC & 20) == 20) {
            this.p = true;
        }
        LogUtil.a("NoDisturbSettingActivity", "requestDeviceAllowDisturbItem allowDisturbValue is:", Integer.valueOf(iC), " mIsHaveAllowDisturbInfo is:", Boolean.valueOf(this.p));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        this.h = (HealthTextView) qsp.a(this, R.id.device_settings_disturb_des);
        this.x = (RelativeLayout) qsp.a(this, R.id.device_settings_nodisturb_start_layout);
        this.aa = (HealthSwitchButton) qsp.a(this, R.id.device_settings_nodisturb_start_switch_button);
        this.ac = (RelativeLayout) qsp.a(this, R.id.device_settings_nodisturb_scheduled_layout);
        this.z = (HealthSwitchButton) qsp.a(this, R.id.device_settings_nodisturb_scheduled_switch_button);
        g();
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.af.setImageResource(R.drawable.common_ui_arrow_left);
            this.m.setImageResource(R.drawable.common_ui_arrow_left);
        } else {
            this.af.setImageResource(R.drawable.common_ui_arrow_right);
            this.m.setImageResource(R.drawable.common_ui_arrow_right);
        }
        this.aj = (RelativeLayout) qsp.a(this, R.id.device_settings_disturb_up_layout);
        this.f24312c = (HealthSubHeader) qsp.a(this, R.id.device_settings_can_disturb_tv);
        this.ak = (HealthSwitchButton) qsp.a(this, R.id.device_settings_disturb_up_switch_button);
        i();
        this.x.setOnClickListener(this);
        this.ac.setOnClickListener(this);
        this.ah.setOnClickListener(this);
        this.k.setOnClickListener(this);
        this.aj.setOnClickListener(this);
        if (!this.p) {
            this.aj.setVisibility(8);
            this.f24312c.setVisibility(8);
        }
        h();
    }

    private void g() {
        this.ah = (LinearLayout) qsp.a(this, R.id.device_settings_nodisturb_start_time_layout);
        this.k = (LinearLayout) qsp.a(this, R.id.device_settings_nodisturb_end_time_layout);
        this.f24311b = (CustomTitleBar) qsp.a(this, R.id.device_settings_nodisturb_title_bar);
        this.ab = (HealthTextView) qsp.a(this, R.id.device_settings_nodisturb_scheduled_text);
        this.am = (HealthTextView) qsp.a(this, R.id.device_settings_nodisturb_start_time_title_tv);
        this.t = (HealthTextView) qsp.a(this, R.id.device_settings_nodisturb_end_time_title_tv);
        this.ae = (HealthTextView) qsp.a(this, R.id.device_settings_nodisturb_start_time_tv);
        this.l = (HealthTextView) qsp.a(this, R.id.device_settings_nodisturb_end_time_tv);
        this.af = (ImageView) qsp.a(this, R.id.device_settings_nodisturb_start_time_iv);
        this.m = (ImageView) qsp.a(this, R.id.device_settings_nodisturb_end_time_iv);
        HealthTextView healthTextView = this.ae;
        if (healthTextView == null) {
            ReleaseLogUtil.e("DEVMGR_NoDisturbSettingActivity", "initTimeView mStartTimeText == null");
            qsl.b("NoDisturbSettingActivity", getWindow().getDecorView(), R.id.device_settings_nodisturb_start_time_tv);
        } else {
            healthTextView.setText(this.ag);
            this.l.setText(this.n);
        }
    }

    private void h() {
        this.f24311b.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.donotdisturb.NoDisturbSettingActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (NoDisturbSettingActivity.this.i.a(NoDisturbSettingActivity.this.e) == 2) {
                    NoDisturbSettingActivity.this.l();
                } else {
                    NoDisturbSettingActivity.this.r();
                }
            }
        });
    }

    private void i() {
        NoDisturbSettingSubHeaderAdapter noDisturbSettingSubHeaderAdapter = new NoDisturbSettingSubHeaderAdapter(this.f24310a, 0);
        this.f24312c.setLayoutManager(new LinearLayoutManager(this.f24310a));
        this.f24312c.setAdapter(noDisturbSettingSubHeaderAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        String strB = ltb.b(this.ai);
        String strB2 = ltb.b(this.o);
        this.ag = this.g.a(strB);
        if (this.ai > this.o) {
            this.n = this.f24310a.getResources().getString(R.string.IDS_no_disturb_setting_next_day, this.g.a(strB2));
        } else {
            this.n = this.g.a(strB2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        LogUtil.a("NoDisturbSettingActivity", "updateViewByDisturbData mDataDeviceAvoidDisturbInfo is:", this.j);
        if (this.j.getDeviceAvoidDisturbSwitch() == 1) {
            d();
        } else {
            this.aa.setChecked(false);
            this.y.setEnabled(true);
            this.ac.setEnabled(true);
            this.v.setEnabled(true);
            this.z.setEnabled(true);
            this.w.setTextColor(getResources().getColor(R.color.textColorPrimary));
            this.ab.setTextColor(getResources().getColor(R.color.textColorPrimary));
            if (this.j.getDeviceAvoidDisturbTimeSwitch() == 1) {
                this.z.setChecked(true);
                this.ah.setEnabled(true);
                this.k.setEnabled(true);
                this.am.setTextColor(getResources().getColor(R.color.textColorPrimary));
                this.t.setTextColor(getResources().getColor(R.color.textColorPrimary));
                this.ae.setTextColor(getResources().getColor(R.color.textColorSecondary));
                this.l.setTextColor(getResources().getColor(R.color.textColorSecondary));
            } else {
                this.z.setChecked(false);
                this.ah.setEnabled(false);
                this.k.setEnabled(false);
                this.am.setTextColor(getResources().getColor(R.color.textColorTertiary));
                this.t.setTextColor(getResources().getColor(R.color.textColorTertiary));
                this.ae.setTextColor(getResources().getColor(R.color.textColorTertiary));
                this.l.setTextColor(getResources().getColor(R.color.textColorTertiary));
            }
        }
        if (this.p) {
            t();
        }
    }

    private void d() {
        this.aa.setChecked(true);
        this.y.setEnabled(false);
        this.ac.setEnabled(false);
        this.v.setEnabled(false);
        this.z.setEnabled(false);
        this.w.setTextColor(getResources().getColor(R.color.textColorTertiary));
        this.ab.setTextColor(getResources().getColor(R.color.textColorTertiary));
        this.ah.setEnabled(false);
        this.k.setEnabled(false);
        this.am.setTextColor(getResources().getColor(R.color.textColorTertiary));
        this.t.setTextColor(getResources().getColor(R.color.textColorTertiary));
        this.ae.setTextColor(getResources().getColor(R.color.textColorTertiary));
        this.l.setTextColor(getResources().getColor(R.color.textColorTertiary));
        if (this.j.getDeviceAvoidDisturbTimeSwitch() == 1) {
            this.z.setChecked(true);
        } else {
            this.z.setChecked(false);
        }
    }

    private void t() {
        this.q.getSwitchSetting("auto_light_screen", new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.donotdisturb.NoDisturbSettingActivity.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("DEVMGR_NoDisturbSettingActivity", "updateAllowDisturbInfoView errorCode = ", Integer.valueOf(i), " ; objectData = ", obj);
                boolean zEquals = true;
                if (i == 0 && (obj instanceof String)) {
                    zEquals = true ^ "0".equals((String) obj);
                }
                Message messageObtainMessage = NoDisturbSettingActivity.this.s.obtainMessage();
                messageObtainMessage.what = 5;
                messageObtainMessage.obj = Boolean.valueOf(zEquals);
                NoDisturbSettingActivity.this.s.sendMessage(messageObtainMessage);
            }
        });
        if (c()) {
            this.f24312c.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (z) {
            if ((this.j.getDeviceAvoidDisturbType() & 20) == 20) {
                this.h.setText(getResources().getString(R.string.IDS_setting_disturb_desc_turn_on));
                this.ak.setChecked(true);
                return;
            } else {
                this.h.setText(getResources().getString(R.string.IDS_setting_disturb_desc));
                this.ak.setChecked(false);
                return;
            }
        }
        this.f24312c.setVisibility(8);
        this.aj.setVisibility(8);
        this.h.setText(getResources().getString(R.string.IDS_setting_disturb_desc));
        this.ak.setChecked(false);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.x.setClickable(false);
        this.ac.setClickable(false);
        this.aj.setClickable(false);
        int id = view.getId();
        if (id == R.id.device_settings_nodisturb_scheduled_layout) {
            LogUtil.a("NoDisturbSettingActivity", "onClick device_settings_nodisturb_scheduled_layout");
            if (this.z.isChecked()) {
                this.j.setDeviceAvoidDisturbTimeSwitch(0);
            } else {
                this.j.setDeviceAvoidDisturbTimeSwitch(1);
            }
            q();
        } else if (id == R.id.device_settings_nodisturb_start_layout) {
            LogUtil.a("NoDisturbSettingActivity", "onClick device_settings_nodisturb_start_layout");
            if (this.aa.isChecked()) {
                this.j.setDeviceAvoidDisturbSwitch(0);
            } else {
                this.j.setDeviceAvoidDisturbSwitch(1);
            }
            q();
        } else if (id == R.id.device_settings_nodisturb_start_time_layout) {
            c(0);
        } else if (id == R.id.device_settings_nodisturb_end_time_layout) {
            c(1);
        } else if (id == R.id.device_settings_disturb_up_layout) {
            b();
        } else {
            LogUtil.j("NoDisturbSettingActivity", "onClick viewId is:", Integer.valueOf(id));
        }
        this.x.setClickable(true);
        this.ac.setClickable(true);
        this.aj.setClickable(true);
    }

    private void b() {
        if (this.ak.isChecked()) {
            this.j.setDeviceAvoidDisturbType(0);
        } else {
            this.j.setDeviceAvoidDisturbType(20);
        }
        q();
    }

    private void c(final int i) {
        String string;
        Calendar calendar = Calendar.getInstance();
        if (i == 0) {
            string = getResources().getString(R.string.IDS_settings_seat_long_starttime);
            calendar.set(11, this.ai / 100);
            calendar.set(12, this.ai % 100);
        } else {
            string = getResources().getString(R.string.IDS_settings_seat_long_endtime);
            calendar.set(11, this.o / 100);
            calendar.set(12, this.o % 100);
        }
        HealthTimePickerDialog healthTimePickerDialog = new HealthTimePickerDialog(this, new HealthTimePickerDialog.TimeSelectedListener() { // from class: com.huawei.ui.device.activity.donotdisturb.NoDisturbSettingActivity.3
            @Override // com.huawei.ui.commonui.timepicker.HealthTimePickerDialog.TimeSelectedListener
            public void onTimeSelected(int i2, int i3) {
                LogUtil.a("NoDisturbSettingActivity", "showNewTimeDialog hour is:", Integer.valueOf(i2), " minute is:", Integer.valueOf(i3));
                NoDisturbSettingActivity.this.r = i2;
                if (i == 0) {
                    NoDisturbSettingActivity noDisturbSettingActivity = NoDisturbSettingActivity.this;
                    noDisturbSettingActivity.ai = (noDisturbSettingActivity.r * 100) + i3;
                } else {
                    NoDisturbSettingActivity noDisturbSettingActivity2 = NoDisturbSettingActivity.this;
                    noDisturbSettingActivity2.o = (noDisturbSettingActivity2.r * 100) + i3;
                }
                NoDisturbSettingActivity.this.n();
                NoDisturbSettingActivity.this.ae.setText(NoDisturbSettingActivity.this.ag);
                NoDisturbSettingActivity.this.l.setText(NoDisturbSettingActivity.this.n);
                if (NoDisturbSettingActivity.this.ad != null) {
                    NoDisturbSettingActivity.this.ad.dismiss();
                    NoDisturbSettingActivity.this.ad = null;
                }
            }
        });
        this.ad = healthTimePickerDialog;
        healthTimePickerDialog.b(0, 0, 0, calendar.get(11), calendar.get(12));
        this.ad.e(string);
        this.ad.show();
    }

    private boolean c() {
        return this.aj.getVisibility() == 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        HashMap map = new HashMap(16);
        map.put("all_day", Integer.valueOf(this.aa.isChecked() ? 1 : 0));
        if (eej.a(this.e) != null && eej.a(this.e).isSupportWearMessagePush()) {
            map.put("not_worn", Integer.valueOf(this.v.isChecked() ? 1 : 0));
        }
        map.put("timing", Integer.valueOf(this.z.isChecked() ? 1 : 0));
        if (this.p) {
            map.put("up_hand", Integer.valueOf(this.ak.isChecked() ? 1 : 0));
        }
        lmf.d().c(this.f24310a, AnalyticsValue.SETTING_NOT_DISTURB_1090031.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        LogUtil.a("NoDisturbSettingActivity", "showNoDeviceConnectedToast");
        qpx.e(this.f24310a, R.string.IDS_connect_device_fail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.g == null) {
            LogUtil.j("NoDisturbSettingActivity", "sendCommandToDevice cause null pointer");
            return;
        }
        if (this.j.getDeviceAvoidDisturbTimeSwitch() == 1 && this.j.getDeviceAvoidDisturbSwitch() == 0) {
            int i = this.ai;
            if (i == this.o) {
                qpx.e(this, R.string.IDS_no_disturb_time_cannot_be_same);
                return;
            } else {
                this.j.setDeviceAvoidDisturbStartTime(i);
                this.j.setDeviceAvoidDisturbEndTime(this.o);
            }
        }
        LogUtil.a("NoDisturbSettingActivity", "sendCommandToDevice mDataDeviceAvoidDisturbInfo is:", this.j);
        this.g.e(this.e, this.j, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.donotdisturb.NoDisturbSettingActivity.10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (i2 != 0 || !(obj instanceof Integer) || ((Integer) obj).intValue() != 100000) {
                    NoDisturbSettingActivity.this.s.sendEmptyMessage(3);
                } else {
                    NoDisturbSettingActivity.this.s.sendEmptyMessage(2);
                    NoDisturbSettingActivity.this.o();
                }
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("NoDisturbSettingActivity", "onDestroy start");
        CommonUtil.d(this.f24310a);
        super.onDestroy();
        LogUtil.a("NoDisturbSettingActivity", "onDestroy end");
        setResult(0, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        LogUtil.a("NoDisturbSettingActivity", "handleWhenSetNoDisturbSuccess");
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        LogUtil.a("NoDisturbSettingActivity", "handleWhenSetNoDisturbFail");
        qpx.e(this.f24310a, R.string.IDS_settings_mult_alarm_clock_synchroFailed_dialog);
        finish();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
