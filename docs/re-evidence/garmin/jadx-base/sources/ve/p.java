package ve;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes7.dex */
public class p implements bf.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f177580l = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f177582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.work.a f177583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ef.b f177584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WorkDatabase f177585e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f177587g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f177586f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f177589i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f177590j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f177581a = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f177591k = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f177588h = new HashMap();

    static {
        ue.u.b("Processor");
    }

    public p(Context context, androidx.work.a aVar, ef.b bVar, WorkDatabase workDatabase) {
        this.f177582b = context;
        this.f177583c = aVar;
        this.f177584d = bVar;
        this.f177585e = workDatabase;
    }

    public static boolean d(String str, y0 y0Var, int i14) {
        if (y0Var == null) {
            ue.u.a().getClass();
            return false;
        }
        y0Var.f177646n.H(new WorkerStoppedException(i14));
        ue.u.a().getClass();
        return true;
    }

    public final void a(e eVar) {
        synchronized (this.f177591k) {
            this.f177590j.add(eVar);
        }
    }

    public final y0 b(String str) {
        y0 y0Var = (y0) this.f177586f.remove(str);
        boolean z14 = y0Var != null;
        if (!z14) {
            y0Var = (y0) this.f177587g.remove(str);
        }
        this.f177588h.remove(str);
        if (z14) {
            synchronized (this.f177591k) {
                try {
                    if (this.f177586f.isEmpty()) {
                        Context context = this.f177582b;
                        int i14 = bf.c.f17780j;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f177582b.startService(intent);
                        } catch (Throwable unused) {
                            ue.u.a().getClass();
                        }
                        PowerManager.WakeLock wakeLock = this.f177581a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f177581a = null;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return y0Var;
    }

    public final y0 c(String str) {
        y0 y0Var = (y0) this.f177586f.get(str);
        return y0Var == null ? (y0) this.f177587g.get(str) : y0Var;
    }
}
