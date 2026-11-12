package r11;

import e23.p;
import i3.c5;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.edit.screen.MoveCopyFoodScreenKt$MoveCopyFoodScreen$1$1", f = "MoveCopyFoodScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c5 f149381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s11.d f149382b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c5 c5Var, s11.d dVar, t13.d<? super h> dVar2) {
        super(2, dVar2);
        this.f149381a = c5Var;
        this.f149382b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f149381a, this.f149382b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        s11.d dVar = this.f149382b;
        this.f149381a.j(new Long(dVar.f155893o), dVar.f155894p);
        return Unit.INSTANCE;
    }
}
