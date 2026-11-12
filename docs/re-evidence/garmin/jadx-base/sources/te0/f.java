package te0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.domainfamilyaccounts.domain.GenerateAuthorizedUriUseCase", f = "GenerateAuthorizedUriUseCase.kt", l = {31, 33}, m = "invoke", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d22.a.C1227a f163925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f163926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f163927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f163928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f163927c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f163926b = obj;
        this.f163928d |= Integer.MIN_VALUE;
        return this.f163927c.a(null, false, this);
    }
}
