package t00;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fBO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b \u0010\u0016¨\u0006!"}, d2 = {"Lt00/a;", "Landroid/os/Parcelable;", "", "athletePlanId", "", "contentType", "contentfulContentTypeKey", "contentfulContentId", "title", "caption", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "setAthletePlanId", "(Ljava/lang/Long;)V", "Ljava/lang/String;", "getContentType", "()Ljava/lang/String;", "setContentType", "(Ljava/lang/String;)V", "c", "getContentfulContentTypeKey", "setContentfulContentTypeKey", "d", "f", "setContentfulContentId", JWKParameterNames.RSA_EXPONENT, "g", "setTitle", "setCaption", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("athletePlanId")
    private Long athletePlanId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contentType")
    private String contentType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contentfulContentTypeKey")
    private String contentfulContentTypeKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contentfulContentId")
    private String contentfulContentId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("title")
    private String title;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("caption")
    private String caption;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        new C3051a(null);
        CREATOR = new b();
    }

    public /* synthetic */ a(Long l14, String str, String str2, String str3, String str4, String str5, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : str4, (i14 & 32) != 0 ? null : str5);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getAthletePlanId() {
        return this.athletePlanId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getCaption() {
        return this.caption;
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
        return s.g(this.athletePlanId, aVar.athletePlanId) && s.g(this.contentType, aVar.contentType) && s.g(this.contentfulContentTypeKey, aVar.contentfulContentTypeKey) && s.g(this.contentfulContentId, aVar.contentfulContentId) && s.g(this.title, aVar.title) && s.g(this.caption, aVar.caption);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getContentfulContentId() {
        return this.contentfulContentId;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean h() {
        return "ARTICLE".equals(this.contentType);
    }

    public final int hashCode() {
        Long l14 = this.athletePlanId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.contentType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contentfulContentTypeKey;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contentfulContentId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.caption;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean i() {
        return "COACH".equals(this.contentType);
    }

    public final boolean j() {
        return "VIDEO".equals(this.contentType);
    }

    public final String toString() {
        Long l14 = this.athletePlanId;
        String str = this.contentType;
        String str2 = this.contentfulContentTypeKey;
        String str3 = this.contentfulContentId;
        String str4 = this.title;
        String str5 = this.caption;
        StringBuilder sbJ = i.j("AtpTipDTO(athletePlanId=", ", contentType=", str, l14, ", contentfulContentTypeKey=");
        sn.a.t(sbJ, str2, ", contentfulContentId=", str3, ", title=");
        return e5.h(sbJ, str4, ", caption=", str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.athletePlanId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.contentType);
        parcel.writeString(this.contentfulContentTypeKey);
        parcel.writeString(this.contentfulContentId);
        parcel.writeString(this.title);
        parcel.writeString(this.caption);
    }

    /* JADX INFO: renamed from: t00.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lt00/a$a;", "", "<init>", "()V", "", "COACH", "Ljava/lang/String;", "VIDEO", "ARTICLE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3051a {
        public /* synthetic */ C3051a(j jVar) {
            this();
        }

        private C3051a() {
        }
    }

    public a(Long l14, String str, String str2, String str3, String str4, String str5) {
        this.athletePlanId = l14;
        this.contentType = str;
        this.contentfulContentTypeKey = str2;
        this.contentfulContentId = str3;
        this.title = str4;
        this.caption = str5;
    }

    public a() {
        this(null, null, null, null, null, null, 63, null);
    }
}
