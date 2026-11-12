package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiGoalInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hihealthservice.dbmanager.SampleConfigManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kuh {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List<String> f39507c = Arrays.asList("900200006", "900200007", "900200008", "900200009");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SparseIntArray f39506b = new SparseIntArray(2);

    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    public static void d(int i, int i2, int i3) throws Throwable {
        boolean zB;
        try {
            zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
            try {
                try {
                    a(BaseApplication.b(), i, i2, i3);
                    if (zB) {
                        ljq.g(BaseApplication.b(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.a("HiH_HiAccountSwitch", "moveTodaySportDataToLoginUser Exception", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (zB) {
                    ljq.c(BaseApplication.b(), 0);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            zB = false;
            if (zB) {
                ljq.c(BaseApplication.b(), 0);
            }
            throw th;
        }
    }

    private static void a(Context context, int i, int i2, int i3) {
        LogUtil.a("HiH_HiAccountSwitch", "doMoveTodaySportDataToLoginUser app = ", Integer.valueOf(i), ",oldUser = ", Integer.valueOf(i2), ",newUser = ", Integer.valueOf(i3));
        if (i2 == i3 || i3 <= 0 || i2 <= 0) {
            LogUtil.j("HiH_HiAccountSwitch", "doMoveTodaySportDataToLoginUser oldUser = newUser return");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jP = HiDateUtil.p(jCurrentTimeMillis);
        long jG = HiDateUtil.g(jCurrentTimeMillis);
        kyj kyjVarC = kyj.c();
        kyn kynVarD = kyn.d(context);
        int iC = kxi.c(context, FoundationCommonUtil.getAndroidId(context));
        List<Integer> listC = kyjVarC.c(i3, iC);
        int iE = kynVarD.e(0, i3, iC);
        LogUtil.a("HiH_HiAccountSwitch", "doMoveTodaySportDataToLoginUser newClients = ", listC, ",newStatClient = ", Integer.valueOf(iE));
        if (listC != null && !listC.isEmpty()) {
            LogUtil.a("HiH_HiAccountSwitch", "doMoveTodaySportDataToLoginUser deletePoint = ", Integer.valueOf(kwq.e(context).c(jP, jG, HiHealthDataType.o(), listC)));
            LogUtil.a("HiH_HiAccountSwitch", "doMoveTodaySportDataToLoginUser deleteSession = ", Integer.valueOf(kwv.e(context).b(jP, jG, 20001, 21000, listC)));
        }
        LogUtil.a("HiH_HiAccountSwitch", "doMoveTodaySportDataToLoginUser deleteStat = ", Integer.valueOf(kww.c(context).e(jP, jG, 40001, 41000, iE)));
        LogUtil.a("HiH_HiAccountSwitch", "doMoveTodayActiveHourToLoginUser deleteStat = ", Integer.valueOf(kww.c(context).e(jP, jG, DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value(), DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value(), iE)));
        List<Integer> listC2 = kyj.c().c(i2, iC);
        LogUtil.a("HiH_HiAccountSwitch", "doMoveTodaySportDataToLoginUser oldClients = ", listC2);
        if (listC2 != null && !listC2.isEmpty()) {
            int iE2 = kynVarD.e(0, i2, iC);
            int iE3 = kynVarD.e(i, i3, iC);
            LogUtil.d("HiH_HiAccountSwitch", "doMoveTodaySportDataToLoginUser oldStatClient = ", Integer.valueOf(iE2), ",newClient = ", Integer.valueOf(iE3), ",deviceID = ", Integer.valueOf(iC));
            kwx kwxVarE = kwx.e();
            kwxVarE.b(jP, jG, listC2, iE3);
            kwxVarE.a(jP, jG, listC2, iE3);
            kwxVarE.d(jP, jG, i3, iE2, iE);
            kwxVarE.e(jP, jG, listC2, iE3);
            kwxVarE.c(jP, jG, i3, iE2, iE);
        }
        LogUtil.a("HiH_HiAccountSwitch", "doMoveTodaySportDataToLoginUser end totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public static int a(String str, String str2, boolean z) {
        return b(BaseApplication.b(), str, str2, z);
    }

    private static int b(Context context, String str, String str2, boolean z) {
        LogUtil.d("HiH_HiAccountSwitch", "copyHealthData huidA = ", str, ",huidB = ", str2);
        if (str == null || str2 == null || str.equals(str2)) {
            LogUtil.j("HiH_HiAccountSwitch", "copyHealthData A or B is null or A equals B");
            return 1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        kxq kxqVarC = kxq.c();
        int iD = kxqVarC.d(str, 0);
        if (iD <= 0) {
            LogUtil.j("HiH_HiAccountSwitch", "copyHealthData userA is not exist");
            return 2;
        }
        int iD2 = kxqVarC.d(str2, 0);
        if (iD2 <= 0) {
            HiUserInfo hiUserInfo = new HiUserInfo();
            hiUserInfo.setHuid(str2);
            hiUserInfo.setCreateTime(1L);
            iD2 = (int) kxqVarC.c(hiUserInfo, 0);
        }
        if (HuaweiHealth.c().equals(str)) {
            LogUtil.a("HiH_HiAccountSwitch", "copyHealthData move default user personal info to target userB!");
            c(context, iD, iD2);
        }
        LogUtil.a("HiH_HiAccountSwitch", "copyHealthData userA = ", Integer.valueOf(iD), " userB = ", Integer.valueOf(iD2));
        kyn kynVarD = kyn.d(context);
        int iE = kynVarD.e(0, iD, 0);
        int iE2 = kynVarD.e(0, iD2, 0);
        LogUtil.a("HiH_HiAccountSwitch", "copyHealthData statClientA = ", Integer.valueOf(iE), ",statClientB = ", Integer.valueOf(iE2));
        b bVar = new b();
        bVar.e(context);
        bVar.a(iD2);
        bVar.a(z);
        e(bVar, iE, iE2, 2000);
        List<Integer> listC = kyj.c().c(iD);
        LogUtil.a("HiH_HiAccountSwitch", "copyHealthData clientsA = ", listC);
        if (HiCommonUtil.b(listC)) {
            LogUtil.j("HiH_HiAccountSwitch", "copyHealthData clientsA is null");
            HiHealthManager.d(context).initHiHealth(null);
            return 3;
        }
        a(context, listC, iD2, z);
        c(context, listC, iD2);
        f39506b.clear();
        LogUtil.a("HiH_HiAccountSwitch", "copyHealthData totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        HiHealthManager.d(context).initHiHealth(null);
        return 0;
    }

    private static void c(Context context, List<Integer> list, int i) {
        LogUtil.a("HiH_HiAccountSwitch", "Start to doCopySampleConfig");
        List<HiSampleConfig> listA = SampleConfigManager.e().a(list);
        if (HiCommonUtil.b(listA)) {
            LogUtil.j("HiH_HiAccountSwitch", "hiSampleConfigs is Empty");
            return;
        }
        LogUtil.a("HiH_HiAccountSwitch", "hiSampleConfigs size=", Integer.valueOf(listA.size()));
        for (HiSampleConfig hiSampleConfig : listA) {
            HiSampleConfig hiSampleConfigC = hiSampleConfig.toBuilder().d(b(context, hiSampleConfig.getClientId(), i)).c();
            SampleConfigManager.e().d(i, hiSampleConfigC);
            if (f39507c.contains(hiSampleConfigC.getConfigId())) {
                liz.a().a(103, hiSampleConfigC.getConfigId(), new kym(context.getPackageName()));
            }
        }
        LogUtil.a("HiH_HiAccountSwitch", "end to doCopySampleConfig");
    }

    private static void a(Context context, List<Integer> list, int i, boolean z) {
        b bVar = new b();
        bVar.e(context);
        bVar.a(z);
        bVar.a(i);
        a(bVar, 5, list, 2000, false);
        a(bVar, 1, list, 2000, false);
        a(bVar, 2, list, 2000, true);
        a(bVar, 3, list, 10, true);
        a(bVar, 4, list, 2000, true);
        a(bVar, 6, list, 2000, true);
        a(bVar, 7, list, 2000, false);
    }

    private static void c(Context context, int i, int i2) {
        kxq kxqVarC = kxq.c();
        kxqVarC.a(kxqVarC.c(i), i2, 0);
        d(context, i, i2);
        a(context, i, i2);
    }

    private static List<HiUserPreference> e(List<HiUserPreference> list, List<HiUserPreference> list2) {
        HashMap map = new HashMap();
        for (HiUserPreference hiUserPreference : list) {
            map.put(hiUserPreference.getKey(), hiUserPreference);
        }
        for (HiUserPreference hiUserPreference2 : list2) {
            String key = hiUserPreference2.getKey();
            if (!map.containsKey(key)) {
                map.put(key, hiUserPreference2);
            } else {
                if (hiUserPreference2.getModifiedTime() > ((HiUserPreference) map.get(key)).getModifiedTime() || hiUserPreference2.getKey().equals("custom.blood.oxygen.switch")) {
                    map.put(key, hiUserPreference2);
                }
            }
        }
        return new ArrayList(map.values());
    }

    private static void a(Context context, int i, int i2) {
        kxs kxsVarC = kxs.c(context);
        List<HiUserPreference> listD = kxsVarC.d(i2);
        List<HiUserPreference> listD2 = kxsVarC.d(i);
        if (listD2 == null || listD2.isEmpty()) {
            return;
        }
        List<HiUserPreference> listE = e(listD2, listD);
        HiBroadcastUtil.c(context);
        for (HiUserPreference hiUserPreference : listE) {
            hiUserPreference.setUserId(i2);
            hiUserPreference.setSyncStatus(0);
            kxsVarC.b(hiUserPreference);
        }
    }

    private static void d(Context context, int i, int i2) {
        kxa kxaVarE = kxa.e();
        List<HiGoalInfo> listE = kxaVarE.e(i);
        if (njy.e(listE)) {
            return;
        }
        for (HiGoalInfo hiGoalInfo : listE) {
            hiGoalInfo.setOwnerId(i2);
            kxaVarE.e(hiGoalInfo, 0);
        }
    }

    private static void e(b bVar, int i, int i2, int i3) {
        Context contextB = bVar.b();
        int iA = bVar.a();
        boolean zE = bVar.e();
        LogUtil.a("HiH_HiAccountSwitch", "copyStatData statClientA = ", Integer.valueOf(i), " userB = ", Integer.valueOf(iA), " statClientB = ", Integer.valueOf(i2), " count = ", Integer.valueOf(i3));
        long jCurrentTimeMillis = System.currentTimeMillis();
        kww kwwVarC = kww.c(contextB);
        kwz kwzVarD = kwz.d();
        lfz lfzVarD = lfz.d(contextB);
        int i4 = 0;
        while (true) {
            List<kuk> listA = kwwVarC.a(i, 1, i4, i3);
            List<kuk> listA2 = kwzVarD.a(i, 1, i4, i3);
            if (listA != null) {
                listA.addAll(listA2);
            } else {
                listA = listA2;
            }
            a(listA, iA, i2, zE);
            lfzVarD.transferHealthStatData(listA);
            if (listA == null || listA.size() < i3) {
                break;
            } else {
                i4 += i3;
            }
        }
        LogUtil.j("HiH_HiAccountSwitch", "copyStatData dayStatTables is null anchor = ", Integer.valueOf(i4), " count = ", Integer.valueOf(i3));
        LogUtil.a("HiH_HiAccountSwitch", "copyStatData totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private static void a(b bVar, int i, List<Integer> list, int i2, boolean z) {
        Context contextB = bVar.b();
        int iA = bVar.a();
        boolean zE = bVar.e();
        LogUtil.a("HiH_HiAccountSwitch", "copyDataFromOnTable table = ", Integer.valueOf(i), ",clientsA = ", list, ",userB = ", Integer.valueOf(iA), ",count = ", Integer.valueOf(i2), ",isRealTime = ", Boolean.valueOf(z));
        long jCurrentTimeMillis = System.currentTimeMillis();
        lfz lfzVarD = lfz.d(contextB);
        int i3 = 0;
        while (true) {
            List<HiHealthData> listC = c(contextB, i, list, i3, i2);
            b(contextB, listC, iA, zE);
            lfzVarD.transferHealthDetailData(listC, iA);
            if (z) {
                lfzVarD.prepareRealTimeHealthDataStat(listC);
            }
            if (listC == null || listC.size() < i2) {
                break;
            } else {
                i3 += i2;
            }
        }
        LogUtil.j("HiH_HiAccountSwitch", "copyDataFromOnTable copy health data from A to B data is null table = ", Integer.valueOf(i), ",anchor = ", Integer.valueOf(i3), ",count = ", Integer.valueOf(i2));
        if (z) {
            lfzVarD.doRealTimeHealthDataStat();
        }
        ReleaseLogUtil.d("HiH_HiAccountSwitch", "copyDataFromOnTable table = ", Integer.valueOf(i), ",totalTime = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    private static void b(Context context, List<HiHealthData> list, int i, boolean z) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("HiH_HiAccountSwitch", "setDataSource dataList is null or empty");
            return;
        }
        for (HiHealthData hiHealthData : list) {
            int iB = b(context, hiHealthData.getClientId(), i);
            if (iB > 0) {
                hiHealthData.setClientId(iB);
                hiHealthData.setUserId(i);
                if (!z) {
                    hiHealthData.setSyncStatus(0);
                }
            }
        }
    }

    private static void a(List<kuk> list, int i, int i2, boolean z) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("HiH_HiAccountSwitch", "setStatSource tableList is null or empty");
            return;
        }
        for (kuk kukVar : list) {
            kukVar.e(kukVar, i, i2, z);
        }
    }

    private static int b(Context context, int i, int i2) {
        int i3 = f39506b.get(i);
        if (i3 > 0) {
            return i3;
        }
        kym kymVarJ = kwt.b().j(i);
        if (kymVarJ == null) {
            LogUtil.j("HiH_HiAccountSwitch", "getClientB hiHealthContext = null, clientA = ", Integer.valueOf(i));
            return 0;
        }
        int iE = kyn.d(context).e(kymVarJ.b(), i2, kymVarJ.d());
        f39506b.append(i, iE);
        LogUtil.d("HiH_HiAccountSwitch", "getClientB 2 clientA = ", Integer.valueOf(i), ", userB = ", Integer.valueOf(i2), ",clientB = ", Integer.valueOf(iE));
        return iE;
    }

    private static List<HiHealthData> c(Context context, int i, List<Integer> list, int i2, int i3) {
        switch (i) {
            case 1:
                return kwq.e(context).a(list, 1, i2, i3);
            case 2:
                return kwv.e(context).a(list, 1, i2, i3);
            case 3:
                return kws.e(context).b(list, 1, i2, i3);
            case 4:
                return kxg.c(context).c(list, 1, i2, i3);
            case 5:
                List<HiHealthData> listD = kxe.d(context).d(list, 1, i2, i3);
                listD.addAll(kxc.c().d(list, 1, i2, i3));
                return listD;
            case 6:
                return kwu.c(context).d(list, 1, i2, i3);
            case 7:
                return kxd.e(context).b(list, 1, i2, i3);
            default:
                return null;
        }
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f39508b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f39509c;
        private Context d;

        private b() {
        }

        public Context b() {
            return this.d;
        }

        public void e(Context context) {
            this.d = context;
        }

        public int a() {
            return this.f39508b;
        }

        public void a(int i) {
            this.f39508b = i;
        }

        public boolean e() {
            return this.f39509c;
        }

        public void a(boolean z) {
            this.f39509c = z;
        }
    }
}
