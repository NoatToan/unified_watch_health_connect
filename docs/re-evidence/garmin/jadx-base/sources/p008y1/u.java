package p008y1;

import e23.l;
import e23.p;
import e23.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {1175}, m = "invokeSuspend", v = 1)
public final class u extends i implements l<d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r<Object> f193659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f193660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r<p008y1.a, w0<Object>, Object, d<? super Unit>, Object> f193661d;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0018\u0010\u0003\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lo13/p;", "Ly1/w0;", "<destruct>", "", "<anonymous>", "(Lo13/p;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {1177}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<o13.p<? extends w0<Object>, Object>, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193662a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f193663b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r<p008y1.a, w0<Object>, Object, d<? super Unit>, Object> f193664c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r<Object> f193665d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(r<? super p008y1.a, ? super w0<Object>, Object, ? super d<? super Unit>, ? extends Object> rVar, r<Object> rVar2, d<? super a> dVar) {
            super(2, dVar);
            this.f193664c = rVar;
            this.f193665d = rVar2;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f193664c, this.f193665d, dVar);
            aVar.f193663b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(o13.p<? extends w0<Object>, Object> pVar, d<? super Unit> dVar) {
            return ((a) create(pVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193662a;
            if (i14 == 0) {
                o13.r.b(obj);
                o13.p pVar = (o13.p) this.f193663b;
                w0<Object> w0Var = (w0) pVar.f128594a;
                Object obj2 = pVar.f128595b;
                r.b bVar = this.f193665d.f193592n;
                this.f193662a = 1;
                if (this.f193664c.invoke(bVar, w0Var, obj2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(r<Object> rVar, Object obj, r<? super p008y1.a, ? super w0<Object>, Object, ? super d<? super Unit>, ? extends Object> rVar2, d<? super u> dVar) {
        super(1, dVar);
        this.f193659b = rVar;
        this.f193660c = obj;
        this.f193661d = rVar2;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new u(this.f193659b, this.f193660c, this.f193661d, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super Unit> dVar) {
        return ((u) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f193658a;
        Object obj2 = this.f193660c;
        r<Object> rVar = this.f193659b;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = r.f193578o;
            rVar.f193590l.setValue(obj2);
            q qVar = new q(rVar, 3);
            a aVar2 = new a(this.f193661d, rVar, null);
            this.f193658a = 1;
            if (e.c(qVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        if (rVar.f193579a.invoke(obj2).booleanValue()) {
            rVar.f193592n.a(rVar.b().c(obj2), rVar.f193589k.getFloatValue());
            rVar.f193586h.setValue(obj2);
            rVar.f(obj2);
        }
        return Unit.INSTANCE;
    }
}
