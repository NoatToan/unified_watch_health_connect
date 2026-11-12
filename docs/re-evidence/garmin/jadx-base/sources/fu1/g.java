package fu1;

import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfu1/g;", "", "", "currentValue", "maxValue", "", "centerText", "<init>", "(IILjava/lang/String;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f73515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73516c;

    public g(int i14, int i15, String str) {
        str.getClass();
        this.f73514a = i14;
        this.f73515b = i15;
        this.f73516c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f73514a == gVar.f73514a && this.f73515b == gVar.f73515b && this.f73516c.equals(gVar.f73516c);
    }

    public final int hashCode() {
        return this.f73516c.hashCode() + q2.d(this.f73515b, Integer.hashCode(this.f73514a) * 31, 31);
    }

    public final String toString() {
        return am.j.o(this.f73516c, ")", e5.j(this.f73514a, this.f73515b, "ArcProgressChartData(currentValue=", ", maxValue=", ", centerText="));
    }
}
