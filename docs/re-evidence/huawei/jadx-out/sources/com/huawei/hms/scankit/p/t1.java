package com.huawei.hms.scankit.p;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amap.api.col.p0003sl.jt;
import com.huawei.health.suggestion.h5pro.AudioConstant;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.hiai.awareness.AwarenessConstants;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hihealth.model.SampleEvent;
import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.main.stories.nps.interactors.mode.TypeParams;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Map;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes34.dex */
public final class t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f16326b = {"CTRL_PS", " ", "A", "B", TypeParams.SEARCH_CODE, "D", ExifInterface.LONGITUDE_EAST, AudioConstant.WOMAN, "G", "H", "I", RequestOptions.AD_CONTENT_CLASSIFICATION_J, "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, WatchFaceProvider.POSITION_LABEL_U, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f16327c = {"CTRL_PS", " ", "a", "b", "c", "d", FitRunPlayAudio.OPPORTUNITY_E, "f", jt.f, "h", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "j", "k", CmcdData.Factory.STREAM_TYPE_LIVE, FitRunPlayAudio.OPPORTUNITY_M, "n", "o", "p", "q", "r", "s", FitRunPlayAudio.PLAY_TYPE_T, "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};
    private static final String[] d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", AwarenessConstants.SECOND_ACTION_SPLITE_TAG, "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};
    private static final String[] e = {"", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", SampleEvent.SEPARATOR, "%", "&", "'", Constants.LEFT_BRACKET_ONLY, Constants.RIGHT_BRACKET_ONLY, "*", Marker.ANY_NON_NULL_MARKER, ",", com.huawei.openalliance.ad.constant.Constants.LINK, ".", "/", ":", ";", HiDataFilter.DataFilterExpression.LESS_THAN, "=", HiDataFilter.DataFilterExpression.BIGGER_THAN, "?", "[", "]", "{", "}", "CTRL_UL"};
    private static final String[] f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f16328a;

    static abstract /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16329a;

        static {
            int[] iArr = new int[b.values().length];
            f16329a = iArr;
            try {
                iArr[b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16329a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16329a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16329a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16329a[b.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    private static int a(int i, boolean z) {
        return ((z ? 88 : 112) + (i * 16)) * i;
    }

    private boolean[] b(boolean[] zArr) throws com.huawei.hms.scankit.p.a {
        int i;
        o3 o3Var;
        g gVar = this.f16328a;
        if (gVar != null) {
            if (gVar.f() <= 2) {
                o3Var = o3.j;
                i = 6;
            } else {
                i = 8;
                if (this.f16328a.f() <= 8) {
                    o3Var = o3.n;
                } else if (this.f16328a.f() <= 22) {
                    o3Var = o3.i;
                    i = 10;
                } else {
                    o3Var = o3.h;
                    i = 12;
                }
            }
            int iE = this.f16328a.e();
            int length = zArr.length / i;
            if (length >= iE) {
                int length2 = zArr.length % i;
                int[] iArr = new int[length];
                int i2 = 0;
                while (i2 < length) {
                    iArr[i2] = a(zArr, length2, i);
                    i2++;
                    length2 += i;
                }
                try {
                    new p6(o3Var).a(iArr, length - iE);
                    return a(iE, i, iArr);
                } catch (com.huawei.hms.scankit.p.a e2) {
                    throw com.huawei.hms.scankit.p.a.a(e2.getMessage());
                }
            }
            throw com.huawei.hms.scankit.p.a.a();
        }
        throw com.huawei.hms.scankit.p.a.a();
    }

    static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = a(zArr, i * 8);
        }
        return bArr;
    }

    public x1 a(g gVar, Map map) throws com.huawei.hms.scankit.p.a {
        this.f16328a = gVar;
        boolean[] zArrB = b(a(gVar.a()));
        x1 x1Var = new x1(a(zArrB), a(zArrB, map), null, null);
        x1Var.a(zArrB.length);
        return x1Var;
    }

    private boolean[] a(int i, int i2, int[] iArr) throws com.huawei.hms.scankit.p.a {
        int i3 = 1 << i2;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = iArr[i5];
            if (i6 == 0 || i6 == i3 - 1) {
                throw com.huawei.hms.scankit.p.a.a();
            }
            if (i6 == 1 || i6 == i3 - 2) {
                i4++;
            }
        }
        boolean[] zArr = new boolean[(i * i2) - i4];
        int i7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = iArr[i8];
            if (i9 == 1 || i9 == i3 - 2) {
                Arrays.fill(zArr, i7, (i7 + i2) - 1, i9 > 1);
                i7 += i2 - 1;
            } else {
                int i10 = i2 - 1;
                while (i10 >= 0) {
                    zArr[i7] = ((1 << i10) & i9) != 0;
                    i10--;
                    i7++;
                }
            }
        }
        return zArr;
    }

    private static StringBuilder a(boolean[] zArr, b bVar, b bVar2) {
        int length = zArr.length;
        StringBuilder sb = new StringBuilder(20);
        int i = 0;
        loop0: while (true) {
            b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
            while (i < length) {
                if (bVar != b.BINARY) {
                    int i2 = bVar == b.DIGIT ? 4 : 5;
                    if (length - i < i2) {
                        break loop0;
                    }
                    int iA = a(zArr, i, i2);
                    i += i2;
                    String strA = a(bVar, iA);
                    if (strA.startsWith("CTRL_")) {
                        bVar2 = a(strA.charAt(5));
                        if (strA.charAt(6) == 'L') {
                        }
                    } else {
                        sb.append(strA);
                    }
                    bVar = bVar2;
                } else {
                    if (length - i < 5) {
                        break loop0;
                    }
                    int iA2 = a(zArr, i, 5);
                    int i3 = i + 5;
                    if (iA2 == 0) {
                        if (length - i3 < 11) {
                            break loop0;
                        }
                        iA2 = a(zArr, i3, 11) + 31;
                        i3 = i + 16;
                    }
                    int i4 = 0;
                    while (true) {
                        if (i4 >= iA2) {
                            i = i3;
                            break;
                        }
                        if (length - i3 < 8) {
                            i = length;
                            break;
                        }
                        sb.append((char) a(zArr, i3, 8));
                        i3 += 8;
                        i4++;
                    }
                    bVar = bVar2;
                }
            }
            break loop0;
        }
        return sb;
    }

    private boolean[] a(s sVar) {
        g gVar = this.f16328a;
        boolean z = gVar != null && gVar.g();
        g gVar2 = this.f16328a;
        int iF = gVar2 != null ? gVar2.f() : 0;
        int i = (z ? 11 : 14) + (iF * 4);
        int[] iArr = new int[i];
        boolean[] zArr = new boolean[a(iF, z)];
        int i2 = 2;
        if (z) {
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
        while (i8 < iF) {
            int i10 = ((iF - i8) * 4) + (z ? 9 : 12);
            int i11 = i8 * 2;
            int i12 = (i - 1) - i11;
            int i13 = 0;
            while (i13 < i10) {
                int i14 = i13 * 2;
                int i15 = 0;
                while (i15 < i2) {
                    int i16 = i11 + i15;
                    int i17 = i11 + i13;
                    zArr[i9 + i14 + i15] = sVar.b(iArr[i16], iArr[i17]);
                    int i18 = i12 - i15;
                    zArr[(i10 * 2) + i9 + i14 + i15] = sVar.b(iArr[i17], iArr[i18]);
                    int i19 = i12 - i13;
                    zArr[(i10 * 4) + i9 + i14 + i15] = sVar.b(iArr[i18], iArr[i19]);
                    zArr[(i10 * 6) + i9 + i14 + i15] = sVar.b(iArr[i19], iArr[i16]);
                    i15++;
                    i2 = 2;
                }
                i13++;
                i2 = 2;
            }
            i9 += i10 * 8;
            i8++;
            i2 = 2;
        }
        return zArr;
    }

    private static String a(boolean[] zArr, Map map) throws com.huawei.hms.scankit.p.a {
        b bVar = b.UPPER;
        StringBuilder sbA = a(zArr, bVar, bVar);
        int length = sbA.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) sbA.charAt(i);
        }
        try {
            return new String(bArr, c7.a(bArr, map));
        } catch (UnsupportedEncodingException unused) {
            throw com.huawei.hms.scankit.p.a.a();
        }
    }

    private static b a(char c2) {
        if (c2 == 'B') {
            return b.BINARY;
        }
        if (c2 == 'D') {
            return b.DIGIT;
        }
        if (c2 == 'P') {
            return b.PUNCT;
        }
        if (c2 == 'L') {
            return b.LOWER;
        }
        if (c2 != 'M') {
            return b.UPPER;
        }
        return b.MIXED;
    }

    private static byte a(boolean[] zArr, int i) {
        int iA;
        int length = zArr.length - i;
        if (length >= 8) {
            iA = a(zArr, i, 8);
        } else {
            iA = a(zArr, i, length) << (8 - length);
        }
        return (byte) iA;
    }

    private static int a(boolean[] zArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 <<= 1;
            if (zArr[i4]) {
                i3 |= 1;
            }
        }
        return i3;
    }

    private static String a(b bVar, int i) {
        int i2 = a.f16329a[bVar.ordinal()];
        if (i2 == 1) {
            return f16326b[i];
        }
        if (i2 == 2) {
            return f16327c[i];
        }
        if (i2 == 3) {
            return d[i];
        }
        if (i2 == 4) {
            return e[i];
        }
        if (i2 != 5) {
            throw new IllegalStateException("Bad table");
        }
        return f[i];
    }
}
