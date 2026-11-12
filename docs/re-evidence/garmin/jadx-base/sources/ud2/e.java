package ud2;

import java.net.URL;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.geolocationrestapi.GeoLocationServiceKt", f = "GeoLocationService.kt", l = {67}, m = "locateMe$httpGET")
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public URL f170031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f170032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f170033c;

    public e(t13.d<? super e> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f170032b = obj;
        this.f170033c |= Integer.MIN_VALUE;
        return og.a.q(null, null, this);
    }
}
