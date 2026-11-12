package c63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc63/o0;", "Le63/r;", "Lc63/l1;", "Lc63/p0;", "names", "<init>", "(Lc63/p0;)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o0 extends e63.r<l1> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p0 f25033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var) {
        super(m1.f25021c, p0Var.f25040a, "monthName");
        p0Var.getClass();
        m1.f25019a.getClass();
        this.f25033d = p0Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o0) && p005kotlin.jvm.internal.s.g(this.f25033d.f25040a, ((o0) obj).f25033d.f25040a);
    }

    public final int hashCode() {
        return this.f25033d.f25040a.hashCode();
    }
}
