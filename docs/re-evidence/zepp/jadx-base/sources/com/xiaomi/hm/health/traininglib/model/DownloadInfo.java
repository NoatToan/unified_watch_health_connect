package com.xiaomi.hm.health.traininglib.model;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes22.dex */
public class DownloadInfo {
    public long size;
    public String url;

    public static DownloadInfo create(String str, long j) {
        DownloadInfo downloadInfo = new DownloadInfo();
        downloadInfo.url = str;
        downloadInfo.size = j;
        return downloadInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DownloadInfo) {
            return TextUtils.equals(this.url, ((DownloadInfo) obj).url);
        }
        return false;
    }

    public int hashCode() {
        return TextUtils.isEmpty(this.url) ? this.url.hashCode() : super.hashCode();
    }

    public String toString() {
        return "DownloadInfo{url='" + this.url + "', size=" + this.size + '}';
    }
}
