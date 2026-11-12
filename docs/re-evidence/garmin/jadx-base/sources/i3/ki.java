package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.TimePickerKt$TimePicker$1$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
public final class ki extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h5.v1<Boolean> f88768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f88769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ri f88770c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki(h5.v1<Boolean> v1Var, p pVar, ri riVar, t13.d<? super ki> dVar) {
        super(2, dVar);
        this.f88768a = v1Var;
        this.f88769b = pVar;
        this.f88770c = riVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new ki(this.f88768a, this.f88769b, this.f88770c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((ki) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        h5.v1<Boolean> v1Var = this.f88768a;
        Boolean bool = v1Var.f82011a;
        Boolean bool2 = Boolean.TRUE;
        if (p005kotlin.jvm.internal.s.g(bool, bool2)) {
            ri riVar = this.f88770c;
            int iB = riVar.b();
            p pVar = this.f88769b;
            pVar.e(iB);
            pVar.f(riVar.a());
        }
        v1Var.f82011a = bool2;
        return Unit.INSTANCE;
    }
}
