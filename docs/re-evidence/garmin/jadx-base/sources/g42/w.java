package g42;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationSelectionViewModel", f = "WeatherLocationSelectionViewModel.kt", l = {233}, m = "getUserCountryLocation", v = 2)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f75841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f75842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f75843c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(q qVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f75842b = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f75841a = obj;
        this.f75843c |= Integer.MIN_VALUE;
        return q.y4(this.f75842b, this);
    }
}
