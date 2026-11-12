package com.ximalaya.ting.android.sdkdownloader.downloadutil;

/* JADX INFO: loaded from: classes22.dex */
public enum DownloadState {
    WAITING(0),
    STARTED(1),
    FINISHED(2),
    STOPPED(3),
    ERROR(4),
    NOADD(5);

    private final int value;

    DownloadState(int i) {
        this.value = i;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = this.value;
        if (i == 0) {
            return "等待";
        }
        if (i == 1) {
            return "开始";
        }
        if (i == 2) {
            return "结束";
        }
        if (i == 3) {
            return "停止";
        }
        if (i != 4) {
            return i != 5 ? "未知" : "未添加";
        }
        return "错误";
    }

    public int value() {
        return this.value;
    }

    public static DownloadState valueOf(int i) {
        if (i == 0) {
            return WAITING;
        }
        if (i == 1) {
            return STARTED;
        }
        if (i == 2) {
            return FINISHED;
        }
        if (i == 3) {
            return STOPPED;
        }
        if (i != 4) {
            return i != 5 ? NOADD : NOADD;
        }
        return ERROR;
    }
}
