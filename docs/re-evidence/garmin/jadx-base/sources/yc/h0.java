package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lyc/e4;", "", "<anonymous>", "(Lyc/e4;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1", f = "FlowExt.kt", l = {88}, m = "invokeSuspend")
public final class h0 extends v13.i implements e23.p<e4<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f195992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r53.i<Object> f195993c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.q<r53.j<Object>, Object, t13.d<? super Unit>, Object> f195994d;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "value"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @v13.e(c = "androidx.paging.FlowExtKt$simpleTransformLatest$1$1", f = "FlowExt.kt", l = {89}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<Object, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f195995a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f195996b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.q<r53.j<Object>, Object, t13.d<? super Unit>, Object> f195997c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q<Object> f195998d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.q<? super r53.j<Object>, Object, ? super t13.d<? super Unit>, ? extends Object> qVar, q<Object> qVar2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f195997c = qVar;
            this.f195998d = qVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f195997c, this.f195998d, dVar);
            aVar.f195996b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(Object obj, t13.d<? super Unit> dVar) {
            return ((a) create(obj, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f195995a;
            if (i14 == 0) {
                o13.r.b(obj);
                Object obj2 = this.f195996b;
                this.f195995a = 1;
                if (this.f195997c.invoke(this.f195998d, obj2, this) == aVar) {
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
    public h0(r53.i<Object> iVar, e23.q<? super r53.j<Object>, Object, ? super t13.d<? super Unit>, ? extends Object> qVar, t13.d<? super h0> dVar) {
        super(2, dVar);
        this.f195993c = iVar;
        this.f195994d = qVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h0 h0Var = new h0(this.f195993c, this.f195994d, dVar);
        h0Var.f195992b = obj;
        return h0Var;
    }

    @Override // e23.p
    public final Object invoke(e4<Object> e4Var, t13.d<? super Unit> dVar) {
        return ((h0) create(e4Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195991a;
        if (i14 == 0) {
            o13.r.b(obj);
            a aVar2 = new a(this.f195994d, new q((e4) this.f195992b), null);
            this.f195991a = 1;
            if (r53.s.k(this.f195993c, aVar2, this) == aVar) {
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
