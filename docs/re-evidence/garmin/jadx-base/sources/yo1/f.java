package yo1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lyo1/f;", "Landroid/os/Parcelable;", "", "groupRideUUID", "", "forUserPk", "", "userCount", "", "Lyo1/d;", "leaderboards", "<init>", "(Ljava/lang/String;JILjava/util/List;)V", "a", "Ljava/lang/String;", "getGroupRideUUID", "()Ljava/lang/String;", "b", "J", "()J", "c", "I", "f", "()I", "d", "Ljava/util/List;", "()Ljava/util/List;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f198451e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupRideUUID")
    private final String groupRideUUID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("forUserPk")
    private final long forUserPk;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userCount")
    private final int userCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("leaderboards")
    private final List<d> leaderboards;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            long j8 = parcel.readLong();
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i15);
            int iA = 0;
            while (iA != i15) {
                iA = kg.f.a(d.CREATOR, parcel, arrayList, iA, 1);
            }
            return new f(string, j8, i14, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public f(String str, long j8, int i14, List<d> list) {
        str.getClass();
        list.getClass();
        this.groupRideUUID = str;
        this.forUserPk = j8;
        this.userCount = i14;
        this.leaderboards = list;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getForUserPk() {
        return this.forUserPk;
    }

    public final List<d> d() {
        return this.leaderboards;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.groupRideUUID, fVar.groupRideUUID) && this.forUserPk == fVar.forUserPk && this.userCount == fVar.userCount && s.g(this.leaderboards, fVar.leaderboards);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getUserCount() {
        return this.userCount;
    }

    public final int hashCode() {
        return this.leaderboards.hashCode() + q2.d(this.userCount, q6.f.e(this.groupRideUUID.hashCode() * 31, 31, this.forUserPk), 31);
    }

    public final String toString() {
        String str = this.groupRideUUID;
        long j8 = this.forUserPk;
        int i14 = this.userCount;
        List<d> list = this.leaderboards;
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "SocialGroupRideCompetitionsResultsDTO(groupRideUUID=", str, ", forUserPk=");
        sbJ.append(", userCount=");
        sbJ.append(i14);
        sbJ.append(", leaderboards=");
        sbJ.append(list);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.groupRideUUID);
        parcel.writeLong(this.forUserPk);
        parcel.writeInt(this.userCount);
        Iterator itE = kg.f.e(this.leaderboards, parcel);
        while (itE.hasNext()) {
            ((d) itE.next()).writeToParcel(parcel, i14);
        }
    }
}
