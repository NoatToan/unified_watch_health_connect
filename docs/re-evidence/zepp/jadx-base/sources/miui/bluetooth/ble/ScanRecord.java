package miui.bluetooth.ble;

import android.os.ParcelUuid;
import android.util.ArrayMap;
import android.util.Log;
import android.util.SparseArray;
import com.airoha.android.lib.transport.AirohaLink;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes23.dex */
public final class ScanRecord {
    public static final int UUID_BYTES_128_BIT = 16;
    public static final int UUID_BYTES_16_BIT = 2;
    public static final int UUID_BYTES_32_BIT = 4;
    private static final String h = "ScanRecord";
    private static final ParcelUuid i = ParcelUuid.fromString(AirohaLink.UUID_COMMON_SPP_STR);
    private static final int j = 1;
    private static final int k = 2;
    private static final int l = 3;
    private static final int m = 4;
    private static final int n = 5;
    private static final int o = 6;
    private static final int p = 7;
    private static final int q = 8;
    private static final int r = 9;
    private static final int s = 10;
    private static final int t = 22;
    private static final int u = 255;
    private final int a;
    private final List<ParcelUuid> b;
    private final SparseArray<byte[]> c;
    private final Map<ParcelUuid, byte[]> d;
    private final int e;
    private final String f;
    private final byte[] g;

    private ScanRecord(List<ParcelUuid> list, SparseArray<byte[]> sparseArray, Map<ParcelUuid, byte[]> map, int i2, int i3, String str, byte[] bArr) {
        this.b = list;
        this.c = sparseArray;
        this.d = map;
        this.f = str;
        this.a = i2;
        this.e = i3;
        this.g = bArr;
    }

    private static byte[] a(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return bArr2;
    }

    private static int b(byte[] bArr, int i2, int i3, int i4, List<ParcelUuid> list) {
        while (i3 > 0) {
            list.add(c(a(bArr, i2, i4)));
            i3 -= i4;
            i2 += i4;
        }
        return i2;
    }

    private static ParcelUuid c(byte[] bArr) {
        long j2;
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
            j2 = ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8));
        } else {
            j2 = ((long) ((bArr[3] & 255) << 24)) + ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8)) + ((long) ((bArr[2] & 255) << 16));
        }
        ParcelUuid parcelUuid = i;
        return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j2 << 32), parcelUuid.getUuid().getLeastSignificantBits()));
    }

    public static String d(SparseArray<byte[]> sparseArray) {
        if (sparseArray == null) {
            return "null";
        }
        if (sparseArray.size() == 0) {
            return MessageFormatter.c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            sb.append(sparseArray.keyAt(i2));
            sb.append(SearchCriteria.EQ);
            sb.append(Arrays.toString(sparseArray.valueAt(i2)));
        }
        sb.append('}');
        return sb.toString();
    }

    public static <T> String e(Map<T, byte[]> map) {
        if (map == null) {
            return "null";
        }
        if (map.isEmpty()) {
            return MessageFormatter.c;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        Iterator<Map.Entry<T, byte[]>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            T key = it2.next().getKey();
            sb.append(key);
            sb.append(SearchCriteria.EQ);
            sb.append(Arrays.toString(map.get(key)));
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    public static ScanRecord parseFromBytes(byte[] bArr) {
        ArrayList arrayList;
        if (bArr == null) {
            return null;
        }
        int i2 = 0;
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        ArrayMap arrayMap = new ArrayMap();
        String str = null;
        int i3 = -1;
        byte b = -2147483648;
        while (i2 < bArr.length) {
            try {
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                if (i5 == 0) {
                    if (arrayList2.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = arrayList2;
                    }
                    return new ScanRecord(arrayList, sparseArray, arrayMap, i3, b, str, bArr);
                }
                int i6 = i5 - 1;
                int i7 = i4 + 1;
                int i8 = bArr[i4] & 255;
                if (i8 == 22) {
                    arrayMap.put(c(a(bArr, i7, 2)), a(bArr, i7 + 2, i6 - 2));
                } else if (i8 != 255) {
                    switch (i8) {
                        case 1:
                            i3 = bArr[i7] & 255;
                            break;
                        case 2:
                        case 3:
                            b(bArr, i7, i6, 2, arrayList2);
                            break;
                        case 4:
                        case 5:
                            b(bArr, i7, i6, 4, arrayList2);
                            break;
                        case 6:
                        case 7:
                            b(bArr, i7, i6, 16, arrayList2);
                            break;
                        case 8:
                        case 9:
                            str = new String(a(bArr, i7, i6));
                            break;
                        case 10:
                            b = bArr[i7];
                            break;
                    }
                } else {
                    sparseArray.put(((bArr[i7 + 1] & 255) << 8) + (255 & bArr[i7]), a(bArr, i7 + 2, i6 - 2));
                }
                i2 = i6 + i7;
            } catch (Exception unused) {
                Log.e(h, "unable to parse scan record: " + Arrays.toString(bArr));
                return new ScanRecord(null, null, null, -1, Integer.MIN_VALUE, null, bArr);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = arrayList2;
        }
        return new ScanRecord(arrayList, sparseArray, arrayMap, i3, b, str, bArr);
    }

    public int getAdvertiseFlags() {
        return this.a;
    }

    public byte[] getBytes() {
        return this.g;
    }

    public String getDeviceName() {
        return this.f;
    }

    public SparseArray<byte[]> getManufacturerSpecificData() {
        return this.c;
    }

    public Map<ParcelUuid, byte[]> getServiceData() {
        return this.d;
    }

    public List<ParcelUuid> getServiceUuids() {
        return this.b;
    }

    public int getTxPowerLevel() {
        return this.e;
    }

    public String toString() {
        return "ScanRecord [mAdvertiseFlags=" + this.a + ", mServiceUuids=" + this.b + ", mManufacturerSpecificData=" + d(this.c) + ", mServiceData=" + e(this.d) + ", mTxPowerLevel=" + this.e + ", mDeviceName=" + this.f + "]";
    }

    public byte[] getManufacturerSpecificData(int i2) {
        return this.c.get(i2);
    }

    public byte[] getServiceData(ParcelUuid parcelUuid) {
        Map<ParcelUuid, byte[]> map;
        if (parcelUuid == null || (map = this.d) == null) {
            return null;
        }
        return map.get(parcelUuid);
    }
}
