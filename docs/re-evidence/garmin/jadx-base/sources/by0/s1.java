package by0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.data.datastore.MultiDayActivityDataStore", f = "MultiDayActivityDataStore.kt", l = {431}, m = "removeAllActivityResources", v = 2)
public final class s1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f22052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f22053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g2 f22054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22055d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(g2 g2Var, t13.d<? super s1> dVar) {
        super(dVar);
        this.f22054c = g2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f22053b = obj;
        this.f22055d |= Integer.MIN_VALUE;
        return this.f22054c.r(this);
    }
}
