package com.miui.tsmclient.common.net.host;

import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Host {
    public static final String KEY_TSM_AUTH_SERVICE = "TSM_AUTH_SERVICE";
    public static final int VALUE_TSM_AUTH_SERVICE_ONLINE = 5;
    public static final int VALUE_TSM_AUTH_SERVICE_PREVIEW = 4;
    public static final int VALUE_TSM_AUTH_SERVICE_STAGING = 0;
    public static final int VALUE_TSM_AUTH_SERVICE_STAGING1 = 1;
    public static final int VALUE_TSM_AUTH_SERVICE_STAGING2 = 2;
    public static final int VALUE_TSM_AUTH_SERVICE_STAGING3 = 3;
    public static final int VALUE_TSM_AUTH_SERVICE_STAGING_EXTERNAL = 6;
    public static final int VALUE_TSM_AUTH_SERVICE_UNKNOWN = -1;
    private static int sStagingIndex = -1;

    public static int getStagingIndex() {
        if (sStagingIndex == -1) {
            if (new File("/data/system/tsmconfig/tsm_auth_server_staging").exists()) {
                sStagingIndex = 0;
            } else if (new File("/data/system/tsmconfig/tsm_auth_server_staging1").exists()) {
                sStagingIndex = 1;
            } else if (new File("/data/system/tsmconfig/tsm_auth_server_staging2").exists()) {
                sStagingIndex = 2;
            } else if (new File("/data/system/tsmconfig/tsm_auth_server_staging3").exists()) {
                sStagingIndex = 3;
            } else if (new File("/data/system/tsmconfig/preview_tsm_auth_server_staging").exists()) {
                sStagingIndex = 4;
            }
        }
        return sStagingIndex;
    }

    public static boolean isStagingExternal() {
        return sStagingIndex == 6;
    }

    public static void setStagingIndex(int i) {
        sStagingIndex = i;
    }

    public abstract String getAuthType();

    public abstract String getOnlineHost();

    public abstract String getServiceId();

    public abstract String getStagingHost();
}
