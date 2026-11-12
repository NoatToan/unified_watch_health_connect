package yo1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0018\u0010#R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b'\u0010&R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b\u001e\u0010)¨\u0006*"}, d2 = {"Lyo1/j;", "Landroid/os/Parcelable;", "", "groupRideUUID", "", "forUserPk", "name", "startTime", "", "Lyo1/i;", "groupRideParticipants", "Lyo1/b;", "awards", "", "participantCount", "participantCompleteCount", "", "final", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;IIZ)V", "a", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "J", "f", "()J", "c", IntegerTokenConverter.CONVERTER_KEY, "d", "m", JWKParameterNames.RSA_EXPONENT, "Ljava/util/List;", "g", "()Ljava/util/List;", "I", JWKParameterNames.OCT_KEY_VALUE, "()I", "j", "Z", "()Z", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f198503j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupRideUUID")
    private final String groupRideUUID;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("forUserPk")
    private final long forUserPk;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTime")
    private final String startTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupRideParticipants")
    private final List<i> groupRideParticipants;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("awards")
    private final List<b> awards;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("participantCount")
    private final int participantCount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("participantCompleteCount")
    private final int participantCompleteCount;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("final")
    private final boolean final;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            long j8 = parcel.readLong();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i14 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(i.CREATOR, parcel, arrayList2, iA, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i15);
                int iA2 = 0;
                while (iA2 != i15) {
                    iA2 = kg.f.a(b.CREATOR, parcel, arrayList3, iA2, 1);
                }
                arrayList = arrayList3;
            }
            int i16 = parcel.readInt();
            boolean z14 = true;
            int i17 = parcel.readInt();
            if (parcel.readInt() == 0) {
                z14 = false;
            }
            return new j(string, j8, string2, string3, arrayList2, arrayList, i16, i17, z14);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public j(String str, long j8, String str2, String str3, List<i> list, List<b> list2, int i14, int i15, boolean z14) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.groupRideUUID = str;
        this.forUserPk = j8;
        this.name = str2;
        this.startTime = str3;
        this.groupRideParticipants = list;
        this.awards = list2;
        this.participantCount = i14;
        this.participantCompleteCount = i15;
        this.final = z14;
    }

    public final List<b> b() {
        return this.awards;
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
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.groupRideUUID, jVar.groupRideUUID) && this.forUserPk == jVar.forUserPk && s.g(this.name, jVar.name) && s.g(this.startTime, jVar.startTime) && s.g(this.groupRideParticipants, jVar.groupRideParticipants) && s.g(this.awards, jVar.awards) && this.participantCount == jVar.participantCount && this.participantCompleteCount == jVar.participantCompleteCount && this.final == jVar.final;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getForUserPk() {
        return this.forUserPk;
    }

    public final List<i> g() {
        return this.groupRideParticipants;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getGroupRideUUID() {
        return this.groupRideUUID;
    }

    public final int hashCode() {
        int iB = u0.b(wr.g.j(wr.g.j(q6.f.e(this.groupRideUUID.hashCode() * 31, 31, this.forUserPk), 31, this.name), 31, this.startTime), 31, this.groupRideParticipants);
        List<b> list = this.awards;
        return Boolean.hashCode(this.final) + q2.d(this.participantCompleteCount, q2.d(this.participantCount, (iB + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getParticipantCompleteCount() {
        return this.participantCompleteCount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getParticipantCount() {
        return this.participantCount;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    public final String toString() {
        String str = this.groupRideUUID;
        long j8 = this.forUserPk;
        String str2 = this.name;
        String str3 = this.startTime;
        List<i> list = this.groupRideParticipants;
        List<b> list2 = this.awards;
        int i14 = this.participantCount;
        int i15 = this.participantCompleteCount;
        boolean z14 = this.final;
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "SocialGroupRideResultsDTO(groupRideUUID=", str, ", forUserPk=");
        sn.a.t(sbJ, ", name=", str2, ", startTime=", str3);
        sbJ.append(", groupRideParticipants=");
        sbJ.append(list);
        sbJ.append(", awards=");
        sbJ.append(list2);
        androidx.core.view.j.m(i14, i15, ", participantCount=", ", participantCompleteCount=", sbJ);
        return com.airbnb.lottie.animation.keyframe.a.i(sbJ, ", final=", z14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.groupRideUUID);
        parcel.writeLong(this.forUserPk);
        parcel.writeString(this.name);
        parcel.writeString(this.startTime);
        Iterator itE = kg.f.e(this.groupRideParticipants, parcel);
        while (itE.hasNext()) {
            ((i) itE.next()).writeToParcel(parcel, i14);
        }
        List<b> list = this.awards;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((b) itO.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeInt(this.participantCount);
        parcel.writeInt(this.participantCompleteCount);
        parcel.writeInt(this.final ? 1 : 0);
    }
}
