package pz1;

import b63.o;
import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lkm1/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trainingrediness.data.repo.TrainingReadinessRepo$getDailySleepChartData$2", f = "TrainingReadinessRepo.kt", l = {98}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<km1.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f141934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f141935c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, o oVar, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f141934b = bVar;
        this.f141935c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f141934b, this.f141935c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<km1.c>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141933a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<km1.c>> i0VarC = this.f141934b.f141927a.c(fz0.d.a(this.f141935c), 60);
        this.f141933a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
