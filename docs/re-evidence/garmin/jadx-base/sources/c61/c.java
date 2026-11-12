package c61;

import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import kg.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lc61/c;", "Landroid/os/Parcelable;", "", "formattedTimestamp", "formattedValue", "formattedUnit", "percentageCaption", "", "trendingIcon", "trendingIconContentDescription", "trendingMessage", "noDataMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f24642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f24643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f24644g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f24645h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : num, (i14 & 32) != 0 ? null : str5, (i14 & 64) != 0 ? null : str6, (i14 & 128) != 0 ? null : str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f24638a, cVar.f24638a) && s.g(this.f24639b, cVar.f24639b) && s.g(this.f24640c, cVar.f24640c) && s.g(this.f24641d, cVar.f24641d) && s.g(this.f24642e, cVar.f24642e) && s.g(this.f24643f, cVar.f24643f) && s.g(this.f24644g, cVar.f24644g) && s.g(this.f24645h, cVar.f24645h);
    }

    public final int hashCode() {
        String str = this.f24638a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f24639b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24640c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f24641d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f24642e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f24643f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f24644g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f24645h;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("HeatAltitudeAcclimationUIModel(formattedTimestamp=", this.f24638a, ", formattedValue=", this.f24639b, ", formattedUnit=");
        sn.a.t(sbI, this.f24640c, ", percentageCaption=", this.f24641d, ", trendingIcon=");
        p6.b.l(this.f24642e, ", trendingIconContentDescription=", this.f24643f, ", trendingMessage=", sbI);
        return e5.h(sbI, this.f24644g, ", noDataMessage=", this.f24645h, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f24638a);
        parcel.writeString(this.f24639b);
        parcel.writeString(this.f24640c);
        parcel.writeString(this.f24641d);
        Integer num = this.f24642e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num);
        }
        parcel.writeString(this.f24643f);
        parcel.writeString(this.f24644g);
        parcel.writeString(this.f24645h);
    }

    public c(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7) {
        this.f24638a = str;
        this.f24639b = str2;
        this.f24640c = str3;
        this.f24641d = str4;
        this.f24642e = num;
        this.f24643f = str5;
        this.f24644g = str6;
        this.f24645h = str7;
    }

    public c() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
