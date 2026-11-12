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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lpl/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.acclimation.reports.data.repository.PulseOxAcclimationRepositoryImpl$getWeeklyPulseOxAcclimationReport$2", f = "PulseOxAcclimationRepositoryImpl.kt", l = {13}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<pl.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f145204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f145205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz0.c f145206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz0.c f145207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, fz0.c cVar, fz0.c cVar2, t13.d<? super c> dVar2) {
        super(1, dVar2);
        this.f145205b = dVar;
        this.f145206c = cVar;
        this.f145207d = cVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f145205b, this.f145206c, this.f145207d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<pl.b>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f145204a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        ol.a aVar2 = this.f145205b.f145208a;
        this.f145204a = 1;
        Object objB = aVar2.b(this.f145206c, this.f145207d, this);
        return objB == aVar ? aVar : objB;
    }
}
