package com.huawei.ui.device.activity.smartalarm;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.datatype.SmartAlarmInfo;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.adapter.CheckAdapter;
import com.huawei.ui.commonui.adapter.SingleCheckAdapter;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.timepicker.HealthTimePicker;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.smartalarm.SmartAlarmClockActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import defpackage.eej;
import defpackage.lvv;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.rcv;
import defpackage.rdc;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class SmartAlarmClockActivity extends BaseActivity implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RelativeLayout f24721a;
    private RelativeLayout ab;
    private CustomAlertDialog ac;
    private HealthTextView ag;
    private CustomAlertDialog ah;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f24723c;
    private HealthTextView d;
    private rdc e;
    private CustomTitleBar f;
    private View g;
    private DeviceSettingsInteractors h;
    private CommonDialog21 l;
    private NoTitleCustomAlertDialog m;
    private lvv n;
    private int p;
    private int q;
    private int r;
    private HealthTextView s;
    private int t;
    private int u;
    private int v;
    private int x;
    private String[] y;
    private RelativeLayout z;
    private List<SmartAlarmInfo> w = new ArrayList(16);
    private String[] ae = new String[7];
    private int ai = 31;
    private boolean[] ad = {false, true, false, false};
    private int aa = 1;
    private Handler j = new a(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f24722b = "";
    private boolean k = false;
    private HealthTimePicker i = null;
    private AdapterView.OnItemClickListener o = new AdapterView.OnItemClickListener() { // from class: com.huawei.ui.device.activity.smartalarm.SmartAlarmClockActivity.4
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SmartAlarmClockActivity.this.aa = i;
            SmartAlarmClockActivity.this.a();
            String str = SmartAlarmClockActivity.this.y[SmartAlarmClockActivity.this.aa];
            LogUtil.a("SmartAlarmClockActivity", "mSmartWakeArrayPosition:", Integer.valueOf(SmartAlarmClockActivity.this.aa), " aheadTime:", str);
            SmartAlarmClockActivity smartAlarmClockActivity = SmartAlarmClockActivity.this;
            smartAlarmClockActivity.c(smartAlarmClockActivity.aa);
            SmartAlarmClockActivity.this.d.setText(str);
            LogUtil.a("SmartAlarmClockActivity", "dialogAheadTime onClick after replace aheadTime:", str);
            SmartAlarmClockActivity.this.l();
        }
    };

    public static /* synthetic */ void c(DialogInterface dialogInterface, int i) {
    }

    class a extends Handler {
        WeakReference<SmartAlarmClockActivity> d;

        a(SmartAlarmClockActivity smartAlarmClockActivity) {
            this.d = new WeakReference<>(smartAlarmClockActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (this.d.get() == null) {
                LogUtil.j("SmartAlarmClockActivity", "activity is null");
                return;
            }
            int i = message.what;
            if (i == 1) {
                SmartAlarmClockActivity.this.x();
                return;
            }
            if (i == 3) {
                SmartAlarmClockActivity.this.k();
                return;
            }
            if (i == 4) {
                LogUtil.j("SmartAlarmClockActivity", "save alarm timeout");
            } else if (i == 5) {
                SmartAlarmClockActivity.this.o();
            } else {
                LogUtil.a("SmartAlarmClockActivity", "handleMessage unknow message what");
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_alarm_smart_clock_black);
        this.f24723c = BaseApplication.getContext();
        Intent intent = getIntent();
        if (intent != null) {
            this.f24722b = intent.getStringExtra("device_id");
        }
        this.n = lvv.c(this.f24723c);
        this.h = DeviceSettingsInteractors.e((Context) null);
        this.e = rdc.b(null);
        this.y = new String[]{UnitUtil.e(5.0d, 1, 0), UnitUtil.e(10.0d, 1, 0), UnitUtil.e(20.0d, 1, 0), UnitUtil.e(30.0d, 1, 0)};
        DeviceCapability deviceCapabilityA = eej.a(this.f24722b);
        if (deviceCapabilityA != null) {
            this.k = deviceCapabilityA.isSupportChangeAlarm();
        }
        g();
        this.j.sendEmptyMessageDelayed(3, 1000L);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("SmartAlarmClockActivity", "mIsSupportChangeAlarm() ", Boolean.valueOf(this.k));
        if (this.k) {
            h();
        } else {
            i();
        }
        Intent intent = getIntent();
        if (intent != null) {
            int intExtra = intent.getIntExtra("key_to_smart_alarm_activity", 0);
            d(intExtra / 100, intExtra % 100);
        }
        c();
    }

    private void c() {
        ((ViewGroup) findViewById(R.id.smart_alarm_clock_black)).startAnimation(AnimationUtils.loadAnimation(this, R.anim.left_enter_short));
    }

    private void i() {
        LogUtil.a("SmartAlarmClockActivity", "getSmartAlarm()");
        this.n.a(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.smartalarm.SmartAlarmClockActivity.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("R_SmartAlarmClockActivity", "getSmartAlarm() errorCode = ", Integer.valueOf(i));
                if (obj instanceof List) {
                    SmartAlarmClockActivity.this.w = (List) obj;
                }
                SmartAlarmClockActivity.this.q();
            }
        });
    }

    private void h() {
        this.h.c(this.f24722b, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.smartalarm.SmartAlarmClockActivity.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("R_SmartAlarmClockActivity", "getDeviceSmartAlarm() errorCode =", Integer.valueOf(i), ",objData = ", obj);
                SmartAlarmClockActivity smartAlarmClockActivity = SmartAlarmClockActivity.this;
                smartAlarmClockActivity.w = smartAlarmClockActivity.h.a(obj);
                SmartAlarmClockActivity.this.q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        List<SmartAlarmInfo> list = this.w;
        if (list == null || list.isEmpty()) {
            SmartAlarmInfo smartAlarmInfo = new SmartAlarmInfo();
            ArrayList arrayList = new ArrayList(16);
            this.w = arrayList;
            arrayList.add(smartAlarmInfo);
        }
        SmartAlarmInfo smartAlarmInfo2 = this.w.get(0);
        ReleaseLogUtil.d("R_SmartAlarmClockActivity", "initView mSmartAlarmList.size()", Integer.valueOf(this.w.size()));
        this.q = smartAlarmInfo2.getSmartAlarmIndex();
        this.r = smartAlarmInfo2.getSmartAlarmEnable();
        this.v = smartAlarmInfo2.getSmartAlarmStartTimeHour();
        this.u = smartAlarmInfo2.getSmartAlarmStartTimeMins();
        this.x = smartAlarmInfo2.getSmartAlarmRepeat();
        if (smartAlarmInfo2.getSmartAlarmAheadTime() == 0) {
            smartAlarmInfo2.setSmartAlarmAheadTime(5);
        }
        int smartAlarmAheadTime = smartAlarmInfo2.getSmartAlarmAheadTime();
        this.p = smartAlarmAheadTime;
        ReleaseLogUtil.d("R_SmartAlarmClockActivity", "initData mSmartAlarmIndex =", Integer.valueOf(this.q), "initData mSmartAlarmEnable =", Integer.valueOf(this.r), "SmartAlarmClockActivity", "mSmartAlarmStartHourTime = ", Integer.valueOf(this.v), "mSmartAlarmStartMinTime =", Integer.valueOf(this.u), "mSmartAlarmRepeat =", Integer.valueOf(this.x), "mSmartAlarmAheadTime =", Integer.valueOf(smartAlarmAheadTime));
        a(this.p);
        this.ai = this.x;
        this.j.sendEmptyMessage(1);
    }

    private void g() {
        LogUtil.a("SmartAlarmClockActivity", "initView enters");
        this.f = (CustomTitleBar) qsp.a(this, R.id.smart_alarm_title_bar);
        b();
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            ((ImageView) qsp.a(this, R.id.arrow)).setBackgroundResource(R.drawable.common_ui_arrow_left);
            ((ImageView) qsp.a(this, R.id.settings_switch)).setBackgroundResource(R.drawable.common_ui_arrow_left);
        }
        f();
        if (qrs.af(this.f24723c)) {
            this.z.setVisibility(8);
            this.ab.setVisibility(0);
            if (this.g.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.g.getLayoutParams()).addRule(3, R.id.linear_time_wheel_bigcd);
                return;
            }
            return;
        }
        this.z.setVisibility(0);
        this.ab.setVisibility(8);
    }

    private void b() {
        this.f.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.smartalarm.SmartAlarmClockActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.r()) {
                    if (SmartAlarmClockActivity.this.n()) {
                        SmartAlarmClockActivity.this.m();
                        return;
                    }
                    if (SmartAlarmClockActivity.this.r == 0) {
                        SmartAlarmClockActivity.this.r = 1;
                        SmartAlarmClockActivity.this.m();
                        return;
                    }
                    rcv rcvVarA = rcv.a(SmartAlarmClockActivity.this.f24723c);
                    if (SmartAlarmClockActivity.this.k && rcvVarA.a(SmartAlarmClockActivity.this.f24722b) != 2) {
                        qpx.e(SmartAlarmClockActivity.this.f24723c, R.string.IDS_alarm_settings_tip_disconnect_modify);
                    }
                    ReleaseLogUtil.d("SmartAlarmClockActivity", "addTitleBarListener device is not connect.");
                    SmartAlarmClockActivity.this.finish();
                    return;
                }
                LogUtil.a("SmartAlarmClockActivity", "onClick() isFastClick");
            }
        });
        this.f.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.smartalarm.SmartAlarmClockActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (SmartAlarmClockActivity.this.n()) {
                    SmartAlarmClockActivity smartAlarmClockActivity = SmartAlarmClockActivity.this;
                    smartAlarmClockActivity.a((Context) smartAlarmClockActivity);
                } else {
                    SmartAlarmClockActivity.this.finish();
                }
            }
        });
    }

    private void f() {
        this.ag = (HealthTextView) qsp.a(this, R.id.smart_alarm__prompt_description);
        this.d = (HealthTextView) qsp.a(this, R.id.smart_alarm_ahead_time);
        this.s = (HealthTextView) qsp.a(this, R.id.event_alarm_repeat);
        RelativeLayout relativeLayout = (RelativeLayout) qsp.a(this, R.id.smart_alarm_ahead_time_ll);
        this.f24721a = relativeLayout;
        relativeLayout.setOnClickListener(this);
        ((RelativeLayout) qsp.a(this, R.id.smart_alarm_repeat_ll)).setOnClickListener(this);
        this.z = (RelativeLayout) qsp.a(this, R.id.linear_time_wheel);
        this.ab = (RelativeLayout) qsp.a(this, R.id.linear_time_wheel_bigcd);
        this.g = qsp.a(this, R.id.event_alarm_clock_devide_image);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        Bundle bundle = new Bundle();
        bundle.putInt("smart_time", (this.i.getHour() * 100) + this.i.getMinute());
        bundle.putString("ahead_time", this.d.getText().toString());
        bundle.putInt("week_day", this.ai);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        setResult(10, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        LogUtil.a("SmartAlarmClockActivity", "onClick()");
        if (qrs.c(500)) {
            LogUtil.j("SmartAlarmClockActivity", "onClick() view click too fast");
            return;
        }
        int id = view.getId();
        if (id == R.id.smart_alarm_ahead_time_ll) {
            LogUtil.a("SmartAlarmClockActivity", "onClick() id = smart_alarm_ahead_time_ll");
            y();
        } else if (id == R.id.smart_alarm_repeat_ll) {
            LogUtil.a("SmartAlarmClockActivity", "onClick() id = smart_alarm_repeat_ll");
            r();
        } else {
            LogUtil.a("SmartAlarmClockActivity", "onClick id = ", Integer.valueOf(id));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        int hour = this.i.getHour();
        int minute = this.i.getMinute();
        int iJ = j();
        ReleaseLogUtil.d("R_SmartAlarmClockActivity", "isSmartClockChanged() aheadTime=", Integer.valueOf(iJ));
        List<SmartAlarmInfo> list = this.w;
        if (list == null || list.isEmpty()) {
            return false;
        }
        SmartAlarmInfo smartAlarmInfo = this.w.get(0);
        if ((hour * 100) + minute == (smartAlarmInfo.getSmartAlarmStartTimeHour() * 100) + smartAlarmInfo.getSmartAlarmStartTimeMins() && this.ai == smartAlarmInfo.getSmartAlarmRepeat() && iJ == smartAlarmInfo.getSmartAlarmAheadTime()) {
            ReleaseLogUtil.d("R_SmartAlarmClockActivity", "saveUiData() return with nothing changed!!!!");
            return false;
        }
        this.r = 1;
        return true;
    }

    private void r() {
        String strE = this.e.e(Integer.toBinaryString(this.ai), 7);
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
        this.ae = new String[]{this.f24723c.getString(R.string.IDS_sunday), this.f24723c.getString(R.string.IDS_monday), this.f24723c.getString(R.string.IDS_tuesday), this.f24723c.getString(R.string.IDS_wednesday), this.f24723c.getString(R.string.IDS_thursday), this.f24723c.getString(R.string.IDS_friday), this.f24723c.getString(R.string.IDS_saturday)};
        final CheckAdapter checkAdapter = new CheckAdapter(this.f24723c, this.ae, zArr);
        ListView listView = new ListView(this.f24723c);
        listView.setDivider(null);
        listView.setAdapter((ListAdapter) checkAdapter);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        listView.setLayoutParams(layoutParams);
        listView.setOnItemClickListener(new CheckAdapter.OnMultiItemClick());
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this).d(R.string.IDS_settings_repeat).a(listView).d(R.string.IDS_settings_button_ok, new DialogInterface.OnClickListener() { // from class: rad
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f47044a.c(checkAdapter, dialogInterface, i2);
            }
        }).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: rae
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                SmartAlarmClockActivity.c(dialogInterface, i2);
            }
        }).b();
        this.ah = customAlertDialogB;
        customAlertDialogB.show();
    }

    public /* synthetic */ void c(CheckAdapter checkAdapter, DialogInterface dialogInterface, int i) {
        boolean[] zArrB = checkAdapter.b();
        if (zArrB == null) {
            LogUtil.a("SmartAlarmClockActivity", "checkedItems is null");
            return;
        }
        this.ai = this.e.e(zArrB);
        HealthTextView healthTextView = this.s;
        rdc rdcVar = this.e;
        healthTextView.setText(rdcVar.d(rdcVar.e(zArrB)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        ReleaseLogUtil.d("R_SmartAlarmClockActivity", "showPromptSaveDialog()");
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).b(R.string.IDS_alarm_settings_save_changes).c(R.string.IDS_save, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.smartalarm.SmartAlarmClockActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("R_SmartAlarmClockActivity", "showPromptSaveDialog() Yes");
                if (SmartAlarmClockActivity.this.r == 1) {
                    SmartAlarmClockActivity.this.m();
                }
                SmartAlarmClockActivity.this.m.cancel();
            }
        }).a(R.string.IDS_btn_discard, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.smartalarm.SmartAlarmClockActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.a("R_SmartAlarmClockActivity", "showPromptSaveDialog() No");
                SmartAlarmClockActivity.this.finish();
                SmartAlarmClockActivity.this.m.cancel();
            }
        }).c();
        this.m = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.m.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        ReleaseLogUtil.d("R_SmartAlarmClockActivity", "updateSmartAlarmUi() mSmartAlarmList.size()", Integer.valueOf(this.w.size()));
        if (this.w.isEmpty()) {
            LogUtil.j("SmartAlarmClockActivity", "mSmartAlarmList is null");
            return;
        }
        SmartAlarmInfo smartAlarmInfo = this.w.get(0);
        int smartAlarmStartTimeHour = smartAlarmInfo.getSmartAlarmStartTimeHour();
        int smartAlarmStartTimeMins = smartAlarmInfo.getSmartAlarmStartTimeMins();
        int smartAlarmStartTimeHour2 = smartAlarmInfo.getSmartAlarmStartTimeHour();
        int smartAlarmStartTimeMins2 = smartAlarmInfo.getSmartAlarmStartTimeMins();
        String strB = rdc.b(this.f24723c, (smartAlarmStartTimeHour * 100) + smartAlarmStartTimeMins);
        this.d.setText(UnitUtil.e(this.p, 1, 0));
        String strB2 = rdc.b(this.f24723c, this.e.c(smartAlarmStartTimeHour2, smartAlarmStartTimeMins2, smartAlarmInfo.getSmartAlarmAheadTime()));
        this.s.setText(this.e.d(this.ai));
        this.ag.setText(String.format(Locale.ENGLISH, this.f24723c.getString(R.string.IDS_settings_alarm_prompt_new_health), strB2, strB, this.h.c(this.f24722b)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        ReleaseLogUtil.d("R_SmartAlarmClockActivity", "saveUiData()");
        if (this.d == null) {
            return;
        }
        if (this.k) {
            e();
        } else {
            this.n.a(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.smartalarm.SmartAlarmClockActivity.8
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    List arrayList = new ArrayList(16);
                    if (i == 0 && (obj instanceof List)) {
                        arrayList = (List) obj;
                    }
                    SmartAlarmClockActivity.this.c((List<SmartAlarmInfo>) arrayList);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<SmartAlarmInfo> list) {
        this.w = list;
        SmartAlarmInfo smartAlarmInfoS = s();
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(smartAlarmInfoS);
        if (rcv.a(this.f24723c).a(this.f24722b) != 2) {
            runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.smartalarm.SmartAlarmClockActivity.15
                @Override // java.lang.Runnable
                public void run() {
                    ReleaseLogUtil.d("R_SmartAlarmClockActivity", "showNoConnectedToast()");
                    qpx.e(SmartAlarmClockActivity.this.f24723c, R.string.IDS_device_not_connect);
                }
            });
        }
        this.h.e(arrayList, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.smartalarm.SmartAlarmClockActivity.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("R_SmartAlarmClockActivity", "saveUiData() errorCode = ", Integer.valueOf(i), "objData=", obj);
                SmartAlarmClockActivity.this.p();
                SmartAlarmClockActivity.this.finish();
            }
        });
        ReleaseLogUtil.d("R_SmartAlarmClockActivity", "saveUiData() setDBAlarmClock()=", smartAlarmInfoS.toString());
    }

    public void e() {
        String strE = SharedPreferenceManager.e(this.f24723c, String.valueOf(10022), "DEVICE_EVENT_ALARM_INFO");
        if (!TextUtils.isEmpty(strE)) {
            this.w = (List) new Gson().fromJson(strE, new TypeToken<List<SmartAlarmInfo>>() { // from class: com.huawei.ui.device.activity.smartalarm.SmartAlarmClockActivity.11
            }.getType());
        }
        SmartAlarmInfo smartAlarmInfoS = s();
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(smartAlarmInfoS);
        DeviceSettingsInteractors.e(this.f24723c).b(arrayList);
        if (rcv.a(this.f24723c).a(this.f24722b) != 2) {
            qpx.e(this.f24723c, R.string.IDS_alarm_settings_tip_disconnect_modify);
            return;
        }
        t();
        Handler handler = this.j;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(4, 10000L);
        }
        DeviceSettingsInteractors.e(this.f24723c).e(this.f24722b, arrayList, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.smartalarm.SmartAlarmClockActivity.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("R_SmartAlarmClockActivity", "saveDeviceSamrtAlarm() errorCode = ", Integer.valueOf(i), "objData=", obj);
                if (SmartAlarmClockActivity.this.j != null) {
                    SmartAlarmClockActivity.this.j.sendEmptyMessage(5);
                }
            }
        });
        LogUtil.a("SmartAlarmClockActivity", "saveUiData() setDBAlarmClock()=", smartAlarmInfoS.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.a("SmartAlarmClockActivity", "saveFinish Entering");
        Handler handler = this.j;
        if (handler != null && handler.hasMessages(4)) {
            this.j.removeMessages(4);
        }
        d();
        p();
        finish();
    }

    private SmartAlarmInfo s() {
        LogUtil.a("SmartAlarmClockActivity", "settingAlarm Entering");
        List<SmartAlarmInfo> list = this.w;
        if (list == null || list.isEmpty()) {
            SmartAlarmInfo smartAlarmInfo = new SmartAlarmInfo();
            ArrayList arrayList = new ArrayList(16);
            this.w = arrayList;
            arrayList.add(smartAlarmInfo);
        }
        int hour = (this.i.getHour() * 100) + this.i.getMinute();
        SmartAlarmInfo smartAlarmInfo2 = this.w.get(0);
        smartAlarmInfo2.setSmartAlarmStartTimeHour(hour / 100);
        smartAlarmInfo2.setSmartAlarmStartTimeMins(hour % 100);
        smartAlarmInfo2.setSmartAlarmRepeat(this.ai);
        smartAlarmInfo2.setSmartAlarmAheadTime(j());
        smartAlarmInfo2.setSmartAlarmEnable(1);
        return smartAlarmInfo2;
    }

    private int j() {
        String string = this.f24723c.getString(R.string.IDS_settings_about_huawei_cloud_service_action_turn_off);
        String string2 = this.d.getText().toString();
        LogUtil.a("SmartAlarmClockActivity", "getAheadTime() strAheadText=", string2);
        if (TextUtils.isEmpty(string2) || string.equals(string2)) {
            return 0;
        }
        return CommonUtil.n(this.f24723c, string2);
    }

    private void d(int i, int i2) {
        LogUtil.a("SmartAlarmClockActivity", "initAlarmPicker= ", Integer.valueOf(i), Integer.valueOf(i2));
        this.i = (HealthTimePicker) findViewById(R.id.hw_health_timepicker);
        if (qrs.af(this.f24723c)) {
            this.i = (HealthTimePicker) findViewById(R.id.hw_health_timepicker_bigcd);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(12, i2);
        this.i.setTime(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        int iJ = j();
        LogUtil.a("SmartAlarmClockActivity", "modifyPrompt interval=", Integer.valueOf(iJ));
        int hour = (this.i.getHour() * 100) + this.i.getMinute();
        String strB = rdc.b(this.f24723c, hour);
        this.ag.setText(String.format(Locale.ENGLISH, this.f24723c.getString(R.string.IDS_settings_alarm_prompt_new_health), rdc.b(this.f24723c, this.e.c(hour / 100, hour % 100, iJ)), strB, this.h.c(this.f24722b)));
    }

    private void y() {
        if (isFinishing()) {
            return;
        }
        SingleCheckAdapter singleCheckAdapter = new SingleCheckAdapter(this.f24723c, new String[]{getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, UnitUtil.e(5.0d, 1, 0)), getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, UnitUtil.e(10.0d, 1, 0)), getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, UnitUtil.e(20.0d, 1, 0)), getResources().getString(R.string.IDS_hw_show_set_target_sport_time_unit, UnitUtil.e(30.0d, 1, 0))}, this.ad);
        ListView listView = new ListView(this.f24723c);
        listView.setDivider(null);
        listView.setAdapter((ListAdapter) singleCheckAdapter);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        listView.setLayoutParams(layoutParams);
        listView.setOnItemClickListener(this.o);
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this).d(R.string.IDS_settings_ahead_of_time).a(listView).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: raa
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.e.b(dialogInterface, i);
            }
        }).b();
        this.ac = customAlertDialogB;
        customAlertDialogB.show();
        LogUtil.d("SmartAlarmClockActivity", "showSamrtWakeDialog()");
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        CustomAlertDialog customAlertDialog;
        if (isFinishing() || (customAlertDialog = this.ac) == null) {
            return;
        }
        customAlertDialog.cancel();
        this.ac = null;
    }

    private void a(int i) {
        ReleaseLogUtil.d("R_SmartAlarmClockActivity", "initAheadTime aheadTime = ", Integer.valueOf(i));
        if (i == 5) {
            c(0);
            return;
        }
        if (i == 10) {
            c(1);
            return;
        }
        if (i == 20) {
            c(2);
        } else if (i == 30) {
            c(3);
        } else {
            c(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        boolean[] zArr;
        int i2 = 0;
        while (true) {
            zArr = this.ad;
            if (i2 >= zArr.length) {
                break;
            }
            zArr[i2] = false;
            i2++;
        }
        if (zArr.length > i) {
            zArr[i] = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        LogUtil.a("SmartAlarmClockActivity", "refreshPromt Entering");
        this.j.removeMessages(3);
        int hour = (this.i.getHour() * 100) + this.i.getMinute();
        if (this.t != hour) {
            this.t = hour;
            l();
        }
        this.j.sendEmptyMessageDelayed(3, 1000L);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        LogUtil.a("SmartAlarmClockActivity", "onPause()");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (n()) {
                a((Context) this);
                return false;
            }
            finish();
            return false;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        CommonUtil.d(this.f24723c);
        super.onDestroy();
        d();
        Handler handler = this.j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void t() {
        LogUtil.a("showLoadingDialog", new Object[0]);
        if (this.l == null) {
            this.l = CommonDialog21.b(this);
        }
        this.l.b(this.f24723c.getResources().getString(com.huawei.ui.commonui.R.string.IDS_sns_saveing));
        this.l.c();
    }

    private void d() {
        LogUtil.a("SmartAlarmClockActivity", "dismissDialog Entering");
        CommonDialog21 commonDialog21 = this.l;
        if (commonDialog21 == null || !commonDialog21.isShowing()) {
            return;
        }
        this.l.cancel();
        this.l = null;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
