package c63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc63/h1;", "Le63/c0;", "Lc63/c1;", "Lc63/r0;", "padding", "<init>", "(Lc63/r0;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h1 extends e63.c0<c1> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r0 f24983e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(r0 r0Var) {
        super(q0.f25048d, r0Var == r0.ZERO ? 2 : 1, r0Var == r0.SPACE ? 2 : null);
        r0Var.getClass();
        q0.f25045a.getClass();
        this.f24983e = r0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h1) {
            return this.f24983e == ((h1) obj).f24983e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24983e.hashCode();
    }
}
