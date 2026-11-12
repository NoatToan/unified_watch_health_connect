package g2;

import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animatePlacementDelta$1", f = "LazyLayoutItemAnimation.kt", l = {141, 148}, m = "invokeSuspend", v = 1)
public final class y extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s1.f0 f75303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f75304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f75305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.f0<g6.k> f75306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f75307e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(v vVar, s1.f0<g6.k> f0Var, long j8, t13.d<? super y> dVar) {
        super(2, dVar);
        this.f75305c = vVar;
        this.f75306d = f0Var;
        this.f75307e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y(this.f75305c, this.f75306d, this.f75307e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (s1.b.c(r8, r9, r10, r11, r14, 4) == r0) goto L31;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s1.f0 f0Var;
        s1.f0 f0Var2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75304b;
        long j8 = this.f75307e;
        v vVar = this.f75305c;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    f0Var2 = this.f75303a;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                v.a aVar2 = v.f75250s;
                vVar.f(false);
                vVar.f75258g = false;
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            s1.b<g6.k, s1.o> bVar = vVar.f75266o;
            s1.b<g6.k, s1.o> bVar2 = vVar.f75266o;
            boolean zF = bVar.f();
            s1.f0 f0Var3 = this.f75306d;
            if (zF) {
                f0Var3 = f0Var3 instanceof s1.j1 ? (s1.j1) f0Var3 : a0.f75023a;
            }
            if (bVar2.f()) {
                f0Var = f0Var3;
                long jD = g6.k.d(vVar.f75266o.e().f76005a, j8);
                s1.b<g6.k, s1.o> bVar3 = vVar.f75266o;
                g6.k kVarA = g6.k.a(jD);
                bb2.b bVar4 = new bb2.b(vVar, jD, 4);
                this.f75303a = null;
                this.f75304b = 2;
            } else {
                g6.k kVarA2 = g6.k.a(j8);
                this.f75303a = f0Var3;
                this.f75304b = 1;
                if (bVar2.g(kVarA2, this) != aVar) {
                    f0Var2 = f0Var3;
                }
            }
            return aVar;
            vVar.f75254c.invoke();
            f0Var = f0Var2;
            long jD2 = g6.k.d(vVar.f75266o.e().f76005a, j8);
            s1.b<g6.k, s1.o> bVar5 = vVar.f75266o;
            g6.k kVarA3 = g6.k.a(jD2);
            bb2.b bVar6 = new bb2.b(vVar, jD2, 4);
            this.f75303a = null;
            this.f75304b = 2;
        } catch (CancellationException unused) {
        }
    }
}
