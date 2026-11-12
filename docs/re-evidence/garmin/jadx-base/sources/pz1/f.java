package pz1;

import b63.o;
import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lmp/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trainingrediness.data.repo.TrainingReadinessRepo$getOnceDayStatus$activitiesReportsResponse$1", f = "TrainingReadinessRepo.kt", l = {49}, m = "invokeSuspend", v = 2)
public final class f extends i implements l<t13.d<? super a0<mp.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f141946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f141947c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, o oVar, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f141946b = bVar;
        this.f141947c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f141946b, this.f141947c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<mp.c>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141945a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        b bVar = this.f141946b;
        nz1.a aVar2 = bVar.f141927a;
        o oVar = this.f141947c;
        String string = g22.l.h(oVar).minusDays(1).toDateTimeAtStartOfDay().toString("yyyy-MM-dd'T'HH:mm:ss.SSS");
        String string2 = g22.l.h(oVar).toDateTimeAtCurrentTime().toString("yyyy-MM-dd'T'HH:mm:ss.SSS");
        String userDisplayName = bVar.f141928b.getUserDisplayName();
        this.f141945a = 1;
        Object objA = aVar2.a(userDisplayName, null, string, string2, this);
        return objA == aVar ? aVar : objA;
    }
}
