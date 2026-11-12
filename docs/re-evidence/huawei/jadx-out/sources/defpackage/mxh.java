package defpackage;

import android.text.TextUtils;
import com.huawei.datatype.EcgMetaData;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.IoUtils;
import health.compact.a.KeyValDbManager;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mxh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f42642a = -1;

    private static boolean b(long j) {
        return j >= 32;
    }

    public static void b(String str, IBaseResponseCallback iBaseResponseCallback) throws Throwable {
        mxj mxjVarA;
        ReleaseLogUtil.d("DEVMGR_ParseEcgFileUtil", "saveEcgFileData enter");
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "saveEcgFileData callback is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "path is empty");
            iBaseResponseCallback.a(-2, -1);
            return;
        }
        try {
            mxjVarA = a(str);
        } catch (RuntimeException unused) {
            ReleaseLogUtil.a("DEVMGR_ParseEcgFileUtil", "ecg file is wrong. please check.");
            mxjVarA = null;
        }
        if (mxjVarA == null) {
            ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "ecgFileData is null");
            iBaseResponseCallback.a(255, -1);
            return;
        }
        f42642a = -1L;
        List<mxm> listD = mxjVarA.d();
        if (listD == null) {
            ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "ecgDataPackList is null");
            iBaseResponseCallback.a(255, -1);
            return;
        }
        if (!a(listD)) {
            ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "ecg endTime is Invalid");
            iBaseResponseCallback.a(-1, Long.valueOf(f42642a));
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        String strA = mxjVarA.a();
        try {
            b(arrayList, listD, mxjVarA.b(), strA);
        } catch (OutOfMemoryError unused2) {
            LogUtil.e("ParseEcgFileUtil", "setHealthDataList failed");
        }
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(arrayList);
        b(str);
        if ("ecg_analysis_data.bin".equals(strA)) {
            b(hiDataInsertOption, iBaseResponseCallback);
        } else {
            hiDataInsertOption.setPackageName(mxjVarA.b());
            c(hiDataInsertOption, iBaseResponseCallback);
        }
    }

    private static void b(String str) {
        File file = new File(str);
        boolean zExists = file.exists();
        LogUtil.a("ParseEcgFileUtil", "deleteEcgFile, isExists:", Boolean.valueOf(zExists));
        if (zExists) {
            LogUtil.a("ParseEcgFileUtil", "deleteEcgFile, isDeleteSuccess:", Boolean.valueOf(file.delete()));
        }
    }

    private static void c(HiDataInsertOption hiDataInsertOption, final IBaseResponseCallback iBaseResponseCallback) {
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: mxh.2
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.d("DEVMGR_ParseEcgFileUtil", "saveData insertHiHealthData onResult type:", Integer.valueOf(i));
                if (i == 0) {
                    iBaseResponseCallback.a(0, Long.valueOf(mxh.f42642a));
                    mxk.b(15);
                } else {
                    iBaseResponseCallback.a(i, -1);
                }
            }
        });
    }

    private static void b(HiDataInsertOption hiDataInsertOption, final IBaseResponseCallback iBaseResponseCallback) {
        HiHealthManager.d(BaseApplication.getContext()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: mxh.4
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                ReleaseLogUtil.d("DEVMGR_ParseEcgFileUtil", "saveEcgAnalysisData insertHiHealthData onResult type:", Integer.valueOf(i));
                if (i == 0) {
                    iBaseResponseCallback.a(0, Long.valueOf(mxh.f42642a));
                    mxk.b(DicDataTypeUtil.DataType.ELECTROCARDIOGRAM.value());
                } else {
                    iBaseResponseCallback.a(i, -1);
                }
            }
        });
    }

    private static boolean a(List<mxm> list) {
        if (list == null) {
            LogUtil.j("ParseEcgFileUtil", "ecgDataPackList is null");
            return false;
        }
        for (mxm mxmVar : list) {
            if (mxmVar == null) {
                LogUtil.j("ParseEcgFileUtil", "saveEcgFileData ecgDataPack is null");
            } else if (f42642a < mxmVar.e()) {
                f42642a = mxmVar.e();
            }
        }
        if (f42642a >= 0) {
            return true;
        }
        LogUtil.j("ParseEcgFileUtil", "Invalid end Time");
        return false;
    }

    public static int e() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "ecg_time_sp_tag", "ecg_last_time");
        if (TextUtils.isEmpty(strE)) {
            return 0;
        }
        try {
            String strC = c();
            JSONObject jSONObject = new JSONObject(strE);
            if (!jSONObject.has(strC) || jSONObject.isNull(strC)) {
                return 0;
            }
            return jSONObject.getInt(strC);
        } catch (JSONException unused) {
            LogUtil.e("ParseEcgFileUtil", "getLastTime JSONException");
            return 0;
        }
    }

    public static void b(int i) {
        JSONObject jSONObject;
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "ecg_time_sp_tag", "ecg_last_time");
        String strC = c();
        try {
            if (TextUtils.isEmpty(strE)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(strE);
            }
            jSONObject.put(strC, i);
            SharedPreferenceManager.e(BaseApplication.getContext(), "ecg_time_sp_tag", "ecg_last_time", jSONObject.toString(), new StorageParams(1));
        } catch (JSONException unused) {
            LogUtil.e("ParseEcgFileUtil", "saveLastTime JSONException error");
        }
    }

    public static int d() {
        String strE;
        try {
            strE = SharedPreferenceManager.e(BaseApplication.getContext(), "ecg_time_sp_tag", "ecg_any_last_time");
        } catch (OutOfMemoryError unused) {
            ReleaseLogUtil.a("DEVMGR_ParseEcgFileUtil", "getEcgAnalysisLastTime OutOfMemoryError");
            strE = "";
        }
        if (TextUtils.isEmpty(strE)) {
            return 0;
        }
        try {
            String strC = c();
            JSONObject jSONObject = new JSONObject(strE);
            if (!jSONObject.has(strC) || jSONObject.isNull(strC)) {
                return 0;
            }
            return jSONObject.getInt(strC);
        } catch (JSONException unused2) {
            LogUtil.e("ParseEcgFileUtil", "getEcgAnalysisLastTime JSONException");
            return 0;
        }
    }

    public static void a(int i) {
        JSONObject jSONObject;
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "ecg_time_sp_tag", "ecg_any_last_time");
        String strC = c();
        try {
            if (TextUtils.isEmpty(strE)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(strE);
            }
            jSONObject.put(strC, i);
            SharedPreferenceManager.e(BaseApplication.getContext(), "ecg_time_sp_tag", "ecg_any_last_time", jSONObject.toString(), new StorageParams(1));
        } catch (JSONException unused) {
            LogUtil.e("ParseEcgFileUtil", "saveEcgAnalysisLastTime JSONException error");
        }
    }

    private static String c() {
        String securityDeviceId;
        DeviceInfo deviceInfoA = a();
        if (deviceInfoA == null) {
            securityDeviceId = "";
        } else {
            securityDeviceId = deviceInfoA.getSecurityDeviceId();
        }
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("user_id");
        return (TextUtils.isEmpty(strC) ? "" : strC) + securityDeviceId;
    }

    private static void b(List<HiHealthData> list, List<mxm> list2, String str, String str2) {
        if (list == null || list2 == null) {
            ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "setHealthDataList healthDataList or ecgDataPackList is null");
            return;
        }
        DeviceInfo deviceInfoA = a();
        String str3 = (deviceInfoA != null && deviceInfoA.getSecurityUuid() != null) ? deviceInfoA.getSecurityUuid() + "#ANDROID21" : "";
        for (mxm mxmVar : list2) {
            if (mxmVar == null) {
                ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "setHealthDataList ecgDataPack is null");
            } else {
                long jH = mxmVar.h();
                long jE = mxmVar.e();
                HiHealthData hiHealthData = new HiHealthData();
                hiHealthData.setStartTime(jH * 1000);
                hiHealthData.setEndTime(jE * 1000);
                EcgMetaData ecgMetaData = new EcgMetaData();
                ecgMetaData.setEcgArrhyType(mxmVar.b());
                ecgMetaData.setAverageHeartRate(mxmVar.d());
                ecgMetaData.setEcgDataLength(mxmVar.i());
                ecgMetaData.setUserSymptom(mxmVar.g());
                ecgMetaData.setEcgAppVersion(mxmVar.a());
                ecgMetaData.setPackageName(str);
                ecgMetaData.setDataSources("HUAWEI");
                List<Float> listC = mxmVar.c();
                List<Float> listC2 = c(listC);
                String strD = HiJsonUtil.d(ecgMetaData);
                LogUtil.d("ParseEcgFileUtil", "ecgMetaDataString: ", strD);
                hiHealthData.setMetaData(strD);
                hiHealthData.setSimpleData(HiJsonUtil.d(listC2));
                if ("ecg_analysis_data.bin".equals(str2)) {
                    hiHealthData.setType(DicDataTypeUtil.DataType.ELECTROCARDIOGRAM.value());
                } else {
                    hiHealthData.setType(31001);
                }
                hiHealthData.setDeviceUuid(str3);
                String strD2 = HiJsonUtil.d(listC);
                LogUtil.d("ParseEcgFileUtil", "sequenceDataString: ", strD2);
                hiHealthData.setSequenceData(strD2);
                list.add(hiHealthData);
            }
        }
    }

    private static DeviceInfo a() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "ParseEcgFileUtil");
        if (deviceList.size() > 0) {
            for (DeviceInfo deviceInfo : deviceList) {
                if (!eel.d(deviceInfo.getProductType())) {
                    return deviceInfo;
                }
            }
        }
        return null;
    }

    private static List<Float> c(List<Float> list) {
        ArrayList arrayList = new ArrayList(16);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (i % 4 == 0) {
                    arrayList.add(list.get(i));
                }
                if (i >= 1200) {
                    break;
                }
            }
        }
        return arrayList;
    }

    private static mxj a(String str) throws Throwable {
        mxj mxjVar;
        Throwable th;
        FileInputStream fileInputStreamOpenInputStream;
        FileInputStream fileInputStream = null;
        mxj mxjVar2 = null;
        try {
            try {
                File file = new File(str);
                if (!CommonUtil.e(file)) {
                    ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "Invalid file path");
                    IoUtils.c(null);
                    return null;
                }
                long length = file.length();
                if (!b(length)) {
                    ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "ecg file is wrong. check file header wrong.");
                    IoUtils.c(null);
                    return null;
                }
                fileInputStreamOpenInputStream = FileUtils.openInputStream(file);
                try {
                    try {
                        mxj mxjVar3 = new mxj();
                        try {
                            byte[] bArr = new byte[32];
                            int i = fileInputStreamOpenInputStream.read(bArr);
                            mxjVar3.a(file.getName());
                            if (i != 32) {
                                ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "Unable to read header data");
                                IoUtils.c(fileInputStreamOpenInputStream);
                                return mxjVar3;
                            }
                            e(bArr, mxjVar3);
                            if (!e(mxjVar3.c(), length)) {
                                ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "check packageName wrong.");
                                IoUtils.c(fileInputStreamOpenInputStream);
                                return mxjVar3;
                            }
                            a(mxjVar3, fileInputStreamOpenInputStream);
                            if (mxjVar3.e() != 0) {
                                LogUtil.j("ParseEcgFileUtil", "no support version");
                            } else {
                                b(fileInputStreamOpenInputStream, mxjVar3);
                            }
                            IoUtils.c(fileInputStreamOpenInputStream);
                            return mxjVar3;
                        } catch (IOException unused) {
                            mxjVar2 = mxjVar3;
                            mxj mxjVar4 = mxjVar2;
                            fileInputStream = fileInputStreamOpenInputStream;
                            mxjVar = mxjVar4;
                            ReleaseLogUtil.a("DEVMGR_ParseEcgFileUtil", "parseFileData IOException");
                            IoUtils.c(fileInputStream);
                            return mxjVar;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        IoUtils.c(fileInputStreamOpenInputStream);
                        throw th;
                    }
                } catch (IOException unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStreamOpenInputStream = null;
            }
        } catch (IOException unused3) {
            mxjVar = null;
        }
    }

    private static void b(FileInputStream fileInputStream, mxj mxjVar) throws IOException {
        while (true) {
            byte[] bArr = new byte[56];
            int i = fileInputStream.read(bArr);
            if (i != 56) {
                if (i == -1) {
                    ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "End of parsing data");
                    return;
                } else {
                    ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "Profile data length mismatch: ", Integer.valueOf(i));
                    return;
                }
            }
            mxm mxmVarA = a(bArr, 56, mxjVar);
            if (mxmVarA == null) {
                ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "ecgDataPack is null");
                return;
            }
            byte[] bArr2 = new byte[mxmVarA.i()];
            int i2 = fileInputStream.read(bArr2);
            if (i2 != mxmVarA.i()) {
                ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "Raw data length mismatch rawDataLength:", Integer.valueOf(i2));
            } else {
                LogUtil.a("ParseEcgFileUtil", "ecgDataPack.getRawDataLength: ", Integer.valueOf(mxmVarA.i()));
                d(bArr2, mxmVarA);
            }
            if (mxjVar != null && mxjVar.d() != null) {
                mxjVar.d().add(mxmVarA);
            }
            LogUtil.a("ParseEcgFileUtil", "Start parsing next");
        }
    }

    private static void c(String str, mxj mxjVar) {
        int iE;
        LogUtil.a("ParseEcgFileUtil", "check time.");
        if ("ecg_analysis_data.bin".equals(mxjVar.a())) {
            iE = d();
        } else {
            iE = e();
        }
        long j = ((long) iE) * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jX = CommonUtil.x(str) * 1000;
        ReleaseLogUtil.d("DEVMGR_ParseEcgFileUtil", "checkTime lastTime: ", Long.valueOf(j), ", nowTime: ", Long.valueOf(jCurrentTimeMillis), ", time: ", Long.valueOf(jX));
        if (jX < j || jX > jCurrentTimeMillis) {
            LogUtil.j("ParseEcgFileUtil", "wrong data.");
            throw new RuntimeException("wrong timeString : " + str);
        }
    }

    private static void e(String str, String str2) {
        if (CommonUtil.x(str) <= CommonUtil.x(str2)) {
            return;
        }
        ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "checkStartTimeEndTime wrong data.");
        throw new RuntimeException("wrong startTimeString : " + str + "endTimeString : " + str2);
    }

    private static void d(byte[] bArr, mxm mxmVar) {
        if (bArr == null || mxmVar == null) {
            ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "parseRawData rawData or ecgDataPack is null");
            return;
        }
        LogUtil.a("ParseEcgFileUtil", "parseRawData");
        ArrayList arrayList = new ArrayList(16);
        int i = 0;
        while (i < bArr.length) {
            int i2 = i + 4;
            Float fValueOf = Float.valueOf(eeq.h(d(bArr, i, i2)));
            if (fValueOf.isNaN()) {
                ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "unitStringFloat isNaN");
                fValueOf = Float.valueOf(0.0f);
            }
            arrayList.add(fValueOf);
            i = i2;
        }
        mxmVar.a(arrayList);
    }

    private static mxm a(byte[] bArr, int i, mxj mxjVar) {
        LogUtil.a("ParseEcgFileUtil", "parseSummaryData");
        if (bArr == null || bArr.length != i) {
            ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "bytes is error argument");
            return null;
        }
        mxm mxmVar = new mxm();
        cpl.d("ParseEcgFileUtil", bArr, "bytes: ");
        String strD = d(bArr, 0, 4);
        c(strD, mxjVar);
        mxmVar.d(CommonUtil.x(strD));
        String strD2 = d(bArr, 4, 8);
        c(strD2, mxjVar);
        e(strD, strD2);
        mxmVar.c(CommonUtil.x(strD2));
        mxmVar.b(c(d(bArr, 8, 12)));
        mxmVar.c(eeq.d(d(bArr, 12, 44)).trim());
        mxmVar.e(CommonUtil.x(d(bArr, 44, 48)));
        mxmVar.c(CommonUtil.v(d(bArr, 48, 50)));
        mxmVar.b(CommonUtil.x(d(bArr, 52, 56)));
        return mxmVar;
    }

    private static int c(String str) {
        long jX = CommonUtil.x(str);
        if (jX >= 2147483647L || jX <= 0) {
            LogUtil.j("ParseEcgFileUtil", "rawDataLength is invalid:", Long.valueOf(jX));
            return 0;
        }
        int i = (int) jX;
        if (i <= 2400000) {
            return i;
        }
        LogUtil.j("ParseEcgFileUtil", "rawDataLength is too large:", Long.valueOf(jX));
        return 0;
    }

    private static void e(byte[] bArr, mxj mxjVar) {
        LogUtil.a("ParseEcgFileUtil", "parseHeaderCommon enter");
        if (bArr == null) {
            ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "Header is null");
            return;
        }
        cpl.d("ParseEcgFileUtil", bArr, "header: ");
        if (bArr.length != 32) {
            ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "Wrong length of file header");
            return;
        }
        mxjVar.e(CommonUtil.x(d(bArr, 0, 4)));
        mxjVar.d(lsk.a(d(bArr, 4, 6), 16));
        String strD = d(bArr, 6, 8);
        LogUtil.a("ParseEcgFileUtil", "fileVersionString :", strD);
        mxjVar.c(lsk.a(strD, 16));
        String strD2 = d(bArr, 8, 9);
        LogUtil.a("ParseEcgFileUtil", "fileVersionString :", strD2);
        mxjVar.b(lsk.a(strD2, 16));
        mxjVar.c(eeq.d(d(bArr, 9, 32)));
    }

    private static String d(byte[] bArr, int i, int i2) {
        if (bArr == null || i > i2) {
            LogUtil.j("ParseEcgFileUtil", "byteToString bytes is null");
            return "";
        }
        if (i < 0) {
            LogUtil.j("ParseEcgFileUtil", "Start less than zero");
            return "";
        }
        if (i2 > bArr.length) {
            LogUtil.j("ParseEcgFileUtil", "End is too large");
            return "";
        }
        byte[] bArr2 = new byte[i2 - i];
        int i3 = 0;
        while (i < i2) {
            bArr2[i3] = bArr[i];
            i++;
            i3++;
        }
        return eeq.e(bArr2);
    }

    private static boolean e(int i, long j) {
        if (i != 0) {
            return j >= ((long) (i + 32));
        }
        ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "ecg file error. packageNameLength is 0");
        return false;
    }

    private static void a(mxj mxjVar, FileInputStream fileInputStream) throws IOException {
        int iC = mxjVar.c();
        byte[] bArr = new byte[iC];
        int i = fileInputStream.read(bArr);
        if (i == iC) {
            mxjVar.d(eeq.d(eeq.e(bArr)).trim());
        } else {
            ReleaseLogUtil.e("DEVMGR_ParseEcgFileUtil", "parsePackageName read : ", Integer.valueOf(i));
        }
    }
}
