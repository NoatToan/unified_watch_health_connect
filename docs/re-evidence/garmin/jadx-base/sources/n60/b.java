package n60;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.util.adapters.LocalDateAdapter;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kg.f;
import lc.u0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0010\u0010\u0015¨\u0006\u0016"}, d2 = {"Ln60/b;", "Landroid/os/Parcelable;", "Lorg/joda/time/LocalDate;", Constants.MessagePayloadKeys.FROM, "until", "", "Lg60/b;", "criticalSwimSpeedDTOList", "Ln60/a;", "aggregatedResults", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/List;Ljava/util/List;)V", "a", "Lorg/joda/time/LocalDate;", "getFrom", "()Lorg/joda/time/LocalDate;", "b", "getUntil", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "gcm-critical-swim-speed_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Constants.MessagePayloadKeys.FROM)
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate from;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("until")
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate until;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("criticalSwimSpeedDTOList")
    private final List<g60.b> criticalSwimSpeedDTOList;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("aggregatedResults")
    private final List<n60.a> aggregatedResults;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            int iA = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(b.class, parcel, arrayList, iD, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                while (iA != i15) {
                    iA = f.a(n60.a.CREATOR, parcel, arrayList2, iA, 1);
                }
            }
            return new b(localDate, localDate2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    /* JADX INFO: renamed from: n60.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2327b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            DateTime dateTimeAtStartOfDay;
            DateTime dateTimeAtStartOfDay2;
            LocalDate localDate = ((n60.a) t14).getCom.google.firebase.messaging.Constants.MessagePayloadKeys.FROM java.lang.String();
            long millis = 0;
            Long lValueOf = Long.valueOf((localDate == null || (dateTimeAtStartOfDay2 = localDate.toDateTimeAtStartOfDay()) == null) ? 0L : dateTimeAtStartOfDay2.getMillis());
            LocalDate localDate2 = ((n60.a) t7).getCom.google.firebase.messaging.Constants.MessagePayloadKeys.FROM java.lang.String();
            if (localDate2 != null && (dateTimeAtStartOfDay = localDate2.toDateTimeAtStartOfDay()) != null) {
                millis = dateTimeAtStartOfDay.getMillis();
            }
            return r13.a.b(lValueOf, Long.valueOf(millis));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            DateTime dateTimeF = ((g60.b) t14).f();
            Long lValueOf = Long.valueOf(dateTimeF != null ? dateTimeF.getMillis() : 0L);
            DateTime dateTimeF2 = ((g60.b) t7).f();
            return r13.a.b(lValueOf, Long.valueOf(dateTimeF2 != null ? dateTimeF2.getMillis() : 0L));
        }
    }

    public /* synthetic */ b(LocalDate localDate, LocalDate localDate2, List list, List list2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : localDate, (i14 & 2) != 0 ? null : localDate2, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : list2);
    }

    public final List<n60.a> b() {
        return this.aggregatedResults;
    }

    public final List<g60.b> d() {
        return this.criticalSwimSpeedDTOList;
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
        return s.g(this.from, bVar.from) && s.g(this.until, bVar.until) && s.g(this.criticalSwimSpeedDTOList, bVar.criticalSwimSpeedDTOList) && s.g(this.aggregatedResults, bVar.aggregatedResults);
    }

    public final List<n60.a> f() {
        List<n60.a> list = this.aggregatedResults;
        if (list != null) {
            return h0.N0(list, new C2327b());
        }
        return null;
    }

    public final List<g60.b> g() {
        List<g60.b> list = this.criticalSwimSpeedDTOList;
        if (list != null) {
            return h0.N0(list, new c());
        }
        return null;
    }

    public final int hashCode() {
        LocalDate localDate = this.from;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.until;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        List<g60.b> list = this.criticalSwimSpeedDTOList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<n60.a> list2 = this.aggregatedResults;
        return iHashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        LocalDate localDate = this.from;
        LocalDate localDate2 = this.until;
        List<g60.b> list = this.criticalSwimSpeedDTOList;
        List<n60.a> list2 = this.aggregatedResults;
        StringBuilder sb3 = new StringBuilder("CriticalSwimSpeedSummaryDTO(from=");
        sb3.append(localDate);
        sb3.append(", until=");
        sb3.append(localDate2);
        sb3.append(", criticalSwimSpeedDTOList=");
        return n23.j.j(sb3, list, ", aggregatedResults=", list2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.from);
        parcel.writeSerializable(this.until);
        List<g60.b> list = this.criticalSwimSpeedDTOList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeParcelable((Parcelable) itO.next(), i14);
            }
        }
        List<n60.a> list2 = this.aggregatedResults;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO2 = u0.o(parcel, list2, 1);
        while (itO2.hasNext()) {
            ((n60.a) itO2.next()).writeToParcel(parcel, i14);
        }
    }

    public b(LocalDate localDate, LocalDate localDate2, List<g60.b> list, List<n60.a> list2) {
        this.from = localDate;
        this.until = localDate2;
        this.criticalSwimSpeedDTOList = list;
        this.aggregatedResults = list2;
    }

    public b() {
        this(null, null, null, null, 15, null);
    }
}
