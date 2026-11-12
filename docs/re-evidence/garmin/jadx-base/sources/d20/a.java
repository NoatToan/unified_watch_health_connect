package d20;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0011\u0010\u001d¨\u0006\u001e"}, d2 = {"Ld20/a;", "Landroid/os/Parcelable;", "", "approvalId", "", "approvalType", "consentId", "requesterUserId", "approverUserId", "Lorg/joda/time/DateTime;", "requestedDateTimeUtc", "<init>", "(JLjava/lang/String;Ljava/lang/String;JJLorg/joda/time/DateTime;)V", "a", "J", "getApprovalId", "()J", "b", "Ljava/lang/String;", "getApprovalType", "()Ljava/lang/String;", "c", "getConsentId", "d", "getRequesterUserId", JWKParameterNames.RSA_EXPONENT, "getApproverUserId", "f", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1225a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("approvalId")
    private final long approvalId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("approvalType")
    private final String approvalType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("approvalAsset")
    private final String consentId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requesterUserPk")
    private final long requesterUserId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("approverUserPk")
    private final long approverUserId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestedDateTimeUtc")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private final DateTime requestedDateTimeUtc;

    /* JADX INFO: renamed from: d20.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1225a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(long j8, String str, String str2, long j14, long j15, DateTime dateTime) {
        str.getClass();
        str2.getClass();
        this.approvalId = j8;
        this.approvalType = str;
        this.consentId = str2;
        this.requesterUserId = j14;
        this.approverUserId = j15;
        this.requestedDateTimeUtc = dateTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final DateTime getRequestedDateTimeUtc() {
        return this.requestedDateTimeUtc;
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
        return this.approvalId == aVar.approvalId && s.g(this.approvalType, aVar.approvalType) && s.g(this.consentId, aVar.consentId) && this.requesterUserId == aVar.requesterUserId && this.approverUserId == aVar.approverUserId && s.g(this.requestedDateTimeUtc, aVar.requestedDateTimeUtc);
    }

    public final int hashCode() {
        int iE = q6.f.e(q6.f.e(g.j(g.j(Long.hashCode(this.approvalId) * 31, 31, this.approvalType), 31, this.consentId), 31, this.requesterUserId), 31, this.approverUserId);
        DateTime dateTime = this.requestedDateTimeUtc;
        return iE + (dateTime == null ? 0 : dateTime.hashCode());
    }

    public final String toString() {
        long j8 = this.approvalId;
        String str = this.approvalType;
        String str2 = this.consentId;
        long j14 = this.requesterUserId;
        long j15 = this.approverUserId;
        DateTime dateTime = this.requestedDateTimeUtc;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "ConsentApprovalDTO(approvalId=", ", approvalType=", str);
        j.y(sbK, ", consentId=", str2, ", requesterUserId=");
        sbK.append(j14);
        x.j(j15, ", approverUserId=", ", requestedDateTimeUtc=", sbK);
        sbK.append(dateTime);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.approvalId);
        parcel.writeString(this.approvalType);
        parcel.writeString(this.consentId);
        parcel.writeLong(this.requesterUserId);
        parcel.writeLong(this.approverUserId);
        parcel.writeSerializable(this.requestedDateTimeUtc);
    }
}
