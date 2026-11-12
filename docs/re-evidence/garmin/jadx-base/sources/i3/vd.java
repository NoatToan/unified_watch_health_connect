package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.SliderState$drag$2", f = "Slider.kt", l = {2766}, m = "invokeSuspend")
public final class vd extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ud f90016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u1.k1 f90017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.p<p008y1.v0, t13.d<? super Unit>, Object> f90018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vd(ud udVar, u1.k1 k1Var, e23.p<? super p008y1.v0, ? super t13.d<? super Unit>, ? extends Object> pVar, t13.d<? super vd> dVar) {
        super(2, dVar);
        this.f90016b = udVar;
        this.f90017c = k1Var;
        this.f90018d = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new vd(this.f90016b, this.f90017c, this.f90018d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((vd) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f90015a;
        ud udVar = this.f90016b;
        if (i14 == 0) {
            o13.r.b(obj);
            udVar.f89923n.setValue(Boolean.TRUE);
            u1.l1 l1Var = udVar.f89928s;
            ud.b bVar = udVar.f89927r;
            this.f90015a = 1;
            l1Var.getClass();
            if (o53.c0.e(new u1.m1(this.f90017c, l1Var, this.f90018d, bVar, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        udVar.f89923n.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
