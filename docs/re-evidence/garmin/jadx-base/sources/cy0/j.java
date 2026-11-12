package cy0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcy0/j;", "Landroid/os/Parcelable;", "", "sessionId", "sessionName", "url", TtmlNode.START, TtmlNode.END, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "b", "c", "d", "getStart", JWKParameterNames.RSA_EXPONENT, "getEnd", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sessionId")
    private final String sessionId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sessionName")
    private final String sessionName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("url")
    private final String url;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.START)
    private final String start;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName(TtmlNode.END)
    private final String end;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public j(String str, String str2, String str3, String str4, String str5) {
        hb.a.p(str, str2, str3, str4, str5);
        this.sessionId = str;
        this.sessionName = str2;
        this.url = str3;
        this.start = str4;
        this.end = str5;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSessionName() {
        return this.sessionName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.sessionId, jVar.sessionId) && p005kotlin.jvm.internal.s.g(this.sessionName, jVar.sessionName) && p005kotlin.jvm.internal.s.g(this.url, jVar.url) && p005kotlin.jvm.internal.s.g(this.start, jVar.start) && p005kotlin.jvm.internal.s.g(this.end, jVar.end);
    }

    public final int hashCode() {
        return this.end.hashCode() + wr.g.j(wr.g.j(wr.g.j(this.sessionId.hashCode() * 31, 31, this.sessionName), 31, this.url), 31, this.start);
    }

    public final String toString() {
        String str = this.sessionId;
        String str2 = this.sessionName;
        String str3 = this.url;
        String str4 = this.start;
        String str5 = this.end;
        StringBuilder sbI = p6.b.i("LiveTrackSessionDTO(sessionId=", str, ", sessionName=", str2, ", url=");
        sn.a.t(sbI, str3, ", start=", str4, ", end=");
        return am.j.o(str5, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.sessionId);
        parcel.writeString(this.sessionName);
        parcel.writeString(this.url);
        parcel.writeString(this.start);
        parcel.writeString(this.end);
    }
}
