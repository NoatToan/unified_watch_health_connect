package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.GroupDelegateImpl", f = "GroupDelegateImpl.kt", l = {161}, m = "getGroupDetail", v = 2)
public final class b3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f103996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d3 f103997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f103998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(d3 d3Var, t13.d<? super b3> dVar) {
        super(dVar);
        this.f103997b = d3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f103996a = obj;
        this.f103998c |= Integer.MIN_VALUE;
        return this.f103997b.w(null, this);
    }
}
