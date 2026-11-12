package m12;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.domain.GetAvatarsUseCase", f = "GetAvatarsUseCase.kt", l = {47}, m = "getAvatarsWithDefaultSelection", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f115830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f115831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f115832c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f115831b = kVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f115830a = obj;
        this.f115832c |= Integer.MIN_VALUE;
        return this.f115831b.a(null, this);
    }
}
