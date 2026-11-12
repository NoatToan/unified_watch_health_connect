package mv2;

import am.j;
import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmv2/a;", "", "", "hours", "minutes", "seconds", "<init>", "(III)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f121196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f121197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f121198c;

    public a(int i14, int i15, int i16) {
        this.f121196a = i14;
        this.f121197b = i15;
        this.f121198c = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f121196a == aVar.f121196a && this.f121197b == aVar.f121197b && this.f121198c == aVar.f121198c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f121198c) + q2.d(this.f121197b, Integer.hashCode(this.f121196a) * 31, 31);
    }

    public final String toString() {
        return j.q(e5.j(this.f121196a, this.f121197b, "TimeData(hours=", ", minutes=", ", seconds="), this.f121198c, ")");
    }
}
