package oa1;

import c83.a0;
import e23.l;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lna1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.powercurve.repository.PowerCurveRepository$getHistoricalPowerCurveSummary$2", f = "PowerCurveRepository.kt", l = {30}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<d<? super a0<na1.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f131082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f131083c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, d<? super b> dVar) {
        super(1, dVar);
        this.f131082b = cVar;
        this.f131083c = str;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new b(this.f131082b, this.f131083c, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super a0<na1.b>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131081a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        ka1.a aVar2 = this.f131082b.f131084a;
        this.f131081a = 1;
        Object objB = aVar2.b(this.f131083c, this);
        return objB == aVar ? aVar : objB;
    }
}
