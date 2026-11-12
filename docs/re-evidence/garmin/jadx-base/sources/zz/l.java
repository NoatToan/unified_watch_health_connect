package zz;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lzz/l;", "Landroid/os/Parcelable;", "", "time", "value", Constants.ScionAnalytics.PARAM_LABEL, "unit", "secondaryLabel", "", "colorResId", "drawableResId", "drawableTint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f207545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f207546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f207547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f207548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f207549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f207550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f207551h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new l(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public /* synthetic */ l(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : num, (i14 & 64) != 0 ? null : num2, (i14 & 128) != 0 ? null : num3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.f207544a, lVar.f207544a) && p005kotlin.jvm.internal.s.g(this.f207545b, lVar.f207545b) && p005kotlin.jvm.internal.s.g(this.f207546c, lVar.f207546c) && p005kotlin.jvm.internal.s.g(this.f207547d, lVar.f207547d) && p005kotlin.jvm.internal.s.g(this.f207548e, lVar.f207548e) && p005kotlin.jvm.internal.s.g(this.f207549f, lVar.f207549f) && p005kotlin.jvm.internal.s.g(this.f207550g, lVar.f207550g) && p005kotlin.jvm.internal.s.g(this.f207551h, lVar.f207551h);
    }

    public final int hashCode() {
        String str = this.f207544a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f207545b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f207546c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f207547d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f207548e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f207549f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f207550g;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f207551h;
        return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("MarkerData(time=", this.f207544a, ", value=", this.f207545b, ", label=");
        sn.a.t(sbI, this.f207546c, ", unit=", this.f207547d, ", secondaryLabel=");
        fb1.c.u(this.f207549f, this.f207548e, ", colorResId=", ", drawableResId=", sbI);
        return b71.i.h(sbI, this.f207550g, ", drawableTint=", this.f207551h, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f207544a);
        parcel.writeString(this.f207545b);
        parcel.writeString(this.f207546c);
        parcel.writeString(this.f207547d);
        parcel.writeString(this.f207548e);
        Integer num = this.f207549f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.f207550g;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.f207551h;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
    }

    public l(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3) {
        this.f207544a = str;
        this.f207545b = str2;
        this.f207546c = str3;
        this.f207547d = str4;
        this.f207548e = str5;
        this.f207549f = num;
        this.f207550g = num2;
        this.f207551h = num3;
    }

    public l() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
