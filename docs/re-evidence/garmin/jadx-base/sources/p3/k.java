package p3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002BA\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lp3/k;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lp1/a1;", "", "instances", "reused", "Lp1/l;", "operations", "", "lastOperation", "", "cause", "<init>", "(Lp1/a1;Lp1/a1;Lp1/l;ILjava/lang/Throwable;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.a1<Object> f135132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.a1<Object> f135133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p1.l f135134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f135135d;

    public k(p1.a1<Object> a1Var, p1.a1<Object> a1Var2, p1.l lVar, int i14, Throwable th3) {
        super(th3);
        this.f135132a = a1Var;
        this.f135133b = a1Var2;
        this.f135134c = lVar;
        this.f135135d = i14;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return d53.n.d("\n            |Failed to execute op number " + this.f135135d + ":\n            |" + p13.h0.k0(p13.h0.T0(50, c53.c0.s(new c53.m(new j(this, null)))), "\n", null, null, null, 62) + "\n            ");
    }
}
