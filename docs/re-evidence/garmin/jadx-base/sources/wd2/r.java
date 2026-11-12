package wd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackManager", f = "LivetrackManager.kt", l = {317}, m = "getLivetrackSessionDetails", v = 2)
public final class r extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f184586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f184587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f184588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, t13.d<? super r> dVar) {
        super(dVar);
        this.f184587b = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184586a = obj;
        this.f184588c |= Integer.MIN_VALUE;
        return this.f184587b.c(0L, this);
    }
}
