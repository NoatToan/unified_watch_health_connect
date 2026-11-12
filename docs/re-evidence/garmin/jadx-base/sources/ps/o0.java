package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lps/o0;", "Landroid/os/Parcelable;", "", "diveAlert", "", "riderPosition", "Lps/l1;", "sectionTypeDTO", "startTimeGMT", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lps/l1;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Ljava/lang/Integer;", "getRiderPosition", "()Ljava/lang/Integer;", "c", "Lps/l1;", "getSectionTypeDTO", "()Lps/l1;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o0 implements Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("diveAlert")
    private final String diveAlert;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("riderPosition")
    private final Integer riderPosition;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sectionTypeDTO")
    private final l1 sectionTypeDTO;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimeGMT")
    private final String startTimeGMT;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Double f139973e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o0> {
        @Override // android.os.Parcelable.Creator
        public final o0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new o0(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? l1.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final o0[] newArray(int i14) {
            return new o0[i14];
        }
    }

    public /* synthetic */ o0(String str, Integer num, l1 l1Var, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : l1Var, (i14 & 8) != 0 ? null : str2);
    }

    public final qs.r b() {
        Integer num = this.riderPosition;
        Object obj = null;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        qs.r.f147152b.getClass();
        w13.c cVar = qs.r.f147161k;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            Object next = bVarN.next();
            if (((qs.r) next).f147162a == iIntValue) {
                obj = next;
                break;
            }
        }
        return (qs.r) obj;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDiveAlert() {
        return this.diveAlert;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return p005kotlin.jvm.internal.s.g(this.diveAlert, o0Var.diveAlert) && p005kotlin.jvm.internal.s.g(this.riderPosition, o0Var.riderPosition) && p005kotlin.jvm.internal.s.g(this.sectionTypeDTO, o0Var.sectionTypeDTO) && p005kotlin.jvm.internal.s.g(this.startTimeGMT, o0Var.startTimeGMT);
    }

    public final long f() {
        return c22.j0.J(this.startTimeGMT, DateTimeZone.UTC);
    }

    public final boolean g() {
        l1 l1Var = this.sectionTypeDTO;
        return (l1Var != null ? l1Var.b() : null) == qs.s.DIVE_ALERT;
    }

    public final boolean h() {
        l1 l1Var = this.sectionTypeDTO;
        return (l1Var != null ? l1Var.b() : null) == qs.s.RIDER_POSITION;
    }

    public final int hashCode() {
        String str = this.diveAlert;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.riderPosition;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        l1 l1Var = this.sectionTypeDTO;
        int iHashCode3 = (iHashCode2 + (l1Var == null ? 0 : l1Var.hashCode())) * 31;
        String str2 = this.startTimeGMT;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.diveAlert;
        Integer num = this.riderPosition;
        l1 l1Var = this.sectionTypeDTO;
        String str2 = this.startTimeGMT;
        StringBuilder sbN = lc.u0.n("EventDTO(diveAlert=", num, str, ", riderPosition=", ", sectionTypeDTO=");
        sbN.append(l1Var);
        sbN.append(", startTimeGMT=");
        sbN.append(str2);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.diveAlert);
        Integer num = this.riderPosition;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        l1 l1Var = this.sectionTypeDTO;
        if (l1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            l1Var.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.startTimeGMT);
    }

    public o0(String str, Integer num, l1 l1Var, String str2) {
        this.diveAlert = str;
        this.riderPosition = num;
        this.sectionTypeDTO = l1Var;
        this.startTimeGMT = str2;
    }

    public o0() {
        this(null, null, null, null, 15, null);
    }
}
