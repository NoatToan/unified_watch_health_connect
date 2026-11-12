package dq0;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import tj1.u;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ltj1/u;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.incidentdetection.api.IncidentDetectionRepository$startCyclingIncident$2", f = "IncidentDetectionRepository.kt", l = {37}, m = "invokeSuspend", v = 2)
public final class f extends i implements l<t13.d<? super a0<u>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f60709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jq0.b f60710c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c cVar, jq0.b bVar, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f60709b = cVar;
        this.f60710c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f60709b, this.f60710c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<u>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60708a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<u>> i0VarB = this.f60709b.f60701a.b(this.f60710c);
        this.f60708a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
