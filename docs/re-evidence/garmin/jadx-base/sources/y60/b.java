package y60;

import c83.a0;
import e23.l;
import j61.h;
import j61.j;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lj61/j;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.cyclingability.data.repository.CyclingAbilityRepositoryImpl$getAggregatedCyclingAbility$2", f = "CyclingAbilityRepositoryImpl.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super a0<j>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f194593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f194594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz0.c f194595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz0.c f194596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f194597e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, fz0.c cVar, fz0.c cVar2, h hVar, t13.d<? super b> dVar2) {
        super(1, dVar2);
        this.f194594b = dVar;
        this.f194595c = cVar;
        this.f194596d = cVar2;
        this.f194597e = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f194594b, this.f194595c, this.f194596d, this.f194597e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<j>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f194593a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        x60.a aVar2 = this.f194594b.f194600a;
        String str = this.f194597e.f97345a;
        this.f194593a = 1;
        Object objA = aVar2.a(this.f194595c, this.f194596d, str, this);
        return objA == aVar ? aVar : objA;
    }
}
