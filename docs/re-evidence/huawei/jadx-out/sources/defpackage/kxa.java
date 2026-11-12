package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiGoalInfo;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kxa {
    private kut d;

    private kxa() {
        this.d = kut.b();
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final kxa f39575a = new kxa();
    }

    public static kxa e() {
        return c.f39575a;
    }

    private Cursor e(int i, int i2) {
        LogUtil.d("Debug_GoalInfoManager", "queryGoalInfoCursor");
        if (i <= 0) {
            LogUtil.j("Debug_GoalInfoManager", "no such userId");
            return null;
        }
        return this.d.query("user_id =? and goal_type=?", new String[]{Integer.toString(i), Integer.toString(i2)}, null, null, null);
    }

    private Cursor a(int i) {
        LogUtil.d("Debug_GoalInfoManager", "queryGoalInfoCursor");
        if (i <= 0) {
            LogUtil.j("Debug_GoalInfoManager", "no such userId");
            return null;
        }
        return this.d.query("user_id =?", new String[]{Integer.toString(i)}, null, null, null);
    }

    public List<HiGoalInfo> b(int i, int i2) {
        LogUtil.d("Debug_GoalInfoManager", "queryGoalInfoCursor");
        Cursor cursorE = e(i, i2);
        if (cursorE == null) {
            LogUtil.j("Debug_GoalInfoManager", "no such userId");
            return null;
        }
        return kwf.n(cursorE);
    }

    public List<HiGoalInfo> e(int i) {
        LogUtil.d("Debug_GoalInfoManager", "queryGoalInfoCursor");
        Cursor cursorA = a(i);
        if (cursorA == null) {
            LogUtil.j("Debug_GoalInfoManager", "no such userId");
            return null;
        }
        return kwf.n(cursorA);
    }

    public List<HiGoalInfo> c(int i, int i2) {
        LogUtil.d("Debug_GoalInfoManager", "queryGoalInfoCursor");
        if (i <= 0) {
            LogUtil.j("Debug_GoalInfoManager", "no such userId");
            return null;
        }
        return kwf.n(this.d.query("user_id =? and sync_status =? ", new String[]{Integer.toString(i), Integer.toString(i2)}, null, null, null));
    }

    public boolean d(int i, int i2) {
        LogUtil.d("Debug_GoalInfoManager", "queryGoalInfoExist");
        return kwf.m(e(i, i2));
    }

    private int g(HiGoalInfo hiGoalInfo, int i) {
        LogUtil.d("Debug_GoalInfoManager", "updateGoalInfo");
        if (hiGoalInfo == null) {
            LogUtil.j("Debug_GoalInfoManager", "updateGoalInfo goalInfo is null");
            return 0;
        }
        int ownerId = hiGoalInfo.getOwnerId();
        return this.d.update(kvw.a(hiGoalInfo, i), "user_id =? and goal_type = ?", new String[]{Integer.toString(ownerId), Integer.toString(hiGoalInfo.getGoalType())});
    }

    public int d(int i, int i2, int i3) {
        LogUtil.d("Debug_GoalInfoManager", "updateSyncGoalInfo");
        if (i <= 0) {
            LogUtil.j("Debug_GoalInfoManager", "updateSyncGoalInfo who is ", Integer.valueOf(i));
            return 0;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("sync_status", Integer.valueOf(i3));
        return this.d.update(contentValues, "user_id =? and goal_type = ?", new String[]{Integer.toString(i), Integer.toString(i2)});
    }

    private long d(HiGoalInfo hiGoalInfo, int i) {
        LogUtil.d("Debug_GoalInfoManager", "insertGoalInfo");
        if (hiGoalInfo == null) {
            LogUtil.j("Debug_GoalInfoManager", "insertGoalInfo goalInfo is null");
            return 0L;
        }
        return this.d.insert(kvw.a(hiGoalInfo, i));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    public boolean b(HiGoalInfo hiGoalInfo, int i) throws Throwable {
        boolean zB;
        if (hiGoalInfo == null) {
            LogUtil.j("Debug_GoalInfoManager", "insertOrUpdateGoalInfo goalInfo is null");
            return false;
        }
        try {
            zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
            try {
                try {
                    boolean zF = f(hiGoalInfo, i);
                    if (zB) {
                        ljq.g(BaseApplication.b(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return zF;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.b("Debug_GoalInfoManager", "insertOrUpdateGoalInfo: ", LogAnonymous.b(e));
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

    private boolean f(HiGoalInfo hiGoalInfo, int i) {
        long jD;
        LogUtil.d("Debug_GoalInfoManager", "insertOrUpdateGoalInfo");
        if (d(hiGoalInfo.getOwnerId(), hiGoalInfo.getGoalType())) {
            jD = g(hiGoalInfo, i);
        } else {
            jD = d(hiGoalInfo, i);
        }
        return kwb.b(jD);
    }

    public boolean e(HiGoalInfo hiGoalInfo, int i) {
        return a(hiGoalInfo, i);
    }

    private boolean a(HiGoalInfo hiGoalInfo, int i) throws Throwable {
        boolean zB;
        if (hiGoalInfo == null) {
            LogUtil.j("Debug_GoalInfoManager", "insertDefaultAccountGoals goalInfo is null");
            return false;
        }
        boolean zD = d(hiGoalInfo.getOwnerId(), hiGoalInfo.getGoalType());
        try {
            if (zD) {
                LogUtil.a("Debug_GoalInfoManager", "insertDefaultAccountGoals goalInfo exist, do not need move");
                return true;
            }
            try {
                zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
                try {
                    boolean zC = c(hiGoalInfo, i);
                    if (zB) {
                        ljq.g(BaseApplication.b(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return zC;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.b("Debug_GoalInfoManager", "insertDefaultAccountGoalsSync: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return false;
                }
            } catch (Exception e2) {
                e = e2;
                zB = false;
            } catch (Throwable th) {
                th = th;
                zD = false;
                if (zD) {
                    ljq.c(BaseApplication.b(), 0);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean c(HiGoalInfo hiGoalInfo, int i) {
        if (d(hiGoalInfo.getOwnerId(), hiGoalInfo.getGoalType())) {
            LogUtil.a("Debug_GoalInfoManager", "insertDefaultAccountGoals goalInfo exist, do not need move");
            return true;
        }
        LogUtil.a("Debug_GoalInfoManager", "insertDefaultAccountGoals start move goals");
        return kwb.b(d(hiGoalInfo, i));
    }
}
