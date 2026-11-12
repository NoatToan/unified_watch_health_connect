package tv;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ltv/j;", "Landroid/os/Parcelable;", "", "title", "subtitle", "description", "errorTitle", "errorMessage", "helpTitle", "helpUrl", "units", "", "minimumAcceptedValue", "maximumAcceptedValue", "decimalValidator", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLjava/lang/Float;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f166512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f166513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f166514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f166515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f166516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f166517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f166518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f166519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f166520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Float f166521k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readFloat(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public /* synthetic */ j(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f14, float f15, Float f16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : str7, (i14 & 128) != 0 ? null : str8, (i14 & 256) != 0 ? 0.0f : f14, (i14 & 512) != 0 ? 1.0f : f15, (i14 & 1024) != 0 ? null : f16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.f166511a, jVar.f166511a) && p005kotlin.jvm.internal.s.g(this.f166512b, jVar.f166512b) && p005kotlin.jvm.internal.s.g(this.f166513c, jVar.f166513c) && p005kotlin.jvm.internal.s.g(this.f166514d, jVar.f166514d) && p005kotlin.jvm.internal.s.g(this.f166515e, jVar.f166515e) && p005kotlin.jvm.internal.s.g(this.f166516f, jVar.f166516f) && p005kotlin.jvm.internal.s.g(this.f166517g, jVar.f166517g) && p005kotlin.jvm.internal.s.g(this.f166518h, jVar.f166518h) && Float.compare(this.f166519i, jVar.f166519i) == 0 && Float.compare(this.f166520j, jVar.f166520j) == 0 && p005kotlin.jvm.internal.s.g(this.f166521k, jVar.f166521k);
    }

    public final int hashCode() {
        int iHashCode = this.f166511a.hashCode() * 31;
        String str = this.f166512b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f166513c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f166514d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f166515e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f166516f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f166517g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f166518h;
        int iD = q6.f.d(this.f166520j, q6.f.d(this.f166519i, (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31, 31), 31);
        Float f14 = this.f166521k;
        return iD + (f14 != null ? f14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("SettingProprieties(title=", this.f166511a, ", subtitle=", this.f166512b, ", description=");
        sn.a.t(sbI, this.f166513c, ", errorTitle=", this.f166514d, ", errorMessage=");
        sn.a.t(sbI, this.f166515e, ", helpTitle=", this.f166516f, ", helpUrl=");
        sn.a.t(sbI, this.f166517g, ", units=", this.f166518h, ", minimumAcceptedValue=");
        l2.n(sbI, this.f166519i, ", maximumAcceptedValue=", this.f166520j, ", decimalValidator=");
        sbI.append(this.f166521k);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f166511a);
        parcel.writeString(this.f166512b);
        parcel.writeString(this.f166513c);
        parcel.writeString(this.f166514d);
        parcel.writeString(this.f166515e);
        parcel.writeString(this.f166516f);
        parcel.writeString(this.f166517g);
        parcel.writeString(this.f166518h);
        parcel.writeFloat(this.f166519i);
        parcel.writeFloat(this.f166520j);
        Float f14 = this.f166521k;
        if (f14 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f14.floatValue());
        }
    }

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f14, float f15, Float f16) {
        str.getClass();
        this.f166511a = str;
        this.f166512b = str2;
        this.f166513c = str3;
        this.f166514d = str4;
        this.f166515e = str5;
        this.f166516f = str6;
        this.f166517g = str7;
        this.f166518h = str8;
        this.f166519i = f14;
        this.f166520j = f15;
        this.f166521k = f16;
    }

    public j() {
        this(null, null, null, null, null, null, null, null, 0.0f, 0.0f, null, 2047, null);
    }
}
