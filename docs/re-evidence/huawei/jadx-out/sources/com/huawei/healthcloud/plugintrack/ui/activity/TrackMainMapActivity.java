package com.huawei.healthcloud.plugintrack.ui.activity;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.sport.ITargetUpdateListener;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.manager.inteface.IMapViewListener;
import com.huawei.healthcloud.plugintrack.manager.inteface.LoadHotTrackCallBack;
import com.huawei.healthcloud.plugintrack.manager.inteface.ViewHolderInterface;
import com.huawei.healthcloud.plugintrack.model.MotionData;
import com.huawei.healthcloud.plugintrack.model.SportBeat;
import com.huawei.healthcloud.plugintrack.open.TrackService;
import com.huawei.healthcloud.plugintrack.service.KeepForegroundNoLocationService;
import com.huawei.healthcloud.plugintrack.service.KeepForegroundService;
import com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceMapCallback;
import com.huawei.healthcloud.plugintrack.ui.viewholder.IndoorRunCalibrationDistanceDialog;
import com.huawei.healthcloud.plugintrack.ui.viewmodel.TrackMainViewModel;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.interval.IntervalCardData;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import defpackage.dew;
import defpackage.gdm;
import defpackage.gze;
import defpackage.iog;
import defpackage.ive;
import defpackage.ivm;
import defpackage.iwy;
import defpackage.ixq;
import defpackage.ixs;
import defpackage.iya;
import defpackage.iyb;
import defpackage.izn;
import defpackage.izu;
import defpackage.izy;
import defpackage.jaa;
import defpackage.jac;
import defpackage.jaf;
import defpackage.jaj;
import defpackage.jaq;
import defpackage.jau;
import defpackage.jbc;
import defpackage.jbs;
import defpackage.jeh;
import defpackage.jei;
import defpackage.jem;
import defpackage.jlz;
import defpackage.jpi;
import defpackage.juu;
import defpackage.jvv;
import defpackage.jxh;
import defpackage.jxk;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.njy;
import defpackage.qpx;
import defpackage.qqs;
import defpackage.qrs;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class TrackMainMapActivity extends TrackBaseActivity implements IMapViewListener, SportLifecycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f10907a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AtomicBoolean f10908b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f10909c;
    private jaq ae;
    private TrackMainViewModel ai;
    private WeakReference<Context> d;
    private CustomViewDialog p;
    private SportBeat q;
    private c t;
    private SystemLocaleChangeReceiver x;
    private iwy w = null;
    private juu ag = null;
    private Bundle k = null;
    private Handler o = new Handler(Looper.getMainLooper());
    private int v = 0;
    private int y = -1;
    private float z = -1.0f;
    private int l = -1;
    private int ab = -1;
    private int j = 0;
    private int u = 0;
    private int e = -1;
    private ScreenListener r = null;
    private d s = null;
    private boolean g = false;
    private boolean f = false;
    private long ad = 0;
    private NoTitleCustomAlertDialog m = null;
    private CustomTextAlertDialog aa = null;
    private iya af = null;
    private boolean i = true;
    private CustomTextAlertDialog h = null;
    private final ITargetUpdateListener ac = new ITargetUpdateListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity.2
        @Override // com.huawei.health.sport.ITargetUpdateListener
        public void onTargetDataUpdate(gze gzeVar) {
        }

        @Override // com.huawei.health.sport.ITargetUpdateListener
        public void onStateUpdate(int i, String str) {
            if (i != 200) {
                return;
            }
            if (SportSupportUtil.b(TrackMainMapActivity.this.v) && TrackMainMapActivity.this.ab == 1) {
                TrackMainMapActivity.this.m();
            } else {
                TrackMainMapActivity.this.j();
            }
        }
    };
    private File n = null;

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity
    protected boolean isSport() {
        return true;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapViewListener
    public void updateGpsStatus(int i) {
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        super.initViewTahiti();
        juu juuVar = this.ag;
        if (juuVar != null && !f10907a) {
            juuVar.b();
            this.ag.p();
        }
        f10907a = false;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        qrs.c(this, bundle);
        ive.c().p();
        f10909c++;
        w();
        aq();
        super.onCreate(bundle);
        cancelAdaptRingRegion();
        ac();
        LogUtil.a("Track_TrackMainMapActivity", "onCreate");
        ap();
        if (bundle != null) {
            finish();
            return;
        }
        this.d = new WeakReference<>(this);
        this.w = jlz.d();
        BaseActivity.cancelLayoutById((RelativeLayout) findViewById(R.id.layout_StopOrResume));
        jaa.d(getApplicationContext());
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setVolumeControlStream(3);
        au();
        if (!this.w.aq()) {
            this.af = new iya();
        }
        ar();
    }

    private static boolean ad() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public boolean c() {
        int i = this.v;
        return i == 264 || i == 265 || i == 281;
    }

    private void ap() {
        if (c() && CommonUtil.bg()) {
            if (CommonUtil.bb()) {
                getWindow().getDecorView().setSystemUiVisibility(9216);
                setStatusBarColor();
            }
            getWindow().setNavigationBarColor(-16777216);
        }
    }

    private void ac() {
        TrackMainViewModel trackMainViewModel = (TrackMainViewModel) new ViewModelProvider(this).get(TrackMainViewModel.class);
        this.ai = trackMainViewModel;
        ReleaseLogUtil.d("Track_TrackMainMapActivity", "initViewModel enter ", Boolean.valueOf(trackMainViewModel == null), " sportType ", Integer.valueOf(this.v), " sportMode ", Integer.valueOf(this.u));
        TrackMainViewModel trackMainViewModel2 = this.ai;
        if (trackMainViewModel2 == null) {
            return;
        }
        trackMainViewModel2.init(this.k);
        this.ai.e(this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity$$ExternalSyntheticLambda3
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.d.e((Boolean) obj);
            }
        });
        this.ai.requestData();
        if (a()) {
            s();
        } else {
            v();
        }
        this.ai.a(this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity$$ExternalSyntheticLambda4
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.d.a((Boolean) obj);
            }
        });
        this.ai.c(this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity$$ExternalSyntheticLambda5
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.d.a((IntervalCardData) obj);
            }
        });
        this.ai.d(this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity$$ExternalSyntheticLambda6
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f10912c.b((IntervalCardData) obj);
            }
        });
        this.ai.j(this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity$$ExternalSyntheticLambda7
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.e.b((Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Boolean bool) {
        juu juuVar = this.ag;
        if (juuVar != null) {
            juuVar.j(bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        juu juuVar = this.ag;
        if (juuVar != null) {
            juuVar.e(bool.booleanValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(IntervalCardData intervalCardData) {
        juu juuVar = this.ag;
        if (juuVar != null) {
            juuVar.b(intervalCardData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(IntervalCardData intervalCardData) {
        juu juuVar = this.ag;
        if (juuVar != null) {
            juuVar.a(intervalCardData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Boolean bool) {
        juu juuVar = this.ag;
        if (juuVar != null) {
            juuVar.c(bool.booleanValue());
        }
    }

    private void v() {
        this.ai.d();
        this.ai.g(this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity$$ExternalSyntheticLambda11
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.f10911c.b((Bundle) obj);
            }
        });
        this.ai.b(this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity$$ExternalSyntheticLambda12
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: onChanged */
            public final void b(Object obj) {
                this.e.e((Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Bundle bundle) {
        juu juuVar = this.ag;
        if (juuVar != null) {
            juuVar.c(bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Integer num) {
        juu juuVar = this.ag;
        if (juuVar != null) {
            juuVar.b(num.intValue());
        }
    }

    private void s() {
        this.ai.observeSportLifeCycle("Track_TrackMainMapActivity", this);
        this.ai.onPreSport(Constants.HOME_TAB_DEVICE);
        int i = this.j;
        if (i == 1) {
            this.ai.onStartSport(Constants.HOME_TAB_DEVICE);
        } else if (i == 2) {
            this.ai.onStartSport(Constants.HOME_TAB_DEVICE);
            this.ai.onPauseSport(Constants.HOME_TAB_DEVICE);
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        ReleaseLogUtil.d("Track_TrackMainMapActivity", "onResumeSport()");
        HandlerExecutor.c(new Runnable() { // from class: jlo
            @Override // java.lang.Runnable
            public final void run() {
                this.d.ak();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ak() {
        juu juuVar = this.ag;
        if (juuVar == null) {
            ReleaseLogUtil.a("Track_TrackMainMapActivity", "onResumeSport() failed mTrackMainViewHolder is null.");
        } else {
            juuVar.h();
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        ReleaseLogUtil.d("Track_TrackMainMapActivity", "onPauseSport()");
        HandlerExecutor.c(new Runnable() { // from class: jlv
            @Override // java.lang.Runnable
            public final void run() {
                this.d.am();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void am() {
        juu juuVar = this.ag;
        if (juuVar == null) {
            ReleaseLogUtil.a("Track_TrackMainMapActivity", "onPauseSport() failed mTrackMainViewHolder is null.");
            return;
        }
        juuVar.j();
        this.ag.f();
        this.ag.s();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        ReleaseLogUtil.d("Track_TrackMainMapActivity", "onStopSport()");
        if (a()) {
            juu juuVar = this.ag;
            if (juuVar != null && juuVar.k() != null) {
                this.ag.k().setIsStop(true);
            }
            finish();
        }
    }

    public boolean a() {
        return this.u == 100;
    }

    private void w() {
        if (getIntent() == null || getIntent().getBundleExtra("sportdataparams") == null) {
            this.v = 0;
            this.y = -1;
            this.z = -1.0f;
            this.l = -1;
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra("sportdataparams");
        this.k = bundleExtra;
        if (bundleExtra != null) {
            this.v = bundleExtra.getInt("map_tracking_sport_type_sportting", 0);
            this.y = this.k.getInt("sport_target_type_sportting", -1);
            this.z = this.k.getFloat("sport_target_value_sportting", -1.0f);
            this.l = this.k.getInt("origintarget", -1);
            this.ab = this.k.getInt("trackFrom", -1);
            this.e = this.k.getInt("biTrackFrom", -1);
            this.j = this.k.getInt("initStatus", 0);
            this.u = this.k.getInt("sport_data_source_sportting", 0);
        }
    }

    private void b(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.huawei.healthcloud.plugintrack.trackSdk.TrackService");
        intent.setClass(this, TrackService.class);
        intent.setPackage(context.getPackageName());
        try {
            startService(intent);
        } catch (IllegalStateException e) {
            ReleaseLogUtil.a("Track_TrackMainMapActivity", "startTrackService", LogAnonymous.b(e));
        }
    }

    private void i(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.huawei.healthcloud.plugintrack.trackSdk.TrackService");
        intent.setClass(this, TrackService.class);
        intent.setPackage(context.getPackageName());
        stopService(intent);
        e(context);
    }

    public static void e(Context context) {
        if (context == null) {
            LogUtil.e("Track_TrackMainMapActivity", "context is null");
            return;
        }
        if (CommonUtil.bo() && f10908b.get()) {
            try {
                LogUtil.a("Track_TrackMainMapActivity", "stopServiceForeground");
                Intent intent = new Intent();
                c(context, intent);
                intent.putExtra("id", "Track_TrackMainMapActivity");
                intent.putExtra("isStop", true);
                intent.putExtra(BleConstants.SPORT_TYPE, iwy.a(BaseApplication.getContext()).k());
                intent.setPackage(context.getPackageName());
                intent.putExtra("stringKey", R.string.IDS_indoor_recording_sport_data);
                intent.putExtra("NOTIFICATION_TYPE", 1);
                context.stopService(intent);
                f10908b.set(false);
            } catch (Throwable th) {
                ReleaseLogUtil.d("Track_TrackMainMapActivity", "Remote Service throwable is ", ExceptionUtils.c(th));
            }
        }
    }

    private static void c(Context context, Intent intent) {
        if (PermissionUtil.b(context, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})) {
            intent.setClass(context, KeepForegroundService.class);
        } else {
            intent.setClass(context, KeepForegroundNoLocationService.class);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity
    protected void setActvityLayoutModel() {
        ReleaseLogUtil.d("Track_TrackMainMapActivity", "setActvityLayoutModel type is ", Integer.valueOf(this.v));
        if (c()) {
            setContentView(R.layout.track_sport_real_time_data_layout_indoor_new);
        } else {
            setContentView(R.layout.track_activity_map_tracking_main_new);
        }
        try {
            Window window = getWindow();
            if (window == null) {
                LogUtil.j("Track_TrackMainMapActivity", "setActvityLayoutModel window is null");
                return;
            }
            View decorView = window.getDecorView();
            if (decorView == null) {
                LogUtil.j("Track_TrackMainMapActivity", "setActvityLayoutModel decorView is null");
                return;
            }
            if (CommonUtil.bg()) {
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(0);
                decorView.setSystemUiVisibility((qqs.e(BaseApplication.getContext()) || c()) ? decorView.getSystemUiVisibility() & (-8193) : 9216);
                if (c()) {
                    window.setNavigationBarColor(getResources().getColor(R.color.track_activity_navigate_bg));
                    return;
                }
                return;
            }
            if (c()) {
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
                if (e()) {
                    decorView.setSystemUiVisibility(1280);
                }
            }
        } catch (Exception | NoSuchMethodError e) {
            LogUtil.e("Track_TrackMainMapActivity", "setActvityLayoutModel exception ", LogAnonymous.b(e));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity
    protected void init() {
        jvv viewCell;
        super.init();
        if (this.mViewHolderInterface == null || (viewCell = this.mViewHolderInterface.getViewCell()) == null) {
            return;
        }
        this.ag = (juu) viewCell.c();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity
    protected ViewHolderInterface initViewHolder() {
        return new juu(getWindow().getDecorView().getRootView(), this, this.k);
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity
    protected void initSport() {
        LogUtil.a("Track_TrackMainMapActivity", "initSport");
        if (a()) {
            r();
            return;
        }
        if (ad()) {
            c((Context) this);
        }
        if (!y()) {
            ReleaseLogUtil.d("Track_TrackMainMapActivity", "initSportInner is false");
            return;
        }
        if (!UnitUtil.f()) {
            jau.c().j("Track_TrackMainMapActivity");
        }
        this.w.bq();
        k();
        this.w.b("Track_TrackMainMapActivityTargetUpdate", this.ac);
        ao();
        x();
        n();
    }

    private void n() {
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getContext().getPackageName());
        intent.setAction("com.huawei.health.check_sensor_state");
        BaseApplication.getContext().sendBroadcast(intent, SecurityConstant.f5920a);
    }

    private void r() {
        if (a()) {
            LogUtil.a("Track_TrackMainMapActivity", " initMirrorSport()");
            if (!c()) {
                c(this.ag);
            }
            this.ai.observeSportingData("allData", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity$$ExternalSyntheticLambda8
                @Override // androidx.lifecycle.Observer
                /* JADX INFO: renamed from: onChanged */
                public final void b(Object obj) {
                    this.e.b(obj);
                }
            });
            this.ai.observeSportingData("deviceDisconnectTime", this, new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity$$ExternalSyntheticLambda9
                @Override // androidx.lifecycle.Observer
                /* JADX INFO: renamed from: onChanged */
                public final void b(Object obj) {
                    this.e.c(obj);
                }
            });
            this.ai.observeForeverSportingData("allData", new Observer() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity$$ExternalSyntheticLambda10
                @Override // androidx.lifecycle.Observer
                /* JADX INFO: renamed from: onChanged */
                public final void b(Object obj) {
                    this.f10910a.a(obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Object obj) {
        if (obj instanceof Bundle) {
            this.ag.c((Bundle) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Object obj) {
        if (obj instanceof Integer) {
            this.ag.d(((Integer) obj).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Object obj) {
        if (isFinishing() || isDestroyed() || !(obj instanceof jbs)) {
            return;
        }
        jbs jbsVar = (jbs) obj;
        jpi[] jpiVarArrE = jbsVar.e();
        if (jpiVarArrE != null && jpiVarArrE.length == 2) {
            this.ag.a(izy.b(jpiVarArrE[0]), izy.b(jpiVarArrE[1]));
        }
        this.ag.b(jbsVar.d());
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity
    protected void initSport(boolean z) {
        if (a()) {
            r();
            return;
        }
        boolean zY = y();
        this.w.g(true);
        MotionData motionDataE = this.w.e(true);
        this.w.aa().b();
        if (motionDataE == null) {
            LogUtil.j("Track_TrackMainMapActivity", "AutoTrack motionData is null!");
            jaf.a();
        } else {
            this.ag.a(motionDataE);
        }
        this.w.g(false);
        ReleaseLogUtil.d("Track_TrackMainMapActivity", " result ", Boolean.valueOf(zY));
    }

    private boolean y() {
        iwy iwyVarA = iwy.a(getApplicationContext());
        this.w = iwyVarA;
        if (iwyVarA.ar()) {
            LogUtil.e("Track_TrackMainMapActivity", "initSport() mPluginTrackAdapter is null can't start sport!");
            finish();
            return false;
        }
        this.w.ap();
        if (this.ag == null) {
            return false;
        }
        if (!c()) {
            c(this.ag);
            this.w.e(this.ag.o());
        } else {
            ah();
        }
        this.w.d(this);
        b((Context) this);
        e("com.huawei.healthcloud.plugintrack.NOTIFY_SPORT_DATA", "com.android.keyguard.permission.SEND_STEP_INFO_COUNTER", "com.android.systemui", 1);
        getWindow().clearFlags(524288);
        this.w.a(true);
        return true;
    }

    private static void c(juu juuVar) {
        InterfaceHiMap interfaceHiMapK = juuVar.k();
        if (interfaceHiMapK != null) {
            interfaceHiMapK.onCameraChangeListener();
            interfaceHiMapK.setIsStop(false);
        }
    }

    private void x() {
        if (izn.e(this.v, this.w.au())) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: jlr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38710c.aj();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void aj() {
        izn.d("9002", "900200020", new b());
    }

    /* JADX INFO: loaded from: classes10.dex */
    public static class b implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<TrackMainMapActivity> f10923a;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        private b(TrackMainMapActivity trackMainMapActivity) {
            this.f10923a = new WeakReference<>(trackMainMapActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            final TrackMainMapActivity trackMainMapActivity = this.f10923a.get();
            if (trackMainMapActivity == null) {
                LogUtil.j("Track_TrackMainMapActivity", "onResponse: activity is null");
                return;
            }
            if (!njy.b(obj, HiSampleConfig.class)) {
                LogUtil.j("Track_TrackMainMapActivity", "onResponse: objData is not instanceof HiSampleConfig");
                return;
            }
            List list = (List) obj;
            if (njy.e(list)) {
                LogUtil.j("Track_TrackMainMapActivity", "onResponse: list is empty");
                return;
            }
            trackMainMapActivity.q = (SportBeat) HiJsonUtil.d(((HiSampleConfig) list.get(0)).getConfigData(), SportBeat.class);
            if (trackMainMapActivity.q == null) {
                LogUtil.j("Track_TrackMainMapActivity", "onResponse: activity.mSportBeat is null, loading default value");
            } else {
                trackMainMapActivity.runOnUiThread(new Runnable() { // from class: jlw
                    @Override // java.lang.Runnable
                    public final void run() {
                        TrackMainMapActivity trackMainMapActivity2 = trackMainMapActivity;
                        trackMainMapActivity2.w.b(trackMainMapActivity2.q);
                    }
                });
            }
        }
    }

    public void b() {
        SportBeat sportBeat;
        if (izn.e(this.v, this.w.au()) && (sportBeat = this.q) != null && sportBeat.isOpen() && this.w.bc()) {
            this.q.setPlayStatus(2);
            this.w.b(this.q);
        }
    }

    public void i() {
        if (izn.e(this.v, this.w.au()) && this.q != null) {
            if (!this.w.bc()) {
                this.q.setPlayStatus(1);
            }
            this.w.b(this.q);
        }
    }

    private void ao() {
        Bundle bundle = this.k;
        if (bundle == null) {
            LogUtil.e("Track_TrackMainMapActivity", "mParamsBundle is null");
            return;
        }
        String string = bundle.getString("PATH_ID", null);
        if (TextUtils.isEmpty(string)) {
            LogUtil.a("Track_TrackMainMapActivity", "repuestHotTrackPath hotPathId null !");
        } else {
            this.w.c(string, new a(this));
        }
    }

    private void k() {
        if (this.w.al()) {
            as();
        } else {
            lsy.a(new Runnable(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity.10
                @Override // java.lang.Runnable
                public void run() {
                    OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_BREAKPOINT_RECONNECT_85070017.value(), 0);
                }
            });
            jaf.a();
        }
    }

    private void as() {
        this.w.g(true);
        gdm gdmVarBe = this.w.be();
        b(gdmVarBe);
        iwy.a(BaseApplication.getContext()).e(gdmVarBe);
        MotionData motionDataE = this.w.e(false);
        lsy.a(new Runnable(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity.8
            @Override // java.lang.Runnable
            public void run() {
                OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_BREAKPOINT_RECONNECT_85070017.value(), 1);
            }
        });
        if (motionDataE == null) {
            LogUtil.j("Track_TrackMainMapActivity", "motionData is null!");
            jaf.a();
        } else {
            if (this.v != 264) {
                this.w.aa().b();
            }
            this.ag.a(motionDataE);
            ivm.d(this);
        }
        this.w.g(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(gdm gdmVar) {
        if (gdmVar == null) {
            LogUtil.j("Track_TrackMainMapActivity", "drawHotTrackPath hotPathDetailInfo is null");
            return;
        }
        juu juuVar = this.ag;
        if (juuVar == null) {
            LogUtil.j("Track_TrackMainMapActivity", "mTrackMainViewHolder is null, return");
        } else {
            juuVar.e(gdmVar);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapViewListener
    public void startSport() {
        if (a()) {
            return;
        }
        if (this.w == null) {
            this.w = iwy.a(getApplicationContext());
        }
        if (this.w.aq()) {
            qpx.b(BaseApplication.getContext(), R.string.IDS_auto_track_sport_toast);
            return;
        }
        ax();
        juu juuVar = this.ag;
        if (juuVar != null) {
            juuVar.ag();
        }
    }

    private void ax() {
        InterfaceHiMap interfaceHiMapK;
        this.w.ap();
        this.w.d(this.v);
        int i = this.l;
        if (i != 3 && i != 4) {
            this.w.b(this.y, this.z);
        }
        this.w.a(this.l);
        this.w.bw();
        qrs.r();
        if (this.w.v() != null && this.v != 264 && (interfaceHiMapK = this.ag.k()) != null) {
            interfaceHiMapK.animateCamera(this.w.v(), 0L, (InterfaceMapCallback) null);
        }
        LogUtil.a("Track_TrackMainMapActivity", "To show app lock screen");
        if (!ad()) {
            c((Context) this);
        }
        if (this.r == null) {
            this.r = new ScreenListener(this);
            d dVar = new d(this);
            this.s = dVar;
            this.r.b(dVar);
        }
        HashMap map = new HashMap(16);
        map.put("sportId", this.w.ak());
        if (!Utils.o()) {
            map.put("startTime", this.w.aj());
            map.put("goalValue", Integer.valueOf((int) this.z));
        }
        map.put("goalType", Integer.valueOf(this.y));
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.v));
        map.put("trackType", Integer.valueOf(this.w.p()));
        int i2 = this.e;
        if (i2 != -1) {
            map.put("from", Integer.valueOf(i2));
        }
        d(AnalyticsValue.BI_TRACK_SPORT_START_SPORT_KEY.value(), map);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapViewListener
    public void pauseSport(int i) {
        LogUtil.a("Track_TrackMainMapActivity", "pauseSport");
        this.w.bd();
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("sportId", this.w.ak());
        if (!Utils.o()) {
            map.put("startTime", String.valueOf(this.w.aj()));
            map.put("pauseTime", String.valueOf(System.currentTimeMillis()));
            map.put("avgPace", izn.a(this.w.x()));
        }
        d(AnalyticsValue.BI_TRACK_SPORT_PAUSE_SPORT_KEY.value(), map);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapViewListener
    public void stopSport(boolean z) {
        LogUtil.a("Track_TrackMainMapActivity", "stopSport toSaveData is ", Boolean.valueOf(z));
        jeh.e().f();
        jei.b().a();
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("sportId", this.w.ak());
        map.put(BleConstants.SPORT_TYPE, Integer.valueOf(this.v));
        map.put("trackType", Integer.valueOf(this.w.p()));
        if (!Utils.o()) {
            map.put("startTime", String.valueOf(this.w.aj()));
            map.put("endTime", String.valueOf(System.currentTimeMillis()));
        }
        d(AnalyticsValue.BI_TRACK_SPORT_STOP_SPORT_KEY.value(), map);
        if (z) {
            e(60);
        } else {
            ive.c().a(this.v, -1L);
            finish();
            if (jem.f()) {
                jem.e();
            }
        }
        if (this.ag.k() != null) {
            this.ag.k().setIsStop(true);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapViewListener
    public void resumeSport(int i) {
        this.w.bl();
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("sportId", this.w.ak());
        if (!Utils.o()) {
            map.put("startTime", String.valueOf(this.w.aj()));
            map.put("resumeTime", String.valueOf(System.currentTimeMillis()));
        }
        d(AnalyticsValue.BI_TRACK_SPORT_RESUME_SPORT_KEY.value(), map);
    }

    private void d(String str, Map<String, Object> map) {
        Context contextT = t();
        if (contextT == null) {
            LogUtil.j("Track_TrackMainMapActivity", "handBIAnalytics failed, context is null");
        } else {
            lmf.d().c(contextT, str, map, 0);
        }
    }

    public void f() {
        ixq.d(true);
        if (isFinishing()) {
            return;
        }
        LogUtil.a("Track_TrackMainMapActivity", "start resumeSport ");
        if (a()) {
            this.ai.onResumeSport("APP");
            return;
        }
        resumeSport(0);
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.m;
        if (noTitleCustomAlertDialog == null || !noTitleCustomAlertDialog.isShowing()) {
            return;
        }
        this.m.dismiss();
        this.m = null;
    }

    public void d() {
        if (a()) {
            this.ai.onPauseSport("APP");
            return;
        }
        ixq.d(false);
        jau.c().b();
        jau.c().e();
        if (isFinishing()) {
            return;
        }
        pauseSport(0);
    }

    public void g() {
        if (a()) {
            this.ai.onStopSport("APP");
            finish();
        } else {
            if (isFinishing()) {
                return;
            }
            av();
        }
    }

    public void h() {
        LogUtil.a("Track_TrackMainMapActivity", "stopSportWithCourseEndDialog enter ");
        if (isFinishing()) {
            return;
        }
        if (a()) {
            this.ai.onStopSport("APP");
            finish();
        } else {
            c(new View.OnClickListener() { // from class: jlq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.d.a(view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.h = null;
        av();
    }

    private void av() {
        boolean zBg = this.w.bg();
        boolean zAw = this.w.aw();
        if (!zBg) {
            ba();
        } else if (zAw) {
            c(R.string.IDS_track_route_draw_unfinish_tip, true);
        } else {
            bb();
        }
    }

    private void bb() {
        int iB = ive.c().b();
        if (System.currentTimeMillis() - CommonUtil.i(this.w.aj()) <= 0) {
            ReleaseLogUtil.e("Track_TrackMainMapActivity", "The endTime is earlier than startTime,this track would not be saved");
            aw();
        } else {
            b(iB);
        }
    }

    private void ba() {
        int iB = ive.c().b();
        if (iB == 2) {
            iya iyaVar = this.af;
            if (iyaVar != null) {
                iyaVar.h();
            }
            this.w.m(false);
            finish();
            return;
        }
        if (iB == 1) {
            ive.c().c(0);
            this.w.m(false);
            finish();
        } else if (this.g) {
            c(R.string.IDS_plugin_motiontrack_little_data, false);
        } else {
            this.w.m(false);
            finish();
        }
    }

    private boolean ab() {
        CustomTextAlertDialog customTextAlertDialog = this.h;
        return customTextAlertDialog != null && customTextAlertDialog.isShowing();
    }

    private boolean aa() {
        return this.l == 4;
    }

    private boolean z() {
        int i = this.v;
        return i == 264 || i == 258;
    }

    private void c(View.OnClickListener onClickListener) {
        if (ab()) {
            LogUtil.a("Track_TrackMainMapActivity", "showCourseEndConfigDialog dialog showing.");
            return;
        }
        boolean zC = dew.c(this);
        LogUtil.a("Track_TrackMainMapActivity", "showCourseEndConfigDialog dialogShown: ", Boolean.valueOf(zC), " isFromCourse: ", Boolean.valueOf(aa()), " isRunning: ", Boolean.valueOf(z()));
        if (zC || !aa() || !z()) {
            onClickListener.onClick(null);
            return;
        }
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this);
        builder.a(R.string.IDS_hwh_course_end_config_dialog_title).b(R.string.IDS_hwh_course_end_config_dialog_content).a(R.string.IDS_hwh_course_end_config_dialog_confirm_btn, onClickListener);
        Context contextT = t();
        if (LanguageUtil.g(contextT)) {
            builder.a(qrs.d(contextT, 20.0f), qrs.d(contextT, 14.0f));
        }
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        this.h = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.h.show();
        dew.a(this, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (!aa() || !z()) {
            LogUtil.a("Track_TrackMainMapActivity", "autoFinishByCourseEndConfig isFromCourse: ", Boolean.valueOf(aa()), " isRunning: ", Boolean.valueOf(z()));
            return;
        }
        boolean zB = dew.b(BaseApplication.getContext());
        LogUtil.a("Track_TrackMainMapActivity", "autoFinishByCourseEndConfig isKeepMoving: ", Boolean.valueOf(zB), " isSporting: ", Boolean.valueOf(this.w.bc()), " isFinishing: ", Boolean.valueOf(isFinishing()));
        if (zB || isFinishing()) {
            return;
        }
        m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.w.bc()) {
            runOnUiThread(new Runnable() { // from class: jlu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38711a.an();
                }
            });
            ixq.d(false);
            this.w.bf();
        }
        runOnUiThread(new Runnable() { // from class: jln
            @Override // java.lang.Runnable
            public final void run() {
                this.e.g();
            }
        });
        ive.c().e(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void an() {
        this.ag.e();
    }

    private void b(int i) {
        if (this.v == 264) {
            if (i == 2) {
                Bundle bundle = new Bundle();
                bundle.putString("voiceType", "distance");
                bundle.putInt(BleConstants.SPORT_TYPE, this.w.k());
                bundle.putFloat("distance", this.w.g());
                jbc jbcVar = new jbc(23, bundle);
                iya iyaVar = this.af;
                if (iyaVar != null) {
                    iyaVar.e(jbcVar);
                }
            }
            o();
            e("com.huawei.healthcloud.plugintrack.NOTIFY_SPORT_DATA", "com.android.keyguard.permission.SEND_STEP_INFO_COUNTER", "com.android.systemui", 0);
            i((Context) this);
            return;
        }
        at();
    }

    private void c(int i, final boolean z) {
        LogUtil.a("Track_TrackMainMapActivity", "====enter showLittleDataDialog()=====", Boolean.valueOf(z));
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.m;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            LogUtil.j("Track_TrackMainMapActivity", "LittleDataDialog is showing");
            return;
        }
        Context contextT = t();
        if (contextT == null) {
            LogUtil.j("Track_TrackMainMapActivity", "showLittleDataDialog failed, context is null");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(contextT).b(qqs.e(this, jxk.b())).a(true).b(i).c(R.string.IDS_motiontrack_show_sport_dialog_finish, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TrackMainMapActivity.this.ag.k() != null) {
                    TrackMainMapActivity.this.ag.k().setIsStop(true);
                }
                if (TrackMainMapActivity.this.w != null) {
                    TrackMainMapActivity.this.w.m(z);
                }
                TrackMainMapActivity.this.finish();
            }
        }).a(R.string.IDS_motiontrack_show_sport_dialog_continue, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Track_TrackMainMapActivity", "LittleDataDialog is showing, onClick");
                if (TrackMainMapActivity.this.ag.q()) {
                    TrackMainMapActivity.this.ag.ac();
                }
                if (TrackMainMapActivity.this.w != null) {
                    TrackMainMapActivity.this.w.c(7, ive.c().h());
                }
            }
        }).c();
        this.m = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.m.show();
        this.w.e(4);
        this.w.c(5, ive.c().h());
    }

    private void aw() {
        Context contextT = t();
        if (contextT == null) {
            LogUtil.j("Track_TrackMainMapActivity", "showSystemTimeErrorTipDialog failed, context is null");
            return;
        }
        LogUtil.a("Track_TrackMainMapActivity", "====enter showSystemTimeErrorTipDialog()=====");
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(contextT).b(R.string.IDS_plugin_motion_track_systemtime_error_tip).a(R.string.IDS_motiontrack_show_remind).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TrackMainMapActivity.this.ag != null && TrackMainMapActivity.this.ag.k() != null) {
                    TrackMainMapActivity.this.ag.k().setIsStop(true);
                }
                TrackMainMapActivity.this.w.m(false);
                TrackMainMapActivity.this.finish();
            }
        }).b();
        this.aa = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.aa.show();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x009a  */
    private void e(final int i) {
        boolean z;
        iwy iwyVar = this.w;
        if (iwyVar != null && !iwyVar.av() && i > 0) {
            this.o.postDelayed(new Runnable() { // from class: jlt
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(i);
                }
            }, 50L);
            return;
        }
        this.o.removeCallbacksAndMessages(null);
        if (i <= 0) {
            LogUtil.e("Track_TrackMainMapActivity", "showTrackMap() with not saved.");
        }
        LogUtil.a("Track_TrackMainMapActivity", "showTrackMap wait time:", Long.valueOf(((long) (60 - i)) * 50));
        iwy iwyVar2 = this.w;
        if (iwyVar2 == null) {
            LogUtil.e("Track_TrackMainMapActivity", "mSportManager is null.");
            return;
        }
        MotionPath motionPathZ = iwyVar2.z();
        MotionPathSimplify motionPathSimplifyAe = this.w.ae();
        ixs ixsVarA = ixs.a();
        if (ixsVarA.d()) {
            z = true;
            if (ixsVarA.c() != 1 || Math.round((this.w.getDistance() - ixsVarA.j()) / 10.0f) < 1) {
                z = false;
            } else {
                motionPathSimplifyAe = jac.a(t(), "target_motion_simplify.txt");
                this.w.c(motionPathSimplifyAe);
                motionPathZ = jac.d(t(), "target_motion_path.txt", this.v);
            }
        } else {
            z = false;
        }
        if (motionPathZ != null && motionPathSimplifyAe != null) {
            Bundle bundleC = ive.c().c(z ? "target_motion_path.txt" : "motion_path2.txt", motionPathSimplifyAe, Collections.EMPTY_LIST, true, false);
            long jAb = this.w.ab();
            if (bundleC != null) {
                bundleC.putLong("hotTrackParticipateNumKey", jAb);
                bundleC.putSerializable("entrance", "fromTrackMainMap");
                bundleC.putInt(WorkoutRecord.Extend.COURSE_TARGET_TYPE, this.y);
                c(motionPathSimplifyAe, bundleC);
            }
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(int i) {
        e(i - 1);
    }

    private void c(MotionPathSimplify motionPathSimplify, Bundle bundle) {
        ReleaseLogUtil.d("Track_TrackMainMapActivity", "sendSportResult sportType = ", Integer.valueOf(this.v), ", trackFrom = ", Integer.valueOf(this.ab));
        iwy iwyVar = this.w;
        if (iwyVar != null && iwyVar.aq() && !BaseApplication.isRunningForeground()) {
            ReleaseLogUtil.d("Track_TrackMainMapActivity", "Auto track and is not running Foreground");
            return;
        }
        if (SportSupportUtil.b(this.v) && this.ab == 1) {
            int iRequestTotalDistance = motionPathSimplify.requestTotalDistance();
            float f = iRequestTotalDistance;
            float f2 = this.z;
            if (f < 1000.0f * f2) {
                ReleaseLogUtil.d("Track_TrackMainMapActivity", "sendSportResult this is invalid result, totalDistance = ", Integer.valueOf(iRequestTotalDistance), ", mTargetValue = ", Float.valueOf(f2));
                ive.c().a(this.v, -1L);
                return;
            } else {
                ive.c().a(this.v, motionPathSimplify.requestTotalTime());
                return;
            }
        }
        jxh.a(motionPathSimplify);
        if (bundle != null) {
            bundle.remove("simplifyDatakey");
            ReleaseLogUtil.d("Track_TrackMainMapActivity", "remove Simplify ");
        }
        ive.c().c(bundle);
    }

    public static void c(Context context) {
        if (context == null) {
            LogUtil.e("Track_TrackMainMapActivity", "context is null");
            return;
        }
        try {
            if (!CommonUtil.bo()) {
                ReleaseLogUtil.d("Track_TrackMainMapActivity", "startService isNeedKeepAlive = false");
                return;
            }
            Intent intent = new Intent();
            if (PermissionUtil.b(context, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})) {
                intent.setClass(context, KeepForegroundService.class);
            } else {
                if (Build.VERSION.SDK_INT >= 31 && !BaseApplication.isRunningForeground()) {
                    jaj.b(iwy.a(context.getApplicationContext()).k(), false);
                    return;
                }
                intent.setClass(context, KeepForegroundNoLocationService.class);
            }
            intent.putExtra(BleConstants.SPORT_TYPE, iwy.a(context.getApplicationContext()).k());
            intent.putExtra("isStop", false);
            intent.putExtra("id", "Track_TrackMainMapActivity");
            intent.putExtra("stringKey", R.string.IDS_indoor_recording_sport_data);
            intent.putExtra("NOTIFICATION_TYPE", 1);
            context.startService(intent);
            LogUtil.a("Track_TrackMainMapActivity", "startForegroundService");
            f10908b.set(true);
        } catch (Throwable th) {
            ReleaseLogUtil.a("Track_TrackMainMapActivity", ExceptionUtils.c(th));
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        iwy iwyVar = this.w;
        if (iwyVar == null) {
            return true;
        }
        int iO = iwyVar.o();
        LogUtil.d("Track_TrackMainMapActivity", "onKeyDown currentStatus = ", Integer.valueOf(iO));
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.ad > 0 && System.currentTimeMillis() - this.ad < 2000) {
            return true;
        }
        if (qrs.ah(t())) {
            finish();
        }
        if (this.ag != null) {
            if (iO == 1) {
                qpx.e(BaseApplication.getContext(), R.string.IDS_motiontrack_show_sport_sporting_key_down_back);
                this.ad = System.currentTimeMillis();
            } else if (iO == 2) {
                qpx.e(BaseApplication.getContext(), R.string.IDS_motiontrack_show_sport_pause_key_down_back_long_click);
                this.ad = System.currentTimeMillis();
            }
        }
        return true;
    }

    private void au() {
        iyb.e(t(), new Intent("ACTION_ACTIVITY_PAUSE_CITY_AS"));
        LogUtil.a("Track_TrackMainMapActivity", "Stop OfflineMap Download service");
    }

    private void e(String str, String str2, String str3, int i) {
        Intent intent = new Intent(str);
        intent.setPackage(str3);
        Bundle bundle = new Bundle();
        bundle.putInt("state", i);
        intent.putExtras(bundle);
        sendBroadcast(intent, str2);
        LogUtil.a("Track_TrackMainMapActivity", "Send permission broadcast to com.android.systemui, state:", Integer.valueOf(i));
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.IMapViewListener
    public void updateSportStatusWhenLockScreen(int i) {
        this.ag.c(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void al() {
        if (ai()) {
            startActivity(new Intent(this, (Class<?>) LauncherActivity.class));
        }
    }

    private boolean ai() {
        int iO = jaa.o(t());
        if (iO == 2) {
            LogUtil.a("Track_TrackMainMapActivity", " PHONE_STATE_CALL_STATE_RINGING");
            return false;
        }
        if (iO != 1) {
            return true;
        }
        LogUtil.a("Track_TrackMainMapActivity", " PHONE_STATE_CALL_STATE_OFFHOOK");
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 2000) {
            if (intent != null && intent.hasExtra("sportBeatData")) {
                this.q = (SportBeat) intent.getParcelableExtra("sportBeatData");
            }
            i();
            return;
        }
        if (i == 1000) {
            juu juuVar = this.ag;
            if (juuVar != null) {
                juuVar.a(i);
                return;
            } else {
                finish();
                return;
            }
        }
        if (i2 == -1 && i == 4) {
            q();
        } else if (i2 == -1 && i == 3000) {
            d(intent);
        }
    }

    private void d(Intent intent) {
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("current_show_type");
        LogUtil.a("Track_TrackMainMapActivity", "select data is ", stringExtra);
        this.ag.d(stringExtra);
    }

    public void d(Intent intent, int i) {
        if (intent == null) {
            ReleaseLogUtil.e("Track_TrackMainMapActivity", "startSettingActivity intent is null.");
        } else {
            startActivityForResult(intent, i);
        }
    }

    public void b(boolean z) {
        this.g = z;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ah();
        if (this.ag == null || af()) {
            return;
        }
        this.ag.w();
        this.ag.u();
        this.ag.y();
        this.ag.v();
        d dVar = this.s;
        if (dVar != null) {
            dVar.onScreenOn();
        }
        if (this.ag.k() != null) {
            this.ag.k().setScreenOnOrForegrand(true);
            this.ag.k().onResume();
        }
    }

    private void aq() {
        if (this.x == null) {
            LogUtil.e("Track_TrackMainMapActivity", "Enter registerSystemLanguageChange()");
            SystemLocaleChangeReceiver systemLocaleChangeReceiver = new SystemLocaleChangeReceiver();
            this.x = systemLocaleChangeReceiver;
            BroadcastManager.c(systemLocaleChangeReceiver);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    public class SystemLocaleChangeReceiver extends BroadcastReceiver {
        public SystemLocaleChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.e("Track_TrackMainMapActivity", "SystemLocaleChangeReceiver intent is null");
                return;
            }
            if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
                LogUtil.a("Track_TrackMainMapActivity", "SystemLocaleChangeReceiver language change");
                if (TrackMainMapActivity.this.ag != null) {
                    if (TrackMainMapActivity.this.ag.q()) {
                        TrackMainMapActivity.this.ag.z();
                    } else {
                        TrackMainMapActivity.this.ag.m();
                    }
                }
                TrackMainMapActivity.f10907a = true;
            }
        }
    }

    private void bc() {
        if (this.x != null) {
            LogUtil.a("Track_TrackMainMapActivity", "Enter unregisterSystemLanguageChange()");
            BroadcastManager.l(this.x);
            this.x = null;
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (TrackMainMapActivity.this.ag != null) {
                LogUtil.a("Track_TrackMainMapActivity", "RefreshSportingIconDataReceiver onReceive()");
                TrackMainMapActivity.this.ag.ab();
            }
        }
    }

    private void ar() {
        Context contextT = t();
        if (contextT == null) {
            LogUtil.j("Track_TrackMainMapActivity", "registerRefreshSportingIconDataReceiver failed, context is null");
            return;
        }
        this.t = new c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("refreshSportingIconDataReceiver");
        BroadcastManagerUtil.d(contextT, this.t, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void ay() {
        c cVar;
        Context contextT = t();
        if (contextT == null || (cVar = this.t) == null) {
            return;
        }
        contextT.unregisterReceiver(cVar);
        this.t = null;
    }

    private boolean af() {
        return !ScreenUtil.d();
    }

    private Context t() {
        WeakReference<Context> weakReference = this.d;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        LogUtil.a("Track_TrackMainMapActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        if (this.ag == null) {
            LogUtil.a("Track_TrackMainMapActivity", "onPause mTrackMainViewHolder is null.");
            return;
        }
        l();
        if (this.ag.k() != null) {
            this.ag.k().onPause();
        }
        if (isFinishing()) {
            p();
        }
        LogUtil.a("Track_TrackMainMapActivity", "onPause mInstanceCount = " + f10909c);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        LogUtil.a("Track_TrackMainMapActivity", "onStop");
        super.onStop();
        juu juuVar = this.ag;
        if (juuVar == null || juuVar.k() == null) {
            return;
        }
        this.ag.k().setScreenOnOrForegrand(false);
        this.ag.k().onStop();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity, com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        LogUtil.a("Track_TrackMainMapActivity", "onDestroy");
        super.onDestroy();
        if (ae()) {
            SportMusicController.c().a(1, (String) null);
        }
        juu juuVar = this.ag;
        if (juuVar != null) {
            juuVar.ad();
        }
        l();
        p();
        bc();
        ay();
        ive.c().q();
        LogUtil.a("Track_TrackMainMapActivity", "onDestroy mInstanceCount = " + f10909c);
    }

    private boolean ae() {
        if (this.ae == null) {
            u();
        }
        return CommonUtil.bh() && jaa.c(t()) && this.ae.h(this.v) == 1 && izn.a(t()) == 0;
    }

    private void l() {
        if (a() || c() || jxk.a(this.v)) {
            getWindow().clearFlags(128);
        }
        LogUtil.a("Track_TrackMainMapActivity", "cancel screen flag is on");
    }

    private void ah() {
        if ((a() || c() || jxk.a(this.v)) && (getWindow().getAttributes().flags & 128) == 0) {
            getWindow().addFlags(128);
        }
        LogUtil.a("Track_TrackMainMapActivity", "keep screen flag is on");
    }

    private void p() {
        LogUtil.a("Track_TrackMainMapActivity", "destroy mIsDestroyed:", Boolean.valueOf(this.f));
        if (this.f) {
            return;
        }
        LogUtil.a("Track_TrackMainMapActivity", "destroy mInstanceCount = ", Integer.valueOf(f10909c));
        if (f10909c == 1 && !a()) {
            jau.c().h("Track_TrackMainMapActivity");
            e("com.huawei.healthcloud.plugintrack.NOTIFY_SPORT_DATA", "com.android.keyguard.permission.SEND_STEP_INFO_COUNTER", "com.android.systemui", 0);
            i((Context) this);
            juu juuVar = this.ag;
            if (juuVar != null) {
                juuVar.i();
            }
            iwy iwyVarA = iwy.a(getApplicationContext());
            if (iwyVarA != null) {
                iwyVarA.d("Track_TrackMainMapActivityTargetUpdate");
                if (!iwyVarA.bg() && !iwyVarA.al()) {
                    jaf.a();
                    ReleaseLogUtil.d("Track_TrackMainMapActivity", " stop sport with Invalid.");
                }
                iwyVarA.bt();
                iwyVarA.bh();
            }
            ive.c().e();
        }
        ScreenListener screenListener = this.r;
        if (screenListener != null) {
            screenListener.a();
        }
        int i = f10909c - 1;
        f10909c = i;
        LogUtil.a("Track_TrackMainMapActivity", "destroy mInstanceCount = ", Integer.valueOf(i));
        this.f = true;
        ixq.d(false);
    }

    private void o() {
        iwy iwyVar = this.w;
        if (iwyVar == null) {
            LogUtil.e("Track_TrackMainMapActivity", "mSportManager is null");
            return;
        }
        LogUtil.a("Track_TrackMainMapActivity", "calibrationDistance() acquireSportDistance = ", LogAnonymous.d((int) iwyVar.j()));
        if (this.y != 1 || Math.round((this.w.getDistance() - (this.z * 1000.0f)) / 10.0f) < 1) {
            this.i = false;
        }
        Context contextT = t();
        if (contextT == null) {
            LogUtil.j("Track_TrackMainMapActivity", "calibrationDistance context is null");
        } else {
            new IndoorRunCalibrationDistanceDialog(contextT, qqs.e(this, jxk.b()), this.w.g()).c(new IndoorRunCalibrationDistanceDialog.IndoorRunCalibrationDistanceInterface() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity.15
                @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.IndoorRunCalibrationDistanceDialog.IndoorRunCalibrationDistanceInterface
                public void onClick(Dialog dialog, float f) {
                    TrackMainMapActivity.this.b(dialog, f);
                }
            }).a(new IndoorRunCalibrationDistanceDialog.IndoorRunCalibrationDistanceInterface() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity.13
                @Override // com.huawei.healthcloud.plugintrack.ui.viewholder.IndoorRunCalibrationDistanceDialog.IndoorRunCalibrationDistanceInterface
                public void onClick(Dialog dialog, float f) {
                    if (dialog == null) {
                        LogUtil.j("Track_TrackMainMapActivity", "onClick dialog is null.");
                    } else {
                        TrackMainMapActivity.this.at();
                        dialog.dismiss();
                    }
                }
            }).d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Dialog dialog, float f) {
        if (dialog == null) {
            LogUtil.j("Track_TrackMainMapActivity", "performCalibrationPositiveClick dialog is null.");
            return;
        }
        if (this.w == null) {
            LogUtil.a("Track_TrackMainMapActivity", "performCalibrationPositiveClick mSportManager is null");
            this.w = iwy.a(getApplicationContext());
        }
        int i = 1;
        double d2 = f;
        if (!UnitUtil.e(this.w.g(), 1, 2).equals(UnitUtil.e(d2, 1, 2))) {
            int i2 = (int) (1000.0f * f);
            LogUtil.a("Track_TrackMainMapActivity", "calibrationDistance() inputValue= ", Float.valueOf(f), " changeDistance is ", LogAnonymous.d(i2));
            HashMap map = new HashMap(3);
            map.put("click", "1");
            d(AnalyticsValue.BI_TRACK_SPORT_INDOOR_RUN_CALIBRATION_KEY.value(), map);
            int sportDurationBySecond = (int) this.w.getSportDurationBySecond();
            int iM = this.w.m();
            this.w.b(izu.c(d2));
            if (sportDurationBySecond == 0) {
                LogUtil.j("Track_TrackMainMapActivity", "calibrationDistance() duration is 0 ");
            } else {
                i = sportDurationBySecond;
            }
            if (c(i, iM)) {
                e(f, i, iM);
            }
            LogUtil.a("Track_TrackMainMapActivity", "calibrationDistance(), saveData duration :" + LogAnonymous.a((int) this.w.getSportDuration()), " , step :" + LogAnonymous.a(this.w.m()), " ,distance :", LogAnonymous.d(i2));
        }
        at();
        this.w.c(false);
        dialog.dismiss();
    }

    private void e(float f, int i, int i2) {
        u();
        jaq jaqVar = this.ae;
        jaqVar.e("calibrate_distance_indoor_running_data_duration", izu.a(jaqVar.d("calibrate_distance_indoor_running_data_duration"), i));
        jaq jaqVar2 = this.ae;
        jaqVar2.e("calibrate_distance_indoor_running_data_step", izu.a(jaqVar2.d("calibrate_distance_indoor_running_data_step"), i2));
        jaq jaqVar3 = this.ae;
        jaqVar3.e("calibrate_distance_indoor_running_data_actual_distance", izu.e(jaqVar3.d("calibrate_distance_indoor_running_data_actual_distance"), f * 1000.0f));
    }

    private boolean c(int i, int i2) {
        float minutes = i2 / TimeUnit.SECONDS.toMinutes(i);
        return minutes <= 220.0f && minutes >= 80.0f;
    }

    private void u() {
        this.ae = new jaq(BaseApplication.getContext(), new StorageParams(1), Integer.toString(20002));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void at() {
        Context contextT = t();
        if (contextT == null) {
            LogUtil.j("Track_TrackMainMapActivity", "showPrivicyComfirmDialog failed, context is null");
            return;
        }
        PluginSportTrackAdapter pluginSportTrackAdapterA = ive.c().a();
        if (pluginSportTrackAdapterA == null) {
            return;
        }
        if (this.ae == null) {
            u();
        }
        if (!Utils.h() || pluginSportTrackAdapterA.isPrivacyOfSportDataSwitchOn() || this.ae.ac()) {
            a(contextT);
            return;
        }
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        iog popOutWindowInfo = userProfileMgrApi.getPopOutWindowInfo(contextT, "privacy_sport_data_");
        int iE = popOutWindowInfo.e();
        long jA = popOutWindowInfo.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (iE >= 3 || jCurrentTimeMillis - jA <= 86400000) {
            a(contextT);
            return;
        }
        if (ive.c().b() == 2) {
            iya iyaVar = this.af;
            if (iyaVar != null) {
                iyaVar.g();
            }
            ive.c().c(0);
        }
        userProfileMgrApi.setPopOutWindowInfo(contextT, "privacy_sport_data_");
        b(contextT, pluginSportTrackAdapterA, View.inflate(contextT, R.layout.track_privacy_comfirm_dialog, null));
    }

    private void b(final Context context, final PluginSportTrackAdapter pluginSportTrackAdapter, View view) {
        CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(context).a(context.getString(R.string.IDS_service_area_notice_title)).d(view).c(context.getString(R.string.IDS_common_disagree).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                TrackMainMapActivity.this.d(context, pluginSportTrackAdapter, false);
            }
        }).a(context.getString(R.string.IDS_user_permission_ok).toUpperCase(Locale.ENGLISH), new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                TrackMainMapActivity.this.d(context, pluginSportTrackAdapter, true);
            }
        }).d();
        this.p = customViewDialogD;
        customViewDialogD.setCancelable(false);
        this.p.show();
    }

    private void a(Context context) {
        if (SportSupportUtil.b(this.v) && this.ab == 1) {
            e(true);
        } else if (ag()) {
            d(context);
        } else {
            e(false);
        }
    }

    private void e(boolean z) {
        ixs.a().e(z);
        if (this.w == null) {
            this.w = iwy.a(getApplicationContext());
        }
        this.w.m(true);
    }

    private boolean ag() {
        return this.i && this.y == 1 && this.z != -1.0f && Math.round((this.w.getDistance() - (this.z * 1000.0f)) / 10.0f) >= 1;
    }

    private void d(Context context) {
        float fE;
        float distance;
        LogUtil.a("Track_TrackMainMapActivity", "showDistanceChooseDialog enter");
        View viewInflate = View.inflate(context, R.layout.hw_show_choose_distance_view, null);
        if (viewInflate == null) {
            LogUtil.j("Track_TrackMainMapActivity", "showDistanceChooseDialog dialog layout fail");
            return;
        }
        int i = 3;
        if (UnitUtil.f()) {
            fE = (float) UnitUtil.e(this.z, 3);
            distance = (float) UnitUtil.e(this.w.getDistance() / 1000.0f, 3);
        } else {
            fE = this.z;
            distance = this.w.getDistance() / 1000.0f;
        }
        double d2 = fE;
        if (Math.abs(d2 - 42.195d) >= 1.0E-5d) {
            i = Math.abs(d2 - 21.0975d) < 1.0E-5d ? 4 : 2;
        }
        String strE = UnitUtil.e(d2, 1, i);
        double d3 = distance;
        String strE2 = UnitUtil.e(d3, 1, 2);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.stop_with_target_distance);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.stop_with_total_distance);
        int i2 = UnitUtil.f() ? R.plurals.IDS_end_workout_target_metric : R.plurals.IDS_end_workout_target_distance;
        int i3 = UnitUtil.f() ? R.plurals.IDS_end_workout_real_metric : R.plurals.IDS_end_workout_real_distance;
        healthTextView.setText(getResources().getQuantityString(i2, (int) Math.ceil(d2), strE));
        healthTextView2.setText(getResources().getQuantityString(i3, (int) Math.ceil(d3), strE2));
        b(viewInflate, new CustomViewDialog.Builder(context));
    }

    private void b(View view, CustomViewDialog.Builder builder) {
        builder.a(getString(R.string.IDS_target_end_workout)).b(view, 0, 0).d(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (TrackMainMapActivity.this.w == null) {
                    LogUtil.a("Track_TrackMainMapActivity", "mSportManager is null stopSport");
                    TrackMainMapActivity trackMainMapActivity = TrackMainMapActivity.this;
                    trackMainMapActivity.w = iwy.a(trackMainMapActivity.getApplicationContext());
                }
                TrackMainMapActivity.this.w.m(true);
            }
        }).c(R.string.IDS_settings_button_cancal, new View.OnClickListener(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
            }
        });
        d(view);
        CustomViewDialog customViewDialogD = builder.d();
        customViewDialogD.setCancelable(false);
        ixs.a().e(true);
        customViewDialogD.show();
    }

    private void d(View view) {
        final HealthRadioButton healthRadioButton = (HealthRadioButton) view.findViewById(R.id.choose_target_distance_radioButton);
        final HealthRadioButton healthRadioButton2 = (HealthRadioButton) view.findViewById(R.id.stop_with_total_distance_radioButton);
        healthRadioButton2.setClickable(false);
        healthRadioButton.setClickable(false);
        ((RelativeLayout) view.findViewById(R.id.choose_target_distance_layout)).setOnClickListener(new View.OnClickListener(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                healthRadioButton.setChecked(true);
                healthRadioButton2.setChecked(false);
                ixs.a().e(true);
            }
        });
        ((RelativeLayout) view.findViewById(R.id.choose_total_distance_layout)).setOnClickListener(new View.OnClickListener(this) { // from class: com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                healthRadioButton.setChecked(false);
                healthRadioButton2.setChecked(true);
                ixs.a().e(false);
            }
        });
        healthRadioButton.setChecked(true);
        healthRadioButton2.setChecked(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, PluginSportTrackAdapter pluginSportTrackAdapter, boolean z) {
        if (pluginSportTrackAdapter != null) {
            pluginSportTrackAdapter.setPrivacyOfSportDataSwitch(z);
        }
        a(context);
        this.p.dismiss();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity
    protected boolean isNeedLocationPermission() {
        return (c() || a()) ? false : true;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity
    protected boolean isNeedStorgePermission() {
        return this.v == 264 && izn.b(BaseApplication.getContext());
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.activity.TrackBaseActivity
    protected boolean isNeedActivityPermission() {
        if (!jxk.e()) {
            return false;
        }
        int i = this.v;
        return i == 258 || i == 257 || i == 264;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (this.ai != null && a()) {
            if (a()) {
                this.ai.a(this);
            } else {
                this.ai.a();
            }
        }
        overridePendingTransition(0, R.anim.track_map_activity_exit);
        juu juuVar = this.ag;
        if (juuVar != null) {
            juuVar.g();
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class a implements LoadHotTrackCallBack {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<TrackMainMapActivity> f10922c;

        a(TrackMainMapActivity trackMainMapActivity) {
            this.f10922c = new WeakReference<>(trackMainMapActivity);
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.LoadHotTrackCallBack
        public void onFailure() {
            TrackMainMapActivity trackMainMapActivity = this.f10922c.get();
            if (trackMainMapActivity != null && !trackMainMapActivity.isFinishing()) {
                qpx.b(BaseApplication.getContext(), R.string.IDS_track_show_detail_run_route_network_error);
            } else {
                LogUtil.e("Track_TrackMainMapActivity", "failed activity is finished");
            }
        }

        @Override // com.huawei.healthcloud.plugintrack.manager.inteface.LoadHotTrackCallBack
        public void onSuccess(gdm gdmVar) {
            TrackMainMapActivity trackMainMapActivity = this.f10922c.get();
            if (trackMainMapActivity == null || trackMainMapActivity.isFinishing()) {
                LogUtil.e("Track_TrackMainMapActivity", "success activity is finished");
            } else {
                trackMainMapActivity.b(gdmVar);
            }
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class d implements ScreenListener.ScreenStateListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<TrackMainMapActivity> f10925c;
        private boolean d = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f10924b = CommonUtil.ad(BaseApplication.getContext());

        public d(TrackMainMapActivity trackMainMapActivity) {
            this.f10925c = new WeakReference<>(trackMainMapActivity);
        }

        @Override // com.huawei.healthcloud.plugintrack.ui.activity.ScreenListener.ScreenStateListener
        public void onScreenOn() {
            TrackMainMapActivity trackMainMapActivity = this.f10925c.get();
            if (trackMainMapActivity == null) {
                ReleaseLogUtil.a("Track_TrackMainMapActivity", "WeakReference is null");
                return;
            }
            if (this.d) {
                return;
            }
            boolean zAd = CommonUtil.ad(BaseApplication.getContext());
            this.f10924b = zAd;
            LogUtil.a("Track_TrackMainMapActivity", "onScreenOn() IsScreenLocked: ", Boolean.valueOf(zAd));
            this.d = true;
            trackMainMapActivity.w.j(true);
            trackMainMapActivity.ag.a(true);
            LogUtil.a("Track_TrackMainMapActivity", "ScreenStateListenerImp onScreenOn");
        }

        @Override // com.huawei.healthcloud.plugintrack.ui.activity.ScreenListener.ScreenStateListener
        public void onScreenOff() {
            TrackMainMapActivity trackMainMapActivity = this.f10925c.get();
            if (trackMainMapActivity == null) {
                ReleaseLogUtil.a("Track_TrackMainMapActivity", "WeakReference is null");
                return;
            }
            this.d = false;
            trackMainMapActivity.w.j(false);
            trackMainMapActivity.ag.a(false);
            trackMainMapActivity.getWindow().clearFlags(2621568);
            if (!this.f10924b) {
                trackMainMapActivity.al();
            }
            boolean zAd = CommonUtil.ad(BaseApplication.getContext());
            this.f10924b = zAd;
            LogUtil.a("Track_TrackMainMapActivity", "onScreenOff:", Boolean.valueOf(zAd));
        }

        @Override // com.huawei.healthcloud.plugintrack.ui.activity.ScreenListener.ScreenStateListener
        public void onUserPresent() {
            this.f10924b = false;
            LogUtil.a("Track_TrackMainMapActivity", "onUserPresent() IsScreenLocked:", Boolean.valueOf(CommonUtil.ad(BaseApplication.getContext())));
        }
    }

    public static boolean e() {
        return Build.BRAND.toLowerCase(Locale.ENGLISH).indexOf("samsung") != -1;
    }

    public void e(File file) {
        this.n = file;
    }

    private void q() {
        if (this.n == null) {
            LogUtil.e("Track_TrackMainMapActivity", "mPhotoFile is null, return.");
            return;
        }
        try {
            if (29 > Build.VERSION.SDK_INT) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(this.n.getCanonicalPath(), options);
                ContentValues contentValues = new ContentValues();
                contentValues.put("_data", this.n.getPath());
                contentValues.put("_size", Long.valueOf(this.n.length()));
                contentValues.put("height", Integer.valueOf(options.outHeight));
                contentValues.put("width", Integer.valueOf(options.outWidth));
                contentValues.put("date_added", Long.valueOf(System.currentTimeMillis() / 1000));
                contentValues.put("_display_name", this.n.getName());
                getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            } else {
                MediaStore.Images.Media.insertImage(getContentResolver(), this.n.getCanonicalPath(), this.n.getName(), (String) null);
            }
        } catch (FileNotFoundException e) {
            LogUtil.e("Track_TrackMainMapActivity", LogAnonymous.b(e));
        } catch (IOException e2) {
            LogUtil.e("Track_TrackMainMapActivity", LogAnonymous.b(e2));
        }
        sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(this.n)));
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
