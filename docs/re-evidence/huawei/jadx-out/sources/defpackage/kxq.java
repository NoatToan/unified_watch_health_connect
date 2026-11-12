package defpackage;

import android.content.ContentValues;
import android.util.LruCache;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.up.utils.Constants;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kxq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kvs f39593a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LruCache<String, Integer> f39594c;

    private kxq() {
        this.f39593a = kvs.c();
        this.f39594c = new LruCache<>(10);
    }

    static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final kxq f39595b = new kxq();
    }

    public static kxq c() {
        return e.f39595b;
    }

    public long c(HiUserInfo hiUserInfo, int i) {
        return b(hiUserInfo, i);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    private long b(HiUserInfo hiUserInfo, int i) throws Throwable {
        boolean zB;
        if (hiUserInfo == null) {
            LogUtil.j("HiH_userInfoManager", "insertUserInfo() userInfo is null");
            return 0L;
        }
        int iD = d(hiUserInfo.getHuid(), hiUserInfo.getRelateType());
        if (iD > 0) {
            return iD;
        }
        try {
            zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
            try {
                try {
                    long jA = a(hiUserInfo, i);
                    if (zB) {
                        ljq.g(BaseApplication.b(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return jA;
                } catch (Exception e2) {
                    e = e2;
                    ReleaseLogUtil.b("HiH_userInfoManager", "insertUserInfoSync: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return 0L;
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

    private long a(HiUserInfo hiUserInfo, int i) {
        LogUtil.d("HiH_userInfoManager", "insertUserInfo()");
        int iD = d(hiUserInfo.getHuid(), hiUserInfo.getRelateType());
        if (iD > 0) {
            return iD;
        }
        return this.f39593a.insert(kvw.c(hiUserInfo, i));
    }

    public int e(HiUserInfo hiUserInfo, int i, int i2) {
        return e(hiUserInfo, i, i2, true);
    }

    public int e(HiUserInfo hiUserInfo, int i) {
        return e(hiUserInfo, i, 0, false);
    }

    private int e(HiUserInfo hiUserInfo, int i, int i2, boolean z) {
        ContentValues contentValuesD;
        LogUtil.d("HiH_userInfoManager", Constants.METHOD_UPDATE_USER_INFO);
        if (hiUserInfo == null || i <= 0) {
            LogUtil.j("HiH_userInfoManager", "updateUserInfo values is null");
            return 0;
        }
        if (hiUserInfo.getCreateTime() < a(i)) {
            LogUtil.a("HiH_userInfoManager", "updateUserInfo do not need update userInfo , createTime is not new");
            return 0;
        }
        if (z) {
            contentValuesD = kvw.c(hiUserInfo, i2);
        } else {
            contentValuesD = kvw.d(hiUserInfo);
        }
        return this.f39593a.update(contentValuesD, "_id =? ", new String[]{Integer.toString(i)});
    }

    public int a(HiUserInfo hiUserInfo, int i, int i2) {
        LogUtil.d("HiH_userInfoManager", Constants.METHOD_UPDATE_USER_INFO);
        if (hiUserInfo == null || i <= 0) {
            LogUtil.j("HiH_userInfoManager", "updateUserInfo values is null");
            return 0;
        }
        if (hiUserInfo.getCreateTime() < a(i)) {
            LogUtil.a("HiH_userInfoManager", "updateUserInfo do not need update userInfo , createTime is not new");
            return 0;
        }
        int height = hiUserInfo.getHeight();
        float weight = hiUserInfo.getWeight();
        LogUtil.d("HiH_userInfoManager", "userInfo cloud sync:download height:", Integer.valueOf(height), " weight:", Float.valueOf(weight), " UnitType:", hiUserInfo.getUnitType() == 0 ? "UNIT_CM_KG" : "UNIT_FT_LB");
        hiUserInfo.setModifiedIntent(i2 == 1 ? HiUserInfo.DATA_CLOUD : 536870912);
        ContentValues contentValuesC = kvw.c(hiUserInfo, i2);
        contentValuesC.remove("huid");
        contentValuesC.remove("relate_type");
        return this.f39593a.update(contentValuesC, "_id =? ", new String[]{Integer.toString(i)});
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    public boolean c(HiUserInfo hiUserInfo, String str, int i) throws Throwable {
        boolean zB;
        try {
            try {
                zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
                try {
                    boolean zE = e(hiUserInfo, str, i);
                    if (zB) {
                        ljq.g(BaseApplication.b(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return zE;
                } catch (Exception e2) {
                    e = e2;
                    ReleaseLogUtil.b("HiH_userInfoManager", "insertOrUpdateUserInfo: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    ljq.c(BaseApplication.b(), 0);
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                ljq.c(BaseApplication.b(), 0);
            }
            throw th;
        }
    }

    private boolean e(HiUserInfo hiUserInfo, String str, int i) throws Throwable {
        long jB;
        LogUtil.d("HiH_userInfoManager", "insertOrUpdateUserInfoDb");
        if (hiUserInfo == null || HiCommonUtil.a(str)) {
            LogUtil.j("HiH_userInfoManager", "insertOrUpdateUserInfo values is null");
            return false;
        }
        int iD = d(str, 0);
        if (iD > 0) {
            jB = e(hiUserInfo, iD, i);
        } else {
            jB = b(hiUserInfo, i);
        }
        return kwb.b(jB);
    }

    public HiUserInfo a(String str, int i) {
        LogUtil.d("HiH_userInfoManager", "queryUserInfo");
        if (HiCommonUtil.a(str)) {
            LogUtil.j("HiH_userInfoManager", "queryUserInfo() huid = null");
            return null;
        }
        return kwf.z(this.f39593a.query("huid =? and relate_type =?", new String[]{str, String.valueOf(i)}, null, null, null));
    }

    public List<HiUserInfo> d(String str) {
        LogUtil.d("HiH_userInfoManager", "queryUserInfo");
        if (HiCommonUtil.a(str)) {
            LogUtil.j("HiH_userInfoManager", "queryUserInfo() huid = null");
            return null;
        }
        return kwf.aa(this.f39593a.query("huid =? ", new String[]{str}, null, null, null));
    }

    public HiUserInfo c(int i) {
        if (i <= 0) {
            LogUtil.j("HiH_userInfoManager", "queryUserInfo id <=0");
            return null;
        }
        return kwf.z(this.f39593a.query("_id =? ", new String[]{Integer.toString(i)}, null, null, null));
    }

    public HiUserInfo a(int i, int i2) {
        if (i <= 0) {
            LogUtil.j("HiH_userInfoManager", "queryUserInfo id <=0");
            return null;
        }
        return kwf.z(this.f39593a.query("_id =? and sync_status =? ", new String[]{Integer.toString(i), Integer.toString(i2)}, null, null, null));
    }

    public String d(int i) {
        LogUtil.d("HiH_userInfoManager", "queryHuidById");
        if (i <= 0) {
            LogUtil.j("HiH_userInfoManager", "queryHuidById id <=0");
            return null;
        }
        return kwf.j(this.f39593a.query("_id =? ", new String[]{Integer.toString(i)}, null, null, null), "huid");
    }

    public long a(int i) {
        if (i <= 0) {
            return 0L;
        }
        return kwf.h(this.f39593a.query("_id =? ", new String[]{Integer.toString(i)}, null, null, null), "create_time");
    }

    public int d(String str, int i) {
        String str2;
        LogUtil.d("HiH_userInfoManager", "queryUserInfoForUserId");
        if (HiCommonUtil.a(str)) {
            LogUtil.j("HiH_userInfoManager", "queryUserInfoForUserId() huid = null");
            return 0;
        }
        if (i == 0) {
            str2 = str;
        } else {
            str2 = str + com.huawei.openalliance.ad.constant.Constants.LINK + i;
        }
        Integer num = this.f39594c.get(str2);
        if (num != null) {
            return num.intValue();
        }
        int iF = kwf.f(this.f39593a.query("huid =? and relate_type =?", new String[]{str, Integer.toString(i)}, null, null, null), "_id");
        if (iF > 0) {
            this.f39594c.put(str2, Integer.valueOf(iF));
        }
        return iF;
    }
}
