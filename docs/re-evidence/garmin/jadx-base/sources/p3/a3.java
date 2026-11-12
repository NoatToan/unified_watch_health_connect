package p3;

import kotlinx.coroutines.CoroutineExceptionHandler;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lp3/a3;", "Lo53/b0;", "Lp3/y2;", "Lt13/g;", "parentContext", "overlayContext", "<init>", "(Lt13/g;Lt13/g;)V", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a3 implements o53.b0, y2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f135034e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t13.g f135035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t13.g f135036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a3 f135037c = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile t13.g f135038d;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"p3/a3$b", "Lt13/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends t13.a implements CoroutineExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g4.i f135039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a3 f135040b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CoroutineExceptionHandler.a aVar, g4.i iVar, a3 a3Var) {
            super(aVar);
            this.f135039a = iVar;
            this.f135040b = a3Var;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void L(Throwable th3, t13.g gVar) throws Throwable {
            g4.i iVar = this.f135039a;
            a3 a3Var = this.f135040b;
            iVar.g(a3Var, th3);
            t13.g gVar2 = a3Var.f135036b;
            CoroutineExceptionHandler.a aVar = CoroutineExceptionHandler.f105965e0;
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) gVar2.get(aVar);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.L(th3, gVar);
                return;
            }
            CoroutineExceptionHandler coroutineExceptionHandler2 = (CoroutineExceptionHandler) a3Var.f135035a.get(aVar);
            if (coroutineExceptionHandler2 == null) {
                throw th3;
            }
            coroutineExceptionHandler2.L(th3, gVar);
        }
    }

    static {
        new a(null);
        f135034e = new f();
    }

    public a3(t13.g gVar, t13.g gVar2) {
        this.f135035a = gVar;
        this.f135036b = gVar2;
    }

    public final void a() {
        synchronized (this.f135037c) {
            try {
                t13.g gVar = this.f135038d;
                if (gVar == null) {
                    this.f135038d = f135034e;
                } else {
                    g8.i.p(gVar, new m0());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF183565a() {
        t13.g gVarPlus;
        t13.g gVar = this.f135038d;
        if (gVar == null || gVar == f135034e) {
            g4.i iVar = (g4.i) this.f135035a.get(g4.i.f75740b);
            t13.g bVar = iVar != null ? new b(CoroutineExceptionHandler.f105965e0, iVar, this) : t13.h.f161748a;
            synchronized (this.f135037c) {
                try {
                    gVarPlus = this.f135038d;
                    if (gVarPlus == null) {
                        t13.g gVar2 = this.f135035a;
                        gVarPlus = gVar2.plus(new o53.m1((o53.l1) gVar2.get(o53.l1.f129368i0))).plus(this.f135036b).plus(bVar);
                    } else if (gVarPlus == f135034e) {
                        t13.g gVar3 = this.f135035a;
                        o53.m1 m1Var = new o53.m1((o53.l1) gVar3.get(o53.l1.f129368i0));
                        m1Var.D(new m0());
                        gVarPlus = gVar3.plus(m1Var).plus(this.f135036b).plus(bVar);
                        int i14 = g4.f.f75739a;
                    }
                    this.f135038d = gVarPlus;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            gVar = gVarPlus;
        }
        gVar.getClass();
        return gVar;
    }

    @Override // p3.y2
    public final void onAbandoned() {
        a();
    }

    @Override // p3.y2
    public final void onForgotten() {
        a();
    }

    @Override // p3.y2
    public final void onRemembered() {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp3/a3$a;", "", "<init>", "()V", "Lt13/g;", "CancelledCoroutineContext", "Lt13/g;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
