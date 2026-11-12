package wt1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.RaceEventViewModel", f = "RaceEventViewModel.kt", l = {479}, m = "handleUpdateEvent", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fg0.k f187100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f187101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f187102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f187103d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d dVar, t13.d<? super m> dVar2) {
        super(dVar2);
        this.f187102c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f187101b = obj;
        this.f187103d |= Integer.MIN_VALUE;
        return d.A4(this.f187102c, null, this);
    }
}
