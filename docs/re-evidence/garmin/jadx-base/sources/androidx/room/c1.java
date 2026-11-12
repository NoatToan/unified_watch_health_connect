package androidx.room;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {328, 333}, m = "startTrackingTable")
public final class c1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f10803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f10805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f10809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x0 f10810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10811i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(x0 x0Var, t13.d<? super c1> dVar) {
        super(dVar);
        this.f10810h = x0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f10809g = obj;
        this.f10811i |= Integer.MIN_VALUE;
        return x0.c(this.f10810h, null, 0, this);
    }
}
