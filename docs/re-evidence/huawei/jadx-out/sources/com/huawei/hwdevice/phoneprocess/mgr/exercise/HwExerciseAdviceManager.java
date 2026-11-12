package com.huawei.hwdevice.phoneprocess.mgr.exercise;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.callback.FitnessRecordCallback;
import com.huawei.callback.TransferFileCallback;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.ICallbackInterface;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.plan.association.SportEventAssociator;
import com.huawei.health.suggestion.SuggestionAidl;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.ads.dynamic.a;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.CommonSectionInfo;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.CommonSectionList;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.MotionPath;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.MotionPathSimplify;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.PaceIndexStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.RunPlanParameter;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.datatype.WorkoutDataStruct;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.multisync.HwExerciseAdviceAw70Manager;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseDeviceUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseRunPlanUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwExerciseUtils;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.TriathlonUtils;
import com.huawei.hwdevice.phoneprocess.mgr.hwsyncmgr.periodrri.HwDevicePeriodRriFileManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import defpackage.eel;
import defpackage.gdv;
import defpackage.ggm;
import defpackage.ilf;
import defpackage.lng;
import defpackage.lsb;
import defpackage.lsl;
import defpackage.lua;
import defpackage.mie;
import defpackage.mit;
import defpackage.miy;
import defpackage.mkf;
import defpackage.mlp;
import defpackage.mof;
import defpackage.njy;
import defpackage.npr;
import defpackage.nvx;
import defpackage.peh;
import defpackage.xjt;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.EnvironmentInfo;
import health.compact.a.HiDateUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import ohos.ace.plugin.taskmanagerplugin.EventType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class HwExerciseAdviceManager extends HwBaseManager implements ParserInterface {
    private static final int CADENCE_DENOMINATOR = 2;
    private static final int ERROR = -1;
    private static final int NUMBER_OF_TRACKS = 4;
    private static final String RECORD_ID_KEY = "id";
    private static final String RUN_PLAN_RECORD_COUNT = "run_plan_record_count";
    private static final int SLEEP_TIME = 100;
    private static final String TAG = "HwExerciseAdviceManager";
    private static final String TAG_RELEASE = "BTSYNC_HwExerciseAdviceManager";
    private static final String WORKOUT_RECORD_COUNT = "workout_record_count";
    private static HwExerciseAdviceManager sInstance;
    private IBaseResponseCallback getAdviceParamCallback;
    private long mALLSyncEndTime;
    private long mALLSyncStartTime;
    private BroadcastReceiver mConnectStateChangedReceiver;
    private Context mContext;
    private long mFirstSyncStartTime;
    private FitnessRecordCallback mFitnessDataCallback;
    private int mGpsTimeIndex;
    private boolean mIsBeingSavedNewData;
    private boolean mIsLastSaved;
    private boolean mIsLastSync;
    private int mIsSendSyncMessage;
    private boolean mIsSyncSuccess;
    private HwExerciseParams mParam;
    private String mPlanSha;
    private BroadcastReceiver mReloadDictReceiver;
    private int mRunPlayCount;
    private SuggestionAidl mSuggestionAidl;
    private BroadcastReceiver mSyncWorkoutBroadcastReceiver;
    private int mWorkoutCount;
    private int mWorkoutRunPlayFailCount;
    CopyOnWriteArrayList<ggm> runRecordList;
    private static final Object LOCK_OBJECT = new Object();
    private static final Object SYNC_LOCK = new Object();
    private static mof sGpsFileUtil = new mof();
    private static String sDevicePlanSha = "";

    static /* synthetic */ SportEventAssociator.c lambda$updateSportEventSharedPreference$1(SportEventAssociator.c cVar) {
        return cVar;
    }

    static /* synthetic */ SportEventAssociator.c lambda$updateSportEventSharedPreference$2(SportEventAssociator.c cVar, SportEventAssociator.c cVar2) {
        return cVar;
    }

    static /* synthetic */ int access$1808(HwExerciseAdviceManager hwExerciseAdviceManager) {
        int i = hwExerciseAdviceManager.mWorkoutRunPlayFailCount;
        hwExerciseAdviceManager.mWorkoutRunPlayFailCount = i + 1;
        return i;
    }

    static /* synthetic */ int access$912(HwExerciseAdviceManager hwExerciseAdviceManager, int i) {
        int i2 = hwExerciseAdviceManager.mIsSendSyncMessage + i;
        hwExerciseAdviceManager.mIsSendSyncMessage = i2;
        return i2;
    }

    private HwExerciseAdviceManager(Context context) {
        super(context);
        this.mParam = HwExerciseParams.getInstance();
        this.mPlanSha = "0";
        this.mIsSyncSuccess = false;
        this.mIsLastSaved = false;
        this.mIsBeingSavedNewData = false;
        this.mIsLastSync = false;
        this.mIsSendSyncMessage = 0;
        this.mGpsTimeIndex = 3;
        this.mRunPlayCount = 0;
        this.mWorkoutRunPlayFailCount = 0;
        this.mWorkoutCount = 0;
        this.mFirstSyncStartTime = 0L;
        this.mALLSyncEndTime = 0L;
        this.mALLSyncStartTime = 0L;
        this.runRecordList = new CopyOnWriteArrayList<>();
        this.mConnectStateChangedReceiver = new BroadcastReceiver() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent == null || !"com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                    return;
                }
                LogUtil.a(HwExerciseAdviceManager.TAG, "mConnectStateChangedReceiver() action: ", intent.getAction());
                Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                if (!(parcelableExtra instanceof DeviceInfo)) {
                    LogUtil.j(HwExerciseAdviceManager.TAG, "parcelableExtra not inatnceOf DeviceInfo ");
                    return;
                }
                DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
                if (!HwExerciseAdviceManager.this.isDeviceSupportCurFunction(deviceInfo)) {
                    ReleaseLogUtil.e(HwExerciseAdviceManager.TAG_RELEASE, "This device does not have the correspond capability.");
                } else {
                    ReleaseLogUtil.d(HwExerciseAdviceManager.TAG_RELEASE, "mConnectStateChangedReceiver() status: ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
                    HwExerciseAdviceManager.this.handleConnectStateChanged(deviceInfo);
                }
            }
        };
        this.mReloadDictReceiver = new BroadcastReceiver() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.2
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if ("com.huawei.health.action.DATA_DICTIONARY_SHOULD_RELOAD".equals(intent.getAction())) {
                    HwExerciseAdviceManager.this.initDicData();
                }
            }
        };
        this.getAdviceParamCallback = new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i != 100000 || !(obj instanceof RunPlanParameter)) {
                    LogUtil.j(HwExerciseAdviceManager.TAG, "getAdviceParam fail ", Integer.valueOf(i));
                    return;
                }
                RunPlanParameter runPlanParameter = (RunPlanParameter) obj;
                HwExerciseAdviceManager.this.mParam.setSyncPlanSize(new int[]{runPlanParameter.getRunPlanSyncSize() / 256, runPlanParameter.getRunPlanSyncSize() % 256});
                String unused = HwExerciseAdviceManager.sDevicePlanSha = runPlanParameter.getRunPlanSign();
                int i2 = HwExerciseAdviceManager.this.mParam.getSyncPlanSize()[0];
                int i3 = HwExerciseAdviceManager.this.mParam.getSyncPlanSize()[1];
                LogUtil.a(HwExerciseAdviceManager.TAG, "syncsize[0]: ", Integer.valueOf(i2), " syncsize[1]: ", Integer.valueOf(i3), " deviceSHAValue: ", HwExerciseAdviceManager.sDevicePlanSha);
            }
        };
        this.mParam.setTriathlonUtils(TriathlonUtils.getInstance());
        this.mContext = context;
        loadPlugin();
        initDeviceInfo();
        this.mSyncWorkoutBroadcastReceiver = new SyncWorkoutBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.FITNESS_DATA_DETAIL_SYNC");
        intentFilter.addAction("com.huawei.phoneservice.sync_workout_broadcast_action");
        ReleaseLogUtil.d(TAG_RELEASE, "HwExerciseAdviceManager to register broadcast");
        BroadcastManagerUtil.d(this.mContext, this.mSyncWorkoutBroadcastReceiver, intentFilter, LocalBroadcast.f36595c, null);
        initDicData();
        BroadcastReceiver broadcastReceiver = this.mReloadDictReceiver;
        if (broadcastReceiver != null) {
            BroadcastManagerUtil.b(this.mContext, broadcastReceiver, new IntentFilter("com.huawei.health.action.DATA_DICTIONARY_SHOULD_RELOAD"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initDicData() {
        HiHealthDictManager.a(BaseApplication.getContext()).c(true);
    }

    public boolean isIsSyncSuccess() {
        return this.mIsSyncSuccess;
    }

    public void setIsSyncSuccess(boolean z) {
        this.mIsSyncSuccess = z;
    }

    public boolean isIsLastSaved() {
        return this.mIsLastSaved;
    }

    public void setIsLastSaved(boolean z) {
        this.mIsLastSaved = z;
    }

    public void setIsBeingSavedNewData(boolean z) {
        this.mIsBeingSavedNewData = z;
    }

    public int getWorkoutRunPlayFailCount() {
        return this.mWorkoutRunPlayFailCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDeviceSupportCurFunction(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return false;
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), TAG);
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            ReleaseLogUtil.e(TAG_RELEASE, "enter mConnectStateChangedReceiver, deviceCapabilityHashMaps is null or empty");
            return false;
        }
        DeviceCapability deviceCapability = mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
        if (deviceCapability != null && deviceCapability.isSupportExerciseAdvice()) {
            return true;
        }
        ReleaseLogUtil.e(TAG_RELEASE, "device not support exercise advice.");
        return false;
    }

    public void setWorkoutRunPlayFailCount(int i) {
        this.mWorkoutRunPlayFailCount = i;
    }

    public void setSuggestionAidl(IBinder iBinder) {
        if (iBinder != null) {
            this.mSuggestionAidl = SuggestionAidl.Stub.asInterface(iBinder);
        }
        FitnessRecordCallback fitnessRecordCallback = this.mFitnessDataCallback;
        if (fitnessRecordCallback != null) {
            fitnessRecordCallback.postData();
            unregisterFitnessRecordCallback();
        }
    }

    public SuggestionAidl getSuggestionAidl() {
        return this.mSuggestionAidl;
    }

    public void registerFitnessRecordCallback(FitnessRecordCallback fitnessRecordCallback) {
        this.mFitnessDataCallback = fitnessRecordCallback;
    }

    public void unregisterFitnessRecordCallback() {
        this.mFitnessDataCallback = null;
    }

    public void setWorkoutCount(int i) {
        this.mWorkoutCount = i;
    }

    public int getWorkoutCount() {
        return this.mWorkoutCount;
    }

    public void setCallbackInterface(ICallbackInterface iCallbackInterface) {
        if (iCallbackInterface == null) {
            return;
        }
        this.mParam.setCallbackInterface(iCallbackInterface);
    }

    public static HwExerciseAdviceManager getInstance() {
        HwExerciseAdviceManager hwExerciseAdviceManager;
        synchronized (LOCK_OBJECT) {
            if (sInstance == null) {
                sInstance = new HwExerciseAdviceManager(BaseApplication.getContext());
            }
            hwExerciseAdviceManager = sInstance;
        }
        return hwExerciseAdviceManager;
    }

    public void destroy() {
        this.mContext.unregisterReceiver(this.mSyncWorkoutBroadcastReceiver);
        this.mContext.unregisterReceiver(this.mConnectStateChangedReceiver);
        BroadcastReceiver broadcastReceiver = this.mReloadDictReceiver;
        if (broadcastReceiver != null) {
            this.mContext.unregisterReceiver(broadcastReceiver);
        }
        destroyInstance();
    }

    private static void destroyInstance() {
        synchronized (LOCK_OBJECT) {
            sInstance = null;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager$4, reason: invalid class name */
    class AnonymousClass4 implements Runnable {
        AnonymousClass4() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ilf.b().d(new AppBundleLauncher.InstallCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager$4$$ExternalSyntheticLambda0
                @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                public final boolean call(Context context, Intent intent) {
                    return HwExerciseAdviceManager.AnonymousClass4.lambda$run$0(context, intent);
                }
            });
        }

        static /* synthetic */ boolean lambda$run$0(Context context, Intent intent) {
            LogUtil.a(HwExerciseAdviceManager.TAG, "PluginLocationProxy loadPlugin success");
            return false;
        }
    }

    private void loadPlugin() {
        ThreadPoolManager.c().execute(new AnonymousClass4());
    }

    private void initDeviceInfo() {
        ThreadPoolManager.c().a(TAG, new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.5
            @Override // java.lang.Runnable
            public void run() {
                new LastSyncTimestampDb().createDbTable(HwExerciseAdviceManager.getInstance());
            }
        });
        this.mParam.setHwExerciseAdviceManagerHandler(HandlerCenter.b(new HwExerciseManagerHandlerCallback(), TAG));
        String sharedPreference = getSharedPreference(HwExerciseConstants.PLAN_SHA_KEY);
        this.mPlanSha = sharedPreference;
        LogUtil.d(TAG, "initDeviceInfo mPlanSha is ", sharedPreference);
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS");
        BroadcastManagerUtil.c(this.mContext, this.mConnectStateChangedReceiver, intentFilter, LocalBroadcast.f36595c, null);
    }

    /* JADX INFO: loaded from: classes10.dex */
    class HwExerciseManagerHandlerCallback implements Handler.Callback {
        private HwExerciseManagerHandlerCallback() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            ReleaseLogUtil.d(HwExerciseAdviceManager.TAG_RELEASE, "handleMessage message is : ", Integer.valueOf(message.what));
            int i = message.what;
            if (i == 0) {
                HwExerciseAdviceManager.this.notifyDetailSyncComplete(300001, "TIMEOUT");
                HwExerciseAdviceManager.this.sendWorkoutSyncEvent(0);
                return true;
            }
            if (i == 1) {
                HwExerciseAdviceManager.this.btDisconnectMsgProcess();
                return true;
            }
            if (i == 2) {
                HwExerciseAdviceManager.access$912(HwExerciseAdviceManager.this, 1);
                if (HwExerciseAdviceManager.this.mIsSendSyncMessage > 3) {
                    HwExerciseAdviceManager.this.mIsSendSyncMessage = 0;
                } else {
                    HwExerciseAdviceManager.this.sendSyncMessage();
                }
                return true;
            }
            if (i == 3) {
                if (message.obj instanceof JSONObject) {
                    HwExerciseAdviceManager.this.getDeviceRunPlanRecordIdList(0, (JSONObject) message.obj);
                }
                return true;
            }
            if (i == 1001) {
                HwExerciseAdviceManager.this.sendWorkoutSyncEvent(1);
                return true;
            }
            ReleaseLogUtil.e(HwExerciseAdviceManager.TAG_RELEASE, "no support what : ", Integer.valueOf(message.what));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void btDisconnectMsgProcess() {
        if (this.mParam.isGpsEnable()) {
            LogUtil.d(TAG, "unRegisterLocationCallback");
            this.mParam.setIsGpsEnable(false);
        }
        if (!this.mParam.isUsingEte() || this.mParam.getRunPlanExecuteState() == 3) {
            return;
        }
        this.mParam.setIsUsingEte(false);
    }

    public String getCurrentDeviceId() {
        return HwExerciseDeviceUtil.getCurrentDeviceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLastSyncTime() {
        ReleaseLogUtil.d(TAG_RELEASE, "getLastSyncTime enter");
        return new LastSyncTimestampDb().getLastTimestamp(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDetailSyncComplete(int i, String str) {
        HwExerciseRunPlanUtil.notifyDetailSyncComplete(i, str, this);
    }

    private void saveData(int i) {
        boolean zHandleSaveRunPlayRecord;
        boolean zHandleSaveNotRunPlanRecord;
        try {
            if (!HwExerciseUtils.isRunPlanRecord(i, this.mParam.getRunPlanRecord())) {
                zHandleSaveNotRunPlanRecord = HwExerciseRunPlanUtil.handleSaveNotRunPlanRecord(i, false);
                zHandleSaveRunPlayRecord = false;
            } else {
                zHandleSaveRunPlayRecord = HwExerciseRunPlanUtil.handleSaveRunPlayRecord(i, false, this);
                zHandleSaveNotRunPlanRecord = false;
            }
            if (zHandleSaveRunPlayRecord || zHandleSaveNotRunPlanRecord) {
                DeviceDbForHomeCards.updateExerciseInsertTime(this.mParam.getCurrentTime());
                ReleaseLogUtil.d(TAG_RELEASE, "updateExerciseInsertTime: ", Long.valueOf(this.mParam.getCurrentTime()));
            }
        } catch (JSONException unused) {
            ReleaseLogUtil.a(TAG_RELEASE, "saveXx json Exception.");
        } catch (Exception e) {
            ReleaseLogUtil.a(TAG_RELEASE, "save data error:", ExceptionUtils.c(e));
        }
    }

    public void saveTriathlonToHiHealthData(List<TriathlonUtils.TriathlonCache> list, IBaseResponseCallback iBaseResponseCallback) {
        if (list == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "saveTriathlonToHiHealthData triathlonCacheList is null");
            return;
        }
        ReleaseLogUtil.d(TAG_RELEASE, "triathlonCacheList.size() is ", Integer.valueOf(list.size()));
        int size = list.size();
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            TriathlonUtils.TriathlonCache triathlonCache = list.get(i3);
            MotionPathSimplify simplifyData = triathlonCache.getSimplifyData();
            MotionPath motionPath = triathlonCache.getMotionPath();
            if (i3 == list.size() - 1) {
                LogUtil.d(TAG, "save father: ", Integer.valueOf(i2), "mapType: ", Integer.valueOf(i));
                simplifyData.saveAbnormalTrack(i2);
                simplifyData.setMapType(i);
            } else {
                int iRequestAbnormalTrack = simplifyData.requestAbnormalTrack();
                if (iRequestAbnormalTrack != 0 && iRequestAbnormalTrack != i2) {
                    LogUtil.d(TAG, "fatherAbnormalTrack: ", Integer.valueOf(iRequestAbnormalTrack));
                    i2 = iRequestAbnormalTrack;
                }
                int mapType = simplifyData.getMapType();
                if (mapType != -1) {
                    i = mapType;
                }
            }
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            HwExerciseUtils.convertHealthTrackDataToHiData(simplifyData, motionPath, hiDataInsertOption);
            if (i3 == size - 1) {
                saveDataToHiHealthData(hiDataInsertOption, simplifyData, iBaseResponseCallback, triathlonCache.getWorkId(), motionPath);
            } else {
                saveDataToHiHealthData(hiDataInsertOption, simplifyData, null, triathlonCache.getWorkId(), motionPath);
            }
        }
    }

    private void checkWheelChairDataType(HiDataInsertOption hiDataInsertOption) {
        if (hiDataInsertOption == null || njy.e(hiDataInsertOption.getDatas())) {
            return;
        }
        for (HiHealthData hiHealthData : hiDataInsertOption.getDatas()) {
            if (hiHealthData.getType() == 30001 && hiHealthData.getSubType() == 226) {
                Map map = (Map) HiJsonUtil.d(hiHealthData.getMetaData(), Map.class);
                Map map2 = (Map) map.get(BleConstants.EXTEND_TRACK_DATA_MAP);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    String str = (String) entry.getKey();
                    if ("totalPushes".equals(str) || "avgPushFrequency".equals(str) || "avgPushDistance".equals(str)) {
                        linkedHashMap.put(str, Integer.valueOf(CommonUtils.j((String) entry.getValue())));
                    } else {
                        linkedHashMap.put(str, entry.getValue());
                    }
                }
                map.put(BleConstants.EXTEND_TRACK_DATA_MAP, linkedHashMap);
                hiHealthData.setMetaData(HiJsonUtil.d(map));
            }
        }
    }

    public void saveDataToHiHealthData(HiDataInsertOption hiDataInsertOption, MotionPathSimplify motionPathSimplify, IBaseResponseCallback iBaseResponseCallback, int i, MotionPath motionPath) {
        if (hiDataInsertOption == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "saveDataToHiHealthData option is null");
            xjt.p("saveDataToHiHealthData option is null");
        } else {
            checkWheelChairDataType(hiDataInsertOption);
            ReleaseLogUtil.d(TAG_RELEASE, "saveDataToHiHealthData enter.");
            HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new AnonymousClass6(i, motionPathSimplify, motionPath, iBaseResponseCallback));
        }
    }

    /* JADX INFO: renamed from: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager$6, reason: invalid class name */
    class AnonymousClass6 implements HiDataOperateListener {
        final /* synthetic */ IBaseResponseCallback val$callback;
        final /* synthetic */ MotionPath val$motionPath;
        final /* synthetic */ MotionPathSimplify val$pathSimplify;
        final /* synthetic */ int val$workId;

        AnonymousClass6(int i, MotionPathSimplify motionPathSimplify, MotionPath motionPath, IBaseResponseCallback iBaseResponseCallback) {
            this.val$workId = i;
            this.val$pathSimplify = motionPathSimplify;
            this.val$motionPath = motionPath;
            this.val$callback = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
        public void onResult(int i, Object obj) {
            ReleaseLogUtil.d(HwExerciseAdviceManager.TAG_RELEASE, "save exercise errorCode: ", Integer.valueOf(i), ", workId:", Integer.valueOf(this.val$workId), " mIsLastSync:", Boolean.valueOf(HwExerciseAdviceManager.this.mIsLastSync));
            if (this.val$pathSimplify.getSportType() == 258 || this.val$pathSimplify.getSportType() == 264) {
                boolean zIsTriathlonData = TriathlonUtils.getInstance().isTriathlonData(this.val$pathSimplify);
                LogUtil.a(HwExerciseAdviceManager.TAG, "insertHiHealthData isTriathlonData: ", Boolean.valueOf(zIsTriathlonData));
                if (!zIsTriathlonData) {
                    HwExerciseAdviceManager.this.runRecordList.add(new ggm(this.val$pathSimplify.getStartTime(), this.val$pathSimplify.getEndTime(), this.val$pathSimplify.getSportType(), HiDateUtil.c((String) null), 30001, this.val$pathSimplify.getTotalDistance()));
                }
            }
            HwExerciseAdviceManager.this.updateWorkoutStatus(i, this.val$workId, this.val$pathSimplify, this.val$motionPath, this.val$callback);
            HwExerciseAdviceManager.this.mParam.setSaveDataItemNumber(HwExerciseAdviceManager.this.mParam.getSaveDataItemNumber() - 1);
            HwExerciseAdviceManager.this.mParam.setWorkoutDataNumber(HwExerciseAdviceManager.this.mParam.getWorkoutDataNumber() + 1);
            if (HwExerciseAdviceManager.this.mParam.getSaveDataItemNumber() == 0) {
                ReleaseLogUtil.d(HwExerciseAdviceManager.TAG_RELEASE, "saveTrackData finished broardCast to health");
                Intent intent = new Intent(HwExerciseConstants.WORKOUT_RECORD_SAVE_FINISH);
                intent.setPackage(HwExerciseAdviceManager.this.mContext.getPackageName());
                HwExerciseAdviceManager.this.mContext.sendBroadcast(intent, LocalBroadcast.f36595c);
                HwExerciseUtils.triggerHiHealthCloutSync();
                ThreadPoolManager threadPoolManagerC = ThreadPoolManager.c();
                final MotionPathSimplify motionPathSimplify = this.val$pathSimplify;
                threadPoolManagerC.execute(new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager$6$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        MotionPathSimplify motionPathSimplify2 = motionPathSimplify;
                        gdv.e(motionPathSimplify2.getStartTime(), motionPathSimplify2.getEndTime());
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateWorkoutStatus(int i, int i2, MotionPathSimplify motionPathSimplify, MotionPath motionPath, IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "updateWorkoutStatus error code:", Integer.valueOf(i));
        WorkoutSyncSuccessDetailData workoutSyncSuccessDetailData = new WorkoutSyncSuccessDetailData(i2, motionPathSimplify.getStartTime(), motionPathSimplify.getEndTime());
        WorkoutSyncSuccessDetailData successRecord = HwExerciseAdviceManagerHelper.getInstance().getSuccessRecord(workoutSyncSuccessDetailData);
        if (successRecord != null) {
            workoutSyncSuccessDetailData = successRecord;
        }
        if (i == 0) {
            Map<Long, double[]> lbsDataMap = motionPath.getLbsDataMap();
            if (motionPathSimplify.getWorkoutTrajectories() == 1 && (lbsDataMap == null || lbsDataMap.isEmpty())) {
                this.mWorkoutRunPlayFailCount++;
                workoutSyncSuccessDetailData.updateTrackDataParameter(true, false);
                ReleaseLogUtil.e(TAG_RELEASE, "updateWorkoutStatus gps data sync fail");
                if (CommonUtil.ap()) {
                    xjt.p("updateWorkoutStatus gps data sync fail");
                }
            } else if ((motionPathSimplify.getDivingEvent() == 1 && motionPath.getDivingIncidentData() == null) || njy.b(motionPathSimplify.getDictTypeList())) {
                this.mWorkoutRunPlayFailCount++;
                workoutSyncSuccessDetailData.updateTrackDataParameter(true, false);
            } else {
                workoutSyncSuccessDetailData.updateTrackDataParameter(true, true);
                saveSuccessDeal(motionPathSimplify);
            }
        } else {
            xjt.p("updateWorkoutStatus fail errorCode :" + i);
            this.mWorkoutRunPlayFailCount = this.mWorkoutRunPlayFailCount + 1;
            workoutSyncSuccessDetailData.updateTrackDataParameter(true, false);
        }
        HwExerciseAdviceManagerHelper.getInstance().saveSuccessUpdateSuccessList(workoutSyncSuccessDetailData);
        changeRecordSyncMark();
        sendNotify(motionPathSimplify, iBaseResponseCallback, i);
    }

    private void saveSyncData(int i, long j, int i2, int i3, long j2) {
        WorkoutSyncSuccessDetailData workoutSyncSuccessDetailData = new WorkoutSyncSuccessDetailData(i, j, j2);
        WorkoutSyncSuccessDetailData successRecord = HwExerciseAdviceManagerHelper.getInstance().getSuccessRecord(workoutSyncSuccessDetailData);
        if (successRecord != null) {
            workoutSyncSuccessDetailData = successRecord;
        }
        if (i2 == 5 || i2 == 6) {
            workoutSyncSuccessDetailData.updateClassDataParameter(true, true);
            workoutSyncSuccessDetailData.updateTrackDataParameter(true, true);
        } else if (i3 == 20) {
            workoutSyncSuccessDetailData.updateClassDataParameter(true, true);
        } else {
            workoutSyncSuccessDetailData.updateTrackDataParameter(true, true);
        }
        HwExerciseAdviceManagerHelper.getInstance().saveSuccessUpdateSuccessList(workoutSyncSuccessDetailData);
    }

    private void sendNotify(MotionPathSimplify motionPathSimplify, IBaseResponseCallback iBaseResponseCallback, int i) {
        ReleaseLogUtil.d(TAG_RELEASE, "sendNotify callback");
        int iB = CommonUtil.b(motionPathSimplify.requestExtendDataMap().get(HwExerciseConstants.JSON_NAME_RECORD_FLAG), 10);
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "sendNotify callback is null.");
            return;
        }
        if (iB == 5 || iB == 6) {
            if (motionPathSimplify.isPackSaveSuccess()) {
                iBaseResponseCallback.a(i, null);
                return;
            }
            return;
        }
        iBaseResponseCallback.a(i, null);
    }

    private void updateRunPlaySyncCompleteTime() {
        try {
            if (this.mRunPlayCount == this.mParam.getRunPlanRecord().getInt(RUN_PLAN_RECORD_COUNT)) {
                notifyDetailSyncComplete(0, "getRunPlanCompleted");
            }
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "updateRunPlaySyncCompleteTime JSONException:", ExceptionUtils.c(e));
        }
    }

    private boolean isTriathlonByJson(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        return (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("triathlonStructList")) == null || jSONArrayOptJSONArray.length() == 0) ? false : true;
    }

    public void updateWorkoutSyncCompleteTime() {
        try {
            JSONObject workoutRecord = this.mParam.getWorkoutRecord();
            if (workoutRecord == null) {
                ReleaseLogUtil.e(TAG_RELEASE, "updateWorkoutSyncCompleteTime getWorkoutRecord is null.");
                xjt.p("updateWorkoutSyncCompleteTime getWorkoutRecord is null.");
                return;
            }
            int i = workoutRecord.getInt(WORKOUT_RECORD_COUNT);
            ReleaseLogUtil.d(TAG_RELEASE, "updateWorkoutSyncCompleteTime mWorkoutCount:", Integer.valueOf(this.mWorkoutCount), "workoutRecordCount:", Integer.valueOf(i), " mIsLastSync:", Boolean.valueOf(this.mIsLastSync));
            if (this.mWorkoutCount == i && this.mIsLastSync) {
                ReleaseLogUtil.d(TAG_RELEASE, "updateWorkoutSyncCompleteTime save Time：", Long.valueOf(this.mALLSyncEndTime));
                setSharedPreference(getCurrentDeviceId() + this.mParam.getUserId(), String.valueOf(this.mALLSyncEndTime), null);
            }
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "updateWorkoutSyncCompleteTime JSONException:", ExceptionUtils.c(e));
        }
    }

    public void getRunPlanParameter(IBaseResponseCallback iBaseResponseCallback) {
        HwExerciseRunPlanUtil.getRunPlanParameter(iBaseResponseCallback);
    }

    public void setRunPlanForHealth(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        HwExerciseRunPlanUtil.setRunPlanForHealth(jSONObject, iBaseResponseCallback);
    }

    public void setRunPlanReminderSwitch(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        HwExerciseRunPlanUtil.setRunPlanReminderSwitch(jSONObject, iBaseResponseCallback);
    }

    public void getRunPlanRecord(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        HwExerciseRunPlanUtil.getRunPlanRecord(jSONObject, iBaseResponseCallback);
    }

    public void getRunPlanRecordInfo(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) throws JSONException {
        HwExerciseRunPlanUtil.getRunPlanRecordInfo(jSONObject, iBaseResponseCallback);
    }

    public void registerNotificationRunPlanRecordInfoCallbackList(IBaseResponseCallback iBaseResponseCallback) {
        synchronized (HwExerciseRunPlanUtil.getNotificationRunPlanRecordInfoCallbackList()) {
            HwExerciseRunPlanUtil.getNotificationRunPlanRecordInfoCallbackList().add(iBaseResponseCallback);
        }
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) {
        HwExerciseRunPlanUtil.parseResult(deviceInfo, bArr);
    }

    public void sendRunPlanToDevice() {
        if (HwExerciseRunPlanUtil.isSupportExercise()) {
            getRunPlanParameter(this.getAdviceParamCallback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleConnectStateChanged(DeviceInfo deviceInfo) {
        boolean z;
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        if (deviceConnectState == 2) {
            HwExerciseRunPlanUtil.handleDeviceConnected(deviceInfo);
            return;
        }
        if (deviceConnectState == 3) {
            if (!this.mParam.isDetailSyncing() || this.mParam.getCurrentDeviceId().equalsIgnoreCase(deviceInfo.getSecurityDeviceId())) {
                if (isIsSyncSuccess()) {
                    ReleaseLogUtil.d(TAG_RELEASE, "DEVICE_DISCONNECTED notifyMsg");
                    HwExerciseUtils.sendNotifyBySwitch();
                    setIsSyncSuccess(false);
                    z = true;
                } else {
                    z = false;
                }
                if (HwExerciseRunPlanUtil.isSupportExercise(deviceInfo)) {
                    this.mParam.getHwExerciseAdviceManagerHandler().sendEmptyMessage(1, 300000L);
                    this.mParam.getHwExerciseAdviceManagerHandler().sendEmptyMessage(1001, 300000L);
                }
                if (this.mParam.getHwExerciseAdviceManagerHandler() != null) {
                    ReleaseLogUtil.d(TAG_RELEASE, "removeMessages MSG_EXERCISE_ADVICE_SYNC_DETAIL_TIMEOUT");
                    this.mParam.getHwExerciseAdviceManagerHandler().removeMessages(0);
                    this.mParam.setIsDetailSyncing(false);
                    if (eel.d(deviceInfo.getProductType())) {
                        resetAw70Status(z);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ReleaseLogUtil.e(TAG_RELEASE, "handleConnectStateChanged else");
    }

    private void resetAw70Status(boolean z) {
        HwExerciseAdviceAw70Manager.getInstance(this).setIsDetailSyncing(false);
        if (z || !HwExerciseAdviceAw70Manager.getInstance(this).isAw70SyncSuccess()) {
            return;
        }
        ReleaseLogUtil.d(TAG_RELEASE, "AW70_DEVICE_DISCONNECTED notifyMsg");
        HwExerciseUtils.sendNotifyBySwitch();
        HwExerciseAdviceAw70Manager.getInstance(this).setIsAw70SyncSuccess(false);
    }

    public void syncDeviceWorkoutRecordInfo() {
        if (HwExerciseRunPlanUtil.isSupportExercise()) {
            DeviceInfo currentDeviceInfo = HwExerciseDeviceUtil.getCurrentDeviceInfo();
            if (currentDeviceInfo == null || currentDeviceInfo.getDeviceConnectState() != 2) {
                ReleaseLogUtil.d(TAG_RELEASE, "no device is connected.");
                this.mParam.setIsDetailSyncing(false);
                return;
            }
            synchronized (SYNC_LOCK) {
                if (this.mParam.isDetailSyncing()) {
                    ReleaseLogUtil.d(TAG_RELEASE, "startSyncWorkoutRecordThread is syncing detail, please wait");
                    return;
                }
                this.mParam.setIsDetailSyncing(true);
                this.mIsLastSync = false;
                String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
                this.mParam.setUserId(strC);
                LogUtil.a(TAG, "prepareSyncStartTime userId is null or empty", Boolean.valueOf(StringUtils.g(strC)));
                this.mParam.setCurrentDeviceId(getCurrentDeviceId());
                this.mALLSyncEndTime = System.currentTimeMillis();
                long jPrepareSyncStartTime = prepareSyncStartTime();
                this.mALLSyncStartTime = jPrepareSyncStartTime;
                long j = this.mALLSyncEndTime;
                boolean z = j - jPrepareSyncStartTime < 86400000;
                this.mIsLastSync = z;
                long j2 = z ? j : j - 86400000;
                this.mFirstSyncStartTime = j2;
                ReleaseLogUtil.d(TAG_RELEASE, "startSyncWorkoutRecordThread, mALLSyncStartTime", Long.valueOf(jPrepareSyncStartTime), "mFirstSyncStartTime", Long.valueOf(j2), "mALLSyncEndTime", Long.valueOf(j), "mIsLastSync", Boolean.valueOf(z));
                startSyncWorkoutRecordThread();
            }
        } else {
            HwDevicePeriodRriFileManager.getInstance().getPeriodRriFileFromDevice();
        }
        HwExerciseAdviceAw70Manager.getInstance(this).syncDeviceWorkoutRecordInfo();
    }

    private void startSyncWorkoutRecordThread() {
        ReleaseLogUtil.d(TAG_RELEASE, "start sync exercise data. mIsLastSync:", Boolean.valueOf(this.mIsLastSync));
        mit.b(TAG, new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.7
            @Override // java.lang.Runnable
            public void run() {
                HwExerciseAdviceManager.this.handleSyncWorkoutRecordThread();
            }
        });
    }

    private long prepareSyncStartTime() {
        String userId = this.mParam.getUserId();
        LogUtil.a(TAG, "startSyncWorkoutRecordThread userId is null or empty", Boolean.valueOf(StringUtils.g(userId)));
        String str = getCurrentDeviceId() + userId;
        long jM = CommonUtil.m(this.mContext, getSharedPreference(str));
        ReleaseLogUtil.d(TAG_RELEASE, "prepareSyncStartTime key:", CommonUtil.n(str), " start time:", Long.valueOf(jM));
        if (jM == 0) {
            jM = getLastSyncTime();
        }
        long j = this.mALLSyncEndTime;
        long j2 = j - jM;
        if (j2 <= HwExerciseConstants.TEN_DAY_SECOND && j2 >= 0) {
            return jM;
        }
        ReleaseLogUtil.d(TAG_RELEASE, "setSyncTime first sync ,time invalid .startTime:", Long.valueOf(this.mALLSyncStartTime));
        return j - HwExerciseConstants.TEN_DAY_SECOND;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSyncWorkoutRecordThread() {
        DeviceInfo currentDeviceInfo = HwExerciseDeviceUtil.getCurrentDeviceInfo();
        if (currentDeviceInfo == null || currentDeviceInfo.getDeviceConnectState() != 2) {
            ReleaseLogUtil.d(TAG_RELEASE, "no device is connected.");
            this.mParam.setIsDetailSyncing(false);
            HwDevicePeriodRriFileManager.getInstance().getPeriodRriFileFromDevice();
            return;
        }
        if (com.huawei.haf.application.BaseApplication.h()) {
            ReleaseLogUtil.d(TAG_RELEASE, "handleSyncWorkoutRecordThread:isRunningForeground ture");
            npr.a(4);
        } else {
            LogUtil.a(TAG, "handleSyncWorkoutRecordThread:isRunningForeground false");
            npr.a(8);
        }
        this.mParam.setWorkoutDataNumber(0);
        this.mParam.setSaveDataItemNumber(0);
        this.mParam.setCurrentTime(this.mIsLastSync ? this.mFirstSyncStartTime : this.mALLSyncEndTime);
        this.mParam.setLastSyncTime(this.mIsLastSync ? this.mALLSyncStartTime : this.mFirstSyncStartTime);
        HwExerciseParams hwExerciseParams = this.mParam;
        hwExerciseParams.setLastSyncTime(hwExerciseParams.getLastSyncTime() - 60000);
        startSyncWorkoutRecord();
    }

    private void startSyncWorkoutRecord() {
        ReleaseLogUtil.d(TAG_RELEASE, "startSyncWorkoutRecord startTime: ", Long.valueOf(this.mParam.getLastSyncTime()), " mCurrentTime: ", Long.valueOf(this.mParam.getCurrentTime()), " mCurrentTime - mLastSyncTime: ", Long.valueOf(this.mParam.getCurrentTime() - this.mParam.getLastSyncTime()), " mIsLastSync:", Boolean.valueOf(this.mIsLastSync));
        this.mParam.getHwExerciseAdviceManagerHandler().sendEmptyMessage(0, 600000L);
        setSuccessRecordData();
        this.mParam.getWorkoutRecordPaceMapIdList().clear();
        this.mParam.getWorkoutRecordPaceMapList().clear();
        this.mParam.getSwimWorkoutRecordSectionMap().clear();
        this.mParam.getWorkoutRecordCommonSectionMap().clear();
        mlp.a().d();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("startTime", this.mParam.getLastSyncTime());
            jSONObject.put("endTime", this.mParam.getCurrentTime());
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleXxxxxx json Exception:", ExceptionUtils.c(e));
        }
        sGpsFileUtil.a();
        getDeviceWorkoutRecordIdList(jSONObject);
    }

    private void getDetailData(int i, int i2) {
        this.mParam.getWorkoutDataList().clear();
        HwExerciseRunPlanUtil.syncWorkoutDetailData(i, this.mParam.getWorkoutRecord());
        if (this.mParam.getWorkoutDataList().size() > 0) {
            getWorkoutDetailData(this.mParam.getWorkoutDataList().get(0), i2);
        } else if (isSupportPace()) {
            getWorkoutRecordPaceMap(i, i2);
        } else {
            getWorkOutDetailFromDevice(i, i2);
        }
    }

    private void getRunPlanDetailData(int i, int i2) {
        this.mParam.getWorkoutDataList().clear();
        syncRunPlanDetailData(i, this.mParam.getRunPlanRecord());
        if (!this.mParam.getWorkoutDataList().isEmpty()) {
            getWorkoutDetailData(this.mParam.getWorkoutDataList().get(0), i2);
        } else if (isSupportPace()) {
            getWorkoutRecordPaceMap(i, i2);
        } else {
            getWorkOutDetailFromDevice(i, i2);
        }
    }

    private int getWorkoutType(int i) {
        try {
            if (this.mParam.getRunPlanRecord() == null) {
                return 1;
            }
            JSONArray jSONArray = this.mParam.getRunPlanRecord().getJSONArray(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_RECORD_STRUCT);
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (((JSONObject) jSONArray.get(i2)).optInt(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_RECORD_ID) == i) {
                    return 2;
                }
            }
            return 1;
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "getWxxxxx json Exception:", ExceptionUtils.c(e));
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getWorkOutDetailFromDevice(final int i, final int i2) {
        this.mParam.getGpsWorkoutMap().clear();
        this.mParam.getGpsWorkoutAndRunPlanTypeMap().clear();
        if (HwExerciseDeviceUtil.getConnectedDeviceType() == 8) {
            ReleaseLogUtil.d(TAG_RELEASE, "metis not need track file workout");
            getOneRecordSuccess(i, i2);
            return;
        }
        if (this.mParam.getWorkoutTrajectories() == 0) {
            ReleaseLogUtil.d(TAG_RELEASE, "getWorkOutDetailFromDevice recordId: ", Integer.valueOf(i), " Info:no gps data.");
            saveData(i);
            HwExerciseParams hwExerciseParams = this.mParam;
            hwExerciseParams.setWorkoutRecordStatisticIndex(hwExerciseParams.getWorkoutRecordStatisticIndex() + 1);
            getDeviceWorkoutRecordStatistic(i2);
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(Integer.valueOf(i));
        int workoutType = getWorkoutType(i);
        setOriginSegInfo(i);
        HwDeviceGpsFileWorkoutManager.getInstance().getWorkoutDetailFromDevice(workoutType, arrayList, new TransferFileCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.8
            @Override // com.huawei.callback.TransferFileCallback
            public void onResponse(int i3, Object obj) {
                HwExerciseAdviceManager.this.handleGetGpsResponse(i3, obj, i, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleGetGpsResponse(final int i, final Object obj, final int i2, final int i3) {
        mit.b(TAG, new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.9
            /* JADX WARN: Code duplicated, block: B:7:0x0030  */
            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                LogUtil.a(HwExerciseAdviceManager.TAG, "data return errorCode: ", Integer.valueOf(i), " objectData: ", obj);
                int i4 = i;
                if (i4 == 10000) {
                    Object obj2 = obj;
                    if (obj2 instanceof Object[]) {
                        HwExerciseAdviceManager.this.handleWorkoutDetailResponseSuccess((Object[]) obj2, i2, i3);
                        z = true;
                    } else {
                        lng.e(i4);
                        LogUtil.j(HwExerciseAdviceManager.TAG, "getWorkOutDetailFromDevice() callback error: ", obj);
                        z = false;
                    }
                } else {
                    lng.e(i4);
                    LogUtil.j(HwExerciseAdviceManager.TAG, "getWorkOutDetailFromDevice() callback error: ", obj);
                    z = false;
                }
                int i5 = i3;
                boolean z2 = (i5 == 0 || i5 == 5) ? z : false;
                HwExerciseAdviceManager.this.mParam.setWorkoutRecordStatisticIndex(HwExerciseAdviceManager.this.mParam.getWorkoutRecordStatisticIndex() + 1);
                if (z2) {
                    HwExerciseAdviceManager.this.getDeviceWorkoutRecordStatistic(i3);
                } else {
                    HwExerciseAdviceManager.access$1808(HwExerciseAdviceManager.this);
                    HwExerciseAdviceManager.this.getDeviceWorkoutRecordStatistic(5);
                }
            }
        });
    }

    private void setOriginSegInfo(int i) {
        String skiOriginSegInfo;
        try {
            JSONObject jSONObject = this.mParam.getWorkoutRecordsStatisticArray().get(i);
            if (jSONObject != null) {
                int i2 = jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE);
                if (i2 != 230 && i2 != 229) {
                    skiOriginSegInfo = "";
                } else {
                    skiOriginSegInfo = getSkiOriginSegInfo();
                }
                if (!TextUtils.isEmpty(skiOriginSegInfo)) {
                    skiOriginSegInfo = "ver00|" + skiOriginSegInfo;
                }
                LogUtil.a(TAG, "setOriginSegInfo workoutType: " + i2 + ", mOriginSegInfo: ", skiOriginSegInfo);
                HwDeviceGpsFileWorkoutManager.getInstance().setOriginSegInfo(skiOriginSegInfo);
            }
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "handleResponseSuccessObject JSONException:", ExceptionUtils.c(e));
        }
    }

    private String getSkiOriginSegInfo() {
        List<List<CommonSectionInfo>> commonRecordStatisticsSectionList = this.mParam.getCommonRecordStatisticsSectionList();
        if (commonRecordStatisticsSectionList.isEmpty()) {
            ReleaseLogUtil.e(TAG_RELEASE, "dealWithPointIndex commonRecordStatisticsSectionList is empty");
            return "";
        }
        ArrayList arrayList = new ArrayList();
        Iterator<List<CommonSectionInfo>> it = commonRecordStatisticsSectionList.iterator();
        while (it.hasNext()) {
            for (CommonSectionInfo commonSectionInfo : it.next()) {
                arrayList.add(Long.valueOf(commonSectionInfo.getSectionStartGpsPointIndex()));
                arrayList.add(Long.valueOf(commonSectionInfo.getSectionEndGpsPointIndex()));
                arrayList.add(Long.valueOf(commonSectionInfo.getSectionCableStartGpsPointIndex()));
                arrayList.add(Long.valueOf(commonSectionInfo.getSectionCableEndGpsPointIndex()));
            }
        }
        return Arrays.toString(arrayList.toArray(new Long[arrayList.size()]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleWorkoutDetailResponseSuccess(Object[] objArr, int i, int i2) {
        Object obj = objArr[0];
        if (obj instanceof Map) {
            Object obj2 = objArr[1];
            if (obj2 instanceof Map) {
                Map<Integer, Map<Long, double[]>> map = (Map) obj;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    int iIntValue = entry.getKey() != null ? ((Integer) entry.getKey()).intValue() : 0;
                    int iIntValue2 = entry.getValue() != null ? ((Integer) entry.getValue()).intValue() : 0;
                    LogUtil.a(TAG, "mGpsWorkoutRecordIdList.get(i): ", Integer.valueOf(iIntValue), " type: ", Integer.valueOf(iIntValue2));
                    this.mParam.getGpsWorkoutAndRunPlanTypeMap().put(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                    this.mParam.getGpsWorkoutMap().put(Integer.valueOf(iIntValue), map.get(Integer.valueOf(iIntValue)));
                    handleResponseSuccessObject(i, i2, objArr[2], map);
                }
            }
        }
    }

    private void handleResponseSuccessObject(int i, int i2, Object obj, Map<Integer, Map<Long, double[]>> map) {
        if (obj instanceof Map) {
            Map<Integer, List<Long>> map2 = (Map) obj;
            HwExerciseUtils.getPacePointForDistance(this.mParam.getWorkoutRecordPaceMapList(), map, map2);
            try {
                JSONObject jSONObject = this.mParam.getWorkoutRecordsStatisticArray().get(i);
                if (jSONObject != null) {
                    int i3 = jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE);
                    if (i3 == 15 || i3 == 16) {
                        fixSkiGpsPointIndex(i, map, map2);
                    }
                    fix5HzGpsPointIndex(i3);
                }
            } catch (JSONException e) {
                ReleaseLogUtil.a(TAG_RELEASE, "handleResponseSuccessObject JSONException:", ExceptionUtils.c(e));
            }
            ReleaseLogUtil.d(TAG_RELEASE, "handleResponseSuccessObject errorCode: ", Integer.valueOf(i2), " recordId: ", Integer.valueOf(i), " errorInfo: get gps ok");
            saveData(i);
        }
    }

    private void fix5HzGpsPointIndex(int i) {
        ReleaseLogUtil.d(TAG_RELEASE, "fix5HzGpsPointIndex enter");
        if (i == 230 || i == 229) {
            fix5HzSkiGpsPointIndex();
        }
    }

    private void fix5HzSkiGpsPointIndex() {
        ReleaseLogUtil.d(TAG_RELEASE, "fix5HzSkiGpsPointIndex enter");
        Map<Integer, Integer> map = HwDeviceGpsFileWorkoutManager.getInstance().getmCorrectedTrackIndexMap();
        if (map == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "dealWithPointIndex correctedTrackIndexMap is empty");
            return;
        }
        List<List<CommonSectionInfo>> commonRecordStatisticsSectionList = this.mParam.getCommonRecordStatisticsSectionList();
        if (commonRecordStatisticsSectionList.isEmpty()) {
            ReleaseLogUtil.e(TAG_RELEASE, "dealWithPointIndex commonRecordStatisticsSectionList is empty");
            return;
        }
        LogUtil.a(TAG, "fix5HzSkiGpsPointIndex before commonRecordStatisticsSectionList:", commonRecordStatisticsSectionList);
        LogUtil.a(TAG, "fix5HzSkiGpsPointIndex map:", map.toString());
        Iterator<List<CommonSectionInfo>> it = commonRecordStatisticsSectionList.iterator();
        while (it.hasNext()) {
            for (CommonSectionInfo commonSectionInfo : it.next()) {
                commonSectionInfo.setSectionStartGpsPointIndex(getCorrectedIndex(commonSectionInfo.getSectionStartGpsPointIndex(), map));
                commonSectionInfo.setSectionEndGpsPointIndex(getCorrectedIndex(commonSectionInfo.getSectionEndGpsPointIndex(), map));
                commonSectionInfo.setSectionCableStartGpsPointIndex(getCorrectedIndex(commonSectionInfo.getSectionCableStartGpsPointIndex(), map));
                commonSectionInfo.setSectionCableEndGpsPointIndex(getCorrectedIndex(commonSectionInfo.getSectionCableEndGpsPointIndex(), map));
            }
        }
        LogUtil.a(TAG, "fix5HzSkiGpsPointIndex after commonRecordStatisticsSectionList:", commonRecordStatisticsSectionList);
    }

    private long getCorrectedIndex(long j, Map<Integer, Integer> map) {
        Integer num = map.get(Integer.valueOf((int) j));
        return num != null ? num.intValue() : j;
    }

    private void fixSkiGpsPointIndex(int i, Map<Integer, Map<Long, double[]>> map, Map<Integer, List<Long>> map2) {
        ReleaseLogUtil.d(TAG_RELEASE, "fixSkiGpsPointIndex enter");
        if (map == null || map.isEmpty()) {
            ReleaseLogUtil.e(TAG_RELEASE, "fixSkiGpsPointIndex gpsInfo is null or empty");
            return;
        }
        if (map2 == null || map2.isEmpty()) {
            ReleaseLogUtil.e(TAG_RELEASE, "fixSkiGpsPointIndex pointTimeMap is null or empty");
            return;
        }
        List<List<CommonSectionInfo>> commonRecordStatisticsSectionList = this.mParam.getCommonRecordStatisticsSectionList();
        if (commonRecordStatisticsSectionList.isEmpty()) {
            ReleaseLogUtil.e(TAG_RELEASE, "dealWithPointIndex commonRecordStatisticsSectionList is empty");
            return;
        }
        LogUtil.a(TAG, "fixSkiGpsPointIndex pointTimeMap:", map2, " gpsInfo:", map.toString(), " recordId:", Integer.valueOf(i));
        Map<Long, double[]> map3 = map.get(Integer.valueOf(i));
        Iterator<List<CommonSectionInfo>> it = commonRecordStatisticsSectionList.iterator();
        while (it.hasNext()) {
            for (CommonSectionInfo commonSectionInfo : it.next()) {
                List<Long> list = map2.get(Integer.valueOf(i));
                if (list == null || list.isEmpty()) {
                    ReleaseLogUtil.e(TAG_RELEASE, "fixSkiGpsPointIndex have not gps info.");
                    return;
                }
                if (commonSectionInfo.getSectionStartGpsPointIndex() < list.size() && commonSectionInfo.getSectionStartGpsPointIndex() >= 0) {
                    commonSectionInfo.setSectionStartGpsPointIndex(parsePointIndexTime(list.get((int) commonSectionInfo.getSectionStartGpsPointIndex()).longValue(), map3));
                }
                if (commonSectionInfo.getSectionEndGpsPointIndex() < list.size() && commonSectionInfo.getSectionEndGpsPointIndex() >= 0) {
                    commonSectionInfo.setSectionEndGpsPointIndex(parsePointIndexTime(list.get((int) commonSectionInfo.getSectionEndGpsPointIndex()).longValue(), map3));
                }
                if (commonSectionInfo.getSectionCableStartGpsPointIndex() < list.size() && commonSectionInfo.getSectionCableStartGpsPointIndex() >= 0) {
                    commonSectionInfo.setSectionCableStartGpsPointIndex(parsePointIndexTime(list.get((int) commonSectionInfo.getSectionCableStartGpsPointIndex()).longValue(), map3));
                }
                if (commonSectionInfo.getSectionCableEndGpsPointIndex() < list.size() && commonSectionInfo.getSectionCableEndGpsPointIndex() >= 0) {
                    commonSectionInfo.setSectionCableEndGpsPointIndex(parsePointIndexTime(list.get((int) commonSectionInfo.getSectionCableEndGpsPointIndex()).longValue(), map3));
                }
            }
        }
        LogUtil.a(TAG, "dealWithPointIndex commonRecordStatisticsSectionList:", commonRecordStatisticsSectionList);
    }

    private long parsePointIndexTime(long j, Map<Long, double[]> map) {
        if (map == null || map.isEmpty()) {
            ReleaseLogUtil.e(TAG_RELEASE, "parsePointIndexTime recordIdGpsInfo is empty");
            return -1L;
        }
        char c2 = 1;
        long size = map.size() - 1;
        long j2 = -1;
        long j3 = 0;
        while (j3 <= size) {
            j2 = (j3 + size) >> c2;
            if (map.get(Long.valueOf(j2)) == null || map.get(Long.valueOf(j2)).length < 4) {
                ReleaseLogUtil.e(TAG_RELEASE, "parsePointIndexTime recordIdGpsInfo.get(middle) have not gps time or is null");
                return -1L;
            }
            double d = map.get(Long.valueOf(j2))[this.mGpsTimeIndex];
            double d2 = j;
            if (d > d2) {
                size = j2 - 1;
            } else {
                if (d >= d2) {
                    return j2;
                }
                j3 = j2 + 1;
            }
            c2 = 1;
        }
        double d3 = j;
        long j4 = map.get(Long.valueOf(j2))[this.mGpsTimeIndex] > d3 ? j2 - 1 : j2 + 1;
        if (j4 >= 0 && j4 < map.size()) {
            if (Math.abs(map.get(Long.valueOf(j2))[this.mGpsTimeIndex] - d3) > Math.abs(map.get(Long.valueOf(j4))[this.mGpsTimeIndex] - d3)) {
                return j4;
            }
        }
        return j2;
    }

    private void getOneRecordSuccess(int i, int i2) {
        ReleaseLogUtil.d(TAG_RELEASE, "getOneRecordSuccess errorCode: ", Integer.valueOf(i2), " recordId: ", Integer.valueOf(i), " errorInfo: get track ok");
        saveData(i);
        HwExerciseParams hwExerciseParams = this.mParam;
        hwExerciseParams.setWorkoutRecordStatisticIndex(hwExerciseParams.getWorkoutRecordStatisticIndex() + 1);
        getDeviceWorkoutRecordStatistic(i2);
    }

    /* JADX INFO: loaded from: classes10.dex */
    class PaceMapCallback implements IBaseResponseCallback {
        private int error;
        private int recordId;

        PaceMapCallback(int i, int i2) {
            this.recordId = i;
            this.error = i2;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            JSONObject jSONObject;
            if (i != 100000) {
                ReleaseLogUtil.e(HwExerciseAdviceManager.TAG_RELEASE, "getPace Error");
                HwExerciseAdviceManager.this.sendWorkoutSyncEvent(i);
                lng.e(i);
                HwExerciseAdviceManager.this.mParam.setWorkoutRecordStatisticIndex(HwExerciseAdviceManager.this.mParam.getWorkoutRecordStatisticIndex() + 1);
                HwExerciseAdviceManager.this.getDeviceWorkoutRecordStatistic(4);
                return;
            }
            try {
                Object obj2 = ((Map) obj).get("value");
                LogUtil.a(a.t, 0, HwExerciseAdviceManager.TAG, "getWorkoutRecordPaceMapCallback value", obj2.toString());
                jSONObject = new JSONObject(obj2.toString());
            } catch (JSONException unused) {
                lng.e(i);
                ReleaseLogUtil.a(HwExerciseAdviceManager.TAG_RELEASE, "PaceXxxx response json Exception.");
                jSONObject = null;
            }
            if (jSONObject == null) {
                ReleaseLogUtil.e(HwExerciseAdviceManager.TAG_RELEASE, "PaceMapCallback paceMap is null.");
            } else {
                parsePaceMap(jSONObject);
            }
        }

        private void parsePaceMap(JSONObject jSONObject) {
            try {
                for (JSONObject jSONObject2 : HwExerciseAdviceManager.this.mParam.getWorkoutRecordPaceMapList()) {
                    if (jSONObject2.optInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID, -1) == jSONObject.optInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID, -1) && jSONObject2.optInt(HwExerciseConstants.PACE_INDEX_NAME, -1) == jSONObject.optInt(HwExerciseConstants.PACE_INDEX_NAME, -1)) {
                        HwExerciseAdviceManager.this.mParam.getWorkoutRecordPaceMapList().remove(jSONObject2);
                        break;
                    }
                }
                HwExerciseAdviceManager.this.mParam.getWorkoutRecordPaceMapList().add(jSONObject);
                LogUtil.a(HwExerciseAdviceManager.TAG, "getWorkoutRecordPaceMapCallback workoutId:", jSONObject.get(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID));
                for (int i = 0; i < HwExerciseAdviceManager.this.mParam.getWorkoutRecordPaceMapIdList().size(); i++) {
                    LogUtil.d(HwExerciseAdviceManager.TAG, "getWorkoutRecordPaceMapCallback workoutId: ", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID)), " paceIndex: ", Integer.valueOf(jSONObject.optInt(HwExerciseConstants.PACE_INDEX_NAME, -1)));
                    if (jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID) == HwExerciseAdviceManager.this.mParam.getWorkoutRecordPaceMapIdList().get(i).getRecordId() && jSONObject.optInt(HwExerciseConstants.PACE_INDEX_NAME, -1) == HwExerciseAdviceManager.this.mParam.getWorkoutRecordPaceMapIdList().get(i).getPaceIndex()) {
                        ReleaseLogUtil.d(HwExerciseAdviceManager.TAG_RELEASE, EventType.REMOVE);
                        HwExerciseAdviceManager.this.mParam.getWorkoutRecordPaceMapIdList().remove(i);
                        break;
                    }
                }
                if (!HwExerciseAdviceManager.this.mParam.getWorkoutRecordPaceMapIdList().isEmpty()) {
                    HwExerciseAdviceManager.this.getWorkoutRecordPaceMap(this.recordId, this.error);
                } else {
                    HwExerciseAdviceManager.this.getWorkOutDetailFromDevice(this.recordId, this.error);
                }
            } catch (JSONException e) {
                ReleaseLogUtil.a(HwExerciseAdviceManager.TAG_RELEASE, "parseXxx json Exception:", ExceptionUtils.c(e));
                HwExerciseAdviceManager.this.mParam.setWorkoutRecordStatisticIndex(HwExerciseAdviceManager.this.mParam.getWorkoutRecordStatisticIndex() + 1);
                HwExerciseAdviceManager.this.getDeviceWorkoutRecordStatistic(4);
            } catch (Exception e2) {
                ReleaseLogUtil.a(HwExerciseAdviceManager.TAG_RELEASE, "parseXxx Exception:", ExceptionUtils.c(e2));
                HwExerciseAdviceManager.this.mParam.setWorkoutRecordStatisticIndex(HwExerciseAdviceManager.this.mParam.getWorkoutRecordStatisticIndex() + 1);
                HwExerciseAdviceManager.this.getDeviceWorkoutRecordStatistic(4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getWorkoutRecordPaceMap(int i, int i2) {
        Iterator<PaceIndexStruct> it = this.mParam.getWorkoutRecordPaceMapIdList().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (i == it.next().getRecordId()) {
                i3++;
            }
        }
        for (PaceIndexStruct paceIndexStruct : this.mParam.getWorkoutRecordPaceMapIdList()) {
            if (i == paceIndexStruct.getRecordId()) {
                if (paceIndexStruct.getPaceIndex() == 0 && this.mParam.getWorkoutRecordPaceMapList().size() > i3) {
                    HwExerciseParams hwExerciseParams = this.mParam;
                    hwExerciseParams.setWorkoutRecordPaceMapList(hwExerciseParams.getWorkoutRecordPaceMapList().subList(0, i3));
                }
                HwWorkoutServiceManager.getInstance().getWorkoutRecordPaceMap(paceIndexStruct, new PaceMapCallback(i, i2));
                return;
            }
        }
        getWorkOutDetailFromDevice(i, i2);
    }

    private void threadSleep(JSONArray jSONArray) {
        if (EnvironmentInfo.g() && jSONArray.length() > 1) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                ReleaseLogUtil.a(TAG_RELEASE, "threadSleep InterruptedException :", ExceptionUtils.c(e));
            }
        }
    }

    public void getDeviceWorkoutRecordStatistic(int i) {
        ReleaseLogUtil.d(TAG_RELEASE, "getDeviceWorkoutRecordStatistic");
        try {
            if (this.mParam.getWorkoutRecord() == null) {
                HwExerciseParams hwExerciseParams = this.mParam;
                hwExerciseParams.setRunPlanRecordStatisticIndex(hwExerciseParams.getRunPlanRecordStatisticIndex() + 1);
                getDeviceRunPlanRecordStatistic(i);
                return;
            }
            changeRecordSyncMark();
            JSONArray jSONArray = this.mParam.getWorkoutRecord().getJSONArray(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_STRUCT_LIST);
            threadSleep(jSONArray);
            if (this.mParam.getWorkoutRecordStatisticIndex() < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(this.mParam.getWorkoutRecordStatisticIndex());
                int i2 = jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID);
                setSectionParam(jSONObject);
                int i3 = jSONObject.getInt("mWorkoutBloodOxygenIndex");
                mlp.a().b(i3);
                this.mParam.getSwimSectionIndexList().add(Integer.valueOf(this.mParam.getSectionIndex()));
                ReleaseLogUtil.d(TAG_RELEASE, "getWorkoutRecord id size is", jSONArray.length() + ",id is ", Integer.valueOf(i2), " bloodOxygenIndex is ", Integer.valueOf(i3), " mSectionIndex : ", Integer.valueOf(this.mParam.getSectionIndex()));
                getDeviceWorkoutRecordStatisticResponse(i, i2);
                return;
            }
            if (this.mParam.getWorkoutRecordStatisticIndex() == jSONArray.length()) {
                startSyncRecord();
                return;
            }
            HwExerciseParams hwExerciseParams2 = this.mParam;
            hwExerciseParams2.setRunPlanRecordStatisticIndex(hwExerciseParams2.getRunPlanRecordStatisticIndex() + 1);
            getDeviceRunPlanRecordStatistic(i);
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "getXxxxxStatistic json Exception:", ExceptionUtils.c(e));
        }
    }

    private void getDeviceWorkoutRecordStatisticResponse(final int i, final int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", i2);
            HwWorkoutServiceManager.getInstance().getWorkoutRecordStatistic(jSONObject, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.10
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i3, Object obj) {
                    try {
                        if (i3 == 100000) {
                            HwExerciseAdviceManager.this.parseRecordStatistic(i, obj, i2);
                            return;
                        }
                        ReleaseLogUtil.e(HwExerciseAdviceManager.TAG_RELEASE, "getRecordStatistic error", Integer.valueOf(i3));
                        HwExerciseAdviceManager.this.sendWorkoutSyncEvent(i3);
                        lng.e(i3);
                        HwExerciseAdviceManager.this.mParam.setWorkoutRecordStatisticIndex(HwExerciseAdviceManager.this.mParam.getWorkoutRecordStatisticIndex() + 1);
                        HwExerciseAdviceManager.this.getDeviceWorkoutRecordStatistic(1);
                    } catch (JSONException e) {
                        ReleaseLogUtil.a(HwExerciseAdviceManager.TAG_RELEASE, "getXxxxxStatistic call back json Exception:", ExceptionUtils.c(e));
                        lng.e(i3);
                    }
                }
            });
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "getXxxxxStatistic json Exception:", ExceptionUtils.c(e));
        }
    }

    private void setSectionParam(JSONObject jSONObject) throws JSONException {
        this.mParam.setSectionIndex(jSONObject.getInt("workout_section_index"));
        this.mParam.setDetailCount(jSONObject.getInt("workout_index_count"));
        this.mParam.setSectionCommonIndex(jSONObject.optInt("workoutSectionNumber"));
        this.mParam.setWorkoutTrajectories(jSONObject.optInt("workout_trajectories"));
        this.mParam.setDivingEvent(jSONObject.optInt("diving_event"));
        String strOptString = jSONObject.optString("sequence_data_dict_type");
        this.mParam.getDictTypeList().clear();
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        for (String str : strOptString.split(",")) {
            arrayList.add(Integer.valueOf(Integer.parseInt(str)));
        }
        this.mParam.setDictTypeList(arrayList);
    }

    private void startSyncRecord() {
        HwExerciseRunPlanUtil.printWorkoutRecordInfo();
        this.mParam.setRunPlanRecordStatisticIndex(0);
        startThreadGetLastSyncTime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseRecordStatistic(int i, Object obj, final int i2) throws JSONException {
        String str;
        if (!(obj instanceof Map)) {
            ReleaseLogUtil.e(TAG_RELEASE, "parseRecordStatistic is not map");
            return;
        }
        Map map = (Map) obj;
        if (!(map.get("value") instanceof String)) {
            str = "";
        } else {
            str = (String) map.get("value");
        }
        final JSONObject jSONObject = new JSONObject(str);
        this.mParam.getWorkoutRecordsStatisticArray().put(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID), jSONObject);
        String currentDeviceId = getCurrentDeviceId();
        setIsLastSaved(false);
        if (this.mParam.getSucceedRecordMap().get(getRecordKey(currentDeviceId)) != null) {
            int i3 = jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID);
            long j = jSONObject.getLong(HwExerciseConstants.JSON_NAME_START_TIME);
            long j2 = jSONObject.getLong(HwExerciseConstants.JSON_NAME_END_TIME);
            if ((this.mParam.getLastSyncTime() + 60000) / 1000 > j2) {
                saveSyncData(i3, j, jSONObject.getInt(HwExerciseConstants.JSON_NAME_RECORD_FLAG), jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE), j2);
            }
            List<WorkoutSyncSuccessDetailData> list = this.mParam.getSucceedRecordMap().get(getRecordKey(currentDeviceId));
            ReleaseLogUtil.d(TAG_RELEASE, "succeedList:", list.toString());
            Iterator<WorkoutSyncSuccessDetailData> it = list.iterator();
            while (it.hasNext()) {
                if (isRecordSynced(i, i3, j, it.next())) {
                    ReleaseLogUtil.d(TAG_RELEASE, "this record has synced:", Integer.valueOf(i3));
                    return;
                }
            }
        }
        this.mParam.getTriathlonUtils().setNowRecordId(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID), getCurrentDeviceId());
        this.mParam.getGpsWorkoutRecordIdList().add(Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID)));
        mlp.a().d(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID), i, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.11
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i4, Object obj2) {
                HwExerciseAdviceManager.this.getOtherExerciseData(jSONObject, i2, i4);
            }
        });
    }

    private void setSuccessRecordData() {
        String recordKey = getRecordKey(getCurrentDeviceId());
        String sharedPreference = getSharedPreference(recordKey);
        if (TextUtils.isEmpty(sharedPreference)) {
            return;
        }
        ArrayList arrayList = new ArrayList(peh.c(sharedPreference, WorkoutSyncSuccessDetailData[].class));
        if (njy.b(arrayList)) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (this.mParam.getLastSyncTime() > ((WorkoutSyncSuccessDetailData) it.next()).getEndTime()) {
                    it.remove();
                }
            }
            this.mParam.getSucceedRecordMap().put(recordKey, arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getOtherExerciseData(JSONObject jSONObject, int i, int i2) {
        try {
            ReleaseLogUtil.d(TAG_RELEASE, "mSectionIndex: ", Integer.valueOf(this.mParam.getSectionIndex()), "workout_record_id: ", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID)));
            if (this.mParam.getSectionCommonIndex() > 0 && HwExerciseRunPlanUtil.checkNewSectionWorkoutType(jSONObject)) {
                ReleaseLogUtil.d(TAG_RELEASE, "sectionCommonIndex: ", Integer.valueOf(this.mParam.getSectionCommonIndex()), " workout_record_id: ", Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID)), " workoutType: ", Integer.valueOf(jSONObject.optInt(HwExerciseConstants.JSON_NAME_WORKOUT_TYPE)));
                this.mParam.setCommonListStatisticIndex(0);
                this.mParam.getCommonRecordStatisticsSectionList().clear();
                getCommonSectionList(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID), this.mParam.getSectionCommonIndex(), i2);
                return;
            }
            if (this.mParam.getSectionIndex() != 0) {
                LogUtil.d(TAG, "going this one");
                this.mParam.setSectionRecordsStatisticJsonObjects(new ArrayList(16));
                this.mParam.setSectionListStatisticIndex(0);
                getSectionList(jSONObject.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID), this.mParam.getSectionIndex(), i2);
                return;
            }
            getDetailData(i, i2);
        } catch (JSONException e) {
            LogUtil.e(TAG, "getOtherExerciseData JSONException:", ExceptionUtils.c(e));
        }
    }

    private boolean isRecordSynced(int i, int i2, long j, WorkoutSyncSuccessDetailData workoutSyncSuccessDetailData) {
        if (workoutSyncSuccessDetailData == null || workoutSyncSuccessDetailData.getWorkoutId() != i2 || workoutSyncSuccessDetailData.getStartTime() != j) {
            return false;
        }
        if (workoutSyncSuccessDetailData.isNeedResync()) {
            ReleaseLogUtil.e(TAG_RELEASE, "isRecordSynced plan data is synced fail.");
            return false;
        }
        if (TriathlonUtils.getInstance().isLastData(i2)) {
            ReleaseLogUtil.d(TAG_RELEASE, "isRecordSynced last data is synced");
            setIsLastSaved(true);
            sendSyncMessage();
            return false;
        }
        this.mWorkoutCount++;
        HwExerciseParams hwExerciseParams = this.mParam;
        hwExerciseParams.setWorkoutRecordStatisticIndex(hwExerciseParams.getWorkoutRecordStatisticIndex() + 1);
        getDeviceWorkoutRecordStatistic(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendSyncMessage() {
        if (isIsSyncSuccess()) {
            HwExerciseUtils.sendNotifyBySwitch();
            setIsSyncSuccess(false);
        } else if (this.mIsBeingSavedNewData) {
            this.mParam.getHwExerciseAdviceManagerHandler().sendEmptyMessage(2, 500L);
        } else {
            ReleaseLogUtil.d(TAG_RELEASE, "isRecordSynced have not new data saved");
        }
    }

    private void sendExerciseBroadcast() {
        ReleaseLogUtil.d(TAG_RELEASE, "sendExerciseBroadcast enter");
        nvx.b(2);
        nvx.d();
    }

    private void getCommonSectionList(final int i, final int i2, final int i3) {
        if (this.mParam.getCommonListStatisticIndex() < i2) {
            CommonSectionList commonSectionList = new CommonSectionList();
            commonSectionList.setWorkoutRecordId(i);
            commonSectionList.setSectionIndex(this.mParam.getCommonListStatisticIndex());
            ReleaseLogUtil.d(TAG_RELEASE, "getCommonSectionList workoutRecordId: ", Integer.valueOf(i), " sectionIndex: ", Integer.valueOf(this.mParam.getCommonListStatisticIndex()));
            HwWorkoutServiceManager.getInstance().getCommonSectionListStatistic(commonSectionList, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.12
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i4, Object obj) {
                    ReleaseLogUtil.d(HwExerciseAdviceManager.TAG_RELEASE, "enter getCommonSectionList().onResponse()");
                    if (obj != null && i4 == 100000) {
                        try {
                            HwExerciseAdviceManager.this.handleCommonSectionResponse(i3, obj, i2, i);
                            return;
                        } catch (JSONException e) {
                            ReleaseLogUtil.a(HwExerciseAdviceManager.TAG_RELEASE, "getCommonSectionList JSONException occur:", ExceptionUtils.c(e));
                            lng.e(i4);
                            HwExerciseAdviceManager.this.handleErrorScene(i, i2);
                            return;
                        }
                    }
                    ReleaseLogUtil.e(HwExerciseAdviceManager.TAG_RELEASE, "getCommonSectionList() objectData is null or errorCode is not success");
                    lng.e(i4);
                    HwExerciseAdviceManager.this.handleErrorScene(i, i2);
                }
            });
            return;
        }
        HwExerciseRunPlanUtil.printCommonWorkoutRecordSectionInfo();
        this.mParam.getWorkoutRecordCommonSectionMap().put(Integer.valueOf(i), this.mParam.getCommonRecordStatisticsSectionList());
        ReleaseLogUtil.d(TAG_RELEASE, "workoutRecordId: ", Integer.valueOf(i), " mWorkoutRecordCommonSectionMap size: ", Integer.valueOf(this.mParam.getWorkoutRecordCommonSectionMap().size()));
        getDetailData(i, i3);
        this.mParam.setCommonListStatisticIndex(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleErrorScene(int i, int i2) {
        HwExerciseParams hwExerciseParams = this.mParam;
        hwExerciseParams.setCommonListStatisticIndex(hwExerciseParams.getCommonListStatisticIndex() + 1);
        getCommonSectionList(i, i2, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleCommonSectionResponse(int i, Object obj, int i2, int i3) throws JSONException {
        if (!(obj instanceof CommonSectionList)) {
            ReleaseLogUtil.e(TAG_RELEASE, "objectData is not CommonSectionList");
            return;
        }
        CommonSectionList commonSectionList = (CommonSectionList) obj;
        HwExerciseParams hwExerciseParams = this.mParam;
        hwExerciseParams.setCommonListStatisticIndex(hwExerciseParams.getCommonListStatisticIndex() + 1);
        this.mParam.getCommonRecordStatisticsSectionList().add(commonSectionList.getSectionInfos());
        int commonListStatisticIndex = this.mParam.getCommonListStatisticIndex();
        int size = this.mParam.getCommonRecordStatisticsSectionList().size();
        LogUtil.a(TAG, "sectionIndex, ", Integer.valueOf(i2), " mCommonListStatisticIndex, ", Integer.valueOf(commonListStatisticIndex), " mCommonRecordStaticticSectionList size: ", Integer.valueOf(size), " commonSectionList value: ", commonSectionList.toString());
        getCommonSectionList(i3, i2, i);
    }

    private String getRecordKey(String str) {
        return HwExerciseUtils.getRecordKey(str);
    }

    private void getSectionList(final int i, final int i2, final int i3) {
        try {
            if (this.mParam.getSectionListStatisticIndex() < i2) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", i);
                jSONObject.put("sectionIndex", this.mParam.getSectionListStatisticIndex());
                ReleaseLogUtil.d(TAG_RELEASE, "getSectionList. workout_record_id is ", Integer.valueOf(i), "sectionIndex is ", Integer.valueOf(this.mParam.getSectionListStatisticIndex()));
                HwWorkoutServiceManager.getInstance().getSectionListStatistic(jSONObject, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.13
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i4, Object obj) {
                        ReleaseLogUtil.d(HwExerciseAdviceManager.TAG_RELEASE, "Enter getSectionList().onResponse()");
                        HwExerciseAdviceManager.this.getSectionListStatisticResponse(obj, i4, i2, i, i3);
                    }
                });
                return;
            }
            HwExerciseRunPlanUtil.printWorkoutRecordSectionInfo();
            this.mParam.getSwimWorkoutRecordSectionMap().put(Integer.valueOf(i), this.mParam.getSectionRecordsStatisticJsonObjects());
            LogUtil.d(TAG, "mSwimWorkoutRecordSectionMap.size: ", Integer.valueOf(this.mParam.getSwimWorkoutRecordSectionMap().size()));
            this.mParam.setSectionIndex(0);
            getDetailData(i, i3);
            this.mParam.setSectionListStatisticIndex(0);
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "getXxxxList json Exception:", ExceptionUtils.c(e));
            HwExerciseParams hwExerciseParams = this.mParam;
            hwExerciseParams.setWorkoutRecordStatisticIndex(hwExerciseParams.getWorkoutRecordStatisticIndex() + 1);
            getDeviceWorkoutRecordStatistic(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getSectionListStatisticResponse(Object obj, int i, int i2, int i3, int i4) {
        try {
            if (obj instanceof Map) {
                String str = (String) ((Map) obj).get("value");
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.get(HwExerciseConstants.JSON_NAME_SECTION_STRUCT) instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) jSONObject.get(HwExerciseConstants.JSON_NAME_SECTION_STRUCT);
                    LogUtil.d(TAG, "value is ", str);
                    HwExerciseParams hwExerciseParams = this.mParam;
                    hwExerciseParams.setSectionListStatisticIndex(hwExerciseParams.getSectionListStatisticIndex() + 1);
                    this.mParam.getSectionRecordsStatisticJsonObjects().add(jSONArray);
                }
                ReleaseLogUtil.d(TAG_RELEASE, "sectionIndexParam: ", Integer.valueOf(i2), " mSectionListdStatisticIndex: ", Integer.valueOf(this.mParam.getSectionListStatisticIndex()), " mSectionRecordsStatisticJsonObjects.size: ", Integer.valueOf(this.mParam.getSectionRecordsStatisticJsonObjects().size()));
                getSectionList(i3, i2, i4);
            }
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "getXxxxList call back json Exception:", ExceptionUtils.c(e));
            lng.e(i);
            HwExerciseParams hwExerciseParams2 = this.mParam;
            hwExerciseParams2.setSectionListStatisticIndex(hwExerciseParams2.getSectionListStatisticIndex() + 1);
            getSectionList(i3, i2, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getDeviceRunPlanRecordStatistic(final int i) {
        try {
            if (this.mParam.getRunPlanRecord() != null) {
                JSONArray jSONArray = this.mParam.getRunPlanRecord().getJSONArray(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_RECORD_STRUCT);
                if (this.mParam.getRunPlanRecordStatisticIndex() < this.mParam.getRunPlanRecord().getJSONArray(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_RECORD_STRUCT).length()) {
                    int i2 = jSONArray.getJSONObject(this.mParam.getRunPlanRecordStatisticIndex()).getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_RECORD_ID);
                    HwExerciseParams hwExerciseParams = this.mParam;
                    hwExerciseParams.setDetailCount(jSONArray.getJSONObject(hwExerciseParams.getRunPlanRecordStatisticIndex()).getInt("run_plan_index_count"));
                    ReleaseLogUtil.d(TAG_RELEASE, "getRunPlanRecordStatistic size", Integer.valueOf(jSONArray.length()), ",id is", Integer.valueOf(i2));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", i2);
                    getRunPlanRecordInfo(jSONObject, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.14
                        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                        /* JADX INFO: renamed from: onResponse */
                        public void a(int i3, Object obj) {
                            try {
                                HwExerciseAdviceManager.this.parseRunPlanRecordInfo(i3, i, obj);
                            } catch (JSONException e) {
                                ReleaseLogUtil.a(HwExerciseAdviceManager.TAG_RELEASE, "getDeviceXxxx call back JSONException:", ExceptionUtils.c(e));
                                HwExerciseAdviceManager.this.mParam.setWorkoutRecordStatisticIndex(HwExerciseAdviceManager.this.mParam.getWorkoutRecordStatisticIndex() + 1);
                                HwExerciseAdviceManager.this.getDeviceWorkoutRecordStatistic(1);
                                lng.e(i3);
                            }
                        }
                    });
                    return;
                }
                npr.d(12);
                HwDevicePeriodRriFileManager.getInstance().getPeriodRriFileFromDevice();
                return;
            }
            ReleaseLogUtil.e(TAG_RELEASE, "mRunPlanRecord is null");
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "getDeviceXxxx JSONException:", ExceptionUtils.c(e));
            HwExerciseParams hwExerciseParams2 = this.mParam;
            hwExerciseParams2.setWorkoutRecordStatisticIndex(hwExerciseParams2.getWorkoutRecordStatisticIndex() + 1);
            getDeviceWorkoutRecordStatistic(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void parseRunPlanRecordInfo(int i, int i2, Object obj) throws JSONException {
        if (!(obj instanceof Map)) {
            ReleaseLogUtil.e(TAG_RELEASE, "parseRunPlanRecordInfo data is not map");
            return;
        }
        Object obj2 = ((Map) obj).get("value");
        if (i != 100000) {
            ReleaseLogUtil.e(TAG_RELEASE, "getDeviceRunPlanRecordStatistic error ", Integer.valueOf(i));
            sendWorkoutSyncEvent(i);
            lng.e(i);
            HwExerciseParams hwExerciseParams = this.mParam;
            hwExerciseParams.setWorkoutRecordStatisticIndex(hwExerciseParams.getWorkoutRecordStatisticIndex() + 1);
            getDeviceWorkoutRecordStatistic(1);
            return;
        }
        LogUtil.a(a.t, 0, TAG, "the value is ", obj2.toString(), "the value is instanceof a list ", Boolean.valueOf(obj2 instanceof List));
        JSONObject jSONObject = new JSONArray(obj2.toString()).getJSONObject(0);
        jSONObject.put("run_plan_record_info_wourkout_id", this.mParam.getRunPlanRecord().getJSONArray(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_RECORD_STRUCT).getJSONObject(this.mParam.getRunPlanRecordStatisticIndex()).getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_ID));
        this.mParam.getRunPlanRecordsStatisticArray().put(jSONObject.getInt(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_ID), jSONObject);
        String currentDeviceId = getCurrentDeviceId();
        if (this.mParam.getSucceedRecordMap().get(getRecordKey(currentDeviceId)) != null) {
            int i3 = jSONObject.getInt(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_ID);
            long j = jSONObject.getLong(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_START_TIME);
            for (WorkoutSyncSuccessDetailData workoutSyncSuccessDetailData : this.mParam.getSucceedRecordMap().get(getRecordKey(currentDeviceId))) {
                if (workoutSyncSuccessDetailData != null && workoutSyncSuccessDetailData.getWorkoutId() == i3 && workoutSyncSuccessDetailData.getStartTime() == j) {
                    HwExerciseParams hwExerciseParams2 = this.mParam;
                    hwExerciseParams2.setWorkoutRecordStatisticIndex(hwExerciseParams2.getWorkoutRecordStatisticIndex() + 1);
                    getDeviceWorkoutRecordStatistic(i2);
                    this.mRunPlayCount++;
                    if (TriathlonUtils.getInstance().isRunPlayLastData(i3)) {
                        ReleaseLogUtil.d(TAG_RELEASE, "parseRunPlanRecordInfo last data is synced");
                        updateRunPlaySyncCompleteTime();
                        sendSyncMessage();
                        return;
                    }
                    return;
                }
            }
        }
        this.mParam.getGpsRunPlanRecordIdList().add(Integer.valueOf(jSONObject.getInt(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_ID)));
        getRunPlanDetailData(jSONObject.getInt(HwExerciseConstants.JSON_NAME_SPORT_DATA_KEY_RECORD_ID), i2);
    }

    private void getDeviceWorkoutRecordIdList(JSONObject jSONObject) {
        this.mParam.setWorkoutRecord(null);
        this.mParam.setRunPlanRecord(null);
        this.mWorkoutCount = 0;
        this.mRunPlayCount = 0;
        this.mWorkoutRunPlayFailCount = 0;
        ReleaseLogUtil.d(TAG_RELEASE, "start syncWorkoutData getDeviceWorkoutRecordIdList");
        try {
            setIsSyncSuccess(false);
            HwWorkoutServiceManager.getInstance().getWorkoutRecord(jSONObject, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.15
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    HwExerciseAdviceManager.this.getWorkoutRecordResponse(i, obj);
                }
            });
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "getDeviceXxx json Exception:", ExceptionUtils.c(e));
            this.mParam.setIsDetailSyncing(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getWorkoutRecordResponse(int i, Object obj) {
        ReleaseLogUtil.d(TAG_RELEASE, "start syncWorkoutData getWorkoutRecordResponse");
        this.mIsBeingSavedNewData = false;
        if (i == 100000) {
            try {
                if (obj instanceof Map) {
                    this.mParam.setWorkoutRecord(new JSONObject((String) ((Map) obj).get("value")));
                    JSONArray jSONArray = this.mParam.getWorkoutRecord().getJSONArray(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_STRUCT_LIST);
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        if (jSONArray.get(i2) instanceof JSONObject) {
                            JSONObject jSONObject = (JSONObject) jSONArray.get(i2);
                            HwExerciseUtils.getPaceIndexArray(jSONObject.optInt(HwExerciseConstants.JSON_NAME_WORKOUT_RECORD_ID), jSONObject.optInt("paceIndexCount", -1));
                        }
                    }
                    this.mParam.setWorkoutRecordStatisticIndex(0);
                    this.mParam.getWorkoutRecordsStatisticArray().clear();
                    this.mParam.getGpsWorkoutRecordIdList().clear();
                    isSingleExerciseRecordVerification();
                    return;
                }
            } catch (JSONException e) {
                ReleaseLogUtil.a(TAG_RELEASE, "getDeviceXxx callback json Exception:", ExceptionUtils.c(e));
                lng.e(i);
                this.mParam.setIsDetailSyncing(false);
                return;
            }
        }
        ReleaseLogUtil.e(TAG_RELEASE, "getWorkoutRecord error", Integer.valueOf(i));
        notifyDetailSyncComplete(i, "getDeviceWorkoutRecordIdList");
        sendWorkoutSyncEvent(i);
        lng.e(i);
    }

    private void isSingleExerciseRecordVerification() {
        ReleaseLogUtil.d(TAG_RELEASE, "isSingleExerciseRecordVerification ");
        try {
            if (this.mParam.getWorkoutRecord() != null && this.mParam.getWorkoutRecord().getInt(WORKOUT_RECORD_COUNT) > 0) {
                getDeviceWorkoutRecordStatistic(0);
                return;
            }
            if (this.mIsLastSync) {
                setSharedPreference(getCurrentDeviceId() + this.mParam.getUserId(), String.valueOf(this.mALLSyncEndTime), null);
                ReleaseLogUtil.d(TAG_RELEASE, "isSingleExerciseRecordVerification setSharedPreference time", Long.valueOf(this.mALLSyncEndTime));
            }
            startThreadGetLastSyncTime();
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "isSingleExerciseRecordVerification JSONException:", ExceptionUtils.c(e));
        }
    }

    private void startThreadGetLastSyncTime() {
        mit.b(TAG, new Runnable() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.16
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startTime", HwExerciseAdviceManager.this.getLastSyncTime());
                    jSONObject.put("endTime", HwExerciseAdviceManager.this.mParam.getCurrentTime());
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 3;
                    messageObtain.obj = jSONObject;
                    HwExerciseAdviceManager.this.mParam.getHwExerciseAdviceManagerHandler().sendMessage(messageObtain);
                } catch (JSONException e) {
                    ReleaseLogUtil.a(HwExerciseAdviceManager.TAG_RELEASE, "startThreadGetLastSyncTime JSONException:", ExceptionUtils.c(e));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getDeviceRunPlanRecordIdList(final int i, JSONObject jSONObject) {
        getRunPlaySyncTime(jSONObject);
        try {
            getRunPlanRecord(jSONObject, new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.17
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    HwExerciseAdviceManager.this.mIsBeingSavedNewData = false;
                    try {
                        if (i2 != 100000) {
                            ReleaseLogUtil.e(HwExerciseAdviceManager.TAG_RELEASE, "getRunPlanRecord error ", Integer.valueOf(i2));
                            HwExerciseAdviceManager.this.sendWorkoutSyncEvent(i2);
                            lng.e(i2);
                            HwExerciseAdviceManager.this.notifyDetailSyncComplete(i2, HwExerciseConstants.RECORD_ID_LIST_NAME);
                            npr.d(12);
                            HwDevicePeriodRriFileManager.getInstance().getPeriodRriFileFromDevice();
                            return;
                        }
                        if (obj instanceof Map) {
                            HwExerciseAdviceManager.this.mParam.setRunPlanRecord(new JSONObject(((Map) obj).get("value").toString()));
                        }
                        HwExerciseAdviceManager.this.saveRecordId();
                        HwExerciseAdviceManager.this.mParam.setRunPlanRecordStatisticIndex(0);
                        if (HwExerciseAdviceManager.this.mParam.getRunPlanRecord() == null || HwExerciseAdviceManager.this.mParam.getRunPlanRecord().getInt(HwExerciseAdviceManager.RUN_PLAN_RECORD_COUNT) <= 0) {
                            HwExerciseAdviceManager.this.notifyDetailSyncComplete(i, HwExerciseConstants.RECORD_ID_LIST_NAME);
                            npr.d(12);
                            HwDevicePeriodRriFileManager.getInstance().getPeriodRriFileFromDevice();
                            return;
                        }
                        HwExerciseAdviceManager.this.getDeviceRunPlanRecordStatistic(i);
                    } catch (JSONException e) {
                        ReleaseLogUtil.a(HwExerciseAdviceManager.TAG_RELEASE, "getDeviceXx callback json Exception:", ExceptionUtils.c(e));
                        HwExerciseAdviceManager.this.notifyDetailSyncComplete(i2, HwExerciseConstants.RECORD_ID_LIST_NAME);
                        lng.e(i2);
                        npr.d(12);
                        HwDevicePeriodRriFileManager.getInstance().getPeriodRriFileFromDevice();
                    }
                }
            });
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "getDeviceXx json Exception:", ExceptionUtils.c(e));
            notifyDetailSyncComplete(1, HwExerciseConstants.RECORD_ID_LIST_NAME);
            npr.d(12);
            HwDevicePeriodRriFileManager.getInstance().getPeriodRriFileFromDevice();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveRecordId() throws JSONException {
        JSONObject runPlanRecord = this.mParam.getRunPlanRecord();
        if (runPlanRecord == null) {
            ReleaseLogUtil.d(TAG_RELEASE, "saveRecordId() runPlanRecord is null ");
            return;
        }
        JSONArray jSONArray = runPlanRecord.getJSONArray(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_RECORD_STRUCT);
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.get(i) instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                int iOptInt = jSONObject.optInt("paceIndexCount", -1);
                ReleaseLogUtil.d(TAG_RELEASE, "get run plan paceIndex count is ", Integer.valueOf(iOptInt));
                HwExerciseUtils.getPaceIndexArray(jSONObject.optInt(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_RECORD_ID), iOptInt);
            }
        }
    }

    private void getRunPlaySyncTime(JSONObject jSONObject) {
        try {
            long currentTime = jSONObject.getLong("startTime");
            if (currentTime == 0 || this.mParam.getCurrentTime() - currentTime > HwExerciseConstants.TEN_DAY_SECOND || this.mParam.getCurrentTime() - currentTime < 0) {
                currentTime = this.mParam.getCurrentTime() - HwExerciseConstants.TEN_DAY_SECOND;
                jSONObject.put("startTime", currentTime);
            }
            jSONObject.put("startTime", currentTime - 60000);
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "getRunPlaySyncTime JSONException:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isSupportPace() {
        DeviceCapability capability = HwExerciseAdviceManagerHelper.getInstance().getCapability();
        boolean zIsSupportWorkoutRecordPaceMap = capability != null ? capability.isSupportWorkoutRecordPaceMap() : false;
        ReleaseLogUtil.d(TAG_RELEASE, "get Device Support isSupportPace ", Boolean.valueOf(zIsSupportWorkoutRecordPaceMap));
        return zIsSupportWorkoutRecordPaceMap;
    }

    public void sendWorkoutSyncEvent(int i) {
        ReleaseLogUtil.d(TAG_RELEASE, "sendWorkoutSyncEvent. result:", Integer.valueOf(i));
        mie.c(i, this.mParam.getCurrentTime(), this.mParam.getWorkoutDataNumber(), HwExerciseDeviceUtil.getCurrentDeviceInfo());
    }

    public void changeRecordSyncMark() {
        JSONObject runPlanRecord = this.mParam.getRunPlanRecord();
        JSONObject workoutRecord = this.mParam.getWorkoutRecord();
        if (runPlanRecord == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "changeRecordSyncMark run plan not start sync");
            return;
        }
        if (workoutRecord == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "changeRecordSyncMark WorkoutRecord is null.");
            this.mParam.setIsDetailSyncing(false);
            return;
        }
        try {
            int i = workoutRecord.getInt(WORKOUT_RECORD_COUNT);
            int i2 = runPlanRecord.getInt(RUN_PLAN_RECORD_COUNT);
            ReleaseLogUtil.d(TAG_RELEASE, "changeRecordSyncMark mWorkoutCount:", Integer.valueOf(this.mWorkoutCount), "workoutRecordCount:", Integer.valueOf(i), "mRunPlayCount:", Integer.valueOf(this.mRunPlayCount), "mWorkoutRunPlayFailCount:", Integer.valueOf(this.mWorkoutRunPlayFailCount), "runPlanRecordCount:", Integer.valueOf(i2));
            if (i + i2 == this.mWorkoutCount + this.mRunPlayCount + this.mWorkoutRunPlayFailCount) {
                if (!this.mIsLastSync) {
                    this.mIsLastSync = true;
                    ReleaseLogUtil.d(TAG_RELEASE, "saveTrackData finished start second Sync");
                    startSyncWorkoutRecordThread();
                    return;
                }
                this.mParam.setIsDetailSyncing(false);
                long jCurrentTimeMillis = System.currentTimeMillis() - this.mALLSyncEndTime;
                ReleaseLogUtil.d(TAG_RELEASE, "workout sync completed sync duration:", Long.valueOf(jCurrentTimeMillis));
                if (CommonUtil.ap()) {
                    xjt.d("workout sync completed, sync duration: " + jCurrentTimeMillis);
                }
                if (!this.runRecordList.isEmpty()) {
                    associateSportEvent();
                    this.runRecordList.clear();
                }
                syncCloud();
            }
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "changeRecordSyncMark JSONException:", LogAnonymous.b(e));
        }
    }

    private void syncCloud() {
        if (this.mWorkoutCount + this.mRunPlayCount == 0) {
            ReleaseLogUtil.e(TAG_RELEASE, "No need to trigger cloud operation.");
            return;
        }
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(2);
        hiSyncOption.setPushAction(0);
        hiSyncOption.setForceSync(true);
        ReleaseLogUtil.d(TAG_RELEASE, "syncCloud!");
        HiHealthManager.d(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    private void syncRunPlanDetailData(int i, JSONObject jSONObject) {
        try {
            if (jSONObject == null) {
                ReleaseLogUtil.e(TAG_RELEASE, "syncRunPlanDetailData wr is null");
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_RECORD_STRUCT);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                for (int i3 = 0; i3 < jSONObject2.getInt("run_plan_index_count"); i3++) {
                    Integer num = jSONObject2.get(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_RECORD_ID) instanceof Integer ? (Integer) jSONObject2.get(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_RECORD_ID) : null;
                    if (num != null && num.intValue() == i) {
                        WorkoutDataStruct workoutDataStruct = new WorkoutDataStruct();
                        workoutDataStruct.setWorkoutDataIndex(i3);
                        workoutDataStruct.setWorkoutRecordId(jSONObject2.getInt(HwExerciseConstants.JSON_NAME_WORKOUT_RUN_PLAY_RECORD_ID));
                        this.mParam.getWorkoutDataList().add(workoutDataStruct);
                    }
                }
            }
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "syncXx json Exception:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getWorkoutDetailData(final WorkoutDataStruct workoutDataStruct, final int i) {
        DeviceCapability capability = HwExerciseAdviceManagerHelper.getInstance().getCapability();
        try {
            if (workoutDataStruct.getWorkoutDataIndex() == 0 && this.mParam.getWorkoutDetailDataList().size() > this.mParam.getDetailCount()) {
                HwExerciseParams hwExerciseParams = this.mParam;
                hwExerciseParams.setWorkoutDetailDataList(hwExerciseParams.getWorkoutDetailDataList().subList(0, this.mParam.getDetailCount()));
            }
            if (capability == null || !capability.isSupportWorkoutCapabilicy()) {
                ReleaseLogUtil.d(TAG_RELEASE, "getWorkoutData enter");
                HwWorkoutServiceManager.getInstance().setIsSupportNewStep(false);
                HwWorkoutServiceManager.getInstance().getWorkoutData(workoutDataStruct, new WorkoutDetailCallback(i));
                return;
            }
            HwWorkoutServiceManager.getInstance().getWorkoutCapability(new IBaseResponseCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.18
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    try {
                        ReleaseLogUtil.d(HwExerciseAdviceManager.TAG_RELEASE, "getWorkoutCapability errorCode: ", Integer.valueOf(i2));
                        HwWorkoutServiceManager.getInstance().getWorkoutData(workoutDataStruct, HwExerciseAdviceManager.this.new WorkoutDetailCallback(i));
                    } catch (JSONException e) {
                        ReleaseLogUtil.a(HwExerciseAdviceManager.TAG_RELEASE, "getXx callback json Exception:", ExceptionUtils.c(e));
                        lng.e(i2);
                    }
                }
            });
        } catch (JSONException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "getXx json Exception:", ExceptionUtils.c(e));
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    class WorkoutDetailCallback implements IBaseResponseCallback {
        private int error;

        WorkoutDetailCallback(int i) {
            this.error = i;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            ReleaseLogUtil.d(HwExerciseAdviceManager.TAG_RELEASE, "WorkoutDetailCallback errorCode:", Integer.valueOf(i));
            if (i != 100000 || !(obj instanceof WorkoutDataStruct)) {
                ReleaseLogUtil.e(HwExerciseAdviceManager.TAG_RELEASE, "getDetail error");
                xjt.p("getDetail error :" + i);
                HwExerciseAdviceManager.this.sendWorkoutSyncEvent(i);
                lng.e(i);
                HwExerciseAdviceManager.this.mParam.setWorkoutRecordStatisticIndex(HwExerciseAdviceManager.this.mParam.getWorkoutRecordStatisticIndex() + 1);
                HwExerciseAdviceManager.this.judgeErrorCode(i, this.error);
                return;
            }
            WorkoutDataStruct workoutDataStruct = (WorkoutDataStruct) obj;
            for (WorkoutDataStruct workoutDataStruct2 : HwExerciseAdviceManager.this.mParam.getWorkoutDetailDataList()) {
                if (workoutDataStruct.getWorkoutDataIndex() == workoutDataStruct2.getWorkoutDataIndex() && workoutDataStruct.getWorkoutRecordId() == workoutDataStruct2.getWorkoutRecordId()) {
                    HwExerciseAdviceManager.this.mParam.getWorkoutDetailDataList().remove(workoutDataStruct2);
                    break;
                }
            }
            HwExerciseAdviceManager.this.mParam.getWorkoutDetailDataList().add(workoutDataStruct);
            for (int i2 = 0; i2 < HwExerciseAdviceManager.this.mParam.getWorkoutDataList().size(); i2++) {
                if (workoutDataStruct.getWorkoutDataIndex() == HwExerciseAdviceManager.this.mParam.getWorkoutDataList().get(i2).getWorkoutDataIndex() && workoutDataStruct.getWorkoutRecordId() == HwExerciseAdviceManager.this.mParam.getWorkoutDataList().get(i2).getWorkoutRecordId()) {
                    HwExerciseAdviceManager.this.mParam.getWorkoutDataList().remove(i2);
                    break;
                }
            }
            if (HwExerciseAdviceManager.this.mParam.getWorkoutDataList().isEmpty()) {
                if (!HwExerciseAdviceManager.this.isSupportPace() || HwExerciseAdviceManager.this.mParam.getWorkoutRecordPaceMapIdList().isEmpty()) {
                    HwExerciseAdviceManager.this.getWorkOutDetailFromDevice(workoutDataStruct.getWorkoutRecordId(), this.error);
                    return;
                } else {
                    HwExerciseAdviceManager.this.getWorkoutRecordPaceMap(workoutDataStruct.getWorkoutRecordId(), this.error);
                    return;
                }
            }
            HwExerciseAdviceManager hwExerciseAdviceManager = HwExerciseAdviceManager.this;
            hwExerciseAdviceManager.getWorkoutDetailData(hwExerciseAdviceManager.mParam.getWorkoutDataList().get(0), this.error);
        }
    }

    private void associateSportEvent() {
        SportEventAssociator sportEventAssociator = new SportEventAssociator(BaseApplication.getContext());
        long jC = lsl.c(System.currentTimeMillis(), -6);
        long jA = lsl.a(System.currentTimeMillis(), 0);
        ArrayList arrayList = new ArrayList(this.runRecordList);
        LogUtil.a(TAG, "associateSportEvent is ", arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        sportEventAssociator.b(jC, jA, arrayList, new SportEventAssociator.AssociationCallback() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.19
            @Override // com.huawei.health.plan.association.SportEventAssociator.AssociationCallback
            public void onSuccess(List<SportEventAssociator.c> list) {
                if (list.isEmpty()) {
                    ReleaseLogUtil.a(HwExerciseAdviceManager.TAG, "associateSportEvent results is empty");
                    return;
                }
                LogUtil.a(HwExerciseAdviceManager.TAG, "AssociationMatching success sum is ", Integer.valueOf(list.size()), " result is ", list);
                HwExerciseAdviceManager.this.updateSportEventSharedPreference(list);
                miy.e(BaseApplication.getContext()).d(miy.d(), lsb.d());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateSportEventSharedPreference(List<SportEventAssociator.c> list) {
        String strH = lua.h(HwExerciseConstants.MATCHED_COMPETITION, HwExerciseConstants.MATCHED_COMPETITION);
        if (!StringUtils.g(strH)) {
            list.addAll((List) HiJsonUtil.d(strH, new TypeToken<List<SportEventAssociator.c>>() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager.20
            }.getType()));
        }
        ArrayList arrayList = new ArrayList(((Map) list.stream().collect(Collectors.toMap(new Function() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(((SportEventAssociator.c) obj).e().b());
            }
        }, new Function() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return HwExerciseAdviceManager.lambda$updateSportEventSharedPreference$1((SportEventAssociator.c) obj);
            }
        }, new BinaryOperator() { // from class: com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseAdviceManager$$ExternalSyntheticLambda2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return HwExerciseAdviceManager.lambda$updateSportEventSharedPreference$2((SportEventAssociator.c) obj, (SportEventAssociator.c) obj2);
            }
        }))).values());
        LogUtil.a(TAG, "updateSportEventSharedPreference: ", HiJsonUtil.d(arrayList));
        lua.c(HwExerciseConstants.MATCHED_COMPETITION, HwExerciseConstants.MATCHED_COMPETITION, HiJsonUtil.d(arrayList), null);
    }

    public void setMetricUnit(JSONObject jSONObject, IBaseResponseCallback iBaseResponseCallback) {
        HwExerciseRunPlanUtil.setMetricUnit(jSONObject, iBaseResponseCallback);
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        ReleaseLogUtil.d(TAG_RELEASE, "onDestroy");
        destroyHandler();
    }

    private void destroyHandler() {
        ExtendHandler hwExerciseAdviceManagerHandler = this.mParam.getHwExerciseAdviceManagerHandler();
        if (hwExerciseAdviceManagerHandler != null) {
            hwExerciseAdviceManagerHandler.removeTasksAndMessages();
            hwExerciseAdviceManagerHandler.quit(false);
        }
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void judgeErrorCode(int i, int i2) {
        if (i == 123003) {
            this.mWorkoutRunPlayFailCount++;
            getDeviceWorkoutRecordStatistic(i2);
        } else {
            getDeviceWorkoutRecordStatistic(3);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    class SyncWorkoutBroadcastReceiver extends BroadcastReceiver {
        private SyncWorkoutBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ReleaseLogUtil.d(HwExerciseAdviceManager.TAG_RELEASE, "SyncWorkoutBroadcastReceiver");
            HwExerciseAdviceManager.this.syncDeviceWorkoutRecordInfo();
        }
    }

    private void saveSuccessDeal(MotionPathSimplify motionPathSimplify) {
        ReleaseLogUtil.d(TAG_RELEASE, "saveSuccessDeal ");
        lng.n();
        HwExerciseUtils.writeTrackTimeToList(motionPathSimplify);
        setIsSyncSuccess(true);
        sendExerciseBroadcast();
        if (motionPathSimplify.isIsWorkout()) {
            this.mWorkoutCount++;
            updateWorkoutSyncCompleteTime();
        } else {
            this.mRunPlayCount++;
            updateRunPlaySyncCompleteTime();
        }
    }
}
