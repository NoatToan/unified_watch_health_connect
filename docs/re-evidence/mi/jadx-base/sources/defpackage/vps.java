package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.push.ig;

/* JADX INFO: loaded from: classes11.dex */
public class vps {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile vps f37119b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f37120a;

    public vps(Context context) {
        this.f37120a = context;
    }

    public static int a(int i) {
        return Math.max(60, i);
    }

    public static vps b(Context context) {
        if (f37119b == null) {
            synchronized (vps.class) {
                try {
                    if (f37119b == null) {
                        f37119b = new vps(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f37119b;
    }

    public void c() {
        k5s.a(this.f37120a).g(new wps(this));
    }

    public final void d(vas vasVar, k5s k5sVar, boolean z) {
        if (vasVar.m(ig.UploadSwitch.a(), true)) {
            aqs aqsVar = new aqs(this.f37120a);
            if (z) {
                k5sVar.j(aqsVar, a(vasVar.a(ig.UploadFrequency.a(), RepositoryManager.GAP_A_DAY)));
            } else {
                k5sVar.i(aqsVar);
            }
        }
    }

    public final boolean f() {
        try {
            Context context = this.f37120a;
            (context instanceof Application ? (Application) context : (Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new hps(this.f37120a, String.valueOf(System.currentTimeMillis() / 1000)));
            return true;
        } catch (Exception e) {
            x9s.s(e);
            return false;
        }
    }

    public final void g() {
        k5s k5sVarA = k5s.a(this.f37120a);
        vas vasVarD = vas.d(this.f37120a);
        SharedPreferences sharedPreferences = this.f37120a.getSharedPreferences("mipush_extra", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = sharedPreferences.getLong("first_try_ts", jCurrentTimeMillis);
        if (j == jCurrentTimeMillis) {
            sharedPreferences.edit().putLong("first_try_ts", jCurrentTimeMillis).commit();
        }
        if (Math.abs(jCurrentTimeMillis - j) < 172800000) {
            return;
        }
        d(vasVarD, k5sVarA, false);
        if (vasVarD.m(ig.StorageCollectionSwitch.a(), true)) {
            int iA = a(vasVarD.a(ig.StorageCollectionFrequency.a(), RepositoryManager.GAP_A_DAY));
            k5sVarA.k(new zps(this.f37120a, iA), iA, 0);
        }
        y0t.j(this.f37120a);
        if (vasVarD.m(ig.ActivityTSSwitch.a(), false)) {
            f();
        }
        d(vasVarD, k5sVarA, true);
    }
}
