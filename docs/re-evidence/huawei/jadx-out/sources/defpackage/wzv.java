package defpackage;

import android.content.Context;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.PermissionController;
import androidx.health.connect.client.permission.HealthPermission;
import androidx.health.connect.client.records.ActiveCaloriesBurnedRecord;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.StepsRecord;
import androidx.health.connect.client.records.metadata.DataOrigin;
import androidx.health.connect.client.records.metadata.Device;
import androidx.health.connect.client.records.metadata.Metadata;
import androidx.health.connect.client.response.InsertRecordsResponse;
import androidx.health.connect.client.units.Energy;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.ui.thirdpartservice.R;
import com.huawei.ui.thirdpartservice.interactors.thirdpartyservice.ThirdPartyDataType;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes20.dex */
public class wzv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f52633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f52634c = BaseApplication.d();
    private static volatile wzv e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f52635a = false;
    private Set<String> d;
    private PermissionController g;
    private HealthConnectClient j;

    private int d(int i) {
        switch (i) {
            case 22001:
                return 5;
            case 22002:
                return 4;
            case 22003:
                return 1;
            default:
                switch (i) {
                    case 22101:
                        return 4;
                    case 22102:
                        return 6;
                    case 22103:
                        return 5;
                    case 22104:
                        return 1;
                    case 22105:
                    case 22107:
                        return 2;
                    case 22106:
                        return 7;
                    default:
                        return -1;
                }
        }
    }

    private wzv() {
    }

    public static wzv b() {
        if (e == null) {
            synchronized (wzv.class) {
                if (e == null) {
                    e = new wzv();
                }
            }
        }
        return e;
    }

    public void c(Context context) {
        if (this.f52635a) {
            LogUtil.a("HealthConnectManager", "Has init");
        }
        int sdkStatus = HealthConnectClient.getSdkStatus(context, "com.google.android.apps.healthdata");
        f52633b = sdkStatus;
        if (sdkStatus == 1) {
            LogUtil.a("HealthConnectManager", "init fail : HealthConnect SDK is unavailable");
            return;
        }
        if (sdkStatus == 2) {
            LogUtil.a("HealthConnectManager", "init fail : need to update Health Connect");
            return;
        }
        HealthConnectClient orCreate = HealthConnectClient.getOrCreate(BaseApplication.b());
        this.j = orCreate;
        PermissionController permissionController = orCreate.getPermissionController();
        this.g = permissionController;
        this.d = (Set) permissionController.getGrantedPermissions(new Continuation<Set<String>>() { // from class: wzv.5
            @Override // kotlin.coroutines.Continuation
            /* JADX INFO: renamed from: getContext */
            public CoroutineContext getF54257c() {
                return zhf.e();
            }

            @Override // kotlin.coroutines.Continuation
            public void resumeWith(Object obj) {
                LogUtil.a("HealthConnectManager", "init getPermission Object:", obj.toString());
                LogUtil.a("HealthConnectManager", "init authorizedPermissions", wzv.this.d);
            }
        });
        this.f52635a = true;
    }

    public void f() {
        this.f52635a = false;
    }

    public Set<String> e() {
        return (Set) this.g.getGrantedPermissions(new Continuation<Set<String>>(this) { // from class: wzv.4
            @Override // kotlin.coroutines.Continuation
            /* JADX INFO: renamed from: getContext */
            public CoroutineContext getF54257c() {
                return zhf.e();
            }

            @Override // kotlin.coroutines.Continuation
            public void resumeWith(Object obj) {
                LogUtil.a("HealthConnectManager", "init getPermission Object:", obj.toString());
            }
        });
    }

    public String d() {
        return HealthPermission.getWritePermission(java.b(StepsRecord.class));
    }

    public String a() {
        return HealthPermission.getWritePermission(java.b(ActiveCaloriesBurnedRecord.class));
    }

    public String c() {
        return HealthPermission.getWritePermission(java.b(SleepSessionRecord.class));
    }

    /* JADX INFO: renamed from: wzv$7, reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f52638a;

        static {
            int[] iArr = new int[ThirdPartyDataType.DataType.values().length];
            f52638a = iArr;
            try {
                iArr[ThirdPartyDataType.DataType.STEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52638a[ThirdPartyDataType.DataType.CALORIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52638a[ThirdPartyDataType.DataType.SLEEP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean c(ThirdPartyDataType.DataType dataType) {
        this.d = e();
        int i = AnonymousClass7.f52638a[dataType.ordinal()];
        if (i == 1) {
            return this.d.contains(d());
        }
        if (i == 2) {
            return this.d.contains(a());
        }
        if (i != 3) {
            return false;
        }
        return this.d.contains(c());
    }

    public void c(List<HiHealthData> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_HealthConnectManager", "writeSteps no data");
            return;
        }
        final ArrayList arrayList = new ArrayList();
        LogUtil.a("HealthConnectManager", "writeSteps stepsHiHealthData:", list);
        try {
            ReleaseLogUtil.d("R_HealthConnectManager", "writeSteps start");
            Iterator<HiHealthData> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(c(it.next()));
            }
            ReleaseLogUtil.d("R_HealthConnectManager", "writeSteps stepsRecords size:", Integer.valueOf(arrayList.size()));
            LogUtil.a("HealthConnectManager", "writeSteps stepsRecord:", arrayList);
            this.j.insertRecords(arrayList, new Continuation<InsertRecordsResponse>(this) { // from class: wzv.1
                @Override // kotlin.coroutines.Continuation
                /* JADX INFO: renamed from: getContext */
                public CoroutineContext getF54257c() {
                    return zhf.e();
                }

                @Override // kotlin.coroutines.Continuation
                public void resumeWith(Object obj) {
                    LogUtil.a("HealthConnectManager", "writeSteps Object:", obj.toString());
                    if (obj instanceof InsertRecordsResponse) {
                        List<String> recordIdsList = ((InsertRecordsResponse) obj).getRecordIdsList();
                        LogUtil.a("HealthConnectManager", "writeSteps success, inserted records:", Integer.valueOf(recordIdsList.size()));
                        if (recordIdsList.isEmpty()) {
                            return;
                        }
                        ThirdPartyDataType.Platform platform = ThirdPartyDataType.Platform.HEALTH_CONNECT;
                        ThirdPartyDataType.DataType dataType = ThirdPartyDataType.DataType.STEP;
                        List list2 = arrayList;
                        xav.e(platform, dataType, ((StepsRecord) list2.get(list2.size() - 1)).getEndTime().toEpochMilli());
                        ThirdPartyDataType.Platform platform2 = ThirdPartyDataType.Platform.HEALTH_CONNECT;
                        ThirdPartyDataType.DataType dataType2 = ThirdPartyDataType.DataType.SPORT;
                        List list3 = arrayList;
                        xav.e(platform2, dataType2, ((StepsRecord) list3.get(list3.size() - 1)).getEndTime().toEpochMilli());
                    }
                }
            });
        } catch (Exception e2) {
            ReleaseLogUtil.a("R_HealthConnectManager", "writeSteps fail exception ", ExceptionUtils.c(e2));
        }
    }

    public void a(List<HiHealthData> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_HealthConnectManager", "writeCalories caloriesHiHealthData is null or empty");
            return;
        }
        LogUtil.a("HealthConnectManager", "writeCalories caloriesHiHealthData:", list);
        try {
            ReleaseLogUtil.d("R_HealthConnectManager", "writeCalories start");
            final ArrayList arrayList = new ArrayList();
            Iterator<HiHealthData> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b(it.next()));
            }
            ReleaseLogUtil.d("R_HealthConnectManager", "writeCalories activeCaloriesBurnedRecords size:", Integer.valueOf(arrayList.size()));
            LogUtil.a("HealthConnectManager", "writeCalories activeCaloriesBurnedRecords:", arrayList);
            this.j.insertRecords(arrayList, new Continuation<InsertRecordsResponse>(this) { // from class: wzv.3
                @Override // kotlin.coroutines.Continuation
                /* JADX INFO: renamed from: getContext */
                public CoroutineContext getF54257c() {
                    return zhf.e();
                }

                @Override // kotlin.coroutines.Continuation
                public void resumeWith(Object obj) {
                    LogUtil.a("HealthConnectManager", "writeCalories Object:", obj.toString());
                    if (obj instanceof InsertRecordsResponse) {
                        List<String> recordIdsList = ((InsertRecordsResponse) obj).getRecordIdsList();
                        LogUtil.a("HealthConnectManager", "writeCalories success, inserted records:", Integer.valueOf(recordIdsList.size()));
                        if (recordIdsList.isEmpty()) {
                            return;
                        }
                        ThirdPartyDataType.Platform platform = ThirdPartyDataType.Platform.HEALTH_CONNECT;
                        ThirdPartyDataType.DataType dataType = ThirdPartyDataType.DataType.CALORIES;
                        List list2 = arrayList;
                        xav.e(platform, dataType, ((ActiveCaloriesBurnedRecord) list2.get(list2.size() - 1)).getEndTime().toEpochMilli());
                    }
                }
            });
        } catch (Exception e2) {
            ReleaseLogUtil.a("R_HealthConnectManager", "writeCalories fail exception ", ExceptionUtils.c(e2));
        }
    }

    public void d(List<xbn> list) {
        if (!njy.e(list)) {
            try {
                ReleaseLogUtil.d("R_HealthConnectManager", "writeSleep start");
                final ArrayList arrayList = new ArrayList();
                for (xbn xbnVar : list) {
                    List<HiHealthData> listC = xbnVar.c();
                    LogUtil.a("HealthConnectManager", "writeSleep hiHealthDataList:", listC);
                    arrayList.addAll(b(listC, xbnVar.d()));
                }
                if (njy.e(arrayList)) {
                    LogUtil.d("HealthConnectManager", "writeSleep convertToRecord empty");
                    return;
                }
                LogUtil.a("HealthConnectManager", "writeSleep sleepSessionRecords:", arrayList);
                ReleaseLogUtil.d("R_HealthConnectManager", "writeSleep sleepSessionRecords size: ", Integer.valueOf(arrayList.size()));
                this.j.insertRecords(arrayList, new Continuation<InsertRecordsResponse>(this) { // from class: wzv.2
                    @Override // kotlin.coroutines.Continuation
                    /* JADX INFO: renamed from: getContext */
                    public CoroutineContext getF54257c() {
                        return zhf.e();
                    }

                    @Override // kotlin.coroutines.Continuation
                    public void resumeWith(Object obj) {
                        LogUtil.a("HealthConnectManager", "writeSleep Object:", obj.toString());
                        if (obj instanceof InsertRecordsResponse) {
                            List<String> recordIdsList = ((InsertRecordsResponse) obj).getRecordIdsList();
                            LogUtil.a("HealthConnectManager", "writeSleep success, inserted records:", Integer.valueOf(recordIdsList.size()));
                            if (recordIdsList.isEmpty()) {
                                return;
                            }
                            ThirdPartyDataType.Platform platform = ThirdPartyDataType.Platform.HEALTH_CONNECT;
                            ThirdPartyDataType.DataType dataType = ThirdPartyDataType.DataType.SLEEP;
                            List list2 = arrayList;
                            xav.e(platform, dataType, ((SleepSessionRecord) list2.get(list2.size() - 1)).getEndTime().toEpochMilli());
                        }
                    }
                });
                return;
            } catch (Exception e2) {
                ReleaseLogUtil.a("R_HealthConnectManager", "writeSleep fail exception ", ExceptionUtils.c(e2));
                return;
            }
        }
        LogUtil.a("HealthConnectManager", "writeSleep hiHealthDataList is null");
    }

    private Metadata b(String str, long j, Device device) {
        return new Metadata(2, "None", new DataOrigin(f52634c), Instant.ofEpochMilli(System.currentTimeMillis()), str + HiDateUtil.p(j), System.currentTimeMillis(), device);
    }

    private Metadata a(String str, long j, Device device, boolean z) {
        String str2;
        if (!z) {
            str2 = str + HiDateUtil.o(j);
        } else {
            str2 = "NOON" + j;
        }
        return new Metadata(2, "None", new DataOrigin(f52634c), Instant.ofEpochMilli(System.currentTimeMillis()), str2, System.currentTimeMillis(), device);
    }

    private StepsRecord c(HiHealthData hiHealthData) {
        Instant instantOfEpochMilli;
        Instant instantOfEpochMilli2;
        long startTime = hiHealthData.getStartTime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (HiDateUtil.d(startTime) == HiDateUtil.d(jCurrentTimeMillis)) {
            instantOfEpochMilli2 = Instant.ofEpochMilli(startTime);
            instantOfEpochMilli = Instant.ofEpochMilli(jCurrentTimeMillis);
        } else {
            Instant instantOfEpochMilli3 = Instant.ofEpochMilli(startTime);
            instantOfEpochMilli = Instant.ofEpochMilli(HiDateUtil.g(startTime));
            instantOfEpochMilli2 = instantOfEpochMilli3;
        }
        return new StepsRecord(instantOfEpochMilli2, ZoneOffset.of(hiHealthData.getTimeZone()), instantOfEpochMilli, ZoneOffset.of(hiHealthData.getTimeZone()), Integer.toUnsignedLong(hiHealthData.getIntValue()), b(ThirdPartyDataType.DataType.STEP.name(), hiHealthData.getStartTime(), e(hiHealthData)));
    }

    private ActiveCaloriesBurnedRecord b(HiHealthData hiHealthData) {
        Instant instantOfEpochMilli;
        Instant instantOfEpochMilli2;
        long startTime = hiHealthData.getStartTime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (HiDateUtil.d(startTime) == HiDateUtil.d(jCurrentTimeMillis)) {
            instantOfEpochMilli2 = Instant.ofEpochMilli(startTime);
            instantOfEpochMilli = Instant.ofEpochMilli(jCurrentTimeMillis);
        } else {
            Instant instantOfEpochMilli3 = Instant.ofEpochMilli(startTime);
            instantOfEpochMilli = Instant.ofEpochMilli(HiDateUtil.g(startTime));
            instantOfEpochMilli2 = instantOfEpochMilli3;
        }
        return new ActiveCaloriesBurnedRecord(instantOfEpochMilli2, ZoneOffset.of(hiHealthData.getTimeZone()), instantOfEpochMilli, ZoneOffset.of(hiHealthData.getTimeZone()), Energy.calories(hiHealthData.getValue()), b(ThirdPartyDataType.DataType.CALORIES.name(), hiHealthData.getStartTime(), e(hiHealthData)));
    }

    private SleepSessionRecord.Stage b(long j, long j2, int i) {
        try {
            return new SleepSessionRecord.Stage(Instant.ofEpochMilli(j), Instant.ofEpochMilli(j2), d(i));
        } catch (Exception e2) {
            ReleaseLogUtil.d("R_HealthConnectManager", "createStage e", ExceptionUtils.c(e2));
            return null;
        }
    }

    private List<SleepSessionRecord> b(List<HiHealthData> list, boolean z) {
        long startTime;
        long endTime;
        int type;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long startTime2 = list.get(0).getStartTime();
        long endTime2 = list.get(0).getEndTime();
        int type2 = list.get(0).getType();
        HiHealthData hiHealthData = list.get(0);
        int i = 1;
        while (i < list.size()) {
            HiHealthData hiHealthData2 = list.get(i);
            if (hiHealthData2.getStartTime() != endTime2) {
                if (type2 == 22105) {
                    c(startTime2, endTime2, type2, arrayList, hiHealthData);
                } else {
                    arrayList2.add(b(startTime2, endTime2, type2));
                }
                startTime = hiHealthData2.getStartTime();
                endTime = hiHealthData2.getEndTime();
                type = hiHealthData2.getType();
            } else {
                if (hiHealthData2.getType() != type2) {
                    if (type2 == 22105) {
                        c(startTime2, endTime2, type2, arrayList, hiHealthData);
                    } else {
                        arrayList2.add(b(startTime2, endTime2, type2));
                    }
                    startTime = hiHealthData2.getStartTime();
                    endTime = hiHealthData2.getEndTime();
                    type = hiHealthData2.getType();
                } else {
                    endTime2 = hiHealthData2.getEndTime();
                }
                i++;
                hiHealthData = hiHealthData2;
            }
            type2 = type;
            endTime2 = endTime;
            startTime2 = startTime;
            i++;
            hiHealthData = hiHealthData2;
        }
        if (type2 == 22105) {
            c(startTime2, endTime2, type2, arrayList, hiHealthData);
            a(z, arrayList2, arrayList, hiHealthData);
            return arrayList;
        }
        arrayList2.add(b(startTime2, endTime2, type2));
        a(z, arrayList2, arrayList, hiHealthData);
        return arrayList;
    }

    private void a(boolean z, List<SleepSessionRecord.Stage> list, List<SleepSessionRecord> list2, HiHealthData hiHealthData) {
        SleepSessionRecord sleepSessionRecordC;
        if (njy.e(list)) {
            ReleaseLogUtil.e("R_HealthConnectManager", "addSleepRecord stageList is empty");
            return;
        }
        if (!z) {
            SleepSessionRecord sleepSessionRecordC2 = c(list, hiHealthData, false);
            if (sleepSessionRecordC2 != null) {
                list2.add(sleepSessionRecordC2);
                return;
            }
            return;
        }
        if (list.get(0).getStage() == 1) {
            list.remove(0);
        }
        if (!list.isEmpty() && list.get(list.size() - 1).getStage() == 1) {
            list.remove(list.size() - 1);
        }
        if (list.isEmpty() || (sleepSessionRecordC = c(list, hiHealthData, false)) == null) {
            return;
        }
        list2.add(sleepSessionRecordC);
    }

    private void c(long j, long j2, int i, List<SleepSessionRecord> list, HiHealthData hiHealthData) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(b(j, j2, i));
        SleepSessionRecord sleepSessionRecordC = c(arrayList, hiHealthData, true);
        if (sleepSessionRecordC != null) {
            list.add(sleepSessionRecordC);
        }
    }

    private SleepSessionRecord c(List<SleepSessionRecord.Stage> list, HiHealthData hiHealthData, boolean z) {
        String strF = qre.f(R.string.IDS_health_connect_sleep_title);
        String strF2 = qre.f(R.string.IDS_health_connect_sleep_note);
        ArrayList arrayList = new ArrayList(list);
        try {
            return new SleepSessionRecord(((SleepSessionRecord.Stage) arrayList.get(0)).getStartTime(), ZoneOffset.of(hiHealthData.getTimeZone()), ((SleepSessionRecord.Stage) arrayList.get(arrayList.size() - 1)).getEndTime(), ZoneOffset.of(hiHealthData.getTimeZone()), a(ThirdPartyDataType.DataType.SLEEP.name(), ((SleepSessionRecord.Stage) arrayList.get(0)).getStartTime().toEpochMilli(), e(hiHealthData), z), strF, strF2, arrayList);
        } catch (IllegalArgumentException e2) {
            ReleaseLogUtil.d("R_HealthConnectManager", "convertToSleepRecord IllegalArgumentException e:", ExceptionUtils.c(e2));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    private int c(String str) {
        byte b2;
        switch (str) {
            case "001":
                b2 = 3;
                break;
            case "00E":
                b2 = 2;
                break;
            case "011":
                b2 = 4;
                break;
            case "054":
                b2 = 5;
                break;
            case "06D":
                b2 = 0;
                break;
            case "06E":
                b2 = 1;
                break;
            case "手动输入":
                b2 = 6;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return 1;
        }
        if (b2 != 1) {
            return (b2 == 2 || b2 == 3) ? 2 : 0;
        }
        return 6;
    }

    private Device e(HiHealthData hiHealthData) {
        ProductMapInfo productMapInfo;
        List<ProductMapInfo> listC = ProductMap.c("deviceId", String.valueOf(hiHealthData.getInt("trackdata_deviceType")));
        int iC = c((HiCommonUtil.b(listC) || (productMapInfo = listC.get(0)) == null) ? "UNKNOWN" : productMapInfo.e());
        String string = hiHealthData.getString("device_model");
        String string2 = hiHealthData.getString("device_name");
        if (string == null && string2 != null) {
            return new Device(iC, "UNKNOWN", string2);
        }
        if (string2 == null) {
            return new Device(iC, "UNKNOWN", string);
        }
        return new Device(iC, "UNKNOWN", "UNKNOWN");
    }

    public long a(long j, ThirdPartyDataType.DataType dataType) {
        LogUtil.a("HealthConnectManager", "getStartSyncTime lastSyncTime：", Long.valueOf(j), ", type:", dataType.name());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jMax = j == 0 ? jCurrentTimeMillis - 2592000000L : Math.max(jCurrentTimeMillis - 2592000000L, j - 86400000);
        if (dataType == ThirdPartyDataType.DataType.SLEEP) {
            return HiDateUtil.o(jMax);
        }
        return HiDateUtil.p(jMax);
    }
}
