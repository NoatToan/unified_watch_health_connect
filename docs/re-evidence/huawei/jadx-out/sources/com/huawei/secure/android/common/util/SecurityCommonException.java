package com.huawei.secure.android.common.util;

/* JADX INFO: loaded from: classes15.dex */
public class SecurityCommonException extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f22941c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f22943b;

    public SecurityCommonException() {
    }

    public String getMsgDes() {
        return this.f22943b;
    }

    public String getRetCd() {
        return this.f22942a;
    }

    public SecurityCommonException(Throwable th) {
        super(th);
    }

    public SecurityCommonException(String str, Throwable th) {
        super(str, th);
    }

    public SecurityCommonException(String str) {
        super(str);
        this.f22943b = str;
    }

    public SecurityCommonException(String str, String str2) {
        this.f22942a = str;
        this.f22943b = str2;
    }
}
