package com.huawei.hms.support.api.entity.safetydetect;

/* JADX INFO: loaded from: classes34.dex */
public class UrlCheckThreat {
    public static final int MALWARE = 1;
    public static final int PHISHING = 3;
    private int urlCheckResult;

    public int getUrlCheckResult() {
        return this.urlCheckResult;
    }

    public UrlCheckThreat(int i) {
        this.urlCheckResult = i;
    }
}
