package xw0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.CycleDatesAdapter;
import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.DateTimeAdapter;
import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.LocalDateAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.f;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR.\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u0014\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lxw0/c;", "Landroid/os/Parcelable;", "", "userProfilePk", "Lorg/joda/time/LocalDate;", "todayCalendarDate", "startDate", "endDate", "Lorg/joda/time/DateTime;", "reportTimestamp", "", "cycleDatesLists", "", "futureEditsByFE", "<init>", "(Ljava/lang/Long;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/DateTime;Ljava/util/List;Z)V", "a", "Ljava/lang/Long;", "getUserProfilePk", "()Ljava/lang/Long;", "b", "Lorg/joda/time/LocalDate;", "getTodayCalendarDate", "()Lorg/joda/time/LocalDate;", "c", "f", "d", JWKParameterNames.RSA_EXPONENT, "Lorg/joda/time/DateTime;", "getReportTimestamp", "()Lorg/joda/time/DateTime;", "Ljava/util/List;", "()Ljava/util/List;", "setCycleDatesLists", "(Ljava/util/List;)V", "g", "Z", "getFutureEditsByFE", "()Z", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final Long userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("todayCalendarDate")
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate todayCalendarDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate startDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate endDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportTimestamp")
    @JsonAdapter(DateTimeAdapter.class)
    private final DateTime reportTimestamp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cycleDatesLists")
    @JsonAdapter(CycleDatesAdapter.class)
    private List<List<LocalDate>> cycleDatesLists;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("futureEditsByFE")
    private final boolean futureEditsByFE;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            LocalDate localDate3 = (LocalDate) parcel.readSerializable();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                int i16 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    arrayList2.add(parcel.readSerializable());
                }
                arrayList.add(arrayList2);
            }
            return new c(lValueOf, localDate, localDate2, localDate3, dateTime, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(Long l14, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, DateTime dateTime, List list, boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : localDate, (i14 & 4) != 0 ? null : localDate2, (i14 & 8) != 0 ? null : localDate3, (i14 & 16) != 0 ? null : dateTime, (i14 & 32) != 0 ? new ArrayList() : list, (i14 & 64) != 0 ? true : z14);
    }

    public final List<List<LocalDate>> b() {
        return this.cycleDatesLists;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getEndDate() {
        return this.endDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.userProfilePk, cVar.userProfilePk) && s.g(this.todayCalendarDate, cVar.todayCalendarDate) && s.g(this.startDate, cVar.startDate) && s.g(this.endDate, cVar.endDate) && s.g(this.reportTimestamp, cVar.reportTimestamp) && s.g(this.cycleDatesLists, cVar.cycleDatesLists) && this.futureEditsByFE == cVar.futureEditsByFE;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    public final int hashCode() {
        Long l14 = this.userProfilePk;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        LocalDate localDate = this.todayCalendarDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.startDate;
        int iHashCode3 = (iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.endDate;
        int iHashCode4 = (iHashCode3 + (localDate3 == null ? 0 : localDate3.hashCode())) * 31;
        DateTime dateTime = this.reportTimestamp;
        return Boolean.hashCode(this.futureEditsByFE) + u0.b((iHashCode4 + (dateTime != null ? dateTime.hashCode() : 0)) * 31, 31, this.cycleDatesLists);
    }

    public final String toString() {
        Long l14 = this.userProfilePk;
        LocalDate localDate = this.todayCalendarDate;
        LocalDate localDate2 = this.startDate;
        LocalDate localDate3 = this.endDate;
        DateTime dateTime = this.reportTimestamp;
        List<List<LocalDate>> list = this.cycleDatesLists;
        boolean z14 = this.futureEditsByFE;
        StringBuilder sb3 = new StringBuilder("MenstrualCycleCalendarUpdatesDTO(userProfilePk=");
        sb3.append(l14);
        sb3.append(", todayCalendarDate=");
        sb3.append(localDate);
        sb3.append(", startDate=");
        sb3.append(localDate2);
        sb3.append(", endDate=");
        sb3.append(localDate3);
        sb3.append(", reportTimestamp=");
        sb3.append(dateTime);
        sb3.append(", cycleDatesLists=");
        sb3.append(list);
        sb3.append(", futureEditsByFE=");
        return hb.a.k(sb3, z14, ")");
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
        parcel.writeSerializable(this.todayCalendarDate);
        parcel.writeSerializable(this.startDate);
        parcel.writeSerializable(this.endDate);
        parcel.writeSerializable(this.reportTimestamp);
        Iterator itE = f.e(this.cycleDatesLists, parcel);
        while (itE.hasNext()) {
            Iterator itE2 = f.e((List) itE.next(), parcel);
            while (itE2.hasNext()) {
                parcel.writeSerializable((Serializable) itE2.next());
            }
        }
        parcel.writeInt(this.futureEditsByFE ? 1 : 0);
    }

    public c(Long l14, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, DateTime dateTime, List<List<LocalDate>> list, boolean z14) {
        list.getClass();
        this.userProfilePk = l14;
        this.todayCalendarDate = localDate;
        this.startDate = localDate2;
        this.endDate = localDate3;
        this.reportTimestamp = dateTime;
        this.cycleDatesLists = list;
        this.futureEditsByFE = z14;
    }

    public c() {
        this(null, null, null, null, null, null, false, 127, null);
    }
}
