package p53;

import android.os.Handler;
import android.os.Looper;
import g8.i;
import java.util.concurrent.CancellationException;
import o53.k;
import o53.s0;
import o53.t1;
import o53.u0;
import o53.w1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import t13.g;
import u53.o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lp53/b;", "Lp53/c;", "Lo53/k0;", "Landroid/os/Handler;", "handler", "", "name", "", "invokeImmediately", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f136184e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f136185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f136187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f136188d;

    private b(Handler handler, String str, boolean z14) {
        super(null);
        this.f136185a = handler;
        this.f136186b = str;
        this.f136187c = z14;
        this.f136188d = z14 ? this : new b(handler, str, true);
    }

    @Override // o53.k0
    public final void C(long j8, k kVar) {
        l0.e eVar = new l0.e(19, kVar, this);
        if (j8 > 4611686018427387903L) {
            j8 = 4611686018427387903L;
        }
        if (this.f136185a.postDelayed(eVar, j8)) {
            kVar.r(new o50.a(23, this, eVar));
        } else {
            T(kVar.f129362e, eVar);
        }
    }

    @Override // o53.t1
    public final t1 H() {
        return this.f136188d;
    }

    public final void T(g gVar, Runnable runnable) {
        i.p(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        x53.c cVar = s0.f129406a;
        x53.b.f189152a.dispatch(gVar, runnable);
    }

    @Override // o53.z
    public final void dispatch(g gVar, Runnable runnable) {
        if (this.f136185a.post(runnable)) {
            return;
        }
        T(gVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return bVar.f136185a == this.f136185a && bVar.f136187c == this.f136187c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f136185a) ^ (this.f136187c ? 1231 : 1237);
    }

    @Override // o53.z
    public final boolean isDispatchNeeded(g gVar) {
        return (this.f136187c && s.g(Looper.myLooper(), this.f136185a.getLooper())) ? false : true;
    }

    @Override // p53.c, o53.k0
    public final u0 j(long j8, Runnable runnable, g gVar) {
        if (j8 > 4611686018427387903L) {
            j8 = 4611686018427387903L;
        }
        if (this.f136185a.postDelayed(runnable, j8)) {
            return new a(0, this, runnable);
        }
        T(gVar, runnable);
        return w1.f129420a;
    }

    @Override // o53.t1, o53.z
    /* JADX INFO: renamed from: toString */
    public final String getF168767c() {
        t1 t1VarH;
        String str;
        x53.c cVar = s0.f129406a;
        t1 t1Var = o.f168762a;
        if (this == t1Var) {
            str = "Dispatchers.Main";
        } else {
            try {
                t1VarH = t1Var.H();
            } catch (UnsupportedOperationException unused) {
                t1VarH = null;
            }
            str = this == t1VarH ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f136186b;
        if (string == null) {
            string = this.f136185a.toString();
        }
        return this.f136187c ? tn.k.g(string, ".immediate") : string;
    }

    public /* synthetic */ b(Handler handler, String str, int i14, j jVar) {
        this(handler, (i14 & 2) != 0 ? null : str);
    }

    public b(Handler handler, String str) {
        this(handler, str, false);
    }
}
