package no.nordicsemi.android.support.v18.scanner;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import defpackage.k4h;
import defpackage.ydl;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class ScanFilter implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f28168b;
    public final ParcelUuid c;
    public final ParcelUuid d;
    public final ParcelUuid e;
    public final byte[] f;
    public final byte[] g;
    public final int h;
    public final byte[] i;
    public final byte[] j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ScanFilter f28166k = new b().a();
    public static final Parcelable.Creator<ScanFilter> CREATOR = new a();

    public class a implements Parcelable.Creator<ScanFilter> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScanFilter createFromParcel(Parcel parcel) {
            b bVar = new b();
            if (parcel.readInt() == 1) {
                bVar.c(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                bVar.b(parcel.readString());
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                bVar.h(parcelUuid);
                if (parcel.readInt() == 1) {
                    bVar.i(parcelUuid, (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader()));
                }
            }
            if (parcel.readInt() == 1) {
                ParcelUuid parcelUuid2 = (ParcelUuid) parcel.readParcelable(ParcelUuid.class.getClassLoader());
                if (parcel.readInt() == 1) {
                    byte[] bArr = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr);
                    if (parcel.readInt() == 0) {
                        bVar.f(parcelUuid2, bArr);
                    } else {
                        byte[] bArr2 = new byte[parcel.readInt()];
                        parcel.readByteArray(bArr2);
                        bVar.g(parcelUuid2, bArr, bArr2);
                    }
                }
            }
            int i = parcel.readInt();
            if (parcel.readInt() == 1) {
                byte[] bArr3 = new byte[parcel.readInt()];
                parcel.readByteArray(bArr3);
                if (parcel.readInt() == 0) {
                    bVar.d(i, bArr3);
                } else {
                    byte[] bArr4 = new byte[parcel.readInt()];
                    parcel.readByteArray(bArr4);
                    bVar.e(i, bArr3, bArr4);
                }
            }
            return bVar.a();
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ScanFilter[] newArray(int i) {
            return new ScanFilter[i];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f28169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f28170b;
        public ParcelUuid c;
        public ParcelUuid d;
        public ParcelUuid e;
        public byte[] f;
        public byte[] g;
        public int h = -1;
        public byte[] i;
        public byte[] j;

        public ScanFilter a() {
            return new ScanFilter(this.f28169a, this.f28170b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null);
        }

        public b b(String str) {
            if (str == null || BluetoothAdapter.checkBluetoothAddress(str)) {
                this.f28170b = str;
                return this;
            }
            throw new IllegalArgumentException("invalid device address " + str);
        }

        public b c(String str) {
            this.f28169a = str;
            return this;
        }

        public b d(int i, byte[] bArr) {
            if (bArr != null && i < 0) {
                throw new IllegalArgumentException("invalid manufacture id");
            }
            this.h = i;
            this.i = bArr;
            this.j = null;
            return this;
        }

        public b e(int i, byte[] bArr, byte[] bArr2) {
            if (bArr != null && i < 0) {
                throw new IllegalArgumentException("invalid manufacture id");
            }
            if (bArr2 != null) {
                if (bArr == null) {
                    throw new IllegalArgumentException("manufacturerData is null while manufacturerDataMask is not null");
                }
                if (bArr.length != bArr2.length) {
                    throw new IllegalArgumentException("size mismatch for manufacturerData and manufacturerDataMask");
                }
            }
            this.h = i;
            this.i = bArr;
            this.j = bArr2;
            return this;
        }

        public b f(ParcelUuid parcelUuid, byte[] bArr) {
            if (parcelUuid == null) {
                throw new IllegalArgumentException("serviceDataUuid is null!");
            }
            this.e = parcelUuid;
            this.f = bArr;
            this.g = null;
            return this;
        }

        public b g(ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
            if (parcelUuid == null) {
                throw new IllegalArgumentException("serviceDataUuid is null");
            }
            if (bArr2 != null) {
                if (bArr == null) {
                    throw new IllegalArgumentException("serviceData is null while serviceDataMask is not null");
                }
                if (bArr.length != bArr2.length) {
                    throw new IllegalArgumentException("size mismatch for service data and service data mask");
                }
            }
            this.e = parcelUuid;
            this.f = bArr;
            this.g = bArr2;
            return this;
        }

        public b h(ParcelUuid parcelUuid) {
            this.c = parcelUuid;
            this.d = null;
            return this;
        }

        public b i(ParcelUuid parcelUuid, ParcelUuid parcelUuid2) {
            if (parcelUuid2 != null && parcelUuid == null) {
                throw new IllegalArgumentException("uuid is null while uuidMask is not null!");
            }
            this.c = parcelUuid;
            this.d = parcelUuid2;
            return this;
        }
    }

    public /* synthetic */ ScanFilter(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4, a aVar) {
        this(str, str2, parcelUuid, parcelUuid2, parcelUuid3, bArr, bArr2, i, bArr3, bArr4);
    }

    public static boolean o(UUID uuid, UUID uuid2, UUID uuid3) {
        if (uuid2 == null) {
            return uuid.equals(uuid3);
        }
        if ((uuid.getLeastSignificantBits() & uuid2.getLeastSignificantBits()) != (uuid3.getLeastSignificantBits() & uuid2.getLeastSignificantBits())) {
            return false;
        }
        return (uuid.getMostSignificantBits() & uuid2.getMostSignificantBits()) == (uuid2.getMostSignificantBits() & uuid3.getMostSignificantBits());
    }

    public static boolean q(ParcelUuid parcelUuid, ParcelUuid parcelUuid2, List<ParcelUuid> list) {
        if (parcelUuid == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        Iterator<ParcelUuid> it = list.iterator();
        while (it.hasNext()) {
            if (o(parcelUuid.getUuid(), parcelUuid2 == null ? null : parcelUuid2.getUuid(), it.next().getUuid())) {
                return true;
            }
        }
        return false;
    }

    public String a() {
        return this.f28168b;
    }

    public String c() {
        return this.f28167a;
    }

    public byte[] d() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScanFilter.class != obj.getClass()) {
            return false;
        }
        ScanFilter scanFilter = (ScanFilter) obj;
        return k4h.b(this.f28167a, scanFilter.f28167a) && k4h.b(this.f28168b, scanFilter.f28168b) && this.h == scanFilter.h && k4h.a(this.i, scanFilter.i) && k4h.a(this.j, scanFilter.j) && k4h.b(this.e, scanFilter.e) && k4h.a(this.f, scanFilter.f) && k4h.a(this.g, scanFilter.g) && k4h.b(this.c, scanFilter.c) && k4h.b(this.d, scanFilter.d);
    }

    public int f() {
        return this.h;
    }

    public byte[] g() {
        return this.f;
    }

    public byte[] h() {
        return this.g;
    }

    public int hashCode() {
        return k4h.c(this.f28167a, this.f28168b, Integer.valueOf(this.h), Integer.valueOf(Arrays.hashCode(this.i)), Integer.valueOf(Arrays.hashCode(this.j)), this.e, Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), this.c, this.d);
    }

    public ParcelUuid i() {
        return this.e;
    }

    public ParcelUuid j() {
        return this.c;
    }

    public ParcelUuid k() {
        return this.d;
    }

    public boolean l(ScanResult scanResult) {
        if (scanResult == null) {
            return false;
        }
        BluetoothDevice bluetoothDeviceA = scanResult.a();
        String str = this.f28168b;
        if (str != null && !str.equals(bluetoothDeviceA.getAddress())) {
            return false;
        }
        ydl ydlVarD = scanResult.d();
        if (ydlVarD == null && (this.f28167a != null || this.c != null || this.i != null || this.f != null)) {
            return false;
        }
        String str2 = this.f28167a;
        if (str2 != null && !str2.equals(ydlVarD.d())) {
            return false;
        }
        ParcelUuid parcelUuid = this.c;
        if (parcelUuid != null && !q(parcelUuid, this.d, ydlVarD.g())) {
            return false;
        }
        ParcelUuid parcelUuid2 = this.e;
        if (parcelUuid2 != null && ydlVarD != null && !m(this.f, this.g, ydlVarD.f(parcelUuid2))) {
            return false;
        }
        int i = this.h;
        return i < 0 || ydlVarD == null || m(this.i, this.j, ydlVarD.e(i));
    }

    public final boolean m(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            return bArr3 != null;
        }
        if (bArr3 == null || bArr3.length < bArr.length) {
            return false;
        }
        if (bArr2 == null) {
            for (int i = 0; i < bArr.length; i++) {
                if (bArr3[i] != bArr[i]) {
                    return false;
                }
            }
            return true;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr2[i2];
            if ((bArr3[i2] & b2) != (b2 & bArr[i2])) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return "BluetoothLeScanFilter [deviceName=" + this.f28167a + ", deviceAddress=" + this.f28168b + ", mUuid=" + this.c + ", uuidMask=" + this.d + ", serviceDataUuid=" + k4h.d(this.e) + ", serviceData=" + Arrays.toString(this.f) + ", serviceDataMask=" + Arrays.toString(this.g) + ", manufacturerId=" + this.h + ", manufacturerData=" + Arrays.toString(this.i) + ", manufacturerDataMask=" + Arrays.toString(this.j) + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f28167a == null ? 0 : 1);
        String str = this.f28167a;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.f28168b == null ? 0 : 1);
        String str2 = this.f28168b;
        if (str2 != null) {
            parcel.writeString(str2);
        }
        parcel.writeInt(this.c == null ? 0 : 1);
        ParcelUuid parcelUuid = this.c;
        if (parcelUuid != null) {
            parcel.writeParcelable(parcelUuid, i);
            parcel.writeInt(this.d == null ? 0 : 1);
            ParcelUuid parcelUuid2 = this.d;
            if (parcelUuid2 != null) {
                parcel.writeParcelable(parcelUuid2, i);
            }
        }
        parcel.writeInt(this.e == null ? 0 : 1);
        ParcelUuid parcelUuid3 = this.e;
        if (parcelUuid3 != null) {
            parcel.writeParcelable(parcelUuid3, i);
            parcel.writeInt(this.f == null ? 0 : 1);
            byte[] bArr = this.f;
            if (bArr != null) {
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(this.f);
                parcel.writeInt(this.g == null ? 0 : 1);
                byte[] bArr2 = this.g;
                if (bArr2 != null) {
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(this.g);
                }
            }
        }
        parcel.writeInt(this.h);
        parcel.writeInt(this.i == null ? 0 : 1);
        byte[] bArr3 = this.i;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            parcel.writeByteArray(this.i);
            parcel.writeInt(this.j == null ? 0 : 1);
            byte[] bArr4 = this.j;
            if (bArr4 != null) {
                parcel.writeInt(bArr4.length);
                parcel.writeByteArray(this.j);
            }
        }
    }

    public ScanFilter(String str, String str2, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i, byte[] bArr3, byte[] bArr4) {
        this.f28167a = str;
        this.c = parcelUuid;
        this.d = parcelUuid2;
        this.f28168b = str2;
        this.e = parcelUuid3;
        this.f = bArr;
        this.g = bArr2;
        this.h = i;
        this.i = bArr3;
        this.j = bArr4;
    }
}
