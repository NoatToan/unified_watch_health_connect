package cy0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b$\u0010!R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b\u001e\u0010(¨\u0006)"}, d2 = {"Lcy0/q;", "Landroid/os/Parcelable;", "", "multiDayActivityPk", "Lcy0/r;", "uuid", "", "userId", "", "name", "summary", "startDate", "endDate", "", "Lcy0/o;", "images", "<init>", "(Ljava/lang/Integer;Lcy0/r;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/Integer;", "getMultiDayActivityPk", "()Ljava/lang/Integer;", "b", "Lcy0/r;", IntegerTokenConverter.CONVERTER_KEY, "()Lcy0/r;", "c", "Ljava/lang/Long;", "getUserId", "()Ljava/lang/Long;", "d", "Ljava/lang/String;", "f", "()Ljava/lang/String;", JWKParameterNames.RSA_EXPONENT, "h", "getStartDate", "g", "getEndDate", "Ljava/util/List;", "()Ljava/util/List;", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("multiDayActivityPk")
    private final Integer multiDayActivityPk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("multiDayActivityUUID")
    private final r uuid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final Long userId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("summary")
    private final String summary;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private final String startDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private final String endDate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("images")
    private final List<o> images;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            parcel.getClass();
            ArrayList arrayList = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            r rVarCreateFromParcel = parcel.readInt() == 0 ? null : r.CREATOR.createFromParcel(parcel);
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(o.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new q(numValueOf, rVarCreateFromParcel, lValueOf, string, string2, string3, string4, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i14) {
            return new q[i14];
        }
    }

    public q(Integer num, r rVar, Long l14, String str, String str2, String str3, String str4, List<o> list) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str3, str4);
        this.multiDayActivityPk = num;
        this.uuid = rVar;
        this.userId = l14;
        this.name = str;
        this.summary = str2;
        this.startDate = str3;
        this.endDate = str4;
        this.images = list;
    }

    public final DateTime b() {
        return ay0.b.c(this.endDate);
    }

    public final List<o> d() {
        return this.images;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.multiDayActivityPk, qVar.multiDayActivityPk) && p005kotlin.jvm.internal.s.g(this.uuid, qVar.uuid) && p005kotlin.jvm.internal.s.g(this.userId, qVar.userId) && p005kotlin.jvm.internal.s.g(this.name, qVar.name) && p005kotlin.jvm.internal.s.g(this.summary, qVar.summary) && p005kotlin.jvm.internal.s.g(this.startDate, qVar.startDate) && p005kotlin.jvm.internal.s.g(this.endDate, qVar.endDate) && p005kotlin.jvm.internal.s.g(this.images, qVar.images);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final DateTime g() {
        return ay0.b.c(this.startDate);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    public final int hashCode() {
        Integer num = this.multiDayActivityPk;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        r rVar = this.uuid;
        int iHashCode2 = (iHashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        Long l14 = this.userId;
        int iJ = wr.g.j((iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31, 31, this.name);
        String str = this.summary;
        int iJ2 = wr.g.j(wr.g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.startDate), 31, this.endDate);
        List<o> list = this.images;
        return iJ2 + (list != null ? list.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final r getUuid() {
        return this.uuid;
    }

    public final String toString() {
        Integer num = this.multiDayActivityPk;
        r rVar = this.uuid;
        Long l14 = this.userId;
        String str = this.name;
        String str2 = this.summary;
        String str3 = this.startDate;
        String str4 = this.endDate;
        List<o> list = this.images;
        StringBuilder sb3 = new StringBuilder("MultiDayActivitySummaryDTO(multiDayActivityPk=");
        sb3.append(num);
        sb3.append(", uuid=");
        sb3.append(rVar);
        sb3.append(", userId=");
        b71.i.q(l14, ", name=", str, ", summary=", sb3);
        sn.a.t(sb3, str2, ", startDate=", str3, ", endDate=");
        sb3.append(str4);
        sb3.append(", images=");
        sb3.append(list);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.multiDayActivityPk;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        r rVar = this.uuid;
        if (rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rVar.writeToParcel(parcel, i14);
        }
        Long l14 = this.userId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.summary);
        parcel.writeString(this.startDate);
        parcel.writeString(this.endDate);
        List<o> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((o) itO.next()).writeToParcel(parcel, i14);
        }
    }
}
