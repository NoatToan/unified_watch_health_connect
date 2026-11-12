package com.huawei.hianalytics.process;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.huawei.hianalytics.c;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.g2;
import com.huawei.hianalytics.v1;
import com.huawei.hianalytics.x;
import com.huawei.hianalytics.y;
import com.huawei.secure.android.common.encrypt.hash.SHA;
import com.huawei.secure.android.common.webview.UriUtil;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class HiAnalyticsConfig {
    public x config;

    private void setAAID(String str) {
        this.config.n = str;
    }

    private void setCacheExpiryTime(int i) {
        this.config.j = i;
    }

    private void setChannel(String str) {
        this.config.d = str;
    }

    private void setCollectURL(String str) {
        this.config.e = str;
    }

    private void setDecryptBatchSize(int i) {
        this.config.u = i;
    }

    private void setDecryptBatchSleepTime(int i) {
        this.config.v = i;
    }

    private void setDecryptMaxBatchSize(int i) {
        this.config.t = i;
    }

    private void setDeviceConfig(Builder builder) {
        y yVar = this.config.l;
        if (yVar == null) {
            yVar = new y();
        }
        yVar.f11726a = builder.isImeiEnabled;
        yVar.e = builder.imeiCustom;
        yVar.d = builder.isAndroidIdEnabled;
        yVar.g = builder.androidIdCustom;
        yVar.f11727b = builder.isSNEnabled;
        yVar.h = builder.snCustom;
        yVar.f11728c = builder.isUDIDEnabled;
        yVar.f = builder.udidCustom;
    }

    private void setEncrypted(Boolean bool) {
        this.config.p = bool;
    }

    private void setHttpHeaders(Map<String, String> map) {
        this.config.m = map;
    }

    private void setLimitSize(int i) {
        this.config.i = i;
    }

    private void setLocalEncrypted(Boolean bool) {
        this.config.q = bool;
    }

    private void setMccMncEnabled(boolean z) {
        this.config.f11724b = z;
    }

    private void setMetricPolicy(int i) {
        this.config.s = i;
    }

    private void setRemoteServerUrl(String str) {
        this.config.getClass();
    }

    private void setShortLinkEnabled(boolean z) {
        this.config.w = z;
    }

    private void setSionEnable(boolean z) {
        this.config.f11725c = z;
    }

    private void setUploadEncrypted(Boolean bool) {
        this.config.r = bool;
    }

    public void setUUIDEnabled(boolean z) {
        this.config.k = z;
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class Builder {
        private static final String TAG = "HAConfig";
        private String aaidCustom;
        private String androidIdCustom;
        private String channel;
        private String collectURL;
        private Map<String, String> httpHeaders;
        private String imeiCustom;
        private boolean isAndroidIdEnabled;
        private Boolean isEncrypted;
        private boolean isImeiEnabled;
        private boolean isMccMncEnabled;
        private boolean isSNEnabled;
        private boolean isSessionEnabled;
        private boolean isUDIDEnabled;
        private Boolean localEncrypted;
        private String remoteServerUrl;
        private boolean shortLinkEnabled;
        private String snCustom;
        private String udidCustom;
        private Boolean uploadEncrypted;
        private int portLimitSize = 30;
        private int expiryTime = 7;
        private boolean isUUIDEnabled = false;
        private int metricPolicy = 1;
        private int decryptMaxBatchSize = 500;
        private int decryptBatchSize = 500;
        private int decryptBatchSleepTime = 0;

        public Builder() {
            HiLog.setLogAdapter(new c());
        }

        public HiAnalyticsConfig build() {
            return new HiAnalyticsConfig(this);
        }

        public Builder setAAID(String str) {
            if (!v1.a(4096, "aaid_CustomSet", str)) {
                str = "";
            }
            this.aaidCustom = str;
            return this;
        }

        public Builder setAndroidId(String str) {
            if (!v1.a(4096, "AndroidId_CustomSet", str)) {
                str = "";
            }
            this.androidIdCustom = str;
            return this;
        }

        public Builder setAutoReportThresholdSize(int i) {
            this.portLimitSize = Math.min(Math.max(i, 10), 100);
            return this;
        }

        public Builder setCacheExpireTime(int i) {
            this.expiryTime = Math.min(Math.max(i, 2), 7);
            return this;
        }

        public Builder setCollectURL(String str) {
            String hostByURI;
            String string;
            if (!TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(str)) {
                    HiLog.i("UriUtil", "url is null");
                    hostByURI = str;
                } else {
                    try {
                        if (!URLUtil.isNetworkUrl(str) || str.toLowerCase(Locale.US).startsWith("http:")) {
                            HiLog.e("UriUtil", "url don't starts with https");
                            hostByURI = null;
                        } else {
                            hostByURI = UriUtil.getHostByURI(str);
                        }
                    } catch (Exception unused) {
                        HiLog.e("UriUtil", "getHostByURI error");
                    }
                }
                if (TextUtils.isEmpty(hostByURI)) {
                    HiLog.e("UriUtil", "url or whitelistHash is null");
                } else {
                    String strSha256Encrypt = SHA.sha256Encrypt(hostByURI);
                    String[] strArr = g2.f11540a;
                    int i = 0;
                    while (true) {
                        if (i >= 17) {
                            if (TextUtils.isEmpty(hostByURI)) {
                                HiLog.i("UriUtil", "url is null");
                                string = hostByURI;
                            } else {
                                String[] strArrSplit = hostByURI.split("\\.");
                                if (strArrSplit.length < 2) {
                                    string = "";
                                } else {
                                    StringBuffer stringBuffer = new StringBuffer();
                                    stringBuffer.append(strArrSplit[strArrSplit.length - 2]);
                                    string = stringBuffer.append(".").append(strArrSplit[strArrSplit.length - 1]).toString();
                                }
                            }
                            if (TextUtils.isEmpty(string)) {
                                HiLog.e("UriUtil", "get urlLastNStr is null");
                            } else {
                                String strSha256Encrypt2 = SHA.sha256Encrypt(string);
                                String[] strArr2 = g2.f11540a;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < 17) {
                                        if (strArr2[i2].equals(strSha256Encrypt2)) {
                                            try {
                                                String strSubstring = hostByURI.substring(0, hostByURI.length() - string.length());
                                                if (!strSubstring.endsWith(".") || !strSubstring.matches("^[A-Za-z0-9.-]+$")) {
                                                    break;
                                                }
                                                break;
                                            } catch (Exception unused2) {
                                                HiLog.e("UriUtil", "check domain error");
                                            }
                                        } else {
                                            i2++;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (strArr[i].equals(strSha256Encrypt)) {
                                break;
                            }
                            i++;
                        }
                    }
                }
                HiLog.i(TAG, "setCollectURL: url check failed");
                str = "";
                break;
            }
            HiLog.i(TAG, "setCollectURL: url check failed");
            str = "";
            break;
            if (str.endsWith("/") || str.endsWith("\\")) {
                str = str.substring(0, str.length() - 1);
            }
            this.collectURL = str;
            return this;
        }

        @Deprecated
        public Builder setDecryptBatchPolicy(int i, int i2, int i3) {
            HiLog.d(TAG, "HiAnalyticsConfig.Builder.setDecryptBatchPolicy is executed.");
            this.decryptMaxBatchSize = i;
            this.decryptBatchSize = i2;
            this.decryptBatchSleepTime = i3;
            return this;
        }

        @Deprecated
        public Builder setEnableAndroidID(boolean z) {
            this.isAndroidIdEnabled = z;
            return this;
        }

        @Deprecated
        public Builder setEnableImei(boolean z) {
            this.isImeiEnabled = z;
            return this;
        }

        public Builder setEnableMccMnc(boolean z) {
            this.isMccMncEnabled = z;
            return this;
        }

        @Deprecated
        public Builder setEnableSN(boolean z) {
            this.isSNEnabled = z;
            return this;
        }

        @Deprecated
        public Builder setEnableSession(boolean z) {
            this.isSessionEnabled = z;
            return this;
        }

        @Deprecated
        public Builder setEnableUDID(boolean z) {
            this.isUDIDEnabled = z;
            return this;
        }

        public Builder setEnableUUID(boolean z) {
            this.isUUIDEnabled = z;
            return this;
        }

        public Builder setEncrypted(boolean z) {
            this.isEncrypted = Boolean.valueOf(z);
            return this;
        }

        public Builder setHttpHeader(Map<String, String> map) {
            if (map == null) {
                map = new HashMap<>();
            }
            LinkedHashMap linkedHashMapA = v1.a(map, 50, 1024L, 1024L, "x-hasdk");
            if (linkedHashMapA != null && linkedHashMapA.size() > 0) {
                this.httpHeaders = linkedHashMapA;
            }
            return this;
        }

        public Builder setImei(String str) {
            if (!v1.a(4096, "IMEI_CustomSet", str)) {
                str = "";
            }
            this.imeiCustom = str;
            return this;
        }

        public Builder setLocalEncrypted(boolean z) {
            this.localEncrypted = Boolean.valueOf(z);
            return this;
        }

        public Builder setMetricPolicy(int i) {
            this.metricPolicy = i;
            return this;
        }

        public Builder setRemoteServerUrl(String str) {
            this.remoteServerUrl = str;
            return this;
        }

        public Builder setSN(String str) {
            if (!v1.a(4096, "SN_CustomSet", str)) {
                str = "";
            }
            this.snCustom = str;
            return this;
        }

        public Builder setShortLinkEnabled(boolean z) {
            this.shortLinkEnabled = z;
            return this;
        }

        public Builder setUdid(String str) {
            if (!v1.a(4096, "Udid_CustomSet", str)) {
                str = "";
            }
            this.udidCustom = str;
            return this;
        }

        public Builder setUploadEncrypted(boolean z) {
            this.uploadEncrypted = Boolean.valueOf(z);
            return this;
        }

        public Builder setChannel(String str) {
            String str2 = "";
            if (str == null) {
                str = "";
            }
            if (str.length() > 256) {
                HiLog.i(TAG, "unsupported channel, length() = " + str.length());
            } else {
                str2 = str;
            }
            this.channel = str2;
            return this;
        }
    }

    public HiAnalyticsConfig(HiAnalyticsConfig hiAnalyticsConfig) {
        this.config = new x(hiAnalyticsConfig.config);
    }

    private HiAnalyticsConfig(Builder builder) {
        this.config = new x();
        setDeviceConfig(builder);
        setChannel(builder.channel);
        setCollectURL(builder.collectURL);
        setMccMncEnabled(builder.isMccMncEnabled);
        setSionEnable(builder.isSessionEnabled);
        setLimitSize(builder.portLimitSize);
        setCacheExpiryTime(builder.expiryTime);
        setUUIDEnabled(builder.isUUIDEnabled);
        setHttpHeaders(builder.httpHeaders);
        setAAID(builder.aaidCustom);
        setEncrypted(builder.isEncrypted);
        setLocalEncrypted(builder.localEncrypted);
        setUploadEncrypted(builder.uploadEncrypted);
        setMetricPolicy(builder.metricPolicy);
        setRemoteServerUrl(builder.remoteServerUrl);
        setDecryptMaxBatchSize(builder.decryptMaxBatchSize);
        setDecryptBatchSize(builder.decryptBatchSize);
        setDecryptBatchSleepTime(builder.decryptBatchSleepTime);
        setShortLinkEnabled(builder.shortLinkEnabled);
    }
}
