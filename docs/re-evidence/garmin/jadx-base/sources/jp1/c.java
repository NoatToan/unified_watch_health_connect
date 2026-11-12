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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lip1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.solarcharge.repository.EdgeSolarChargeRepository$getEdgeSolarChargeDailyData$2", f = "EdgeSolarChargeRepository.kt", l = {46}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<ip1.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f99887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f99888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f99889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DateTime f99890e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, long j8, DateTime dateTime, DateTime dateTime2, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f99887b = bVar;
        this.f99888c = j8;
        this.f99889d = dateTime;
        this.f99890e = dateTime2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f99887b, this.f99888c, this.f99889d, this.f99890e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<ip1.b>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f99886a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<ip1.b>> i0VarB = this.f99887b.f99885a.b(this.f99888c, fz0.d.d(this.f99889d), fz0.d.d(this.f99890e));
        this.f99886a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
