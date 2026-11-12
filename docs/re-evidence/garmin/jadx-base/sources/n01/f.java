package n01;

import p005kotlin.Metadata;
import yc.h3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.pagingsource.FavoritesFoodPagingSource", f = "FavoritesFoodPagingSource.kt", l = {27}, m = "load", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h3.a f122122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f122123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f122124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f122125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f122126e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f122125d = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f122124c = obj;
        this.f122126e |= Integer.MIN_VALUE;
        return this.f122125d.e(null, this);
    }
}
