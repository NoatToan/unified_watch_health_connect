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
@v13.e(c = "com.garmin.android.apps.connectmobile.vo2.reports.data.repo.VO2MaxRepositoryImpl$getDailyVO2MaxData$2", f = "VO2MaxRepositoryImpl.kt", l = {23}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super a0<List<? extends p>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f162221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f162222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz0.c f162223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz0.c f162224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<String> f162225e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, fz0.c cVar, fz0.c cVar2, List<String> list, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f162222b = eVar;
        this.f162223c = cVar;
        this.f162224d = cVar2;
        this.f162225e = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f162222b, this.f162223c, this.f162224d, this.f162225e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends p>>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f162221a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        s32.a aVar2 = this.f162222b.f162235a;
        this.f162221a = 1;
        Object objC = aVar2.c(this.f162223c, this.f162224d, this.f162225e, this);
        return objC == aVar ? aVar : objC;
    }
}
