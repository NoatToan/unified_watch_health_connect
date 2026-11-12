package pb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import fa.z;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f136796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f136797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f136798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h[] f136799f;

    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(Parcel parcel) {
        super(ChapterTocFrame.ID);
        String string = parcel.readString();
        int i14 = z.f70071a;
        this.f136795b = string;
        this.f136796c = parcel.readByte() != 0;
        this.f136797d = parcel.readByte() != 0;
        this.f136798e = parcel.createStringArray();
        int i15 = parcel.readInt();
        this.f136799f = new h[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            this.f136799f[i16] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f136796c == dVar.f136796c && this.f136797d == dVar.f136797d) {
                String str = dVar.f136795b;
                int i14 = z.f70071a;
                if (Objects.equals(this.f136795b, str) && Arrays.equals(this.f136798e, dVar.f136798e) && Arrays.equals(this.f136799f, dVar.f136799f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i14 = (((527 + (this.f136796c ? 1 : 0)) * 31) + (this.f136797d ? 1 : 0)) * 31;
        String str = this.f136795b;
        return i14 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f136795b);
        parcel.writeByte(this.f136796c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f136797d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f136798e);
        h[] hVarArr = this.f136799f;
        parcel.writeInt(hVarArr.length);
        for (h hVar : hVarArr) {
            parcel.writeParcelable(hVar, 0);
        }
    }

    public d(String str, boolean z14, boolean z15, String[] strArr, h[] hVarArr) {
        super(ChapterTocFrame.ID);
        this.f136795b = str;
        this.f136796c = z14;
        this.f136797d = z15;
        this.f136798e = strArr;
        this.f136799f = hVarArr;
    }
}
