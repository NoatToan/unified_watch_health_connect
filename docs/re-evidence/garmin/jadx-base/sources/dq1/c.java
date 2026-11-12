package dq1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.domain.AgeActionRequestedUseCase", f = "AgeActionRequestedUseCase.kt", l = {25}, m = "isAgeActionRequired", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f60716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f60717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60718c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f60717b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60716a = obj;
        this.f60718c |= Integer.MIN_VALUE;
        int i14 = a.f60711b;
        return this.f60717b.b(this);
    }
}
