package nl;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import gs1.h;
import gs1.n;
import gs1.p;
import gs1.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import n23.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0014\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u0006\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006\u0012\u0016\u0010\u0010\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR(\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u001dR*\u0010\u0010\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d¨\u0006&"}, d2 = {"Lnl/a;", "", "", "userProfilePk", "", "overallSpo2Average", "", "Lgs1/p;", "spo2AccValueDescriptorList", "", "spo2HourlyAverageArray", "Lgs1/n;", "monitoringEnvironmentValueDescriptorList", "monitoringEnvironmentValuesArray", "Lnl/b;", "spo2DailyAcclimationAverageDescriptorList", "spo2DailyAverageArray", "<init>", "(Ljava/lang/String;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getUserProfilePk", "()Ljava/lang/String;", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "c", "Ljava/util/List;", "getSpo2AccValueDescriptorList", "()Ljava/util/List;", "d", JWKParameterNames.RSA_EXPONENT, "getMonitoringEnvironmentValueDescriptorList", "f", "getMonitoringEnvironmentValuesArray", "g", "getSpo2DailyAcclimationAverageDescriptorList", "h", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final String userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("overallSpo2Average")
    private final Double overallSpo2Average;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spo2AccValueDescriptorList")
    private final List<p> spo2AccValueDescriptorList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spo2HourlyAverageArray")
    private final List<List<Long>> spo2HourlyAverageArray;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monitoringEnvironmentValueDescriptorList")
    private final List<n> monitoringEnvironmentValueDescriptorList;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monitoringEnvironmentValuesArray")
    private final List<List<Object>> monitoringEnvironmentValuesArray;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spo2DailyAcclimationAverageDescriptorList")
    private final List<b> spo2DailyAcclimationAverageDescriptorList;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spo2DailyAverageArray")
    private final List<List<Object>> spo2DailyAverageArray;

    /* JADX WARN: Multi-variable type inference failed */
    public a(String str, Double d14, List<p> list, List<? extends List<Long>> list2, List<n> list3, List<? extends List<? extends Object>> list4, List<b> list5, List<? extends List<? extends Object>> list6) {
        j.x(str, list, list2, list3, list4);
        list5.getClass();
        this.userProfilePk = str;
        this.overallSpo2Average = d14;
        this.spo2AccValueDescriptorList = list;
        this.spo2HourlyAverageArray = list2;
        this.monitoringEnvironmentValueDescriptorList = list3;
        this.monitoringEnvironmentValuesArray = list4;
        this.spo2DailyAcclimationAverageDescriptorList = list5;
        this.spo2DailyAverageArray = list6;
    }

    public final ArrayList a() {
        y yVar;
        Object next;
        Object next2;
        List<List<Object>> list = this.monitoringEnvironmentValuesArray;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            Iterator<T> it3 = this.monitoringEnvironmentValueDescriptorList.iterator();
            do {
                yVar = null;
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!s.g(((n) next).getMonEnvValueDescKey(), "timestamp"));
            n nVar = (n) next;
            Integer monEnvValueDescIndex = nVar != null ? nVar.getMonEnvValueDescIndex() : null;
            Iterator<T> it4 = this.monitoringEnvironmentValueDescriptorList.iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!s.g(((n) next2).getMonEnvValueDescKey(), "monitoringEnvironmentLevel"));
            n nVar2 = (n) next2;
            Integer monEnvValueDescIndex2 = nVar2 != null ? nVar2.getMonEnvValueDescIndex() : null;
            if (monEnvValueDescIndex != null && monEnvValueDescIndex2 != null) {
                Double dF = d53.s.f(String.valueOf(list2.get(monEnvValueDescIndex.intValue())));
                Long lValueOf = dF != null ? Long.valueOf((long) dF.doubleValue()) : null;
                Double dF2 = d53.s.f(String.valueOf(list2.get(monEnvValueDescIndex2.intValue())));
                if (lValueOf != null && dF2 != null) {
                    yVar = new y(lValueOf.longValue(), dF2.doubleValue());
                }
            }
            if (yVar != null) {
                arrayList.add(yVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getOverallSpo2Average() {
        return this.overallSpo2Average;
    }

    public final List<List<Object>> c() {
        return this.spo2DailyAverageArray;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    public final ArrayList d() {
        Object next;
        Object next2;
        h hVar;
        List<List<Object>> list = this.spo2DailyAverageArray;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            Iterator<T> it3 = this.spo2DailyAcclimationAverageDescriptorList.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!s.g(((b) next).getSpo2DayAverageDescKey(), "calendarDay"));
            b bVar = (b) next;
            Integer spo2DayAverageDescIndex = bVar != null ? bVar.getSpo2DayAverageDescIndex() : null;
            Iterator<T> it4 = this.spo2DailyAcclimationAverageDescriptorList.iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!s.g(((b) next2).getSpo2DayAverageDescKey(), "spo2DayAverage"));
            b bVar2 = (b) next2;
            Integer spo2DayAverageDescIndex2 = bVar2 != null ? bVar2.getSpo2DayAverageDescIndex() : null;
            if (spo2DayAverageDescIndex == null || spo2DayAverageDescIndex2 == null) {
                hVar = null;
            } else {
                String strValueOf = String.valueOf(list2.get(spo2DayAverageDescIndex.intValue()));
                Double dF = d53.s.f(String.valueOf(list2.get(spo2DayAverageDescIndex2.intValue())));
                if (dF != null) {
                    hVar = new h(strValueOf, dF.doubleValue());
                } else {
                    hVar = null;
                }
            }
            if (hVar != null) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    public final List<List<Long>> e() {
        return this.spo2HourlyAverageArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.userProfilePk, aVar.userProfilePk) && s.g(this.overallSpo2Average, aVar.overallSpo2Average) && s.g(this.spo2AccValueDescriptorList, aVar.spo2AccValueDescriptorList) && s.g(this.spo2HourlyAverageArray, aVar.spo2HourlyAverageArray) && s.g(this.monitoringEnvironmentValueDescriptorList, aVar.monitoringEnvironmentValueDescriptorList) && s.g(this.monitoringEnvironmentValuesArray, aVar.monitoringEnvironmentValuesArray) && s.g(this.spo2DailyAcclimationAverageDescriptorList, aVar.spo2DailyAcclimationAverageDescriptorList) && s.g(this.spo2DailyAverageArray, aVar.spo2DailyAverageArray);
    }

    public final ArrayList f() {
        y yVar;
        Object next;
        Object next2;
        List<List<Long>> list = this.spo2HourlyAverageArray;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            Iterator<T> it3 = this.spo2AccValueDescriptorList.iterator();
            do {
                yVar = null;
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!s.g(((p) next).getSpo2ValueDescKey(), "timestamp"));
            p pVar = (p) next;
            Integer spo2ValueDescIndex = pVar != null ? pVar.getSpo2ValueDescIndex() : null;
            Iterator<T> it4 = this.spo2AccValueDescriptorList.iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!s.g(((p) next2).getSpo2ValueDescKey(), "spo2Reading"));
            p pVar2 = (p) next2;
            Integer spo2ValueDescIndex2 = pVar2 != null ? pVar2.getSpo2ValueDescIndex() : null;
            if (spo2ValueDescIndex != null && spo2ValueDescIndex2 != null) {
                yVar = new y(((Number) list2.get(spo2ValueDescIndex.intValue())).longValue(), ((Number) list2.get(spo2ValueDescIndex2.intValue())).longValue());
            }
            if (yVar != null) {
                arrayList.add(yVar);
            }
        }
        return arrayList;
    }

    public final int hashCode() {
        int iHashCode = this.userProfilePk.hashCode() * 31;
        Double d14 = this.overallSpo2Average;
        int iB = u0.b(u0.b(u0.b(u0.b(u0.b((iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31, 31, this.spo2AccValueDescriptorList), 31, this.spo2HourlyAverageArray), 31, this.monitoringEnvironmentValueDescriptorList), 31, this.monitoringEnvironmentValuesArray), 31, this.spo2DailyAcclimationAverageDescriptorList);
        List<List<Object>> list = this.spo2DailyAverageArray;
        return iB + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str = this.userProfilePk;
        Double d14 = this.overallSpo2Average;
        List<p> list = this.spo2AccValueDescriptorList;
        List<List<Long>> list2 = this.spo2HourlyAverageArray;
        List<n> list3 = this.monitoringEnvironmentValueDescriptorList;
        List<List<Object>> list4 = this.monitoringEnvironmentValuesArray;
        List<b> list5 = this.spo2DailyAcclimationAverageDescriptorList;
        List<List<Object>> list6 = this.spo2DailyAverageArray;
        StringBuilder sb3 = new StringBuilder("PulseOxAcclimationDailyReportDTO(userProfilePk=");
        sb3.append(str);
        sb3.append(", overallSpo2Average=");
        sb3.append(d14);
        sb3.append(", spo2AccValueDescriptorList=");
        j.z(sb3, list, ", spo2HourlyAverageArray=", list2, ", monitoringEnvironmentValueDescriptorList=");
        j.z(sb3, list3, ", monitoringEnvironmentValuesArray=", list4, ", spo2DailyAcclimationAverageDescriptorList=");
        return j.j(sb3, list5, ", spo2DailyAverageArray=", list6, ")");
    }
}
