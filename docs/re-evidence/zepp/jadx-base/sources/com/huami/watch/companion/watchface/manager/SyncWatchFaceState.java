package com.huami.watch.companion.watchface.manager;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/huami/watch/companion/watchface/manager/SyncWatchFaceState;", "", "", "state", LogUtil.I, "getState", "()I", "", "description", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "STATE_LOW_BATTERY", "STATE_KEEP_TIME", "STATE_KEEP_MOVING", "STATE_CHANGING_WATCH_FACE", "STATE_WATCH_UPGRADING", "STATE_CONFIRM_FILE_RECEIVE", "STATE_FILE_RECEIVED_FORBIDDEN", "companion_release"}, k = 1, mv = {1, 5, 1})
public enum SyncWatchFaceState {
    STATE_LOW_BATTERY(14, "设备电量低"),
    STATE_KEEP_TIME(16, "计时中"),
    STATE_KEEP_MOVING(13, "运动中"),
    STATE_CHANGING_WATCH_FACE(20, "更换表盘中"),
    STATE_WATCH_UPGRADING(21, "手表升级中"),
    STATE_CONFIRM_FILE_RECEIVE(22, "确认接收文件"),
    STATE_FILE_RECEIVED_FORBIDDEN(23, "拒收文件");


    @NotNull
    private final String description;
    private final int state;

    SyncWatchFaceState(int i, String str) {
        this.state = i;
        this.description = str;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getState() {
        return this.state;
    }
}
