package av;

import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.service.retrofit.BadgeTranslationsRepo", f = "BadgeTranslationsRepo.kt", l = {46}, m = "getBadgesTranslationsLastModifiedDate", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Logger f13075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f13077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13078d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f13077c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f13076b = obj;
        this.f13078d |= Integer.MIN_VALUE;
        int i14 = e.f13079d;
        return this.f13077c.b(null, this);
    }
}
