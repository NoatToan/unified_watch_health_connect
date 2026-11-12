package com.xiaomi.yrn.bundle.config;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;

/* JADX INFO: loaded from: classes2.dex */
public enum YRNBundleError {
    VERIFY_ERROR(512, "校验错误，md5不相等"),
    VERIFY_ALREADY_LATEST_ERROR(SportSummary.VRESION_201, "校验通过，本地包已经是最新"),
    UNZIP_ERROR(769, "解压错误"),
    API_DATA_ERROR(1025, "Api数据错误");

    public int code;
    public String message;

    YRNBundleError(int i, String str) {
        this.code = i;
        this.message = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "BundleError:code = " + this.code + ", message = " + this.message;
    }
}
