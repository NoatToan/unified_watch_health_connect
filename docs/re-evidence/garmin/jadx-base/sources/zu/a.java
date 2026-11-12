package zu;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.service.domain.AddBadgeTranslationsUseCase", f = "AddBadgeTranslationsUseCase.kt", l = {13}, m = "invoke", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.l f207012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f207013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f207014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f207015d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f207014c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f207013b = obj;
        this.f207015d |= Integer.MIN_VALUE;
        return this.f207014c.a(null, this);
    }
}
