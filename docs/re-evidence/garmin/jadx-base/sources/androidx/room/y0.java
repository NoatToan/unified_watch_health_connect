package androidx.room;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {445, 453}, m = "checkInvalidatedTables")
public final class y0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f10997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f10999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11000d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(x0 x0Var, t13.d<? super y0> dVar) {
        super(dVar);
        this.f10999c = x0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f10998b = obj;
        this.f11000d |= Integer.MIN_VALUE;
        return x0.a(this.f10999c, null, this);
    }
}
