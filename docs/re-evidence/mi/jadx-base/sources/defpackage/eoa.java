package defpackage;

import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class eoa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h2e f16872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f16873b;
    public int[] c;
    public int[] d;
    public int[] e;
    public short f;
    public short g;
    public int h;
    public int[] i;

    public eoa(h2e h2eVar) {
        this.f16872a = h2eVar;
    }

    public static int e(iso isoVar, Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() | 4194304;
        }
        return obj instanceof String ? f(isoVar, n4q.j((String) obj).d(), 0) : isoVar.K("", ((h2e) obj).d) | 12582912;
    }

    public static int f(iso isoVar, String str, int i) {
        char cCharAt = str.charAt(i);
        int I = 4194306;
        if (cCharAt == 'F') {
            return 4194306;
        }
        if (cCharAt == 'L') {
            return isoVar.I(str.substring(i + 1, str.length() - 1)) | NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return 0;
            }
            if (cCharAt != 'I') {
                if (cCharAt == 'J') {
                    return 4194308;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        int i2 = i + 1;
                        while (str.charAt(i2) == '[') {
                            i2++;
                        }
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 != 'F') {
                            if (cCharAt2 == 'L') {
                                I = isoVar.I(str.substring(i2 + 1, str.length() - 1)) | NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
                            } else if (cCharAt2 == 'S') {
                                I = 4194316;
                            } else if (cCharAt2 == 'Z') {
                                I = 4194313;
                            } else if (cCharAt2 == 'I') {
                                I = 4194305;
                            } else if (cCharAt2 != 'J') {
                                switch (cCharAt2) {
                                    case 'B':
                                        I = 4194314;
                                        break;
                                    case 'C':
                                        I = 4194315;
                                        break;
                                    case 'D':
                                        I = 4194307;
                                        break;
                                    default:
                                        throw new IllegalArgumentException();
                                }
                            } else {
                                I = 4194308;
                            }
                        }
                        return ((i2 - i) << 26) | I;
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return 4194307;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        return 4194305;
    }

    public static int g(iso isoVar, String str) {
        return isoVar.I(str) | NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
    }

    public static boolean l(iso isoVar, int i, int[] iArr, int i2) {
        int iMin;
        int I;
        int i3 = iArr[i2];
        if (i3 == i) {
            return false;
        }
        if ((67108863 & i) == 4194309) {
            if (i3 == 4194309) {
                return false;
            }
            i = 4194309;
        }
        if (i3 == 0) {
            iArr[i2] = i;
            return true;
        }
        int i4 = i3 & (-67108864);
        int iH = 4194304;
        if (i4 != 0 || (i3 & 62914560) == 8388608) {
            if (i == 4194309) {
                return false;
            }
            if ((i & (-4194304)) != ((-4194304) & i3)) {
                int i5 = i & (-67108864);
                if (i5 != 0 || (i & 62914560) == 8388608) {
                    if (i5 != 0 && (i & 62914560) != 8388608) {
                        i5 -= 67108864;
                    }
                    if (i4 != 0 && (i3 & 62914560) != 8388608) {
                        i4 -= 67108864;
                    }
                    iMin = Math.min(i5, i4) | NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
                    I = isoVar.I("java/lang/Object");
                    iH = iMin | I;
                }
            } else if ((i3 & 62914560) == 8388608) {
                iH = (i & (-67108864)) | NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY | isoVar.H(i & 1048575, 1048575 & i3);
            } else {
                iMin = ((i & (-67108864)) - 67108864) | NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
                I = isoVar.I("java/lang/Object");
                iH = iMin | I;
            }
        } else if (i3 == 4194309) {
            if ((i & (-67108864)) == 0 && (i & 62914560) != 8388608) {
                i = 4194304;
            }
            iH = i;
        }
        if (iH == i3) {
            return false;
        }
        iArr[i2] = iH;
        return true;
    }

    public static void s(iso isoVar, int i, z73 z73Var) {
        int i2 = ((-67108864) & i) >> 26;
        if (i2 == 0) {
            int i3 = i & 1048575;
            int i4 = i & 62914560;
            if (i4 == 4194304) {
                z73Var.g(i3);
                return;
            } else if (i4 == 8388608) {
                z73Var.g(7).k(isoVar.e(isoVar.T(i3).e).f18165a);
                return;
            } else {
                if (i4 != 12582912) {
                    throw new AssertionError();
                }
                z73Var.g(8).k((int) isoVar.T(i3).f);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i5 = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            i2 = i5;
        }
        if ((i & 62914560) == 8388608) {
            sb.append('L');
            sb.append(isoVar.T(i & 1048575).e);
            sb.append(';');
        } else {
            int i6 = i & 1048575;
            if (i6 == 1) {
                sb.append('I');
            } else if (i6 == 2) {
                sb.append('F');
            } else if (i6 == 3) {
                sb.append('D');
            } else if (i6 != 4) {
                switch (i6) {
                    case 9:
                        sb.append('Z');
                        break;
                    case 10:
                        sb.append('B');
                        break;
                    case 11:
                        sb.append('C');
                        break;
                    case 12:
                        sb.append('S');
                        break;
                    default:
                        throw new AssertionError();
                }
            } else {
                sb.append('J');
            }
        }
        z73Var.g(7).k(isoVar.e(sb.toString()).f18165a);
    }

    public final void a(duf dufVar) {
        int[] iArr = this.f16873b;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 2;
            if (i2 >= iArr.length) {
                break;
            }
            int i6 = iArr[i2];
            if (i6 != 4194308 && i6 != 4194307) {
                i5 = 1;
            }
            i2 += i5;
            if (i6 == 4194304) {
                i4++;
            } else {
                i3 += i4 + 1;
                i4 = 0;
            }
        }
        int[] iArr2 = this.c;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == 4194308 || i9 == 4194307) ? 2 : 1;
            i8++;
        }
        int iV = dufVar.V(this.f16872a.d, i3, i8);
        int i10 = 0;
        while (true) {
            int i11 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            int i12 = iArr[i10];
            i10 += (i12 == 4194308 || i12 == 4194307) ? 2 : 1;
            dufVar.T(iV, i12);
            i3 = i11;
            iV++;
        }
        while (true) {
            int i13 = i8 - 1;
            if (i8 <= 0) {
                dufVar.U();
                return;
            }
            int i14 = iArr2[i];
            i += (i14 == 4194308 || i14 == 4194307) ? 2 : 1;
            dufVar.T(iV, i14);
            iV++;
            i8 = i13;
        }
    }

    public final void b(int i) {
        if (this.i == null) {
            this.i = new int[2];
        }
        int length = this.i.length;
        int i2 = this.h;
        if (i2 >= length) {
            int[] iArr = new int[Math.max(i2 + 1, length * 2)];
            System.arraycopy(this.i, 0, iArr, 0, length);
            this.i = iArr;
        }
        int[] iArr2 = this.i;
        int i3 = this.h;
        this.h = i3 + 1;
        iArr2[i3] = i;
    }

    public final void c(eoa eoaVar) {
        this.f16873b = eoaVar.f16873b;
        this.c = eoaVar.c;
        this.f = (short) 0;
        this.d = eoaVar.d;
        this.e = eoaVar.e;
        this.g = eoaVar.g;
        this.h = eoaVar.h;
        this.i = eoaVar.i;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0344  */
    /* JADX WARN: Code duplicated, block: B:120:0x034b  */
    /* JADX WARN: Code duplicated, block: B:121:0x034f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0356  */
    /* JADX WARN: Code duplicated, block: B:50:0x0147  */
    /* JADX WARN: Code duplicated, block: B:52:0x0152  */
    /* JADX WARN: Code duplicated, block: B:59:0x018e  */
    /* JADX WARN: Code duplicated, block: B:61:0x019c  */
    public void d(int i, int i2, fso fsoVar, iso isoVar) {
        switch (i) {
            case 0:
                return;
            case 1:
                q(4194309);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
                q(4194305);
                return;
            case 9:
            case 10:
                q(4194308);
                q(4194304);
                return;
            case 11:
            case 12:
            case 13:
                q(4194306);
                return;
            case 14:
            case 15:
                q(4194307);
                q(4194304);
                return;
            case 18:
                int i3 = fsoVar.f18166b;
                switch (i3) {
                    case 3:
                        q(4194305);
                        return;
                    case 4:
                        q(4194306);
                        return;
                    case 5:
                        q(4194308);
                        q(4194304);
                        return;
                    case 6:
                        q(4194307);
                        q(4194304);
                        return;
                    case 7:
                        q(isoVar.I("java/lang/Class") | NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY);
                        return;
                    case 8:
                        q(isoVar.I("java/lang/String") | NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY);
                        return;
                    default:
                        switch (i3) {
                            case 15:
                                q(isoVar.I("java/lang/invoke/MethodHandle") | NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY);
                                return;
                            case 16:
                                q(isoVar.I("java/lang/invoke/MethodType") | NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY);
                                return;
                            case 17:
                                r(isoVar, fsoVar.e);
                                return;
                            default:
                                throw new AssertionError();
                        }
                }
            default:
                switch (i) {
                    case 21:
                        q(4194305);
                        return;
                    case 22:
                        q(4194308);
                        q(4194304);
                        return;
                    case 23:
                        q(4194306);
                        return;
                    case 24:
                        q(4194307);
                        q(4194304);
                        return;
                    case 25:
                        q(k(i2));
                        return;
                    default:
                        switch (i) {
                            case 46:
                            case 51:
                            case 52:
                            case 53:
                                o(2);
                                q(4194305);
                                return;
                            case 47:
                                o(2);
                                q(4194308);
                                q(4194304);
                                return;
                            case 48:
                                o(2);
                                q(4194306);
                                return;
                            case 49:
                                o(2);
                                q(4194307);
                                q(4194304);
                                return;
                            case 50:
                                o(1);
                                int iN = n();
                                if (iN != 4194309) {
                                    iN -= 67108864;
                                }
                                q(iN);
                                return;
                            case 54:
                            case 56:
                            case 58:
                                v(i2, n());
                                if (i2 > 0) {
                                    int i4 = i2 - 1;
                                    int iK = k(i4);
                                    if (iK == 4194308 || iK == 4194307) {
                                        v(i4, 4194304);
                                        return;
                                    }
                                    int i5 = iK & 62914560;
                                    if (i5 == 16777216 || i5 == 20971520) {
                                        v(i4, iK | EventRecurrence.TH);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            case 55:
                            case 57:
                                o(1);
                                v(i2, n());
                                v(i2 + 1, 4194304);
                                if (i2 > 0) {
                                    int i6 = i2 - 1;
                                    int iK2 = k(i6);
                                    if (iK2 == 4194308 || iK2 == 4194307) {
                                        v(i6, 4194304);
                                        return;
                                    }
                                    int i7 = iK2 & 62914560;
                                    if (i7 == 16777216 || i7 == 20971520) {
                                        v(i6, iK2 | EventRecurrence.TH);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                switch (i) {
                                    case 79:
                                    case 81:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                        o(3);
                                        return;
                                    case 80:
                                    case 82:
                                        o(4);
                                        return;
                                    case 87:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 170:
                                    case 171:
                                    case 172:
                                    case 174:
                                    case 176:
                                    case SportReportBaseParser.ReportType.minWaterTemperature /* 191 */:
                                    case SportReportBaseParser.ReportType.divingCNS /* 194 */:
                                    case SportReportBaseParser.ReportType.oxygenPartialPressureThreshold /* 195 */:
                                        break;
                                    case 88:
                                    case 159:
                                    case 160:
                                    case 161:
                                    case 162:
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case 173:
                                    case 175:
                                        o(2);
                                        return;
                                    case 89:
                                        int iN2 = n();
                                        q(iN2);
                                        q(iN2);
                                        return;
                                    case 90:
                                        int iN3 = n();
                                        int iN4 = n();
                                        q(iN3);
                                        q(iN4);
                                        q(iN3);
                                        return;
                                    case 91:
                                        int iN5 = n();
                                        int iN6 = n();
                                        int iN7 = n();
                                        q(iN5);
                                        q(iN7);
                                        q(iN6);
                                        q(iN5);
                                        return;
                                    case 92:
                                        int iN8 = n();
                                        int iN9 = n();
                                        q(iN9);
                                        q(iN8);
                                        q(iN9);
                                        q(iN8);
                                        return;
                                    case 93:
                                        int iN10 = n();
                                        int iN11 = n();
                                        int iN12 = n();
                                        q(iN11);
                                        q(iN10);
                                        q(iN12);
                                        q(iN11);
                                        q(iN10);
                                        return;
                                    case 94:
                                        int iN13 = n();
                                        int iN14 = n();
                                        int iN15 = n();
                                        int iN16 = n();
                                        q(iN14);
                                        q(iN13);
                                        q(iN16);
                                        q(iN15);
                                        q(iN14);
                                        q(iN13);
                                        return;
                                    case 95:
                                        int iN17 = n();
                                        int iN18 = n();
                                        q(iN17);
                                        q(iN18);
                                        return;
                                    case 96:
                                    case 100:
                                    case 104:
                                    case 108:
                                    case 112:
                                    case 120:
                                    case 122:
                                    case 124:
                                    case 126:
                                    case 128:
                                    case 130:
                                    case 136:
                                    case 142:
                                    case 149:
                                    case 150:
                                        o(2);
                                        q(4194305);
                                        return;
                                    case 97:
                                    case 101:
                                    case 105:
                                    case 109:
                                    case 113:
                                    case 127:
                                    case 129:
                                    case 131:
                                        o(4);
                                        q(4194308);
                                        q(4194304);
                                        return;
                                    case 98:
                                    case 102:
                                    case 106:
                                    case 110:
                                    case 114:
                                    case 137:
                                    case 144:
                                        o(2);
                                        q(4194306);
                                        return;
                                    case 99:
                                    case 103:
                                    case 107:
                                    case 111:
                                    case 115:
                                        o(4);
                                        q(4194307);
                                        q(4194304);
                                        return;
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 145:
                                    case 146:
                                    case 147:
                                    case 167:
                                    case 177:
                                        return;
                                    case 121:
                                    case 123:
                                    case 125:
                                        o(3);
                                        q(4194308);
                                        q(4194304);
                                        return;
                                    case 132:
                                        v(i2, 4194305);
                                        return;
                                    case 133:
                                    case 140:
                                        o(1);
                                        q(4194308);
                                        q(4194304);
                                        return;
                                    case 134:
                                        o(1);
                                        q(4194306);
                                        return;
                                    case 135:
                                    case 141:
                                        o(1);
                                        q(4194307);
                                        q(4194304);
                                        return;
                                    case 138:
                                        o(2);
                                        q(4194307);
                                        q(4194304);
                                        return;
                                    case 139:
                                    case SportReportBaseParser.ReportType.maxWaterTemperature /* 190 */:
                                    case SportReportBaseParser.ReportType.divingOTU /* 193 */:
                                        o(1);
                                        q(4194305);
                                        return;
                                    case 143:
                                        o(2);
                                        q(4194308);
                                        q(4194304);
                                        return;
                                    case 148:
                                    case 151:
                                    case 152:
                                        o(4);
                                        q(4194305);
                                        return;
                                    case 168:
                                    case 169:
                                        throw new IllegalArgumentException("JSR/RET are not supported with computeFrames option");
                                    case 178:
                                        r(isoVar, fsoVar.e);
                                        return;
                                    case 179:
                                        p(fsoVar.e);
                                        return;
                                    case 180:
                                        o(1);
                                        r(isoVar, fsoVar.e);
                                        return;
                                    case 181:
                                        p(fsoVar.e);
                                        n();
                                        return;
                                    case 182:
                                    case SportReportBaseParser.ReportType.entryTime /* 183 */:
                                    case SportReportBaseParser.ReportType.exitTime /* 184 */:
                                    case 185:
                                        p(fsoVar.e);
                                        if (i != 184) {
                                            int iN19 = n();
                                            if (i == 183 && fsoVar.d.charAt(0) == '<') {
                                                b(iN19);
                                            }
                                        }
                                        r(isoVar, fsoVar.e);
                                        return;
                                    case SportReportBaseParser.ReportType.avgDivingDepth /* 186 */:
                                        p(fsoVar.e);
                                        r(isoVar, fsoVar.e);
                                        return;
                                    case SportReportBaseParser.ReportType.avgAscentRate /* 187 */:
                                        q(isoVar.K(fsoVar.e, i2) | 12582912);
                                        return;
                                    case SportReportBaseParser.ReportType.avgDescentRate /* 188 */:
                                        n();
                                        switch (i2) {
                                            case 4:
                                                q(71303177);
                                                return;
                                            case 5:
                                                q(71303179);
                                                return;
                                            case 6:
                                                q(71303170);
                                                return;
                                            case 7:
                                                q(71303171);
                                                return;
                                            case 8:
                                                q(71303178);
                                                return;
                                            case 9:
                                                q(71303180);
                                                return;
                                            case 10:
                                                q(71303169);
                                                return;
                                            case 11:
                                                q(71303172);
                                                return;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                    case SportReportBaseParser.ReportType.descentCount /* 189 */:
                                        String str = fsoVar.e;
                                        n();
                                        if (str.charAt(0) != '[') {
                                            q(isoVar.I(str) | 75497472);
                                            return;
                                        }
                                        r(isoVar, AbstractJsonLexerKt.BEGIN_LIST + str);
                                        return;
                                    case 192:
                                        String str2 = fsoVar.e;
                                        n();
                                        if (str2.charAt(0) == '[') {
                                            r(isoVar, str2);
                                            return;
                                        } else {
                                            q(isoVar.I(str2) | NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY);
                                            return;
                                        }
                                    default:
                                        switch (i) {
                                            case SportReportBaseParser.ReportType.noFlyDuration /* 197 */:
                                                o(i2);
                                                r(isoVar, fsoVar.e);
                                                return;
                                            case SportReportBaseParser.ReportType.algorithmDataSource /* 198 */:
                                            case 199:
                                                break;
                                            default:
                                                throw new IllegalArgumentException();
                                        }
                                        break;
                                }
                                o(1);
                                return;
                        }
                }
        }
    }

    public final int h(int i, int i2) {
        int i3 = (-67108864) & i;
        int i4 = 62914560 & i;
        if (i4 == 16777216) {
            int i5 = i3 + this.f16873b[i & 1048575];
            if ((i & EventRecurrence.TH) == 0 || !(i5 == 4194308 || i5 == 4194307)) {
                return i5;
            }
            return 4194304;
        }
        if (i4 != 20971520) {
            return i;
        }
        int i6 = i3 + this.c[i2 - (i & 1048575)];
        if ((i & EventRecurrence.TH) == 0 || !(i6 == 4194308 || i6 == 4194307)) {
            return i6;
        }
        return 4194304;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:23:0x0051 A[LOOP:0: B:7:0x000d->B:23:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0037 A[SYNTHETIC] */
    public final int i(iso isoVar, int i) {
        int i2;
        int I;
        if (i == 4194310 || ((-4194304) & i) == 12582912) {
            for (int i3 = 0; i3 < this.h; i3++) {
                int i4 = this.i[i3];
                int i5 = (-67108864) & i4;
                int i6 = 62914560 & i4;
                int i7 = i4 & 1048575;
                if (i6 == 16777216) {
                    i2 = this.f16873b[i7];
                } else {
                    if (i6 == 20971520) {
                        int[] iArr = this.c;
                        i2 = iArr[iArr.length - i7];
                    }
                    if (i == i4) {
                        if (i == 4194310) {
                            I = isoVar.I(isoVar.O());
                        } else {
                            I = isoVar.I(isoVar.T(i & 1048575).e);
                        }
                        return I | NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
                    }
                }
                i4 = i2 + i5;
                if (i == i4) {
                    if (i == 4194310) {
                        I = isoVar.I(isoVar.O());
                    } else {
                        I = isoVar.I(isoVar.T(i & 1048575).e);
                    }
                    return I | NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
                }
            }
        }
        return i;
    }

    public final int j() {
        return this.c.length;
    }

    public final int k(int i) {
        int[] iArr = this.d;
        if (iArr == null || i >= iArr.length) {
            return i | 16777216;
        }
        int i2 = iArr[i];
        if (i2 != 0) {
            return i2;
        }
        int i3 = i | 16777216;
        iArr[i] = i3;
        return i3;
    }

    public final boolean m(iso isoVar, eoa eoaVar, int i) {
        boolean zL;
        int i2;
        int length = this.f16873b.length;
        int length2 = this.c.length;
        boolean zL2 = true;
        if (eoaVar.f16873b == null) {
            eoaVar.f16873b = new int[length];
            zL = true;
        } else {
            zL = false;
        }
        int i3 = 0;
        while (i3 < length) {
            int[] iArr = this.d;
            int i4 = (iArr == null || i3 >= iArr.length || (i2 = iArr[i3]) == 0) ? this.f16873b[i3] : h(i2, length2);
            if (this.i != null) {
                i4 = i(isoVar, i4);
            }
            zL |= l(isoVar, i4, eoaVar.f16873b, i3);
            i3++;
        }
        if (i > 0) {
            for (int i5 = 0; i5 < length; i5++) {
                zL |= l(isoVar, this.f16873b[i5], eoaVar.f16873b, i5);
            }
            if (eoaVar.c == null) {
                eoaVar.c = new int[1];
            } else {
                zL2 = zL;
            }
            return l(isoVar, i, eoaVar.c, 0) | zL2;
        }
        int length3 = this.c.length + this.f;
        if (eoaVar.c == null) {
            eoaVar.c = new int[this.g + length3];
        } else {
            zL2 = zL;
        }
        for (int i6 = 0; i6 < length3; i6++) {
            int i7 = this.c[i6];
            if (this.i != null) {
                i7 = i(isoVar, i7);
            }
            zL2 |= l(isoVar, i7, eoaVar.c, i6);
        }
        for (int i8 = 0; i8 < this.g; i8++) {
            int iH = h(this.e[i8], length2);
            if (this.i != null) {
                iH = i(isoVar, iH);
            }
            zL2 |= l(isoVar, iH, eoaVar.c, length3 + i8);
        }
        return zL2;
    }

    public final int n() {
        short s = this.g;
        if (s <= 0) {
            short s2 = (short) (this.f - 1);
            this.f = s2;
            return (-s2) | 20971520;
        }
        int[] iArr = this.e;
        short s3 = (short) (s - 1);
        this.g = s3;
        return iArr[s3];
    }

    public final void o(int i) {
        short s = this.g;
        if (s >= i) {
            this.g = (short) (s - i);
        } else {
            this.f = (short) (this.f - (i - s));
            this.g = (short) 0;
        }
    }

    public final void p(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            o((n4q.c(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            o(2);
        } else {
            o(1);
        }
    }

    public final void q(int i) {
        if (this.e == null) {
            this.e = new int[10];
        }
        int length = this.e.length;
        short s = this.g;
        if (s >= length) {
            int[] iArr = new int[Math.max(s + 1, length * 2)];
            System.arraycopy(this.e, 0, iArr, 0, length);
            this.e = iArr;
        }
        int[] iArr2 = this.e;
        short s2 = this.g;
        short s3 = (short) (s2 + 1);
        this.g = s3;
        iArr2[s2] = i;
        short s4 = (short) (this.f + s3);
        h2e h2eVar = this.f16872a;
        if (s4 > h2eVar.h) {
            h2eVar.h = s4;
        }
    }

    public final void r(iso isoVar, String str) {
        int iF = f(isoVar, str, str.charAt(0) == '(' ? n4q.k(str) : 0);
        if (iF != 0) {
            q(iF);
            if (iF == 4194308 || iF == 4194307) {
                q(4194304);
            }
        }
    }

    public final void t(iso isoVar, int i, Object[] objArr, int i2, Object[] objArr2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + 1;
            this.f16873b[i3] = e(isoVar, objArr[i4]);
            Object obj = objArr[i4];
            if (obj == wah.e || obj == wah.d) {
                i3 += 2;
                this.f16873b[i5] = 4194304;
            } else {
                i3 = i5;
            }
        }
        while (true) {
            int[] iArr = this.f16873b;
            if (i3 >= iArr.length) {
                break;
            }
            iArr[i3] = 4194304;
            i3++;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < i2; i7++) {
            Object obj2 = objArr2[i7];
            if (obj2 == wah.e || obj2 == wah.d) {
                i6++;
            }
        }
        this.c = new int[i6 + i2];
        int i8 = 0;
        for (int i9 = 0; i9 < i2; i9++) {
            int i10 = i8 + 1;
            this.c[i8] = e(isoVar, objArr2[i9]);
            Object obj3 = objArr2[i9];
            if (obj3 == wah.e || obj3 == wah.d) {
                i8 += 2;
                this.c[i10] = 4194304;
            } else {
                i8 = i10;
            }
        }
        this.g = (short) 0;
        this.h = 0;
    }

    public final void u(iso isoVar, int i, String str, int i2) {
        int i3;
        int[] iArr = new int[i2];
        this.f16873b = iArr;
        this.c = new int[0];
        if ((i & 8) == 0) {
            i3 = 1;
            if ((i & 262144) == 0) {
                iArr[0] = isoVar.I(isoVar.O()) | NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
            } else {
                iArr[0] = 4194310;
            }
        } else {
            i3 = 0;
        }
        for (n4q n4qVar : n4q.b(str)) {
            int iF = f(isoVar, n4qVar.d(), 0);
            int[] iArr2 = this.f16873b;
            int i4 = i3 + 1;
            iArr2[i3] = iF;
            if (iF == 4194308 || iF == 4194307) {
                i3 += 2;
                iArr2[i4] = 4194304;
            } else {
                i3 = i4;
            }
        }
        while (i3 < i2) {
            this.f16873b[i3] = 4194304;
            i3++;
        }
    }

    public final void v(int i, int i2) {
        if (this.d == null) {
            this.d = new int[10];
        }
        int length = this.d.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.d, 0, iArr, 0, length);
            this.d = iArr;
        }
        this.d[i] = i2;
    }
}
