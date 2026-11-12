package p008y1;

import e23.l;
import e23.p;
import e23.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.z1;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {1128}, m = "invokeSuspend", v = 1)
public final class s extends i implements l<d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f193619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r<Object> f193620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q<p008y1.a, w0<Object>, d<? super Unit>, Object> f193621c;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ly1/w0;", "latestAnchors", "", "<anonymous>", "(Ly1/w0;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {1129}, m = "invokeSuspend", v = 1)
    public static final class a extends i implements p<w0<Object>, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f193622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f193623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q<p008y1.a, w0<Object>, d<? super Unit>, Object> f193624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r<Object> f193625d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(q<? super p008y1.a, ? super w0<Object>, ? super d<? super Unit>, ? extends Object> qVar, r<Object> rVar, d<? super a> dVar) {
            super(2, dVar);
            this.f193624c = qVar;
            this.f193625d = rVar;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f193624c, this.f193625d, dVar);
            aVar.f193623b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(w0<Object> w0Var, d<? super Unit> dVar) {
            return ((a) create(w0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f193622a;
            if (i14 == 0) {
                r.b(obj);
                w0<Object> w0Var = (w0) this.f193623b;
                r.b bVar = this.f193625d.f193592n;
                this.f193622a = 1;
                if (this.f193624c.invoke(bVar, w0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(r<Object> rVar, q<? super p008y1.a, ? super w0<Object>, ? super d<? super Unit>, ? extends Object> qVar, d<? super s> dVar) {
        super(1, dVar);
        this.f193620b = rVar;
        this.f193621c = qVar;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new s(this.f193620b, this.f193621c, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super Unit> dVar) {
        return ((s) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f193619a;
        r<Object> rVar = this.f193620b;
        if (i14 == 0) {
            r.b(obj);
            q qVar = new q(rVar, 2);
            a aVar2 = new a(this.f193621c, rVar, null);
            this.f193619a = 1;
            if (e.c(qVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        w0<Object> w0VarB = rVar.b();
        z1 z1Var = rVar.f193588j;
        Object objA = w0VarB.a(z1Var.getFloatValue());
        if (objA != null) {
            if (Math.abs(z1Var.getFloatValue() - rVar.b().c(objA)) < 0.5f && rVar.f193579a.invoke(objA).booleanValue()) {
                rVar.f193586h.setValue(objA);
                rVar.f(objA);
            }
        }
        return Unit.INSTANCE;
    }
}
