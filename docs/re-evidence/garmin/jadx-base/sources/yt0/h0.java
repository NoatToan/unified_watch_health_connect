package yt0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.BadgeTranslationsRepository", f = "BadgeTranslationsRepository.kt", l = {30}, m = "getBadgeTranslations", v = 2)
public final class h0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f199500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f199501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f199502c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, t13.d<? super h0> dVar) {
        super(dVar);
        this.f199501b = i0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f199500a = obj;
        this.f199502c |= Integer.MIN_VALUE;
        return this.f199501b.b(null, null, this);
    }
}
