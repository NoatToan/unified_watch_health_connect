package dq1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.domain.AgeActionRequestedUseCase", f = "AgeActionRequestedUseCase.kt", l = {14, 15, 17}, m = "invoke", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f60713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f60714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f60715c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f60714b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60713a = obj;
        this.f60715c |= Integer.MIN_VALUE;
        return this.f60714b.a(this);
    }
}
