package sy;

import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsy/b;", "", "", "totalCalories", "activeCalories", "restingCalories", "", "isPerDay", "<init>", "(IIIZ)V", "gcm-calories_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f161154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f161155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f161156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f161157d;

    public /* synthetic */ b(int i14, int i15, int i16, boolean z14, int i17, p005kotlin.jvm.internal.j jVar) {
        this((i17 & 1) != 0 ? 0 : i14, (i17 & 2) != 0 ? 0 : i15, (i17 & 4) != 0 ? 0 : i16, (i17 & 8) != 0 ? false : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f161154a == bVar.f161154a && this.f161155b == bVar.f161155b && this.f161156c == bVar.f161156c && this.f161157d == bVar.f161157d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f161157d) + q2.d(this.f161156c, q2.d(this.f161155b, Integer.hashCode(this.f161154a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbJ = e5.j(this.f161154a, this.f161155b, "CaloriesHelpData(totalCalories=", ", activeCalories=", ", restingCalories=");
        sbJ.append(this.f161156c);
        sbJ.append(", isPerDay=");
        sbJ.append(this.f161157d);
        sbJ.append(")");
        return sbJ.toString();
    }

    public b(int i14, int i15, int i16, boolean z14) {
        this.f161154a = i14;
        this.f161155b = i15;
        this.f161156c = i16;
        this.f161157d = z14;
    }

    public b() {
        this(0, 0, 0, false, 15, null);
    }
}
