package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e¨\u0006\u0018"}, d2 = {"Lqn2/b;", "Lpn2/d;", "", "appletInstanceAid", "appletInstanceBinaryVersion", "appletInstanceAppletVersion", "appletInstancePackageKeyVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getAppletInstanceAid", "()Ljava/lang/String;", "setAppletInstanceAid", "(Ljava/lang/String;)V", "b", "getAppletInstanceBinaryVersion", "setAppletInstanceBinaryVersion", "c", "getAppletInstanceAppletVersion", "setAppletInstanceAppletVersion", "d", "getAppletInstancePackageKeyVersion", "setAppletInstancePackageKeyVersion", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements pn2.d {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("appletInstanceAid")
    private String appletInstanceAid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("appletInstanceBinaryVersion")
    private String appletInstanceBinaryVersion;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("appletInstanceAppletVersion")
    private String appletInstanceAppletVersion;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("appletInstancePackageKeyVersion")
    private String appletInstancePackageKeyVersion;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(String str, String str2, String str3, String str4) {
        kg.f.p(str, str2, str3, str4);
        this.appletInstanceAid = str;
        this.appletInstanceBinaryVersion = str2;
        this.appletInstanceAppletVersion = str3;
        this.appletInstancePackageKeyVersion = str4;
        int length = str.length();
        if (2 > length || length >= 33) {
            vb.h.x(am.j.h(this.appletInstanceAid.length(), "appletInstanceAid length(2-32): "));
            throw null;
        }
        if (this.appletInstanceBinaryVersion.length() != 6) {
            vb.h.x(am.j.h(this.appletInstanceBinaryVersion.length(), "appletInstanceBinaryVersion length(6): "));
            throw null;
        }
        if (this.appletInstanceAppletVersion.length() != 6) {
            vb.h.x(am.j.h(this.appletInstanceAppletVersion.length(), "appletInstanceAppletVersion length(6): "));
            throw null;
        }
        if (this.appletInstancePackageKeyVersion.length() == 4) {
            return;
        }
        vb.h.x(am.j.h(this.appletInstancePackageKeyVersion.length(), "appletInstancePackageKeyVersion length(4): "));
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
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.appletInstanceAid, bVar.appletInstanceAid) && p005kotlin.jvm.internal.s.g(this.appletInstanceBinaryVersion, bVar.appletInstanceBinaryVersion) && p005kotlin.jvm.internal.s.g(this.appletInstanceAppletVersion, bVar.appletInstanceAppletVersion) && p005kotlin.jvm.internal.s.g(this.appletInstancePackageKeyVersion, bVar.appletInstancePackageKeyVersion);
    }

    public final int hashCode() {
        return this.appletInstancePackageKeyVersion.hashCode() + wr.g.j(wr.g.j(this.appletInstanceAid.hashCode() * 31, 31, this.appletInstanceBinaryVersion), 31, this.appletInstanceAppletVersion);
    }

    public final String toString() {
        String str = this.appletInstanceAid;
        String str2 = this.appletInstanceBinaryVersion;
        return e5.h(p6.b.i("FNAppletInstanceInfoDto(appletInstanceAid='", str, "', appletInstanceBinaryVersion='", str2, "', appletInstanceAppletVersion='"), this.appletInstanceAppletVersion, "', appletInstancePackageKeyVersion='", this.appletInstancePackageKeyVersion, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.appletInstanceAid);
        parcel.writeString(this.appletInstanceBinaryVersion);
        parcel.writeString(this.appletInstanceAppletVersion);
        parcel.writeString(this.appletInstancePackageKeyVersion);
    }
}
