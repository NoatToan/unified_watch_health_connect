package com.xiaomi.hm.health.view;

import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import com.tencent.connect.common.Constants;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;

/* JADX INFO: loaded from: classes22.dex */
public class WarningManager {
    private static final String a = "WarningManager";

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            a = iArr;
            try {
                iArr[HMDeviceSource.MILI_DTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMDeviceSource.MILI_DTH_W.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMDeviceSource.MILI_BEATS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMDeviceSource.MILI_BEATS_W.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMDeviceSource.MILI_TEMPO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMDeviceSource.MILI_PEYTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[HMDeviceSource.MILI_PEYTO_L.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[HMDeviceSource.MILI_PEYTO_WL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static String getDthBeatsChaohuTempoPlayUrl(HMDeviceSource source) {
        String strValueOf;
        String host = HMServerDef.getHost();
        String str = "44";
        String str2 = "256";
        String strValueOf2 = "";
        switch (a.a[source.ordinal()]) {
            case 1:
                strValueOf2 = String.valueOf(HMDeviceType.MILI.getValue());
                strValueOf = String.valueOf(HMDeviceSource.MILI_DTH.getValue());
                str = "58";
                break;
            case 2:
                strValueOf2 = String.valueOf(HMDeviceType.MILI.getValue());
                strValueOf = String.valueOf(HMDeviceSource.MILI_DTH_W.getValue());
                str = "27";
                str2 = "";
                break;
            case 3:
                strValueOf2 = String.valueOf(HMDeviceType.MILI.getValue());
                strValueOf = String.valueOf(HMDeviceSource.MILI_BEATS.getValue());
                str = "20";
                break;
            case 4:
                strValueOf2 = String.valueOf(HMDeviceType.MILI.getValue());
                strValueOf = String.valueOf(HMDeviceSource.MILI_BEATS_W.getValue());
                str = Constants.VIA_REPORT_TYPE_CHAT_VIDEO;
                break;
            case 5:
                strValueOf2 = String.valueOf(HMDeviceType.MILI.getValue());
                strValueOf = String.valueOf(HMDeviceSource.MILI_TEMPO.getValue());
                str = Constants.VIA_REPORT_TYPE_START_WAP;
                str2 = "1";
                break;
            case 6:
                strValueOf2 = String.valueOf(HMDeviceType.MILI.getValue());
                strValueOf = String.valueOf(HMDeviceSource.MILI_PEYTO.getValue());
                str = Constants.VIA_REPORT_TYPE_WPA_STATE;
                break;
            case 7:
                strValueOf2 = String.valueOf(HMDeviceType.MILI.getValue());
                strValueOf = String.valueOf(HMDeviceSource.MILI_PEYTO_L.getValue());
                break;
            case 8:
                strValueOf2 = String.valueOf(HMDeviceType.MILI.getValue());
                strValueOf = String.valueOf(HMDeviceSource.MILI_PEYTO_WL.getValue());
                str2 = "257";
                break;
            default:
                strValueOf = "";
                str = strValueOf;
                str2 = str;
                break;
        }
        String str3 = String.format("%1$st/posts/mifit?meta_key=device&category=2&meta_value=%2$s.%3$s.%4$s.%5$s", host, str, str2, strValueOf2, strValueOf);
        HMLog.i(a, "source: " + source + ", url: " + str3, new Object[0]);
        return str3;
    }
}
