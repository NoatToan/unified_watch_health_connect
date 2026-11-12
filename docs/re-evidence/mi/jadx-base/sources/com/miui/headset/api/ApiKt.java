package com.miui.headset.api;

import com.xiaomi.fitness.pay.export.data.response.OrderStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0006\u001a\u00020\u0001*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0016\u0010\t\u001a\u00020\u0003*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\u0003*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\"\u0016\u0010\u000e\u001a\u00020\u000f*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010\"\u0016\u0010\u0011\u001a\u00020\u000f*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010\"\u0016\u0010\u0012\u001a\u00020\u000f*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\"\u0016\u0010\u0013\u001a\u00020\u0001*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\b\"\u0016\u0010\u0015\u001a\u00020\u0001*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\b\"\u0016\u0010\u0017\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"CALLER", "", "DefaultAncMode", "", "LOCAL_DEVICE_ID", "REMOTE_LOCAL_DEVICE_ID", "ancStateName", "getAncStateName", "(I)Ljava/lang/String;", "convertHeadsetResult", "getConvertHeadsetResult", "(Ljava/lang/String;)I", "convertSingleHeadsetResult", "getConvertSingleHeadsetResult", "isActiveChange", "", "(I)Z", "isPropertyUpdate", "isSupportAncStateToOpAnc", "resultName", "getResultName", "updateTypeName", "getUpdateTypeName", "wearStatusName", "getWearStatusName", "(Ljava/lang/String;)Ljava/lang/String;", "api_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ApiKt {

    @NotNull
    public static final String CALLER = "caller";
    public static final int DefaultAncMode = 7;

    @NotNull
    public static final String LOCAL_DEVICE_ID = "local_device_id";

    @NotNull
    public static final String REMOTE_LOCAL_DEVICE_ID = "remote_local_device_id";

    @NotNull
    public static final String getAncStateName(int i) {
        if (i == -1) {
            return "AncNotSupport";
        }
        if (i == 0) {
            return "AncClose";
        }
        if (i == 1) {
            return "AncOn";
        }
        if (i == 2) {
            return "TransparentOn";
        }
        return "?(" + i + ')';
    }

    public static final int getConvertHeadsetResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iHashCode = str.hashCode();
        if (iHashCode == 1444) {
            str.equals("-1");
            return 212;
        }
        switch (iHashCode) {
            case 48:
                return !str.equals("0") ? 212 : 209;
            case 49:
                return !str.equals("1") ? 212 : 100;
            case 50:
                return !str.equals("2") ? 212 : 210;
            case 51:
                return !str.equals("3") ? 212 : 211;
            default:
                return 212;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e A[RETURN, SYNTHETIC] */
    public static final int getConvertSingleHeadsetResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iHashCode = str.hashCode();
        if (iHashCode == 1444) {
            str.equals("-1");
            return 212;
        }
        switch (iHashCode) {
            case 48:
                return !str.equals("0") ? 212 : 230;
            case 49:
                if (str.equals("1")) {
                    return 100;
                }
                return 212;
            case 50:
                if (str.equals("2")) {
                    return 100;
                }
                return 212;
            case 51:
                if (str.equals("3")) {
                    return 100;
                }
                return 212;
            default:
                return 212;
        }
    }

    @NotNull
    public static final String getResultName(int i) {
        if (i == -4) {
            return "Break";
        }
        if (i == -3) {
            return OrderStatus.CANCEL;
        }
        if (i == -2) {
            return "Blocking";
        }
        if (i == -1) {
            return "Default";
        }
        if (i == 100) {
            return "Success";
        }
        if (i == 230) {
            return "HeadsetNotSingleWorn";
        }
        if (i == 310) {
            return "TvSoundBoxStyleOn";
        }
        if (i == 501) {
            return "HeadsetBondStateChange";
        }
        if (i == 20222) {
            return "RemoteCirculateStartTimeout";
        }
        if (i == 20223) {
            return "RequestCirculateStartTimeout";
        }
        switch (i) {
            case 201:
                return "Failed";
            case 202:
                return "Timeout";
            case 203:
                return "BluetoothUnEnable";
            case 204:
                return "NeedUpgrade";
            case 205:
                return "OpNotSupport";
            case 206:
                return "TargetNotMatch";
            case 207:
                return "HeadsetNotSupportAncMode";
            case 208:
                return "ValidAncMode";
            case 209:
                return "HeadsetNotWorn";
            case 210:
                return "HeadsetLeftWorn";
            case 211:
                return "HeadsetRightWorn";
            case 212:
                return "HeadsetWornError";
            case 213:
                return "IpcRemoteException";
            case 214:
                return "RpcRemoteException";
            case 215:
                return "HostNotBound";
            case 216:
                return "AcquiredByOtherHost";
            case 217:
                return "RemoteHostBluetoothUnEnable";
            case 218:
                return "LocalXiaomiAccountBlank";
            case 219:
                return "RemoteXiaomiAccountBlank";
            case 220:
                return "XiaomiAccountNotMatch";
            case 221:
                return "RemoteNeedUpgrade";
            default:
                switch (i) {
                    case 301:
                        return "TargetHostIsActiveBySameAddress";
                    case 302:
                        return "TargetHeadsetNotBonded";
                    case 303:
                        return "TargetHostNotActive";
                    case 304:
                        return "RomNeedUpgrade";
                    case 305:
                        return "BondFailed";
                    case 306:
                        return "BondBonded";
                    case 307:
                        return "BondNone";
                    case 308:
                        return "TargetHeadsetManualBond";
                    default:
                        switch (i) {
                            case 401:
                                return "ActiveHeadsetChange";
                            case 402:
                                return "ActiveHeadsetLost";
                            case 403:
                                return "HeadsetPropertyUpdate";
                            case 404:
                                return "HeadsetNameChanged";
                            case 405:
                                return "HeadsetVolumeChanged";
                            case 406:
                                return "HeadsetBatteryChanged";
                            case 407:
                                return "HeadsetModeChanged";
                            default:
                                switch (i) {
                                    case 2010:
                                        return "SetActiveFailed";
                                    case 2011:
                                        return "ActiveChangedFailed";
                                    case 2012:
                                        return "UnInitFailed";
                                    case 2013:
                                        return "ConnectFailed";
                                    case 2014:
                                        return "DisconnectFailed";
                                    default:
                                        switch (i) {
                                            case 20201:
                                                return "ProfileConnectTimeout";
                                            case 20202:
                                                return "RemoteConnectTimeout";
                                            case 20203:
                                                return "RequestConnectTimeout";
                                            default:
                                                switch (i) {
                                                    case 20211:
                                                        return "ProfileDisconnectTimeout";
                                                    case 20212:
                                                        return "RemoteDisconnectTimeout";
                                                    case 20213:
                                                        return "RequestDisconnectTimeout";
                                                    default:
                                                        return "?(" + i + ')';
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @NotNull
    public static final String getUpdateTypeName(int i) {
        switch (i) {
            case 1:
                return "HostFound";
            case 2:
                return "ActiveHeadsetChange";
            case 3:
                return "ActiveHeadsetLost";
            case 4:
                return "HeadsetPropertyChanged";
            case 5:
                return "HeadsetNameChanged";
            case 6:
                return "HeadsetVolumeChanged";
            case 7:
                return "HeadsetBatteryChanged";
            case 8:
                return "HeadsetModeChanged";
            default:
                return "?(" + i + ')';
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final String getWearStatusName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int iHashCode = str.hashCode();
        if (iHashCode != 1444) {
            switch (iHashCode) {
                case 48:
                    if (str.equals("0")) {
                        return "NotWorn";
                    }
                    break;
                case 49:
                    if (str.equals("1")) {
                        return "AllWorn";
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        return "LeftWorn";
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        return "RightWorn";
                    }
                    break;
            }
        } else if (str.equals("-1")) {
            return "Error";
        }
        return "?(" + str + ')';
    }

    public static final boolean isActiveChange(int i) {
        return i == 2 || i == 3;
    }

    public static final boolean isPropertyUpdate(int i) {
        return i == 4 || i == 5 || i == 6 || i == 7 || i == 8;
    }

    public static final boolean isSupportAncStateToOpAnc(int i) {
        return i >= 0 && i < 3;
    }
}
