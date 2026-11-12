package wn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.felica.ui.account.developer.FelicaConsoleViewModel", f = "FelicaConsoleViewModel.kt", l = {420}, m = "executeUseCase", v = 2)
public final class j<R> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f186371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.l f186372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f186373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.felica.ui.account.developer.a f186374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f186375e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f186374d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f186373c = obj;
        this.f186375e |= Integer.MIN_VALUE;
        return this.f186374d.y4(null, null, null, this);
    }
}
