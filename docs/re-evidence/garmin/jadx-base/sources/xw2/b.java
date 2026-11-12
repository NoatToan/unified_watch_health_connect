package xw2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxw2/b;", "Landroid/os/Parcelable;", "", "unitId", "", "macAddress", "displayName", "imageUrl", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f192449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f192451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f192452d;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(long j8, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f192449a = j8;
        this.f192450b = str;
        this.f192451c = str2;
        this.f192452d = str3;
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
        return this.f192449a == bVar.f192449a && this.f192450b.equals(bVar.f192450b) && this.f192451c.equals(bVar.f192451c) && s.g(this.f192452d, bVar.f192452d);
    }

    public final int hashCode() {
        int iJ = g.j(g.j(Long.hashCode(this.f192449a) * 31, 31, this.f192450b), 31, this.f192451c);
        String str = this.f192452d;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f192449a, "RTSDeviceRecord(unitId=", ", macAddress=", this.f192450b);
        sn.a.t(sbK, ", displayName=", this.f192451c, ", imageUrl=", this.f192452d);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f192449a);
        parcel.writeString(this.f192450b);
        parcel.writeString(this.f192451c);
        parcel.writeString(this.f192452d);
    }
}
