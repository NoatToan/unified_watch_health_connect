package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001c"}, d2 = {"Lps/x;", "Landroid/os/Parcelable;", "", "calendarEventId", "", "calendarEventUuid", "completionTargetValue", "completionTargetUnitType", "", "customGoalValue", "customGoalUnitType", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "getCompletionTargetValue", "getCompletionTargetUnitType", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Double;", "g", "()Ljava/lang/Double;", "f", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarEventId")
    private final Long calendarEventId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarEventUuid")
    private final String calendarEventUuid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("completionTargetValue")
    private final String completionTargetValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("completionTargetUnitType")
    private final String completionTargetUnitType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("customGoalValue")
    private final Double customGoalValue;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("customGoalUnitType")
    private final String customGoalUnitType;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<x> {
        @Override // android.os.Parcelable.Creator
        public final x createFromParcel(Parcel parcel) {
            Long lValueOf;
            Double d14;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                lValueOf = null;
                d14 = null;
            } else {
                lValueOf = Long.valueOf(parcel.readLong());
                d14 = null;
            }
            String string = parcel.readString();
            Double d15 = d14;
            String string2 = parcel.readString();
            Double dValueOf = d15;
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                dValueOf = Double.valueOf(parcel.readDouble());
            }
            return new x(lValueOf, string, string2, string3, dValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final x[] newArray(int i14) {
            return new x[i14];
        }
    }

    public /* synthetic */ x(Long l14, String str, String str2, String str3, Double d14, String str4, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : d14, (i14 & 32) != 0 ? null : str4);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getCalendarEventId() {
        return this.calendarEventId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCalendarEventUuid() {
        return this.calendarEventUuid;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return p005kotlin.jvm.internal.s.g(this.calendarEventId, xVar.calendarEventId) && p005kotlin.jvm.internal.s.g(this.calendarEventUuid, xVar.calendarEventUuid) && p005kotlin.jvm.internal.s.g(this.completionTargetValue, xVar.completionTargetValue) && p005kotlin.jvm.internal.s.g(this.completionTargetUnitType, xVar.completionTargetUnitType) && p005kotlin.jvm.internal.s.g(this.customGoalValue, xVar.customGoalValue) && p005kotlin.jvm.internal.s.g(this.customGoalUnitType, xVar.customGoalUnitType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getCustomGoalUnitType() {
        return this.customGoalUnitType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Double getCustomGoalValue() {
        return this.customGoalValue;
    }

    public final int hashCode() {
        Long l14 = this.calendarEventId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.calendarEventUuid;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.completionTargetValue;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.completionTargetUnitType;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d14 = this.customGoalValue;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str4 = this.customGoalUnitType;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.calendarEventId;
        String str = this.calendarEventUuid;
        String str2 = this.completionTargetValue;
        String str3 = this.completionTargetUnitType;
        Double d14 = this.customGoalValue;
        String str4 = this.customGoalUnitType;
        StringBuilder sbJ = b71.i.j("CalendarEventInfoDTO(calendarEventId=", ", calendarEventUuid=", str, l14, ", completionTargetValue=");
        sn.a.t(sbJ, str2, ", completionTargetUnitType=", str3, ", customGoalValue=");
        sbJ.append(d14);
        sbJ.append(", customGoalUnitType=");
        sbJ.append(str4);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.calendarEventId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.calendarEventUuid);
        parcel.writeString(this.completionTargetValue);
        parcel.writeString(this.completionTargetUnitType);
        Double d14 = this.customGoalValue;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeString(this.customGoalUnitType);
    }

    public x(Long l14, String str, String str2, String str3, Double d14, String str4) {
        this.calendarEventId = l14;
        this.calendarEventUuid = str;
        this.completionTargetValue = str2;
        this.completionTargetUnitType = str3;
        this.customGoalValue = d14;
        this.customGoalUnitType = str4;
    }

    public x() {
        this(null, null, null, null, null, null, 63, null);
    }
}
