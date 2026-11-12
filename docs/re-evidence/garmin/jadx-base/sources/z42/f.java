package z42;

import android.os.Parcel;
import android.os.Parcelable;
import c22.j0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fBC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lz42/f;", "Landroid/os/Parcelable;", "", "startGMT", "endGMT", "", "pushes", "primaryActivityLevel", "", "activityLevelConstant", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "a", "Ljava/lang/String;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "f", "c", "Ljava/lang/Integer;", "g", "()Ljava/lang/Integer;", "d", "getPrimaryActivityLevel", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Boolean;", "getActivityLevelConstant", "()Ljava/lang/Boolean;", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startGMT")
    private final String startGMT;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endGMT")
    private final String endGMT;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pushes")
    private final Integer pushes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryActivityLevel")
    private final String primaryActivityLevel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityLevelConstant")
    private final Boolean activityLevelConstant;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                boolValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                boolValueOf = null;
            }
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new f(string, string2, numValueOf, string3, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ f(String str, String str2, Integer num, String str3, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : bool);
    }

    public static f b(f fVar, String str, String str2, Integer num) {
        return new f(str, str2, num, fVar.primaryActivityLevel, fVar.activityLevelConstant);
    }

    public final DateTime d() {
        DateTime dateTimeN = j0.N(this.endGMT, true);
        if (dateTimeN != null) {
            return dateTimeN;
        }
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        return dateTimeNow;
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
        return s.g(this.startGMT, fVar.startGMT) && s.g(this.endGMT, fVar.endGMT) && s.g(this.pushes, fVar.pushes) && s.g(this.primaryActivityLevel, fVar.primaryActivityLevel) && s.g(this.activityLevelConstant, fVar.activityLevelConstant);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getEndGMT() {
        return this.endGMT;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getPushes() {
        return this.pushes;
    }

    public final DateTime h() {
        DateTime dateTimeN = j0.N(this.startGMT, true);
        if (dateTimeN != null) {
            return dateTimeN;
        }
        DateTime dateTimeNow = DateTime.now();
        dateTimeNow.getClass();
        return dateTimeNow;
    }

    public final int hashCode() {
        String str = this.startGMT;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.endGMT;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.pushes;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.primaryActivityLevel;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.activityLevelConstant;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getStartGMT() {
        return this.startGMT;
    }

    public final boolean j() {
        return !"none".equalsIgnoreCase(this.primaryActivityLevel);
    }

    public final String toString() {
        String str = this.startGMT;
        String str2 = this.endGMT;
        Integer num = this.pushes;
        String str3 = this.primaryActivityLevel;
        Boolean bool = this.activityLevelConstant;
        StringBuilder sbI = p6.b.i("PushesDTO(startGMT=", str, ", endGMT=", str2, ", pushes=");
        p6.b.l(num, ", primaryActivityLevel=", str3, ", activityLevelConstant=", sbI);
        return p6.b.f(sbI, bool, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.startGMT);
        parcel.writeString(this.endGMT);
        Integer num = this.pushes;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.primaryActivityLevel);
        Boolean bool = this.activityLevelConstant;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz42/f$a;", "", "<init>", "()V", "", "NONE", "Ljava/lang/String;", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public f(String str, String str2, Integer num, String str3, Boolean bool) {
        this.startGMT = str;
        this.endGMT = str2;
        this.pushes = num;
        this.primaryActivityLevel = str3;
        this.activityLevelConstant = bool;
    }

    public f() {
        this(null, null, null, null, null, 31, null);
    }
}
