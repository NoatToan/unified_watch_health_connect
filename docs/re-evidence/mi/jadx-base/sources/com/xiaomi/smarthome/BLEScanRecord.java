package com.xiaomi.smarthome;

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

/* JADX INFO: loaded from: classes4.dex */
public final class BLEScanRecord {
    public static final ParcelUuid BASE_UUID = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
    private static final int DATA_TYPE_FLAGS = 1;
    private static final int DATA_TYPE_LOCAL_NAME_COMPLETE = 9;
    private static final int DATA_TYPE_LOCAL_NAME_SHORT = 8;
    private static final int DATA_TYPE_MANUFACTURER_SPECIFIC_DATA = 255;
    private static final int DATA_TYPE_SERVICE_DATA = 22;
    private static final int DATA_TYPE_SERVICE_UUIDS_128_BIT_COMPLETE = 7;
    private static final int DATA_TYPE_SERVICE_UUIDS_128_BIT_PARTIAL = 6;
    private static final int DATA_TYPE_SERVICE_UUIDS_16_BIT_COMPLETE = 3;
    private static final int DATA_TYPE_SERVICE_UUIDS_16_BIT_PARTIAL = 2;
    private static final int DATA_TYPE_SERVICE_UUIDS_32_BIT_COMPLETE = 5;
    private static final int DATA_TYPE_SERVICE_UUIDS_32_BIT_PARTIAL = 4;
    private static final int DATA_TYPE_TX_POWER_LEVEL = 10;
    private static final String TAG = "BLEScanRecord";
    public static final int UUID_BYTES_128_BIT = 16;
    public static final int UUID_BYTES_16_BIT = 2;
    public static final int UUID_BYTES_32_BIT = 4;
    private final int mAdvertiseFlags;
    private final byte[] mBytes;
    private final String mDeviceName;
    private final SparseArray<byte[]> mManufacturerSpecificData;
    private final Map<ParcelUuid, byte[]> mServiceData;
    private final List<ParcelUuid> mServiceUuids;
    private final int mTxPowerLevel;

    private BLEScanRecord(List<ParcelUuid> list, SparseArray<byte[]> sparseArray, Map<ParcelUuid, byte[]> map, int i, int i2, String str, byte[] bArr) {
        this.mServiceUuids = list;
        this.mManufacturerSpecificData = sparseArray;
        this.mServiceData = map;
        this.mDeviceName = str;
        this.mAdvertiseFlags = i;
        this.mTxPowerLevel = i2;
        this.mBytes = bArr;
    }

    public static boolean existServiceUUID(UUID uuid, byte[] bArr) {
        BLEScanRecord fromBytes = parseFromBytes(bArr);
        if (fromBytes != null && uuid != null) {
            String lowerCase = uuid.toString().toLowerCase();
            List<ParcelUuid> serviceUuids = fromBytes.getServiceUuids();
            if (serviceUuids != null && !serviceUuids.isEmpty()) {
                Iterator<ParcelUuid> it = serviceUuids.iterator();
                while (it.hasNext()) {
                    if (lowerCase.equals(it.next().getUuid().toString().toLowerCase())) {
                        return true;
                    }
                }
            }
            Map<ParcelUuid, byte[]> serviceData = fromBytes.getServiceData();
            if (serviceData != null && !serviceData.isEmpty()) {
                Iterator<ParcelUuid> it2 = serviceData.keySet().iterator();
                while (it2.hasNext()) {
                    if (lowerCase.equals(it2.next().getUuid().toString().toLowerCase())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static byte[] extractBytes(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    public static BLEScanRecord parseFromBytes(byte[] bArr) {
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
                    return new BLEScanRecord(arrayList, sparseArray, arrayMap, i2, b2, str, bArr);
                }
                int i5 = i4 - 1;
                int i6 = i + 2;
                int i7 = bArr[i3] & 255;
                if (i7 == 22) {
                    arrayMap.put(parseUuidFrom(extractBytes(bArr, i6, 2)), extractBytes(bArr, i + 4, i4 - 3));
                } else if (i7 != 255) {
                    switch (i7) {
                        case 1:
                            i2 = bArr[i6] & 255;
                            break;
                        case 2:
                        case 3:
                            parseServiceUuid(bArr, i6, i5, 2, arrayList2);
                            break;
                        case 4:
                        case 5:
                            parseServiceUuid(bArr, i6, i5, 4, arrayList2);
                            break;
                        case 6:
                        case 7:
                            parseServiceUuid(bArr, i6, i5, 16, arrayList2);
                            break;
                        case 8:
                        case 9:
                            str = new String(extractBytes(bArr, i6, i5));
                            break;
                        case 10:
                            b2 = bArr[i6];
                            break;
                    }
                } else {
                    sparseArray.put(((bArr[i + 3] & 255) << 8) + (255 & bArr[i6]), extractBytes(bArr, i + 4, i4 - 3));
                }
                i = i6 + i5;
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("unable to parse scan record: ");
                sb.append(Arrays.toString(bArr));
                return new BLEScanRecord(null, null, null, -1, Integer.MIN_VALUE, null, bArr);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList = null;
        } else {
            arrayList = arrayList2;
        }
        return new BLEScanRecord(arrayList, sparseArray, arrayMap, i2, b2, str, bArr);
    }

    private static int parseServiceUuid(byte[] bArr, int i, int i2, int i3, List<ParcelUuid> list) {
        while (i2 > 0) {
            list.add(parseUuidFrom(extractBytes(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    public static ParcelUuid parseUuidFrom(byte[] bArr) {
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
        ParcelUuid parcelUuid = BASE_UUID;
        return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j << 32), parcelUuid.getUuid().getLeastSignificantBits()));
    }

    public int getAdvertiseFlags() {
        return this.mAdvertiseFlags;
    }

    public byte[] getBytes() {
        return this.mBytes;
    }

    public String getDeviceName() {
        return this.mDeviceName;
    }

    public SparseArray<byte[]> getManufacturerSpecificData() {
        return this.mManufacturerSpecificData;
    }

    public Map<ParcelUuid, byte[]> getServiceData() {
        return this.mServiceData;
    }

    public List<ParcelUuid> getServiceUuids() {
        return this.mServiceUuids;
    }

    public int getTxPowerLevel() {
        return this.mTxPowerLevel;
    }

    public String toString() {
        return "ScanRecord [mAdvertiseFlags=" + this.mAdvertiseFlags + ", mServiceUuids=" + this.mServiceUuids + ", mManufacturerSpecificData=" + toString(this.mManufacturerSpecificData) + ", mServiceData=" + toString(this.mServiceData) + ", mTxPowerLevel=" + this.mTxPowerLevel + ", mDeviceName=" + this.mDeviceName + "]";
    }

    public byte[] getManufacturerSpecificData(int i) {
        return this.mManufacturerSpecificData.get(i);
    }

    public byte[] getServiceData(ParcelUuid parcelUuid) {
        if (parcelUuid == null) {
            return null;
        }
        return this.mServiceData.get(parcelUuid);
    }

    public static String toString(SparseArray<byte[]> sparseArray) {
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

    public static <T> String toString(Map<T, byte[]> map) {
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
}
