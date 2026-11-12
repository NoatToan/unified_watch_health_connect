package ip1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.solarcharge.adapter.ShortDateTimeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lip1/g;", "Landroid/os/Parcelable;", "Lorg/joda/time/LocalDate;", "localConnectDate", "", "Lip1/j;", "solarInputReadings", "", "totalActivityTimeGainedMs", "<init>", "(Lorg/joda/time/LocalDate;Ljava/util/List;Ljava/lang/Long;)V", "a", "Lorg/joda/time/LocalDate;", "b", "()Lorg/joda/time/LocalDate;", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("localConnectDate")
    @JsonAdapter(ShortDateTimeAdapter.class)
    private final LocalDate localConnectDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("solarInputReadings")
    private final List<j> solarInputReadings;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalActivityTimeGainedMs")
    private final Long totalActivityTimeGainedMs;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(j.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new g(localDate, arrayList, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public g(LocalDate localDate, List<j> list, Long l14) {
        this.localConnectDate = localDate;
        this.solarInputReadings = list;
        this.totalActivityTimeGainedMs = l14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getLocalConnectDate() {
        return this.localConnectDate;
    }

    public final List<j> d() {
        return this.solarInputReadings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.localConnectDate, gVar.localConnectDate) && s.g(this.solarInputReadings, gVar.solarInputReadings) && s.g(this.totalActivityTimeGainedMs, gVar.totalActivityTimeGainedMs);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getTotalActivityTimeGainedMs() {
        return this.totalActivityTimeGainedMs;
    }

    public final int hashCode() {
        LocalDate localDate = this.localConnectDate;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        List<j> list = this.solarInputReadings;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l14 = this.totalActivityTimeGainedMs;
        return iHashCode2 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        LocalDate localDate = this.localConnectDate;
        List<j> list = this.solarInputReadings;
        Long l14 = this.totalActivityTimeGainedMs;
        StringBuilder sb3 = new StringBuilder("SolarDailyDataDTO(localConnectDate=");
        sb3.append(localDate);
        sb3.append(", solarInputReadings=");
        sb3.append(list);
        sb3.append(", totalActivityTimeGainedMs=");
        return p6.b.g(sb3, l14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.localConnectDate);
        List<j> list = this.solarInputReadings;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((j) itO.next()).writeToParcel(parcel, i14);
            }
        }
        Long l14 = this.totalActivityTimeGainedMs;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
    }
}
