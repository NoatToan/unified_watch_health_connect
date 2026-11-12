package t32;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import o61.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lo61/p;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.vo2.reports.data.repo.VO2MaxRepositoryImpl$getWeeklyVO2MaxData$2", f = "VO2MaxRepositoryImpl.kt", l = {31}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<List<? extends p>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f162230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f162231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz0.c f162232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz0.c f162233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<String> f162234e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, fz0.c cVar, fz0.c cVar2, List<String> list, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f162231b = eVar;
        this.f162232c = cVar;
        this.f162233d = cVar2;
        this.f162234e = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f162231b, this.f162232c, this.f162233d, this.f162234e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends p>>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f162230a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        s32.a aVar2 = this.f162231b.f162235a;
        this.f162230a = 1;
        Object objA = aVar2.a(this.f162232c, this.f162233d, this.f162234e, this);
        return objA == aVar ? aVar : objA;
    }
}
