package u53;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o53.f0;
import o53.g2;
import o53.p0;
import o53.y0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0002X\u0082\u0004¨\u0006\u000e"}, d2 = {"Lu53/f;", "T", "Lo53/p0;", "Lv13/d;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lt13/d;", "Lo53/z;", "dispatcher", "continuation", "<init>", "(Lo53/z;Lt13/d;)V", "Lh53/b;", "", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f<T> extends p0<T> implements v13.d, t13.d<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f168731h = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o53.z f168732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t13.d<T> f168733e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f168734f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f168735g;

    /* JADX WARN: Multi-variable type inference failed */
    public f(o53.z zVar, t13.d<? super T> dVar) {
        super(-1);
        this.f168732d = zVar;
        this.f168733e = dVar;
        this.f168734f = g.f168736a;
        this.f168735g = z.b(dVar.getF157466b());
    }

    @Override // o53.p0
    public final t13.d<T> c() {
        return this;
    }

    @Override // v13.d
    public final v13.d getCallerFrame() {
        t13.d<T> dVar = this.f168733e;
        if (dVar instanceof v13.d) {
            return (v13.d) dVar;
        }
        return null;
    }

    @Override // t13.d
    /* JADX INFO: renamed from: getContext */
    public final t13.g getF157466b() {
        return this.f168733e.getF157466b();
    }

    @Override // o53.p0
    public final Object h() {
        Object obj = this.f168734f;
        this.f168734f = g.f168736a;
        return obj;
    }

    @Override // t13.d
    public final void resumeWith(Object obj) {
        Throwable thB = o13.q.b(obj);
        Object vVar = thB == null ? obj : new o53.v(thB, false, 2, null);
        t13.d<T> dVar = this.f168733e;
        t13.g f129302c = dVar.getF157466b();
        o53.z zVar = this.f168732d;
        if (g.c(zVar, f129302c)) {
            this.f168734f = vVar;
            this.f129380c = 0;
            g.b(zVar, dVar.getF157466b(), this);
            return;
        }
        g2.f129341a.getClass();
        y0 y0VarA = g2.a();
        if (y0VarA.f129423a >= 4294967296L) {
            this.f168734f = vVar;
            this.f129380c = 0;
            y0VarA.T(this);
            return;
        }
        y0VarA.U(true);
        try {
            t13.g f129302c2 = dVar.getF157466b();
            Object objC = z.c(f129302c2, this.f168735g);
            try {
                dVar.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
                z.a(f129302c2, objC);
                while (y0VarA.W()) {
                }
            } catch (Throwable th3) {
                z.a(f129302c2, objC);
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                g(th4);
            } finally {
                y0VarA.H(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f168732d + ", " + f0.L(this.f168733e) + ']';
    }
}
