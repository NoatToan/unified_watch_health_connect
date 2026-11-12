package defpackage;

import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes32.dex */
public class ipd {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    public static int c(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "SPORT_TYPE_OUTDOOR_CYCLE":
                b2 = 0;
                break;
            case "SPORT_TYPE_INDOOR_RUN":
                b2 = 1;
                break;
            case "SPORT_TYPE_OUTDOOR_WALK":
                b2 = 2;
                break;
            case "SPORT_TYPE_OUTDOOR_RUN":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return 3;
        }
        if (b2 == 1) {
            return 4;
        }
        if (b2 == 2) {
            return 1;
        }
        if (b2 != 3) {
            LogUtil.d("FaStepCardUtil", "getSportTypeForDeeplink unknown type.");
        }
        return 2;
    }
}
