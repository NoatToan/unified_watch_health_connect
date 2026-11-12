package nr;

import com.garmin.android.apps.connectmobile.f3;
import java.util.List;
import p005kotlin.Metadata;
import ps.r1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/t0;", "", "", "Lps/r1;", "timeInHRZones", "timeInPowerZones", "timeInStaminaZones", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<r1> f127355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<r1> f127356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<r1> f127357c;

    public t0(List list, List list2, List list3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? p13.j0.f134944a : list, (i14 & 2) != 0 ? p13.j0.f134944a : list2, (i14 & 4) != 0 ? p13.j0.f134944a : list3);
    }

    public static t0 a(t0 t0Var, List list, List list2, List list3, int i14) {
        if ((i14 & 1) != 0) {
            list = t0Var.f127355a;
        }
        if ((i14 & 2) != 0) {
            list2 = t0Var.f127356b;
        }
        if ((i14 & 4) != 0) {
            list3 = t0Var.f127357c;
        }
        list.getClass();
        list2.getClass();
        list3.getClass();
        return new t0(list, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return p005kotlin.jvm.internal.s.g(this.f127355a, t0Var.f127355a) && p005kotlin.jvm.internal.s.g(this.f127356b, t0Var.f127356b) && p005kotlin.jvm.internal.s.g(this.f127357c, t0Var.f127357c);
    }

    public final int hashCode() {
        return this.f127357c.hashCode() + lc.u0.b(this.f127355a.hashCode() * 31, 31, this.f127356b);
    }

    public final String toString() {
        return u62.z.c(f3.k("TimeInZoneData(timeInHRZones=", ", timeInPowerZones=", ", timeInStaminaZones=", this.f127355a, this.f127356b), this.f127357c, ")");
    }

    public t0(List<r1> list, List<r1> list2, List<r1> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f127355a = list;
        this.f127356b = list2;
        this.f127357c = list3;
    }

    public t0() {
        this(null, null, null, 7, null);
    }
}
