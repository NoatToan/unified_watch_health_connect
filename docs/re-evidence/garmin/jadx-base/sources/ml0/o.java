package ml0;

import android.location.Location;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/location/Location;", "<anonymous>", "(Lo53/b0;)Landroid/location/Location;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.search.SearchGolfCoursesViewModel$checkUserLocation$lastKnownLocation$1", f = "SearchGolfCoursesViewModel.kt", l = {180}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<b0, t13.d<? super Location>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f119258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f119259b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f119259b = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f119259b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Location> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f119258a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        mv0.e eVar = this.f119259b.f119262c;
        this.f119258a = 1;
        Object objC = eVar.c("SearchGolfCoursesViewModel", this);
        return objC == aVar ? aVar : objC;
    }
}
