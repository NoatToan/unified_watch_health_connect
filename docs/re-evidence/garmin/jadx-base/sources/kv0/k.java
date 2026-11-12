package kv0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.status.LiveTrackStatusViewModel", f = "LiveTrackStatusViewModel.kt", l = {290, 293, 294, 295}, m = "areSharingOptionsEnabled", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ou0.f f106689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f106690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f106691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f106692d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f106691c = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f106690b = obj;
        this.f106692d |= Integer.MIN_VALUE;
        return j.x4(this.f106691c, this);
    }
}
