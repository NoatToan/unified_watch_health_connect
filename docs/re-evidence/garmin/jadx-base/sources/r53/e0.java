package r53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {71}, m = "emitAbort$FlowKt__LimitKt")
public final class e0<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f150566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f150567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f150568c;

    public e0(t13.d<? super e0> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f150567b = obj;
        this.f150568c |= Integer.MIN_VALUE;
        return s.a(null, null, null, this);
    }
}
