package p92;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.android.consent.GarminConsent", f = "GarminConsent.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "fetchManagedAccountConsent")
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f136613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q92.x f136614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s92.l f136615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f136616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f136617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f136618f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f136617e = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f136616d = obj;
        this.f136618f |= Integer.MIN_VALUE;
        return this.f136617e.k(null, null, this);
    }
}
