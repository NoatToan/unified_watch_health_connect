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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Li41/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.trainingrediness.data.repo.TrainingReadinessRepo$getOneDayHRVStatus$2", f = "TrainingReadinessRepo.kt", l = {103}, m = "invokeSuspend", v = 2)
public final class h extends i implements l<t13.d<? super a0<i41.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f141951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f141952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f141953c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, o oVar, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f141952b = bVar;
        this.f141953c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f141952b, this.f141953c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<i41.b>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f141951a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<i41.b>> i0VarF = this.f141952b.f141927a.f(fz0.d.a(this.f141953c));
        this.f141951a = 1;
        Object objAwait = i0VarF.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
