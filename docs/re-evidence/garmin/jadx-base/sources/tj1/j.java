package tj1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.safetyfeatures.network.EccRepository", f = "EccRepository.kt", l = {20, 22}, m = "validateGEOSBillingCountry", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f165146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f165147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f165148c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f165147b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f165146a = obj;
        this.f165148c |= Integer.MIN_VALUE;
        return this.f165147b.b(this);
    }
}
