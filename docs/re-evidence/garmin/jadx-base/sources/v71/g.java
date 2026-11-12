package v71;

import b63.o;
import o13.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.endurancescore.data.repository.EnduranceStaminaDailyReportsPageRepository", f = "EnduranceStaminaDailyReportsPageRepository.kt", l = {28, 30, 44}, m = "getPageData", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f176140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f176141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g81.p f176142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f176143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f176144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f176145f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f176144e = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f176143d = obj;
        this.f176145f |= Integer.MIN_VALUE;
        return this.f176144e.a(null, this);
    }
}
