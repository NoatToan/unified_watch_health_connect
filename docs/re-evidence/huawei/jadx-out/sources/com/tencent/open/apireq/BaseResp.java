package com.tencent.open.apireq;

/* JADX INFO: loaded from: classes46.dex */
public class BaseResp {
    public static final int CODE_ERROR_PARAMS = -2000;
    public static final int CODE_NOT_LOGIN = -2001;
    public static final int CODE_PERMISSION_NOT_GRANTED = -1003;
    public static final int CODE_QQ_LOW_VERSION = -1001;
    public static final int CODE_QQ_NOT_INSTALLED = -1000;
    public static final int CODE_SUCCESS = 0;
    public static final int CODE_UNSUPPORTED_BRANCH = -1002;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31019a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31020b = "";

    public boolean isSuccess() {
        return this.f31019a == 0;
    }

    public int getCode() {
        return this.f31019a;
    }

    public void setCode(int i) {
        String strA;
        this.f31019a = i;
        if (i == -2001) {
            strA = "Not login.";
        } else if (i == -2000) {
            strA = "The given params check failed.";
        } else if (i == 0) {
            strA = "";
        } else {
            switch (i) {
                case CODE_UNSUPPORTED_BRANCH /* -1002 */:
                    strA = "The QQ branch (e.g. TIM) is not supported";
                    break;
                case CODE_QQ_LOW_VERSION /* -1001 */:
                    strA = "QQ version is too low.";
                    break;
                case -1000:
                    strA = "QQ is not installed.";
                    break;
                default:
                    strA = a(i);
                    break;
            }
        }
        setErrorMsg(strA);
    }

    protected String a(int i) {
        return "Api call failed.";
    }

    public String getErrorMsg() {
        return this.f31020b;
    }

    public void setErrorMsg(String str) {
        this.f31020b = str;
    }

    public String toString() {
        return "BaseResp{mCode=" + this.f31019a + ", mErrorMsg='" + this.f31020b + "'}";
    }
}
