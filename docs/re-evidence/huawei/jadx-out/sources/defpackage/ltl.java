package defpackage;

import android.os.Message;
import com.huawei.health.sleep.SleepApi;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.SleepDailyProcessResultCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcoresleepmgr.SyncBaseFunction;
import com.huawei.hwcoresleepmgr.datatype.NotificationData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ltl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ltl f40783c;
    private SyncBaseFunction d;

    private ltl() {
    }

    public static ltl e() {
        ltl ltlVar;
        synchronized (ltl.class) {
            LogUtil.a("CoreSleepMgrStorage", "get instance");
            if (f40783c == null) {
                f40783c = new ltl();
            }
            ltlVar = f40783c;
        }
        return ltlVar;
    }

    private List<HiHealthData> b(List<ciq> list, String str) {
        LogUtil.a("CoreSleepMgrStorage", "saveTotalSleepCalcFrame");
        ArrayList arrayList = new ArrayList(16);
        if (list == null || list.size() == 0) {
            LogUtil.j("CoreSleepMgrStorage", "currCalcFrameList size is 0");
            return arrayList;
        }
        for (int i = 0; i < list.size(); i++) {
            e(list.get(i), arrayList, str);
            b(list, i);
        }
        return arrayList;
    }

    private void b(List<ciq> list, int i) {
        if (i == list.size() - 1) {
            if (list.get(i).j() == 1.0f) {
                LogUtil.j("CoreSleepMgrStorage", "not validData");
                return;
            }
            int iF = list.get(i).f();
            LogUtil.a("CoreSleepMgrStorage", "dailySleepScore :", Integer.valueOf(iF));
            long jCurrentTimeMillis = System.currentTimeMillis();
            LogUtil.a("CoreSleepMgrStorage", "current time :", Long.valueOf(jCurrentTimeMillis));
            boolean z = jCurrentTimeMillis - list.get(i).i() <= 86400000;
            LogUtil.a("CoreSleepMgrStorage", "is today :", Boolean.valueOf(z));
            if (z && iF >= 0 && iF <= 100) {
                ltj.d(iF, this.d);
            } else {
                LogUtil.j("CoreSleepMgrStorage", "coreSleepScore is error");
            }
        }
    }

    private void e(ciq ciqVar, List<HiHealthData> list, String str) {
        LogUtil.a("CoreSleepMgrStorage", "saveSleepCalcFrame");
        float fJ = ciqVar.j();
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepMgrStorage", "validData: ", Float.valueOf(fJ), ", startTime: ", Long.valueOf(ciqVar.h()));
        if (fJ == 1.0f) {
            list.add(e(ciqVar, str));
            list.add(f(ciqVar, str));
            list.add(g(ciqVar, str));
            return;
        }
        list.add(e(ciqVar, str));
        list.add(a(ciqVar, str));
        list.add(d(ciqVar, str));
        list.add(c(ciqVar, str));
        list.add(h(ciqVar, str));
        list.add(j(ciqVar, str));
        list.add(g(ciqVar, str));
        list.add(f(ciqVar, str));
        list.add(b(ciqVar, str));
    }

    private HiHealthData d(ciq ciqVar, String str) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(44207);
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setStartTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setEndTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setValue(ciqVar.d());
        return hiHealthData;
    }

    private HiHealthData e(ciq ciqVar, String str) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(44201);
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setStartTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setEndTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setValue(ciqVar.c());
        return hiHealthData;
    }

    private HiHealthData a(ciq ciqVar, String str) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(44205);
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setStartTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setEndTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setValue(ciqVar.b());
        return hiHealthData;
    }

    private HiHealthData c(ciq ciqVar, String str) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(44204);
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setStartTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setEndTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setValue(ciqVar.a());
        return hiHealthData;
    }

    private HiHealthData h(ciq ciqVar, String str) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(44203);
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setStartTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setEndTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setValue(ciqVar.f());
        LogUtil.a("CoreSleepMgrStorage", "updateSleepScore, score:", Integer.valueOf(ciqVar.f()));
        return hiHealthData;
    }

    private HiHealthData j(ciq ciqVar, String str) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(44208);
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setStartTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setEndTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setValue(ciqVar.g());
        return hiHealthData;
    }

    private HiHealthData g(ciq ciqVar, String str) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(44206);
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setStartTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setEndTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setValue(ciqVar.j());
        return hiHealthData;
    }

    private HiHealthData f(ciq ciqVar, String str) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(44202);
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setStartTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setEndTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setValue(ciqVar.i());
        return hiHealthData;
    }

    private HiHealthData b(ciq ciqVar, String str) {
        LogUtil.a("CoreSleepMgrStorage", "updateDeepPartCount:", Integer.valueOf(ciqVar.e()));
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(44106);
        hiHealthData.setDeviceUuid(str);
        hiHealthData.setStartTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setEndTime(HiDateUtil.e(ciqVar.h()));
        hiHealthData.setValue(ciqVar.e());
        return hiHealthData;
    }

    private List<HiHealthData> d(List<civ> list, String str) {
        LogUtil.a("CoreSleepMgrStorage", "saveSleepStatusFrameList");
        if (list == null || list.size() == 0) {
            LogUtil.j("CoreSleepMgrStorage", "sleepStatusFrameList size is 0");
            return new ArrayList(16);
        }
        Iterator<civ> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().b().size();
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator<civ> it2 = list.iterator();
        while (it2.hasNext()) {
            e(it2.next(), arrayList, str);
        }
        return arrayList;
    }

    private void e(civ civVar, List<HiHealthData> list, String str) {
        LogUtil.a("CoreSleepMgrStorage", "saveStatusFrame");
        ArrayList<Integer> arrayListB = civVar.b();
        long jE = HiDateUtil.e(civVar.a());
        LogUtil.a("CoreSleepMgrStorage", "start time : ", Long.valueOf(jE), "end time : ", Long.valueOf(civVar.c()));
        if (arrayListB == null) {
            LogUtil.j("CoreSleepMgrStorage", "statusFramelist is null");
            return;
        }
        for (Integer num : arrayListB) {
            if (jE < HiDateUtil.e(civVar.c())) {
                HiHealthData hiHealthData = new HiHealthData(d(num.intValue()));
                long j = 60000 + jE;
                hiHealthData.setTimeInterval(jE, j);
                hiHealthData.setDeviceUuid(str);
                list.add(hiHealthData);
                jE = j;
            }
        }
    }

    private int d(int i) {
        if (i == 1) {
            return 22101;
        }
        if (i == 2) {
            return 22102;
        }
        if (i == 3) {
            return 22103;
        }
        if (i == 4) {
            return 22104;
        }
        if (i == 5) {
            return 22105;
        }
        LogUtil.a("CoreSleepMgrStorage", "getStatusType is else");
        return 0;
    }

    public void e(ltm ltmVar, List<ciq> list, List<civ> list2) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepMgrStorage", "enter saveCoreSleepData");
        if (ltmVar == null) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepMgrStorage", "coreSleepMgr is null");
            return;
        }
        if (list2 == null || list2.size() == 0) {
            ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepMgrStorage", "sleepStatusFrameList.size() is 0");
            ltmVar.f();
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list == null || list.size() == 0) {
            if (d(list2)) {
                ReleaseLogUtil.e("BTSYNC_CoreSleep_CoreSleepMgrStorage", "mSleepCalcFramesList size is 0, Has Night Sleep, Can not save sleep data");
                ltmVar.f();
                return;
            } else {
                Iterator<civ> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                LogUtil.a("CoreSleepMgrStorage", "mSleepCalcFramesList size is 0, No Night Sleep, Only save noon sleep data");
            }
        } else {
            Iterator<ciq> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next());
            }
            Iterator<civ> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList.add(it3.next());
            }
            LogUtil.a("CoreSleepMgrStorage", "sleepCalcFrameList size > 0, sleepStatusFrameList size > 0");
        }
        String strB = ltj.b(this.d);
        List<HiHealthData> listD = d(arrayList, strB);
        List<HiHealthData> listB = b(arrayList2, strB);
        if (list != null && !list.isEmpty()) {
            ciq ciqVar = list.get(list.size() - 1);
            a(ltmVar, listB, listD, ltq.e(ciqVar.c(), ciqVar.i(), ciqVar.f()));
            return;
        }
        a(ltmVar, listB, listD, null);
    }

    private void a(ltm ltmVar, List<HiHealthData> list, List<HiHealthData> list2, NotificationData notificationData) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepMgrStorage", "saveCoreSleepDataToHiHealth dataSize:", Integer.valueOf(list.size()), "statusSize,", Integer.valueOf(list2.size()));
        a(list);
        e(ltmVar, notificationData, list2);
    }

    private void e(final ltm ltmVar, final NotificationData notificationData, List<HiHealthData> list) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepMgrStorage", "enter saveCoreSleepStatusToHiHealth");
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(list);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: ltl.2
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepMgrStorage", "saveCoreSleepStatusToHiHealth onResult type:", Integer.valueOf(i));
                if (i == 0) {
                    ltl.this.c();
                    lti.d();
                    ltl.this.e(ltmVar);
                    SharedPreferenceManager.a("MODULE_HW_AI_SCENES_SLEEP_MODEL", "KEY_HW_AI_SCENES_SLEEP_MODEL", false);
                    ltl.this.a();
                }
                ltl.this.d(ltmVar, i);
                if (VersionControlUtil.isSupportSleepManagement()) {
                    ltl.this.d(ltmVar, notificationData, i);
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.obj = notificationData;
                messageObtain.arg1 = i;
                ltmVar.d(messageObtain);
            }
        });
    }

    public void a() {
        Map<String, String> mapE = SharedPreferenceManager.e(com.huawei.haf.application.BaseApplication.b(), "MODULE_HW_SLEEP_SEND_COUNT");
        if (mapE != null) {
            for (Map.Entry<String, String> entry : mapE.entrySet()) {
                String value = entry.getValue();
                String key = entry.getKey();
                if (!StringUtils.g(key) && !StringUtils.g(value)) {
                    LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                    linkedHashMap.put("dottingDate", key);
                    linkedHashMap.put("dottingCount", value);
                    OpAnalyticsUtil.getInstance().setEvent(OperationKey.HEALTH_APP_DEVICE_SLEEP_LINKAGE_2129059.value(), linkedHashMap);
                }
            }
        }
        SharedPreferenceManager.i(com.huawei.haf.application.BaseApplication.b(), "MODULE_HW_SLEEP_SEND_COUNT");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(ltm ltmVar) {
        if (ltmVar.e()) {
            return;
        }
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepMgrStorage", "handleSegmentationProcess not need segment.");
        ltmVar.b(ltmVar.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ltm ltmVar, int i) {
        if (ltmVar.e()) {
            if (!ltmVar.i()) {
                LogUtil.a("CoreSleepMgrStorage", "reportProgress finish progress ", 100);
                IBaseResponseCallback iBaseResponseCallbackB = ltmVar.b();
                if (iBaseResponseCallbackB != null) {
                    iBaseResponseCallbackB.a(20000, 100);
                } else {
                    LogUtil.j("CoreSleepMgrStorage", "reportProgress callback is null.");
                }
                ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepMgrStorage", "handleSegmentationProcess startFileSyncBySecondStage");
                ltmVar.h();
                return;
            }
            ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepMgrStorage", "saveCoreSleepDataToHiHealth updateLastTime");
            if (i == 0) {
                ltmVar.b(ltmVar.a());
            }
            ltmVar.d(false);
            ltmVar.j();
        }
    }

    private void a(List<HiHealthData> list) {
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepMgrStorage", "enter saveCoreSleepCalcToHiHealth");
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(list);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: ltl.4
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepMgrStorage", "saveCoreSleepCalcToHiHealth onResult type:", Integer.valueOf(i));
                LogUtil.a("CoreSleepMgrStorage", "saveCoreSleepCalcToHiHealth onResult object: ", obj);
            }
        });
    }

    private boolean d(List<civ> list) {
        Iterator<civ> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().b().get(0).intValue() != 5) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        LogUtil.a("CoreSleepMgrStorage", "start syncSleepAfterInsert");
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(20000);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    public void d(SyncBaseFunction syncBaseFunction) {
        this.d = syncBaseFunction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final ltm ltmVar, final NotificationData notificationData, final int i) {
        SleepApi sleepApi = (SleepApi) Services.d("Main", SleepApi.class);
        ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepMgrStorage", "requestAndUpdateDailyResult start");
        sleepApi.requestAndUpdateDailyResult(ieg.c(System.currentTimeMillis()), new SleepDailyProcessResultCallback<gxd>() { // from class: ltl.1
            @Override // com.huawei.hwbasemgr.SleepDailyProcessResultCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onResponse(int i2, gxd gxdVar) {
                ReleaseLogUtil.d("BTSYNC_CoreSleep_CoreSleepMgrStorage", "requestAndUpdateDailyResult errorCode is ", Integer.valueOf(i2));
                Message messageObtain = Message.obtain();
                messageObtain.obj = notificationData;
                messageObtain.arg1 = i;
                messageObtain.arg2 = i2;
                ltmVar.d(messageObtain);
            }
        });
    }
}
