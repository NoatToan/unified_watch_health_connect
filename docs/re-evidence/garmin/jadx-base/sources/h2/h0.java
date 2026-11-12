package h2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh2/h0;", "Lh2/g0;", "", "pagesLimit", "<init>", "(I)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h0 implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80920b;

    public h0(int i14) {
        this.f80920b = i14;
    }

    @Override // h2.g0
    public final int a(int i14, int i15) {
        long j8 = i14;
        long j14 = this.f80920b;
        long j15 = j8 - j14;
        if (j15 < 0) {
            j15 = 0;
        }
        int i16 = (int) j15;
        long j16 = j8 + j14;
        if (j16 > 2147483647L) {
            j16 = 2147483647L;
        }
        return j23.t.e(i15, i16, (int) j16);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h0) {
            if (this.f80920b == ((h0) obj).f80920b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f80920b);
    }
}
