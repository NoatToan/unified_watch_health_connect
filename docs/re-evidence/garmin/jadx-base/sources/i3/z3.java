package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.DatePickerKt$DatePickerContent$2$4$2$2$1$1$1", f = "DatePicker.kt", l = {1653}, m = "invokeSuspend")
public final class z3 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2.i0 f90525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f90526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j23.l f90527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l3.h0 f90528e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(e2.i0 i0Var, int i14, j23.l lVar, l3.h0 h0Var, t13.d<? super z3> dVar) {
        super(2, dVar);
        this.f90525b = i0Var;
        this.f90526c = i14;
        this.f90527d = lVar;
        this.f90528e = h0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z3(this.f90525b, this.f90526c, this.f90527d, this.f90528e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f90524a;
        if (i14 == 0) {
            o13.r.b(obj);
            int i15 = (((this.f90526c - this.f90527d.f96796a) * 12) + this.f90528e.f109261b) - 1;
            this.f90524a = 1;
            e2.i0.a aVar2 = e2.i0.f62432x;
            if (this.f90525b.l(i15, 0, this) == aVar) {
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
