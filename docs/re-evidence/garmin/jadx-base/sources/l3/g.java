package l3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "", "velocity", "", "<anonymous>", "(Lo53/b0;F)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
public final class g extends v13.i implements e23.q<o53.b0, Float, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ o53.b0 f109246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ float f109247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m<Object> f109248c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", l = {177}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f109249a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m<Object> f109250b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f109251c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m<Object> mVar, float f14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f109250b = mVar;
            this.f109251c = f14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f109250b, this.f109251c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f109249a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f109249a = 1;
                if (this.f109250b.j(this.f109251c, this) == aVar) {
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
    public g(m<Object> mVar, t13.d<? super g> dVar) {
        super(3, dVar);
        this.f109248c = mVar;
    }

    @Override // e23.q
    public final Object invoke(o53.b0 b0Var, Float f14, t13.d<? super Unit> dVar) {
        float fFloatValue = f14.floatValue();
        g gVar = new g(this.f109248c, dVar);
        gVar.f109246a = b0Var;
        gVar.f109247b = fFloatValue;
        return gVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ge1.b.T(this.f109246a, null, null, new a(this.f109248c, this.f109247b, null), 3);
        return Unit.INSTANCE;
    }
}
