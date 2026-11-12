package c83;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {119}, m = "suspendAndThrow")
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25813b;

    public p(t13.d<? super p> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f25812a = obj;
        this.f25813b |= Integer.MIN_VALUE;
        return m.c(this, null);
    }
}
