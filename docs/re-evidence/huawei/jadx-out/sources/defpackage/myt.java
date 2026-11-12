package defpackage;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.model.HiBloodOxygenRemindMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.network.embedded.k;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class myt {
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExtendHandler f42701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42703c;
    private List<myu> e;
    private boolean i;

    private myt() {
        this.f42703c = 0;
        this.f42702b = 0;
        this.e = new ArrayList(16);
        this.i = false;
    }

    public static myt e() {
        return d.d;
    }

    private void e(int i) {
        this.f42703c = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(long j) {
        String strC = c();
        ReleaseLogUtil.d("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "setLastTimestamp lastTimestamp: ", Long.valueOf(j), " saveKey: ", strC);
        myp.b().setSharedPreference(strC, String.valueOf(j), new StorageParams());
    }

    private long a() {
        String strC = c();
        ReleaseLogUtil.d("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "getLastTimestamp saveKey: ", strC);
        String sharedPreference = myp.b().getSharedPreference(strC);
        ReleaseLogUtil.d("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "getLastTimestamp lastTimestamp: ", sharedPreference);
        return CommonUtil.m(BaseApplication.getContext(), sharedPreference);
    }

    private String c() {
        return nio.c(KeyValDbManager.d(BaseApplication.getContext()).c("user_id") + myo.b());
    }

    public void b(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "enter getBloodOxygenDownRemind");
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        if (TextUtils.isEmpty(deviceIdentify)) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "getHeartRateRaiseAlarm deviceIdentify is null");
            return;
        }
        DeviceCapability deviceCapabilityC = myo.c(deviceIdentify);
        if (deviceCapabilityC == null || !deviceCapabilityC.isSupportBloodOxygenDownRemind()) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "BloodOxygenDownRemind is not support");
            return;
        }
        synchronized (d) {
            if (this.i) {
                ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "startSyncLowSpo2Alarm is syncing");
                return;
            }
            this.i = true;
            ExtendHandler extendHandlerB = HandlerCenter.b(new e(), "AlarmData_BloodOxygenDownRemindMgr");
            this.f42701a = extendHandlerB;
            extendHandlerB.sendEmptyMessage(1, 1200000L);
            long jA = a();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            LogUtil.a("AlarmData_BloodOxygenDownRemindMgr", "handleGetBloodOxygenDownRemindCount lastStatusTime: ", Long.valueOf(jA), " endTime: ", Long.valueOf(jCurrentTimeMillis));
            long j = jA - jCurrentTimeMillis;
            if (Math.abs(j) > k.b.l || jA == 0) {
                jA = myo.d(jCurrentTimeMillis - k.b.l);
                c(jA);
            } else if (jA >= jCurrentTimeMillis && j <= 300) {
                ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "handleGetBloodOxygenDownRemindCount syncStatusPoint lastStatusTime is not correct.");
                jA = jCurrentTimeMillis - 61;
            } else if (j > 300) {
                ReleaseLogUtil.a("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "handleGetBloodOxygenDownRemindCount lastStatusTime is not correct and need write back.");
                jA = jCurrentTimeMillis - 61;
                c(jA);
            } else {
                ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "handleGetBloodOxygenDownRemindCount unknown");
            }
            mys.e(jA, jCurrentTimeMillis);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        synchronized (d) {
            this.i = false;
            ExtendHandler extendHandler = this.f42701a;
            if (extendHandler != null) {
                extendHandler.removeTasksAndMessages();
                this.f42701a.quit(true);
                this.f42701a = null;
            }
        }
    }

    private void b(ees eesVar, myy myyVar) {
        if (eesVar == null || myyVar == null) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "parseBloodOxygenDownRemindInfoData tlvFather or commonSectionInfo is null");
            return;
        }
        d(myyVar, eesVar.e());
        List<ees> listB = eesVar.b();
        if (listB == null || listB.isEmpty()) {
            ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "parseBloodOxygenDownRemindInfoData tlvFatherList is empty");
        } else {
            myyVar.a(d(listB));
        }
    }

    private List<myx> d(List<ees> list) {
        ArrayList arrayList = new ArrayList(16);
        Iterator<ees> it = list.get(0).b().iterator();
        while (it.hasNext()) {
            List<eew> listE = it.next().e();
            myx myxVar = new myx();
            for (eew eewVar : listE) {
                int iV = CommonUtil.v(eewVar.e());
                if (iV == 10) {
                    myxVar.d(CommonUtil.x(eewVar.b()));
                } else if (iV == 11) {
                    myxVar.a(CommonUtil.v(eewVar.b()));
                } else {
                    LogUtil.d("AlarmData_BloodOxygenDownRemindMgr", "parseBloodOxygenDownRemindValue command");
                }
            }
            if (myxVar.a() > System.currentTimeMillis() / 1000) {
                ReleaseLogUtil.d("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "checkTime error endTime:", Long.valueOf(myxVar.a()));
                OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("AlarmData_BloodOxygenDownRemindMgr", "checkTime error endTime:" + myxVar.a());
            }
            arrayList.add(myxVar);
        }
        return arrayList;
    }

    private void d(myy myyVar, List<eew> list) {
        for (eew eewVar : list) {
            int iV = CommonUtil.v(eewVar.e());
            if (iV == 4) {
                myyVar.c(CommonUtil.x(eewVar.b()));
            } else if (iV == 5) {
                myyVar.b(CommonUtil.x(eewVar.b()));
            } else if (iV == 6) {
                myyVar.d(CommonUtil.v(eewVar.b()));
            } else if (iV == 7) {
                myyVar.e(CommonUtil.v(eewVar.b()));
            } else if (iV == 12) {
                myyVar.c(CommonUtil.v(eewVar.b()));
            } else {
                LogUtil.d("AlarmData_BloodOxygenDownRemindMgr", "parseBloodOxygenDownRemindInfoData command");
            }
        }
    }

    public void c(byte[] bArr, DeviceInfo deviceInfo) {
        LogUtil.a("AlarmData_BloodOxygenDownRemindMgr", "processBloodOxygenDownRemindCount");
        this.f42703c = 0;
        this.f42702b = 0;
        try {
            if (bArr[2] == 127) {
                ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "processBloodOxygenDownRemindCount return errorCode: ", Integer.valueOf(mix.d(bArr)));
                b();
                return;
            }
            int iB = myq.b(bArr);
            this.f42702b = iB;
            ReleaseLogUtil.d("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "processBloodOxygenDownRemindCount get sample frame count :", Integer.valueOf(iB));
            if (this.f42702b <= 0) {
                ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "processBloodOxygenDownRemindCount count is zero");
                b();
            } else {
                e(deviceInfo);
            }
        } catch (eeu e2) {
            ReleaseLogUtil.a("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "processBloodOxygenDownRemindCount: ", ExceptionUtils.c(e2));
            b();
        }
    }

    public void b(byte[] bArr, DeviceInfo deviceInfo) {
        myu myuVar = new myu();
        String strE = eeq.e(bArr);
        LogUtil.a("AlarmData_BloodOxygenDownRemindMgr", "processBloodOxygenDownRemindDetail tlvHex: ", strE);
        if (strE != null && strE.length() > 4) {
            try {
                ees eesVarB = new eet().b(strE.substring(4));
                List<eew> listE = eesVarB.e();
                List<ees> listB = eesVarB.b();
                for (eew eewVar : listE) {
                    if (CommonUtil.v(eewVar.e()) == 1) {
                        myuVar.e(CommonUtil.v(eewVar.b()));
                    } else {
                        LogUtil.d("AlarmData_BloodOxygenDownRemindMgr", "processBloodOxygenDownReminDetail deal else value");
                    }
                }
                if (listB != null && !listB.isEmpty()) {
                    ees eesVar = listB.get(0);
                    ArrayList arrayList = new ArrayList(16);
                    for (ees eesVar2 : eesVar.b()) {
                        myy myyVar = new myy();
                        b(eesVar2, myyVar);
                        arrayList.add(myyVar);
                    }
                    myuVar.a(arrayList);
                    this.e.add(myuVar);
                    e(deviceInfo);
                    return;
                }
                ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "processBloodOxygenDownReminDetail tlvFatherList is empty");
                e(deviceInfo);
                return;
            } catch (eeu e2) {
                ReleaseLogUtil.a("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "processBloodOxygenDownRemindDetail: ", ExceptionUtils.c(e2));
                b();
                return;
            }
        }
        a(deviceInfo);
    }

    private void d() {
        synchronized (this) {
            if (!this.e.isEmpty()) {
                LogUtil.a("AlarmData_BloodOxygenDownRemindMgr", "saveBloodOxygenToHiHealth handle data insert");
                DeviceInfo deviceInfoE = myo.e("AlarmData_BloodOxygenDownRemindMgr");
                if (deviceInfoE != null) {
                    myo.a(deviceInfoE);
                    String strB = myo.b();
                    ArrayList arrayList = new ArrayList(10);
                    c(strB, arrayList);
                    LogUtil.a("AlarmData_BloodOxygenDownRemindMgr", "dataList size:", Integer.valueOf(arrayList.size()), " dataList: ", Arrays.asList(arrayList));
                    HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
                    hiDataInsertOption.setDatas(arrayList);
                    List<myu> list = this.e;
                    List<myy> listA = list.get(list.size() - 1).a();
                    if (!coq.d(listA)) {
                        b(hiDataInsertOption, listA.get(listA.size() - 1).b() + 1);
                    }
                } else {
                    ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "5.7.39 get deviceInfo fail.Save data fail.");
                    b();
                    return;
                }
            } else {
                ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "saveBloodOxygenToHiHealth no data save on data.");
            }
            this.e.clear();
            b();
        }
    }

    private void c(String str, List<HiHealthData> list) {
        Iterator it = new ArrayList(this.e).iterator();
        while (it.hasNext()) {
            for (myy myyVar : ((myu) it.next()).a()) {
                HiBloodOxygenRemindMetaData hiBloodOxygenRemindMetaData = new HiBloodOxygenRemindMetaData(myyVar.d());
                for (myx myxVar : myyVar.c()) {
                    HiHealthData hiHealthData = new HiHealthData();
                    hiHealthData.setStartTime(myxVar.a());
                    hiHealthData.setEndTime(myxVar.a());
                    hiHealthData.setValue(myxVar.d());
                    hiHealthData.setType(2107);
                    hiHealthData.setTimeInterval(myyVar.a() * 1000, myyVar.b() * 1000);
                    if (hiHealthData.getEndTime() > System.currentTimeMillis()) {
                        ReleaseLogUtil.d("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "checkTime error pointTime: ", Long.valueOf(myxVar.a()), ",endTime:", Long.valueOf(myyVar.b()));
                    }
                    hiHealthData.setMetaData(HiJsonUtil.d(hiBloodOxygenRemindMetaData));
                    hiHealthData.setDeviceUuid(str);
                    list.add(hiHealthData);
                }
            }
        }
    }

    private void a(DeviceInfo deviceInfo) {
        ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "processBloodOxygenDownReminDetail command less than 4");
        e(deviceInfo);
    }

    private void b(HiDataInsertOption hiDataInsertOption, final long j) {
        LogUtil.a("AlarmData_BloodOxygenDownRemindMgr", "insertBloodOxygenData insertData: ", hiDataInsertOption.toString());
        HiHealthNativeApi.a(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: myt.4
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                if (obj == null) {
                    ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "insertBloodOxygenData object is null");
                    return;
                }
                LogUtil.a("AlarmData_BloodOxygenDownRemindMgr", "insertBloodOxygenData errorCode: ", Integer.valueOf(i), " object: ", HiJsonUtil.d(obj));
                if (i == 0) {
                    ReleaseLogUtil.d("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "insertBloodOxygenData success.updateTime is: ", Long.valueOf(j));
                    myo.e();
                    myt.this.c(j);
                    return;
                }
                ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "insertBloodOxygenData fail.");
            }
        });
    }

    private void e(DeviceInfo deviceInfo) {
        int i = this.f42703c;
        if (i < this.f42702b) {
            LogUtil.a("AlarmData_BloodOxygenDownRemindMgr", "getBloodOxygenDownRemindDetailData currentIndex: ", Integer.valueOf(i));
            mys.c(this.f42703c, deviceInfo);
            e(this.f42703c + 1);
        } else {
            LogUtil.a("AlarmData_BloodOxygenDownRemindMgr", "getBloodOxygenDownRemindDetailData sync success");
            d();
        }
    }

    static class d {
        private static final myt d = new myt();
    }

    class e implements Handler.Callback {
        private e() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ReleaseLogUtil.e("BTSYNC_AlarmData_AlarmData_BloodOxygenDownRemindMgr", "DownRemindHandlerCallback time out");
                myt.this.b();
                return true;
            }
            LogUtil.j("AlarmData_BloodOxygenDownRemindMgr", "DownRemindHandlerCallback default");
            return false;
        }
    }
}
