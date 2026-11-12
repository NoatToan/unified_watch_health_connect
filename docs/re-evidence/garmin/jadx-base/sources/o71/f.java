package o71;

import com.garmin.android.gncs.NotificationConstants;
import java.util.List;
import java.util.Map;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lo71/f;", "", "Lo71/h;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "Lorg/joda/time/LocalDate;", "dates", "", "Lo71/f$a;", "dataPoints", "", "unitTextRes", "Lo71/g;", "interval", "", "showPastValue", "showPastLegend", "<init>", "(Lo71/h;Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Lo71/g;ZZ)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f130190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<LocalDate> f130191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<LocalDate, a> f130192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f130193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f130194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f130195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f130196g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lo71/f$a;", "", "", "value", "pastValue", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Float f130197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Float f130198b;

        public a(Float f14, Float f15) {
            this.f130197a = f14;
            this.f130198b = f15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f130197a, aVar.f130197a) && s.g(this.f130198b, aVar.f130198b);
        }

        public final int hashCode() {
            Float f14 = this.f130197a;
            int iHashCode = (f14 == null ? 0 : f14.hashCode()) * 31;
            Float f15 = this.f130198b;
            return iHashCode + (f15 != null ? f15.hashCode() : 0);
        }

        public final String toString() {
            return "DataPoint(value=" + this.f130197a + ", pastValue=" + this.f130198b + ")";
        }
    }

    public f(h hVar, List<LocalDate> list, Map<LocalDate, a> map, Integer num, g gVar, boolean z14, boolean z15) {
        hVar.getClass();
        list.getClass();
        map.getClass();
        gVar.getClass();
        this.f130190a = hVar;
        this.f130191b = list;
        this.f130192c = map;
        this.f130193d = num;
        this.f130194e = gVar;
        this.f130195f = z14;
        this.f130196g = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f130190a == fVar.f130190a && s.g(this.f130191b, fVar.f130191b) && s.g(this.f130192c, fVar.f130192c) && s.g(this.f130193d, fVar.f130193d) && this.f130194e == fVar.f130194e && this.f130195f == fVar.f130195f && this.f130196g == fVar.f130196g;
    }

    public final int hashCode() {
        int iB = am.j.b(this.f130192c, u0.b(this.f130190a.hashCode() * 31, 31, this.f130191b), 31);
        Integer num = this.f130193d;
        return Boolean.hashCode(this.f130196g) + q6.f.g((this.f130194e.hashCode() + ((iB + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.f130195f);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StrengthStatsChartInfo(type=");
        sb3.append(this.f130190a);
        sb3.append(", dates=");
        sb3.append(this.f130191b);
        sb3.append(", dataPoints=");
        sb3.append(this.f130192c);
        sb3.append(", unitTextRes=");
        sb3.append(this.f130193d);
        sb3.append(", interval=");
        sb3.append(this.f130194e);
        sb3.append(", showPastValue=");
        sb3.append(this.f130195f);
        sb3.append(", showPastLegend=");
        return hb.a.k(sb3, this.f130196g, ")");
    }

    public /* synthetic */ f(h hVar, List list, Map map, Integer num, g gVar, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar) {
        this(hVar, list, map, num, gVar, (i14 & 32) != 0 ? true : z14, (i14 & 64) != 0 ? true : z15);
    }
}
