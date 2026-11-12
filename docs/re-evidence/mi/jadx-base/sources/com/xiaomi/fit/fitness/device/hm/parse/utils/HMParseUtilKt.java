package com.xiaomi.fit.fitness.device.hm.parse.utils;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.data.common.data.annotation.SleepState;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003\u001a\u0010\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\b\u001a\u00020\u0003\u001a\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003\u001a\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003\u001a\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002\u001a\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0018\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"TAG", "", "matchActiveStageType", "", "type", "matchSleepMode", "mode", "convertMiToHMSleepMode", "state", "byteToInt", PluginDeviceInfo.FDESC, "matchSwimType", "switchHmToMiProtoSportType", "hmType", "supportHundredType", "", DailyRecordKey.sportType, "matchHundredSportType", "isTriathlon", "appendBytesToFile", "", "byteBuffer", "Ljava/nio/ByteBuffer;", "file", "Ljava/io/File;", "isSupportSyncRestHr", "did", "fitness-sync_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class HMParseUtilKt {

    @NotNull
    public static final String TAG = "FitnessHMDataParse";

    public static final void appendBytesToFile(@Nullable ByteBuffer byteBuffer, @NotNull File file) throws Throwable {
        int iPosition;
        Intrinsics.checkNotNullParameter(file, "file");
        if (byteBuffer == null || (iPosition = byteBuffer.position()) == 0) {
            return;
        }
        byte[] bArr = new byte[iPosition];
        byteBuffer.clear();
        byteBuffer.get(bArr);
        byteBuffer.clear();
        FileUtils.writeFile(file, (InputStream) new ByteArrayInputStream(bArr), true);
    }

    public static final int byteToInt(int i) {
        return i & 255;
    }

    public static final int convertMiToHMSleepMode(@SleepState int i) {
        if (i == 2) {
            return 5;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 8;
    }

    public static final boolean isSupportSyncRestHr(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        return wearableDeviceModel != null && DeviceModelExtKt.isL66(wearableDeviceModel);
    }

    public static final boolean isTriathlon(int i) {
        return i == 1001 || i == 1009 || i == 1015 || i == 2001;
    }

    public static final int matchActiveStageType(int i) {
        if (i == 1) {
            return 5;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 6;
        }
        if (i != 4) {
            return i != 7 ? 0 : 7;
        }
        return 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:152:0x0231 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x0233 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0239 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x002f A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX WARN: Switch 'out' block B:17:0x002f for B:15:0x0029 already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:17:0x002f for B:9:0x0018 already processed. Defaulting to fallback option. */
    public static final int matchHundredSportType(int i) {
        int iSwitchHmToMiProtoSportType = switchHmToMiProtoSportType(i);
        if (!supportHundredType(iSwitchHmToMiProtoSportType)) {
            return iSwitchHmToMiProtoSportType;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return 1;
            case 6:
                return 2;
            case 7:
                return 5;
            case 8:
                return 3;
            case 9:
                return 6;
            case 10:
                return 7;
            case 11:
            case 16:
                return 8;
            case 12:
                return 11;
            case 13:
                return 4;
            case 14:
                return 9;
            case 15:
                return 10;
            case 17:
                return 609;
            case 18:
                return 600;
            default:
                switch (i) {
                    case 21:
                        return 14;
                    case 22:
                        return 15;
                    case 23:
                        return 13;
                    case 24:
                        return 399;
                    case 25:
                        return 3;
                    case 26:
                        return 1;
                    default:
                        switch (i) {
                            default:
                                switch (i) {
                                    case 40:
                                        return 333;
                                    case 41:
                                        return 701;
                                    case 42:
                                        return 708;
                                    case 43:
                                        break;
                                    case 44:
                                        return 700;
                                    case 45:
                                        return 707;
                                    case 46:
                                        return 710;
                                    case 47:
                                        return 6;
                                    case 48:
                                        return 206;
                                    case 49:
                                        return 16;
                                    case 50:
                                        return 303;
                                    case 51:
                                        return 332;
                                    case 52:
                                        return 308;
                                    case 53:
                                        return 307;
                                    case 54:
                                        return 300;
                                    case 55:
                                        return 304;
                                    default:
                                        switch (i) {
                                            case 57:
                                                return 326;
                                            case 58:
                                                return 302;
                                            case 59:
                                                return 306;
                                            case 60:
                                                return 12;
                                            case 61:
                                                return 305;
                                            case 62:
                                                return 114;
                                            case 63:
                                            case 68:
                                            case 84:
                                            case 2002:
                                                break;
                                            case 64:
                                                return 806;
                                            case 65:
                                                return 100;
                                            case 66:
                                                return 107;
                                            case 67:
                                                return 201;
                                            case 69:
                                                return 202;
                                            case 70:
                                                return 200;
                                            case 71:
                                                return 402;
                                            case 72:
                                                return 401;
                                            case 73:
                                                return 400;
                                            case 74:
                                                return 403;
                                            case 75:
                                                return 411;
                                            case 76:
                                                return 499;
                                            case 77:
                                                return 404;
                                            case 78:
                                                return 610;
                                            case 79:
                                                return 603;
                                            case 80:
                                                return 612;
                                            case 81:
                                                return 613;
                                            case 82:
                                                return 605;
                                            case 83:
                                                return 619;
                                            case 85:
                                                return 601;
                                            case 86:
                                                return 604;
                                            case 87:
                                                return 625;
                                            case 88:
                                                return 602;
                                            case 89:
                                                return 607;
                                            case 90:
                                                return 606;
                                            case 91:
                                                return 611;
                                            case 92:
                                                return 608;
                                            case 93:
                                                return 800;
                                            case 94:
                                                return 10000;
                                            case 95:
                                                return 509;
                                            case 96:
                                                return 507;
                                            case 97:
                                                return 500;
                                            case 98:
                                                return 505;
                                            case 99:
                                                return 501;
                                            case 100:
                                                return 503;
                                            case 101:
                                                return 504;
                                            case 102:
                                                return 506;
                                            case 103:
                                                return 502;
                                            case 104:
                                                return 508;
                                            case 105:
                                                return 709;
                                            case 106:
                                                return 113;
                                            case 109:
                                                return 310;
                                            case 133:
                                                return 205;
                                            case 136:
                                                return 703;
                                            case 185:
                                                return 412;
                                            case 1001:
                                            case 1009:
                                            case 1015:
                                            case 2001:
                                                return 17;
                                            default:
                                                switch (i) {
                                                    case 111:
                                                        return 329;
                                                    case 112:
                                                        return 407;
                                                    case 113:
                                                        return 406;
                                                    case 114:
                                                        return 330;
                                                    case 115:
                                                        return 804;
                                                    case 116:
                                                        return 807;
                                                    case 117:
                                                        return 801;
                                                    case 118:
                                                        return 805;
                                                    case 119:
                                                        return 803;
                                                    case 120:
                                                        return 808;
                                                    case 121:
                                                        return 616;
                                                    case 122:
                                                        return 617;
                                                    case 123:
                                                        return 106;
                                                    case 124:
                                                        return 108;
                                                    case 125:
                                                        return 705;
                                                    case 126:
                                                        return 706;
                                                    default:
                                                        switch (i) {
                                                            case 129:
                                                                return 203;
                                                            case 130:
                                                                return 309;
                                                            case 131:
                                                                return 207;
                                                            default:
                                                                switch (i) {
                                                                    case 138:
                                                                        return 115;
                                                                    case 139:
                                                                        return 104;
                                                                    case 140:
                                                                        return 105;
                                                                    default:
                                                                        switch (i) {
                                                                            case 143:
                                                                                return 324;
                                                                            case 144:
                                                                                return 325;
                                                                            case 145:
                                                                                return 312;
                                                                            case 146:
                                                                                return 405;
                                                                            case 147:
                                                                                return 511;
                                                                            case 148:
                                                                                return 510;
                                                                            case 149:
                                                                                return 327;
                                                                            case 150:
                                                                                return 328;
                                                                            case 151:
                                                                                return 614;
                                                                            case 152:
                                                                                return 618;
                                                                            case 153:
                                                                                return 626;
                                                                            case 154:
                                                                                return 102;
                                                                            case 155:
                                                                                return 109;
                                                                            case 156:
                                                                                return 111;
                                                                            case 157:
                                                                                return 112;
                                                                            case 158:
                                                                                return 704;
                                                                            case 159:
                                                                                return 809;
                                                                            case 160:
                                                                                return 627;
                                                                            case 161:
                                                                                return 620;
                                                                            case 162:
                                                                                return 615;
                                                                            case 163:
                                                                                return 810;
                                                                            case 164:
                                                                                return 621;
                                                                            case 165:
                                                                                return 408;
                                                                            case 166:
                                                                                return 409;
                                                                            case 167:
                                                                                return 331;
                                                                            case 168:
                                                                                return 410;
                                                                            case 169:
                                                                                return 622;
                                                                            case 170:
                                                                                return 623;
                                                                            case 171:
                                                                                return 624;
                                                                            case 172:
                                                                                return 114;
                                                                            case 173:
                                                                                return 900;
                                                                            case 174:
                                                                                return 901;
                                                                            case 175:
                                                                                return 902;
                                                                            case 176:
                                                                                return 903;
                                                                            case 177:
                                                                                return 904;
                                                                            default:
                                                                                switch (i) {
                                                                                    case SportReportBaseParser.ReportType.descentCount /* 189 */:
                                                                                        return 811;
                                                                                    case SportReportBaseParser.ReportType.maxWaterTemperature /* 190 */:
                                                                                        return 204;
                                                                                    case SportReportBaseParser.ReportType.minWaterTemperature /* 191 */:
                                                                                        return 600;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                        break;
                                }
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                                return 8;
                        }
                        break;
                }
                break;
        }
    }

    public static final int matchSleepMode(int i) {
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 2;
        }
        if (i != 7) {
            return i != 8 ? 0 : 4;
        }
        return 5;
    }

    public static final int matchSwimType(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        if (i != 4) {
            return i != 6 ? -1 : 4;
        }
        return 0;
    }

    private static final boolean supportHundredType(int i) {
        if (i != 3 && i != 8 && i != 18) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final int switchHmToMiProtoSportType(int i) {
        if (i != 25) {
            if (i != 26) {
                if (i != 40) {
                    if (i != 44) {
                        if (i == 60) {
                            return 12;
                        }
                        if (i != 69) {
                            if (i == 92) {
                                return 18;
                            }
                            if (i != 94) {
                                if (i != 131) {
                                    if (i != 138) {
                                        switch (i) {
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                            case 7:
                                                break;
                                            case 8:
                                                break;
                                            case 9:
                                                break;
                                            case 10:
                                                return 7;
                                            default:
                                                switch (i) {
                                                    case 12:
                                                        return 11;
                                                    case 13:
                                                        return 4;
                                                    case 14:
                                                        return 9;
                                                    case 15:
                                                        return 10;
                                                    default:
                                                        switch (i) {
                                                            case 21:
                                                                return 14;
                                                            case 22:
                                                                break;
                                                            case 23:
                                                                return 13;
                                                            default:
                                                                switch (i) {
                                                                    case 47:
                                                                    case 48:
                                                                        break;
                                                                    case 49:
                                                                        return 16;
                                                                    default:
                                                                        switch (i) {
                                                                            case 65:
                                                                            case 66:
                                                                            case 67:
                                                                                break;
                                                                            default:
                                                                                return 8;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return 23;
                }
            }
            return 22;
        }
        return 3;
    }
}
