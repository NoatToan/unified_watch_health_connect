package xu;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.translation.domain.BadgeTranslationsLoaderUseCase", f = "BadgeTranslationsLoaderUseCase.kt", l = {25}, m = "invoke", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f192207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f192208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f192209c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f192208b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f192207a = obj;
        this.f192209c |= Integer.MIN_VALUE;
        return this.f192208b.a(this);
    }
}
