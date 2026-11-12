package ey0;

import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lps/m;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.repository.MultiDayActivitiesRepository$getEpicActivityPolylines$2", f = "MultiDayActivitiesRepository.kt", l = {295}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends ps.m>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f67220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f67221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f67222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f67223e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g0 g0Var, String str, int i14, int i15, t13.d<? super q> dVar) {
        super(1, dVar);
        this.f67220b = g0Var;
        this.f67221c = str;
        this.f67222d = i14;
        this.f67223e = i15;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new q(this.f67220b, this.f67221c, this.f67222d, this.f67223e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends ps.m>>> dVar) {
        return ((q) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67219a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<List<ps.m>>> i0VarB = g0.b(this.f67220b).b(this.f67221c, new Integer(this.f67222d), new Integer(this.f67223e));
        this.f67219a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
