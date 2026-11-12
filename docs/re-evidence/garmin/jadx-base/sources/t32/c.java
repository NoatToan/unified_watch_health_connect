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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lo61/p;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.vo2.reports.data.repo.VO2MaxRepositoryImpl$getLatestVO2MaxData$2", f = "VO2MaxRepositoryImpl.kt", l = {15}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<p>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f162226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f162227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz0.c f162228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<String> f162229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, fz0.c cVar, List<String> list, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f162227b = eVar;
        this.f162228c = cVar;
        this.f162229d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f162227b, this.f162228c, this.f162229d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<p>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f162226a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        s32.a aVar2 = this.f162227b.f162235a;
        this.f162226a = 1;
        Object objB = aVar2.b(this.f162228c, this.f162229d, this);
        return objB == aVar ? aVar : objB;
    }
}
