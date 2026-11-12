package no.nordicsemi.android.support.v18.scanner;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.k4h;
import defpackage.ydl;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ScanResult implements Parcelable {
    public static final Parcelable.Creator<ScanResult> CREATOR = new a();
    public static final int DATA_COMPLETE = 0;
    public static final int DATA_TRUNCATED = 2;
    public static final int PERIODIC_INTERVAL_NOT_PRESENT = 0;
    public static final int PHY_UNUSED = 0;
    public static final int SID_NOT_PRESENT = 255;
    public static final int TX_POWER_NOT_PRESENT = 127;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BluetoothDevice f28171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ydl f28172b;
    public final int c;
    public final long d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public class a implements Parcelable.Creator<ScanResult> {
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

    public BluetoothDevice a() {
        return this.f28171a;
    }

    public int c() {
        return this.c;
    }

    public ydl d() {
        return this.f28172b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ScanResult.class != obj.getClass()) {
            return false;
        }
        ScanResult scanResult = (ScanResult) obj;
        return k4h.b(this.f28171a, scanResult.f28171a) && this.c == scanResult.c && k4h.b(this.f28172b, scanResult.f28172b) && this.d == scanResult.d && this.e == scanResult.e && this.f == scanResult.f && this.g == scanResult.g && this.h == scanResult.h && this.i == scanResult.i && this.j == scanResult.j;
    }

    public boolean f() {
        return (this.e & 1) != 0;
    }

    public int hashCode() {
        return k4h.c(this.f28171a, Integer.valueOf(this.c), this.f28172b, Long.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j));
    }

    public String toString() {
        return "ScanResult{device=" + this.f28171a + ", scanRecord=" + k4h.d(this.f28172b) + ", rssi=" + this.c + ", timestampNanos=" + this.d + ", eventType=" + this.e + ", primaryPhy=" + this.f + ", secondaryPhy=" + this.g + ", advertisingSid=" + this.h + ", txPower=" + this.i + ", periodicAdvertisingInterval=" + this.j + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.f28171a.writeToParcel(parcel, i);
        if (this.f28172b != null) {
            parcel.writeInt(1);
            parcel.writeByteArray(this.f28172b.c());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
    }

    public ScanResult(BluetoothDevice bluetoothDevice, ydl ydlVar, int i, long j) {
        this.f28171a = bluetoothDevice;
        this.f28172b = ydlVar;
        this.c = i;
        this.d = j;
        this.e = 17;
        this.f = 1;
        this.g = 0;
        this.h = 255;
        this.i = 127;
        this.j = 0;
    }

    public ScanResult(BluetoothDevice bluetoothDevice, int i, int i2, int i3, int i4, int i5, int i6, int i7, ydl ydlVar, long j) {
        this.f28171a = bluetoothDevice;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.c = i6;
        this.j = i7;
        this.f28172b = ydlVar;
        this.d = j;
    }

    public ScanResult(Parcel parcel) {
        this.f28171a = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
        if (parcel.readInt() == 1) {
            this.f28172b = ydl.h(parcel.createByteArray());
        }
        this.c = parcel.readInt();
        this.d = parcel.readLong();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
    }
}
