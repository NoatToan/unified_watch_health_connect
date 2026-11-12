package pb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import fa.z;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f136823c;

    public class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public l(Parcel parcel) {
        super(PrivFrame.ID);
        String string = parcel.readString();
        int i14 = z.f70071a;
        this.f136822b = string;
        this.f136823c = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            String str = lVar.f136822b;
            int i14 = z.f70071a;
            if (Objects.equals(this.f136822b, str) && Arrays.equals(this.f136823c, lVar.f136823c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f136822b;
        return Arrays.hashCode(this.f136823c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // pb.h
    public final String toString() {
        return this.f136812a + ": owner=" + this.f136822b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f136822b);
        parcel.writeByteArray(this.f136823c);
    }

    public l(String str, byte[] bArr) {
        super(PrivFrame.ID);
        this.f136822b = str;
        this.f136823c = bArr;
    }
}
