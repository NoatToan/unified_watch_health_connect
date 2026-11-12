package cz2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@v13.e(c = "com.garmin.util.coroutines.ScheduledSingleRunner", f = "ScheduledSingleRunner.kt", l = {171, 178, 180, 186}, m = "runIfUnscheduled")
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f56946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.l f56947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f56948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f56949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f56950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j<Object> f56951f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f56952g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j<Object> jVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f56951f = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f56950e = obj;
        this.f56952g |= Integer.MIN_VALUE;
        return this.f56951f.d(null, null, 0L, this);
    }
}
