package c80;

import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc80/a;", "Landroid/os/Parcelable;", "", "uuid", "gearType", "name", "brand", ModelSourceWrapper.TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-domain-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0375a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f25289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f25290e;

    /* JADX INFO: renamed from: c80.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0375a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(String str, String str2, String str3, String str4, String str5) {
        str2.getClass();
        this.f25286a = str;
        this.f25287b = str2;
        this.f25288c = str3;
        this.f25289d = str4;
        this.f25290e = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.f25286a, aVar.f25286a) && this.f25287b.equals(aVar.f25287b) && p005kotlin.jvm.internal.s.g(this.f25288c, aVar.f25288c) && p005kotlin.jvm.internal.s.g(this.f25289d, aVar.f25289d) && p005kotlin.jvm.internal.s.g(this.f25290e, aVar.f25290e);
    }

    public final int hashCode() {
        String str = this.f25286a;
        int iJ = wr.g.j((str == null ? 0 : str.hashCode()) * 31, 31, this.f25287b);
        String str2 = this.f25288c;
        int iHashCode = (iJ + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f25289d;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f25290e;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ActivityGearItem(uuid=", this.f25286a, ", gearType=", this.f25287b, ", name=");
        sn.a.t(sbI, this.f25288c, ", brand=", this.f25289d, ", model=");
        return am.j.o(this.f25290e, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f25286a);
        parcel.writeString(this.f25287b);
        parcel.writeString(this.f25288c);
        parcel.writeString(this.f25289d);
        parcel.writeString(this.f25290e);
    }
}
