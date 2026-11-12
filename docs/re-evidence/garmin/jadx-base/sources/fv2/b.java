package fv2;

import am.j;
import com.roomorama.caldroid.CaldroidFragment;
import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lfv2/b;", "", "", CaldroidFragment.MONTH, "day", CaldroidFragment.YEAR, "<init>", "(III)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f73741c;

    public b(int i14, int i15, int i16) {
        this.f73739a = i14;
        this.f73740b = i15;
        this.f73741c = i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f73739a == bVar.f73739a && this.f73740b == bVar.f73740b && this.f73741c == bVar.f73741c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f73741c) + q2.d(this.f73740b, Integer.hashCode(this.f73739a) * 31, 31);
    }

    public final String toString() {
        return j.q(e5.j(this.f73739a, this.f73740b, "Date(month=", ", day=", ", year="), this.f73741c, ")");
    }
}
