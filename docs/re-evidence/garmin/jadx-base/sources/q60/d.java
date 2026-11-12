package q60;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ln60/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.criticalswimspeed.summary.repository.DefaultCriticalSwimSpeedSummaryRepository$getCriticalSwimSpeedSummary$2", f = "CriticalSwimSpeedSummaryRepository.kt", l = {34}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<n60.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f143165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f143166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f143167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f143168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f143169e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, DateTime dateTime, DateTime dateTime2, String str, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f143166b = eVar;
        this.f143167c = dateTime;
        this.f143168d = dateTime2;
        this.f143169e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f143166b, this.f143167c, this.f143168d, this.f143169e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<n60.b>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f143165a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<n60.b>> i0VarB = this.f143166b.f143170a.b(fz0.d.b(this.f143167c), fz0.d.b(this.f143168d), this.f143169e);
        this.f143165a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
