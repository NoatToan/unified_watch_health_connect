package i42;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.webtranslation.TranslationDAO", f = "TranslationDAO.kt", l = {34, 36}, m = "getTranslationsOnlyIfInstalled-ASfMiVo$suspendImpl", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f91003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f91004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f91005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f91006d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f91005c = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f91004b = obj;
        this.f91006d |= Integer.MIN_VALUE;
        return h.d(this.f91005c, null, null, null, this);
    }
}
