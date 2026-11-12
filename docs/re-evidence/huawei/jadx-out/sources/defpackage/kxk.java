package defpackage;

import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.data.type.HealthSyncCategory;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kxk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kvo f39586c;

    private kxk() {
        this.f39586c = kvo.c();
    }

    static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final kxk f39587c = new kxk();
    }

    public static kxk c() {
        return c.f39587c;
    }

    private boolean b(int i, long j, int i2, int i3) {
        return kwf.m(this.f39586c.query(a(), d(i, j, i2, i3), null, null, null));
    }

    public kul a(int i, long j, int i2) {
        return a(i, j, i2, HealthSyncCategory.a(i2));
    }

    public kul a(int i, long j, int i2, int i3) {
        return kwf.ad(this.f39586c.query(a(), d(i, j, i2, i3), null, null, null));
    }

    public List<kul> e(int i, long j, List<Integer> list, int[] iArr) {
        int[] array = list.stream().mapToInt(new cyf()).toArray();
        StringBuffer stringBuffer = new StringBuffer();
        String[] strArr = new String[array.length + iArr.length + 2];
        stringBuffer.append("main_user_id =? and cloud_code =? ");
        strArr[0] = Long.toString(i);
        strArr[1] = Long.toString(j);
        kwb.d("sync_data_type", array, stringBuffer, strArr, 2);
        kwb.d("sync_data_category", iArr, stringBuffer, strArr, array.length + 2);
        return kwf.k(this.f39586c.query(stringBuffer.toString(), strArr, null, null, null));
    }

    public kul d(int i, long j, int i2) {
        return e(i, j, i2, HealthSyncCategory.a(i2));
    }

    private kul e(int i, long j, int i2, int i3) {
        return kwf.ad(this.f39586c.query(a(), d(i, j, i2, i3), null, null, null));
    }

    private long b(kul kulVar) {
        LogUtil.d("Debug_SyncAnchorManager", "insertSyncAnchor()");
        return this.f39586c.insert(kvw.e(kulVar));
    }

    private int a(kul kulVar) {
        int iUpdate = this.f39586c.update(kvw.e(kulVar), a(), d(kulVar.e(), kulVar.a(), kulVar.b(), kulVar.c()));
        LogUtil.d("Debug_SyncAnchorManager", "updateClientData() updateResult  updateResult = ", Integer.valueOf(iUpdate));
        return iUpdate;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    private boolean c(kul kulVar) throws Throwable {
        boolean zB;
        try {
            try {
                zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
                try {
                    boolean zE = e(kulVar);
                    if (zB) {
                        ljq.g(BaseApplication.b(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return zE;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.b("HiH_SyncAnchorManager", "insertOrUpdateSyncAnchor: ", LogAnonymous.b(e));
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

    private boolean e(kul kulVar) {
        long jB;
        LogUtil.d("Debug_SyncAnchorManager", "insertOrUpdateSyncAnchorDb syncAnchorTable is", kulVar);
        if (b(kulVar.e(), kulVar.a(), kulVar.b(), kulVar.c())) {
            jB = a(kulVar);
        } else {
            jB = b(kulVar);
        }
        return kwb.b(jB);
    }

    public boolean d(int i, int i2, long j, long j2) {
        return e(i, i2, j, j2, HealthSyncCategory.a(i2));
    }

    public boolean e(int i, int i2, long j, long j2, int i3) {
        kul kulVar = new kul();
        kulVar.e(j);
        kulVar.a(i);
        kulVar.d(i2);
        kulVar.b(i3);
        kulVar.a(j2);
        return c(kulVar);
    }

    public boolean b(int i, int i2, int i3, long j) {
        return b(i, i2, i3, j, HealthSyncCategory.a(i2));
    }

    public boolean b(int i, int i2, int i3, long j, int i4) {
        kul kulVar = new kul();
        kulVar.e(i3);
        kulVar.a(i);
        kulVar.d(i2);
        kulVar.b(i4);
        kulVar.a(j);
        return c(kulVar);
    }

    private String a() {
        return "main_user_id =? and cloud_code =? and sync_data_type =? and sync_data_category =? ";
    }

    private String[] d(int i, long j, int i2, int i3) {
        return new String[]{Integer.toString(i), Long.toString(j), Integer.toString(i2), Integer.toString(i3)};
    }
}
