package com.xiaomi.hm.health.ui.smartplay;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmVersionInfo;
import com.huami.devicex.R;
import com.huami.devicex.injection.BuildConfigApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.huami.widget.wheelview.event.Event12HourUpdate;
import com.huami.widget.wheelview.event.EventAmPmUpdate;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.ui.smartplay.SetHuamiOSAlarmActivity;
import com.xiaomi.hm.health.ui.smartplay.alarm.AlarmRepeatChooser;
import com.xiaomi.hm.health.ui.smartplay.alarm.AlarmViewModelExt;
import com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmCallback;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class SetHuamiOSAlarmActivity extends AppCompatActivity {
    private static final String A = "index";
    private static final String B = "type";
    private static final String C = "key_force_dark_theme";
    private static final int D = 0;
    private static final int E = 1;
    private static final int F = 0;
    private static final int G = 42;
    public static final String KEY_IS_CHANGE = "isChanged";
    public static final int TYPE_ADD = 1;
    public static final int TYPE_EDIT = 0;
    private static final String z = "SetHuamiOSAlarmActivity";
    private HMBaseDevice g;
    private HMDeviceSource h;
    private RainbowTitleBar j;
    private WheelView k;
    private WheelView l;
    private WheelView m;
    private PickAdapter n;
    private e o;
    private d p;
    private d q;
    private Alarm r;
    private AlarmRepeatChooser u;
    private AlarmViewModelExt v;
    private AlarmClockManager y;
    private final Lazy<BuildConfigApi> a = KoinJavaComponent.inject(BuildConfigApi.class);
    private boolean b = false;
    private int c = -1;
    private int d = 0;
    private Alarm e = null;
    private String f = null;
    private HMDeviceType i = HMDeviceType.MILI;
    private boolean s = false;
    private boolean t = false;
    private final AtomicBoolean w = new AtomicBoolean(false);
    private final Lazy<DeviceUtilsApi> x = KoinJavaComponent.inject(DeviceUtilsApi.class);

    public interface OnCheckedChangeListener {
        void onCheckedChanged(d dVar, boolean z, boolean z2);
    }

    public class a implements AlarmRepeatChooser.IChooseListener {
        public a() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.xiaomi.hm.health.ui.smartplay.alarm.AlarmRepeatChooser.IChooseListener
        public void onCancelCustomDialog() {
            e eVar = SetHuamiOSAlarmActivity.this.o;
            AlarmRepeatChooser.Companion companion = AlarmRepeatChooser.INSTANCE;
            SetHuamiOSAlarmActivity setHuamiOSAlarmActivity = SetHuamiOSAlarmActivity.this;
            eVar.b(companion.getWeekString(setHuamiOSAlarmActivity, setHuamiOSAlarmActivity.e, SetHuamiOSAlarmActivity.this.t));
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.xiaomi.hm.health.ui.smartplay.alarm.AlarmRepeatChooser.IChooseListener
        public void onChosen(int i) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT_WEEK_SETTING).setValue("Confirm"));
            SetHuamiOSAlarmActivity.this.e.setMDays(Integer.valueOf(i));
            e eVar = SetHuamiOSAlarmActivity.this.o;
            AlarmRepeatChooser.Companion companion = AlarmRepeatChooser.INSTANCE;
            SetHuamiOSAlarmActivity setHuamiOSAlarmActivity = SetHuamiOSAlarmActivity.this;
            eVar.b(companion.getWeekString(setHuamiOSAlarmActivity, setHuamiOSAlarmActivity.e, SetHuamiOSAlarmActivity.this.t));
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.alarm.AlarmRepeatChooser.IChooseListener
        public void onShowCustomDialog() {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_WEEK_SETTING_VIEW_NUM));
        }
    }

    public class b implements LoadingDialog.OnAnimEndListener {
        public final /* synthetic */ Alarm a;

        public b(Alarm alarm) {
            this.a = alarm;
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onAnimEnd(LoadingDialog loadingDialog) {
            this.a.setIsSmart(Boolean.FALSE);
            SetHuamiOSAlarmActivity.this.y.keepAlarm(this.a);
            SetHuamiOSAlarmActivity.this.y.syncAlarmToCloud(true);
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onDismiss(LoadingDialog loadingDialog) {
            SetHuamiOSAlarmActivity.this.w(true, true);
        }
    }

    public class c implements LoadingDialog.OnAnimEndListener {
        public final /* synthetic */ Alarm a;

        public c(Alarm alarm) {
            this.a = alarm;
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onAnimEnd(LoadingDialog loadingDialog) {
            SetHuamiOSAlarmActivity.this.y.keepAlarm(this.a);
            SetHuamiOSAlarmActivity.this.y.syncAlarmToCloud(true);
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onDismiss(LoadingDialog loadingDialog) {
            SetHuamiOSAlarmActivity.this.w(true, true);
        }
    }

    public class d {
        public View a;
        public SwitchCompat b;
        public TextView c;
        private boolean d = false;
        private OnCheckedChangeListener e = null;

        public d(View view, SwitchCompat switchCompat, TextView textView) {
            this.a = view;
            this.b = switchCompat;
            this.c = textView;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.ui.smartplay.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.a.c(view2);
                }
            });
            this.b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.xiaomi.hm.health.ui.smartplay.j
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.a.d(compoundButton, z);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(View view) {
            this.d = true;
            this.b.toggle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(CompoundButton compoundButton, boolean z) {
            OnCheckedChangeListener onCheckedChangeListener = this.e;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(this, z, this.d || this.b.isPressed());
            }
            this.d = false;
        }

        public void e(boolean z) {
            this.b.setChecked(z);
        }

        public void f(OnCheckedChangeListener onCheckedChangeListener) {
            this.e = onCheckedChangeListener;
        }

        public void g(int i) {
            this.c.setText(i);
        }

        public void h(boolean z) {
            this.a.setVisibility(z ? 0 : 8);
        }
    }

    public class e {
        public View a;
        public TextView b;

        public e(View view, TextView textView) {
            this.a = view;
            this.b = textView;
        }

        public void a(View.OnClickListener onClickListener) {
            this.a.setOnClickListener(onClickListener);
        }

        public void b(String str) {
            if (str == null) {
                str = "";
            }
            this.b.setText(str);
        }
    }

    private int A() {
        return this.l.getCurrentItem();
    }

    private void B(boolean z2, boolean z3) {
        Alarm alarm;
        if (z2) {
            this.e.setIsSmart(Boolean.valueOf(z3));
            if (this.s || (alarm = this.r) == null || alarm.getIndex().intValue() == this.e.getIndex().intValue() || !z3) {
                return;
            }
            h0();
        }
    }

    private boolean C() {
        Alarm alarm = this.r;
        if (alarm == null || alarm.getIndex().intValue() == this.e.getIndex().intValue()) {
            return false;
        }
        return this.e.getIsSmart().booleanValue();
    }

    private void D() {
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.rainbowTitleBar);
        this.j = rainbowTitleBar;
        rainbowTitleBar.setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: vp6
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i) {
                this.a.M(view, i);
            }
        });
        this.j.setNavigationOnClickListener(new View.OnClickListener() { // from class: sp6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.N(view);
            }
        });
    }

    private void E() {
        Intent intent = getIntent();
        if (intent != null) {
            this.c = intent.getIntExtra("index", -1);
            this.d = intent.getIntExtra("type", 0);
        }
        HMLog.i(z, "index:" + this.c + ",type:" + this.d, new Object[0]);
        this.e = this.y.getAlarmByIndex(this.c);
        this.s = this.y.isSupportMultiSmartAlert();
        if (this.d == 1) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(12, 1);
            this.e.setCalendar(Long.valueOf(calendar.getTimeInMillis()));
            this.e.setMDays(0);
            this.e.setIsSmartWakeup(Boolean.TRUE);
        }
        this.r = this.y.getSmartAlarm();
        this.f = this.x.getValue().getGson().toJson(this.e);
        HMLog.i(z, "time : " + TimeUtils.debugTime(this.e.getCalendar().longValue()) + ", alarm : " + this.f, new Object[0]);
    }

    private void F() {
        AlarmRepeatChooser alarmRepeatChooser = new AlarmRepeatChooser(this, new Function0() { // from class: yp6
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return this.a.O();
            }
        });
        this.u = alarmRepeatChooser;
        alarmRepeatChooser.setListener(new a());
    }

    private void G() {
        d dVar = new d(findViewById(R.id.lazy_mode_layout), (SwitchCompat) findViewById(R.id.lazy_mode_switch), (TextView) findViewById(R.id.tv_lazy_mode_desc));
        this.p = dVar;
        boolean z2 = true;
        dVar.h(true);
        if (HMDeviceConfig.isTempoSeries()) {
            this.p.g(R.string.alarm_clock_lazy_summary_tempo);
        } else if (HMDeviceConfig.hasBoundWatch()) {
            this.p.g(R.string.alarm_clock_lazy_summary_chaohu);
        }
        d dVar2 = this.p;
        if (this.e.getIsSmartWakeup() != null && !this.e.getIsSmartWakeup().booleanValue()) {
            z2 = false;
        }
        dVar2.e(z2);
        this.p.f(new OnCheckedChangeListener() { // from class: com.xiaomi.hm.health.ui.smartplay.g
            @Override // com.xiaomi.hm.health.ui.smartplay.SetHuamiOSAlarmActivity.OnCheckedChangeListener
            public final void onCheckedChanged(SetHuamiOSAlarmActivity.d dVar3, boolean z3, boolean z4) {
                this.a.P(dVar3, z3, z4);
            }
        });
    }

    private void H() {
        this.m = (WheelView) findViewById(R.id.ampm_wheel);
        this.k = (WheelView) findViewById(R.id.hour_wheel);
        WheelView wheelView = (WheelView) findViewById(R.id.min_wheel);
        this.l = wheelView;
        wheelView.setInterpolator(new DecelerateInterpolator(1.5f));
        this.k.setInterpolator(new DecelerateInterpolator(1.5f));
        this.m.setInterpolator(new DecelerateInterpolator(1.5f));
        int i = R.color.p4;
        int color = ContextCompat.getColor(this, i);
        int color2 = ContextCompat.getColor(this, R.color.s2);
        int color3 = ContextCompat.getColor(this, R.color.s3);
        PickAdapter pickAdapter = new PickAdapter(this, 0, 1, this.m, color, color2, -2003199591, false, 42, 20, 18, 21, 1);
        pickAdapter.setUIStyle("normal");
        pickAdapter.setMode(17);
        this.m.setLineColor(ContextCompat.getColor(this, i));
        WheelView visibleItems = this.m.setVisibleItems(2);
        int i2 = R.drawable.wheel_custom_val_white_1;
        visibleItems.setCenterDrawable(i2).setCenterStyle("", 18.0f).setViewAdapter(pickAdapter);
        WheelView wheelView2 = this.m;
        WheelView.Style style = WheelView.Style.LINE;
        wheelView2.setStyle(style);
        this.m.setUnitTextColor(color);
        this.k.setLineColor(ContextCompat.getColor(this, i));
        this.n = new PickAdapter(this, 0, 23, this.k, color, color2, color3, true, 42, 20, 18, 16, 1, 3);
        this.k.setVisibleItems(5).setCenterDrawable(i2).setViewAdapter(this.n);
        this.k.setStyle(style);
        this.k.setUnitTextColor(color);
        this.l.setLineColor(ContextCompat.getColor(this, i));
        this.l.setVisibleItems(5).setCenterDrawable(i2).setViewAdapter(new PickAdapter(this, 0, 59, this.l, color, color2, color3, true, 42, 20, 18, 16, 1, 3));
        this.l.setStyle(style);
        this.l.setUnitTextColor(color);
    }

    private void I() {
        e eVar = new e(findViewById(R.id.repeat_mode_layout), (TextView) findViewById(R.id.tv_repeat_mode_content));
        this.o = eVar;
        eVar.b(AlarmRepeatChooser.INSTANCE.getWeekString(this, this.e, this.t));
        this.o.a(new View.OnClickListener() { // from class: tp6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.Q(view);
            }
        });
    }

    private void J() {
        View viewFindViewById = findViewById(R.id.smart_mode_layout);
        TextView textView = (TextView) findViewById(R.id.tv_smart_mode_desc);
        textView.setText(HMDeviceConfig.isWatch(this.h) ? R.string.huami_os_alarm_clock_smart_summary : R.string.huami_os_alarm_clock_smart_summary_band);
        d dVar = new d(viewFindViewById, (SwitchCompat) findViewById(R.id.smart_mode_switch), textView);
        this.q = dVar;
        dVar.h(true);
        this.q.e(this.e.getIsSmart() != null && this.e.getIsSmart().booleanValue());
        this.q.f(new OnCheckedChangeListener() { // from class: com.xiaomi.hm.health.ui.smartplay.h
            @Override // com.xiaomi.hm.health.ui.smartplay.SetHuamiOSAlarmActivity.OnCheckedChangeListener
            public final void onCheckedChanged(SetHuamiOSAlarmActivity.d dVar2, boolean z2, boolean z3) {
                this.a.R(dVar2, z2, z3);
            }
        });
    }

    private void K() {
        boolean booleanExtra = getIntent().getBooleanExtra(C, false);
        HMDeviceType hMDeviceType = (HMDeviceType) getIntent().getSerializableExtra(HuamiOSAlarmActivity.KEY_DEVICE_TYPE);
        if (hMDeviceType == null) {
            hMDeviceType = HMDeviceType.MILI;
        }
        this.i = hMDeviceType;
        if (booleanExtra) {
            getDelegate().setLocalNightMode(2);
            this.w.compareAndSet(false, true);
        }
        setTheme(R.style.Theme_App_Zepp);
    }

    private boolean L(Alarm alarm) {
        f0(alarm);
        return !TextUtils.equals(this.f, this.x.getValue().getGson().toJson(alarm));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(View view, int i) {
        if (i == 0) {
            if (this.d == 1) {
                e0(this.e);
            } else {
                this.e.setEnabled(Boolean.TRUE);
            }
            b0();
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT_EDIT).setValue("Save"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(View view) {
        v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean O() {
        return Boolean.valueOf(this.t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(d dVar, boolean z2, boolean z3) {
        if (z3) {
            this.e.setIsSmartWakeup(Boolean.valueOf(z2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(View view) {
        this.u.showDialog(this, this.e, getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(d dVar, boolean z2, boolean z3) {
        B(z3, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String S() {
        return "setLocalNightMode triggers recreate, no need to recreate";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String T() {
        return "Manifest configChanges is uiMode, the page does not force dark mode; therefore, receive callbacks need to receive";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(AlarmVersionInfo alarmVersionInfo) {
        boolean z2 = alarmVersionInfo != null && alarmVersionInfo.isSupportCalendarWorkday();
        this.t = z2;
        e eVar = this.o;
        if (eVar != null) {
            eVar.b(AlarmRepeatChooser.INSTANCE.getWeekString(this, this.e, z2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(LoadingDialog loadingDialog, Alarm alarm, Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            loadingDialog.setSuccess(getString(R.string.alarm_save_success), new c(alarm));
            return;
        }
        a0();
        if (!isFinishing()) {
            loadingDialog.dismiss();
        }
        IconToast.showError(getApplicationContext(), getString(R.string.alarm_save_failed));
        w(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(LoadingDialog loadingDialog, Alarm alarm, Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            loadingDialog.setSuccess(getString(R.string.alarm_save_success), new b(alarm));
            return;
        }
        a0();
        if (!isFinishing()) {
            loadingDialog.dismiss();
        }
        IconToast.showError(getApplicationContext(), getString(R.string.alarm_save_failed));
        w(false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(DialogInterface dialogInterface, int i) {
        a0();
        w(false, true);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT_EDIT).setValue("Confirm"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(DialogInterface dialogInterface, int i) {
        this.e.setIsSmart(Boolean.TRUE);
        this.r.setIsSmart(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(DialogInterface dialogInterface, int i) {
        this.q.e(false);
        this.e.setIsSmart(Boolean.FALSE);
    }

    private void a0() {
        this.e = (Alarm) this.x.getValue().getGson().fromJson(this.f, Alarm.class);
        HMLog.d(z, "reset alarm : " + this.e, new Object[0]);
        this.y.keepVisibleAlarm(this.e);
        HMLog.d(z, "resetAlarm : " + this.f, new Object[0]);
    }

    private void b0() {
        if (!L(this.e)) {
            w(false, true);
        } else if (!this.s && C()) {
            d0(this.e, this.r);
        } else {
            e0(this.e);
            c0(this.e);
        }
    }

    private void c0(final Alarm alarm) {
        HMLog.d(z, "set alarm to device ", new Object[0]);
        HMBaseDevice hMBaseDevice = this.g;
        if (hMBaseDevice == null || !hMBaseDevice.isConnected()) {
            a0();
            IconToast.showError(getApplicationContext(), getString(R.string.alarm_save_failed));
            w(false, false);
            return;
        }
        final LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.alarm_save));
        loadingDialogShowDialog.setCancelable(false);
        IAlarmCallback<Boolean> iAlarmCallback = new IAlarmCallback() { // from class: xp6
            @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmCallback
            public final void onResult(Object obj) {
                this.a.V(loadingDialogShowDialog, alarm, (Boolean) obj);
            }
        };
        if (this.d == 1) {
            this.v.addAlarm(alarm, iAlarmCallback);
        } else {
            this.v.updateAlarm(alarm, iAlarmCallback);
        }
    }

    private void d0(Alarm alarm, final Alarm alarm2) {
        HMLog.d(z, "set alarm to device with smart", new Object[0]);
        HMBaseDevice hMBaseDevice = this.g;
        if (hMBaseDevice == null || !hMBaseDevice.isConnected()) {
            a0();
            IconToast.showError(getApplicationContext(), getString(R.string.alarm_save_failed));
            w(false, false);
        } else {
            final LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.alarm_save));
            loadingDialogShowDialog.setCancelable(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.y.alarm2Ext(alarm));
            arrayList.add(this.y.alarm2Ext(alarm2));
            this.v.updateAlarms(arrayList, new IAlarmCallback() { // from class: wp6
                @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmCallback
                public final void onResult(Object obj) {
                    this.a.W(loadingDialogShowDialog, alarm2, (Boolean) obj);
                }
            });
        }
    }

    private void e0(Alarm alarm) {
        Boolean bool = Boolean.TRUE;
        alarm.setVisible(bool);
        alarm.setEnabled(bool);
        this.y.setAlarm4Once(alarm);
    }

    private void f0(Alarm alarm) {
        int iZ = z();
        int iA = A();
        HMLog.d(z, "hour:" + iZ + ", min:" + iA, new Object[0]);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(alarm.getCalendar().longValue());
        calendar.set(11, iZ);
        calendar.set(12, iA);
        alarm.setCalendar(Long.valueOf(calendar.getTimeInMillis()));
        HMLog.d(z, "save alarm : " + alarm, new Object[0]);
    }

    private void g0() {
        new AlertDialogFragment.Builder(this).setMessage(getString(R.string.cancel_save_tips)).setPositiveButton(getString(R.string.give_up), new DialogInterface.OnClickListener() { // from class: np6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.X(dialogInterface, i);
            }
        }).setNegativeButton(getString(R.string.cancel), (DialogInterface.OnClickListener) null).setCancelable(false).show(getSupportFragmentManager());
    }

    private void h0() {
        if (this.r == null) {
            return;
        }
        new AlertDialogFragment.Builder(this).setMessage(R.string.smart_alarm_diaog_message).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: qp6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.Z(dialogInterface, i);
            }
        }).setPositiveButton(R.string.smart_alarm_diaog_continue, new DialogInterface.OnClickListener() { // from class: rp6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.Y(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void i0(int i) {
        HMLog.d(z, "updateAmPmByHour hour=" + i, new Object[0]);
        WheelView wheelView = this.m;
        if (wheelView == null || this.b) {
            return;
        }
        wheelView.setCurrentItem(i >= 12 ? 1 : 0);
    }

    private void initView() {
        H();
        F();
        I();
        if (HMDeviceConfig.hasFeatureLazyAlarmDevice()) {
            G();
        }
        if (this.y.isSupportSmartAlarm()) {
            J();
        }
    }

    private void j0(int i) {
        HMLog.d(z, "updateHourByAmPm : " + i, new Object[0]);
        if (this.b) {
            return;
        }
        int currentItem = this.k.getCurrentItem();
        HMLog.d(z, "cur hour =" + currentItem, new Object[0]);
        if (i == 0) {
            if (currentItem >= 12) {
                currentItem -= 12;
            }
        } else if (currentItem < 12) {
            currentItem += 12;
        }
        HMLog.d(z, "after hour =" + currentItem, new Object[0]);
        this.k.setCurrentItemLooped(currentItem);
    }

    private void k0() {
        this.b = DateFormat.is24HourFormat(this);
        this.l.setCurrentItemLooped(y());
        if (this.b) {
            this.m.setVisibility(8);
            this.n.setMode(9);
            this.k.setViewAdapter(this.n);
            this.k.setCurrentItemLooped(x());
            return;
        }
        this.m.setVisibility(0);
        this.n.setMode(16);
        this.k.setViewAdapter(this.n);
        int iX = x();
        if (iX >= 12) {
            this.m.setCurrentItem(1);
            this.k.setCurrentItemLooped(iX - 12);
        } else {
            this.m.setCurrentItem(0);
            this.k.setCurrentItemLooped(iX);
        }
    }

    public static void launch(Activity activity, int i, int i2) {
        Intent intent = new Intent(activity, (Class<?>) SetHuamiOSAlarmActivity.class);
        intent.putExtra("index", i2);
        intent.putExtra("type", i);
        activity.startActivityForResult(intent, 0);
    }

    private void v() {
        if (!L(this.e)) {
            w(false, true);
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT_EDIT).setValue("Cancle1"));
        } else {
            e0(this.e);
            g0();
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT_EDIT).setValue("Cancle2"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(boolean z2, boolean z3) {
        Intent intent = new Intent();
        intent.putExtra(KEY_IS_CHANGE, z2);
        setResult(this.c, intent);
        if (z3) {
            finish();
        }
    }

    private int x() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.e.getCalendar().longValue());
        return calendar.get(11);
    }

    private int y() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.e.getCalendar().longValue());
        return calendar.get(12);
    }

    private int z() {
        return this.k.getCurrentItem();
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        v();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull @NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.w.compareAndSet(true, false) && configuration.uiMode == 32) {
            HMLog.info(z, new Function0() { // from class: op6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return SetHuamiOSAlarmActivity.S();
                }
            });
        } else {
            HMLog.info(z, new Function0() { // from class: pp6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return SetHuamiOSAlarmActivity.T();
                }
            });
            ActivityCompat.recreate(this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        K();
        super.onCreate(bundle);
        setContentView(R.layout.activity_set_alarm_new);
        D();
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(this.i);
        this.g = device;
        this.h = device == null ? null : device.getMDeviceSource();
        this.y = AlarmClockManager.getInstance();
        AlarmViewModelExt alarmViewModelExt = (AlarmViewModelExt) new ViewModelProvider(this).get(AlarmViewModelExt.class);
        this.v = alarmViewModelExt;
        alarmViewModelExt.setUp(this.g);
        this.v.getAlarmVersionInfo().observe(this, new Observer() { // from class: up6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.U((AlarmVersionInfo) obj);
            }
        });
        this.b = DateFormat.is24HourFormat(this);
        E();
        initView();
        EventBus.getDefault().register(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEvent(Event12HourUpdate event12HourUpdate) {
        i0(event12HourUpdate.getHour());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        k0();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_EDIT_VIEW_NUM));
    }

    public void onEvent(EventAmPmUpdate eventAmPmUpdate) {
        j0(eventAmPmUpdate.getAmPm());
    }

    public static void launch(Activity activity, int i, int i2, boolean z2) {
        Intent intent = new Intent(activity, (Class<?>) SetHuamiOSAlarmActivity.class);
        intent.putExtra("index", i2);
        intent.putExtra("type", i);
        intent.putExtra(C, z2);
        activity.startActivityForResult(intent, 0);
    }

    public static void launch(Activity activity, int i, int i2, boolean z2, HMDeviceType hMDeviceType) {
        Intent intent = new Intent(activity, (Class<?>) SetHuamiOSAlarmActivity.class);
        intent.putExtra("index", i2);
        intent.putExtra("type", i);
        intent.putExtra(C, z2);
        intent.putExtra(HuamiOSAlarmActivity.KEY_DEVICE_TYPE, hMDeviceType);
        activity.startActivityForResult(intent, 0);
    }
}
