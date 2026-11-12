package ve2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lve2/s;", "Landroid/os/Parcelable;", "", "text", "", "showOnWelcomeScreen", "showOnContinueAsScreen", "<init>", "(Ljava/lang/String;ZZ)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f177850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f177851c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new s(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i14) {
            return new s[i14];
        }
    }

    public s(String str, boolean z14, boolean z15) {
        str.getClass();
        this.f177849a = str;
        this.f177850b = z14;
        this.f177851c = z15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f177849a.equals(sVar.f177849a) && this.f177850b == sVar.f177850b && this.f177851c == sVar.f177851c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f177851c) + q6.f.g(this.f177849a.hashCode() * 31, 31, this.f177850b);
    }

    public final String toString() {
        return hb.a.k(zl.a.d("SkipSigninConfig(text='", this.f177849a, "', showOnWelcomeScreen=", this.f177850b, ", showOnContinueAsScreen="), this.f177851c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f177849a);
        parcel.writeInt(this.f177850b ? 1 : 0);
        parcel.writeInt(this.f177851c ? 1 : 0);
    }
}
