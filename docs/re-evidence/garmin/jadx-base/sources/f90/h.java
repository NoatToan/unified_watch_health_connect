package f90;

import o13.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.consent.FetchStartupConsentsDataUseCase", f = "FetchStartupConsentsDataUseCase.kt", l = {36, 39}, m = "checkUploadConsentParentalApproval", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f69988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f69989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f69990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f69991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69992e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, t13.d<? super h> dVar) {
        super(dVar);
        this.f69991d = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f69990c = obj;
        this.f69992e |= Integer.MIN_VALUE;
        int i14 = f.f69980d;
        return this.f69991d.b(this);
    }
}
