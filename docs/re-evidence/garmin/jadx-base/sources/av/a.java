package av;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.service.retrofit.BadgeTranslationsRepo", f = "BadgeTranslationsRepo.kt", l = {26, 31}, m = "getBadgesTranslations", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f13067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13068d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, t13.d<? super a> dVar) {
        super(dVar);
        this.f13067c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f13066b = obj;
        this.f13068d |= Integer.MIN_VALUE;
        return this.f13067c.a(null, this);
    }
}
