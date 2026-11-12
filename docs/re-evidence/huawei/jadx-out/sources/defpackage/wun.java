package defpackage;

import android.content.Context;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class wun {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static wun f52513b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f52514a = BaseApplication.getContext();

    public static wun c() {
        if (f52513b == null) {
            f52513b = new wun();
        }
        return f52513b;
    }

    public void d() {
        LogUtil.a("HealthMockUtil", "insertBloodOxygenData");
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(2103);
        hiHealthData.setStartTime(System.currentTimeMillis());
        hiHealthData.setEndTime(System.currentTimeMillis());
        hiHealthData.setValue(e(96, 99));
        hiHealthData.setDeviceUuid("-1");
        d(Arrays.asList(hiHealthData), new IBaseResponseCallback() { // from class: wun.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("HealthMockUtil", "insertBloodOxygenData errCode = ", Integer.valueOf(i));
            }
        });
    }

    public void i() {
        if (CommonUtil.ca()) {
            LogUtil.a("HealthMockUtil", "insertSleepWeekData inter");
            d(c(0, 1), new IBaseResponseCallback() { // from class: wun.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HealthMockUtil", "insertSleepWeekData err_code = " + i);
                }
            });
        }
    }

    public void j() {
        if (CommonUtil.ca()) {
            LogUtil.a("HealthMockUtil", "insertSleepMonthData inter");
            d(c(1, 4), new IBaseResponseCallback() { // from class: wun.3
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HealthMockUtil", "insertSleepMonthData err_code = " + i);
                }
            });
        }
    }

    public void h() {
        if (CommonUtil.ca()) {
            LogUtil.a("HealthMockUtil", "insertWeightWeekDatas inter");
            d(d(0, 1), new IBaseResponseCallback() { // from class: wun.2
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HealthMockUtil", "insertWeightWeekDatas err_code = " + i);
                }
            });
        }
    }

    public void g() {
        if (CommonUtil.ca()) {
            LogUtil.a("HealthMockUtil", "insertWeightMonthData inter");
            d(d(1, 4), new IBaseResponseCallback() { // from class: wun.5
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HealthMockUtil", "insertWeightMonthData err_code = " + i);
                }
            });
        }
    }

    public void b() {
        if (CommonUtil.ca()) {
            LogUtil.a("HealthMockUtil", "insertPressureWeekData inter");
            d(b(0, 1), new IBaseResponseCallback() { // from class: wun.8
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HealthMockUtil", "insertPressureWeekData err_code = " + i);
                }
            });
        }
    }

    public void a() {
        if (CommonUtil.ca()) {
            LogUtil.a("HealthMockUtil", "insertPressureMonthData inter");
            d(b(1, 4), new IBaseResponseCallback() { // from class: wun.7
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("HealthMockUtil", "insertPressureMonthData err_code = " + i);
                }
            });
        }
    }

    private List<HiHealthData> b(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        while (i < i2) {
            for (int i3 = 0; i3 < 7; i3++) {
                if (i == 0 && i3 == 0) {
                    arrayList.addAll(f());
                } else {
                    arrayList.addAll(a(i, i3));
                }
            }
            i++;
        }
        return arrayList;
    }

    private List<HiHealthData> c(int i, int i2) {
        ArrayList<HiHealthData> arrayListD;
        ArrayList arrayList = new ArrayList();
        long jC = ltb.c(System.currentTimeMillis());
        LogUtil.a("HealthMockUtil", "getInsertSleepHiHealthDatas startTime = ", new Date(jC));
        for (int i3 = i; i3 < i2; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                if (i3 == 0 && i4 == 0) {
                    arrayListD = d(jC, jC - 6300000, e(99));
                } else {
                    long j = jC - (((long) ((i3 * 7) + i4)) * 86400000);
                    arrayListD = d(j, (j - (e(0, 3) * 3600000)) + (3600000 / ((long) e(1, 20))), e(e(0, 6)));
                }
                arrayList.addAll(arrayListD);
            }
        }
        return arrayList;
    }

    private String e(int i) {
        String str = "";
        InputStream inputStream = null;
        try {
            try {
                InputStream inputStreamE = pee.e("health", "sleepdata" + String.valueOf(i) + ".txt");
                if (inputStreamE == null) {
                    if (inputStreamE != null) {
                        try {
                            inputStreamE.close();
                            return "";
                        } catch (IOException e) {
                            LogUtil.e("HealthMockUtil", "getBetaFile e is ", e.getMessage());
                        }
                    }
                    return "";
                }
                byte[] bArr = new byte[inputStreamE.available()];
                str = inputStreamE.read(bArr) > 0 ? new String(bArr, "UTF-8") : "";
                if (inputStreamE != null) {
                    try {
                        inputStreamE.close();
                    } catch (IOException e2) {
                        LogUtil.e("HealthMockUtil", "getBetaFile e is ", e2.getMessage());
                    }
                }
                return str;
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException e3) {
                        LogUtil.e("HealthMockUtil", "getBetaFile e is ", e3.getMessage());
                    }
                }
                throw th;
            }
        } catch (IOException e4) {
            LogUtil.e("HealthMockUtil", "getBetaFile e is ", e4.getMessage());
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    LogUtil.e("HealthMockUtil", "getBetaFile e is ", e5.getMessage());
                }
            }
        }
    }

    private List<HiHealthData> d(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        long jC = ltb.c(System.currentTimeMillis());
        LogUtil.a("HealthMockUtil", "getInsertWeightHihealthDatas startTime = " + new Date(jC));
        while (i < i2) {
            for (int i3 = 0; i3 < 7; i3++) {
                long j = jC - (((long) ((i * 7) + i3)) * 86400000);
                float fE = e(68 - i, 70 - i);
                float fE2 = e(5, 30);
                arrayList.add(e(28800000 + j, fE * 0.98f, 0.98f * fE2));
                arrayList.add(e(43200000 + j, fE, fE2));
                arrayList.add(e(j + 72000000, fE * 0.99f, fE2 * 0.99f));
            }
            i++;
        }
        return arrayList;
    }

    public static void e() {
        LogUtil.a("HealthMockUtil", "registerDeviceToHiHealth enter");
        HiDeviceInfo hiDeviceInfo = new HiDeviceInfo(57);
        hiDeviceInfo.setDeviceUniqueCode("-1");
        hiDeviceInfo.setDeviceName("CH18");
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        HiHealthManager.d(BaseApplication.getContext()).registerDataClient(hiDeviceInfo, arrayList, null);
    }

    private HiHealthData e(long j, float f, float f2) {
        HiHealthData hiHealthData = new HiHealthData(10006);
        e();
        hiHealthData.setDeviceUuid("-1");
        hiHealthData.setMetaData("0");
        hiHealthData.setStartTime(j);
        hiHealthData.setEndTime(j);
        hiHealthData.putDouble("age", 29.0d);
        hiHealthData.putDouble("height", 176.0d);
        hiHealthData.putDouble(CommonConstant.KEY_GENDER, 1.0d);
        hiHealthData.putDouble("bodyWeight", f);
        hiHealthData.putDouble(BleConstants.BODY_FAT_RATE, f2);
        eac eacVar = new eac(176.0f, f, (byte) 1, 29, f2, 0.0d);
        hiHealthData.putDouble(BleConstants.BMI, eacVar.a());
        hiHealthData.putDouble(BleConstants.BASAL_METABOLISM, eacVar.b());
        hiHealthData.putDouble(BleConstants.BODY_AGE, eacVar.c());
        hiHealthData.putDouble(BleConstants.BODY_SCORE, eacVar.g());
        hiHealthData.putDouble(BleConstants.BONE_SALT, eacVar.d());
        hiHealthData.putDouble(BleConstants.MUSCLE_MASS, eacVar.i());
        hiHealthData.putDouble("protein", eacVar.e());
        hiHealthData.putDouble(BleConstants.MOISTURE_RATE, eacVar.h());
        hiHealthData.putDouble(BleConstants.VISCERAL_FAT_LEVEL, eacVar.l());
        hiHealthData.putDouble(BleConstants.IMPEDANCE, eacVar.j());
        hiHealthData.putDouble("skeletalMusclelMass", eacVar.f());
        return hiHealthData;
    }

    private void d(List<HiHealthData> list, IBaseResponseCallback iBaseResponseCallback) {
        if (list == null) {
            LogUtil.a("HealthMockUtil", "insertMockWeightDatas,hiHealthDataList is invaild");
        } else {
            if (list.size() <= 0) {
                LogUtil.a("HealthMockUtil", "insertMockWeightDatas,hiHealthDataList's size is invaild");
                return;
            }
            HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            hiDataInsertOption.setDatas(list);
            c(hiDataInsertOption, iBaseResponseCallback, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final HiDataInsertOption hiDataInsertOption, final IBaseResponseCallback iBaseResponseCallback, final int i) {
        if (i < 0) {
            LogUtil.a("HealthMockUtil", "tryTime < 0 ");
        } else {
            HiHealthNativeApi.a(this.f52514a).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: wun.9
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public void onResult(int i2, Object obj) {
                    LogUtil.a("HealthMockUtil", "insertHiHealthData errorCode = " + i2);
                    iBaseResponseCallback.a(i2, null);
                    if (i2 != 0) {
                        int i3 = i - 1;
                        LogUtil.a("HealthMockUtil", "count = " + i3);
                        wun.this.c(hiDataInsertOption, iBaseResponseCallback, i3);
                    }
                }
            });
        }
    }

    private List<HiHealthData> f() {
        int[] iArr = {35, 33, 30, 24, 25, 30, 31, 35, 37, 40, 45, 50, 55, 37, 62, 33, 68, 70, 85, 83, 75, 55, 30, 52, 50, 48, 20, 43, 25, 45, 39, 38, 35, 30, 15};
        ArrayList arrayList = new ArrayList();
        long jC = ltb.c(System.currentTimeMillis()) + 14400000;
        for (int i = 0; i < 35; i++) {
            int i2 = iArr[i];
            arrayList.add(e(jC, i2, i2));
            jC += 1800000;
        }
        return arrayList;
    }

    private List<HiHealthData> a(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        long jC = ltb.c(System.currentTimeMillis() - (((long) ((i * 7) + i2)) * 86400000));
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iE = 1;
        for (long j = jC; j < jCurrentTimeMillis - 1800000; j += ((long) (iE * 1800)) * 1000) {
            if (j < 28800000 + jC) {
                arrayList.add(e(j, 30, 15));
            } else {
                if (j < 79200000 + jC) {
                    iE = e(1, 4);
                    arrayList.add(e(j, 90, 50));
                } else if (j < jC + 86400000) {
                    arrayList.add(e(j, 60, 30));
                }
            }
            iE = 1;
        }
        return arrayList;
    }

    private HiHealthData e(long j, int i, int i2) {
        HiHealthData hiHealthData = new HiHealthData();
        HiStressMetaData hiStressMetaData = new HiStressMetaData();
        int iE = e(i2, i);
        hiStressMetaData.configStressStartTime(j);
        hiStressMetaData.configStressEndTime(j);
        hiStressMetaData.configStressScore(iE);
        hiStressMetaData.configStressMeasureType(1);
        hiHealthData.setValue(iE);
        hiHealthData.setDeviceUuid("-1");
        hiHealthData.setTimeInterval(j, j);
        hiHealthData.setType(2034);
        hiHealthData.setMetaData(HiJsonUtil.d(hiStressMetaData));
        return hiHealthData;
    }

    public static int e(int i, int i2) {
        return (new SecureRandom().nextInt(i2) % ((i2 - i) + 1)) + i;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0162  */
    /* JADX WARN: Code duplicated, block: B:50:0x0167 A[Catch: Exception -> 0x01a4, RuntimeException -> 0x01be, LOOP:1: B:49:0x0165->B:50:0x0167, LOOP_END, TryCatch #2 {RuntimeException -> 0x01be, Exception -> 0x01a4, blocks: (B:3:0x0022, B:4:0x002d, B:6:0x0036, B:9:0x004e, B:38:0x0146, B:40:0x014c, B:42:0x0152, B:44:0x0158, B:52:0x017c, B:50:0x0167, B:51:0x017b, B:10:0x0059, B:12:0x005f, B:13:0x006a, B:15:0x0070, B:16:0x007b, B:18:0x0081, B:20:0x0098, B:22:0x009e, B:23:0x00bb, B:25:0x00c3, B:26:0x00dd, B:28:0x00e3, B:29:0x00fd, B:31:0x0103, B:34:0x0120, B:53:0x018d), top: B:59:0x0022 }] */
    private ArrayList<HiHealthData> d(long j, long j2, String str) {
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str3 = "SLEEP_DEEP_PART_COUNT";
        String str4 = "CORE_SLEEP_NOON";
        String str5 = "CORE_SLEEP_SNORE_FREQ";
        String str6 = "CORE_SLEEP_SCORE";
        ArrayList<HiHealthData> arrayList = new ArrayList<>();
        arrayList.add(a(j, 44201, j2));
        try {
            JSONArray jSONArray = new JSONArray(str);
            long jE = HiDateUtil.e(j2);
            int i7 = 0;
            int i8 = 0;
            while (i7 < jSONArray.length()) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i7);
                JSONArray jSONArray2 = jSONArray;
                long j3 = jE;
                if (jSONObject.has("SHALLOW")) {
                    i4 = Integer.parseInt(jSONObject.getString("SHALLOW"));
                    i5 = 22101;
                } else if (jSONObject.has("DEEP")) {
                    i4 = Integer.parseInt(jSONObject.getString("DEEP"));
                    i5 = 22103;
                } else if (jSONObject.has("DREAM")) {
                    i4 = Integer.parseInt(jSONObject.getString("DREAM"));
                    i5 = 22102;
                } else {
                    if (jSONObject.has("WAKE")) {
                        i4 = Integer.parseInt(jSONObject.getString("WAKE"));
                        i5 = 22104;
                    } else {
                        if (jSONObject.has(str6)) {
                            str2 = str6;
                            arrayList.add(a(j, 44203, Integer.parseInt(jSONObject.getString(str6))));
                        } else {
                            str2 = str6;
                            if (jSONObject.has(str3)) {
                                arrayList.add(a(j, 44106, Integer.parseInt(jSONObject.getString(str3))));
                            } else if (jSONObject.has(str5)) {
                                arrayList.add(a(j, 44208, Integer.parseInt(jSONObject.getString(str5))));
                            } else if (jSONObject.has(str4)) {
                                int i9 = Integer.parseInt(jSONObject.getString(str4));
                                long jE2 = HiDateUtil.e(j + 43230000);
                                int i10 = 0;
                                while (true) {
                                    i = 22105;
                                    if (i10 >= i9) {
                                        break;
                                    }
                                    int i11 = i9;
                                    HiHealthData hiHealthData = new HiHealthData(22105);
                                    long j4 = jE2 + 60000;
                                    hiHealthData.setTimeInterval(jE2, j4);
                                    hiHealthData.setDeviceUuid("-1");
                                    arrayList.add(hiHealthData);
                                    i10++;
                                    jE2 = j4;
                                    i9 = i11;
                                }
                                i2 = i9;
                                i3 = i2;
                            }
                        }
                        str3 = str3;
                        str4 = str4;
                        str5 = str5;
                        i3 = 0;
                        i = 0;
                    }
                    if (!jSONObject.has("SHALLOW") || jSONObject.has("DEEP") || jSONObject.has("DREAM") || jSONObject.has("WAKE")) {
                        jE = j3;
                        i6 = 0;
                        while (i6 < i3) {
                            HiHealthData hiHealthData2 = new HiHealthData(i);
                            long j5 = jE + 60000;
                            hiHealthData2.setTimeInterval(jE, j5);
                            hiHealthData2.setDeviceUuid("-1");
                            arrayList.add(hiHealthData2);
                            i6++;
                            jE = j5;
                        }
                        i8 += i3;
                    } else {
                        jE = j3;
                    }
                    i7++;
                    str5 = str5;
                    str4 = str4;
                    jSONArray = jSONArray2;
                    str6 = str2;
                    str3 = str3;
                }
                i2 = i4;
                i = i5;
                str2 = str6;
                i3 = i2;
                if (jSONObject.has("SHALLOW")) {
                    jE = j3;
                    i6 = 0;
                    while (i6 < i3) {
                        HiHealthData hiHealthData3 = new HiHealthData(i);
                        long j6 = jE + 60000;
                        hiHealthData3.setTimeInterval(jE, j6);
                        hiHealthData3.setDeviceUuid("-1");
                        arrayList.add(hiHealthData3);
                        i6++;
                        jE = j6;
                    }
                    i8 += i3;
                } else {
                    jE = j3;
                    i6 = 0;
                    while (i6 < i3) {
                        HiHealthData hiHealthData4 = new HiHealthData(i);
                        long j7 = jE + 60000;
                        hiHealthData4.setTimeInterval(jE, j7);
                        hiHealthData4.setDeviceUuid("-1");
                        arrayList.add(hiHealthData4);
                        i6++;
                        jE = j7;
                    }
                    i8 += i3;
                }
                i7++;
                str5 = str5;
                str4 = str4;
                jSONArray = jSONArray2;
                str6 = str2;
                str3 = str3;
            }
            arrayList.add(a(j, 44202, j2 + (((long) i8) * 60000)));
            return arrayList;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
            LogUtil.d("HealthMockUtil", "json parse error" + str);
            return arrayList;
        }
    }

    private HiHealthData a(long j, int i, double d) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(i);
        hiHealthData.setDeviceUuid("-1");
        hiHealthData.setStartTime(HiDateUtil.e(j));
        hiHealthData.setEndTime(HiDateUtil.e(j));
        hiHealthData.setValue(d);
        return hiHealthData;
    }
}
