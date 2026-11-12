package n01;

import p005kotlin.Metadata;
import yc.h3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.pagingsource.RecipesPagingSource", f = "RecipesPagingSource.kt", l = {28}, m = "load", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h3.a f122153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f122154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f122155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f122156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f122157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f122156d = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f122155c = obj;
        this.f122157e |= Integer.MIN_VALUE;
        return this.f122156d.e(null, this);
    }
}
