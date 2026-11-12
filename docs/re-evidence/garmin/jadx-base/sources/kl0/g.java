package kl0;

import android.location.Location;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/location/Location;", "<anonymous>", "(Lo53/b0;)Landroid/location/Location;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.details.GolfCourseDetailsViewModel$getCurrentLocation$currentLocation$1", f = "GolfCourseDetailsViewModel.kt", l = {131}, m = "invokeSuspend", v = 2)
public final class g extends v13.i implements p<b0, t13.d<? super Location>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f105255b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, t13.d<? super g> dVar2) {
        super(2, dVar2);
        this.f105255b = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f105255b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Location> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f105254a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        mv0.e eVar = this.f105255b.f105237c;
        this.f105254a = 1;
        Object objD = eVar.d("GolfCourseDetailsViewModel", (4 & 2) != 0 ? 102 : 100, (4 & 4) != 0 ? 30000L : 60000L, this);
        return objD == aVar ? aVar : objD;
    }
}
