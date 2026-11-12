package x5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx5/e0;", "Lx5/r0;", "", "mask", "<init>", "(C)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0 implements r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f188834b;

    public /* synthetic */ e0(char c14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? (char) 8226 : c14);
    }

    @Override // x5.r0
    public final q0 a(s5.c cVar) {
        s5.c cVar2 = new s5.c(d53.u.u(String.valueOf(this.f188834b), cVar.f157138b.length()), null, 2, null);
        c0.f188826a.getClass();
        return new q0(cVar2, c0.a.f188828b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e0) {
            return this.f188834b == ((e0) obj).f188834b;
        }
        return false;
    }

    public final int hashCode() {
        return Character.hashCode(this.f188834b);
    }

    public e0(char c14) {
        this.f188834b = c14;
    }

    public e0() {
        this((char) 0, 1, null);
    }
}
