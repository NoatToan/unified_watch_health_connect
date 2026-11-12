package b11;

import i3.e5;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb11/j;", "", "", "carbsPercentage", "proteinPercentage", "fatPercentage", "<init>", "(III)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14324c;

    public /* synthetic */ j(int i14, int i15, int i16, int i17, p005kotlin.jvm.internal.j jVar) {
        this((i17 & 1) != 0 ? 0 : i14, (i17 & 2) != 0 ? 0 : i15, (i17 & 4) != 0 ? 0 : i16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f14322a == jVar.f14322a && this.f14323b == jVar.f14323b && this.f14324c == jVar.f14324c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14324c) + q2.d(this.f14323b, Integer.hashCode(this.f14322a) * 31, 31);
    }

    public final String toString() {
        return am.j.q(e5.j(this.f14322a, this.f14323b, "MacroPercentages(carbsPercentage=", ", proteinPercentage=", ", fatPercentage="), this.f14324c, ")");
    }

    public j(int i14, int i15, int i16) {
        this.f14322a = i14;
        this.f14323b = i15;
        this.f14324c = i16;
    }

    public j() {
        this(0, 0, 0, 7, null);
    }
}
