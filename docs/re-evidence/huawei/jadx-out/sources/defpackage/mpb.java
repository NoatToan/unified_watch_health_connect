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
import com.huawei.operation.OpAnalyticsUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
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

/* JADX INFO: loaded from: classes11.dex */
public class mpb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f42098b;
    private int e;

    private boolean c(int i, int i2) {
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

    private mpb() {
        this.f42098b = null;
        this.e = 0;
        LogUtil.a("HwBasicStorage", "FitnessMgrStorage Constructor");
        this.f42098b = new a(this, BaseApplication.getContext().getMainLooper());
    }

    public static mpb b() {
        return c.f42108a;
    }

    static class a extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WeakReference<mpb> f42107b;

        a(mpb mpbVar, Looper looper) {
            super(looper);
            this.f42107b = new WeakReference<>(mpbVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            DeviceInfo deviceInfoE;
            super.handleMessage(message);
            mpb mpbVar = this.f42107b.get();
            if (mpbVar == null) {
                return;
            }
            if (message == null) {
                LogUtil.j("HwBasicStorage", "msg is null");
                return;
            }
            mqg mqgVar = new mqg();
            if (message.obj instanceof DeviceInfo) {
                deviceInfoE = (DeviceInfo) message.obj;
            } else if (!(message.obj instanceof mqg)) {
                LogUtil.j("HwBasicStorage", "msg what is:", Integer.valueOf(message.what));
                deviceInfoE = null;
            } else {
                mqg mqgVar2 = (mqg) message.obj;
                mqgVar.e(mqgVar2.a());
                mqgVar.f(mqgVar2.j());
                mqgVar.h(mqgVar2.c());
                mqgVar.c(mqgVar2.d());
                mqgVar.e(mqgVar2.b());
                mqgVar.a(mqgVar2.e());
                deviceInfoE = mqgVar2.e();
            }
            int i = message.what;
            if (i == 0) {
                LogUtil.a("HwBasicStorage", "save data success");
                mpbVar.c(0, mqgVar, message.getData());
                return;
            }
            if (i == 1) {
                LogUtil.a("HwBasicStorage", "save data fail");
                mpbVar.c(300006, mqgVar, message.getData());
            } else if (i == 2) {
                LogUtil.a("HwBasicStorage", "save des data success");
                mpbVar.e(0, deviceInfoE);
            } else if (i != 3) {
                LogUtil.j("HwBasicStorage", "unknown msg type");
            } else {
                LogUtil.a("HwBasicStorage", "save des data fail");
                mpbVar.e(300006, deviceInfoE);
            }
        }
    }

    public void b(mpg mpgVar) {
        if (mpgVar == null) {
            LogUtil.j("HwBasicStorage", "initFitnessStorage fitnessManager is null");
        } else {
            new moz().e(mpgVar);
        }
    }

    private boolean e(String str) {
        boolean zIsClimb;
        DeviceCapability deviceCapabilityC = mpz.c(str);
        if (deviceCapabilityC == null) {
            LogUtil.j("HwBasicStorage", "getDeviceDataType deviceCapability is null");
            zIsClimb = false;
        } else {
            zIsClimb = deviceCapabilityC.isClimb();
        }
        LogUtil.a("HwBasicStorage", "isDeviceSupportClimeHeight isSupportClimb:", Boolean.valueOf(zIsClimb));
        return zIsClimb;
    }

    public void a(mqj mqjVar, DeviceInfo deviceInfo) {
        if (mqjVar == null) {
            LogUtil.j("HwBasicStorage", "saveTodayTotalData todayTotalMotion is null");
        } else {
            LogUtil.a("HwBasicStorage", "saveTodayTotalData get data success total calorie:", Integer.valueOf(mqjVar.b()));
            b(mqjVar, deviceInfo);
        }
    }

    private void b(mqj mqjVar, DeviceInfo deviceInfo) {
        ArrayList arrayList = new ArrayList(16);
        arrayList.clear();
        List<DataTotalMotion> listE = mqjVar.e();
        FitnessTotalData fitnessTotalData = new FitnessTotalData();
        fitnessTotalData.setCalorie((int) (((long) mqjVar.b()) * 1000));
        for (DataTotalMotion dataTotalMotion : listE) {
            LogUtil.a("HwBasicStorage", "type", Integer.valueOf(dataTotalMotion.getMotion_type()), "step:", Integer.valueOf(dataTotalMotion.getStep()), "calorie:", Integer.valueOf(dataTotalMotion.getCalorie()), "distance:", Integer.valueOf(dataTotalMotion.getDistance()));
            int motion_type = dataTotalMotion.getMotion_type();
            if (motion_type == 0) {
                fitnessTotalData.addPushes(dataTotalMotion.getPushes());
                fitnessTotalData.addDistance(dataTotalMotion.getDistance());
                arrayList.add(new FitnessTotalData(dataTotalMotion));
            } else if (motion_type == 1) {
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
                if (mpz.a(deviceInfo)) {
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
                LogUtil.j("HwBasicStorage", "TotalDataSportType type:", 5);
            } else {
                FitnessTotalData fitnessTotalData3 = new FitnessTotalData(dataTotalMotion);
                fitnessTotalData.addDistance(dataTotalMotion.getDistance());
                arrayList.add(fitnessTotalData3);
            }
        }
        arrayList.add(fitnessTotalData);
        d(fitnessTotalData, arrayList);
    }

    private void d(FitnessTotalData fitnessTotalData, List<FitnessTotalData> list) {
        String str;
        LogUtil.a("HwBasicStorage", "saveTodayTotalData steps:", Integer.valueOf(fitnessTotalData.getSteps()), "total fitness calorie:", Integer.valueOf(fitnessTotalData.getCalorie()), "total fitness distance:", Integer.valueOf(fitnessTotalData.getDistance()), "fitnessTotalDataList size:", Integer.valueOf(list.size()));
        DeviceInfo deviceInfoE = mpz.e("HwBasicStorage");
        if (deviceInfoE == null) {
            str = "";
        } else {
            str = "_" + deviceInfoE.getDeviceIdentify();
        }
        e(fitnessTotalData, str);
        StorageParams storageParams = new StorageParams(1);
        int iB = b(str, storageParams, "KEY_TOTAL_STEPS_FROM_DEVICE_FLAG", fitnessTotalData.getSteps());
        LogUtil.j("HwBasicStorage", "saveTotalFitnessData stepCode:", Integer.valueOf(iB));
        if (iB == 200004) {
            a(str, "KEY_TOTAL_STEPS_FROM_DEVICE_FLAG");
            b(str, storageParams, "KEY_TOTAL_STEPS_FROM_DEVICE_FLAG", fitnessTotalData.getSteps());
        }
        if (b(str, storageParams, "KEY_TOTAL_CAL_FROM_DEVICE_FLAG", ((long) fitnessTotalData.getCalorie()) / 1000) == 200004) {
            a(str, "KEY_TOTAL_CAL_FROM_DEVICE_FLAG");
            b(str, storageParams, "KEY_TOTAL_CAL_FROM_DEVICE_FLAG", ((long) fitnessTotalData.getCalorie()) / 1000);
        }
        if (b(str, storageParams, "KEY_TOTAL_DISTANCE_FROM_DEVICE_FLAG", fitnessTotalData.getDistance()) == 200004) {
            a(str, "KEY_TOTAL_DISTANCE_FROM_DEVICE_FLAG");
            b(str, storageParams, "KEY_TOTAL_DISTANCE_FROM_DEVICE_FLAG", fitnessTotalData.getDistance());
        }
    }

    private void a(String str, String str2) {
        SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10008), str2 + str);
    }

    private int b(String str, StorageParams storageParams, String str2, long j) {
        return SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), str2 + str, j + "|" + (System.currentTimeMillis() / 1000), storageParams);
    }

    private static long e(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private void e(FitnessTotalData fitnessTotalData, String str) {
        LogUtil.a("HwBasicStorage", "saveTodayTotal to hiHealth fitnessTotalData:", fitnessTotalData);
        long jE = e(System.currentTimeMillis());
        if (fitnessTotalData.getSteps() > (((System.currentTimeMillis() - lsl.r(System.currentTimeMillis())) / 60000) + 1) * 500) {
            LogUtil.a("HwBasicStorage", "saveTodayTotalToHiHealth to Steps error: ", Integer.valueOf(fitnessTotalData.getSteps()), " ,startTime: ", Long.valueOf(jE));
            return;
        }
        if (!mpz.d(mpz.d(str), System.currentTimeMillis())) {
            ReleaseLogUtil.d("HwBasicStorage", "saveTodayTotalToHiHealth It's not the same day");
            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("HwBasicStorage", "saveTodayTotalToHiHealth It's not the same day");
            return;
        }
        ArrayList<HiHealthData> arrayList = new ArrayList<>(16);
        if (fitnessTotalData.getPushes() > 0) {
            arrayList.add(a(40008, jE, System.currentTimeMillis(), fitnessTotalData.getPushes()));
            arrayList.add(a(907, jE, System.currentTimeMillis(), fitnessTotalData.getPushes()));
        }
        if (fitnessTotalData.getSteps() > 0) {
            arrayList.add(a(40002, jE, System.currentTimeMillis(), fitnessTotalData.getSteps()));
            arrayList.add(a(901, jE, System.currentTimeMillis(), fitnessTotalData.getSteps()));
        }
        if (fitnessTotalData.getCalorie() > 0) {
            arrayList.add(a(40003, jE, System.currentTimeMillis(), fitnessTotalData.getCalorie()));
            arrayList.add(a(903, jE, System.currentTimeMillis(), fitnessTotalData.getCalorie()));
        }
        if (fitnessTotalData.getDistance() > 0) {
            arrayList.add(a(40004, jE, System.currentTimeMillis(), fitnessTotalData.getDistance()));
            arrayList.add(a(902, jE, System.currentTimeMillis(), fitnessTotalData.getDistance()));
        }
        if (fitnessTotalData.getHeight() > 0) {
            arrayList.add(a(SmartMsgConstant.MSG_TYPE_RIDE_USER, jE, System.currentTimeMillis(), fitnessTotalData.getHeight()));
            arrayList.add(a(904, jE, System.currentTimeMillis(), fitnessTotalData.getHeight()));
        }
        b(arrayList);
    }

    private void b(ArrayList<HiHealthData> arrayList) {
        if (arrayList.size() > 0) {
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            hiDataInsertOption.setDatas(arrayList);
            HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: mpb.1
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public void onResult(int i, Object obj) {
                    if (obj != null) {
                        ReleaseLogUtil.d("R_HwBasicStorage", "saveTodayTotal to hiHealth onResult type:", Integer.valueOf(i), "insertHiHealthData object:", obj);
                    } else {
                        LogUtil.j("HwBasicStorage", "insertHiHealthData object is null");
                    }
                    if (i == 0) {
                        lng.a();
                    }
                }
            });
        }
    }

    private HiHealthData a(int i, long j, long j2, double d) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(i);
        hiHealthData.setDeviceUuid(myo.b());
        hiHealthData.setTimeInterval(j, j2);
        hiHealthData.setValue(d);
        return hiHealthData;
    }

    private boolean c(long j, long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy/MM/dd");
        long j3 = j * 1000;
        String str = simpleDateFormat.format(new Date(j3));
        long j4 = 1000 * j2;
        String str2 = simpleDateFormat.format(new Date(j4));
        LogUtil.a("HwBasicStorage", "firstDay:", str, "firstTime:", new Date(j3), "secondDay:", str2, "secondTime:", new Date(j4));
        return str.equals(str2);
    }

    private mqd e(mqd mqdVar, mqg mqgVar) {
        int iC = mqgVar.c();
        int iD = mqgVar.d();
        int iB = mqgVar.b();
        long jA = mqgVar.a();
        int iA = mqdVar.a();
        int iB2 = mqdVar.b();
        int iD2 = mqdVar.d();
        if (iA < iC || iB2 < iD || iD2 < iB) {
            LogUtil.a("HwBasicStorage", "convert lastTimetamp:", Long.valueOf(jA), "convert firstDate:", new Date(jA * 1000), "convert current timestamp:", Long.valueOf(mqdVar.c()), "convert secondDate:", new Date(1000 * mqdVar.c()), "convert last calorie:", Integer.valueOf(iD), "convert last step:", Integer.valueOf(iC), "convert last distance:", Integer.valueOf(iB), "convert calorie:", Integer.valueOf(iB2), "convert step:", Integer.valueOf(iA), "convert distance:", Integer.valueOf(iD2));
        }
        if (!c(jA, mqdVar.c())) {
            iC = 0;
            mqgVar.h(0);
            mqgVar.c(0);
            mqgVar.e(0);
            iD = 0;
            iB = 0;
        }
        mqd mqdVar2 = new mqd();
        mqdVar2.c(mqdVar.e());
        mqdVar2.d(iA - iC);
        mqdVar2.b(iB2 - iD);
        mqdVar2.a(iD2 - iB);
        mqdVar2.e(mqdVar.c());
        return mqdVar2;
    }

    private mqd d(mqd mqdVar, int i) {
        if (!c(d(1), mqdVar.a())) {
            int iE = mqdVar.e();
            int iA = mqdVar.a();
            long jC = mqdVar.c();
            LogUtil.a("HwBasicStorage", "step invalid checkAndModifySportData type:", Integer.valueOf(iE), "check modify step:", Integer.valueOf(iA), "step timestamp:", Long.valueOf(jC), "step date:", new Date(mqdVar.c() * 1000));
            mqdVar.d(0);
        }
        if (!c(d(2), mqdVar.b())) {
            int iE2 = mqdVar.e();
            int iB = mqdVar.b();
            long jC2 = mqdVar.c();
            LogUtil.a("HwBasicStorage", "calorie invalid date type:", Integer.valueOf(iE2), "check modify calorie:", Integer.valueOf(iB), "calorie Timestamp:", Long.valueOf(jC2), "calorie date:", new Date(mqdVar.c() * 1000));
            mqdVar.b(0);
        }
        if (!c(i, mqdVar.d())) {
            int iE3 = mqdVar.e();
            int iD = mqdVar.d();
            long jC3 = mqdVar.c();
            LogUtil.a("HwBasicStorage", "distance invalid date type:", Integer.valueOf(iE3), "check modify distance:", Integer.valueOf(iD), "distance timestamp:", Long.valueOf(jC3), "distance date:", new Date(mqdVar.c() * 1000));
            mqdVar.a(0);
        }
        return mqdVar;
    }

    private void a(mqd mqdVar, List<HiHealthData> list, String str, String str2) {
        int iE = mqdVar.e();
        int iA = mqdVar.a();
        int iB = mqdVar.b();
        int iD = mqdVar.d();
        int i = 3;
        if (e(str2) && mqdVar.e() == 3) {
            i = 5;
        }
        long jC = mqdVar.c();
        LogUtil.a("HwBasicStorage", "saveSportData type:", Integer.valueOf(iE), "calorie:", Integer.valueOf(iB), "step:", Integer.valueOf(iA), "distance:", Integer.valueOf(iD), "saveSportData Timestamp:", Long.valueOf(jC), "saveSportData date:", new Date(mqdVar.c() * 1000));
        mqd mqdVarD = d(mqdVar, i);
        if (mqdVarD.a() > 0) {
            HiHealthData hiHealthData = new HiHealthData(2);
            hiHealthData.setTimeInterval(mqdVarD.c() * 1000, (mqdVarD.c() + 60) * 1000);
            hiHealthData.setValue(mqdVarD.a());
            hiHealthData.setDeviceUuid(str);
            list.add(hiHealthData);
        } else {
            LogUtil.j("HwBasicStorage", "tempSportData invalid date step:", Integer.valueOf(mqdVarD.a()), "getTotalSteps Timestamp:", Long.valueOf(mqdVarD.c()));
        }
        if (mqdVarD.d() > 0) {
            HiHealthData hiHealthData2 = new HiHealthData(i);
            hiHealthData2.setValue(mqdVarD.d());
            hiHealthData2.setTimeInterval(mqdVarD.c() * 1000, (mqdVarD.c() + 60) * 1000);
            hiHealthData2.setDeviceUuid(str);
            list.add(hiHealthData2);
        } else {
            LogUtil.j("HwBasicStorage", "tempSportData invalid date distance:", Integer.valueOf(mqdVarD.d()), "getTotalDistance Timestamp:", Long.valueOf(mqdVarD.c()));
        }
        if (mqdVarD.b() > 0) {
            HiHealthData hiHealthData3 = new HiHealthData(4);
            hiHealthData3.setTimeInterval(mqdVarD.c() * 1000, (mqdVarD.c() + 60) * 1000);
            hiHealthData3.setValue(mqdVarD.b());
            hiHealthData3.setDeviceUuid(str);
            list.add(hiHealthData3);
            return;
        }
        LogUtil.j("HwBasicStorage", "tempSportData invalid date calorie:", Integer.valueOf(mqdVarD.b()), "getTotalCalorie startTime:", Long.valueOf(mqdVarD.c()));
    }

    private void d(mqd mqdVar, mqg mqgVar) {
        if (mqdVar.e() == 0) {
            LogUtil.j("HwBasicStorage", "updateLastTotal getCurrentStatus is 0");
            return;
        }
        int iA = mqdVar.a();
        int iB = mqdVar.b();
        int iD = mqdVar.d();
        if (iA == 0 && iB == 0 && iD == 0) {
            LogUtil.j("HwBasicStorage", "updateLastTotal getCurrentStatus:step,calorie,distance:0");
            return;
        }
        mqgVar.b(iD);
        mqgVar.a(iA);
        mqgVar.d(iB);
        mqgVar.e(mqdVar.c());
    }

    public void c(mpg mpgVar, List<mqe> list, int i, DeviceInfo deviceInfo) {
        if (mpgVar == null) {
            LogUtil.j("HwBasicStorage", "saveFitnessData fitnessManager is null");
            return;
        }
        if (list == null) {
            LogUtil.j("HwBasicStorage", "saveFitnessData healthDataList is null");
            return;
        }
        LogUtil.a("HwBasicStorage", "saveFitnessData enter, stage:", Integer.valueOf(i));
        Collections.sort(list, new Comparator<mqe>() { // from class: mpb.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(mqe mqeVar, mqe mqeVar2) {
                if (mqeVar == null || mqeVar2 == null) {
                    return 0;
                }
                return mqeVar.a() - mqeVar2.a();
            }
        });
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        mqg mqgVarD = new moz().d(mpgVar);
        long jA = mqgVarD.a();
        int iD = mpz.d(deviceInfo);
        mqgVarD.a(deviceInfo);
        if (iD == 4) {
            Iterator<mqe> it = list.iterator();
            while (it.hasNext()) {
                a(it.next(), jA, mqgVarD, arrayList, arrayList2);
            }
        } else if (mpz.e(deviceInfo) == 0) {
            Iterator<mqe> it2 = list.iterator();
            while (it2.hasNext()) {
                a(it2.next(), jA, mqgVarD, arrayList, arrayList2);
            }
        } else {
            Iterator<mqe> it3 = list.iterator();
            while (it3.hasNext()) {
                a(it3.next(), jA, mqgVarD, arrayList, arrayList2);
            }
        }
        e(i, arrayList, arrayList2, jA, mqgVarD);
        LogUtil.a("HwBasicStorage", "saveFitnessData leave");
    }

    public void e(mpg mpgVar, List<mqh> list, List<mqm> list2, int i, DeviceInfo deviceInfo) {
        if (mpgVar == null) {
            LogUtil.j("HwBasicStorage", "saveFitnessData statusFrameList fitnessManager is null");
            return;
        }
        LogUtil.a("HwBasicStorage", "saveFitnessData in separated type");
        mqg mqgVarD = new moz().d(mpgVar);
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        String strB = myo.b();
        if (list != null) {
            c(list, mqgVarD, arrayList, strB);
        }
        long jE = mpf.e(mpg.d());
        long jA = list2 != null ? a(list2, arrayList2, jE, strB) : jE;
        mqgVarD.a(deviceInfo);
        e(i, arrayList, arrayList2, jA, mqgVarD);
    }

    private void e(mqd mqdVar, List<HiHealthData> list, mqk mqkVar, HashMap<Integer, Integer> map, String str) {
        LogUtil.a("HwBasicStorage", "updateStatus DataRawSportData:", mqdVar);
        if (mqdVar.a() == 0 && mqdVar.b() == 0 && mqdVar.d() == 0) {
            return;
        }
        if (mqkVar.e() == mqdVar.e() && mqkVar.a() == mqdVar.c()) {
            mqkVar.e(60);
            return;
        }
        c(mqkVar, list, map, str);
        mqkVar.e(mqdVar.c());
        mqkVar.d(mqdVar.e());
        mqkVar.a(60);
    }

    private void a(mqa mqaVar, List<HiHealthData> list, mqk mqkVar, HashMap<Integer, Integer> map, String str) {
        LogUtil.a("HwBasicStorage", "updateStatus DataRawSleepData:", mqaVar);
        if (mqkVar.e() == mqaVar.b() && mqkVar.a() == mqaVar.d()) {
            mqkVar.e(60);
            return;
        }
        c(mqkVar, list, map, str);
        mqkVar.e(mqaVar.d());
        mqkVar.d(mqaVar.b());
        mqkVar.a(60);
    }

    private void d(List<HiHealthData> list, mqk mqkVar, HashMap<Integer, Integer> map, String str) {
        LogUtil.a("HwBasicStorage", "updateStatus null");
        if (mqkVar != null) {
            c(mqkVar, list, map, str);
        }
    }

    private void a(mqe mqeVar, long j, mqg mqgVar, List<HiHealthData> list, List<HiHealthData> list2) {
        if (mqeVar == null) {
            LogUtil.e("HwBasicStorage", "dataHealthData is null");
            return;
        }
        List<mqd> listB = mqeVar.b();
        LogUtil.a("HwBasicStorage", "dataHealthData time:", Integer.valueOf(mqeVar.a()), "dataHealthData date:", new Date(((long) mqeVar.a()) * 1000));
        mqk mqkVar = new mqk();
        String str = mqgVar.e().getSecurityUuid() + "#ANDROID21";
        String deviceIdentify = mqgVar.e().getDeviceIdentify();
        HashMap<Integer, Integer> map = new HashMap<>(16);
        if (listB != null) {
            for (mqd mqdVar : listB) {
                if (mqdVar.e() != 255 && j < mqdVar.c()) {
                    mqd mqdVarE = e(mqdVar, mqgVar);
                    d(mqdVarE, mqgVar);
                    a(mqdVarE, list, str, deviceIdentify);
                    e(mqdVar, list2, mqkVar, map, str);
                }
            }
        }
        List<mqa> listD = mqeVar.d();
        if (listD != null) {
            Iterator<mqa> it = listD.iterator();
            while (it.hasNext()) {
                a(it.next(), list2, mqkVar, map, str);
            }
        }
        d(list2, mqkVar, map, str);
    }

    private void a(List<mqf> list) {
        StringBuilder sb = new StringBuilder(16);
        sb.append("Total:" + list.size());
        int i = 0;
        for (mqf mqfVar : list) {
            sb.append("[i:");
            sb.append(i);
            sb.append("]");
            sb.append(mqfVar);
            i++;
        }
        LogUtil.a("HwBasicStorage", sb.toString());
    }

    private void b(mqh mqhVar, mqg mqgVar, List<HiHealthData> list, String str) {
        if (mqhVar != null) {
            List<mqf> listB = mqhVar.b();
            a(listB);
            Iterator<mqf> it = listB.iterator();
            while (it.hasNext()) {
                d(it.next(), list, str);
            }
            if (listB.size() > 0) {
                long jB = listB.get(listB.size() - 1).b();
                if (mqgVar.a() < jB) {
                    mqgVar.e(jB);
                }
            }
        }
    }

    private void c(List<mqh> list, mqg mqgVar, List<HiHealthData> list2, String str) {
        LogUtil.a("HwBasicStorage", "saveSampleFrameList enter");
        if (list == null || list.isEmpty()) {
            LogUtil.j("HwBasicStorage", "sampleFrameList is null");
            return;
        }
        Collections.sort(list, new Comparator<mqh>() { // from class: mpb.5
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public int compare(mqh mqhVar, mqh mqhVar2) {
                if (mqhVar == null || mqhVar2 == null) {
                    return 0;
                }
                return (int) (mqhVar.e() - mqhVar2.e());
            }
        });
        Iterator<mqh> it = list.iterator();
        while (it.hasNext()) {
            b(it.next(), mqgVar, list2, str);
        }
    }

    private long b(mqm mqmVar, long j, List<HiHealthData> list, HashMap<Integer, Integer> map, String str) {
        if (mqmVar == null) {
            LogUtil.j("HwBasicStorage", "statusFrame is null");
            return j;
        }
        List<mqk> listC = mqmVar.c();
        Iterator<mqk> it = listC.iterator();
        while (it.hasNext()) {
            c(it.next(), list, map, str);
        }
        if (listC.size() > 0) {
            long jB = listC.get(listC.size() - 1).b();
            if (jB > j) {
                return jB;
            }
        }
        return j;
    }

    private long a(List<mqm> list, List<HiHealthData> list2, long j, String str) {
        LogUtil.a("HwBasicStorage", "saveStatusFrameList enter");
        HashMap<Integer, Integer> map = new HashMap<>(16);
        if (list == null || list.isEmpty()) {
            LogUtil.j("HwBasicStorage", "statusFrameList is null");
            return j;
        }
        Iterator<mqm> it = list.iterator();
        long jB = j;
        while (it.hasNext()) {
            jB = b(it.next(), jB, list2, map, str);
        }
        LogUtil.a("HwBasicStorage", "saveStatusFrameList errorSportTypeMap:", map.toString());
        return jB;
    }

    private int d(int i) {
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
            case 10:
                i2 = 8;
                break;
            default:
                LogUtil.j("HwBasicStorage", "getHiHealthDataType dataType:", Integer.valueOf(i));
                i2 = 0;
                break;
        }
        LogUtil.a("HwBasicStorage", "getHiHealthSessionType sportType:", Integer.valueOf(i2));
        return i2;
    }

    private void d(mqf mqfVar, List<HiHealthData> list, String str) {
        if (c(d(mqfVar.d()), mqfVar.c())) {
            HiHealthData hiHealthData = new HiHealthData(d(mqfVar.d()));
            hiHealthData.setTimeInterval(mqfVar.b() * 1000, (mqfVar.b() + ((long) mqfVar.e())) * 1000);
            hiHealthData.setValue(mqfVar.c());
            hiHealthData.setDeviceUuid(str);
            LogUtil.a("HwBasicStorage", "insertSamplePoint hiHealthData:", hiHealthData);
            if (d(mqfVar.d()) == 8) {
                HiHealthData hiHealthData2 = new HiHealthData(20014);
                hiHealthData2.setTimeInterval(mqfVar.b() * 1000, (mqfVar.b() + ((long) mqfVar.e())) * 1000);
                hiHealthData2.setDeviceUuid(str);
                list.add(hiHealthData2);
            }
            list.add(hiHealthData);
            return;
        }
        LogUtil.j("HwBasicStorage", "insertSamplePoint invalid samplePoint:", mqfVar);
    }

    private int d(int i, HashMap<Integer, Integer> map) {
        switch (i) {
            case 0:
            case 1:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
                return 20002;
            case 2:
                return 20003;
            case 3:
                return 20004;
            case 4:
                return 20005;
            case 5:
            case 8:
            case 13:
            default:
                LogUtil.j("HwBasicStorage", "getHiHealthSessionType dataType:", Integer.valueOf(i));
                e(i, map);
                return 0;
            case 6:
                return 22002;
            case 7:
                return 22001;
            case 9:
                return 20007;
        }
    }

    private void e(int i, HashMap<Integer, Integer> map) {
        if (map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), Integer.valueOf(map.get(Integer.valueOf(i)).intValue() + 1));
        } else {
            map.put(Integer.valueOf(i), 1);
        }
    }

    private void c(mqk mqkVar, List<HiHealthData> list, HashMap<Integer, Integer> map, String str) {
        if (mqkVar == null) {
            LogUtil.j("HwBasicStorage", "statusPoint is null");
            return;
        }
        LogUtil.a("HwBasicStorage", "statusPoint:", mqkVar);
        for (long jB = mqkVar.b(); jB < mqkVar.a(); jB += 60) {
            if (d(mqkVar.e(), map) != 0) {
                HiHealthData hiHealthData = new HiHealthData(d(mqkVar.e(), map));
                hiHealthData.setTimeInterval(jB * 1000, (jB + 60) * 1000);
                hiHealthData.setDeviceUuid(str);
                LogUtil.a("HwBasicStorage", "saveStatusToHiHealth hiHealthData:", hiHealthData);
                list.add(hiHealthData);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(mqg mqgVar, long j) {
        mpg mpgVarD = mpg.d();
        moz mozVar = new moz();
        if (mqgVar != null) {
            if (mqgVar.j() == 2) {
                mpgVarD.ad.c(mpgVarD, mqgVar.a());
                mpgVarD.ad.a(mpgVarD, j);
            } else {
                mozVar.c(mpgVarD, mqgVar);
                mpf.a(mpgVarD, j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i, final mqg mqgVar, final Bundle bundle) {
        LogUtil.a("HwBasicStorage", "processSaveDataComplete enter errorCode:", Integer.valueOf(i));
        if (mqgVar == null) {
            LogUtil.j("HwBasicStorage", "processSaveDataComplete totalValue is null.");
            return;
        }
        if (bundle == null || bundle.isEmpty()) {
            LogUtil.j("HwBasicStorage", "processSaveDataComplete bundle is null.");
            return;
        }
        if (i == 0) {
            mit.b("HwBasicStorage", new Runnable() { // from class: mpb.4
                @Override // java.lang.Runnable
                public void run() {
                    mpb.this.a(mqgVar, bundle.getLong("newStatusTime"));
                }
            });
        }
        mpg.d().d(0, mqgVar.e());
    }

    private void e(final int i, List<HiHealthData> list, List<HiHealthData> list2, final long j, final mqg mqgVar) {
        LogUtil.a("HwBasicStorage", "saveDataToHiHealth enter mDataList.size:", Integer.valueOf(list.size()), " mStatusList.size:", Integer.valueOf(list2.size()), "stage:", Integer.valueOf(i), " newStatusTime", Long.valueOf(j));
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        list.addAll(list2);
        hiDataInsertOption.setDatas(list);
        final boolean zD = d(list);
        LogUtil.a("HwBasicStorage", "saveDataToHiHealth mDataList: ", Arrays.asList(list));
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: mpb.3
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i2, Object obj) {
                ReleaseLogUtil.d("R_HwBasicStorage", "saveDataToHiHealth onResult type:", Integer.valueOf(i2), ", object:", obj);
                mqgVar.f(i);
                Message messageObtain = Message.obtain();
                try {
                    Bundle bundle = new Bundle();
                    bundle.putLong("newStatusTime", j);
                    messageObtain.setData(bundle);
                } catch (ClassCastException unused) {
                    ReleaseLogUtil.a("R_HwBasicStorage", "CastException");
                }
                messageObtain.obj = mqgVar;
                if (i2 == 0) {
                    lng.a();
                    messageObtain.what = 0;
                    if (zD) {
                        mpb.this.c();
                    }
                } else {
                    messageObtain.what = 1;
                }
                mpb.this.f42098b.sendMessage(messageObtain);
                LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
                if (localBroadcastManager == null) {
                    LogUtil.j("HwBasicStorage", "sendBroadcast, but localBroadcastManager is null.");
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
    public void c() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(20000);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncScope(1);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    public void b(List<mqi> list, final DeviceInfo deviceInfo) {
        ArrayList arrayList = new ArrayList(16);
        ArrayList arrayList2 = new ArrayList(16);
        arrayList2.addAll(list);
        list.clear();
        LogUtil.a("HwBasicStorage", "enter saveIntensiveInfo");
        e(arrayList, arrayList2);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(arrayList);
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: mpb.7
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.d("R_HwBasicStorage", "saveIntensiveInfo onResult type:", Integer.valueOf(i), ", object:", obj);
                Message messageObtain = Message.obtain();
                if (i == 0) {
                    messageObtain.what = 2;
                } else {
                    messageObtain.what = 3;
                }
                messageObtain.obj = deviceInfo;
                mpb.this.f42098b.sendMessage(messageObtain);
            }
        });
    }

    private void e(List<HiHealthData> list, List<mqi> list2) {
        int iA;
        String strB = myo.b();
        if (list2 == null || list2.isEmpty()) {
            LogUtil.j("HwBasicStorage", "desFrameList is null or empty");
            return;
        }
        for (mqi mqiVar : list2) {
            LogUtil.a("HwBasicStorage", "DesFrame:", mqiVar.toString());
            List<mqi.d> listD = mqiVar.d();
            int i = 0;
            while (i < listD.size()) {
                mqi.d dVar = listD.get(i);
                int iC = dVar.c();
                int iA2 = dVar.a();
                int i2 = iC - (iC % 60);
                int i3 = ((iA2 - (iA2 % 60)) - i2) / 60;
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = i2 + (i4 * 60);
                    HiHealthData hiHealthData = new HiHealthData();
                    long j = ((long) i5) * 1000;
                    long j2 = ((long) (i5 + 60)) * 1000;
                    hiHealthData.setTimeInterval(j, j2);
                    hiHealthData.setValue(b(dVar.d()));
                    hiHealthData.setType(7);
                    hiHealthData.setDeviceUuid(strB);
                    list.add(hiHealthData);
                    LogUtil.a("HwBasicStorage", "Intensive data tempStartTime:", Long.valueOf(j), "tempEndTime:", Long.valueOf(j2), "value:", Integer.valueOf(b(dVar.d())), "type:", 7, "uuid:", strB);
                    i4++;
                    i3 = i3;
                    i = i;
                }
                i++;
            }
        }
        if (list2.size() > 0) {
            mqi mqiVar2 = list2.get(list2.size() - 1);
            if (mqiVar2.d().isEmpty() || mqiVar2.d().size() <= 0 || (iA = mqiVar2.d().get(mqiVar2.d().size() - 1).a()) <= this.e) {
                return;
            }
            this.e = iA;
        }
    }

    private int b(int i) {
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
                LogUtil.j("HwBasicStorage", "intensityType sportType:", Integer.valueOf(i));
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, DeviceInfo deviceInfo) {
        LogUtil.a("HwBasicStorage", "processSaveDesDataComplete enter errorCode:", Integer.valueOf(i));
        mpg mpgVarD = mpg.d();
        int iB = mpgVarD.ad.b();
        if (i == 0) {
            if (iB == 1) {
                mpf.c(mpgVarD, this.e);
            } else {
                mpf.b(mpgVarD, mpz.c(System.currentTimeMillis() / 1000));
                return;
            }
        }
        mpgVarD.e(i, deviceInfo);
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final mpb f42108a = new mpb();
    }
}
