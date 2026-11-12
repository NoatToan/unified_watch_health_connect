package tv0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.domain.ShowAutoLoggingBannerUseCase", f = "ShowAutoLoggingBannerUseCase.kt", l = {29}, m = "invoke", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f166644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f166645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f166646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f166645b = vVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f166644a = obj;
        this.f166646c |= Integer.MIN_VALUE;
        return this.f166645b.a(null, this);
    }
}
