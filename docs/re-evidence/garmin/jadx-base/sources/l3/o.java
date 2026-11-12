package l3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {518}, m = "invokeSuspend")
public final class o extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f109371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m<Object> f109372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.q<f, o0<Object>, t13.d<? super Unit>, Object> f109373c;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ll3/o0;", "latestAnchors", "", "<anonymous>", "(Ll3/o0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {519}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o0<Object>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f109374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f109375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.q<f, o0<Object>, t13.d<? super Unit>, Object> f109376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m<Object> f109377d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.q<? super f, ? super o0<Object>, ? super t13.d<? super Unit>, ? extends Object> qVar, m<Object> mVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f109376c = qVar;
            this.f109377d = mVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f109376c, this.f109377d, dVar);
            aVar.f109375b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o0<Object> o0Var, t13.d<? super Unit> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f109374a;
            if (i14 == 0) {
                o13.r.b(obj);
                o0<Object> o0Var = (o0) this.f109375b;
                m.d dVar = this.f109377d.f109332n;
                this.f109374a = 1;
                if (this.f109376c.invoke(dVar, o0Var, this) == aVar) {
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
    public o(m<Object> mVar, e23.q<? super f, ? super o0<Object>, ? super t13.d<? super Unit>, ? extends Object> qVar, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f109372b = mVar;
        this.f109373c = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f109372b, this.f109373c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f109371a;
        if (i14 == 0) {
            o13.r.b(obj);
            m<Object> mVar = this.f109372b;
            l lVar = new l(mVar, 3);
            a aVar2 = new a(this.f109373c, mVar, null);
            this.f109371a = 1;
            if (k.c(lVar, aVar2, this) == aVar) {
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
