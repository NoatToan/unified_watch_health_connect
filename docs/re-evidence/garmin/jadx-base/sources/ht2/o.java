package ht2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "com.garmin.inappupdate.InAppUpdateControlledRunner", f = "InAppUpdateControlledRunner.kt", l = {66, 68}, m = "cancelPreviousThenRun")
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f85671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.inappupdate.a.C1116a f85672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f85673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q<Object> f85674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f85675e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q<Object> qVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f85674d = qVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f85673c = obj;
        this.f85675e |= Integer.MIN_VALUE;
        return this.f85674d.a(null, this);
    }
}
