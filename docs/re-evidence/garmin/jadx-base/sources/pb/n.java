package pb;

import android.os.Parcel;
import android.os.Parcelable;
import fa.z;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class n extends h {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136827c;

    public class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n(Parcel parcel) {
        String string = parcel.readString();
        int i14 = z.f70071a;
        super(string);
        this.f136826b = parcel.readString();
        this.f136827c = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (this.f136812a.equals(nVar.f136812a)) {
                String str = nVar.f136826b;
                int i14 = z.f70071a;
                if (Objects.equals(this.f136826b, str) && Objects.equals(this.f136827c, nVar.f136827c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ = wr.g.j(527, 31, this.f136812a);
        String str = this.f136826b;
        int iHashCode = (iJ + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f136827c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // pb.h
    public final String toString() {
        return this.f136812a + ": url=" + this.f136827c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f136812a);
        parcel.writeString(this.f136826b);
        parcel.writeString(this.f136827c);
    }

    public n(String str, String str2, String str3) {
        super(str);
        this.f136826b = str2;
        this.f136827c = str3;
    }
}
