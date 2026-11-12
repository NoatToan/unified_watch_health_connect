package wt1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.RaceEventViewModel", f = "RaceEventViewModel.kt", l = {97}, m = "subscribeToSelectedEvent", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fg0.p f187104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f187105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f187106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f187107d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(d dVar, t13.d<? super n> dVar2) {
        super(dVar2);
        this.f187106c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f187105b = obj;
        this.f187107d |= Integer.MIN_VALUE;
        int i14 = d.f187033q;
        return this.f187106c.I4(null, null, this);
    }
}
