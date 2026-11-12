package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.RangeSliderLogic$captureThumb$1", f = "Slider.kt", l = {2527}, m = "invokeSuspend")
public final class za extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ab f90579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f90580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a2.h f90581d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(ab abVar, boolean z14, a2.h hVar, t13.d<? super za> dVar) {
        super(2, dVar);
        this.f90579b = abVar;
        this.f90580c = z14;
        this.f90581d = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new za(this.f90579b, this.f90580c, this.f90581d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((za) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f90578a;
        if (i14 == 0) {
            o13.r.b(obj);
            boolean z14 = this.f90580c;
            ab abVar = this.f90579b;
            a2.j jVar = z14 ? abVar.f87467b : abVar.f87468c;
            this.f90578a = 1;
            if (jVar.b(this.f90581d, this) == aVar) {
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
