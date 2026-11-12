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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lh42/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.weather.WeatherRepo$getForecastWeatherData$2", f = "WeatherRepo.kt", l = {31}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<h42.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f68864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f68865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f68866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f68867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f68868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f68869f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, int i14, int i15, long j8, int i16, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f68865b = bVar;
        this.f68866c = i14;
        this.f68867d = i15;
        this.f68868e = j8;
        this.f68869f = i16;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f68865b, this.f68866c, this.f68867d, this.f68868e, this.f68869f, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<h42.b>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f68864a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<h42.b>> i0VarA = this.f68865b.f68863a.a(this.f68866c, this.f68867d, this.f68868e, this.f68869f);
        this.f68864a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
