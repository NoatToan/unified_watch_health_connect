package nb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.v;
import androidx.media3.common.w;
import com.google.common.base.Ascii;
import com.google.common.primitives.Ints;
import fa.z;
import wr.g;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class b implements w.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125246b;

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
        String string = parcel.readString();
        int i14 = z.f70071a;
        this.f125245a = string;
        this.f125246b = parcel.readString();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.media3.common.w.b
    public final void R3(v.b bVar) {
        String str = this.f125245a;
        str.getClass();
        byte b14 = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b14 = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b14 = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b14 = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b14 = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b14 = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b14 = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b14 = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b14 = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b14 = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b14 = 9;
                }
                break;
        }
        String str2 = this.f125246b;
        switch (b14) {
            case 0:
                Integer numTryParse = Ints.tryParse(str2);
                if (numTryParse != null) {
                    bVar.f8556i = numTryParse;
                }
                break;
            case 1:
                Integer numTryParse2 = Ints.tryParse(str2);
                if (numTryParse2 != null) {
                    bVar.f8569v = numTryParse2;
                }
                break;
            case 2:
                Integer numTryParse3 = Ints.tryParse(str2);
                if (numTryParse3 != null) {
                    bVar.f8555h = numTryParse3;
                }
                break;
            case 3:
                bVar.f8550c = str2;
                break;
            case 4:
                bVar.f8570w = str2;
                break;
            case 5:
                bVar.f8548a = str2;
                break;
            case 6:
                bVar.f8552e = str2;
                break;
            case 7:
                Integer numTryParse4 = Ints.tryParse(str2);
                if (numTryParse4 != null) {
                    bVar.f8568u = numTryParse4;
                }
                break;
            case 8:
                bVar.f8551d = str2;
                break;
            case 9:
                bVar.f8549b = str2;
                break;
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
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f125245a.equals(bVar.f125245a) && this.f125246b.equals(bVar.f125246b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f125246b.hashCode() + g.j(527, 31, this.f125245a);
    }

    public final String toString() {
        return "VC: " + this.f125245a + "=" + this.f125246b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f125245a);
        parcel.writeString(this.f125246b);
    }

    public b(String str, String str2) {
        this.f125245a = Ascii.toUpperCase(str);
        this.f125246b = str2;
    }
}
