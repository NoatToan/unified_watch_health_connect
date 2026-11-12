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
@v13.e(c = "com.garmin.android.apps.connectmobile.solarcharge.repository.EdgeSolarChargeRepository$getEdgeSolarChargeSummaryData$currentSummaryDataResult$1", f = "EdgeSolarChargeRepository.kt", l = {63}, m = "invokeSuspend", v = 2)
public final class f extends i implements l<t13.d<? super a0<h>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f99905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f99906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f99907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DateTime f99908e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, long j8, DateTime dateTime, DateTime dateTime2, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f99905b = bVar;
        this.f99906c = j8;
        this.f99907d = dateTime;
        this.f99908e = dateTime2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f99905b, this.f99906c, this.f99907d, this.f99908e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<h>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f99904a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<h>> i0VarA = this.f99905b.f99885a.a(this.f99906c, fz0.d.b(this.f99907d), fz0.d.b(this.f99908e));
        this.f99904a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
