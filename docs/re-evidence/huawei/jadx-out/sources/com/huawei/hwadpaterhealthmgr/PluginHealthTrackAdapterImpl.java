package com.huawei.hwadpaterhealthmgr;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.huawei.exercise.modle.RunPlanRecordInfo;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.model.MeasureResult;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.healthcloud.plugintrack.manager.inteface.ITreadmillStyleCallback;
import com.huawei.healthcloud.plugintrack.manager.inteface.LocalPressureCallback;
import com.huawei.healthcloud.plugintrack.model.IHeartRateCallback;
import com.huawei.healthcloud.plugintrack.model.IRealStepCallback;
import com.huawei.healthcloud.plugintrack.model.IRidePostureDataCallback;
import com.huawei.healthcloud.plugintrack.model.IRunningPostureCallback;
import com.huawei.healthcloud.plugintrack.model.IStepRateCallback;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthApi;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hihealth.motion.IFlushResult;
import com.huawei.hihealth.motion.RealStepCallback;
import com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwdataaccessmodel.utils.StorageDataCallback;
import com.huawei.hwfoundationmodel.trackmodel.HeartRateData;
import com.huawei.hwfoundationmodel.trackmodel.IReportDataCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwidauth.datatype.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OperationKey;
import com.huawei.utils.FoundationCommonUtil;
import com.huawei.utils.TreadmillManager;
import defpackage.cpl;
import defpackage.cre;
import defpackage.dmd;
import defpackage.gzr;
import defpackage.gzv;
import defpackage.gzz;
import defpackage.ioi;
import defpackage.iwt;
import defpackage.iwy;
import defpackage.izh;
import defpackage.izt;
import defpackage.jac;
import defpackage.jaf;
import defpackage.jaj;
import defpackage.jbj;
import defpackage.jbw;
import defpackage.lky;
import defpackage.lmf;
import defpackage.lqh;
import defpackage.lqp;
import defpackage.lsy;
import defpackage.ltx;
import defpackage.lua;
import defpackage.mgg;
import defpackage.mgi;
import defpackage.njf;
import defpackage.njw;
import defpackage.njy;
import defpackage.nkb;
import defpackage.nsp;
import defpackage.xjv;
import defpackage.xjx;
import defpackage.xjy;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.StorageResult;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class PluginHealthTrackAdapterImpl implements PluginSportTrackAdapter {
    private static final int DEFAULT_DELAY_INTERVAL = 1000;
    private static final int DEFAULT_POSTURE_DELAY_INTERVAL = 5000;
    private static final int HEART_RATE_DISTRIBUTION_SIZE = 6;
    private static final Object LOCK = new Object();
    private static final int MSG_REPORT_CURRENT_RIDE_POSTURE = 2005;
    private static final int MSG_REPORT_CURRENT_RUN_POSTURE = 2004;
    private static final int MSG_REPORT_CURRENT_STEPS = 2003;
    private static final int MSG_REPORT_STEP_FREQUENCY = 2002;
    private static final int MSG_STEP_FREQUENCY_TIMER = 2001;
    private static final int OVER_TIME_INTERVAL = 30000;
    private static final int OVER_TIME_MSG = 2;
    private static final int SUCCESS = 1;
    private static final int SYNC_CLOUD_MSG = 1;
    private static final String TAG = "Track_PluginHealthTrackAdapterImpl";
    private static int sCurrentSteps = -1;
    private static PluginHealthTrackAdapterImpl sInstance;
    private Context mContext;
    private ExtendHandler mExtendHandler;
    private HealthOpenSDK mHealthOpenSdk;
    private HeartZoneConf mHeartZoneConfigInfo;
    private b mSimpleStepFrequency;
    private int mStepGetTimes;
    private TreadmillManager mTreadmillManager;
    private xjy mTreadmillStepPointData;
    private UserProfileMgrApi mUserProfileMgrApi;
    private IHeartRateCallback mHeartRateCallback = null;
    private IStepRateCallback mStepRateCallback = null;
    private ITreadmillStyleCallback mTreadmillStyleCallback = null;
    private IRunningPostureCallback mRunningPostureCallback = null;
    private IReportDataCallback mReportDataCallback = null;
    private IRidePostureDataCallback mRidePostureCallback = null;
    private String mProductId = null;
    private String mUniqueId = null;
    private final AtomicReference<IRealStepCallback> mRealStepCallback = new AtomicReference<>();
    private final AtomicReference<IRealStepCallback> mCurrentStepCallback = new AtomicReference<>();
    private List<Integer> mRidePostureDataSuccessList = null;
    private boolean mIsSportResumed = true;
    private boolean mIsScreenOn = true;
    private volatile gzv mRunningPostureTemp = new gzv();
    private volatile gzr mRidePostureTemp = new gzr();
    private final HiSubscribeListener mRidePostureSubscribeListener = new HiSubscribeListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.3
        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            if (njy.b(list)) {
                LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "regRidePostureSubscribeListener success");
                if (PluginHealthTrackAdapterImpl.this.mRidePostureDataSuccessList == null) {
                    PluginHealthTrackAdapterImpl.this.mRidePostureDataSuccessList = new ArrayList();
                }
                if (list != null) {
                    PluginHealthTrackAdapterImpl.this.mRidePostureDataSuccessList.addAll(list);
                }
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            if (hiHealthData == null) {
                LogUtil.e(PluginHealthTrackAdapterImpl.TAG, "onChange ridePostureData HiHealthData is null!");
                return;
            }
            LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "ride newValue=", hiHealthData.toString());
            PluginHealthTrackAdapterImpl.this.mRidePostureTemp.c(hiHealthData.getEndTime());
            PluginHealthTrackAdapterImpl.this.mRidePostureTemp.c(hiHealthData.getSubType(), hiHealthData.getValue());
        }
    };
    private List<Integer> mRunningPostureSuccessList = null;
    private final HiSubscribeListener mRunningPostureSubscribeListener = new HiSubscribeListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.15
        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            if (njy.b(list)) {
                LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "regRunningPostureListener success");
                if (PluginHealthTrackAdapterImpl.this.mRunningPostureSuccessList == null) {
                    PluginHealthTrackAdapterImpl.this.mRunningPostureSuccessList = new ArrayList();
                }
                if (list != null) {
                    PluginHealthTrackAdapterImpl.this.mRunningPostureSuccessList.addAll(list);
                }
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            if (hiHealthData == null) {
                LogUtil.e(PluginHealthTrackAdapterImpl.TAG, "onChange runningPosture HiHealthData is null!");
                return;
            }
            LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "newValue=", hiHealthData.toString());
            PluginHealthTrackAdapterImpl.this.mRunningPostureTemp.a(hiHealthData.getEndTime());
            if (DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_STEPS.value() == hiHealthData.getSubType()) {
                if (!PluginHealthTrackAdapterImpl.this.mIsSportResumed) {
                    PluginHealthTrackAdapterImpl.this.mIsSportResumed = true;
                    return;
                }
                iwt.d().e(new njf(j, (int) (hiHealthData.getValue() + ((double) iwt.d().a(10)))), 10);
                return;
            }
            PluginHealthTrackAdapterImpl.this.mRunningPostureTemp.e(hiHealthData.getSubType(), hiHealthData.getValue());
        }
    };
    private List<Integer> mHeartRateSuccessList = null;
    private HiSubscribeListener mSubscribeListener = new HiSubscribeListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.14
        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            if (njy.b(list)) {
                LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "registerHeartRateListener success");
                if (PluginHealthTrackAdapterImpl.this.mHeartRateSuccessList == null) {
                    PluginHealthTrackAdapterImpl.this.mHeartRateSuccessList = new ArrayList();
                }
                if (list != null) {
                    PluginHealthTrackAdapterImpl.this.mHeartRateSuccessList.addAll(list);
                }
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            if (hiHealthData == null) {
                LogUtil.e(PluginHealthTrackAdapterImpl.TAG, "onChange HiHealthData is null!");
                return;
            }
            long startTime = hiHealthData.getStartTime();
            int intValue = hiHealthData.getIntValue();
            LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "time: ", Long.valueOf(startTime), "; heartRate:", Integer.valueOf(intValue));
            if (PluginHealthTrackAdapterImpl.this.mHeartRateCallback != null) {
                PluginHealthTrackAdapterImpl.this.mHeartRateCallback.onChange(intValue, startTime);
            } else {
                ReleaseLogUtil.d(PluginHealthTrackAdapterImpl.TAG, "mHeartRateCallback == null");
            }
        }
    };
    private List<Integer> mReportDataSuccessList = null;
    private HiSubscribeListener mReportDataSubscribeListener = new HiSubscribeListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.11
        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            if (njy.b(list)) {
                LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "registerReportDataListener success");
                if (PluginHealthTrackAdapterImpl.this.mReportDataSuccessList == null) {
                    PluginHealthTrackAdapterImpl.this.mReportDataSuccessList = new ArrayList();
                }
                if (list != null) {
                    PluginHealthTrackAdapterImpl.this.mReportDataSuccessList.addAll(list);
                }
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            if (hiHealthData == null) {
                LogUtil.j(PluginHealthTrackAdapterImpl.TAG, "onChange reportData HiHealthData is null!");
                return;
            }
            njw njwVar = (njw) new Gson().fromJson(CommonUtil.ac(hiHealthData.getMetaData()), njw.class);
            if (njwVar == null) {
                return;
            }
            nsp nspVar = new nsp();
            nspVar.h(njwVar.j());
            nspVar.o(njwVar.b());
            nspVar.r(njwVar.m());
            nspVar.l(njwVar.o());
            nspVar.m(njwVar.n());
            nspVar.d(njwVar.k());
            nspVar.a(njwVar.a());
            nspVar.b(njwVar.d());
            nspVar.f((int) njwVar.f());
            nspVar.i(njwVar.i());
            nspVar.t((int) njwVar.g());
            nspVar.a(njwVar.l());
            nspVar.q(njwVar.e());
            if (PluginHealthTrackAdapterImpl.this.mReportDataCallback != null) {
                PluginHealthTrackAdapterImpl.this.mReportDataCallback.onChange(nspVar);
            }
        }
    };
    private Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.17
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.e(PluginHealthTrackAdapterImpl.TAG, "msg == null");
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                PluginHealthTrackAdapterImpl.this.synCloud();
            } else {
                if (i != 2) {
                    return;
                }
                PluginHealthTrackAdapterImpl.this.reportSaveOverTime((String) message.obj);
            }
        }
    };

    interface IReportTotalSteps {
        void onReport(int i, long j, int i2, int i3, OperationState operationState);
    }

    enum OperationState {
        STATE_PAUSE,
        STATE_RESUME,
        STATE_STOP,
        STATE_REPORT,
        STATE_REPORT_CURRENT_STEP,
        STATE_REAL_TIME
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public int getDefaultDelayInterval() {
        return 1000;
    }

    static /* synthetic */ int access$2108(PluginHealthTrackAdapterImpl pluginHealthTrackAdapterImpl) {
        int i = pluginHealthTrackAdapterImpl.mStepGetTimes;
        pluginHealthTrackAdapterImpl.mStepGetTimes = i + 1;
        return i;
    }

    private PluginHealthTrackAdapterImpl(Context context) {
        if (context == null) {
            LogUtil.j(TAG, "context is null");
            return;
        }
        this.mContext = context.getApplicationContext();
        this.mExtendHandler = HandlerCenter.b(new d(), "Track_Adapter");
        HealthOpenSDK healthOpenSDK = getHealthOpenSDK();
        this.mHealthOpenSdk = healthOpenSDK;
        LogUtil.a(TAG, "initSDK ", healthOpenSDK);
        this.mUserProfileMgrApi = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
    }

    class d implements Handler.Callback {
        private d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 2001:
                    if (PluginHealthTrackAdapterImpl.this.mSimpleStepFrequency == null) {
                        return true;
                    }
                    if (PluginHealthTrackAdapterImpl.this.isNeedAcquireStepFrequency()) {
                        PluginHealthTrackAdapterImpl.this.mSimpleStepFrequency.a();
                        PluginHealthTrackAdapterImpl.this.mExtendHandler.sendEmptyMessage(2001, 1000L);
                        return true;
                    }
                    ReleaseLogUtil.d(PluginHealthTrackAdapterImpl.TAG, "MSG_STEP_FREQUENCY_TIMER sports status stop or idle");
                    PluginHealthTrackAdapterImpl.this.mExtendHandler.removeMessages(2001);
                    return true;
                case 2002:
                    if (PluginHealthTrackAdapterImpl.this.mSimpleStepFrequency == null) {
                        return true;
                    }
                    PluginHealthTrackAdapterImpl.this.mSimpleStepFrequency.b();
                    return true;
                case 2003:
                    if (PluginHealthTrackAdapterImpl.this.mSimpleStepFrequency == null) {
                        return true;
                    }
                    PluginHealthTrackAdapterImpl.this.mSimpleStepFrequency.d();
                    return true;
                case 2004:
                    if (PluginHealthTrackAdapterImpl.this.mRunningPostureCallback != null && iwy.a(PluginHealthTrackAdapterImpl.this.mContext).bc()) {
                        PluginHealthTrackAdapterImpl.this.mRunningPostureCallback.onChange(PluginHealthTrackAdapterImpl.this.mRunningPostureTemp);
                        LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "runningPosture = ", PluginHealthTrackAdapterImpl.this.mRunningPostureTemp.toString());
                        PluginHealthTrackAdapterImpl.this.mRunningPostureTemp = new gzv();
                    }
                    PluginHealthTrackAdapterImpl.this.mExtendHandler.sendEmptyMessage(2004, 5000L);
                    return true;
                case 2005:
                    if (PluginHealthTrackAdapterImpl.this.mRidePostureCallback != null && iwy.a(PluginHealthTrackAdapterImpl.this.mContext).bc()) {
                        LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "ridePostureData onChange");
                        PluginHealthTrackAdapterImpl.this.mRidePostureCallback.onChange(PluginHealthTrackAdapterImpl.this.mRidePostureTemp);
                        PluginHealthTrackAdapterImpl.this.mRidePostureTemp = new gzr();
                    }
                    PluginHealthTrackAdapterImpl.this.mExtendHandler.sendEmptyMessage(2005, 1000L);
                    return true;
                default:
                    return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isNeedAcquireStepFrequency() {
        int iO;
        iwy iwyVarA = iwy.a(BaseApplication.getContext());
        return (iwyVarA == null || (iO = iwyVarA.o()) == 3 || iO == 0) ? false : true;
    }

    class b implements IReportTotalSteps {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f16977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f16978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f16979c;
        private long e;
        private double f;
        private int g;
        private long h;
        private int i;
        private long j;

        b(long j, int i) {
            this.e = j;
            this.i = i;
        }

        public void e() {
            if (c(this.g, 0, this.j, OperationState.STATE_RESUME, this)) {
                this.j = System.currentTimeMillis();
            }
        }

        public void c(int i) {
            this.i = i;
        }

        void c(int i, double d, int i2) {
            this.h = i;
            this.f = d;
            this.f16978b = i2;
        }

        void a() {
            LogUtil.d(PluginHealthTrackAdapterImpl.TAG, "onTick ", Long.valueOf(this.h), " mIsPause ", Boolean.valueOf(this.f16977a));
            if (this.f16977a) {
                return;
            }
            this.h++;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!izh.e()) {
                j();
            }
            if (a(jCurrentTimeMillis)) {
                c(this.g, this.f16978b, this.j, OperationState.STATE_REPORT, this);
                this.j = jCurrentTimeMillis;
                this.f16978b = 0;
                this.h = 0L;
                this.f16979c = 0L;
                this.f = 0.0d;
            }
        }

        private boolean c(int i, int i2, long j, OperationState operationState, IReportTotalSteps iReportTotalSteps) {
            int i3 = this.i;
            if (i3 == 1) {
                if (PluginHealthTrackAdapterImpl.this.mTreadmillManager != null) {
                    PluginHealthTrackAdapterImpl.this.mTreadmillManager.a(new c(i, i2, j, operationState, iReportTotalSteps));
                    return true;
                }
                LogUtil.j(PluginHealthTrackAdapterImpl.TAG, "mTreadmillManager = null");
                return false;
            }
            if (i3 != 2 && i3 != 3) {
                if (PluginHealthTrackAdapterImpl.this.mHealthOpenSdk != null) {
                    PluginHealthTrackAdapterImpl.this.mHealthOpenSdk.a(new c(i, i2, j, operationState, iReportTotalSteps));
                    return true;
                }
                LogUtil.j(PluginHealthTrackAdapterImpl.TAG, "mHealthOpenSdk = null");
                return false;
            }
            d(new c(i, i2, j, operationState, iReportTotalSteps));
            return true;
        }

        public boolean d(IExecuteResult iExecuteResult) {
            LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "getLinkageSteps callback:", iExecuteResult);
            if (iExecuteResult != null) {
                try {
                    int iB = iwt.d().b();
                    LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "getLinkageSteps ", Integer.valueOf(iB));
                    Bundle bundle = new Bundle();
                    bundle.putInt("standSteps", iB);
                    iExecuteResult.onSuccess(bundle);
                } catch (Exception e) {
                    LogUtil.j(PluginHealthTrackAdapterImpl.TAG, "getLinkageSteps ", LogAnonymous.b(e));
                }
            }
            return true;
        }

        private void j() {
            if (!PluginHealthTrackAdapterImpl.this.mIsScreenOn) {
                if (PluginHealthTrackAdapterImpl.this.mStepGetTimes >= 4) {
                    c();
                    return;
                } else {
                    PluginHealthTrackAdapterImpl.access$2108(PluginHealthTrackAdapterImpl.this);
                    return;
                }
            }
            c();
        }

        private void c() {
            c(this.g, this.f16978b, this.j, OperationState.STATE_REAL_TIME, this);
            PluginHealthTrackAdapterImpl.this.mStepGetTimes = 0;
        }

        private boolean a(long j) {
            if (this.f16979c == 0) {
                this.f16979c = j - 1000;
            }
            double d = this.f + ((j - this.f16979c) / 1000.0d);
            this.f = d;
            this.f16979c = j;
            long j2 = this.h;
            long j3 = this.e;
            if (j2 < j3 && d < j3) {
                return false;
            }
            LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "isTimeOver ", Long.valueOf(j2), "  mUsedTime ", Double.valueOf(d));
            return true;
        }

        public void b() {
            c(this.g, this.f16978b, this.j, OperationState.STATE_STOP, this);
        }

        public void d() {
            c(this.g, this.f16978b, this.j, OperationState.STATE_REPORT_CURRENT_STEP, this);
        }

        public void b(boolean z) {
            this.f16977a = z;
            OperationState operationState = OperationState.STATE_PAUSE;
            if (!z) {
                this.f16979c = System.currentTimeMillis();
                operationState = OperationState.STATE_RESUME;
            }
            c(this.g, this.f16978b, this.j, operationState, this);
        }

        private void d(int i) {
            int i2 = i - this.g;
            this.f16978b += i2;
            LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "diff ", Integer.valueOf(i2), " totalStep ", Integer.valueOf(i));
        }

        @Override // com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.IReportTotalSteps
        public void onReport(int i, long j, int i2, int i3, OperationState operationState) {
            if (operationState == OperationState.STATE_RESUME) {
                this.g = i3;
                LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "resume ", Integer.valueOf(i3));
                return;
            }
            if (operationState == OperationState.STATE_PAUSE) {
                d(i3);
                this.g = i3;
                LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "pause ", Integer.valueOf(i3));
            } else if (operationState == OperationState.STATE_STOP) {
                LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "stop ", Integer.valueOf(i3), ", st: ", Integer.valueOf(i), "ct: ", Integer.valueOf(i2));
                b(i3, j, i2, i3);
                PluginHealthTrackAdapterImpl.this.mRealStepCallback.set(null);
            } else if (operationState == OperationState.STATE_REPORT_CURRENT_STEP) {
                LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "report current step ", Integer.valueOf(i3), ", st: ", Integer.valueOf(i), "ct: ", Integer.valueOf(i2));
                d(i, j, i2, i3);
            } else if (operationState == OperationState.STATE_REPORT) {
                LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "report StepFrequency", Integer.valueOf(i3), ", st: ", Integer.valueOf(i), "ct: ", Integer.valueOf(i2));
                b(i, j, i2, i3);
            }
        }

        private void b(int i, long j, int i2, int i3) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.g = i3;
            LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "reportStepFrequencyInter ", Integer.valueOf(i), " start : ", j + " end: ", Long.valueOf(jCurrentTimeMillis));
            IRealStepCallback iRealStepCallback = (IRealStepCallback) PluginHealthTrackAdapterImpl.this.mRealStepCallback.get();
            if (iRealStepCallback != null) {
                iRealStepCallback.onChange((i3 - i) + i2, j, jCurrentTimeMillis);
            }
        }

        private void d(int i, long j, int i2, int i3) {
            int i4 = (i3 - i) + i2;
            long jCurrentTimeMillis = System.currentTimeMillis();
            LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "reportCurrentStepInter ", Integer.valueOf(i4), " start : ", Long.valueOf(j), " end: ", Long.valueOf(jCurrentTimeMillis));
            IRealStepCallback iRealStepCallback = (IRealStepCallback) PluginHealthTrackAdapterImpl.this.mCurrentStepCallback.get();
            if (iRealStepCallback != null) {
                iRealStepCallback.onChange(i4, jCurrentTimeMillis, jCurrentTimeMillis);
            }
        }
    }

    static class c implements IExecuteResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f16980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private OperationState f16981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f16982c;
        private IReportTotalSteps d;
        private int e;

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
        }

        c(int i, int i2, long j, OperationState operationState, IReportTotalSteps iReportTotalSteps) {
            this.f16982c = i;
            this.e = i2;
            this.f16980a = j;
            this.d = iReportTotalSteps;
            this.f16981b = operationState;
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            if (obj instanceof Bundle) {
                int i = ((Bundle) obj).getInt("standSteps", 0);
                int unused = PluginHealthTrackAdapterImpl.sCurrentSteps = i;
                this.d.onReport(this.f16982c, this.f16980a, this.e, i, this.f16981b);
            }
        }
    }

    private HealthOpenSDK getHealthOpenSDK() {
        if (this.mHealthOpenSdk == null) {
            HealthOpenSDK healthOpenSDKB = lky.b();
            this.mHealthOpenSdk = healthOpenSDKB;
            healthOpenSDKB.initSDK(this.mContext, new IExecuteResult() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.18
                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onSuccess(Object obj) {
                    LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "healthOpenSDKCallback initSDK success");
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onFailed(Object obj) {
                    LogUtil.j(PluginHealthTrackAdapterImpl.TAG, "healthOpenSDKCallback : initSDK Failed");
                }

                @Override // com.huawei.hihealth.motion.IExecuteResult
                public void onServiceException(Object obj) {
                    LogUtil.e(PluginHealthTrackAdapterImpl.TAG, "healthOpenSDKCallback : initSDK onServiceException");
                }
            }, "HuaweiHealth");
        }
        return this.mHealthOpenSdk;
    }

    public static PluginHealthTrackAdapterImpl getInstance(Context context) {
        PluginHealthTrackAdapterImpl pluginHealthTrackAdapterImpl;
        synchronized (LOCK) {
            LogUtil.a(TAG, "sInstance is ", sInstance);
            if (sInstance == null) {
                sInstance = new PluginHealthTrackAdapterImpl(context);
            }
            pluginHealthTrackAdapterImpl = sInstance;
        }
        return pluginHealthTrackAdapterImpl;
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void init() {
        this.mRunningPostureTemp = new gzv();
        this.mRidePostureTemp = new gzr();
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public int saveTrackData(MotionPathSimplify motionPathSimplify, MotionPath motionPath) {
        LogUtil.a(TAG, "saveTrackData MotionPath is enter");
        if (motionPathSimplify == null || motionPath == null) {
            LogUtil.j(TAG, "simplifyData or motionPath is null");
            return 5;
        }
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        xjv.c(BaseApplication.getContext(), motionPathSimplify, motionPath, hiDataInsertOption);
        LogUtil.a(TAG, "saveTrackData MotionPath convertInsertOption");
        long jRequestStartTime = motionPathSimplify.requestStartTime();
        HiHealthApi hiHealthApiD = HiHealthManager.d(BaseApplication.getContext());
        final String strValueOf = String.valueOf(jRequestStartTime);
        hiHealthApiD.insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.20
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "saveTrackData MotionPath insertHiHealthData onResult");
                if (i != 0) {
                    LogUtil.e(PluginHealthTrackAdapterImpl.TAG, "saveTrackData MotionPath fail obj = ", obj, ", type = ", Integer.valueOf(i));
                } else {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    PluginHealthTrackAdapterImpl.this.mHandler.sendMessage(messageObtain);
                    LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "saveTrackData MotionPath success obj = ", obj, ", type = ", Integer.valueOf(i));
                }
                PluginHealthTrackAdapterImpl.this.sendBroadcast("com.huawei.bone.action.WORKOUT_CARD_UPDATED_DATA");
                PluginHealthTrackAdapterImpl.this.saveLastSavingSportStartTime(strValueOf);
                LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "save onResult finish");
            }
        });
        LogUtil.a(TAG, "saveTrackData MotionPath insertHiHealthData end");
        return 1;
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public long saveTrackData(MotionPathSimplify motionPathSimplify, String str) {
        iwy iwyVarA = iwy.a(BaseApplication.getContext());
        if (iwyVarA != null) {
            return saveTrackDataDetail(motionPathSimplify, str, iwyVarA.i());
        }
        ReleaseLogUtil.a(TAG, "saveTrackData sportManager is null");
        return 1L;
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public long saveTrackData(MotionPathSimplify motionPathSimplify, String str, nsp nspVar) {
        return saveTrackDataDetail(motionPathSimplify, str, nspVar);
    }

    private long saveTrackDataDetail(MotionPathSimplify motionPathSimplify, String str, nsp nspVar) {
        ReleaseLogUtil.d(TAG, "saveTrackData String is enter");
        if (motionPathSimplify == null) {
            ReleaseLogUtil.e(TAG, "simplifyData is null");
            return 5L;
        }
        RunPlanRecordInfo runPlanRecordInfoE = cre.a().e();
        HashMap map = new HashMap(16);
        if (runPlanRecordInfoE != null) {
            xjx.e(map, runPlanRecordInfoE);
            motionPathSimplify.saveSportData(map);
            motionPathSimplify.addExtendDataMap("eteAlgoKey", String.valueOf(runPlanRecordInfoE.getRunPlanAlgoType()));
            float runPlanRecordInfoRunningAbility = runPlanRecordInfoE.getRunPlanRecordInfoRunningAbility();
            float runPlanRecordInfoRunningAbilityDiff = runPlanRecordInfoE.getRunPlanRecordInfoRunningAbilityDiff();
            if (runPlanRecordInfoRunningAbility < 0.0f) {
                ReleaseLogUtil.d(TAG, "runPlanRecordInfoRunningAbility is invalid_value");
            } else {
                motionPathSimplify.addExtendDataMap("runningAbility", String.valueOf(runPlanRecordInfoRunningAbility));
                motionPathSimplify.addExtendDataMap("runningAbilityDiff", String.valueOf(runPlanRecordInfoRunningAbilityDiff));
            }
            int runPlanRecordInfoAerobicLoadPeak = runPlanRecordInfoE.getRunPlanRecordInfoAerobicLoadPeak();
            int runPlanRecordInfoAnaerobicLoadPeak = runPlanRecordInfoE.getRunPlanRecordInfoAnaerobicLoadPeak();
            int runPlanRecordInfoLoadPeakLevel = runPlanRecordInfoE.getRunPlanRecordInfoLoadPeakLevel();
            if (runPlanRecordInfoAerobicLoadPeak != -1) {
                motionPathSimplify.addExtendDataMap("aerobicLoadPeak", String.valueOf(runPlanRecordInfoAerobicLoadPeak));
            }
            if (runPlanRecordInfoAnaerobicLoadPeak != -1) {
                motionPathSimplify.addExtendDataMap("anaerobicLoadPeak", String.valueOf(runPlanRecordInfoAnaerobicLoadPeak));
            }
            if (runPlanRecordInfoLoadPeakLevel != -1) {
                motionPathSimplify.addExtendDataMap("loadPeakLevel", String.valueOf(runPlanRecordInfoLoadPeakLevel));
            }
            ReleaseLogUtil.d(TAG, "save ete result to track sportData finish");
        } else {
            ReleaseLogUtil.e(TAG, "info is null");
            xjx.a(map, motionPathSimplify, nspVar);
            motionPathSimplify.saveSportData(map);
            if (nspVar != null) {
                motionPathSimplify.addExtendDataMap("eteAlgoKey", String.valueOf(nspVar.y()));
            }
            ReleaseLogUtil.d(TAG, "save realTime ete result to track sportData finish");
        }
        MotionPathSimplify motionPathSimplifyE = jac.e(this.mContext);
        if (motionPathSimplifyE != null) {
            motionPathSimplifyE.saveSportData(map);
            ReleaseLogUtil.d(TAG, "SIMPLE_MOTION_FILE_NAME save: ", Boolean.valueOf(jaf.c(this.mContext, motionPathSimplifyE, "simplemotion.txt")), " temp: ", Boolean.valueOf(jaf.c(this.mContext, motionPathSimplifyE, "simplemotion_temp.txt")));
        }
        saveTrackDataToOdmf(motionPathSimplify, str);
        insertTrackData(motionPathSimplify, str);
        return 1L;
    }

    private void insertTrackData(MotionPathSimplify motionPathSimplify, String str) {
        boolean zD = jaf.d(BaseApplication.getContext(), "simplemotion.txt", "simplemotion_back.txt");
        boolean zD2 = jaf.d(BaseApplication.getContext(), str, "motion_path2_back.txt");
        ReleaseLogUtil.d(TAG, "simple data copy result: ", Boolean.valueOf(zD), " motion path data copy result: ", Boolean.valueOf(zD2));
        if (zD && zD2) {
            insertHiHealthData(motionPathSimplify, str, 2);
        } else {
            insertHiHealthData(motionPathSimplify, str, 0);
        }
    }

    private void insertHiHealthData(MotionPathSimplify motionPathSimplify, String str, int i) {
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        xjv.d(BaseApplication.getContext(), motionPathSimplify, str, hiDataInsertOption);
        insertHiHealthData(motionPathSimplify, hiDataInsertOption, i);
    }

    public void saveBackTrackDataToDb(long j) {
        if (!isPathFileExisted(this.mContext, "motion_path2_back.txt")) {
            ReleaseLogUtil.a(TAG, "saveBackTrackDataToDb isMotionPathFileExisted is false ");
            return;
        }
        MotionPathSimplify motionPathSimplifyA = jac.a(BaseApplication.getContext(), "simplemotion_back.txt");
        if (motionPathSimplifyA == null) {
            ReleaseLogUtil.a(TAG, "saveBackTrackDataToDb simplifyData == null");
        } else {
            if (motionPathSimplifyA.requestStartTime() != j) {
                ReleaseLogUtil.a(TAG, "saveBackTrackDataToDb simplifyData time not match:", Long.valueOf(motionPathSimplifyA.requestStartTime()), "--", Long.valueOf(j));
                return;
            }
            ReleaseLogUtil.d(TAG, "saveBackTrackDataToDb time:", Long.valueOf(j));
            insertHiHealthData(motionPathSimplifyA, "motion_path2_back.txt", 3);
            updateUnSavedTrackStartTime(0L);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void saveTrackDataWhenProcess(MotionPathSimplify motionPathSimplify, String str) {
        if (motionPathSimplify == null || TextUtils.isEmpty(str)) {
            LogUtil.e(TAG, "saveTrackDataWhenProcess simplifyData == null || TextUtils.isEmpty(path) ");
            return;
        }
        if (!isPathFileExisted(this.mContext, str)) {
            ReleaseLogUtil.a(TAG, "saveTrackDataWhenProcess isMotionPathFileExisted is false ");
            return;
        }
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        xjv.d(BaseApplication.getContext(), motionPathSimplify, str, hiDataInsertOption);
        saveTrackDataToOdmf(motionPathSimplify, str);
        insertHiHealthData(motionPathSimplify, hiDataInsertOption, 1);
    }

    public static boolean isPathFileExisted(Context context, String str) {
        if (context == null) {
            LogUtil.a(TAG, "isMotionPathFileExisted ", "context is null");
            return false;
        }
        return new File(context.getFilesDir(), str).exists();
    }

    private void saveTrackDataToOdmf(MotionPathSimplify motionPathSimplify, String str) {
        ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).saveTrackDataToOdmf(getTrackDataToOdmf(motionPathSimplify, str));
        ReleaseLogUtil.d(TAG, "saveTrackData String insertHiHealthData");
    }

    private void insertHiHealthData(final MotionPathSimplify motionPathSimplify, final HiDataInsertOption hiDataInsertOption, final int i) {
        long jRequestStartTime = motionPathSimplify.requestStartTime();
        if (i == 2) {
            updateUnSavedTrackStartTime(motionPathSimplify.requestStartTime());
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        sendOverTimeMsg(String.valueOf(motionPathSimplify.requestTotalTime()));
        HiHealthApi hiHealthApiD = HiHealthManager.d(BaseApplication.getContext());
        final String strValueOf = String.valueOf(jRequestStartTime);
        hiHealthApiD.insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.16
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i2, Object obj) throws Throwable {
                ReleaseLogUtil.d(PluginHealthTrackAdapterImpl.TAG, "saveTrackData String insertHiHealthData onResult");
                PluginHealthTrackAdapterImpl.this.removeOverTimeMsg();
                PluginHealthTrackAdapterImpl.this.reportBackSaveEvent(i, motionPathSimplify, i2);
                if (i2 == 0) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    PluginHealthTrackAdapterImpl.this.mHandler.sendMessage(messageObtain);
                    ReleaseLogUtil.d(PluginHealthTrackAdapterImpl.TAG, "saveTrackData String success errorCode ", Integer.valueOf(i2));
                    if (i == 2) {
                        PluginHealthTrackAdapterImpl.this.updateUnSavedTrackStartTime(0L);
                    }
                    PluginHealthTrackAdapterImpl.writeTrackTimeToList(motionPathSimplify);
                } else {
                    LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "saveTrackData String fail object = ", obj);
                    ReleaseLogUtil.e(PluginHealthTrackAdapterImpl.TAG, "saveTrackData String fail errorCode ", Integer.valueOf(i2));
                    PluginHealthTrackAdapterImpl.this.reportSaveEvent(SystemClock.elapsedRealtime() - jElapsedRealtime, i2, motionPathSimplify, i);
                    LogUtil.b(PluginHealthTrackAdapterImpl.TAG, "ErrorType: Failed To insertTrackData, biKey:", OperationKey.HEALTH_APP_HEALTH_EXCEPTION_2129027.value());
                    if (i2 == 3) {
                        List<HiHealthData> datas = hiDataInsertOption.getDatas();
                        if (njy.c(datas, 0) && datas.get(0) != null) {
                            LogUtil.j(PluginHealthTrackAdapterImpl.TAG, "saveTrackData String fail fuzzyDevice ", cpl.a(datas.get(0).getDeviceUuid()));
                        }
                    }
                }
                PluginHealthTrackAdapterImpl.this.sendBroadcast("com.huawei.bone.action.WORKOUT_CARD_UPDATED_DATA");
                PluginHealthTrackAdapterImpl.this.saveLastSavingSportStartTime(strValueOf);
                ReleaseLogUtil.d(PluginHealthTrackAdapterImpl.TAG, "save onResult finish");
            }
        });
        ReleaseLogUtil.d(TAG, "saveTrackData String insertHiHealthData end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateUnSavedTrackStartTime(long j) {
        lua.a(Integer.toString(20002), "last_unsaved_track", j);
        ReleaseLogUtil.d(TAG, "unsaved track time: ", Long.valueOf(j));
    }

    private void sendOverTimeMsg(String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        messageObtain.obj = str;
        this.mHandler.sendEmptyMessageDelayed(2, 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOverTimeMsg() {
        this.mHandler.removeMessages(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportBackSaveEvent(int i, MotionPathSimplify motionPathSimplify, int i2) {
        if (i == 3) {
            jaj.b(motionPathSimplify, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportSaveEvent(long j, int i, MotionPathSimplify motionPathSimplify, int i2) {
        jaj.e(j, i, motionPathSimplify, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportSaveOverTime(String str) {
        jaj.d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeTrackTimeToList(MotionPathSimplify motionPathSimplify) throws Throwable {
        if (motionPathSimplify == null) {
            LogUtil.j(TAG, "writeTrackTimeToList pathSimplify is null");
            return;
        }
        if (motionPathSimplify.requestTrackType() != 1) {
            LogUtil.j(TAG, "writeTrackTimeToList requestTrackType not auto type");
            return;
        }
        HashMap map = new HashMap(16);
        map.put(Long.valueOf(motionPathSimplify.requestStartTime()), Long.valueOf(motionPathSimplify.requestEndTime()));
        ltx.e(BaseApplication.getContext(), map, KeyValDbManager.d(BaseApplication.getContext()).c("user_id"), new StorageDataCallback() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.19
            @Override // com.huawei.hwdataaccessmodel.utils.StorageDataCallback
            public void onProcessed(StorageResult storageResult) {
                if (storageResult != null) {
                    LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "writeTrackTimeToList result:", Integer.valueOf(storageResult.b()));
                }
            }
        });
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "SPORT_CARD_RED_DOT_FOR_AUTO_TRACK", String.valueOf(true), new StorageParams());
    }

    public String getTrackDataToOdmf(MotionPathSimplify motionPathSimplify, String str) {
        if (motionPathSimplify == null) {
            LogUtil.j(TAG, "simplifyData is null");
            return null;
        }
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        xjv.d(BaseApplication.getContext(), motionPathSimplify, str, hiDataInsertOption);
        List<HiHealthData> datas = hiDataInsertOption.getDatas();
        int iRequestSportType = motionPathSimplify.requestSportType();
        String strL = HiDateUtil.l(datas.get(0).getStartTime());
        String deviceUuid = datas.get(0).getDeviceUuid();
        long jRequestTotalTime = motionPathSimplify.requestTotalTime() / 1000;
        double dCeil = Math.ceil(((double) motionPathSimplify.requestTotalCalories()) / 1000.0d);
        String sportStartGps = getSportStartGps();
        String sportSpeedDistribution = getSportSpeedDistribution(datas);
        String heartDistribution = getHeartDistribution(jac.b(this.mContext, str), (int) jRequestTotalTime, motionPathSimplify.getExtendDataString("isTrustHeartRate"));
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("SportType", iRequestSportType);
            jSONObject.put("SportStartTime", strL);
            jSONObject.put(DeviceInfo.TAG_DEVICE_ID, deviceUuid);
            jSONObject.put("SportStartGPS", sportStartGps);
            jSONObject.put("SportDuration", jRequestTotalTime);
            jSONObject.put("HeartDistribution", heartDistribution);
            jSONObject.put("SportSpeedDistribution", sportSpeedDistribution);
            jSONObject.put("HeatQuantity", dCeil);
            return jSONObject.toString();
        } catch (JSONException e2) {
            LogUtil.e(TAG, LogAnonymous.b(e2));
            return null;
        }
    }

    private String getHeartDistribution(MotionPath motionPath, int i, String str) {
        LogUtil.a(TAG, "getHeartDistribution enter ");
        JSONArray jSONArray = new JSONArray();
        for (int i2 = 0; i2 < 6; i2++) {
            jSONArray.put(0);
        }
        if (motionPath != null) {
            ArrayList<HeartRateData> arrayListRequestHeartRateList = motionPath.requestHeartRateList();
            if (arrayListRequestHeartRateList.size() > 0) {
                int[] iArrE = gzz.e(arrayListRequestHeartRateList, 100, i, str, this.mUserProfileMgrApi.getLocalUserInfo(), 0);
                int i3 = iArrE[0];
                int i4 = iArrE[1];
                int i5 = iArrE[2];
                int i6 = iArrE[3];
                int i7 = iArrE[4];
                int i8 = i3 + i4 + i5 + i6 + i7;
                if (i8 >= i) {
                    i = i8;
                }
                if (i == 0) {
                    return "";
                }
                JSONArray jSONArray2 = new JSONArray();
                int i9 = (i6 * 100) / i;
                jSONArray2.put(i9);
                int i10 = (i5 * 100) / i;
                jSONArray2.put(i10);
                int i11 = (i4 * 100) / i;
                jSONArray2.put(i11);
                int i12 = (i3 * 100) / i;
                jSONArray2.put(i12);
                jSONArray2.put(((((100 - i12) - i11) - i10) - i9) - ((i7 * 100) / i));
                return jSONArray2.toString();
            }
            LogUtil.j(TAG, "getHeartDistribution mHeartRateList = null ");
        }
        return jSONArray.toString();
    }

    private String getSportSpeedDistribution(List<HiHealthData> list) {
        LogUtil.a(TAG, "getSportSpeedDistribution enter");
        int[] iArr = {0, 0, 0, 0, 0, 0};
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(list.get(0).getMetaData()).get("paceMap").toString());
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next instanceof String) {
                    double d2 = jSONObject.getDouble(next);
                    if (d2 < 300.0d) {
                        iArr[0] = iArr[0] + 1;
                    } else if (d2 < 360.0d) {
                        iArr[1] = iArr[1] + 1;
                    } else if (d2 < 420.0d) {
                        iArr[2] = iArr[2] + 1;
                    } else if (d2 < 480.0d) {
                        iArr[3] = iArr[3] + 1;
                    } else if (d2 < 540.0d) {
                        iArr[4] = iArr[4] + 1;
                    } else {
                        iArr[5] = iArr[5] + 1;
                    }
                }
            }
        } catch (JSONException e2) {
            LogUtil.e(TAG, LogAnonymous.b(e2));
        }
        jSONArray.put(iArr[0]);
        jSONArray.put(iArr[1]);
        jSONArray.put(iArr[2]);
        jSONArray.put(iArr[3]);
        jSONArray.put(iArr[4]);
        jSONArray.put(iArr[5]);
        return jSONArray.toString();
    }

    private String getSportStartGps() {
        LogUtil.a(TAG, "getSportStartGps enter");
        MotionPath motionPathA = jac.a(this.mContext);
        if (motionPathA != null) {
            Map<Long, double[]> mapRequestLbsDataMap = motionPathA.requestLbsDataMap();
            if (mapRequestLbsDataMap == null || mapRequestLbsDataMap.isEmpty()) {
                LogUtil.j(TAG, "getSportStartGps No GPS");
            } else {
                double[] dArr = mapRequestLbsDataMap.get(0L);
                if (dArr == null || dArr.length < 2) {
                    LogUtil.a(TAG, "getSportStartGps No locationArray");
                    return null;
                }
                double d2 = dArr[0];
                double d3 = dArr[1];
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(String.valueOf(d3));
                jSONArray.put(String.valueOf(d2));
                return jSONArray.toString();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveLastSavingSportStartTime(String str) {
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20002), "save_DB_End", str, null);
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void saveTrackPointData(List<jbw> list, int i) {
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(xjv.b(BaseApplication.getContext(), list, i), new HiDataOperateListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.4
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i2, Object obj) {
                if (i2 == 0) {
                    ReleaseLogUtil.d(PluginHealthTrackAdapterImpl.TAG, "saveTrackPointData success obj = ", obj, ",type = ", Integer.valueOf(i2));
                } else {
                    ReleaseLogUtil.a(PluginHealthTrackAdapterImpl.TAG, "saveTrackPointData fail obj = ", obj, ",type = ", Integer.valueOf(i2));
                }
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void insertIntensityData(List<jbj> list) {
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(xjv.e(BaseApplication.getContext(), list), new HiDataOperateListener() { // from class: llb
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                PluginHealthTrackAdapterImpl.lambda$insertIntensityData$0(i, obj);
            }
        });
    }

    public static /* synthetic */ void lambda$insertIntensityData$0(int i, Object obj) {
        if (obj != null) {
            LogUtil.a(TAG, "InsertCallBack errorCode = ", Integer.valueOf(i));
        } else {
            LogUtil.j(TAG, "InsertCallBack errorCode = ", Integer.valueOf(i), " obj == null ");
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void startStepPoint() {
        if (this.mTreadmillStepPointData == null) {
            xjy xjyVar = new xjy();
            this.mTreadmillStepPointData = xjyVar;
            xjyVar.c(this.mContext, System.currentTimeMillis());
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void stopStepPoint() {
        xjy xjyVar = this.mTreadmillStepPointData;
        if (xjyVar != null) {
            xjyVar.b(System.currentTimeMillis());
            this.mTreadmillStepPointData = null;
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void updateStepPoint(int i, long j) {
        xjy xjyVar = this.mTreadmillStepPointData;
        if (xjyVar != null) {
            xjyVar.b(j, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void synCloud() {
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(xjv.b(), null);
        LogUtil.a(TAG, "saveTrackData success synCloud begin...");
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public boolean regHeartRateListener(IHeartRateCallback iHeartRateCallback, int i) {
        HiHealthManager.d(this.mContext).subscribeHiHealthData(13, this.mSubscribeListener);
        this.mHeartRateCallback = iHeartRateCallback;
        return true;
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void unregHeartRateListener() {
        List<Integer> list = this.mHeartRateSuccessList;
        if (list == null || list.isEmpty()) {
            return;
        }
        LogUtil.a(TAG, "unregHeartRateListener");
        HiHealthManager.d(this.mContext).unSubscribeHiHealthData(this.mHeartRateSuccessList, new HiUnSubscribeListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.1
            @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
            public void onResult(boolean z) {
                LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "unregHeartRateListener isSuccess = ", Boolean.valueOf(z));
                PluginHealthTrackAdapterImpl.this.mHeartRateCallback = null;
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public boolean regStepRateListener(IStepRateCallback iStepRateCallback, int i) {
        boolean zA;
        HealthOpenSDK healthOpenSDK = this.mHealthOpenSdk;
        if (healthOpenSDK != null) {
            zA = healthOpenSDK.a(new RealStepCallback() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.2
                @Override // com.huawei.hihealth.motion.RealStepCallback
                public void onReport(int i2, int i3) {
                    if (PluginHealthTrackAdapterImpl.this.mStepRateCallback != null) {
                        PluginHealthTrackAdapterImpl.this.mStepRateCallback.report(i2, i3);
                    }
                }
            }, i);
        } else {
            LogUtil.e(TAG, "mHealthOpenSdk is null");
            zA = false;
        }
        if (zA) {
            this.mStepRateCallback = iStepRateCallback;
            LogUtil.a(TAG, "regStepRateListener success");
            return zA;
        }
        LogUtil.j(TAG, "regStepRateListener failed");
        return zA;
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void regStepRateListener(final IStepRateCallback iStepRateCallback, final int i, int i2) {
        LogUtil.a(TAG, "regStepRateListener stepType is ", Integer.valueOf(i2));
        if (i2 == 1) {
            if (this.mTreadmillManager != null) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: lle
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f40407c.m1400x8ffbcc08(i, iStepRateCallback);
                    }
                });
                return;
            } else {
                LogUtil.e(TAG, "mTreadmillManager is null");
                return;
            }
        }
        if (regStepRateListener(iStepRateCallback, i)) {
            return;
        }
        ReleaseLogUtil.e(TAG, "regStepRateListener failed");
    }

    /* JADX INFO: renamed from: lambda$regStepRateListener$1$com-huawei-hwadpaterhealthmgr-PluginHealthTrackAdapterImpl, reason: not valid java name */
    public /* synthetic */ void m1400x8ffbcc08(int i, IStepRateCallback iStepRateCallback) {
        if (!this.mTreadmillManager.c(new RealStepCallback() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.5
            @Override // com.huawei.hihealth.motion.RealStepCallback
            public void onReport(int i2, int i3) {
                if (PluginHealthTrackAdapterImpl.this.mStepRateCallback != null) {
                    PluginHealthTrackAdapterImpl.this.mStepRateCallback.report(i2, i3);
                }
            }
        }, i)) {
            ReleaseLogUtil.e(TAG, "new regStepRateListener failed");
        } else {
            this.mStepRateCallback = iStepRateCallback;
            LogUtil.a(TAG, "new regStepRateListener success");
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void unregStepRateListener() {
        HealthOpenSDK healthOpenSDK;
        if (this.mStepRateCallback != null && (healthOpenSDK = this.mHealthOpenSdk) != null) {
            healthOpenSDK.e();
        } else {
            LogUtil.j(TAG, "unregStepRateListener mStepRateCallback is null");
        }
        this.mStepRateCallback = null;
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void unregStepRateListener(int i) {
        TreadmillManager treadmillManager;
        LogUtil.j(TAG, "unregStepRateListener stepType is ", Integer.valueOf(i));
        if (i == 1) {
            if (this.mStepRateCallback != null && (treadmillManager = this.mTreadmillManager) != null) {
                treadmillManager.b();
            } else {
                LogUtil.j(TAG, "unregStepRateListener mStepRateCallback is null");
            }
            this.mStepRateCallback = null;
            return;
        }
        unregStepRateListener();
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void startHeartDeviceMeasure() {
        LogUtil.a(TAG, "start measure!");
        dmd.b().init(this.mContext);
        dmd.b().e(HealthDevice.HealthDeviceKind.HDK_HEART_RATE, new e());
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void stopHeartDeviceMeasure() {
        if (this.mProductId != null) {
            dmd.b().e(this.mProductId, this.mUniqueId);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void getStepRateList(final long j, final long j2, final Handler handler) {
        if (dealInvalid(j, handler)) {
            return;
        }
        this.mHealthOpenSdk.e(new IFlushResult() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.7
            @Override // com.huawei.hihealth.motion.IFlushResult
            public void onSuccess(Bundle bundle) {
                LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "flushCacheToDB onSuccess");
                e();
            }

            @Override // com.huawei.hihealth.motion.IFlushResult
            public void onFailed(Bundle bundle) {
                LogUtil.e(PluginHealthTrackAdapterImpl.TAG, "flushCacheToDB onFailed");
                e();
            }

            @Override // com.huawei.hihealth.motion.IFlushResult
            public void onServiceException(Bundle bundle) {
                LogUtil.d(PluginHealthTrackAdapterImpl.TAG, "flushCacheToDB onServiceException");
                e();
            }

            private void e() {
                HiDataReadOption hiDataReadOption = new HiDataReadOption();
                hiDataReadOption.setTimeInterval(HiDateUtil.e(j), HiDateUtil.e(j2 + 60000));
                hiDataReadOption.setType(new int[]{2});
                hiDataReadOption.setDeviceUuid(FoundationCommonUtil.getAndroidId(PluginHealthTrackAdapterImpl.this.mContext));
                hiDataReadOption.setReadType(2);
                HiHealthManager.d(PluginHealthTrackAdapterImpl.this.mContext).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.7.3
                    @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                    public void onResultIntent(int i, Object obj, int i2, int i3) {
                    }

                    @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                    public void onResult(Object obj, int i, int i2) {
                        if (obj == null) {
                            LogUtil.e(PluginHealthTrackAdapterImpl.TAG, "readHiHealthData onResult data==null");
                            d(null);
                        } else if (obj instanceof SparseArray) {
                            d(PluginHealthTrackAdapterImpl.this.getStepRateDataList((SparseArray) obj));
                        }
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void d(ArrayList<StepRateData> arrayList) {
                Message messageObtainMessage = handler.obtainMessage(101, 0, 0, arrayList);
                handler.removeMessages(messageObtainMessage.what);
                handler.sendMessage(messageObtainMessage);
            }
        });
    }

    private boolean dealInvalid(long j, Handler handler) {
        if (this.mHealthOpenSdk == null) {
            LogUtil.e(TAG, "get-s getStepRateList mHealthOpenSdk = null!");
            return true;
        }
        if (j == 0) {
            LogUtil.a(TAG, "get-s flushCacheToDB one min time:", Long.valueOf(System.currentTimeMillis()));
            this.mHealthOpenSdk.e((IFlushResult) null);
            return true;
        }
        LogUtil.a(TAG, "get-s flushCacheToDB sport end time:", Long.valueOf(System.currentTimeMillis()));
        handler.sendMessageDelayed(handler.obtainMessage(101, 0, 0, null), 5000L);
        return false;
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void registerRealStepListener(IRealStepCallback iRealStepCallback, long j) {
        LogUtil.a(TAG, "registerRealStepListener");
        startSimpleStepFrequency(iRealStepCallback, j, 0);
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void recoveryStep(int i, double d2, int i2) {
        b bVar = this.mSimpleStepFrequency;
        if (bVar != null) {
            bVar.c(i, d2, i2);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void registerRealStepListener(IRealStepCallback iRealStepCallback, long j, int i) {
        LogUtil.a(TAG, "registerRealStepListener");
        setCurrentSteps(-1);
        startSimpleStepFrequency(iRealStepCallback, j, i);
    }

    private void startSimpleStepFrequency(IRealStepCallback iRealStepCallback, long j, int i) {
        this.mRealStepCallback.set(iRealStepCallback);
        b bVar = new b(j, i);
        this.mSimpleStepFrequency = bVar;
        bVar.e();
        if (this.mExtendHandler == null) {
            this.mExtendHandler = HandlerCenter.b(new d(), "Track_Adapter");
        }
        this.mExtendHandler.removeMessages(2001);
        this.mExtendHandler.sendEmptyMessage(2001, 1000L);
    }

    private static void setCurrentSteps(int i) {
        sCurrentSteps = i;
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void setStepType(int i) {
        this.mSimpleStepFrequency.c(i);
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void unRegisterRealStepCallback() {
        LogUtil.a(TAG, "unRegisterRealStepCallback");
        ExtendHandler extendHandler = this.mExtendHandler;
        if (extendHandler != null) {
            extendHandler.removeMessages(2001);
            this.mExtendHandler.removeMessages(2003);
            this.mExtendHandler.sendEmptyMessage(2002);
        }
        this.mCurrentStepCallback.set(null);
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void reportCurrentStepCallback(IRealStepCallback iRealStepCallback) {
        LogUtil.a(TAG, "reportCurrentStepCallback");
        this.mCurrentStepCallback.set(iRealStepCallback);
        ExtendHandler extendHandler = this.mExtendHandler;
        if (extendHandler != null) {
            extendHandler.sendEmptyMessage(2003);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void pauseOrResumeStepRateRecord(boolean z) {
        LogUtil.a(TAG, "pauseOrResumeStepRateRecord ", Boolean.valueOf(z));
        b bVar = this.mSimpleStepFrequency;
        if (bVar != null) {
            if (z) {
                this.mIsSportResumed = false;
            }
            bVar.b(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendBroadcast(String str) {
        LogUtil.a(TAG, "sendBroadcast enter");
        Intent intent = new Intent();
        intent.setAction(str);
        if (LocalBroadcastManager.getInstance() != null) {
            LogUtil.a(TAG, "sendBroadcast start");
            LocalBroadcastManager.getInstance().sendBroadcast(intent);
        }
    }

    class e implements MeasureResult.MeasureResultListener {
        private e() {
        }

        @Override // com.huawei.health.device.model.MeasureResult.MeasureResultListener
        public void onMeasureFailed(MeasureResult.MeasureErrorCode measureErrorCode) {
            LogUtil.j(PluginHealthTrackAdapterImpl.TAG, "onMeasureCompleted");
        }

        @Override // com.huawei.health.device.model.MeasureResult.MeasureResultListener
        public void onMeasureDevice(String str, String str2, boolean z) {
            LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "onMeasureDevice productId is ", str);
            PluginHealthTrackAdapterImpl.this.mProductId = str;
            PluginHealthTrackAdapterImpl.this.mUniqueId = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<StepRateData> getStepRateDataList(SparseArray<Object> sparseArray) {
        if (sparseArray == null || sparseArray.size() <= 0) {
            LogUtil.e(TAG, "getStepRateDataList data is null!");
            return null;
        }
        Object obj = sparseArray.get(2);
        if (!njy.b(obj, HiHealthData.class)) {
            LogUtil.e(TAG, "isListTypeMatch data is wrong!");
            return null;
        }
        ArrayList<StepRateData> arrayList = new ArrayList<>(16);
        for (HiHealthData hiHealthData : (List) obj) {
            StepRateData stepRateData = new StepRateData();
            stepRateData.saveTime(hiHealthData.getStartTime());
            stepRateData.saveStepRate(hiHealthData.getIntValue());
            arrayList.add(stepRateData);
        }
        return arrayList;
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void startTickTrackDog() {
        this.mHealthOpenSdk.e(true);
        this.mHealthOpenSdk.b();
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void stopTickTrackDog() {
        this.mHealthOpenSdk.e(false);
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void tickTrackDog() {
        this.mHealthOpenSdk.b();
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public boolean isWarningEnable() {
        HeartZoneConf heartZoneConfJ = nkb.d().j();
        this.mHeartZoneConfigInfo = heartZoneConfJ;
        if (heartZoneConfJ != null) {
            return heartZoneConfJ.isWarningEnble();
        }
        return true;
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public int getWarningLimitHeartRate() {
        HeartZoneConf heartZoneConfJ = nkb.d().j();
        this.mHeartZoneConfigInfo = heartZoneConfJ;
        if (heartZoneConfJ != null) {
            return heartZoneConfJ.getWarningLimitHR();
        }
        return 176;
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public boolean isPrivacyOfSportDataSwitchOn() {
        String strC = ioi.d().c(3);
        LogUtil.a(TAG, "isPrivacyOfSportDataSwitchOn = ", strC);
        if (TextUtils.isEmpty(strC)) {
            LogUtil.a(TAG, "isPrivacyOfSportDataSwitchOn not set");
            return false;
        }
        return "true".equals(strC);
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void setPrivacyOfSportDataSwitch(boolean z) {
        LogUtil.a(TAG, "setPrivacyOfSportDataSwitch set to ", Boolean.valueOf(z));
        setPersonalPrivacySettingValue(3, z);
    }

    public void setPersonalPrivacySettingValue(int i, boolean z) {
        LogUtil.a(TAG, "setPersonalPrivacySettingValue... privacyId = ", Integer.valueOf(i), ", isOpen = ", Boolean.valueOf(z));
        ioi.d().e(i, z, String.valueOf(i), new IBaseResponseCallback() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                if (i2 == 0) {
                    LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "onResponse setUserPrivacy success ");
                } else {
                    LogUtil.e(PluginHealthTrackAdapterImpl.TAG, "onResponse setUserPrivacy failure");
                }
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public boolean isFitnessCourseDisplay() {
        return Utils.j();
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public boolean registerReportDataListener(IReportDataCallback iReportDataCallback) {
        HiHealthManager.d(this.mContext).subscribeHiHealthData(17, this.mReportDataSubscribeListener);
        this.mReportDataCallback = iReportDataCallback;
        return true;
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void unRegisterReportDataListener() {
        List<Integer> list = this.mReportDataSuccessList;
        if (list == null || list.isEmpty()) {
            return;
        }
        LogUtil.a(TAG, "unRegisterReportDataListener");
        HiHealthManager.d(this.mContext).unSubscribeHiHealthData(this.mReportDataSuccessList, new HiUnSubscribeListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.10
            @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
            public void onResult(boolean z) {
                LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "unregReportDataListener isSuccess = ", Boolean.valueOf(z));
                PluginHealthTrackAdapterImpl.this.mReportDataCallback = null;
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public boolean registerRidePosture(IRidePostureDataCallback iRidePostureDataCallback) {
        HiHealthManager.d(this.mContext).subscribeHiHealthData(Arrays.asList(15, Integer.valueOf(DicDataTypeUtil.DataType.REALTIME_SPORT_DATA.value())), this.mRidePostureSubscribeListener);
        this.mRidePostureCallback = iRidePostureDataCallback;
        this.mRidePostureTemp = new gzr();
        if (this.mExtendHandler == null) {
            this.mExtendHandler = HandlerCenter.b(new d(), "Track_Adapter");
        }
        this.mExtendHandler.removeMessages(2005);
        this.mExtendHandler.sendEmptyMessage(2005);
        return true;
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void unregisterRidePosture() {
        List<Integer> list = this.mRidePostureDataSuccessList;
        if (list != null && !list.isEmpty()) {
            LogUtil.a(TAG, "unregisterRidePosture");
            HiHealthManager.d(this.mContext).unSubscribeHiHealthData(this.mRidePostureDataSuccessList, new HiUnSubscribeListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.6
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public void onResult(boolean z) {
                    LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "unregReportDataListener isSuccess = ", Boolean.valueOf(z));
                    PluginHealthTrackAdapterImpl.this.mRidePostureCallback = null;
                }
            });
        }
        ExtendHandler extendHandler = this.mExtendHandler;
        if (extendHandler != null) {
            extendHandler.removeMessages(2005);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public boolean regRunningPostureListener(IRunningPostureCallback iRunningPostureCallback) {
        HiHealthManager.d(this.mContext).subscribeHiHealthData(Arrays.asList(15, 300001), this.mRunningPostureSubscribeListener);
        if (this.mExtendHandler == null) {
            this.mExtendHandler = HandlerCenter.b(new d(), "Track_Adapter");
        }
        this.mExtendHandler.removeMessages(2004);
        this.mExtendHandler.sendEmptyMessage(2004, 5000L);
        this.mRunningPostureCallback = iRunningPostureCallback;
        return true;
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void unregRunningPostureListener() {
        List<Integer> list = this.mRunningPostureSuccessList;
        if (list != null && !list.isEmpty()) {
            LogUtil.a(TAG, "unregRunningPostureListener");
            HiHealthManager.d(this.mContext).unSubscribeHiHealthData(this.mRunningPostureSuccessList, new HiUnSubscribeListener() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.8
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public void onResult(boolean z) {
                    LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "unregRunningPostureListener isSuccess = ", Boolean.valueOf(z));
                    PluginHealthTrackAdapterImpl.this.mRunningPostureCallback = null;
                }
            });
        }
        ExtendHandler extendHandler = this.mExtendHandler;
        if (extendHandler != null) {
            extendHandler.removeMessages(2004);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void startTreadmillStep() {
        if (this.mTreadmillManager == null && this.mContext != null) {
            this.mTreadmillManager = new TreadmillManager(this.mContext);
        }
        startStepPoint();
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void stopTreadmillStep() {
        TreadmillManager treadmillManager = this.mTreadmillManager;
        if (treadmillManager != null) {
            treadmillManager.c();
            this.mTreadmillManager = null;
        }
        stopStepPoint();
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void registerFreeIndoorRunningStyle(ITreadmillStyleCallback iTreadmillStyleCallback) {
        TreadmillManager treadmillManager = this.mTreadmillManager;
        if (treadmillManager != null) {
            treadmillManager.e(new com.huawei.exercise.modle.ITreadmillStyleCallback() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.13
                @Override // com.huawei.exercise.modle.ITreadmillStyleCallback
                public void onTreadmillStyleChange(int i, long j) {
                    LogUtil.a(PluginHealthTrackAdapterImpl.TAG, "registerFreeIndoorRunningStyle onTreadmillStyleChange mTreadmillManager is ", Integer.valueOf(i));
                    if (PluginHealthTrackAdapterImpl.this.mTreadmillStyleCallback != null) {
                        PluginHealthTrackAdapterImpl.this.mTreadmillStyleCallback.onTreadmillStyleChange(i, j);
                    } else {
                        LogUtil.e(PluginHealthTrackAdapterImpl.TAG, "registerFreeIndoorRunningStyle mTreadmillStyleCallback is null ");
                    }
                }
            });
            this.mTreadmillStyleCallback = iTreadmillStyleCallback;
        } else {
            LogUtil.e(TAG, "registerFreeIndoorRunningStyle mTreadmillManager is null");
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void unregisterFreeIndoorRunningStyle() {
        TreadmillManager treadmillManager = this.mTreadmillManager;
        if (treadmillManager != null) {
            treadmillManager.a();
        } else {
            LogUtil.e(TAG, "unregisterFreeIndoorRunningStyle mTreadmillManager is null");
        }
        this.mTreadmillStyleCallback = null;
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public int getCurrentSteps() {
        return sCurrentSteps;
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public boolean isWearDeviceConnected() {
        com.huawei.health.devicemgr.business.entity.DeviceInfo deviceInfoC = mgg.c(TAG);
        return deviceInfoC != null && deviceInfoC.getDeviceConnectState() == 2;
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void readLastVo2max(IBaseResponseCallback iBaseResponseCallback) {
        nkb.d().e(iBaseResponseCallback);
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void requestLocalPressure(final LocalPressureCallback localPressureCallback, final int i) {
        lsy.a(new Runnable() { // from class: com.huawei.hwadpaterhealthmgr.PluginHealthTrackAdapterImpl.12
            @Override // java.lang.Runnable
            public void run() {
                String strValue;
                if (i != 0) {
                    strValue = "";
                } else {
                    strValue = AnalyticsValue.HEALTH_QUARE_LOCAL_PRESSURE_1040060.value();
                    PluginHealthTrackAdapterImpl.this.setAltitudeBi("local_pressure", strValue);
                }
                if (localPressureCallback != null) {
                    if (CommonUtil.ab(PluginHealthTrackAdapterImpl.this.mContext)) {
                        Location locationE = izt.e(PluginHealthTrackAdapterImpl.this.mContext);
                        if (locationE == null) {
                            localPressureCallback.onFailed("location is null");
                            return;
                        }
                        lqp lqpVarE = lqh.d().e(CommonUtil.e(locationE.getLatitude(), 3), CommonUtil.e(locationE.getLongitude(), 3));
                        if (lqpVarE.d() != null && !lqpVarE.d().isEmpty()) {
                            lmf.d().c(BaseApplication.getContext(), strValue, lqpVarE.d(), 0);
                        }
                        localPressureCallback.onUpdateLocalPressure(lqpVarE.a());
                        if (Math.abs(lqpVarE.a()) > 1.0E-6d) {
                            PluginHealthTrackAdapterImpl.this.setAltitudeBi("get_pressure_success", AnalyticsValue.HEALTH_QUARE_GET_PRESSURE_SUCCESS_1040061.value());
                            return;
                        }
                        return;
                    }
                    localPressureCallback.onFailed("Network is Disconnect");
                    return;
                }
                LogUtil.j(PluginHealthTrackAdapterImpl.TAG, "callback is null");
            }
        });
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public com.huawei.health.devicemgr.business.entity.DeviceInfo getCurrentAw70DeviceInfo() {
        return mgi.c(TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltitudeBi(String str, String str2) {
        HashMap map = new HashMap(1);
        map.put("query", str);
        lmf.d().c(BaseApplication.getContext(), str2, map, 0);
    }

    @Override // com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter
    public void setStepInterval(boolean z) {
        this.mIsScreenOn = z;
    }
}
