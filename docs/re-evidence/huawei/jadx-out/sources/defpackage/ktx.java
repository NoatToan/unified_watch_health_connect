package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealthservice.auth.HiAuthorization;
import com.huawei.hihealthservice.auth.HiUserAuth;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.LogAnonymous;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.utils.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes10.dex */
public class ktx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Context f39476b = BaseApplication.getContext();
    private kwi d;

    private ktx() {
        this.d = kwi.b();
    }

    static class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final ktx f39480c = new ktx();
    }

    public static ktx c() {
        return a.f39480c;
    }

    void d(String str, HiAuthorization hiAuthorization, String str2) {
        String certFingerprint = hiAuthorization.getCertFingerprint();
        HiAppInfo hiAppInfoD = ljp.d(f39476b, str2);
        hiAppInfoD.setCloudCode(CommonUtil.i(str));
        hiAppInfoD.setSignature(certFingerprint);
        this.d.d(hiAppInfoD);
    }

    void a(String str, List<kum> list, HiUserAuth hiUserAuth, kym kymVar) {
        int iD = kxq.c().d(str, 0);
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        kya kyaVarA = kya.a();
        for (kum kumVar : list) {
            kxh.d().e(kumVar);
            int iD2 = kxh.d().d(kumVar.b());
            kui kuiVar = new kui();
            kuiVar.a(kymVar.b());
            kuiVar.c(iD);
            int iA = lcm.a(kumVar.g(), hiUserAuth);
            kuiVar.d(iA);
            kuiVar.b(kumVar);
            kuiVar.b(iD2);
            arrayList.add(kuiVar);
            if (iA == 1) {
                arrayList2.add(kuiVar);
            }
        }
        kyaVarA.c(kymVar.b(), iD, arrayList2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kwp.e().c((kui) it.next());
        }
    }

    int d() throws RemoteException {
        return d(ljp.e(f39476b));
    }

    int d(String str) throws Throwable {
        Integer num = kxz.e().get(str);
        if (num != null) {
            return num.intValue();
        }
        int i = i(str);
        if (i <= 0) {
            LogUtil.j("HiH_HiHealthBinderHelper", "initAppId() app <= 0 packageName = ", str, ",app = ", Integer.valueOf(i));
            throw new RemoteException("initAppId() app <= 0 packageName = " + str + ",app = " + i);
        }
        kxz.e().put(str, Integer.valueOf(i));
        return i;
    }

    kym a() throws RemoteException {
        return c(ljp.e(f39476b));
    }

    kym c(String str) throws RemoteException {
        if (a(str) == 0) {
            LogUtil.a("HiH_HiHealthBinderHelper", "getAppContext() isAppValid health or wear, packageName = ", str);
            return new kym(d(str), str);
        }
        return new kym(b(), str);
    }

    kym a(String str, int i) {
        return new kym(i, str);
    }

    int e() {
        return a(ljp.e(f39476b));
    }

    int a(String str) {
        if (ljp.b(f39476b, str)) {
            if (!HuaweiHealth.c().equals(str) && !"com.huawei.bone".equals(str)) {
                return 1;
            }
            LogUtil.d("HiH_HiHealthBinderHelper", "getAppType() isAppValid true needn't to Auth, packageName = ", str);
            return 0;
        }
        LogUtil.d("HiH_HiHealthBinderHelper", "getAppType() is thirdParty, packageName = ", str);
        return -1;
    }

    int b() throws RemoteException {
        return h(ljp.e(f39476b));
    }

    int b(String str) throws RemoteException {
        return h(str);
    }

    int e(String str) throws RemoteException {
        if (!Utils.h()) {
            return d(str);
        }
        return h(ljp.c(f39476b, str));
    }

    public boolean j() {
        return Utils.h();
    }

    boolean g() {
        return Utils.o();
    }

    private int h(String str) throws Throwable {
        int iC;
        Integer num = kxz.e().get(str);
        if (num != null) {
            return num.intValue();
        }
        if (HuaweiHealth.c().equals(str)) {
            iC = i(str);
        } else {
            iC = kud.a().c(str);
        }
        LogUtil.d("HiH_HiHealthBinderHelper", "initCurrentAppId() app = ", Integer.valueOf(iC), ", packageName = ", str);
        if (iC <= 0) {
            LogUtil.j("HiH_HiHealthBinderHelper", "initCurrentAppId() app <= 0 packageName = ", str, ",app = ", Integer.valueOf(iC));
            throw new RemoteException("initCurrentAppId() app <= 0 packageName = " + str + ",app = " + iC);
        }
        kxz.e().put(str, Integer.valueOf(iC));
        return iC;
    }

    public int d(HiAppInfo hiAppInfo) throws Throwable {
        if (hiAppInfo == null || StringUtils.g(hiAppInfo.getPackageName())) {
            ReleaseLogUtil.a("HiH_HiHealthBinderHelper", "failed to getOrInsertAppInfo, cause: hiAppInfo or PackageName is empty");
            return 0;
        }
        String packageName = hiAppInfo.getPackageName();
        Integer num = kxz.e().get(packageName);
        if (num != null) {
            return num.intValue();
        }
        int iB = this.d.b(hiAppInfo.getPackageName());
        if (iB <= 0) {
            ReleaseLogUtil.d("HiH_HiHealthBinderHelper", "Start to insertAppInfo, packageName=", hiAppInfo.getPackageName());
            int iC = c(hiAppInfo);
            if (iC <= 0) {
                ReleaseLogUtil.d("HiH_HiHealthBinderHelper", "Failed to insertAppInfo, appIdDb=", Integer.valueOf(iC));
                return iC;
            }
            ReleaseLogUtil.d("HiH_HiHealthBinderHelper", "Success to insertAppInfo, appIdDb=", Integer.valueOf(iC));
            kxz.e().put(packageName, Integer.valueOf(iC));
            return iC;
        }
        ReleaseLogUtil.d("HiH_HiHealthBinderHelper", "getOrInsertAppInfo appId=", Integer.valueOf(iB), ", packageName=", hiAppInfo.getPackageName());
        kxz.e().put(packageName, Integer.valueOf(iB));
        return iB;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    private int c(HiAppInfo hiAppInfo) throws Throwable {
        boolean zB;
        try {
            try {
                zB = !ljq.h(BaseApplication.getContext(), 0) ? ljq.b(BaseApplication.getContext(), 0) : false;
                try {
                    int iB = this.d.b(hiAppInfo.getPackageName());
                    if (iB > 0) {
                        if (zB) {
                            ljq.c(BaseApplication.getContext(), 0);
                        }
                        return iB;
                    }
                    int iD = (int) this.d.d(hiAppInfo, 0);
                    if (zB) {
                        ljq.g(BaseApplication.getContext(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.getContext(), 0);
                    }
                    return iD;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.a("HiH_HiHealthBinderHelper", "Failed to insertAppInfo: ", ExceptionUtils.c(e));
                    if (zB) {
                        ljq.c(BaseApplication.getContext(), 0);
                    }
                    return 0;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    ljq.c(BaseApplication.getContext(), 0);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                ljq.c(BaseApplication.getContext(), 0);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    public int i(String str) throws Throwable {
        boolean zB;
        try {
            zB = !ljq.h(BaseApplication.getContext(), 0) ? ljq.b(BaseApplication.getContext(), 0) : false;
            try {
                try {
                    int iB = this.d.b(str);
                    if (iB <= 0) {
                        HiAppInfo hiAppInfoD = ljp.d(f39476b, str);
                        LogUtil.a("HiH_HiHealthBinderHelper", "initBinder() app <= 0, appInfo = ", hiAppInfoD);
                        iB = (int) this.d.d(hiAppInfoD, 0);
                    }
                    LogUtil.a("HiH_HiHealthBinderHelper", "initBinder() app = ", Integer.valueOf(iB), ", packageName = ", str);
                    if (kwg.b().d(iB) == null) {
                        HiAccountInfo hiAccountInfo = new HiAccountInfo();
                        hiAccountInfo.setAppId(iB);
                        hiAccountInfo.setHuid(str);
                        hiAccountInfo.setLogin(1);
                        kwg.b().a(hiAccountInfo);
                        HiUserInfo hiUserInfo = new HiUserInfo();
                        hiUserInfo.setHuid(str);
                        hiUserInfo.setRelateType(0);
                        hiUserInfo.setCreateTime(1L);
                        LogUtil.a("HiH_HiHealthBinderHelper", "initBinder() who = ", Long.valueOf(kxq.c().c(hiUserInfo, 0)));
                    }
                    if (zB) {
                        ljq.g(BaseApplication.getContext(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.getContext(), 0);
                    }
                    return iB;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.a("HiH_HiHealthBinderHelper", "insertUserInfoSync: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.getContext(), 0);
                    }
                    return 0;
                }
            } catch (Throwable th) {
                th = th;
                if (zB) {
                    ljq.c(BaseApplication.getContext(), 0);
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
                ljq.c(BaseApplication.getContext(), 0);
            }
            throw th;
        }
    }

    void b(final List<HiHealthData> list, final kym kymVar, final lgp lgpVar, ExecutorService executorService) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final int iC = kud.a().c();
        if (executorService.isShutdown()) {
            LogUtil.e("HiH_HiHealthBinderHelper", "startInsertBackground backgroudThread is closed!");
        } else {
            executorService.execute(new Runnable() { // from class: ktx.3
                @Override // java.lang.Runnable
                public void run() {
                    lgpVar.b(iC, list);
                    LogUtil.d("HiH_HiHealthBinderHelper", "startInsertBackground() hiContext = ", kymVar, ", healthAppId is ", Integer.valueOf(iC), ", time = ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                }
            });
        }
    }

    int[] e(List<Integer> list) {
        int[] iArr = new int[list.size()];
        if (!HiCommonUtil.b(list)) {
            for (int i = 0; i < list.size(); i++) {
                iArr[i] = list.get(i).intValue();
            }
        }
        return iArr;
    }

    public boolean f() {
        return HuaweiHealth.c().equals(ljp.e(f39476b));
    }
}
