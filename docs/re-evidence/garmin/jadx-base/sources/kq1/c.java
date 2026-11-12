package kq1;

import b63.o;
import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ljq1/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.steps.data.repository.StepsRepositoryImpl$getDailyStepsStats$2", f = "StepsRepositoryImpl.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<jq1.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f106185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f106186c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, o oVar, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f106185b = gVar;
        this.f106186c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f106185b, this.f106186c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<jq1.c>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106184a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<jq1.c>> i0VarD = this.f106185b.f106199a.d(fz0.d.a(this.f106186c));
        this.f106184a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
