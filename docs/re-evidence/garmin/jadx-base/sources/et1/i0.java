package et1;

import android.view.Window;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.presentation.composables.screen.TrailDetailsScreenKt$TrailDetailsScreen$15$1", f = "TrailDetailsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pt1.o f65654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Window f65655b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(pt1.o oVar, Window window, t13.d<? super i0> dVar) {
        super(2, dVar);
        this.f65654a = oVar;
        this.f65655b = window;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i0(this.f65654a, this.f65655b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        pt1.o oVar = this.f65654a;
        pt1.n nVar = oVar != null ? oVar.f140922t : null;
        boolean z14 = nVar instanceof pt1.n.f;
        Window window = this.f65655b;
        if (z14 || p005kotlin.jvm.internal.s.g(nVar, pt1.n.a.f140893a)) {
            if (window != null) {
                window.setSoftInputMode(32);
            }
        } else if (window != null) {
            window.setSoftInputMode(16);
        }
        return Unit.INSTANCE;
    }
}
