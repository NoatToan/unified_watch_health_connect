package ob;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.v;
import androidx.media3.common.w;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import fa.k;
import fa.z;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b implements w.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f131091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131093c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f131094d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f131095e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f131096f;

    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(Parcel parcel) {
        this.f131091a = parcel.readInt();
        this.f131092b = parcel.readString();
        this.f131093c = parcel.readString();
        this.f131094d = parcel.readString();
        int i14 = z.f70071a;
        this.f131095e = parcel.readInt() != 0;
        this.f131096f = parcel.readInt();
    }

    public static b b(Map<String, List<String>> map) {
        boolean z14;
        int i14;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i15;
        List<String> list = map.get("icy-br");
        boolean z15 = true;
        int i16 = -1;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i15 = Integer.parseInt(str4) * 1000;
                if (i15 > 0) {
                    z14 = true;
                } else {
                    try {
                        k.g("Invalid bitrate: " + str4);
                        z14 = false;
                        i15 = -1;
                    } catch (NumberFormatException unused) {
                        k.g("Invalid bitrate header: " + str4);
                        z14 = false;
                    }
                }
            } catch (NumberFormatException unused2) {
                i15 = -1;
            }
            i14 = i15;
        } else {
            z14 = false;
            i14 = -1;
        }
        List<String> list2 = map.get("icy-genre");
        if (list2 != null) {
            str = list2.get(0);
            z14 = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str2 = list3.get(0);
            z14 = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str3 = list4.get(0);
            z14 = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            z14 = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i17 = Integer.parseInt(str5);
                if (i17 > 0) {
                    i16 = i17;
                } else {
                    try {
                        k.g("Invalid metadata interval: " + str5);
                        z15 = z14;
                    } catch (NumberFormatException unused3) {
                        i16 = i17;
                        k.g("Invalid metadata interval: " + str5);
                    }
                }
                z14 = z15;
            } catch (NumberFormatException unused4) {
            }
        }
        int i18 = i16;
        if (z14) {
            return new b(i14, str, str2, str3, zEquals, i18);
        }
        return null;
    }

    @Override // androidx.media3.common.w.b
    public final void R3(v.b bVar) {
        String str = this.f131093c;
        if (str != null) {
            bVar.f8571x = str;
        }
        String str2 = this.f131092b;
        if (str2 != null) {
            bVar.f8570w = str2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f131091a == bVar.f131091a) {
                String str = bVar.f131092b;
                int i14 = z.f70071a;
                if (Objects.equals(this.f131092b, str) && Objects.equals(this.f131093c, bVar.f131093c) && Objects.equals(this.f131094d, bVar.f131094d) && this.f131095e == bVar.f131095e && this.f131096f == bVar.f131096f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i14 = (527 + this.f131091a) * 31;
        String str = this.f131092b;
        int iHashCode = (i14 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f131093c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f131094d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f131095e ? 1 : 0)) * 31) + this.f131096f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f131093c + "\", genre=\"" + this.f131092b + "\", bitrate=" + this.f131091a + ", metadataInterval=" + this.f131096f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeInt(this.f131091a);
        parcel.writeString(this.f131092b);
        parcel.writeString(this.f131093c);
        parcel.writeString(this.f131094d);
        int i15 = z.f70071a;
        parcel.writeInt(this.f131095e ? 1 : 0);
        parcel.writeInt(this.f131096f);
    }

    public b(int i14, String str, String str2, String str3, boolean z14, int i15) {
        fa.a.a(i15 == -1 || i15 > 0);
        this.f131091a = i14;
        this.f131092b = str;
        this.f131093c = str2;
        this.f131094d = str3;
        this.f131095e = z14;
        this.f131096f = i15;
    }
}
