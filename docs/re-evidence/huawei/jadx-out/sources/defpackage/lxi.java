package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.DataTotalMotion;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessTotalData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lxi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41073a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static lxi f41074c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41075b = 0;
    private d d;

    private boolean b(int i, int i2) {
        if (i2 <= 0) {
            return false;
        }
        if (i == 2) {
            if (i2 < 500) {
                return true;
            }
        } else if (i == 4) {
            if (i2 < 65535) {
                return true;
            }
        } else if (i == 2018 || i == 2002) {
            if (i2 < 255) {
                return true;
            }
        } else if (i == 5) {
            if (i2 < 1500) {
                return true;
            }
        } else if (i == 2103) {
            if (i2 <= 100) {
                return true;
            }
        } else if (i != 2105 || i2 < 255) {
            return true;
        }
        return false;
    }

    private lxi() {
        this.d = null;
        LogUtil.a("05", 1, "FitnessMgrStorage", "FitnessMgrStorage Constructor");
        this.d = new d(this, BaseApplication.getContext().getMainLooper());
    }

    public static lxi d() {
        lxi lxiVar;
        synchronized (f41073a) {
            if (f41074c == null) {
                LogUtil.j("FitnessMgrStorage", "sInstance is null");
                f41074c = new lxi();
            }
            lxiVar = f41074c;
        }
        return lxiVar;
    }

    static class d extends Handler {
        WeakReference<lxi> d;

        d(lxi lxiVar, Looper looper) {
            super(looper);
            this.d = new WeakReference<>(lxiVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            DeviceInfo deviceInfoE;
            super.handleMessage(message);
            lxi lxiVar = this.d.get();
            if (lxiVar == null) {
                return;
            }
            if (message == null) {
                LogUtil.j("FitnessMgrStorage", "msg is null");
                return;
            }
            lyl lylVar = new lyl();
            if (message.obj instanceof DeviceInfo) {
                deviceInfoE = (DeviceInfo) message.obj;
            } else if (!(message.obj instanceof lyl)) {
                LogUtil.j("FitnessMgrStorage", "msg what is:", Integer.valueOf(message.what));
                deviceInfoE = null;
            } else {
                lyl lylVar2 = (lyl) message.obj;
                lylVar.b(lylVar2.a());
                lylVar.h(lylVar2.i());
                lylVar.i(lylVar2.c());
                lylVar.a(lylVar2.d());
                lylVar.b(lylVar2.b());
                lylVar.b(lylVar2.e());
                deviceInfoE = lylVar2.e();
            }
            int i = message.what;
            if (i == 0) {
                LogUtil.a("05", 1, "FitnessMgrStorage", "save data success");
                lxiVar.c(0, lylVar, message.getData());
                return;
            }
            if (i == 1) {
                LogUtil.a("05", 1, "FitnessMgrStorage", "save data fail");
                lxiVar.c(300006, lylVar, message.getData());
            } else if (i == 2) {
                LogUtil.a("05", 1, "FitnessMgrStorage", "save des data success");
                lxiVar.d(0, deviceInfoE);
            } else if (i != 3) {
                LogUtil.j("05", 1, "FitnessMgrStorage", "unknown msg type");
            } else {
                LogUtil.a("05", 1, "FitnessMgrStorage", "save des data fail");
                lxiVar.d(300006, deviceInfoE);
            }
        }
    }

    public void a(lxg lxgVar) {
        if (lxgVar == null) {
            LogUtil.j("FitnessMgrStorage", "initFitnessStorage fitnessManager is null");
        } else {
            new lxj().b(lxgVar);
        }
    }

    public void c(lxg lxgVar) {
        if (lxgVar == null) {
            LogUtil.j("FitnessMgrStorage", "initFitnessUserStorage fitnessManager is null");
        } else {
            LogUtil.a("FitnessMgrStorage", "initFitnessUserStorage");
        }
    }

    private boolean b() {
        boolean zIsClimb;
        DeviceCapability deviceCapabilityC = eej.c();
        if (deviceCapabilityC == null) {
            LogUtil.j("FitnessMgrStorage", "getDeviceDataType deviceCapability is null");
            zIsClimb = false;
        } else {
            zIsClimb = deviceCapabilityC.isClimb();
        }
        LogUtil.a("05", 1, "FitnessMgrStorage", "isDeviceSupportClimeHeight isSupportClimb:", Boolean.valueOf(zIsClimb));
        return zIsClimb;
    }

    public void e(lxg lxgVar, lyf lyfVar, DeviceInfo deviceInfo) {
        if (lxgVar == null) {
            LogUtil.j("FitnessMgrStorage", "saveTodayTotalData fitnessManager is null");
        } else if (lyfVar == null) {
            LogUtil.j("FitnessMgrStorage", "saveTodayTotalData todayTotalMotion is null");
        } else {
            LogUtil.a("05", 1, "FitnessMgrStorage", "saveTodayTotalData get data success total calorie:", Integer.valueOf(lyfVar.d()));
            c(lxgVar, lyfVar, deviceInfo);
        }
    }

    private void c(lxg lxgVar, lyf lyfVar, DeviceInfo deviceInfo) {
        ArrayList arrayList = new ArrayList(16);
        arrayList.clear();
        List<DataTotalMotion> listA = lyfVar.a();
        FitnessTotalData fitnessTotalData = new FitnessTotalData();
        fitnessTotalData.setCalorie((int) (((long) lyfVar.d()) * 1000));
        for (DataTotalMotion dataTotalMotion : listA) {
            LogUtil.d("FitnessMgrStorage", "type", Integer.valueOf(dataTotalMotion.getMotion_type()), "step:", Integer.valueOf(dataTotalMotion.getStep()), "calorie:", Integer.valueOf(dataTotalMotion.getCalorie()), "distance:", Integer.valueOf(dataTotalMotion.getDistance()));
            int motion_type = dataTotalMotion.getMotion_type();
            if (motion_type == 1) {
                fitnessTotalData.addSteps(dataTotalMotion.getStep());
                fitnessTotalData.addDistance(dataTotalMotion.getDistance());
                arrayList.add(new FitnessTotalData(dataTotalMotion));
            } else if (motion_type == 2) {
                fitnessTotalData.addSteps(dataTotalMotion.getStep());
                fitnessTotalData.addDistance(dataTotalMotion.getDistance());
                arrayList.add(new FitnessTotalData(dataTotalMotion));
            } else if (motion_type == 3) {
                fitnessTotalData.addSteps(dataTotalMotion.getStep());
                FitnessTotalData fitnessTotalData2 = new FitnessTotalData(dataTotalMotion);
                if (lxl.d(deviceInfo)) {
                    fitnessTotalData.setHeight(dataTotalMotion.getDistance());
                    fitnessTotalData2.setHeight(fitnessTotalData2.getDistance());
                    fitnessTotalData2.setDistance(0);
                } else {
                    fitnessTotalData2.setHeight(fitnessTotalData2.getHeight());
                    fitnessTotalData2.setDistance(fitnessTotalData2.getDistance());
                    fitnessTotalData.setHeight(dataTotalMotion.getHeight());
                    fitnessTotalData.addDistance(dataTotalMotion.getDistance());
                }
                arrayList.add(fitnessTotalData2);
            } else if (motion_type != 4) {
                LogUtil.j("FitnessMgrStorage", "TotalDataSportType type:", 5);
            } else {
                FitnessTotalData fitnessTotalData3 = new FitnessTotalData(dataTotalMotion);
                fitnessTotalData.addDistance(dataTotalMotion.getDistance());
                arrayList.add(fitnessTotalData3);
            }
        }
        arrayList.add(fitnessTotalData);
        a(fitnessTotalData, arrayList);
    }

    private void a(FitnessTotalData fitnessTotalData, List<FitnessTotalData> list) {
        String str;
        LogUtil.a("05", 1, "FitnessMgrStorage", "saveTodayTotalData steps:", Integer.valueOf(fitnessTotalData.getSteps()), "total fitness calorie:", Integer.valueOf(fitnessTotalData.getCalorie()), "total fitness distance:", Integer.valueOf(fitnessTotalData.getDistance()), "fitnessTotalDataList size:", Integer.valueOf(list.size()));
        b(fitnessTotalData);
        DeviceInfo deviceInfoD = mgg.d("FitnessMgrStorage");
        if (deviceInfoD == null) {
            str = "";
        } else {
            str = "_" + deviceInfoD.getDeviceIdentify();
        }
        String str2 = str;
        StorageParams storageParams = new StorageParams(1);
        if (b(str2, storageParams, "KEY_TOTAL_STEPS_FROM_DEVICE_FLAG", fitnessTotalData.getSteps()) == 200004) {
            e(str2, "KEY_TOTAL_STEPS_FROM_DEVICE_FLAG");
            b(str2, storageParams, "KEY_TOTAL_STEPS_FROM_DEVICE_FLAG", fitnessTotalData.getSteps());
        }
        if (b(str2, storageParams, "KEY_TOTAL_CAL_FROM_DEVICE_FLAG", ((long) fitnessTotalData.getCalorie()) / 1000) == 200004) {
            e(str2, "KEY_TOTAL_CAL_FROM_DEVICE_FLAG");
            b(str2, storageParams, "KEY_TOTAL_CAL_FROM_DEVICE_FLAG", ((long) fitnessTotalData.getCalorie()) / 1000);
        }
        if (b(str2, storageParams, "KEY_TOTAL_DISTANCE_FROM_DEVICE_FLAG", fitnessTotalData.getDistance()) == 200004) {
            e(str2, "KEY_TOTAL_DISTANCE_FROM_DEVICE_FLAG");
            b(str2, storageParams, "KEY_TOTAL_DISTANCE_FROM_DEVICE_FLAG", fitnessTotalData.getDistance());
        }
    }

    private void e(String str, String str2) {
        SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10008), str2 + str);
    }

    private int b(String str, StorageParams storageParams, String str2, long j) {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), str2 + str, String.valueOf(j + "|" + (System.currentTimeMillis() / 1000)), storageParams);
    }

    private static long d(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private void b(FitnessTotalData fitnessTotalData) {
        LogUtil.a("05", 1, "FitnessMgrStorage", "saveTodayTotal to hiHealth fitnessTotalData:", fitnessTotalData);
        long jD = d(System.currentTimeMillis());
        if (fitnessTotalData.getSteps() > (((System.currentTimeMillis() - lsl.r(System.currentTimeMillis())) / 60000) + 1) * 500) {
            LogUtil.a("FitnessMgrStorage", "saveTodayTotalToHiHealth to Steps error: ", Integer.valueOf(fitnessTotalData.getSteps()), " ,startTime: ", Long.valueOf(jD));
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        if (fitnessTotalData.getSteps() > 0) {
            arrayList.add(c(40002, jD, System.currentTimeMillis(), fitnessTotalData.getSteps()));
            arrayList.add(c(901, jD, System.currentTimeMillis(), fitnessTotalData.getSteps()));
        }
        if (fitnessTotalData.getCalorie() > 0) {
            arrayList.add(c(40003, jD, System.currentTimeMillis(), fitnessTotalData.getCalorie()));
            arrayList.add(c(903, jD, System.currentTimeMillis(), fitnessTotalData.getCalorie()));
        }
        if (fitnessTotalData.getDistance() > 0) {
            arrayList.add(c(40004, jD, System.currentTimeMillis(), fitnessTotalData.getDistance()));
            arrayList.add(c(902, jD, System.currentTimeMillis(), fitnessTotalData.getDistance()));
        }
        if (fitnessTotalData.getHeight() > 0) {
            arrayList.add(c(SmartMsgConstant.MSG_TYPE_RIDE_USER, jD, System.currentTimeMillis(), fitnessTotalData.getHeight()));
            arrayList.add(c(904, jD, System.currentTimeMillis(), fitnessTotalData.getHeight()));
        }
        if (arrayList.size() > 0) {
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            hiDataInsertOption.setDatas(arrayList);
            HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: lxi.5
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public void onResult(int i, Object obj) {
                    if (obj != null) {
                        LogUtil.a("05", 1, "FitnessMgrStorage", "saveTodayTotal to hiHealth onResult type:", Integer.valueOf(i), "insertHiHealthData object:", obj);
                    } else {
                        LogUtil.j("FitnessMgrStorage", "insertHiHealthData object is null");
                    }
                    if (i == 0) {
                        lng.a();
                    }
                }
            });
        }
    }

    private HiHealthData c(int i, long j, long j2, double d2) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(i);
        hiHealthData.setDeviceUuid(mga.e());
        hiHealthData.setTimeInterval(j, j2);
        hiHealthData.setValue(d2);
        return hiHealthData;
    }

    private boolean b(long j, long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy/MM/dd");
        long j3 = j * 1000;
        String str = simpleDateFormat.format(new Date(j3));
        long j4 = 1000 * j2;
        String str2 = simpleDateFormat.format(new Date(j4));
        LogUtil.a("FitnessMgrStorage", "firstDay:", str, "firstTime:", new Date(j3), "secondDay:", str2, "secondTime:", new Date(j4));
        return str.equals(str2);
    }

    private lye e(lye lyeVar, lyl lylVar) {
        int iC = lylVar.c();
        int iD = lylVar.d();
        int iB = lylVar.b();
        long jA = lylVar.a();
        int iB2 = lyeVar.b();
        int iD2 = lyeVar.d();
        int iA = lyeVar.a();
        if (iB2 < iC || iD2 < iD || iA < iB) {
            LogUtil.a("05", 1, "FitnessMgrStorage", "convert lastTimetamp:", Long.valueOf(jA), "convert firstDate:", new Date(jA * 1000), "convert current timestamp:", Long.valueOf(lyeVar.e()), "convert secondDate:", new Date(lyeVar.e() * 1000), "convert last calorie:", Integer.valueOf(iD), "convert last step:", Integer.valueOf(iC), "convert last distance:", Integer.valueOf(iB), "convert calorie:", Integer.valueOf(iD2), "convert step:", Integer.valueOf(iB2), "convert distance:", Integer.valueOf(iA));
        }
        if (!b(jA, lyeVar.e())) {
            iC = 0;
            lylVar.i(0);
            lylVar.a(0);
            lylVar.b(0);
            iD = 0;
            iB = 0;
        }
        lye lyeVar2 = new lye();
        lyeVar2.d(lyeVar.c());
        lyeVar2.b(iB2 - iC);
        lyeVar2.e(iD2 - iD);
        lyeVar2.a(iA - iB);
        lyeVar2.c(lyeVar.e());
        return lyeVar2;
    }

    private lye c(lye lyeVar, int i) {
        if (!b(a(1), lyeVar.b())) {
            int iC = lyeVar.c();
            int iB = lyeVar.b();
            long jE = lyeVar.e();
            LogUtil.a("05", 1, "FitnessMgrStorage", "step invalid checkAndModifySportData type:", Integer.valueOf(iC), "check modify step:", Integer.valueOf(iB), "step timestamp:", Long.valueOf(jE), "step date:", new Date(lyeVar.e() * 1000));
            lyeVar.b(0);
        }
        if (!b(a(2), lyeVar.d())) {
            int iC2 = lyeVar.c();
            int iD = lyeVar.d();
            long jE2 = lyeVar.e();
            LogUtil.a("05", 1, "FitnessMgrStorage", "calorie invalid date type:", Integer.valueOf(iC2), "check modify calorie:", Integer.valueOf(iD), "calorie Timestamp:", Long.valueOf(jE2), "calorie date:", new Date(lyeVar.e() * 1000));
            lyeVar.e(0);
        }
        if (!b(i, lyeVar.a())) {
            int iC3 = lyeVar.c();
            int iA = lyeVar.a();
            long jE3 = lyeVar.e();
            LogUtil.a("05", 1, "FitnessMgrStorage", "distance invalid date type:", Integer.valueOf(iC3), "check modify distance:", Integer.valueOf(iA), "distance timestamp:", Long.valueOf(jE3), "distance date:", new Date(lyeVar.e() * 1000));
            lyeVar.a(0);
        }
        return lyeVar;
    }

    private void c(lye lyeVar, List<HiHealthData> list, String str) {
        int iC = lyeVar.c();
        int iB = lyeVar.b();
        int iD = lyeVar.d();
        int iA = lyeVar.a();
        int i = 3;
        if (b() && lyeVar.c() == 3) {
            i = 5;
        }
        long jE = lyeVar.e();
        LogUtil.a("05", 1, "FitnessMgrStorage", "saveSportData type:", Integer.valueOf(iC), "calorie:", Integer.valueOf(iD), "step:", Integer.valueOf(iB), "distance:", Integer.valueOf(iA), "saveSportData Timestamp:", Long.valueOf(jE), "saveSportData date:", new Date(lyeVar.e() * 1000));
        lye lyeVarC = c(lyeVar, i);
        if (lyeVarC.b() > 0) {
            HiHealthData hiHealthData = new HiHealthData(2);
            hiHealthData.setTimeInterval(lyeVarC.e() * 1000, (lyeVarC.e() + 60) * 1000);
            hiHealthData.setValue(lyeVarC.b());
            hiHealthData.setDeviceUuid(str);
            list.add(hiHealthData);
        } else {
            LogUtil.j("FitnessMgrStorage", "tempSportData invalid date step:", Integer.valueOf(lyeVarC.b()), "getTotalSteps Timestamp:", Long.valueOf(lyeVarC.e()));
        }
        if (lyeVarC.a() > 0) {
            HiHealthData hiHealthData2 = new HiHealthData(i);
            hiHealthData2.setValue(lyeVarC.a());
            hiHealthData2.setTimeInterval(lyeVarC.e() * 1000, (lyeVarC.e() + 60) * 1000);
            hiHealthData2.setDeviceUuid(str);
            list.add(hiHealthData2);
        } else {
            LogUtil.j("FitnessMgrStorage", "tempSportData invalid date distance:", Integer.valueOf(lyeVarC.a()), "getTotalDistance Timestamp:", Long.valueOf(lyeVarC.e()));
        }
        if (lyeVarC.d() > 0) {
            HiHealthData hiHealthData3 = new HiHealthData(4);
            hiHealthData3.setTimeInterval(lyeVarC.e() * 1000, (lyeVarC.e() + 60) * 1000);
            hiHealthData3.setValue(lyeVarC.d());
            hiHealthData3.setDeviceUuid(str);
            list.add(hiHealthData3);
            return;
        }
        LogUtil.j("FitnessMgrStorage", "tempSportData invalid date calorie:", Integer.valueOf(lyeVarC.d()), "getTotalCalorie startTime:", Long.valueOf(lyeVarC.e()));
    }

    private void d(lye lyeVar, lyl lylVar) {
        if (lyeVar.c() == 0) {
            LogUtil.j("FitnessMgrStorage", "updateLastTotal getCurrentStatus is 0");
            return;
        }
        int iB = lyeVar.b();
        int iD = lyeVar.d();
        int iA = lyeVar.a();
        if (iB == 0 && iD == 0 && iA == 0) {
            LogUtil.j("FitnessMgrStorage", "updateLastTotal getCurrentStatus:step,calorie,distance:0");
            return;
        }
        lylVar.d(iA);
        lylVar.c(iB);
        lylVar.e(iD);
        lylVar.b(lyeVar.e());
    }

    public void a(lxg lxgVar, List<lxy> list, int i, DeviceInfo deviceInfo) {
        if (lxgVar == null) {
            LogUtil.j("FitnessMgrStorage", "saveFitnessData fitnessManager is null");
            return;
        }
        if (list == null) {
            LogUtil.j("FitnessMgrStorage", "saveFitnessData healthDataList is null");
            return;
        }
        LogUtil.a("05", 1, "FitnessMgrStorage", "saveFitnessData enter, stage:", Integer.valueOf(i));
        Collections.sort(list, new Comparator<lxy>() { // from class: lxi.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(lxy lxyVar, lxy lxyVar2) {
                return lxyVar.a() - lxyVar2.a();
            }
        });
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        lyl lylVarA = new lxj().a(lxgVar);
        long jA = lylVarA.a();
        int iE = lxl.e();
        lylVarA.b(deviceInfo);
        if (iE == 4) {
            Iterator<lxy> it = list.iterator();
            while (it.hasNext()) {
                e(it.next(), jA, lylVarA, arrayList, arrayList2);
            }
        } else if (lxl.e(deviceInfo) == 0) {
            Iterator<lxy> it2 = list.iterator();
            while (it2.hasNext()) {
                e(it2.next(), jA, lylVarA, arrayList, arrayList2);
            }
        } else {
            Iterator<lxy> it3 = list.iterator();
            while (it3.hasNext()) {
                e(it3.next(), jA, lylVarA, arrayList, arrayList2);
            }
        }
        d(i, arrayList, arrayList2, jA, lylVarA);
        LogUtil.a("FitnessMgrStorage", "saveFitnessData leave");
    }

    public void c(lxg lxgVar, List<lyk> list, List<lyi> list2, int i, DeviceInfo deviceInfo) {
        if (lxgVar == null) {
            LogUtil.j("FitnessMgrStorage", "saveFitnessData statusFrameList fitnessManager is null");
            return;
        }
        LogUtil.a("05", 1, "FitnessMgrStorage", "saveFitnessData in separated type");
        lyl lylVarA = new lxj().a(lxgVar);
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        String strE = mga.e();
        if (list != null) {
            e(list, lylVarA, arrayList, strE);
        }
        long jA = lxf.a(lxgVar);
        long jC = list2 != null ? c(list2, arrayList2, jA, strE) : jA;
        lylVarA.b(deviceInfo);
        d(i, arrayList, arrayList2, jC, lylVarA);
    }

    private void a(lye lyeVar, List<HiHealthData> list, lyj lyjVar, HashMap<Integer, Integer> map, String str) {
        LogUtil.a("05", 1, "FitnessMgrStorage", "updateStatus DataRawSportData:", lyeVar);
        if (lyeVar.b() == 0 && lyeVar.d() == 0 && lyeVar.a() == 0) {
            return;
        }
        if (lyjVar.a() == lyeVar.c() && lyjVar.b() == lyeVar.e()) {
            lyjVar.e(60);
            return;
        }
        e(lyjVar, list, map, str);
        lyjVar.d(lyeVar.e());
        lyjVar.c(lyeVar.c());
        lyjVar.b(60);
    }

    private void b(lyb lybVar, List<HiHealthData> list, lyj lyjVar, HashMap<Integer, Integer> map, String str) {
        LogUtil.a("05", 1, "FitnessMgrStorage", "updateStatus DataRawSleepData:", lybVar);
        if (lyjVar.a() == lybVar.d() && lyjVar.b() == lybVar.a()) {
            lyjVar.e(60);
            return;
        }
        e(lyjVar, list, map, str);
        lyjVar.d(lybVar.a());
        lyjVar.c(lybVar.d());
        lyjVar.b(60);
    }

    private void d(List<HiHealthData> list, lyj lyjVar, HashMap<Integer, Integer> map, String str) {
        LogUtil.a("05", 1, "FitnessMgrStorage", "updateStatus null");
        if (lyjVar != null) {
            e(lyjVar, list, map, str);
        }
    }

    private void e(lxy lxyVar, long j, lyl lylVar, List<HiHealthData> list, List<HiHealthData> list2) {
        List<lye> listE = lxyVar.e();
        LogUtil.a("05", 1, "FitnessMgrStorage", "dataHealthData time:", Integer.valueOf(lxyVar.a()), "dataHealthData date:", new Date(((long) lxyVar.a()) * 1000));
        lyj lyjVar = new lyj();
        String str = lylVar.e().getSecurityUuid() + "#ANDROID21";
        HashMap<Integer, Integer> map = new HashMap<>(16);
        if (listE != null) {
            for (lye lyeVar : listE) {
                if (lyeVar.c() != 255 && j < lyeVar.e()) {
                    lye lyeVarE = e(lyeVar, lylVar);
                    d(lyeVarE, lylVar);
                    c(lyeVarE, list, str);
                    a(lyeVar, list2, lyjVar, map, str);
                }
            }
        }
        List<lyb> listD = lxyVar.d();
        if (listD != null) {
            Iterator<lyb> it = listD.iterator();
            while (it.hasNext()) {
                b(it.next(), list2, lyjVar, map, str);
            }
        }
        d(list2, lyjVar, map, str);
    }

    private void b(List<lym> list) {
        StringBuilder sb = new StringBuilder(16);
        sb.append("Total:" + list.size());
        int i = 0;
        for (lym lymVar : list) {
            sb.append("[i:");
            sb.append(i);
            sb.append("]");
            sb.append(lymVar);
            i++;
        }
        LogUtil.a("05", 1, "FitnessMgrStorage", sb.toString());
    }

    private void e(lyk lykVar, lyl lylVar, List<HiHealthData> list, String str) {
        List<lym> listD = lykVar.d();
        b(listD);
        Iterator<lym> it = listD.iterator();
        while (it.hasNext()) {
            c(it.next(), list, str);
        }
        if (listD.size() > 0) {
            long jB = listD.get(listD.size() - 1).b();
            if (lylVar.a() < jB) {
                lylVar.b(jB);
            }
        }
    }

    private void e(List<lyk> list, lyl lylVar, List<HiHealthData> list2, String str) {
        LogUtil.a("05", 1, "FitnessMgrStorage", "saveSampleFrameList enter");
        Collections.sort(list, new Comparator<lyk>() { // from class: lxi.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(lyk lykVar, lyk lykVar2) {
                return (int) (lykVar.a() - lykVar2.a());
            }
        });
        Iterator<lyk> it = list.iterator();
        while (it.hasNext()) {
            e(it.next(), lylVar, list2, str);
        }
    }

    private long c(lyi lyiVar, long j, List<HiHealthData> list, HashMap<Integer, Integer> map, String str) {
        List<lyj> listB = lyiVar.b();
        Iterator<lyj> it = listB.iterator();
        while (it.hasNext()) {
            e(it.next(), list, map, str);
        }
        if (listB.size() > 0) {
            long jC = listB.get(listB.size() - 1).c();
            if (jC > j) {
                return jC;
            }
        }
        return j;
    }

    private long c(List<lyi> list, List<HiHealthData> list2, long j, String str) {
        LogUtil.a("05", 1, "FitnessMgrStorage", "saveStatusFrameList enter");
        HashMap<Integer, Integer> map = new HashMap<>(16);
        Iterator<lyi> it = list.iterator();
        long jC = j;
        while (it.hasNext()) {
            jC = c(it.next(), jC, list2, map, str);
        }
        LogUtil.a("FitnessMgrStorage", "saveStatusFrameList errorSportTypeMap:", map.toString());
        return jC;
    }

    private int a(int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 4;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 6;
                break;
            case 5:
                i2 = 5;
                break;
            case 6:
                i2 = 2018;
                break;
            case 7:
                i2 = 2002;
                break;
            case 8:
                i2 = 2103;
                break;
            case 9:
                i2 = 2105;
                break;
            default:
                LogUtil.j("FitnessMgrStorage", "getHiHealthDataType dataType:", Integer.valueOf(i));
                i2 = 0;
                break;
        }
        LogUtil.d("FitnessMgrStorage", "getHiHealthSessionType sportType:", Integer.valueOf(i2));
        return i2;
    }

    private void c(lym lymVar, List<HiHealthData> list, String str) {
        if (b(a(lymVar.c()), lymVar.a())) {
            HiHealthData hiHealthData = new HiHealthData(a(lymVar.c()));
            hiHealthData.setTimeInterval(lymVar.b() * 1000, (lymVar.b() + ((long) lymVar.e())) * 1000);
            hiHealthData.setValue(lymVar.a());
            hiHealthData.setDeviceUuid(str);
            LogUtil.a("FitnessMgrStorage", "insertSamplePoint hiHealthData:", hiHealthData);
            list.add(hiHealthData);
            return;
        }
        LogUtil.j("FitnessMgrStorage", "insertSamplePoint invalid samplePoint:", lymVar);
    }

    private int b(int i, HashMap<Integer, Integer> map) {
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
        LogUtil.j("FitnessMgrStorage", "getHiHealthSessionType dataType:", Integer.valueOf(i));
        d(i, map);
        return 0;
    }

    private void d(int i, HashMap<Integer, Integer> map) {
        if (map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), Integer.valueOf(map.get(Integer.valueOf(i)).intValue() + 1));
        } else {
            map.put(Integer.valueOf(i), 1);
        }
    }

    private void e(lyj lyjVar, List<HiHealthData> list, HashMap<Integer, Integer> map, String str) {
        LogUtil.a("05", 1, "FitnessMgrStorage", "statusPoint:", lyjVar);
        for (long jC = lyjVar.c(); jC < lyjVar.b(); jC += 60) {
            if (b(lyjVar.a(), map) != 0) {
                HiHealthData hiHealthData = new HiHealthData(b(lyjVar.a(), map));
                hiHealthData.setTimeInterval(jC * 1000, (jC + 60) * 1000);
                hiHealthData.setDeviceUuid(str);
                LogUtil.d("FitnessMgrStorage", "saveStatusToHiHealth hiHealthData:", hiHealthData);
                list.add(hiHealthData);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(lyl lylVar, long j) {
        lxg lxgVarC = lxg.c(BaseApplication.getContext());
        lxj lxjVar = new lxj();
        if (lylVar != null) {
            if (lylVar.i() == 2) {
                lxgVarC.ag.d(lxgVarC, lylVar.a());
                lxgVarC.ag.a(lxgVarC, j);
            } else {
                lxjVar.b(lxgVarC, lylVar);
                lxf.c(lxgVarC, j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, final lyl lylVar, final Bundle bundle) {
        LogUtil.a("05", 1, "FitnessMgrStorage", "processSaveDataComplete enter errorCode:", Integer.valueOf(i));
        if (lylVar == null) {
            LogUtil.j("FitnessMgrStorage", "processSaveDataComplete totalValue is null.");
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            LogUtil.j("FitnessMgrStorage", "processSaveDataComplete bundle is null.");
            return;
        }
        if (i == 0) {
            mit.b("FitnessMgrStorage", new Runnable() { // from class: lxi.4
                @Override // java.lang.Runnable
                public void run() {
                    lxi.this.b(lylVar, bundle.getLong("newStatusTime"));
                }
            });
        }
        lxg.c(BaseApplication.getContext()).c(0, lylVar.e());
    }

    private void d(final int i, List<HiHealthData> list, List<HiHealthData> list2, final long j, final lyl lylVar) {
        LogUtil.a("FitnessMgrStorage", "saveDataToHiHealth enter mDataList.size:", Integer.valueOf(list.size()), " mStatusList.size:", Integer.valueOf(list2.size()), "stage:", Integer.valueOf(i), " newStatusTime", Long.valueOf(j));
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        list.addAll(list2);
        hiDataInsertOption.setDatas(list);
        final boolean zD = d(list);
        LogUtil.a("FitnessMgrStorage", "saveDataToHiHealth mDataList: ", Arrays.asList(list));
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: lxi.1
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i2, Object obj) {
                LogUtil.a("05", 1, "FitnessMgrStorage", "saveDataToHiHealth onResult type:", Integer.valueOf(i2), ", object:", obj);
                lylVar.h(i);
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putLong("newStatusTime", j);
                messageObtain.setData(bundle);
                messageObtain.obj = lylVar;
                if (i2 == 0) {
                    lng.a();
                    messageObtain.what = 0;
                    if (zD) {
                        lxi.this.a();
                    }
                } else {
                    messageObtain.what = 1;
                }
                lxi.this.d.sendMessage(messageObtain);
                LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
                if (localBroadcastManager == null) {
                    LogUtil.j("FitnessMgrStorage", "sendBroadcast, but localBroadcastManager is null.");
                } else if (i == 1) {
                    localBroadcastManager.sendBroadcast(new Intent("com.huawei.health.action.COMMON_DATA_SAVE_COMPLETED"));
                }
            }
        });
    }

    private boolean d(List<HiHealthData> list) {
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            if (HiHealthDataType.r(it.next().getType())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(20000);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    public void b(List<lyh> list, final DeviceInfo deviceInfo) {
        ArrayList arrayList = new ArrayList(16);
        LogUtil.a("FitnessMgrStorage", "enter saveIntensiveInfo");
        c(arrayList, list);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(arrayList);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: lxi.7
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("05", 1, "FitnessMgrStorage", "saveIntensiveInfo onResult type:", Integer.valueOf(i), ", object:", obj);
                Message messageObtain = Message.obtain();
                if (i == 0) {
                    messageObtain.what = 2;
                } else {
                    messageObtain.what = 3;
                }
                messageObtain.obj = deviceInfo;
                lxi.this.d.sendMessage(messageObtain);
            }
        });
    }

    private void c(List<HiHealthData> list, List<lyh> list2) {
        String strE = mga.e();
        for (lyh lyhVar : list2) {
            LogUtil.d("FitnessMgrStorage", "DesFrame:", lyhVar.toString());
            List<lyh.c> listA = lyhVar.a();
            int i = 0;
            while (i < listA.size()) {
                lyh.c cVar = listA.get(i);
                int iD = cVar.d();
                int iB = cVar.b();
                int i2 = iD - (iD % 60);
                int i3 = ((iB - (iB % 60)) - i2) / 60;
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = i2 + (i4 * 60);
                    HiHealthData hiHealthData = new HiHealthData();
                    long j = ((long) i5) * 1000;
                    long j2 = ((long) (i5 + 60)) * 1000;
                    hiHealthData.setTimeInterval(j, j2);
                    hiHealthData.setValue(d(cVar.c()));
                    hiHealthData.setType(7);
                    hiHealthData.setDeviceUuid(strE);
                    list.add(hiHealthData);
                    LogUtil.d("FitnessMgrStorage", "Intensive data tempStartTime:", Long.valueOf(j), "tempEndTime:", Long.valueOf(j2), "value:", Integer.valueOf(d(cVar.c())), "type:", 7, "uuid:", strE);
                    i4++;
                    i3 = i3;
                    i = i;
                }
                i++;
            }
        }
        if (list2.size() > 0) {
            lyh lyhVar2 = list2.get(list2.size() - 1);
            int iB2 = lyhVar2.a().get(lyhVar2.a().size() - 1).b();
            if (iB2 > this.f41075b) {
                this.f41075b = iB2;
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
                LogUtil.j("FitnessMgrStorage", "intensityType sportType:", Integer.valueOf(i));
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, DeviceInfo deviceInfo) {
        LogUtil.a("05", 1, "FitnessMgrStorage", "processSaveDesDataComplete enter errorCode:", Integer.valueOf(i));
        lxg lxgVarC = lxg.c(BaseApplication.getContext());
        int iC = lxgVarC.ag.c();
        if (i == 0) {
            if (iC == 1) {
                lxf.a(lxgVarC, this.f41075b);
            } else {
                lxf.e(lxgVarC, lxl.d(System.currentTimeMillis() / 1000));
                return;
            }
        }
        lxgVarC.a(i, deviceInfo);
    }
}
