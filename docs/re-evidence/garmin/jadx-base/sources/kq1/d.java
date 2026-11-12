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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ljq1/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.steps.data.repository.StepsRepositoryImpl$getDailyStepsSummary$2", f = "StepsRepositoryImpl.kt", l = {34}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<jq1.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f106187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f106188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f106189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f106190d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, o oVar, o oVar2, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f106188b = gVar;
        this.f106189c = oVar;
        this.f106190d = oVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f106188b, this.f106189c, this.f106190d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<jq1.a>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f106187a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<jq1.a>> i0VarB = this.f106188b.f106199a.b(fz0.d.a(this.f106189c), fz0.d.a(this.f106190d), fz0.d.a(g22.l.d(o.INSTANCE)));
        this.f106187a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
