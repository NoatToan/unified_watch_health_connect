package defpackage;

import android.text.TextUtils;
import com.huawei.basichealth.bloodpressure.BloodPressureSyncManager;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class mln implements DataReceiveCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f41878a = false;
    private String d;
    private ExtendHandler e = HandlerCenter.e("BloodPressurePlanBidirectionalSyncMgr");

    static class d {
        private static final mln e = new mln();
    }

    public static mln b() {
        return d.e;
    }

    public void e(DeviceInfo deviceInfo) {
        if (b(deviceInfo)) {
            ReleaseLogUtil.d("R_BloodPressurePlanBidirectionalSyncMgr", "device is new bloodPressure watch");
            this.d = deviceInfo.getDeviceIdentify();
            edc.e().registerDeviceSampleListener("hw.unitedevice.bloodpressure", this);
            this.e.postTask(new Runnable() { // from class: mln.1
                @Override // java.lang.Runnable
                public void run() {
                    mln.this.f();
                    BloodPressureSyncManager.d().c(0);
                }
            }, 2000L);
            return;
        }
        if (a()) {
            ReleaseLogUtil.d("R_BloodPressurePlanBidirectionalSyncMgr", "device is old bloodPressure watch");
            BloodPressureSyncManager.d().c(0);
            d(String.valueOf(900300060L));
            return;
        }
        ReleaseLogUtil.d("R_BloodPressurePlanBidirectionalSyncMgr", "device is null or don't support bloodPressure sync");
    }

    public void d(DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceIdentify().equals(this.d)) {
            edc.e().unRegisterDeviceSampleListener("hw.unitedevice.bloodpressure");
        }
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        if (eecVar instanceof eef) {
            List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
            if (configInfoList == null || configInfoList.size() <= 0) {
                ReleaseLogUtil.e("R_BloodPressurePlanBidirectionalSyncMgr", "onDataReceived BloodPressurePlan is null or Empty");
                return;
            } else {
                c(configInfoList);
                return;
            }
        }
        ReleaseLogUtil.d("R_BloodPressurePlanBidirectionalSyncMgr", "onDataReceived, message is error");
    }

    private void c(List<eeg> list) {
        for (eeg eegVar : list) {
            if (eegVar == null) {
                ReleaseLogUtil.d("R_BloodPressurePlanBidirectionalSyncMgr", "onDataReceived sampleConfigInfo is null");
                xjt.x("R_BloodPressurePlanBidirectionalSyncMgronDataReceived sampleConfigInfo is null");
            } else if (eegVar.d() == 129) {
                ReleaseLogUtil.d("R_BloodPressurePlanBidirectionalSyncMgr", "onDataReceived config auction is remind");
                f41878a = true;
                f();
            } else if (eegVar.d() != 1) {
                ReleaseLogUtil.d("R_BloodPressurePlanBidirectionalSyncMgr", "onDataReceived config auction type is invalid");
            } else {
                a(eegVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        d(e(), null, 2, System.currentTimeMillis());
    }

    private void a(eeg eegVar) {
        ReleaseLogUtil.d("R_BloodPressurePlanBidirectionalSyncMgr", "onDataReceived config auction is set. ", "modifyTime:", eegVar.b());
        String str = new String(eegVar.e(), StandardCharsets.UTF_8);
        LogUtil.a("BloodPressurePlanBidirectionalSyncMgr", "onDataReceived configDeviceDbInfo configData = ", str);
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("R_BloodPressurePlanBidirectionalSyncMgr", "onDataReceived device measure plan is null or empty");
            d(String.valueOf(900300060L));
            return;
        }
        String strC = c(str, "device");
        LogUtil.a("BloodPressurePlanBidirectionalSyncMgr", "save validData:", strC);
        if (eegVar.b() == null) {
            ReleaseLogUtil.d("R_BloodPressurePlanBidirectionalSyncMgr", "onDataReceived device modifyTime is null");
            xjt.x("R_BloodPressurePlanBidirectionalSyncMgronDataReceived device modifyTime is null");
        } else {
            c(String.valueOf(900300060L), strC, eegVar.b().longValue());
        }
    }

    private void d(DeviceInfo deviceInfo, String str, int i, long j) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_BloodPressurePlanBidirectionalSyncMgr", "send deviceInfo is null");
            return;
        }
        eef eefVar = new eef();
        eefVar.setSrcPkgName("hw.unitedevice.bloodpressure");
        eefVar.setWearPkgName("hw.watch.health.bp");
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(str, i, j));
        eefVar.setConfigInfoList(arrayList);
        edc.e().sendSampleConfigCommand(deviceInfo, eefVar, "BloodPressurePlanBidirectionalSyncMgr");
    }

    private eeg a(String str, int i, long j) {
        eeg eegVar = new eeg();
        eegVar.b(900300060L);
        eegVar.b(i);
        ReleaseLogUtil.d("R_BloodPressurePlanBidirectionalSyncMgr", "send action type is ", Integer.valueOf(i), ",modifyTime is ", Long.valueOf(j));
        if (i == 1) {
            eegVar.d(eeq.b(str));
        }
        eegVar.c(Long.valueOf(j));
        return eegVar;
    }

    public void b(String str, long j) {
        if (c()) {
            LogUtil.a("BloodPressurePlanBidirectionalSyncMgr", "send to new bloodpressure wacth:", str);
            a(str, j);
        } else if (a()) {
            LogUtil.a("BloodPressurePlanBidirectionalSyncMgr", "send to old bloodpressure wacth");
            b((dfk) HiJsonUtil.d(str, dfk.class));
        } else {
            ReleaseLogUtil.d("R_BloodPressurePlanBidirectionalSyncMgr", "device is null or don't support to send bloodpressure plans");
        }
    }

    private void b(dfk dfkVar) {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        for (dfk.e eVar : dfkVar.a()) {
            if (eVar.c() == 1) {
                dfl dflVar = new dfl(i, eVar.f(), eVar.g(), i);
                dflVar.b(eVar.a() != 0);
                dflVar.b(eVar.b());
                LogUtil.a("BloodPressurePlanBidirectionalSyncMgr", dflVar.toString());
                arrayList.add(dflVar);
                i++;
                if (i == 9) {
                    break;
                }
            }
        }
        BloodPressureSyncManager.d().b(arrayList);
    }

    private void c(final String str, String str2, long j) {
        qhq.d(MatterDataContans.TYPE_HEALTH, str, str2, new HiDataOperateListener() { // from class: mln.4
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.d("R_BloodPressurePlanBidirectionalSyncMgr", "saveBloodPressureRemindPlan errorCode: ", Integer.valueOf(i), ", object: ", obj);
                if (mln.f41878a) {
                    boolean unused = mln.f41878a = false;
                } else {
                    mln.this.d(str);
                }
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        qhq.b(MatterDataContans.TYPE_HEALTH, arrayList, new HiDataReadResultListener() { // from class: mln.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                ReleaseLogUtil.d("R_BloodPressurePlanBidirectionalSyncMgr", "getBloodPressurePlanFromHiHealth onResult errorCode: ", Integer.valueOf(i));
                if (obj instanceof List) {
                    List list = (List) obj;
                    if (list.size() >= 1) {
                        Object obj2 = list.get(0);
                        if (!(obj2 instanceof HiSampleConfig)) {
                            ReleaseLogUtil.a("R_BloodPressurePlanBidirectionalSyncMgr", "obj is not HiSampleConfig");
                            return;
                        }
                        HiSampleConfig hiSampleConfig = (HiSampleConfig) obj2;
                        String configData = hiSampleConfig.getConfigData();
                        if (TextUtils.isEmpty(configData)) {
                            ReleaseLogUtil.a("R_BloodPressurePlanBidirectionalSyncMgr", "config is null");
                            return;
                        } else {
                            mln.this.b(configData, hiSampleConfig.getModifiedTime());
                            return;
                        }
                    }
                }
                ReleaseLogUtil.a("R_BloodPressurePlanBidirectionalSyncMgr", "data is null");
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
                LogUtil.a("BloodPressurePlanBidirectionalSyncMgr", "onResultIntent errorCode: ", Integer.valueOf(i2), ", data: ", obj);
            }
        });
    }

    private void a(String str, long j) {
        String strC = c(str, "cloud");
        LogUtil.a("BloodPressurePlanBidirectionalSyncMgr", "send validData :", strC);
        d(e(), strC, 1, j);
    }

    private String c(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("reminderPlans");
            JSONArray jSONArray2 = new JSONArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.optInt("dataType") == 1 || jSONObject.optInt("remindInterval") == 30 || jSONObject.optInt("remindInterval") == 60) {
                    jSONArray2.put(jSONObject);
                }
            }
            if (jSONArray.length() == jSONArray2.length()) {
                return str;
            }
            a(str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("reminderPlans", jSONArray2);
            return jSONObject2.toString();
        } catch (JSONException unused) {
            LogUtil.a("BloodPressurePlanBidirectionalSyncMgr", "json exception");
            return str;
        }
    }

    private void a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("apptype", OsType.ANDROID);
            jSONObject.put("datasource", str);
        } catch (JSONException unused) {
            LogUtil.j("BloodPressurePlanBidirectionalSyncMgr", "json exception");
        }
        OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("BI_BloodPressureInvalidPlan", jSONObject.toString());
    }

    private DeviceInfo e() {
        return ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "BloodPressurePlanBidirectionalSyncMgr");
    }

    private boolean c() {
        return cqd.c(e(), 264);
    }

    private boolean b(DeviceInfo deviceInfo) {
        return cqd.c(deviceInfo, 264);
    }

    private boolean a() {
        return cqd.c(e(), 59);
    }
}
