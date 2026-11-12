package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lqn2/o;", "Lpn2/d;", "", "phoneName", "phonePlatformName", "phonePlatformVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getPhoneName", "()Ljava/lang/String;", "setPhoneName", "(Ljava/lang/String;)V", "b", "getPhonePlatformName", "setPhonePlatformName", "c", "getPhonePlatformVersion", "setPhonePlatformVersion", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o implements pn2.d {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phoneName")
    private String phoneName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phonePlatformName")
    private String phonePlatformName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phonePlatformVersion")
    private String phonePlatformVersion;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new o(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public o(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.phoneName = str;
        this.phonePlatformName = str2;
        this.phonePlatformVersion = str3;
        int length = str.length();
        if (1 > length || length >= 256) {
            vb.h.x(am.j.h(this.phoneName.length(), "phoneName length(1-255): "));
            throw null;
        }
        int length2 = this.phonePlatformName.length();
        if (1 > length2 || length2 >= 256) {
            vb.h.x(am.j.h(this.phonePlatformName.length(), "phonePlatformName length(1-255): "));
            throw null;
        }
        int length3 = this.phonePlatformVersion.length();
        if (1 > length3 || length3 >= 256) {
            vb.h.x(am.j.h(this.phonePlatformVersion.length(), "phonePlatformVersion length(1-255): "));
            throw null;
        }
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
        return p005kotlin.jvm.internal.s.g(this.phoneName, oVar.phoneName) && p005kotlin.jvm.internal.s.g(this.phonePlatformName, oVar.phonePlatformName) && p005kotlin.jvm.internal.s.g(this.phonePlatformVersion, oVar.phonePlatformVersion);
    }

    public final int hashCode() {
        return this.phonePlatformVersion.hashCode() + wr.g.j(this.phoneName.hashCode() * 31, 31, this.phonePlatformName);
    }

    public final String toString() {
        return am.j.o(this.phonePlatformVersion, "')", p6.b.i("FNPhoneInfoDto(phoneName='", this.phoneName, "', phonePlatformName='", this.phonePlatformName, "', phonePlatformVersion='"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.phoneName);
        parcel.writeString(this.phonePlatformName);
        parcel.writeString(this.phonePlatformVersion);
    }
}
