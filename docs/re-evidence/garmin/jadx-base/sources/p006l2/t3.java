package p006l2;

import p005kotlin.Metadata;
import x5.c0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ll2/t3;", "Lx5/c0;", "delegate", "", "originalLength", "transformedLength", "<init>", "(Lx5/c0;II)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t3 implements c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f108798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f108799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f108800d;

    public t3(c0 c0Var, int i14, int i15) {
        this.f108798b = c0Var;
        this.f108799c = i14;
        this.f108800d = i15;
    }

    @Override // x5.c0
    public final int a(int i14) {
        int iA = this.f108798b.a(i14);
        if (i14 >= 0 && i14 <= this.f108800d) {
            u3.c(iA, this.f108799c, i14);
        }
        return iA;
    }

    @Override // x5.c0
    public final int b(int i14) {
        int iB = this.f108798b.b(i14);
        if (i14 >= 0 && i14 <= this.f108799c) {
            u3.b(iB, this.f108800d, i14);
        }
        return iB;
    }
}
