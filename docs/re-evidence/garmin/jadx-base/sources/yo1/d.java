package yo1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b\u001b\u0010$¨\u0006%"}, d2 = {"Lyo1/d;", "Landroid/os/Parcelable;", "", "competitionId", "", "userRanking", "", "deltaDistanceToLeader", "deltaDurationToLeader", "", "Lyo1/e;", "leaderboard", "", "final", "<init>", "(JIDDLjava/util/List;Z)V", "a", "J", "b", "()J", "I", "g", "()I", "c", "D", "getDeltaDistanceToLeader", "()D", "d", "getDeltaDurationToLeader", JWKParameterNames.RSA_EXPONENT, "Ljava/util/List;", "f", "()Ljava/util/List;", "h", "(Ljava/util/List;)V", "Z", "()Z", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f198429g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("competitionId")
    private final long competitionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userRanking")
    private final int userRanking;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deltaDistanceToLeader")
    private final double deltaDistanceToLeader;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deltaDurationToLeader")
    private final double deltaDurationToLeader;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("leaderboard")
    private List<e> leaderboard;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("final")
    private final boolean final;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            long j8 = parcel.readLong();
            int i14 = parcel.readInt();
            double d14 = parcel.readDouble();
            double d15 = parcel.readDouble();
            int i15 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i15);
            int iA = 0;
            while (iA != i15) {
                iA = kg.f.a(e.CREATOR, parcel, arrayList, iA, 1);
            }
            return new d(j8, i14, d14, d15, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(long j8, int i14, double d14, double d15, List<e> list, boolean z14) {
        list.getClass();
        this.competitionId = j8;
        this.userRanking = i14;
        this.deltaDistanceToLeader = d14;
        this.deltaDurationToLeader = d15;
        this.leaderboard = list;
        this.final = z14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getCompetitionId() {
        return this.competitionId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getFinal() {
        return this.final;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.competitionId == dVar.competitionId && this.userRanking == dVar.userRanking && Double.compare(this.deltaDistanceToLeader, dVar.deltaDistanceToLeader) == 0 && Double.compare(this.deltaDurationToLeader, dVar.deltaDurationToLeader) == 0 && s.g(this.leaderboard, dVar.leaderboard) && this.final == dVar.final;
    }

    public final List<e> f() {
        return this.leaderboard;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getUserRanking() {
        return this.userRanking;
    }

    public final void h(ArrayList arrayList) {
        this.leaderboard = arrayList;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.final) + u0.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(q2.d(this.userRanking, Long.hashCode(this.competitionId) * 31, 31), 31, this.deltaDistanceToLeader), 31, this.deltaDurationToLeader), 31, this.leaderboard);
    }

    public final String toString() {
        long j8 = this.competitionId;
        int i14 = this.userRanking;
        double d14 = this.deltaDistanceToLeader;
        double d15 = this.deltaDurationToLeader;
        List<e> list = this.leaderboard;
        boolean z14 = this.final;
        StringBuilder sbW = v.h.w(i14, "SocialGroupRideCompetitionLeaderboardDTO(competitionId=", ", userRanking=", j8);
        am.j.x(sbW, ", deltaDistanceToLeader=", d14, ", deltaDurationToLeader=");
        sbW.append(d15);
        sbW.append(", leaderboard=");
        sbW.append(list);
        return com.airbnb.lottie.animation.keyframe.a.i(sbW, ", final=", z14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.competitionId);
        parcel.writeInt(this.userRanking);
        parcel.writeDouble(this.deltaDistanceToLeader);
        parcel.writeDouble(this.deltaDurationToLeader);
        Iterator itE = kg.f.e(this.leaderboard, parcel);
        while (itE.hasNext()) {
            ((e) itE.next()).writeToParcel(parcel, i14);
        }
        parcel.writeInt(this.final ? 1 : 0);
    }
}
