package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005¨\u0006\u000b"}, d2 = {"Lqn2/y;", "Lpn2/d;", "", "deviceServerId", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getDeviceServerId", "()Ljava/lang/String;", "setDeviceServerId", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y implements pn2.d {
    public static final Parcelable.Creator<y> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceServerId")
    private String deviceServerId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<y> {
        @Override // android.os.Parcelable.Creator
        public final y createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new y(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final y[] newArray(int i14) {
            return new y[i14];
        }
    }

    public y(String str) {
        str.getClass();
        this.deviceServerId = str;
        if (str.length() == 8) {
            return;
        }
        vb.h.x(am.j.h(this.deviceServerId.length(), "deviceServerId length(8): "));
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
        return (obj instanceof y) && p005kotlin.jvm.internal.s.g(this.deviceServerId, ((y) obj).deviceServerId);
    }

    public final int hashCode() {
        return this.deviceServerId.hashCode();
    }

    public final String toString() {
        return am.j.m("FNServerInfoDto(deviceServerId='", this.deviceServerId, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.deviceServerId);
    }
}
