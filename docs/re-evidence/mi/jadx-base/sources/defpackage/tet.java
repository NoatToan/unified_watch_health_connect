package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.Data;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.xiaomi.digitalkey.wearable.utils.ConstUtils;
import com.xiaomi.smarthome.library.common.util.StringUtil;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class tet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UUID f34631a = F("2902");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UUID f34632b = F("2901");
    public static final String c = String.format(ConstUtils.UUID_BASE, "....");
    public static final int[] d = {0, 49345, 49537, 320, 49921, 960, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 49729, 50689, 1728, 1920, 51009, 1280, 50625, 50305, 1088, 52225, 3264, 3456, 52545, 3840, 53185, 52865, 3648, 2560, 51905, 52097, 2880, 51457, 2496, 2176, 51265, 55297, 6336, 6528, 55617, 6912, 56257, 55937, 6720, 7680, 57025, 57217, 8000, 56577, 7616, 7296, 56385, 5120, 54465, 54657, 5440, 55041, 6080, 5760, 54849, 53761, 4800, 4992, 54081, 4352, 53697, 53377, 4160, 61441, 12480, 12672, 61761, 13056, 62401, 62081, 12864, 13824, 63169, 63361, 14144, 62721, 13760, 13440, 62529, 15360, 64705, 64897, 15680, 65281, 16320, 16000, 65089, 64001, 15040, 15232, 64321, 14592, 63937, 63617, 14400, Data.MAX_DATA_BYTES, 59585, 59777, 10560, 60161, 11200, 10880, 59969, 60929, 11968, 12160, 61249, 11520, 60865, 60545, 11328, 58369, 9408, 9600, 58689, 9984, 59329, 59009, 9792, 8704, 58049, 58241, 9024, 57601, 8640, 8320, 57409, 40961, 24768, 24960, 41281, 25344, 41921, 41601, 25152, 26112, 42689, 42881, 26432, 42241, 26048, 25728, 42049, 27648, 44225, 44417, 27968, 44801, 28608, 28288, 44609, 43521, 27328, 27520, 43841, 26880, 43457, 43137, 26688, 30720, 47297, 47489, 31040, 47873, 31680, 31360, 47681, 48641, 32448, 32640, 48961, 32000, 48577, 48257, 31808, 46081, 29888, 30080, 46401, 30464, 47041, 46721, 30272, 29184, 45761, 45953, 29504, 45313, 29120, 28800, 45121, 20480, 37057, 37249, 20800, 37633, 21440, 21120, 37441, 38401, 22208, 22400, 38721, 21760, 38337, 38017, 21568, 39937, 23744, 23936, 40257, 24320, 40897, 40577, 24128, 23040, 39617, 39809, 23360, 39169, 22976, 22656, 38977, 34817, 18624, 18816, 35137, 19200, 35777, 35457, 19008, StringUtil.CHAR_CHINESE_START, 36545, 36737, 20288, 36097, 19904, 19584, 35905, 17408, 33985, 34177, 17728, 34561, 18368, 18048, 34369, 33281, 17088, 17280, 33601, 16640, 33217, 32897, 16448};
    public static final UUID e = new UUID(13586, 2384656044284446464L);
    public static UUID f = new UUID(303230942, 1523193452336828707L);
    public static UUID g = new UUID(-1152921504534413312L, -5764607523034234880L);
    public static Field h = null;

    public static String A(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return null;
        }
        return bluetoothDevice.getAddress();
    }

    public static String B(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    public static UUID C(int i) {
        return j(e, (short) i);
    }

    public static UUID D(String str) {
        return UUID.fromString(str);
    }

    public static int E(byte[] bArr) {
        int i = 0;
        for (byte b2 : bArr) {
            i ^= b2 & 255;
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = i & 1;
                i = (i >> 1) & 255;
                if (i3 != 0) {
                    i ^= 140;
                }
            }
        }
        return i;
    }

    public static UUID F(String str) {
        return UUID.fromString(String.format(ConstUtils.UUID_BASE, str));
    }

    public static int a(int i, byte[] bArr, int i2, int i3) {
        while (i2 < i3) {
            int i4 = (((i << 8) | (i >>> 8)) & 65535) ^ (bArr[i2] & 255);
            int i5 = i4 ^ ((i4 & 255) >> 4);
            int i6 = i5 ^ ((i5 << 12) & 65535);
            i = i6 ^ (65535 & ((i6 & 255) << 5));
            i2++;
        }
        return i;
    }

    public static int b(BluetoothGatt bluetoothGatt) {
        if (h == null) {
            try {
                Field declaredField = BluetoothGatt.class.getDeclaredField("mClientIf");
                h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
        }
        try {
            Field field = h;
            if (field != null) {
                return field.getInt(bluetoothGatt);
            }
            return -1;
        } catch (Exception unused2) {
            return -1;
        }
    }

    public static int c(byte[] bArr, int i) {
        return d(bArr, i, 4);
    }

    public static int d(byte[] bArr, int i, int i2) {
        return (int) v(bArr, i, i2);
    }

    public static BluetoothDevice e(String str) {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.getRemoteDevice(str);
        }
        return null;
    }

    public static String f(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return null;
        }
        try {
            return bluetoothDevice.getName();
        } catch (Exception e2) {
            t5t.d("GattUtils", "BluetoothDevice getName exception:" + e2.getMessage());
            return null;
        }
    }

    public static String g(UUID uuid) {
        String string = uuid.toString();
        return string.matches(c) ? string.substring(4, 8) : string;
    }

    public static String h(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return AbstractJsonLexerKt.NULL;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase();
    }

    public static List<BluetoothDevice> i(Context context) {
        List<BluetoothDevice> connectedDevices;
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        if (bluetoothManager == null) {
            return null;
        }
        try {
            connectedDevices = bluetoothManager.getConnectedDevices(7);
        } catch (Exception e2) {
            t5t.d("GattUtils", "connected device:" + e2.toString());
            connectedDevices = null;
        }
        if (connectedDevices == null || connectedDevices.size() == 0) {
            t5t.d("GattUtils", "no connected device");
            return null;
        }
        Iterator<BluetoothDevice> it = connectedDevices.iterator();
        while (it.hasNext()) {
            t5t.d("GattUtils", "connected device:" + it.next());
        }
        return connectedDevices;
    }

    public static UUID j(UUID uuid, short s) {
        return new UUID((uuid.getMostSignificantBits() & (-281470681743361L)) | ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32), uuid.getLeastSignificantBits());
    }

    public static void k(BluetoothGattService bluetoothGattService) {
        StringBuilder sb = new StringBuilder();
        sb.append(bluetoothGattService.getType() == 0 ? "Primary" : "Secondary");
        sb.append(" service: ");
        sb.append(g(bluetoothGattService.getUuid()));
        t5t.d("GattUtils", sb.toString());
        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
            t5t.d("GattUtils", "  Characteristic: " + g(bluetoothGattCharacteristic.getUuid()));
            t5t.d("GattUtils", "    - Properties: " + w(bluetoothGattCharacteristic.getProperties()));
            Iterator<BluetoothGattDescriptor> it = bluetoothGattCharacteristic.getDescriptors().iterator();
            while (it.hasNext()) {
                t5t.d("GattUtils", "    Descriptor: " + g(it.next().getUuid()));
            }
        }
    }

    public static void l(byte[] bArr, int i, short s) {
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    public static boolean m() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    public static boolean n(Context context, String str) {
        List<BluetoothDevice> listI = i(context);
        if (listI != null && listI.size() != 0) {
            Iterator<BluetoothDevice> it = listI.iterator();
            while (it.hasNext()) {
                if (it.next().getAddress().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean o(gdt gdtVar) {
        return (gdtVar == null || gdtVar.f18872b == 0 || (!gdtVar.d() && !gdtVar.e())) ? false : true;
    }

    public static byte[] p(int i) {
        return r(i, 4);
    }

    public static byte[] q(long j) {
        return r(j, 8);
    }

    public static byte[] r(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] s(short s) {
        return r(s, 2);
    }

    public static int t(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            t5t.d("GattUtils", "getBluetoothDeviceType device is null!!!");
            return 0;
        }
        try {
            return bluetoothDevice.getType();
        } catch (Exception e2) {
            t5t.d("GattUtils", "BluetoothDevice getType exception:" + e2.getMessage());
            return 0;
        }
    }

    public static long u(byte[] bArr, int i) {
        return v(bArr, i, 8);
    }

    public static long v(byte[] bArr, int i, int i2) {
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= (((long) bArr[i + i3]) & 255) << (i3 * 8);
        }
        return j;
    }

    public static String w(int i) {
        StringBuilder sb = new StringBuilder();
        if ((i & 1) > 0) {
            sb.append("BROADCAST ");
        }
        if ((i & 128) > 0) {
            sb.append("EXTENDED_PROPS ");
        }
        if ((i & 32) > 0) {
            sb.append("INDICATE ");
        }
        if ((i & 16) > 0) {
            sb.append("NOTIFY ");
        }
        if ((i & 2) > 0) {
            sb.append("READ ");
        }
        if ((i & 64) > 0) {
            sb.append("SIGNED_WRITE ");
        }
        if ((i & 8) > 0) {
            sb.append("WRITE ");
        }
        if ((i & 4) > 0) {
            sb.append("WRITE_NO_RESPONSE ");
        }
        return sb.toString();
    }

    public static String x(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return AbstractJsonLexerKt.NULL;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(String.format("%02x ", Byte.valueOf(b2)));
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static byte[] y(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < str.length() / 2; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    public static Number z(byte[] bArr, int i, int i2) {
        boolean z = (bArr[(i + i2) - 1] & 128) > 0;
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= (255 & ((long) (z ? ~bArr[i + i3] : bArr[i + i3]))) << (i3 * 8);
        }
        if (z) {
            j = (-j) - 1;
        }
        return Long.valueOf(j);
    }
}
