package te0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domainfamilyaccounts.domain.FetchViewableAccountsUseCase", f = "FetchViewableAccountsUseCase.kt", l = {34}, m = "invoke", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f163916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f163917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f163918c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t13.d<? super c> dVar2) {
        super(dVar2);
        this.f163917b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f163916a = obj;
        this.f163918c |= Integer.MIN_VALUE;
        return this.f163917b.a(this);
    }
}
