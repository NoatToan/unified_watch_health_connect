package com.huawei.secure.android.common.zip.config;

import com.huawei.openalliance.ad.constant.Constants;

/* JADX INFO: loaded from: classes42.dex */
public class ZipConfig {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f22970c;
    private String d;
    private String[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f22968a = Constants.WEB_VIEW_CACHE_TOTAL_MAX_SIZE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22969b = 6000;
    private String[] f = {"jsp", "php", "php2", "php3", "php4", "php5", "phps", "pht", "phtm", "phtml", "py", "pl", "elf", "lua", "sh", "js"};
    private boolean g = true;
    private boolean h = false;

    public ZipConfig(String str, String str2) {
        this.f22970c = str;
        this.d = str2;
    }

    public String[] getBlackListSuffix() {
        return this.f;
    }

    public int getFileNumThreshold() {
        return this.f22969b;
    }

    public String getTargetDir() {
        return this.d;
    }

    public long getTopSizeThreshold() {
        return this.f22968a;
    }

    public String[] getWhiteListSuffix() {
        return this.e;
    }

    public String getZipFile() {
        return this.f22970c;
    }

    public boolean isGbkZipFile() {
        return this.h;
    }

    public boolean isLoadDisk() {
        return this.g;
    }

    public void setBlackListSuffix(String[] strArr) {
        this.f = strArr;
    }

    public void setFileNumThreshold(int i) {
        this.f22969b = i;
    }

    public void setGbkZipFile(boolean z) {
        this.h = z;
    }

    public void setLoadDisk(boolean z) {
        this.g = z;
    }

    public void setTargetDir(String str) {
        this.d = str;
    }

    public void setTopSizeThreshold(long j) {
        this.f22968a = j;
    }

    public void setWhiteListSuffix(String[] strArr) {
        this.e = strArr;
    }

    public void setZipFile(String str) {
        this.f22970c = str;
    }
}
