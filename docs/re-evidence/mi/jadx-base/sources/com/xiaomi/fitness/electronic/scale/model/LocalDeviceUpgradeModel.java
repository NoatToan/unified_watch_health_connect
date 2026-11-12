package com.xiaomi.fitness.electronic.scale.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import defpackage.t48;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class LocalDeviceUpgradeModel {

    public static class CheckUpgradeRequest implements Serializable {

        @SerializedName("curr")
        public String currentVersion;
        public String description;
        public String did;

        @SerializedName("ota_failed_code")
        public int failCode;

        @SerializedName("ota_failed_reason")
        public String failReason;
        public boolean force;
        public boolean isLatest;

        @SerializedName("is_owner")
        public boolean isOwner;

        @SerializedName("latest")
        public String latestVersion;

        @SerializedName("ota_progress")
        public int progress;

        @SerializedName("rec")
        public boolean recommend;

        @SerializedName("ota_start_time")
        public int startTime;

        @SerializedName("ota_status")
        public String status;

        @SerializedName("timeout_time")
        public int timeout;
        public boolean updating;

        public static boolean compareVersionName(String str, String str2) {
            String str3;
            String strSubstring = "";
            if (LocalDeviceUpgradeModel.a(str)) {
                Logger.i("checkOTAInfo, CheckUpgradeRequest#compareVersionName, isEmpty(currentVersion)", new Object[0]);
                return false;
            }
            if (LocalDeviceUpgradeModel.a(str2)) {
                Logger.i("checkOTAInfo, CheckUpgradeRequest#compareVersionName, isEmpty(latestVersion)", new Object[0]);
                return false;
            }
            if (str2.contains(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR)) {
                String[] strArrSplit = str.split("\\.|_");
                String[] strArrSplit2 = str2.split("\\.|_");
                int length = strArrSplit.length;
                if (length != strArrSplit2.length) {
                    Logger.i("checkOTAInfo, CheckUpgradeRequest#needUpgrade, currentVersions.length != latestVersions.length", new Object[0]);
                    return false;
                }
                for (int i = 0; i < length; i++) {
                    String str4 = strArrSplit[i];
                    String str5 = strArrSplit2[i];
                    try {
                        if (Integer.parseInt(str4) < Integer.parseInt(str5)) {
                            return true;
                        }
                    } catch (NumberFormatException e) {
                        Logger.e("checkOTAInfo, CheckUpgradeRequest#needUpgrade, parseVersion num failed, curr:" + str4 + ", latest: " + str5, e);
                    }
                }
                return false;
            }
            try {
                String strSubstring2 = str.substring(str.lastIndexOf(".") + 1);
                try {
                    strSubstring = str2.substring(str2.lastIndexOf(".") + 1);
                    return Integer.parseInt(strSubstring2) < Integer.parseInt(strSubstring);
                } catch (Exception e2) {
                    e = e2;
                    String str6 = strSubstring;
                    strSubstring = strSubstring2;
                    str3 = str6;
                    Logger.e("checkOTAInfo, CheckUpgradeRequest mcu #needUpgrade, parseVersion num failed, curr:" + strSubstring + ", latest: " + str3, e);
                    return false;
                }
            } catch (Exception e3) {
                e = e3;
                str3 = "";
            }
        }

        public String getCurrentVersion(String str) {
            return LocalDeviceUpgradeModel.a(this.currentVersion) ? str : this.currentVersion;
        }

        public boolean isDownloading() {
            int i;
            return this.updating || ((i = this.progress) > 0 && i < 100);
        }

        public boolean isOTAFail() {
            String str = this.status;
            return str != null && str.equals("failed");
        }

        public boolean needUpgrade() {
            return needUpgrade(t48.c().f34293a, this);
        }

        public static boolean needUpgrade(String str, CheckUpgradeRequest checkUpgradeRequest) {
            if (!LocalDeviceUpgradeModel.a(checkUpgradeRequest.currentVersion) && !checkUpgradeRequest.isLatest) {
                return true;
            }
            if (LocalDeviceUpgradeModel.a(checkUpgradeRequest.latestVersion)) {
                return false;
            }
            if (LocalDeviceUpgradeModel.a(checkUpgradeRequest.currentVersion)) {
                Logger.i("checkOTAInfo, CheckUpgradeRequest#needUpgrade, isEmpty(currentVersion), deviceVersion: " + str, new Object[0]);
                checkUpgradeRequest.currentVersion = str;
            }
            Logger.i("checkOTAInfo, CheckUpgradeRequest#needUpgrade, latestVersion: " + checkUpgradeRequest.latestVersion + ", currentVersion: " + checkUpgradeRequest.currentVersion, new Object[0]);
            return compareVersionName(checkUpgradeRequest.currentVersion, checkUpgradeRequest.latestVersion);
        }
    }

    public static boolean a(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
