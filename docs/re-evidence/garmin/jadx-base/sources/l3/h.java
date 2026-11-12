package l3;

import i3.nc;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n"}, d2 = {"T", "Ll3/f;", "Ll3/o0;", "anchors", "latestTarget", "", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {682}, m = "invokeSuspend")
public final class h extends v13.i implements e23.r<f, o0<Object>, Object, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f109254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ f f109255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ o0 f109256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f109257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m<Object> f109258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f109259f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m<Object> mVar, float f14, t13.d<? super h> dVar) {
        super(4, dVar);
        this.f109258e = mVar;
        this.f109259f = f14;
    }

    @Override // e23.r
    public final Object invoke(f fVar, o0<Object> o0Var, Object obj, t13.d<? super Unit> dVar) {
        h hVar = new h(this.f109258e, this.f109259f, dVar);
        hVar.f109255b = fVar;
        hVar.f109256c = o0Var;
        hVar.f109257d = obj;
        return hVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f109254a;
        if (i14 == 0) {
            o13.r.b(obj);
            f fVar = this.f109255b;
            float fC = this.f109256c.c(this.f109257d);
            if (!Float.isNaN(fC)) {
                p005kotlin.jvm.internal.o0 o0Var = new p005kotlin.jvm.internal.o0();
                m<Object> mVar = this.f109258e;
                float floatValue = Float.isNaN(mVar.f109328j.getFloatValue()) ? 0.0f : mVar.f109328j.getFloatValue();
                o0Var.f105806a = floatValue;
                s1.k<Float> kVarInvoke = mVar.f109321c.invoke();
                nc ncVar = new nc(fVar, o0Var, 1);
                this.f109255b = null;
                this.f109256c = null;
                this.f109254a = 1;
                if (s1.q1.a(floatValue, fC, this.f109259f, kVarInvoke, ncVar, this) == aVar) {
                    return aVar;
                }
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
