package te0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domainfamilyaccounts.domain.GetAccountAdministratorUseCase", f = "GetAccountAdministratorUseCase.kt", l = {16}, m = "invoke", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f163929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f163930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f163931c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f163930b = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f163929a = obj;
        this.f163931c |= Integer.MIN_VALUE;
        return this.f163930b.a(this);
    }
}
