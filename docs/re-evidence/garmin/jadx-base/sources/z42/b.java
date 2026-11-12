package z42;

import android.os.Parcel;
import android.os.Parcelable;
import c22.j0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.w;
import j20.x;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b \u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b!\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b#\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b%\u0010\u0014¨\u0006&"}, d2 = {"Lz42/b;", "Landroid/os/Parcelable;", "", TtmlNode.ATTR_ID, "date", "", "pushes", "totalPushDistance", "calories", "distance", "pushesGoal", "startTimeGmt", "startTimeLocal", "endTimeGmt", "endTimeLocal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getDate", "c", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "d", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.RSA_EXPONENT, "getDistance", "g", "h", "getStartTimeLocal", "j", "getEndTimeGmt", JWKParameterNames.OCT_KEY_VALUE, "getEndTimeLocal", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String date;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalPushes")
    private final Integer pushes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalPushDistance")
    private final Integer totalPushDistance;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalKilocalories")
    private final Integer calories;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessDistanceMeters")
    private final Integer distance;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dailyPushesGoal")
    private final Integer pushesGoal;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessStartTimeGmt")
    private final String startTimeGmt;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessStartTimeLocal")
    private final String startTimeLocal;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessEndTimeGmt")
    private final String endTimeGmt;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wellnessEndTimeLocal")
    private final String endTimeLocal;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str3, String str4, String str5, String str6, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : num2, (i14 & 16) != 0 ? null : num3, (i14 & 32) != 0 ? null : num4, (i14 & 64) != 0 ? null : num5, (i14 & 128) != 0 ? null : str3, (i14 & 256) != 0 ? null : str4, (i14 & 512) != 0 ? null : str5, (i14 & 1024) != 0 ? null : str6);
    }

    public final DateTime b() {
        String str = this.date;
        if (str == null || !(!w.J(str))) {
            return null;
        }
        return j0.K(this.date, "yyyy-MM-dd");
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getCalories() {
        return this.calories;
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
        return s.g(this.id, bVar.id) && s.g(this.date, bVar.date) && s.g(this.pushes, bVar.pushes) && s.g(this.totalPushDistance, bVar.totalPushDistance) && s.g(this.calories, bVar.calories) && s.g(this.distance, bVar.distance) && s.g(this.pushesGoal, bVar.pushesGoal) && s.g(this.startTimeGmt, bVar.startTimeGmt) && s.g(this.startTimeLocal, bVar.startTimeLocal) && s.g(this.endTimeGmt, bVar.endTimeGmt) && s.g(this.endTimeLocal, bVar.endTimeLocal);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getPushes() {
        return this.pushes;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getPushesGoal() {
        return this.pushesGoal;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getStartTimeGmt() {
        return this.startTimeGmt;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.date;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.pushes;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalPushDistance;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.calories;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.distance;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.pushesGoal;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str3 = this.startTimeGmt;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.startTimeLocal;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.endTimeGmt;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.endTimeLocal;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getTotalPushDistance() {
        return this.totalPushDistance;
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.date;
        Integer num = this.pushes;
        Integer num2 = this.totalPushDistance;
        Integer num3 = this.calories;
        Integer num4 = this.distance;
        Integer num5 = this.pushesGoal;
        String str3 = this.startTimeGmt;
        String str4 = this.startTimeLocal;
        String str5 = this.endTimeGmt;
        String str6 = this.endTimeLocal;
        StringBuilder sbI = p6.b.i("DailyPushesDTO(id=", str, ", date=", str2, ", pushes=");
        x.m(sbI, num, ", totalPushDistance=", num2, ", calories=");
        x.m(sbI, num3, ", distance=", num4, ", pushesGoal=");
        p6.b.l(num5, ", startTimeGmt=", str3, ", startTimeLocal=", sbI);
        sn.a.t(sbI, str4, ", endTimeGmt=", str5, ", endTimeLocal=");
        return am.j.o(str6, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.date);
        Integer num = this.pushes;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.totalPushDistance;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.calories;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.distance;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        Integer num5 = this.pushesGoal;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        parcel.writeString(this.startTimeGmt);
        parcel.writeString(this.startTimeLocal);
        parcel.writeString(this.endTimeGmt);
        parcel.writeString(this.endTimeLocal);
    }

    public b(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str3, String str4, String str5, String str6) {
        this.id = str;
        this.date = str2;
        this.pushes = num;
        this.totalPushDistance = num2;
        this.calories = num3;
        this.distance = num4;
        this.pushesGoal = num5;
        this.startTimeGmt = str3;
        this.startTimeLocal = str4;
        this.endTimeGmt = str5;
        this.endTimeLocal = str6;
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
