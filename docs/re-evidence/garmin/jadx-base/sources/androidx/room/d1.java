package androidx.room;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {347}, m = "stopTrackingTable")
public final class d1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f10815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f10817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f10820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0 f10821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10822h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(x0 x0Var, t13.d<? super d1> dVar) {
        super(dVar);
        this.f10821g = x0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f10820f = obj;
        this.f10822h |= Integer.MIN_VALUE;
        return x0.d(this.f10821g, null, 0, this);
    }
}
