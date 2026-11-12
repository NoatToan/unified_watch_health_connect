package zc1;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lr61/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.racepredictor.data.repo.RacePredictorRepositoryImpl$getMonthlyRacePredictorStats$2", f = "RacePredictorRepositoryImpl.kt", l = {34}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<List<? extends r61.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f203958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f203959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f203960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz0.c f203961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fz0.c f203962e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, String str, fz0.c cVar2, fz0.c cVar3, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f203959b = cVar;
        this.f203960c = str;
        this.f203961d = cVar2;
        this.f203962e = cVar3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f203959b, this.f203960c, this.f203961d, this.f203962e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends r61.a>>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f203958a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        yc1.a aVar2 = this.f203959b.f203952a;
        this.f203958a = 1;
        Object objB = aVar2.b(this.f203960c, this.f203961d, this.f203962e, this);
        return objB == aVar ? aVar : objB;
    }
}
