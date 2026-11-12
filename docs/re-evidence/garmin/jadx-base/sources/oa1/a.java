package oa1;

import c83.a0;
import e23.l;
import o13.r;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lna1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.powercurve.repository.PowerCurveRepository$getDailyPowerCurveSummary$2", f = "PowerCurveRepository.kt", l = {21}, m = "invokeSuspend", v = 2)
public final class a extends i implements l<d<? super a0<na1.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f131077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f131078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DateTime f131079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f131080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, DateTime dateTime, DateTime dateTime2, String str, d<? super a> dVar) {
        super(1, dVar);
        this.f131077b = cVar;
        this.f131078c = dateTime;
        this.f131079d = dateTime2;
        this.f131080e = str;
    }

    @Override // v13.a
    public final d<Unit> create(d<?> dVar) {
        return new a(this.f131077b, this.f131078c, this.f131079d, this.f131080e, dVar);
    }

    @Override // e23.l
    public final Object invoke(d<? super a0<na1.b>> dVar) {
        return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131076a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        ka1.a aVar2 = this.f131077b.f131084a;
        fz0.c cVarB = fz0.d.b(this.f131078c);
        fz0.c cVarB2 = fz0.d.b(this.f131079d);
        this.f131076a = 1;
        Object objA = aVar2.a(cVarB, cVarB2, this.f131080e, this);
        return objA == aVar ? aVar : objA;
    }
}
