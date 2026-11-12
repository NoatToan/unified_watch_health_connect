package g81;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import c22.c3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lg81/v;", "Landroid/os/Parcelable;", "Lc22/c3;", "activityTypeLabelRes", "Lam/x0;", "activityType", "", "formattedContribution", "<init>", "(Lc22/c3;Lam/x0;Ljava/lang/String;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f76409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f76410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f76411c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<v> {
        @Override // android.os.Parcelable.Creator
        public final v createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new v((c3) parcel.readParcelable(v.class.getClassLoader()), (x0) parcel.readParcelable(v.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final v[] newArray(int i14) {
            return new v[i14];
        }
    }

    public v(c3 c3Var, x0 x0Var, String str) {
        x0Var.getClass();
        str.getClass();
        this.f76409a = c3Var;
        this.f76410b = x0Var;
        this.f76411c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f76409a, vVar.f76409a) && this.f76410b == vVar.f76410b && p005kotlin.jvm.internal.s.g(this.f76411c, vVar.f76411c);
    }

    public final int hashCode() {
        c3 c3Var = this.f76409a;
        return this.f76411c.hashCode() + ((this.f76410b.hashCode() + ((c3Var == null ? 0 : c3Var.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EnduranceScoreSubContributor(activityTypeLabelRes=");
        sb3.append(this.f76409a);
        sb3.append(", activityType=");
        sb3.append(this.f76410b);
        sb3.append(", formattedContribution=");
        return am.j.o(this.f76411c, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f76409a, i14);
        parcel.writeParcelable(this.f76410b, i14);
        parcel.writeString(this.f76411c);
    }

    public /* synthetic */ v(c3 c3Var, x0 x0Var, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : c3Var, x0Var, str);
    }
}
