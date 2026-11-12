package com.xiaomi.market.sdk;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes22.dex */
public class LocalAppInfo {
    public String packageName = "";
    public String displayName = "";
    public int versionCode = 0;
    public String versionName = "";
    public String signature = "";
    public String sourceDir = "";
    public String sourceMD5 = "";
    public boolean isSystem = false;

    private LocalAppInfo() {
    }

    public static LocalAppInfo get(String str) {
        LocalAppInfo localAppInfo = new LocalAppInfo();
        localAppInfo.packageName = str;
        return localAppInfo;
    }

    public String getSourceMD5() {
        if (TextUtils.isEmpty(this.sourceDir)) {
            return null;
        }
        return TextUtils.isEmpty(this.sourceMD5) ? Coder.encodeMD5(new File(this.sourceDir)) : this.sourceMD5;
    }
}
