package s3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls3/b;", "Lp3/b;", "", "loc", "<init>", "(I)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements p3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f156318a;

    public b(int i14) {
        this.f156318a = i14;
    }

    @Override // p3.b
    public final boolean getValid() {
        return this.f156318a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        sb3.append("{ location = ");
        return am.j.q(sb3, this.f156318a, " }");
    }
}
