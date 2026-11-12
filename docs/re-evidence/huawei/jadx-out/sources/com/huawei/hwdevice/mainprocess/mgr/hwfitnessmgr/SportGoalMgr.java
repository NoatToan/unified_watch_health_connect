package com.huawei.hwdevice.mainprocess.mgr.hwfitnessmgr;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.callback.DataReceiveCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwdevice.phoneprocess.mgr.threecircle.strategy.SyncStrategy;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.edc;
import defpackage.eec;
import defpackage.eef;
import defpackage.eeg;
import defpackage.eet;
import defpackage.eeu;
import defpackage.eew;
import defpackage.lxl;
import defpackage.mgg;
import defpackage.njy;
import defpackage.npt;
import defpackage.qgm;
import defpackage.qgx;
import defpackage.qhg;
import defpackage.qhq;
import health.compact.a.CommonUtil;
import health.compact.a.HEXUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class SportGoalMgr implements DataReceiveCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f17256a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qgx f17257c = new qgx();
    private Context e;

    /* JADX INFO: Access modifiers changed from: private */
    public static long d(long j, long j2) {
        return j > 0 ? j : j2;
    }

    public SportGoalMgr(Context context) {
        this.e = context;
    }

    @Override // com.huawei.health.devicemgr.business.callback.DataReceiveCallback
    public void onDataReceived(int i, DeviceInfo deviceInfo, eec eecVar) {
        long jE;
        String strD;
        LogUtil.a("UIDV_SportGoalMgr", "onDataReceived errorCode ", Integer.valueOf(i));
        if (!(eecVar instanceof eef)) {
            LogUtil.j("UIDV_SportGoalMgr", "message not instanceOf SampleConfig");
            return;
        }
        List<eeg> configInfoList = ((eef) eecVar).getConfigInfoList();
        if (configInfoList == null || configInfoList.size() == 0) {
            LogUtil.j("UIDV_SportGoalMgr", "onDataReceived sampleConfigInfos empty");
            return;
        }
        eeg eegVar = configInfoList.get(0);
        if (eegVar == null) {
            LogUtil.j("UIDV_SportGoalMgr", "configInfo == null");
            return;
        }
        long jC = eegVar.c();
        String strA = HEXUtils.a(eegVar.e());
        if (b(Long.toString(jC))) {
            qhg qhgVarC = c(strA);
            jE = qhgVarC.a();
            strD = HiJsonUtil.d(qhgVarC);
        } else {
            qgx qgxVarE = e(strA);
            jE = qgxVarE.e();
            strD = HiJsonUtil.d(qgxVarE);
        }
        ReleaseLogUtil.d("UIDV_SportGoalMgr", npt.d("onDataReceived configAction", Integer.valueOf(eegVar.d()), " configID ", Long.valueOf(jC), "  configData is ", strD, " timeStamp ", Long.valueOf(jE)));
        qhq.d("9002", Long.toString(jC), strD, new HiDataOperateListener() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwfitnessmgr.SportGoalMgr.1
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i2, Object obj) {
                LogUtil.a("UIDV_SportGoalMgr", "onDataReceived setSampleConfig errorCode: ", Integer.valueOf(i2), ", object: ", obj);
            }
        }, jE);
    }

    private qhg c(String str) {
        LogUtil.a("UIDV_SportGoalMgr", "getSportSwitchBean,hexContent: ", str);
        qhg qhgVar = new qhg();
        try {
            List<eew> listE = new eet().b(str).e();
            if (listE != null && listE.size() != 0) {
                for (eew eewVar : listE) {
                    int iV = CommonUtil.v(eewVar.e());
                    if (iV == 1) {
                        qhgVar.b(CommonUtil.x(eewVar.b()) * 1000);
                    } else if (iV == 2) {
                        qhgVar.b(Integer.toString(CommonUtil.v(eewVar.b())));
                    }
                }
                return qhgVar;
            }
            LogUtil.j("UIDV_SportGoalMgr", "tlvList is empty");
            return qhgVar;
        } catch (eeu unused) {
            LogUtil.e("UIDV_SportGoalMgr", "parseData is error");
            return qhgVar;
        }
    }

    private qgx e(String str) {
        LogUtil.a("UIDV_SportGoalMgr", "getGoalModel,hexContent: ", str);
        qgx qgxVar = new qgx();
        try {
            List<eew> listE = new eet().b(str).e();
            if (listE != null && listE.size() != 0) {
                for (eew eewVar : listE) {
                    int iV = CommonUtil.v(eewVar.e());
                    if (iV == 1) {
                        qgxVar.c(CommonUtil.x(eewVar.b()) * 1000);
                    } else if (iV == 2) {
                        qgxVar.a(CommonUtil.v(eewVar.b()));
                    }
                }
                return qgxVar;
            }
            LogUtil.j("UIDV_SportGoalMgr", "getGoalModel tlvList is empty");
            return qgxVar;
        } catch (eeu unused) {
            LogUtil.e("UIDV_SportGoalMgr", "getGoalModel parseData is error");
            return qgxVar;
        }
    }

    private boolean b(String str) {
        return str.equals("900200011") || str.equals("900200004") || str.equals("900200010");
    }

    public void c() {
        LogUtil.a("UIDV_SportGoalMgr", "setThreeCircleGoal enter ");
        d();
        DeviceInfo deviceInfoD = mgg.d("UIDV_SportGoalMgr");
        if (deviceInfoD != null) {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add("900200006");
            arrayList.add("900200008");
            arrayList.add("900200009");
            arrayList.add("900200007");
            qhq.b("9002", arrayList, new d(deviceInfoD));
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add("900200004");
            arrayList2.add("900200010");
            arrayList2.add("900200011");
            qhq.b("9002", arrayList2, new e(deviceInfoD, arrayList2));
        }
    }

    static class e implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DeviceInfo f17259a;
        private final List<String> d;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        private e(DeviceInfo deviceInfo, List<String> list) {
            this.f17259a = deviceInfo;
            this.d = list;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (i != 0) {
                LogUtil.e("UIDV_SportGoalMgr", "HiErrorCode is ", Integer.valueOf(i));
                return;
            }
            HashMap<String, qhg> mapA = a();
            if (!njy.b(obj, HiSampleConfig.class)) {
                LogUtil.j("UIDV_SportGoalMgr", "list SwitchDataReadListener isListTypeMatch false ");
                e(mapA);
                return;
            }
            List list = (List) obj;
            if (njy.e(list)) {
                LogUtil.j("UIDV_SportGoalMgr", "SwitchDataReadListener is empty ");
                e(mapA);
                return;
            }
            for (int i3 = 0; i3 < list.size(); i3++) {
                HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(i3);
                String configData = hiSampleConfig.getConfigData();
                if (!TextUtils.isEmpty(configData)) {
                    qhg qhgVar = (qhg) HiJsonUtil.d(configData, qhg.class);
                    if (qhgVar != null) {
                        qhgVar.b(SportGoalMgr.d(qhgVar.a(), hiSampleConfig.getModifiedTime()));
                    }
                    mapA.put(hiSampleConfig.getConfigId(), qhgVar);
                }
            }
            e(mapA);
        }

        private void e(HashMap<String, qhg> map) {
            for (Map.Entry<String, qhg> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    SportGoalMgr.a(entry.getKey(), entry.getValue().d(), this.f17259a, entry.getValue().a());
                } else {
                    LogUtil.e("UIDV_SportGoalMgr", "key or value is null.");
                }
            }
        }

        private HashMap<String, qhg> a() {
            HashMap<String, qhg> map = new HashMap<>();
            if (njy.e(this.d)) {
                LogUtil.e("UIDV_SportGoalMgr", "mSwitchIdLists is null");
                return map;
            }
            for (String str : this.d) {
                qhg qhgVar = new qhg();
                qhgVar.b("1");
                map.put(str, qhgVar);
            }
            return map;
        }
    }

    public void d(final String str) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: lxs
            @Override // java.lang.Runnable
            public final void run() {
                this.f41099c.a(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void a(String str) {
        LogUtil.a("UIDV_SportGoalMgr", "setThreeCircleGoalOrSwitch configId ", str);
        DeviceInfo deviceInfoD = mgg.d("UIDV_SportGoalMgr");
        if (deviceInfoD == null) {
            LogUtil.j("UIDV_SportGoalMgr", "setThreeCircleGoalOrSwitch deviceInfo is null or goalValue isEmpty");
            return;
        }
        if (deviceInfoD.getDeviceConnectState() != 2) {
            LogUtil.j("UIDV_SportGoalMgr", "setThreeCircleGoalOrSwitch device is not connected");
            return;
        }
        if (lxl.b(deviceInfoD)) {
            if (b(str)) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(str);
                qhq.b("9002", arrayList, new e(deviceInfoD, arrayList));
            } else {
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(str);
                qhq.b("9002", arrayList2, new d(deviceInfoD));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, String str2, DeviceInfo deviceInfo, long j) {
        eef eefVar = new eef();
        eefVar.setSrcPkgName(SyncStrategy.SRC_PKG_NAME);
        eefVar.setWearPkgName(SyncStrategy.WEAR_PKG_NAME);
        eefVar.setCommandId(1);
        eeg eegVar = new eeg();
        eegVar.b(CommonUtil.m(BaseApplication.b(), str));
        eegVar.b(1);
        StringBuilder sb = new StringBuilder(16);
        long j2 = j / 1000;
        sb.append(HEXUtils.b(1));
        sb.append(HEXUtils.b(HEXUtils.d(j2).length() / 2));
        sb.append(HEXUtils.d(j2));
        long jM = CommonUtil.m(BaseApplication.b(), str2);
        sb.append(HEXUtils.b(2));
        sb.append(HEXUtils.b(HEXUtils.d(jM).length() / 2));
        sb.append(HEXUtils.d(jM));
        eegVar.d(HEXUtils.a(sb.toString()));
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(eegVar);
        eefVar.setConfigInfoList(arrayList);
        ReleaseLogUtil.d("UIDV_SportGoalMgr", npt.d("sendThreeCircleGoalWhenChange configId ", str, " curTimestamp ", Long.valueOf(j2), " goal ", Long.valueOf(jM), " isSuccess ", Boolean.valueOf(edc.e().sendSampleConfigCommand(deviceInfo, eefVar, "UIDV_SportGoalMgr"))));
    }

    private void d() {
        edc.e().registerDeviceSampleListener(SyncStrategy.SRC_PKG_NAME, this);
    }

    static class d implements HiDataReadResultListener {
        private DeviceInfo d;
        private WeakReference<SportGoalMgr> e;

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
        }

        private d(SportGoalMgr sportGoalMgr, DeviceInfo deviceInfo) {
            this.e = new WeakReference<>(sportGoalMgr);
            this.d = deviceInfo;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            if (this.d == null) {
                LogUtil.j("UIDV_SportGoalMgr", "SportAchievementGoalDataCallback mWeakReference|mDeviceInfo == null ");
                return;
            }
            SportGoalMgr sportGoalMgr = this.e.get();
            if (sportGoalMgr == null) {
                LogUtil.j("UIDV_SportGoalMgr", "SportAchievementGoalDataCallback hwFitnessManager == null ");
                return;
            }
            if (!njy.b(obj, HiSampleConfig.class)) {
                LogUtil.j("UIDV_SportGoalMgr", "setThreeCircleGoal objData is not instanceof HashMap");
                return;
            }
            for (HiSampleConfig hiSampleConfig : (List) obj) {
                if (hiSampleConfig != null) {
                    String configData = hiSampleConfig.getConfigData();
                    String configId = hiSampleConfig.getConfigId();
                    if (TextUtils.isEmpty(configData)) {
                        continue;
                    } else {
                        qgx qgxVar = (qgx) HiJsonUtil.d(configData, qgx.class);
                        if (Objects.equals(configId, sportGoalMgr.f17256a) && qgxVar.equals(sportGoalMgr.f17257c)) {
                            return;
                        }
                        int iD = SportGoalMgr.d(qgxVar, qgm.d(configId));
                        long jA = SportGoalMgr.a(qgxVar, hiSampleConfig.getModifiedTime());
                        sportGoalMgr.f17256a = configId;
                        sportGoalMgr.f17257c = qgxVar;
                        SportGoalMgr.a(configId, Integer.toString(iD), this.d, jA);
                    }
                }
            }
        }
    }

    public void a() {
        e();
    }

    private void e() {
        edc.e().unRegisterDeviceSampleListener(SyncStrategy.SRC_PKG_NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(qgx qgxVar, int i) {
        return qgxVar != null ? qgxVar.d() : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long a(qgx qgxVar, long j) {
        return qgxVar != null ? d(qgxVar.e(), j) : j;
    }
}
