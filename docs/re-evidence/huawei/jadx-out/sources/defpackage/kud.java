package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiGoalInfo;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.auth.HiUserAuth;
import com.huawei.hihealthservice.store.interfaces.IUserData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class kud implements IUserData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Context f39495a = BaseApplication.getContext();
    private static Map<Map<Integer, String>, HiAccountInfo> d = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kwg f39497c;
    String e;
    private kxq i;

    private kud() {
        this.f39496b = "";
        this.e = "";
        this.i = kxq.c();
        this.f39497c = kwg.b();
        this.f39496b = d();
    }

    public static kud a() {
        return e.e;
    }

    static class e {
        private static final kud e = new kud();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    @Override // com.huawei.hihealthservice.store.interfaces.IUserData
    public long setUserData(HiUserInfo hiUserInfo, kym kymVar) throws Throwable {
        boolean zB;
        LogUtil.a("HiH_HiUserDataStore", "saveUserData, user:");
        if (hiUserInfo == null) {
            ReleaseLogUtil.e("HiH_HiUserDataStore", "saveUserData userInfo is null");
            return 0L;
        }
        try {
            try {
                Context context = f39495a;
                zB = !ljq.h(context, 0) ? ljq.b(context, 0) : false;
                try {
                    long jC = c(hiUserInfo, kymVar);
                    if (zB) {
                        ljq.g(context, 0);
                    }
                    if (zB) {
                        ljq.c(context, 0);
                    }
                    if (jC > 0) {
                        b(kymVar, hiUserInfo.getHuid());
                    }
                    return jC;
                } catch (Exception e2) {
                    e = e2;
                    ReleaseLogUtil.a("HiH_HiUserDataStore", "Error to insertBatchList,cause:" + e.getMessage());
                    if (zB) {
                        ljq.c(f39495a, 0);
                    }
                    return 0L;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    ljq.c(f39495a, 0);
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                ljq.c(f39495a, 0);
            }
            throw th;
        }
    }

    private long c(HiUserInfo hiUserInfo, kym kymVar) {
        int iB = kymVar.b();
        String huid = hiUserInfo.getHuid();
        if (huid == null) {
            huid = this.f39497c.d(iB);
        }
        if (huid == null) {
            ReleaseLogUtil.e("HiH_HiUserDataStore", "saveUserData huid is null");
            return 0L;
        }
        int iD = this.i.d(huid, 0);
        if (iD <= 0) {
            ReleaseLogUtil.e("HiH_HiUserDataStore", "saveUserData the main userInfo is not right");
            return 0L;
        }
        hiUserInfo.setHuid(huid);
        if (hiUserInfo.getRelateType() <= 0) {
            hiUserInfo.setRelateType(0);
            if (hiUserInfo.getModifiedIntent() == 268435456 || hiUserInfo.getCreateTime() == 1) {
                LogUtil.d("HiH_HiUserDataStore", "saveUserData before:", Integer.valueOf(hiUserInfo.getBirthday()), " ", Integer.valueOf(hiUserInfo.getGender()), " ", Integer.valueOf(hiUserInfo.getHeight()), " ", Float.valueOf(hiUserInfo.getWeight()), " ", Integer.valueOf(hiUserInfo.getUnitType()));
                int iE = this.i.e(hiUserInfo, iD);
                HiUserInfo hiUserInfoA = this.i.a(huid, 0);
                if (hiUserInfoA != null) {
                    LogUtil.d("HiH_HiUserDataStore", "saveUserData after:", Integer.valueOf(hiUserInfoA.getBirthday()), " ", Integer.valueOf(hiUserInfoA.getGender()), " ", Integer.valueOf(hiUserInfoA.getHeight()), " ", Float.valueOf(hiUserInfoA.getWeight()), " ", Integer.valueOf(hiUserInfoA.getUnitType()));
                }
                return iE;
            }
            LogUtil.d("HiH_HiUserDataStore", "updateUserInfo saveUserData before:", Integer.valueOf(hiUserInfo.getBirthday()), " ", Integer.valueOf(hiUserInfo.getGender()), " ", Integer.valueOf(hiUserInfo.getHeight()), " ", Float.valueOf(hiUserInfo.getWeight()), " ", Integer.valueOf(hiUserInfo.getUnitType()));
            return this.i.e(hiUserInfo, iD, 0);
        }
        return c(hiUserInfo, iD, huid, kymVar.j());
    }

    private long c(HiUserInfo hiUserInfo, int i, String str, String str2) {
        int ownerId = hiUserInfo.getOwnerId();
        if (i == ownerId) {
            return 0L;
        }
        if (str.equals(str2)) {
            LogUtil.j("HiH_HiUserDataStore", "subUserInfoInsertOrUpdate the default account should not creat userInfo");
            return 0L;
        }
        if (ownerId <= 0) {
            return this.i.c(hiUserInfo, 0);
        }
        HiUserInfo hiUserInfoC = this.i.c(ownerId);
        if (hiUserInfoC != null && hiUserInfoC.getRelateType() == hiUserInfo.getRelateType() && str.equals(hiUserInfoC.getHuid())) {
            return this.i.e(hiUserInfo, ownerId, 0);
        }
        return 0L;
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IUserData
    public List<HiUserInfo> fetchUserData(int i) {
        String strD = this.f39497c.d(i);
        if (strD == null) {
            return null;
        }
        return this.i.d(strD);
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IUserData
    public boolean hiLogin(HiAccountInfo hiAccountInfo, kym kymVar) {
        return b(hiAccountInfo, kymVar);
    }

    private boolean b(HiAccountInfo hiAccountInfo, kym kymVar) throws Throwable {
        LogUtil.a("HiH_HiUserDataStore", "hiLogin accountInfo = ", hiAccountInfo);
        int iB = kymVar.b();
        String strD = this.f39497c.d(iB);
        String huid = hiAccountInfo.getHuid();
        String strJ = kymVar.j();
        if (!strJ.equals(huid) && strJ.equals(HuaweiHealth.c())) {
            ljl.a(f39495a).c(huid);
        }
        if (huid.equals(strD)) {
            LogUtil.a("HiH_HiUserDataStore", "hiLogin huid is already login huid = ", huid);
            return true;
        }
        hiAccountInfo.setAppId(iB);
        hiAccountInfo.setLogin(1);
        int iD = this.i.d(strD, 0);
        LogUtil.a("HiH_HiUserDataStore", "hiLogin oldHuid = ", strD, ",oldUserID = ", Integer.valueOf(iD));
        this.f39497c.c(iB);
        boolean zA = this.f39497c.a(hiAccountInfo);
        int iD2 = this.i.d(huid, 0);
        if (iD2 <= 0) {
            HiUserInfo hiUserInfo = new HiUserInfo();
            hiUserInfo.setHuid(huid);
            hiUserInfo.setRelateType(0);
            hiUserInfo.setCreateTime(1L);
            iD2 = (int) this.i.c(hiUserInfo, 0);
        }
        ReleaseLogUtil.d("HiH_HiUserDataStore", "hiLogin isInsert = ", Boolean.valueOf(zA), ",newUser = ", Integer.valueOf(iD2), ",oldUser = ", Integer.valueOf(iD), ",hiHealthContext = ", HiJsonUtil.d(kymVar));
        if (HuaweiHealth.c().equals(strJ)) {
            kuh.d(iB, iD, iD2);
            a().b(strD);
            a().d(huid);
            kzw.c().b(strD);
            kzw.c().c(huid);
        }
        Context context = f39495a;
        HiBroadcastUtil.a(context, 0);
        HiBroadcastUtil.e(context, 0);
        HiBroadcastUtil.h(context);
        liz.a().a(200, "hiLogin", kymVar);
        liz.a().a(102, "hiLogin", kymVar);
        HiBroadcastUtil.b(context, 7);
        return zA;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    @Override // com.huawei.hihealthservice.store.interfaces.IUserData
    public int hiLogout(kym kymVar) throws Throwable {
        boolean zB;
        try {
            Context context = f39495a;
            zB = !ljq.h(context, 0) ? ljq.b(context, 0) : false;
            try {
                try {
                    int iC = c(kymVar);
                    if (zB) {
                        ljq.g(context, 0);
                    }
                    if (zB) {
                        ljq.c(context, 0);
                    }
                    return iC;
                } catch (Exception e2) {
                    e = e2;
                    ReleaseLogUtil.a("HiH_HiUserDataStore", "Error to insertBatchList,cause:" + e.getMessage());
                    if (zB) {
                        ljq.c(f39495a, 0);
                    }
                    return 0;
                }
            } catch (Throwable th) {
                th = th;
                if (zB) {
                    ljq.c(f39495a, 0);
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            zB = false;
            if (zB) {
                ljq.c(f39495a, 0);
            }
            throw th;
        }
    }

    private int c(kym kymVar) throws Throwable {
        LogUtil.a("HiH_HiUserDataStore", "hiLogout healthContext = ", kymVar);
        int iB = kymVar.b();
        String strJ = kymVar.j();
        String strD = this.f39497c.d(iB);
        if (strJ.equals(strD)) {
            LogUtil.j("HiH_HiUserDataStore", "hiLogout old who = ", strJ);
            return 0;
        }
        int iD = this.i.d(strD, 0);
        LogUtil.a("HiH_HiUserDataStore", "hiLogout oldwho = ", Integer.valueOf(iD));
        int iC = this.f39497c.c(iB);
        a(kymVar);
        int iD2 = this.i.d(kymVar.j(), 0);
        LogUtil.a("HiH_HiUserDataStore", "hiLogout result = ", Integer.valueOf(iC), ",newUser = ", Integer.valueOf(iD2), ",oldUser = ", Integer.valueOf(iD), ",packageName = ", strJ);
        if (HuaweiHealth.c().equals(strJ)) {
            kuh.d(iB, iD, iD2);
        }
        Context context = f39495a;
        HiBroadcastUtil.a(context, 1);
        HiBroadcastUtil.e(context, 0);
        HiBroadcastUtil.h(context);
        liz.a().a(200, "hiLogout", kymVar);
        return iC;
    }

    private void a(kym kymVar) throws Throwable {
        LogUtil.a("HiH_HiUserDataStore", "loginDefaultAccount");
        int iB = kymVar.b();
        if (iB <= 0) {
            return;
        }
        String strJ = kymVar.j();
        HiAccountInfo hiAccountInfo = new HiAccountInfo();
        hiAccountInfo.setLogin(1);
        hiAccountInfo.setAppId(iB);
        hiAccountInfo.setHuid(strJ);
        this.f39497c.a(hiAccountInfo);
        if (this.i.d(strJ, 0) <= 0) {
            HiUserInfo hiUserInfo = new HiUserInfo();
            hiUserInfo.setHuid(hiAccountInfo.getHuid());
            hiUserInfo.setRelateType(0);
            hiUserInfo.setCreateTime(1L);
            this.i.c(hiUserInfo, 0);
        }
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IUserData
    public HiAccountInfo fetchAccountInfo(kym kymVar) {
        HiAccountInfo hiAccountInfoB = this.f39497c.b(kymVar.b());
        if (hiAccountInfoB != null) {
            return hiAccountInfoB;
        }
        LogUtil.j("HiH_HiUserDataStore", "fetchAccountInfo accountInfo is null");
        return null;
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IUserData
    public boolean setGoalInfo(int i, int i2, HiGoalInfo hiGoalInfo) {
        if (hiGoalInfo == null) {
            LogUtil.j("HiH_HiUserDataStore", "setGoalInfo goalInfo is null");
            return false;
        }
        if (hiGoalInfo.getGoalType() == 0) {
            LogUtil.j("HiH_HiUserDataStore", "setGoalInfo the HiGoalType.GOAL_ALL_READ will not insert or update");
            return false;
        }
        if (i <= 0) {
            int iC = kxi.c(f39495a, i2);
            if (iC <= 0) {
                LogUtil.j("HiH_HiUserDataStore", "setGoalInfo userId <= 0");
                return false;
            }
            hiGoalInfo.setOwnerId(iC);
            return kxa.e().b(hiGoalInfo, 0);
        }
        if (!kxi.a(i, i2, f39495a)) {
            return false;
        }
        hiGoalInfo.setOwnerId(i);
        return kxa.e().b(hiGoalInfo, 0);
    }

    @Override // com.huawei.hihealthservice.store.interfaces.IUserData
    public List<HiGoalInfo> getGoalInfo(int i, int i2, int i3) {
        if (i <= 0 && (i = kxi.c(f39495a, i3)) <= 0) {
            LogUtil.j("HiH_HiUserDataStore", "getGoalInfo userId <= 0");
            return null;
        }
        if (!kxi.c(i, i3, f39495a)) {
            return null;
        }
        if (i2 == 0) {
            return kxa.e().e(i);
        }
        return kxa.e().b(i, i2);
    }

    private void b(kym kymVar, String str) {
        int iB = kymVar.b();
        int iD = this.i.d(str, 0);
        LogUtil.a("HiH_HiUserDataStore", "start uploadUserToCloud");
        HiUserInfo hiUserInfoA = this.i.a(str, 0);
        if (hiUserInfoA == null) {
            ReleaseLogUtil.a("HiH_HiUserDataStore", "the userInfo is null");
            return;
        }
        if (hiUserInfoA.getRelateType() != 0 || hiUserInfoA.getModifiedIntent() == 268435456 || hiUserInfoA.getCreateTime() == 1) {
            return;
        }
        LogUtil.a("HiH_HiUserDataStore", "updateUserInfo saveUserData setIfUserFirstSync false");
        lgp.f().a(Integer.toString(iD), false);
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(10005);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setUserInfo(hiUserInfoA);
        lgp.f().e(hiSyncOption, iB);
    }

    public void e(String str) {
        this.e = str;
    }

    public void c(String str, String str2, HiAccountInfo hiAccountInfo, HiUserAuth hiUserAuth, kym kymVar) throws Throwable {
        hiAccountInfo.setHuid(str2);
        hiAccountInfo.setAccessToken(str);
        hiAccountInfo.setThirdOpenId(hiUserAuth.getOpenId());
        hiAccountInfo.setExpiresIn((CommonUtil.i(hiUserAuth.getExpireIn()) * 1000) + System.currentTimeMillis());
        hiAccountInfo.setLogin(1);
        int iB = kymVar.b();
        hiAccountInfo.setAppId(iB);
        this.f39497c.a(hiAccountInfo);
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Integer.valueOf(iB), str2);
        d.put(arrayMap, hiAccountInfo);
        LogUtil.d("HiH_HiUserDataStore", "requestAuthorization updateAccountInfo accountInfo = ", Integer.valueOf(hiAccountInfo.getAppId()));
    }

    public void b() {
        Map<Map<Integer, String>, HiAccountInfo> map = d;
        if (map != null) {
            map.clear();
        }
    }

    public int a(int i) throws Throwable {
        String strD = d();
        if (HiCommonUtil.a(strD)) {
            LogUtil.j("HiH_HiUserDataStore", "who is null or empty");
            return 24;
        }
        ArrayMap arrayMap = new ArrayMap(16);
        arrayMap.put(Integer.valueOf(i), strD);
        if (this.f39496b.equals(strD)) {
            HiAccountInfo hiAccountInfo = d.get(arrayMap);
            if (hiAccountInfo == null) {
                return 15;
            }
            LogUtil.d("HiH_HiUserDataStore", "checkHuidAndAccessTokenValidTimeSync appID = ", Integer.valueOf(i));
            if (i == hiAccountInfo.getAppId() && this.e.equals(hiAccountInfo.getAccessToken())) {
                long expiresIn = hiAccountInfo.getExpiresIn();
                LogUtil.d("HiH_HiUserDataStore", "atValidTime expire_in = ", Long.valueOf(expiresIn), " appID = ", Integer.valueOf(i));
                if (System.currentTimeMillis() > expiresIn) {
                    LogUtil.d("HiH_HiUserDataStore", "accessToken is invalid, expire_in = ", Long.valueOf(expiresIn), " appID = ", Integer.valueOf(i));
                    return 23;
                }
            }
        } else {
            LogUtil.d("HiH_HiUserDataStore", "checkhuidAndAT previousWho");
            arrayMap.put(Integer.valueOf(i), this.f39496b);
            HiAccountInfo hiAccountInfo2 = d.get(arrayMap);
            if (hiAccountInfo2 != null) {
                hiAccountInfo2.setLogin(0);
                d.put(arrayMap, hiAccountInfo2);
            }
            HiAccountInfo hiAccountInfoB = this.f39497c.b(i, this.f39496b);
            if (hiAccountInfoB != null) {
                hiAccountInfoB.setLogin(0);
                this.f39497c.a(hiAccountInfoB);
                b(i, strD, arrayMap);
                this.f39496b = strD;
            } else {
                LogUtil.d("HiH_HiUserDataStore", "checkhuidAndAT errorAccountInfo is null");
                return 15;
            }
        }
        return 0;
    }

    private void b(int i, String str, Map<Integer, String> map) throws Throwable {
        map.put(Integer.valueOf(i), str);
        HiAccountInfo hiAccountInfo = d.get(map);
        if (hiAccountInfo != null) {
            hiAccountInfo.setLogin(1);
            d.put(map, hiAccountInfo);
        }
        HiAccountInfo hiAccountInfoB = this.f39497c.b(i, str);
        if (hiAccountInfoB != null) {
            hiAccountInfoB.setLogin(1);
            this.f39497c.a(hiAccountInfoB);
        }
    }

    public int e() {
        return kxq.c().d(a().d(), 0);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    public HiAccountInfo e(String str, kym kymVar) throws Throwable {
        boolean zB;
        int iB = kymVar.b();
        ArrayMap arrayMap = new ArrayMap(16);
        arrayMap.put(Integer.valueOf(iB), str);
        HiAccountInfo hiAccountInfo = new HiAccountInfo();
        if (this.f39496b.equals(str)) {
            HiAccountInfo hiAccountInfoD = d(str, iB, arrayMap);
            LogUtil.d("HiH_HiUserDataStore", "requestAuthorization getCurrentAccountInfo mCurrentHuid = huid, accountInfo = ", hiAccountInfoD, " at valid time is ", Long.valueOf(hiAccountInfoD.getExpiresIn()));
            return hiAccountInfoD;
        }
        try {
            LogUtil.a("HiH_HiUserDataStore", "insertOrUpdateAccountInfo");
            Context context = f39495a;
            zB = !ljq.h(context, 0) ? ljq.b(context, 0) : false;
            try {
                try {
                    hiAccountInfo = this.f39497c.b(iB, this.f39496b);
                    if (hiAccountInfo != null) {
                        hiAccountInfo.setLogin(0);
                        this.f39497c.a(hiAccountInfo);
                    }
                    HiAccountInfo hiAccountInfoD2 = d(str, iB, arrayMap);
                    try {
                        this.f39496b = str;
                        LogUtil.d("HiH_HiUserDataStore", "requestAuthorization getCurrentAccountInfo accountInfo = ", Integer.valueOf(hiAccountInfoD2.getAppId()), " at valid time is ", Long.valueOf(hiAccountInfoD2.getExpiresIn()));
                        if (zB) {
                            ljq.g(context, 0);
                        }
                        if (zB) {
                            ljq.c(context, 0);
                        }
                        return hiAccountInfoD2;
                    } catch (Exception e2) {
                        e = e2;
                        hiAccountInfo = hiAccountInfoD2;
                        ReleaseLogUtil.e("HiH_HiUserDataStore", "getCurrentAccountInfo: ", LogAnonymous.b(e));
                        if (zB) {
                            ljq.c(f39495a, 0);
                        }
                        return hiAccountInfo;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Throwable th) {
                th = th;
                if (zB) {
                    ljq.c(f39495a, 0);
                }
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            zB = false;
            if (zB) {
                ljq.c(f39495a, 0);
            }
            throw th;
        }
    }

    private HiAccountInfo d(String str, int i, Map<Integer, String> map) {
        HiAccountInfo hiAccountInfoB = d.get(map);
        if (hiAccountInfoB == null) {
            LogUtil.d("HiH_HiUserDataStore", "requestAuthorization getHiAccountInfo not in cache ");
            hiAccountInfoB = this.f39497c.b(i, str);
            if (hiAccountInfoB == null) {
                hiAccountInfoB = new HiAccountInfo();
            }
        }
        LogUtil.d("HiH_HiUserDataStore", "requestAuthorization getHiAccountInfo accountInfo is ", Integer.valueOf(hiAccountInfoB.getAppId()));
        return hiAccountInfoB;
    }

    public String d() {
        if (this.f39497c == null) {
            return "";
        }
        String strJ = j();
        if (!HiCommonUtil.a(strJ)) {
            LogUtil.d("HiH_HiUserDataStore", "getStringHuid() from cache");
            return strJ;
        }
        int iC = c();
        String strD = this.f39497c.d(iC);
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Integer.valueOf(iC), strD);
        HiAccountInfo hiAccountInfoB = this.f39497c.b(iC, strD);
        if (hiAccountInfoB != null) {
            hiAccountInfoB.setLogin(1);
            d.put(arrayMap, hiAccountInfoB);
            LogUtil.d("HiH_HiUserDataStore", "getStringHuid() from DB");
        }
        return strD;
    }

    private String j() {
        for (Map.Entry<Map<Integer, String>, HiAccountInfo> entry : d.entrySet()) {
            if (entry.getValue().getIsLogin() == 1 && entry.getValue().getAppId() == c()) {
                return entry.getValue().getHuid();
            }
        }
        return null;
    }

    public int c() {
        Integer num = kxz.e().get(HuaweiHealth.c());
        if (num != null) {
            return num.intValue();
        }
        int iC = c(HuaweiHealth.c());
        kxz.e().put(HuaweiHealth.c(), Integer.valueOf(iC));
        return iC;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    public int c(String str) throws Throwable {
        boolean zB;
        int iB = kwi.b().b(str);
        if (iB > 0) {
            return iB;
        }
        try {
            Context context = f39495a;
            zB = !ljq.h(context, 0) ? ljq.b(context, 0) : false;
            try {
                try {
                    int iA = a(str);
                    if (zB && iA > 0) {
                        ljq.g(context, 0);
                    }
                    if (zB) {
                        ljq.c(context, 0);
                    }
                    return iA;
                } catch (Exception e2) {
                    e = e2;
                    ReleaseLogUtil.e("HiH_HiUserDataStore", "queryOrCreateAppId: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(f39495a, 0);
                    }
                    return 0;
                }
            } catch (Throwable th) {
                th = th;
                if (zB) {
                    ljq.c(f39495a, 0);
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            zB = false;
            if (zB) {
                ljq.c(f39495a, 0);
            }
            throw th;
        }
    }

    public int a(String str) {
        int iB = kwi.b().b(str);
        if (iB > 0) {
            return iB;
        }
        HiAppInfo hiAppInfoD = ljp.d(f39495a, str);
        LogUtil.a("HiH_HiUserDataStore", "queryOrCreateAppId() app <= 0, appInfo = ", hiAppInfoD);
        return (int) kwi.b().d(hiAppInfoD, 0);
    }

    public void d(String str) {
        if (HiCommonUtil.a(str)) {
            return;
        }
        for (Map.Entry<Map<Integer, String>, HiAccountInfo> entry : d.entrySet()) {
            HiAccountInfo value = entry.getValue();
            if (str.equals(value.getHuid())) {
                value.setLogin(1);
                d.put(entry.getKey(), value);
            }
        }
    }

    public void b(String str) {
        if (HiCommonUtil.a(str)) {
            return;
        }
        for (Map.Entry<Map<Integer, String>, HiAccountInfo> entry : d.entrySet()) {
            HiAccountInfo value = entry.getValue();
            if (str.equals(value.getHuid())) {
                value.setLogin(0);
                d.put(entry.getKey(), value);
            }
        }
    }
}
