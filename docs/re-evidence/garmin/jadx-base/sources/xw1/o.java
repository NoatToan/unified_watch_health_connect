package xw1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u001b\u0010\u0011R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lxw1/o;", "Landroid/os/Parcelable;", "", "videoKey", "videoUrl", "", "videoDuration", "subtitleUrl", "videoTitle", "videoThumbnailUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "setVideoKey", "(Ljava/lang/String;)V", "b", IntegerTokenConverter.CONVERTER_KEY, "setVideoUrl", "c", "I", "d", "()I", "setVideoDuration", "(I)V", "setSubtitleUrl", JWKParameterNames.RSA_EXPONENT, "h", "setVideoTitle", "g", "setVideoThumbnailUrl", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("videoKey")
    private String videoKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("videoUrl")
    private String videoUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("videoDuration")
    private int videoDuration;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subtitleUrl")
    private String subtitleUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("videoTitle")
    private String videoTitle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("videoThumbnailUrl")
    private String videoThumbnailUrl;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new o(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public /* synthetic */ o(String str, String str2, int i14, String str3, String str4, String str5, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? 0 : i14, (i15 & 8) != 0 ? null : str3, (i15 & 16) != 0 ? null : str4, (i15 & 32) != 0 ? null : str5);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSubtitleUrl() {
        return this.subtitleUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getVideoDuration() {
        return this.videoDuration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return s.g(this.videoKey, oVar.videoKey) && s.g(this.videoUrl, oVar.videoUrl) && this.videoDuration == oVar.videoDuration && s.g(this.subtitleUrl, oVar.subtitleUrl) && s.g(this.videoTitle, oVar.videoTitle) && s.g(this.videoThumbnailUrl, oVar.videoThumbnailUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getVideoKey() {
        return this.videoKey;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getVideoThumbnailUrl() {
        return this.videoThumbnailUrl;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getVideoTitle() {
        return this.videoTitle;
    }

    public final int hashCode() {
        String str = this.videoKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.videoUrl;
        int iD = q2.d(this.videoDuration, (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.subtitleUrl;
        int iHashCode2 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.videoTitle;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.videoThumbnailUrl;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final String toString() {
        String str = this.videoKey;
        String str2 = this.videoUrl;
        int i14 = this.videoDuration;
        String str3 = this.subtitleUrl;
        String str4 = this.videoTitle;
        String str5 = this.videoThumbnailUrl;
        StringBuilder sbI = p6.b.i("VideoDTO(videoKey=", str, ", videoUrl=", str2, ", videoDuration=");
        wr.g.t(i14, ", subtitleUrl=", str3, ", videoTitle=", sbI);
        return e5.h(sbI, str4, ", videoThumbnailUrl=", str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.videoKey);
        parcel.writeString(this.videoUrl);
        parcel.writeInt(this.videoDuration);
        parcel.writeString(this.subtitleUrl);
        parcel.writeString(this.videoTitle);
        parcel.writeString(this.videoThumbnailUrl);
    }

    public o(String str, String str2, int i14, String str3, String str4, String str5) {
        this.videoKey = str;
        this.videoUrl = str2;
        this.videoDuration = i14;
        this.subtitleUrl = str3;
        this.videoTitle = str4;
        this.videoThumbnailUrl = str5;
    }

    public o() {
        this(null, null, 0, null, null, null, 63, null);
    }
}
