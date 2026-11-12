package vs0;

import com.garmin.android.apps.connectmobile.f3;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvs0/c;", "", "", "Lo61/b;", "powerToWeightReports", "ftpReports", "heartRateReports", "speedReports", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<o61.b> f179732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<o61.b> f179733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<o61.b> f179734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<o61.b> f179735d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f179736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f179737b;

        static {
            int[] iArr = new int[xs0.b.values().length];
            try {
                iArr[xs0.b.HEART_RATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xs0.b.POWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xs0.b.POWER_PER_KG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[xs0.b.PACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f179736a = iArr;
            int[] iArr2 = new int[xs0.a.values().length];
            try {
                iArr2[xs0.a.ROWING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            f179737b = iArr2;
        }
    }

    public /* synthetic */ c(List list, List list2, List list3, List list4, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : list2, (i14 & 4) != 0 ? null : list3, (i14 & 8) != 0 ? null : list4);
    }

    public static c a(c cVar, List list, List list2, List list3, List list4, int i14) {
        if ((i14 & 1) != 0) {
            list = cVar.f179732a;
        }
        if ((i14 & 2) != 0) {
            list2 = cVar.f179733b;
        }
        if ((i14 & 4) != 0) {
            list3 = cVar.f179734c;
        }
        if ((i14 & 8) != 0) {
            list4 = cVar.f179735d;
        }
        return new c(list, list2, list3, list4);
    }

    public final List<o61.b> b(xs0.b bVar) {
        bVar.getClass();
        int i14 = a.f179736a[bVar.ordinal()];
        if (i14 == 1) {
            return this.f179734c;
        }
        if (i14 == 2) {
            return this.f179733b;
        }
        if (i14 == 3) {
            return this.f179732a;
        }
        if (i14 == 4) {
            return this.f179735d;
        }
        u0.r();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f179732a, cVar.f179732a) && s.g(this.f179733b, cVar.f179733b) && s.g(this.f179734c, cVar.f179734c) && s.g(this.f179735d, cVar.f179735d);
    }

    public final int hashCode() {
        List<o61.b> list = this.f179732a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<o61.b> list2 = this.f179733b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<o61.b> list3 = this.f179734c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<o61.b> list4 = this.f179735d;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        return n23.j.j(f3.k("SportSpecificLTSummary(powerToWeightReports=", ", ftpReports=", ", heartRateReports=", this.f179732a, this.f179733b), this.f179734c, ", speedReports=", this.f179735d, ")");
    }

    public c(List<o61.b> list, List<o61.b> list2, List<o61.b> list3, List<o61.b> list4) {
        this.f179732a = list;
        this.f179733b = list2;
        this.f179734c = list3;
        this.f179735d = list4;
    }

    public c() {
        this(null, null, null, null, 15, null);
    }
}
