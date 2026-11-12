package a91;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.personalizedinsights.data.LanguageSelectionRepository", f = "LanguageSelectionRepository.kt", l = {50}, m = "getSelectedLanguage", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f2149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f2150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2151c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f2150b = mVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f2149a = obj;
        this.f2151c |= Integer.MIN_VALUE;
        return this.f2150b.a(this);
    }
}
