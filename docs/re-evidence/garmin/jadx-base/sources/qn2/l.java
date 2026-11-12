package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lqn2/l;", "Lpn2/d;", "", "platformType", "carrierId", "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getPlatformType", "()Ljava/lang/String;", "setPlatformType", "(Ljava/lang/String;)V", "b", "getCarrierId", "setCarrierId", "c", "getDeviceId", "setDeviceId", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements pn2.d {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("platformType")
    private String platformType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("carrierId")
    private String carrierId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private String deviceId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new l(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public l(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.platformType = str;
        this.carrierId = str2;
        this.deviceId = str3;
        if (str.length() != 2) {
            vb.h.x(am.j.h(this.platformType.length(), "platformType length(2): "));
            throw null;
        }
        if (this.carrierId.length() != 6) {
            vb.h.x(am.j.h(this.carrierId.length(), "carrierId length(6): "));
            throw null;
        }
        if (this.deviceId.length() == 22) {
            return;
        }
        vb.h.x(am.j.h(this.deviceId.length(), "deviceId length(22): "));
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
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.platformType, lVar.platformType) && p005kotlin.jvm.internal.s.g(this.carrierId, lVar.carrierId) && p005kotlin.jvm.internal.s.g(this.deviceId, lVar.deviceId);
    }

    public final int hashCode() {
        return this.deviceId.hashCode() + wr.g.j(this.platformType.hashCode() * 31, 31, this.carrierId);
    }

    public final String toString() {
        return am.j.o(this.deviceId, "')", p6.b.i("FNDeviceIdentificationInfoDto(platformType='", this.platformType, "', carrierId='", this.carrierId, "', deviceId='"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.platformType);
        parcel.writeString(this.carrierId);
        parcel.writeString(this.deviceId);
    }
}
