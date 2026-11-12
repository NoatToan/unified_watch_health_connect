package hf;

import o53.b0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lwf/i;", "<anonymous>", "(Lo53/b0;)Lwf/i;"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "coil3.RealImageLoader$execute$2", f = "RealImageLoader.kt", l = {87}, m = "invokeSuspend")
public final class o extends v13.i implements e23.p<b0, t13.d<? super wf.i>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f83594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f83595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wf.f f83596d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lwf/i;", "<anonymous>", "(Lo53/b0;)Lwf/i;"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "coil3.RealImageLoader$execute$2$job$1", f = "RealImageLoader.kt", l = {83}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super wf.i>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f83597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f83598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wf.f f83599c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n nVar, wf.f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f83598b = nVar;
            this.f83599c = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f83598b, this.f83599c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super wf.i> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f83597a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f83597a = 1;
            int i15 = n.f83577f;
            Object objF = this.f83598b.f(this.f83599c, 1, this);
            return objF == aVar ? aVar : objF;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, wf.f fVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f83595c = nVar;
        this.f83596d = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f83595c, this.f83596d, dVar);
        oVar.f83594b = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super wf.i> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f83594b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f83593a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        n nVar = this.f83595c;
        t13.g value = nVar.f83578a.f83585c.getValue();
        wf.f fVar = this.f83596d;
        i0<wf.i> i0VarA = u.a(fVar, ge1.b.j(b0Var, value, null, new a(nVar, fVar, null), 2)).a();
        this.f83594b = null;
        this.f83593a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
