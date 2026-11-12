package l70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.ATPTypesRepo", f = "ATPTypesRepo.kt", l = {34}, m = "fetchFromServer", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f110590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f110591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110592c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f110591b = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f110590a = obj;
        this.f110592c |= Integer.MIN_VALUE;
        b bVar = b.f110596a;
        return this.f110591b.a(null, this);
    }
}
