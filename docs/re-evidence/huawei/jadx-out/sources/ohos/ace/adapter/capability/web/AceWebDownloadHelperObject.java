package ohos.ace.adapter.capability.web;

import com.huawei.hms.network.embedded.g4;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes46.dex */
public class AceWebDownloadHelperObject {
    private static final int MAX_INCREMENT_ID = 16777216;
    private static final int WEB_ERROR_UNKNOWN = 0;
    private static final int WEB_FILE_FAILED = 1;
    private static final int WEB_FILE_NO_SPACE = 3;
    private static final int WEB_FILE_SAME_AS_SOURCE = 15;
    private static final int WEB_FILE_TOO_SHORT = 13;
    private static final int WEB_FILE_TRANSIENT_ERROR = 10;
    private static final int WEB_NETWORK_DISCONNECTED = 22;
    private static final int WEB_NETWORK_FAILED = 20;
    private static final int WEB_SERVER_BAD_CONTENT = 33;
    private static final int WEB_SERVER_FAILED = 30;
    private static final int WEB_SERVER_FORBIDDEN = 36;
    private static int incrementId_;
    private static List<String> webDownloadFilePathList_ = new ArrayList();
    private static final Object WEB_TOOL_LOCK = new Object();

    public static final int convertsHttpErrorCode(int i) {
        int i2 = 30;
        if (i == 1) {
            return 30;
        }
        if (i == 2) {
            return 22;
        }
        if (i == 403) {
            return 36;
        }
        if (i == 404) {
            return 33;
        }
        if (i != 500) {
            i2 = 0;
            switch (i) {
                case 1000:
                    break;
                case 1001:
                    return 1;
                case 1002:
                    return 20;
                default:
                    switch (i) {
                        case 1006:
                            return 3;
                        case 1007:
                            return 10;
                        case 1008:
                            return 13;
                        case 1009:
                            return 15;
                        default:
                            return 0;
                    }
            }
        }
        return i2;
    }

    public static void removeFilePathFromList(String str) {
        synchronized (WEB_TOOL_LOCK) {
            webDownloadFilePathList_.remove(str);
        }
    }

    public static void addFilePathToList(String str) {
        synchronized (WEB_TOOL_LOCK) {
            webDownloadFilePathList_.add(str);
        }
    }

    public static final String createDownloadGuid() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = incrementId_ + 1;
        incrementId_ = i;
        if (i >= 16777216) {
            incrementId_ = 0;
        }
        return Long.toHexString(jCurrentTimeMillis) + Integer.toHexString(incrementId_ + 16777216);
    }

    public static final boolean isLegalPath(String str) {
        File parentFile = new File(str).getParentFile();
        if (parentFile != null) {
            return (parentFile.exists() || (!parentFile.exists() && parentFile.mkdirs())) && parentFile.canWrite() && parentFile.canRead();
        }
        return false;
    }

    public static final String getNonDuplicatePath(String str) {
        String str2;
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        int iLastIndexOf = str.lastIndexOf(46);
        int i = 1;
        String str3 = str;
        while (true) {
            if (file.exists() || webDownloadFilePathList_.contains(str3)) {
                if (iLastIndexOf != -1) {
                    str2 = str.substring(0, iLastIndexOf) + g4.k + i + g4.l + str.substring(iLastIndexOf);
                } else {
                    str2 = str3 + g4.k + i + g4.l;
                }
                str3 = str2;
                file = new File(str3);
                i++;
            } else {
                addFilePathToList(str3);
                return str3;
            }
        }
    }
}
