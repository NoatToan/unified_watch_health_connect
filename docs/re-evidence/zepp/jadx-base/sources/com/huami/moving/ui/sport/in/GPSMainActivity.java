package com.huami.moving.ui.sport.in;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.chenenyu.router.annotation.Route;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.common.Keeper;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.mifit.sportlib.locate.GPSSignal;
import com.huami.mifit.sportlib.model.GPSPoint;
import com.huami.mifit.sportlib.model.RouteLineInfo;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.mifit.sportlib.observer.IServiceDataObserver;
import com.huami.mifit.sportlib.observer.IServiceSportObserver;
import com.huami.mifit.sportlib.services.IGPSServiceConn;
import com.huami.mifit.sportlib.services.util.SportNotification;
import com.huami.mifit.sportlib.tts.DistanceVoiceInfo;
import com.huami.mifit.sportlib.tts.RunningPlayer;
import com.huami.moving.R;
import com.huami.moving.datacenter.SportConfigDbClient;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.device.SportUsingDeviceHandler;
import com.huami.moving.fbtsupport.FbtEteResultImpl;
import com.huami.moving.maps.GPSSportController;
import com.huami.moving.ui.event.EventRemindDistanceVoice;
import com.huami.moving.ui.event.EventSportSetting;
import com.huami.moving.ui.sport.OpenSportDetailPage;
import com.huami.moving.ui.sport.in.GPSMainActivity;
import com.huami.moving.ui.utils.BeatUtil;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.moving.ui.watermark.WatermarkClient;
import com.huami.moving.utils.Utils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.model.Runconfig;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import de.greenrobot.event.EventBus;
import defpackage.kc4;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.koin.java.KoinJavaComponent;
import rx.Observable;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes4.dex */
@Route({"moving/GPSMainActivity"})
public class GPSMainActivity extends AppCompatActivity implements View.OnClickListener, IGPSServiceConn.IServiceStateListener, IServiceDataObserver, IServiceSportObserver {
    private static final String A = "GPSMainActivity";
    private static final String B = "StartOnLoad";
    private static final String C = "sport_id";
    private static final String D = "useAmap";
    private static final String E = "oversea";
    private static final String F = "frag_gps_normal";
    public static final String NEW_SETTING_CLASS_NAME = "com.xiaomi.hm.health.ui.sportfitness.fragment.ExerciseSettingFragment";
    private LoadingDialog m;
    private GPSSportController n;
    private Runconfig o;
    private boolean p;
    private boolean q;
    private boolean w;
    private AlertDialogFragment y;
    private Lazy<OpenSportDetailPage> a = KoinJavaComponent.inject(OpenSportDetailPage.class);
    private int b = 1;
    private SportDataCenter c = new SportDataCenter();
    private f d = null;
    private float e = Float.MAX_VALUE;
    private GPSMainNormalFragment f = null;
    private e g = e.STOPPED;
    private long h = -1;
    private boolean i = false;
    private final Point j = new Point();
    private String k = "android.intent.action.USER_PRESENT";
    private String l = "android.intent.action.USER_PRESENT";
    private long r = 0;
    private boolean s = true;
    private boolean t = false;
    private boolean u = false;
    private HashMap<String, Integer> v = new HashMap<>();
    private View x = null;
    private int z = GPSSignal.SignalLevel.DEFAULT.getValue();

    public enum Mode {
        Map,
        Normal,
        None,
        Lock_From_Normal,
        Lock_From_Map
    }

    public class a implements DialogInterface.OnClickListener {
        private boolean a;

        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.a) {
                return;
            }
            this.a = true;
            if (GPSMainActivity.this.y != null) {
                GPSMainActivity.this.y.dismissAllowingStateLoss();
            }
            GPSMainActivity.this.h0(18);
            FbtEteResultImpl.getInstance().deleteEte(GPSMainActivity.this.h);
            GPSMainActivity.this.B();
        }
    }

    public class b implements AnimateCountDownFragment.AnimationCountDownListener {
        public b() {
        }

        @Override // com.huami.moving.ui.sport.in.AnimateCountDownFragment.AnimationCountDownListener
        public void onCountDownAnimationStart() {
            SportNotification.getInstance().setNotificationInitializer(NotificationForSporting.getInstance());
            if (RunningPlayer.getInstance() != null) {
                RunningPlayer.getInstance().playStart();
            }
            GPSDataController.getInstance().setCountingDown(true);
        }

        @Override // com.huami.moving.ui.sport.in.AnimateCountDownFragment.AnimationCountDownListener
        public void onCountDownCancelled() {
            RunningPlayer.getInstance().exit();
            GPSDataController.getInstance().setCountingDown(false);
            GPSMainActivity.this.finish();
        }

        @Override // com.huami.moving.ui.sport.in.AnimateCountDownFragment.AnimationCountDownListener
        public void onFinished() {
            GPSMainActivity.this.x.setVisibility(4);
            GPSMainActivity.this.g0(true, 18);
        }
    }

    public class c implements GPSMainNormalFragment.StateListener {
        private c() {
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.StateListener
        public void onContinue() {
            if (GPSMainActivity.this.g == e.PAUSED) {
                GPSMainActivity.this.a0(true, 18);
            }
            Analytics.recordEvent(new CountEventBuilder(SportAnalytics.EVENT_RUNNING_PAUSE_OUT).setValue("Resume"));
            if (GPSMainActivity.this.K()) {
                Analytics.recordEvent(new CountEventBuilder(SportAnalytics.EVENT_LOCK_SCREEN_PAUSE_OUT).setValue("Resume"));
            } else {
                GPSMainActivity.this.M();
            }
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.StateListener
        public void onFinish() {
            GPSMainActivity.this.F();
            Analytics.recordEvent(new CountEventBuilder(SportAnalytics.EVENT_RUNNING_PAUSE_OUT).setValue(SportAnalytics.Params.VALUE_FINISH));
            if (GPSMainActivity.this.K()) {
                Analytics.recordEvent(new CountEventBuilder(SportAnalytics.EVENT_LOCK_SCREEN_PAUSE_OUT).setValue(SportAnalytics.Params.VALUE_FINISH));
            }
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.StateListener
        public void onPause() {
            HMLog.i(GPSMainActivity.A, "press pause-Button", new Object[0]);
            GPSMainActivity.this.U(true, 18);
            GPSMainActivity.this.C();
        }

        @Override // com.huami.moving.ui.sport.in.GPSMainNormalFragment.StateListener
        public void onSettingsClicked() {
            GPSMainActivity.this.e0();
        }
    }

    public static class d {
        public static final int b = 1;
        public static final int c = 2;
        public int a;

        public d(int i) {
            this.a = i;
        }
    }

    public enum e {
        PAUSED,
        RESUMED,
        STARTED,
        STOPPED
    }

    public static final class f extends Handler {
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        private WeakReference<GPSMainActivity> a;

        public f(GPSMainActivity gPSMainActivity) {
            this.a = new WeakReference<>(gPSMainActivity);
        }

        public void a() {
            removeCallbacksAndMessages(null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            GPSMainActivity gPSMainActivity = this.a.get();
            if (gPSMainActivity == null) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                gPSMainActivity.k0(message.arg1);
                return;
            }
            if (i == 2) {
                gPSMainActivity.Z();
            } else if (i == 3 && (obj = message.obj) != null) {
                gPSMainActivity.T(((Long) obj).longValue() / 1000);
            }
        }
    }

    private void A() {
        if (this.v.isEmpty()) {
            return;
        }
        for (String str : this.v.keySet()) {
            Analytics.recordEvent(new CountEventBuilder(str).setValue(String.valueOf(this.v.get(str).intValue())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        getWindow().clearFlags(128);
    }

    private void D() {
        if (J()) {
            this.y.dismissAllowingStateLoss();
            this.y = null;
        }
    }

    private void E() {
        WatermarkClient.INSTANCE.getInstance().setDeviceName(getString(R.string.MiFit, new Object[]{Utils.appName()}));
        startActivity(this.a.getValue().startSportDetailPageIntent(getApplicationContext(), this.h, this.b, DataTypeSource.RunSource.RUN_SOURCE_PHONE.getValue(), this.q, this.p, 1, this.i));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        if (J()) {
            return;
        }
        if (((int) this.c.getDistance()) >= this.e) {
            i0(18);
            return;
        }
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(this);
        builder.setCancelable(true).setTitle(R.string.running_stop_sport_confirm);
        builder.setMessage(R.string.running_short_tip);
        this.y = builder.setNegativeButton(getString(R.string.running_btn_continue), new DialogInterface.OnClickListener() { // from class: qc2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.N(dialogInterface, i);
            }
        }).setPositiveButton(getString(R.string.running_btn_confirm), new a()).create();
        Analytics.recordEvent(new CountEventBuilder(SportAnalytics.EVENT_RUNNING_FINISH));
        this.y.show(getSupportFragmentManager());
    }

    private void G(int i) {
        D();
        if (((int) this.c.getDistance()) >= this.e) {
            i0(i);
            return;
        }
        h0(i);
        FbtEteResultImpl.getInstance().deleteEte(this.h);
        B();
    }

    private void H() {
        GPSSportController gPSSportController = new GPSSportController(getApplicationContext(), this.b);
        this.n = gPSSportController;
        gPSSportController.setServiceStateListener(this);
        this.n.connect();
    }

    private void I() {
        GPSMainNormalFragment gPSMainNormalFragment = (GPSMainNormalFragment) getSupportFragmentManager().findFragmentByTag(F);
        this.f = gPSMainNormalFragment;
        if (gPSMainNormalFragment == null) {
            this.f = new GPSMainNormalFragment();
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransactionBeginTransaction.add(R.id.fragment_container, this.f, F);
            fragmentTransactionBeginTransaction.commit();
        }
        this.f.setSportDataCenter(this.c);
        this.f.setSportType(this.b);
        this.f.setUseAmap(this.p);
        this.f.setGPSSportController(this.n);
        this.f.setStateListener(new c());
    }

    private boolean J() {
        AlertDialogFragment alertDialogFragment = this.y;
        return alertDialogFragment != null && alertDialogFragment.isVisible();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K() {
        return "android.intent.action.SCREEN_OFF".equals(this.k) || "android.intent.action.SCREEN_OFF".equals(this.l);
    }

    private boolean L() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        if (SportConfigDbClient.getConfig(this.b).getKeepScreenOn().booleanValue()) {
            getWindow().addFlags(128);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(DialogInterface dialogInterface, int i) {
        this.y.dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean O(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(int i, int i2) {
        if (i == 2) {
            if (i2 == 20 && J()) {
                D();
            }
            a0(true, i2);
            return;
        }
        if (i == 3) {
            U(true, i2);
        } else {
            if (i != 4) {
                return;
            }
            G(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Q(Long l) {
        GPSDataController.getInstance().setCountingDown(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String R() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void S(Throwable th) {
        HMLog.warn(A, th, new Function0() { // from class: tc2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GPSMainActivity.R();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(long j) {
        this.c.setTime(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(boolean z, int i) {
        X(e.PAUSED);
        V(1);
        if (z) {
            this.h = this.n.getTrackId();
            this.n.executeSportCmd(3, i);
        }
        BeatUtil.stop();
    }

    private void V(int i) {
        EventBus.getDefault().post(new d(i));
    }

    private void W(int i) {
        if (i == 1) {
            g0(false, 18);
            return;
        }
        if (i == 2) {
            U(false, 18);
        } else if (i == 3) {
            a0(false, 18);
        } else {
            if (i != 4) {
                return;
            }
            j0(false, 18);
        }
    }

    private void X(e eVar) {
        this.g = eVar;
        if (e.STARTED == eVar) {
            c0(0L);
            this.n.follow();
        } else if (e.PAUSED == eVar) {
            this.n.locate();
        } else if (e.RESUMED == eVar) {
            this.n.follow();
        } else if (e.STOPPED == eVar) {
            this.n.locate();
        }
    }

    private void Y() {
        this.n.registerDataObserver(this);
        this.n.registerSportObserver(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        this.h = this.n.getTrackId();
        HMLog.i("RunUI", "SERVICE_READY trackId = " + this.h + ",Op = " + this.n.getUserOpState() + ",state = " + this.n.getSportState(), new Object[0]);
        if (this.h <= 0) {
            return;
        }
        Trackrecord needRecoverTrackRecord = TrackRecordManager.getInstance().getNeedRecoverTrackRecord(Long.valueOf(this.h));
        if (needRecoverTrackRecord != null) {
            this.c.setDistance(needRecoverTrackRecord.getDistance().intValue());
        }
        W(this.n.getSportState());
        c0(this.n.getTickerTimeInMillisecond());
        this.n.restoreGpsLine();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(boolean z, int i) {
        X(e.RESUMED);
        V(2);
        if (z) {
            this.n.executeSportCmd(2, i);
        }
        if (this.o.getBeatEnable().booleanValue()) {
            BeatUtil.beatOn((int) ((60.0f / this.o.getBeatValue().intValue()) * 1000.0f));
        }
    }

    private void b0(int i) {
        this.d.removeMessages(1);
        Message messageObtainMessage = this.d.obtainMessage(1);
        messageObtainMessage.arg1 = i;
        this.d.sendMessage(messageObtainMessage);
    }

    private void c0(long j) {
        Message messageObtainMessage = this.d.obtainMessage(3);
        messageObtainMessage.obj = Long.valueOf(j);
        this.d.sendMessage(messageObtainMessage);
    }

    private void d0(boolean z) {
        this.w = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0() {
        try {
            DialogFragment dialogFragment = (DialogFragment) Class.forName(NEW_SETTING_CLASS_NAME).newInstance();
            Bundle bundle = new Bundle();
            bundle.putInt("sportType", this.b);
            bundle.putLong("trackId", this.h);
            dialogFragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().add(dialogFragment, "Exercise-SportSetting").commitAllowingStateLoss();
            d0(true);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            e2.printStackTrace();
        }
    }

    private void f0() {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        AnimateCountDownFragment animateCountDownFragmentNewInstance = AnimateCountDownFragment.newInstance(3);
        Observable.timer(animateCountDownFragmentNewInstance.getAnimationSuration(), TimeUnit.MILLISECONDS).subscribeOn(Schedulers.io()).subscribe(new Action1() { // from class: uc2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                GPSMainActivity.Q((Long) obj);
            }
        }, new Action1() { // from class: vc2
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                GPSMainActivity.S((Throwable) obj);
            }
        });
        animateCountDownFragmentNewInstance.setAnimationCountDownListener(new b());
        fragmentTransactionBeginTransaction.add(animateCountDownFragmentNewInstance, (String) null);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(boolean z, int i) {
        X(e.STARTED);
        if (z) {
            this.n.executeSportCmd(1, i);
            this.h = this.n.getTrackId();
        }
        if (this.b != 9) {
            BeatUtil.initBeat(getApplicationContext(), R.raw.beats3);
        }
        if (this.o.getBeatEnable().booleanValue()) {
            BeatUtil.beatOn((int) ((60.0f / this.o.getBeatValue().intValue()) * 1000.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(int i) {
        j0(true, i);
        finish();
    }

    private void hideProgressDialog() {
        LoadingDialog loadingDialog = this.m;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
    }

    private void i0(int i) {
        if (RunningPlayer.getInstance() != null) {
            RunningPlayer.getInstance().playStop();
        }
        showLoadingDialog();
        j0(true, i);
        B();
        if (K()) {
            Analytics.recordEvent(new CountEventBuilder(SportAnalytics.EVENT_LOCK_SCREEN_FINISH));
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void initViews() {
        this.x = findViewById(R.id.overlayer);
        if (Utils.isMidong()) {
            this.x.setBackgroundColor(getResources().getColor(R.color.running_countdown_background_zepp));
        } else {
            this.x.setBackgroundColor(getResources().getColor(R.color.running_countdown_background));
        }
        this.x.setVisibility(0);
        this.x.setOnTouchListener(new View.OnTouchListener() { // from class: rc2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return GPSMainActivity.O(view, motionEvent);
            }
        });
    }

    private void j0(boolean z, int i) {
        e eVar = this.g;
        e eVar2 = e.STOPPED;
        if (eVar == eVar2) {
            return;
        }
        X(eVar2);
        if (z) {
            this.n.executeSportCmd(4, i);
        }
        BeatUtil.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(int i) {
        if (this.z == i) {
            return;
        }
        this.z = i;
        GPSMainNormalFragment gPSMainNormalFragment = this.f;
        if (gPSMainNormalFragment == null) {
            return;
        }
        gPSMainNormalFragment.updateGpsSignalLevel(i);
    }

    private void l0() {
        this.d.removeMessages(2);
        this.d.sendMessage(this.d.obtainMessage(2));
    }

    public static Intent newIntent(@NonNull Context context, int i, boolean z, boolean z2, boolean z3) {
        Intent intent = new Intent(context, (Class<?>) GPSMainActivity.class);
        intent.putExtra("sportType", i);
        intent.putExtra(B, z);
        intent.putExtra("oversea", z2);
        intent.putExtra(D, z3);
        return intent;
    }

    private void showLoadingDialog() {
        if (this.m == null) {
            this.m = LoadingDialog.showDialog(this);
        }
        this.m.setMessage(getString(R.string.running_end_save));
        this.m.setCancelable(false);
        if (isFinishing() || isDestroyed()) {
            return;
        }
        this.m.show();
    }

    private void z(int i, boolean z) {
        String str;
        if (z) {
            str = SportAnalytics.EVENT_RUNNING_DEVICES_CONNECTION + i;
        } else {
            str = SportAnalytics.EVENT_RUNNING_DEVICES_DISCONNECT + i;
        }
        this.v.put(str, Integer.valueOf(this.v.containsKey(str) ? 1 + this.v.get(str).intValue() : 1));
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceDataObserver
    public void onAltitudeChanged(float f2) {
        this.c.setAltitude(f2);
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceDataObserver
    public void onAvgPaceChanged(float f2) {
        this.c.setAvgPace(f2);
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (L()) {
            d0(false);
        } else {
            if (this.g != e.STOPPED) {
                return;
            }
            setResult(-1);
            finish();
            super.onBackPressed();
        }
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceDataObserver
    public void onCalorieChanged(float f2) {
        this.c.setCalorie(f2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceDataObserver
    public void onClimbAscendChanged(float f2) {
        this.c.setClimb(f2);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        M();
        setVolumeControlStream(3);
        setContentView(R.layout.activity_running_gps_main);
        this.b = getIntent().getIntExtra("sportType", this.b);
        this.p = getIntent().getBooleanExtra(D, true);
        this.q = getIntent().getBooleanExtra("oversea", false);
        this.d = new f(this);
        this.e = Keeper.getMinNoticeDisThreshold(this);
        getWindowManager().getDefaultDisplay().getSize(this.j);
        RunningPlayer.initIfNeed(getApplicationContext());
        RunningPlayer.getInstance().setSportType(this.b);
        H();
        initViews();
        super.onCreate(bundle);
        if (bundle != null) {
            this.b = bundle.getInt("sportType");
            this.p = bundle.getBoolean(D, true);
            this.q = bundle.getBoolean("oversea", false);
        }
        I();
        EventBus.getDefault().register(this);
        this.t = SportUsingDeviceHandler.getInstance().isBandConnected();
        this.u = SportUsingDeviceHandler.getInstance().isShoeConnected();
        this.o = SportConfigDbClient.getConfig(this.b);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        f fVar = this.d;
        if (fVar != null) {
            fVar.a();
        }
        GPSSportController gPSSportController = this.n;
        if (gPSSportController != null) {
            gPSSportController.unregisterDataObserver(this);
            this.n.unregisterSportObserver(this);
            this.n.destroy(getApplicationContext());
        }
        EventBus.getDefault().unregister(this);
        LoadingDialog loadingDialog = this.m;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
        super.onDestroy();
        C();
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceSportObserver
    public void onDeviceStatusChanged(boolean z, boolean z2) {
        if (!z) {
            if (z2) {
                this.u = true;
                z(SportUsingDeviceHandler.getInstance().getShoeValue(), true);
                return;
            } else {
                if (this.u) {
                    this.u = false;
                    z(SportUsingDeviceHandler.getInstance().getShoeValue(), false);
                    return;
                }
                return;
            }
        }
        if (z2) {
            Analytics.event(this, SportAnalytics.EVENT_CONNECT_BAND_CONNECTION);
            this.t = true;
            z(SportUsingDeviceHandler.getInstance().getBandValue(), true);
        } else if (this.t) {
            Analytics.event(this, SportAnalytics.EVENT_RUNNING_BAND_DISCONNECT);
            this.t = false;
            z(SportUsingDeviceHandler.getInstance().getBandValue(), false);
        }
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceDataObserver
    public void onDistanceChanged(float f2) {
        this.c.setDistance(f2);
    }

    public void onEventMainThread(EventSportSetting eventSportSetting) {
        if (eventSportSetting.isDismiss) {
            d0(false);
            return;
        }
        Runconfig config = SportConfigDbClient.getConfig(this.b);
        this.o = config;
        if (config.getKeepScreenOn().booleanValue()) {
            M();
        } else {
            C();
        }
        this.f.initSportVoice();
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceDataObserver
    public void onFinish() {
        hideProgressDialog();
        if (isFinishing() || isDestroyed()) {
            return;
        }
        this.h = this.n.getTrackId();
        E();
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceDataObserver
    public void onGPSLineInfoChanged(List<GPSPoint> list, RouteLineInfo routeLineInfo) {
        this.n.onGPSLineInfoChanged(list, routeLineInfo);
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceSportObserver
    public void onGPSSignalChanged(int i) {
        b0(i);
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceDataObserver
    public void onHrChanged(int i, int i2) {
        HMLog.d(A, "onHrChanged: status - " + i + " | hr - " + i2, new Object[0]);
        SportUsingDeviceHandler.getInstance().remindHRIfNeed(i2);
        this.c.setHeartRate(new SportDataCenter.HeartRate(i, i2));
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceSportObserver
    public /* synthetic */ void onInaccuracyLocationChanged(GPSPoint gPSPoint) {
        kc4.a(this, gPSPoint);
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceDataObserver
    public void onLocationChanged(GPSPoint gPSPoint) {
        this.n.locationChanged(gPSPoint);
        this.i = true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (K() && J()) {
            D();
        }
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceDataObserver
    public void onPaceChanged(float f2) {
        SportUsingDeviceHandler.getInstance().remindPaceIfNeed(f2);
        this.c.setPace(f2);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        Y();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        b0(this.n.getGPSSignalLevel());
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("sportType", this.b);
        bundle.putBoolean(D, this.p);
        bundle.putBoolean("oversea", this.q);
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceSportObserver
    public void onScreenStatusChanged(String str, String str2) {
    }

    @Override // com.huami.mifit.sportlib.services.IGPSServiceConn.IServiceStateListener
    public void onServerStateChanged(IGPSServiceConn.ServiceState serviceState) {
        k0(this.n.getGPSSignalLevel());
        l0();
    }

    @Override // com.huami.mifit.sportlib.services.IGPSServiceConn.IServiceStateListener
    public void onServiceConnected() {
        boolean booleanExtra;
        b0(this.n.getGPSSignalLevel());
        Intent intent = getIntent();
        if (intent != null) {
            long longExtra = intent.getLongExtra(C, -1L);
            booleanExtra = intent.getBooleanExtra(B, false);
            if (longExtra > 0) {
                this.n.recoverRun(longExtra);
            }
        } else {
            booleanExtra = false;
        }
        long trackId = this.n.getTrackId();
        if (trackId <= 0) {
            if (booleanExtra) {
                HMLog.i(A, "onServiceConnected, start new track", new Object[0]);
                f0();
                return;
            }
            return;
        }
        l0();
        this.x.setVisibility(4);
        HMLog.i(A, "onServiceConnected, trackId:" + trackId, new Object[0]);
    }

    @Override // com.huami.mifit.sportlib.services.IGPSServiceConn.IServiceStateListener
    public void onServiceDisConnected() {
        HMLog.i(A, "onServiceDisConnected", new Object[0]);
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceDataObserver
    public void onSportControl(final int i, final int i2) {
        HMLog.i(A, "onSportControl cmd:" + i + ",emitter:" + i2, new Object[0]);
        runOnUiThread(new Runnable() { // from class: sc2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.P(i, i2);
            }
        });
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceDataObserver
    public void onSportTimeChanged(long j) {
        c0(j);
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceDataObserver
    public void onStepChanged(int i) {
        this.c.setSteps(i);
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceDataObserver
    public void onStepFreqChanged(float f2) {
        this.c.setStepFreq(f2);
    }

    @Override // com.huami.mifit.sportlib.observer.IServiceDataObserver
    public void onTestLocationChanged(GPSPoint gPSPoint) {
        this.n.onTestLocationChanged(gPSPoint);
    }

    public static Intent newIntent(@NonNull Context context, int i, long j, boolean z, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) GPSMainActivity.class);
        intent.putExtra("sportType", i);
        intent.putExtra(C, j);
        intent.putExtra("oversea", z);
        intent.putExtra(D, z2);
        return intent;
    }

    public void onEventMainThread(EventRemindDistanceVoice eventRemindDistanceVoice) {
        if (this.s) {
            this.r = this.c.getTime();
            this.s = false;
        }
        RunningPlayer.getInstance().playDistance(new DistanceVoiceInfo(this.c.getDistance(), this.c.getTime(), (int) (this.c.getTime() - this.r), this.c.getCom.huami.watch.companion.dataflow.Constant.KEY_HR_VALUE java.lang.String().getHeartRate(), this.b, RunnerData.getRunner().isMetric(), false));
        this.r = this.c.getTime();
    }
}
