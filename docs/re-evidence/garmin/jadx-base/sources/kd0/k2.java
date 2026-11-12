package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.FriendsDelegate", f = "LivetrackGcmDelegateImpl.kt", l = {640}, m = "fetchFriends", v = 2)
public final class k2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n2 f104167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104168c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(n2 n2Var, t13.d<? super k2> dVar) {
        super(dVar);
        this.f104167b = n2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104166a = obj;
        this.f104168c |= Integer.MIN_VALUE;
        return this.f104167b.a(this);
    }
}
