package com.xiaomi.hm.health.ui.smartplay;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.format.DateFormat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.action.ToolUtilApi;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceAlarmEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.smartplay.MiBandAlarmActivity;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventReminderExpandKt;
import com.xiaomi.hm.health.ui.smartplay.eventremind.RxUtil;
import de.greenrobot.event.EventBus;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.koin.java.KoinJavaComponent;
import rx.Observable;
import rx.functions.Action1;

/* JADX INFO: loaded from: classes22.dex */
public class MiBandAlarmActivity extends BaseTitleActivity implements View.OnClickListener {
    public static final int ALARM_NORMAL_SIZE = 3;
    public static final int ALARM_PRO_SIZE = 10;
    private static final String X = "MiBandAlarmActivity";
    private static final int Y = 250;
    private static final int Z = 17;
    private static final String m0 = "key_force_dark_theme";
    private HMMiLiDevice A;
    private View B;
    private TextView C;
    private TextView D;
    private TextView E;
    private TextView F;
    private List<Alarm> G;
    private AlarmClockManager H;
    private View I;
    private View J;
    private TextView K;
    private View L;
    private j M;
    private boolean N = false;
    private boolean O = false;
    private final Lazy<DeviceManagerApi> P;
    private final Lazy<DeviceUtilsApi> Q;
    private final Lazy<ToolUtilApi> R;
    private final Lazy<DeviceXNavigator> S;
    private final HMDeviceSource T;
    private boolean U;
    private final AtomicBoolean V;
    private final i W;
    private RecyclerView x;
    private f y;
    private Handler z;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnTouchListener {
        public final TextView a;
        public final TextView b;
        public final TextView c;
        public final TextView d;
        public final SwitchCompat e;
        public final View f;
        public i g;
        private final View h;
        private boolean i;

        @SuppressLint({"ClickableViewAccessibility"})
        public ViewHolder(View view) {
            super(view);
            this.h = view;
            this.a = (TextView) view.findViewById(R.id.miband_alarm_time_text);
            this.b = (TextView) view.findViewById(R.id.miband_alarm_ampm_text);
            this.c = (TextView) view.findViewById(R.id.miband_alarm_repeat);
            this.d = (TextView) view.findViewById(R.id.miband_alarm_status);
            SwitchCompat switchCompat = (SwitchCompat) view.findViewById(R.id.miband_alarm_switch);
            this.e = switchCompat;
            switchCompat.setOnTouchListener(this);
            ((DeviceUtilsApi) MiBandAlarmActivity.this.Q.getValue()).setViewTouchDelegate(switchCompat, 50, 50, 50, 50);
            this.f = view.findViewById(R.id.delete_layout);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Alarm alarm, View view) {
            this.g.onClick(alarm.getIndex().intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(int i, CompoundButton compoundButton, boolean z) {
            HMLog.d(MiBandAlarmActivity.X, "setOnCheckedChangeListener position: " + i + " switch : " + z, new Object[0]);
            if (Build.VERSION.SDK_INT < 21) {
                if (this.i) {
                    MiBandAlarmActivity.this.M(i, z);
                }
            } else if (compoundButton.isPressed()) {
                MiBandAlarmActivity.this.M(i, z);
            }
            if (z) {
                Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_SWITCH).setValue("On"));
            } else {
                Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_SWITCH).setValue("Off"));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Alarm alarm, View view) {
            MiBandAlarmActivity.this.L(alarm.getIndex().intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h() {
            this.i = false;
        }

        private void k(boolean z) {
            if (z) {
                this.i = true;
            } else {
                this.h.postDelayed(new Runnable() { // from class: y35
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.h();
                    }
                }, 20L);
            }
        }

        private void l(Alarm alarm) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(alarm.getCalendar().longValue());
            Date date = new Date(alarm.getCalendar().longValue());
            if (DateFormat.is24HourFormat(MiBandAlarmActivity.this.getApplicationContext())) {
                this.b.setVisibility(8);
                this.a.setText(TimeUtils.formatDate(MiBandAlarmActivity.this.getString(R.string.time_HHmm_pattern), calendar.getTime()));
            } else {
                this.b.setVisibility(0);
                this.b.setText(TimeUtils.getPrefix_zh(DeviceXFunctionsKt.getContext(), date));
                this.a.setText(TimeUtils.formatDate12Hour(MiBandAlarmActivity.this, date));
            }
        }

        public void bind(final Alarm alarm, final int i) {
            this.h.setOnClickListener(new View.OnClickListener() { // from class: v35
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.e(alarm, view);
                }
            });
            this.c.setText(MiBandAlarmActivity.this.H.getWeekString(alarm));
            MiBandAlarmActivity.this.H.getWeekString(alarm);
            this.d.setText(MiBandAlarmActivity.this.K(alarm));
            HMLog.d(MiBandAlarmActivity.X, "bind alarm : " + ((DeviceUtilsApi) MiBandAlarmActivity.this.Q.getValue()).getGson().toJson(alarm), new Object[0]);
            this.e.setChecked(alarm.getEnabled().booleanValue());
            this.e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: x35
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    this.a.f(i, compoundButton, z);
                }
            });
            this.f.setOnClickListener(new View.OnClickListener() { // from class: w35
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.g(alarm, view);
                }
            });
            l(alarm);
        }

        public void i(j jVar) {
            if (jVar == j.SHOW) {
                this.e.setVisibility(8);
                ((DeviceUtilsApi) MiBandAlarmActivity.this.Q.getValue()).removeViewTouchDelegate(this.e);
                float scaleY = this.e.getScaleY();
                float scaleX = this.e.getScaleX();
                float alpha = this.e.getAlpha();
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.e, "scaleY", scaleY, 0.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.e, "scaleX", scaleX, 0.0f);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.e, "alpha", alpha, 0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                long j = 250;
                animatorSet.setDuration(j);
                animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
                animatorSet.start();
                this.f.setVisibility(0);
                float scaleY2 = this.f.getScaleY();
                float scaleX2 = this.f.getScaleX();
                float alpha2 = this.f.getAlpha();
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.f, "scaleY", scaleY2, 1.0f);
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.f, "scaleX", scaleX2, 1.0f);
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.f, "alpha", alpha2, 1.0f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.setDuration(j);
                animatorSet2.play(objectAnimatorOfFloat4).with(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6);
                animatorSet2.start();
                return;
            }
            if (jVar == j.NORMAl) {
                this.e.setVisibility(0);
                ((DeviceUtilsApi) MiBandAlarmActivity.this.Q.getValue()).setViewTouchDelegate(this.e, 50, 50, 50, 50);
                float scaleY3 = this.e.getScaleY();
                float scaleX3 = this.e.getScaleX();
                float alpha3 = this.e.getAlpha();
                ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(this.e, "scaleY", scaleY3, 1.0f);
                ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(this.e, "scaleX", scaleX3, 1.0f);
                ObjectAnimator objectAnimatorOfFloat9 = ObjectAnimator.ofFloat(this.e, "alpha", alpha3, 1.0f);
                AnimatorSet animatorSet3 = new AnimatorSet();
                long j2 = 250;
                animatorSet3.setDuration(j2);
                animatorSet3.play(objectAnimatorOfFloat7).with(objectAnimatorOfFloat8).with(objectAnimatorOfFloat9);
                animatorSet3.start();
                this.f.setVisibility(8);
                float scaleY4 = this.f.getScaleY();
                float scaleX4 = this.f.getScaleX();
                float alpha4 = this.f.getAlpha();
                ObjectAnimator objectAnimatorOfFloat10 = ObjectAnimator.ofFloat(this.f, "scaleY", scaleY4, 0.0f);
                ObjectAnimator objectAnimatorOfFloat11 = ObjectAnimator.ofFloat(this.f, "scaleX", scaleX4, 0.0f);
                ObjectAnimator objectAnimatorOfFloat12 = ObjectAnimator.ofFloat(this.f, "alpha", alpha4, 0.0f);
                AnimatorSet animatorSet4 = new AnimatorSet();
                animatorSet4.setDuration(j2);
                animatorSet4.play(objectAnimatorOfFloat10).with(objectAnimatorOfFloat11).with(objectAnimatorOfFloat12);
                animatorSet4.start();
            }
        }

        public void j(i iVar) {
            if (iVar != null) {
                this.g = iVar;
            }
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                k(true);
                HMLog.d(MiBandAlarmActivity.X, "ACTION_DOWN", new Object[0]);
            } else if (actionMasked == 1 || actionMasked == 3) {
                k(false);
                HMLog.d(MiBandAlarmActivity.X, "ACTION_UP or ACTION_CANCEL", new Object[0]);
            }
            return false;
        }
    }

    public class a extends BLEStatueListenerAdapter {
        public final /* synthetic */ BTStatusFragment a;

        public a(BTStatusFragment bTStatusFragment) {
            this.a = bTStatusFragment;
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public CharSequence getUnbindStr() {
            return MiBandAlarmActivity.this.getString(R.string.miband_alarm_not_bound);
        }

        @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
        public void onEnableChange(boolean z) {
            MiBandAlarmActivity.this.N = this.a.isShowing();
            if (z) {
                MiBandAlarmActivity.this.J();
            } else {
                MiBandAlarmActivity.this.I();
            }
            MiBandAlarmActivity.this.W();
        }
    }

    public class b extends HMCallback {
        public final /* synthetic */ Alarm a;
        public final /* synthetic */ int b;
        public final /* synthetic */ LoadingDialog c;
        public final /* synthetic */ String d;

        public b(Alarm alarm, int i, LoadingDialog loadingDialog, String str) {
            this.a = alarm;
            this.b = i;
            this.c = loadingDialog;
            this.d = str;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            HMLog.i(MiBandAlarmActivity.X, "delete alarm: " + this.a.toString(), new Object[0]);
            HMLog.i(MiBandAlarmActivity.X, "delete alarm to device : " + z, new Object[0]);
            if (!z) {
                MiBandAlarmActivity miBandAlarmActivity = MiBandAlarmActivity.this;
                miBandAlarmActivity.Z(this.b, (Alarm) ((DeviceUtilsApi) miBandAlarmActivity.Q.getValue()).getGson().fromJson(this.d, Alarm.class));
                this.c.setFailed(MiBandAlarmActivity.this.getString(R.string.alarm_delete_failed));
            } else {
                MiBandAlarmActivity.this.H.keepVisibleAlarm(this.a);
                MiBandAlarmActivity.this.Y(this.b);
                this.c.setSuccess(MiBandAlarmActivity.this.getString(R.string.delete_alarm_success));
                AlarmClockManager.postNonDeviceAlarmEvent(HMDeviceType.MILI);
            }
        }
    }

    public class c implements i {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ String b() {
            return "id is illegal";
        }

        @Override // com.xiaomi.hm.health.ui.smartplay.MiBandAlarmActivity.i
        public void onClick(int i) {
            if (MiBandAlarmActivity.this.F.getVisibility() == 0) {
                Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT).setValue("Click2"));
            } else {
                Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT).setValue("Click1"));
            }
            int i2 = MiBandAlarmActivity.this.H.isNormalAlarmSize() ? 3 : 10;
            if (i < 0 || i >= i2) {
                HMLog.info(MiBandAlarmActivity.X, new Function0() { // from class: com.xiaomi.hm.health.ui.smartplay.c
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return MiBandAlarmActivity.c.b();
                    }
                });
            } else {
                ((DeviceXNavigator) MiBandAlarmActivity.this.S.getValue()).startSetAlarmActivity(MiBandAlarmActivity.this, 0, i);
            }
        }
    }

    public class d extends HMCallback {
        public final /* synthetic */ Alarm a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ int c;
        public final /* synthetic */ String d;

        public d(Alarm alarm, boolean z, int i, String str) {
            this.a = alarm;
            this.b = z;
            this.c = i;
            this.d = str;
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onFinish(boolean z) {
            super.onFinish(z);
            HMLog.i(MiBandAlarmActivity.X, "switch alarm : " + this.a.toString(), new Object[0]);
            HMLog.i(MiBandAlarmActivity.X, "switch alarm to device : " + z, new Object[0]);
            if (z) {
                AlarmClockManager.postNonDeviceAlarmEvent(HMDeviceType.MILI);
                return;
            }
            if (this.b) {
                MiBandAlarmActivity miBandAlarmActivity = MiBandAlarmActivity.this;
                IconToast.showError(miBandAlarmActivity, miBandAlarmActivity.getString(R.string.alarm_open_failed));
            } else {
                MiBandAlarmActivity miBandAlarmActivity2 = MiBandAlarmActivity.this;
                IconToast.showError(miBandAlarmActivity2, miBandAlarmActivity2.getString(R.string.alarm_close_failed));
            }
            MiBandAlarmActivity miBandAlarmActivity3 = MiBandAlarmActivity.this;
            miBandAlarmActivity3.Z(this.c, (Alarm) ((DeviceUtilsApi) miBandAlarmActivity3.Q.getValue()).getGson().fromJson(this.d, Alarm.class));
        }
    }

    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            a = iArr;
            try {
                iArr[HMDeviceSource.MILI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMDeviceSource.MILI_1A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMDeviceSource.MILI_1S.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMDeviceSource.MILI_PRO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMDeviceSource.MILI_PRO_I.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMDeviceSource.MILI_PRO_OLD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[HMDeviceSource.MILI_ROCKY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[HMDeviceSource.MILI_NFC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[HMDeviceSource.MILI_WUHAN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[HMDeviceSource.MILI_CHONGQING.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[HMDeviceSource.MILI_CINCO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[HMDeviceSource.MILI_CINCO_L.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public class f extends RecyclerView.Adapter<ViewHolder> {
        private f() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
            viewHolder.bind((Alarm) MiBandAlarmActivity.this.G.get(i), i);
            viewHolder.j(MiBandAlarmActivity.this.W);
            viewHolder.i(MiBandAlarmActivity.this.M);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            return MiBandAlarmActivity.this.new ViewHolder(View.inflate(MiBandAlarmActivity.this, R.layout.item_miband_alarm_list, null));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: getItemCount */
        public int getA() {
            if (MiBandAlarmActivity.this.G == null) {
                return 0;
            }
            return MiBandAlarmActivity.this.G.size();
        }
    }

    public class g extends LinearLayoutManager {
        public g(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            try {
                super.onLayoutChildren(recycler, state);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
    }

    public static class h extends Handler {
        private final WeakReference<MiBandAlarmActivity> a;

        public h(MiBandAlarmActivity miBandAlarmActivity) {
            this.a = new WeakReference<>(miBandAlarmActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            MiBandAlarmActivity miBandAlarmActivity = this.a.get();
            if (miBandAlarmActivity == null || message.what != 17) {
                return;
            }
            HMLog.d(MiBandAlarmActivity.X, "receive msg...", new Object[0]);
            miBandAlarmActivity.W();
            miBandAlarmActivity.U();
        }
    }

    public interface i {
        void onClick(int i);
    }

    public enum j {
        NORMAl,
        SHOW
    }

    public MiBandAlarmActivity() {
        Lazy<DeviceManagerApi> lazyInject = KoinJavaComponent.inject(DeviceManagerApi.class);
        this.P = lazyInject;
        this.Q = KoinJavaComponent.inject(DeviceUtilsApi.class);
        this.R = KoinJavaComponent.inject(ToolUtilApi.class);
        this.S = KoinJavaComponent.inject(DeviceXNavigator.class);
        this.T = lazyInject.getValue().getBoundDeviceSource(HMDeviceType.MILI);
        this.U = false;
        this.V = new AtomicBoolean(false);
        this.W = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        findViewById(R.id.alarm_tip_rl).setVisibility(8);
        this.x.setEnabled(false);
        this.I.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.P.getValue().hasBound(HMDeviceSource.MILI_PEYTO) || this.P.getValue().hasBound(HMDeviceSource.MILI_TEMPO)) {
            findViewById(R.id.alarm_tip_rl).setVisibility(8);
        } else {
            findViewById(R.id.alarm_tip_rl).setVisibility(0);
        }
        this.x.setEnabled(true);
        this.I.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String K(Alarm alarm) {
        return this.H.getStatusTipStr(alarm, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(int i2) {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.delete_alarm));
        loadingDialogShowDialog.setCancelable(false);
        HMLog.d(X, "handleDeleteAction ", new Object[0]);
        Alarm alarmByIndex = this.H.getAlarmByIndex(i2);
        String json = this.Q.getValue().getGson().toJson(alarmByIndex);
        Boolean bool = Boolean.FALSE;
        alarmByIndex.setVisible(bool);
        alarmByIndex.setEnabled(bool);
        alarmByIndex.setIsSmart(bool);
        this.O = true;
        HMMiLiDevice hMMiLiDevice = this.A;
        if (hMMiLiDevice == null || !hMMiLiDevice.isConnected()) {
            return;
        }
        this.A.setAlarmClock(this.H.alarm2Ext(alarmByIndex), new b(alarmByIndex, i2, loadingDialogShowDialog, json));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(int i2, boolean z) {
        this.O = true;
        Alarm alarm = this.G.get(i2);
        HMLog.d(X, "alarm index: " + alarm.getIndex(), new Object[0]);
        String json = this.Q.getValue().getGson().toJson(alarm);
        HMLog.d(X, "isChecked : " + z, new Object[0]);
        alarm.setEnabled(Boolean.valueOf(z));
        this.H.setAlarm4Once(alarm);
        Z(i2, alarm);
        HMMiLiDevice hMMiLiDevice = this.A;
        if (hMMiLiDevice == null || !hMMiLiDevice.isConnected()) {
            return;
        }
        this.A.setAlarmClock(this.H.alarm2Ext(alarm), new d(alarm, z, i2, json));
    }

    private void N() {
        BTStatusFragment bTStatusFragmentNewInstance = BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager());
        bTStatusFragmentNewInstance.setShowBottomArea(false);
        bTStatusFragmentNewInstance.setBLEStatusListener(new a(bTStatusFragmentNewInstance));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String O() {
        return "setLocalNightMode triggers recreate, no need to recreate";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String P() {
        return "Manifest configChanges is uiMode, the page does not force dark mode; therefore, receive callbacks need to receive";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q(Boolean bool) {
        if (bool.booleanValue()) {
            W();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void R(Throwable th) {
        HMLog.i(X, "e: " + th, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean S() throws Exception {
        AlarmClockManager.updateAlarmsFromDevice(((HMMiLiProDevice) this.P.getValue().getDevice(HMDeviceType.MILI)).getAlarmsSync());
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(int i2) {
        this.y.notifyItemChanged(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(12);
        int i3 = calendar.get(13);
        calendar.set(12, i2 + 1);
        calendar.set(13, 0);
        long timeInMillis = calendar.getTimeInMillis();
        HMLog.d(X, "current " + jCurrentTimeMillis + " min " + i2 + " second " + i3, new Object[0]);
        StringBuilder sb = new StringBuilder();
        sb.append("next ");
        sb.append(timeInMillis);
        HMLog.d(X, sb.toString(), new Object[0]);
        long j2 = timeInMillis - jCurrentTimeMillis;
        HMLog.d(X, "interval " + j2, new Object[0]);
        this.z.sendEmptyMessageDelayed(17, j2);
    }

    private void V() {
        this.M = j.NORMAl;
        this.B.setVisibility(0);
        this.F.setVisibility(8);
        this.y.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        HMLog.d(X, "update...", new Object[0]);
        this.G = this.H.getShowAlarm();
        this.y.notifyDataSetChanged();
        a0();
    }

    private Observable<Boolean> X() {
        return Observable.fromCallable(new Callable() { // from class: p35
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.S();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(int i2) {
        int size = this.G.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i2 == this.G.get(i3).getIndex().intValue()) {
                this.G.remove(i3);
                this.y.notifyItemRemoved(i3);
                a0();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(final int i2, Alarm alarm) {
        HMLog.d(X, "keep alarm : " + this.Q.getValue().getGson().toJson(alarm), new Object[0]);
        this.H.keepVisibleAlarm(alarm);
        this.G = this.H.getShowAlarm();
        this.z.postDelayed(new Runnable() { // from class: o35
            @Override // java.lang.Runnable
            public final void run() {
                this.a.T(i2);
            }
        }, 250L);
    }

    private void a0() {
        int size = this.G.size();
        if (this.N) {
            this.D.setEnabled(true);
            TextView textView = this.D;
            int i2 = R.color.s2;
            textView.setTextColor(ContextCompat.getColor(this, i2));
            this.E.setEnabled(true);
            this.E.setTextColor(ContextCompat.getColor(this, i2));
            this.L.setVisibility(0);
            if (size != 0) {
                this.J.setVisibility(8);
                return;
            } else {
                this.J.setVisibility(0);
                this.K.setVisibility(8);
                return;
            }
        }
        if (size != 0) {
            this.D.setEnabled(true);
            this.D.setTextColor(ContextCompat.getColor(this, R.color.s3));
            this.J.setVisibility(8);
            this.L.setVisibility(0);
            return;
        }
        this.D.setEnabled(false);
        this.D.setTextColor(ContextCompat.getColor(this, R.color.s3));
        this.J.setVisibility(0);
        this.K.setVisibility(0);
        this.L.setVisibility(4);
        V();
    }

    private void initView() {
        String string = getString(HMDeviceConfig.hasBoundWatch() ? R.string.chaohu_alarm : R.string.mi_band_alarm);
        if (GlobalConfig.get().isBuildMidong()) {
            EventReminderExpandKt.setUnifyTitleStyle(this, BaseTitleActivity.STYLE.BACK_AND_TITLE, string, null);
        } else {
            setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, ContextCompat.getColor(this, R.color.pale_grey), string, true);
            setBaseTitleColor(ContextCompat.getColor(this, R.color.black70));
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.alarm_list);
        this.x = recyclerView;
        recyclerView.setHasFixedSize(true);
        f fVar = new f();
        this.y = fVar;
        this.x.setAdapter(fVar);
        this.x.setLayoutManager(new g(this));
        this.x.setItemAnimator(new DefaultItemAnimator());
        TextView textView = (TextView) findViewById(R.id.alarm_tip);
        switch (e.a[this.P.getValue().getBoundDeviceSource(HMDeviceType.MILI).ordinal()]) {
            case 1:
            case 2:
            case 3:
                textView.setText(R.string.miband_tips);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                textView.setText(R.string.alarm_clock_lazy_tip);
                break;
            default:
                textView.setVisibility(8);
                break;
        }
        if (HMDeviceConfig.hasBoundWatch() || HMDeviceConfig.hasBoundTempSeries()) {
            findViewById(R.id.alarm_tip_rl).setVisibility(8);
        }
        this.J = findViewById(R.id.null_text);
        this.K = (TextView) findViewById(R.id.null_tip);
        this.L = findViewById(R.id.alarm_layout);
        this.I = findViewById(R.id.mask_view);
        this.B = findViewById(R.id.alarm_edit_parent);
        this.C = (TextView) findViewById(R.id.vibrate_tv);
        TextView textView2 = (TextView) findViewById(R.id.alarm_edit);
        this.D = textView2;
        textView2.setOnClickListener(this);
        TextView textView3 = (TextView) findViewById(R.id.alarm_add);
        this.E = textView3;
        textView3.setOnClickListener(this);
        TextView textView4 = (TextView) findViewById(R.id.alarm_done);
        this.F = textView4;
        textView4.setOnClickListener(this);
        N();
        this.C.setVisibility(8);
    }

    public static void navigation2Alarm(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) MiBandAlarmActivity.class);
        intent.putExtra(m0, z);
        context.startActivity(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        HMLog.d(X, "onActivityResult", new Object[0]);
        V();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.alarm_add) {
            if (id != R.id.alarm_edit) {
                if (id == R.id.alarm_done) {
                    V();
                    return;
                }
                return;
            } else {
                this.M = j.SHOW;
                this.B.setVisibility(8);
                this.F.setVisibility(0);
                this.y.notifyDataSetChanged();
                Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT).setValue("Add"));
                return;
            }
        }
        int availableId = this.H.getAvailableId();
        if (this.H.isNormalAlarmSize()) {
            if (availableId < 0 || availableId > 2) {
                CustomToast.showShort(this, getString(R.string.add_alarm_tips, new Object[]{3}));
            } else {
                this.S.getValue().startSetAlarmActivity(this, 1, availableId, this.U);
            }
        } else if (availableId < 0 || availableId > 9) {
            CustomToast.showShort(this, getString(R.string.add_alarm_tips, new Object[]{10}));
        } else {
            this.S.getValue().startSetAlarmActivity(this, 1, availableId, this.U);
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_OUT).setValue("Edit"));
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull @NotNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.V.compareAndSet(true, false) && configuration.uiMode == 32) {
            HMLog.info(X, new Function0() { // from class: r35
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MiBandAlarmActivity.O();
                }
            });
        } else {
            HMLog.info(X, new Function0() { // from class: q35
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MiBandAlarmActivity.P();
                }
            });
            ActivityCompat.recreate(this);
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean booleanExtra = getIntent().getBooleanExtra(m0, false);
        this.U = booleanExtra;
        if (booleanExtra) {
            getDelegate().setLocalNightMode(2);
            this.V.compareAndSet(false, true);
        }
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_miband_alarm);
        AlarmClockManager alarmClockManager = AlarmClockManager.getInstance();
        this.H = alarmClockManager;
        DeviceManagerApi value = this.P.getValue();
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        alarmClockManager.correctAlarmWhenDoFree(value.getBoundDeviceSource(hMDeviceType), this.P.getValue().getDevice(hMDeviceType));
        this.G = this.H.getShowAlarm();
        this.M = j.NORMAl;
        this.z = new h(this);
        initView();
        this.A = (HMMiLiDevice) this.P.getValue().getDevice(hMDeviceType);
        EventBus.getDefault().register(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
        this.z.removeCallbacksAndMessages(null);
    }

    public void onEventMainThread(HMDeviceAlarmEvent hMDeviceAlarmEvent) {
        if (hMDeviceAlarmEvent.fromDevice && hMDeviceAlarmEvent.getDeviceType() == HMDeviceType.MILI) {
            W();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.H.saveVisibleAlarm(this.G);
        this.H.syncAlarmToCloud(this.O);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (ConfigHelperKt.hasFeature(Feature.SUPPORT_CHANGE_ALARM_ON_DEVICE, this.T)) {
            X().compose(RxUtil.ioToMain()).subscribe(new Action1() { // from class: s35
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.Q((Boolean) obj);
                }
            }, new Action1() { // from class: t35
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    MiBandAlarmActivity.R((Throwable) obj);
                }
            });
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity
    public void onRightFuncClicked() {
        this.R.getValue().addToMyTools("ALARM");
        CustomToast.showShort(getApplicationContext(), R.string.tool_add_success);
        showRightFunc(false);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        HMLog.d(X, "onStart", new Object[0]);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.EventId.BAND_CLOCK_VIEW_NUM));
        U();
        W();
    }
}
