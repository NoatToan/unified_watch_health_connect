package op1;

import b63.o;
import c83.a0;
import e23.l;
import np1.f;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lnp1/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.solarintensity.data.repo.SolarIntensityRepositoryImpl$getDailySolarIntensity$2", f = "SolarIntensityRepositoryImpl.kt", l = {17}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<d<? super a0<f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f133174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f133175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f133176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f133177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f133178e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, long j8, o oVar, o oVar2, d<? super b> dVar) {
        super(1, dVar);
        this.f133175b = cVar;
        this.f133176c = j8;
        this.f133177d = oVar;
        this.f133178e = oVar2;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new b(this.f133175b, this.f133176c, this.f133177d, this.f133178e, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super a0<f>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133174a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        mp1.a aVar2 = this.f133175b.f133179a;
        fz0.c cVarA = fz0.d.a(this.f133177d);
        fz0.c cVarA2 = fz0.d.a(this.f133178e);
        this.f133174a = 1;
        Object objA = aVar2.a(this.f133176c, cVarA, cVarA2, this);
        return objA == aVar ? aVar : objA;
    }
}
