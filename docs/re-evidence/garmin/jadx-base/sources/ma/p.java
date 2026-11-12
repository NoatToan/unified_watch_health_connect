package ma;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.media3.common.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p implements w.b {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<b> f117594c;

    public class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i14) {
            return new p[i14];
        }
    }

    public p(Parcel parcel) {
        this.f117592a = parcel.readString();
        this.f117593b = parcel.readString();
        int i14 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i14);
        for (int i15 = 0; i15 < i14; i15++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f117594c = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (TextUtils.equals(this.f117592a, pVar.f117592a) && TextUtils.equals(this.f117593b, pVar.f117593b) && this.f117594c.equals(pVar.f117594c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f117592a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f117593b;
        return this.f117594c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strO;
        String str = this.f117592a;
        if (str != null) {
            strO = am.j.o(this.f117593b, "]", hb.a.l(" [", str, ", "));
        } else {
            strO = "";
        }
        return "HlsTrackMetadataEntry".concat(strO);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f117592a);
        parcel.writeString(this.f117593b);
        List<b> list = this.f117594c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i15 = 0; i15 < size; i15++) {
            parcel.writeParcelable(list.get(i15), 0);
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f117595a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f117596b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f117597c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f117598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f117599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f117600f;

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
            this.f117595a = parcel.readInt();
            this.f117596b = parcel.readInt();
            this.f117597c = parcel.readString();
            this.f117598d = parcel.readString();
            this.f117599e = parcel.readString();
            this.f117600f = parcel.readString();
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
                if (this.f117595a == bVar.f117595a && this.f117596b == bVar.f117596b && TextUtils.equals(this.f117597c, bVar.f117597c) && TextUtils.equals(this.f117598d, bVar.f117598d) && TextUtils.equals(this.f117599e, bVar.f117599e) && TextUtils.equals(this.f117600f, bVar.f117600f)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i14 = ((this.f117595a * 31) + this.f117596b) * 31;
            String str = this.f117597c;
            int iHashCode = (i14 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f117598d;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f117599e;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f117600f;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            parcel.writeInt(this.f117595a);
            parcel.writeInt(this.f117596b);
            parcel.writeString(this.f117597c);
            parcel.writeString(this.f117598d);
            parcel.writeString(this.f117599e);
            parcel.writeString(this.f117600f);
        }

        public b(int i14, int i15, String str, String str2, String str3, String str4) {
            this.f117595a = i14;
            this.f117596b = i15;
            this.f117597c = str;
            this.f117598d = str2;
            this.f117599e = str3;
            this.f117600f = str4;
        }
    }

    public p(String str, String str2, List<b> list) {
        this.f117592a = str;
        this.f117593b = str2;
        this.f117594c = Collections.unmodifiableList(new ArrayList(list));
    }
}
