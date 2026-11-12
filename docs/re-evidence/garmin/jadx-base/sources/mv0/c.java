package mv0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.location.GCMLocationProvider", f = "GCMLocationProvider.kt", l = {60}, m = "getLastKnownLocation", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f121145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f121146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f121147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f121148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f121147c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f121146b = obj;
        this.f121148d |= Integer.MIN_VALUE;
        return this.f121147c.c(null, this);
    }
}
