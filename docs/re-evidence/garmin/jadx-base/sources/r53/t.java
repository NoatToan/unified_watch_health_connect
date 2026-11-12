package r53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {212}, m = "invokeSafely$FlowKt__EmittersKt")
public final class t<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f150864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f150865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f150866c;

    public t(t13.d<? super t> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f150865b = obj;
        this.f150866c |= Integer.MIN_VALUE;
        return s.b(null, null, null, this);
    }
}
