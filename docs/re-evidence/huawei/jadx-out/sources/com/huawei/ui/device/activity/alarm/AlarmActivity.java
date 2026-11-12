package com.huawei.ui.device.activity.alarm;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.datatype.EventAlarmInfo;
import com.huawei.datatype.SmartAlarmInfo;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.eventalarm.EventAlarmClockActivity;
import com.huawei.ui.device.activity.smartalarm.SmartAlarmClockActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.views.alarm.AlarmListAdapter;
import defpackage.eei;
import defpackage.eej;
import defpackage.eey;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.lvv;
import defpackage.mga;
import defpackage.mgg;
import defpackage.mhs;
import defpackage.nio;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.rcv;
import defpackage.rdc;
import defpackage.rfo;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public class AlarmActivity extends BaseActivity implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f24221a = "7:00";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f24222b = "10";
    private static boolean e = false;
    private int ag;
    private int ai;
    private int aj;
    private SmartAlarmInfo am;
    private int an;
    private int ao;
    private int ap;
    private int aq;
    private HealthSwitchButton ar;
    private HealthSwitchButton at;
    private HealthToolBar au;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private rdc f24223c;
    private DeviceCapability h;
    private DeviceSettingsInteractors k;
    private DeviceSettingsInteractors n;
    private List<EventAlarmInfo> o;
    private lvv s;
    private mhs t;
    private Context g = null;
    private ListView z = null;
    private LinearLayout ak = null;
    private HealthTextView as = null;
    private HealthTextView ax = null;
    private HealthTextView ah = null;
    private HealthTextView d = null;
    private HealthTextView f = null;
    private HealthTextView aw = null;
    private boolean ab = false;
    private List<SmartAlarmInfo> al = new ArrayList(10);
    private List<EventAlarmInfo> l = new ArrayList(10);
    private List<rfo> p = new ArrayList(10);
    private AlarmListAdapter i = null;
    private List<EventAlarmInfo> q = new ArrayList(10);
    private boolean v = false;
    private boolean ac = false;
    private boolean aa = false;
    private boolean u = false;
    private boolean x = false;
    private boolean ad = false;
    private String j = "";
    private String m = "";
    private boolean w = false;
    private boolean y = false;
    private Handler r = new b(this);
    private Runnable av = new Runnable() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.2
        @Override // java.lang.Runnable
        public void run() {
            int i = Calendar.getInstance().get(13);
            ReleaseLogUtil.d("R_AlarmActivity", "once set timer enter...curSecond is ", Integer.valueOf(i));
            AlarmActivity.this.r.postDelayed(this, 60000 - ((i - 1) * 1000));
            AlarmActivity.this.a(false);
            AlarmActivity.this.e(false);
        }
    };
    private CompoundButton.OnCheckedChangeListener af = new CompoundButton.OnCheckedChangeListener() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.14
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ReleaseLogUtil.d("R_AlarmActivity", "once onCheckedChanged isChecked = ", Boolean.valueOf(z));
            if (!AlarmActivity.this.j()) {
                qpx.e(AlarmActivity.this.g, R.string.IDS_device_not_connect);
                compoundButton.setChecked(!z);
                return;
            }
            boolean unused = AlarmActivity.e = z;
            boolean z2 = AlarmActivity.e;
            ArrayList arrayList = new ArrayList(10);
            if (AlarmActivity.this.am != null) {
                AlarmActivity.this.am.setSmartAlarmEnable(z2 ? 1 : 0);
                arrayList.add(AlarmActivity.this.am);
                AlarmActivity.this.d(1);
                ReleaseLogUtil.d("R_AlarmActivity", "once onCheckedChanged mSmartAlarmInfo hour = ", Integer.valueOf(AlarmActivity.this.am.getSmartAlarmStartTimeHour()), ", Mins is", Integer.valueOf(AlarmActivity.this.am.getSmartAlarmStartTimeMins()));
                if (AlarmActivity.this.x) {
                    LogUtil.a("AlarmActivity", "mIsFromSmartEdit is", Boolean.valueOf(AlarmActivity.this.x));
                    return;
                } else {
                    if (AlarmActivity.this.ad) {
                        return;
                    }
                    AlarmActivity.this.c(arrayList);
                    return;
                }
            }
            LogUtil.a("AlarmActivity", "null is mSmartAlarmInfo");
        }
    };
    private CompoundButton.OnCheckedChangeListener ae = new AnonymousClass12();

    /* JADX INFO: renamed from: com.huawei.ui.device.activity.alarm.AlarmActivity$12, reason: invalid class name */
    public class AnonymousClass12 implements CompoundButton.OnCheckedChangeListener {
        AnonymousClass12() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, final boolean z) {
            ReleaseLogUtil.d("R_AlarmActivity", "onCheckedChanged syncRemind isChecked = ", Boolean.valueOf(z));
            if (AlarmActivity.this.j()) {
                AlarmActivity.this.ab = z;
                ThreadPoolManager.c().execute(new Runnable() { // from class: qui
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.b(z);
                    }
                });
            } else {
                ReleaseLogUtil.e("R_AlarmActivity", "onCheckedChanged no device connected");
                qpx.e(AlarmActivity.this.g, R.string.IDS_device_not_connect);
                compoundButton.setChecked(!z);
            }
        }

        public /* synthetic */ void b(boolean z) {
            eei.b(AlarmActivity.this.m, z);
            AlarmActivity.this.s.b(AlarmActivity.this.g, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<SmartAlarmInfo> list) {
        if (this.ac) {
            this.k.b(list);
            this.k.e(this.j, list, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.15
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("AlarmActivity", "setSmartAlarm mIsSupportChangeAlarm err_code is ", Integer.valueOf(i));
                }
            });
        } else {
            t();
            this.n.e(list, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.11
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("AlarmActivity", "setSmartAlarm() err_code is ", Integer.valueOf(i));
                }
            });
        }
    }

    class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<AlarmActivity> f24234a;

        b(AlarmActivity alarmActivity) {
            this.f24234a = new WeakReference<>(alarmActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (this.f24234a.get() == null) {
                return;
            }
            int i = message.what;
            if (i == 100) {
                List<SmartAlarmInfo> list = (List) message.obj;
                LogUtil.a("AlarmActivity", "alarm message.arg1 is ", Integer.valueOf(message.arg1));
                if (message.arg1 == 1) {
                    AlarmActivity.this.s.a(list, (IBaseResponseCallback) null);
                }
                AlarmActivity.this.p();
                return;
            }
            if (i == 102) {
                AlarmActivity.this.e(message);
                return;
            }
            if (i != 104) {
                if (i != 105) {
                    return;
                }
                ReleaseLogUtil.d("R_AlarmActivity", "MESSAGE_UPDATE_EVENT_DATA");
                AlarmActivity.this.k.d(AlarmActivity.this.l);
                qpx.b(AlarmActivity.this.g, R.string.IDS_hwh_show_save_failed);
                return;
            }
            ReleaseLogUtil.d("R_AlarmActivity", "MESSAGE_UPDATE_EVENT_UI_COMMAND mEventAlarmDbList.size() is ", Integer.valueOf(AlarmActivity.this.l.size()));
            AlarmActivity.this.n();
            if (AlarmActivity.this.i == null) {
                return;
            }
            AlarmActivity.this.i.c(AlarmActivity.this.p);
            AlarmActivity.this.i.notifyDataSetChanged();
            boolean z = AlarmActivity.this.l.size() >= lvv.c(BaseApplication.getContext()).j();
            AlarmActivity.this.d(z);
            ReleaseLogUtil.d("AlarmActivity", "isListOverSize is: ", Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Message message) {
        ReleaseLogUtil.d("R_AlarmActivity", "MESSAGE_UPDATE_EVENT_ALARM_UI mAlarmListAdapter is ", this.i, " mEventAlarmItemList is ", this.p);
        List<rfo> arrayList = new ArrayList(10);
        if (message.obj instanceof List) {
            arrayList = (List) message.obj;
        }
        List<rfo> list = this.p;
        if (list == null) {
            this.p = new ArrayList(10);
        } else {
            list.clear();
        }
        for (rfo rfoVar : arrayList) {
            if (this.p.size() < lvv.c(BaseApplication.getContext()).j()) {
                this.p.add(rfoVar);
            }
        }
        ReleaseLogUtil.d("R_AlarmActivity", " mAlarmListAdapter is ", this.i, " mEventAlarmItemList.size()", Integer.valueOf(this.p.size()));
        AlarmListAdapter alarmListAdapter = this.i;
        if (alarmListAdapter != null) {
            alarmListAdapter.c(this.p);
            this.i.notifyDataSetChanged();
        } else {
            AlarmListAdapter alarmListAdapter2 = new AlarmListAdapter(this, this.p);
            this.i = alarmListAdapter2;
            this.z.setAdapter((ListAdapter) alarmListAdapter2);
        }
        this.i.b(new AlarmListAdapter.OnAlarmSwitchClickListener() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.17
            @Override // com.huawei.ui.device.views.alarm.AlarmListAdapter.OnAlarmSwitchClickListener
            public void onAlarmSwitchClick(View view) {
                AlarmActivity.this.onClickEventAlarmSwitch(view);
            }
        });
        ReleaseLogUtil.d("R_AlarmActivity", "mEventAlarmItemList.size() is ", Integer.valueOf(this.p.size()));
        d(this.p.size() >= lvv.c(BaseApplication.getContext()).j());
        LogUtil.a("AlarmActivity", "alarm message.arg1 is ", Integer.valueOf(message.arg1), "alarm mIsBackground is ", Boolean.valueOf(this.v));
        if (!this.v) {
            t();
        }
        if (message.arg1 == 1) {
            this.s.e(this.l, (IBaseResponseCallback) null);
        }
        if (this.y) {
            d(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        if (z) {
            this.au.setEnabled(false);
            this.au.setIcon(2, R.mipmap.ic_add_disable);
            this.au.setIconTitleColor(2, this.g.getResources().getString(R.string.IDS_contact_add), R.color.emui_color_text_tertiary);
        } else {
            this.au.setEnabled(true);
            this.au.setIcon(2, R.drawable.ic_addition_create_group);
            this.au.setIconTitleColor(2, this.g.getResources().getString(R.string.IDS_contact_add), R.color.textColorSecondary);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g = BaseApplication.getContext();
        ReleaseLogUtil.d("R_AlarmActivity", "onCreate()");
        setContentView(R.layout.activity_alarm_black);
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("device_id");
            this.j = stringExtra;
            rfo.b(stringExtra);
        } else if (bundle != null && !TextUtils.isEmpty(bundle.getString("deviceId", ""))) {
            String string = bundle.getString("deviceId");
            this.j = string;
            rfo.b(string);
            ReleaseLogUtil.d("R_AlarmActivity", "onCreate getIntent() is null and reSave");
        } else {
            ReleaseLogUtil.e("R_AlarmActivity", "onCreate mCurrentDeviceId is empty!");
        }
        String strE = nio.e(this.j);
        this.m = strE;
        if (TextUtils.isEmpty(strE)) {
            ReleaseLogUtil.e("R_AlarmActivity", "findSyncView mEncryDeviceId is null!");
        }
        this.n = DeviceSettingsInteractors.e((Context) null);
        this.f24223c = rdc.b(null);
        this.t = mhs.a();
        lvv lvvVarC = lvv.c(this.g);
        this.s = lvvVarC;
        this.ai = lvvVarC.j();
        this.k = DeviceSettingsInteractors.e(this.g);
        ReleaseLogUtil.d("AlarmActivity", "mCurrentDeviceId is", BTDeviceMgrUtil.c().e(this.j));
        DeviceCapability deviceCapabilityA = eej.a(this.j);
        this.h = deviceCapabilityA;
        if (deviceCapabilityA != null) {
            this.ac = deviceCapabilityA.isSupportChangeAlarm();
            this.aa = this.h.isSmartAlarm();
            boolean zIsEventAlarm = this.h.isEventAlarm();
            this.u = zIsEventAlarm;
            ReleaseLogUtil.d("R_AlarmActivity", "onCreate isSmartAlarm is ", Boolean.valueOf(this.aa), ", isEventAlarm is ", Boolean.valueOf(zIsEventAlarm));
        } else {
            ReleaseLogUtil.e("R_AlarmActivity", "onCreate mDeviceCapability is null");
        }
        h();
        ReleaseLogUtil.d("R_AlarmActivity", "mIsSupportChangeAlarm is", Boolean.valueOf(this.ac), "mMaxAlarmNumber is ", Integer.valueOf(this.ai));
        if (this.ac) {
            l();
            k();
        } else {
            int i = Calendar.getInstance().get(13);
            LogUtil.a("AlarmActivity", "once curSecond is ", Integer.valueOf(i));
            this.r.postDelayed(this.av, 60000 - ((i - 1) * 1000));
            LogUtil.a("AlarmActivity", "once send message alarm time");
        }
    }

    private void l() {
        this.k.b(this.j, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.16
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("R_AlarmActivity", "errorCode is", Integer.valueOf(i));
                AlarmActivity alarmActivity = AlarmActivity.this;
                alarmActivity.l = alarmActivity.k.d(obj);
                ReleaseLogUtil.d("R_AlarmActivity", "eventAlarmList is", Integer.valueOf(AlarmActivity.this.l.size()));
                ArrayList arrayList = new ArrayList(10);
                AlarmActivity.this.q.clear();
                for (int i2 = 0; i2 < AlarmActivity.this.l.size(); i2++) {
                    EventAlarmInfo eventAlarmInfo = (EventAlarmInfo) AlarmActivity.this.l.get(i2);
                    if (TextUtils.isEmpty(eventAlarmInfo.getEventAlarmName())) {
                        eventAlarmInfo.setEventAlarmName(AlarmActivity.this.getString(R.string.IDS_settings_prompt));
                    }
                    AlarmActivity.this.q.add(eventAlarmInfo);
                    rfo rfoVar = new rfo();
                    arrayList.add(rfoVar.e(rfoVar, eventAlarmInfo, AlarmActivity.this.f24223c, AlarmActivity.this.l, i2));
                }
                AlarmActivity.this.l.clear();
                AlarmActivity.this.l.addAll(AlarmActivity.this.q);
                AlarmActivity.this.k.d(AlarmActivity.this.l);
                Message messageObtainMessage = AlarmActivity.this.r.obtainMessage();
                AlarmActivity.this.i = null;
                messageObtainMessage.what = 102;
                messageObtainMessage.obj = arrayList;
                messageObtainMessage.arg1 = 0;
                AlarmActivity.this.r.sendMessage(messageObtainMessage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<EventAlarmInfo> list) {
        LogUtil.a("AlarmActivity", "Enter refreshEventAlarmUI_spData");
        ArrayList arrayList = new ArrayList(10);
        this.q.clear();
        for (int i = 0; i < list.size(); i++) {
            EventAlarmInfo eventAlarmInfo = list.get(i);
            if (TextUtils.isEmpty(eventAlarmInfo.getEventAlarmName())) {
                eventAlarmInfo.setEventAlarmName(getString(R.string.IDS_settings_prompt));
            }
            this.q.add(eventAlarmInfo);
            rfo rfoVar = new rfo();
            arrayList.add(rfoVar.e(rfoVar, eventAlarmInfo, this.f24223c, list, i));
        }
        list.clear();
        list.addAll(this.q);
        this.k.d(list);
        Message messageObtainMessage = this.r.obtainMessage();
        this.i = null;
        messageObtainMessage.what = 102;
        messageObtainMessage.obj = arrayList;
        messageObtainMessage.arg1 = 0;
        this.r.sendMessage(messageObtainMessage);
    }

    private void k() {
        List<SmartAlarmInfo> list = this.al;
        if (list == null || list.isEmpty()) {
            SmartAlarmInfo smartAlarmInfo = new SmartAlarmInfo();
            ArrayList arrayList = new ArrayList(10);
            this.al = arrayList;
            arrayList.add(smartAlarmInfo);
        }
        if (!this.al.isEmpty()) {
            SmartAlarmInfo smartAlarmInfo2 = this.al.get(0);
            this.am = smartAlarmInfo2;
            this.an = smartAlarmInfo2.getSmartAlarmIndex();
            this.aj = this.am.getSmartAlarmEnable();
            this.aq = this.am.getSmartAlarmStartTimeHour();
            this.ao = this.am.getSmartAlarmStartTimeMins();
            this.ap = this.am.getSmartAlarmRepeat();
            this.ag = this.am.getSmartAlarmAheadTime();
            if (this.ap == 0 && this.aj == 1) {
                this.aj = e(this.am);
            }
            Message messageObtainMessage = this.r.obtainMessage();
            messageObtainMessage.what = 100;
            this.r.sendMessage(messageObtainMessage);
        } else {
            LogUtil.a("AlarmActivity", "refreshSmartAlarmUi() deviceSmartAlarmList is null or size is 0");
        }
        f();
    }

    private void f() {
        this.k.c(this.j, new d(this));
    }

    static class d implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<AlarmActivity> f24235a;

        public d(AlarmActivity alarmActivity) {
            this.f24235a = new WeakReference<>(alarmActivity);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            AlarmActivity alarmActivity = this.f24235a.get();
            if (alarmActivity == null || alarmActivity.isFinishing()) {
                return;
            }
            ReleaseLogUtil.d("R_AlarmActivity", "errorCode is ", Integer.valueOf(i));
            List<SmartAlarmInfo> listA = alarmActivity.k.a(obj);
            ReleaseLogUtil.d("R_AlarmActivity", "smartAlarmList ", listA, "mSmartAlarmList is ", alarmActivity.al);
            if ((listA == null || listA.isEmpty()) && alarmActivity.aa) {
                alarmActivity.k.e(alarmActivity.j, alarmActivity.al, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.d.5
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i2, Object obj2) {
                        ReleaseLogUtil.d("R_AlarmActivity", "setSmartAlarm mIsSupportChangeAlarm errorCode is ", Integer.valueOf(i2));
                    }
                });
                return;
            }
            alarmActivity.al = listA;
            if (!alarmActivity.al.isEmpty()) {
                alarmActivity.am = (SmartAlarmInfo) alarmActivity.al.get(0);
                alarmActivity.an = alarmActivity.am.getSmartAlarmIndex();
                alarmActivity.aj = alarmActivity.am.getSmartAlarmEnable();
                alarmActivity.aq = alarmActivity.am.getSmartAlarmStartTimeHour();
                alarmActivity.ao = alarmActivity.am.getSmartAlarmStartTimeMins();
                alarmActivity.ap = alarmActivity.am.getSmartAlarmRepeat();
                if (alarmActivity.am.getSmartAlarmAheadTime() == 0) {
                    alarmActivity.am.setSmartAlarmAheadTime(5);
                }
                alarmActivity.ag = alarmActivity.am.getSmartAlarmAheadTime();
                Message messageObtainMessage = alarmActivity.r.obtainMessage();
                messageObtainMessage.what = 100;
                alarmActivity.r.sendMessage(messageObtainMessage);
                ReleaseLogUtil.d("R_AlarmActivity", "mSmartAlarmList.size() ", Integer.valueOf(alarmActivity.al.size()), "mSmartAlarmEnable", Integer.valueOf(alarmActivity.aj));
                return;
            }
            ReleaseLogUtil.d("R_AlarmActivity", "refreshSmartAlarmUi() deviceSmartAlarmList is null or size is 0");
        }
    }

    public void onClickEventAlarmSwitch(View view) {
        if (view == null) {
            return;
        }
        HealthSwitchButton healthSwitchButton = view instanceof HealthSwitchButton ? (HealthSwitchButton) view : null;
        if (!j()) {
            qpx.e(this.g, R.string.IDS_device_not_connect);
            if (healthSwitchButton != null) {
                healthSwitchButton.setChecked(!healthSwitchButton.isChecked());
                return;
            }
            return;
        }
        int iIntValue = view.getTag() instanceof Integer ? ((Integer) view.getTag()).intValue() : 0;
        if (healthSwitchButton != null) {
            boolean zIsChecked = healthSwitchButton.isChecked();
            ReleaseLogUtil.d("R_AlarmActivity", "onClickEventAlarmSwitch() position is ", Integer.valueOf(iIntValue), ",isChecked is ", Boolean.valueOf(zIsChecked));
            e(iIntValue, zIsChecked);
        }
    }

    private void e(int i, boolean z) {
        if (i < 0 || i >= this.l.size()) {
            return;
        }
        LogUtil.a("AlarmActivity", "updateEventAlarm()");
        EventAlarmInfo eventAlarmInfo = this.l.get(i);
        if (z) {
            eventAlarmInfo.setEventAlarmEnable(1);
        } else {
            eventAlarmInfo.setEventAlarmEnable(0);
        }
        eventAlarmInfo.setModifiedTimestamp(System.currentTimeMillis());
        this.l.set(i, eventAlarmInfo);
        if (this.ac) {
            this.k.d(this.l);
            this.k.a(this.j, this.l, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.19
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    ReleaseLogUtil.d("R_AlarmActivity", "updateEventAlarm mIsSupportChangeAlarm errorCode is ", Integer.valueOf(i2));
                }
            });
        } else {
            t();
            this.n.c(this.l, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.23
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    ReleaseLogUtil.d("R_AlarmActivity", "updateEventAlarm() errorCode is ", Integer.valueOf(i2));
                }
            });
        }
        if (lrd.d()) {
            o();
            return;
        }
        Message messageObtainMessage = this.r.obtainMessage();
        messageObtainMessage.what = 104;
        this.r.sendMessage(messageObtainMessage);
    }

    private void o() {
        n();
        AlarmListAdapter alarmListAdapter = this.i;
        if (alarmListAdapter == null) {
            return;
        }
        alarmListAdapter.c(this.p);
    }

    private void h() {
        i();
        b();
        this.f.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.r()) {
                    AlarmActivity.this.x = false;
                    AlarmActivity.this.ad = false;
                    if (!AlarmActivity.this.ar.isChecked()) {
                        AlarmActivity.this.ar.setChecked(true);
                        AlarmActivity.this.c(true);
                        return;
                    } else {
                        AlarmActivity.this.e();
                        return;
                    }
                }
                LogUtil.a("AlarmActivity", "onClick() isFastClick");
            }
        });
        this.aw.setOnClickListener(new View.OnClickListener() { // from class: que
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(view);
            }
        });
        this.ak.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AlarmActivity.this.m();
            }
        });
        this.z.setOnItemClickListener(this);
        this.au.setOnSingleTapListener(new HealthToolBar.OnSingleTapListener() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.5
            @Override // com.huawei.ui.commonui.toolbar.HealthToolBar.OnSingleTapListener
            public void onSingleTap(int i) {
                if (i == 2) {
                    if (!AlarmActivity.this.j()) {
                        qpx.e(AlarmActivity.this.g, R.string.IDS_device_not_connect);
                    } else {
                        AlarmActivity.this.c();
                    }
                }
            }
        });
    }

    public /* synthetic */ void b(View view) {
        if (qrs.c(500)) {
            LogUtil.a("AlarmActivity", "mSyncRemindCoverView onClick() isFastClick");
        } else if (this.ab) {
            this.at.setChecked(false);
        } else {
            this.at.setChecked(true);
        }
    }

    private void i() {
        this.au = (HealthToolBar) findViewById(R.id.buttomview);
        this.au.d(View.inflate(this.g, R.layout.hw_toolbar_bottomview, null));
        this.au.setIconVisible(1, 4);
        this.au.setIconVisible(3, 4);
        this.au.setIcon(2, R.drawable.ic_addition_create_group);
        this.au.setIconTitle(2, this.g.getResources().getString(R.string.IDS_contact_add));
        this.au.a(this);
        this.as = (HealthTextView) qsp.a(this, R.id.smart_alarm_time1);
        this.ax = (HealthTextView) qsp.a(this, R.id.smart_alarm_day);
        this.ak = (LinearLayout) qsp.a(this, R.id.smart_alarm_text);
        this.ar = (HealthSwitchButton) qsp.a(this, R.id.smart_alarm_switch_button);
        this.f = (HealthTextView) qsp.a(this, R.id.tv_switch_cover_button);
        this.z = (ListView) qsp.a(this, R.id.event_alarm_list);
        this.ah = (HealthTextView) qsp.a(this, R.id.smart_alarm_promt_description);
        View viewInflate = View.inflate(this.g, R.layout.activity_event_clock_footer, null);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.alarm_bottom_tv);
        String string = this.g.getString(R.string.IDS_settings_mult_alarm_clock_list_msg_new, DeviceSettingsInteractors.e(this.g).c(this.j), UnitUtil.e(this.ai, 1, 0));
        this.d.setText(string);
        lrd.b(this.d, string);
        ReleaseLogUtil.d("R_AlarmActivity", "mAlarmBottomTextView is:", this.d);
        this.i = new AlarmListAdapter(this, this.p);
        this.z.addFooterView(viewInflate);
        this.z.setAdapter((ListAdapter) this.i);
        LinearLayout linearLayout = (LinearLayout) qsp.a(this, R.id.settings_smart_alarm_layout);
        LinearLayout linearLayout2 = (LinearLayout) qsp.a(this, R.id.smart_alarm_prompt_line);
        HealthSubHeader healthSubHeader = (HealthSubHeader) qsp.a(this, R.id.settings_smart_alarm_text);
        HealthSubHeader healthSubHeader2 = (HealthSubHeader) qsp.a(this, R.id.event_alarm_title);
        ReleaseLogUtil.d("R_AlarmActivity", "findView isSmartAlarm is ", Boolean.valueOf(this.aa), ", isEventAlarm is ", Boolean.valueOf(this.u));
        if (this.aa) {
            linearLayout.setVisibility(0);
            linearLayout2.setVisibility(0);
            healthSubHeader.setVisibility(0);
        }
        if (this.u) {
            this.z.setVisibility(0);
            this.d.setVisibility(0);
            this.au.setVisibility(0);
        }
        if (this.aa && this.u) {
            healthSubHeader2.setVisibility(0);
        }
    }

    private void b() {
        this.aw = (HealthTextView) qsp.a(this, R.id.alarm_sync_remind_switch_view);
        this.at = (HealthSwitchButton) qsp.a(this, R.id.alarm_sync_remind_switch_button);
        View viewA = qsp.a(this, R.id.alarm_sync_remind_splitter);
        LinearLayout linearLayout = (LinearLayout) qsp.a(this, R.id.alarm_sync_remind_layout);
        LinearLayout linearLayout2 = (LinearLayout) qsp.a(this, R.id.alarm_sync_remind_prompt_line);
        HealthTextView healthTextView = (HealthTextView) qsp.a(this, R.id.alarm_sync_remind_healthTextView);
        DeviceInfo deviceInfoC = mgg.c("AlarmActivity");
        if (deviceInfoC == null) {
            ReleaseLogUtil.e("R_AlarmActivity", "findSyncView deviceInfo is null!");
            return;
        }
        if (mga.b(deviceInfoC)) {
            healthTextView.setText(R.string.IDS_settings_sync_remind_smart_detail);
        } else {
            healthTextView.setText(R.string.IDS_settings_sync_remind_sport_detail);
        }
        boolean zD = eey.d(deviceInfoC, 200);
        boolean zA = eei.a();
        ReleaseLogUtil.d("R_AlarmActivity", "findSyncView isSupportSyncRemind is: ", Boolean.valueOf(zD), " isSupportMiddleWear is:", Boolean.valueOf(zA));
        if (zA && zD && this.s.f()) {
            viewA.setVisibility(0);
            linearLayout.setVisibility(0);
            linearLayout2.setVisibility(0);
            int iD = eei.d(this.m);
            ReleaseLogUtil.d("R_AlarmActivity", "findSyncView syncRemindStatus from db is ", Integer.valueOf(iD));
            this.ab = iD != 0;
            this.at.setOnCheckedChangeListener(null);
            this.at.setChecked(this.ab);
            this.at.setOnCheckedChangeListener(this.ae);
        }
    }

    public void e() {
        DeviceInfo deviceInfoC = mgg.c("AlarmActivity");
        if (deviceInfoC != null) {
            this.t.getSwitchSetting("intelligent_home_linkage", deviceInfoC.getDeviceIdentify(), new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("AlarmActivity", "checkIntelligentStatus errorCode = ", Integer.valueOf(i));
                    final boolean zC = AlarmActivity.this.c(i, obj);
                    AlarmActivity.this.runOnUiThread(new Runnable() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.4.3
                        @Override // java.lang.Runnable
                        public void run() {
                            if (!zC) {
                                AlarmActivity.this.ar.setChecked(false);
                                AlarmActivity.this.c(false);
                            } else {
                                AlarmActivity.this.a();
                            }
                        }
                    });
                }
            });
        } else {
            this.ar.setChecked(false);
            c(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean j() {
        return rcv.a(this.g).a(this.j) == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            if (str.contains(Constants.PARAM_SERVER_SPLIT)) {
                String[] strArrSplit = str.split(Constants.PARAM_SERVER_SPLIT);
                LogUtil.a("AlarmActivity", "INTELLIGENT_HOME_LINKAGE splits is ", Integer.valueOf(strArrSplit.length));
                return strArrSplit.length == 5 && Boolean.parseBoolean(strArrSplit[3]);
            }
        }
        return false;
    }

    public void a() {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this).a(R.string.IDS_service_area_notice_title).b(R.string.IDS_device_to_intelligent_home_linkage_alarm_notice).a(R.string.IDS_settings_AI_Health_Alarm_close, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("AlarmActivity", "DownloadInstelligentHomeDialog ok click");
                AlarmActivity.this.ar.setChecked(false);
                AlarmActivity.this.c(false);
            }
        }).e(R.string.IDS_settings_button_cancal_ios_btn, new View.OnClickListener() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("AlarmActivity", "DownloadInstelligentHomeDialog cancel click");
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    private void g() {
        if (this.ac) {
            return;
        }
        a(true);
        e(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        lrd.a((View) this.f, (CharSequence) qre.f(z ? R.string.IDS_status_enabled : R.string.IDS_status_disabled), true);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        LogUtil.a("AlarmActivity", "onResume()");
        this.v = false;
        g();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        LogUtil.a("AlarmActivity", "onPause()");
        this.v = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        LogUtil.a("AlarmActivity", "getEventAlarm() isNeedBiEvent is ", Boolean.valueOf(z));
        this.y = z;
        this.s.b(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("AlarmActivity", "getEventAlarm errorCode is ", Integer.valueOf(i));
                ArrayList arrayList = new ArrayList(10);
                if (i == 0 && (obj instanceof List)) {
                    AlarmActivity.this.l = (List) obj;
                }
                LogUtil.a("AlarmActivity", "getEventAlarm() mEventAlarmDbList.size() is ", Integer.valueOf(AlarmActivity.this.l.size()));
                int i2 = 0;
                for (int i3 = 0; i3 < AlarmActivity.this.l.size(); i3++) {
                    EventAlarmInfo eventAlarmInfo = (EventAlarmInfo) AlarmActivity.this.l.get(i3);
                    rfo rfoVar = new rfo();
                    rfo rfoVarE = rfoVar.e(rfoVar, eventAlarmInfo, AlarmActivity.this.f24223c, AlarmActivity.this.l, i3);
                    if (i2 == 0) {
                        i2 = rfoVarE.i();
                    }
                    arrayList.add(rfoVarE);
                }
                Message messageObtainMessage = AlarmActivity.this.r.obtainMessage();
                messageObtainMessage.what = 102;
                messageObtainMessage.obj = arrayList;
                messageObtainMessage.arg1 = i2;
                AlarmActivity.this.r.sendMessage(messageObtainMessage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        LogUtil.a("AlarmActivity", "getSmartAlarm() isNeedBiEvent is ", Boolean.valueOf(z));
        this.w = z;
        this.s.a(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.6
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("AlarmActivity", "getSmartAlarm errorCode is ", Integer.valueOf(i));
                if (obj instanceof List) {
                    AlarmActivity.this.al = (List) obj;
                }
                if (AlarmActivity.this.al == null || AlarmActivity.this.al.isEmpty()) {
                    SmartAlarmInfo smartAlarmInfo = new SmartAlarmInfo();
                    AlarmActivity.this.al = new ArrayList(10);
                    AlarmActivity.this.al.add(smartAlarmInfo);
                }
                LogUtil.a("AlarmActivity", "mSmartAlarmList.size() ", Integer.valueOf(AlarmActivity.this.al.size()));
                if (!AlarmActivity.this.al.isEmpty()) {
                    SmartAlarmInfo smartAlarmInfo2 = new SmartAlarmInfo();
                    AlarmActivity alarmActivity = AlarmActivity.this;
                    int i2 = 0;
                    alarmActivity.am = (SmartAlarmInfo) alarmActivity.al.get(0);
                    AlarmActivity alarmActivity2 = AlarmActivity.this;
                    alarmActivity2.an = alarmActivity2.am.getSmartAlarmIndex();
                    smartAlarmInfo2.setSmartAlarmIndex(AlarmActivity.this.an);
                    AlarmActivity alarmActivity3 = AlarmActivity.this;
                    alarmActivity3.aj = alarmActivity3.am.getSmartAlarmEnable();
                    smartAlarmInfo2.setSmartAlarmEnable(AlarmActivity.this.aj);
                    AlarmActivity alarmActivity4 = AlarmActivity.this;
                    alarmActivity4.aq = alarmActivity4.am.getSmartAlarmStartTimeHour();
                    smartAlarmInfo2.setSmartAlarmStartTimeHour(AlarmActivity.this.aq);
                    AlarmActivity alarmActivity5 = AlarmActivity.this;
                    alarmActivity5.ao = alarmActivity5.am.getSmartAlarmStartTimeMins();
                    smartAlarmInfo2.setSmartAlarmStartTimeMins(AlarmActivity.this.ao);
                    AlarmActivity alarmActivity6 = AlarmActivity.this;
                    alarmActivity6.ap = alarmActivity6.am.getSmartAlarmRepeat();
                    smartAlarmInfo2.setSmartAlarmRepeat(AlarmActivity.this.ap);
                    if (AlarmActivity.this.am.getSmartAlarmAheadTime() == 0) {
                        AlarmActivity.this.am.setSmartAlarmAheadTime(5);
                    }
                    AlarmActivity alarmActivity7 = AlarmActivity.this;
                    alarmActivity7.ag = alarmActivity7.am.getSmartAlarmAheadTime();
                    smartAlarmInfo2.setSmartAlarmAheadTime(AlarmActivity.this.ag);
                    if (AlarmActivity.this.ap == 0 && AlarmActivity.this.aj == 1) {
                        AlarmActivity alarmActivity8 = AlarmActivity.this;
                        alarmActivity8.aj = alarmActivity8.e(alarmActivity8.am);
                        smartAlarmInfo2.setSmartAlarmEnable(AlarmActivity.this.aj);
                        if (AlarmActivity.this.aj == 0) {
                            i2 = 1;
                        }
                    }
                    ArrayList arrayList = new ArrayList(10);
                    arrayList.add(smartAlarmInfo2);
                    AlarmActivity.this.d(arrayList, i2);
                    return;
                }
                LogUtil.j("AlarmActivity", "getSmartAlarm() mSmartAlarmList is null or size is 0");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<SmartAlarmInfo> list, int i) {
        Message messageObtainMessage = this.r.obtainMessage();
        messageObtainMessage.what = 100;
        messageObtainMessage.obj = list;
        messageObtainMessage.arg1 = i;
        this.r.sendMessage(messageObtainMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(SmartAlarmInfo smartAlarmInfo) {
        List<SmartAlarmInfo> list;
        int smartAlarmEnable = smartAlarmInfo.getSmartAlarmEnable();
        String strE = SharedPreferenceManager.e(this.g, String.valueOf(10022), "ONCE_SMART_ALARM_INFO");
        LogUtil.a("AlarmActivity", "once onceSmartAlarmIsOver json is ", strE);
        if (!TextUtils.isEmpty(strE) && (list = (List) new Gson().fromJson(strE, new TypeToken<List<SmartAlarmInfo>>() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.18
        }.getType())) != null && !list.isEmpty()) {
            for (SmartAlarmInfo smartAlarmInfo2 : list) {
                if (smartAlarmInfo2.getSmartAlarmIndex() == smartAlarmInfo.getSmartAlarmIndex() && System.currentTimeMillis() / 1000 >= smartAlarmInfo2.getSmartAlarmTime()) {
                    smartAlarmEnable = 0;
                }
            }
            LogUtil.a("AlarmActivity", "once onceSmartAlarmIsOver iRet is ", Integer.valueOf(smartAlarmEnable));
        }
        return smartAlarmEnable;
    }

    private void d(Intent intent) {
        LogUtil.a("AlarmActivity", "updateSmartAlarmUi()");
        if (intent == null) {
            LogUtil.j("AlarmActivity", "updateSmartAlarmUi() intent is null");
            return;
        }
        int intExtra = intent.getIntExtra("smart_time", 0);
        int intExtra2 = intent.getIntExtra("week_day", 31);
        this.as.setText(rdc.b(this.g, intExtra));
        int iB = CommonUtil.b(intent.getStringExtra("ahead_time"), 10);
        String strE = UnitUtil.e(iB, 1, 0);
        this.ax.setText(this.g.getResources().getQuantityString(R.plurals.IDS_settings_smart_time_detail, CommonUtil.j(strE), this.f24223c.d(intExtra2), strE));
        this.aq = intExtra / 100;
        this.ao = intExtra % 100;
        SmartAlarmInfo smartAlarmInfo = this.am;
        if (smartAlarmInfo != null) {
            smartAlarmInfo.setSmartAlarmAheadTime(iB);
            this.am.setSmartAlarmEnable(1);
            this.am.setSmartAlarmRepeat(intExtra2);
            this.am.setSmartAlarmStartTimeHour(this.aq);
            this.am.setSmartAlarmStartTimeMins(this.ao);
            LogUtil.a("AlarmActivity", "updateSmartAlarmUi() update mSmartAlarmInfo finish!");
        }
        this.ar.setChecked(true);
        c(true);
        d(intExtra, iB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        this.ad = true;
        LogUtil.a("AlarmActivity", "enter updateSmartAlarmUi()  ;", Integer.valueOf(this.aj), ";mIsSmartButtonChecked=", Boolean.valueOf(e));
        if (this.aj == 1) {
            e = true;
        } else {
            e = false;
        }
        this.ar.setChecked(e);
        c(e);
        this.ar.setOnCheckedChangeListener(this.af);
        String strB = rdc.b(this.g, (this.aq * 100) + this.ao);
        f24221a = strB;
        this.as.setText(strB);
        f24222b = UnitUtil.e(this.ag, 1, 0);
        this.ax.setText(this.g.getResources().getQuantityString(R.plurals.IDS_settings_smart_time_detail, CommonUtil.j(f24222b), this.f24223c.d(this.ap), f24222b));
        LogUtil.a("AlarmActivity", "mWeekDayTextView is ", this.ax.getText(), ";mSmartTimerTextView is ", this.as.getText(), ";mSmartAlarmSwitch is ", Boolean.valueOf(this.ar.isChecked()));
        if (this.w) {
            d(1);
        }
        d((this.aq * 100) + this.ao, this.ag);
    }

    private void d(int i, int i2) {
        String strB = rdc.b(this.g, i);
        this.ah.setText(String.format(Locale.ROOT, this.g.getString(R.string.IDS_settings_alarm_prompt_new_health), rdc.b(this.g, this.f24223c.c(i / 100, i % 100, i2)), strB, this.n.c(this.j)));
    }

    private void q() {
        LogUtil.a("AlarmActivity", "updateEventAlarmUi()");
        this.s.b(new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("AlarmActivity", "updateEventAlarmUi() getEventAlarm() err_code is ", Integer.valueOf(i));
                if (i == 0 && (obj instanceof List)) {
                    AlarmActivity.this.l = (List) obj;
                }
                LogUtil.a("AlarmActivity", "updateEventAlarmUi() mEventAlarmDbList.size is ", Integer.valueOf(AlarmActivity.this.l.size()));
                Message messageObtainMessage = AlarmActivity.this.r.obtainMessage();
                messageObtainMessage.what = 104;
                AlarmActivity.this.r.sendMessage(messageObtainMessage);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.p.clear();
        for (EventAlarmInfo eventAlarmInfo : this.l) {
            rfo rfoVar = new rfo();
            rfo rfoVarB = rfoVar.b(rfoVar, eventAlarmInfo, this.f24223c, this.g);
            if (this.p.size() < this.ai) {
                this.p.add(rfoVarB);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (qrs.r()) {
            LogUtil.a("AlarmActivity", "onSmartAlarmClick() isFastClick");
            return;
        }
        if (j()) {
            try {
                Intent intent = new Intent(this, (Class<?>) SmartAlarmClockActivity.class);
                intent.putExtra("key_to_smart_alarm_activity", (this.aq * 100) + this.ao);
                intent.putExtra("device_id", this.j);
                startActivityForResult(intent, 0);
                overridePendingTransition(R.anim.activity_no_animation, R.anim.activity_no_animation);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("AlarmActivity", "onClick Exception: ActivityNotFoundException");
                xjt.c("onClick Exception: ActivityNotFoundException");
                return;
            }
        }
        qpx.e(this.g, R.string.IDS_device_not_connect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("AlarmActivity", "addButtonClick()");
        if (this.p == null) {
            LogUtil.e("AlarmActivity", "addButtonClick() mEventAlarmItemList is null");
            return;
        }
        if (qrs.r()) {
            LogUtil.a("AlarmActivity", "addButtonClick() isFastClick");
            return;
        }
        LogUtil.a("AlarmActivity", "addButtonClick() mEventAlarmItemList.size() is ", Integer.valueOf(this.p.size()));
        int size = this.p.size();
        int i = this.ai;
        if (size >= i) {
            LogUtil.j("AlarmActivity", "addButtonClick() Can't greater than, ", Integer.valueOf(i));
            return;
        }
        try {
            Intent intent = new Intent(this.g, (Class<?>) EventAlarmClockActivity.class);
            intent.putExtra("from_add_button", true);
            intent.putExtra("device_id", this.j);
            startActivityForResult(intent, 0);
            overridePendingTransition(R.anim.activity_no_animation, R.anim.activity_no_animation);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("AlarmActivity", "addButtonClick Exception: ActivityNotFoundException");
            xjt.c("addButtonClick Exception: ActivityNotFoundException");
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        LogUtil.a("AlarmActivity", "onItemClick: position is ", Integer.valueOf(i));
        List<rfo> list = this.p;
        if (list == null || list.isEmpty()) {
            LogUtil.a("AlarmActivity", "mEventAlarmItemList.size() is 0 or mEventAlarmItemList is null");
            return;
        }
        if (qrs.r()) {
            LogUtil.a("AlarmActivity", "onClick() isFastClick");
            return;
        }
        if (!j()) {
            qpx.e(this.g, R.string.IDS_device_not_connect);
            return;
        }
        LogUtil.a("AlarmActivity", "onItemClick: mEventAlarmItemList.size() is ", Integer.valueOf(this.p.size()));
        if (i < this.p.size()) {
            LogUtil.a("AlarmActivity", "mEventAlarmItemList.get(position)", this.p.get(i));
            rfo rfoVar = this.p.get(i);
            try {
                Intent intent = new Intent(this.g, (Class<?>) EventAlarmClockActivity.class);
                intent.putExtra("device_id", this.j);
                Bundle bundle = new Bundle();
                bundle.putSerializable("from_list_item", rfoVar);
                intent.putExtras(bundle);
                startActivityForResult(intent, 0);
                overridePendingTransition(R.anim.activity_no_animation, R.anim.activity_no_animation);
                return;
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("AlarmActivity", "onItemClick Exception: ActivityNotFoundException");
                xjt.c("onItemClick Exception: ActivityNotFoundException");
                return;
            }
        }
        LogUtil.e("AlarmActivity", "position error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        HashMap map = new HashMap(16);
        if (i == 1) {
            map.put("type", 1);
            map.put("state", Integer.valueOf(e ? 1 : 0));
            map.put("ahead_time", f24222b);
        } else if (i == 2) {
            map.put("type", 2);
            map.put("alarm_num", Integer.valueOf(this.p.size()));
        } else {
            LogUtil.a("AlarmActivity", "sendAlarmBiEvent type is error.", Integer.valueOf(i));
        }
        lmf.d().c(this.g, AnalyticsValue.SETTING_SMART_ALARM_1090030.value(), map, 0);
    }

    private void t() {
        if (rcv.a(this.g).a(this.j) != 2) {
            LogUtil.a("AlarmActivity", "showNoConnectedToast()");
            qpx.e(this.g, R.string.IDS_device_not_connect);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ReleaseLogUtil.d("R_AlarmActivity", "onActivityResult requestCode is ", Integer.valueOf(i), ",resultCode is ", Integer.valueOf(i2));
        if (i2 == 10) {
            this.x = true;
            d(intent);
            return;
        }
        if (i2 != 11) {
            return;
        }
        if (this.ac) {
            s();
            String strE = SharedPreferenceManager.e(this.g, String.valueOf(10022), "DEVICE_EVENT_ALARM_INFO");
            if (!TextUtils.isEmpty(strE)) {
                this.o = (List) new Gson().fromJson(strE, new TypeToken<List<EventAlarmInfo>>() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.20
                }.getType());
            }
            List<EventAlarmInfo> list = this.o;
            if (list == null) {
                return;
            }
            ReleaseLogUtil.d("R_AlarmActivity", "eventAlarmDBList_change.size is ", Integer.valueOf(list.size()), ";onActivityResult json is  ", strE);
            this.k.a(this.j, this.o, new IBaseResponseCallback() { // from class: com.huawei.ui.device.activity.alarm.AlarmActivity.13
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i3, Object obj) {
                    ReleaseLogUtil.d("R_AlarmActivity", "onActivityResult mIbaseResponseCallbach err_code is ", Integer.valueOf(i3), " ;objData=", obj);
                    if (i3 != 0) {
                        Message messageObtainMessage = AlarmActivity.this.r.obtainMessage();
                        messageObtainMessage.what = 105;
                        AlarmActivity.this.r.sendMessage(messageObtainMessage);
                    } else {
                        AlarmActivity alarmActivity = AlarmActivity.this;
                        alarmActivity.d((List<EventAlarmInfo>) alarmActivity.o);
                        AlarmActivity alarmActivity2 = AlarmActivity.this;
                        alarmActivity2.l = alarmActivity2.o;
                    }
                }
            });
            return;
        }
        q();
    }

    private void s() {
        if (!this.ac || j()) {
            return;
        }
        qpx.e(this.g, R.string.IDS_alarm_settings_tip_disconnect_modify);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.r.removeMessages(100);
        this.r.removeMessages(102);
        this.r.removeMessages(104);
        LogUtil.a("AlarmActivity", "once onStop");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        CommonUtil.d(this.g);
        super.onDestroy();
        this.r.removeMessages(100);
        this.r.removeMessages(102);
        this.r.removeMessages(104);
        this.r.removeCallbacks(this.av);
        LogUtil.a("AlarmActivity", "once onDestroy");
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        LogUtil.a("AlarmActivity", "onSaveInstanceState mMaxAlarmNumber is ", Integer.valueOf(this.ai));
        bundle.putInt("alarmNumber", this.ai);
        bundle.putString("deviceId", this.j);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.ai = bundle.getInt("alarmNumber", 5);
        lvv.c(BaseApplication.getContext()).a(this.ai);
        LogUtil.a("AlarmActivity", "onRestoreInstanceState mMaxAlarmNumber is ", Integer.valueOf(this.ai));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
