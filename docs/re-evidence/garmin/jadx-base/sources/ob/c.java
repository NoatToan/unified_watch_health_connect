package ob;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.v;
import androidx.media3.common.w;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c implements w.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f131097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131099c;

    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f131097a = bArrCreateByteArray;
        this.f131098b = parcel.readString();
        this.f131099c = parcel.readString();
    }

    @Override // androidx.media3.common.w.b
    public final void R3(v.b bVar) {
        String str = this.f131098b;
        if (str != null) {
            bVar.f8548a = str;
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
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f131097a, ((c) obj).f131097a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f131097a);
    }

    public final String toString() {
        return j.q(p6.b.i("ICY: title=\"", this.f131098b, "\", url=\"", this.f131099c, "\", rawMetadata.length=\""), this.f131097a.length, "\"");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeByteArray(this.f131097a);
        parcel.writeString(this.f131098b);
        parcel.writeString(this.f131099c);
    }

    public c(byte[] bArr, String str, String str2) {
        this.f131097a = bArr;
        this.f131098b = str;
        this.f131099c = str2;
    }
}
