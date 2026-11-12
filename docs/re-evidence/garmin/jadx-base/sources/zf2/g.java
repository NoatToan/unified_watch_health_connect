package zf2;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzf2/g;", "", "", "ftp", "", "Llt2/c;", "powerCurveEntries", "<init>", "(ILjava/util/List;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f204647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<lt2.c> f204648b;

    public g(int i14, List<lt2.c> list) {
        list.getClass();
        this.f204647a = i14;
        this.f204648b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f204647a == gVar.f204647a && this.f204648b.equals(gVar.f204648b);
    }

    public final int hashCode() {
        return this.f204648b.hashCode() + (Integer.hashCode(this.f204647a) * 31);
    }

    public final String toString() {
        return "LiveActivityPowerData(ftp=" + this.f204647a + ", powerCurveEntries=" + this.f204648b + ")";
    }
}
