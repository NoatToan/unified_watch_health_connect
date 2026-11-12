package qr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lps/i0;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getDiveActivity$5", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v2 extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.i0>>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f146792a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(t tVar, t13.d<? super v2> dVar) {
        super(3, dVar);
        this.f146792a = tVar;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends ps.i0>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        return new v2(this.f146792a, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        r53.p2 p2Var = this.f146792a.f146532k0;
        do {
            value = p2Var.getValue();
        } while (!q6.f.z(((Number) value).intValue() - 1, p2Var, value));
        return Unit.INSTANCE;
    }
}
