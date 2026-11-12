package com.xiaomi.hm.health.lab.activity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.log.HMLog;
import com.huami.util.net.NetUtil;
import com.xiaomi.hm.health.baseutil.FileUtils;
import com.xiaomi.hm.health.baseutil.TintUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.PnP;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.grsp.CommonSensorData;
import com.xiaomi.hm.health.bt.profile.grsp.GSensorData;
import com.xiaomi.hm.health.bt.profile.grsp.GeoData;
import com.xiaomi.hm.health.bt.profile.grsp.GyroData;
import com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback;
import com.xiaomi.hm.health.bt.profile.grsp.PPGSensorData;
import com.xiaomi.hm.health.bt.profile.grsp.SensorDataFragment;
import com.xiaomi.hm.health.bt.profile.grsp.SensorType;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.LabAction;
import com.xiaomi.hm.health.databases.model.LabActionDao;
import com.xiaomi.hm.health.databases.model.SensorDataDao;
import com.xiaomi.hm.health.lab.R;
import com.xiaomi.hm.health.lab.activity.BaseBehaviorTaggingActivity;
import com.xiaomi.hm.health.lab.data.SensorDataDealTask;
import com.xiaomi.hm.health.lab.data.SensorDataSaveTaskManager;
import com.xiaomi.hm.health.lab.fragment.CountDownFragment;
import com.xiaomi.hm.health.lab.fragment.SensorChartFragment;
import com.xiaomi.hm.health.lab.init.LabCallbackInit;
import com.xiaomi.hm.health.lab.init.LabEventAccountStatus;
import com.xiaomi.hm.health.lab.init.LabEventBluetooth;
import com.xiaomi.hm.health.lab.init.LabEventListener;
import com.xiaomi.hm.health.lab.init.LabEventManager;
import com.xiaomi.hm.health.lab.init.LabHMDeviceConnectionEvent;
import com.xiaomi.hm.health.lab.model.BehaviorTagEnity;
import com.xiaomi.hm.health.lab.model.CommonSensorRecord;
import com.xiaomi.hm.health.lab.model.GSensorRecord;
import com.xiaomi.hm.health.lab.model.GyroSensorRecord;
import com.xiaomi.hm.health.lab.model.MagnRecord;
import com.xiaomi.hm.health.lab.model.NmeaRecord;
import com.xiaomi.hm.health.lab.model.PPGSensorRecord;
import com.xiaomi.hm.health.lab.model.SensorRecordsEnity;
import com.xiaomi.hm.health.lab.provider.OptionsItemProvider;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingTools;
import com.xiaomi.hm.health.lab.utils.BehaviorTaggingWebApi;
import com.xiaomi.hm.health.lab.utils.LabKeeper;
import com.xiaomi.hm.health.lab.utils.LabTools;
import com.xiaomi.hm.health.lab.utils.StatEvent;
import com.xiaomi.hm.health.lab.utils.TaggingFileUtils;
import com.xiaomi.hm.health.lab.view.CountDownTextView;
import com.xiaomi.hm.health.lab.view.CustomRoundProgressBar;
import com.xiaomi.hm.health.lab.view.RevealFrameLayout;
import com.xiaomi.hm.health.lab.view.TypefaceChronometer;
import com.xiaomi.hm.health.lab.view.picker.PickerDialogFragment;
import de.greenrobot.event.EventBus;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;
import org.greenrobot.greendao.query.LazyList;
import org.greenrobot.greendao.query.WhereCondition;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BaseBehaviorTaggingActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, IHMSensorDataCallback {
    private static final String L = "BaseBehaviorTaggingActivity";
    private static final int M = 512000;
    private static final int N = 10000;
    private static final int O = 8193;
    public static final String TEMPERATURE_DEVICE_OPTION = "temperature.device.option.key";
    public static final String TEMPERATURE_PART_OPTION = "temperature.part.option.key";
    private AlertDialogFragment D;
    private boolean G;
    private boolean I;
    public ValueAnimator J;
    private LoadingDialog K;
    private RevealFrameLayout a;
    private TextView b;
    public BehaviorTagEnity behaviorTagEnity;
    private ImageView c;
    public CheckBox cbTitleRight;
    public TypefaceChronometer chronometer;
    private ImageView d;
    private CustomRoundProgressBar e;
    private FrameLayout f;
    private TextView g;
    public boolean i;
    public boolean isFinishClick;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    private SensorDataDealTask<GSensorRecord> o;
    private SensorDataDealTask<PPGSensorRecord> p;
    private SensorDataDealTask<GyroSensorRecord> q;
    private SensorDataDealTask<MagnRecord> r;
    private SensorDataDealTask<NmeaRecord> s;
    public SensorChartFragment sensorChartFragment;
    private SensorDataDealTask<CommonSensorRecord> t;
    private SensorDataSaveTaskManager u;
    private RevealFrameLayout w;
    private SimpleDateFormat x;
    public long taggingCountTime = 0;
    public long mTaggingEndTime = 0;
    public boolean finishWaitRelogin = false;
    private long h = 300;
    private int v = 1;
    private LabAction y = new LabAction();
    private boolean z = true;
    private boolean A = true;
    private int B = 0;
    private int C = 0;
    private PowerManager.WakeLock E = null;
    private boolean F = false;
    private boolean H = false;

    public class a implements LabEventListener {
        public a() {
        }

        @Override // com.xiaomi.hm.health.lab.init.LabEventListener
        public void onEvent(LabEventBluetooth labEventBluetooth) {
            BaseBehaviorTaggingActivity.this.C1(labEventBluetooth);
        }

        @Override // com.xiaomi.hm.health.lab.init.LabEventListener
        public void onEvent(LabHMDeviceConnectionEvent labHMDeviceConnectionEvent) {
            BaseBehaviorTaggingActivity.this.D1(labHMDeviceConnectionEvent);
        }

        @Override // com.xiaomi.hm.health.lab.init.LabEventListener
        public void onEvent(LabEventAccountStatus labEventAccountStatus) {
            BaseBehaviorTaggingActivity.this.B1(labEventAccountStatus);
        }
    }

    public class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseBehaviorTaggingActivity.this.c.setVisibility(8);
            BaseBehaviorTaggingActivity.this.d.setVisibility(8);
            BaseBehaviorTaggingActivity.this.f.setVisibility(0);
            BaseBehaviorTaggingActivity.this.b.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class c implements PickerDialogFragment.OnClickListener {
        public final /* synthetic */ ArrayList a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // com.xiaomi.hm.health.lab.view.picker.PickerDialogFragment.OnClickListener
        public void onNegativeClick(int i, int i2) {
            BaseBehaviorTaggingActivity.this.J1();
        }

        @Override // com.xiaomi.hm.health.lab.view.picker.PickerDialogFragment.OnClickListener
        public void onPositiveClick(int i, int i2) {
            float f = Float.parseFloat((String) ((ArrayList) this.a.get(i)).get(i2));
            if (i == 1) {
                f = Float.parseFloat(new DecimalFormat(".0", new DecimalFormatSymbols(Locale.US)).format(((f - 32.0f) * 5.0f) / 9.0f));
            }
            LabKeeper.saveBodyTemperature(f);
            BaseBehaviorTaggingActivity baseBehaviorTaggingActivity = BaseBehaviorTaggingActivity.this;
            baseBehaviorTaggingActivity.isFinishClick = true;
            baseBehaviorTaggingActivity.K1(true);
        }
    }

    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SensorType.values().length];
            a = iArr;
            try {
                iArr[SensorType.PPG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SensorType.GSENSOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SensorType.GYRO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[SensorType.GEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[SensorType.BODY_TEMPERATURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public class e implements LoadingDialog.OnAnimEndListener {
        public e() {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onAnimEnd(LoadingDialog loadingDialog) {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onDismiss(LoadingDialog loadingDialog) {
            BaseBehaviorTaggingActivity baseBehaviorTaggingActivity = BaseBehaviorTaggingActivity.this;
            if (!baseBehaviorTaggingActivity.isFinishClick || baseBehaviorTaggingActivity.finishWaitRelogin) {
                return;
            }
            baseBehaviorTaggingActivity.w0();
        }
    }

    private boolean A0() {
        this.c = (ImageView) findViewById(R.id.btn_finish_mark);
        this.d = (ImageView) findViewById(R.id.btn_resume_mark);
        this.b = (TextView) findViewById(R.id.long_press_tip);
        this.e = (CustomRoundProgressBar) findViewById(R.id.btn_pause_mark);
        this.f = (FrameLayout) findViewById(R.id.fl_pause_view);
        if (B0() || C0()) {
            this.e.setCenterDrawableId(R.drawable.icon_lab_finish_now);
            this.b.setText(R.string.lab_long_press_end);
        }
        this.e.setOnTouchListener(new View.OnTouchListener() { // from class: tn
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.a.R0(view, motionEvent);
            }
        });
        this.g = (TextView) findViewById(R.id.tx_device_connect_status);
        y0();
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        SensorChartFragment sensorChartFragment = new SensorChartFragment();
        this.sensorChartFragment = sensorChartFragment;
        int i = R.id.rfl_chart_container;
        if (fragmentTransactionBeginTransaction.replace(i, sensorChartFragment).commitAllowingStateLoss() > 0) {
            return false;
        }
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.tv_title_bar);
        rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: sn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.S0(view);
            }
        });
        if (TextUtils.isEmpty(this.behaviorTagEnity.getCustomizeBehaviorName())) {
            rainbowTitleBar.setTitle(this.behaviorTagEnity.getBehaviorNameStrId());
        } else {
            rainbowTitleBar.setTitle(this.behaviorTagEnity.getCustomizeBehaviorName());
        }
        ((ImageView) findViewById(R.id.imv_action_image)).setImageResource(this.behaviorTagEnity.getBehaviorBigImgResId());
        ImageView imageView = (ImageView) findViewById(R.id.imv_device_type);
        int i2 = R.drawable.icon_marking_band;
        if (getMyHMDeviceType() == HMDeviceType.SHOES) {
            i2 = R.drawable.icon_marking_shoes;
        } else if (getMyHMDeviceType() == HMDeviceType.OTHER || getMyHMDeviceType() == HMDeviceType.TREADMILL) {
            i2 = R.drawable.icon_marking_bluemonkey;
        } else if (LabCallbackInit.getInitCallBack().hasBoundWatch()) {
            i2 = R.drawable.icon_marking_watch;
        }
        imageView.setImageResource(i2);
        this.c.setOnClickListener(this);
        this.d.setOnClickListener(this);
        this.a = (RevealFrameLayout) findViewById(i);
        this.chronometer = (TypefaceChronometer) findViewById(R.id.chronometer);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        this.x = simpleDateFormat;
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "GMT"));
        this.chronometer.setText(this.x.format((Object) 0));
        this.chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() { // from class: un
            @Override // android.widget.Chronometer.OnChronometerTickListener
            public final void onChronometerTick(Chronometer chronometer) {
                this.a.T0(chronometer);
            }
        });
        CheckBox checkBox = (CheckBox) findViewById(R.id.cb_title_right);
        this.cbTitleRight = checkBox;
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(this);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(R.id.lab_tagging_temperature_msg);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) findViewById(R.id.lab_tagging_temperature_select);
        if (C0()) {
            this.B = getIntent().getIntExtra(TEMPERATURE_DEVICE_OPTION, 0);
            this.C = getIntent().getIntExtra(TEMPERATURE_PART_OPTION, 0);
            this.cbTitleRight.setVisibility(8);
            appCompatTextView.setVisibility(0);
            appCompatTextView2.setVisibility(0);
            appCompatTextView2.setText(String.format(getResources().getString(R.string.lab_temperature_select_content), OptionsItemProvider.buildDeviceData(this).get(this.B), OptionsItemProvider.buildPartsData(this).get(this.B).get(this.C)));
        }
        this.a.post(new Runnable() { // from class: lo
            @Override // java.lang.Runnable
            public final void run() {
                this.a.U0();
            }
        });
        this.a.setOnStateChangeListener(new RevealFrameLayout.OnStateChangeListener() { // from class: wn
            @Override // com.xiaomi.hm.health.lab.view.RevealFrameLayout.OnStateChangeListener
            public final void onStateChange(int i3) {
                this.a.V0(i3);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A1() {
        if (this.chronometer != null && this.A && this.H) {
            this.taggingCountTime = SystemClock.elapsedRealtime() - this.chronometer.getBase();
            HMLog.info(L, new Function0() { // from class: to
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return this.a.z1();
                }
            });
            this.chronometer.stop();
            this.H = false;
            O1(this.taggingCountTime);
        }
    }

    private boolean B0() {
        return BehaviorTaggingTools.NMEA.equals(this.behaviorTagEnity.getBehaviorKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B1(LabEventAccountStatus labEventAccountStatus) {
        if (labEventAccountStatus.getStatus() == 2) {
            HMLog.info(L, new Function0() { // from class: cp
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return BaseBehaviorTaggingActivity.W0();
                }
            });
            if (this.isFinishClick && this.finishWaitRelogin) {
                this.cbTitleRight.postDelayed(new Runnable() { // from class: mo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.w0();
                    }
                }, 1000L);
            }
        }
    }

    private boolean C0() {
        return "temperature".equals(this.behaviorTagEnity.getBehaviorKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C1(LabEventBluetooth labEventBluetooth) {
        if (labEventBluetooth.isOn) {
            HMLog.info(L, new Function0() { // from class: fp
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return BaseBehaviorTaggingActivity.Y0();
                }
            });
            u0();
        } else {
            HMLog.info(L, new Function0() { // from class: ep
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return BaseBehaviorTaggingActivity.X0();
                }
            });
            P1(R.string.bluetooth_is_off);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean D0(BehaviorTagEnity behaviorTagEnity) throws Exception {
        List<SensorRecordsEnity> sensorRecordsEnityList = behaviorTagEnity.getSensorRecordsEnityList();
        return (sensorRecordsEnityList == null || sensorRecordsEnityList.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D1(LabHMDeviceConnectionEvent labHMDeviceConnectionEvent) {
        if (labHMDeviceConnectionEvent.getDeviceType() == getMyHMDeviceType()) {
            if (labHMDeviceConnectionEvent.isConnected()) {
                this.A = true;
                HMLog.info(L, new Function0() { // from class: hp
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return BaseBehaviorTaggingActivity.a1();
                    }
                });
                this.g.setVisibility(4);
                if (this.f.getVisibility() == 0) {
                    connectDevice();
                    return;
                }
                return;
            }
            HMLog.info(L, new Function0() { // from class: dp
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return BaseBehaviorTaggingActivity.Z0();
                }
            });
            this.g.setVisibility(0);
            f2();
            this.A = false;
            d2();
            stopOrPauseRecordSensorData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Observable E0(BehaviorTagEnity behaviorTagEnity) throws Exception {
        return Observable.fromIterable(behaviorTagEnity.getSensorRecordsEnityList());
    }

    private ValueAnimator E1(long j, int... iArr) {
        ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(j);
        this.J = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: rn
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.f1(valueAnimator);
            }
        });
        this.J.setInterpolator(new AccelerateDecelerateInterpolator());
        this.J.start();
        return this.J;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F0(SensorRecordsEnity sensorRecordsEnity) throws Exception {
        File labPath = FileUtils.getLabPath(sensorRecordsEnity.getFileName());
        if (labPath == null || !labPath.exists()) {
            return;
        }
        labPath.delete();
    }

    private void F1() {
        File labPath;
        HMLog.info(L, new Function0() { // from class: kp
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return BaseBehaviorTaggingActivity.g1();
            }
        });
        boolean z = false;
        LazyList<LabAction> lazyListListLazy = HMDaoManager.getInstance().getDaoSession().getLabActionDao().queryBuilder().where(LabActionDao.Properties.LabActionId.eq(Long.valueOf(this.behaviorTagEnity.getLabActionId())), new WhereCondition[0]).listLazy();
        if (lazyListListLazy.size() > 0) {
            LabAction labAction = lazyListListLazy.get(0);
            if (!TextUtils.isEmpty(labAction.getZipFileName()) && (labPath = FileUtils.getLabPath(labAction.getZipFileName())) != null && labPath.exists()) {
                new BehaviorTaggingWebApi().behaviorTaggingDataUpload(this, labAction);
                z = true;
            }
        }
        if (z) {
            return;
        }
        HMLog.info(L, new Function0() { // from class: zo
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return BaseBehaviorTaggingActivity.h1();
            }
        });
        t0(this.y.getLabActionId().longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void G0(SensorRecordsEnity sensorRecordsEnity) throws Exception {
    }

    private void G1() {
        LoadingDialog loadingDialog = this.K;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
            this.K = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String H0(Throwable th) {
        return "deleteAllTaggingData error:" + th.getMessage();
    }

    private void H1(int i) {
        LoadingDialog loadingDialog = this.K;
        if (loadingDialog != null) {
            loadingDialog.setFailed(getString(i), new e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I0(final Throwable th) throws Exception {
        HMLog.info(L, new Function0() { // from class: wo
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return BaseBehaviorTaggingActivity.H0(th);
            }
        });
        SensorDataSaveTaskManager sensorDataSaveTaskManager = this.u;
        if (sensorDataSaveTaskManager != null) {
            sensorDataSaveTaskManager.stopExecutor();
        }
        w0();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0064  */
    private void I1() {
        File labPath;
        boolean z;
        LazyList<LabAction> lazyListListLazy = HMDaoManager.getInstance().getDaoSession().getLabActionDao().queryBuilder().where(LabActionDao.Properties.LabActionId.eq(Long.valueOf(this.behaviorTagEnity.getLabActionId())), LabActionDao.Properties.UserId.eq(LabCallbackInit.getInitCallBack().getUserId())).listLazy();
        if (lazyListListLazy.size() > 0) {
            LabAction labAction = lazyListListLazy.get(0);
            if (TextUtils.isEmpty(labAction.getZipFileName())) {
                labPath = null;
            } else {
                labPath = FileUtils.getLabPath(labAction.getZipFileName());
                if (labPath != null && labPath.exists()) {
                    z = true;
                }
            }
            z = false;
        } else {
            labPath = null;
            z = false;
        }
        if (!z) {
            HMLog.info(L, new Function0() { // from class: gp
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return BaseBehaviorTaggingActivity.i1();
                }
            });
            this.isFinishClick = false;
            G1();
            T1();
            return;
        }
        NetUtil netUtil = NetUtil.INSTANCE;
        if (!netUtil.networkInfo().isNetworkConnect()) {
            this.F = true;
            H1(R.string.no_network_connection);
        } else {
            if (netUtil.networkInfo().isWifiConnected() || labPath.length() <= 512000) {
                c2();
                return;
            }
            this.isFinishClick = false;
            G1();
            S1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0() throws Exception {
        SensorDataSaveTaskManager sensorDataSaveTaskManager = this.u;
        if (sensorDataSaveTaskManager != null) {
            sensorDataSaveTaskManager.stopExecutor();
        }
        w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J1() {
        if (this.A) {
            connectDevice();
            return;
        }
        String boundDeviceName = LabCallbackInit.getInitCallBack().getBoundDeviceName(getMyHMDeviceType());
        if (LabTools.isBluetoothEnable()) {
            Q1(boundDeviceName);
        } else {
            P1(R.string.bluetooth_is_off);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0() {
        float width = (this.d.getWidth() / 2.0f) + (LabTools.dp2px(this, 40.0f) / 2.0f);
        if (LabTools.isRTL()) {
            width = -width;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.d, "translationX", width);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.c, "translationX", -width);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(this.h);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K1(boolean z) {
        f2();
        d2();
        stopOrPauseRecordSensorData();
        if (!z) {
            s0();
        } else {
            showLoginDialog(R.string.lab_uploading);
            M1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String L0(long j) {
        return "labs setStartClickTime" + j;
    }

    private void L1() {
        File labPath;
        File fileZipFileByBehavior;
        List<SensorRecordsEnity> sensorRecordsEnityList = this.behaviorTagEnity.getSensorRecordsEnityList();
        if (sensorRecordsEnityList != null && sensorRecordsEnityList.size() > 0 && (fileZipFileByBehavior = TaggingFileUtils.zipFileByBehavior(this, this.behaviorTagEnity)) != null) {
            this.y.setZipFileName(fileZipFileByBehavior.getName());
        }
        if (TextUtils.isEmpty(this.y.getZipFileName()) || (labPath = FileUtils.getLabPath(this.y.getZipFileName())) == null || !labPath.exists()) {
            return;
        }
        this.y.setUploadStatus(0);
        TaggingFileUtils.updateLabAction(this.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(CountDownFragment countDownFragment, int i) {
        if (i == 2) {
            countDownFragment.startCountDown();
            return;
        }
        if (i == 4) {
            this.w.setVisibility(8);
            countDownFragment.endCountDown();
            int i2 = this.v;
            if ((i2 == 2 || i2 == 4) && !this.H) {
                b2();
                final long timeInMillis = Calendar.getInstance(Locale.getDefault()).getTimeInMillis();
                HMLog.info(L, new Function0() { // from class: so
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return BaseBehaviorTaggingActivity.L0(timeInMillis);
                    }
                });
                this.behaviorTagEnity.setStartClickTime(timeInMillis);
                this.G = true;
                this.y = TaggingFileUtils.saveLabAction(this.behaviorTagEnity);
            }
        }
    }

    private void M1() {
        Flowable.just(1).map(new Function() { // from class: go
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return this.a.j1((Integer) obj);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: eo
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BaseBehaviorTaggingActivity.k1((Boolean) obj);
            }
        }, new Consumer() { // from class: fo
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BaseBehaviorTaggingActivity.m1((Throwable) obj);
            }
        }, new Action() { // from class: yn
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.a.n1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0() {
        this.w.startFromLocation(this.e, 10L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0(int i) {
        if (i == 2 || i == 4) {
            this.v = i;
            this.w.setBackgroundResource(android.R.color.transparent);
            this.w.endFromEdge(this.c);
        }
    }

    private void O1(long j) {
        final String str = this.x.format(Long.valueOf(j));
        HMLog.info(L, new Function0() { // from class: uo
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return BaseBehaviorTaggingActivity.o1(str);
            }
        });
        this.chronometer.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String P0() {
        return "labs playValueAnimator ACTION_DOWN";
    }

    private void P1(@StringRes int i) {
        AlertDialogFragment alertDialogFragmentCreate = new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(i).setPositiveButton(R.string.open, new DialogInterface.OnClickListener() { // from class: no
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.a.p1(dialogInterface, i2);
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: pp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        }).create();
        this.D = alertDialogFragmentCreate;
        alertDialogFragmentCreate.show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Q0() {
        return "labs playValueAnimator ACTION_UP";
    }

    private void Q1(String str) {
        new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(getString(R.string.some_device_disconnect, new Object[]{str})).setNeutralButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: op
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean R0(View view, MotionEvent motionEvent) {
        view.performClick();
        int action = motionEvent.getAction();
        if (action == 0) {
            HMLog.info(L, new Function0() { // from class: ip
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return BaseBehaviorTaggingActivity.P0();
                }
            });
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.e.clearAnimation();
            }
            E1(1000L, 0, 100);
        } else if (action == 1) {
            HMLog.info(L, new Function0() { // from class: bp
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return BaseBehaviorTaggingActivity.Q0();
                }
            });
            ValueAnimator valueAnimator2 = this.J;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.e.clearAnimation();
            }
            E1(100L, this.e.getProgress(), 0);
        }
        return true;
    }

    private void R1() {
        final boolean z = this.taggingCountTime > 10000;
        AlertDialogFragment.Builder title = new AlertDialogFragment.Builder(this).setCancelable(false).setTitle(R.string.is_tagging_finish);
        if (!z) {
            title.setMessage(R.string.tagging_time_too_short);
        }
        title.setPositiveButton(getString(R.string.finish_tagging), new DialogInterface.OnClickListener() { // from class: np
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.s1(z, dialogInterface, i);
            }
        }).setNegativeButton(getString(R.string.cancel_tagging), new DialogInterface.OnClickListener() { // from class: co
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.t1(dialogInterface, i);
            }
        }).create().show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S0(View view) {
        onBackPressed();
    }

    private void S1() {
        new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(R.string.do_not_upload_in_mobile_network).setPositiveButton(R.string.btn_upload_continue, new DialogInterface.OnClickListener() { // from class: yo
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.u1(dialogInterface, i);
            }
        }).setNegativeButton(R.string.btn_upload_inwifi, new DialogInterface.OnClickListener() { // from class: lp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.v1(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(Chronometer chronometer) {
        O1(SystemClock.elapsedRealtime() - chronometer.getBase());
        e2();
    }

    private void T1() {
        new AlertDialogFragment.Builder(this).setCancelable(false).setMessage(R.string.tagging_fail_and_not_save).setPositiveButton(R.string.btn_confirm, new DialogInterface.OnClickListener() { // from class: mp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.w1(dialogInterface, i);
            }
        }).setNegativeButton(R.string.btn_retagging, new DialogInterface.OnClickListener() { // from class: jp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.x1(dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U0() {
        this.a.setVisibility(8);
        if (B0()) {
            this.sensorChartFragment.displayNmea();
        }
    }

    private void U1() {
        ArrayList<String> arrayListBuildTemperatureData = OptionsItemProvider.buildTemperatureData();
        ArrayList<ArrayList<String>> arrayListBuildTemperatureRangeData = OptionsItemProvider.buildTemperatureRangeData();
        PickerDialogFragment pickerDialogFragmentBuild = new PickerDialogFragment.Builder().setTitle(getResources().getString(R.string.lab_temperature_select)).setLeftButtonTitle(getResources().getString(R.string.lab_temperature_continue)).setLeftTextColor(R.color.lab_temperature_black).setRightButtonTitle(getResources().getString(R.string.lab_temperature_done)).setOptions2CurrentItem(15).setOptions1Items(arrayListBuildTemperatureData).setOptions2Items(arrayListBuildTemperatureRangeData).build();
        pickerDialogFragmentBuild.setOnClickListener(new c(arrayListBuildTemperatureRangeData));
        pickerDialogFragmentBuild.show(getSupportFragmentManager(), "lab.temperature.picker.dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V0(int i) {
        if (i == 1) {
            this.a.setVisibility(0);
        } else if (i == 4) {
            this.a.setVisibility(8);
        }
    }

    private void V1(List<GSensorData> list) {
        if (!this.i && this.H) {
            SensorRecordsEnity sensorRecordsEnity = new SensorRecordsEnity();
            long timeInMillis = Calendar.getInstance(Locale.getDefault()).getTimeInMillis() + TaggingFileUtils.offset();
            sensorRecordsEnity.setLabActionId(this.behaviorTagEnity.getLabActionId());
            sensorRecordsEnity.setStartTaggingTime(timeInMillis);
            sensorRecordsEnity.setSensorType(SensorRecordsEnity.SensorType.SENSOR_A);
            sensorRecordsEnity.setSamplingRate((short) 25);
            sensorRecordsEnity.setResolution("0");
            this.behaviorTagEnity.addSensorData(sensorRecordsEnity);
            SensorDataSaveTaskManager sensorDataSaveTaskManager = this.u;
            if (sensorDataSaveTaskManager != null) {
                BehaviorTagEnity behaviorTagEnity = this.behaviorTagEnity;
                this.o = sensorDataSaveTaskManager.startGSensorLogTask(behaviorTagEnity, behaviorTagEnity.getSensorData(SensorRecordsEnity.SensorType.SENSOR_A, timeInMillis));
            }
            this.i = true;
        }
        SensorDataDealTask<GSensorRecord> sensorDataDealTask = this.o;
        if (sensorDataDealTask != null) {
            sensorDataDealTask.addDataToQueue(BehaviorTaggingTools.getLabGSensors(list));
            if (this.I || SystemClock.elapsedRealtime() - this.chronometer.getBase() < 10000) {
                return;
            }
            this.y.setUploadStatus(-1);
            TaggingFileUtils.updateLabAction(this.y);
            this.I = true;
            BehaviorTaggingTools.addBehaviorTaggingCountInSpf(this, this.y.getBehaviorName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String W0() {
        return "labs relogin success";
    }

    private void W1(List<GyroData> list) {
        if (!this.k && this.H) {
            SensorRecordsEnity sensorRecordsEnity = new SensorRecordsEnity();
            long timeInMillis = Calendar.getInstance(Locale.getDefault()).getTimeInMillis() + TaggingFileUtils.offset();
            sensorRecordsEnity.setLabActionId(this.behaviorTagEnity.getLabActionId());
            sensorRecordsEnity.setStartTaggingTime(timeInMillis);
            sensorRecordsEnity.setSensorType(SensorRecordsEnity.SensorType.SENSOR_G);
            sensorRecordsEnity.setSamplingRate((short) 100);
            sensorRecordsEnity.setResolution("0");
            this.behaviorTagEnity.addSensorData(sensorRecordsEnity);
            SensorDataSaveTaskManager sensorDataSaveTaskManager = this.u;
            if (sensorDataSaveTaskManager != null) {
                BehaviorTagEnity behaviorTagEnity = this.behaviorTagEnity;
                this.q = sensorDataSaveTaskManager.startGyroLogTask(behaviorTagEnity, behaviorTagEnity.getSensorData(SensorRecordsEnity.SensorType.SENSOR_G, timeInMillis));
            }
            this.k = true;
        }
        SensorDataDealTask<GyroSensorRecord> sensorDataDealTask = this.q;
        if (sensorDataDealTask != null) {
            sensorDataDealTask.addDataToQueue(BehaviorTaggingTools.getLabGyros(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String X0() {
        return "labs 蓝牙断开";
    }

    private void X1(List<GeoData> list) {
        if (!this.l && this.H) {
            SensorRecordsEnity sensorRecordsEnity = new SensorRecordsEnity();
            long timeInMillis = Calendar.getInstance(Locale.getDefault()).getTimeInMillis() + TaggingFileUtils.offset();
            sensorRecordsEnity.setLabActionId(this.behaviorTagEnity.getLabActionId());
            sensorRecordsEnity.setStartTaggingTime(timeInMillis);
            sensorRecordsEnity.setSensorType(SensorRecordsEnity.SensorType.SENSOR_M);
            sensorRecordsEnity.setSamplingRate((short) 25);
            sensorRecordsEnity.setResolution("0");
            this.behaviorTagEnity.addSensorData(sensorRecordsEnity);
            SensorDataSaveTaskManager sensorDataSaveTaskManager = this.u;
            if (sensorDataSaveTaskManager != null) {
                BehaviorTagEnity behaviorTagEnity = this.behaviorTagEnity;
                this.r = sensorDataSaveTaskManager.startMagnLogTask(behaviorTagEnity, behaviorTagEnity.getSensorData(SensorRecordsEnity.SensorType.SENSOR_M, timeInMillis));
            }
            this.l = true;
        }
        SensorDataDealTask<MagnRecord> sensorDataDealTask = this.r;
        if (sensorDataDealTask != null) {
            sensorDataDealTask.addDataToQueue(BehaviorTaggingTools.getLabMagns(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Y0() {
        return "labs 蓝牙连接";
    }

    private void Y1(String str) {
        if (!this.m && this.H) {
            SensorRecordsEnity sensorRecordsEnity = new SensorRecordsEnity();
            long timeInMillis = Calendar.getInstance(Locale.getDefault()).getTimeInMillis() + TaggingFileUtils.offset();
            sensorRecordsEnity.setLabActionId(this.behaviorTagEnity.getLabActionId());
            sensorRecordsEnity.setStartTaggingTime(timeInMillis);
            sensorRecordsEnity.setSensorType("GPS");
            sensorRecordsEnity.setSamplingRate((short) 100);
            sensorRecordsEnity.setResolution("0");
            this.behaviorTagEnity.addSensorData(sensorRecordsEnity);
            SensorDataSaveTaskManager sensorDataSaveTaskManager = this.u;
            if (sensorDataSaveTaskManager != null) {
                BehaviorTagEnity behaviorTagEnity = this.behaviorTagEnity;
                this.s = sensorDataSaveTaskManager.startNmeaLogTask(behaviorTagEnity, behaviorTagEnity.getSensorData("GPS", timeInMillis));
            }
            this.m = true;
        }
        SensorDataDealTask<NmeaRecord> sensorDataDealTask = this.s;
        if (sensorDataDealTask != null) {
            sensorDataDealTask.addDataToQueue(BehaviorTaggingTools.getLabNmea(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String Z0() {
        return "labs 设备自动断开";
    }

    private void Z1(List<PPGSensorData> list) {
        if (!this.j && this.H) {
            SensorRecordsEnity sensorRecordsEnity = new SensorRecordsEnity();
            long timeInMillis = Calendar.getInstance(Locale.getDefault()).getTimeInMillis() + TaggingFileUtils.offset();
            sensorRecordsEnity.setLabActionId(this.behaviorTagEnity.getLabActionId());
            sensorRecordsEnity.setStartTaggingTime(timeInMillis);
            sensorRecordsEnity.setSensorType(SensorRecordsEnity.SensorType.SENSOR_PPG);
            sensorRecordsEnity.setSamplingRate((short) 25);
            sensorRecordsEnity.setResolution("0");
            this.behaviorTagEnity.addSensorData(sensorRecordsEnity);
            SensorDataSaveTaskManager sensorDataSaveTaskManager = this.u;
            if (sensorDataSaveTaskManager != null) {
                BehaviorTagEnity behaviorTagEnity = this.behaviorTagEnity;
                this.p = sensorDataSaveTaskManager.startPPGSensorLogTask(behaviorTagEnity, behaviorTagEnity.getSensorData(SensorRecordsEnity.SensorType.SENSOR_PPG, timeInMillis));
            }
            this.j = true;
        }
        SensorDataDealTask<PPGSensorRecord> sensorDataDealTask = this.p;
        if (sensorDataDealTask != null) {
            sensorDataDealTask.addDataToQueue(BehaviorTaggingTools.getLabPPGSensors(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a1() {
        return "labs 设备自动连接";
    }

    private void a2(List<CommonSensorData> list) {
        if (!this.n && this.H) {
            SensorRecordsEnity sensorRecordsEnity = new SensorRecordsEnity();
            long timeInMillis = Calendar.getInstance(Locale.getDefault()).getTimeInMillis() + TaggingFileUtils.offset();
            sensorRecordsEnity.setLabActionId(this.behaviorTagEnity.getLabActionId());
            sensorRecordsEnity.setStartTaggingTime(timeInMillis);
            sensorRecordsEnity.setSensorType(SensorRecordsEnity.SensorType.SENSOR_TEMPERATURE);
            sensorRecordsEnity.setSamplingRate((short) 1);
            sensorRecordsEnity.setResolution("0");
            this.behaviorTagEnity.addSensorData(sensorRecordsEnity);
            SensorDataSaveTaskManager sensorDataSaveTaskManager = this.u;
            if (sensorDataSaveTaskManager != null) {
                BehaviorTagEnity behaviorTagEnity = this.behaviorTagEnity;
                this.t = sensorDataSaveTaskManager.startTemperatureLogTask(behaviorTagEnity, behaviorTagEnity.getSensorData(SensorRecordsEnity.SensorType.SENSOR_TEMPERATURE, timeInMillis));
            }
            this.n = true;
        }
        SensorDataDealTask<CommonSensorRecord> sensorDataDealTask = this.t;
        if (sensorDataDealTask != null) {
            sensorDataDealTask.addDataToQueue(BehaviorTaggingTools.getLabCommonSensors(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b1(boolean z) {
        d2();
        this.chronometer.stop();
        f2();
        stopOrPauseRecordSensorData();
        this.y.setEndBehaviorTime(Long.valueOf(Calendar.getInstance(Locale.getDefault()).getTimeInMillis()));
        Analytics.recordEvent(new CountEventBuilder(this.cbTitleRight.isChecked() ? StatEvent.LAB_TAGGING_CHART_DATACOLLECTION_BREAK : StatEvent.LAB_TAGGING_BEHAVIORMARK_BREAK));
        if (z) {
            if (this.taggingCountTime <= 10000) {
                R1();
                return;
            } else {
                this.isFinishClick = true;
                K1(true);
                return;
            }
        }
        if (C0()) {
            U1();
        } else if (!B0()) {
            x0();
        } else {
            this.isFinishClick = true;
            K1(true);
        }
    }

    private void b2() {
        runOnUiThread(new Runnable() { // from class: ko
            @Override // java.lang.Runnable
            public final void run() {
                this.a.y1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c1() {
        return "labs onSensorStart";
    }

    private void c2() {
        if (this.isFinishClick) {
            F1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d1(boolean z) {
        return "labs onSensorStop:" + z;
    }

    private void d2() {
        SensorDataSaveTaskManager sensorDataSaveTaskManager = this.u;
        if (sensorDataSaveTaskManager != null) {
            if (this.o != null) {
                sensorDataSaveTaskManager.stopGSensorLogTask();
            }
            if (this.p != null) {
                this.u.stopPPGSensorLogTask();
            }
            if (this.q != null) {
                this.u.stopGyroLogTask();
            }
            if (this.r != null) {
                this.u.stopMagnLogTask();
            }
            if (this.s != null) {
                this.u.stopNmeaLogTask();
            }
            if (this.t != null) {
                this.u.stopTemperatureLogTask();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e1(int i) {
        return "labs onAnimationUpdate" + i;
    }

    private void e2() {
        long j = this.mTaggingEndTime;
        if (j > 0 && j - System.currentTimeMillis() <= 0) {
            onLongPressedPause(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f1(ValueAnimator valueAnimator) {
        final int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        HMLog.info(L, new Function0() { // from class: ro
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return BaseBehaviorTaggingActivity.e1(iIntValue);
            }
        });
        this.e.setProgress(iIntValue);
        if (iIntValue == this.e.getTotal() && valueAnimator.getDuration() == 1000) {
            onLongPressedPause();
        }
    }

    private void f2() {
        runOnUiThread(new Runnable() { // from class: oo
            @Override // java.lang.Runnable
            public final void run() {
                this.a.A1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g1() {
        return "labs 文件上传";
    }

    private void g2(int i) {
        this.y.setUploadStatus(Integer.valueOf(i));
        HMDaoManager.getInstance().getDaoSession().getLabActionDao().insertOrReplace(this.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h1() {
        return "labs 存储数据丢失";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i1() {
        return "labs 存储数据丢失";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean j1(Integer num) throws Exception {
        L1();
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k1(Boolean bool) throws Exception {
    }

    private void l0() {
        if (SystemClock.elapsedRealtime() - this.chronometer.getBase() >= 10000) {
            this.y.setUploadStatus(-1);
            TaggingFileUtils.updateLabAction(this.y);
            this.I = true;
            BehaviorTaggingTools.addBehaviorTaggingCountInSpf(this, this.y.getBehaviorName());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l1(Throwable th) {
        return "saveTaggingData error:" + th.getMessage();
    }

    private void m0(List<GSensorData> list) {
        ArrayList arrayList = new ArrayList();
        for (GSensorData gSensorData : list) {
            arrayList.add(new float[]{gSensorData.getX(), gSensorData.getY(), gSensorData.getZ()});
        }
        this.sensorChartFragment.addGSensorData(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m1(final Throwable th) throws Exception {
        HMLog.info(L, new Function0() { // from class: vo
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return BaseBehaviorTaggingActivity.l1(th);
            }
        });
    }

    private void n0(String str) {
        this.sensorChartFragment.addNmeaData(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n1() throws Exception {
        SensorDataSaveTaskManager sensorDataSaveTaskManager = this.u;
        if (sensorDataSaveTaskManager != null) {
            sensorDataSaveTaskManager.stopExecutor();
        }
        I1();
    }

    private void o0(List<PPGSensorData> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<PPGSensorData> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new float[]{it2.next().getPpg()});
        }
        this.sensorChartFragment.addPPGSensorData(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String o1(String str) {
        return "labs setFormatChronometer" + str;
    }

    private void p0(boolean z) {
        if (z) {
            ImageView imageView = this.c;
            int i = R.color.lab_white70;
            TintUtils.tintDrawable(imageView, ContextCompat.getColor(this, i));
            TintUtils.tintDrawable(this.d, ContextCompat.getColor(this, i));
            this.b.setTextColor(ContextCompat.getColor(this, i));
            return;
        }
        ImageView imageView2 = this.c;
        int i2 = R.color.white100;
        TintUtils.tintDrawable(imageView2, ContextCompat.getColor(this, i2));
        TintUtils.tintDrawable(this.d, ContextCompat.getColor(this, i2));
        this.b.setTextColor(ContextCompat.getColor(this, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p1(DialogInterface dialogInterface, int i) {
        v0();
        dialogInterface.dismiss();
    }

    private void q0() {
        LabEventManager.getInstance().clearLabEventListener();
    }

    private void r0() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.c, "translationX", 0.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.d, "translationX", 0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(this.h);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
        animatorSet.addListener(new b());
    }

    private void s0() {
        Observable.just(this.behaviorTagEnity).filter(new Predicate() { // from class: io
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Object obj) {
                return BaseBehaviorTaggingActivity.D0((BehaviorTagEnity) obj);
            }
        }).flatMap(new Function() { // from class: ho
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return BaseBehaviorTaggingActivity.E0((BehaviorTagEnity) obj);
            }
        }).doOnNext(new Consumer() { // from class: do
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BaseBehaviorTaggingActivity.F0((SensorRecordsEnity) obj);
            }
        }).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: bo
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                BaseBehaviorTaggingActivity.G0((SensorRecordsEnity) obj);
            }
        }, new Consumer() { // from class: ao
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.I0((Throwable) obj);
            }
        }, new Action() { // from class: zn
            @Override // io.reactivex.functions.Action
            public final void run() throws Exception {
                this.a.J0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s1(boolean z, DialogInterface dialogInterface, int i) {
        this.isFinishClick = true;
        K1(z);
        dialogInterface.dismiss();
    }

    private void showLoginDialog(int i) {
        if (this.K == null) {
            this.K = LoadingDialog.showDialog(this, getString(i));
        }
        this.K.setCancelable(false);
        this.K.setMessage(getString(i));
        this.K.show();
    }

    private void t0(long j) {
        HMDaoManager.getInstance().getDaoSession().getLabActionDao().queryBuilder().where(LabActionDao.Properties.LabActionId.eq(Long.valueOf(j)), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
        HMDaoManager.getInstance().getDaoSession().getSensorDataDao().queryBuilder().where(SensorDataDao.Properties.LabActionId.eq(Long.valueOf(j)), new WhereCondition[0]).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t1(DialogInterface dialogInterface, int i) {
        connectDevice();
        Analytics.recordEvent(new CountEventBuilder(StatEvent.LAB_TAGGING_CHART_DATACOLLECTION_BREAK));
        dialogInterface.dismiss();
    }

    private void u0() {
        AlertDialogFragment alertDialogFragment = this.D;
        if (alertDialogFragment == null || !alertDialogFragment.isShowing()) {
            return;
        }
        this.D.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u1(DialogInterface dialogInterface, int i) {
        this.isFinishClick = true;
        showLoginDialog(R.string.lab_uploading);
        c2();
        dialogInterface.dismiss();
    }

    private boolean v0() {
        if (!LabTools.isBluetoothSupportAndDisable()) {
            return true;
        }
        startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), O);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v1(DialogInterface dialogInterface, int i) {
        this.isFinishClick = true;
        this.F = true;
        w0();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        if (this.F) {
            Intent intent = new Intent();
            intent.setClass(this, BehaviorTagsHistoryActivity.class);
            startActivity(intent);
        }
        finish();
        overridePendingTransition(R.anim.running_main_enter, R.anim.running_main_exit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w1(DialogInterface dialogInterface, int i) {
        t0(this.y.getLabActionId().longValue());
        this.isFinishClick = true;
        w0();
        dialogInterface.dismiss();
    }

    private void x0() {
        this.f.setVisibility(4);
        this.b.setVisibility(4);
        this.e.setProgress(0);
        this.c.setVisibility(0);
        this.d.setVisibility(0);
        this.d.post(new Runnable() { // from class: po
            @Override // java.lang.Runnable
            public final void run() {
                this.a.K0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x1(DialogInterface dialogInterface, int i) {
        this.behaviorTagEnity.setStartClickTime(Calendar.getInstance(Locale.getDefault()).getTimeInMillis());
        this.behaviorTagEnity.clearSensorData();
        this.taggingCountTime = 0L;
        this.u = new SensorDataSaveTaskManager();
        connectDevice();
        dialogInterface.dismiss();
        this.behaviorTagEnity.setLabActionId(SystemClock.elapsedRealtime());
        this.y = TaggingFileUtils.saveLabAction(this.behaviorTagEnity);
    }

    private void y0() {
        final CountDownFragment countDownFragment = new CountDownFragment();
        countDownFragment.setOnStateChangeListener(new CountDownTextView.OnStateChangeListener() { // from class: vn
            @Override // com.xiaomi.hm.health.lab.view.CountDownTextView.OnStateChangeListener
            public final void onStateChange(int i) {
                this.a.O0(i);
            }
        });
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        int i = R.id.fl_countdown_container;
        fragmentTransactionBeginTransaction.replace(i, countDownFragment).commitAllowingStateLoss();
        RevealFrameLayout revealFrameLayout = (RevealFrameLayout) findViewById(i);
        this.w = revealFrameLayout;
        revealFrameLayout.setOnStateChangeListener(new RevealFrameLayout.OnStateChangeListener() { // from class: xn
            @Override // com.xiaomi.hm.health.lab.view.RevealFrameLayout.OnStateChangeListener
            public final void onStateChange(int i2) {
                this.a.M0(countDownFragment, i2);
            }
        });
        this.w.setVisibility(0);
        this.w.post(new Runnable() { // from class: jo
            @Override // java.lang.Runnable
            public final void run() {
                this.a.N0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y1() {
        TypefaceChronometer typefaceChronometer = this.chronometer;
        if (typefaceChronometer == null || !this.A) {
            return;
        }
        typefaceChronometer.setBase(SystemClock.elapsedRealtime() - this.taggingCountTime);
        this.chronometer.start();
        this.H = true;
        O1(this.taggingCountTime);
        r0();
    }

    private void z0() {
        LabEventManager.getInstance().setOnLabEventBluetoothListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String z1() {
        return "labs stopTimeCount taggingCountTime" + this.taggingCountTime;
    }

    public void N1(DeviceInfo deviceInfo) {
        this.behaviorTagEnity.setBytesOfDeviceID(deviceInfo.getBytesOfDeviceID());
        PnP pnp = deviceInfo.getPnp();
        if (pnp != null) {
            this.behaviorTagEnity.setProductVersion(pnp.productVersion);
        }
        this.behaviorTagEnity.setDeviceId(deviceInfo.getDeviceID());
        this.behaviorTagEnity.setHmDeviceSource(deviceInfo.getDeviceSource());
    }

    public abstract boolean connectDevice();

    public abstract HMDeviceType getMyHMDeviceType();

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.sensorChartFragment.isInFullScreenMode()) {
            this.sensorChartFragment.normalAll();
        }
        finish();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.getId() == R.id.cb_title_right) {
            if (z && (this.a.getState() == 4 || this.a.getState() == 0)) {
                this.a.startFromLocation(this.cbTitleRight);
                p0(true);
            } else if (z || this.a.getState() != 2) {
                compoundButton.setChecked(!z);
            } else {
                this.a.endFromEdge(this.cbTitleRight);
                p0(false);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.btn_finish_mark) {
            R1();
        } else if (view.getId() == R.id.btn_resume_mark) {
            J1();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        onFullScreenMode(false);
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(bundle);
        setContentView(R.layout.activity_action_marking);
        EventBus.getDefault().register(this);
        LabCallbackInit.getInitCallBack().registerEventListener(true);
        z0();
        BehaviorTagEnity behaviorTagEnity = (BehaviorTagEnity) getIntent().getSerializableExtra(LabActionDao.TABLENAME);
        this.behaviorTagEnity = behaviorTagEnity;
        if (BehaviorTaggingTools.isLabActionStarted(this, behaviorTagEnity.getLabActionId())) {
            finish();
            return;
        }
        BehaviorTaggingTools.resSetLastLabActionId(this, this.behaviorTagEnity.getLabActionId());
        if (A0()) {
            boolean zConnectDevice = connectDevice();
            this.behaviorTagEnity.setTimeZone(ProfileUtils.getTimezoneKey(TimeZone.getDefault()));
            if (zConnectDevice) {
                this.u = new SensorDataSaveTaskManager();
            }
        }
        PowerManager powerManager = (PowerManager) getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, BaseBehaviorTaggingActivity.class.getSimpleName());
            this.E = wakeLockNewWakeLock;
            if (wakeLockNewWakeLock != null) {
                wakeLockNewWakeLock.acquire(ParserMinimalBase.MAX_INT_L);
            }
        }
        onNormalScreenMode(false);
        long behaviorTagEndTime = LabCallbackInit.getInitCallBack().getBehaviorTagEndTime();
        this.mTaggingEndTime = behaviorTagEndTime;
        if (behaviorTagEndTime > 0 && behaviorTagEndTime - System.currentTimeMillis() < 0) {
            throw new IllegalArgumentException("BehaviorTagEndTime必须大于当前系统时间");
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        PowerManager.WakeLock wakeLock = this.E;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.E.release();
        }
        EventBus.getDefault().unregister(this);
        LabCallbackInit.getInitCallBack().registerEventListener(false);
        stopOrPauseRecordSensorData();
        q0();
        super.onDestroy();
    }

    public void onEventMainThread(LabAction labAction) {
        int iIntValue = labAction.getUploadStatus().intValue();
        if (iIntValue == 2) {
            g2(2);
            H1(R.string.lab_upload_fail);
            this.F = true;
        } else if (iIntValue == 3) {
            g2(3);
            this.K.setSuccess(getString(R.string.lab_upload_success), new e());
        } else if (iIntValue == 5) {
            H1(R.string.lab_upload_cancel);
            this.finishWaitRelogin = true;
            this.F = true;
        } else {
            if (iIntValue != 21) {
                return;
            }
            g2(21);
            H1(R.string.lab_tagging_fail);
        }
    }

    public void onFullScreenMode(boolean z) {
        if (z) {
            this.z = this.f.getVisibility() == 0;
            this.c.setVisibility(8);
            this.f.setVisibility(4);
            this.b.setVisibility(4);
            this.d.setVisibility(8);
            this.cbTitleRight.setVisibility(8);
            this.g.setVisibility(4);
        }
    }

    public void onLongPressedPause() {
        onLongPressedPause(false);
    }

    public void onNormalScreenMode(boolean z) {
        if (z) {
            if (this.z) {
                this.f.setVisibility(0);
                this.b.setVisibility(0);
                this.c.setVisibility(8);
                this.d.setVisibility(8);
            } else {
                this.d.setVisibility(0);
                this.c.setVisibility(0);
                this.f.setVisibility(4);
                this.b.setVisibility(4);
            }
            if (!this.A) {
                this.g.setVisibility(0);
            }
            this.cbTitleRight.setVisibility(0);
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback
    public void onSensorData(SensorDataFragment sensorDataFragment) {
        if (sensorDataFragment != null && this.G) {
            int i = d.a[sensorDataFragment.getType().ordinal()];
            if (i == 1) {
                Z1(sensorDataFragment.getData());
                o0(sensorDataFragment.getData());
            } else if (i == 2) {
                V1(sensorDataFragment.getData());
                m0(sensorDataFragment.getData());
            } else if (i == 3) {
                W1(sensorDataFragment.getData());
            } else if (i == 4) {
                X1(sensorDataFragment.getData());
            } else if (i == 5) {
                a2(sensorDataFragment.getData());
            }
            if (this.I) {
                return;
            }
            if (this.o == null && this.p == null && this.q == null && this.r == null && this.t == null) {
                return;
            }
            l0();
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback
    public void onSensorOriginData(byte[] bArr) {
        if (!BehaviorTaggingTools.NMEA.equals(this.behaviorTagEnity.getBehaviorKey()) || bArr == null || bArr.length == 0) {
            return;
        }
        String str = new String(bArr, 2, bArr.length - 2, StandardCharsets.UTF_8);
        Y1(str);
        n0(str);
        if (this.I || this.s == null) {
            return;
        }
        l0();
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback
    public void onSensorStart() {
        if (!this.G || this.H) {
            return;
        }
        HMLog.info(L, new Function0() { // from class: ap
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return BaseBehaviorTaggingActivity.c1();
            }
        });
        b2();
    }

    @Override // com.xiaomi.hm.health.bt.profile.grsp.IHMSensorDataCallback
    public void onSensorStop(final boolean z) {
        HMLog.info(L, new Function0() { // from class: xo
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return BaseBehaviorTaggingActivity.d1(z);
            }
        });
    }

    public abstract void stopOrPauseRecordSensorData();

    public void updateChartParamsOfPPG(int i, int i2) {
        SensorChartFragment sensorChartFragment = this.sensorChartFragment;
        if (sensorChartFragment != null) {
            sensorChartFragment.updateChartParamsOfPPG(i, i2);
        }
    }

    public void onLongPressedPause(final boolean z) {
        new Handler().postDelayed(new Runnable() { // from class: qo
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b1(z);
            }
        }, 100L);
    }
}
