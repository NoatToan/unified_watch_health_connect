package com.huami.watch.companion.arch;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes16.dex */
public class Result<T> {
    private ResultStatus a;
    private T b;
    private int c;
    private String d;

    public static <T> Result<T> error() {
        Result<T> result = new Result<>();
        result.setStatus(ResultStatus.ERROR);
        return result;
    }

    public static <T> Result<T> loading() {
        return loading(null);
    }

    public static <T> Result<T> success(@NonNull T t) {
        Result<T> result = new Result<>();
        result.setStatus(ResultStatus.SUCCESS);
        result.setData(t);
        return result;
    }

    public T getData() {
        return this.b;
    }

    public int getErrorCode() {
        return this.c;
    }

    public String getErrorMsg() {
        return this.d;
    }

    public ResultStatus getStatus() {
        return this.a;
    }

    public boolean isError() {
        return ResultStatus.ERROR == this.a;
    }

    public boolean isLoading() {
        return ResultStatus.LOADING == this.a;
    }

    public boolean isSuccess() {
        return ResultStatus.SUCCESS == this.a;
    }

    public void setData(T t) {
        this.b = t;
    }

    public void setErrorCode(int i) {
        this.c = i;
    }

    public void setErrorMsg(String str) {
        this.d = str;
    }

    public void setStatus(ResultStatus resultStatus) {
        this.a = resultStatus;
    }

    public static <T> Result<T> loading(T t) {
        Result<T> result = new Result<>();
        result.setStatus(ResultStatus.LOADING);
        result.setData(t);
        return result;
    }

    public static <T> Result<T> error(T t) {
        return error(t, 0);
    }

    public static <T> Result<T> error(T t, int i) {
        return error(t, i, null);
    }

    public static <T> Result<T> error(T t, int i, String str) {
        Result<T> result = new Result<>();
        result.setStatus(ResultStatus.ERROR);
        result.setData(t);
        result.setErrorCode(i);
        result.setErrorMsg(str);
        return result;
    }
}
