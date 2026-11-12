package g81;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg81/a0;", "Landroid/os/Parcelable;", "", "avgScore", "maxScore", "Lg81/z;", "chartState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lg81/z;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f76266c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<a0> {
        @Override // android.os.Parcelable.Creator
        public final a0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a0(parcel.readString(), parcel.readString(), z.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final a0[] newArray(int i14) {
            return new a0[i14];
        }
    }

    public a0(String str, String str2, z zVar) {
        str.getClass();
        str2.getClass();
        zVar.getClass();
        this.f76264a = str;
        this.f76265b = str2;
        this.f76266c = zVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f76264a.equals(a0Var.f76264a) && this.f76265b.equals(a0Var.f76265b) && this.f76266c.equals(a0Var.f76266c);
    }

    public final int hashCode() {
        return this.f76266c.hashCode() + wr.g.j(this.f76264a.hashCode() * 31, 31, this.f76265b);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("EnduranceScoreTrendUIState(avgScore=", this.f76264a, ", maxScore=", this.f76265b, ", chartState=");
        sbI.append(this.f76266c);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f76264a);
        parcel.writeString(this.f76265b);
        this.f76266c.writeToParcel(parcel, i14);
    }
}
