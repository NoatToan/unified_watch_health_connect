package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import defpackage.ayf;
import defpackage.obq;
import defpackage.oh8;
import defpackage.rk1;
import defpackage.wlq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new a();
    public static final int NO_VALUE = -1;
    public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final Class<? extends oh8> E;
    public int F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7816b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final Metadata j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f7817k;
    public final String l;
    public final int m;
    public final List<byte[]> n;
    public final DrmInitData o;
    public final long p;
    public final int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f7818r;
    public final float s;
    public final int t;
    public final float u;
    public final byte[] v;
    public final int w;
    public final ColorInfo x;
    public final int y;
    public final int z;

    public class a implements Parcelable.Creator<Format> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Format[] newArray(int i) {
            return new Format[i];
        }
    }

    public static final class b {
        public int A;
        public int B;
        public int C;
        public Class<? extends oh8> D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f7819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f7820b;
        public String c;
        public int d;
        public int e;
        public int f;
        public int g;
        public String h;
        public Metadata i;
        public String j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f7821k;
        public int l;
        public List<byte[]> m;
        public DrmInitData n;
        public long o;
        public int p;
        public int q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f7822r;
        public int s;
        public float t;
        public byte[] u;
        public int v;
        public ColorInfo w;
        public int x;
        public int y;
        public int z;

        public /* synthetic */ b(Format format, a aVar) {
            this(format);
        }

        public Format E() {
            return new Format(this, null);
        }

        public b F(int i) {
            this.C = i;
            return this;
        }

        public b G(int i) {
            this.f = i;
            return this;
        }

        public b H(int i) {
            this.x = i;
            return this;
        }

        public b I(String str) {
            this.h = str;
            return this;
        }

        public b J(ColorInfo colorInfo) {
            this.w = colorInfo;
            return this;
        }

        public b K(String str) {
            this.j = str;
            return this;
        }

        public b L(DrmInitData drmInitData) {
            this.n = drmInitData;
            return this;
        }

        public b M(int i) {
            this.A = i;
            return this;
        }

        public b N(int i) {
            this.B = i;
            return this;
        }

        public b O(Class<? extends oh8> cls) {
            this.D = cls;
            return this;
        }

        public b P(float f) {
            this.f7822r = f;
            return this;
        }

        public b Q(int i) {
            this.q = i;
            return this;
        }

        public b R(int i) {
            this.f7819a = Integer.toString(i);
            return this;
        }

        public b S(String str) {
            this.f7819a = str;
            return this;
        }

        public b T(List<byte[]> list) {
            this.m = list;
            return this;
        }

        public b U(String str) {
            this.f7820b = str;
            return this;
        }

        public b V(String str) {
            this.c = str;
            return this;
        }

        public b W(int i) {
            this.l = i;
            return this;
        }

        public b X(Metadata metadata) {
            this.i = metadata;
            return this;
        }

        public b Y(int i) {
            this.z = i;
            return this;
        }

        public b Z(int i) {
            this.g = i;
            return this;
        }

        public b a0(float f) {
            this.t = f;
            return this;
        }

        public b b0(byte[] bArr) {
            this.u = bArr;
            return this;
        }

        public b c0(int i) {
            this.e = i;
            return this;
        }

        public b d0(int i) {
            this.s = i;
            return this;
        }

        public b e0(String str) {
            this.f7821k = str;
            return this;
        }

        public b f0(int i) {
            this.y = i;
            return this;
        }

        public b g0(int i) {
            this.d = i;
            return this;
        }

        public b h0(int i) {
            this.v = i;
            return this;
        }

        public b i0(long j) {
            this.o = j;
            return this;
        }

        public b j0(int i) {
            this.p = i;
            return this;
        }

        public b() {
            this.f = -1;
            this.g = -1;
            this.l = -1;
            this.o = Long.MAX_VALUE;
            this.p = -1;
            this.q = -1;
            this.f7822r = -1.0f;
            this.t = 1.0f;
            this.v = -1;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.C = -1;
        }

        public b(Format format) {
            this.f7819a = format.f7815a;
            this.f7820b = format.f7816b;
            this.c = format.c;
            this.d = format.d;
            this.e = format.e;
            this.f = format.f;
            this.g = format.g;
            this.h = format.i;
            this.i = format.j;
            this.j = format.f7817k;
            this.f7821k = format.l;
            this.l = format.m;
            this.m = format.n;
            this.n = format.o;
            this.o = format.p;
            this.p = format.q;
            this.q = format.f7818r;
            this.f7822r = format.s;
            this.s = format.t;
            this.t = format.u;
            this.u = format.v;
            this.v = format.w;
            this.w = format.x;
            this.x = format.y;
            this.y = format.z;
            this.z = format.A;
            this.A = format.B;
            this.B = format.C;
            this.C = format.D;
            this.D = format.E;
        }
    }

    public /* synthetic */ Format(b bVar, a aVar) {
        this(bVar);
    }

    @Deprecated
    public static Format d(String str, String str2, int i, String str3) {
        return new b().S(str).V(str3).g0(i).e0(str2).E();
    }

    public b a() {
        return new b(this, null);
    }

    public Format c(Class<? extends oh8> cls) {
        return a().O(cls).E();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        int i;
        int i2 = this.q;
        if (i2 == -1 || (i = this.f7818r) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i2 = this.F;
        if (i2 == 0 || (i = format.F) == 0 || i2 == i) {
            return this.d == format.d && this.e == format.e && this.f == format.f && this.g == format.g && this.m == format.m && this.p == format.p && this.q == format.q && this.f7818r == format.f7818r && this.t == format.t && this.w == format.w && this.y == format.y && this.z == format.z && this.A == format.A && this.B == format.B && this.C == format.C && this.D == format.D && Float.compare(this.s, format.s) == 0 && Float.compare(this.u, format.u) == 0 && wlq.c(this.E, format.E) && wlq.c(this.f7815a, format.f7815a) && wlq.c(this.f7816b, format.f7816b) && wlq.c(this.i, format.i) && wlq.c(this.f7817k, format.f7817k) && wlq.c(this.l, format.l) && wlq.c(this.c, format.c) && Arrays.equals(this.v, format.v) && wlq.c(this.j, format.j) && wlq.c(this.x, format.x) && wlq.c(this.o, format.o) && f(format);
        }
        return false;
    }

    public boolean f(Format format) {
        if (this.n.size() != format.n.size()) {
            return false;
        }
        for (int i = 0; i < this.n.size(); i++) {
            if (!Arrays.equals(this.n.get(i), format.n.get(i))) {
                return false;
            }
        }
        return true;
    }

    public Format g(Format format) {
        String str;
        if (this == format) {
            return this;
        }
        int iL = ayf.l(this.l);
        String str2 = format.f7815a;
        String str3 = format.f7816b;
        if (str3 == null) {
            str3 = this.f7816b;
        }
        String str4 = this.c;
        if ((iL == 3 || iL == 1) && (str = format.c) != null) {
            str4 = str;
        }
        int i = this.f;
        if (i == -1) {
            i = format.f;
        }
        int i2 = this.g;
        if (i2 == -1) {
            i2 = format.g;
        }
        String str5 = this.i;
        if (str5 == null) {
            String strK = wlq.K(format.i, iL);
            if (wlq.O0(strK).length == 1) {
                str5 = strK;
            }
        }
        Metadata metadata = this.j;
        Metadata metadataC = metadata == null ? format.j : metadata.c(format.j);
        float f = this.s;
        if (f == -1.0f && iL == 2) {
            f = format.s;
        }
        return a().S(str2).U(str3).V(str4).g0(this.d | format.d).c0(this.e | format.e).G(i).Z(i2).I(str5).X(metadataC).L(DrmInitData.e(format.o, this.o)).P(f).E();
    }

    public int hashCode() {
        if (this.F == 0) {
            String str = this.f7815a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f7816b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31;
            String str4 = this.i;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.j;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.f7817k;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.l;
            int iHashCode7 = (((((((((((((((((((((((((((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.m) * 31) + ((int) this.p)) * 31) + this.q) * 31) + this.f7818r) * 31) + Float.floatToIntBits(this.s)) * 31) + this.t) * 31) + Float.floatToIntBits(this.u)) * 31) + this.w) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31;
            Class<? extends oh8> cls = this.E;
            this.F = iHashCode7 + (cls != null ? cls.hashCode() : 0);
        }
        return this.F;
    }

    public String toString() {
        String str = this.f7815a;
        String str2 = this.f7816b;
        String str3 = this.f7817k;
        String str4 = this.l;
        String str5 = this.i;
        int i = this.h;
        String str6 = this.c;
        int i2 = this.q;
        int i3 = this.f7818r;
        float f = this.s;
        int i4 = this.y;
        int i5 = this.z;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7815a);
        parcel.writeString(this.f7816b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeString(this.i);
        parcel.writeParcelable(this.j, 0);
        parcel.writeString(this.f7817k);
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
        int size = this.n.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.n.get(i2));
        }
        parcel.writeParcelable(this.o, 0);
        parcel.writeLong(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.f7818r);
        parcel.writeFloat(this.s);
        parcel.writeInt(this.t);
        parcel.writeFloat(this.u);
        wlq.X0(parcel, this.v != null);
        byte[] bArr = this.v;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.w);
        parcel.writeParcelable(this.x, i);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
        parcel.writeInt(this.D);
    }

    public Format(b bVar) {
        this.f7815a = bVar.f7819a;
        this.f7816b = bVar.f7820b;
        this.c = wlq.x0(bVar.c);
        this.d = bVar.d;
        this.e = bVar.e;
        int i = bVar.f;
        this.f = i;
        int i2 = bVar.g;
        this.g = i2;
        this.h = i2 != -1 ? i2 : i;
        this.i = bVar.h;
        this.j = bVar.i;
        this.f7817k = bVar.j;
        this.l = bVar.f7821k;
        this.m = bVar.l;
        this.n = bVar.m == null ? Collections.emptyList() : bVar.m;
        DrmInitData drmInitData = bVar.n;
        this.o = drmInitData;
        this.p = bVar.o;
        this.q = bVar.p;
        this.f7818r = bVar.q;
        this.s = bVar.f7822r;
        this.t = bVar.s == -1 ? 0 : bVar.s;
        this.u = bVar.t == -1.0f ? 1.0f : bVar.t;
        this.v = bVar.u;
        this.w = bVar.v;
        this.x = bVar.w;
        this.y = bVar.x;
        this.z = bVar.y;
        this.A = bVar.z;
        this.B = bVar.A == -1 ? 0 : bVar.A;
        this.C = bVar.B != -1 ? bVar.B : 0;
        this.D = bVar.C;
        if (bVar.D != null || drmInitData == null) {
            this.E = bVar.D;
        } else {
            this.E = obq.class;
        }
    }

    public Format(Parcel parcel) {
        this.f7815a = parcel.readString();
        this.f7816b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        int i = parcel.readInt();
        this.f = i;
        int i2 = parcel.readInt();
        this.g = i2;
        this.h = i2 != -1 ? i2 : i;
        this.i = parcel.readString();
        this.j = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.f7817k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readInt();
        int i3 = parcel.readInt();
        this.n = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            this.n.add((byte[]) rk1.e(parcel.createByteArray()));
        }
        DrmInitData drmInitData = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.o = drmInitData;
        this.p = parcel.readLong();
        this.q = parcel.readInt();
        this.f7818r = parcel.readInt();
        this.s = parcel.readFloat();
        this.t = parcel.readInt();
        this.u = parcel.readFloat();
        this.v = wlq.F0(parcel) ? parcel.createByteArray() : null;
        this.w = parcel.readInt();
        this.x = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.y = parcel.readInt();
        this.z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readInt();
        this.E = drmInitData != null ? obq.class : null;
    }
}
