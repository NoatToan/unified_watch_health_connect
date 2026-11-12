package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.material3.TimePickerKt$TimePickerTextField$2$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
public final class ni extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ri f89106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f89107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m4.b0 f89108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni(ri riVar, int i14, m4.b0 b0Var, t13.d<? super ni> dVar) {
        super(2, dVar);
        this.f89106a = riVar;
        this.f89107b = i14;
        this.f89108c = b0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new ni(this.f89106a, this.f89107b, this.f89108c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((ni) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        int iC = this.f89106a.c();
        qi.a aVar2 = qi.f89469b;
        if (iC == this.f89107b) {
            m4.b0.a(this.f89108c);
        }
        return Unit.INSTANCE;
    }
}
