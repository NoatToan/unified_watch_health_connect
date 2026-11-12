package h3;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {480}, m = "invokeSuspend", v = 1)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f81261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f81262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f81263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.k<Float> f81264d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, float f14, s1.k<Float> kVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f81262b = lVar;
        this.f81263c = f14;
        this.f81264d = kVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f81262b, this.f81263c, this.f81264d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f81261a;
        if (i14 == 0) {
            r.b(obj);
            s1.b<Float, n> bVar = this.f81262b.f81270c;
            Float f14 = new Float(this.f81263c);
            this.f81261a = 1;
            if (s1.b.c(bVar, f14, this.f81264d, null, this, 12) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
