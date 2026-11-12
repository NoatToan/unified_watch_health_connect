package gv0;

import androidx.lifecycle.v1;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.SelectContactMethodScreenKt$SelectContactMethodScreen$4$1", f = "SelectContactMethodScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f79286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f79287b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(d dVar, String str, t13.d<? super i0> dVar2) {
        super(2, dVar2);
        this.f79286a = dVar;
        this.f79287b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i0(this.f79286a, this.f79287b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        d dVar = this.f79286a;
        dVar.getClass();
        String str = this.f79287b;
        str.getClass();
        ge1.b.T(v1.a(dVar), null, null, new m(dVar, str, false, null), 3);
        return Unit.INSTANCE;
    }
}
