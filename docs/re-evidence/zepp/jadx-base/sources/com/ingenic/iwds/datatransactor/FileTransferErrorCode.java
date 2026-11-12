package com.ingenic.iwds.datatransactor;

import com.ingenic.iwds.utils.IwdsAssert;

/* JADX INFO: loaded from: classes18.dex */
public class FileTransferErrorCode {
    public static final int EFILESTATUS = 1;
    public static final int ENOSDCARD = 2;
    public static final int ESDCARDFULL = 3;
    public static final int NOERROR = 0;

    public static String errorString(int i) {
        if (i == 0) {
            return "no error";
        }
        if (i == 1) {
            return "file status error";
        }
        if (i == 2) {
            return "no sdcard";
        }
        if (i == 3) {
            return "sdcard full";
        }
        IwdsAssert.dieIf("FileTransferErrorCode", true, "Unknown error code: " + i);
        return null;
    }
}
