package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.LogAnonymous;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kxs {
    private kvv d;

    private kxs() {
        this.d = kvv.b();
    }

    static class d {
        private static final kxs d = new kxs();
    }

    public static kxs c(Context context) {
        return d.d;
    }

    public HiUserPreference b(int i, String str) {
        return kwf.ai(this.d.query(b(), a(i, str), null, null, null));
    }

    public List<HiUserPreference> b(int i, int i2) {
        return kwf.ae(this.d.query(a(), d(i, i2), null, null, null));
    }

    public List<HiUserPreference> d(int i) {
        return kwf.ae(this.d.query(e(), e(i), null, null, null));
    }

    private long a(HiUserPreference hiUserPreference) {
        LogUtil.d("Debug_UserPreferenceManager", "insertUserPreference()");
        return this.d.insert(kvw.b(hiUserPreference));
    }

    private int d(HiUserPreference hiUserPreference) {
        int iUpdate = this.d.update(kvw.c(hiUserPreference), b(), a(hiUserPreference.getUserId(), hiUserPreference.getKey()));
        LogUtil.d("Debug_UserPreferenceManager", "updateUserPreference() updateResult  updateResult = ", Integer.valueOf(iUpdate));
        return iUpdate;
    }

    public int a(HiUserPreference hiUserPreference, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i));
        int iUpdate = this.d.update(contentValues, b(), a(hiUserPreference.getUserId(), hiUserPreference.getKey()));
        LogUtil.d("Debug_UserPreferenceManager", "updateUserPreference() update  update = ", Integer.valueOf(iUpdate));
        return iUpdate;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    public boolean b(HiUserPreference hiUserPreference) {
        boolean zB;
        try {
            try {
                zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
                try {
                    boolean zC = c(hiUserPreference);
                    if (zB) {
                        ljq.g(BaseApplication.b(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return zC;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.b("Debug_UserPreferenceManager", "insertOrUpdateUserPreference: ", LogAnonymous.b(e));
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
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                ljq.c(BaseApplication.b(), 0);
            }
            throw th;
        }
    }

    private boolean c(HiUserPreference hiUserPreference) {
        long jD;
        LogUtil.a("Debug_UserPreferenceManager", "insertOrUpdateUserPreference userPreference is", hiUserPreference);
        if (HiCommonUtil.a(hiUserPreference.getKey()) || hiUserPreference.getValue() == null) {
            ReleaseLogUtil.b("Debug_UserPreferenceManager", hiUserPreference.getKey(), ":insOrUpUserPre key empty or value null");
            return false;
        }
        HiUserPreference hiUserPreferenceB = b(hiUserPreference.getUserId(), hiUserPreference.getKey());
        if (hiUserPreferenceB == null) {
            jD = a(hiUserPreference);
            ReleaseLogUtil.c("Debug_UserPreferenceManager", hiUserPreference.getKey(), ":insert ", Long.valueOf(jD));
        } else {
            if (TextUtils.equals(hiUserPreferenceB.getValue(), hiUserPreference.getValue())) {
                ReleaseLogUtil.c("Debug_UserPreferenceManager", "insOrUpUserPre same value");
                return true;
            }
            jD = d(hiUserPreference);
            ReleaseLogUtil.c("Debug_UserPreferenceManager", hiUserPreference.getKey(), ":update ", Long.valueOf(jD));
        }
        return kwb.b(jD);
    }

    private String b() {
        return "user_id =? and key =? ";
    }

    private String a() {
        return "user_id =? and sync_status =? ";
    }

    private String e() {
        return "user_id =? ";
    }

    private String[] a(int i, String str) {
        return new String[]{Integer.toString(i), str};
    }

    private String[] d(int i, int i2) {
        return new String[]{Integer.toString(i), Integer.toString(i2)};
    }

    private String[] e(int i) {
        return new String[]{Integer.toString(i)};
    }
}
