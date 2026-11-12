package hd1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.realtimedata.RealTimeDataProvider", f = "RealTimeDataProvider.kt", l = {747}, m = "shouldDisplayBodyBatteryRealtimeInfo", v = 2)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f83429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f83430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83431c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(t tVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f83430b = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f83429a = obj;
        this.f83431c |= Integer.MIN_VALUE;
        return t.a(this.f83430b, this);
    }
}
