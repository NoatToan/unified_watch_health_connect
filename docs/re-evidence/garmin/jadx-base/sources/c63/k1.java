package c63;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc63/k1;", "Le63/z;", "Lc63/l1;", "Lc63/r0;", "padding", "", "isYearOfEra", "<init>", "(Lc63/r0;Z)V", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k1 extends e63.z<l1> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r0 f25002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f25003g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(r0 r0Var, boolean z14) {
        super(m1.f25020b, Integer.valueOf(r0Var != r0.ZERO ? 1 : 4), null, r0Var == r0.SPACE ? 4 : null, 4);
        r0Var.getClass();
        m1.f25019a.getClass();
        this.f25002f = r0Var;
        this.f25003g = z14;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return this.f25002f == k1Var.f25002f && this.f25003g == k1Var.f25003g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25003g) + (this.f25002f.hashCode() * 31);
    }

    public /* synthetic */ k1(r0 r0Var, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(r0Var, (i14 & 2) != 0 ? false : z14);
    }
}
