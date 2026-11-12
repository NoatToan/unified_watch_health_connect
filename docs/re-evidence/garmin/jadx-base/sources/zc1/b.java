package zc1;

import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lr61/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.racepredictor.data.repo.RacePredictorRepositoryImpl$getCurrentRacePredictorStats$2", f = "RacePredictorRepositoryImpl.kt", l = {14}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super a0<r61.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f203949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f203950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f203951c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f203950b = cVar;
        this.f203951c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f203950b, this.f203951c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<r61.a>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f203949a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        yc1.a aVar2 = this.f203950b.f203952a;
        this.f203949a = 1;
        Object objC = aVar2.c(this.f203951c, this);
        return objC == aVar ? aVar : objC;
    }
}
