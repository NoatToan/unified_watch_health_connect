package bd0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.common.primitives.Ints;
import com.google.maps.android.BuildConfig;
import java.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0248a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f17524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f17525f;

    /* JADX INFO: renamed from: bd0.a$a, reason: collision with other inner class name */
    public class C0248a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(Parcel parcel) {
        this.f17520a = parcel.readString();
        this.f17522c = parcel.readString();
        this.f17521b = parcel.readString();
        this.f17523d = parcel.readString();
        this.f17525f = parcel.readInt();
        this.f17524e = (g) parcel.readParcelable(g.class.getClassLoader());
    }

    public final bm2.a b() {
        Integer numTryParse = Ints.tryParse(this.f17523d);
        if (numTryParse == null) {
            numTryParse = 0;
        }
        return new bm2.a(this.f17520a, this.f17522c, numTryParse.intValue(), this.f17525f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && this.f17520a.equalsIgnoreCase(((a) obj).f17520a);
    }

    public final int hashCode() {
        return Objects.hash(this.f17520a.toUpperCase());
    }

    public final String toString() {
        try {
            StringBuilder sb3 = new StringBuilder("BLEDevice.toString():\n  friendlyName:");
            String str = this.f17522c;
            String str2 = BuildConfig.TRAVIS;
            if (str == null) {
                str = BuildConfig.TRAVIS;
            }
            sb3.append(str);
            sb3.append("\n  macAddress:");
            String str3 = this.f17520a;
            if (str3 == null) {
                str3 = BuildConfig.TRAVIS;
            }
            sb3.append(str3);
            sb3.append("\n  passkey:");
            String str4 = this.f17521b;
            if (str4 == null) {
                str4 = BuildConfig.TRAVIS;
            }
            sb3.append(str4);
            sb3.append("\n  productNumber:");
            String str5 = this.f17523d;
            if (str5 != null) {
                str2 = str5;
            }
            sb3.append(str2);
            sb3.append("\n\n  isGDIAuthenticationEnabled:");
            int i14 = this.f17525f;
            sb3.append((i14 & 16) == 16);
            sb3.append("\n  serviceDataOptions:");
            sb3.append(i14);
            sb3.append("\n  isInPairMode:");
            sb3.append((i14 & 1) != 0);
            sb3.append("\n  BLEScanEvent:");
            g gVar = this.f17524e;
            sb3.append(gVar != null ? gVar.name() : "");
            sb3.append("\n");
            return sb3.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f17520a);
        parcel.writeString(this.f17522c);
        parcel.writeString(this.f17521b);
        parcel.writeString(this.f17523d);
        parcel.writeInt(this.f17525f);
        parcel.writeParcelable(this.f17524e, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(dk2.d dVar) {
        String address = dVar.f60240d.getAddress();
        String str = dVar.f60237a;
        String str2 = dVar.f60242f;
        String str3 = dVar.f60239c;
        Integer num = dVar.f60241e;
        this(address, str, str2, str3, num != null ? num.intValue() : 0, g.DEVICE_FOUND);
    }

    public a(String str, String str2) {
        this(str, str2, "", 0, null);
    }

    public a(String str, String str2, String str3, int i14, g gVar) {
        this(str, str2, str3, "", i14, gVar);
    }

    public a(String str, String str2, g gVar) {
        this(str, str2, "", 0, gVar);
    }

    public a(String str, String str2, String str3, String str4, int i14, g gVar) {
        str = str == null ? "" : str;
        this.f17520a = str;
        this.f17522c = TextUtils.isEmpty(str2) ? str : str2;
        this.f17521b = str3;
        this.f17525f = i14;
        this.f17524e = gVar;
        this.f17523d = str4 == null ? "" : str4;
    }
}
