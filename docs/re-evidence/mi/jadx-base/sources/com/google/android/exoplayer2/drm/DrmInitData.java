package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.g83;
import defpackage.rk1;
import defpackage.wlq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SchemeData[] f7886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7887b;
    public final String c;
    public final int d;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f7889b;
        public final String c;
        public final String d;
        public final byte[] e;

        public class a implements Parcelable.Creator<SchemeData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SchemeData[] newArray(int i) {
                return new SchemeData[i];
            }
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(SchemeData schemeData) {
            return d() && !schemeData.d() && e(schemeData.f7889b);
        }

        public SchemeData c(byte[] bArr) {
            return new SchemeData(this.f7889b, this.c, this.d, bArr);
        }

        public boolean d() {
            return this.e != null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean e(UUID uuid) {
            return g83.f18708a.equals(this.f7889b) || uuid.equals(this.f7889b);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return wlq.c(this.c, schemeData.c) && wlq.c(this.d, schemeData.d) && wlq.c(this.f7889b, schemeData.f7889b) && Arrays.equals(this.e, schemeData.e);
        }

        public int hashCode() {
            if (this.f7888a == 0) {
                int iHashCode = this.f7889b.hashCode() * 31;
                String str = this.c;
                this.f7888a = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31) + Arrays.hashCode(this.e);
            }
            return this.f7888a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f7889b.getMostSignificantBits());
            parcel.writeLong(this.f7889b.getLeastSignificantBits());
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeByteArray(this.e);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            this.f7889b = (UUID) rk1.e(uuid);
            this.c = str;
            this.d = (String) rk1.e(str2);
            this.e = bArr;
        }

        public SchemeData(Parcel parcel) {
            this.f7889b = new UUID(parcel.readLong(), parcel.readLong());
            this.c = parcel.readString();
            this.d = (String) wlq.j(parcel.readString());
            this.e = parcel.createByteArray();
        }
    }

    public class a implements Parcelable.Creator<DrmInitData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public static boolean c(ArrayList<SchemeData> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).f7889b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static DrmInitData e(DrmInitData drmInitData, DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.c;
            for (SchemeData schemeData : drmInitData.f7886a) {
                if (schemeData.d()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.c;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.f7886a) {
                if (schemeData2.d() && !c(arrayList, size, schemeData2.f7889b)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = g83.f18708a;
        if (uuid.equals(schemeData.f7889b)) {
            return uuid.equals(schemeData2.f7889b) ? 0 : 1;
        }
        return schemeData.f7889b.compareTo(schemeData2.f7889b);
    }

    public DrmInitData d(String str) {
        return wlq.c(this.c, str) ? this : new DrmInitData(str, false, this.f7886a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return wlq.c(this.c, drmInitData.c) && Arrays.equals(this.f7886a, drmInitData.f7886a);
    }

    public SchemeData f(int i) {
        return this.f7886a[i];
    }

    public DrmInitData g(DrmInitData drmInitData) {
        String str;
        String str2 = this.c;
        rk1.g(str2 == null || (str = drmInitData.c) == null || TextUtils.equals(str2, str));
        String str3 = this.c;
        if (str3 == null) {
            str3 = drmInitData.c;
        }
        return new DrmInitData(str3, (SchemeData[]) wlq.z0(this.f7886a, drmInitData.f7886a));
    }

    public int hashCode() {
        if (this.f7887b == 0) {
            String str = this.c;
            this.f7887b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f7886a);
        }
        return this.f7887b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.f7886a, 0);
    }

    public DrmInitData(String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.c = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f7886a = schemeDataArr;
        this.d = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(Parcel parcel) {
        this.c = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) wlq.j((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f7886a = schemeDataArr;
        this.d = schemeDataArr.length;
    }
}
