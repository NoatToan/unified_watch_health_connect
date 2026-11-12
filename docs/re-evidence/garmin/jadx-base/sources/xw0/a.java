package xw0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.LocalDateListAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import ww0.l;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR$\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u000eR$\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR$\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Lxw0/a;", "Landroid/os/Parcelable;", "", "Lww0/l;", "cycleSummaries", "Lorg/joda/time/LocalDate;", "loggedSymptomDays", "loggedOvulationDays", "loggedNoteDays", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "g", "c", "f", "d", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3589a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cycleSummaries")
    private final List<l> cycleSummaries;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("loggedSymptomDays")
    @JsonAdapter(LocalDateListAdapter.class)
    private final List<LocalDate> loggedSymptomDays;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("loggedOvulationDays")
    @JsonAdapter(LocalDateListAdapter.class)
    private final List<LocalDate> loggedOvulationDays;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("loggedNoteDays")
    @JsonAdapter(LocalDateListAdapter.class)
    private final List<LocalDate> loggedNoteDays;

    /* JADX INFO: renamed from: xw0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3589a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            parcel.getClass();
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(a.class, parcel, arrayList, iD, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    arrayList2.add(parcel.readSerializable());
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i17 = parcel.readInt();
                arrayList3 = new ArrayList(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    arrayList3.add(parcel.readSerializable());
                }
            }
            if (parcel.readInt() != 0) {
                int i19 = parcel.readInt();
                arrayList4 = new ArrayList(i19);
                for (int i24 = 0; i24 != i19; i24++) {
                    arrayList4.add(parcel.readSerializable());
                }
            }
            return new a(arrayList, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(List list, List list2, List list3, List list4, int i14, j jVar) {
        this((i14 & 1) != 0 ? j0.f134944a : list, (i14 & 2) != 0 ? j0.f134944a : list2, (i14 & 4) != 0 ? j0.f134944a : list3, (i14 & 8) != 0 ? j0.f134944a : list4);
    }

    public final List<l> b() {
        return this.cycleSummaries;
    }

    public final List<LocalDate> d() {
        return this.loggedNoteDays;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.cycleSummaries, aVar.cycleSummaries) && s.g(this.loggedSymptomDays, aVar.loggedSymptomDays) && s.g(this.loggedOvulationDays, aVar.loggedOvulationDays) && s.g(this.loggedNoteDays, aVar.loggedNoteDays);
    }

    public final List<LocalDate> f() {
        return this.loggedOvulationDays;
    }

    public final List<LocalDate> g() {
        return this.loggedSymptomDays;
    }

    public final boolean h() {
        List<l> list = this.cycleSummaries;
        list.getClass();
        Iterator<l> it = list.iterator();
        while (it.hasNext()) {
            l next = it.next();
            if ((next != null ? next.getStartDate() : null) == null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        List<l> list = this.cycleSummaries;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<LocalDate> list2 = this.loggedSymptomDays;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<LocalDate> list3 = this.loggedOvulationDays;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<LocalDate> list4 = this.loggedNoteDays;
        return iHashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public final String toString() {
        List<l> list = this.cycleSummaries;
        List<LocalDate> list2 = this.loggedSymptomDays;
        return n23.j.j(f3.k("CycleCalendarSummaryDTO(cycleSummaries=", ", loggedSymptomDays=", ", loggedOvulationDays=", list, list2), this.loggedOvulationDays, ", loggedNoteDays=", this.loggedNoteDays, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<l> list = this.cycleSummaries;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeParcelable((Parcelable) itO.next(), i14);
            }
        }
        List<LocalDate> list2 = this.loggedSymptomDays;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                parcel.writeSerializable((Serializable) itO2.next());
            }
        }
        List<LocalDate> list3 = this.loggedOvulationDays;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                parcel.writeSerializable((Serializable) itO3.next());
            }
        }
        List<LocalDate> list4 = this.loggedNoteDays;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO4 = u0.o(parcel, list4, 1);
        while (itO4.hasNext()) {
            parcel.writeSerializable((Serializable) itO4.next());
        }
    }

    public a(List<l> list, List<LocalDate> list2, List<LocalDate> list3, List<LocalDate> list4) {
        this.cycleSummaries = list;
        this.loggedSymptomDays = list2;
        this.loggedOvulationDays = list3;
        this.loggedNoteDays = list4;
    }

    public a() {
        this(null, null, null, null, 15, null);
    }
}
