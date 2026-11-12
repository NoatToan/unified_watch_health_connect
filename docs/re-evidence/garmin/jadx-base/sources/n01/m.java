package n01;

import p005kotlin.Metadata;
import yc.h3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.pagingsource.FoodSuggestionsPagingSource", f = "FoodSuggestionsPagingSource.kt", l = {32}, m = "load", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h3.a f122143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f122144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f122145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f122146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f122147e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f122146d = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f122145c = obj;
        this.f122147e |= Integer.MIN_VALUE;
        return this.f122146d.e(null, this);
    }
}
