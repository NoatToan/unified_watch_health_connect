package g42;

import android.location.Location;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationPreferenceViewModel", f = "WeatherLocationPreferenceViewModel.kt", l = {231}, m = "populateCurrentFields", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Location f75804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f75805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.weather.defaultlocation.b f75806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f75807d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.garmin.android.apps.connectmobile.weather.defaultlocation.b bVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f75806c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f75805b = obj;
        this.f75807d |= Integer.MIN_VALUE;
        com.garmin.android.apps.connectmobile.weather.defaultlocation.b.a aVar = com.garmin.android.apps.connectmobile.weather.defaultlocation.b.f47923j;
        return this.f75806c.A4(null, this);
    }
}
