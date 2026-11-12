package com.xiaomi.hm.health.bt.gatt;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.airoha.android.lib.RaceCommand.constant.RaceId;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import com.huami.watch.dataflow.model.health.process.Const;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.scan.AdvData;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.UShort;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes19.dex */
public final class GattUtils {
    private static final String a = "GattUtils";
    private static final long d = 4096;
    private static final long e = -9223371485494954757L;
    public static final UUID UUID_DESCRIPTOR_CLIENT_CHARACTERISTIC_CONFIGURATION = uuid16("2902");
    public static final UUID UUID_DESCRIPTOR_CHARACTERISTIC_USER_CONFIGURATION = uuid16("2901");
    private static final String b = "0000%4s-0000-1000-8000-00805f9b34fb";
    private static final String c = String.format(b, "....");
    private static final int[] f = {0, 49345, 49537, GlMapUtil.DEVICE_DISPLAY_DPI_HIGH, 49921, 960, 640, 49729, 50689, 1728, 1920, 51009, 1280, 50625, 50305, 1088, 52225, 3264, 3456, 52545, 3840, 53185, 52865, 3648, RaceId.RACE_NVKEY_READFULLKEY, 51905, 52097, 2880, 51457, 2496, 2176, 51265, 55297, 6336, 6528, 55617, 6912, 56257, 55937, 6720, RaceId.RACE_GET_BOOT_REASON, 57025, 57217, 8000, 56577, 7616, 7296, 56385, 5120, 54465, 54657, 5440, 55041, 6080, 5760, 54849, 53761, 4800, 4992, 54081, 4352, 53697, 53377, 4160, 61441, 12480, 12672, 61761, 13056, 62401, 62081, 12864, 13824, 63169, 63361, 14144, 62721, 13760, 13440, 62529, 15360, 64705, 64897, 15680, 65281, 16320, 16000, 65089, 64001, 15040, 15232, 64321, 14592, 63937, 63617, 14400, 10240, 59585, 59777, 10560, 60161, 11200, 10880, 59969, 60929, 11968, 12160, 61249, 11520, 60865, 60545, 11328, 58369, 9408, 9600, 58689, 9984, 59329, 59009, 9792, 8704, 58049, 58241, 9024, 57601, 8640, 8320, 57409, 40961, 24768, 24960, 41281, 25344, 41921, 41601, 25152, 26112, 42689, 42881, 26432, 42241, 26048, 25728, 42049, 27648, 44225, 44417, 27968, 44801, 28608, 28288, 44609, 43521, 27328, 27520, 43841, 26880, 43457, 43137, 26688, 30720, 47297, 47489, 31040, 47873, 31680, 31360, 47681, 48641, 32448, 32640, 48961, 32000, 48577, 48257, 31808, 46081, 29888, 30080, 46401, 30464, 47041, 46721, 30272, 29184, 45761, 45953, 29504, 45313, 29120, 28800, 45121, CacheDataSink.DEFAULT_BUFFER_SIZE, 37057, 37249, 20800, 37633, 21440, 21120, 37441, 38401, 22208, 22400, 38721, 21760, 38337, 38017, 21568, 39937, 23744, 23936, 40257, 24320, 40897, 40577, 24128, 23040, 39617, 39809, 23360, 39169, 22976, 22656, 38977, 34817, 18624, 18816, 35137, 19200, 35777, 35457, 19008, 19968, 36545, 36737, 20288, 36097, 19904, 19584, 35905, 17408, 33985, 34177, 17728, 34561, 18368, 18048, 34369, 33281, 17088, Const.TOTAL_SIZE, 33601, 16640, 33217, 32897, 16448};
    private static final long g = 13586;
    private static final long h = 2384656044284446464L;
    private static final UUID i = new UUID(g, h);
    public static UUID nRF_DFU_BASE = new UUID(303230942, 1523193452336828707L);
    public static UUID TI_UUID_BASE = new UUID(-1152921504534413312L, -5764607523034234880L);
    private static Field j = null;

    private static int a(final byte[] buffer) {
        int i2 = 0;
        for (byte b2 : buffer) {
            i2 = f[(i2 ^ b2) & 255] ^ (i2 >>> 8);
        }
        return i2;
    }

    private static UUID b(int uuid32) {
        return new UUID(((((long) uuid32) & 4294967295L) << 32) | 4096, e);
    }

    public static String bytesTo16HexString(byte[] src) {
        StringBuilder sb = new StringBuilder();
        if (src == null || src.length <= 0) {
            return "null";
        }
        for (byte b2 : src) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase();
    }

    public static String bytesToHexString(final byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bytes) {
            sb.append(String.format("%02x ", Byte.valueOf(b2)));
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static String bytesToHexStringNoSpace(final byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bytes) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    public static int bytesToInt(byte[] bytes, int offset) {
        return bytesToInt(bytes, offset, 4);
    }

    public static int bytesToIntBE(byte[] bytes, int offset) {
        return bytesToIntBE(bytes, offset, 4);
    }

    public static long bytesToLong(byte[] bytes, int offset) {
        return bytesToLong(bytes, offset, 8);
    }

    public static long bytesToLongBE(byte[] bytes, int offset, int len) {
        long j2 = 0;
        for (int i2 = 0; i2 < len; i2++) {
            j2 |= (((long) bytes[offset + i2]) & 255) << (((len - 1) - i2) * 8);
        }
        return j2;
    }

    public static short bytesToSignShort(byte[] bytes, int offset) {
        return (short) ((bytes[offset] & 255) | (bytes[offset + 1] << 8));
    }

    public static int bytesToSignedInt(byte[] bytes, int offset) {
        return bytesToSignedInt(bytes, offset, 4);
    }

    public static Number bytesToSignedNumber(byte[] bytes, int offset, int len) {
        boolean z = (bytes[(offset + len) - 1] & 128) > 0;
        long j2 = 0;
        for (int i2 = 0; i2 < len; i2++) {
            j2 |= (255 & ((long) (z ? ~bytes[offset + i2] : bytes[offset + i2]))) << (i2 * 8);
        }
        if (z) {
            j2 = (-j2) - 1;
        }
        return Long.valueOf(j2);
    }

    private static UUID c(final UUID uuid, short uuid16) {
        return new UUID((uuid.getMostSignificantBits() & (-281470681743361L)) | ((((long) uuid16) & WebSocketProtocol.s) << 32), uuid.getLeastSignificantBits());
    }

    public static int crc16(int crc, final byte[] data, int i2, int n) {
        while (i2 < n) {
            int i3 = (((crc << 8) | (crc >>> 8)) & 65535) ^ (data[i2] & 255);
            int i4 = i3 ^ ((i3 & 255) >> 4);
            int i5 = i4 ^ ((i4 << 12) & 65535);
            crc = i5 ^ (65535 & ((i5 & 255) << 5));
            i2++;
        }
        return crc;
    }

    public static int crc8(byte[] buffer) {
        int i2 = 0;
        for (byte b2 : buffer) {
            i2 ^= b2 & 255;
            for (int i3 = 0; i3 < 8; i3++) {
                i2 = (i2 & 1) != 0 ? ((i2 >> 1) & 255) ^ 140 : (i2 >> 1) & 255;
            }
        }
        return i2;
    }

    private static int d(final UUID uuid) {
        long mostSignificantBits = uuid.getMostSignificantBits();
        if (uuid.getLeastSignificantBits() == e && (4294967295L & mostSignificantBits) == 4096) {
            return (int) (mostSignificantBits >> 32);
        }
        return 0;
    }

    public static boolean enableBluetooth(boolean enable) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return false;
        }
        try {
            enable = enable ? defaultAdapter.enable() : defaultAdapter.disable();
            return enable;
        } catch (Exception e2) {
            Debug.fi(a, "enableBluetooth:" + enable + ",exception:" + e2.getMessage());
            return false;
        }
    }

    public static String formatUUID(UUID uuid) {
        String string = uuid.toString();
        if (!string.matches(c)) {
            return string;
        }
        return "0x" + string.substring(4, 8).toUpperCase(Locale.getDefault());
    }

    public static String getBluetoothDeviceName(BluetoothDevice device) {
        if (device == null) {
            return null;
        }
        try {
            return device.getName();
        } catch (Exception e2) {
            Debug.fi(a, "BluetoothDevice getName exception:" + e2.getMessage());
            return null;
        }
    }

    public static int getBluetoothDeviceType(BluetoothDevice device) {
        if (device == null) {
            Debug.fi(a, "getBluetoothDeviceType device is null!!!");
            return 0;
        }
        try {
            return device.getType();
        } catch (Exception e2) {
            Debug.fi(a, "BluetoothDevice getType exception:" + e2.getMessage());
            return 0;
        }
    }

    public static int getClientIf(BluetoothGatt gatt) {
        if (j == null) {
            try {
                Field declaredField = BluetoothGatt.class.getDeclaredField("mClientIf");
                j = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        }
        try {
            Field field = j;
            if (field != null) {
                return field.getInt(gatt);
            }
            return -1;
        } catch (Exception unused2) {
            return -1;
        }
    }

    public static List<BluetoothDevice> getConnectedGattDevice(Context context) {
        List<BluetoothDevice> connectedDevices;
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService(DeviceSettingApiImpl.META_KEY_BLUETOOTH);
        if (bluetoothManager == null) {
            return null;
        }
        try {
            connectedDevices = bluetoothManager.getConnectedDevices(7);
        } catch (Exception e2) {
            Debug.fi(a, "connected device:" + e2.toString());
            connectedDevices = null;
        }
        if (connectedDevices == null || connectedDevices.size() == 0) {
            Debug.fi(a, "no connected device");
            return null;
        }
        Iterator<BluetoothDevice> it2 = connectedDevices.iterator();
        while (it2.hasNext()) {
            Debug.fi(a, "connected device:" + it2.next());
        }
        return connectedDevices;
    }

    public static String getMacAddress(@Nullable BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return null;
        }
        return bluetoothDevice.getAddress();
    }

    public static BluetoothDevice getRemoteDevice(String address) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.getRemoteDevice(address);
        }
        return null;
    }

    public static boolean hasConnectedDevice(Context context, String address) {
        List<BluetoothDevice> connectedGattDevice = getConnectedGattDevice(context);
        if (connectedGattDevice != null && connectedGattDevice.size() != 0) {
            Iterator<BluetoothDevice> it2 = connectedGattDevice.iterator();
            while (it2.hasNext()) {
                if (it2.next().getAddress().equals(address)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static byte[] hexStringToBytes(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i2 = 0; i2 < str.length() / 2; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) Integer.parseInt(str.substring(i3, i3 + 2), 16);
        }
        return bArr;
    }

    public static byte[] intToBytes(int i2) {
        return numberToBytes(i2, 4);
    }

    public static boolean isBluetoothEnable() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    public static boolean isConnectableAdv(@Nullable AdvData advData) {
        return (advData == null || advData.rssi == 0 || (!advData.isGeneralDiscoverableMode() && !advData.isLimitedDiscoverableMode())) ? false : true;
    }

    public static boolean isSupportBle(Context context) {
        return BluetoothAdapter.getDefaultAdapter() != null && context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public static byte[] longToBytes(long i2) {
        return numberToBytes(i2, 8);
    }

    public static byte[] numberToBytes(long num, int bits) {
        byte[] bArr = new byte[bits];
        for (int i2 = 0; i2 < bits; i2++) {
            bArr[i2] = (byte) ((num >> (i2 * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] numberToBytesBE(long num, int bits) {
        byte[] bArr = new byte[bits];
        for (int i2 = 0; i2 < bits; i2++) {
            bArr[i2] = (byte) ((num >> (((bits - 1) - i2) * 8)) & 255);
        }
        return bArr;
    }

    public static String parsePermissions(int permissions) {
        StringBuilder sb = new StringBuilder();
        if ((permissions & 1) > 0) {
            sb.append("READ ");
        }
        if ((permissions & 2) > 0) {
            sb.append("READ_ENCRYPTED ");
        }
        if ((permissions & 4) > 0) {
            sb.append("READ_ENCRYPTED_MITM ");
        }
        if ((permissions & 16) > 0) {
            sb.append("WRITE ");
        }
        if ((permissions & 32) > 0) {
            sb.append("WRITE_ENCRYPTED ");
        }
        if ((permissions & 64) > 0) {
            sb.append("WRITE_ENCRYPTED_MITM ");
        }
        if ((permissions & 128) > 0) {
            sb.append("WRITE_SIGNED ");
        }
        if ((permissions & 256) > 0) {
            sb.append("WRITE_SIGNED_MITM ");
        }
        return sb.toString();
    }

    public static String parseProperties(int properties) {
        StringBuilder sb = new StringBuilder();
        if ((properties & 1) > 0) {
            sb.append("BROADCAST ");
        }
        if ((properties & 128) > 0) {
            sb.append("EXTENDED_PROPS ");
        }
        if ((properties & 32) > 0) {
            sb.append("INDICATE ");
        }
        if ((properties & 16) > 0) {
            sb.append("NOTIFY ");
        }
        if ((properties & 2) > 0) {
            sb.append("READ ");
        }
        if ((properties & 64) > 0) {
            sb.append("SIGNED_WRITE ");
        }
        if ((properties & 8) > 0) {
            sb.append("WRITE ");
        }
        if ((properties & 4) > 0) {
            sb.append("WRITE_NO_RESPONSE ");
        }
        return sb.toString();
    }

    public static String parseUUID(UUID uuid) {
        String string = uuid.toString();
        return string.matches(c) ? string.substring(4, 8) : string;
    }

    public static void printService(BluetoothGattService service) {
        StringBuilder sb = new StringBuilder();
        sb.append(service.getType() == 0 ? "Primary" : "Secondary");
        sb.append(" service: ");
        sb.append(parseUUID(service.getUuid()));
        Debug.fi(a, sb.toString());
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : service.getCharacteristics()) {
            Debug.fi(a, "  Characteristic: " + parseUUID(bluetoothGattCharacteristic.getUuid()));
            Debug.fi(a, "    - Properties: " + parseProperties(bluetoothGattCharacteristic.getProperties()));
            Iterator<BluetoothGattDescriptor> it2 = bluetoothGattCharacteristic.getDescriptors().iterator();
            while (it2.hasNext()) {
                Debug.fi(a, "    Descriptor: " + parseUUID(it2.next().getUuid()));
            }
        }
    }

    public static byte[] shortToBytes(short s) {
        return numberToBytes(s, 2);
    }

    public static UUID toUUID(final UUID uuid, int uuid16) {
        return c(uuid, (short) uuid16);
    }

    public static short toUUID16(final UUID uuid) {
        return (short) d(uuid);
    }

    public static UUID uuid(final byte[] data) {
        int length = data.length;
        if (length == 2) {
            return uuid16(String.format("%02x%02x", Byte.valueOf(data[0]), Byte.valueOf(data[1])));
        }
        if (length != 16) {
            return null;
        }
        return uuid128(String.format("%02x%02x%02x%02x", Byte.valueOf(data[0]), Byte.valueOf(data[1]), Byte.valueOf(data[2]), Byte.valueOf(data[3])) + String.format("-%02x%02x-%02x%02x", Byte.valueOf(data[4]), Byte.valueOf(data[5]), Byte.valueOf(data[6]), Byte.valueOf(data[7])) + String.format("-%02x%02x-%02x%02x", Byte.valueOf(data[8]), Byte.valueOf(data[9]), Byte.valueOf(data[10]), Byte.valueOf(data[11])) + String.format("%02x%02x%02x%02x", Byte.valueOf(data[12]), Byte.valueOf(data[13]), Byte.valueOf(data[14]), Byte.valueOf(data[15])));
    }

    public static UUID uuid128(int uuid16) {
        return c(i, (short) uuid16);
    }

    public static UUID uuid16(final String uuid16) {
        return UUID.fromString(String.format(b, uuid16));
    }

    public static void writeLE(byte[] data, int i2, short value) {
        data[i2] = (byte) (value & 255);
        data[i2 + 1] = (byte) ((value >> 8) & 255);
    }

    public static int bytesToInt(byte[] bytes, int offset, int len) {
        return (int) bytesToLong(bytes, offset, len);
    }

    public static int bytesToIntBE(byte[] bytes, int offset, int len) {
        return (int) bytesToLongBE(bytes, offset, len);
    }

    public static long bytesToLong(byte[] bytes, int offset, int len) {
        long j2 = 0;
        for (int i2 = 0; i2 < len; i2++) {
            j2 |= (((long) bytes[offset + i2]) & 255) << (i2 * 8);
        }
        return j2;
    }

    public static int bytesToSignedInt(byte[] bytes, int offset, int len) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < len) {
            i3 |= (i2 == len + (-1) ? bytes[offset + i2] : bytes[offset + i2] & 255) << (i2 * 8);
            i2++;
        }
        return i3;
    }

    public static int crc16(final byte[] buffer) {
        int i2 = 65535;
        for (byte b2 : buffer) {
            int i3 = (((i2 << 8) | (i2 >>> 8)) & 65535) ^ (b2 & 255);
            int i4 = i3 ^ ((i3 & 255) >> 4);
            int i5 = i4 ^ ((i4 << 12) & 65535);
            i2 = i5 ^ (((i5 & 255) << 5) & 65535);
        }
        return i2 & 65535;
    }

    public static UUID toUUID(short uuid16) {
        return b(uuid16 & UShort.MAX_VALUE);
    }

    public static UUID uuid128(final String uuid128) {
        return UUID.fromString(uuid128);
    }

    public static int crc16(final byte[] buffer, int start, int end) {
        if (start >= buffer.length || start > end) {
            return 0;
        }
        int i2 = 65535;
        while (start < end) {
            int i3 = (((i2 << 8) | (i2 >>> 8)) & 65535) ^ (buffer[start] & 255);
            int i4 = i3 ^ ((i3 & 255) >> 4);
            int i5 = i4 ^ ((i4 << 12) & 65535);
            i2 = i5 ^ (((i5 & 255) << 5) & 65535);
            start++;
        }
        return i2 & 65535;
    }

    public static void writeLE(byte[] data, int i2, int value) {
        int i3 = i2 + 1;
        data[i2] = (byte) (value & 255);
        int i4 = i3 + 1;
        data[i3] = (byte) ((value >> 8) & 255);
        data[i4] = (byte) ((value >> 16) & 255);
        data[i4 + 1] = (byte) ((value >> 24) & 255);
    }
}
