package dj2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository", f = "CustomerManagementRepository.kt", l = {266, 272}, m = "addAddressWithPhoneNumber", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gj2.a f60001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p005kotlin.jvm.internal.r0 f60002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f60003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f60004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f60005e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f60004d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60003c = obj;
        this.f60005e |= Integer.MIN_VALUE;
        return this.f60004d.c(null, null, this);
    }
}
