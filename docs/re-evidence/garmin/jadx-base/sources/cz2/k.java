package cz2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@v13.e(c = "com.garmin.util.coroutines.ScheduledSingleRunner", f = "ScheduledSingleRunner.kt", l = {201}, m = "expectedExecutionTime$util_coroutines_release")
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f56927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z53.b f56928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f56929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j<Object> f56930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f56931e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j<Object> jVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f56930d = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f56929c = obj;
        this.f56931e |= Integer.MIN_VALUE;
        return this.f56930d.b(this);
    }
}
