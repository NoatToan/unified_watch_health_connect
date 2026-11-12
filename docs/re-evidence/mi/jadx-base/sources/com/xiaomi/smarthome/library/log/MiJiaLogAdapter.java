package com.xiaomi.smarthome.library.log;

/* JADX INFO: loaded from: classes2.dex */
public interface MiJiaLogAdapter {
    void flushLog();

    boolean isDebugBuildType();

    boolean isDevChannel();

    boolean isGreyDeveloperOpen();

    boolean isGreyPublish();

    boolean isSdkBuildType();

    void writeLog(int i, String str, String str2, String str3);
}
