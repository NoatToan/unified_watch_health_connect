package u50;

import com.garmin.android.apps.connectmobile.v2;
import e23.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lk30/l;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchViewModel$onBoundsChanged$3", f = "CourseSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements q<r53.j<? super v2<? extends k30.l>>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f168689a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, t13.d<? super k> dVar) {
        super(3, dVar);
        this.f168689a = hVar;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super v2<? extends k30.l>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        return new k(this.f168689a, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        p2 p2Var = this.f168689a.f168672h;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, x50.f.a((x50.f) value, null, null, null, false, false, 0, false, 503)));
        return Unit.INSTANCE;
    }
}
