package g81;

import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lg81/m0;", "Landroid/os/Parcelable;", "", "zoneDotColor", "", "zoneName", "zoneValueRangeString", "zoneTimeOrDistance", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m0 implements Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f76373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f76376d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m0> {
        @Override // android.os.Parcelable.Creator
        public final m0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new m0(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final m0[] newArray(int i14) {
            return new m0[i14];
        }
    }

    public m0(int i14, String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f76373a = i14;
        this.f76374b = str;
        this.f76375c = str2;
        this.f76376d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f76373a == m0Var.f76373a && this.f76374b.equals(m0Var.f76374b) && this.f76375c.equals(m0Var.f76375c) && this.f76376d.equals(m0Var.f76376d);
    }

    public final int hashCode() {
        return this.f76376d.hashCode() + wr.g.j(wr.g.j(Integer.hashCode(this.f76373a) * 31, 31, this.f76374b), 31, this.f76375c);
    }

    public final String toString() {
        return e5.h(wr.g.r(this.f76373a, "StaminaZoneRowState(zoneDotColor=", ", zoneName=", this.f76374b, ", zoneValueRangeString="), this.f76375c, ", zoneTimeOrDistance=", this.f76376d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f76373a);
        parcel.writeString(this.f76374b);
        parcel.writeString(this.f76375c);
        parcel.writeString(this.f76376d);
    }
}
