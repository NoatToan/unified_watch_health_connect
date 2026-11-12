package po2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lpo2/s;", "", "Landroid/os/Parcelable;", "", "cardName", "cardImageUrl", "shiftInUrl", "", "balance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f139375d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s> {
        @Override // android.os.Parcelable.Creator
        public final s createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new s(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final s[] newArray(int i14) {
            return new s[i14];
        }
    }

    public s(String str, String str2, String str3, double d14) {
        str.getClass();
        str2.getClass();
        this.f139372a = str;
        this.f139373b = str2;
        this.f139374c = str3;
        this.f139375d = d14;
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
        return this.f139372a.equals(sVar.f139372a) && this.f139373b.equals(sVar.f139373b) && p005kotlin.jvm.internal.s.g(this.f139374c, sVar.f139374c) && Double.compare(this.f139375d, sVar.f139375d) == 0;
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f139372a.hashCode() * 31, 31, this.f139373b);
        String str = this.f139374c;
        return Double.hashCode(this.f139375d) + ((iJ + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("SnowballCard(cardName=", this.f139372a, ", cardImageUrl=", this.f139373b, ", shiftInUrl=");
        sbI.append(this.f139374c);
        sbI.append(", balance=");
        sbI.append(this.f139375d);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f139372a);
        parcel.writeString(this.f139373b);
        parcel.writeString(this.f139374c);
        parcel.writeDouble(this.f139375d);
    }
}
