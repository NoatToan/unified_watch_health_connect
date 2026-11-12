package com.huawei.health.sportservice.dataproducer;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.health.sportservice.ISportDataSaveStatusCallback;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.manager.ManagerComponent;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.healthcloud.plugintrack.PluginSportTrackAdapter;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.api.HiHealthDeviceApi;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.jsoperation.JsUtil;
import defpackage.awr;
import defpackage.awx;
import defpackage.dmg;
import defpackage.hau;
import defpackage.hbv;
import defpackage.ive;
import defpackage.jac;
import defpackage.jaf;
import defpackage.jxq;
import defpackage.njy;
import defpackage.nxs;
import defpackage.nyl;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, componentDep = {ComponentName.SPORT_DATA_CENTER}, name = ComponentName.DATA_STORAGE_MANAGER)
public class SportDataStorageManager implements ManagerComponent {
    private static final int MSG_SAVE_DATA_TO_TMP_FILE = 1;
    private static final int ROPE_CONTROL_INTERMITTENT_SPORT = 1;
    private static final String TAG = "SportService_SportDataStorageManager";
    protected Map<String, BaseProducer> mProducerMap;
    protected boolean mIsNeedSaveToFile = false;
    private SportLaunchParams mSportLaunchParams = new SportLaunchParams();
    private hau mSportCallbackOption = new hau();
    private final Map<String, ISportDataSaveStatusCallback> mSportDataSaveStatusCallbacks = Collections.synchronizedMap(new LinkedHashMap());
    protected MotionPathSimplify mMotionPathSimplify = new MotionPathSimplify();
    protected MotionPath mMotionPath = new MotionPath();
    private PluginSportTrackAdapter mPluginTrackAdapter = ive.c().a();
    private ExtendHandler mExtendHandler = HandlerCenter.b(new Handler.Callback() { // from class: com.huawei.health.sportservice.dataproducer.SportDataStorageManager.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            SportDataStorageManager.this.obtainDataAndSaveToFile();
            return true;
        }
    }, "SportDataStorageBackground");

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void setParas(SportParamsType sportParamsType, Object obj) {
        if (SportParamsType.SPORT_LAUNCH_PARAS.equals(sportParamsType) && (obj instanceof SportLaunchParams)) {
            this.mSportLaunchParams = (SportLaunchParams) obj;
            return;
        }
        if (SportParamsType.PARAMS_PRODUCER_MAP.equals(sportParamsType) && (obj instanceof Map)) {
            this.mProducerMap = (Map) obj;
        } else if (SportParamsType.DEVICES_DATA_CHANGE_FIRST.equals(sportParamsType)) {
            saveLinkedDevice();
        }
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void init() {
        restoreSportData();
        if (this.mSportLaunchParams.isNeedRestart()) {
            registerTime();
        }
        this.mMotionPathSimplify.saveHasTrackPoint(false);
        this.mMotionPathSimplify.saveSportDataSource(this.mSportLaunchParams.getDataSource() != 5 ? 7 : 5);
        this.mMotionPathSimplify.saveTrackType(0);
        this.mMotionPathSimplify.saveSportType(this.mSportLaunchParams.getSportType());
        if (this.mSportLaunchParams.getSportType() == 279) {
            this.mMotionPathSimplify.saveChiefSportDataType(1);
        }
    }

    private void restoreSportData() {
        LogUtil.a(TAG, "mSportLaunchParams.isRestart()", Boolean.valueOf(this.mSportLaunchParams.isRestart()));
        SportLaunchParams sportLaunchParams = this.mSportLaunchParams;
        if (sportLaunchParams != null && sportLaunchParams.isRestart()) {
            MotionPathSimplify motionPathSimplifyA = jac.a(BaseApplication.b(), "simplemotion_temp.txt");
            boolean z = false;
            if (motionPathSimplifyA != null) {
                if (this.mSportLaunchParams.getSportType() == motionPathSimplifyA.requestSportType() && this.mSportLaunchParams.getDataSource() == motionPathSimplifyA.requestSportDataSource()) {
                    z = true;
                }
                if (z) {
                    LogUtil.a(TAG, "isSameSport");
                    this.mMotionPathSimplify = motionPathSimplifyA;
                }
                LogUtil.a(TAG, "mMotionPathSimplify", this.mMotionPathSimplify.toString());
            }
            MotionPath motionPathE = jac.e(BaseApplication.b(), this.mSportLaunchParams.getSportType());
            if (motionPathE != null && z) {
                LogUtil.a(TAG, "isSameSport mMotionPath", motionPathE.toString());
                this.mMotionPath = motionPathE;
            }
            ReleaseLogUtil.d(TAG, "restoreSportData result:", Boolean.valueOf(z));
        }
        deleteFile();
    }

    public Object getData(String str) {
        MotionPathSimplify motionPathSimplify;
        if (JsUtil.DataFunc.MOTION_PATH_DATA.equals(str)) {
            return this.mMotionPath;
        }
        if ("MOTION_PATH_SIMPLIFY_DATA".equals(str)) {
            return this.mMotionPathSimplify;
        }
        if ("TEMP_ALL_STAGE_DATA".equals(str) && (motionPathSimplify = this.mMotionPathSimplify) != null) {
            return motionPathSimplify.getTemporaryData();
        }
        LogUtil.j(TAG, "get storage data with error tag:", str);
        return null;
    }

    public void stagingData(String str, Object obj) {
        if (JsUtil.DataFunc.MOTION_PATH_DATA.equals(str)) {
            if (obj instanceof MotionPath) {
                this.mMotionPath = (MotionPath) obj;
                return;
            }
            return;
        }
        if ("MOTION_PATH_SIMPLIFY_DATA".equals(str) && (obj instanceof MotionPathSimplify)) {
            this.mMotionPathSimplify = (MotionPathSimplify) obj;
        }
        if ("TEMP_ALL_STAGE_DATA".equals(str) && (obj instanceof LinkedHashMap)) {
            this.mMotionPathSimplify.getTemporaryData().putAll((LinkedHashMap) obj);
        }
    }

    public boolean isStorageData(String str) {
        return JsUtil.DataFunc.MOTION_PATH_DATA.equals(str) || "MOTION_PATH_SIMPLIFY_DATA".equals(str) || "TEMP_ALL_STAGE_DATA".equals(str);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        if (this.mSportLaunchParams.isNeedRestart()) {
            this.mIsNeedSaveToFile = true;
        }
        regBoltWearAbnormalStatus();
        ReleaseLogUtil.d(TAG, "onStartSport() sportType is ", Integer.valueOf(this.mSportLaunchParams.getSportType()));
        if (this.mSportLaunchParams.getSportType() == 283) {
            this.mMotionPathSimplify.saveDeviceUuid(dmg.a().getCurrentMacAddress());
            ReleaseLogUtil.d(TAG, "onStartSport() deviceUuid is ", CommonUtil.n(this.mMotionPathSimplify.requestDeviceUuid()));
        } else if (hbv.d(this.mSportLaunchParams.getSportType())) {
            setDeviceUuid(nxs.d().c());
        } else {
            LogUtil.d(TAG, "onStartSport() else");
        }
    }

    private void saveLinkedDevice() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.sportservice.dataproducer.SportDataStorageManager$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1166x2c5d8965();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$saveLinkedDevice$0$com-huawei-health-sportservice-dataproducer-SportDataStorageManager, reason: not valid java name */
    /* synthetic */ void m1166x2c5d8965() {
        LogUtil.a(TAG, "saveLinkedDevice start");
        jxq.c(this.mMotionPathSimplify);
    }

    private void setDeviceUuid(final String str) {
        HiHealthDeviceApi.d(BaseApplication.b()).fetchDataClientByUniqueId(0, str, new HiDataClientListener() { // from class: com.huawei.health.sportservice.dataproducer.SportDataStorageManager$$ExternalSyntheticLambda2
            @Override // com.huawei.hihealth.data.listener.HiDataClientListener
            public final void onResult(List list) {
                this.f$0.m1167x69a57b13(str, list);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$setDeviceUuid$1$com-huawei-health-sportservice-dataproducer-SportDataStorageManager, reason: not valid java name */
    /* synthetic */ void m1167x69a57b13(String str, List list) {
        if (njy.e(list)) {
            LogUtil.a(TAG, "setDeviceUuid clientList is empty");
            return;
        }
        LogUtil.a(TAG, "setDeviceUuid clientList size is ", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((HiHealthClient) it.next()).getHiDeviceInfo() != null) {
                LogUtil.a(TAG, "setDeviceUuid hiHealthClient.getHiDeviceInfo() no null");
                this.mMotionPathSimplify.saveDeviceUuid(str);
                break;
            }
        }
        ReleaseLogUtil.d(TAG, "setDeviceUuid deviceUuid is ", CommonUtil.n(this.mMotionPathSimplify.requestDeviceUuid()));
    }

    private void regBoltWearAbnormalStatus() {
        BaseSportManager.getInstance().setBoltStatusListener(new IBaseResponseCallback() { // from class: com.huawei.health.sportservice.dataproducer.SportDataStorageManager$$ExternalSyntheticLambda1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                LogUtil.a(SportDataStorageManager.TAG, "S-TAG Wear Abnormal Status is false");
            }
        });
    }

    protected void unregBoltWearAbnormalStatus() {
        BaseSportManager.getInstance().unregBoltAbnormalCallback();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        this.mIsNeedSaveToFile = false;
        handleEquipmentCourse();
        saveDataToDatabase(this.mMotionPathSimplify, this.mMotionPath);
        unregBoltWearAbnormalStatus();
    }

    private void handleEquipmentCourse() {
        if (!((Boolean) this.mSportLaunchParams.getExtra("equipment_course", Boolean.class, false)).booleanValue()) {
            LogUtil.a(TAG, "handleEquipmentCourse no equipmentCourse");
            return;
        }
        if (this.mSportLaunchParams.getSportType() == 283) {
            ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).ropeDataSetDeviceType(this.mMotionPathSimplify);
        }
        String str = (String) this.mSportLaunchParams.getExtra("coach_detail_name", String.class);
        String str2 = (String) this.mSportLaunchParams.getExtra("workoutid", String.class);
        LogUtil.a(TAG, "handleEquipmentCourse equipmentCourse courseName: ", str, "courseId:", str2);
        this.mMotionPathSimplify.saveRunCourseId(str2);
        this.mMotionPathSimplify.addExtendDataMap("courseName", str);
        this.mMotionPathSimplify.addExtendDataMap("sportRecordType", String.valueOf(0));
        this.mMotionPathSimplify.addExtendDataMap("attachedRecordType", String.valueOf(1));
    }

    public boolean isToSave() {
        if (((Integer) this.mSportLaunchParams.getExtra("keySportRecordIsToSave", Integer.class, 1)).intValue() == 1 && this.mSportLaunchParams.getDataSource() != 100) {
            if (this.mSportLaunchParams.getSportType() == 283) {
                Object data = BaseSportManager.getInstance().getData("SKIP_NUM_DATA");
                if (!(data instanceof Integer)) {
                    LogUtil.e(TAG, "not jump yet");
                    return false;
                }
                if (this.mSportLaunchParams.getSportTarget() == 8 && this.mMotionPathSimplify != null) {
                    Integer num = (Integer) data;
                    if (num.intValue() < 10) {
                        data = Integer.valueOf(calculateAccumulatedSkipTimes(num.intValue()));
                    }
                }
                return ((Integer) data).intValue() >= 10;
            }
            if (this.mSportLaunchParams.getSportType() == 279) {
                Object data2 = BaseSportManager.getInstance().getData("CALORIES_DATA");
                if (data2 instanceof Integer) {
                    return ((Integer) data2).intValue() > 0;
                }
                LogUtil.e(TAG, "not sport yet");
                return false;
            }
            Object data3 = BaseSportManager.getInstance().getData("DISTANCE_DATA");
            if (!(data3 instanceof Integer)) {
                LogUtil.e(TAG, "not run to data yet");
                return false;
            }
            if (((Integer) data3).intValue() >= 100) {
                return true;
            }
        }
        return false;
    }

    private int calculateAccumulatedSkipTimes(int i) {
        int iIntValue = ((Integer) BaseSportManager.getInstance().getData("SKIPPING_ACCUMULATED_COUNT_DATA")).intValue();
        return ((Integer) BaseSportManager.getInstance().getData("ROPE_MACHINE_STATUS_DATA")).intValue() == 1 ? iIntValue + i : iIntValue;
    }

    private void registerTime() {
        SportDataNotify sportDataNotify = new SportDataNotify() { // from class: com.huawei.health.sportservice.dataproducer.SportDataStorageManager$$ExternalSyntheticLambda0
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1164xfab7e38c(list, map);
            }
        };
        ArrayList arrayList = new ArrayList(1);
        arrayList.add("TIME_FIVE_SECOND_DURATION");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(ComponentName.DATA_STORAGE_MANAGER);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, sportDataNotify);
    }

    /* JADX INFO: renamed from: lambda$registerTime$3$com-huawei-health-sportservice-dataproducer-SportDataStorageManager, reason: not valid java name */
    /* synthetic */ void m1164xfab7e38c(List list, Map map) {
        ExtendHandler extendHandler;
        if (list.contains("TIME_FIVE_SECOND_DURATION") && (map.get("TIME_FIVE_SECOND_DURATION") instanceof Long) && (extendHandler = this.mExtendHandler) != null) {
            extendHandler.sendEmptyMessage(1);
        }
    }

    private void checkSportAbnormal(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            LogUtil.j(TAG, "checkSportAbnormal, motionPathSimplify == null");
            return;
        }
        if (!nyl.c(BaseSportManager.getInstance().getSportType())) {
            LogUtil.j(TAG, "checkSportAbnormal, not need check abnormal data");
            return;
        }
        awr awrVar = new awr();
        awrVar.d(motionPathSimplify.requestPaceMap());
        awrVar.a(motionPathSimplify.requestPaceV2());
        awrVar.b(motionPathSimplify.requestPartTimeMap());
        awrVar.c(motionPathSimplify.requestAvgPace());
        awrVar.c(motionPathSimplify.requestTotalDistance());
        awrVar.b(motionPathSimplify.requestTotalTime());
        awrVar.b(motionPathSimplify.requestTotalSteps());
        awrVar.d(motionPathSimplify.requestAvgStepRate());
        awrVar.e(motionPathSimplify.requestSportType());
        awrVar.d(motionPathSimplify.requestSportDataSource());
        LogUtil.a(TAG, "data source is ", Integer.valueOf(motionPathSimplify.requestSportDataSource()));
        int iD = awx.d(awrVar);
        LogUtil.a(TAG, "abnormal type is ", Integer.valueOf(iD));
        motionPathSimplify.saveAbnormalTrack(iD);
        if (iD != 0) {
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_ABNORMAL_TRAJECTORY_85070016.value(), iD);
        }
    }

    public boolean registerSportDataSavedCallback(String str, ISportDataSaveStatusCallback iSportDataSaveStatusCallback) {
        if (TextUtils.isEmpty(str) || iSportDataSaveStatusCallback == null) {
            LogUtil.e(TAG, "registerSportDataSavedCallback failed. tag: ", str, ". callback is null: ", Boolean.valueOf(iSportDataSaveStatusCallback == null));
            return false;
        }
        LogUtil.a(TAG, "registerSportDataSavedCallback success " + str);
        this.mSportDataSaveStatusCallbacks.put(str, iSportDataSaveStatusCallback);
        return true;
    }

    public boolean unregisterSportDataSavedCallback(String str) {
        if (TextUtils.isEmpty(str) || !this.mSportDataSaveStatusCallbacks.containsKey(str)) {
            LogUtil.e(TAG, "unregisterSportDataSavedCallback " + str + " failed. tag not in");
            return false;
        }
        LogUtil.a(TAG, "unregisterSportDataSavedCallback success " + str);
        this.mSportDataSaveStatusCallbacks.remove(str);
        return true;
    }

    private void notifySportDataSaveStatus(boolean z) {
        LinkedHashMap linkedHashMap;
        LogUtil.a(TAG, "notifySportDataSaveStatus isSaved " + z);
        synchronized (this.mSportDataSaveStatusCallbacks) {
            linkedHashMap = new LinkedHashMap(this.mSportDataSaveStatusCallbacks);
        }
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((ISportDataSaveStatusCallback) it.next()).onFinish(z);
        }
    }

    protected void notifySportDataNotSaved() {
        notifySportDataSaveStatus(false);
    }

    private void notifySportDataSaved() {
        notifySportDataSaveStatus(true);
    }

    protected void saveDataToDatabase(final MotionPathSimplify motionPathSimplify, MotionPath motionPath) {
        LogUtil.a(TAG, "saveDataToDatabase()");
        LogUtil.a(TAG, "mMotionPathSimplify", motionPath.toString());
        if (this.mPluginTrackAdapter != null) {
            if (!isToSave()) {
                LogUtil.a(TAG, "simplify.toString()", motionPathSimplify.toString());
                deleteFile();
                notifySportDataNotSaved();
                return;
            } else {
                checkSportAbnormal(motionPathSimplify);
                deleteFile();
                saveDataToFile(motionPath, motionPathSimplify);
                LogUtil.a(TAG, "data center save DataToDatabase");
                ReleaseLogUtil.d(TAG, "simplify.toString()", motionPathSimplify.toString(), "motionPath", motionPath.toString());
                ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.sportservice.dataproducer.SportDataStorageManager$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1165x6d425eba(motionPathSimplify);
                    }
                });
                return;
            }
        }
        notifySportDataNotSaved();
    }

    /* JADX INFO: renamed from: lambda$saveDataToDatabase$4$com-huawei-health-sportservice-dataproducer-SportDataStorageManager, reason: not valid java name */
    /* synthetic */ void m1165x6d425eba(MotionPathSimplify motionPathSimplify) {
        if (this.mPluginTrackAdapter == null) {
            this.mPluginTrackAdapter = ive.c().a();
        }
        if (this.mPluginTrackAdapter != null) {
            ReleaseLogUtil.d(TAG, "save to db");
            this.mPluginTrackAdapter.saveTrackData(motionPathSimplify, "motion_path2.txt");
        }
        notifySportDataSaved();
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void destroy() {
        this.mExtendHandler.sendEmptyMessage(1);
        stopBackgroundThread();
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void obtainDataAndSaveToFile() {
        if (this.mIsNeedSaveToFile) {
            deleteFile();
            Iterator<BaseProducer> it = this.mProducerMap.values().iterator();
            while (it.hasNext()) {
                it.next().onSaveData();
            }
            saveDataToFile(this.mMotionPath, this.mMotionPathSimplify);
        }
    }

    private void stopBackgroundThread() {
        this.mExtendHandler.quit(true);
    }

    private void saveDataToFile(MotionPath motionPath, MotionPathSimplify motionPathSimplify) {
        LogUtil.a(TAG, "saveDataToFile()");
        jaf.c(BaseApplication.b(), motionPathSimplify, "simplemotion_temp.txt");
        jaf.e(BaseApplication.b(), motionPath, "motion_path2.txt");
    }

    private void deleteFile() {
        jaf.a();
        LogUtil.a(TAG, "deleteFile");
    }
}
