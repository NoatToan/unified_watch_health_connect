package cn0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import g22.k;
import kg.f;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eBK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcn0/b;", "Landroid/os/Parcelable;", "", "code", "name", "courseId", "startDateTime", "expirationDateTime", "", "userCount", "Lcn0/c;", "sessionInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcn0/c;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "c", "getCourseId", "d", "getStartDateTime", JWKParameterNames.RSA_EXPONENT, "getExpirationDateTime", "f", "Ljava/lang/Integer;", "getUserCount", "()Ljava/lang/Integer;", "g", "Lcn0/c;", "getSessionInfo", "()Lcn0/c;", "gcm-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("code")
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("courseId")
    private final String courseId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDateTime")
    private final String startDateTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("expirationDateTime")
    private final String expirationDateTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userCount")
    private final Integer userCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sessionInfo")
    private final c sessionInfo;

    /* JADX INFO: renamed from: cn0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0431b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? c.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new C0431b();
    }

    public b(String str, String str2, String str3, String str4, String str5, Integer num, c cVar) {
        str.getClass();
        this.code = str;
        this.name = str2;
        this.courseId = str3;
        this.startDateTime = str4;
        this.expirationDateTime = str5;
        this.userCount = num;
        this.sessionInfo = cVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final Double d() {
        cn0.a courseInfo;
        c cVar = this.sessionInfo;
        if (cVar == null || (courseInfo = cVar.getCourseInfo()) == null) {
            return null;
        }
        return courseInfo.getDistanceMeters();
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
        return s.g(this.code, bVar.code) && s.g(this.name, bVar.name) && s.g(this.courseId, bVar.courseId) && s.g(this.startDateTime, bVar.startDateTime) && s.g(this.expirationDateTime, bVar.expirationDateTime) && s.g(this.userCount, bVar.userCount) && s.g(this.sessionInfo, bVar.sessionInfo);
    }

    public final Double f() {
        cn0.a courseInfo;
        c cVar = this.sessionInfo;
        if (cVar == null || (courseInfo = cVar.getCourseInfo()) == null) {
            return null;
        }
        return courseInfo.getMaxAltitudeMeters();
    }

    public final String g() {
        cn0.a courseInfo;
        c cVar = this.sessionInfo;
        if (cVar == null || (courseInfo = cVar.getCourseInfo()) == null) {
            return null;
        }
        return courseInfo.getName();
    }

    public final DateTime h() {
        DateTime dateTimeQ = k.q(this.expirationDateTime, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", DateTimeZone.UTC);
        if (dateTimeQ != null) {
            return dateTimeQ.withZone(DateTimeZone.getDefault());
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.courseId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.startDateTime;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expirationDateTime;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.userCount;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        c cVar = this.sessionInfo;
        return iHashCode6 + (cVar != null ? cVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final DateTime j() {
        DateTime dateTimeQ = k.q(this.startDateTime, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", DateTimeZone.UTC);
        if (dateTimeQ != null) {
            return dateTimeQ.withZone(DateTimeZone.getDefault());
        }
        return null;
    }

    public final String toString() {
        String str = this.code;
        String str2 = this.name;
        String str3 = this.courseId;
        String str4 = this.startDateTime;
        String str5 = this.expirationDateTime;
        Integer num = this.userCount;
        c cVar = this.sessionInfo;
        StringBuilder sbI = p6.b.i("GroupRideDetailsDTO(code=", str, ", name=", str2, ", courseId=");
        sn.a.t(sbI, str3, ", startDateTime=", str4, ", expirationDateTime=");
        fb1.c.u(num, str5, ", userCount=", ", sessionInfo=", sbI);
        sbI.append(cVar);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.code);
        parcel.writeString(this.name);
        parcel.writeString(this.courseId);
        parcel.writeString(this.startDateTime);
        parcel.writeString(this.expirationDateTime);
        Integer num = this.userCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num);
        }
        c cVar = this.sessionInfo;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcn0/b$a;", "", "<init>", "()V", "", "GCS_DATE_TIME_PATTERN", "Ljava/lang/String;", "gcm-group-ride_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
