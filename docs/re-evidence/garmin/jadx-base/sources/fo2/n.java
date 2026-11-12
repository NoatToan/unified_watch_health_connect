package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.gncs.NotificationConstants;
import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b!\u0010'R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001cR\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.¨\u00063"}, d2 = {"Lfo2/n;", "Landroid/os/Parcelable;", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "links", "", "jobId", "Lfo2/o;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lfo2/q;", NotificationConstants.KEY_DATA_MIME_TYPE, "errorMessage", "", "percentComplete", "Lorg/joda/time/DateTime;", "createdTs", "", "createdTsEpoch", "estimatedCompletionTs", "estimatedCompletionTsEpoch", "<init>", "(Lcom/garmin/feature/garminpay/providers/gpay/model/Links;Ljava/lang/String;Lfo2/o;Lfo2/q;Ljava/lang/String;DLorg/joda/time/DateTime;JLjava/lang/String;J)V", "a", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "getLinks", "()Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "b", "Ljava/lang/String;", "getJobId", "()Ljava/lang/String;", "c", "Lfo2/o;", "f", "()Lfo2/o;", "d", "Lfo2/q;", "g", "()Lfo2/q;", JWKParameterNames.RSA_EXPONENT, "D", "()D", "Lorg/joda/time/DateTime;", "getCreatedTs", "()Lorg/joda/time/DateTime;", "h", "J", "getCreatedTsEpoch", "()J", IntegerTokenConverter.CONVERTER_KEY, "getEstimatedCompletionTs", "j", "getEstimatedCompletionTsEpoch", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("_links")
    private final Links links;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("jobId")
    private final String jobId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.ResponseFieldKey.STATE)
    private final o state;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private final q type;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("errorMessage")
    private final String errorMessage;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("percentComplete")
    private final double percentComplete;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTs")
    private final DateTime createdTs;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createdTsEpoch")
    private final long createdTsEpoch;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("estimatedCompletionTs")
    private final String estimatedCompletionTs;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("estimatedCompletionTsEpoch")
    private final long estimatedCompletionTsEpoch;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new n((Links) parcel.readSerializable(), parcel.readString(), o.valueOf(parcel.readString()), q.valueOf(parcel.readString()), parcel.readString(), parcel.readDouble(), (DateTime) parcel.readSerializable(), parcel.readLong(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public n(Links links, String str, o oVar, q qVar, String str2, double d14, DateTime dateTime, long j8, String str3, long j14) {
        links.getClass();
        str.getClass();
        oVar.getClass();
        qVar.getClass();
        dateTime.getClass();
        str3.getClass();
        this.links = links;
        this.jobId = str;
        this.state = oVar;
        this.type = qVar;
        this.errorMessage = str2;
        this.percentComplete = d14;
        this.createdTs = dateTime;
        this.createdTsEpoch = j8;
        this.estimatedCompletionTs = str3;
        this.estimatedCompletionTsEpoch = j14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getPercentComplete() {
        return this.percentComplete;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return p005kotlin.jvm.internal.s.g(this.links, nVar.links) && p005kotlin.jvm.internal.s.g(this.jobId, nVar.jobId) && this.state == nVar.state && this.type == nVar.type && p005kotlin.jvm.internal.s.g(this.errorMessage, nVar.errorMessage) && Double.compare(this.percentComplete, nVar.percentComplete) == 0 && p005kotlin.jvm.internal.s.g(this.createdTs, nVar.createdTs) && this.createdTsEpoch == nVar.createdTsEpoch && p005kotlin.jvm.internal.s.g(this.estimatedCompletionTs, nVar.estimatedCompletionTs) && this.estimatedCompletionTsEpoch == nVar.estimatedCompletionTsEpoch;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final o getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final q getType() {
        return this.type;
    }

    public final int hashCode() {
        int iHashCode = (this.type.hashCode() + ((this.state.hashCode() + wr.g.j(this.links.f51142a.hashCode() * 31, 31, this.jobId)) * 31)) * 31;
        String str = this.errorMessage;
        return Long.hashCode(this.estimatedCompletionTsEpoch) + wr.g.j(q6.f.e(ds.e0.a(org.apache.commons.lang3.e.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.percentComplete), this.createdTs, 31), 31, this.createdTsEpoch), 31, this.estimatedCompletionTs);
    }

    public final String toString() {
        Links links = this.links;
        String str = this.jobId;
        o oVar = this.state;
        q qVar = this.type;
        String str2 = this.errorMessage;
        double d14 = this.percentComplete;
        DateTime dateTime = this.createdTs;
        long j8 = this.createdTsEpoch;
        String str3 = this.estimatedCompletionTs;
        long j14 = this.estimatedCompletionTsEpoch;
        StringBuilder sb3 = new StringBuilder("JobStatus(links=");
        sb3.append(links);
        sb3.append(", jobId=");
        sb3.append(str);
        sb3.append(", state=");
        sb3.append(oVar);
        sb3.append(", type=");
        sb3.append(qVar);
        sb3.append(", errorMessage=");
        sb3.append(str2);
        sb3.append(", percentComplete=");
        sb3.append(d14);
        sb3.append(", createdTs=");
        sb3.append(dateTime);
        sb3.append(", createdTsEpoch=");
        p6.b.k(j8, ", estimatedCompletionTs=", str3, sb3);
        return com.nimbusds.jose.shaded.gson.internal.a.g(j14, ", estimatedCompletionTsEpoch=", ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.links);
        parcel.writeString(this.jobId);
        parcel.writeString(this.state.name());
        parcel.writeString(this.type.name());
        parcel.writeString(this.errorMessage);
        parcel.writeDouble(this.percentComplete);
        parcel.writeSerializable(this.createdTs);
        parcel.writeLong(this.createdTsEpoch);
        parcel.writeString(this.estimatedCompletionTs);
        parcel.writeLong(this.estimatedCompletionTsEpoch);
    }
}
