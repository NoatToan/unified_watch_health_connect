package jo1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.social.conversation.model.TimestampDeserializer;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import java.util.Date;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Ljo1/f;", "Landroid/os/Parcelable;", "", "newsPostHasImageId", "newsPostId", "", "imageUuid", "imageUrl", "Ljava/util/Date;", "createTimestamp", "updateTimestamp", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "a", "J", "d", "()J", "b", "getNewsPostId", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "getImageUrl", JWKParameterNames.RSA_EXPONENT, "Ljava/util/Date;", "getCreateTimestamp", "()Ljava/util/Date;", "f", "getUpdateTimestamp", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("newsPostHasImageId")
    private final long newsPostHasImageId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("newsPostId")
    private final long newsPostId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageUuid")
    private final String imageUuid;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("imageUrl")
    private final String imageUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("createTimestamp")
    @JsonAdapter(TimestampDeserializer.class)
    private final Date createTimestamp;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("updateTimestamp")
    @JsonAdapter(TimestampDeserializer.class)
    private final Date updateTimestamp;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public f(long j8, long j14, String str, String str2, Date date, Date date2) {
        str.getClass();
        str2.getClass();
        date.getClass();
        date2.getClass();
        this.newsPostHasImageId = j8;
        this.newsPostId = j14;
        this.imageUuid = str;
        this.imageUrl = str2;
        this.createTimestamp = date;
        this.updateTimestamp = date2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImageUuid() {
        return this.imageUuid;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getNewsPostHasImageId() {
        return this.newsPostHasImageId;
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
        return this.newsPostHasImageId == fVar.newsPostHasImageId && this.newsPostId == fVar.newsPostId && s.g(this.imageUuid, fVar.imageUuid) && s.g(this.imageUrl, fVar.imageUrl) && s.g(this.createTimestamp, fVar.createTimestamp) && s.g(this.updateTimestamp, fVar.updateTimestamp);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int hashCode() {
        return this.updateTimestamp.hashCode() + ((this.createTimestamp.hashCode() + wr.g.j(wr.g.j(q6.f.e(Long.hashCode(this.newsPostHasImageId) * 31, 31, this.newsPostId), 31, this.imageUuid), 31, this.imageUrl)) * 31);
    }

    public final String toString() {
        long j8 = this.newsPostHasImageId;
        long j14 = this.newsPostId;
        String str = this.imageUuid;
        String str2 = this.imageUrl;
        Date date = this.createTimestamp;
        Date date2 = this.updateTimestamp;
        StringBuilder sbK = e0.k(j8, "PostImageDTO(newsPostHasImageId=", ", newsPostId=");
        p6.b.k(j14, ", imageUuid=", str, sbK);
        sbK.append(", imageUrl=");
        sbK.append(str2);
        sbK.append(", createTimestamp=");
        sbK.append(date);
        sbK.append(", updateTimestamp=");
        sbK.append(date2);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.newsPostHasImageId);
        parcel.writeLong(this.newsPostId);
        parcel.writeString(this.imageUuid);
        parcel.writeString(this.imageUrl);
        parcel.writeSerializable(this.createTimestamp);
        parcel.writeSerializable(this.updateTimestamp);
    }
}
