package g81;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg81/j0;", "Landroid/os/Parcelable;", "", "formattedDate", "staminaValue", "timeOrDistanceValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j0 implements Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76347c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j0> {
        @Override // android.os.Parcelable.Creator
        public final j0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j0(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final j0[] newArray(int i14) {
            return new j0[i14];
        }
    }

    public j0(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f76345a = str;
        this.f76346b = str2;
        this.f76347c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f76345a.equals(j0Var.f76345a) && this.f76346b.equals(j0Var.f76346b) && this.f76347c.equals(j0Var.f76347c);
    }

    public final int hashCode() {
        return this.f76347c.hashCode() + wr.g.j(this.f76345a.hashCode() * 31, 31, this.f76346b);
    }

    public final String toString() {
        return am.j.o(this.f76347c, ")", p6.b.i("StaminaComparisonRowState(formattedDate=", this.f76345a, ", staminaValue=", this.f76346b, ", timeOrDistanceValue="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f76345a);
        parcel.writeString(this.f76346b);
        parcel.writeString(this.f76347c);
    }
}
