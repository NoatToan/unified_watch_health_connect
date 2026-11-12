package wd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackManager$Companion", f = "LivetrackManager.kt", l = {74, 75}, m = "deleteDeviceData", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f184530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q.a f184531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f184532c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q.a aVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f184531b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184530a = obj;
        this.f184532c |= Integer.MIN_VALUE;
        return q.a.a(this.f184531b, null, null, this);
    }
}
