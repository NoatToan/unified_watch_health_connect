package f90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.consent.FetchStartupConsentsDataUseCase", f = "FetchStartupConsentsDataUseCase.kt", l = {55}, m = "checkUploadConsent", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f69985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f69986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f69987c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f69986b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f69985a = obj;
        this.f69987c |= Integer.MIN_VALUE;
        int i14 = f.f69980d;
        return this.f69986b.a(this);
    }
}
