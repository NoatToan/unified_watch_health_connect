package androidx.room;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.TriggerBasedInvalidationTracker", f = "InvalidationTracker.kt", l = {306}, m = "syncTriggers$room_runtime")
public final class e1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public id.a f10823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f10824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0 f10825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10826d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(x0 x0Var, t13.d<? super e1> dVar) {
        super(dVar);
        this.f10825c = x0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f10824b = obj;
        this.f10826d |= Integer.MIN_VALUE;
        return this.f10825c.f(this);
    }
}
