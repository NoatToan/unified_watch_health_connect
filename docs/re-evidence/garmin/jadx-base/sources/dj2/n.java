package dj2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository", f = "CustomerManagementRepository.kt", l = {104, 110}, m = "getAddress", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fj2.a f60089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f60090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f60091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f60092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f60093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a aVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f60092d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60091c = obj;
        this.f60093e |= Integer.MIN_VALUE;
        return this.f60092d.h(null, false, this);
    }
}
