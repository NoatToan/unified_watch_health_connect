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
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.huami.widget.wheelview.OnWheelScrollListener;
import com.huami.widget.wheelview.WheelView;
import com.huami.widget.wheelview.adapters.PickAdapter;
import com.huami.widget.wheelview.event.Event12HourUpdate;
import com.huami.widget.wheelview.event.EventAmPmUpdate;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.model.AlarmClockItem;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.ui.smartplay.SetAlarmActivity;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventReminderExpandKt;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes22.dex */
public class SetAlarmActivity extends BaseTitleActivity {
    private static final String Q = "SetAlarmActivity";
    private static final String R = "index";
    private static final String S = "type";
    private static final String T = "key_force_dark_theme";
    public static final int TYPE_ADD = 1;
    public static final int TYPE_EDIT = 0;
    private static final int U = 0;
    private static final int V = 1;
    private static final int W = 0;
    private static final int X = 42;
    private HMMiLiDevice E;
    private WheelView F;
    private WheelView G;
    private WheelView H;
    private PickAdapter I;
    private ListTile J;
    private ListTile K;
    private ListTile L;
    private Alarm M;
    private TextView y;
    private final boolean[] x = {false, false, false, false, false, false, false};
    private boolean z = false;
    private int A = -1;
    private int B = 0;
    private Alarm C = null;
    private String D = null;
    private final AtomicBoolean N = new AtomicBoolean(false);
    private final Lazy<DeviceUtilsApi> O = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private final DialogInterface.OnClickListener P = new f();

    public class a implements OnWheelScrollListener {
        public a() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            SetAlarmActivity.this.m0();
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    public class b implements OnWheelScrollListener {
        public b() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            SetAlarmActivity.this.m0();
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    public class c implements OnWheelScrollListener {
        public c() {
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingFinished(WheelView wheelView) {
            SetAlarmActivity.this.m0();
        }

        @Override // com.huami.widget.wheelview.OnWheelScrollListener
        public void onScrollingStarted(WheelView wheelView) {
        }
    }

    public class d extends HMCallback {
        public final /* synthetic */ LoadingDialog a;
        public final /* synthetic */ Alarm b;

        public class a implements LoadingDialog.OnAnimEndListener {
            public a() {
            }

            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onAnimEnd(LoadingDialog loadingDialog) {
                d.this.b.setIsSmart(Boolean.FALSE);
                AlarmClockManager.getInstance().keepAlarm(d.this.b);
                AlarmClockManager.getInstance().syncAlarmToCloud(true);
            }

            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onDismiss(LoadingDialog loadingDialog) {
                SetAlarmActivity.this.H(true, true);
            }
        }

        public d(LoadingDialog loadingDialog, Alarm alarm) {
            this.a = loadingDialog;
            this.b = alarm;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            HMLog.i(SetAlarmActivity.Q, "set alarm to device with smart : " + z, new Object[0]);
            if (z) {
                AlarmClockManager.postNonDeviceAlarmEvent(HMDeviceType.MILI);
                this.a.setSuccess(SetAlarmActivity.this.getString(R.string.alarm_save_success), new a());
                return;
            }
            SetAlarmActivity.this.f0();
            if (!SetAlarmActivity.this.isFinishing()) {
                this.a.dismiss();
            }
            IconToast.showError(SetAlarmActivity.this.getApplicationContext(), SetAlarmActivity.this.getString(R.string.alarm_save_failed));
            SetAlarmActivity.this.H(false, false);
        }
    }

    public class e extends HMCallback {
        public final /* synthetic */ LoadingDialog a;
        public final /* synthetic */ Alarm b;

        public class a implements LoadingDialog.OnAnimEndListener {
            public a() {
            }

            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onAnimEnd(LoadingDialog loadingDialog) {
                AlarmClockManager.getInstance().keepAlarm(e.this.b);
                AlarmClockManager.getInstance().syncAlarmToCloud(true);
            }

            @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
            public void onDismiss(LoadingDialog loadingDialog) {
                SetAlarmActivity.this.H(true, true);
            }
        }

        public e(LoadingDialog loadingDialog, Alarm alarm) {
            this.a = loadingDialog;
            this.b = alarm;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            HMLog.i(SetAlarmActivity.Q, "set alarm to device : " + z, new Object[0]);
            if (z) {
                AlarmClockManager.postNonDeviceAlarmEvent(HMDeviceType.MILI);
                this.a.setSuccess(SetAlarmActivity.this.getString(R.string.alarm_save_success), new a());
                return;
            }
            SetAlarmActivity.this.f0();
            if (!SetAlarmActivity.this.isFinishing()) {
                this.a.dismiss();
            }
            IconToast.showError(SetAlarmActivity.this.getApplicationContext(), SetAlarmActivity.this.getString(R.string.alarm_save_failed));
            SetAlarmActivity.this.H(false, false);
        }
    }

    public class f implements DialogInterface.OnClickListener {
        public f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (i == -2) {
                SetAlarmActivity.this.J.setTips(AlarmClockManager.getInstance().getWeekString(SetAlarmActivity.this.C));
                return;
            }
            if (i != -1) {
                return;
            }
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT_WEEK_SETTING).setValue("Confirm"));
            SetAlarmActivity.this.C.setMDays(Integer.valueOf(SetAlarmActivity.this.J()));
            SetAlarmActivity.this.m0();
            SetAlarmActivity.this.J.setTips(AlarmClockManager.getInstance().getWeekString(SetAlarmActivity.this.C));
        }
    }

    private void E() {
        if (!S(this.C)) {
            H(false, true);
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT_EDIT).setValue("Cancle1"));
        } else {
            j0(this.C);
            n0();
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT_EDIT).setValue("Cancle2"));
        }
    }

    private static void F(boolean[] zArr) {
        for (int i = 0; i < 7; i++) {
            zArr[i] = false;
        }
    }

    private void G() {
        for (boolean z : this.x) {
            HMLog.d(Q, "select : " + z, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(boolean z, boolean z2) {
        Intent intent = new Intent();
        intent.putExtra(SetHuamiOSAlarmActivity.KEY_IS_CHANGE, z);
        setResult(this.A, intent);
        if (z2) {
            finish();
        }
    }

    private int I(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 127) {
            return 1;
        }
        return (i == 31 || i == 128) ? 2 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int J() {
        int length = this.x.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.x[i2]) {
                i |= AlarmClockItem.WEEK_MASK[i2];
            }
        }
        HMLog.d(Q, "day : " + i, new Object[0]);
        return i;
    }

    private int K() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.C.getCalendar().longValue());
        return calendar.get(11);
    }

    private int L() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.C.getCalendar().longValue());
        return calendar.get(12);
    }

    private int M() {
        return this.F.getCurrentItem();
    }

    private int N() {
        return this.G.getCurrentItem();
    }

    private void O(boolean z, boolean z2) {
        if (z) {
            this.C.setIsSmart(Boolean.valueOf(z2));
            Alarm alarm = this.M;
            if (alarm == null || alarm.getIndex().intValue() == this.C.getIndex().intValue() || !z2) {
                return;
            }
            q0();
        }
    }

    private boolean P() {
        Alarm alarm = this.M;
        if (alarm == null || alarm.getIndex().intValue() == this.C.getIndex().intValue()) {
            return false;
        }
        return this.C.getIsSmart().booleanValue();
    }

    private void Q() {
        Intent intent = getIntent();
        if (intent != null) {
            this.A = intent.getIntExtra("index", -1);
            this.B = intent.getIntExtra("type", 0);
        }
        HMLog.i(Q, "index:" + this.A + ",type:" + this.B, new Object[0]);
        this.C = AlarmClockManager.getInstance().getAlarmByIndex(this.A);
        if (this.B == 1) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(12, 1);
            this.C.setCalendar(Long.valueOf(calendar.getTimeInMillis()));
            this.C.setMDays(0);
            this.C.setIsSmartWakeup(Boolean.TRUE);
        }
        this.D = this.O.getValue().getGson().toJson(this.C);
        this.M = AlarmClockManager.getInstance().getSmartAlarm();
        HMLog.i(Q, "time : " + TimeUtils.debugTime(this.C.getCalendar().longValue()) + ", alarm : " + this.D, new Object[0]);
    }

    private void R() {
        this.H = (WheelView) findViewById(R.id.ampm_wheel);
        this.F = (WheelView) findViewById(R.id.hour_wheel);
        WheelView wheelView = (WheelView) findViewById(R.id.min_wheel);
        this.G = wheelView;
        wheelView.setInterpolator(new DecelerateInterpolator(1.5f));
        this.F.setInterpolator(new DecelerateInterpolator(1.5f));
        this.H.setInterpolator(new DecelerateInterpolator(1.5f));
        WheelView wheelView2 = this.H;
        int i = R.color.p4;
        int color = ContextCompat.getColor(this, i);
        int i2 = R.color.s1;
        int color2 = ContextCompat.getColor(this, i2);
        int i3 = R.color.s2;
        PickAdapter pickAdapter = new PickAdapter(this, 0, 1, wheelView2, color, color2, ContextCompat.getColor(this, i3), false, 42, 15, 12, 21, 1);
        pickAdapter.setUIStyle("normal");
        pickAdapter.setMode(17);
        WheelView visibleItems = this.H.setVisibleItems(2);
        int i4 = R.drawable.shape_wheel_view_center;
        visibleItems.setCenterDrawable(i4).setCenterStyle("", i, 18.0f).setViewAdapter(pickAdapter);
        this.H.addScrollingListener(new a());
        this.I = new PickAdapter(this, 0, 23, this.F, ContextCompat.getColor(this, i), ContextCompat.getColor(this, i2), ContextCompat.getColor(this, i3), true, 42, 15, 12, 11, 1, 3);
        this.F.setVisibleItems(5).setCenterDrawable(i4).setCenterStyle(getResources().getString(R.string.unit_hour), i, 8, 10.0f, -1.0f).setViewAdapter(this.I);
        this.F.addScrollingListener(new b());
        this.G.setVisibleItems(5).setCenterDrawable(i4).setCenterStyle(getResources().getString(R.string.unit_min), i, 8, 10.0f, -1.0f).setViewAdapter(new PickAdapter(this, 0, 59, this.G, ContextCompat.getColor(this, i), ContextCompat.getColor(this, i2), ContextCompat.getColor(this, i3), true, 42, 15, 12, 11, 1, 3));
        this.G.addScrollingListener(new c());
    }

    private boolean S(Alarm alarm) {
        k0(alarm);
        return !TextUtils.equals(this.D, this.O.getValue().getGson().toJson(alarm));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(View view) {
        p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            this.C.setIsSmartWakeup(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(CompoundButton compoundButton, boolean z) {
        O(compoundButton.isPressed(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String W() {
        return "setLocalNightMode triggers recreate, no need to recreate";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String X() {
        return "Manifest configChanges is uiMode, the page does not force dark mode; therefore, receive callbacks need to receive";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(DialogInterface dialogInterface, int i) {
        f0();
        H(false, true);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT_EDIT).setValue("Confirm"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(DialogInterface dialogInterface, int i, boolean z) {
        this.x[i] = z;
        G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(DialogInterface dialogInterface, int i) {
        this.P.onClick(dialogInterface, i);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(DialogInterface dialogInterface, int i) {
        this.P.onClick(dialogInterface, i);
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c0(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            this.C.setMDays(0);
            m0();
            this.J.setTips(AlarmClockManager.getInstance().getWeekString(this.C));
            return;
        }
        if (i == 1) {
            this.C.setMDays(127);
            m0();
            this.J.setTips(AlarmClockManager.getInstance().getWeekString(this.C));
        } else if (i == 2) {
            this.C.setMDays(31);
            m0();
            this.J.setTips(AlarmClockManager.getInstance().getWeekString(this.C));
        } else {
            if (i != 3) {
                return;
            }
            m0();
            F(this.x);
            l0(this.x);
            o0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(DialogInterface dialogInterface, int i) {
        this.L.setChecked(false);
        this.C.setIsSmart(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e0(DialogInterface dialogInterface, int i) {
        this.C.setIsSmart(Boolean.TRUE);
        this.M.setIsSmart(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0() {
        this.C = (Alarm) this.O.getValue().getGson().fromJson(this.D, Alarm.class);
        HMLog.d(Q, "reset alarm : " + this.C, new Object[0]);
        AlarmClockManager.getInstance().keepVisibleAlarm(this.C);
        HMLog.d(Q, "resetAlarm : " + this.D, new Object[0]);
    }

    private void g0() {
        if (!S(this.C)) {
            H(false, true);
        } else if (P()) {
            i0(this.C, this.M);
        } else {
            j0(this.C);
            h0(this.C);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        if (this.B == 1) {
            j0(this.C);
        } else {
            this.C.setEnabled(Boolean.TRUE);
        }
        g0();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT_EDIT).setValue("Save"));
    }

    private void h0(Alarm alarm) {
        HMLog.d(Q, "set alarm to device ", new Object[0]);
        HMMiLiDevice hMMiLiDevice = this.E;
        if (hMMiLiDevice == null || !hMMiLiDevice.isConnected()) {
            f0();
            IconToast.showError(getApplicationContext(), getString(R.string.alarm_save_failed));
            H(false, false);
        } else {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.alarm_save));
            loadingDialogShowDialog.setCancelable(false);
            this.E.setAlarmClock(AlarmClockManager.getInstance().alarm2Ext(alarm), new e(loadingDialogShowDialog, alarm));
        }
    }

    private void i0(Alarm alarm, Alarm alarm2) {
        HMLog.d(Q, "set alarm to device with smart", new Object[0]);
        HMMiLiDevice hMMiLiDevice = this.E;
        if (hMMiLiDevice == null || !hMMiLiDevice.isConnected()) {
            f0();
            IconToast.showError(getApplicationContext(), getString(R.string.alarm_save_failed));
            H(false, false);
        } else {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.alarm_save));
            loadingDialogShowDialog.setCancelable(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(AlarmClockManager.getInstance().alarm2Ext(alarm));
            arrayList.add(AlarmClockManager.getInstance().alarm2Ext(alarm2));
            this.E.setAlarmClock(arrayList, new d(loadingDialogShowDialog, alarm2));
        }
    }

    private void initView() {
        R();
        this.y = (TextView) findViewById(R.id.alarm_delay_text);
        ListTile listTile = (ListTile) findViewById(R.id.repeat_item);
        this.J = listTile;
        listTile.setTips(AlarmClockManager.getInstance().getWeekString(this.C));
        this.J.setOnClickListener(new View.OnClickListener() { // from class: yo6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.T(view);
            }
        });
        if (HMDeviceConfig.hasFeatureLazyAlarmDevice()) {
            ListTile listTile2 = (ListTile) findViewById(R.id.lazy_item);
            this.K = listTile2;
            listTile2.setVisibility(0);
            findViewById(R.id.divider).setVisibility(0);
            if (HMDeviceConfig.isTempoSeries()) {
                this.K.setSubtitle(R.string.alarm_clock_lazy_summary_tempo);
            } else if (HMDeviceConfig.hasBoundWatch()) {
                this.K.setSubtitle(R.string.alarm_clock_lazy_summary_chaohu);
            }
            this.K.setChecked(this.C.getIsSmartWakeup() == null || this.C.getIsSmartWakeup().booleanValue());
            this.K.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: po6
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.a.U(compoundButton, z);
                }
            });
        }
        if (AlarmClockManager.getInstance().isSupportSmartAlarm()) {
            ListTile listTile3 = (ListTile) findViewById(R.id.smart_item);
            this.L = listTile3;
            listTile3.setVisibility(0);
            findViewById(R.id.divider).setVisibility(0);
            this.L.setChecked(this.C.getIsSmart() != null && this.C.getIsSmart().booleanValue());
            this.L.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ap6
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.a.V(compoundButton, z);
                }
            });
        }
    }

    private void j0(Alarm alarm) {
        Boolean bool = Boolean.TRUE;
        alarm.setVisible(bool);
        alarm.setEnabled(bool);
        AlarmClockManager.getInstance().setAlarm4Once(alarm);
    }

    private void k0(Alarm alarm) {
        int iM = M();
        int iN = N();
        HMLog.d(Q, "hour:" + iM + ", min:" + iN, new Object[0]);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(alarm.getCalendar().longValue());
        calendar.set(11, iM);
        calendar.set(12, iN);
        alarm.setCalendar(Long.valueOf(calendar.getTimeInMillis()));
        HMLog.d(Q, "save alarm : " + alarm, new Object[0]);
    }

    private void l0(boolean[] zArr) {
        int iIntValue = this.C.getMDays().intValue();
        for (int i = 6; i >= 0; i--) {
            if (((64 >> (6 - i)) & iIntValue) != 0) {
                zArr[i] = true;
            }
        }
    }

    public static void launch(Activity activity, int i, int i2) {
        Intent intent = new Intent(activity, (Class<?>) SetAlarmActivity.class);
        intent.putExtra("index", i2);
        intent.putExtra("type", i);
        activity.startActivityForResult(intent, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        this.y.setText(AlarmClockManager.getInstance().getStatusTipStr(M(), N(), this.C.getMDays().intValue()));
    }

    private void n0() {
        new AlertDialogFragment.Builder(this).setMessage(getString(R.string.cancel_save_tips)).setPositiveButton(getString(R.string.give_up), new DialogInterface.OnClickListener() { // from class: to6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.Y(dialogInterface, i);
            }
        }).setNegativeButton(getString(R.string.cancel), (DialogInterface.OnClickListener) null).setCancelable(false).show(getSupportFragmentManager());
    }

    private void o0() {
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_WEEK_SETTING_VIEW_NUM));
        AlertDialogFragment.ChoiceItems choiceItems = new AlertDialogFragment.ChoiceItems();
        choiceItems.setItems(R.array.weeks);
        choiceItems.setItemsChecked(this.x);
        new AlertDialogFragment.Builder(this).setTitle(R.string.repeat).setMultiChoiceItems(choiceItems, new DialogInterface.OnMultiChoiceClickListener() { // from class: xo6
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
                this.a.Z(dialogInterface, i, z);
            }
        }).setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: uo6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.a0(dialogInterface, i);
            }
        }).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: vo6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.b0(dialogInterface, i);
            }
        }).setCancelable(false).show(getSupportFragmentManager());
    }

    private void p0() {
        new AlertDialogFragment.Builder(this).setCancelable(true).setTitle(R.string.alarm_clock_repeat).setSingleChoiceItems(new AlertDialogFragment.ChoiceItems().setItems(R.array.alarm_repeat_titles).setItemChoice(I(this.C.getMDays().intValue())), new DialogInterface.OnClickListener() { // from class: so6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.c0(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void q0() {
        if (this.M == null) {
            return;
        }
        new AlertDialogFragment.Builder(this).setMessage(R.string.smart_alarm_diaog_message).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: oo6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.d0(dialogInterface, i);
            }
        }).setPositiveButton(R.string.smart_alarm_diaog_continue, new DialogInterface.OnClickListener() { // from class: wo6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.e0(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    private void r0(int i) {
        HMLog.d(Q, "updateAmPmByHour hour=" + i, new Object[0]);
        WheelView wheelView = this.H;
        if (wheelView == null || this.z) {
            return;
        }
        wheelView.setCurrentItem(i >= 12 ? 1 : 0);
    }

    private void s0(int i) {
        HMLog.d(Q, "updateHourByAmPm : " + i, new Object[0]);
        if (this.z) {
            return;
        }
        int currentItem = this.F.getCurrentItem();
        HMLog.d(Q, "cur hour =" + currentItem, new Object[0]);
        if (i == 0) {
            if (currentItem >= 12) {
                currentItem -= 12;
            }
        } else if (currentItem < 12) {
            currentItem += 12;
        }
        HMLog.d(Q, "after hour =" + currentItem, new Object[0]);
        this.F.setCurrentItemLooped(currentItem);
    }

    private void t0() {
        this.z = DateFormat.is24HourFormat(this);
        this.G.setCurrentItemLooped(L());
        if (this.z) {
            this.H.setVisibility(8);
            this.I.setMode(9);
            this.F.setViewAdapter(this.I);
            this.F.setCurrentItemLooped(K());
            return;
        }
        this.H.setVisibility(0);
        this.I.setMode(16);
        this.F.setViewAdapter(this.I);
        int iK = K();
        if (iK >= 12) {
            this.H.setCurrentItem(1);
            this.F.setCurrentItemLooped(iK - 12);
        } else {
            this.H.setCurrentItem(0);
            this.F.setCurrentItemLooped(iK);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        HMLog.d(Q, "finish", new Object[0]);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        E();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull @NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.N.compareAndSet(true, false) && configuration.uiMode == 32) {
            HMLog.info(Q, new Function0() { // from class: qo6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return SetAlarmActivity.W();
                }
            });
        } else {
            HMLog.info(Q, new Function0() { // from class: ro6
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return SetAlarmActivity.X();
                }
            });
            ActivityCompat.recreate(this);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (getIntent().getBooleanExtra(T, false)) {
            getDelegate().setLocalNightMode(2);
            this.N.compareAndSet(false, true);
        }
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_set_alarm);
        EventReminderExpandKt.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.CANCEL_AND_SAVE, getString(R.string.set_alarm), null);
        this.E = (HMMiLiDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        this.z = DateFormat.is24HourFormat(this);
        Q();
        initView();
        getRightTitle().setOnClickListener(new View.OnClickListener() { // from class: zo6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(view);
            }
        });
        EventBus.getDefault().register(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    public void onEvent(Event12HourUpdate event12HourUpdate) {
        r0(event12HourUpdate.getHour());
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onLeftClicked() {
        E();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        t0();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_EDIT_VIEW_NUM));
    }

    public void onEvent(EventAmPmUpdate eventAmPmUpdate) {
        s0(eventAmPmUpdate.getAmPm());
    }

    public static void launch(Activity activity, int i, int i2, boolean z) {
        Intent intent = new Intent(activity, (Class<?>) SetAlarmActivity.class);
        intent.putExtra("index", i2);
        intent.putExtra("type", i);
        intent.putExtra(T, z);
        activity.startActivityForResult(intent, 0);
    }
}
