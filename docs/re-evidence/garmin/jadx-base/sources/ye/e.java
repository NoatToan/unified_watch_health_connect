package ye;

import android.net.ConnectivityManager;
import cf.t;
import p005kotlin.Metadata;
import r53.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lye/e;", "Lze/e;", "Landroid/net/ConnectivityManager;", "connManager", "", "timeoutMs", "<init>", "(Landroid/net/ConnectivityManager;J)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements ze.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f196789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f196790b;

    public e(ConnectivityManager connectivityManager, long j8) {
        connectivityManager.getClass();
        this.f196789a = connectivityManager;
        this.f196790b = j8;
    }

    @Override // ze.e
    public final boolean a(t tVar) {
        tVar.getClass();
        return tVar.f26950j.a() != null;
    }

    @Override // ze.e
    public final r53.b b(ue.f fVar) {
        fVar.getClass();
        return s.f(new d(fVar, this, null));
    }

    public /* synthetic */ e(ConnectivityManager connectivityManager, long j8, int i14, p005kotlin.jvm.internal.j jVar) {
        this(connectivityManager, (i14 & 2) != 0 ? 1000L : j8);
    }
}
