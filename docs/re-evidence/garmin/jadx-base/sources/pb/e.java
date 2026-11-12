package pb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import fa.z;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f136802d;

    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(Parcel parcel) {
        super(CommentFrame.ID);
        String string = parcel.readString();
        int i14 = z.f70071a;
        this.f136800b = string;
        this.f136801c = parcel.readString();
        this.f136802d = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            String str = eVar.f136801c;
            int i14 = z.f70071a;
            if (Objects.equals(this.f136801c, str) && Objects.equals(this.f136800b, eVar.f136800b) && Objects.equals(this.f136802d, eVar.f136802d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f136800b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f136801c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f136802d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // pb.h
    public final String toString() {
        return this.f136812a + ": language=" + this.f136800b + ", description=" + this.f136801c + ", text=" + this.f136802d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f136812a);
        parcel.writeString(this.f136800b);
        parcel.writeString(this.f136802d);
    }

    public e(String str, String str2, String str3) {
        super(CommentFrame.ID);
        this.f136800b = str;
        this.f136801c = str2;
        this.f136802d = str3;
    }
}
