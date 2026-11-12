package defpackage;

import android.os.Environment;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.bloodpressure.BloodPressureApi;
import com.huawei.health.main.api.MainCommonApi;
import com.huawei.health.servicesapi.R;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiDataSourceFetchOption;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataClientListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.data.model.HiBloodPressureMetaData;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.db.bean.ContentResource;
import health.compact.a.HiCommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes38.dex */
public class nrw extends nry {
    @Override // defpackage.nry, com.huawei.hwonesdk.process.HiHealthProcess
    public void doAction(String str, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.a("HiHealthProcess__exportData", "doAction callback is null");
            return;
        }
        HiDataReadProOption hiDataReadProOptionD = preProcess(str);
        LogUtil.a("HiHealthProcess__exportData", "preProcess readHiHealthDataPro", hiDataReadProOptionD);
        if (hiDataReadProOptionD == null) {
            iBaseResponseCallback.a(-1, "");
            ReleaseLogUtil.a("HiHealthProcess__exportData", "doAction option is null");
        } else {
            HiHealthManager.d(BaseApplication.b()).readHiHealthDataPro(hiDataReadProOptionD, new c(this, str, iBaseResponseCallback));
        }
    }

    @Override // defpackage.nry, com.huawei.hwonesdk.process.HiHealthProcess
    public String postProcess(Object obj, Object obj2) {
        if (!(obj instanceof SparseArray)) {
            LogUtil.d("HiHealthProcess__exportData", "postProcess null");
            return "";
        }
        SparseArray<Object> sparseArray = (SparseArray) obj;
        if (!(obj2 instanceof nqu)) {
            return "";
        }
        String strE = peh.e(c(sparseArray, (nqu) obj2), new TypeToken<b>() { // from class: com.huawei.hwonesdk.process.ExportDataProcess$1
        }.getType());
        LogUtil.a("HiHealthProcess__exportData", "postProcess property json ", strE);
        return strE;
    }

    static class c implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SoftReference<nrw> f43559a;
        private final String d;
        private final IBaseResponseCallback e;

        c(nrw nrwVar, String str, IBaseResponseCallback iBaseResponseCallback) {
            this.f43559a = new SoftReference<>(nrwVar);
            this.d = str;
            this.e = iBaseResponseCallback;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(final Object obj, int i, int i2) {
            if (i != 0 || !(obj instanceof SparseArray)) {
                LogUtil.d("HiHealthProcess__exportData", "DataReadResultListener error");
                this.e.a(-1, "");
                return;
            }
            final nrw nrwVar = this.f43559a.get();
            if (nrwVar == null) {
                this.e.a(-1, "");
                return;
            }
            final nqu nquVarA = nrwVar.a(this.d);
            if (nquVarA == null) {
                this.e.a(-1, "");
            } else {
                ThreadPoolManager.c().execute(new Runnable() { // from class: nrz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.c(nrwVar, obj, nquVarA);
                    }
                });
            }
        }

        /* synthetic */ void c(nrw nrwVar, Object obj, nqu nquVar) {
            this.e.a(0, nrwVar.postProcess(obj, nquVar));
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("HiHealthProcess__exportData", "readHiHealthDataPro, data is ", obj);
            this.e.a(-1, "");
        }
    }

    private b c(SparseArray<Object> sparseArray, nqu nquVar) throws Throwable {
        String strB;
        File fileB;
        if (c(nquVar) != 10002) {
            strB = "unknown";
            fileB = null;
        } else {
            strB = b(nquVar);
            fileB = b(sparseArray, strB);
        }
        if (fileB == null) {
            return null;
        }
        b bVar = new b();
        bVar.e(strB);
        try {
            bVar.d(fileB.getCanonicalPath());
            return bVar;
        } catch (IOException e) {
            ReleaseLogUtil.a("R_HiHealthProcess__exportData", "getCanonicalPath IOException: " + e.getMessage());
            return bVar;
        }
    }

    private int c(nqu nquVar) {
        if (nquVar instanceof nqt) {
            nqt nqtVar = (nqt) nquVar;
            if (!HiCommonUtil.b(nqtVar.k()) && nqtVar.k().get(0) != null) {
                return nqtVar.k().get(0).getmId();
            }
        }
        return 0;
    }

    private String b(nqu nquVar) {
        return qre.f(R.string.IDS_blood_pressure_file_name_pre) + Constants.LINK + DateFormatUtil.b(nquVar.c(), TimeZone.getDefault(), DateFormatUtil.DateFormatType.DATE_FORMAT_8) + Constants.LINK + DateFormatUtil.b(nquVar.e(), TimeZone.getDefault(), DateFormatUtil.DateFormatType.DATE_FORMAT_8) + ".csv";
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d6 A[RETURN] */
    private File b(SparseArray<Object> sparseArray, String str) throws Throwable {
        boolean z;
        File file = new File(BaseApplication.b().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), str);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(d.b());
        TreeMap treeMap = new TreeMap(Comparator.reverseOrder());
        HashSet<Integer> hashSet = new HashSet<>();
        c(treeMap, sparseArray, hashSet);
        Map<Integer, String> mapB = b(hashSet);
        boolean z2 = false;
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                Iterator<Map.Entry<Long, List<HiHealthData>>> it = treeMap.entrySet().iterator();
                boolean z3 = false;
                while (true) {
                    try {
                        z = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<Long, List<HiHealthData>> next = it.next();
                        if (stringBuffer.length() > 8192) {
                            bufferedWriter.write(stringBuffer.toString());
                            bufferedWriter.flush();
                            try {
                                stringBuffer.setLength(0);
                                z3 = true;
                            } catch (Throwable th) {
                                th = th;
                                z2 = true;
                            }
                        }
                        long jLongValue = next.getKey().longValue();
                        List<HiHealthData> value = next.getValue();
                        String strD = new d(jLongValue, value, d(value, mapB)).d();
                        if (!TextUtils.isEmpty(strD)) {
                            stringBuffer.append(strD).append("\n");
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                    }
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th;
                }
                bufferedWriter.write(stringBuffer.toString());
                bufferedWriter.flush();
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e = e;
                    ReleaseLogUtil.a("R_HiHealthProcess__exportData", "saveCsvFile IOException: " + e.getMessage());
                    if (z) {
                        return null;
                    }
                }
                return file;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException e2) {
            e = e2;
            z = z2;
            ReleaseLogUtil.a("R_HiHealthProcess__exportData", "saveCsvFile IOException: " + e.getMessage());
            if (z) {
                return null;
            }
            return file;
        }
    }

    private void c(Map<Long, List<HiHealthData>> map, SparseArray<Object> sparseArray, HashSet<Integer> hashSet) {
        for (int i = 0; i < sparseArray.size(); i++) {
            Object objValueAt = sparseArray.valueAt(i);
            if (objValueAt instanceof List) {
                List<HiHealthData> list = (List) objValueAt;
                if (CollectionUtils.a(list)) {
                    LogUtil.d("HiHealthProcess__exportData", "groupMinuteData dataList is empty");
                } else {
                    for (HiHealthData hiHealthData : list) {
                        if (!hashSet.contains(Integer.valueOf(hiHealthData.getClientId()))) {
                            hashSet.add(Integer.valueOf(hiHealthData.getClientId()));
                        }
                        List<HiHealthData> orDefault = map.getOrDefault(Long.valueOf(hiHealthData.getStartTime()), new ArrayList());
                        orDefault.add(hiHealthData);
                        map.put(Long.valueOf(hiHealthData.getStartTime()), orDefault);
                    }
                }
            }
        }
    }

    private String d(List<HiHealthData> list, Map<Integer, String> map) {
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.e("R_HiHealthProcess__exportData", "getDataSource dataList is Empty");
            return "--";
        }
        int clientId = list.get(0).getClientId();
        if (!map.containsKey(Integer.valueOf(clientId))) {
            ReleaseLogUtil.e("R_HiHealthProcess__exportData", "getDataSource not found clientId ", Integer.valueOf(clientId));
            return "--";
        }
        return map.get(Integer.valueOf(clientId));
    }

    private Map<Integer, String> b(HashSet<Integer> hashSet) {
        final ArrayList<HiHealthClient> arrayList = new ArrayList();
        int[] iArr = new int[hashSet.size()];
        Iterator<Integer> it = hashSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        HiDataSourceFetchOption hiDataSourceFetchOptionA = HiDataSourceFetchOption.builder().c(1).b(iArr).a();
        LogUtil.a("HiHealthProcess__exportData", "getHiHealthClientHashMap setDataSourceType");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HiHealthNativeApi.a(BaseApplication.b()).fetchDataSource(hiDataSourceFetchOptionA, new HiDataClientListener() { // from class: nrs
            @Override // com.huawei.hihealth.data.listener.HiDataClientListener
            public final void onResult(List list) {
                nrw.a(arrayList, countDownLatch, list);
            }
        });
        try {
            if (!countDownLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                ReleaseLogUtil.e("HiHealthProcess__exportData", "getHiHealthClientHashMap wait timeout");
            }
        } catch (InterruptedException e) {
            ReleaseLogUtil.a("R_HiHealthProcess__exportData", "getHiHealthClientHashMap InterruptedException ", e.getMessage());
        }
        HashMap map = new HashMap();
        MainCommonApi mainCommonApi = (MainCommonApi) Services.b("Main", MainCommonApi.class);
        if (mainCommonApi == null) {
            ReleaseLogUtil.e("R_HiHealthProcess__exportData", "getClientToDataSourceMap mainCommonApi is null ");
            return map;
        }
        for (HiHealthClient hiHealthClient : arrayList) {
            String dataSourceName = mainCommonApi.getDataSourceName(hiHealthClient);
            if (TextUtils.isEmpty(dataSourceName)) {
                map.put(Integer.valueOf(hiHealthClient.getClientId()), "--");
            } else {
                map.put(Integer.valueOf(hiHealthClient.getClientId()), dataSourceName);
            }
        }
        return map;
    }

    static /* synthetic */ void a(List list, CountDownLatch countDownLatch, List list2) {
        list.addAll(list2);
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "--";
        }
        return "\"" + str.replace("\"", "\"\"") + "\"";
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName(ContentResource.FILE_NAME)
        private String f43558c;

        @SerializedName("filePath")
        private String d;

        private b() {
        }

        public String toString() {
            return "ExportResponseData{fileName=" + this.f43558c + ",filePath=" + this.d + '}';
        }

        public void d(String str) {
            this.d = str;
        }

        public void e(String str) {
            this.f43558c = str;
        }
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int[] f43560b = {R.string.IDS_blood_pressure_export_date_time, R.string.IDS_blood_pressure_export_systolic_pressure, R.string.IDS_blood_pressure_export_diastolic_pressure, R.string.IDS_blood_pressure_export_pulse, R.string.IDS_blood_pressure_export_grade, R.string.IDS_blood_measure_action, R.string.IDS_device_data_source, R.string.IDS_medicines_remarks};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f43561a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f43562c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String j;

        public d(long j, List<HiHealthData> list, String str) {
            String strE;
            this.j = "--";
            this.h = "--";
            this.f43561a = "--";
            this.f = "--";
            this.f43562c = "--";
            this.d = "--";
            this.g = "--";
            this.e = str;
            HiHealthData hiHealthData = null;
            int value = 0;
            int value2 = 0;
            int value3 = 0;
            for (HiHealthData hiHealthData2 : list) {
                if (hiHealthData2.getType() == DicDataTypeUtil.DataType.BLOOD_PRESSURE_SYSTOLIC.value()) {
                    value = (int) hiHealthData2.getValue();
                } else if (hiHealthData2.getType() == DicDataTypeUtil.DataType.BLOOD_PRESSURE_DIASTOLIC.value()) {
                    value2 = (int) hiHealthData2.getValue();
                } else if (hiHealthData2.getType() == DicDataTypeUtil.DataType.BLOOD_PRESSURE_SPHYGMUS.value()) {
                    int value4 = (int) hiHealthData2.getValue();
                    if (value4 == 0) {
                        strE = "--";
                    } else {
                        strE = UnitUtil.e(value4, 1, 0);
                    }
                    this.f = strE;
                } else if (hiHealthData2.getType() == DicDataTypeUtil.DataType.BLOOD_PRESSURE_ABNORMAL.value()) {
                    value3 = (int) hiHealthData2.getValue();
                } else if (hiHealthData2.getType() == DicDataTypeUtil.DataType.BLOOD_BEFORE_ACTIVITY.value()) {
                    hiHealthData = hiHealthData2;
                }
            }
            if (value > 0) {
                this.h = UnitUtil.e(value, 1, 0);
            }
            if (value2 > 0) {
                this.f43561a = UnitUtil.e(value2, 1, 0);
            }
            String strB = DateFormatUtil.b(j, TimeZone.getDefault(), DateFormatUtil.DateFormatType.DATE_FORMAT_MINUTE);
            this.j = strB;
            this.j = b(strB, j);
            BloodPressureApi bloodPressureApi = (BloodPressureApi) Services.b("Main", BloodPressureApi.class);
            if (bloodPressureApi == null) {
                ReleaseLogUtil.e("HiHealthProcess__exportData", "bloodPressureApi is null");
                return;
            }
            if (value > 0 && value2 > 0) {
                this.f43562c = bloodPressureApi.getBloodPressureGradeDes(value, value2);
            }
            if (hiHealthData != null) {
                this.d = e(bloodPressureApi, hiHealthData);
            }
            if (value3 > 0) {
                this.g = bloodPressureApi.convertMeasureAbnormalType(value3);
            }
        }

        private String b(String str, long j) {
            if (LanguageUtil.f(BaseApplication.b())) {
                return "\u200b" + str;
            }
            try {
                return "\u200b" + UnitUtil.a(new Date(j), 131093);
            } catch (IllegalArgumentException unused) {
                LogUtil.c("HiHealthProcess__exportData", "Time parsing failed for input: " + j);
                return "";
            } catch (RuntimeException unused2) {
                LogUtil.c("HiHealthProcess__exportData", "Date formatting failed");
                return "";
            }
        }

        private String e(BloodPressureApi bloodPressureApi, HiHealthData hiHealthData) {
            StringBuilder sb = new StringBuilder();
            sb.append(bloodPressureApi.getActivityActionText((int) hiHealthData.getValue()));
            HiBloodPressureMetaData hiBloodPressureMetaData = (HiBloodPressureMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), HiBloodPressureMetaData.class);
            List<String> arrayList = new ArrayList<>();
            if (hiBloodPressureMetaData != null) {
                List<String> activityActions = hiBloodPressureMetaData.getActivityActions();
                if (!CollectionUtils.a(activityActions)) {
                    arrayList = activityActions;
                }
            }
            for (String str : arrayList) {
                if (sb.length() == 0) {
                    sb.append(str);
                } else {
                    sb.append(",");
                    sb.append(str);
                }
            }
            return sb.toString();
        }

        public String d() {
            if (this.h == "--" || this.f43561a == "--") {
                return "";
            }
            return nrw.e(this.j) + "," + nrw.e(this.h) + "," + nrw.e(this.f43561a) + "," + nrw.e(this.f) + "," + nrw.e(this.f43562c) + "," + nrw.e(this.d) + "," + nrw.e(this.e) + "," + nrw.e(this.g);
        }

        public static String b() {
            StringBuilder sb = new StringBuilder("\ufeff");
            sb.append(nrw.e(qre.f(f43560b[0])));
            int i = 1;
            while (true) {
                int[] iArr = f43560b;
                if (i < iArr.length) {
                    String strF = qre.f(iArr[i]);
                    sb.append(",");
                    sb.append(nrw.e(strF));
                    i++;
                } else {
                    sb.append("\n");
                    return sb.toString();
                }
            }
        }
    }
}
