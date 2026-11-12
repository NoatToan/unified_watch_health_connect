package wj;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f185767a;

    public static class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            return new j(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    private j(Parcel parcel) {
        this.f185767a = new b(null);
        this.f185767a = (b) parcel.readBundle(b.class.getClassLoader()).getParcelable("com.dsi.ant.channel.networkkey.bundledata");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && (obj instanceof j) && Arrays.equals((byte[]) ((j) obj).f185767a.f185768a.clone(), (byte[]) this.f185767a.f185768a.clone());
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f185767a.f185768a);
    }

    public final String toString() {
        return "Network Key: ".concat(ak.k.b(this.f185767a.f185768a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.dsi.ant.channel.networkkey.bundledata", this.f185767a);
        parcel.writeBundle(bundle);
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f185768a;

        public static class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                parcel.readInt();
                b bVar = new b(null);
                bVar.f185768a = parcel.createByteArray();
                return bVar;
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i14) {
                return new b[i14];
            }
        }

        private b() {
            this.f185768a = null;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.writeInt(1);
            parcel.writeByteArray(this.f185768a);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public j(byte[] bArr) {
        b bVar = new b(null);
        this.f185767a = bVar;
        if (bArr != null) {
            bVar.f185768a = (byte[]) bArr.clone();
        } else {
            vb.h.s("Received null network key.");
            throw null;
        }
    }

    public /* synthetic */ j(Parcel parcel, a aVar) {
        this(parcel);
    }
}
