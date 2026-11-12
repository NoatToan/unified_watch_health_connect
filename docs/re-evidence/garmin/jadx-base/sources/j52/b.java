package j52;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.womenshealth.adapters.DateTimeAdapter;
import com.garmin.android.apps.connectmobile.womenshealth.adapters.LocalDateAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eBÃ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0012\b\u0002\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R$\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R$\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b1\u0010)R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b\u0018\u0010FR,\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010'\u001a\u0004\bH\u0010)\"\u0004\bI\u0010JR$\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010E\u001a\u0004\bL\u0010F\"\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lj52/b;", "Landroid/os/Parcelable;", "", "userProfilePk", "Lorg/joda/time/LocalDate;", "date", "", "Lj52/l;", "symptoms", "Lj52/g;", "moods", "Lj52/e;", "flow", "Lj52/d;", "discharge", "Lj52/j;", "sexDrive", "Lj52/k;", "sexualActivity", "", "notes", "Lorg/joda/time/DateTime;", "reportTimestamp", "", "isOvulationDay", "Lj52/a;", "babyMovements", "hasGlucoseLog", "<init>", "(Ljava/lang/Long;Lorg/joda/time/LocalDate;Ljava/util/List;Ljava/util/List;Lj52/e;Ljava/util/List;Lj52/j;Lj52/k;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Long;", "getUserProfilePk", "()Ljava/lang/Long;", "b", "Lorg/joda/time/LocalDate;", "getDate", "()Lorg/joda/time/LocalDate;", "c", "Ljava/util/List;", "getSymptoms", "()Ljava/util/List;", "d", "getMoods", JWKParameterNames.RSA_EXPONENT, "Lj52/e;", "getFlow", "()Lj52/e;", "f", "getDischarge", "g", "Lj52/j;", "getSexDrive", "()Lj52/j;", "h", "Lj52/k;", "getSexualActivity", "()Lj52/k;", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getNotes", "()Ljava/lang/String;", "setNotes", "(Ljava/lang/String;)V", "j", "Lorg/joda/time/DateTime;", "getReportTimestamp", "()Lorg/joda/time/DateTime;", JWKParameterNames.OCT_KEY_VALUE, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "l", "getBabyMovements", "setBabyMovements", "(Ljava/util/List;)V", "m", "getHasGlucoseLog", "setHasGlucoseLog", "(Ljava/lang/Boolean;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final Long userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate date;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("symptoms")
    private final List<l> symptoms;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("moods")
    private final List<g> moods;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("flow")
    private final e flow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("discharge")
    private final List<d> discharge;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sexDrive")
    private final j sexDrive;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sexualActivity")
    private final k sexualActivity;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notes")
    private String notes;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportTimestamp")
    @JsonAdapter(DateTimeAdapter.class)
    private final DateTime reportTimestamp;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ovulationDay")
    private final Boolean isOvulationDay;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("babyMovements")
    private List<j52.a> babyMovements;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasGlucoseLog")
    private Boolean hasGlucoseLog;

    /* JADX INFO: renamed from: j52.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1855b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList.add(parcel.readInt() == 0 ? null : l.valueOf(parcel.readString()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i16 = parcel.readInt();
                arrayList2 = new ArrayList(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    arrayList2.add(parcel.readInt() == 0 ? null : g.valueOf(parcel.readString()));
                }
            }
            e eVarValueOf = parcel.readInt() == 0 ? null : e.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i18 = parcel.readInt();
                arrayList3 = new ArrayList(i18);
                for (int i19 = 0; i19 != i18; i19++) {
                    arrayList3.add(parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()));
                }
            }
            j jVarValueOf = parcel.readInt() == 0 ? null : j.valueOf(parcel.readString());
            k kVarValueOf = parcel.readInt() == 0 ? null : k.valueOf(parcel.readString());
            String string = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i24 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i24);
                for (int i25 = 0; i25 != i24; i25++) {
                    arrayList5.add(parcel.readInt() == 0 ? null : j52.a.CREATOR.createFromParcel(parcel));
                }
                arrayList4 = arrayList5;
            }
            return new b(lValueOf, localDate, arrayList, arrayList2, eVarValueOf, arrayList3, jVarValueOf, kVarValueOf, string, dateTime, boolValueOf, arrayList4, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new C1855b();
    }

    public b(Long l14, LocalDate localDate, List list, List list2, e eVar, List list3, j jVar, k kVar, String str, DateTime dateTime, Boolean bool, List list4, Boolean bool2, int i14, p005kotlin.jvm.internal.j jVar2) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : localDate, (i14 & 4) != 0 ? j0.f134944a : list, (i14 & 8) != 0 ? j0.f134944a : list2, (i14 & 16) != 0 ? null : eVar, (i14 & 32) != 0 ? j0.f134944a : list3, (i14 & 64) != 0 ? null : jVar, (i14 & 128) != 0 ? null : kVar, (i14 & 256) != 0 ? null : str, (i14 & 512) != 0 ? null : dateTime, (i14 & 1024) != 0 ? null : bool, (i14 & 2048) != 0 ? new ArrayList() : list4, (i14 & 4096) != 0 ? null : bool2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.userProfilePk, bVar.userProfilePk) && s.g(this.date, bVar.date) && s.g(this.symptoms, bVar.symptoms) && s.g(this.moods, bVar.moods) && this.flow == bVar.flow && s.g(this.discharge, bVar.discharge) && this.sexDrive == bVar.sexDrive && this.sexualActivity == bVar.sexualActivity && s.g(this.notes, bVar.notes) && s.g(this.reportTimestamp, bVar.reportTimestamp) && s.g(this.isOvulationDay, bVar.isOvulationDay) && s.g(this.babyMovements, bVar.babyMovements) && s.g(this.hasGlucoseLog, bVar.hasGlucoseLog);
    }

    public final int hashCode() {
        Long l14 = this.userProfilePk;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        LocalDate localDate = this.date;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        List<l> list = this.symptoms;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<g> list2 = this.moods;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        e eVar = this.flow;
        int iHashCode5 = (iHashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        List<d> list3 = this.discharge;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        j jVar = this.sexDrive;
        int iHashCode7 = (iHashCode6 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        k kVar = this.sexualActivity;
        int iHashCode8 = (iHashCode7 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str = this.notes;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        DateTime dateTime = this.reportTimestamp;
        int iHashCode10 = (iHashCode9 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Boolean bool = this.isOvulationDay;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<j52.a> list4 = this.babyMovements;
        int iHashCode12 = (iHashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool2 = this.hasGlucoseLog;
        return iHashCode12 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.userProfilePk;
        LocalDate localDate = this.date;
        List<l> list = this.symptoms;
        List<g> list2 = this.moods;
        e eVar = this.flow;
        List<d> list3 = this.discharge;
        j jVar = this.sexDrive;
        k kVar = this.sexualActivity;
        String str = this.notes;
        DateTime dateTime = this.reportTimestamp;
        Boolean bool = this.isOvulationDay;
        List<j52.a> list4 = this.babyMovements;
        Boolean bool2 = this.hasGlucoseLog;
        StringBuilder sb3 = new StringBuilder("DailyMenstrualCycleLogDTO(userProfilePk=");
        sb3.append(l14);
        sb3.append(", date=");
        sb3.append(localDate);
        sb3.append(", symptoms=");
        n23.j.z(sb3, list, ", moods=", list2, ", flow=");
        sb3.append(eVar);
        sb3.append(", discharge=");
        sb3.append(list3);
        sb3.append(", sexDrive=");
        sb3.append(jVar);
        sb3.append(", sexualActivity=");
        sb3.append(kVar);
        sb3.append(", notes=");
        sb3.append(str);
        sb3.append(", reportTimestamp=");
        sb3.append(dateTime);
        sb3.append(", isOvulationDay=");
        sb3.append(bool);
        sb3.append(", babyMovements=");
        sb3.append(list4);
        sb3.append(", hasGlucoseLog=");
        return p6.b.f(sb3, bool2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.userProfilePk;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeSerializable(this.date);
        List<l> list = this.symptoms;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                l lVar = (l) itO.next();
                if (lVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(lVar.name());
                }
            }
        }
        List<g> list2 = this.moods;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                g gVar = (g) itO2.next();
                if (gVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(gVar.name());
                }
            }
        }
        e eVar = this.flow;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(eVar.name());
        }
        List<d> list3 = this.discharge;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                d dVar = (d) itO3.next();
                if (dVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(dVar.name());
                }
            }
        }
        j jVar = this.sexDrive;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(jVar.name());
        }
        k kVar = this.sexualActivity;
        if (kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(kVar.name());
        }
        parcel.writeString(this.notes);
        parcel.writeSerializable(this.reportTimestamp);
        Boolean bool = this.isOvulationDay;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        List<j52.a> list4 = this.babyMovements;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO4 = u0.o(parcel, list4, 1);
            while (itO4.hasNext()) {
                j52.a aVar = (j52.a) itO4.next();
                if (aVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    aVar.writeToParcel(parcel, i14);
                }
            }
        }
        Boolean bool2 = this.hasGlucoseLog;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj52/b$a;", "", "<init>", "()V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Long l14, LocalDate localDate, List<? extends l> list, List<? extends g> list2, e eVar, List<? extends d> list3, j jVar, k kVar, String str, DateTime dateTime, Boolean bool, List<j52.a> list4, Boolean bool2) {
        this.userProfilePk = l14;
        this.date = localDate;
        this.symptoms = list;
        this.moods = list2;
        this.flow = eVar;
        this.discharge = list3;
        this.sexDrive = jVar;
        this.sexualActivity = kVar;
        this.notes = str;
        this.reportTimestamp = dateTime;
        this.isOvulationDay = bool;
        this.babyMovements = list4;
        this.hasGlucoseLog = bool2;
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
}
