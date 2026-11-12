package wt2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@v13.e(c = "com.garmin.net.ephemeris.gdi.EphemerisDataHandler", f = "EphemerisDataHandler.kt", l = {548}, m = "getOAuth2AccessToken")
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f187162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f187163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f187164c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f187163b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f187162a = obj;
        this.f187164c |= Integer.MIN_VALUE;
        a.C3482a c3482a = a.f187141k;
        return this.f187163b.a(this);
    }
}
