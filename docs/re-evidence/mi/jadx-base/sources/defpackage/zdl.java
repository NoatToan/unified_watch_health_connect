package defpackage;

import android.os.ParcelUuid;
import android.util.ArrayMap;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class zdl {
    public static final ParcelUuid h = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<ParcelUuid> f41160b;
    public final SparseArray<byte[]> c;
    public final Map<ParcelUuid, byte[]> d;
    public final int e;
    public final String f;
    public final byte[] g;

    public zdl(List<ParcelUuid> list, SparseArray<byte[]> sparseArray, Map<ParcelUuid, byte[]> map, int i, int i2, String str, byte[] bArr) {
        this.f41160b = list;
        this.c = sparseArray;
        this.d = map;
        this.f = str;
        this.f41159a = i;
        this.e = i2;
        this.g = bArr;
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    public static zdl c(byte[] bArr) {
        ArrayList arrayList;
        if (bArr == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        ArrayMap arrayMap = new ArrayMap();
        int i = 0;
        String str = null;
        byte b2 = -2147483648;
        int i2 = -1;
        while (i < bArr.length) {
            try {
                int i3 = i + 1;
                int i4 = bArr[i] & 255;
                if (i4 == 0) {
                    if (arrayList2.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = arrayList2;
                    }
                    return new zdl(arrayList, sparseArray, arrayMap, i2, b2, str, bArr);
                }
                int i5 = i4 - 1;
                int i6 = i + 2;
                int i7 = bArr[i3] & 255;
                if (i7 == 22) {
                    arrayMap.put(e(a(bArr, i6, 2)), a(bArr, i + 4, i4 - 3));
                } else if (i7 != 255) {
                    switch (i7) {
                        case 1:
                            i2 = bArr[i6] & 255;
                            break;
                        case 2:
                        case 3:
                            d(bArr, i6, i5, 2, arrayList2);
                            break;
                        case 4:
                        case 5:
                            d(bArr, i6, i5, 4, arrayList2);
                            break;
                        case 6:
                        case 7:
                            d(bArr, i6, i5, 16, arrayList2);
                            break;
                        case 8:
                        case 9:
                            str = new String(a(bArr, i6, i5));
                            break;
                        case 10:
                            b2 = bArr[i6];
                            break;
                    }
                } else {
                    sparseArray.put(((bArr[i + 3] & 255) << 8) + (255 & bArr[i6]), a(bArr, i + 4, i4 - 3));
                }
                i = i6 + i5;
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("unable to parse scan record: ");
                sb.append(Arrays.toString(bArr));
                return new zdl(null, null, null, -1, Integer.MIN_VALUE, null, bArr);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = arrayList2;
        }
        return new zdl(arrayList, sparseArray, arrayMap, i2, b2, str, bArr);
    }

    public static int d(byte[] bArr, int i, int i2, int i3, List<ParcelUuid> list) {
        while (i2 > 0) {
            list.add(e(a(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    public static ParcelUuid e(byte[] bArr) {
        long j;
        if (bArr == null) {
            throw new IllegalArgumentException("uuidBytes cannot be null");
        }
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new IllegalArgumentException("uuidBytes length invalid - " + length);
        }
        if (length == 16) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(byteBufferOrder.getLong(8), byteBufferOrder.getLong(0)));
        }
        if (length == 2) {
            j = ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8));
        } else {
            j = ((long) ((bArr[3] & 255) << 24)) + ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8)) + ((long) ((bArr[2] & 255) << 16));
        }
        ParcelUuid parcelUuid = h;
        return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j << 32), parcelUuid.getUuid().getLeastSignificantBits()));
    }

    public static String f(SparseArray<byte[]> sparseArray) {
        if (sparseArray == null) {
            return AbstractJsonLexerKt.NULL;
        }
        if (sparseArray.size() == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        for (int i = 0; i < sparseArray.size(); i++) {
            sb.append(sparseArray.keyAt(i));
            sb.append("=");
            sb.append(Arrays.toString(sparseArray.valueAt(i)));
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public static <T> String g(Map<T, byte[]> map) {
        if (map == null) {
            return AbstractJsonLexerKt.NULL;
        }
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        Iterator<Map.Entry<T, byte[]>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            T key = it.next().getKey();
            sb.append(key);
            sb.append("=");
            sb.append(Arrays.toString(map.get(key)));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public byte[] b() {
        return this.g;
    }

    public String toString() {
        return "ScanRecord [mAdvertiseFlags=" + this.f41159a + ", mServiceUuids=" + this.f41160b + ", mManufacturerSpecificData=" + f(this.c) + ", mServiceData=" + g(this.d) + ", mTxPowerLevel=" + this.e + ", mDeviceName=" + this.f + "]";
    }
}
