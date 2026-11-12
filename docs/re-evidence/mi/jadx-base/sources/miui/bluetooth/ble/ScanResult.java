package miui.bluetooth.ble;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.zdl;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ScanResult implements Parcelable {
    public static final Parcelable.Creator<ScanResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BluetoothDevice f26234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zdl f26235b;
    public int c;
    public long d;
    public int e;

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

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static int c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static String e(Object obj) {
        return obj == null ? AbstractJsonLexerKt.NULL : obj.toString();
    }

    public final void d(Parcel parcel) {
        if (parcel.readInt() == 1) {
            this.f26234a = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 1) {
            this.f26235b = zdl.c(parcel.createByteArray());
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
        return a(this.f26234a, scanResult.f26234a) && this.c == scanResult.c && a(this.f26235b, scanResult.f26235b) && this.d == scanResult.d;
    }

    public int hashCode() {
        return c(this.f26234a, Integer.valueOf(this.c), this.f26235b, Long.valueOf(this.d));
    }

    public String toString() {
        return "ScanResult{mDevice=" + this.f26234a + ", mScanRecord=" + e(this.f26235b) + ", mRssi=" + this.c + ", mTimestampNanos=" + this.d + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.f26234a != null) {
            parcel.writeInt(1);
            this.f26234a.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
        if (this.f26235b != null) {
            parcel.writeInt(1);
            parcel.writeByteArray(this.f26235b.b());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.c);
        parcel.writeLong(this.d);
    }

    public ScanResult(Parcel parcel) {
        this.e = 0;
        d(parcel);
    }
}
