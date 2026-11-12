package a91;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.data.LanguageSelectionRepository", f = "LanguageSelectionRepository.kt", l = {31}, m = "getSupportedLanguages", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f2161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2162c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m mVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f2161b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f2160a = obj;
        this.f2162c |= Integer.MIN_VALUE;
        return this.f2161b.c(false, this);
    }
}
