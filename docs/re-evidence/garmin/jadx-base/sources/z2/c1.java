package z2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", l = {83}, m = "invokeSuspend", v = 1)
public final class c1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f201535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x3<n4.c> f201536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.b<n4.c, s1.o> f201537d;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s1.b<n4.c, s1.o> f201538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f201539b;

        public a(s1.b<n4.c, s1.o> bVar, o53.b0 b0Var) {
            this.f201538a = bVar;
            this.f201539b = b0Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            long j8 = ((n4.c) obj).f123544a;
            s1.b<n4.c, s1.o> bVar = this.f201538a;
            if ((bVar.e().f123544a & 9223372034707292159L) == 9205357640488583168L || (j8 & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (bVar.e().f123544a & 4294967295L)) == Float.intBitsToFloat((int) (j8 & 4294967295L))) {
                Object objG = bVar.g(n4.c.a(j8), dVar);
                return objG == u13.a.COROUTINE_SUSPENDED ? objG : Unit.INSTANCE;
            }
            ge1.b.T(this.f201539b, null, null, new b1(bVar, j8, null), 3);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(x3<n4.c> x3Var, s1.b<n4.c, s1.o> bVar, t13.d<? super c1> dVar) {
        super(2, dVar);
        this.f201536c = x3Var;
        this.f201537d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c1 c1Var = new c1(this.f201536c, this.f201537d, dVar);
        c1Var.f201535b = obj;
        return c1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201534a;
        if (i14 == 0) {
            o13.r.b(obj);
            o53.b0 b0Var = (o53.b0) this.f201535b;
            r53.c2 c2VarS = p3.p0.s(new by1.h(this.f201536c, 17));
            a aVar2 = new a(this.f201537d, b0Var);
            this.f201534a = 1;
            if (c2VarS.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
