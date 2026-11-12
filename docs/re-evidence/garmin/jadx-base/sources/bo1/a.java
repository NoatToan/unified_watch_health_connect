package bo1;

import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import e12.e;
import gw.n;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f19235d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f19236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f19237b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19238c = 0;

    private a() {
    }

    public static synchronized a a() {
        try {
            if (f19235d == null) {
                f19235d = new a();
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f19235d;
    }

    public static void b() {
        com.garmin.android.library.backgroundtaskmanagement.c.d(new n(null), null);
    }

    public final e c() {
        synchronized (this.f19237b) {
            e eVar = this.f19236a;
            if (eVar != null) {
                return eVar;
            }
            e eVar2 = new e();
            qd2.a aVarB = qd2.a.b();
            if (aVarB != null) {
                String strC = aVarB.c(qd2.a.b.INTELLIGENT_ROLES);
                if (TextUtils.isEmpty(strC)) {
                    int i14 = this.f19238c;
                    if (i14 < 3) {
                        this.f19238c = i14 + 1;
                        b();
                    }
                } else {
                    i2.l("SnapshotDataManager", "getIntelligentRoleDTO: Retrieved from cache. IntelligentRolesDTO=" + strC);
                    try {
                        this.f19236a = (e) GsonUtil.f47253b.fromJson(strC, e.class);
                    } catch (Exception e4) {
                        i2.g(e4, "SnapshotDataManager");
                        int i15 = this.f19238c;
                        if (i15 < 3) {
                            this.f19238c = i15 + 1;
                            b();
                        }
                    }
                }
            }
            return eVar2;
        }
    }
}
