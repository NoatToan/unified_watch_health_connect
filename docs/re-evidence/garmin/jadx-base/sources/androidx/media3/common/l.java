package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b[] f8338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8341d;

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
        this.f8340c = parcel.readString();
        b[] bVarArr = (b[]) parcel.createTypedArray(b.CREATOR);
        int i14 = fa.z.f70071a;
        this.f8338a = bVarArr;
        this.f8341d = bVarArr.length;
    }

    public final l b(String str) {
        int i14 = fa.z.f70071a;
        return Objects.equals(this.f8340c, str) ? this : new l(str, false, this.f8338a);
    }

    @Override // java.util.Comparator
    public final int compare(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        UUID uuid = h.f8296a;
        if (uuid.equals(bVar3.f8343b)) {
            return uuid.equals(bVar4.f8343b) ? 0 : 1;
        }
        return bVar3.f8343b.compareTo(bVar4.f8343b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            String str = lVar.f8340c;
            int i14 = fa.z.f70071a;
            if (Objects.equals(this.f8340c, str) && Arrays.equals(this.f8338a, lVar.f8338a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f8339b == 0) {
            String str = this.f8340c;
            this.f8339b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f8338a);
        }
        return this.f8339b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeString(this.f8340c);
        parcel.writeTypedArray(this.f8338a, 0);
    }

    public l(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public l(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public l(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    private l(String str, boolean z14, b... bVarArr) {
        this.f8340c = str;
        bVarArr = z14 ? (b[]) bVarArr.clone() : bVarArr;
        this.f8338a = bVarArr;
        this.f8341d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public l(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f8343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f8344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f8345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f8346e;

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
            this.f8343b = new UUID(parcel.readLong(), parcel.readLong());
            this.f8344c = parcel.readString();
            String string = parcel.readString();
            int i14 = fa.z.f70071a;
            this.f8345d = string;
            this.f8346e = parcel.createByteArray();
        }

        public final boolean b(UUID uuid) {
            UUID uuid2 = h.f8296a;
            UUID uuid3 = this.f8343b;
            return uuid2.equals(uuid3) || uuid.equals(uuid3);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            String str = bVar.f8344c;
            int i14 = fa.z.f70071a;
            return Objects.equals(this.f8344c, str) && Objects.equals(this.f8345d, bVar.f8345d) && Objects.equals(this.f8343b, bVar.f8343b) && Arrays.equals(this.f8346e, bVar.f8346e);
        }

        public final int hashCode() {
            if (this.f8342a == 0) {
                int iHashCode = this.f8343b.hashCode() * 31;
                String str = this.f8344c;
                this.f8342a = Arrays.hashCode(this.f8346e) + wr.g.j((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f8345d);
            }
            return this.f8342a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i14) {
            UUID uuid = this.f8343b;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.f8344c);
            parcel.writeString(this.f8345d);
            parcel.writeByteArray(this.f8346e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f8343b = uuid;
            this.f8344c = str;
            str2.getClass();
            this.f8345d = x.n(str2);
            this.f8346e = bArr;
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }
    }
}
