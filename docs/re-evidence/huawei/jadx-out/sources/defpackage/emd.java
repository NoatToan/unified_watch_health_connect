package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.DeviceInfoUtilsApi;
import com.huawei.health.ecologydevice.callback.RopeDeviceDataListener;
import com.huawei.health.ecologydevice.callback.RopeHistoryCallback;
import com.huawei.health.ecologydevice.fitness.datastruct.DeviceInformation;
import com.huawei.health.ecologydevice.fitness.datastruct.RopeModeSettingData;
import com.huawei.health.ecologydevice.fitness.datastruct.SettingStatusData;
import com.huawei.health.ecologydevice.fitness.datastruct.SwitchStatusData;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSportStatDataAggregateOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import health.compact.a.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class emd implements MessageOrStateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DeviceInformation f33172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33173c;
    private String d;
    private HiHealthData e;
    private final String f;
    private elh g;
    private RopeDeviceDataListener h;
    private String i;
    private MotionPathSimplify j;
    private final Runnable k = new Runnable() { // from class: eme
        @Override // java.lang.Runnable
        public final void run() {
            this.e.q();
        }
    };
    private RopeModeSettingData l;
    private HiHealthData m;
    private ehc n;
    private String o;
    private SwitchStatusData q;
    private SettingStatusData s;
    private String t;

    public emd(String str, String str2, RopeDeviceDataListener ropeDeviceDataListener) {
        this.h = ropeDeviceDataListener;
        this.i = str;
        this.t = str2;
        elh elhVarD = ResourceManager.c().d(this.i);
        this.g = elhVarD;
        if (elhVarD != null) {
            LogUtil.d("PDROPE_DeviceDataManager", "Rope device product info:", elhVarD.h());
        }
        this.d = ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).getBondedDeviceAddress(this.i, this.t);
        this.f = "PDROPE_DeviceDataManager" + System.currentTimeMillis();
        if (eqt.c().d()) {
            return;
        }
        LogUtil.a("PDROPE_DeviceDataManager", "isRopeDeviceBtConnected = ", Boolean.valueOf(emh.b().g()));
        if (emh.b().g()) {
            LogUtil.a("PDROPE_DeviceDataManager", "isSameDevice = ", Boolean.valueOf(!TextUtils.isEmpty(this.d) && this.d.equals(emh.b().d())));
            if (!TextUtils.isEmpty(this.d) && this.d.equals(emh.b().d())) {
                r();
                this.f33173c = 2;
                return;
            } else {
                emh.b().h();
                this.f33173c = 0;
                return;
            }
        }
        emh.b().h();
        this.f33173c = 0;
    }

    public void e(String str, String str2) {
        this.i = str;
        this.t = str2;
        elh elhVarD = ResourceManager.c().d(this.i);
        this.g = elhVarD;
        if (elhVarD != null) {
            LogUtil.d("PDROPE_DeviceDataManager", "Rope device product info:", elhVarD.h());
        }
        this.d = ((DeviceInfoUtilsApi) Services.b("PluginDevice", DeviceInfoUtilsApi.class)).getBondedDeviceAddress(this.i, this.t);
    }

    public elh f() {
        return this.g;
    }

    public String g() {
        return this.g.l().d();
    }

    public int c() {
        return this.f33173c;
    }

    public int d() {
        return this.f33171a;
    }

    public String k() {
        return this.o;
    }

    public HiHealthData e() {
        return this.e;
    }

    public MotionPathSimplify i() {
        return this.j;
    }

    public HiHealthData m() {
        return this.m;
    }

    public DeviceInformation b() {
        return this.f33172b;
    }

    public RopeModeSettingData j() {
        return this.l;
    }

    public SettingStatusData n() {
        return this.s;
    }

    public SwitchStatusData o() {
        return this.q;
    }

    public void l() {
        LogUtil.a("PDROPE_DeviceDataManager", "queryLastHistoryData");
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(0L, System.currentTimeMillis());
        hiDataReadOption.setType(new int[]{283});
        hiDataReadOption.setCount(1);
        hiDataReadOption.setSortOrder(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).fetchSequenceDataBySportType(hiDataReadOption, new HiDataReadResultListener() { // from class: emd.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                LogUtil.a("PDROPE_DeviceDataManager", "queryLastHistoryData onResult errorCode:", Integer.valueOf(i));
                if (!(obj instanceof SparseArray)) {
                    LogUtil.j("PDROPE_DeviceDataManager", "error result data");
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (!njy.b(sparseArray.get(i), HiHealthData.class)) {
                    LogUtil.j("PDROPE_DeviceDataManager", "requestTrackSimplifyData onResult obj not instanceof List");
                    emd.this.c((List<HiHealthData>) null);
                } else {
                    List arrayList = new ArrayList();
                    if (sparseArray.get(i) instanceof List) {
                        arrayList = (List) sparseArray.get(i);
                    }
                    emd.this.c((List<HiHealthData>) arrayList);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<HiHealthData> list) {
        if (!njy.e(list)) {
            this.e = list.get(0);
            RopeDeviceDataListener ropeDeviceDataListener = this.h;
            if (ropeDeviceDataListener != null) {
                ropeDeviceDataListener.onNewLastRope();
                return;
            }
            return;
        }
        RopeDeviceDataListener ropeDeviceDataListener2 = this.h;
        if (ropeDeviceDataListener2 != null) {
            ropeDeviceDataListener2.onSetDefaultValue();
        }
    }

    public void e(long j, long j2) {
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(j, j2);
        hiDataReadOption.setType(new int[]{OnRegisterSkinAttrsListener.REGISTER_BY_SCAN});
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: emd.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (!(obj instanceof SparseArray)) {
                    LogUtil.e("PDROPE_DeviceDataManager", "quaryTrackDetailData onResult data not instanceof SparseArray");
                    return;
                }
                SparseArray sparseArray = (SparseArray) obj;
                if (sparseArray.size() <= 0) {
                    LogUtil.e("PDROPE_DeviceDataManager", "quaryTrackDetailData onResult map size is null");
                    return;
                }
                Object obj2 = sparseArray.get(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
                if (!njy.b(obj2, HiHealthData.class)) {
                    LogUtil.e("PDROPE_DeviceDataManager", "quaryTrackDetailData onResult obj not instanceof List");
                    return;
                }
                List list = (List) obj2;
                if (njy.e(list)) {
                    LogUtil.e("PDROPE_DeviceDataManager", "quaryTrackDetailData onResult list is empty");
                    return;
                }
                HiHealthData hiHealthData = (HiHealthData) list.get(0);
                if (hiHealthData == null) {
                    LogUtil.e("PDROPE_DeviceDataManager", "quaryTrackDetailData onResult hiHealthData is null");
                    return;
                }
                emd.this.o = hiHealthData.getSequenceFileUrl();
                LogUtil.a("PDROPE_DeviceDataManager", "mSequenceFileUrl is ", emd.this.o);
                emd emdVar = emd.this;
                emdVar.j = emdVar.b(hiHealthData);
                emd.this.j.saveDeviceType(hiHealthData.getInt("trackdata_deviceType"));
                emd.this.j.saveProductId(hiHealthData.getString("device_prodid"));
                emd.this.j.saveSubProductId(hiHealthData.getString("device_subprodid"));
                if (emd.this.h != null) {
                    emd.this.h.onQuaryTrackDetailDataSuccess();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MotionPathSimplify b(HiHealthData hiHealthData) {
        MotionPathSimplify motionPathSimplify = new MotionPathSimplify();
        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) qqt.e(hiHealthData.getMetaData(), HiTrackMetaData.class);
        d(hiHealthData, motionPathSimplify, hiTrackMetaData);
        e(motionPathSimplify, hiTrackMetaData);
        return motionPathSimplify;
    }

    private void e(MotionPathSimplify motionPathSimplify, HiTrackMetaData hiTrackMetaData) {
        motionPathSimplify.saveIsNewCoordinate(hiTrackMetaData.getIsNewCoordinate());
        motionPathSimplify.saveSwimSegments(hiTrackMetaData.getSwimSegments());
        motionPathSimplify.saveBritishSwimSegments(hiTrackMetaData.getBritishSwimSegments());
        motionPathSimplify.saveSwolfBase(hiTrackMetaData.getSwolfBase());
        motionPathSimplify.saveBritishSwolfBase(hiTrackMetaData.getBritishSwolfBase());
        motionPathSimplify.saveMaxAltitude(hiTrackMetaData.getMaxAlti());
        motionPathSimplify.saveMinAltitude(hiTrackMetaData.getMinAlti());
        motionPathSimplify.saveTotalDescent(hiTrackMetaData.getTotalDescent());
        motionPathSimplify.saveFreeMotion(hiTrackMetaData.getIsFreeMotion());
        motionPathSimplify.saveSportDataSource(hiTrackMetaData.getSportDataSource());
        motionPathSimplify.saveChiefSportDataType(hiTrackMetaData.getChiefSportDataType());
        motionPathSimplify.saveHasTrackPoint(hiTrackMetaData.getHasTrackPoint());
        motionPathSimplify.saveAbnormalTrack(hiTrackMetaData.getAbnormalTrack());
        motionPathSimplify.saveExtendDataMap(hiTrackMetaData.getExtendTrackMap());
        motionPathSimplify.saveDuplicated(hiTrackMetaData.getDuplicated());
        motionPathSimplify.saveHeartRateZoneType(hiTrackMetaData.getHeartrateZoneType());
        motionPathSimplify.saveRunCourseId(hiTrackMetaData.getRuncourseId());
        motionPathSimplify.saveChildSportItems(hiTrackMetaData.getChildSportItems());
        motionPathSimplify.saveFatherSportItem(hiTrackMetaData.getFatherSportItem());
        motionPathSimplify.saveMaxSpo2(hiTrackMetaData.getMaxSpo2());
        motionPathSimplify.saveMinSpo2(hiTrackMetaData.getMinSpo2());
    }

    private void d(HiHealthData hiHealthData, MotionPathSimplify motionPathSimplify, HiTrackMetaData hiTrackMetaData) {
        motionPathSimplify.saveTrackType(hiTrackMetaData.getTrackType());
        motionPathSimplify.saveTotalTime(hiTrackMetaData.getTotalTime());
        motionPathSimplify.saveTotalDistance(hiTrackMetaData.getTotalDistance());
        motionPathSimplify.saveAvgHeartRate(hiTrackMetaData.getAvgHeartRate());
        motionPathSimplify.saveAvgStepRate(hiTrackMetaData.getAvgStepRate());
        motionPathSimplify.saveTotalCalories(hiTrackMetaData.getTotalCalories());
        motionPathSimplify.saveSportId(hiTrackMetaData.getSportId());
        motionPathSimplify.saveSportType(hiTrackMetaData.getSportType());
        motionPathSimplify.saveTotalSteps(hiTrackMetaData.getTotalSteps());
        motionPathSimplify.saveBestStepRate(hiTrackMetaData.getBestStepRate());
        motionPathSimplify.saveMaxHeartRate(hiTrackMetaData.getMaxHeartRate());
        motionPathSimplify.saveEndTime(hiHealthData.getEndTime());
        motionPathSimplify.saveStartTime(hiHealthData.getStartTime());
        motionPathSimplify.saveSportData(hiTrackMetaData.getWearSportData());
        c(hiTrackMetaData, motionPathSimplify);
    }

    private void c(HiTrackMetaData hiTrackMetaData, MotionPathSimplify motionPathSimplify) {
        motionPathSimplify.saveAvgPace(hiTrackMetaData.getAvgPace());
        motionPathSimplify.saveBestPace(hiTrackMetaData.getBestPace());
        motionPathSimplify.savePaceMap(hiTrackMetaData.getPaceMap());
        motionPathSimplify.saveBritishPaceMap(hiTrackMetaData.getBritishPaceMap());
        motionPathSimplify.savePartTimeMap(hiTrackMetaData.getPartTimeMap());
        motionPathSimplify.saveBritishPartTimeMap(hiTrackMetaData.getBritishPartTimeMap());
        motionPathSimplify.saveCreepingWave(hiTrackMetaData.getCreepingWave());
    }

    @Override // com.huawei.btsportdevice.callback.MessageOrStateCallback
    public void onNewMessage(int i, Bundle bundle) {
        if (i == 901) {
            LogUtil.a("PDROPE_DeviceDataManager", "in onNewMessage, newCase is INIT_ALL_VARS_IN_SERVICE");
            return;
        }
        if (i != 902) {
            if (i == 1000 || i == 1001) {
                LogUtil.a("PDROPE_DeviceDataManager", "rope sport status change");
                RopeDeviceDataListener ropeDeviceDataListener = this.h;
                if (ropeDeviceDataListener != null) {
                    ropeDeviceDataListener.onRopeSportStatusChange(i);
                    return;
                }
                return;
            }
            LogUtil.a("PDROPE_DeviceDataManager", "in onNewMessage, newCase is ", Integer.valueOf(i));
            return;
        }
        if (bundle == null) {
            return;
        }
        LogUtil.a("PDROPE_DeviceDataManager", "in onNewMessage, newCase is DATA_AVAILABLE");
        int i2 = bundle.getInt("com.huawei.health.fitness.KEY_MESSAGE_FITNESS_DATA_TYPE");
        Serializable serializable = bundle.getSerializable("com.huawei.health.fitness.KEY_MESSAGE_FOR_CALLBACK_FITNESS_DATA");
        LogUtil.d("PDROPE_DeviceDataManager", "onNewMessage DATA_AVAILABLE:", serializable);
        if (serializable instanceof HashMap) {
            c(i2, (HashMap<Integer, Object>) serializable);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    @Override // com.huawei.btsportdevice.callback.MessageOrStateCallback
    public void onStateChange(String str) {
        byte b2;
        LogUtil.a("PDROPE_DeviceDataManager", "onStateChange:", str);
        str.hashCode();
        switch (str) {
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_DISCONNECTED":
                b2 = 0;
                break;
            case "com.huawei.btsportdevice.ACTION_SERVICE_DISCOVERIED":
                b2 = 1;
                break;
            case "com.huawei.btsportdevice.ACTION_READ_SUCCESS":
                b2 = 2;
                break;
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_RECONNECTING":
                b2 = 3;
                break;
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_DISCONNECTING":
                b2 = 4;
                break;
            case "com.huawei.btsportdevice.ACTION_GATT_STATE_CONNECTING":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            this.f33173c = 0;
        } else if (b2 == 1) {
            LogUtil.d("PDROPE_DeviceDataManager", "ACTION_SERVICE_DISCOVERIED");
        } else if (b2 == 2) {
            LogUtil.d("PDROPE_DeviceDataManager", "ACTION_READ_SUCCESS");
            this.f33173c = 2;
            if ("DeviceMainActivity".equals(esh.e())) {
                q();
            }
        } else if (b2 == 3) {
            this.f33173c = 1;
        } else if (b2 == 4) {
            this.f33173c = 3;
        } else if (b2 == 5) {
            this.f33173c = 1;
        }
        RopeDeviceDataListener ropeDeviceDataListener = this.h;
        if (ropeDeviceDataListener != null) {
            ropeDeviceDataListener.onNewDeviceState();
        }
    }

    private void c(int i, HashMap<Integer, Object> map) {
        LogUtil.d("PDROPE_DeviceDataManager", "dataType", Integer.valueOf(i), " flushAndHandleData: rawData:", map);
        if (map == null) {
            return;
        }
        if (i == 20) {
            LogUtil.a("PDROPE_DeviceDataManager", "Get history data");
            a(map);
            return;
        }
        if (i == 21) {
            LogUtil.a("PDROPE_DeviceDataManager", "Get battery status");
            this.f33171a = e(map.get(20017));
            RopeDeviceDataListener ropeDeviceDataListener = this.h;
            if (ropeDeviceDataListener != null) {
                ropeDeviceDataListener.onNewBatteryState();
                return;
            }
            return;
        }
        if (i == 23) {
            LogUtil.a("PDROPE_DeviceDataManager", "Get device info");
            this.f33172b = b(map);
            RopeDeviceDataListener ropeDeviceDataListener2 = this.h;
            if (ropeDeviceDataListener2 != null) {
                ropeDeviceDataListener2.onNewDeviceInfo();
                return;
            }
            return;
        }
        if (i == 24) {
            LogUtil.a("PDROPE_DeviceDataManager", "Get training status");
            g(map);
        } else {
            if (i == 27) {
                LogUtil.a("PDROPE_DeviceDataManager", "Get rope mode setting");
                c(map);
                RopeDeviceDataListener ropeDeviceDataListener3 = this.h;
                if (ropeDeviceDataListener3 != null) {
                    ropeDeviceDataListener3.onSetRopeMode();
                    return;
                }
                return;
            }
            d(i, map);
        }
    }

    private void d(int i, HashMap<Integer, Object> map) {
        if (i == 25) {
            LogUtil.a("PDROPE_DeviceDataManager", "Get rope config switch");
            d(map);
            RopeDeviceDataListener ropeDeviceDataListener = this.h;
            if (ropeDeviceDataListener != null) {
                ropeDeviceDataListener.onRopeConfigSwitch();
                return;
            }
            return;
        }
        if (i != 26) {
            LogUtil.a("PDROPE_DeviceDataManager", "Ignore message");
            return;
        }
        LogUtil.a("PDROPE_DeviceDataManager", "Get rope config setting");
        e(map);
        RopeDeviceDataListener ropeDeviceDataListener2 = this.h;
        if (ropeDeviceDataListener2 != null) {
            ropeDeviceDataListener2.onRopeConfigSetting();
        }
    }

    private void g(HashMap<Integer, Object> map) {
        RopeDeviceDataListener ropeDeviceDataListener;
        Integer numValueOf = Integer.valueOf(SmartMsgConstant.MSG_TYPE_SLEEP_USER);
        if (map.get(numValueOf) == null) {
            LogUtil.j("PDROPE_DeviceDataManager", "training status data error");
        } else {
            if (((Integer) map.get(numValueOf)).intValue() != 1 || this.l == null || System.currentTimeMillis() - this.l.getReceiveTimeMillis() > 1000 || (ropeDeviceDataListener = this.h) == null) {
                return;
            }
            ropeDeviceDataListener.onReverseControl();
        }
    }

    private void c(HashMap<Integer, Object> map) {
        this.l = new RopeModeSettingData();
        if (map.get(20008) != null) {
            this.l.setOpCode(((Integer) map.get(20008)).intValue());
        }
        if (map.get(40048) != null) {
            this.l.setReceiveTimeMillis(((Long) map.get(40048)).longValue());
        }
        if (map.get(40049) != null) {
            this.l.setConfigTimeJumpTime(((Integer) map.get(40049)).intValue());
        }
        if (map.get(40050) != null) {
            this.l.setConfigNumberJumpCount(((Integer) map.get(40050)).intValue());
        }
        if (map.get(40055) != null) {
            this.l.setConfigIntermittentJumpTime(((Integer) map.get(40055)).intValue());
        }
        if (map.get(40053) != null) {
            this.l.setConfigIntermittentJumpSingleCount(((Integer) map.get(40053)).intValue());
        }
        if (map.get(40056) != null) {
            this.l.setConfigIntermittentJumpResetTime(((Integer) map.get(40056)).intValue());
        }
        if (map.get(40054) != null) {
            this.l.setConfigIntermittentJumpCount(((Integer) map.get(40054)).intValue());
        }
        if (map.get(40060) != null) {
            this.l.setCourseId(((Integer) map.get(40060)).intValue());
        }
        if (map.get(40070) != null) {
            this.l.setMusicId(((Integer) map.get(40070)).intValue());
        }
    }

    private void e(HashMap<Integer, Object> map) {
        if (this.s == null) {
            this.s = new SettingStatusData();
        }
        if (map.get(40042) != null) {
            this.s.setWeight(((Integer) map.get(40042)).intValue());
        }
        if (map.get(40043) != null) {
            this.s.setHeight(((Integer) map.get(40043)).intValue());
        }
        if (map.get(40044) != null) {
            this.s.setSex(((Integer) map.get(40044)).intValue());
        }
        if (map.get(40037) != null) {
            this.s.setSettingBestNumberSingleJumps(((Integer) map.get(40037)).intValue());
        }
        if (map.get(40038) != null) {
            this.s.setSettingBestNumberConsecutiveJumps(((Integer) map.get(40038)).intValue());
        }
        if (map.get(40039) != null) {
            this.s.setSettingBestSkippingDuration(((Integer) map.get(40039)).intValue());
        }
        if (map.get(40040) != null) {
            this.s.setSettingBestSkippingSpeed(((Integer) map.get(40040)).intValue());
        }
    }

    private void d(HashMap<Integer, Object> map) {
        if (this.q == null) {
            this.q = new SwitchStatusData();
        }
        Object obj = map.get(40022);
        if (obj instanceof String) {
            this.q.setBrMacAddress((String) obj);
        }
        Object obj2 = map.get(40023);
        if (obj2 instanceof Boolean) {
            this.q.setOpenBr(((Boolean) obj2).booleanValue());
        }
    }

    public void a(HashMap<Integer, Object> map) {
        if (!(map.get(1) instanceof ehg)) {
            LogUtil.j("PDROPE_DeviceDataManager", "Get history data ERROR");
            return;
        }
        ehg ehgVar = (ehg) map.get(1);
        if (this.n == null) {
            this.n = new ehc(this.t, new RopeHistoryCallback() { // from class: emd.2
                @Override // com.huawei.health.ecologydevice.callback.RopeHistoryCallback
                public void mergeHistorySuccess(long j) {
                    emd.this.d(j);
                }

                @Override // com.huawei.health.ecologydevice.callback.RopeHistoryCallback
                public void uploadHistorySuccess() {
                    LogUtil.d("PDROPE_DeviceDataManager", "uploadHistorySuccess");
                    emd.this.l();
                }
            });
        }
        this.n.b(ehgVar);
        Object obj = map.get(0);
        if (!(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) {
            return;
        }
        this.n.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> int e(T t) {
        if (!(t instanceof Integer)) {
            return 0;
        }
        int iIntValue = ((Integer) t).intValue();
        if (iIntValue > 100) {
            return 100;
        }
        if (iIntValue < 0) {
            return 0;
        }
        LogUtil.a("PDROPE_DeviceDataManager", "parseBatteryState else");
        return iIntValue;
    }

    private DeviceInformation b(HashMap<Integer, Object> map) {
        DeviceInformation deviceInformation = new DeviceInformation();
        deviceInformation.setDeviceType(((Integer) map.get(20005)).intValue());
        deviceInformation.setManufacturerString(String.valueOf(map.get(20006)));
        deviceInformation.setModelString(String.valueOf(map.get(20007)));
        deviceInformation.setSerialNumber(String.valueOf(map.get(20010)));
        deviceInformation.setHardwareVersion(String.valueOf(map.get(Integer.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI))));
        deviceInformation.setSoftwareVersion(String.valueOf(map.get(Integer.valueOf(CapabilityStatus.AWA_CAP_CODE_APPLICATION))));
        return deviceInformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(long j) {
        if (this.g == null) {
            return;
        }
        HashMap map = new HashMap(5);
        String strT = this.g.t();
        String strC = etn.c(strT);
        map.put("kind_name", this.g.m().name());
        map.put("productId", strT);
        map.put("device_name", strC);
        map.put("data_type", 283);
        map.put("duration_time", String.valueOf(j));
        map.put("prodId", era.b(strT));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_ROPE_DEVICE_DATA_2170022.value(), map, 0);
    }

    public void a() {
        if (TextUtils.isEmpty(this.d)) {
            LogUtil.j("PDROPE_DeviceDataManager", "connectToDevice mDeviceMacAddress isEmpty");
            return;
        }
        LogUtil.a("PDROPE_DeviceDataManager", "connectToDevice enter");
        emh.b().j();
        emh.b().c(this.i);
        r();
        emh.b().a(true, this.d);
        this.f33173c = 1;
        RopeDeviceDataListener ropeDeviceDataListener = this.h;
        if (ropeDeviceDataListener != null) {
            ropeDeviceDataListener.onNewDeviceState();
        }
    }

    private void r() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(21);
        arrayList.add(23);
        arrayList.add(20);
        arrayList.add(24);
        arrayList.add(27);
        arrayList.add(26);
        arrayList.add(25);
        emh.b().a(this.f, this, false, arrayList);
    }

    public void q() {
        emh.b().c(2, 0, null);
        LogUtil.d("PDROPE_DeviceDataManager", "CONTROL BATTERY_STATUS");
        emh.b().c(3, 7, new int[]{0});
        emh.b().b(6, 1, new int[0]);
    }

    public void p() {
        emh.b().e(this.f);
        ThreadPoolManager.c().execute(this.k);
        LogUtil.d("PDROPE_DeviceDataManager", "CONTROL QUERY DEVICE DATA");
    }

    public void s() {
        emh.b().b(1, 2, new int[0]);
        LogUtil.d("PDROPE_DeviceDataManager", "CONTROL OPEN BR DATA");
    }

    public void a(Context context, long j, long j2, int i) {
        HiSportStatDataAggregateOption hiSportStatDataAggregateOption = new HiSportStatDataAggregateOption();
        hiSportStatDataAggregateOption.setSortOrder(1);
        hiSportStatDataAggregateOption.setStartTime(j);
        hiSportStatDataAggregateOption.setEndTime(j2);
        hiSportStatDataAggregateOption.setAggregateType(1);
        hiSportStatDataAggregateOption.setHiHealthTypes(new int[]{i});
        hiSportStatDataAggregateOption.setGroupUnitType(5);
        hiSportStatDataAggregateOption.setConstantsKey(new String[]{"Track_Walk_Calorie_Sum", "Track_Walk_Duration_Sum", "Track_Walk_Count_Sum", "Track_Walk_Step_Sum"});
        hiSportStatDataAggregateOption.setType(new int[]{3, 4, 5, 12});
        hiSportStatDataAggregateOption.setReadType(0);
        HiHealthNativeApi.a(context).aggregateSportStatData(hiSportStatDataAggregateOption, new HiAggregateListener() { // from class: emd.4
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i2, List<HiHealthData> list, int i3, int i4) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i2, int i3) {
                if (njy.e(list)) {
                    LogUtil.j("PDROPE_DeviceDataManager", "requestTrackMonthData() all run data null or empty");
                    return;
                }
                emd.this.m = list.get(0);
                emd.this.h.onRopeMonthDataSuccess();
            }
        });
    }

    public void e(int i, int[] iArr) {
        emh.b().b(3, i, iArr);
    }

    public void h() {
        emh.b().b(6, 2, new int[0]);
    }

    public void t() {
        this.h = null;
        ThreadPoolManager.c().e(this.k);
        ehc ehcVar = this.n;
        if (ehcVar != null) {
            ehcVar.c((RopeHistoryCallback) null);
        }
        emh.b().a(this.f, false);
    }
}
