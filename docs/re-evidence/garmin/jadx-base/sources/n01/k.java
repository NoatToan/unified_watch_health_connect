package n01;

import p005kotlin.Metadata;
import yc.h3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.pagingsource.FoodSearchPagingSource", f = "FoodSearchPagingSource.kt", l = {33}, m = "load", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h3.a f122135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f122136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f122137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f122138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f122139e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f122138d = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f122137c = obj;
        this.f122139e |= Integer.MIN_VALUE;
        return this.f122138d.e(null, this);
    }
}
