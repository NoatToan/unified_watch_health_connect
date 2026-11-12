package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ll3/f;", "Ll3/o0;", "Li3/pc;", "anchors", "latestTarget", "", "<anonymous>", "(Ll3/f;Ll3/o0;Li3/pc;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.SheetState$animateTo$2", f = "SheetDefaults.kt", l = {245}, m = "invokeSuspend")
public final class oc extends v13.i implements e23.r<l3.f, l3.o0<pc>, pc, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f89200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ l3.f f89201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ l3.o0 f89202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ pc f89203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mc f89204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f89205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1.f0<Float> f89206g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(mc mcVar, float f14, s1.f0<Float> f0Var, t13.d<? super oc> dVar) {
        super(4, dVar);
        this.f89204e = mcVar;
        this.f89205f = f14;
        this.f89206g = f0Var;
    }

    @Override // e23.r
    public final Object invoke(l3.f fVar, l3.o0<pc> o0Var, pc pcVar, t13.d<? super Unit> dVar) {
        float f14 = this.f89205f;
        s1.f0<Float> f0Var = this.f89206g;
        oc ocVar = new oc(this.f89204e, f14, f0Var, dVar);
        ocVar.f89201b = fVar;
        ocVar.f89202c = o0Var;
        ocVar.f89203d = pcVar;
        return ocVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f89200a;
        if (i14 == 0) {
            o13.r.b(obj);
            l3.f fVar = this.f89201b;
            float fC = this.f89202c.c(this.f89203d);
            if (!Float.isNaN(fC)) {
                p005kotlin.jvm.internal.o0 o0Var = new p005kotlin.jvm.internal.o0();
                mc mcVar = this.f89204e;
                float floatValue = Float.isNaN(mcVar.f88996e.f109328j.getFloatValue()) ? 0.0f : mcVar.f88996e.f109328j.getFloatValue();
                o0Var.f105806a = floatValue;
                nc ncVar = new nc(fVar, o0Var, 0);
                this.f89201b = null;
                this.f89202c = null;
                this.f89200a = 1;
                if (s1.q1.a(floatValue, fC, this.f89205f, this.f89206g, ncVar, this) == aVar) {
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
