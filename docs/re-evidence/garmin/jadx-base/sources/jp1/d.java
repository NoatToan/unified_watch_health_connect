package jp1;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lip1/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.solarcharge.repository.EdgeSolarChargeRepository$getEdgeSolarChargeData$2", f = "EdgeSolarChargeRepository.kt", l = {31}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<ip1.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f99892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f99893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f99894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DateTime f99895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f99896f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, long j8, DateTime dateTime, DateTime dateTime2, boolean z14, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f99892b = bVar;
        this.f99893c = j8;
        this.f99894d = dateTime;
        this.f99895e = dateTime2;
        this.f99896f = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f99892b, this.f99893c, this.f99894d, this.f99895e, this.f99896f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<ip1.c>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f99891a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<ip1.c>> i0VarC = this.f99892b.f99885a.c(this.f99893c, fz0.d.b(this.f99894d), fz0.d.b(this.f99895e), this.f99896f);
        this.f99891a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
