package com.xiaomi.wearable.utils;

import androidx.work.Data;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.xiaomi.smarthome.library.common.util.StringUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0018\u0010\u0007\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0007J\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/wearable/utils/CRCUtil;", "", "<init>", "()V", "TABLE_16", "", "TABLE_32", "CRC16", "", "bytes", "", "len", "CRC32", "bytes1", "bytes2", "CRC32ToInt", "getFileCRC32", "", "prefix", "filePath", "", "seekPosition", "RandomAccessFileInputStream", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCRCUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CRCUtil.kt\ncom/xiaomi/wearable/utils/CRCUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
public final class CRCUtil {

    @NotNull
    public static final CRCUtil INSTANCE = new CRCUtil();

    @NotNull
    private static final int[] TABLE_16 = {0, 49345, 49537, 320, 49921, 960, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 49729, 50689, 1728, 1920, 51009, 1280, 50625, 50305, 1088, 52225, 3264, 3456, 52545, 3840, 53185, 52865, 3648, 2560, 51905, 52097, 2880, 51457, 2496, 2176, 51265, 55297, 6336, 6528, 55617, 6912, 56257, 55937, 6720, 7680, 57025, 57217, 8000, 56577, 7616, 7296, 56385, 5120, 54465, 54657, 5440, 55041, 6080, 5760, 54849, 53761, 4800, 4992, 54081, 4352, 53697, 53377, 4160, 61441, 12480, 12672, 61761, 13056, 62401, 62081, 12864, 13824, 63169, 63361, 14144, 62721, 13760, 13440, 62529, 15360, 64705, 64897, 15680, 65281, 16320, 16000, 65089, 64001, 15040, 15232, 64321, 14592, 63937, 63617, 14400, Data.MAX_DATA_BYTES, 59585, 59777, 10560, 60161, 11200, 10880, 59969, 60929, 11968, 12160, 61249, 11520, 60865, 60545, 11328, 58369, 9408, 9600, 58689, 9984, 59329, 59009, 9792, 8704, 58049, 58241, 9024, 57601, 8640, 8320, 57409, 40961, 24768, 24960, 41281, 25344, 41921, 41601, 25152, 26112, 42689, 42881, 26432, 42241, 26048, 25728, 42049, 27648, 44225, 44417, 27968, 44801, 28608, 28288, 44609, 43521, 27328, 27520, 43841, 26880, 43457, 43137, 26688, 30720, 47297, 47489, 31040, 47873, 31680, 31360, 47681, 48641, 32448, 32640, 48961, 32000, 48577, 48257, 31808, 46081, 29888, 30080, 46401, 30464, 47041, 46721, 30272, 29184, 45761, 45953, 29504, 45313, 29120, 28800, 45121, 20480, 37057, 37249, 20800, 37633, 21440, 21120, 37441, 38401, 22208, 22400, 38721, 21760, 38337, 38017, 21568, 39937, 23744, 23936, 40257, 24320, 40897, 40577, 24128, 23040, 39617, 39809, 23360, 39169, 22976, 22656, 38977, 34817, 18624, 18816, 35137, 19200, 35777, 35457, 19008, StringUtil.CHAR_CHINESE_START, 36545, 36737, 20288, 36097, 19904, 19584, 35905, 17408, 33985, 34177, 17728, 34561, 18368, 18048, 34369, 33281, 17088, 17280, 33601, 16640, 33217, 32897, 16448};

    @NotNull
    private static final int[] TABLE_32 = {0, 1996959894, -301047508, -1727442502, 124634137, 1886057615, -379345611, -1637575261, 249268274, 2044508324, -522852066, -1747789432, 162941995, 2125561021, -407360249, -1866523247, 498536548, 1789927666, -205950648, -2067906082, 450548861, 1843258603, -187386543, -2083289657, 325883990, 1684777152, -43845254, -1973040660, 335633487, 1661365465, -99664541, -1928851979, 997073096, 1281953886, -715111964, -1570279054, 1006888145, 1258607687, -770865667, -1526024853, 901097722, 1119000684, -608450090, -1396901568, 853044451, 1172266101, -589951537, -1412350631, 651767980, 1373503546, -925412992, -1076862698, 565507253, 1454621731, -809855591, -1195530993, 671266974, 1594198024, -972236366, -1324619484, 795835527, 1483230225, -1050600021, -1234817731, 1994146192, 31158534, -1731059524, -271249366, 1907459465, 112637215, -1614814043, -390540237, 2013776290, 251722036, -1777751922, -519137256, 2137656763, 141376813, -1855689577, -429695999, 1802195444, 476864866, -2056965928, -228458418, 1812370925, 453092731, -2113342271, -183516073, 1706088902, 314042704, -1950435094, -54949764, 1658658271, 366619977, -1932296973, -69972891, 1303535960, 984961486, -1547960204, -725929758, 1256170817, 1037604311, -1529756563, -740887301, 1131014506, 879679996, -1385723834, -631195440, 1141124467, 855842277, -1442165665, -586318647, 1342533948, 654459306, -1106571248, -921952122, 1466479909, 544179635, -1184443383, -832445281, 1591671054, 702138776, -1328506846, -942167884, 1504918807, 783551873, -1212326853, -1061524307, -306674912, -1698712650, 62317068, 1957810842, -355121351, -1647151185, 81470997, 1943803523, -480048366, -1805370492, 225274430, 2053790376, -468791541, -1828061283, 167816743, 2097651377, -267414716, -2029476910, 503444072, 1762050814, -144550051, -2140837941, 426522225, 1852507879, -19653770, -1982649376, 282753626, 1742555852, -105259153, -1900089351, 397917763, 1622183637, -690576408, -1580100738, 953729732, 1340076626, -776247311, -1497606297, 1068828381, 1219638859, -670225446, -1358292148, 906185462, 1090812512, -547295293, -1469587627, 829329135, 1181335161, -882789492, -1134132454, 628085408, 1382605366, -871598187, -1156888829, 570562233, 1426400815, -977650754, -1296233688, 733239954, 1555261956, -1026031705, -1244606671, 752459403, 1541320221, -1687895376, -328994266, 1969922972, 40735498, -1677130071, -351390145, 1913087877, 83908371, -1782625662, -491226604, 2075208622, 213261112, -1831694693, -438977011, 2094854071, 198958881, -2032938284, -237706686, 1759359992, 534414190, -2118248755, -155638181, 1873836001, 414664567, -2012718362, -15766928, 1711684554, 285281116, -1889165569, -127750551, 1634467795, 376229701, -1609899400, -686959890, 1308918612, 956543938, -1486412191, -799009033, 1231636301, 1047427035, -1362007478, -640263460, 1088359270, 936918000, -1447252397, -558129467, 1202900863, 817233897, -1111625188, -893730166, 1404277552, 615818150, -1160759803, -841546093, 1423857449, 601450431, -1285129682, -1000256840, 1567103746, 711928724, -1274298825, -1022587231, 1510334235, 755167117};

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/wearable/utils/CRCUtil$RandomAccessFileInputStream;", "Ljava/io/InputStream;", "randomAccessFile", "Ljava/io/RandomAccessFile;", "<init>", "(Ljava/io/RandomAccessFile;)V", "getRandomAccessFile", "()Ljava/io/RandomAccessFile;", "read", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RandomAccessFileInputStream extends InputStream {

        @NotNull
        private final RandomAccessFile randomAccessFile;

        public RandomAccessFileInputStream(@NotNull RandomAccessFile randomAccessFile) {
            Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
            this.randomAccessFile = randomAccessFile;
        }

        @NotNull
        public final RandomAccessFile getRandomAccessFile() {
            return this.randomAccessFile;
        }

        @Override // java.io.InputStream
        public int read() {
            return this.randomAccessFile.read();
        }
    }

    private CRCUtil() {
    }

    @JvmStatic
    @NotNull
    public static final byte[] CRC32(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i = -1;
        for (byte b2 : bytes) {
            i = TABLE_32[(i ^ b2) & 255] ^ (i >>> 8);
        }
        return ByteUtil.fromInt(~i);
    }

    @JvmStatic
    public static final int CRC32ToInt(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i = -1;
        for (byte b2 : bytes) {
            i = TABLE_32[(i ^ b2) & 255] ^ (i >>> 8);
        }
        return ~i;
    }

    @JvmStatic
    public static final long getFileCRC32(@NotNull byte[] prefix, @NotNull String filePath) throws IOException {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        CRC32 crc32 = new CRC32();
        crc32.update(prefix);
        CheckedInputStream checkedInputStream = new CheckedInputStream(fileInputStream, crc32);
        while (checkedInputStream.read() != -1) {
        }
        checkedInputStream.close();
        return crc32.getValue();
    }

    @NotNull
    public final byte[] CRC16(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i = 0;
        for (byte b2 : bytes) {
            i = TABLE_16[(i ^ b2) & 255] ^ (i >>> 8);
        }
        return ByteUtil.fromShort((short) i);
    }

    @JvmStatic
    public static final int CRC16(int len, @NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i = 0;
        for (int i2 = 0; i2 < len; i2++) {
            i = TABLE_16[(i ^ bytes[i2]) & 255] ^ (i >>> 8);
        }
        return i;
    }

    @JvmStatic
    @NotNull
    public static final byte[] CRC32(@NotNull byte[] bytes1, @NotNull byte[] bytes2) {
        Intrinsics.checkNotNullParameter(bytes1, "bytes1");
        Intrinsics.checkNotNullParameter(bytes2, "bytes2");
        int i = -1;
        for (byte b2 : bytes1) {
            i = TABLE_32[(i ^ b2) & 255] ^ (i >>> 8);
        }
        for (byte b3 : bytes2) {
            i = (i >>> 8) ^ TABLE_32[(b3 ^ i) & 255];
        }
        return ByteUtil.fromInt(~i);
    }

    @JvmStatic
    public static final long getFileCRC32(@NotNull byte[] prefix, int seekPosition, @NotNull String filePath) throws IOException {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(filePath), "r");
        CRC32 crc32 = new CRC32();
        crc32.update(prefix);
        randomAccessFile.seek(seekPosition);
        byte[] bArr = new byte[1024];
        while (true) {
            int i = randomAccessFile.read(bArr);
            if (i != -1) {
                crc32.update(bArr, 0, i);
            } else {
                return crc32.getValue();
            }
        }
    }

    public final int CRC32(int len, @NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i = -1;
        for (int i2 = 0; i2 < len; i2++) {
            i = (i >>> 8) ^ TABLE_32[(bytes[i2] & 255) ^ (i & 255)];
        }
        return ~i;
    }
}
