package g42;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationSelectionViewModel", f = "WeatherLocationSelectionViewModel.kt", l = {248}, m = "getDeviceLocation", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f75834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f75835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f75836c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q qVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f75835b = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f75834a = obj;
        this.f75836c |= Integer.MIN_VALUE;
        return q.x4(this.f75835b, this);
    }
}
