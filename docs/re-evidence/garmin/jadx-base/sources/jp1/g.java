package jp1;

import c83.a0;
import e23.l;
import ip1.h;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lip1/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.solarcharge.repository.EdgeSolarChargeRepository$getEdgeSolarChargeSummaryData$previousSummaryDataResult$1", f = "EdgeSolarChargeRepository.kt", l = {72}, m = "invokeSuspend", v = 2)
public final class g extends i implements l<t13.d<? super a0<h>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f99910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f99911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f99912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DateTime f99913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, long j8, DateTime dateTime, DateTime dateTime2, t13.d<? super g> dVar) {
        super(1, dVar);
        this.f99910b = bVar;
        this.f99911c = j8;
        this.f99912d = dateTime;
        this.f99913e = dateTime2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new g(this.f99910b, this.f99911c, this.f99912d, this.f99913e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<h>> dVar) {
        return ((g) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f99909a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        a aVar2 = this.f99910b.f99885a;
        fz0.c cVarB = fz0.d.b(this.f99912d);
        DateTime dateTimeMinusDays = this.f99913e.minusDays(1);
        dateTimeMinusDays.getClass();
        i0<a0<h>> i0VarA = aVar2.a(this.f99911c, cVarB, fz0.d.b(dateTimeMinusDays));
        this.f99909a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
