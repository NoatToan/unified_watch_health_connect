package pz1;

import b63.o;
import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lkr1/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trainingrediness.data.repo.TrainingReadinessRepo$getDailyStressSummary$2", f = "TrainingReadinessRepo.kt", l = {92}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<List<? extends kr1.a>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f141937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f141938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f141939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, o oVar, o oVar2, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f141937b = bVar;
        this.f141938c = oVar;
        this.f141939d = oVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f141937b, this.f141938c, this.f141939d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends kr1.a>>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141936a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<kr1.a>>> i0VarB = this.f141937b.f141927a.b(fz0.d.a(this.f141938c), fz0.d.a(this.f141939d));
        this.f141936a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
