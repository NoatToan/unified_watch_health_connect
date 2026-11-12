package r82;

import e2.i0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.ui.patterns.picker.GenericWheelPickerKt$ListPicker$3$3$1$1", f = "GenericWheelPicker.kt", l = {169}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f151297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c<Object> f151298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i0 f151299d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i14, i53.c<Object> cVar, i0 i0Var, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f151297b = i14;
        this.f151298c = cVar;
        this.f151299d = i0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f151297b, this.f151298c, this.f151299d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151296a;
        if (i14 == 0) {
            o13.r.b(obj);
            int iE = j23.t.e(this.f151297b + 1, 0, x.j(this.f151298c));
            this.f151296a = 1;
            if (i0.f(this.f151299d, iE, this) == aVar) {
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
