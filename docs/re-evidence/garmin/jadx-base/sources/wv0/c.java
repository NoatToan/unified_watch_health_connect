package wv0;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import x5.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.component.AddCustomBehaviourBottomSheetKt$InputWithHint$1$1", f = "AddCustomBehaviourBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f187385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<l0> f187386b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, p1<l0> p1Var, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f187385a = str;
        this.f187386b = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f187385a, this.f187386b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p1<l0> p1Var = this.f187386b;
        String str = p1Var.getF182175a().f188878a.f157138b;
        String str2 = this.f187385a;
        if (!p005kotlin.jvm.internal.s.g(str2, str)) {
            l0 f182175a = p1Var.getF182175a();
            int length = str2.length();
            p1Var.setValue(l0.a(f182175a, str2, og.a.l(length, length), 4));
        }
        return Unit.INSTANCE;
    }
}
