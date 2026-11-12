package j23;

import p005kotlin.Metadata;
import p13.q0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lj23/n;", "Lp13/q0;", "", "first", "last", "step", "<init>", "(JJJ)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f96809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f96810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f96811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f96812d;

    public n(long j8, long j14, long j15) {
        this.f96809a = j15;
        this.f96810b = j14;
        boolean z14 = false;
        if (j15 <= 0 ? j8 >= j14 : j8 <= j14) {
            z14 = true;
        }
        this.f96811c = z14;
        this.f96812d = z14 ? j8 : j14;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f96811c;
    }

    @Override // p13.q0
    public final long nextLong() {
        long j8 = this.f96812d;
        if (j8 != this.f96810b) {
            this.f96812d = this.f96809a + j8;
            return j8;
        }
        if (this.f96811c) {
            this.f96811c = false;
            return j8;
        }
        c22.t.g();
        return 0L;
    }
}
