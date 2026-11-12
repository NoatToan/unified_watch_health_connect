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
@v13.e(c = "com.garmin.android.apps.connectmobile.incidentdetection.api.IncidentDetectionRepository$endEmergency$2", f = "IncidentDetectionRepository.kt", l = {49}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<u>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f60703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jq0.c f60704c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, jq0.c cVar2, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f60703b = cVar;
        this.f60704c = cVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f60703b, this.f60704c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<u>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60702a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<u>> i0VarA = this.f60703b.f60701a.a(this.f60704c);
        this.f60702a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
