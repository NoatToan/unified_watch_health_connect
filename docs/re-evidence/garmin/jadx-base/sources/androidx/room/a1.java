package androidx.room;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {417}, m = "notifyInvalidation")
public final class a1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public id.a f10718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f10720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10721d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(x0 x0Var, t13.d<? super a1> dVar) {
        super(dVar);
        this.f10720c = x0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f10719b = obj;
        this.f10721d |= Integer.MIN_VALUE;
        return x0.b(this.f10720c, this);
    }
}
