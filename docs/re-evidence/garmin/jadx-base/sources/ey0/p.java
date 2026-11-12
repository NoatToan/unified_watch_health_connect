package ey0;

import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcy0/n;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.repository.MultiDayActivitiesRepository$getEpicActivityEntrySummaries$2", f = "MultiDayActivitiesRepository.kt", l = {289}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends cy0.n>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f67217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f67218c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g0 g0Var, String str, t13.d<? super p> dVar) {
        super(1, dVar);
        this.f67217b = g0Var;
        this.f67218c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new p(this.f67217b, this.f67218c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends cy0.n>>> dVar) {
        return ((p) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67216a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<List<cy0.n>>> i0VarJ = g0.b(this.f67217b).j(this.f67218c);
        this.f67216a = 1;
        Object objAwait = i0VarJ.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
