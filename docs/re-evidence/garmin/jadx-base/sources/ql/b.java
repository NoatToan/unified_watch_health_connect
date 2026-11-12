package ql;

import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lnl/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.acclimation.reports.data.repository.PulseOxAcclimationRepositoryImpl$getDailyPulseOxAcclimationReport$2", f = "PulseOxAcclimationRepositoryImpl.kt", l = {9}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super a0<nl.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f145200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f145201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz0.c f145202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz0.c f145203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, fz0.c cVar, fz0.c cVar2, t13.d<? super b> dVar2) {
        super(1, dVar2);
        this.f145201b = dVar;
        this.f145202c = cVar;
        this.f145203d = cVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f145201b, this.f145202c, this.f145203d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<nl.a>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f145200a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        ol.a aVar2 = this.f145201b.f145208a;
        this.f145200a = 1;
        Object objA = aVar2.a(this.f145202c, this.f145203d, this);
        return objA == aVar ? aVar : objA;
    }
}
