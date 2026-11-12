package o8;

import android.health.connect.HealthConnectManager;
import android.health.connect.LocalTimeRangeFilter;
import android.health.connect.TimeInstantRangeFilter;
import android.health.connect.TimeRangeFilter;
import android.health.connect.datatypes.Record;
import e23.l;
import java.time.LocalDateTime;
import o13.r;
import o53.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t8.n;
import y8.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteRecords$4", f = "HealthConnectClientUpsideDownImpl.kt", l = {634}, m = "invokeSuspend")
public final class f extends v13.i implements l<t13.d<? super Void>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k23.d f130817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f130818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f130819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.d<? extends q0> f130820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b9.a f130821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, k23.d<? extends q0> dVar, b9.a aVar, t13.d<? super f> dVar2) {
        super(1, dVar2);
        this.f130819c = eVar;
        this.f130820d = dVar;
        this.f130821e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f130819c, this.f130820d, this.f130821e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Void> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        TimeRangeFilter timeRangeFilterG;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f130818b;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        k23.d<? extends q0> dVar = this.f130820d;
        this.f130817a = dVar;
        this.f130818b = 1;
        k kVar = new k(u13.f.b(this), 1);
        kVar.q();
        e eVar = this.f130819c;
        HealthConnectManager healthConnectManager = eVar.f130807e;
        Class<? extends Record> clsC = t8.k.c(dVar);
        b9.a aVar2 = this.f130821e;
        aVar2.getClass();
        LocalDateTime localDateTime = aVar2.f16938d;
        LocalDateTime localDateTime2 = aVar2.f16937c;
        if (localDateTime2 == null && localDateTime == null) {
            TimeInstantRangeFilter timeInstantRangeFilterBuild = n.d().setStartTime(aVar2.f16935a).setEndTime(aVar2.f16936b).build();
            timeInstantRangeFilterBuild.getClass();
            timeRangeFilterG = n.g(timeInstantRangeFilterBuild);
        } else {
            LocalTimeRangeFilter localTimeRangeFilterBuild = n.a().setStartTime(localDateTime2).setEndTime(localDateTime).build();
            localTimeRangeFilterBuild.getClass();
            timeRangeFilterG = n.g(localTimeRangeFilterBuild);
        }
        healthConnectManager.deleteRecords(clsC, timeRangeFilterG, eVar.f130805c, new h7.f(kVar));
        Object objP = kVar.p();
        return objP == aVar ? aVar : objP;
    }
}
