package com.huawei.hms.findnetwork.comm.exception;

import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.api.client.Status;

/* JADX INFO: loaded from: classes10.dex */
public class FindNetworkException extends Exception {
    private int code;

    public FindNetworkException(ApiException apiException) {
        this(apiException.getMessage(), apiException.getStatusCode());
    }

    public static ApiException apiExceptionOf(int i, String str) {
        return new ApiException(new Status(i, str));
    }

    public FindNetworkException(String str) {
        super(str);
        this.code = 0;
    }

    public static ApiException apiExceptionOf(Exception exc) {
        return exc instanceof ApiException ? (ApiException) exc : apiExceptionOf(exc.getMessage());
    }

    public FindNetworkException(String str, int i) {
        super(str);
        this.code = i;
    }

    public static ApiException apiExceptionOf(String str) {
        return apiExceptionOf(-1, str);
    }

    public int getCode() {
        return this.code;
    }
}
