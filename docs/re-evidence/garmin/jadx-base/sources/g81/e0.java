package g81;

import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lg81/e0;", "Landroid/os/Parcelable;", "", "dotColor", "", "markerValue", "markerUnit", "markerDate", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f76316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f76319d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e0> {
        @Override // android.os.Parcelable.Creator
        public final e0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e0(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final e0[] newArray(int i14) {
            return new e0[i14];
        }
    }

    public e0(Integer num, String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f76316a = num;
        this.f76317b = str;
        this.f76318c = str2;
        this.f76319d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return p005kotlin.jvm.internal.s.g(this.f76316a, e0Var.f76316a) && this.f76317b.equals(e0Var.f76317b) && this.f76318c.equals(e0Var.f76318c) && this.f76319d.equals(e0Var.f76319d);
    }

    public final int hashCode() {
        Integer num = this.f76316a;
        return this.f76319d.hashCode() + wr.g.j(wr.g.j((num == null ? 0 : num.hashCode()) * 31, 31, this.f76317b), 31, this.f76318c);
    }

    public final String toString() {
        return e5.h(l2.f("MarkerDataState(dotColor=", this.f76316a, ", markerValue=", this.f76317b, ", markerUnit="), this.f76318c, ", markerDate=", this.f76319d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.f76316a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.f76317b);
        parcel.writeString(this.f76318c);
        parcel.writeString(this.f76319d);
    }
}
