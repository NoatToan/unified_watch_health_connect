package hx0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhx0/b0;", "Landroid/os/Parcelable;", "", "optionId", "", "checked", "", Constants.ScionAnalytics.PARAM_LABEL, "icon", "<init>", "(IZLjava/lang/String;I)V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b0 implements Parcelable {
    public static final Parcelable.Creator<b0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f86024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f86026d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b0> {
        @Override // android.os.Parcelable.Creator
        public final b0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b0(parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final b0[] newArray(int i14) {
            return new b0[i14];
        }
    }

    public b0(int i14, boolean z14, String str, int i15) {
        str.getClass();
        this.f86023a = i14;
        this.f86024b = z14;
        this.f86025c = str;
        this.f86026d = i15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f86023a == b0Var.f86023a && this.f86024b == b0Var.f86024b && this.f86025c.equals(b0Var.f86025c) && this.f86026d == b0Var.f86026d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f86026d) + wr.g.j(q6.f.g(Integer.hashCode(this.f86023a) * 31, 31, this.f86024b), 31, this.f86025c);
    }

    public final String toString() {
        return "MenstrualCycleOption(optionId=" + this.f86023a + ", checked=" + this.f86024b + ", label=" + this.f86025c + ", icon=" + this.f86026d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f86023a);
        parcel.writeInt(this.f86024b ? 1 : 0);
        parcel.writeString(this.f86025c);
        parcel.writeInt(this.f86026d);
    }
}
