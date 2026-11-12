package com.xiaomi.hm.health.ui.sportfitness.utils;

import android.content.Context;
import android.text.TextUtils;
import com.huami.moving.ui.utils.SportDeviceUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes22.dex */
public class ExerciseDeviceIdentifier {
    private static String a(String deviceDescriptions) {
        if (TextUtils.isEmpty(deviceDescriptions)) {
            return null;
        }
        for (String str : deviceDescriptions.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER)) {
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length > 3) {
                return strArrSplit[3];
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x009c A[RETURN] */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0013. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0016. Please report as an issue. */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x0077, please report this as an issue */
    public static String getDeviceNameId(Context context, int runSource, String device) {
        String strA;
        boolean z;
        HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.VDEVICE;
        boolean z2 = true;
        if (runSource != 0) {
            if (runSource == 1) {
                hMDeviceSourceFromValue = HMDeviceSource.WATCH_AMAZFIT;
            } else if (runSource == 4) {
                hMDeviceSourceFromValue = HMDeviceSource.WATCH_EVEREST;
            } else if (runSource == 5) {
                hMDeviceSourceFromValue = HMDeviceSource.WATCH_EVEREST_2S;
            } else {
                if (runSource != 11) {
                    switch (runSource) {
                        case 31:
                            hMDeviceSourceFromValue = HMDeviceSource.WATCH_AMAZFIT_XIHU;
                            break;
                        case 32:
                            hMDeviceSourceFromValue = HMDeviceSource.WATCH_AMAZFIT_XIHU_E;
                            break;
                        case 33:
                            hMDeviceSourceFromValue = HMDeviceSource.WATCH_AMAZFIT_XIHU_EA;
                            break;
                        case 34:
                            hMDeviceSourceFromValue = HMDeviceSource.WATCH_AMAZFIT_XIHU_DISNEY;
                            break;
                        case 35:
                            hMDeviceSourceFromValue = HMDeviceSource.SMART_WATCH_EVEREST_2;
                            break;
                        default:
                            switch (runSource) {
                                case 510:
                                    hMDeviceSourceFromValue = HMDeviceSource.SMART_WATCH_EVEREST_2S;
                                    break;
                                case 511:
                                    hMDeviceSourceFromValue = HMDeviceSource.SMART_WATCH_EVEREST_2W;
                                    break;
                                case 512:
                                    hMDeviceSourceFromValue = HMDeviceSource.SMART_WATCH_EVEREST_2SW;
                                    break;
                                default:
                                    if (TextUtils.isEmpty(device)) {
                                        strA = null;
                                    } else {
                                        strA = null;
                                        for (int i : SportDeviceUtils.analysisSportDeviceStr(device)) {
                                            hMDeviceSourceFromValue = HMDeviceSource.fromValue(i);
                                            if (hMDeviceSourceFromValue == HMDeviceSource.MILI_WUHAN) {
                                                strA = a(device);
                                            }
                                            if (hMDeviceSourceFromValue.getType() != HMDeviceType.MILI) {
                                            }
                                        }
                                    }
                                    z = true;
                                    break;
                            }
                            break;
                    }
                    if (z2) {
                        return HMDeviceUtils.getDeviceDescription(context, hMDeviceSourceFromValue, (String) null);
                    }
                    if (!z) {
                        return null;
                    }
                    HMLog.i("[水印]", "source: " + hMDeviceSourceFromValue + ", hardwareVersion: " + strA, new Object[0]);
                    return HMDeviceUtils.getMiLiDeviceDescription(hMDeviceSourceFromValue, strA);
                }
                hMDeviceSourceFromValue = HMDeviceSource.WATCH_AMAZFIT_QOG;
            }
            strA = null;
            z = false;
            if (z2) {
                return HMDeviceUtils.getDeviceDescription(context, hMDeviceSourceFromValue, (String) null);
            }
            if (!z) {
                return null;
            }
            HMLog.i("[水印]", "source: " + hMDeviceSourceFromValue + ", hardwareVersion: " + strA, new Object[0]);
            return HMDeviceUtils.getMiLiDeviceDescription(hMDeviceSourceFromValue, strA);
        }
        strA = null;
        z = false;
        z2 = false;
        if (z2) {
            return HMDeviceUtils.getDeviceDescription(context, hMDeviceSourceFromValue, (String) null);
        }
        if (!z) {
            return null;
        }
        HMLog.i("[水印]", "source: " + hMDeviceSourceFromValue + ", hardwareVersion: " + strA, new Object[0]);
        return HMDeviceUtils.getMiLiDeviceDescription(hMDeviceSourceFromValue, strA);
    }
}
