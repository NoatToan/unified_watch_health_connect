package n70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetUploadConsentStatusUseCase", f = "GetUploadConsentStatusUseCase.kt", l = {81}, m = "getDeviceScreen", v = 2)
public final class m6 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f124413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l6 f124414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f124415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(l6 l6Var, t13.d<? super m6> dVar) {
        super(dVar);
        this.f124414b = l6Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f124413a = obj;
        this.f124415c |= Integer.MIN_VALUE;
        return l6.a(this.f124414b, this);
    }
}
