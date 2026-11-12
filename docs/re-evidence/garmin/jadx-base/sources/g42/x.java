package g42;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationSelectionViewModel", f = "WeatherLocationSelectionViewModel.kt", l = {190}, m = "setDeviceLocation", v = 2)
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Double f75844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Double f75845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f75846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f75847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f75848e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(q qVar, t13.d<? super x> dVar) {
        super(dVar);
        this.f75847d = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f75846c = obj;
        this.f75848e |= Integer.MIN_VALUE;
        return this.f75847d.B4(null, null, this);
    }
}
