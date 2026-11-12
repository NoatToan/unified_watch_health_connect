package lt2;

import am.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llt2/c;", "", "", "duration", "power", "<init>", "(II)V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f114878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114879b;

    public c(int i14, int i15) {
        this.f114878a = i14;
        this.f114879b = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f114878a == cVar.f114878a && this.f114879b == cVar.f114879b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f114879b) + (Integer.hashCode(this.f114878a) * 31);
    }

    public final String toString() {
        return j.g(this.f114878a, this.f114879b, "CommonPowerCurve(duration=", ", power=", ")");
    }
}
