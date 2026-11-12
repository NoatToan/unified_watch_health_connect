package dj2;

import com.google.mlkit.common.MlKitException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository", f = "CustomerManagementRepository.kt", l = {MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD}, m = "getCountries", v = 2)
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f60143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f60144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60145c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a aVar, t13.d<? super v> dVar) {
        super(dVar);
        this.f60144b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60143a = obj;
        this.f60145c |= Integer.MIN_VALUE;
        return this.f60144b.l(this);
    }
}
