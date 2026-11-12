package m20;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001d\u0010\u0010¨\u0006\u001e"}, d2 = {"Lm20/f;", "Landroid/os/Parcelable;", "", "contactFirstName", "contactLastName", "contactUUID", "Ll20/c;", "contactInfoDTO", "initializationToken", "requesterFirstName", "requesterLastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll20/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getContactFirstName", "()Ljava/lang/String;", "b", "getContactLastName", "c", "getContactUUID", "d", "Ll20/c;", "()Ll20/c;", JWKParameterNames.RSA_EXPONENT, "getInitializationToken", "f", "getRequesterFirstName", "g", "getRequesterLastName", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contactFirstName")
    private final String contactFirstName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contactLastName")
    private final String contactLastName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contactUUID")
    private final String contactUUID;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contactInfo")
    private final l20.c contactInfoDTO;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("token")
    private final String initializationToken;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestorFirstName")
    private final String requesterFirstName;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestorLastName")
    private final String requesterLastName;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readString(), parcel.readString(), parcel.readString(), (l20.c) parcel.readParcelable(f.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    static {
        Parcelable.Creator<l20.c> creator = l20.c.CREATOR;
    }

    public f(String str, String str2, String str3, l20.c cVar, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        cVar.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.contactFirstName = str;
        this.contactLastName = str2;
        this.contactUUID = str3;
        this.contactInfoDTO = cVar;
        this.initializationToken = str4;
        this.requesterFirstName = str5;
        this.requesterLastName = str6;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l20.c getContactInfoDTO() {
        return this.contactInfoDTO;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.contactFirstName);
        parcel.writeString(this.contactLastName);
        parcel.writeString(this.contactUUID);
        parcel.writeParcelable(this.contactInfoDTO, i14);
        parcel.writeString(this.initializationToken);
        parcel.writeString(this.requesterFirstName);
        parcel.writeString(this.requesterLastName);
    }
}
