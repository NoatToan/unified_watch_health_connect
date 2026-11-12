package d20;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import java.util.Locale;
import n23.j;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Ld20/c;", "Landroid/os/Parcelable;", "<init>", "()V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "", "a", "Ljava/lang/String;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "b", "Z", "d", "()Z", "f", "(Z)V", "isCountryCodeVerified", "", "c", "I", "getUserProfileId", "()I", "g", "(I)V", "userProfileId", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE)
    public String countryCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("countryCodeVerified")
    private boolean isCountryCodeVerified;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfileId")
    private int userProfileId;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"d20/c$a", "Landroid/os/Parcelable$Creator;", "Ld20/c;", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public c(Parcel parcel) {
        parcel.getClass();
        this.countryCode = parcel.readString();
        this.isCountryCodeVerified = parcel.readByte() != 0;
        this.userProfileId = parcel.readInt();
    }

    public final String b() {
        String language = Locale.getDefault().getLanguage();
        String str = this.countryCode;
        if (str == null) {
            str = "";
        }
        Locale locale = new Locale(language, str);
        if (TextUtils.isEmpty(locale.getDisplayCountry())) {
            String str2 = this.countryCode;
            return str2 == null ? "" : str2;
        }
        String displayCountry = locale.getDisplayCountry();
        displayCountry.getClass();
        return displayCountry;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsCountryCodeVerified() {
        return this.isCountryCodeVerified;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void f() {
        this.isCountryCodeVerified = true;
    }

    public final void g(int i14) {
        this.userProfileId = i14;
    }

    public final String toString() {
        return j.g("Country Code = [", this.countryCode, "] , Location Verified = [", this.isCountryCodeVerified, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.countryCode);
        parcel.writeByte(this.isCountryCodeVerified ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.userProfileId);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld20/c$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Ld20/c;", "CREATOR", "Landroid/os/Parcelable$Creator;", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public c() {
    }
}
