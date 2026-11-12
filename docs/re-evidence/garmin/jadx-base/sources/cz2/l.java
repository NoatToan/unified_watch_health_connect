package cz2;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@v13.e(c = "com.garmin.util.coroutines.ScheduledSingleRunner", f = "ScheduledSingleRunner.kt", l = {201, 147}, m = "joinOrSchedule")
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f56932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v13.i f56933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public r0 f56934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z53.b f56935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f56936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f56937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j<Object> f56938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f56939h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j<Object> jVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f56938g = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f56937f = obj;
        this.f56939h |= Integer.MIN_VALUE;
        return this.f56938g.c(0L, null, this);
    }
}
