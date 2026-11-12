package com.huawei.ui.device.activity.eventalarm;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.datatype.EventAlarmInfo;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.CheckAdapter;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.divider.HealthDivider;
import com.huawei.ui.commonui.edittext.HealthEditText;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.timepicker.HealthTimePicker;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import defpackage.eej;
import defpackage.eeq;
import defpackage.eey;
import defpackage.lvv;
import defpackage.mgg;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.rcv;
import defpackage.rdc;
import defpackage.rfo;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
public class EventAlarmClockActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f24342a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f24343c = "[\\uD800\\uDC00-\\uDBFF\\uDFFF]";
    private static String d = "|[[\\u2900-\\u2BFF]\\uFE0F]|[\\u2900-\\u2BFF]";
    private static String e = "|[[\\u2070-\\u27FF]\\uFE0F]|[\\u2070-\\u27FF]";
    private int ac;
    private RelativeLayout ad;
    private NoTitleCustomAlertDialog ae;
    private NoTitleCustomAlertDialog af;
    private int ai;
    private CustomAlertDialog aj;
    private HealthSwitchButton ak;
    private HealthTextView am;
    private HealthTextView an;
    private RelativeLayout f;
    private HealthButton g;
    private LinearLayout h;
    private rdc i;
    private CustomTitleBar k;
    private DeviceSettingsInteractors m;
    private DeviceSettingsInteractors p;
    private HealthDivider q;
    private HealthEditText r;
    private boolean w;
    private lvv y;
    private RelativeLayout z;
    private List<EventAlarmInfo> x = new ArrayList(16);
    private List<EventAlarmInfo> ag = new ArrayList(16);
    private rfo t = null;
    private Context n = null;
    private int al = 0;
    private String[] ar = new String[7];
    private String v = "";
    private String l = "";
    private boolean ab = false;
    private HealthTimePicker o = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24344b = false;
    private boolean j = false;
    private boolean aa = false;
    private Handler u = new Handler() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 2000 && EventAlarmClockActivity.this.k != null) {
                EventAlarmClockActivity.this.k.setRightButtonClickable(true);
            }
        }
    };
    private CompoundButton.OnCheckedChangeListener ah = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.9
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ReleaseLogUtil.d("R_EventAlarmClockActivity", "user change switch isChecked:", Boolean.valueOf(z));
            if (EventAlarmClockActivity.this.aa) {
                ReleaseLogUtil.d("R_EventAlarmClockActivity", "mIsSwitchEnableChange :", Boolean.valueOf(EventAlarmClockActivity.this.aa));
                return;
            }
            EventAlarmClockActivity.this.f24344b = true;
            if (z) {
                EventAlarmClockActivity.this.am.setText("");
                ReleaseLogUtil.d("R_EventAlarmClockActivity", "user change switch.");
                EventAlarmClockActivity.this.ac = 1;
                EventAlarmClockActivity.this.al = 31;
                return;
            }
            EventAlarmClockActivity.this.am.setText(R.string.IDS_only_once);
            EventAlarmClockActivity.this.ac = 0;
            EventAlarmClockActivity.this.al = 0;
        }
    };
    private InputFilter s = new InputFilter() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.13
        Pattern d = Pattern.compile(EventAlarmClockActivity.f24343c + EventAlarmClockActivity.e + EventAlarmClockActivity.d, 64);

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (!this.d.matcher(charSequence).find() || EventAlarmClockActivity.this.j) {
                return null;
            }
            return "";
        }
    };

    public static /* synthetic */ void a(DialogInterface dialogInterface, int i) {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        qrs.a((Activity) this);
        this.n = BaseApplication.getContext();
        LogUtil.a("EventAlarmClockActivity", "onCreate()");
        setContentView(R.layout.activity_event_alarm_clock);
        Intent intent = getIntent();
        if (intent != null) {
            this.l = intent.getStringExtra("device_id");
        }
        this.y = lvv.c(this.n);
        this.m = DeviceSettingsInteractors.e((Context) null);
        this.i = rdc.b(null);
        this.p = DeviceSettingsInteractors.e(this.n);
        DeviceCapability deviceCapabilityA = eej.a(this.l);
        if (deviceCapabilityA != null) {
            this.ab = deviceCapabilityA.isSupportChangeAlarm();
        }
        k();
    }

    private void k() {
        LogUtil.a("EventAlarmClockActivity", "initView()");
        this.k = (CustomTitleBar) qsp.a(this, R.id.setting_event_alarm_title_bar);
        h();
        HealthButton healthButton = (HealthButton) qsp.a(this, R.id.clock_btn_delete);
        this.g = healthButton;
        healthButton.setText(getString(R.string.IDS_settings_mult_alarm_clock_delete_title).toUpperCase(Locale.ENGLISH));
        this.g.setOnClickListener(this);
        this.h = (LinearLayout) qsp.a(this, R.id.button_wrap);
        this.an = (HealthTextView) qsp.a(this, R.id.smart_alarm_info);
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(this, R.id.smart_alarm_clock_ll);
        this.f = relativeLayout;
        relativeLayout.setOnClickListener(this);
        this.am = (HealthTextView) qsp.a(this, R.id.event_alarm_repeat);
        HealthSwitchButton healthSwitchButton = (HealthSwitchButton) qsp.a(this, R.id.skip_holiday_switch_btn);
        this.ak = healthSwitchButton;
        healthSwitchButton.setOnCheckedChangeListener(this.ah);
        RelativeLayout relativeLayout2 = (RelativeLayout) qsp.a(this, R.id.smart_alarm_holiday_ll);
        ImageView imageView = (ImageView) qsp.a(this, R.id.imgv_second_setting_clock_line);
        DeviceInfo deviceInfoC = mgg.c("EventAlarmClockActivity");
        boolean zD = eey.d(deviceInfoC, 140);
        ReleaseLogUtil.d("R_EventAlarmClockActivity", "SupportLegalHolidays is: ", Boolean.valueOf(zD));
        if (!LanguageUtil.l(this.n) || !zD) {
            imageView.setVisibility(8);
            relativeLayout2.setVisibility(8);
        }
        boolean zD2 = eey.d(deviceInfoC, 227);
        this.j = zD2;
        ReleaseLogUtil.d("R_EventAlarmClockActivity", "isSupportInputEmoji is: ", Boolean.valueOf(zD2));
        ((RelativeLayout) qsp.a(this, R.id.smart_alarm_repeat_ll)).setOnClickListener(this);
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            qsp.a(this, R.id.settings_switch).setBackgroundResource(R.drawable.common_ui_arrow_left);
            qsp.a(this, R.id.settings_alarm_name).setBackgroundResource(R.drawable.common_ui_arrow_left);
        }
        this.ad = (RelativeLayout) qsp.a(this, R.id.linear_time_wheel);
        this.z = (RelativeLayout) qsp.a(this, R.id.linear_time_wheel_bigcd);
        this.q = (HealthDivider) qsp.a(this, R.id.smart_alarm_clock_devide_image);
        if (qrs.af(this.n)) {
            this.ad.setVisibility(8);
            this.z.setVisibility(0);
            ((RelativeLayout.LayoutParams) this.q.getLayoutParams()).addRule(3, R.id.linear_time_wheel_bigcd);
        } else {
            this.ad.setVisibility(0);
            this.z.setVisibility(8);
        }
    }

    private void h() {
        this.k.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("R_EventAlarmClockActivity", "onClick() id = clock_btn_save_sure");
                if (!qrs.r()) {
                    try {
                        EventAlarmClockActivity.this.k.setRightButtonClickable(false);
                        EventAlarmClockActivity.this.l();
                        return;
                    } catch (UnsupportedEncodingException e2) {
                        LogUtil.e("EventAlarmClockActivity", "UnsupportedEncodingException is ", e2.getMessage());
                        return;
                    }
                }
                LogUtil.a("EventAlarmClockActivity", "showPromptSaveDialog() onClick() isFastClick");
            }
        });
        this.k.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("R_EventAlarmClockActivity", "onClick() id = clock_btn_save_cancel");
                EventAlarmClockActivity.this.f();
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Intent intent = super.getIntent();
        if (intent == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("from_add_button", false);
        this.w = booleanExtra;
        if (booleanExtra) {
            a((rfo) null);
        } else {
            if (intent.getSerializableExtra("from_list_item") instanceof rfo) {
                this.t = (rfo) intent.getSerializableExtra("from_list_item");
            }
            rfo rfoVar = this.t;
            if (rfoVar == null) {
                LogUtil.a("EventAlarmClockActivity", "mEventAlarmItem is null!");
            } else {
                this.al = rfoVar.j();
                a(this.t);
            }
        }
        t();
        i();
        LogUtil.a("EventAlarmClockActivity", "onResume()");
    }

    private void i() {
        ((ViewGroup) findViewById(R.id.event_alarm_clock)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_enter_short));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (this.w) {
            p();
        }
        finish();
    }

    private void t() {
        if (this.h.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.h.getLayoutParams();
            LogUtil.a("EventAlarmClockActivity", "buttonDeleteLayout changed");
            if ((isInMultiWindowMode() && qrs.g(this) < qrs.m() / 2) || getResources().getConfiguration().orientation == 2) {
                layoutParams.removeRule(12);
                layoutParams.addRule(3, R.id.smart_alarm_clock_ll);
            } else {
                layoutParams.removeRule(3);
                layoutParams.addRule(12, -1);
            }
            this.h.setLayoutParams(layoutParams);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        super.onMultiWindowModeChanged(z, configuration);
        t();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        t();
    }

    private void a(rfo rfoVar) {
        LogUtil.a("EventAlarmClockActivity", "initUiData()");
        Calendar calendar = Calendar.getInstance();
        if (rfoVar == null) {
            LogUtil.a("EventAlarmClockActivity", "null = clock");
            e(calendar.get(11), calendar.get(12));
            this.an.setText(R.string.IDS_settings_prompt);
            f24342a = this.an.getText().toString();
            this.g.setVisibility(8);
            this.k.setTitleText(getResources().getString(R.string.IDS_settings_mult_alarm_clock_add_clock));
            this.am.setText(this.i.d(this.al));
            this.aa = true;
            this.ak.setChecked(false);
            this.aa = false;
            return;
        }
        int iB = rfoVar.b();
        e(iB / 100, iB % 100);
        if (TextUtils.isEmpty(rfoVar.e())) {
            this.an.setText(R.string.IDS_settings_prompt);
            f24342a = this.an.getText().toString();
        } else {
            this.an.setText(rfoVar.e());
            f24342a = rfoVar.e();
        }
        rfo rfoVar2 = this.t;
        if (rfoVar2 == null) {
            LogUtil.j("EventAlarmClockActivity", "mEventAlarmItem is null");
            return;
        }
        int iA = rfoVar2.a();
        this.ac = iA;
        LogUtil.a("EventAlarmClockActivity", "mHolidaySwitchStatus,", Integer.valueOf(iA));
        if (this.ac == 1) {
            if (!LanguageUtil.l(this.n)) {
                this.ac = 0;
                this.al = 31;
                this.am.setText(R.string.IDS_every_day_work);
            } else {
                this.aa = true;
                this.ak.setChecked(true);
                this.aa = false;
                this.am.setText("");
            }
        } else {
            this.am.setText(this.t.d());
            this.aa = true;
            this.ak.setChecked(false);
            this.aa = false;
        }
        this.k.setTitleText(getResources().getString(R.string.IDS_settings_mult_alarm_clock_edit_title));
    }

    private void c(EditText editText) {
        ArrayList arrayList = new ArrayList(Arrays.asList(editText.getFilters()));
        arrayList.add(this.s);
        editText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[arrayList.size()]));
    }

    private void e(int i, int i2) {
        this.o = (HealthTimePicker) findViewById(R.id.hw_health_timepicker);
        if (qrs.af(this.n)) {
            this.o = (HealthTimePicker) findViewById(R.id.hw_health_timepicker_bigcd);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(12, i2);
        this.o.setTime(i, i2);
        this.ai = (this.o.getHour() * 100) + this.o.getMinute();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        CommonUtil.d(this.n);
        super.onDestroy();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtil.a("EventAlarmClockActivity", "onClick()");
        if (qrs.c(500)) {
            LogUtil.j("EventAlarmClockActivity", "onClick() view click too fast");
            return;
        }
        int id = view.getId();
        if (id == R.id.clock_btn_delete) {
            ReleaseLogUtil.d("R_EventAlarmClockActivity", "onClick() id = clock_btn_delete");
            r();
            return;
        }
        if (id == R.id.smart_alarm_repeat_ll) {
            this.f24344b = true;
            ReleaseLogUtil.d("EventAlarmClockActivity", "onClick() id = smart_alarm_repeat_ll");
            y();
        } else {
            if (id == R.id.smart_alarm_clock_ll) {
                this.f24344b = true;
                ReleaseLogUtil.d("R_EventAlarmClockActivity", "onClick() id = smart_alarm_clock_ll");
                o();
                return;
            }
            LogUtil.a("EventAlarmClockActivity", "onClick() id = ", Integer.valueOf(id));
        }
    }

    private void y() {
        String strE = this.i.e(Integer.toBinaryString(this.al), 7);
        int length = strE.length();
        boolean[] zArr = new boolean[length];
        int i = 1;
        while (true) {
            boolean z = false;
            if (i >= length) {
                break;
            }
            if (strE.charAt(length - i) == '1') {
                z = true;
            }
            zArr[i] = z;
            i++;
        }
        zArr[0] = strE.charAt(0) == '1';
        this.ar = new String[]{this.n.getString(R.string.IDS_sunday), this.n.getString(R.string.IDS_monday), this.n.getString(R.string.IDS_tuesday), this.n.getString(R.string.IDS_wednesday), this.n.getString(R.string.IDS_thursday), this.n.getString(R.string.IDS_friday), this.n.getString(R.string.IDS_saturday)};
        final CheckAdapter checkAdapter = new CheckAdapter(this.n, this.ar, zArr);
        ListView listView = new ListView(this.n);
        listView.setDivider(null);
        listView.setAdapter((ListAdapter) checkAdapter);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        listView.setLayoutParams(layoutParams);
        listView.setOnItemClickListener(new CheckAdapter.OnMultiItemClick());
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this).d(R.string.IDS_settings_repeat).a(listView).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: quy
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ReleaseLogUtil.d("R_EventAlarmClockActivity", "showRepeatDialog cancel");
            }
        }).d(R.string.IDS_hw_show_confirm, new DialogInterface.OnClickListener() { // from class: qvb
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.e.e(checkAdapter, dialogInterface, i2);
            }
        }).b();
        this.aj = customAlertDialogB;
        customAlertDialogB.show();
    }

    public /* synthetic */ void e(CheckAdapter checkAdapter, DialogInterface dialogInterface, int i) {
        ReleaseLogUtil.d("R_EventAlarmClockActivity", "showRepeatDialog ok");
        boolean[] zArrB = checkAdapter.b();
        if (zArrB == null) {
            LogUtil.a("EventAlarmClockActivity", "checkedItems is null");
            return;
        }
        this.al = this.i.e(zArrB);
        HealthTextView healthTextView = this.am;
        rdc rdcVar = this.i;
        healthTextView.setText(rdcVar.d(rdcVar.e(zArrB)));
        this.ac = 0;
        this.aa = true;
        this.ak.setChecked(false);
        this.aa = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        setResult(11, new Intent());
        ReleaseLogUtil.d("R_EventAlarmClockActivity", "setResultData()");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.y.b(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.15
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("R_EventAlarmClockActivity", "deleteClock()", Integer.valueOf(EventAlarmClockActivity.this.t.f()));
                if (i == 0 && (obj instanceof List)) {
                    EventAlarmClockActivity.this.x = (List) obj;
                }
                if (!EventAlarmClockActivity.this.x.isEmpty() && EventAlarmClockActivity.this.x.size() > EventAlarmClockActivity.this.t.f() - 1) {
                    EventAlarmClockActivity.this.x.remove(EventAlarmClockActivity.this.t.f() - 1);
                    int i2 = 0;
                    while (i2 < EventAlarmClockActivity.this.x.size()) {
                        EventAlarmInfo eventAlarmInfo = (EventAlarmInfo) EventAlarmClockActivity.this.x.get(i2);
                        i2++;
                        eventAlarmInfo.setEventAlarmIndex(i2);
                        ReleaseLogUtil.d("R_EventAlarmClockActivity", "deleteClock mEventAlarmList = ", eventAlarmInfo.toString());
                    }
                } else {
                    ReleaseLogUtil.d("R_EventAlarmClockActivity", "deleteClock() error");
                }
                EventAlarmClockActivity.this.s();
                EventAlarmClockActivity.this.m.c(EventAlarmClockActivity.this.x, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.15.1
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i3, Object obj2) {
                        if (i3 == 0) {
                            ReleaseLogUtil.d("R_EventAlarmClockActivity", "deleteClock() success");
                            EventAlarmClockActivity.this.p();
                            EventAlarmClockActivity.this.finish();
                            return;
                        }
                        ReleaseLogUtil.d("R_EventAlarmClockActivity", "deleteClock() failed, errorCode is ", Integer.valueOf(i3));
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        String strE = SharedPreferenceManager.e(this.n, String.valueOf(10022), "DEVICE_EVENT_ALARM_INFO");
        if (!TextUtils.isEmpty(strE)) {
            this.x = (List) new Gson().fromJson(strE, new TypeToken<List<EventAlarmInfo>>() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.7
            }.getType());
        }
        ReleaseLogUtil.d("R_EventAlarmClockActivity", "deleteDeviceClock() mEventAlarmList is ", Integer.valueOf(this.x.size()), ",mEventAlarmList = ", this.x.toString());
        if (this.x.isEmpty() || this.x.size() <= this.t.f() - 1) {
            ReleaseLogUtil.d("R_EventAlarmClockActivity", "deleteDeviceClock() error");
        } else {
            this.x.remove(this.t.f() - 1);
            int i = 0;
            while (i < this.x.size()) {
                EventAlarmInfo eventAlarmInfo = this.x.get(i);
                i++;
                eventAlarmInfo.setEventAlarmIndex(i);
                ReleaseLogUtil.d("R_EventAlarmClockActivity", "deleteDeviceClock mEventAlarmList is ", eventAlarmInfo.toString());
            }
        }
        this.p.d(this.x);
        p();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (rcv.a(this.n).a(this.l) != 2) {
            runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.16
                @Override // java.lang.Runnable
                public void run() {
                    ReleaseLogUtil.d("R_EventAlarmClockActivity", "showNoConnectedToast()");
                    qpx.e(EventAlarmClockActivity.this.n, R.string.IDS_device_not_connect);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() throws UnsupportedEncodingException {
        ReleaseLogUtil.d("R_EventAlarmClockActivity", "saveClock()");
        if (TextUtils.isEmpty(this.an.getText().toString().trim())) {
            ReleaseLogUtil.d("R_EventAlarmClockActivity", "info is null");
            this.an.setText(R.string.IDS_settings_prompt);
            f24342a = this.an.getText().toString();
        }
        if (this.w) {
            if (this.ab) {
                g();
                return;
            } else {
                c();
                return;
            }
        }
        if (this.ab) {
            v();
        } else {
            u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        LogUtil.a("EventAlarmClockActivity", "clickCancelBtn()");
        q();
    }

    private void c() {
        LogUtil.a("EventAlarmClockActivity", "addAlarm()");
        this.ag.clear();
        this.y.b(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.18
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("EventAlarmClockActivity", "addAlarm() getEventAlarm() errorCode is ", Integer.valueOf(i));
                if (i == 0 && (obj instanceof List)) {
                    EventAlarmClockActivity.this.x = (List) obj;
                }
                for (int i2 = 0; i2 < EventAlarmClockActivity.this.x.size(); i2++) {
                    EventAlarmInfo eventAlarmInfo = (EventAlarmInfo) EventAlarmClockActivity.this.x.get(i2);
                    eventAlarmInfo.setEventAlarmIndex(i2 + 2);
                    EventAlarmClockActivity.this.ag.add(eventAlarmInfo);
                }
                int hour = (EventAlarmClockActivity.this.o.getHour() * 100) + EventAlarmClockActivity.this.o.getMinute();
                EventAlarmInfo eventAlarmInfo2 = new EventAlarmInfo();
                eventAlarmInfo2.setEventAlarmStartTimeHour(hour / 100);
                eventAlarmInfo2.setEventAlarmStartTimeMins(hour % 100);
                eventAlarmInfo2.setEventAlarmRepeat(EventAlarmClockActivity.this.al);
                eventAlarmInfo2.setEventAlarmName(EventAlarmClockActivity.this.an.getText().toString());
                eventAlarmInfo2.setEventAlarmLegalHolidayEnable(EventAlarmClockActivity.this.ac);
                eventAlarmInfo2.setCreateTimestamp(System.currentTimeMillis());
                eventAlarmInfo2.setModifiedTimestamp(System.currentTimeMillis());
                eventAlarmInfo2.setEventAlarmEnable(1);
                eventAlarmInfo2.setEventAlarmIndex(1);
                EventAlarmClockActivity.this.ag.add(0, eventAlarmInfo2);
                EventAlarmClockActivity.this.s();
                EventAlarmClockActivity.this.m.c(EventAlarmClockActivity.this.ag, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.18.3
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i3, Object obj2) {
                        LogUtil.a("EventAlarmClockActivity", "addAlarm() errorCode is ", Integer.valueOf(i3));
                        EventAlarmClockActivity.this.p();
                        EventAlarmClockActivity.this.u.sendEmptyMessage(2000);
                        EventAlarmClockActivity.this.finish();
                    }
                });
                LogUtil.a("EventAlarmClockActivity", "addAlarm() mNewEventAlarmList", EventAlarmClockActivity.this.ag);
            }
        });
    }

    private void g() {
        LogUtil.a("EventAlarmClockActivity", "addDeviceAlarm()");
        this.ag.clear();
        String strE = SharedPreferenceManager.e(this.n, String.valueOf(10022), "DEVICE_EVENT_ALARM_INFO");
        if (!TextUtils.isEmpty(strE)) {
            this.x = (List) new Gson().fromJson(strE, new TypeToken<List<EventAlarmInfo>>() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.10
            }.getType());
        }
        LogUtil.a("EventAlarmClockActivity", "addDeviceAlarm() + mEventAlarmList.size()", Integer.valueOf(this.x.size()));
        for (int i = 0; i < this.x.size(); i++) {
            EventAlarmInfo eventAlarmInfo = this.x.get(i);
            eventAlarmInfo.setEventAlarmIndex(i + 2);
            if (TextUtils.isEmpty(eventAlarmInfo.getEventAlarmName())) {
                eventAlarmInfo.setEventAlarmName(this.an.getText().toString());
            }
            this.ag.add(eventAlarmInfo);
        }
        int hour = (this.o.getHour() * 100) + this.o.getMinute();
        EventAlarmInfo eventAlarmInfo2 = new EventAlarmInfo();
        eventAlarmInfo2.setEventAlarmStartTimeHour(hour / 100);
        eventAlarmInfo2.setEventAlarmStartTimeMins(hour % 100);
        eventAlarmInfo2.setEventAlarmRepeat(this.al);
        eventAlarmInfo2.setEventAlarmName(this.an.getText().toString());
        eventAlarmInfo2.setEventAlarmLegalHolidayEnable(this.ac);
        eventAlarmInfo2.setCreateTimestamp(System.currentTimeMillis());
        eventAlarmInfo2.setModifiedTimestamp(System.currentTimeMillis());
        LogUtil.a("EventAlarmClockActivity", "addDeviceAlarm() mTextViewInfo.getText().toString() is ", this.an.getText().toString());
        eventAlarmInfo2.setEventAlarmEnable(1);
        eventAlarmInfo2.setEventAlarmIndex(1);
        if (this.ag.size() <= lvv.c(BaseApplication.getContext()).j()) {
            this.ag.add(0, eventAlarmInfo2);
        }
        s();
        this.p.d(this.ag);
        p();
        this.u.sendEmptyMessage(2000);
        finish();
        ReleaseLogUtil.d("R_EventAlarmClockActivity", "addDeviceAlarm() mNewEventAlarmList", this.ag);
    }

    private void u() {
        ReleaseLogUtil.d("R_EventAlarmClockActivity", "updateEventAlarm()");
        this.ag.clear();
        int hour = this.o.getHour();
        final int minute = (hour * 100) + this.o.getMinute();
        this.y.b(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0 && (obj instanceof List)) {
                    EventAlarmClockActivity.this.x = (List) obj;
                }
                EventAlarmClockActivity.this.e(minute);
                ReleaseLogUtil.d("R_EventAlarmClockActivity", "updateEventAlarm() mNewEventAlarmList", EventAlarmClockActivity.this.ag);
                EventAlarmClockActivity.this.s();
                EventAlarmClockActivity.this.m.c(EventAlarmClockActivity.this.ag, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.5.5
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i2, Object obj2) {
                        EventAlarmClockActivity.this.p();
                        EventAlarmClockActivity.this.u.sendEmptyMessage(2000);
                        EventAlarmClockActivity.this.finish();
                    }
                });
            }
        });
    }

    private void v() {
        ReleaseLogUtil.d("R_EventAlarmClockActivity", "updateEventAlarm()");
        this.ag.clear();
        int hour = this.o.getHour();
        int minute = this.o.getMinute();
        String strE = SharedPreferenceManager.e(this.n, String.valueOf(10022), "DEVICE_EVENT_ALARM_INFO");
        if (!TextUtils.isEmpty(strE)) {
            this.x = (List) new Gson().fromJson(strE, new TypeToken<List<EventAlarmInfo>>() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.12
            }.getType());
        }
        e((hour * 100) + minute);
        ReleaseLogUtil.d("R_EventAlarmClockActivity", "updateEventAlarm() mNewEventAlarmList", this.ag);
        this.p.d(this.ag);
        this.u.sendEmptyMessage(2000);
        p();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i) {
        long createTimestamp;
        if (!this.x.isEmpty() && this.x.size() > this.t.f() - 1) {
            createTimestamp = this.x.get(this.t.f() - 1).getCreateTimestamp();
            this.x.remove(this.t.f() - 1);
        } else {
            LogUtil.a("EventAlarmClockActivity", "updateEventAlarm() error");
            createTimestamp = 0;
        }
        for (int i2 = 0; i2 < this.x.size(); i2++) {
            EventAlarmInfo eventAlarmInfo = this.x.get(i2);
            eventAlarmInfo.setEventAlarmIndex(i2 + 2);
            this.ag.add(eventAlarmInfo);
        }
        EventAlarmInfo eventAlarmInfo2 = new EventAlarmInfo();
        eventAlarmInfo2.setEventAlarmStartTimeHour(i / 100);
        eventAlarmInfo2.setEventAlarmStartTimeMins(i % 100);
        eventAlarmInfo2.setEventAlarmRepeat(this.al);
        eventAlarmInfo2.setEventAlarmName(this.an.getText().toString());
        eventAlarmInfo2.setEventAlarmLegalHolidayEnable(this.ac);
        eventAlarmInfo2.setCreateTimestamp(createTimestamp);
        eventAlarmInfo2.setModifiedTimestamp(System.currentTimeMillis());
        eventAlarmInfo2.setEventAlarmEnable(1);
        eventAlarmInfo2.setEventAlarmIndex(1);
        this.ag.add(0, eventAlarmInfo2);
    }

    private boolean n() {
        return this.ai != (this.o.getHour() * 100) + this.o.getMinute();
    }

    private void q() {
        if (!this.f24344b && !n()) {
            LogUtil.a("EventAlarmClockActivity", "AlarmHasNoChanges");
            finish();
            return;
        }
        LogUtil.a("EventAlarmClockActivity", "showPromptSaveDialog()");
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.b(R.string.IDS_alarm_settings_save_changes).a(getResources().getString(R.string.IDS_save).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("R_EventAlarmClockActivity", "showPromptSaveDialog() Yes ...");
                if (!qrs.r()) {
                    try {
                        EventAlarmClockActivity.this.l();
                    } catch (UnsupportedEncodingException e2) {
                        LogUtil.e("EventAlarmClockActivity", "UnsupportedEncodingException is ", e2.getMessage());
                    }
                    EventAlarmClockActivity.this.ae.cancel();
                    return;
                }
                LogUtil.a("EventAlarmClockActivity", "showPromptSaveDialog() onClick() isFastClick");
            }
        }).d(getResources().getString(R.string.IDS_btn_discard).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.a("R_EventAlarmClockActivity", "showPromptSaveDialog() No ...");
                EventAlarmClockActivity.this.p();
                EventAlarmClockActivity.this.finish();
                EventAlarmClockActivity.this.ae.cancel();
            }
        });
        builder.b(true);
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.ae = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.ae.show();
    }

    private void r() {
        ReleaseLogUtil.d("R_EventAlarmClockActivity", "showPromptSaveDialog()");
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this);
        builder.b(R.string.IDS_alarm_settings_delete).a(getResources().getString(R.string.IDS_music_management_delete).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.a("R_EventAlarmClockActivity", "showPromptDeleteDialog() yes ...");
                if (EventAlarmClockActivity.this.ab) {
                    EventAlarmClockActivity.this.m();
                } else {
                    EventAlarmClockActivity.this.j();
                }
                EventAlarmClockActivity.this.af.cancel();
            }
        }).d(getResources().getString(R.string.IDS_settings_button_cancal).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("R_EventAlarmClockActivity", "showPromptDeleteDialog() no ...");
                EventAlarmClockActivity.this.af.cancel();
            }
        });
        builder.b(true);
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.af = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.af.show();
    }

    private void b(final HealthButton healthButton) {
        this.r.addTextChangedListener(new TextWatcher() { // from class: com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity.6
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                EventAlarmClockActivity eventAlarmClockActivity = EventAlarmClockActivity.this;
                String strC = eventAlarmClockActivity.c(eventAlarmClockActivity.r.getText().toString());
                if (eeq.a(strC).length() / 2 > 24) {
                    EventAlarmClockActivity eventAlarmClockActivity2 = EventAlarmClockActivity.this;
                    eventAlarmClockActivity2.v = eventAlarmClockActivity2.e(strC, strC.length() - 1);
                    EventAlarmClockActivity.this.r.setText(EventAlarmClockActivity.this.v);
                    EventAlarmClockActivity.this.r.setSelection(EventAlarmClockActivity.this.v.length());
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                if (" ".equals(editable.toString().trim())) {
                    healthButton.setEnabled(true);
                }
                healthButton.setEnabled(!TextUtils.isEmpty(editable));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(String str, int i) {
        int i2 = i - 1;
        if (Character.isHighSurrogate(str.charAt(i2))) {
            ReleaseLogUtil.d("R_EventAlarmClockActivity", "isHighSurrogate : " + str.charAt(i2));
            i = i2;
        }
        return str.substring(0, i);
    }

    private void o() {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.commonui_dialog_single_edit, (ViewGroup) null);
        HealthEditText healthEditText = (HealthEditText) viewInflate.findViewById(R.id.edit);
        this.r = healthEditText;
        c(healthEditText);
        if (f24342a == null) {
            f24342a = getString(R.string.IDS_settings_prompt);
        }
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this);
        b(builder.c());
        this.r.setText(f24342a);
        HealthEditText healthEditText2 = this.r;
        healthEditText2.setSelection(healthEditText2.getText().length());
        builder.d(R.string.IDS_settings_alarm_name).a(viewInflate).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: qva
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EventAlarmClockActivity.a(dialogInterface, i);
            }
        }).d(R.string.IDS_settings_button_ok, new DialogInterface.OnClickListener() { // from class: qvh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.d.d(dialogInterface, i);
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        customAlertDialogB.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: qve
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.d.b(dialogInterface);
            }
        });
        customAlertDialogB.setOnShowListener(new DialogInterface.OnShowListener() { // from class: qvd
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.d.e(dialogInterface);
            }
        });
        customAlertDialogB.show();
    }

    public /* synthetic */ void d(DialogInterface dialogInterface, int i) {
        String strC = c(this.r.getText().toString());
        f24342a = strC;
        this.an.setText(strC);
    }

    public /* synthetic */ void b(DialogInterface dialogInterface) {
        ((InputMethodManager) this.n.getSystemService(InputMethodManager.class)).hideSoftInputFromWindow(this.r.getWindowToken(), 2);
        this.r.clearFocus();
    }

    public /* synthetic */ void e(DialogInterface dialogInterface) {
        this.r.postDelayed(new Runnable() { // from class: qvc
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a();
            }
        }, 100L);
    }

    public /* synthetic */ void a() {
        this.r.requestFocus();
        ((InputMethodManager) this.n.getSystemService(InputMethodManager.class)).showSoftInput(this.r, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String c(String str) {
        return str.replaceAll("(\r\n|\r|\n|\n\r)", " ");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            f();
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
