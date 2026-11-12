package kv0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.status.LiveTrackStatusViewModel", f = "LiveTrackStatusViewModel.kt", l = {302}, m = "hasConnections", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f106696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f106697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f106698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j jVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f106697b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f106696a = obj;
        this.f106698c |= Integer.MIN_VALUE;
        int i14 = j.f106663m;
        return this.f106697b.y4(this);
    }
}
