package com.huawei.openalliance.ad.beans.metadata;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes41.dex */
public class InnerPackageInfo {
    private String packageName;
    private String versionName;

    public int hashCode() {
        String str = this.packageName;
        if (str != null) {
            return str.hashCode();
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj instanceof InnerPackageInfo) {
            return !TextUtils.isEmpty(this.packageName) && this.packageName.equals(((InnerPackageInfo) obj).packageName);
        }
        return false;
    }
}
