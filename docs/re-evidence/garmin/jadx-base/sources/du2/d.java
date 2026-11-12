package du2;

import android.location.Location;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "com.garmin.net.weather.gdi.WeatherDataHandler", f = "WeatherDataHandler.kt", l = {225, 237, 239, 261, 267}, m = "queryWeatherData")
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f61283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rs2.c f61284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f61285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Location f61286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f61287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a f61288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f61289g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f61288f = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f61287e = obj;
        this.f61289g |= Integer.MIN_VALUE;
        return a.a(this.f61288f, null, null, this);
    }
}
