package pl;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import gs1.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006\u0012\u0018\b\u0002\u0010\f\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R*\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R*\u0010\f\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lpl/b;", "", "", "userProfilePk", "", "overallSpo2Average", "", "spo2DailyAverageValueArray", "Lpl/c;", "spo2AcclimationValueDescriptorDTOList", "Lpl/a;", "monitoringEnvironmentAltitudeDescriptorDTOList", "monitoringEnvironmentDailyAverageAltitudeArray", "<init>", "(Ljava/lang/Long;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/Long;", "getUserProfilePk", "()Ljava/lang/Long;", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "c", "Ljava/util/List;", "getSpo2DailyAverageValueArray", "()Ljava/util/List;", "d", "getSpo2AcclimationValueDescriptorDTOList", JWKParameterNames.RSA_EXPONENT, "getMonitoringEnvironmentAltitudeDescriptorDTOList", "f", "getMonitoringEnvironmentDailyAverageAltitudeArray", "gcm-pulse-ox-acclimation_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final Long userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("overallSpo2Average")
    private final Double overallSpo2Average;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spo2DailyAverageValueArray")
    private final List<List<Object>> spo2DailyAverageValueArray;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spo2AcclimationValueDescriptorDTOList")
    private final List<c> spo2AcclimationValueDescriptorDTOList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monitoringEnvironmentAltitudeDescriptorDTOList")
    private final List<a> monitoringEnvironmentAltitudeDescriptorDTOList;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monitoringEnvironmentDailyAverageAltitudeArray")
    private final List<List<Object>> monitoringEnvironmentDailyAverageAltitudeArray;

    public /* synthetic */ b(Long l14, Double d14, List list, List list2, List list3, List list4, int i14, j jVar) {
        this(l14, d14, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : list2, (i14 & 16) != 0 ? null : list3, (i14 & 32) != 0 ? null : list4);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    public final ArrayList a() {
        Integer monitoringEnvironmentAltitudeDescIndex;
        Integer monitoringEnvironmentAltitudeDescIndex2;
        h hVar;
        Object next;
        Object next2;
        List<List<Object>> list = this.monitoringEnvironmentDailyAverageAltitudeArray;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            List<a> list3 = this.monitoringEnvironmentAltitudeDescriptorDTOList;
            if (list3 != null) {
                Iterator<T> it3 = list3.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!s.g(((a) next2).getMonitoringEnvironmentAltitudeDescKey(), "calendarDay"));
                a aVar = (a) next2;
                if (aVar != null) {
                    monitoringEnvironmentAltitudeDescIndex = aVar.getMonitoringEnvironmentAltitudeDescIndex();
                } else {
                    monitoringEnvironmentAltitudeDescIndex = null;
                }
            } else {
                monitoringEnvironmentAltitudeDescIndex = null;
            }
            List<a> list4 = this.monitoringEnvironmentAltitudeDescriptorDTOList;
            if (list4 != null) {
                Iterator<T> it4 = list4.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (!s.g(((a) next).getMonitoringEnvironmentAltitudeDescKey(), "monitoringEnvironmentDayAvgerage"));
                a aVar2 = (a) next;
                if (aVar2 != null) {
                    monitoringEnvironmentAltitudeDescIndex2 = aVar2.getMonitoringEnvironmentAltitudeDescIndex();
                } else {
                    monitoringEnvironmentAltitudeDescIndex2 = null;
                }
            } else {
                monitoringEnvironmentAltitudeDescIndex2 = null;
            }
            if (monitoringEnvironmentAltitudeDescIndex == null || monitoringEnvironmentAltitudeDescIndex2 == null) {
                hVar = null;
            } else {
                String strValueOf = String.valueOf(list2.get(monitoringEnvironmentAltitudeDescIndex.intValue()));
                Double dF = d53.s.f(String.valueOf(list2.get(monitoringEnvironmentAltitudeDescIndex2.intValue())));
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

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getOverallSpo2Average() {
        return this.overallSpo2Average;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    public final ArrayList c() {
        Integer spo2AcclimationValueDescIndex;
        Integer spo2AcclimationValueDescIndex2;
        h hVar;
        Object next;
        Object next2;
        List<List<Object>> list = this.spo2DailyAverageValueArray;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List list2 = (List) it.next();
            List<c> list3 = this.spo2AcclimationValueDescriptorDTOList;
            if (list3 != null) {
                Iterator<T> it3 = list3.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!s.g(((c) next2).getSpo2AcclimationValueDescKey(), "calendarDay"));
                c cVar = (c) next2;
                if (cVar != null) {
                    spo2AcclimationValueDescIndex = cVar.getSpo2AcclimationValueDescIndex();
                } else {
                    spo2AcclimationValueDescIndex = null;
                }
            } else {
                spo2AcclimationValueDescIndex = null;
            }
            List<c> list4 = this.spo2AcclimationValueDescriptorDTOList;
            if (list4 != null) {
                Iterator<T> it4 = list4.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (!s.g(((c) next).getSpo2AcclimationValueDescKey(), "spo2DayAverage"));
                c cVar2 = (c) next;
                if (cVar2 != null) {
                    spo2AcclimationValueDescIndex2 = cVar2.getSpo2AcclimationValueDescIndex();
                } else {
                    spo2AcclimationValueDescIndex2 = null;
                }
            } else {
                spo2AcclimationValueDescIndex2 = null;
            }
            if (spo2AcclimationValueDescIndex == null || spo2AcclimationValueDescIndex2 == null) {
                hVar = null;
            } else {
                String strValueOf = String.valueOf(list2.get(spo2AcclimationValueDescIndex.intValue()));
                Double dF = d53.s.f(String.valueOf(list2.get(spo2AcclimationValueDescIndex2.intValue())));
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.userProfilePk, bVar.userProfilePk) && s.g(this.overallSpo2Average, bVar.overallSpo2Average) && s.g(this.spo2DailyAverageValueArray, bVar.spo2DailyAverageValueArray) && s.g(this.spo2AcclimationValueDescriptorDTOList, bVar.spo2AcclimationValueDescriptorDTOList) && s.g(this.monitoringEnvironmentAltitudeDescriptorDTOList, bVar.monitoringEnvironmentAltitudeDescriptorDTOList) && s.g(this.monitoringEnvironmentDailyAverageAltitudeArray, bVar.monitoringEnvironmentDailyAverageAltitudeArray);
    }

    public final int hashCode() {
        Long l14 = this.userProfilePk;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Double d14 = this.overallSpo2Average;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        List<List<Object>> list = this.spo2DailyAverageValueArray;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<c> list2 = this.spo2AcclimationValueDescriptorDTOList;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<a> list3 = this.monitoringEnvironmentAltitudeDescriptorDTOList;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<List<Object>> list4 = this.monitoringEnvironmentDailyAverageAltitudeArray;
        return iHashCode5 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.userProfilePk;
        Double d14 = this.overallSpo2Average;
        List<List<Object>> list = this.spo2DailyAverageValueArray;
        List<c> list2 = this.spo2AcclimationValueDescriptorDTOList;
        List<a> list3 = this.monitoringEnvironmentAltitudeDescriptorDTOList;
        List<List<Object>> list4 = this.monitoringEnvironmentDailyAverageAltitudeArray;
        StringBuilder sb3 = new StringBuilder("PulseOxAcclimationWeeklyReportDTO(userProfilePk=");
        sb3.append(l14);
        sb3.append(", overallSpo2Average=");
        sb3.append(d14);
        sb3.append(", spo2DailyAverageValueArray=");
        n23.j.z(sb3, list, ", spo2AcclimationValueDescriptorDTOList=", list2, ", monitoringEnvironmentAltitudeDescriptorDTOList=");
        return n23.j.j(sb3, list3, ", monitoringEnvironmentDailyAverageAltitudeArray=", list4, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Long l14, Double d14, List<? extends List<? extends Object>> list, List<c> list2, List<a> list3, List<? extends List<? extends Object>> list4) {
        this.userProfilePk = l14;
        this.overallSpo2Average = d14;
        this.spo2DailyAverageValueArray = list;
        this.spo2AcclimationValueDescriptorDTOList = list2;
        this.monitoringEnvironmentAltitudeDescriptorDTOList = list3;
        this.monitoringEnvironmentDailyAverageAltitudeArray = list4;
    }
}
