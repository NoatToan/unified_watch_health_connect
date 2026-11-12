package k00;

import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lk00/a;", "", "", "percentValue", "", "stackItemColor", "", "stackActivityTypeName", "<init>", "(FILjava/lang/String;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f101955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f101956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f101957c;

    public a(float f14, int i14, String str) {
        str.getClass();
        this.f101955a = f14;
        this.f101956b = i14;
        this.f101957c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f101955a, aVar.f101955a) == 0 && this.f101956b == aVar.f101956b && this.f101957c.equals(aVar.f101957c);
    }

    public final int hashCode() {
        return this.f101957c.hashCode() + q2.d(this.f101956b, Float.hashCode(this.f101955a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChartStackItem(percentValue=");
        sb3.append(this.f101955a);
        sb3.append(", stackItemColor=");
        sb3.append(this.f101956b);
        sb3.append(", stackActivityTypeName=");
        return am.j.o(this.f101957c, ")", sb3);
    }
}
