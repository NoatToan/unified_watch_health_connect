package ey0;

import java.util.List;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.repository.MultiDayActivitiesRepository$setEpicActivityDailyNotes$2", f = "MultiDayActivitiesRepository.kt", l = {392}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.l<t13.d<? super c83.a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f67140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f67141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<cy0.l> f67142d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(g0 g0Var, String str, List<cy0.l> list, t13.d<? super c0> dVar) {
        super(1, dVar);
        this.f67140b = g0Var;
        this.f67141c = str;
        this.f67142d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c0(this.f67140b, this.f67141c, this.f67142d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Unit>> dVar) {
        return ((c0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67139a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<c83.a0<Unit>> i0VarK = g0.b(this.f67140b).k(this.f67141c, this.f67142d);
        this.f67139a = 1;
        Object objAwait = i0VarK.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
