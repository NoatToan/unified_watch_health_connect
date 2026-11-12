package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016¨\u0006 "}, d2 = {"Lqn2/a;", "Lpn2/d;", "", NotificationConstants.KEY_DATA_MIME_TYPE, "", "binaryVersion", "appletVersion", "packageKeyVersion", "applicationLifeCycleState", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "I", "getType", "()I", "setType", "(I)V", "b", "Ljava/lang/String;", "getBinaryVersion", "()Ljava/lang/String;", "setBinaryVersion", "(Ljava/lang/String;)V", "c", "getAppletVersion", "setAppletVersion", "d", "getPackageKeyVersion", "setPackageKeyVersion", JWKParameterNames.RSA_EXPONENT, "getApplicationLifeCycleState", "setApplicationLifeCycleState", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements pn2.d {
    public static final Parcelable.Creator<a> CREATOR = new C2747a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName(NotificationConstants.KEY_DATA_MIME_TYPE)
    private int type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("binaryVersion")
    private String binaryVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("appletVersion")
    private String appletVersion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("packageKeyVersion")
    private String packageKeyVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("applicationLifeCycleState")
    private String applicationLifeCycleState;

    /* JADX INFO: renamed from: qn2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2747a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(int i14, String str, String str2, String str3, String str4) {
        kg.f.p(str, str2, str3, str4);
        this.type = i14;
        this.binaryVersion = str;
        this.appletVersion = str2;
        this.packageKeyVersion = str3;
        this.applicationLifeCycleState = str4;
        if (str.length() != 6) {
            vb.h.x(am.j.h(this.binaryVersion.length(), "binaryVersion length(6): "));
            throw null;
        }
        if (this.appletVersion.length() != 6) {
            vb.h.x(am.j.h(this.appletVersion.length(), "appletVersion length(6): "));
            throw null;
        }
        if (this.packageKeyVersion.length() != 4) {
            vb.h.x(am.j.h(this.packageKeyVersion.length(), "packageKeyVersion length(4): "));
            throw null;
        }
        if (this.applicationLifeCycleState.length() == 2) {
            return;
        }
        vb.h.x(am.j.h(this.applicationLifeCycleState.length(), "applicationLifeCycleState length(2): "));
        throw null;
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
        return this.type == aVar.type && p005kotlin.jvm.internal.s.g(this.binaryVersion, aVar.binaryVersion) && p005kotlin.jvm.internal.s.g(this.appletVersion, aVar.appletVersion) && p005kotlin.jvm.internal.s.g(this.packageKeyVersion, aVar.packageKeyVersion) && p005kotlin.jvm.internal.s.g(this.applicationLifeCycleState, aVar.applicationLifeCycleState);
    }

    public final int hashCode() {
        return this.applicationLifeCycleState.hashCode() + wr.g.j(wr.g.j(wr.g.j(Integer.hashCode(this.type) * 31, 31, this.binaryVersion), 31, this.appletVersion), 31, this.packageKeyVersion);
    }

    public final String toString() {
        int i14 = this.type;
        String str = this.binaryVersion;
        String str2 = this.appletVersion;
        String str3 = this.packageKeyVersion;
        String str4 = this.applicationLifeCycleState;
        StringBuilder sbR = wr.g.r(i14, "FNAppletInfoListItemDto(type=", ", binaryVersion='", str, "', appletVersion='");
        sn.a.t(sbR, str2, "', packageKeyVersion='", str3, "', applicationLifeCycleState='");
        return am.j.o(str4, "')", sbR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.type);
        parcel.writeString(this.binaryVersion);
        parcel.writeString(this.appletVersion);
        parcel.writeString(this.packageKeyVersion);
        parcel.writeString(this.applicationLifeCycleState);
    }
}
