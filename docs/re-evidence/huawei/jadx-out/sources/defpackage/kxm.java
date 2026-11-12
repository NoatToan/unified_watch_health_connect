package defpackage;

import android.database.Cursor;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class kxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kvp f39589a;

    private kxm() {
        this.f39589a = kvp.e();
    }

    static class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final kxm f39590c = new kxm();
    }

    public static kxm a() {
        return e.f39590c;
    }

    private long b(kuo kuoVar) {
        if (kuoVar == null) {
            LogUtil.j("Debug_SyncCacheManager", "insertSyncCache syncCacheTable is null!");
            return 0L;
        }
        return this.f39589a.insert(kvw.b(kuoVar));
    }

    public boolean a(int i, int i2, String str, long j) {
        kuo kuoVar = new kuo();
        kuoVar.e(i);
        kuoVar.b(i2);
        kuoVar.c(str);
        kuoVar.b(j);
        long jB = b(kuoVar);
        LogUtil.d("Debug_SyncCacheManager", "insert syncCacheTable count is", Long.valueOf(jB));
        return jB > 0;
    }

    public Cursor e(int i, int i2) {
        LogUtil.d("Debug_SyncCacheManager", "querySyncCachebyType");
        if (i < 0) {
            LogUtil.j("Debug_SyncCacheManager", "querySyncCachebyType userID is not right!");
            return null;
        }
        return this.f39589a.query("userId =? and isDone =? and dataType =? ", new String[]{Integer.toString(i), Integer.toString(0), Integer.toString(i2)}, null, null, "dataTime DESC ");
    }
}
