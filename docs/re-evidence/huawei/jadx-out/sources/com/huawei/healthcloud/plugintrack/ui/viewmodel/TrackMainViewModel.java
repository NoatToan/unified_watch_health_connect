package com.huawei.healthcloud.plugintrack.ui.viewmodel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Message;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.amap.api.location.AMapLocation;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.basesport.helper.HeartRateConfigHelper;
import com.huawei.health.basesport.viewmodel.BaseSportingViewModel;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.manager.inteface.TrackRealDataListener;
import com.huawei.healthcloud.plugintrack.model.SportGpsDataBean;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginsport.ftp.PowerZoneConfigHelper;
import com.huawei.ui.commonui.interval.IntervalCardData;
import com.huawei.ui.commonui.interval.IntervalData;
import defpackage.ecu;
import defpackage.eey;
import defpackage.hbw;
import defpackage.iov;
import defpackage.iwy;
import defpackage.izt;
import defpackage.jaa;
import defpackage.jbs;
import defpackage.jpg;
import defpackage.jpi;
import defpackage.jxk;
import defpackage.njy;
import defpackage.qli;
import defpackage.qlm;
import defpackage.qlq;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrr;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class TrackMainViewModel extends BaseSportingViewModel implements TrackRealDataListener {
    private SpannableString ab;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SpannableString f11431b;
    private boolean m;
    private HeartRateConfigHelper n;
    private boolean q;
    private PowerZoneConfigHelper w;
    private static final int[] e = {R.color.heart_rate_warm_up, R.color.heart_rate_fat_burning, R.color.heart_rate_aerobic, R.color.heart_rate_anaerobic, R.color.heart_rate_limit};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f11429a = {R.color.light_heart_rate_warm_up, R.color.light_heart_rate_fat_burning, R.color.light_heart_rate_aerobic, R.color.light_heart_rate_anaerobic, R.color.light_heart_rate_limit};
    private static final int[] d = {R.color.heart_rate_warm_up, R.color.power_aerobic, R.color.heart_rate_fat_burning, R.color.heart_rate_aerobic, R.color.power_vomax, R.color.power_anaerobic, R.color.heart_rate_limit};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f11430c = {R.color.light_heart_rate_warm_up, R.color.light_power_aerobic, R.color.light_heart_rate_fat_burning, R.color.light_heart_rate_aerobic, R.color.light_power_vomax, R.color.light_power_anaerobic, R.color.light_heart_rate_limit};
    private int t = 2;
    private boolean h = true;
    private long ag = SystemClock.elapsedRealtime() + TimeUnit.DAYS.toMillis(7);
    private boolean p = false;
    private List<jpi> g = new ArrayList();
    private jbs ae = new jbs();
    private MutableLiveData<Bundle> ai = new MutableLiveData<>();
    private MutableLiveData<Integer> aa = new MutableLiveData<>();
    private MutableLiveData<Boolean> r = new MutableLiveData<>();
    private MutableLiveData<Boolean> v = new MutableLiveData<>();
    private a y = new a(this);
    private boolean l = false;
    private List<IntervalData> o = new ArrayList();
    private List<IntervalData> ad = new ArrayList();
    private MutableLiveData<IntervalCardData> k = new MutableLiveData<>();
    private MutableLiveData<IntervalCardData> ac = new MutableLiveData<>();
    private MutableLiveData<Boolean> s = new MutableLiveData<>();
    private IntervalCardData i = new IntervalCardData();
    private IntervalCardData u = new IntervalCardData();
    private qlm f = new qlm();
    private qlm x = new qlm();
    private int j = -1;
    private int z = -1;

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initFragment() {
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.TrackRealDataListener
    public void updateGpsData(SportGpsDataBean sportGpsDataBean) {
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            e(((Integer) message.obj).intValue());
        } else {
            if (i != 2) {
                return false;
            }
            l();
        }
        return true;
    }

    public void e(int i) {
        if (i == 3) {
            this.h = false;
        }
        if (this.t != i) {
            this.t = i;
            this.mExtendHandler.sendEmptyMessage(2);
        }
    }

    private void l() {
        if (this.t == 3 || !this.h) {
            long jElapsedRealtime = this.ag - SystemClock.elapsedRealtime();
            if (jElapsedRealtime > TimeUnit.SECONDS.toMillis(300L)) {
                this.ag = SystemClock.elapsedRealtime() + TimeUnit.SECONDS.toMillis(300L);
                jElapsedRealtime = TimeUnit.SECONDS.toMillis(300L);
            }
            if (jElapsedRealtime > 0) {
                postValue("deviceDisconnectTime", Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(jElapsedRealtime)));
                if (this.mExtendHandler != null) {
                    this.mExtendHandler.removeMessages(2);
                    this.mExtendHandler.sendEmptyMessage(2, 1000L);
                    return;
                }
                return;
            }
            postValue("deviceDisconnectTime", -1);
            onStopSport(Constants.HOME_TAB_DEVICE);
            return;
        }
        postValue("deviceDisconnectTime", -1);
        this.ag = SystemClock.elapsedRealtime() + TimeUnit.DAYS.toMillis(7L);
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void requestData() {
        super.requestData();
        f();
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initReceivedDataHandlers() {
        c();
        b();
        e();
    }

    private void c() {
        this.mReceivedDataHandlers.add(new BaseSportingViewModel.ReceivedDataHandler<Long>(this, "TIME_ONE_SECOND_DURATION", "allData", Long.class) { // from class: com.huawei.healthcloud.plugintrack.ui.viewmodel.TrackMainViewModel.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel.ReceivedDataHandler
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void handleInner(Long l, Map map) {
                Bundle bundleE = hbw.e(map, TrackMainViewModel.this.getSportType(), TrackMainViewModel.this.p);
                TrackMainViewModel.this.b(bundleE);
                TrackMainViewModel.this.postValue(this.mViewModelTag, bundleE);
                if (TrackMainViewModel.this.h) {
                    return;
                }
                TrackMainViewModel.this.h = true;
            }
        });
    }

    private void e() {
        this.mReceivedDataHandlers.add(new BaseSportingViewModel.ReceivedDataHandler<Location>(this, "GPS_DATA", "allData", Location.class) { // from class: com.huawei.healthcloud.plugintrack.ui.viewmodel.TrackMainViewModel.5
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel.ReceivedDataHandler
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void handleInner(Location location, Map map) {
                jpg jpgVarA = izt.a(new jpg(location.getLatitude(), location.getLongitude()), AMapLocation.COORD_TYPE_WGS84, jaa.b());
                LogUtil.a("Track_TrackMainViewModel", " receive location:", location, " list:", Integer.valueOf(TrackMainViewModel.this.g.size()));
                TrackMainViewModel.this.ae.d(new jpi(jpgVarA.d, jpgVarA.f38787a, location.getAccuracy(), location.getSpeed(), (float) location.getAltitude(), location.getBearing(), location.getTime(), location.getProvider()));
                TrackMainViewModel.this.postValue(this.mViewModelTag, TrackMainViewModel.this.ae);
            }
        });
    }

    void b() {
        this.mReceivedDataHandlers.add(new BaseSportingViewModel.ReceivedDataHandler<Integer>(this, "DEVICE_CONNECT_STATUS", "deviceDisconnectTime", Integer.class) { // from class: com.huawei.healthcloud.plugintrack.ui.viewmodel.TrackMainViewModel.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel.ReceivedDataHandler
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void handleInner(Integer num, Map map) {
                LogUtil.j(TrackMainViewModel.this.getTag(), this.mManagerDataTag, num);
                TrackMainViewModel.this.d(num.intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (this.mExtendHandler != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = Integer.valueOf(i);
            this.mExtendHandler.sendMessage(messageObtain);
        }
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void init(Bundle bundle) {
        super.init(bundle);
        addSportDataMap("allData");
        addSportDataMap("deviceDisconnectTime");
        addSportDataMap("allData");
        int sportType = getSportType();
        int dataSource = getDataSource();
        this.p = dataSource == 100;
        jxk.f39164c = new Pair<>(false, false);
        jxk.e = new Pair<>(Boolean.valueOf(jxk.b(sportType, dataSource)), Boolean.valueOf(jxk.d(sportType, dataSource)));
        boolean z = sportType == 265;
        jxk.f39163b = new Pair<>(false, Boolean.valueOf(z));
        jxk.f39162a = new Pair<>(false, Boolean.valueOf(z));
        ReleaseLogUtil.d("Track_TrackMainViewModel", "area is show: ", jxk.e);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport(String str) {
        if (this.mSportLifeCircleApi != null && this.mSportDataOutputApi != null && this.mSportDataOutputApi.getStatus() != 7) {
            ReleaseLogUtil.d("Track_TrackMainViewModel", "onPreSport()");
            this.mSportLifeCircleApi.onPreSport(str);
        }
        observeSportLifeCycle("gpsData", this.ae);
        doStartSportBi();
        HandlerCenter.a().d(new Runnable() { // from class: jwc
            @Override // java.lang.Runnable
            public final void run() {
                this.f39133b.updateLinkStart();
            }
        }, 500L);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onCountDown(String str) {
        if (this.mSportLifeCircleApi == null || this.mSportDataOutputApi == null || this.mSportDataOutputApi.getStatus() == 6) {
            return;
        }
        ReleaseLogUtil.d("Track_TrackMainViewModel", "onCountDown()");
        this.mSportLifeCircleApi.onCountDown(str);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport(String str) {
        if (this.mSportLifeCircleApi != null && this.mSportDataOutputApi != null && this.mSportDataOutputApi.getStatus() != 1) {
            ReleaseLogUtil.d("Track_TrackMainViewModel", "onStartSport()");
            this.mSportLifeCircleApi.onStartSport(str);
        }
        if (this.mIsFirstIn) {
            SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(20002), "sport_first_start_time_" + getSportType(), String.valueOf(System.currentTimeMillis()), null);
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport(String str) {
        if (this.mSportLifeCircleApi == null || this.mSportDataOutputApi == null || this.mSportDataOutputApi.getStatus() != 2) {
            return;
        }
        ReleaseLogUtil.d("Track_TrackMainViewModel", "onResumeSport()");
        this.mSportLifeCircleApi.onResumeSport(str);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport(String str) {
        if (this.mSportLifeCircleApi == null || this.mSportDataOutputApi == null || this.mSportDataOutputApi.getStatus() != 1) {
            return;
        }
        ReleaseLogUtil.d("Track_TrackMainViewModel", "onPauseSport()");
        this.mSportLifeCircleApi.onPauseSport(str);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStopSport(String str) {
        if (this.mSportLifeCircleApi == null || this.mSportDataOutputApi == null || this.mSportDataOutputApi.getStatus() == 3) {
            return;
        }
        ReleaseLogUtil.d("Track_TrackMainViewModel", "onStopSport()");
        this.mSportLifeCircleApi.onStopSport(str);
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public String getTag() {
        return "Track_TrackMainViewModel";
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public List<String> getSubscribeTagList() {
        LogUtil.a("Track_TrackMainViewModel", "getSubscribeTagList enter ");
        ArrayList arrayList = new ArrayList();
        arrayList.add("DEVICE_CONNECT_STATUS");
        arrayList.add("DISTANCE_DATA");
        arrayList.add("TIME_ONE_SECOND_DURATION");
        arrayList.add("HEART_RATE_DATA");
        arrayList.add("CALORIES_DATA");
        arrayList.add("ACTIVE_CALORIES_DATA");
        arrayList.add("CREEP_DATA");
        arrayList.add("DESCENT_DATA");
        arrayList.add("ALTITUDE_DATA");
        arrayList.add("PACE_DATA");
        arrayList.add("SPEED_DATA");
        arrayList.add("AVG_SPEED_DATA");
        arrayList.add("MAX_SPEED_DATA");
        arrayList.add("CADENCE_DATA");
        arrayList.add("POWER_DATA");
        arrayList.add("ANALOG_POWER_DATA");
        arrayList.add("ANALOG_CADENCE_DATA");
        arrayList.add("THREE_SEC_POWER_DATA");
        arrayList.add("THREE_SEC_ANALOG_POWER_DATA");
        arrayList.add("AVG_POWER_DATA");
        arrayList.add("AVG_ANALOG_POWER_DATA");
        arrayList.add("AVG_CADENCE_DATA");
        arrayList.add("AVG_ANALOG_CADENCE_DATA");
        arrayList.add("INCLINATION_DATA");
        arrayList.add("GPS_DATA");
        arrayList.add("STEP_DATA");
        arrayList.add("STEP_RATE_DATA");
        arrayList.add("CONTACT_TIME_DATA");
        arrayList.add("GROUND_IMPACT_ACCELERATION_DATA");
        arrayList.add("EVERSION_EXCURSION_DATA");
        arrayList.add("SWING_ANGLE_DATA");
        arrayList.add("HANG_TIME_DATA");
        arrayList.add("GROUND_HANG_TIME_DATA");
        arrayList.add("GCTIME_BALANCE_DATA");
        arrayList.add("VERTICAL_OSCILLATION_DATA");
        arrayList.add("VERTICAL_RATIO_DATA");
        arrayList.add("ACTIVE_PEAK_DATA");
        arrayList.add("VERTICAL_LOADING_RATE_DATA");
        LogUtil.a("Track_TrackMainViewModel", "getSubscribeTagList enter ,", arrayList);
        return arrayList;
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        ObserverManagerUtil.c(this.y);
        ReleaseLogUtil.d("Track_TrackMainViewModel", "onCleared  unregister");
    }

    public void a(Context context) {
        if (getDataSource() == 100) {
            a(context, 259);
        }
    }

    private static void a(Context context, int i) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.health.MainActivity");
        if (qrs.ah(context) && (context instanceof Activity) && ((Activity) context).getWindowManager().getDefaultDisplay().getRotation() == 1) {
            intent.setFlags(131072);
        } else {
            intent.setFlags(67108864);
        }
        intent.putExtra(BleConstants.SPORT_TYPE, i);
        intent.putExtra("isToSportTab", true);
        intent.putExtra(Constants.HOME_TAB_NAME, "SPORT");
        iov.d(context, intent);
    }

    public void d() {
        iwy.a(BaseApplication.b()).c(this);
    }

    public void a() {
        iwy.a(BaseApplication.b()).bz();
    }

    private void f() {
        int sportType = getSportType();
        this.n = new HeartRateConfigHelper(sportType, new HeartRateConfigHelper.OnConfigHelperListener() { // from class: jvy
            @Override // com.huawei.health.basesport.helper.HeartRateConfigHelper.OnConfigHelperListener
            public final void onInitComplete() {
                this.f39130a.i();
            }
        });
        this.w = new PowerZoneConfigHelper(new PowerZoneConfigHelper.OnConfigHelperListener() { // from class: jwe
            @Override // com.huawei.pluginsport.ftp.PowerZoneConfigHelper.OnConfigHelperListener
            public final void onInitComplete(boolean z) {
                this.e.b(z);
            }
        });
        boolean z = sportType == 259;
        this.q = z;
        ReleaseLogUtil.d("Track_TrackMainViewModel", " mIsSupportAnimationType: ", Boolean.valueOf(z));
        ObserverManagerUtil.d(this.y, "sport_with_link");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        ReleaseLogUtil.d("Track_TrackMainViewModel", "mHeartRateConfigHelper onInitComplete");
        if (this.n == null) {
            ReleaseLogUtil.a("Track_TrackMainViewModel", "mHeartRateConfigHelper is null");
            return;
        }
        if (getSportTarget() == 4) {
            this.n.d(1);
            ReleaseLogUtil.d("Track_TrackMainViewModel", "mHeartRateConfigHelper setClassifyMethod rest");
        }
        LogUtil.a("Track_TrackMainViewModel", "HeartRateConfig is ", this.n.c());
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(boolean z) {
        ReleaseLogUtil.d("Track_TrackMainViewModel", " PowerZoneConfig isSuccess: ", Boolean.valueOf(z));
        MutableLiveData<Boolean> mutableLiveData = this.s;
        if (mutableLiveData == null) {
            ReleaseLogUtil.a("Track_TrackMainViewModel", "mIsPowerZoneExistLiveData is null");
            return;
        }
        this.m = z;
        mutableLiveData.postValue(Boolean.valueOf(z));
        h();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b5  */
    private void a(int i) {
        if (this.m) {
            if (!((Boolean) jxk.f39164c.second).booleanValue() && getSportType() == 259) {
                jxk.f39164c = new Pair<>((Boolean) jxk.f39164c.first, true);
                ReleaseLogUtil.d("Track_TrackMainViewModel", "support power");
            }
            if (((Boolean) jxk.e.second).booleanValue()) {
                String strF = qre.f(R.string.IDS_motiontrack_show_invalid_data);
                if (i >= 0) {
                    strF = UnitUtil.e(i, 1, 0);
                }
                int iE = this.w.e(i);
                float fC = this.w.c(i);
                String strB = this.w.b(i);
                if (d(iE, this.z)) {
                    LogUtil.a("Track_TrackMainViewModel", "start power Animation with index ", Integer.valueOf(iE), " ratio: ", Float.valueOf(fC), " num: ", Integer.valueOf(i));
                    this.u.b(true);
                } else {
                    this.u.b(false);
                }
                d(iE, fC, strB);
                SpannableString spannableString = new SpannableString(strF);
                qri.e(spannableString, strF);
                this.u.e(spannableString);
                this.u.b(iE);
                if (iE >= 0) {
                    int[] iArr = d;
                    if (iE < iArr.length) {
                        this.u.c(iArr[iE]);
                    } else {
                        this.u.c(d[0]);
                    }
                } else {
                    this.u.c(d[0]);
                }
                this.u.c(this.ad);
                this.ac.postValue(this.u);
                this.z = iE;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00bd  */
    private void b(String str) {
        int iN;
        if (!((Boolean) jxk.f39164c.first).booleanValue()) {
            jxk.f39164c = new Pair<>(true, (Boolean) jxk.f39164c.second);
            ReleaseLogUtil.d("Track_TrackMainViewModel", "support heart rate");
        }
        if (((Boolean) jxk.e.first).booleanValue()) {
            String strF = qre.f(R.string.IDS_motiontrack_show_invalid_data);
            if (TextUtils.isEmpty(str)) {
                iN = Integer.MIN_VALUE;
            } else {
                iN = CommonUtil.n(BaseApplication.b(), str);
                strF = UnitUtil.e(iN, 1, 0);
            }
            int iC = this.n.c(iN);
            float fB = this.n.b(iN);
            String strE = this.n.e(iN);
            if (d(iC, this.j) && !j()) {
                ReleaseLogUtil.d("Track_TrackMainViewModel", "start heart Animation with index", Integer.valueOf(iC), " ratio: ", Float.valueOf(fB), " num: ", Integer.valueOf(iN));
                this.i.b(true);
            } else {
                this.i.b(false);
            }
            c(iC, fB, strE);
            SpannableString spannableString = new SpannableString(strF);
            qri.e(spannableString, strF);
            this.i.e(spannableString);
            this.i.b(iC);
            if (iC >= 0) {
                int[] iArr = e;
                if (iC < iArr.length) {
                    this.i.c(iArr[iC]);
                } else {
                    this.i.c(e[0]);
                }
            } else {
                this.i.c(e[0]);
            }
            this.i.c(this.o);
            this.k.postValue(this.i);
            this.j = iC;
        }
    }

    private boolean d(int i, int i2) {
        return i > 1 && i > i2 && i2 > -1 && this.q;
    }

    private static boolean j() {
        return ((Boolean) jxk.f39164c.second).booleanValue() && ((Boolean) jxk.e.second).booleanValue();
    }

    private void c(int i, float f, String str) {
        if (njy.e(this.o)) {
            return;
        }
        for (int i2 = 0; i2 < this.o.size(); i2++) {
            IntervalData intervalData = this.o.get(i2);
            if (i == i2) {
                this.f.c(f);
                this.f.b(true);
                intervalData.e(this.f);
                SpannableString spannableString = new SpannableString(str);
                qri.b(spannableString, str, R.color.common_color_black);
                qri.a(spannableString, str, new qli(jxk.d()));
                qlq qlqVar = new qlq();
                qlqVar.a(spannableString);
                intervalData.b(qlqVar);
                intervalData.c(e[i2]);
            } else {
                intervalData.e((qlm) null);
                intervalData.c(f11429a[i2]);
                intervalData.b((qlq) null);
            }
        }
    }

    private void d(int i, float f, String str) {
        if (njy.e(this.ad)) {
            return;
        }
        for (int i2 = 0; i2 < this.ad.size(); i2++) {
            IntervalData intervalData = this.ad.get(i2);
            if (i == i2) {
                this.x.c(f);
                this.x.b(true);
                intervalData.e(this.x);
                SpannableString spannableString = new SpannableString(str);
                qri.b(spannableString, str, R.color.common_color_black);
                qri.a(spannableString, str, new qli(jxk.d()));
                qlq qlqVar = new qlq();
                qlqVar.a(spannableString);
                intervalData.b(qlqVar);
                intervalData.c(d[i2]);
            } else {
                intervalData.e((qlm) null);
                intervalData.b((qlq) null);
                intervalData.c(f11430c[i2]);
            }
        }
    }

    private void g() {
        int i = 0;
        while (true) {
            int[] iArr = f11429a;
            if (i < iArr.length) {
                IntervalData intervalData = new IntervalData();
                intervalData.c(iArr[i]);
                if (i == 0) {
                    intervalData.d(IntervalData.RoundCornerType.EDGE_START);
                } else if (i == e.length - 1) {
                    intervalData.d(IntervalData.RoundCornerType.EDGE_END);
                }
                this.o.add(intervalData);
                i++;
            } else {
                String strF = qre.f(R.string.IDS_herat_rate_name_and_unit);
                SpannableString spannableString = new SpannableString(strF);
                qri.a(spannableString, strF, new qli(qrr.e()));
                this.i.a(spannableString);
                return;
            }
        }
    }

    private void h() {
        int i = 0;
        while (true) {
            int[] iArr = f11430c;
            if (i < iArr.length) {
                IntervalData intervalData = new IntervalData();
                intervalData.c(iArr[i]);
                if (i == 0) {
                    intervalData.d(IntervalData.RoundCornerType.EDGE_START);
                } else if (i == d.length - 1) {
                    intervalData.d(IntervalData.RoundCornerType.EDGE_END);
                }
                this.ad.add(intervalData);
                i++;
            } else {
                String strF = qre.f(R.string.IDS_power_name_and_unit);
                this.ab = new SpannableString(strF);
                String strF2 = qre.f(R.string.IDS_track_analog_power_with_unit);
                this.ab = new SpannableString(strF);
                this.f11431b = new SpannableString(strF2);
                qri.a(this.ab, strF, new qli(qrr.e()));
                qri.a(this.f11431b, strF, new qli(qrr.e()));
                this.u.a(this.f11431b);
                return;
            }
        }
    }

    public void g(LifecycleOwner lifecycleOwner, Observer<Bundle> observer) {
        this.ai.observe(lifecycleOwner, observer);
    }

    public void b(LifecycleOwner lifecycleOwner, Observer<Integer> observer) {
        this.aa.observe(lifecycleOwner, observer);
    }

    public void a(LifecycleOwner lifecycleOwner, Observer<Boolean> observer) {
        this.r.observe(lifecycleOwner, observer);
    }

    public void c(LifecycleOwner lifecycleOwner, Observer<IntervalCardData> observer) {
        this.k.observe(lifecycleOwner, observer);
    }

    public void d(LifecycleOwner lifecycleOwner, Observer<IntervalCardData> observer) {
        this.ac.observe(lifecycleOwner, observer);
    }

    public void j(LifecycleOwner lifecycleOwner, Observer<Boolean> observer) {
        this.v.observe(lifecycleOwner, observer);
    }

    public void e(LifecycleOwner lifecycleOwner, Observer<Boolean> observer) {
        this.s.observe(lifecycleOwner, observer);
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.TrackRealDataListener
    public void updateGpsState(int i) {
        this.aa.postValue(Integer.valueOf(i));
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.TrackRealDataListener
    public void updateSportData(Bundle bundle) {
        b(bundle);
        this.ai.postValue(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Bundle bundle) {
        String str;
        if (bundle.containsKey(IndoorEquipManagerApi.KEY_HEART_RATE) || ((Boolean) jxk.f39164c.first).booleanValue()) {
            b(bundle.getString(IndoorEquipManagerApi.KEY_HEART_RATE));
        }
        if (((Boolean) jxk.f39163b.first).booleanValue() || ((Boolean) jxk.f39164c.second).booleanValue()) {
            if (((Boolean) jxk.f39163b.second).booleanValue()) {
                this.u.a(this.ab);
                str = "threeSecPower";
                if (!bundle.containsKey("threeSecPower")) {
                    str = "power";
                }
            } else {
                this.u.a(this.f11431b);
                str = "threeSecAnalogPower";
                if (!bundle.containsKey("threeSecAnalogPower")) {
                    str = HwExerciseConstants.EXTEND_CYCLE_ANALOG_POWER;
                }
            }
            a(bundle.getInt(str, Integer.MIN_VALUE));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.TrackRealDataListener
    public void updateLinkStart() {
        if (this.l) {
            return;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "Track_TrackMainViewModel");
        boolean zD = eey.d(deviceInfo, ComponentInfo.PluginPay_A_N);
        this.r.postValue(Boolean.valueOf(zD));
        this.v.postValue(Boolean.valueOf(eey.d(deviceInfo, 327)));
        this.l = true;
        ReleaseLogUtil.d("Track_TrackMainViewModel", " start link with ", Boolean.valueOf(zD));
        b("");
        if (zD && this.q) {
            a(Integer.MIN_VALUE);
        }
    }

    public static class a implements com.huawei.haf.design.pattern.Observer {
        private final WeakReference<TrackMainViewModel> e;

        a(TrackMainViewModel trackMainViewModel) {
            this.e = new WeakReference<>(trackMainViewModel);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            if ("sport_with_link".equals(str)) {
                TrackMainViewModel trackMainViewModel = this.e.get();
                if (trackMainViewModel == null) {
                    ReleaseLogUtil.e("Track_TrackMainViewModel", "TrackMainViewModel is null");
                } else {
                    ReleaseLogUtil.d("Track_TrackMainViewModel", " start link with Observer");
                    trackMainViewModel.updateLinkStart();
                }
            }
        }
    }
}
