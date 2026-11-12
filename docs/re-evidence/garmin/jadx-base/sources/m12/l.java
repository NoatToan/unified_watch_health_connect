package m12;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.domain.GetLoginTokenUseCase", f = "GetLoginTokenUseCase.kt", l = {40, 52}, m = "invoke", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f115839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f115840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f115841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f115842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f115843e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f115842d = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f115841c = obj;
        this.f115843e |= Integer.MIN_VALUE;
        return this.f115842d.a(null, this);
    }
}
