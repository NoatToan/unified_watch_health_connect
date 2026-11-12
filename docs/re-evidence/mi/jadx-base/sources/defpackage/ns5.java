package defpackage;

import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.miui.circulate.device.api.Constant;
import com.miui.tsmclient.util.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.onetrack.api.c;
import com.xiaomi.onetrack.b.e;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import com.xiaomi.smarthome.framework.api.UserConfig;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.util.Arrays;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes5.dex */
public final class ns5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f28313b = {"CTRL_PS", " ", "A", c.f13755a, "C", "D", "E", "F", "G", c.f13756b, "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public static final String[] c = {"CTRL_PS", " ", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, PluginDeviceInfo.FICONON, PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONOFFLINE, PluginDeviceInfo.FBLUETOOTHPAIR, PluginDeviceInfo.FLOCALIZATIONS, "h", "i", "j", Constant.KeyValue.KEY_COLUMN, e.f13808a, "m", "n", DeviceTagInterface.CUSTOM_TAG_DEVICE_TAG_ORDER, FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "q", "r", "s", DeviceTagInterface.CUSTOM_TAG_TYPE, "u", "v", Constants.DEVICE_TYPE_WEAR, "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    public static final String[] d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", gv5.CONNECT_VALUE_STR, "\\", "^", RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR, "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    public static final String[] e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX, "$", "%", gv5.CONNECT_STR, "'", "(", ")", Marker.ANY_MARKER, Marker.ANY_NON_NULL_MARKER, ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};
    public static final String[] f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", UserConfig.KEY_DEVICE_LITE_SORT_GROUP, "6", UserConfig.KEY_HOME_SCENE_FRAGMENT_TOP, UserConfig.KEY_MI_BRAIN_SETTING, UserConfig.KEY_LITE_SCENE_ORDER, ",", ".", "CTRL_UL", "CTRL_US"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public it1 f28314a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28315a;

        static {
            int[] iArr = new int[b.values().length];
            f28315a = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28315a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28315a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28315a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28315a[b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    public static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = h(zArr, i << 3);
        }
        return bArr;
    }

    public static String e(b bVar, int i) {
        int i2 = a.f28315a[bVar.ordinal()];
        if (i2 == 1) {
            return f28313b[i];
        }
        if (i2 == 2) {
            return c[i];
        }
        if (i2 == 3) {
            return d[i];
        }
        if (i2 == 4) {
            return e[i];
        }
        if (i2 == 5) {
            return f[i];
        }
        throw new IllegalStateException("Bad table");
    }

    public static String f(boolean[] zArr) {
        int length = zArr.length;
        b bVar = b.UPPER;
        StringBuilder sb = new StringBuilder(20);
        b bVarG = bVar;
        int i = 0;
        while (i < length) {
            if (bVar != b.BINARY) {
                int i2 = bVar == b.DIGIT ? 4 : 5;
                if (length - i < i2) {
                    break;
                }
                int i3 = i(zArr, i, i2);
                i += i2;
                String strE = e(bVar, i3);
                if (strE.startsWith("CTRL_")) {
                    bVarG = g(strE.charAt(5));
                    if (strE.charAt(6) != 'L') {
                        bVarG = bVar;
                        bVar = bVarG;
                    }
                } else {
                    sb.append(strE);
                }
                bVar = bVarG;
            } else {
                if (length - i < 5) {
                    break;
                }
                int i4 = i(zArr, i, 5);
                int i5 = i + 5;
                if (i4 == 0) {
                    if (length - i5 < 11) {
                        break;
                    }
                    i4 = i(zArr, i5, 11) + 31;
                    i5 = i + 16;
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= i4) {
                        i = i5;
                        break;
                    }
                    if (length - i5 < 8) {
                        i = length;
                        break;
                    }
                    sb.append((char) i(zArr, i5, 8));
                    i5 += 8;
                    i6++;
                }
                bVar = bVarG;
            }
        }
        return sb.toString();
    }

    public static b g(char c2) {
        if (c2 == 'B') {
            return b.BINARY;
        }
        if (c2 == 'D') {
            return b.DIGIT;
        }
        if (c2 == 'P') {
            return b.PUNCT;
        }
        if (c2 != 'L') {
            return c2 != 'M' ? b.UPPER : b.MIXED;
        }
        return b.LOWER;
    }

    public static byte h(boolean[] zArr, int i) {
        int length = zArr.length - i;
        return (byte) (length >= 8 ? i(zArr, i, 8) : i(zArr, i, length) << (8 - length));
    }

    public static int i(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    public static int j(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    public final boolean[] b(boolean[] zArr) throws FormatException {
        int i;
        cya cyaVar;
        if (this.f28314a.d() <= 2) {
            cyaVar = cya.j;
            i = 6;
        } else {
            i = 8;
            if (this.f28314a.d() <= 8) {
                cyaVar = cya.n;
            } else if (this.f28314a.d() <= 22) {
                cyaVar = cya.i;
                i = 10;
            } else {
                cyaVar = cya.h;
                i = 12;
            }
        }
        int iC = this.f28314a.c();
        int length = zArr.length / i;
        if (length < iC) {
            throw FormatException.getFormatInstance();
        }
        int length2 = zArr.length % i;
        int[] iArr = new int[length];
        int i2 = 0;
        while (i2 < length) {
            iArr[i2] = i(zArr, length2, i);
            i2++;
            length2 += i;
        }
        try {
            new uak(cyaVar).a(iArr, length - iC);
            int i3 = 1 << i;
            int i4 = i3 - 1;
            int i5 = 0;
            for (int i6 = 0; i6 < iC; i6++) {
                int i7 = iArr[i6];
                if (i7 == 0 || i7 == i4) {
                    throw FormatException.getFormatInstance();
                }
                if (i7 == 1 || i7 == i3 - 2) {
                    i5++;
                }
            }
            boolean[] zArr2 = new boolean[(iC * i) - i5];
            int i8 = 0;
            for (int i9 = 0; i9 < iC; i9++) {
                int i10 = iArr[i9];
                if (i10 == 1 || i10 == i3 - 2) {
                    Arrays.fill(zArr2, i8, (i8 + i) - 1, i10 > 1);
                    i8 += i - 1;
                } else {
                    int i11 = i - 1;
                    while (i11 >= 0) {
                        int i12 = i8 + 1;
                        zArr2[i8] = ((1 << i11) & i10) != 0;
                        i11--;
                        i8 = i12;
                    }
                }
            }
            return zArr2;
        } catch (ReedSolomonException e2) {
            throw FormatException.getFormatInstance(e2);
        }
    }

    public ts5 c(it1 it1Var) throws FormatException {
        this.f28314a = it1Var;
        boolean[] zArrB = b(d(it1Var.a()));
        ts5 ts5Var = new ts5(a(zArrB), f(zArrB), null, null);
        ts5Var.l(zArrB.length);
        return ts5Var;
    }

    public final boolean[] d(cp2 cp2Var) {
        boolean zE = this.f28314a.e();
        int iD = this.f28314a.d();
        int i = (zE ? 11 : 14) + (iD << 2);
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[j(iD, zE)];
        int i2 = 2;
        if (zE) {
            for (int i3 = 0; i3 < i; i3++) {
                iArr[i3] = i3;
            }
        } else {
            int i4 = i / 2;
            int i5 = ((i + 1) + (((i4 - 1) / 15) * 2)) / 2;
            for (int i6 = 0; i6 < i4; i6++) {
                int i7 = (i6 / 15) + i6;
                iArr[(i4 - i6) - 1] = (i5 - i7) - 1;
                iArr[i4 + i6] = i7 + i5 + 1;
            }
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < iD) {
            int i10 = ((iD - i8) << i2) + (zE ? 9 : 12);
            int i11 = i8 << 1;
            int i12 = (i - 1) - i11;
            int i13 = 0;
            while (i13 < i10) {
                int i14 = i13 << 1;
                int i15 = 0;
                while (i15 < i2) {
                    int i16 = i11 + i15;
                    int i17 = i11 + i13;
                    zArr[i9 + i14 + i15] = cp2Var.e(iArr[i16], iArr[i17]);
                    int i18 = iArr[i17];
                    int i19 = i12 - i15;
                    zArr[(i10 * 2) + i9 + i14 + i15] = cp2Var.e(i18, iArr[i19]);
                    int i20 = i12 - i13;
                    zArr[(i10 * 4) + i9 + i14 + i15] = cp2Var.e(iArr[i19], iArr[i20]);
                    zArr[(i10 * 6) + i9 + i14 + i15] = cp2Var.e(iArr[i20], iArr[i16]);
                    i15++;
                    iD = iD;
                    zE = zE;
                    i2 = 2;
                }
                i13++;
                i2 = 2;
            }
            i9 += i10 << 3;
            i8++;
            i2 = 2;
        }
        return zArr;
    }
}
