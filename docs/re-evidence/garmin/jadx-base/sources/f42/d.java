package f42;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lh42/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.weather.WeatherRepo$getHistoricalWeatherData$2", f = "WeatherRepo.kt", l = {21}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<h42.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f68871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f68872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f68873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f68874e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f68875f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f68876g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, int i14, int i15, long j8, String str, String str2, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f68871b = bVar;
        this.f68872c = i14;
        this.f68873d = i15;
        this.f68874e = j8;
        this.f68875f = str;
        this.f68876g = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f68871b, this.f68872c, this.f68873d, this.f68874e, this.f68875f, this.f68876g, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<h42.e>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f68870a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<h42.e>> i0VarB = this.f68871b.f68863a.b(this.f68872c, this.f68873d, this.f68874e, this.f68875f, this.f68876g);
        this.f68870a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
