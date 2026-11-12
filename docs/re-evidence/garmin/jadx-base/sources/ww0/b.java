package ww0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.DateTimeAdapter;
import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.LocalDateAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eBÃ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0012\b\u0002\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R$\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R$\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b0\u0010)R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00104\u001a\u0004\b5\u00106R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010?\u001a\u0004\b@\u0010AR,\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010'\u001a\u0004\b*\u0010)\"\u0004\bC\u0010DR$\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u0010?\u001a\u0004\bE\u0010A\"\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lww0/b;", "Landroid/os/Parcelable;", "", "userProfilePk", "Lorg/joda/time/LocalDate;", "date", "", "Lww0/t;", "symptoms", "Lww0/p;", "moods", "Lww0/h;", "flow", "Lww0/e;", "discharge", "Lww0/r;", "sexDrive", "Lww0/s;", "sexualActivity", "", "notes", "Lorg/joda/time/DateTime;", "reportTimestamp", "", "isOvulationDay", "Ldb1/a;", "babyMovements", "hasGlucoseLog", "<init>", "(Ljava/lang/Long;Lorg/joda/time/LocalDate;Ljava/util/List;Ljava/util/List;Lww0/h;Ljava/util/List;Lww0/r;Lww0/s;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Long;", "getUserProfilePk", "()Ljava/lang/Long;", "b", "Lorg/joda/time/LocalDate;", "f", "()Lorg/joda/time/LocalDate;", "c", "Ljava/util/List;", "o", "()Ljava/util/List;", "d", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.RSA_EXPONENT, "Lww0/h;", "h", "()Lww0/h;", "g", "Lww0/r;", JWKParameterNames.OCT_KEY_VALUE, "()Lww0/r;", "Lww0/s;", "m", "()Lww0/s;", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "s", "(Ljava/lang/String;)V", "Lorg/joda/time/DateTime;", "getReportTimestamp", "()Lorg/joda/time/DateTime;", "Ljava/lang/Boolean;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Ljava/lang/Boolean;", "l", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "(Ljava/util/List;)V", "getHasGlucoseLog", "setHasGlucoseLog", "(Ljava/lang/Boolean;)V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final Long userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate date;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("symptoms")
    private final List<t> symptoms;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("moods")
    private final List<p> moods;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("flow")
    private final h flow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("discharge")
    private final List<e> discharge;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sexDrive")
    private final r sexDrive;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sexualActivity")
    private final s sexualActivity;

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
    private List<db1.a> babyMovements;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasGlucoseLog")
    private Boolean hasGlucoseLog;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f187523n = new a(null);
    public static final Parcelable.Creator<b> CREATOR = new C3489b();

    /* JADX INFO: renamed from: ww0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3489b implements Parcelable.Creator<b> {
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
                    arrayList.add(parcel.readInt() == 0 ? null : t.valueOf(parcel.readString()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i16 = parcel.readInt();
                arrayList2 = new ArrayList(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    arrayList2.add(parcel.readInt() == 0 ? null : p.valueOf(parcel.readString()));
                }
            }
            h hVarValueOf = parcel.readInt() == 0 ? null : h.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i18 = parcel.readInt();
                arrayList3 = new ArrayList(i18);
                for (int i19 = 0; i19 != i18; i19++) {
                    arrayList3.add(parcel.readInt() == 0 ? null : e.valueOf(parcel.readString()));
                }
            }
            r rVarValueOf = parcel.readInt() == 0 ? null : r.valueOf(parcel.readString());
            s sVarValueOf = parcel.readInt() == 0 ? null : s.valueOf(parcel.readString());
            String string = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i24 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i24);
                for (int i25 = 0; i25 != i24; i25++) {
                    arrayList5.add(parcel.readInt() == 0 ? null : db1.a.CREATOR.createFromParcel(parcel));
                }
                arrayList4 = arrayList5;
            }
            return new b(lValueOf, localDate, arrayList, arrayList2, hVarValueOf, arrayList3, rVarValueOf, sVarValueOf, string, dateTime, boolValueOf, arrayList4, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(Long l14, LocalDate localDate, List list, List list2, h hVar, List list3, r rVar, s sVar, String str, DateTime dateTime, Boolean bool, List list4, Boolean bool2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : localDate, (i14 & 4) != 0 ? j0.f134944a : list, (i14 & 8) != 0 ? j0.f134944a : list2, (i14 & 16) != 0 ? null : hVar, (i14 & 32) != 0 ? j0.f134944a : list3, (i14 & 64) != 0 ? null : rVar, (i14 & 128) != 0 ? null : sVar, (i14 & 256) != 0 ? null : str, (i14 & 512) != 0 ? null : dateTime, (i14 & 1024) != 0 ? null : bool, (i14 & 2048) != 0 ? new ArrayList() : list4, (i14 & 4096) != 0 ? null : bool2);
    }

    public static b b(b bVar, String str, DateTime dateTime, int i14) {
        Long l14 = bVar.userProfilePk;
        LocalDate localDate = bVar.date;
        List<t> list = bVar.symptoms;
        List<p> list2 = bVar.moods;
        h hVar = bVar.flow;
        List<e> list3 = bVar.discharge;
        r rVar = bVar.sexDrive;
        s sVar = bVar.sexualActivity;
        if ((i14 & 256) != 0) {
            str = bVar.notes;
        }
        Boolean bool = bVar.isOvulationDay;
        List<db1.a> list4 = bVar.babyMovements;
        Boolean bool2 = bVar.hasGlucoseLog;
        bVar.getClass();
        return new b(l14, localDate, list, list2, hVar, list3, rVar, sVar, str, dateTime, bool, list4, bool2);
    }

    public final List<db1.a> d() {
        return this.babyMovements;
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
        return p005kotlin.jvm.internal.s.g(this.userProfilePk, bVar.userProfilePk) && p005kotlin.jvm.internal.s.g(this.date, bVar.date) && p005kotlin.jvm.internal.s.g(this.symptoms, bVar.symptoms) && p005kotlin.jvm.internal.s.g(this.moods, bVar.moods) && this.flow == bVar.flow && p005kotlin.jvm.internal.s.g(this.discharge, bVar.discharge) && this.sexDrive == bVar.sexDrive && this.sexualActivity == bVar.sexualActivity && p005kotlin.jvm.internal.s.g(this.notes, bVar.notes) && p005kotlin.jvm.internal.s.g(this.reportTimestamp, bVar.reportTimestamp) && p005kotlin.jvm.internal.s.g(this.isOvulationDay, bVar.isOvulationDay) && p005kotlin.jvm.internal.s.g(this.babyMovements, bVar.babyMovements) && p005kotlin.jvm.internal.s.g(this.hasGlucoseLog, bVar.hasGlucoseLog);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    public final List<e> g() {
        return this.discharge;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final h getFlow() {
        return this.flow;
    }

    public final int hashCode() {
        Long l14 = this.userProfilePk;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        LocalDate localDate = this.date;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        List<t> list = this.symptoms;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<p> list2 = this.moods;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        h hVar = this.flow;
        int iHashCode5 = (iHashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        List<e> list3 = this.discharge;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        r rVar = this.sexDrive;
        int iHashCode7 = (iHashCode6 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        s sVar = this.sexualActivity;
        int iHashCode8 = (iHashCode7 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        String str = this.notes;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        DateTime dateTime = this.reportTimestamp;
        int iHashCode10 = (iHashCode9 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Boolean bool = this.isOvulationDay;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<db1.a> list4 = this.babyMovements;
        int iHashCode12 = (iHashCode11 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool2 = this.hasGlucoseLog;
        return iHashCode12 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final List<p> i() {
        return this.moods;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final r getSexDrive() {
        return this.sexDrive;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final s getSexualActivity() {
        return this.sexualActivity;
    }

    public final List<t> o() {
        return this.symptoms;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Boolean getIsOvulationDay() {
        return this.isOvulationDay;
    }

    public final void r(ArrayList arrayList) {
        this.babyMovements = arrayList;
    }

    public final void s(String str) {
        this.notes = str;
    }

    public final String toString() {
        Long l14 = this.userProfilePk;
        LocalDate localDate = this.date;
        List<t> list = this.symptoms;
        List<p> list2 = this.moods;
        h hVar = this.flow;
        List<e> list3 = this.discharge;
        r rVar = this.sexDrive;
        s sVar = this.sexualActivity;
        String str = this.notes;
        DateTime dateTime = this.reportTimestamp;
        Boolean bool = this.isOvulationDay;
        List<db1.a> list4 = this.babyMovements;
        Boolean bool2 = this.hasGlucoseLog;
        StringBuilder sb3 = new StringBuilder("DailyMenstrualCycleLogDTO(userProfilePk=");
        sb3.append(l14);
        sb3.append(", date=");
        sb3.append(localDate);
        sb3.append(", symptoms=");
        n23.j.z(sb3, list, ", moods=", list2, ", flow=");
        sb3.append(hVar);
        sb3.append(", discharge=");
        sb3.append(list3);
        sb3.append(", sexDrive=");
        sb3.append(rVar);
        sb3.append(", sexualActivity=");
        sb3.append(sVar);
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
        List<t> list = this.symptoms;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                t tVar = (t) itO.next();
                if (tVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(tVar.name());
                }
            }
        }
        List<p> list2 = this.moods;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                p pVar = (p) itO2.next();
                if (pVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(pVar.name());
                }
            }
        }
        h hVar = this.flow;
        if (hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(hVar.name());
        }
        List<e> list3 = this.discharge;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                e eVar = (e) itO3.next();
                if (eVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(eVar.name());
                }
            }
        }
        r rVar = this.sexDrive;
        if (rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(rVar.name());
        }
        s sVar = this.sexualActivity;
        if (sVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(sVar.name());
        }
        parcel.writeString(this.notes);
        parcel.writeSerializable(this.reportTimestamp);
        Boolean bool = this.isOvulationDay;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        List<db1.a> list4 = this.babyMovements;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO4 = u0.o(parcel, list4, 1);
            while (itO4.hasNext()) {
                db1.a aVar = (db1.a) itO4.next();
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww0/b$a;", "", "<init>", "()V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static b a(LocalDate localDate) {
            localDate.getClass();
            return new b(Long.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), localDate, null, null, null, null, null, null, null, DateTime.now(DateTimeZone.UTC), null, null, null, 6144, null);
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(Long l14, LocalDate localDate, List<? extends t> list, List<? extends p> list2, h hVar, List<? extends e> list3, r rVar, s sVar, String str, DateTime dateTime, Boolean bool, List<db1.a> list4, Boolean bool2) {
        this.userProfilePk = l14;
        this.date = localDate;
        this.symptoms = list;
        this.moods = list2;
        this.flow = hVar;
        this.discharge = list3;
        this.sexDrive = rVar;
        this.sexualActivity = sVar;
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
