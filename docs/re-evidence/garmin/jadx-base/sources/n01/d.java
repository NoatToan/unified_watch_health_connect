package n01;

import p005kotlin.Metadata;
import yc.h3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.pagingsource.CustomMealsPagingSource", f = "CustomMealsPagingSource.kt", l = {28}, m = "load", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h3.a f122114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f122115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f122116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f122117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f122118e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f122117d = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f122116c = obj;
        this.f122118e |= Integer.MIN_VALUE;
        return this.f122117d.e(null, this);
    }
}
