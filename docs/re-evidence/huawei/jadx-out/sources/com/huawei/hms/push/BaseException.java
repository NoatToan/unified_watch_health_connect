package com.huawei.hms.push;

import com.huawei.hms.aaid.constant.ErrorEnum;

/* JADX INFO: loaded from: classes34.dex */
public class BaseException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f15829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ErrorEnum f15830b;

    public BaseException(int i) {
        ErrorEnum errorEnumFromCode = ErrorEnum.fromCode(i);
        this.f15830b = errorEnumFromCode;
        this.f15829a = errorEnumFromCode.getExternalCode();
    }

    public int getErrorCode() {
        return this.f15829a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f15830b.getMessage();
    }
}
