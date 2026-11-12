package miui.bluetooth.ble;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes23.dex */
public final class ScanResult implements Parcelable {
    public static final Parcelable.Creator<ScanResult> CREATOR = new a();
    private BluetoothDevice a;
    private ScanRecord b;
    private int c;
    private long d;
    private int e;

    public static class a implements Parcelable.Creator<ScanResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScanResult createFromParcel(Parcel parcel) {
            return new ScanResult(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ScanResult[] newArray(int i) {
            return new ScanResult[i];
        }
    }

    public /* synthetic */ ScanResult(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    private void b(Parcel parcel) {
        if (parcel.readInt() == 1) {
            this.a = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 1) {
            this.b = ScanRecord.parseFromBytes(parcel.createByteArray());
        }
        this.c = parcel.readInt();
        this.d = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScanResult.class != obj.getClass()) {
            return false;
        }
        ScanResult scanResult = (ScanResult) obj;
        return equals(this.a, scanResult.a) && this.c == scanResult.c && equals(this.b, scanResult.b) && this.d == scanResult.d;
    }

    public BluetoothDevice getDevice() {
        return this.a;
    }

    public int getDeviceType() {
        return this.e;
    }

    public int getRssi() {
        return this.c;
    }

    public ScanRecord getScanRecord() {
        return this.b;
    }

    public long getTimestampNanos() {
        return this.d;
    }

    public int hashCode() {
        return a(this.a, Integer.valueOf(this.c), this.b, Long.valueOf(this.d));
    }

    public String toString() {
        return "ScanResult{mDevice=" + this.a + ", mScanRecord=" + toString(this.b) + ", mRssi=" + this.c + ", mTimestampNanos=" + this.d + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.a != null) {
            parcel.writeInt(1);
            this.a.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
        if (this.b != null) {
            parcel.writeInt(1);
            parcel.writeByteArray(this.b.getBytes());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
    }

    public ScanResult(BluetoothDevice bluetoothDevice, ScanRecord scanRecord, int i, long j, int i2) {
        this.e = 0;
        this.a = bluetoothDevice;
        this.b = scanRecord;
        this.c = i;
        this.d = j;
        this.e = i2;
    }

    public static String toString(Object obj) {
        return obj == null ? "null" : obj.toString();
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private ScanResult(Parcel parcel) {
        this.e = 0;
        b(parcel);
    }
}
