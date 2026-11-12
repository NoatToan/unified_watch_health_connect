package yl2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import bd0.c0;
import bm2.f;
import java.util.Objects;
import lm2.h;
import lm2.i;
import qm2.l;

/* JADX INFO: loaded from: classes11.dex */
public class d implements i.a, Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f197839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f197840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bm2.a f197841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bm2.d f197842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f197843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f197844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f197845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f197846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f197847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte[] f197848j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f197849k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f197850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f197851m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f197852n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f197853o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f197854p;

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
        Boolean boolValueOf = null;
        this.f197843e = null;
        this.f197844f = null;
        this.f197845g = null;
        l lVar = (l) parcel.readParcelable(l.class.getClassLoader());
        Objects.requireNonNull(lVar);
        this.f197839a = lVar;
        this.f197841c = (bm2.a) parcel.readParcelable(bm2.a.class.getClassLoader());
        this.f197842d = (bm2.d) parcel.readParcelable(bm2.d.class.getClassLoader());
        this.f197843e = parcel.createByteArray();
        this.f197844f = parcel.createByteArray();
        this.f197845g = parcel.createByteArray();
        this.f197846h = parcel.readByte() != 0;
        byte b14 = parcel.readByte();
        if (b14 != 0) {
            boolValueOf = Boolean.valueOf(b14 == 1);
        }
        this.f197847i = boolValueOf;
        this.f197848j = parcel.createByteArray();
        this.f197849k = parcel.readByte() != 0;
        this.f197850l = parcel.readByte() != 0;
        this.f197851m = parcel.readByte() != 0;
        this.f197852n = parcel.readLong();
        this.f197853o = parcel.readByte() != 0;
        this.f197854p = parcel.readByte() != 0;
    }

    @Override // lm2.i.a
    /* JADX INFO: renamed from: b */
    public final byte[] getF197838b() {
        return this.f197848j;
    }

    @Override // lm2.i.a
    /* JADX INFO: renamed from: d */
    public final long getF197655a() {
        bm2.d dVar = this.f197842d;
        if (dVar != null && dVar.getF172494b() > 0) {
            return this.f197842d.getF172494b();
        }
        f fVar = this.f197840b;
        if (fVar != null && fVar.getDeviceUnitId() > 0) {
            return this.f197840b.getDeviceUnitId();
        }
        bm2.a aVar = this.f197841c;
        if (aVar == null) {
            return -1L;
        }
        long j8 = aVar.f18891f;
        if (j8 > 0) {
            return j8;
        }
        return -1L;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // lm2.i.a
    public final String f() {
        bm2.d dVar = this.f197842d;
        if (dVar != null && dVar.getF172495c() > 0) {
            return String.valueOf(this.f197842d.getF172495c());
        }
        f fVar = this.f197840b;
        if (fVar == null) {
            return null;
        }
        String partNumberPartial = fVar.getPartNumberPartial();
        if (TextUtils.isEmpty(partNumberPartial)) {
            return null;
        }
        return partNumberPartial;
    }

    public final void g(boolean z14) {
        this.f197847i = Boolean.valueOf(z14);
    }

    @Override // lm2.i.a
    /* JADX INFO: renamed from: getDeviceInfo */
    public final bm2.d getF197837a() {
        return this.f197842d;
    }

    @Override // lm2.i.a
    /* JADX INFO: renamed from: getMacAddress */
    public final String getF197656b() {
        bm2.a aVar = this.f197841c;
        if (aVar != null) {
            return aVar.f18886a;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        int i15;
        parcel.writeParcelable(this.f197839a, i14);
        parcel.writeParcelable(this.f197841c, i14);
        parcel.writeParcelable(this.f197842d, i14);
        parcel.writeByteArray(this.f197843e);
        parcel.writeByteArray(this.f197844f);
        parcel.writeByteArray(this.f197845g);
        parcel.writeByte(this.f197846h ? (byte) 1 : (byte) 0);
        Boolean bool = this.f197847i;
        if (bool == null) {
            i15 = 0;
        } else {
            i15 = bool.booleanValue() ? 1 : 2;
        }
        parcel.writeByte((byte) i15);
        parcel.writeByteArray(this.f197848j);
        parcel.writeByte(this.f197849k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f197850l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f197851m ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f197852n);
        parcel.writeByte(this.f197853o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f197854p ? (byte) 1 : (byte) 0);
    }

    public d(bm2.a aVar, f fVar) {
        this(fVar, ((c0) h.d()).b(aVar.f18888c));
        this.f197841c = aVar;
    }

    public d(bm2.a aVar, l lVar) {
        this((f) null, lVar == null ? ((c0) h.d()).b(aVar.f18888c) : lVar);
        this.f197841c = aVar;
    }

    public d(f fVar) {
        this(fVar, ((c0) h.d()).b(fVar.getPartNumberPartial()));
    }

    public d(f fVar, l lVar) {
        this.f197843e = null;
        this.f197844f = null;
        this.f197845g = null;
        this.f197839a = lVar;
        this.f197840b = fVar;
        this.f197853o = true;
    }

    public d(bm2.a aVar) {
        this(aVar, ((c0) h.d()).b(aVar.f18888c));
    }
}
