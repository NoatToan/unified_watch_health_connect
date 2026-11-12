package ey0;

import am.w0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lam/w0;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.repository.MultiDayActivitiesRepository$getMultiDayActivityLifetimeStats$2", f = "MultiDayActivitiesRepository.kt", l = {246}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends w0>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f67244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f67245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f67246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f67247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<String> f67248f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(g0 g0Var, String str, String str2, boolean z14, List<String> list, t13.d<? super v> dVar) {
        super(1, dVar);
        this.f67244b = g0Var;
        this.f67245c = str;
        this.f67246d = str2;
        this.f67247e = z14;
        this.f67248f = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new v(this.f67244b, this.f67245c, this.f67246d, this.f67247e, this.f67248f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends w0>>> dVar) {
        return ((v) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67243a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        dy0.c cVar = (dy0.c) this.f67244b.f67181h.getValue();
        this.f67243a = 1;
        Object objB = cVar.b(this.f67245c, this.f67246d, this.f67247e, this.f67248f, this);
        return objB == aVar ? aVar : objB;
    }
}
