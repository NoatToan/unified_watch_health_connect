package i7;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f91903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f91904b;

    public c(m mVar) {
        this(mVar, new o(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler()));
    }

    public final void a(j.a aVar) {
        int i14 = aVar.f91934b;
        Executor executor = this.f91904b;
        m mVar = this.f91903a;
        if (i14 == 0) {
            executor.execute(new a(this, mVar, aVar.f91933a));
        } else {
            executor.execute(new b(this, mVar, i14));
        }
    }

    public c(m mVar, Executor executor) {
        this.f91903a = mVar;
        this.f91904b = executor;
    }
}
