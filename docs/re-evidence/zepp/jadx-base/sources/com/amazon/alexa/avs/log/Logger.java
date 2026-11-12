package com.amazon.alexa.avs.log;

/* JADX INFO: loaded from: classes2.dex */
public class Logger {
    private String mTag;

    public Logger(Class cls) {
        this.mTag = "";
        this.mTag = LogHelper.makeLogTag(cls);
    }

    public void debug(String str, Throwable th) {
        LogHelper.d(this.mTag, str, th);
    }

    public void error(String str, Throwable th) {
        LogHelper.e(this.mTag, str, th);
    }

    public void info(String str, Throwable th) {
        LogHelper.i(this.mTag, str, th);
    }

    public void warn(String str, Throwable th) {
        LogHelper.w(this.mTag, str, th);
    }

    public void debug(String str, Object obj, Throwable th) {
        LogHelper.d(this.mTag, str, obj, th);
    }

    public void error(String str) {
        LogHelper.e(this.mTag, str);
    }

    public void info(String str) {
        LogHelper.i(this.mTag, str);
    }

    public void warn(String str) {
        LogHelper.w(this.mTag, str);
    }

    public void debug(String str) {
        LogHelper.d(this.mTag, str);
    }
}
