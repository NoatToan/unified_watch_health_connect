package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017¨\u0006\u001d"}, d2 = {"Lps/p;", "Landroid/os/Parcelable;", "", "activityId", "", "Lps/o0;", "eventDTOs", "", "Lps/x0;", "lapDTOs", "Lps/o1;", "splitSummaryDTOs", "Lps/x1;", "typedSplitDTOs", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "J", "d", "()J", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "g", "h", JWKParameterNames.RSA_EXPONENT, IntegerTokenConverter.CONVERTER_KEY, "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventDTOs")
    private final List<o0> eventDTOs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lapDTOs")
    private final List<x0> lapDTOs;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splitSummaryDTOs")
    private final List<o1> splitSummaryDTOs;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typedSplitDTOs")
    private final List<x1> typedSplitDTOs;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            parcel.getClass();
            long j8 = parcel.readLong();
            int iA = 0;
            ArrayList arrayList4 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = kg.f.a(o0.CREATOR, parcel, arrayList, iA2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                int iA3 = 0;
                while (iA3 != i15) {
                    iA3 = kg.f.a(x0.CREATOR, parcel, arrayList2, iA3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i16 = parcel.readInt();
                arrayList3 = new ArrayList(i16);
                int iA4 = 0;
                while (iA4 != i16) {
                    iA4 = kg.f.a(o1.CREATOR, parcel, arrayList3, iA4, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i17 = parcel.readInt();
                arrayList4 = new ArrayList(i17);
                while (iA != i17) {
                    iA = kg.f.a(x1.CREATOR, parcel, arrayList4, iA, 1);
                }
            }
            return new p(j8, arrayList, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i14) {
            return new p[i14];
        }
    }

    public /* synthetic */ p(long j8, List list, List list2, List list3, List list4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? null : list2, (i14 & 8) != 0 ? null : list3, (i14 & 16) != 0 ? null : list4);
    }

    public static p b(p pVar, long j8, List list, ArrayList arrayList, List list2, int i14) {
        if ((i14 & 1) != 0) {
            j8 = pVar.activityId;
        }
        long j14 = j8;
        if ((i14 & 2) != 0) {
            list = pVar.eventDTOs;
        }
        List list3 = list;
        List<x0> list4 = arrayList;
        if ((i14 & 4) != 0) {
            list4 = pVar.lapDTOs;
        }
        List<x0> list5 = list4;
        List<o1> list6 = pVar.splitSummaryDTOs;
        if ((i14 & 16) != 0) {
            list2 = pVar.typedSplitDTOs;
        }
        pVar.getClass();
        return new p(j14, list3, list5, list6, list2);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getActivityId() {
        return this.activityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.activityId == pVar.activityId && p005kotlin.jvm.internal.s.g(this.eventDTOs, pVar.eventDTOs) && p005kotlin.jvm.internal.s.g(this.lapDTOs, pVar.lapDTOs) && p005kotlin.jvm.internal.s.g(this.splitSummaryDTOs, pVar.splitSummaryDTOs) && p005kotlin.jvm.internal.s.g(this.typedSplitDTOs, pVar.typedSplitDTOs);
    }

    public final List<o0> f() {
        return this.eventDTOs;
    }

    public final List<x0> g() {
        return this.lapDTOs;
    }

    public final List<o1> h() {
        return this.splitSummaryDTOs;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.activityId) * 31;
        List<o0> list = this.eventDTOs;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<x0> list2 = this.lapDTOs;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<o1> list3 = this.splitSummaryDTOs;
        int iHashCode4 = (iHashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<x1> list4 = this.typedSplitDTOs;
        return iHashCode4 + (list4 != null ? list4.hashCode() : 0);
    }

    public final List<x1> i() {
        return this.typedSplitDTOs;
    }

    public final String toString() {
        return "ActivitySplits(activityId=" + this.activityId + ", eventDTOs=" + this.eventDTOs + ", lapDTOs=" + this.lapDTOs + ", splitSummaryDTOs=" + this.splitSummaryDTOs + ", typedSplitDTOs=" + this.typedSplitDTOs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.activityId);
        List<o0> list = this.eventDTOs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = lc.u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((o0) itO.next()).writeToParcel(parcel, i14);
            }
        }
        List<x0> list2 = this.lapDTOs;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO2 = lc.u0.o(parcel, list2, 1);
            while (itO2.hasNext()) {
                ((x0) itO2.next()).writeToParcel(parcel, i14);
            }
        }
        List<o1> list3 = this.splitSummaryDTOs;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO3 = lc.u0.o(parcel, list3, 1);
            while (itO3.hasNext()) {
                ((o1) itO3.next()).writeToParcel(parcel, i14);
            }
        }
        List<x1> list4 = this.typedSplitDTOs;
        if (list4 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO4 = lc.u0.o(parcel, list4, 1);
        while (itO4.hasNext()) {
            ((x1) itO4.next()).writeToParcel(parcel, i14);
        }
    }

    public p(long j8, List<o0> list, List<x0> list2, List<o1> list3, List<x1> list4) {
        this.activityId = j8;
        this.eventDTOs = list;
        this.lapDTOs = list2;
        this.splitSummaryDTOs = list3;
        this.typedSplitDTOs = list4;
    }

    public p() {
        this(0L, null, null, null, null, 31, null);
    }
}
