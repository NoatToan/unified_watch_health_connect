package wd2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackManager$Companion", f = "LivetrackManager.kt", l = {53}, m = "releaseResources", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f184551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q.a f184552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f184553c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q.a aVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f184552b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f184551a = obj;
        this.f184553c |= Integer.MIN_VALUE;
        return this.f184552b.d(null, this);
    }
}
