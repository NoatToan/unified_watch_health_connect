package ss1;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lqs1/l;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trails.data.repository.GarminTrailsRepoImpl$getTrailDetails$coursePopularityDataResult$1", f = "GarminTrailsRepoImpl.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.l<t13.d<? super c83.a0<qs1.l>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f160700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qs1.d f160701c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(z zVar, qs1.d dVar, t13.d<? super n> dVar2) {
        super(1, dVar2);
        this.f160700b = zVar;
        this.f160701c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n(this.f160700b, this.f160701c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<qs1.l>> dVar) {
        return ((n) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160699a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ps1.a aVar2 = this.f160700b.f160774a;
        Long curatedCourseId = this.f160701c.getCuratedCourseId();
        long jLongValue = curatedCourseId != null ? curatedCourseId.longValue() : -1L;
        this.f160699a = 1;
        Object objM = aVar2.m(jLongValue, this);
        return objM == aVar ? aVar : objM;
    }
}
