package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class kwg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kur f39551a;

    private kwg() {
        this.f39551a = kur.d();
    }

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final kwg f39552c = new kwg();
    }

    public static kwg b() {
        return e.f39552c;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    public boolean a(HiAccountInfo hiAccountInfo) throws Throwable {
        boolean zB;
        try {
            LogUtil.a("Debug_AccountInfoManager", "insertOrUpdateAccountInfo");
            zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
            try {
                try {
                    boolean zD = d(hiAccountInfo);
                    if (zB) {
                        ljq.g(BaseApplication.b(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return zD;
                } catch (Exception e2) {
                    e = e2;
                    ReleaseLogUtil.e("Debug_AccountInfoManager", "insertOrUpdateAccountInfo: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                if (zB) {
                    ljq.c(BaseApplication.b(), 0);
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
                ljq.c(BaseApplication.b(), 0);
            }
            throw th;
        }
    }

    private boolean d(HiAccountInfo hiAccountInfo) {
        long jB;
        if (d(hiAccountInfo.getAppId(), hiAccountInfo.getHuid())) {
            jB = c(hiAccountInfo);
        } else {
            jB = b(hiAccountInfo);
        }
        return kwb.b(jB);
    }

    public boolean d(int i, String str) {
        LogUtil.d("Debug_AccountInfoManager", "queryAccountInfoExist");
        if (HiCommonUtil.a(str) || i <= 0) {
            LogUtil.j("Debug_AccountInfoManager", "queryAccountInfoExist parameter is wrong");
            return false;
        }
        return kwf.m(a(i, str));
    }

    private Cursor a(int i, String str) {
        LogUtil.d("Debug_AccountInfoManager", "queryAccountInfo");
        if (HiCommonUtil.a(str) || i <= 0) {
            LogUtil.j("Debug_AccountInfoManager", "queryAccountInfo parameter is wrong!");
            return null;
        }
        return this.f39551a.query("app_id =? and huid =?", new String[]{String.valueOf(i), str}, null, null, null);
    }

    private int c(HiAccountInfo hiAccountInfo) {
        if (hiAccountInfo == null) {
            ReleaseLogUtil.e("Debug_AccountInfoManager", "updateAccountInfo accountInfo is null!");
            return 0;
        }
        String huid = hiAccountInfo.getHuid();
        if (HiCommonUtil.a(huid) || !huid.matches("[a-zA-Z0-9._]+")) {
            ReleaseLogUtil.e("Debug_AccountInfoManager", "updateAccountInfo huid invalid");
            return 0;
        }
        ReleaseLogUtil.d("Debug_AccountInfoManager", "updateAccountInfo to loginStatus: ", Integer.valueOf(hiAccountInfo.getIsLogin()));
        int appId = hiAccountInfo.getAppId();
        ContentValues contentValuesC = kvw.c(hiAccountInfo);
        contentValuesC.remove("create_time");
        return this.f39551a.update(contentValuesC, "app_id =? and huid =?", new String[]{String.valueOf(appId), hiAccountInfo.getHuid()});
    }

    public long b(HiAccountInfo hiAccountInfo) {
        if (hiAccountInfo == null) {
            ReleaseLogUtil.e("Debug_AccountInfoManager", "insertAccountInfo accountInfo is null!");
            return 0L;
        }
        ReleaseLogUtil.d("Debug_AccountInfoManager", "insertAccountInfo insert new accountInfo to loginStatus: ", Integer.valueOf(hiAccountInfo.getIsLogin()));
        return this.f39551a.insert(kvw.c(hiAccountInfo));
    }

    public HiAccountInfo b(int i) {
        LogUtil.d("Debug_AccountInfoManager", "getAccountInfoByAppId");
        if (i < 0) {
            LogUtil.j("Debug_AccountInfoManager", "getAccountInfoByAppId appId is not right!");
            return null;
        }
        return kwf.e(this.f39551a.query("app_id =? and is_login =? ", new String[]{Integer.toString(i), Integer.toString(1)}, null, null, null));
    }

    public HiAccountInfo b(int i, String str) {
        return kwf.e(a(i, str));
    }

    public String d(int i) {
        LogUtil.d("Debug_AccountInfoManager", "getHuidByAppId");
        if (i <= 0) {
            LogUtil.j("Debug_AccountInfoManager", "getHuidByAppId appId is not right!");
            return null;
        }
        return kwf.j(this.f39551a.query("app_id =? and is_login =? ", new String[]{Integer.toString(i), Integer.toString(1)}, null, null, null), "huid");
    }

    public int c(int i) {
        ReleaseLogUtil.d("Debug_AccountInfoManager", "logoutByAppId appId = ", Integer.valueOf(i));
        HiAccountInfo hiAccountInfoB = b(i);
        if (hiAccountInfoB == null) {
            ReleaseLogUtil.e("Debug_AccountInfoManager", "logoutByAppId the account is not exist");
            return -1;
        }
        hiAccountInfoB.setLogin(0);
        return c(hiAccountInfoB);
    }
}
