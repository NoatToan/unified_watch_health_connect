package ll2;

import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\b¨\u0006\t"}, d2 = {"Lll2/l;", "", "", "uid", "expectedSize", "<init>", "(JJ)V", "", "(JI)V", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f113489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f113490b;

    public l(long j8, long j14) {
        this.f113489a = j8;
        this.f113490b = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f113489a == lVar.f113489a && this.f113490b == lVar.f113490b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f113490b) + (Long.hashCode(this.f113489a) * 31);
    }

    public final String toString() {
        return am.j.i(this.f113490b, ")", e0.k(this.f113489a, "TransportArgs(uid=", ", expectedSize="));
    }

    public l(long j8, int i14) {
        this(j8, i14);
    }
}
