package f9;

import android.app.ActivityManager;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.health.platform.client.proto.z1;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.analytics.q;
import com.google.common.util.concurrent.SettableFuture;
import ds.e0;
import java.util.ArrayList;
import java.util.Set;
import n9.s;
import n9.w;
import p005kotlin.Metadata;
import p9.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lf9/e;", "Lj9/a;", "Lp9/l;", "Ld9/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lj9/d;", "clientConfiguration", "Lk9/c;", "connectionManager", "<init>", "(Landroid/content/Context;Lj9/d;Lk9/c;)V", "(Landroid/content/Context;Lj9/d;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e extends j9.a<l> implements d9.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f69961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f69962g;

    public e(Context context, j9.d dVar) {
        k9.c cVar;
        context.getClass();
        dVar.getClass();
        i9.a aVar = i9.a.f92276a;
        aVar.getClass();
        synchronized (aVar) {
            try {
                if (i9.a.f92277b == null) {
                    Context applicationContext = context.getApplicationContext();
                    aVar.getClass();
                    HandlerThread handlerThread = new HandlerThread("ProviderConnectionManager", 9);
                    handlerThread.start();
                    Looper looper = handlerThread.getLooper();
                    looper.getClass();
                    i9.a.f92277b = new k9.c(applicationContext, looper);
                }
                cVar = i9.a.f92277b;
                cVar.getClass();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this(context, dVar, cVar);
    }

    @Override // d9.a
    public final SettableFuture a(z1 z1Var) {
        SettableFuture settableFutureE = e(1, new q(14, this, new n9.c(z1Var)));
        settableFutureE.getClass();
        return settableFutureE;
    }

    @Override // d9.a
    public final SettableFuture b(Set set) {
        set.getClass();
        SettableFuture settableFutureE = e(Math.min(1, 5), new q(15, this, set));
        settableFutureE.getClass();
        return settableFutureE;
    }

    @Override // d9.a
    public final SettableFuture c(ArrayList arrayList, ArrayList arrayList2) {
        SettableFuture settableFutureE = e(1, new q(17, this, new n9.e(arrayList, arrayList2)));
        settableFutureE.getClass();
        return settableFutureE;
    }

    @Override // d9.a
    public final SettableFuture d(ArrayList arrayList) {
        SettableFuture settableFutureE = e(1, new q(16, this, new w(arrayList)));
        settableFutureE.getClass();
        return settableFutureE;
    }

    public final s f() {
        String str = this.f69962g;
        str.getClass();
        String string = this.f69961f.getSharedPreferences("PermissionTokenManager.healthdata", 0).getString("token", null);
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i14 = runningAppProcessInfo.importance;
        return new s(str, 112, string, i14 == 100 || i14 == 125 || i14 == 200);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, j9.d dVar, k9.c cVar) {
        super(dVar, cVar, new e0(27), new e0(28));
        context.getClass();
        dVar.getClass();
        cVar.getClass();
        this.f69961f = context;
        this.f69962g = context.getPackageName();
    }
}
