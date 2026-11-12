package defpackage;

import androidx.media3.extractor.ts.TsExtractor;
import com.google.common.base.Ascii;
import com.huawei.hms.kit.awareness.barrier.internal.e.a;
import com.huawei.hms.network.okhttp.PublicSuffixDatabase;
import com.huawei.operation.share.HiHealthError;
import java.lang.reflect.Array;
import net.lingala.zip4j.exception.ZipException;
import okio.Utf8;

/* JADX INFO: loaded from: classes20.dex */
public class zor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f54407c;
    private int d;
    private int f;
    private int g;
    private int[][] h = null;
    private int j;
    private static final byte[] e = {99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 103, 43, -2, -41, -85, 118, -54, -126, -55, 125, -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 114, -64, -73, -3, -109, 38, 54, Utf8.REPLACEMENT_BYTE, -9, -52, 52, -91, -27, -15, 113, -40, 49, Ascii.NAK, 4, -57, 35, -61, Ascii.CAN, -106, 5, -102, 7, 18, -128, -30, -21, 39, -78, 117, 9, -125, 44, Ascii.SUB, Ascii.ESC, 110, 90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 83, -47, 0, -19, 32, -4, -79, 91, 106, -53, -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 67, 77, 51, -123, 69, -7, 2, Ascii.DEL, 80, 60, -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, -68, -74, -38, PublicSuffixDatabase.i, 16, -1, -13, -46, -51, 12, 19, -20, 95, -105, 68, Ascii.ETB, -60, -89, 126, 61, 100, 93, Ascii.EM, 115, 96, -127, 79, -36, 34, 42, -112, -120, 70, -18, -72, Ascii.DC4, -34, 94, 11, -37, -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, -82, 8, -70, 120, 37, 46, Ascii.FS, -90, -76, -58, -24, -35, 116, Ascii.US, 75, -67, -117, -118, 112, 62, -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, -122, -63, Ascii.GS, -98, -31, -8, -104, 17, 105, -39, -114, -108, -101, Ascii.RS, -121, -23, -50, 85, 40, -33, -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 45, 15, -80, 84, -69, Ascii.SYN};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f54406b = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, 216, 171, 77, 154, 47, 94, TsExtractor.TS_PACKET_SIZE, 99, 198, HiHealthError.ERR_WRONG_DEVICE, 53, 106, a.K, 179, 125, 250, 239, 197, 145};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f54405a = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};

    private int e(int i, int i2) {
        return (i >>> i2) | (i << (-i2));
    }

    public zor(byte[] bArr) throws ZipException {
        e(bArr);
    }

    private void e(byte[] bArr) throws ZipException {
        this.h = c(bArr);
    }

    private int[][] c(byte[] bArr) throws ZipException {
        int length = bArr.length / 4;
        if ((length != 4 && length != 6 && length != 8) || length * 4 != bArr.length) {
            throw new ZipException("invalid key length (not 128/192/256)");
        }
        this.f = length + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, length + 7, 4);
        int i = 0;
        int i2 = 0;
        while (i < bArr.length) {
            iArr[i2 >> 2][i2 & 3] = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << Ascii.CAN);
            i += 4;
            i2++;
        }
        int i3 = this.f;
        for (int i4 = length; i4 < ((i3 + 1) << 2); i4++) {
            int i5 = i4 - 1;
            int iA = iArr[i5 >> 2][i5 & 3];
            int i6 = i4 % length;
            if (i6 == 0) {
                iA = a(e(iA, 8)) ^ f54406b[(i4 / length) - 1];
            } else if (length > 6 && i6 == 4) {
                iA = a(iA);
            }
            int i7 = i4 - length;
            iArr[i4 >> 2][i4 & 3] = iA ^ iArr[i7 >> 2][i7 & 3];
        }
        return iArr;
    }

    public int c(byte[] bArr, byte[] bArr2) throws ZipException {
        return b(bArr, 0, bArr2, 0);
    }

    public int b(byte[] bArr, int i, byte[] bArr2, int i2) throws ZipException {
        if (this.h == null) {
            throw new ZipException("AES engine not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new ZipException("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new ZipException("output buffer too short");
        }
        a(bArr, i);
        d(this.h);
        d(bArr2, i2);
        return 16;
    }

    private void a(byte[] bArr, int i) {
        this.d = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | (bArr[i + 3] << Ascii.CAN);
        this.f54407c = (bArr[i + 4] & 255) | ((bArr[i + 5] & 255) << 8) | ((bArr[i + 6] & 255) << 16) | (bArr[i + 7] << Ascii.CAN);
        this.j = (bArr[i + 8] & 255) | ((bArr[i + 9] & 255) << 8) | ((bArr[i + 10] & 255) << 16) | (bArr[i + 11] << Ascii.CAN);
        this.g = (bArr[i + 15] << Ascii.CAN) | (bArr[i + 12] & 255) | ((bArr[i + 13] & 255) << 8) | ((bArr[i + 14] & 255) << 16);
    }

    private void d(byte[] bArr, int i) {
        int i2 = this.d;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
        int i3 = this.f54407c;
        bArr[i + 4] = (byte) i3;
        bArr[i + 5] = (byte) (i3 >> 8);
        bArr[i + 6] = (byte) (i3 >> 16);
        bArr[i + 7] = (byte) (i3 >> 24);
        int i4 = this.j;
        bArr[i + 8] = (byte) i4;
        bArr[i + 9] = (byte) (i4 >> 8);
        bArr[i + 10] = (byte) (i4 >> 16);
        bArr[i + 11] = (byte) (i4 >> 24);
        int i5 = this.g;
        bArr[i + 12] = (byte) i5;
        bArr[i + 13] = (byte) (i5 >> 8);
        bArr[i + 14] = (byte) (i5 >> 16);
        bArr[i + 15] = (byte) (i5 >> 24);
    }

    private void d(int[][] iArr) {
        int i = this.d;
        int[] iArr2 = iArr[0];
        this.d = i ^ iArr2[0];
        this.f54407c ^= iArr2[1];
        char c2 = 2;
        this.j ^= iArr2[2];
        this.g ^= iArr2[3];
        int i2 = 1;
        while (i2 < this.f - 1) {
            int[] iArr3 = f54405a;
            int iE = (((iArr3[this.d & 255] ^ e(iArr3[(this.f54407c >> 8) & 255], 24)) ^ e(iArr3[(this.j >> 16) & 255], 16)) ^ e(iArr3[(this.g >> 24) & 255], 8)) ^ iArr[i2][0];
            int iE2 = (((iArr3[this.f54407c & 255] ^ e(iArr3[(this.j >> 8) & 255], 24)) ^ e(iArr3[(this.g >> 16) & 255], 16)) ^ e(iArr3[(this.d >> 24) & 255], 8)) ^ iArr[i2][1];
            int iE3 = (((iArr3[this.j & 255] ^ e(iArr3[(this.g >> 8) & 255], 24)) ^ e(iArr3[(this.d >> 16) & 255], 16)) ^ e(iArr3[(this.f54407c >> 24) & 255], 8)) ^ iArr[i2][c2];
            int i3 = i2 + 1;
            int iE4 = (e(iArr3[(this.j >> 24) & 255], 8) ^ ((iArr3[this.g & 255] ^ e(iArr3[(this.d >> 8) & 255], 24)) ^ e(iArr3[(this.f54407c >> 16) & 255], 16))) ^ iArr[i2][3];
            this.d = (((iArr3[iE & 255] ^ e(iArr3[(iE2 >> 8) & 255], 24)) ^ e(iArr3[(iE3 >> 16) & 255], 16)) ^ e(iArr3[(iE4 >> 24) & 255], 8)) ^ iArr[i3][0];
            this.f54407c = (((iArr3[iE2 & 255] ^ e(iArr3[(iE3 >> 8) & 255], 24)) ^ e(iArr3[(iE4 >> 16) & 255], 16)) ^ e(iArr3[(iE >> 24) & 255], 8)) ^ iArr[i3][1];
            this.j = (((iArr3[iE3 & 255] ^ e(iArr3[(iE4 >> 8) & 255], 24)) ^ e(iArr3[(iE >> 16) & 255], 16)) ^ e(iArr3[(iE2 >> 24) & 255], 8)) ^ iArr[i3][2];
            i2 += 2;
            this.g = (e(iArr3[(iE3 >> 24) & 255], 8) ^ ((iArr3[iE4 & 255] ^ e(iArr3[(iE >> 8) & 255], 24)) ^ e(iArr3[(iE2 >> 16) & 255], 16))) ^ iArr[i3][3];
            c2 = 2;
        }
        int[] iArr4 = f54405a;
        int iE5 = (((iArr4[this.d & 255] ^ e(iArr4[(this.f54407c >> 8) & 255], 24)) ^ e(iArr4[(this.j >> 16) & 255], 16)) ^ e(iArr4[(this.g >> 24) & 255], 8)) ^ iArr[i2][0];
        int iE6 = (((iArr4[this.f54407c & 255] ^ e(iArr4[(this.j >> 8) & 255], 24)) ^ e(iArr4[(this.g >> 16) & 255], 16)) ^ e(iArr4[(this.d >> 24) & 255], 8)) ^ iArr[i2][1];
        int iE7 = (((iArr4[this.j & 255] ^ e(iArr4[(this.g >> 8) & 255], 24)) ^ e(iArr4[(this.d >> 16) & 255], 16)) ^ e(iArr4[(this.f54407c >> 24) & 255], 8)) ^ iArr[i2][2];
        int i4 = iArr4[this.g & 255];
        int iE8 = e(iArr4[(this.d >> 8) & 255], 24);
        int iE9 = (e(iArr4[(this.j >> 24) & 255], 8) ^ ((i4 ^ iE8) ^ e(iArr4[(this.f54407c >> 16) & 255], 16))) ^ iArr[i2][3];
        byte[] bArr = e;
        byte b2 = bArr[iE5 & 255];
        byte b3 = bArr[(iE6 >> 8) & 255];
        byte b4 = bArr[(iE7 >> 16) & 255];
        byte b5 = bArr[(iE9 >> 24) & 255];
        int[] iArr5 = iArr[i2 + 1];
        this.d = iArr5[0] ^ ((b5 << Ascii.CAN) ^ (((b2 & 255) ^ ((b3 & 255) << 8)) ^ ((b4 & 255) << 16)));
        this.f54407c = ((((bArr[iE6 & 255] & 255) ^ ((bArr[(iE7 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iE9 >> 16) & 255] & 255) << 16)) ^ (bArr[(iE5 >> 24) & 255] << Ascii.CAN)) ^ iArr5[1];
        this.j = ((((bArr[iE7 & 255] & 255) ^ ((bArr[(iE9 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iE5 >> 16) & 255] & 255) << 16)) ^ (bArr[(iE6 >> 24) & 255] << Ascii.CAN)) ^ iArr5[2];
        this.g = iArr5[3] ^ ((((bArr[iE9 & 255] & 255) ^ ((bArr[(iE5 >> 8) & 255] & 255) << 8)) ^ ((bArr[(iE6 >> 16) & 255] & 255) << 16)) ^ (bArr[(iE7 >> 24) & 255] << Ascii.CAN));
    }

    private int a(int i) {
        byte[] bArr = e;
        return (bArr[(i >> 24) & 255] << Ascii.CAN) | (bArr[i & 255] & 255) | ((bArr[(i >> 8) & 255] & 255) << 8) | ((bArr[(i >> 16) & 255] & 255) << 16);
    }
}
