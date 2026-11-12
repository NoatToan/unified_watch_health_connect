package c61;

import android.os.Parcel;
import android.os.Parcelable;
import kg.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import wr.g;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lc61/d;", "Landroid/os/Parcelable;", "", "title", "formattedDate", "formattedValue", "trendingInfo", "", "trendingIcon", "trendingMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f24650e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f24651f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(String str, String str2, String str3, String str4, Integer num, String str5) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f24646a = str;
        this.f24647b = str2;
        this.f24648c = str3;
        this.f24649d = str4;
        this.f24650e = num;
        this.f24651f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f24646a.equals(dVar.f24646a) && this.f24647b.equals(dVar.f24647b) && this.f24648c.equals(dVar.f24648c) && s.g(this.f24649d, dVar.f24649d) && s.g(this.f24650e, dVar.f24650e) && s.g(this.f24651f, dVar.f24651f);
    }

    public final int hashCode() {
        int iJ = g.j(g.j(this.f24646a.hashCode() * 31, 31, this.f24647b), 31, this.f24648c);
        String str = this.f24649d;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f24650e;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f24651f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("LegacyAltitudeAcclimationUIModel(title=", this.f24646a, ", formattedDate=", this.f24647b, ", formattedValue=");
        sn.a.t(sbI, this.f24648c, ", trendingInfo=", this.f24649d, ", trendingIcon=");
        sbI.append(this.f24650e);
        sbI.append(", trendingMessage=");
        sbI.append(this.f24651f);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f24646a);
        parcel.writeString(this.f24647b);
        parcel.writeString(this.f24648c);
        parcel.writeString(this.f24649d);
        Integer num = this.f24650e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num);
        }
        parcel.writeString(this.f24651f);
    }
}
