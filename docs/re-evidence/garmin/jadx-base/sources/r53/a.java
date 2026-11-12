package r53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lr53/a;", "T", "Lr53/i;", "Lr53/c;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<T> implements i<T>, c<T> {

    /* JADX INFO: renamed from: r53.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @v13.e(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {226}, m = "collect")
    public static final class C2827a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s53.x f150517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f150518b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a<T> f150519c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f150520d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2827a(a<T> aVar, t13.d<? super C2827a> dVar) {
            super(dVar);
            this.f150519c = aVar;
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f150518b = obj;
            this.f150520d |= Integer.MIN_VALUE;
            return this.f150519c.collect(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // r53.i
    public final Object collect(j<? super T> jVar, t13.d<? super Unit> dVar) throws Throwable {
        C2827a c2827a;
        Throwable th3;
        s53.x xVar;
        if (dVar instanceof C2827a) {
            c2827a = (C2827a) dVar;
            int i14 = c2827a.f150520d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c2827a.f150520d = i14 - Integer.MIN_VALUE;
            } else {
                c2827a = new C2827a(this, dVar);
            }
        } else {
            c2827a = new C2827a(this, dVar);
        }
        Object obj = c2827a.f150518b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c2827a.f150520d;
        if (i15 != 0) {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xVar = c2827a.f150517a;
            try {
                o13.r.b(obj);
                xVar.releaseIntercepted();
                return Unit.INSTANCE;
            } catch (Throwable th4) {
                th3 = th4;
                xVar.releaseIntercepted();
                throw th3;
            }
        }
        o13.r.b(obj);
        s53.x xVar2 = new s53.x(jVar, c2827a.getF129302c());
        try {
            c2827a.f150517a = xVar2;
            c2827a.f150520d = 1;
            if (g(xVar2, c2827a) == aVar) {
                return aVar;
            }
            xVar = xVar2;
            xVar.releaseIntercepted();
            return Unit.INSTANCE;
        } catch (Throwable th5) {
            th3 = th5;
            xVar = xVar2;
            xVar.releaseIntercepted();
            throw th3;
        }
    }

    public abstract Object g(s53.x xVar, C2827a c2827a);
}
