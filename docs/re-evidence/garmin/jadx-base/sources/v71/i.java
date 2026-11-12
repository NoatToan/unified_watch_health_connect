package v71;

import g81.u;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.endurancescore.data.repository.EnduranceStaminaTrendReportsPageRepository", f = "EnduranceStaminaTrendReportsPageRepository.kt", l = {34, 39, 50}, m = "getPageData", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o82.a f176152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f176153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f176154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f176155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f176156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f176157f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f176156e = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f176155d = obj;
        this.f176157f |= Integer.MIN_VALUE;
        return this.f176156e.a(null, this);
    }
}
