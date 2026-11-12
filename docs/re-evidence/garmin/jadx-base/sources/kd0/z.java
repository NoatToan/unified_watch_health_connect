package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.CachedDataSourceImpl", f = "CachedDataSourceImpl.kt", l = {78}, m = "fetchData", v = 2)
public final class z<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jw.c0 f104461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f104463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104464d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(x xVar, t13.d<? super z> dVar) {
        super(dVar);
        this.f104463c = xVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104462b = obj;
        this.f104464d |= Integer.MIN_VALUE;
        int i14 = x.f104414b;
        return this.f104463c.d(null, null, false, null, null, this);
    }
}
