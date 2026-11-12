package dj2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.customermanagementlib.data.CustomerManagementRepository", f = "CustomerManagementRepository.kt", l = {121}, m = "addAddress", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f59985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f59986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f59987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f59986b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f59985a = obj;
        this.f59987c |= Integer.MIN_VALUE;
        return this.f59986b.b(null, this);
    }
}
