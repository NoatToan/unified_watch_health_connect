package n01;

import p005kotlin.Metadata;
import yc.h3;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.data.repository.pagingsource.CustomFoodsPagingSource", f = "CustomFoodsPagingSource.kt", l = {25}, m = "load", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h3.a f122106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f122107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f122108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f122109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f122110e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f122109d = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f122108c = obj;
        this.f122110e |= Integer.MIN_VALUE;
        return this.f122109d.e(null, this);
    }
}
