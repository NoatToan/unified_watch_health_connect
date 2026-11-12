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

/* JADX INFO: loaded from: classes11.dex */
public class mpm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f42133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f42134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42135c;
    private long d;
    private List<HiHealthData> e;
    private List<HiHealthData> f;
    private mqg g;
    private mqk h;
    private long j;

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

    private mpm() {
        this.h = null;
        this.f42135c = 0;
        this.g = new mqg();
        this.f42133a = 0L;
        this.d = 0L;
        this.j = 0L;
        LogUtil.a("05", 1, "BasicMgrAw70Storage", "FitnessMgrAw70Storage Constructor");
        this.f42134b = new d(this, BaseApplication.getContext().getMainLooper());
    }

    public static mpm d() {
        return c.d;
    }

    static class d extends Handler {
        WeakReference<mpm> e;

        d(mpm mpmVar, Looper looper) {
            super(looper);
            this.e = new WeakReference<>(mpmVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                LogUtil.j("BasicMgrAw70Storage", "handleMessage(), message is null");
                return;
            }
            super.handleMessage(message);
            mpm mpmVar = this.e.get();
            if (mpmVar == null) {
                LogUtil.j("BasicMgrAw70Storage", "handleMessage(), storageAdapter is null");
                return;
            }
            int i = message.what;
            if (i == 0) {
                mpmVar.a(0);
                return;
            }
            if (i == 1) {
                mpmVar.a(300006);
                return;
            }
            if (i == 101) {
                LogUtil.a("05", 1, "BasicMgrAw70Storage", "save data success");
                mpmVar.c(0);
            } else if (i != 102) {
                LogUtil.j("05", 1, "BasicMgrAw70Storage", "unknown message type");
            } else {
                LogUtil.a("05", 1, "BasicMgrAw70Storage", "save data fail");
                mpmVar.c(300006);
            }
        }
    }

    public void e() {
        new mpp().d();
    }

    public void b(mpq mpqVar, mqj mqjVar) {
        if (mqjVar == null) {
            LogUtil.j("BasicMgrAw70Storage", "saveTodayTotalData() todayTotalMotion is null");
            return;
        }
        e(mqjVar);
        List<DataTotalMotion> listE = mqjVar.e();
        ArrayList arrayList = new ArrayList(16);
        FitnessTotalData fitnessTotalData = new FitnessTotalData();
        fitnessTotalData.setCalorie(mqjVar.b() * 1000);
        for (DataTotalMotion dataTotalMotion : listE) {
            b(dataTotalMotion);
            d(dataTotalMotion, arrayList, fitnessTotalData, mpqVar);
        }
        d(fitnessTotalData, arrayList);
    }

    private void d(DataTotalMotion dataTotalMotion, List<FitnessTotalData> list, FitnessTotalData fitnessTotalData, mpq mpqVar) {
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
                    FitnessTotalData fitnessTotalDataB = b(mpqVar, dataTotalMotion);
                    fitnessTotalData.addSteps(fitnessTotalDataB.getSteps());
                    fitnessTotalData.setHeight(fitnessTotalDataB.getHeight());
                    fitnessTotalData.addDistance(fitnessTotalDataB.getDistance());
                    list.add(new FitnessTotalData(dataTotalMotion));
                    break;
                case 4:
                    fitnessTotalData.addDistance(dataTotalMotion.getDistance());
                    list.add(new FitnessTotalData(dataTotalMotion));
                    break;
                case 5:
                    LogUtil.a("05", 1, "BasicMgrAw70Storage", "stand type");
                    break;
                case 6:
                    LogUtil.a("05", 1, "BasicMgrAw70Storage", "shallow sleep type");
                    break;
                case 7:
                    LogUtil.a("05", 1, "BasicMgrAw70Storage", "deep sleep type");
                    break;
                default:
                    LogUtil.d("05", 1, "BasicMgrAw70Storage", "unknown type");
                    break;
            }
            return;
        }
        fitnessTotalData.addSteps(dataTotalMotion.getStep());
        fitnessTotalData.addDistance(dataTotalMotion.getDistance());
        list.add(e(dataTotalMotion));
    }

    private FitnessTotalData b(mpq mpqVar, DataTotalMotion dataTotalMotion) {
        FitnessTotalData fitnessTotalData = new FitnessTotalData();
        fitnessTotalData.setSteps(dataTotalMotion.getStep());
        if (mpqVar != null) {
            fitnessTotalData.setHeight(dataTotalMotion.getHeight());
            fitnessTotalData.setDistance(dataTotalMotion.getDistance());
        }
        return fitnessTotalData;
    }

    private void d(FitnessTotalData fitnessTotalData, List<FitnessTotalData> list) {
        list.add(fitnessTotalData);
        LogUtil.a("05", 1, "BasicMgrAw70Storage", "saveTodayTotalData steps:", Integer.valueOf(fitnessTotalData.getSteps()), " calorie:", Integer.valueOf(fitnessTotalData.getCalorie()), " distance:", Integer.valueOf(fitnessTotalData.getDistance()), " size:", Integer.valueOf(list.size()));
        a(fitnessTotalData);
        b(fitnessTotalData);
    }

    private void b(DataTotalMotion dataTotalMotion) {
        LogUtil.d("BasicMgrAw70Storage", "type:", Integer.valueOf(dataTotalMotion.getMotion_type()), " step:", Integer.valueOf(dataTotalMotion.getStep()), " calorie:", Integer.valueOf(dataTotalMotion.getCalorie()), " distance:", Integer.valueOf(dataTotalMotion.getDistance()));
    }

    private void e(mqj mqjVar) {
        LogUtil.a("05", 1, "BasicMgrAw70Storage", "saveTodayTotalData get data success total calorie is:", Integer.valueOf(mqjVar.b()));
    }

    private FitnessTotalData e(DataTotalMotion dataTotalMotion) {
        FitnessTotalData fitnessTotalData = new FitnessTotalData(dataTotalMotion);
        fitnessTotalData.setSportType(2);
        return fitnessTotalData;
    }

    private void b(FitnessTotalData fitnessTotalData) {
        String str;
        DeviceInfo deviceInfoB = mpz.b("BasicMgrAw70Storage");
        if (deviceInfoB == null) {
            str = "";
        } else {
            str = "_" + deviceInfoB.getDeviceIdentify();
        }
        StorageParams storageParams = new StorageParams(1);
        if (c(str, storageParams, "KEY_TOTAL_STEPS_FROM_DEVICE_FLAG", fitnessTotalData.getSteps()) == 200004) {
            SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10008), "KEY_TOTAL_STEPS_FROM_DEVICE_FLAG" + str);
            c(str, storageParams, "KEY_TOTAL_STEPS_FROM_DEVICE_FLAG", fitnessTotalData.getSteps());
        }
        String str2 = (fitnessTotalData.getCalorie() / 1000) + "|" + (System.currentTimeMillis() / 1000);
        if (SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "KEY_TOTAL_CAL_FROM_DEVICE_FLAG" + str, str2, storageParams) == 200004) {
            SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10008), "KEY_TOTAL_CAL_FROM_DEVICE_FLAG" + str);
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "KEY_TOTAL_CAL_FROM_DEVICE_FLAG" + str, str2, storageParams);
        }
        if (c(str, storageParams, "KEY_TOTAL_DISTANCE_FROM_DEVICE_FLAG", fitnessTotalData.getDistance()) == 200004) {
            SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10008), "KEY_TOTAL_DISTANCE_FROM_DEVICE_FLAG" + str);
            c(str, storageParams, "KEY_TOTAL_DISTANCE_FROM_DEVICE_FLAG", fitnessTotalData.getDistance());
        }
    }

    private int c(String str, StorageParams storageParams, String str2, int i) {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), str2 + str, i + "|" + (System.currentTimeMillis() / 1000), storageParams);
    }

    public static long d(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public void a(FitnessTotalData fitnessTotalData) {
        LogUtil.a("05", 1, "BasicMgrAw70Storage", "saveTodayTotalToHiHealth fitnessTotalData :", fitnessTotalData);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        ArrayList arrayList = new ArrayList(16);
        arrayList.addAll(c(fitnessTotalData));
        if (arrayList.isEmpty()) {
            LogUtil.j("BasicMgrAw70Storage", "saveTodayTotalToHiHealth() dataList is empty");
        } else {
            hiDataInsertOption.setDatas(arrayList);
            HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: mpm.3
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public void onResult(int i, Object obj) {
                    LogUtil.a("05", 1, "BasicMgrAw70Storage", "saveTodayTotalToHiHealth onResult type:", Integer.valueOf(i), " object:", obj);
                    if (i == 0) {
                        lng.a();
                    }
                }
            });
        }
    }

    private ArrayList<HiHealthData> c(FitnessTotalData fitnessTotalData) {
        ArrayList<HiHealthData> arrayList = new ArrayList<>(16);
        if (fitnessTotalData == null) {
            LogUtil.j("BasicMgrAw70Storage", "addData() fitnessTotalData is null");
            return arrayList;
        }
        long jD = d(System.currentTimeMillis());
        if (fitnessTotalData.getSteps() > 0) {
            HiHealthData hiHealthData = new HiHealthData();
            hiHealthData.setType(40002);
            hiHealthData.setDeviceUuid(mpz.c());
            hiHealthData.setTimeInterval(jD, System.currentTimeMillis());
            hiHealthData.setValue(fitnessTotalData.getSteps());
            arrayList.add(hiHealthData);
            HiHealthData hiHealthData2 = new HiHealthData();
            hiHealthData2.setType(901);
            hiHealthData2.setDeviceUuid(mpz.c());
            hiHealthData2.setTimeInterval(jD, System.currentTimeMillis());
            hiHealthData2.setValue(fitnessTotalData.getSteps());
            arrayList.add(hiHealthData2);
        }
        if (fitnessTotalData.getCalorie() > 0) {
            HiHealthData hiHealthData3 = new HiHealthData();
            hiHealthData3.setType(40003);
            hiHealthData3.setDeviceUuid(mpz.c());
            hiHealthData3.setTimeInterval(jD, System.currentTimeMillis());
            hiHealthData3.setValue(fitnessTotalData.getCalorie());
            arrayList.add(hiHealthData3);
        }
        if (fitnessTotalData.getDistance() > 0) {
            HiHealthData hiHealthData4 = new HiHealthData();
            hiHealthData4.setType(40004);
            hiHealthData4.setDeviceUuid(mpz.c());
            hiHealthData4.setTimeInterval(jD, System.currentTimeMillis());
            hiHealthData4.setValue(fitnessTotalData.getDistance());
            arrayList.add(hiHealthData4);
        }
        if (fitnessTotalData.getHeight() > 0) {
            HiHealthData hiHealthData5 = new HiHealthData();
            hiHealthData5.setType(SmartMsgConstant.MSG_TYPE_RIDE_USER);
            hiHealthData5.setDeviceUuid(mpz.c());
            hiHealthData5.setTimeInterval(jD, System.currentTimeMillis());
            hiHealthData5.setValue(fitnessTotalData.getHeight());
            arrayList.add(hiHealthData5);
        }
        return arrayList;
    }

    public void c(List<mqh> list, List<mqm> list2) {
        LogUtil.a("05", 1, "BasicMgrAw70Storage", "saveFitnessData in SEPARATED type");
        mqg mqgVarA = new mpp().a();
        this.g = mqgVarA;
        this.f42133a = mqgVarA.a();
        b();
        d(list);
        e(list2);
        c();
    }

    public void a(List<mqf> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("BasicMgrAw70Storage", "logSampleList() samplePoints is null");
            return;
        }
        StringBuilder sb = new StringBuilder(16);
        sb.append("Total:" + list.size());
        int i = 0;
        for (mqf mqfVar : list) {
            sb.append("[index:");
            sb.append(i);
            sb.append("]");
            sb.append(mqfVar);
            i++;
        }
        LogUtil.a("05", 1, "BasicMgrAw70Storage", sb.toString());
    }

    public void b(mqh mqhVar) {
        if (mqhVar == null) {
            LogUtil.j("BasicMgrAw70Storage", "saveSampleFrame() sampleFrame is null");
            return;
        }
        List<mqf> listB = mqhVar.b();
        a(listB);
        for (mqf mqfVar : listB) {
            if (this.f42133a >= mqfVar.b()) {
                if (mqfVar.a() == 1) {
                    b(mqfVar);
                }
            } else {
                d(mqfVar);
            }
        }
        if (listB.size() > 0) {
            long jB = listB.get(listB.size() - 1).b();
            if (this.g.a() < jB) {
                this.g.e(jB);
            }
        }
    }

    public void d(List<mqh> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("BasicMgrAw70Storage", "saveSampleFrameList() sampleFrameList is null");
            return;
        }
        LogUtil.a("05", 1, "BasicMgrAw70Storage", "saveSampleFrameList enter");
        Collections.sort(list, new Comparator<mqh>() { // from class: mpm.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public int compare(mqh mqhVar, mqh mqhVar2) {
                return (int) (mqhVar.e() - mqhVar2.e());
            }
        });
        Iterator<mqh> it = list.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public void b(mqm mqmVar) {
        if (mqmVar == null) {
            LogUtil.j("BasicMgrAw70Storage", "saveStatusFrame() statusFrame is null");
            return;
        }
        List<mqk> listC = mqmVar.c();
        for (mqk mqkVar : listC) {
            if (mqkVar.b() <= this.d) {
                if (mqkVar.c() == 1) {
                    b(mqkVar);
                } else if ((mqkVar.e() != 7 && mqkVar.e() != 6) || mqkVar.b() <= this.d - 1800) {
                    LogUtil.d("BasicMgrAw70Storage", "no need special handle!");
                } else {
                    b(mqkVar);
                }
            } else {
                d(mqkVar);
            }
        }
        if (listC.size() > 0) {
            long jB = listC.get(listC.size() - 1).b();
            if (jB > this.j) {
                this.j = jB;
            }
        }
    }

    public void e(List<mqm> list) {
        LogUtil.a("05", 1, "BasicMgrAw70Storage", "saveStatusFrameList enter");
        long jC = mpo.c();
        this.d = jC;
        this.j = jC;
        if (list == null || list.isEmpty()) {
            LogUtil.j("BasicMgrAw70Storage", "saveStatusFrameList() or statusFrameList is null");
            return;
        }
        Iterator<mqm> it = list.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    void b() {
        this.e = new ArrayList(16);
        this.f = new ArrayList(16);
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
                LogUtil.d("BasicMgrAw70Storage", "getHiHealthDataType unknown type :", Integer.valueOf(i));
                return 0;
        }
    }

    private void b(mqf mqfVar) {
        LogUtil.a("05", 1, "BasicMgrAw70Storage", "updateSamplePoint sample:", mqfVar);
        d(mqfVar);
    }

    private void d(mqf mqfVar) {
        if (d(b(mqfVar.d()), mqfVar.c())) {
            HiHealthData hiHealthData = new HiHealthData(b(mqfVar.d()));
            hiHealthData.setTimeInterval(mqfVar.b() * 1000, (mqfVar.b() + ((long) mqfVar.e())) * 1000);
            hiHealthData.setValue(mqfVar.c());
            hiHealthData.setDeviceUuid(mpz.c());
            this.e.add(hiHealthData);
            return;
        }
        LogUtil.d("BasicMgrAw70Storage", "insertSamplePoint invalid sample:", mqfVar);
    }

    private int e(int i) {
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
        LogUtil.d("BasicMgrAw70Storage", "getHiHealthSessionType unknown type :", Integer.valueOf(i));
        return 0;
    }

    private void b(mqk mqkVar) {
        LogUtil.d("BasicMgrAw70Storage", "updateStatusToHiHealth:", mqkVar);
        d(mqkVar);
    }

    private void d(mqk mqkVar) {
        LogUtil.a("05", 1, "BasicMgrAw70Storage", "statusPoint :", mqkVar);
        for (long jB = mqkVar.b(); jB < mqkVar.a(); jB += 60) {
            if (e(mqkVar.e()) != 0) {
                HiHealthData hiHealthData = new HiHealthData(e(mqkVar.e()));
                hiHealthData.setTimeInterval(jB * 1000, (jB + 60) * 1000);
                hiHealthData.setDeviceUuid(mpz.c());
                LogUtil.d("BasicMgrAw70Storage", "saveStatusToHiHealth hiHealthData:", hiHealthData);
                this.f.add(hiHealthData);
            }
        }
    }

    public void a() {
        new mpp().d(this.g);
        mpo.a(this.j);
    }

    public void c(int i) {
        LogUtil.a("05", 1, "BasicMgrAw70Storage", "processSaveDataComplete enter errCode:", Integer.valueOf(i));
        if (i == 0) {
            mit.b("BasicMgrAw70Storage", new Runnable() { // from class: mpm.4
                @Override // java.lang.Runnable
                public void run() {
                    mpm.this.a();
                }
            });
        }
        mpq.c().e(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        LogUtil.a("05", 1, "BasicMgrAw70Storage", "startSyncIntensiveData enter errorCode:", Integer.valueOf(i));
        mpq.c().e();
    }

    public void b(List<mqi> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("BasicMgrAw70Storage", "saveIntensiveInfo() desFrames is null");
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        LogUtil.a("BasicMgrAw70Storage", "enter saveIntensiveInfo");
        b(arrayList, list);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        int size = arrayList.size();
        LogUtil.d("BasicMgrAw70Storage", "saveIntensiveInfo dataList size:", Integer.valueOf(size), ",value", arrayList.toString());
        hiDataInsertOption.setDatas(arrayList);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: mpm.1
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("05", 1, "BasicMgrAw70Storage", "saveIntensiveInfo onResult type:", Integer.valueOf(i), " object:", obj);
                if (i == 0) {
                    mpm.this.f42134b.sendEmptyMessage(101);
                } else {
                    mpm.this.f42134b.sendEmptyMessage(102);
                    LogUtil.a("BasicMgrAw70Storage", "saveIntensiveInfo not correct");
                }
            }
        });
    }

    private void b(List<HiHealthData> list, List<mqi> list2) {
        String strC = mpz.c();
        for (mqi mqiVar : list2) {
            List<mqi.d> listD = mqiVar.d();
            int i = 0;
            while (i < listD.size()) {
                mqi.d dVar = listD.get(i);
                LogUtil.a("BasicMgrAw70Storage", "DesFrame :", mqiVar.toString());
                int iC = dVar.c();
                int iA = dVar.a();
                int i2 = iC - (iC % 60);
                int i3 = ((iA - (iA % 60)) - i2) / 60;
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = (i4 * 60) + i2;
                    HiHealthData hiHealthData = new HiHealthData();
                    long j = ((long) i5) * 1000;
                    long j2 = ((long) (i5 + 60)) * 1000;
                    hiHealthData.setTimeInterval(j, j2);
                    hiHealthData.setValue(d(dVar.d()));
                    hiHealthData.setType(7);
                    hiHealthData.setDeviceUuid(strC);
                    list.add(hiHealthData);
                    LogUtil.a("BasicMgrAw70Storage", "Intensive data: startTime :", Long.valueOf(j), " endTime :", Long.valueOf(j2), " value :", Integer.valueOf(d(dVar.d())), " type :", 7);
                    i4++;
                    i = i;
                }
                i++;
            }
        }
        if (list2.size() > 0) {
            mqi mqiVar2 = list2.get(list2.size() - 1);
            int iA2 = mqiVar2.d().get(mqiVar2.d().size() - 1).a();
            if (iA2 > this.f42135c) {
                this.f42135c = iA2;
            }
        }
    }

    private int d(int i) {
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
                LogUtil.d("BasicMgrAw70Storage", "changType unknown type :", Integer.valueOf(i));
                return 0;
            }
        }
        return i2;
    }

    private void c() {
        LogUtil.a("05", 1, "BasicMgrAw70Storage", "saveDataToHiHealth enter mHiHealthDataList.size:", Integer.valueOf(this.e.size()), " mStatusList.size:", Integer.valueOf(this.f.size()));
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        this.e.addAll(this.f);
        int size = this.e.size();
        LogUtil.a("BasicMgrAw70Storage", "saveDataToHiHealth after add mHiHealthDataList.size:", Integer.valueOf(size), ", mStatusList is ", Arrays.asList(this.f));
        hiDataInsertOption.setDatas(this.e);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: mpm.5
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("05", 1, "BasicMgrAw70Storage", "insertSamplePointHiHealthData onResult type:", Integer.valueOf(i), " object:", obj);
                if (i == 0) {
                    mpm.this.f42134b.sendEmptyMessage(0);
                } else {
                    mpm.this.f42134b.sendEmptyMessage(1);
                    LogUtil.a("BasicMgrAw70Storage", "insertSamplePointHiHealthData not correct");
                }
            }
        });
    }

    static class c {
        private static final mpm d = new mpm();
    }
}
