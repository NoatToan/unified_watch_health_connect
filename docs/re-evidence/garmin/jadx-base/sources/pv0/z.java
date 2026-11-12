package pv0;

import com.garmin.android.apps.connectmobile.f3;
import java.util.List;
import m63.u1;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019B\u008b\u0001\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012B\u008b\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016¨\u0006\u001a"}, d2 = {"Lpv0/z;", "", "", "Lpv0/h;", "logs", "Lpv0/t;", "metricValues", "", "daysLoggedYes", "daysLoggedNo", "", "avgWhenYes", "avgWhenNo", "highestLoggingRate", "lowestLoggingRate", "highestSubTypeId", "lowestSubTypeId", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lm63/u1;)V", "Companion", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class z {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f141474k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h> f141475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<t> f141476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f141477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f141478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f141479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f141480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f141481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f141482h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f141483i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f141484j;

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f141474k = new o13.l[]{o13.m.a(nVar, new pk0.m(12)), o13.m.a(nVar, new pk0.m(13)), null, null, null, null, null, null, null, null};
    }

    public z(int i14, List list, List list2, Integer num, Integer num2, Double d14, Double d15, Integer num3, Integer num4, Integer num5, Integer num6, u1 u1Var) {
        Double dValueOf = Double.valueOf(0.0d);
        this.f141475a = (i14 & 1) == 0 ? j0.f134944a : list;
        if ((i14 & 2) == 0) {
            this.f141476b = j0.f134944a;
        } else {
            this.f141476b = list2;
        }
        if ((i14 & 4) == 0) {
            this.f141477c = 0;
        } else {
            this.f141477c = num;
        }
        if ((i14 & 8) == 0) {
            this.f141478d = 0;
        } else {
            this.f141478d = num2;
        }
        if ((i14 & 16) == 0) {
            this.f141479e = dValueOf;
        } else {
            this.f141479e = d14;
        }
        if ((i14 & 32) == 0) {
            this.f141480f = dValueOf;
        } else {
            this.f141480f = d15;
        }
        if ((i14 & 64) == 0) {
            this.f141481g = 0;
        } else {
            this.f141481g = num3;
        }
        if ((i14 & 128) == 0) {
            this.f141482h = 0;
        } else {
            this.f141482h = num4;
        }
        if ((i14 & 256) == 0) {
            this.f141483i = 0;
        } else {
            this.f141483i = num5;
        }
        if ((i14 & 512) == 0) {
            this.f141484j = 0;
        } else {
            this.f141484j = num6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return p005kotlin.jvm.internal.s.g(this.f141475a, zVar.f141475a) && p005kotlin.jvm.internal.s.g(this.f141476b, zVar.f141476b) && p005kotlin.jvm.internal.s.g(this.f141477c, zVar.f141477c) && p005kotlin.jvm.internal.s.g(this.f141478d, zVar.f141478d) && p005kotlin.jvm.internal.s.g(this.f141479e, zVar.f141479e) && p005kotlin.jvm.internal.s.g(this.f141480f, zVar.f141480f) && p005kotlin.jvm.internal.s.g(this.f141481g, zVar.f141481g) && p005kotlin.jvm.internal.s.g(this.f141482h, zVar.f141482h) && p005kotlin.jvm.internal.s.g(this.f141483i, zVar.f141483i) && p005kotlin.jvm.internal.s.g(this.f141484j, zVar.f141484j);
    }

    public final int hashCode() {
        List<h> list = this.f141475a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<t> list2 = this.f141476b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.f141477c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f141478d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d14 = this.f141479e;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f141480f;
        int iHashCode6 = (iHashCode5 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num3 = this.f141481g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f141482h;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f141483i;
        int iHashCode9 = (iHashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f141484j;
        return iHashCode9 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = f3.k("SingleMetricStatDTO(logs=", ", metricValues=", ", daysLoggedYes=", this.f141475a, this.f141476b);
        j20.x.m(sbK, this.f141477c, ", daysLoggedNo=", this.f141478d, ", avgWhenYes=");
        b71.i.p(this.f141479e, this.f141480f, ", avgWhenNo=", ", highestLoggingRate=", sbK);
        j20.x.m(sbK, this.f141481g, ", lowestLoggingRate=", this.f141482h, ", highestSubTypeId=");
        return b71.i.h(sbK, this.f141483i, ", lowestSubTypeId=", this.f141484j, ")");
    }

    /* JADX INFO: renamed from: pv0.z$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpv0/z$b;", "", "<init>", "()V", "Li63/c;", "Lpv0/z;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<z> serializer() {
            return a.f141485a;
        }

        private Companion() {
        }
    }

    public z(List<h> list, List<t> list2, Integer num, Integer num2, Double d14, Double d15, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.f141475a = list;
        this.f141476b = list2;
        this.f141477c = num;
        this.f141478d = num2;
        this.f141479e = d14;
        this.f141480f = d15;
        this.f141481g = num3;
        this.f141482h = num4;
        this.f141483i = num5;
        this.f141484j = num6;
    }

    public z() {
        this((List) null, (List) null, (Integer) null, (Integer) null, (Double) null, (Double) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 1023, (p005kotlin.jvm.internal.j) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(List list, List list2, Integer num, Integer num2, Double d14, Double d15, Integer num3, Integer num4, Integer num5, Integer num6, int i14, p005kotlin.jvm.internal.j jVar) {
        Double dValueOf = Double.valueOf(0.0d);
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? j0.f134944a : list2, (i14 & 4) != 0 ? 0 : num, (i14 & 8) != 0 ? 0 : num2, (i14 & 16) != 0 ? dValueOf : d14, (i14 & 32) == 0 ? d15 : dValueOf, (i14 & 64) != 0 ? 0 : num3, (i14 & 128) != 0 ? 0 : num4, (i14 & 256) != 0 ? 0 : num5, (i14 & 512) != 0 ? 0 : num6);
    }
}
