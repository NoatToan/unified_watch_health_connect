package r53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt", f = "Share.kt", l = {326}, m = "stateIn")
public final class g1<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f150631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f150632b;

    public g1(t13.d<? super g1> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f150631a = obj;
        this.f150632b |= Integer.MIN_VALUE;
        return s.J(null, null, this);
    }
}
