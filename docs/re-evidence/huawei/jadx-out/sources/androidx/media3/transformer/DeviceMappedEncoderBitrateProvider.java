package androidx.media3.transformer;

import android.os.Build;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes21.dex */
class DeviceMappedEncoderBitrateProvider implements EncoderBitrateProvider {
    DeviceMappedEncoderBitrateProvider() {
    }

    @Override // androidx.media3.transformer.EncoderBitrateProvider
    public int getBitrate(String str, int i, int i2, float f) {
        return (int) (((double) (i * i2 * f)) * getBitrateMultiplierFromMapping(str, Util.SDK_INT, Build.MODEL, "" + i + "x" + i2, Math.round(f)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:1015:0x0b3d  */
    /* JADX WARN: Code duplicated, block: B:1213:0x0db2  */
    /* JADX WARN: Code duplicated, block: B:1251:0x0e12  */
    /* JADX WARN: Code duplicated, block: B:1280:0x0e58  */
    /* JADX WARN: Code duplicated, block: B:1309:0x0e9e  */
    /* JADX WARN: Code duplicated, block: B:1365:0x0f2c  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:1488:0x1061  */
    /* JADX WARN: Code duplicated, block: B:1528:0x10d0  */
    /* JADX WARN: Code duplicated, block: B:1551:0x110b  */
    /* JADX WARN: Code duplicated, block: B:1605:0x1198  */
    /* JADX WARN: Code duplicated, block: B:1697:0x129e  */
    /* JADX WARN: Code duplicated, block: B:1807:0x13e0  */
    /* JADX WARN: Code duplicated, block: B:1860:0x1475  */
    /* JADX WARN: Code duplicated, block: B:1893:0x14cf  */
    /* JADX WARN: Code duplicated, block: B:189:0x0260  */
    /* JADX WARN: Code duplicated, block: B:1945:0x1564  */
    /* JADX WARN: Code duplicated, block: B:1991:0x15dd  */
    /* JADX WARN: Code duplicated, block: B:2022:0x162e  */
    /* JADX WARN: Code duplicated, block: B:2045:0x1669  */
    /* JADX WARN: Code duplicated, block: B:2100:0x16fc  */
    /* JADX WARN: Code duplicated, block: B:2140:0x1769  */
    /* JADX WARN: Code duplicated, block: B:2191:0x17f3  */
    /* JADX WARN: Code duplicated, block: B:2252:0x18a2  */
    /* JADX WARN: Code duplicated, block: B:2279:0x18eb  */
    /* JADX WARN: Code duplicated, block: B:229:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:2330:0x1982  */
    /* JADX WARN: Code duplicated, block: B:2352:0x19b7  */
    /* JADX WARN: Code duplicated, block: B:274:0x0334  */
    /* JADX WARN: Code duplicated, block: B:363:0x042f  */
    /* JADX WARN: Code duplicated, block: B:424:0x04db  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:583:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:644:0x0775  */
    /* JADX WARN: Code duplicated, block: B:672:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:734:0x0853  */
    /* JADX WARN: Code duplicated, block: B:774:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:910:0x0a32  */
    /* JADX WARN: Code duplicated, block: B:983:0x0af4  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static double getBitrateMultiplierFromMapping(String str, int i, String str2, String str3, int i2) {
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        byte b7;
        byte b8;
        byte b9;
        byte b10;
        byte b11;
        byte b12;
        byte b13;
        byte b14;
        byte b15;
        byte b16;
        byte b17;
        byte b18;
        byte b19;
        byte b20;
        byte b21;
        byte b22;
        byte b23;
        byte b24;
        byte b25;
        byte b26;
        byte b27;
        byte b28;
        byte b29;
        str.hashCode();
        switch (str) {
            case "OMX.IMG.TOPAZ.VIDEO.Encoder":
                str2.hashCode();
                switch (str2) {
                    case "ANE-LX1":
                        b2 = 0;
                        break;
                    case "ANE-LX2":
                        b2 = 1;
                        break;
                    case "FIG-LX1":
                        b2 = 2;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 != 0 && b2 != 1) {
                    return b2 != 2 ? 0.28d : 0.245d;
                }
                str3.hashCode();
                int iHashCode = str3.hashCode();
                if (iHashCode != -1719904874) {
                    if (iHashCode != 802059049) {
                        if (iHashCode == 1514345136 && str3.equals("3840x2160")) {
                            b3 = 2;
                        } else {
                            b3 = -1;
                        }
                    } else if (str3.equals("1920x1080")) {
                        b3 = 1;
                    } else {
                        b3 = -1;
                    }
                } else if (str3.equals("1280x720")) {
                    b3 = 0;
                } else {
                    b3 = -1;
                }
                if (b3 == 0) {
                    return 0.245d;
                }
                if (b3 != 1) {
                    return b3 != 2 ? 0.28d : 0.23208d;
                }
                return i2 != 60 ? 0.2625d : 0.1925d;
            case "OMX.Exynos.AVC.Encoder":
                switch (i) {
                    case 24:
                        str2.hashCode();
                        if (str2.equals("SM-G920V")) {
                            return 0.245d;
                        }
                        return !str2.equals("SM-G935F") ? 0.37188d : 0.2625d;
                    case 25:
                    default:
                        return 1.4d;
                    case 26:
                        byte b30 = 4;
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case -407354367:
                                if (!str2.equals("SM-A520F")) {
                                    b30 = -1;
                                } else {
                                    b30 = 0;
                                }
                                break;
                            case -401693116:
                                if (!str2.equals("SM-G930F")) {
                                    b30 = -1;
                                } else {
                                    b30 = 1;
                                }
                                break;
                            case -401692961:
                                if (!str2.equals("SM-G935F")) {
                                    b30 = -1;
                                } else {
                                    b30 = 2;
                                }
                                break;
                            case -401691194:
                                if (!str2.equals("SM-G950F")) {
                                    b30 = -1;
                                } else {
                                    b30 = 3;
                                }
                                break;
                            case -401691039:
                                if (!str2.equals("SM-G955F")) {
                                    b30 = -1;
                                }
                                break;
                            case -401690233:
                                if (!str2.equals("SM-G960F")) {
                                    b30 = -1;
                                } else {
                                    b30 = 5;
                                }
                                break;
                            case -399014808:
                                if (!str2.equals("SM-J600G")) {
                                    b30 = -1;
                                } else {
                                    b30 = 6;
                                }
                                break;
                            default:
                                b30 = -1;
                                break;
                        }
                        switch (b30) {
                            case 0:
                            case 6:
                                return 0.3325d;
                            case 1:
                                return 0.20125d;
                            case 2:
                                str3.hashCode();
                                return !str3.equals("1920x1080") ? 0.315d : 0.1225d;
                            case 3:
                                return 0.2975d;
                            case 4:
                                str3.hashCode();
                                int iHashCode2 = str3.hashCode();
                                if (iHashCode2 != -2077737242) {
                                    if (iHashCode2 != 802059049) {
                                        if (iHashCode2 == 1514345136 && str3.equals("3840x2160")) {
                                            b4 = 2;
                                        } else {
                                            b4 = -1;
                                        }
                                    } else if (str3.equals("1920x1080")) {
                                        b4 = 1;
                                    } else {
                                        b4 = -1;
                                    }
                                } else if (str3.equals("640x480")) {
                                    b4 = 0;
                                } else {
                                    b4 = -1;
                                }
                                if (b4 == 0) {
                                    return 0.245d;
                                }
                                if (b4 != 1) {
                                    return b4 != 2 ? 0.2975d : 0.0914d;
                                }
                                return i2 != 60 ? 0.175d : 0.14d;
                            case 5:
                                str3.hashCode();
                                if (str3.equals("1920x1080")) {
                                    return i2 != 30 ? 0.175d : 0.1575d;
                                }
                                return 0.35d;
                            default:
                                return 0.35d;
                        }
                    case 27:
                        str2.hashCode();
                        switch (str2) {
                            case "SM-G610F":
                                b5 = 0;
                                break;
                            case "SM-J260F":
                                b5 = 1;
                                break;
                            case "SM-J260G":
                                b5 = 2;
                                break;
                            case "SM-M205F":
                                b5 = 3;
                                break;
                            default:
                                b5 = -1;
                                break;
                        }
                        if (b5 == 0 || b5 == 1) {
                            return 0.3325d;
                        }
                        if (b5 == 2) {
                            str3.hashCode();
                            if (str3.equals("640x480")) {
                                return 0.41563d;
                            }
                            return !str3.equals("1920x1080") ? 0.525d : 0.4375d;
                        }
                        if (b5 != 3) {
                            return 0.56875d;
                        }
                        str3.hashCode();
                        if (str3.equals("640x480")) {
                            return 0.41563d;
                        }
                        if (str3.equals("1920x1080")) {
                            return i2 != 60 ? 0.315d : 0.28d;
                        }
                        return 0.56875d;
                    case 28:
                        byte b31 = 4;
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case -401691194:
                                if (!str2.equals("SM-G950F")) {
                                    b31 = -1;
                                } else {
                                    b31 = 0;
                                }
                                break;
                            case -401691039:
                                if (!str2.equals("SM-G955F")) {
                                    b31 = -1;
                                } else {
                                    b31 = 1;
                                }
                                break;
                            case -401690078:
                                if (!str2.equals("SM-G965F")) {
                                    b31 = -1;
                                } else {
                                    b31 = 2;
                                }
                                break;
                            case -401690070:
                                if (!str2.equals("SM-G965N")) {
                                    b31 = -1;
                                } else {
                                    b31 = 3;
                                }
                                break;
                            case -398984987:
                                if (!str2.equals("SM-J701F")) {
                                    b31 = -1;
                                }
                                break;
                            case -395225586:
                                if (!str2.equals("SM-N960F")) {
                                    b31 = -1;
                                } else {
                                    b31 = 5;
                                }
                                break;
                            case -395225578:
                                if (!str2.equals("SM-N960N")) {
                                    b31 = -1;
                                } else {
                                    b31 = 6;
                                }
                                break;
                            case 253167728:
                                if (!str2.equals("SM-A105FN")) {
                                    b31 = -1;
                                } else {
                                    b31 = 7;
                                }
                                break;
                            default:
                                b31 = -1;
                                break;
                        }
                        switch (b31) {
                            case 0:
                                str3.hashCode();
                                if (str3.equals("1280x720")) {
                                    return 0.1925d;
                                }
                                if (str3.equals("1920x1080")) {
                                    return i2 != 60 ? 0.21d : 0.175d;
                                }
                                return 0.245d;
                            case 1:
                                return 0.1925d;
                            case 2:
                                str3.hashCode();
                                if (str3.equals("640x480")) {
                                    return 0.21d;
                                }
                                return !str3.equals("1920x1080") ? 0.39375d : 0.11375d;
                            case 3:
                                str3.hashCode();
                                int iHashCode3 = str3.hashCode();
                                if (iHashCode3 != -2077737242) {
                                    if (iHashCode3 != 802059049) {
                                        if (iHashCode3 == 1514345136 && str3.equals("3840x2160")) {
                                            b6 = 2;
                                        } else {
                                            b6 = -1;
                                        }
                                    } else if (str3.equals("1920x1080")) {
                                        b6 = 1;
                                    } else {
                                        b6 = -1;
                                    }
                                } else if (str3.equals("640x480")) {
                                    b6 = 0;
                                } else {
                                    b6 = -1;
                                }
                                if (b6 == 0) {
                                    return 0.21d;
                                }
                                if (b6 != 1) {
                                    return b6 != 2 ? 0.39375d : 0.08269d;
                                }
                                return 0.175d;
                            case 4:
                                return 0.3325d;
                            case 5:
                            case 6:
                                str3.hashCode();
                                if (str3.equals("640x480")) {
                                    return 0.21d;
                                }
                                if (str3.equals("1920x1080")) {
                                    return i2 != 60 ? 0.1925d : 0.175d;
                                }
                                return 0.39375d;
                            case 7:
                                str3.hashCode();
                                if (str3.equals("640x480")) {
                                    return 0.41563d;
                                }
                                return !str3.equals("1920x1080") ? 0.7d : 0.35d;
                            default:
                                return 0.7d;
                        }
                    case 29:
                        str2.hashCode();
                        int iHashCode4 = str2.hashCode();
                        if (iHashCode4 != -401689047) {
                            if (iHashCode4 != -395224625) {
                                if (iHashCode4 == 253167728 && str2.equals("SM-A105FN")) {
                                    b7 = 2;
                                } else {
                                    b7 = -1;
                                }
                            } else if (str2.equals("SM-N970F")) {
                                b7 = 1;
                            } else {
                                b7 = -1;
                            }
                        } else if (str2.equals("SM-G977N")) {
                            b7 = 0;
                        } else {
                            b7 = -1;
                        }
                        if (b7 == 0) {
                            str3.hashCode();
                            return !str3.equals("1280x720") ? 0.7d : 0.4375d;
                        }
                        if (b7 == 1) {
                            return 0.245d;
                        }
                        if (b7 != 2) {
                            return 1.4d;
                        }
                        str3.hashCode();
                        int iHashCode5 = str3.hashCode();
                        if (iHashCode5 != -2077737242) {
                            if (iHashCode5 != -1719904874) {
                                if (iHashCode5 == 802059049 && str3.equals("1920x1080")) {
                                    b8 = 2;
                                } else {
                                    b8 = -1;
                                }
                            } else if (str3.equals("1280x720")) {
                                b8 = 1;
                            } else {
                                b8 = -1;
                            }
                        } else if (str3.equals("640x480")) {
                            b8 = 0;
                        } else {
                            b8 = -1;
                        }
                        if (b8 == 0) {
                            return 0.4375d;
                        }
                        if (b8 != 1) {
                            return (b8 == 2 && i2 == 30) ? 1.05d : 1.4d;
                        }
                        return 0.7d;
                    case 30:
                        str2.hashCode();
                        switch (str2) {
                            case "SM-A127F":
                                b9 = 0;
                                break;
                            case "SM-A217F":
                                b9 = 1;
                                break;
                            case "SM-A505F":
                                b9 = 2;
                                break;
                            case "SM-A515F":
                                b9 = 3;
                                break;
                            case "SM-M315F":
                                b9 = 4;
                                break;
                            case "SM-A515U1":
                                b9 = 5;
                                break;
                            default:
                                b9 = -1;
                                break;
                        }
                        if (b9 == 0 || b9 == 1) {
                            return 0.35d;
                        }
                        return (b9 == 2 || b9 == 3 || b9 == 4 || b9 == 5) ? 0.1925d : 0.37188d;
                    case 31:
                        return 0.245d;
                }
            case "OMX.MTK.VIDEO.ENCODER.AVC":
                switch (i) {
                    case 22:
                        return 0.245d;
                    case 23:
                        str2.hashCode();
                        switch (str2) {
                            case "Redmi Note 4":
                                b10 = 0;
                                break;
                            case "SM-G532F":
                                b10 = 1;
                                break;
                            case "SM-G532G":
                                b10 = 2;
                                break;
                            case "LG-K430":
                                b10 = 3;
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        if (b10 == 0) {
                            return 0.35d;
                        }
                        if (b10 != 1) {
                            if (b10 != 2) {
                                return b10 != 3 ? 0.525d : 0.28d;
                            }
                            str3.hashCode();
                            if (!str3.equals("1280x720")) {
                                return 0.525d;
                            }
                        }
                        return 0.39375d;
                    case 24:
                        str2.hashCode();
                        return !str2.equals("Moto C") ? 0.28d : 0.2625d;
                    case 25:
                    case 26:
                    default:
                        return 0.7d;
                    case 27:
                        str2.hashCode();
                        switch (str2) {
                            case "Redmi 6A":
                                b11 = 0;
                                break;
                            case "Nokia 1":
                                b11 = 1;
                                break;
                            case "CPH1920":
                                b11 = 2;
                                break;
                            case "Infinix X650":
                                b11 = 3;
                                break;
                            default:
                                b11 = -1;
                                break;
                        }
                        if (b11 == 0) {
                            str3.hashCode();
                            if (str3.equals("1920x1080")) {
                                return i2 != 60 ? 0.175d : 0.14875d;
                            }
                            return 0.315d;
                        }
                        if (b11 == 1) {
                            str3.hashCode();
                            return !str3.equals("1280x720") ? 0.2975d : 0.21d;
                        }
                        if (b11 == 2) {
                            return 0.2625d;
                        }
                        if (b11 != 3) {
                            return 0.4375d;
                        }
                        str3.hashCode();
                        return !str3.equals("640x480") ? 0.4375d : 0.28d;
                    case 28:
                        return 0.2625d;
                    case 29:
                        str2.hashCode();
                        switch (str2) {
                            case "SM-A013M":
                            case "TECNO KE5":
                            case "SM-A215U1":
                            case "M2006C3LG":
                            case "Infinix X688B":
                            case "LM-K500":
                            case "LM-Q730":
                            case "CPH2179":
                                return 0.28d;
                            case "k61v1_basic_ref":
                                str3.hashCode();
                                if (str3.equals("640x480")) {
                                    return 0.35d;
                                }
                                return !str3.equals("1280x720") ? 0.7d : 0.525d;
                            default:
                                return 0.7d;
                        }
                    case 30:
                        str2.hashCode();
                        switch (str2) {
                            case "wembley_2GB_full":
                                str3.hashCode();
                                if (str3.equals("640x480")) {
                                    return 0.35d;
                                }
                                return !str3.equals("1280x720") ? 0.7d : 0.525d;
                            case "SM-A037U":
                            case "SM-A107F":
                            case "SM-A107M":
                            case "SM-A125F":
                            case "W-K610-TVM":
                            case "vivo 1904":
                                return 0.28d;
                            case "SM-A325F":
                            case "M1908C3JGG":
                                return 0.2625d;
                            default:
                                return 0.7d;
                        }
                }
            case "OMX.qcom.video.encoder.hevc":
                switch (i) {
                    case 26:
                        str2.hashCode();
                        return (str2.equals("F8331") || str2.equals("MI 5s")) ? 0.105d : 0.1575d;
                    case 27:
                        return 0.1575d;
                    case 28:
                        str2.hashCode();
                        return !str2.equals("Nokia 7.2") ? 0.35d : 0.1575d;
                    default:
                        return 0.35d;
                }
            case "c2.exynos.h264.encoder":
                switch (i) {
                    case 31:
                        str3.hashCode();
                        return !str3.equals("1280x720") ? 0.7d : 0.245d;
                    case 32:
                        str2.hashCode();
                        if (str2.equals("Pixel 6 Pro")) {
                            str3.hashCode();
                            return !str3.equals("1280x720") ? 0.7d : 0.245d;
                        }
                        if (!str2.equals("Pixel 6")) {
                            return 0.7d;
                        }
                        str3.hashCode();
                        if (str3.equals("640x480")) {
                            return 0.28d;
                        }
                        return !str3.equals("1280x720") ? 0.7d : 0.245d;
                    case 33:
                        return 0.245d;
                    default:
                        return 0.7d;
                }
            case "OMX.hisi.video.encoder.avc":
                if (i == 24) {
                    str3.hashCode();
                    if (str3.equals("640x480")) {
                        return 0.525d;
                    }
                    return !str3.equals("1920x1080") ? 0.56875d : 0.245d;
                }
                if (i != 27) {
                    if (i != 28) {
                        return 0.56875d;
                    }
                    str2.hashCode();
                    return !str2.equals("HMA-L29") ? 0.21d : 0.175d;
                }
                str2.hashCode();
                int iHashCode6 = str2.hashCode();
                if (iHashCode6 != 1588010961) {
                    if (iHashCode6 != 1672051372) {
                        if (iHashCode6 == 1832520436 && str2.equals("EML-AL00")) {
                            b12 = 2;
                        } else {
                            b12 = -1;
                        }
                    } else if (str2.equals("COR-L29")) {
                        b12 = 1;
                    } else {
                        b12 = -1;
                    }
                } else if (str2.equals("CLT-L29")) {
                    b12 = 0;
                } else {
                    b12 = -1;
                }
                if (b12 == 0) {
                    return 0.1925d;
                }
                if (b12 != 1) {
                    return b12 != 2 ? 0.245d : 0.1925d;
                }
                str3.hashCode();
                if (str3.equals("1280x720")) {
                    return 0.1925d;
                }
                if (str3.equals("1920x1080")) {
                    return i2 != 60 ? 0.14d : 0.13125d;
                }
                return 0.245d;
            case "OMX.qcom.video.encoder.avc":
                switch (i) {
                    case 23:
                        str2.hashCode();
                        switch (str2) {
                            case "MotoG3":
                                return 0.37188d;
                            case "Nexus 5":
                                str3.hashCode();
                                if (str3.equals("640x480")) {
                                    return 0.3325d;
                                }
                                if (str3.equals("1920x1080")) {
                                    return i2 != 60 ? 0.35d : 0.28d;
                                }
                                return 0.48125d;
                            case "LG-AS110":
                                str3.hashCode();
                                if (str3.equals("1280x720")) {
                                    return 0.39375d;
                                }
                                return !str3.equals("1920x1080") ? 0.48125d : 0.35d;
                            case "SM-G900F":
                                return 0.35d;
                            case "Moto G (4)":
                                str3.hashCode();
                                if (str3.equals("1920x1080")) {
                                    return i2 != 60 ? 0.35d : 0.3325d;
                                }
                                return 0.4375d;
                            case "Moto G Play":
                                str3.hashCode();
                                if (str3.equals("1920x1080")) {
                                    return i2 != 60 ? 0.35d : 0.3325d;
                                }
                                return 0.37188d;
                            case "vivo 1610":
                                str3.hashCode();
                                if (str3.equals("1920x1080")) {
                                    return i2 != 60 ? 0.4375d : 0.315d;
                                }
                                return 0.54688d;
                            case "Nexus 6P":
                                str3.hashCode();
                                if (str3.equals("640x480")) {
                                    return 0.3325d;
                                }
                                if (str3.equals("1920x1080")) {
                                    return i2 != 30 ? 0.39375d : 0.35d;
                                }
                                return 0.6125d;
                            default:
                                return 0.6125d;
                        }
                    case 24:
                        str2.hashCode();
                        switch (str2) {
                            case "XT1650":
                                b13 = 0;
                                break;
                            case "SM-G935V":
                                b13 = 1;
                                break;
                            case "Moto G (5)":
                                b13 = 2;
                                break;
                            case "Nexus 6P":
                                b13 = 3;
                                break;
                            default:
                                b13 = -1;
                                break;
                        }
                        if (b13 == 0) {
                            return i2 != 60 ? 0.48125d : 0.39375d;
                        }
                        if (b13 == 1) {
                            return 0.3325d;
                        }
                        if (b13 == 2) {
                            return 0.39375d;
                        }
                        if (b13 != 3) {
                            return 0.48125d;
                        }
                        str3.hashCode();
                        int iHashCode7 = str3.hashCode();
                        if (iHashCode7 != -2077737242) {
                            if (iHashCode7 != 802059049) {
                                if (iHashCode7 == 1514345136 && str3.equals("3840x2160")) {
                                    b14 = 2;
                                } else {
                                    b14 = -1;
                                }
                            } else if (str3.equals("1920x1080")) {
                                b14 = 1;
                            } else {
                                b14 = -1;
                            }
                        } else if (str3.equals("640x480")) {
                            b14 = 0;
                        } else {
                            b14 = -1;
                        }
                        if (b14 == 0) {
                            return 0.3325d;
                        }
                        if (b14 != 1) {
                            return b14 != 2 ? 0.39375d : 0.20891d;
                        }
                        return i2 != 30 ? 0.39375d : 0.35d;
                    case 25:
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case -708142656:
                                if (!str2.equals("Redmi 4A")) {
                                }
                                break;
                            case -708142633:
                                if (!str2.equals("Redmi 4X")) {
                                }
                                break;
                            case -708142625:
                                if (!str2.equals("Redmi 5A")) {
                                }
                                break;
                            case -399017595:
                                if (!str2.equals("LM-X210(G)")) {
                                }
                                break;
                            case -78463250:
                                if (!str2.equals("Pixel XL")) {
                                }
                                break;
                            case 2453916:
                                if (!str2.equals("PH-1")) {
                                }
                                break;
                            case 67287038:
                                if (!str2.equals("G8142")) {
                                }
                                break;
                            case 77128294:
                                if (str2.equals("Pixel")) {
                                    b15 = 7;
                                }
                                break;
                            case 514549157:
                                if (str2.equals("SM-J510FN")) {
                                    b15 = 8;
                                }
                                break;
                            case 1311300188:
                                if (str2.equals("ONEPLUS A5000")) {
                                    b15 = 9;
                                }
                                break;
                            case 1467059320:
                                if (str2.equals("Redmi 5 Plus")) {
                                    b15 = 10;
                                }
                                break;
                            case 1691545187:
                                if (str2.equals("CPH1801")) {
                                    b15 = 11;
                                }
                                break;
                            default:
                                break;
                        }
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Switch insn not found in header
                            	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                            	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                            */
                        /*
                            Method dump skipped, instruction units count: 8102
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.transformer.DeviceMappedEncoderBitrateProvider.getBitrateMultiplierFromMapping(java.lang.String, int, java.lang.String, java.lang.String, int):double");
                    }
                }
