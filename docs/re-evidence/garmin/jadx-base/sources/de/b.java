package de;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
public class b extends VersionedParcel {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f59216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f59217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f59218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f59219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f59220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f59221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f59222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f59223k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new p1.a(), new p1.a(), new p1.a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final b a() {
        Parcel parcel = this.f59217e;
        int iDataPosition = parcel.dataPosition();
        int i14 = this.f59222j;
        if (i14 == this.f59218f) {
            i14 = this.f59219g;
        }
        return new b(parcel, iDataPosition, i14, j.o(this.f59220h, "  ", new StringBuilder()), this.f11265a, this.f11266b, this.f11267c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean e() {
        return this.f59217e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] f() {
        Parcel parcel = this.f59217e;
        int i14 = parcel.readInt();
        if (i14 < 0) {
            return null;
        }
        byte[] bArr = new byte[i14];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f59217e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean h(int i14) {
        while (true) {
            int i15 = this.f59222j;
            int i16 = this.f59223k;
            if (i15 >= this.f59219g) {
                return i16 == i14;
            }
            if (i16 == i14) {
                return true;
            }
            if (String.valueOf(i16).compareTo(String.valueOf(i14)) > 0) {
                return false;
            }
            int i17 = this.f59222j;
            Parcel parcel = this.f59217e;
            parcel.setDataPosition(i17);
            int i18 = parcel.readInt();
            this.f59223k = parcel.readInt();
            this.f59222j += i18;
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int i() {
        return this.f59217e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final <T extends Parcelable> T k() {
        return (T) this.f59217e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String l() {
        return this.f59217e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void n(int i14) {
        w();
        this.f59221i = i14;
        this.f59216d.put(i14, this.f59217e.dataPosition());
        r(0);
        r(i14);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void o(boolean z14) {
        this.f59217e.writeInt(z14 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void p(byte[] bArr) {
        Parcel parcel = this.f59217e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void q(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f59217e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void r(int i14) {
        this.f59217e.writeInt(i14);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void t(Parcelable parcelable) {
        this.f59217e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void u(String str) {
        this.f59217e.writeString(str);
    }

    public final void w() {
        int i14 = this.f59221i;
        if (i14 >= 0) {
            int i15 = this.f59216d.get(i14);
            Parcel parcel = this.f59217e;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i15);
            parcel.writeInt(iDataPosition - i15);
            parcel.setDataPosition(iDataPosition);
        }
    }

    private b(Parcel parcel, int i14, int i15, String str, p1.a<String, Method> aVar, p1.a<String, Method> aVar2, p1.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f59216d = new SparseIntArray();
        this.f59221i = -1;
        this.f59223k = -1;
        this.f59217e = parcel;
        this.f59218f = i14;
        this.f59219g = i15;
        this.f59222j = i14;
        this.f59220h = str;
    }
}
