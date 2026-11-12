package a03;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.q1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.skydoves.flexible.core.SwipeableV2State$animateTo$2", f = "SwipeableV2.kt", l = {379}, m = "invokeSuspend")
public final class u0 extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0<Object> f213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Float f215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.k<Float> f217f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(r0<Object> r0Var, Object obj, Float f14, float f15, s1.k<Float> kVar, t13.d<? super u0> dVar) {
        super(1, dVar);
        this.f213b = r0Var;
        this.f214c = obj;
        this.f215d = f14;
        this.f216e = f15;
        this.f217f = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new u0(this.f213b, this.f214c, this.f215d, this.f216e, this.f217f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((u0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f212a;
        r0<Object> r0Var = this.f213b;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = r0.f169q;
            r0Var.f183n.setValue(this.f214c);
            p005kotlin.jvm.internal.o0 o0Var = new p005kotlin.jvm.internal.o0();
            Float fE = r0Var.e();
            float fFloatValue = fE != null ? fE.floatValue() : 0.0f;
            o0Var.f105806a = fFloatValue;
            float fFloatValue2 = this.f215d.floatValue();
            t0 t0Var = new t0(0, r0Var, o0Var);
            this.f212a = 1;
            if (q1.a(fFloatValue, fFloatValue2, this.f216e, this.f217f, t0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        r0Var.f180k.i(0.0f);
        return Unit.INSTANCE;
    }
}
