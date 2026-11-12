package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.material3.TooltipStateImpl$show$2", f = "Tooltip.kt", l = {1184, 1186}, m = "invokeSuspend")
public final class jj extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f88635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lj f88636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<t13.d<? super Unit>, Object> f88637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.k1 f88638d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.TooltipStateImpl$show$2$1", f = "Tooltip.kt", l = {1186}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f88639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<t13.d<? super Unit>, Object> f88640b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super t13.d<? super Unit>, ? extends Object> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f88640b = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f88640b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f88639a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f88639a = 1;
                if (this.f88640b.invoke(this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jj(lj ljVar, e23.l<? super t13.d<? super Unit>, ? extends Object> lVar, u1.k1 k1Var, t13.d<? super jj> dVar) {
        super(1, dVar);
        this.f88636b = ljVar;
        this.f88637c = lVar;
        this.f88638d = k1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new jj(this.f88636b, this.f88637c, this.f88638d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((jj) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (o53.j2.b(1500, r7, r6) == r0) goto L21;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f88635a;
        u1.k1 k1Var = this.f88638d;
        lj ljVar = this.f88636b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                boolean z14 = ljVar.f88922a;
                e23.l<t13.d<? super Unit>, Object> lVar = this.f88637c;
                if (z14) {
                    this.f88635a = 1;
                    if (lVar.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    a aVar2 = new a(lVar, null);
                    this.f88635a = 2;
                }
            } else {
                if (i14 != 1 && i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            if (k1Var != u1.k1.PreventUserInput) {
                ljVar.dismiss();
            }
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            if (k1Var != u1.k1.PreventUserInput) {
                ljVar.dismiss();
            }
            throw th3;
        }
    }
}
