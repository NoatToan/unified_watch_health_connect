package xu;

import p005kotlin.Metadata;
import v13.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.translation.domain.BadgeTranslationsUseCase", f = "BadgeTranslationsUseCase.kt", l = {79, 81, 88, 89, 90, 93}, m = "handleResults", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f192223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.badges.service.model.i f192224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f192225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f192226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f192227e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f192226d = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f192225c = obj;
        this.f192227e |= Integer.MIN_VALUE;
        int i14 = c.f192210d;
        return this.f192226d.b(null, null, null, null, this);
    }
}
