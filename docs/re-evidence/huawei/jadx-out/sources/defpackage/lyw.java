package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.DataTotalMotion;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessTotalData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lyw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41162a = new Object();
    private static lyw d;
    private List<HiHealthData> e;
    private List<HiHealthData> h;
    private e i;
    private lyj g = null;
    private int j = 0;
    private lyl k = new lyl();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f41164c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f41163b = 0;
    private long f = 0;

    private boolean d(int i, int i2) {
        if (i == 2) {
            return i2 > 0 && i2 < 500;
        }
        if (i == 4) {
            return i2 > 0 && i2 < 65535;
        }
        if (i == 2018 || i == 2002) {
            return i2 > 0 && i2 < 255;
        }
        if (i == 5) {
            return i2 > 0 && i2 < 1500;
        }
        return i2 > 0;
    }

    private lyw() {
        LogUtil.a("05", 1, "FitnessMgrAw70Storage", "FitnessMgrAw70Storage Constructor");
        this.i = new e(this, BaseApplication.getContext().getMainLooper());
    }

    public static lyw b() {
        lyw lywVar;
        synchronized (f41162a) {
            if (d == null) {
                d = new lyw();
            }
            lywVar = d;
        }
        return lywVar;
    }

    static class e extends Handler {
        WeakReference<lyw> e;

        e(lyw lywVar, Looper looper) {
            super(looper);
            this.e = new WeakReference<>(lywVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("FitnessMgrAw70Storage", "handleMessage(), message is null");
                return;
            }
            super.handleMessage(message);
            lyw lywVar = this.e.get();
            if (lywVar == null) {
                LogUtil.j("FitnessMgrAw70Storage", "handleMessage(), storageAdapter is null");
                return;
            }
            int i = message.what;
            if (i == 0) {
                lywVar.a(0);
                return;
            }
            if (i == 1) {
                lywVar.a(300006);
                return;
            }
            if (i == 101) {
                LogUtil.a("05", 1, "FitnessMgrAw70Storage", "save data success");
                lywVar.e(0);
            } else if (i != 102) {
                LogUtil.j("05", 1, "FitnessMgrAw70Storage", "unknown message type");
            } else {
                LogUtil.a("05", 1, "FitnessMgrAw70Storage", "save data fail");
                lywVar.e(300006);
            }
        }
    }

    public void a() {
        new lyt().a();
    }

    public void c() {
        LogUtil.a("FitnessMgrAw70Storage", "initFitnessUserStorage.");
    }

    public void a(lyn lynVar, lyf lyfVar) {
        if (lyfVar == null) {
            LogUtil.j("FitnessMgrAw70Storage", "saveTodayTotalData() todayTotalMotion is null");
            return;
        }
        d(lyfVar);
        List<DataTotalMotion> listA = lyfVar.a();
        ArrayList arrayList = new ArrayList(16);
        FitnessTotalData fitnessTotalData = new FitnessTotalData();
        fitnessTotalData.setCalorie(lyfVar.d() * 1000);
        for (DataTotalMotion dataTotalMotion : listA) {
            a(dataTotalMotion);
            d(dataTotalMotion, arrayList, fitnessTotalData, lynVar);
        }
        b(fitnessTotalData, arrayList);
    }

    private void d(DataTotalMotion dataTotalMotion, List<FitnessTotalData> list, FitnessTotalData fitnessTotalData, lyn lynVar) {
        int motion_type = dataTotalMotion.getMotion_type();
        if (motion_type != 10) {
            switch (motion_type) {
                case 1:
                case 2:
                    fitnessTotalData.addSteps(dataTotalMotion.getStep());
                    fitnessTotalData.addDistance(dataTotalMotion.getDistance());
                    list.add(new FitnessTotalData(dataTotalMotion));
                    break;
                case 3:
                    FitnessTotalData fitnessTotalDataD = d(lynVar, dataTotalMotion);
                    fitnessTotalData.addSteps(fitnessTotalDataD.getSteps());
                    fitnessTotalData.setHeight(fitnessTotalDataD.getHeight());
                    fitnessTotalData.addDistance(fitnessTotalDataD.getDistance());
                    list.add(d(dataTotalMotion, lynVar));
                    break;
                case 4:
                    fitnessTotalData.addDistance(dataTotalMotion.getDistance());
                    list.add(new FitnessTotalData(dataTotalMotion));
                    break;
                case 5:
                    LogUtil.a("05", 1, "FitnessMgrAw70Storage", "stand type");
                    break;
                case 6:
                    LogUtil.a("05", 1, "FitnessMgrAw70Storage", "shallow sleep type");
                    break;
                case 7:
                    LogUtil.a("05", 1, "FitnessMgrAw70Storage", "deep sleep type");
                    break;
                default:
                    LogUtil.d("05", 1, "FitnessMgrAw70Storage", "unknown type");
                    break;
            }
            return;
        }
        fitnessTotalData.addSteps(dataTotalMotion.getStep());
        fitnessTotalData.addDistance(dataTotalMotion.getDistance());
        list.add(b(dataTotalMotion));
    }

    private FitnessTotalData d(lyn lynVar, DataTotalMotion dataTotalMotion) {
        FitnessTotalData fitnessTotalData = new FitnessTotalData();
        fitnessTotalData.setSteps(dataTotalMotion.getStep());
        if (lynVar != null) {
            if (lynVar.e()) {
                fitnessTotalData.setHeight(dataTotalMotion.getDistance());
                return fitnessTotalData;
            }
            fitnessTotalData.setHeight(dataTotalMotion.getHeight());
            fitnessTotalData.setDistance(dataTotalMotion.getDistance());
        }
        return fitnessTotalData;
    }

    private void b(FitnessTotalData fitnessTotalData, List<FitnessTotalData> list) {
        list.add(fitnessTotalData);
        LogUtil.a("05", 1, "FitnessMgrAw70Storage", "saveTodayTotalData steps:", Integer.valueOf(fitnessTotalData.getSteps()), " calorie:", Integer.valueOf(fitnessTotalData.getCalorie()), " distance:", Integer.valueOf(fitnessTotalData.getDistance()), " size:", Integer.valueOf(list.size()));
        c(fitnessTotalData);
        d(fitnessTotalData);
    }

    private void a(DataTotalMotion dataTotalMotion) {
        LogUtil.d("FitnessMgrAw70Storage", "type:", Integer.valueOf(dataTotalMotion.getMotion_type()), " step:", Integer.valueOf(dataTotalMotion.getStep()), " calorie:", Integer.valueOf(dataTotalMotion.getCalorie()), " distance:", Integer.valueOf(dataTotalMotion.getDistance()));
    }

    private void d(lyf lyfVar) {
        LogUtil.a("05", 1, "FitnessMgrAw70Storage", "saveTodayTotalData get data success total calorie is:", Integer.valueOf(lyfVar.d()));
    }

    private FitnessTotalData b(DataTotalMotion dataTotalMotion) {
        FitnessTotalData fitnessTotalData = new FitnessTotalData(dataTotalMotion);
        fitnessTotalData.setSportType(2);
        return fitnessTotalData;
    }

    private FitnessTotalData d(DataTotalMotion dataTotalMotion, lyn lynVar) {
        FitnessTotalData fitnessTotalData = new FitnessTotalData(dataTotalMotion);
        if (lynVar != null && lynVar.e()) {
            fitnessTotalData.setHeight(fitnessTotalData.getDistance());
            fitnessTotalData.setDistance(0);
        }
        return fitnessTotalData;
    }

    private void d(FitnessTotalData fitnessTotalData) {
        String str;
        DeviceInfo deviceInfoD = mgi.d("FitnessMgrAw70Storage");
        if (deviceInfoD == null) {
            str = "";
        } else {
            str = "_" + deviceInfoD.getDeviceIdentify();
        }
        StorageParams storageParams = new StorageParams(1);
        if (a(str, storageParams, "KEY_TOTAL_STEPS_FROM_DEVICE_FLAG", fitnessTotalData.getSteps()) == 200004) {
            SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10008), "KEY_TOTAL_STEPS_FROM_DEVICE_FLAG" + str);
            a(str, storageParams, "KEY_TOTAL_STEPS_FROM_DEVICE_FLAG", fitnessTotalData.getSteps());
        }
        String str2 = (fitnessTotalData.getCalorie() / 1000) + "|" + (System.currentTimeMillis() / 1000);
        if (SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "KEY_TOTAL_CAL_FROM_DEVICE_FLAG" + str, str2, storageParams) == 200004) {
            SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10008), "KEY_TOTAL_CAL_FROM_DEVICE_FLAG" + str);
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "KEY_TOTAL_CAL_FROM_DEVICE_FLAG" + str, str2, storageParams);
        }
        if (a(str, storageParams, "KEY_TOTAL_DISTANCE_FROM_DEVICE_FLAG", fitnessTotalData.getDistance()) == 200004) {
            SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10008), "KEY_TOTAL_DISTANCE_FROM_DEVICE_FLAG" + str);
            a(str, storageParams, "KEY_TOTAL_DISTANCE_FROM_DEVICE_FLAG", fitnessTotalData.getDistance());
        }
    }

    private int a(String str, StorageParams storageParams, String str2, int i) {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), str2 + str, i + "|" + (System.currentTimeMillis() / 1000), storageParams);
    }

    public static long b(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public void c(FitnessTotalData fitnessTotalData) {
        LogUtil.a("05", 1, "FitnessMgrAw70Storage", "saveTodayTotalToHiHealth fitnessTotalData :", fitnessTotalData);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        ArrayList arrayList = new ArrayList(16);
        arrayList.addAll(a(fitnessTotalData));
        if (arrayList.isEmpty()) {
            LogUtil.j("FitnessMgrAw70Storage", "saveTodayTotalToHiHealth() dataList is empty");
        } else {
            hiDataInsertOption.setDatas(arrayList);
            HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: lyw.1
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public void onResult(int i, Object obj) {
                    LogUtil.a("05", 1, "FitnessMgrAw70Storage", "saveTodayTotalToHiHealth onResult type:", Integer.valueOf(i), " object:", obj);
                    if (i == 0) {
                        lng.a();
                    }
                }
            });
        }
    }

    private ArrayList<HiHealthData> a(FitnessTotalData fitnessTotalData) {
        ArrayList<HiHealthData> arrayList = new ArrayList<>(16);
        if (fitnessTotalData == null) {
            LogUtil.j("FitnessMgrAw70Storage", "addData() fitnessTotalData is null");
            return arrayList;
        }
        long jB = b(System.currentTimeMillis());
        if (fitnessTotalData.getSteps() > 0) {
            HiHealthData hiHealthData = new HiHealthData();
            hiHealthData.setType(40002);
            hiHealthData.setDeviceUuid(mga.b());
            hiHealthData.setTimeInterval(jB, System.currentTimeMillis());
            hiHealthData.setValue(fitnessTotalData.getSteps());
            arrayList.add(hiHealthData);
            HiHealthData hiHealthData2 = new HiHealthData();
            hiHealthData2.setType(901);
            hiHealthData2.setDeviceUuid(mga.b());
            hiHealthData2.setTimeInterval(jB, System.currentTimeMillis());
            hiHealthData2.setValue(fitnessTotalData.getSteps());
            arrayList.add(hiHealthData2);
        }
        if (fitnessTotalData.getCalorie() > 0) {
            HiHealthData hiHealthData3 = new HiHealthData();
            hiHealthData3.setType(40003);
            hiHealthData3.setDeviceUuid(mga.b());
            hiHealthData3.setTimeInterval(jB, System.currentTimeMillis());
            hiHealthData3.setValue(fitnessTotalData.getCalorie());
            arrayList.add(hiHealthData3);
        }
        if (fitnessTotalData.getDistance() > 0) {
            HiHealthData hiHealthData4 = new HiHealthData();
            hiHealthData4.setType(40004);
            hiHealthData4.setDeviceUuid(mga.b());
            hiHealthData4.setTimeInterval(jB, System.currentTimeMillis());
            hiHealthData4.setValue(fitnessTotalData.getDistance());
            arrayList.add(hiHealthData4);
        }
        if (fitnessTotalData.getHeight() > 0) {
            HiHealthData hiHealthData5 = new HiHealthData();
            hiHealthData5.setType(SmartMsgConstant.MSG_TYPE_RIDE_USER);
            hiHealthData5.setDeviceUuid(mga.b());
            hiHealthData5.setTimeInterval(jB, System.currentTimeMillis());
            hiHealthData5.setValue(fitnessTotalData.getHeight());
            arrayList.add(hiHealthData5);
        }
        return arrayList;
    }

    public void a(List<lyk> list, List<lyi> list2) {
        LogUtil.a("05", 1, "FitnessMgrAw70Storage", "saveFitnessData in SEPARATED type");
        lyl lylVarD = new lyt().d();
        this.k = lylVarD;
        this.f41164c = lylVarD.a();
        d();
        b(list);
        c(list2);
        i();
    }

    public void a(List<lym> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("FitnessMgrAw70Storage", "logSampleList() samplePoints is null");
            return;
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append("Total:" + list.size());
        int i = 0;
        for (lym lymVar : list) {
            sb.append("[index:");
            sb.append(i);
            sb.append("]");
            sb.append(lymVar);
            i++;
        }
        LogUtil.a("05", 1, "FitnessMgrAw70Storage", sb.toString());
    }

    public void a(lyk lykVar) {
        if (lykVar == null) {
            LogUtil.j("FitnessMgrAw70Storage", "saveSampleFrame() sampleFrame is null");
            return;
        }
        List<lym> listD = lykVar.d();
        a(listD);
        for (lym lymVar : listD) {
            if (this.f41164c >= lymVar.b()) {
                if (lymVar.d() == 1) {
                    b(lymVar);
                }
            } else {
                a(lymVar);
            }
        }
        if (listD.size() > 0) {
            long jB = listD.get(listD.size() - 1).b();
            if (this.k.a() < jB) {
                this.k.b(jB);
            }
        }
    }

    public void b(List<lyk> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("FitnessMgrAw70Storage", "saveSampleFrameList() sampleFrameList is null");
            return;
        }
        LogUtil.a("05", 1, "FitnessMgrAw70Storage", "saveSampleFrameList enter");
        Collections.sort(list, new Comparator<lyk>() { // from class: lyw.5
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(lyk lykVar, lyk lykVar2) {
                return (int) (lykVar.a() - lykVar2.a());
            }
        });
        Iterator<lyk> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public void a(lyi lyiVar) {
        if (lyiVar == null) {
            LogUtil.j("FitnessMgrAw70Storage", "saveStatusFrame() statusFrame is null");
            return;
        }
        List<lyj> listB = lyiVar.b();
        for (lyj lyjVar : listB) {
            if (lyjVar.c() <= this.f41163b) {
                if (lyjVar.e() == 1) {
                    b(lyjVar);
                } else if ((lyjVar.a() != 7 && lyjVar.a() != 6) || lyjVar.c() <= this.f41163b - 1800) {
                    LogUtil.d("FitnessMgrAw70Storage", "no need special handle!");
                } else {
                    b(lyjVar);
                }
            } else {
                d(lyjVar);
            }
        }
        if (listB.size() > 0) {
            long jC = listB.get(listB.size() - 1).c();
            if (jC > this.f) {
                this.f = jC;
            }
        }
    }

    public void c(List<lyi> list) {
        LogUtil.a("05", 1, "FitnessMgrAw70Storage", "saveStatusFrameList enter");
        long jA = lyo.a();
        this.f41163b = jA;
        this.f = jA;
        if (list == null || list.isEmpty()) {
            LogUtil.j("FitnessMgrAw70Storage", "saveStatusFrameList() or statusFrameList is null");
            return;
        }
        Iterator<lyi> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    void d() {
        this.e = new ArrayList(16);
        this.h = new ArrayList(16);
    }

    private int b(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 3;
            case 4:
                return 6;
            case 5:
                return 5;
            case 6:
                return 2018;
            case 7:
                return 2002;
            default:
                LogUtil.d("FitnessMgrAw70Storage", "getHiHealthDataType unknown type :", Integer.valueOf(i));
                return 0;
        }
    }

    private void b(lym lymVar) {
        LogUtil.a("05", 1, "FitnessMgrAw70Storage", "updateSamplePoint sample:", lymVar);
        a(lymVar);
    }

    private void a(lym lymVar) {
        if (d(b(lymVar.c()), lymVar.a())) {
            HiHealthData hiHealthData = new HiHealthData(b(lymVar.c()));
            hiHealthData.setTimeInterval(lymVar.b() * 1000, (lymVar.b() + ((long) lymVar.e())) * 1000);
            hiHealthData.setValue(lymVar.a());
            hiHealthData.setDeviceUuid(mga.b());
            this.e.add(hiHealthData);
            return;
        }
        LogUtil.d("FitnessMgrAw70Storage", "insertSamplePoint invalid sample:", lymVar);
    }

    private int d(int i) {
        if (i == 1) {
            return 20002;
        }
        if (i == 2) {
            return 20003;
        }
        if (i == 3) {
            return 20004;
        }
        if (i == 4) {
            return 20005;
        }
        if (i == 6) {
            return 22002;
        }
        if (i == 7) {
            return 22001;
        }
        if (i == 9) {
            return 20007;
        }
        LogUtil.d("FitnessMgrAw70Storage", "getHiHealthSessionType unknown type :", Integer.valueOf(i));
        return 0;
    }

    private void b(lyj lyjVar) {
        LogUtil.d("FitnessMgrAw70Storage", "updateStatusToHiHealth:", lyjVar);
        d(lyjVar);
    }

    private void d(lyj lyjVar) {
        LogUtil.a("05", 1, "FitnessMgrAw70Storage", "statusPoint :", lyjVar);
        for (long jC = lyjVar.c(); jC < lyjVar.b(); jC += 60) {
            if (d(lyjVar.a()) != 0) {
                HiHealthData hiHealthData = new HiHealthData(d(lyjVar.a()));
                hiHealthData.setTimeInterval(jC * 1000, (jC + 60) * 1000);
                hiHealthData.setDeviceUuid(mga.b());
                LogUtil.d("FitnessMgrAw70Storage", "saveStatusToHiHealth hiHealthData:", hiHealthData);
                this.h.add(hiHealthData);
            }
        }
    }

    public void e() {
        new lyt().c(this.k);
        lyo.d(this.f);
    }

    public void e(int i) {
        LogUtil.a("05", 1, "FitnessMgrAw70Storage", "processSaveDataComplete enter errCode:", Integer.valueOf(i));
        if (i == 0) {
            mit.b("FitnessMgrAw70Storage", new Runnable() { // from class: lyw.3
                @Override // java.lang.Runnable
                public void run() {
                    lyw.this.e();
                }
            });
        }
        lyn.c(BaseApplication.getContext()).b(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        LogUtil.a("05", 1, "FitnessMgrAw70Storage", "startSyncIntensiveData enter errorCode:", Integer.valueOf(i));
        lyn.c(BaseApplication.getContext()).g();
    }

    public void d(List<lyh> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("FitnessMgrAw70Storage", "saveIntensiveInfo() desFrames is null");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        LogUtil.a("FitnessMgrAw70Storage", "enter saveIntensiveInfo");
        e(arrayList, list);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        int size = arrayList.size();
        LogUtil.d("FitnessMgrAw70Storage", "saveIntensiveInfo dataList size:", Integer.valueOf(size), ",value", arrayList.toString());
        hiDataInsertOption.setDatas(arrayList);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: lyw.4
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("05", 1, "FitnessMgrAw70Storage", "saveIntensiveInfo onResult type:", Integer.valueOf(i), " object:", obj);
                if (i == 0) {
                    lyw.this.i.sendEmptyMessage(101);
                } else {
                    lyw.this.i.sendEmptyMessage(102);
                    LogUtil.a("FitnessMgrAw70Storage", "saveIntensiveInfo not correct");
                }
            }
        });
    }

    private void e(List<HiHealthData> list, List<lyh> list2) {
        String strB = mga.b();
        for (lyh lyhVar : list2) {
            List<lyh.c> listA = lyhVar.a();
            int i = 0;
            while (i < listA.size()) {
                lyh.c cVar = listA.get(i);
                LogUtil.a("FitnessMgrAw70Storage", "DesFrame :", lyhVar.toString());
                int iD = cVar.d();
                int iB = cVar.b();
                int i2 = iD - (iD % 60);
                int i3 = ((iB - (iB % 60)) - i2) / 60;
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = (i4 * 60) + i2;
                    HiHealthData hiHealthData = new HiHealthData();
                    long j = ((long) i5) * 1000;
                    long j2 = ((long) (i5 + 60)) * 1000;
                    hiHealthData.setTimeInterval(j, j2);
                    hiHealthData.setValue(c(cVar.c()));
                    hiHealthData.setType(7);
                    hiHealthData.setDeviceUuid(strB);
                    list.add(hiHealthData);
                    LogUtil.a("FitnessMgrAw70Storage", "Intensive data: startTime :", Long.valueOf(j), " endTime :", Long.valueOf(j2), " value :", Integer.valueOf(c(cVar.c())), " type :", 7);
                    i4++;
                    i = i;
                }
                i++;
            }
        }
        if (list2.size() > 0) {
            lyh lyhVar2 = list2.get(list2.size() - 1);
            int iB2 = lyhVar2.a().get(lyhVar2.a().size() - 1).b();
            if (iB2 > this.j) {
                this.j = iB2;
            }
        }
    }

    private int c(int i) {
        if (i == 0) {
            return 8;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                if (i == 3) {
                    return 6;
                }
                if (i == 4) {
                    return 3;
                }
                if (i == 9) {
                    return 7;
                }
                if (i == 10) {
                    return 2;
                }
                LogUtil.d("FitnessMgrAw70Storage", "changType unknown type :", Integer.valueOf(i));
                return 0;
            }
        }
        return i2;
    }

    private void i() {
        LogUtil.a("05", 1, "FitnessMgrAw70Storage", "saveDataToHiHealth enter mHiHealthDataList.size:", Integer.valueOf(this.e.size()), " mStatusList.size:", Integer.valueOf(this.h.size()));
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        this.e.addAll(this.h);
        int size = this.e.size();
        LogUtil.a("FitnessMgrAw70Storage", "saveDataToHiHealth after add mHiHealthDataList.size:", Integer.valueOf(size), ", mStatusList is ", Arrays.asList(this.h));
        hiDataInsertOption.setDatas(this.e);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: lyw.2
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("05", 1, "FitnessMgrAw70Storage", "insertSamplePointHiHealthData onResult type:", Integer.valueOf(i), " object:", obj);
                if (i == 0) {
                    lyw.this.i.sendEmptyMessage(0);
                } else {
                    lyw.this.i.sendEmptyMessage(1);
                    LogUtil.a("FitnessMgrAw70Storage", "insertSamplePointHiHealthData not correct");
                }
            }
        });
    }
}
