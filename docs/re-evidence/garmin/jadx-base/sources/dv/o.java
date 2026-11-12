package dv;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.bic.SetupWizardRepo", f = "SetupWizardRepo.kt", l = {30}, m = "saveUserSettings", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f61349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f61350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f61351c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f61350b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f61349a = obj;
        this.f61351c |= Integer.MIN_VALUE;
        return this.f61350b.b(null, null, this);
    }
}
