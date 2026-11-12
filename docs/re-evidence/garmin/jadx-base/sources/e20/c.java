package e20;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.repo.ConsentRepo", f = "ConsentRepo.kt", l = {34}, m = "getPartnerConsumerDetails", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f62595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f62596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f62597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f62598d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f62597c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f62596b = obj;
        this.f62598d |= Integer.MIN_VALUE;
        return this.f62597c.b(null, this);
    }
}
