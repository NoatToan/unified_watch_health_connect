package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.weight.WeightApi;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import health.compact.a.CommonUtil;
import health.compact.a.HEXUtils;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class nag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static nag f42817b;
    private static final Object d = new Object();
    private List<Integer> e;

    public static nag c() {
        nag nagVar;
        synchronized (d) {
            if (f42817b == null) {
                LogUtil.a("HwSyncWeightManager", "getInstance()");
                f42817b = new nag();
            }
            nagVar = f42817b;
        }
        return nagVar;
    }

    private nag() {
        LogUtil.a("R_Weight_HwSyncWeightManager", "HwSyncWeightManager");
        b();
        d();
        a();
        c("900300022");
        c("900300023");
    }

    public void a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(103);
        arrayList.add(Integer.valueOf(HiSubscribeType.f12259a));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.DIET_RECORD_SET.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.RESTING_METABOLISM_SET.value()));
        HiHealthNativeApi.a(BaseApplication.getContext()).subscribeHiHealthData(arrayList, new HiSubscribeListener() { // from class: nag.3
            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onResult(List<Integer> list, List<Integer> list2) {
                nag.this.e = list;
                LogUtil.a("HwSyncWeightManager", "onResult:", list);
            }

            @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
            public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
                LogUtil.a("HwSyncWeightManager", "onChange changeKey.", str, " type ", Integer.valueOf(i));
                if (i == 103) {
                    if ("900300022".equals(str) || "900300023".equals(str)) {
                        nag.this.c(str);
                        ((WeightApi) Services.b("Main", WeightApi.class)).refreshDietOverview(DateFormatUtil.a(System.currentTimeMillis()));
                        nag.this.a("_subscribeHealthDataListener_" + str, i, (DeviceInfo) null);
                        return;
                    }
                    return;
                }
                if (i == HiSubscribeType.f12259a) {
                    nag.this.b(System.currentTimeMillis() - 604800000);
                    return;
                }
                if (i == DicDataTypeUtil.DataType.DIET_RECORD_SET.value() && "sync download".equals(str)) {
                    ezn.b(0L, 0L, myk.a("HwSyncWeightManager"));
                    nag.this.a("_subscribeHealthDataListener_" + str, i, (DeviceInfo) null);
                    return;
                }
                if (i == DicDataTypeUtil.DataType.RESTING_METABOLISM_SET.value() && ArkUIXConstants.INSERT.equals(str)) {
                    iun.i();
                    nkf.c(OperationKey.HEALTH_APP_WEIGHT_LOSS_SHAPING_SERVICE_2129034, "HwSyncWeightManager_subscribeHealthDataListener_" + str, 0, (DeviceInfo) null);
                    iuo.p();
                    ezn.b(System.currentTimeMillis(), System.currentTimeMillis(), myk.a("HwSyncWeightManager"));
                    nag.this.a("_subscribeHealthDataListener_" + str, i, (DeviceInfo) null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        LogUtil.a("HwSyncWeightManager", "updateLatestWeightData");
        nkf.a().b(j, new IBaseResponseCallback() { // from class: nag.5
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 100001 || !(obj instanceof HiHealthData)) {
                    LogUtil.e("HwSyncWeightManager", "objData is null");
                    return;
                }
                HiHealthData hiHealthData = (HiHealthData) obj;
                if (i != 0) {
                    if (i == 100002) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(nag.this.b(DicDataTypeUtil.DataType.BODY_WEIGHT.value(), hiHealthData.getDouble("bodyWeight")));
                        nag.this.d(arrayList, hiHealthData);
                        return;
                    }
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(nag.this.b(DicDataTypeUtil.DataType.BODY_WEIGHT.value(), hiHealthData.getDouble("bodyWeight")));
                arrayList2.add(nag.this.b(DicDataTypeUtil.DataType.BODY_FAT_RATE.value(), hiHealthData.getDouble(BleConstants.BODY_FAT_RATE)));
                arrayList2.add(nag.this.b(DicDataTypeUtil.DataType.BASAL_METABOLISM.value(), hiHealthData.getDouble(BleConstants.BASAL_METABOLISM)));
                arrayList2.add(nag.this.b(DicDataTypeUtil.DataType.SKELETAL_MUSCLEL_MASS.value(), hiHealthData.getDouble("skeletalMusclelMass")));
                nag.this.d(arrayList2, hiHealthData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public eed b(int i, double d2) {
        eed eedVar = new eed();
        eedVar.e(i);
        eedVar.a(eeq.e(d2));
        return eedVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public eed e(int i, int i2) {
        eed eedVar = new eed();
        eedVar.e(i);
        eedVar.a(eeq.h(i2));
        return eedVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final String str) {
        LogUtil.a("HwSyncWeightManager", "updateWeightDataToDevice ", str);
        nkf.a().a(MatterDataContans.TYPE_HEALTH, str, new HiDataReadResultListener() { // from class: nag.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (!njy.b(obj, HiSampleConfig.class)) {
                    ReleaseLogUtil.e("R_Weight_HwSyncWeightManager", "onResult objData is not instanceof HiSampleConfig");
                    return;
                }
                if (i == 2) {
                    ReleaseLogUtil.e("R_Weight_HwSyncWeightManager", "just in transferring");
                    return;
                }
                List list = (List) obj;
                if (njy.e(list)) {
                    LogUtil.j("HwSyncWeightManager", "onResult list is empty");
                    return;
                }
                HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                if (hiSampleConfig == null) {
                    ReleaseLogUtil.e("R_Weight_HwSyncWeightManager", "updateWeightDataToDevice sampleConfig is null");
                    return;
                }
                String configData = hiSampleConfig.getConfigData();
                long modifiedTime = hiSampleConfig.getModifiedTime();
                LogUtil.a("HwSyncWeightManager", "updateWeightDataToDevice configId ", str, " modifiedTime ", Long.valueOf(modifiedTime), " configData ", configData);
                if ("900300023".equals(str)) {
                    nag.this.a(configData, modifiedTime, str);
                    return;
                }
                if ("900300022".equals(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(configData);
                        jSONObject.getInt("weightGoal");
                        nag.this.a(myk.a("HwSyncWeightManager"), jSONObject.getDouble("weightGoal"), modifiedTime);
                    } catch (JSONException unused) {
                        LogUtil.e("HwSyncWeightManager", "parse exception when get weight goal");
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j, String str2) {
        ivd ivdVar = (ivd) HiJsonUtil.d(str, ivd.class);
        iuv iuvVarA = ivdVar.a();
        if (iuvVarA == null) {
            iuvVarA = ((WeightApi) Services.b("Main", WeightApi.class)).getOnePointFull(ivdVar.i());
        }
        if (iuvVarA != null) {
            ivdVar.c(iuvVarA);
        }
        if (ivdVar.d() == null) {
            iux iuxVar = new iux();
            iuxVar.e(1);
            iuxVar.e(0.0f);
            iuxVar.a(0.0f);
            iuxVar.a(0);
            ivdVar.e(iuxVar);
        }
        d(myk.a("HwSyncWeightManager"), ivdVar, j);
        ezn.b(System.currentTimeMillis(), System.currentTimeMillis(), myk.a("HwSyncWeightManager"));
        a("_updateWeightDataToDevice_" + str2, 0, (DeviceInfo) null);
    }

    public void b() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.weightMgr", new DataReceiveCallback() { // from class: nag.2
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
                ReleaseLogUtil.d("R_Weight_HwSyncWeightManager", "receive device event.", Integer.valueOf(i));
                if (eecVar instanceof eee) {
                    eee eeeVar = (eee) eecVar;
                    LogUtil.a("HwSyncWeightManager", "message instanceof SampleEvent.", eeeVar.toString());
                    nag.this.a(myk.a("HwSyncWeightManager"), eeeVar);
                } else if (eecVar instanceof eef) {
                    eef eefVar = (eef) eecVar;
                    LogUtil.a("HwSyncWeightManager", "message instanceof SampleConfig.", eefVar.toString());
                    nag.this.c(eefVar);
                } else {
                    if (eecVar instanceof eea) {
                        eea eeaVar = (eea) eecVar;
                        LogUtil.a("HwSyncWeightManager", "message instanceof DictionaryPointInfo.", eeaVar.toString());
                        nag.this.d(eeaVar);
                        return;
                    }
                    ReleaseLogUtil.d("R_Weight_HwSyncWeightManager", "diet receive unrecognized message.");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(eea eeaVar) {
        LogUtil.d("HwSyncWeightManager", "sampleConfig is:", eeaVar);
        if (eeaVar.c() != DicDataTypeUtil.DataType.RESTING_METABOLISM_SET.value()) {
            ReleaseLogUtil.e("R_Weight_HwSyncWeightManager", "onDataReceived, message dictTypeId", Long.valueOf(eeaVar.c()));
            return;
        }
        eeb eebVar = eeaVar.e().get(0);
        if (eebVar == null) {
            LogUtil.j("HwSyncWeightManager", "getDataInfoList onResult pointInfo is null");
            return;
        }
        nkf.a().d(eebVar.e(), eebVar.c(), new IBaseResponseCallback() { // from class: nag.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (!njy.b(obj, HiHealthData.class)) {
                    LogUtil.j("HwSyncWeightManager", "objData is not instance Of List<HiHealthData>");
                    return;
                }
                LogUtil.a("HwSyncWeightManager", "HistoryRestMetaData is ", obj);
                ArrayList arrayList = new ArrayList();
                for (HiHealthData hiHealthData : (List) obj) {
                    ArrayList arrayList2 = new ArrayList();
                    eeb eebVar2 = new eeb();
                    eebVar2.c(hiHealthData.getStartTime());
                    eebVar2.d(hiHealthData.getEndTime());
                    eebVar2.a(hiHealthData.getModifiedTime());
                    if (hiHealthData.getInt("basalMetabolismAfterExercise") != 0) {
                        arrayList2.add(nag.this.e(DicDataTypeUtil.DataType.RESTING_METABOLISM.value(), hiHealthData.getInt("basalMetabolismAfterExercise")));
                    } else {
                        arrayList2.add(nag.this.e(DicDataTypeUtil.DataType.RESTING_METABOLISM.value(), hiHealthData.getInt(BleConstants.BASAL_METABOLISM)));
                    }
                    eebVar2.e(arrayList2);
                    arrayList.add(eebVar2);
                }
                if (njy.b(arrayList)) {
                    nag.this.e(arrayList);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(eef eefVar) {
        List<eeg> configInfoList = eefVar.getConfigInfoList();
        if (njy.e(configInfoList) || configInfoList.get(0) == null) {
            ReleaseLogUtil.d("R_Weight_HwSyncWeightManager", "infoList empty");
            return;
        }
        long jLongValue = configInfoList.get(0).b().longValue();
        long jC = configInfoList.get(0).c();
        nkf.a().d(MatterDataContans.TYPE_HEALTH, String.valueOf(jC), HEXUtils.b(HEXUtils.a(configInfoList.get(0).e())), jLongValue, true);
    }

    public void d() {
        edc.e().registerDeviceSampleListener("hw.unitedevice.common", new DataReceiveCallback() { // from class: nag.9
            @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
            public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
                ReleaseLogUtil.d("R_Weight_HwSyncWeightManager", "receive device event.", Integer.valueOf(i));
                if (eecVar instanceof eee) {
                    eee eeeVar = (eee) eecVar;
                    LogUtil.a("HwSyncWeightManager", "message instanceof SampleEvent.", eeeVar.toString());
                    nag.this.a(myk.a("HwSyncWeightManager"), eeeVar);
                    return;
                }
                ReleaseLogUtil.d("R_Weight_HwSyncWeightManager", "vip flag receive unrecognized message.");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DeviceInfo deviceInfo, eee eeeVar) {
        long jD = eeeVar.d();
        if (jD != 80030003) {
            if (jD == 80030004) {
                LogUtil.j("HwSyncWeightManager", "onDataReceived eventId not support:", Long.valueOf(jD));
                ezn.d(deviceInfo, eeeVar);
                return;
            }
            return;
        }
        LogUtil.j("HwSyncWeightManager", "onDataReceived eventId not support:", Long.valueOf(jD));
        byte[] bArrC = eeeVar.c();
        if (bArrC == null) {
            LogUtil.j("HwSyncWeightManager", "onDataReceived eventData is null");
            return;
        }
        String strB = HEXUtils.b(HEXUtils.a(bArrC));
        LogUtil.a("HwSyncWeightManager", "onDataReceived data:", strB);
        try {
            JSONObject jSONObject = new JSONObject(strB);
            long j = jSONObject.getLong("startTime");
            long j2 = jSONObject.getLong("endTime");
            int i = jSONObject.getInt("event");
            LogUtil.a("HwSyncWeightManager", "requestType:", Integer.valueOf(i), " startTime:", Long.valueOf(j), " endTime:", Long.valueOf(j2));
            if (i == 1) {
                long jC = ift.c(j, 0);
                if (j > jC) {
                    j = jC;
                }
                ezn.b(j, j2, deviceInfo);
                a("_processEventData_" + i, i, deviceInfo);
            } else if (i == 4) {
                d(deviceInfo, 1);
            } else if (i == 5) {
                b(j);
            } else if (i == 6) {
                c(deviceInfo, strB);
                a("_processEventData_" + i, i, deviceInfo);
            }
        } catch (JSONException unused) {
            ReleaseLogUtil.a("R_Weight_HwSyncWeightManager", "parse json exception");
        }
    }

    private void c(final DeviceInfo deviceInfo, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("meals");
            long j = jSONObject.getLong("startTime");
            ArrayList arrayList = (ArrayList) HiJsonUtil.d(string, new TypeToken<ArrayList<vgw>>() { // from class: com.huawei.hwdevice.phoneprocess.mgr.hwweightmgr.HwSyncWeightManager$7
            }.getType());
            final long jA = a(arrayList);
            if (njy.e(arrayList)) {
                LogUtil.j("HwSyncWeightManager", "deviceFastRecordMeal get meals is null");
                e(deviceInfo, j, 0);
            } else {
                iun.a(d(arrayList), new ResponseCallback<List<vgo>>() { // from class: nag.10
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
                    public void onResponse(int i, List<vgo> list) {
                        LogUtil.a("HwSyncWeightManager", "recordMeals errorCode is : ", Integer.valueOf(i), "time is : ", Long.valueOf(jA));
                        nag.this.e(deviceInfo, jA, i);
                    }
                });
            }
        } catch (JsonSyntaxException | JSONException e) {
            LogUtil.e("HwSyncWeightManager", "JsonSyntaxException in deviceFastRecordMeal: ", e.getMessage());
        }
    }

    private List<vgw> d(List<vgw> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            vgw vgwVar = list.get(i);
            if (vgwVar.i() == 0) {
                LogUtil.a("HwSyncWeightManager", "whichMeal is 0, error");
            } else {
                vgwVar.d(vgwVar.j() * 1000);
                if (TextUtils.isEmpty(vgwVar.g())) {
                    LogUtil.a("HwSyncWeightManager", "deviceMeal time zone is empty");
                } else {
                    vgwVar.e(lsl.q(System.currentTimeMillis()));
                }
                arrayList.add(vgwVar);
            }
        }
        return arrayList;
    }

    public void d(DeviceInfo deviceInfo, ivd ivdVar, long j) {
        ReleaseLogUtil.d("R_Weight_HwSyncWeightManager", "enter sendWeightManagerCommand");
        if (ivdVar == null) {
            return;
        }
        LogUtil.a("HwSyncWeightManager", "weight manager is ", ivdVar.toString());
        edc.e().sendSampleConfigCommand(deviceInfo, c(HiJsonUtil.e(ivdVar, ivd.class), CommonUtil.m(BaseApplication.getContext(), "900300023"), j), "HwSyncWeightManager");
    }

    public void d(DeviceInfo deviceInfo, int i) {
        ReleaseLogUtil.d("R_Weight_HwSyncWeightManager", "enter sendWeekReportCommand");
        LogUtil.a("HwSyncWeightManager", "stageType is ", Integer.valueOf(i));
        edc.e().sendSampleEventCommand(deviceInfo, e(i, deviceInfo), "HwSyncWeightManager");
    }

    public void e(DeviceInfo deviceInfo, long j, int i) {
        ReleaseLogUtil.d("R_Weight_HwSyncWeightManager", "sendRecordMealsCommand resultCode is: ", Integer.valueOf(i), "time is: ", Long.valueOf(j));
        if (i != 0) {
            i = 102;
        }
        boolean zD = eey.d(deviceInfo, a.N);
        if (!zD) {
            LogUtil.j("HwSyncWeightManager", "isSupportCapability is: ", Boolean.valueOf(zD));
        } else {
            edc.e().sendSampleEventCommand(deviceInfo, d(i, j), "HwSyncWeightManager");
        }
    }

    private long a(List<vgw> list) {
        for (int i = 0; i < list.size(); i++) {
            vgw vgwVar = list.get(i);
            if (vgwVar != null && vgwVar.i() != 0) {
                long jD = vgwVar.d();
                LogUtil.a("HwSyncWeightManager", "getDeviceMealsTime is time", Long.valueOf(jD));
                return jD;
            }
        }
        return 0L;
    }

    private eee d(int i, long j) {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.weightMgr");
        eeeVar.setWearPkgName("hw.sport.dietcal");
        eeeVar.setCommandId(2);
        eeeVar.a(0);
        eeeVar.a(80030003L);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("punchResult", Integer.valueOf(i));
        if (i != 0) {
            jsonObject.addProperty("punchFailTime", Long.valueOf(j));
        }
        jsonObject.addProperty("event", (Number) 6);
        eeeVar.e(HEXUtils.a(HEXUtils.c(jsonObject.toString())));
        LogUtil.a("HwSyncWeightManager", "createRecordMealsSampleEvent ", eeeVar.toString(), "object is： ", jsonObject.toString());
        return eeeVar;
    }

    public void a(DeviceInfo deviceInfo, double d2, long j) {
        ReleaseLogUtil.d("R_Weight_HwSyncWeightManager", "enter sendWeightGoalCommand");
        LogUtil.a("HwSyncWeightManager", "goal is ", Double.valueOf(d2));
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("weightGoal", Double.valueOf(d2));
        edc.e().sendSampleConfigCommand(deviceInfo, c(jsonObject.toString(), CommonUtil.m(BaseApplication.getContext(), "900300022"), j), "HwSyncWeightManager");
    }

    public void e(List<eeb> list) {
        eea eeaVar = new eea();
        eeaVar.setSrcPkgName("hw.unitedevice.weightMgr");
        eeaVar.setWearPkgName("hw.sport.dietcal");
        eeaVar.c(DicDataTypeUtil.DataType.RESTING_METABOLISM_SET.value());
        eeaVar.setCommandId(4);
        eeaVar.a(list);
        LogUtil.a("HwSyncWeightManager", "sendRestMetabolismDataCommand samplePoint: ", eeaVar.toString());
        edc.e().sendDictionaryPointInfoCommand(myk.a("HwSyncWeightManager"), eeaVar, "HwSyncWeightManager");
    }

    public void d(List<eed> list, HiHealthData hiHealthData) {
        ReleaseLogUtil.d("R_Weight_HwSyncWeightManager", "sendWeightDataCommand");
        ArrayList arrayList = new ArrayList();
        eeb eebVar = new eeb();
        eebVar.e(list);
        eebVar.c(hiHealthData.getStartTime());
        eebVar.d(hiHealthData.getEndTime());
        eebVar.a(hiHealthData.getModifiedTime());
        arrayList.add(eebVar);
        eea eeaVar = new eea();
        eeaVar.setSrcPkgName("hw.unitedevice.weightMgr");
        eeaVar.setWearPkgName("hw.sport.dietcal");
        eeaVar.c(DicDataTypeUtil.DataType.WEIGHT_BODYFAT_BROAD.value());
        eeaVar.setCommandId(4);
        eeaVar.a(arrayList);
        LogUtil.a("HwSyncWeightManager", "sendWeightDataCommand samplePoint: ", eeaVar.toString());
        edc.e().sendDictionaryPointInfoCommand(myk.a("HwSyncWeightManager"), eeaVar, "HwSyncWeightManager");
    }

    private eee e(int i, DeviceInfo deviceInfo) {
        eee eeeVar = new eee();
        eeeVar.setSrcPkgName("hw.unitedevice.weightMgr");
        eeeVar.setWearPkgName("hw.sport.dietcal");
        eeeVar.setCommandId(2);
        eeeVar.a(0);
        eeeVar.a(80030003L);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("stageType", Integer.valueOf(i));
        boolean zD = eey.d(deviceInfo, a.N);
        if (zD) {
            LogUtil.a("HwSyncWeightManager", "isSupportCapability is ", Boolean.valueOf(zD));
            jsonObject.addProperty("event", (Number) 4);
        }
        eeeVar.e(HEXUtils.a(HEXUtils.c(jsonObject.toString())));
        LogUtil.a("HwSyncWeightManager", "createWeekReportSampleEvent ", eeeVar.toString());
        return eeeVar;
    }

    private eef c(String str, long j, long j2) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.unitedevice.weightMgr");
        eefVar.setWearPkgName("hw.sport.dietcal");
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(j);
        eegVar.b(1);
        eegVar.c(Long.valueOf(j2));
        eegVar.d(HEXUtils.a(HEXUtils.c(str)));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        LogUtil.a("HwSyncWeightManager", "weight sample config ", eefVar.toString());
        return eefVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i, DeviceInfo deviceInfo) {
        nkf.c(OperationKey.HEALTH_APP_DIET_DIARY_SERVICE_2129035, "HwSyncWeightManager" + str, i, deviceInfo);
    }

    public static void e() {
        ReleaseLogUtil.d("R_Weight_HwSyncWeightManager", "releaseMgr");
        synchronized (d) {
            if (f42817b == null) {
                ReleaseLogUtil.d("R_Weight_HwSyncWeightManager", "sInstance is null");
                return;
            }
            edc.e().unRegisterDeviceSampleListener("hw.unitedevice.weightMgr");
            edc.e().unRegisterDeviceSampleListener("hw.unitedevice.common");
            if (njy.b(f42817b.e)) {
                HiHealthNativeApi.a(BaseApplication.getContext()).unSubscribeHiHealthData(f42817b.e, new HiUnSubscribeListener() { // from class: nag.8
                    @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                    public void onResult(boolean z) {
                        LogUtil.a("HwSyncWeightManager", "unSubscribeHiHealthData ", Boolean.valueOf(z));
                    }
                });
            }
            f42817b = null;
        }
    }
}
