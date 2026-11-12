package kw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0012\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lkw/h;", "Landroid/os/Parcelable;", "", "startDate", "endDate", "", "Lkw/l;", "bloodPressureSummaries", "Lkw/k;", "bloodPressureStats", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkw/k;)V", "a", "Ljava/lang/String;", "getStartDate", "()Ljava/lang/String;", "setStartDate", "(Ljava/lang/String;)V", "b", "getEndDate", "setEndDate", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "setBloodPressureSummaries", "(Ljava/util/List;)V", "Lkw/k;", "()Lkw/k;", "setBloodPressureStats", "(Lkw/k;)V", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(Constants.MessagePayloadKeys.FROM)
    private String startDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("until")
    private String endDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("measurementSummaries")
    private List<l> bloodPressureSummaries;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("categoryStats")
    private k bloodPressureStats;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(l.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new h(string, string2, arrayList, parcel.readInt() != 0 ? k.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public /* synthetic */ h(String str, String str2, List list, k kVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : list, (i14 & 8) != 0 ? null : kVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final k getBloodPressureStats() {
        return this.bloodPressureStats;
    }

    public final List<l> d() {
        return this.bloodPressureSummaries;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p005kotlin.jvm.internal.s.g(this.startDate, hVar.startDate) && p005kotlin.jvm.internal.s.g(this.endDate, hVar.endDate) && p005kotlin.jvm.internal.s.g(this.bloodPressureSummaries, hVar.bloodPressureSummaries) && p005kotlin.jvm.internal.s.g(this.bloodPressureStats, hVar.bloodPressureStats);
    }

    public final int hashCode() {
        String str = this.startDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.endDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<l> list = this.bloodPressureSummaries;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        k kVar = this.bloodPressureStats;
        return iHashCode3 + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.startDate;
        String str2 = this.endDate;
        List<l> list = this.bloodPressureSummaries;
        k kVar = this.bloodPressureStats;
        StringBuilder sbI = p6.b.i("BloodPressureRangeDTO(startDate=", str, ", endDate=", str2, ", bloodPressureSummaries=");
        sbI.append(list);
        sbI.append(", bloodPressureStats=");
        sbI.append(kVar);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.startDate);
        parcel.writeString(this.endDate);
        List<l> list = this.bloodPressureSummaries;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((l) itO.next()).writeToParcel(parcel, i14);
            }
        }
        k kVar = this.bloodPressureStats;
        if (kVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kVar.writeToParcel(parcel, i14);
        }
    }

    public h(String str, String str2, List<l> list, k kVar) {
        this.startDate = str;
        this.endDate = str2;
        this.bloodPressureSummaries = list;
        this.bloodPressureStats = kVar;
    }

    public h() {
        this(null, null, null, null, 15, null);
    }
}
