package no.nordicsemi.android.ble.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public class Data implements Parcelable {
    public static final int FORMAT_FLOAT = 52;
    public static final int FORMAT_SFLOAT = 50;
    public static final int FORMAT_SINT16 = 34;
    public static final int FORMAT_SINT24 = 35;
    public static final int FORMAT_SINT32 = 36;
    public static final int FORMAT_SINT8 = 33;
    public static final int FORMAT_UINT16 = 18;
    public static final int FORMAT_UINT24 = 19;
    public static final int FORMAT_UINT32 = 20;
    public static final int FORMAT_UINT8 = 17;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f28120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char[] f28119b = "0123456789ABCDEF".toCharArray();
    public static final Parcelable.Creator<Data> CREATOR = new a();

    public class a implements Parcelable.Creator<Data> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Data createFromParcel(Parcel parcel) {
            return new Data(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Data[] newArray(int i) {
            return new Data[i];
        }
    }

    public Data() {
        this.f28120a = null;
    }

    public static int c(int i) {
        return i & 15;
    }

    public static int f(byte b2) {
        return b2 & 255;
    }

    public static int g(byte b2, byte b3) {
        return f(b2) + (f(b3) << 8);
    }

    public static int h(byte b2, byte b3, byte b4, byte b5) {
        return f(b2) + (f(b3) << 8) + (f(b4) << 16) + (f(b5) << 24);
    }

    public static int i(int i, int i2) {
        int i3 = 1 << (i2 - 1);
        return (i & i3) != 0 ? (i3 - (i & (i3 - 1))) * (-1) : i;
    }

    public Integer a(int i, @IntRange(from = 0) int i2) {
        if (c(i) + i2 > e()) {
            return null;
        }
        switch (i) {
            case 17:
                return Integer.valueOf(f(this.f28120a[i2]));
            case 18:
                byte[] bArr = this.f28120a;
                return Integer.valueOf(g(bArr[i2], bArr[i2 + 1]));
            case 19:
                byte[] bArr2 = this.f28120a;
                return Integer.valueOf(h(bArr2[i2], bArr2[i2 + 1], bArr2[i2 + 2], (byte) 0));
            case 20:
                byte[] bArr3 = this.f28120a;
                return Integer.valueOf(h(bArr3[i2], bArr3[i2 + 1], bArr3[i2 + 2], bArr3[i2 + 3]));
            default:
                switch (i) {
                    case 33:
                        return Integer.valueOf(i(f(this.f28120a[i2]), 8));
                    case 34:
                        byte[] bArr4 = this.f28120a;
                        return Integer.valueOf(i(g(bArr4[i2], bArr4[i2 + 1]), 16));
                    case 35:
                        byte[] bArr5 = this.f28120a;
                        return Integer.valueOf(i(h(bArr5[i2], bArr5[i2 + 1], bArr5[i2 + 2], (byte) 0), 24));
                    case 36:
                        byte[] bArr6 = this.f28120a;
                        return Integer.valueOf(i(h(bArr6[i2], bArr6[i2 + 1], bArr6[i2 + 2], bArr6[i2 + 3]), 32));
                    default:
                        return null;
                }
        }
    }

    public byte[] d() {
        return this.f28120a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        byte[] bArr = this.f28120a;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    public String toString() {
        if (e() == 0) {
            return "";
        }
        char[] cArr = new char[(this.f28120a.length * 3) - 1];
        int i = 0;
        while (true) {
            byte[] bArr = this.f28120a;
            if (i >= bArr.length) {
                return "(0x) " + new String(cArr);
            }
            byte b2 = bArr[i];
            int i2 = i * 3;
            char[] cArr2 = f28119b;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & 15];
            if (i != bArr.length - 1) {
                cArr[i2 + 2] = '-';
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f28120a);
    }

    public Data(byte[] bArr) {
        this.f28120a = bArr;
    }

    public Data(Parcel parcel) {
        this.f28120a = parcel.createByteArray();
    }
}
