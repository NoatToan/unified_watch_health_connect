package vy0;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import s5.w0;
import x5.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.navigation.more.MoreTitleBarKt$SearchBar$2$1", f = "MoreTitleBar.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f180774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<l0> f180775b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, p1<l0> p1Var, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f180774a = str;
        this.f180775b = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f180774a, this.f180775b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p1<l0> p1Var = this.f180775b;
        String str = p1Var.getF182175a().f188878a.f157138b;
        String str2 = this.f180774a;
        if (!p005kotlin.jvm.internal.s.g(str, str2)) {
            int length = str2.length();
            p1Var.setValue(new l0(str2, og.a.l(length, length), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
        }
        return Unit.INSTANCE;
    }
}
