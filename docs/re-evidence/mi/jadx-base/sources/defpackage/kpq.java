package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class kpq extends VersionedParcel {
    public final SparseIntArray d;
    public final Parcel e;
    public final int f;
    public final int g;
    public final String h;
    public int i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24147k;

    public kpq(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.e.writeInt(-1);
        } else {
            this.e.writeInt(bArr.length);
            this.e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E(int i) {
        this.e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void G(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void I(String str) {
        this.e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.d.get(i);
            int iDataPosition = this.e.dataPosition();
            this.e.setDataPosition(i2);
            this.e.writeInt(iDataPosition - i2);
            this.e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public VersionedParcel b() {
        Parcel parcel = this.e;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        return new kpq(parcel, iDataPosition, i, this.h + "  ", this.f3095a, this.f3096b, this.c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean g() {
        return this.e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] i() {
        int i = this.e.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean m(int i) {
        while (this.j < this.g) {
            int i2 = this.f24147k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            int i3 = this.e.readInt();
            this.f24147k = this.e.readInt();
            this.j += i3;
        }
        return this.f24147k == i;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int o() {
        return this.e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T q() {
        return (T) this.e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String s() {
        return this.e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void w(int i) {
        a();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        E(0);
        E(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    public kpq(Parcel parcel, int i, int i2, String str, ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.f24147k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
