package com.ingenic.iwds.uniconnect;

import com.ingenic.iwds.utils.IwdsAssert;

/* JADX INFO: loaded from: classes18.dex */
public class UniconnectErrorCode {
    public static final int EDISABLED = -7;
    public static final int EDISCOVERYISONGING = -8;
    public static final int ELINKDISCONNECTED = -2;
    public static final int ELINKUNBONDED = -1;
    public static final int EPORTBUSY = -3;
    public static final int EPORTCLOSED = -5;
    public static final int EPORTDISCONNECTED = -6;
    public static final int EREMOTEEXCEPTION = -4;
    public static final int ETIMEOUT = -11;
    public static final int NOERROR = 0;

    public static String errorString(int i) {
        switch (i) {
            case -6:
                return "port was disconnected";
            case -5:
                return "port was closed";
            case -4:
                return "remote service was died";
            case -3:
                return "port is busy(grabbed)";
            case -2:
                return "link was disconnected";
            case -1:
                return "link was unbonded";
            default:
                IwdsAssert.dieIf("UniconnectErrorCode", true, "Implement me.");
                return null;
        }
    }
}
