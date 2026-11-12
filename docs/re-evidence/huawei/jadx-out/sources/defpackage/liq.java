package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.datasource.cache.CacheDataSink;
import com.amap.api.services.core.AMapException;
import com.huawei.haf.common.dfx.DfxBaseHandler;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.FirstSyncConfig;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcloudmodel.healthdatacloud.model.DeleteDataByTimeReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.DeleteHealthDataReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.DeleteHealthStatReq;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.DataDeleteCondition;
import com.huawei.hwcloudmodel.model.unite.DataTimeDelCondition;
import com.huawei.hwcloudmodel.model.unite.ParamValidDetail;
import com.huawei.hwcloudmodel.model.unite.ParamValidFailDetail;
import com.huawei.hwcloudmodel.model.unite.SyncKey;
import com.huawei.hwcloudmodel.model.userprofile.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OperationKey;
import com.huawei.watchface.mvp.model.webview.JsNetwork;
import health.compact.a.CommonUtil;
import health.compact.a.HiBroadcastManager;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.security.SecureRandom;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class liq {
    private static final int[] f = {2019, 2020, 2021, 2034, 2035, 2036, 2037, 2050};
    private static final int[] d = {22103, 22102, 22105, 22101, 22104, 22106, 22107};
    private static final int[] h = {22001, 22002, 22003};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f40310b = {2104, 2108, AMapException.CODE_AMAP_CLIENT_UPLOADAUTO_STARTED_ERROR, 2109, 2018, 2002, 2101, 2102, 2105};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f40309a = {31001};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<Integer> f40311c = new ArrayList<Integer>() { // from class: liq.5
        {
            add(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA.value()));
        }
    };
    public static final Map<Integer, FirstSyncConfig> e = new LinkedHashMap<Integer, FirstSyncConfig>() { // from class: liq.1
        {
            put(Integer.valueOf(DicDataTypeUtil.DataType.ACTIVE_HOUR.value()), new FirstSyncConfig(30, DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value()));
        }
    };
    private static boolean i = false;
    private static int j = -1;

    public static long b(long j2, int i2) {
        return j2 - (((long) i2) * 86400000);
    }

    private static int d(int i2) {
        if (i2 >= 44000 && i2 <= 44099) {
            return 3;
        }
        if (i2 <= 44299) {
            return 9;
        }
        if (i2 <= 44399) {
            return 11;
        }
        if (i2 == 46016 || i2 == 46017 || i2 == 46019) {
            return 500023;
        }
        if (i2 == 46020 || i2 == 46018) {
            return 500024;
        }
        return (i2 < 47401 || i2 > 47406) ? 0 : 1001;
    }

    public static boolean h() {
        return i;
    }

    public static void e(boolean z) {
        i = z;
    }

    public static List<SyncKey> e(Context context, int i2, int i3) {
        if (context == null) {
            return null;
        }
        return lio.c(context, i2, i3);
    }

    public static HiDeviceInfo e(Context context, long j2) throws lif {
        if (context == null) {
            return null;
        }
        return lio.a(context, j2);
    }

    public static DeviceInfo d(Context context, long j2) throws lif {
        if (context == null) {
            return null;
        }
        return lio.c(context, j2);
    }

    public static SparseArray<Integer> a(long j2, long j3, int i2) {
        return lio.b(j2, j3, i2);
    }

    public static int e(Context context) {
        if (context == null) {
            return 0;
        }
        return ljp.a(context.getPackageName());
    }

    public static List<SyncKey> e(Context context, int i2, List<Integer> list, boolean z) throws lif {
        if (context == null || list == null) {
            return null;
        }
        if (!Utils.h()) {
            LogUtil.a("HiH_HiSyncUtil", "getALLVersion fail, no cloud version");
            throw new lif("no cloud version");
        }
        return lio.b(context, i2, list, z);
    }

    public static Map<Integer, Long> b(Context context, List<Integer> list) throws lif {
        if (!Utils.h()) {
            LogUtil.a("HiH_HiSyncUtil", "getBusinessDataVersion, no cloud version");
            throw new lif("no cloud version for business datas");
        }
        return lio.d(context, list);
    }

    public static boolean d(Context context, int i2, List<Integer> list) {
        if (context == null || list == null) {
            return false;
        }
        return ljc.e(context, i2, list);
    }

    public static HiHealthData b(Context context, int i2) {
        if (context == null) {
            return null;
        }
        return ljc.a(context, i2);
    }

    public static boolean d(Context context, int i2, int i3, long j2) {
        if (context == null || kxk.c().a(i2, j2, i3) != null) {
            return false;
        }
        LogUtil.a("HiH_HiSyncUtil", "checkFirstSyncByType no such data in db ,type is ", Integer.valueOf(i3));
        return true;
    }

    public static boolean a(Context context, List<DataDeleteCondition> list) throws lif {
        if (context == null || list == null) {
            return false;
        }
        DeleteHealthDataReq deleteHealthDataReq = new DeleteHealthDataReq();
        deleteHealthDataReq.setDelHealthDataConditons(list);
        return lih.e(lqo.b(context).d(deleteHealthDataReq), false);
    }

    public static boolean e(Context context, List<DataTimeDelCondition> list) throws lif {
        if (context == null || HiCommonUtil.b(list)) {
            return false;
        }
        DeleteDataByTimeReq deleteDataByTimeReq = new DeleteDataByTimeReq();
        deleteDataByTimeReq.setDelDayDataConditons(list);
        return lih.e(lqo.b(context).c(deleteDataByTimeReq), false);
    }

    public static boolean c(Context context, List<kuk> list) throws lif {
        if (context == null || HiCommonUtil.b(list)) {
            ReleaseLogUtil.d("HiH_HiSyncUtil", "deleteHealthStatData null");
            return false;
        }
        for (kuk kukVar : list) {
            int iG = kukVar.g();
            HiHealthDictType hiHealthDictTypeG = HiHealthDictManager.a(context).g(kukVar.g());
            if (hiHealthDictTypeG != null) {
                iG = hiHealthDictTypeG.l();
            }
            int iD = d(kukVar.g());
            if (iD != 0) {
                iG = iD;
            }
            if (f40311c.contains(Integer.valueOf(iG))) {
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
                linkedHashMap.put("type", "deleteHealthStat " + iG);
                linkedHashMap.put("date", "deleteHealthStat " + kukVar.e());
                ljv.d(context).c(OperationKey.THREE_CIRCLE_ERROR_2129010.value(), linkedHashMap, true);
            } else {
                HashSet hashSet = new HashSet(1);
                hashSet.add(Integer.valueOf(iG));
                DeleteHealthStatReq deleteHealthStatReqBuild = new DeleteHealthStatReq.Builder().startTime(kukVar.e()).endTime(kukVar.e()).dataSource(1).types(hashSet).build();
                if (!lih.e(lqo.b(context).c(deleteHealthStatReqBuild), false)) {
                    return false;
                }
                ReleaseLogUtil.d("HiH_HiSyncUtil", "delStat,", deleteHealthStatReqBuild);
            }
        }
        return true;
    }

    public static boolean a(Context context, int i2) throws lif {
        if (context == null) {
            ReleaseLogUtil.d("HiH_HiSyncUtil", "deleteCoreSleepStat null");
            return false;
        }
        HashSet hashSet = new HashSet(1);
        hashSet.add(9);
        DeleteHealthStatReq deleteHealthStatReqBuild = new DeleteHealthStatReq.Builder().startTime(i2).endTime(i2).dataSource(1).types(hashSet).build();
        ReleaseLogUtil.d("HiH_HiSyncUtil", "delStat,", deleteHealthStatReqBuild);
        return lih.e(lqo.b(context).c(deleteHealthStatReqBuild), false);
    }

    public static void c(int i2, int i3) throws lif {
        if (i3 != 1 && i2 >= 200) {
            LogUtil.e("HiH_HiSyncUtil", "uploadCountMaxCheck too much upload count is ", Integer.valueOf(i2));
            throw new lif("SYNC_EX: UPLOAD_TOO_MUCH ");
        }
    }

    public static void a(int i2, int i3) throws lif {
        if (i3 != 1 && i2 >= 20) {
            LogUtil.e("HiH_HiSyncUtil", "uploadSportDataCountMaxCheck too much upload count is ", Integer.valueOf(i2));
            throw new lif("SYNC_EX: UPLOAD_TOO_MUCH ");
        }
    }

    public static void d(Context context, List<HiHealthData> list, int[] iArr, int i2) {
        if (list == null || context == null || iArr == null) {
            return;
        }
        for (HiHealthData hiHealthData : list) {
            long modifiedTime = hiHealthData.getModifiedTime();
            for (int i3 : iArr) {
                ljq.d(context, i3).e(i2, hiHealthData.getStartTime(), i3, modifiedTime);
            }
        }
    }

    public static List<HiHealthData> a(Context context, int i2, int[] iArr, String[] strArr, int[] iArr2) {
        if (iArr == null || strArr == null || iArr2 == null) {
            return null;
        }
        return ljc.c(context, i2, iArr, strArr, iArr2);
    }

    public static void e(Context context, List<HiHealthData> list, int[] iArr, int i2) {
        if (list == null || context == null || iArr == null) {
            return;
        }
        for (HiHealthData hiHealthData : list) {
            for (int i3 : iArr) {
                ljq.d(context, i3).b(i2, hiHealthData.getStartTime(), i3);
            }
        }
    }

    public static void f(Context context, List<HiHealthData> list) {
        if (list == null || context == null) {
            return;
        }
        for (HiHealthData hiHealthData : list) {
            kwq.e(context).e(hiHealthData.getClientId(), hiHealthData.getStartTime(), hiHealthData.getEndTime(), 901, 1);
            kwq.e(context).e(hiHealthData.getClientId(), hiHealthData.getStartTime(), hiHealthData.getEndTime(), 902, 1);
            kwq.e(context).e(hiHealthData.getClientId(), hiHealthData.getStartTime(), hiHealthData.getEndTime(), 903, 1);
            kwq.e(context).e(hiHealthData.getClientId(), hiHealthData.getStartTime(), hiHealthData.getEndTime(), 904, 1);
            kwq.e(context).e(hiHealthData.getClientId(), hiHealthData.getStartTime(), hiHealthData.getEndTime(), 905, 1);
            kwq.e(context).e(hiHealthData.getClientId(), hiHealthData.getStartTime(), hiHealthData.getEndTime(), TypedValues.Custom.TYPE_REFERENCE, 1);
            kwq.e(context).e(hiHealthData.getClientId(), hiHealthData.getStartTime(), hiHealthData.getEndTime(), 907, 1);
        }
    }

    public static int c(int i2) {
        return ljc.b(i2);
    }

    public static int h(Context context, int i2) {
        if (context == null) {
            return 0;
        }
        return liv.d().a(context, i2);
    }

    public static int b(Context context, int i2, int i3, int i4) {
        if (context == null) {
            return 0;
        }
        kuk kukVarB = ljq.d(context, i4).b(i3, i4, kwt.b().g(i2));
        if (kukVarB == null) {
            return 0;
        }
        return (int) kukVarB.l();
    }

    public static kuk d(Context context, int i2, int i3, int i4) {
        if (context == null) {
            return null;
        }
        return ljq.d(context, i4).b(i3, i4, kwt.b().g(i2));
    }

    public static List<DataDeleteCondition> d(Context context, List<HiHealthData> list) {
        if (context == null || list == null) {
            return null;
        }
        return liu.b(context, list);
    }

    public static double[] c(Context context, double[] dArr) {
        if (context == null || dArr == null) {
            return null;
        }
        return liu.c(context, dArr);
    }

    public static void c(Context context, int i2, int i3) {
        if (context == null) {
            return;
        }
        context.getSharedPreferences("sync_record", 0).edit().putInt("sportsyncrecord" + i2, i3).apply();
    }

    public static void e(Context context, int i2, boolean z) {
        if (context == null) {
            return;
        }
        context.getSharedPreferences("sync_record", 0).edit().putBoolean("firstsynccompleteflag" + i2, z).apply();
    }

    public static boolean f(Context context, int i2) {
        if (context == null) {
            return true;
        }
        return context.getSharedPreferences("sync_record", 0).getBoolean("firstsynccompleteflag" + i2, false);
    }

    public static void b(Context context, int i2, boolean z) {
        if (context == null) {
            return;
        }
        context.getSharedPreferences("sync_record", 0).edit().putBoolean("syncalldatacompleteflag" + i2, z).apply();
    }

    public static boolean j(Context context, int i2) {
        if (context == null) {
            return true;
        }
        return context.getSharedPreferences("sync_record", 0).getBoolean("syncalldatacompleteflag" + i2, false);
    }

    public static int e(int i2) {
        return SharedPreferenceManager.c("HiHealthService", "firstSyncFailCountFlag" + i2, 0);
    }

    public static void d(int i2, int i3) {
        SharedPreferenceManager.d("HiHealthService", "firstSyncFailCountFlag" + i2, i3);
    }

    public static void d(Context context, int i2, int i3) {
        if (context == null) {
            return;
        }
        context.getSharedPreferences("sync_record", 0).edit().putInt("backgroudflag" + i2, i3).apply();
        j = i3;
    }

    public static int d(Context context, int i2) {
        if (context == null) {
            return 0;
        }
        int i3 = context.getSharedPreferences("sync_record", 0).getInt("backgroudflag" + i2, 0);
        j = i3;
        return i3;
    }

    public static void d(Context context, int i2, long j2) {
        if (context == null) {
            return;
        }
        context.getSharedPreferences("sync_record", 0).edit().putLong("backgroudstarttime" + i2, j2).apply();
    }

    public static long e(Context context, int i2) {
        if (context == null) {
            return 0L;
        }
        return context.getSharedPreferences("sync_record", 0).getLong("backgroudstarttime" + i2, 0L);
    }

    public static void e() {
        BaseApplication.getContext().deleteSharedPreferences("sync_record");
    }

    public static int a() {
        return j;
    }

    public static void a(List<HiHealthData> list, ParamValidDetail paramValidDetail, Map<Long, List<Long>> map) {
        ReleaseLogUtil.d("HiH_HiSyncUtil", "enter processInvalidData");
        if (yls.c(list) || paramValidDetail == null) {
            return;
        }
        List<ParamValidFailDetail> failList = paramValidDetail.getFailList();
        Iterator<HiHealthData> it = list.iterator();
        ArrayList arrayList = new ArrayList();
        for (ParamValidFailDetail paramValidFailDetail : failList) {
            if (paramValidFailDetail != null) {
                if (map != null && !map.isEmpty() && map.containsKey(Long.valueOf(paramValidFailDetail.getDataId()))) {
                    arrayList.addAll(map.get(Long.valueOf(paramValidFailDetail.getDataId())));
                } else {
                    arrayList.add(Long.valueOf(paramValidFailDetail.getDataId()));
                }
            }
        }
        while (it.hasNext()) {
            HiHealthData next = it.next();
            if (next != null && arrayList.contains(Long.valueOf(next.getDataId()))) {
                ReleaseLogUtil.d("HiH_HiSyncUtil", "InvalidDataId:", arrayList, ", startTime:", Long.valueOf(next.getStartTime()), ", endTime:", Long.valueOf(next.getEndTime()), ", type:", Integer.valueOf(next.getType()));
                a(next);
                it.remove();
            }
        }
    }

    public static int a(Context context, int i2, int i3) {
        kul kulVarD;
        if (context == null) {
            return 0;
        }
        kul kulVarD2 = kxk.c().d(i2, 0L, i3);
        if (kulVarD2 != null) {
            return kulVarD2.d();
        }
        if (10016 != i3 || (kulVarD = kxk.c().d(i2, 0L, 10015)) == null) {
            return 0;
        }
        return kulVarD.d();
    }

    public static List<Integer> c(Context context, int i2) {
        if (context == null) {
            return null;
        }
        return ljc.e(context, i2);
    }

    public static boolean f() {
        return Utils.o();
    }

    public static void g() throws lif {
        if (Utils.h()) {
            liv.d().c(BaseApplication.getContext(), kud.a().e());
        }
    }

    public static boolean e(double d2, double d3, double d4) {
        return Double.compare(d2, d4) >= 0 && Double.compare(d2, d3) <= 0;
    }

    public static void d(int i2, boolean z) {
        if (i2 >= 100) {
            try {
                if (i2 % 100 == 0) {
                    Thread.sleep(z ? 50L : 100L);
                }
            } catch (InterruptedException e2) {
                ReleaseLogUtil.e("HiH_HiSyncUtil", "InterruptedException", LogAnonymous.b(e2));
            }
        }
    }

    public static void a(int i2) {
        if (i2 <= 0) {
            return;
        }
        try {
            Thread.sleep(i2);
        } catch (InterruptedException e2) {
            ReleaseLogUtil.e("HiH_HiSyncUtil", "InterruptedException", LogAnonymous.b(e2));
        }
    }

    public static void i(Context context, int i2) {
        String str;
        String str2;
        if (context == null) {
            return;
        }
        LogUtil.a("HiH_HiSyncUtil", "sendPullFinishBroadcastWithFlag");
        if (i2 == 10004) {
            str = "com.huawei.hihealth.action_sync_sport_stat_data";
            str2 = "pullSportStatStatus";
        } else if (i2 == 20000) {
            str = "com.huawei.hihealth.action_sync_all_data";
            str2 = "pullAllStatus";
        } else {
            LogUtil.e("HiH_HiSyncUtil", "sendPullFinishBroadcastWithFlag incorrect syncType");
            return;
        }
        Intent intent = new Intent(str);
        intent.setPackage(BaseApplication.getAppPackage());
        HiBroadcastManager.b(context, intent);
        SharedPreferenceManager.a("HiHealthService", str2, true);
    }

    public static void d(CloudCommonReponse cloudCommonReponse, ParamValidDetail paramValidDetail) {
        c(cloudCommonReponse, paramValidDetail, (LinkedHashMap<String, String>) null);
    }

    public static void c(CloudCommonReponse cloudCommonReponse, ParamValidDetail paramValidDetail, LinkedHashMap<String, String> linkedHashMap) {
        LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>(CollectionUtils.c(linkedHashMap) ? 7 : 7 + linkedHashMap.size());
        linkedHashMap2.put("errorCode", Integer.toString(cloudCommonReponse.getResultCode().intValue()));
        linkedHashMap2.put(OpAnalyticsConstants.REQUEST_INTERFACE, cloudCommonReponse.getClass().toString());
        linkedHashMap2.put(OpAnalyticsConstants.RESULT_DESCRIBE, paramValidDetail == null ? cloudCommonReponse.getResultDesc() : paramValidDetail.toString());
        if (!CollectionUtils.c(linkedHashMap)) {
            linkedHashMap2.putAll(linkedHashMap);
        }
        ljv.d(BaseApplication.getContext()).c(OperationKey.HEALTH_APP_SYNC_CLOUD_FAILED_85070023.value(), linkedHashMap2, false);
    }

    private static void a(HiHealthData hiHealthData) {
        int type = hiHealthData.getType();
        HiHealthDataType.Category categoryD = HiHealthDataType.d(type);
        Context context = BaseApplication.getContext();
        int i2 = AnonymousClass2.e[categoryD.ordinal()];
        if (i2 == 1) {
            kws.e(context).c(hiHealthData.getDataId(), 3);
            return;
        }
        if (i2 == 2) {
            kww.c(context).c((int) hiHealthData.getDataId(), 3);
            return;
        }
        if (i2 != 3) {
            ReleaseLogUtil.e("HiH_HiSyncUtil", "updateInvalidSyncStatus ignored by unsupported data type=", Integer.valueOf(type));
            return;
        }
        if (type < 2000) {
            kwq.e(context).c(hiHealthData.getDataId(), 3);
        } else if (HiHealthDataType.f(type)) {
            ljq.a(context, type).d(hiHealthData.getDataId(), 3);
        } else {
            kxd.e(context).c(hiHealthData.getDataId(), 3);
        }
    }

    /* JADX INFO: renamed from: liq$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[HiHealthDataType.Category.values().length];
            e = iArr;
            try {
                iArr[HiHealthDataType.Category.SEQUENCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[HiHealthDataType.Category.STAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[HiHealthDataType.Category.POINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static List<Integer> b(String str, int i2) {
        List<Integer> listE = kxe.d(BaseApplication.getContext()).e(str, i2);
        List<Integer> listE2 = kxc.c().e(str, i2);
        ArrayList arrayList = new ArrayList(2);
        if (!HiCommonUtil.b(listE)) {
            arrayList.addAll(listE);
        }
        if (!HiCommonUtil.b(listE2)) {
            arrayList.addAll(listE2);
        }
        if ("client_id".equals(str)) {
            return arrayList;
        }
        HashSet hashSet = new HashSet(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            HiHealthDictType hiHealthDictTypeI = HiHealthDictManager.a(BaseApplication.getContext()).i(((Integer) it.next()).intValue());
            if (hiHealthDictTypeI != null) {
                hashSet.add(Integer.valueOf(hiHealthDictTypeI.l()));
            }
        }
        return new ArrayList(hashSet);
    }

    public static List<Integer> d() {
        ArrayList arrayList = new ArrayList(10);
        List<Integer> listE = kws.e(BaseApplication.getContext()).e(f40309a);
        if (!HiCommonUtil.b(listE)) {
            arrayList.addAll(listE);
        }
        List<Integer> listA = kxd.e(BaseApplication.getContext()).a(f);
        if (!HiCommonUtil.b(listA)) {
            arrayList.addAll(listA);
        }
        List<Integer> listC = kwu.c(BaseApplication.getContext()).c(d);
        if (!HiCommonUtil.b(listC)) {
            arrayList.addAll(listC);
        }
        List<Integer> listB = kxg.c(BaseApplication.getContext()).b(h);
        if (!HiCommonUtil.b(listB)) {
            arrayList.addAll(listB);
        }
        List<Integer> listB2 = kxe.d(BaseApplication.getContext()).b(f40310b);
        if (!HiCommonUtil.b(listB2)) {
            arrayList.addAll(listB2);
        }
        return arrayList;
    }

    public static boolean j() {
        int i2 = Calendar.getInstance().get(12);
        return (i2 == 0 || i2 == 30) && c(0.3d);
    }

    private static boolean c(double d2) {
        return new SecureRandom().nextDouble() < d2;
    }

    public static long i() {
        return new SecureRandom().nextInt(480000);
    }

    public static void e(HiSyncOption hiSyncOption) {
        if (hiSyncOption.getSyncDataType() == 20000 && hiSyncOption.getSyncAction() == 5) {
            final String strB = ofp.b();
            if (!TextUtils.isEmpty(strB)) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: lix
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        liq.a(strB);
                    }
                });
            }
            String strD = HiDateUtil.d("yyyyMMdd");
            String strC = ofp.c();
            try {
                String strE = HiDateUtil.e(strD, "yyyyMMdd", 1);
                if (strE.equals(strC)) {
                    return;
                }
                if (strC == null || HiDateUtil.d(strC, strD, "yyyyMMdd") - 1 > 5) {
                    strC = HiDateUtil.e(strD, "yyyyMMdd", 5);
                }
                while (strE.compareTo(strC) > 0) {
                    b(strE);
                    strE = HiDateUtil.e(strE, "yyyyMMdd", 1);
                }
                ofp.b(strD, HiDateUtil.e(strD, "yyyyMMdd", 1));
            } catch (ParseException unused) {
                LogUtil.e("HiH_HiSyncUtil", "reportTrafficBI parse error");
            }
        }
    }

    private static void b(String str) {
        Map<String, Long> mapD = ofp.d(str);
        if (mapD == null) {
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("date", str);
        linkedHashMap.put("wifi", String.valueOf(mapD.get("wifi") == null ? 0L : mapD.get("wifi").longValue()));
        linkedHashMap.put(JsNetwork.NetworkType.MOBILE, String.valueOf(mapD.get(JsNetwork.NetworkType.MOBILE) == null ? 0L : mapD.get(JsNetwork.NetworkType.MOBILE).longValue()));
        linkedHashMap.put("other", String.valueOf(mapD.get("other") == null ? 0L : mapD.get("other").longValue()));
        linkedHashMap.put("total", String.valueOf(mapD.get("total") == null ? 0L : mapD.get("total").longValue()));
        ljv.d(BaseApplication.getContext()).c(OperationKey.HEALTH_APP_TOTAL_DATA_TRAFFIC_2129022.value(), linkedHashMap, false);
        Map<String, Map<String, Long>> mapB = ofp.b(str);
        if (mapB == null) {
            return;
        }
        for (Map.Entry<String, Map<String, Long>> entry : mapB.entrySet()) {
            LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>();
            linkedHashMap2.put("date", str);
            linkedHashMap2.put("url", entry.getKey());
            long jLongValue = entry.getValue().get("wifi") == null ? 0L : entry.getValue().get("wifi").longValue();
            Long lValueOf = Long.valueOf(jLongValue);
            long jLongValue2 = entry.getValue().get(JsNetwork.NetworkType.MOBILE) == null ? 0L : entry.getValue().get(JsNetwork.NetworkType.MOBILE).longValue();
            Long lValueOf2 = Long.valueOf(jLongValue2);
            long jLongValue3 = entry.getValue().get("other") == null ? 0L : entry.getValue().get("other").longValue();
            Long lValueOf3 = Long.valueOf(jLongValue3);
            lValueOf.getClass();
            lValueOf2.getClass();
            lValueOf3.getClass();
            linkedHashMap2.put("wifi", String.valueOf(lValueOf));
            linkedHashMap2.put(JsNetwork.NetworkType.MOBILE, String.valueOf(lValueOf2));
            linkedHashMap2.put("other", String.valueOf(lValueOf3));
            linkedHashMap2.put("total", String.valueOf(Long.valueOf(jLongValue + jLongValue2 + jLongValue3)));
            ljv.d(BaseApplication.getContext()).c(OperationKey.HEALTH_APP_URL_DATA_TRAFFIC_2129023.value(), linkedHashMap2, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str) throws Throwable {
        e eVar = new e("TrafficDfx", "_trafficLog_%d", 2, CacheDataSink.DEFAULT_BUFFER_SIZE, true);
        eVar.c(str, eVar.getSaveFile());
    }

    static class e extends DfxBaseHandler {
        public e(String str, String str2, int i, int i2, boolean z) {
            super(str, str2, i, i2, z);
        }

        public void c(String str, File file) throws Throwable {
            super.saveInfo(str, file);
        }
    }

    public static List<Integer> b() {
        ArrayList arrayList = new ArrayList(360);
        c(h, arrayList);
        c(HiHealthDataType.m(), arrayList);
        c(d, arrayList);
        c(HiHealthDataType.e(), arrayList);
        c(new int[]{46016, 46017, 46018, 46019, 46020}, arrayList);
        c(new int[]{2002, 2018, 2105}, arrayList);
        c(new int[]{2101, 2102}, arrayList);
        c(new int[]{47003, 47004, 47002, 47005}, arrayList);
        c(new int[]{2019, 2020, 2034, 2035, 2036, 2037, 2050}, arrayList);
        c(new int[]{44305, 44304, 44306, 44307, 44308}, arrayList);
        c(new int[]{2103}, arrayList);
        c(new int[]{47201, 47202, 47203, 47204}, arrayList);
        c(new int[]{2107}, arrayList);
        return d(arrayList);
    }

    private static List<Integer> d(List<Integer> list) {
        c(new int[]{47401, 47402, 47403, 47404, 47405, 47406}, list);
        int[] iArr = {DicDataTypeUtil.DataType.SLEEP_RECORD.value(), DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD.value(), DicDataTypeUtil.DataType.MONTHLY_SLEEP.value(), DicDataTypeUtil.DataType.SLEEP_DETAILS.value(), DicDataTypeUtil.DataType.ENVIRONMENT_NOISE_TYPE.value(), DicDataTypeUtil.DataType.HEART_RATE_VARIABILITY.value(), DicDataTypeUtil.DataType.BLOODGLUCOSE_BLOODSUGAR.value(), DicDataTypeUtil.DataType.WEIGHT_BODYFAT_BROAD.value(), DicDataTypeUtil.DataType.EMOTION_SET.value(), DicDataTypeUtil.DataType.BLOOD_PRESSURE_SET.value(), DicDataTypeUtil.DataType.DYNAMIC_BP_REPORT.value(), DicDataTypeUtil.DataType.LAKELOUISE_AMS_SCORE_SET.value(), DicDataTypeUtil.DataType.SKIN_TEMPERATURE_SET.value(), DicDataTypeUtil.DataType.PHYSIOLOGICAL_CYCLE.value(), DicDataTypeUtil.DataType.PHYSIOLOGICAL_CYCLE_BUSINESS.value()};
        HiHealthDictManager hiHealthDictManagerA = HiHealthDictManager.a(BaseApplication.getContext());
        for (int i2 = 0; i2 < 15; i2++) {
            int i3 = iArr[i2];
            if (HiHealthDataType.Category.SEQUENCE == HiHealthDataType.d(i3)) {
                list.add(Integer.valueOf(i3));
            } else if (hiHealthDictManagerA != null) {
                List<Integer> listF = hiHealthDictManagerA.f(i3);
                if (!CollectionUtils.a(listF)) {
                    list.addAll(listF);
                }
                List<Integer> listM = hiHealthDictManagerA.m(i3);
                if (!CollectionUtils.a(listM)) {
                    list.addAll(listM);
                }
            }
        }
        return list;
    }

    public static List<Integer> c() {
        ArrayList arrayList = new ArrayList(Arrays.asList(2, 3, 4, 7, 8, 901, 902, 903, 904, 905, Integer.valueOf(TypedValues.Custom.TYPE_REFERENCE), 907, 40002, 40003, 40004, Integer.valueOf(SmartMsgConstant.MSG_TYPE_RIDE_USER), Integer.valueOf(SmartMsgConstant.MSG_TYPE_BLOOD_SUGAR_USER), 40008, 47101));
        Iterator it = Arrays.asList(Integer.valueOf(DicDataTypeUtil.DataType.ACTIVE_HOUR.value()), Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA.value())).iterator();
        while (it.hasNext()) {
            List<Integer> listF = HiHealthDictManager.a(BaseApplication.getContext()).f(((Integer) it.next()).intValue());
            if (!CollectionUtils.a(listF)) {
                arrayList.addAll(listF);
            }
        }
        arrayList.add(30001);
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.ONE_SECOND_SPORT_DATA_TYPE.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.MERGED_TRACK.value()));
        arrayList.addAll(Arrays.asList(20001, 20002, 20003, 20004, 20005, 20006, 20007, 20008, 20010, 20014));
        return arrayList;
    }

    private static void c(int[] iArr, List<Integer> list) {
        if (iArr == null || list == null) {
            return;
        }
        for (int i2 : iArr) {
            list.add(Integer.valueOf(i2));
        }
    }

    public static void a(List<HiHealthData> list, String str) {
        if (CommonUtil.ap()) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int size = list.size();
                long startTime = 0;
                long modifiedTime = 0;
                for (HiHealthData hiHealthData : list) {
                    startTime += jCurrentTimeMillis - hiHealthData.getStartTime();
                    if (hiHealthData.getModifiedTime() > 0) {
                        modifiedTime += jCurrentTimeMillis - hiHealthData.getModifiedTime();
                    } else {
                        size--;
                    }
                }
                double size2 = startTime / ((double) list.size());
                double d2 = size != 0 ? modifiedTime / ((double) size) : 0.0d;
                String strMaskValue = SharedPreferenceUtil.getInstance(BaseApplication.getContext()).maskValue(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
                LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(2);
                linkedHashMap.put("data_type", str);
                linkedHashMap.put("list_size_create", String.valueOf(list.size()));
                linkedHashMap.put("list_size_insert", String.valueOf(size));
                linkedHashMap.put("avg_from_create_to_sync.", String.valueOf(size2));
                linkedHashMap.put("avg_from_insert_to_sync.", String.valueOf(d2));
                linkedHashMap.put("huid_mask", strMaskValue);
                ljv.d(BaseApplication.getContext()).c(OperationKey.HEALTH_APP_DATA_SYNC_EFFICIENCY_2129053.value(), linkedHashMap, false);
            } catch (Exception e2) {
                ReleaseLogUtil.a("HiH_HiSyncUtil", "dataSyncCostEvent: error ", e2.getMessage());
            }
        }
    }
}
