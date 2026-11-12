package gf0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import g22.k;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b,\u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0018\u001a\u0004\b&\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b.\u0010\u001aR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b \u00105\"\u0004\b6\u00107R\u001a\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b(\u0010\u001d¨\u00068"}, d2 = {"Lgf0/a;", "Landroid/os/Parcelable;", "", "detailId", "", "startTime", "startTimeLocal", "", "timeZoneOffsetInSeconds", "rhythmClassification", "mountingSide", "", "rmssdHrv", "heartRateAverage", "ecgAppVersion", "udi", "", "symptoms", "Lgf0/c;", "deviceInfo", "healthDeviceId", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lgf0/c;J)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "J", "m", "()J", "c", "o", "d", "Ljava/lang/Integer;", "getTimeZoneOffsetInSeconds", "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "j", "f", "getMountingSide", "g", "Ljava/lang/Double;", "getRmssdHrv", "()Ljava/lang/Double;", "h", IntegerTokenConverter.CONVERTER_KEY, "getUdi", JWKParameterNames.OCT_KEY_VALUE, "Ljava/util/List;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Ljava/util/List;", "l", "Lgf0/c;", "()Lgf0/c;", "setDeviceInfo", "(Lgf0/c;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("detailId")
    private final String detailId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTime")
    private final long startTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimeLocal")
    private final String startTimeLocal;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timeZoneOffsetInSeconds")
    private final Integer timeZoneOffsetInSeconds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rhythmClassification")
    private final String rhythmClassification;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mountingSide")
    private final String mountingSide;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("rmssdHrv")
    private final Double rmssdHrv;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heartRateAverage")
    private final Double heartRateAverage;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ecgAppVersion")
    private final String ecgAppVersion;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("udi")
    private final String udi;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("symptoms")
    private final List<String> symptoms;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceInfo")
    private c deviceInfo;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("healthDeviceId")
    private final long healthDeviceId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Integer numValueOf;
            Double d14;
            Parcel parcel2;
            parcel.getClass();
            String string = parcel.readString();
            long j8 = parcel.readLong();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                d14 = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                d14 = null;
            }
            String string3 = parcel.readString();
            Double d15 = d14;
            String string4 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? d15 : Double.valueOf(parcel.readDouble());
            String string5 = parcel.readString();
            Double d16 = dValueOf;
            Double d17 = dValueOf2;
            String string6 = parcel.readString();
            Object objCreateFromParcel = d15;
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                parcel2 = parcel;
            } else {
                parcel2 = parcel;
                objCreateFromParcel = c.CREATOR.createFromParcel(parcel2);
            }
            return new a(string, j8, string2, numValueOf, string3, string4, d16, d17, string5, string6, arrayListCreateStringArrayList, (c) objCreateFromParcel, parcel2.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        new C1555a(null);
        CREATOR = new b();
    }

    public /* synthetic */ a(String str, long j8, String str2, Integer num, String str3, String str4, Double d14, Double d15, String str5, String str6, List list, c cVar, long j14, int i14, j jVar) {
        this(str, j8, str2, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : str3, (i14 & 32) != 0 ? null : str4, (i14 & 64) != 0 ? null : d14, (i14 & 128) != 0 ? null : d15, (i14 & 256) != 0 ? null : str5, (i14 & 512) != 0 ? null : str6, (i14 & 1024) != 0 ? null : list, (i14 & 2048) != 0 ? null : cVar, j14);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDetailId() {
        return this.detailId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.detailId, aVar.detailId) && this.startTime == aVar.startTime && s.g(this.startTimeLocal, aVar.startTimeLocal) && s.g(this.timeZoneOffsetInSeconds, aVar.timeZoneOffsetInSeconds) && s.g(this.rhythmClassification, aVar.rhythmClassification) && s.g(this.mountingSide, aVar.mountingSide) && s.g(this.rmssdHrv, aVar.rmssdHrv) && s.g(this.heartRateAverage, aVar.heartRateAverage) && s.g(this.ecgAppVersion, aVar.ecgAppVersion) && s.g(this.udi, aVar.udi) && s.g(this.symptoms, aVar.symptoms) && s.g(this.deviceInfo, aVar.deviceInfo) && this.healthDeviceId == aVar.healthDeviceId;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getEcgAppVersion() {
        return this.ecgAppVersion;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getHealthDeviceId() {
        return this.healthDeviceId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getHeartRateAverage() {
        return this.heartRateAverage;
    }

    public final int hashCode() {
        int iJ = wr.g.j(q6.f.e(this.detailId.hashCode() * 31, 31, this.startTime), 31, this.startTimeLocal);
        Integer num = this.timeZoneOffsetInSeconds;
        int iHashCode = (iJ + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.rhythmClassification;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mountingSide;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.rmssdHrv;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.heartRateAverage;
        int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
        String str3 = this.ecgAppVersion;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.udi;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.symptoms;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        c cVar = this.deviceInfo;
        return Long.hashCode(this.healthDeviceId) + ((iHashCode8 + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }

    public final LocalDate i() {
        return k.w(this.startTimeLocal, "yyyy-MM-dd'T'HH:mm:ss.SSS");
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getRhythmClassification() {
        return this.rhythmClassification;
    }

    public final DateTime k() {
        return k.q(this.startTimeLocal, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getStartTimeLocal() {
        return this.startTimeLocal;
    }

    public final List<String> q() {
        return this.symptoms;
    }

    public final String toString() {
        String str = this.detailId;
        long j8 = this.startTime;
        String str2 = this.startTimeLocal;
        Integer num = this.timeZoneOffsetInSeconds;
        String str3 = this.rhythmClassification;
        String str4 = this.mountingSide;
        Double d14 = this.rmssdHrv;
        Double d15 = this.heartRateAverage;
        String str5 = this.ecgAppVersion;
        String str6 = this.udi;
        List<String> list = this.symptoms;
        c cVar = this.deviceInfo;
        long j14 = this.healthDeviceId;
        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(j8, "EcgActivityDto(detailId=", str, ", startTime=");
        sbJ.append(", startTimeLocal=");
        sbJ.append(str2);
        sbJ.append(", timeZoneOffsetInSeconds=");
        sbJ.append(num);
        sn.a.t(sbJ, ", rhythmClassification=", str3, ", mountingSide=", str4);
        sn.a.p(d14, d15, ", rmssdHrv=", ", heartRateAverage=", sbJ);
        sn.a.t(sbJ, ", ecgAppVersion=", str5, ", udi=", str6);
        sbJ.append(", symptoms=");
        sbJ.append(list);
        sbJ.append(", deviceInfo=");
        sbJ.append(cVar);
        return com.nimbusds.jose.shaded.gson.internal.a.g(j14, ", healthDeviceId=", ")", sbJ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.detailId);
        parcel.writeLong(this.startTime);
        parcel.writeString(this.startTimeLocal);
        Integer num = this.timeZoneOffsetInSeconds;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.rhythmClassification);
        parcel.writeString(this.mountingSide);
        Double d14 = this.rmssdHrv;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.heartRateAverage;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeString(this.ecgAppVersion);
        parcel.writeString(this.udi);
        parcel.writeStringList(this.symptoms);
        c cVar = this.deviceInfo;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i14);
        }
        parcel.writeLong(this.healthDeviceId);
    }

    /* JADX INFO: renamed from: gf0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006¨\u0006\u0018"}, d2 = {"Lgf0/a$a;", "", "<init>", "()V", "", "SINUS_NORMAL", "Ljava/lang/String;", "AFIB", "INCONCLUSIVE_HR_UNDER_50", "INCONCLUSIVE_HR_OVER_120_50", "INCONCLUSIVE_POOR_SIGNAL", "INCONCLUSIVE_SR_WITH_HR_100_TO_120", "INCONCLUSIVE_OTHER", "INVALID", "RAPID_HEARTBEAT", "SKIPPED_HEARTBEAT", "FATIGUE", "SHORTNESS_OF_BREATH", "CHEST_TIGHTNESS", "FAINTING", "DIZZINESS", "OTHER", "NO_SYMPTOMS", "NO_SELECTION", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1555a {
        public /* synthetic */ C1555a(j jVar) {
            this();
        }

        private C1555a() {
        }
    }

    public a(String str, long j8, String str2, Integer num, String str3, String str4, Double d14, Double d15, String str5, String str6, List<String> list, c cVar, long j14) {
        str.getClass();
        str2.getClass();
        this.detailId = str;
        this.startTime = j8;
        this.startTimeLocal = str2;
        this.timeZoneOffsetInSeconds = num;
        this.rhythmClassification = str3;
        this.mountingSide = str4;
        this.rmssdHrv = d14;
        this.heartRateAverage = d15;
        this.ecgAppVersion = str5;
        this.udi = str6;
        this.symptoms = list;
        this.deviceInfo = cVar;
        this.healthDeviceId = j14;
    }
}
