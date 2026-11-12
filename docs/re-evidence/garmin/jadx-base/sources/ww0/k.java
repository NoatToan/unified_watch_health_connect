package ww0;

import android.os.Parcel;
import android.os.Parcelable;
import c22.h0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.LocalDateAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0017\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\u001d\u0010!R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\"\u0010%R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b#\u0010%R$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lww0/k;", "Landroid/os/Parcelable;", "Lorg/joda/time/LocalDate;", "nextReportDate", "Lww0/k$b;", "nextReportType", "prevReportDate", "prevReportType", "", "avgCycleLength", "avgPeriodLength", "", "Lww0/n;", "cycleSummaries", "Lww0/b;", "dailyLogs", "searchDate", "<init>", "(Lorg/joda/time/LocalDate;Lww0/k$b;Lorg/joda/time/LocalDate;Lww0/k$b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Lorg/joda/time/LocalDate;)V", "a", "Lorg/joda/time/LocalDate;", IntegerTokenConverter.CONVERTER_KEY, "()Lorg/joda/time/LocalDate;", "b", "Lww0/k$b;", "j", "()Lww0/k$b;", "c", JWKParameterNames.OCT_KEY_VALUE, "d", "m", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "f", "g", "Ljava/util/List;", "()Ljava/util/List;", "h", "o", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(Lorg/joda/time/LocalDate;)V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nextReportDate")
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate nextReportDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nextReportType")
    private final b nextReportType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("prevReportDate")
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate prevReportDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("prevReportType")
    private final b prevReportType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgCycleLength")
    private final Integer avgCycleLength;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgPeriodLength")
    private final Integer avgPeriodLength;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cycleSummaries")
    private final List<n> cycleSummaries;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dailyLogs")
    private final List<ww0.b> dailyLogs;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("searchDate")
    private LocalDate searchDate;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            ArrayList arrayList2 = null;
            b bVarValueOf = parcel.readInt() == 0 ? null : b.valueOf(parcel.readString());
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            b bVarValueOf2 = parcel.readInt() == 0 ? null : b.valueOf(parcel.readString());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int iA = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = kg.f.a(n.CREATOR, parcel, arrayList, iA2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                while (iA != i15) {
                    iA = kg.f.a(ww0.b.CREATOR, parcel, arrayList2, iA, 1);
                }
            }
            return new k(localDate, bVarValueOf, localDate2, bVarValueOf2, numValueOf, numValueOf2, arrayList, arrayList2, (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lww0/k$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        CYCLE,
        MONTH,
        WEEKS
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((n) t7).getStartDate(), ((n) t14).getStartDate());
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((n) t7).getStartDate(), ((n) t14).getStartDate());
        }
    }

    public /* synthetic */ k(LocalDate localDate, b bVar, LocalDate localDate2, b bVar2, Integer num, Integer num2, List list, List list2, LocalDate localDate3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : localDate, (i14 & 2) != 0 ? null : bVar, (i14 & 4) != 0 ? null : localDate2, (i14 & 8) != 0 ? null : bVar2, (i14 & 16) != 0 ? null : num, (i14 & 32) != 0 ? null : num2, (i14 & 64) != 0 ? null : list, (i14 & 128) != 0 ? null : list2, (i14 & 256) != 0 ? null : localDate3);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getAvgCycleLength() {
        return this.avgCycleLength;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getAvgPeriodLength() {
        return this.avgPeriodLength;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.nextReportDate, kVar.nextReportDate) && this.nextReportType == kVar.nextReportType && p005kotlin.jvm.internal.s.g(this.prevReportDate, kVar.prevReportDate) && this.prevReportType == kVar.prevReportType && p005kotlin.jvm.internal.s.g(this.avgCycleLength, kVar.avgCycleLength) && p005kotlin.jvm.internal.s.g(this.avgPeriodLength, kVar.avgPeriodLength) && p005kotlin.jvm.internal.s.g(this.cycleSummaries, kVar.cycleSummaries) && p005kotlin.jvm.internal.s.g(this.dailyLogs, kVar.dailyLogs) && p005kotlin.jvm.internal.s.g(this.searchDate, kVar.searchDate);
    }

    public final List<n> f() {
        return this.cycleSummaries;
    }

    public final List<ww0.b> g() {
        return this.dailyLogs;
    }

    public final LocalDate h() {
        LocalDate localDate = this.nextReportDate;
        if (localDate != null) {
            return jg.b.J(localDate);
        }
        List<n> list = this.cycleSummaries;
        if (list == null || !(!list.isEmpty())) {
            LocalDate localDate2 = this.searchDate;
            if (localDate2 != null) {
                return jg.b.t(localDate2);
            }
            return null;
        }
        h0 h0VarG = ((n) p13.h0.m0(p13.h0.N0(this.cycleSummaries, new c()))).g();
        if (h0VarG != null) {
            return h0VarG.f23062b;
        }
        return null;
    }

    public final int hashCode() {
        LocalDate localDate = this.nextReportDate;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        b bVar = this.nextReportType;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        LocalDate localDate2 = this.prevReportDate;
        int iHashCode3 = (iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        b bVar2 = this.prevReportType;
        int iHashCode4 = (iHashCode3 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        Integer num = this.avgCycleLength;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.avgPeriodLength;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<n> list = this.cycleSummaries;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<ww0.b> list2 = this.dailyLogs;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        LocalDate localDate3 = this.searchDate;
        return iHashCode8 + (localDate3 != null ? localDate3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final LocalDate getNextReportDate() {
        return this.nextReportDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final b getNextReportType() {
        return this.nextReportType;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final LocalDate getPrevReportDate() {
        return this.prevReportDate;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final b getPrevReportType() {
        return this.prevReportType;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final LocalDate getSearchDate() {
        return this.searchDate;
    }

    public final LocalDate q() {
        List<n> list = this.cycleSummaries;
        if (list != null && (!list.isEmpty())) {
            return ((n) p13.h0.b0(p13.h0.N0(this.cycleSummaries, new d()))).getStartDate();
        }
        LocalDate localDate = this.searchDate;
        if (localDate != null) {
            return jg.b.P(localDate);
        }
        return null;
    }

    public final void r(LocalDate localDate) {
        this.searchDate = localDate;
    }

    public final String toString() {
        LocalDate localDate = this.nextReportDate;
        b bVar = this.nextReportType;
        LocalDate localDate2 = this.prevReportDate;
        b bVar2 = this.prevReportType;
        Integer num = this.avgCycleLength;
        Integer num2 = this.avgPeriodLength;
        List<n> list = this.cycleSummaries;
        List<ww0.b> list2 = this.dailyLogs;
        LocalDate localDate3 = this.searchDate;
        StringBuilder sb3 = new StringBuilder("MenstrualCycleReportDTO(nextReportDate=");
        sb3.append(localDate);
        sb3.append(", nextReportType=");
        sb3.append(bVar);
        sb3.append(", prevReportDate=");
        sb3.append(localDate2);
        sb3.append(", prevReportType=");
        sb3.append(bVar2);
        sb3.append(", avgCycleLength=");
        x.m(sb3, num, ", avgPeriodLength=", num2, ", cycleSummaries=");
        n23.j.z(sb3, list, ", dailyLogs=", list2, ", searchDate=");
        sb3.append(localDate3);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.nextReportDate);
        b bVar = this.nextReportType;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
        parcel.writeSerializable(this.prevReportDate);
        b bVar2 = this.prevReportType;
        if (bVar2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar2.name());
        }
        Integer num = this.avgCycleLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.avgPeriodLength;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        List<n> list = this.cycleSummaries;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((n) itO.next()).writeToParcel(parcel, i14);
            }
        }
        List<ww0.b> list2 = this.dailyLogs;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((ww0.b) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeSerializable(this.searchDate);
    }

    public k(LocalDate localDate, b bVar, LocalDate localDate2, b bVar2, Integer num, Integer num2, List<n> list, List<ww0.b> list2, LocalDate localDate3) {
        this.nextReportDate = localDate;
        this.nextReportType = bVar;
        this.prevReportDate = localDate2;
        this.prevReportType = bVar2;
        this.avgCycleLength = num;
        this.avgPeriodLength = num2;
        this.cycleSummaries = list;
        this.dailyLogs = list2;
        this.searchDate = localDate3;
    }

    public k() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
