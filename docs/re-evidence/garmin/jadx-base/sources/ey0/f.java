package ey0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcy0/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.repository.MultiDayActivitiesRepository$getActivityResources$2", f = "MultiDayActivitiesRepository.kt", l = {372}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.l<t13.d<? super c83.a0<List<? extends cy0.c>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f67163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f67164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<Long> f67165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g0 g0Var, String str, List<Long> list, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f67163b = g0Var;
        this.f67164c = str;
        this.f67165d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f67163b, this.f67164c, this.f67165d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<List<? extends cy0.c>>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67162a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        dy0.a aVar2 = (dy0.a) this.f67163b.f67175b.getValue();
        this.f67162a = 1;
        Object objB = aVar2.b(this.f67164c, p13.x.k("IMAGES", "WEATHER"), this.f67165d, this);
        return objB == aVar ? aVar : objB;
    }
}
