package pb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import fa.z;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f136790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f136791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f136792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f136793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h[] f136794g;

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
        super(ChapterFrame.ID);
        String string = parcel.readString();
        int i14 = z.f70071a;
        this.f136789b = string;
        this.f136790c = parcel.readInt();
        this.f136791d = parcel.readInt();
        this.f136792e = parcel.readLong();
        this.f136793f = parcel.readLong();
        int i15 = parcel.readInt();
        this.f136794g = new h[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            this.f136794g[i16] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }

    @Override // pb.h, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f136790c == cVar.f136790c && this.f136791d == cVar.f136791d && this.f136792e == cVar.f136792e && this.f136793f == cVar.f136793f) {
                String str = cVar.f136789b;
                int i14 = z.f70071a;
                if (Objects.equals(this.f136789b, str) && Arrays.equals(this.f136794g, cVar.f136794g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i14 = (((((((527 + this.f136790c) * 31) + this.f136791d) * 31) + ((int) this.f136792e)) * 31) + ((int) this.f136793f)) * 31;
        String str = this.f136789b;
        return i14 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f136789b);
        parcel.writeInt(this.f136790c);
        parcel.writeInt(this.f136791d);
        parcel.writeLong(this.f136792e);
        parcel.writeLong(this.f136793f);
        h[] hVarArr = this.f136794g;
        parcel.writeInt(hVarArr.length);
        for (h hVar : hVarArr) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    public c(String str, int i14, int i15, long j8, long j14, h[] hVarArr) {
        super(ChapterFrame.ID);
        this.f136789b = str;
        this.f136790c = i14;
        this.f136791d = i15;
        this.f136792e = j8;
        this.f136793f = j14;
        this.f136794g = hVarArr;
    }
}
