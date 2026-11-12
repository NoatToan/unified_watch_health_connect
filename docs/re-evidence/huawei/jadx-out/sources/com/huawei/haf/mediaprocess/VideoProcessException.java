package com.huawei.haf.mediaprocess;

/* JADX INFO: loaded from: classes2.dex */
public class VideoProcessException extends Exception {
    public VideoProcessException(String str) {
        super(str);
    }

    public VideoProcessException(Exception exc) {
        super(exc.getMessage(), exc.getCause());
    }
}
