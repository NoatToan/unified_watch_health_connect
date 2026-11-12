package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.FriendsDelegate", f = "LivetrackGcmDelegateImpl.kt", l = {673}, m = "updateGroupTrackFriends", v = 2)
public final class m2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n2 f104223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(n2 n2Var, t13.d<? super m2> dVar) {
        super(dVar);
        this.f104223b = n2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104222a = obj;
        this.f104224c |= Integer.MIN_VALUE;
        return this.f104223b.c(null, null, this);
    }
}
