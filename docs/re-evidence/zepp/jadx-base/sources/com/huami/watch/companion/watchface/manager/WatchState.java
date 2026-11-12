package com.huami.watch.companion.watchface.manager;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/huami/watch/companion/watchface/manager/WatchState;", "", "", "state", LogUtil.I, "getState", "()I", "", "description", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "STATE_FILE_TRANSFER_SUCCESS", "STATE_FILE_TRANSFER_FAILURE", "STATE_CHANGE_WATCH_FACE_NOW", "STATE_CHANGE_WATCH_FACE_SUCCESS", "STATE_CHANGE_WATCH_FACE_FAILURE", "companion_release"}, k = 1, mv = {1, 5, 1})
public enum WatchState {
    STATE_FILE_TRANSFER_SUCCESS(18, "文件传输成功"),
    STATE_FILE_TRANSFER_FAILURE(4, "文件传输失败"),
    STATE_CHANGE_WATCH_FACE_NOW(24, "照片表盘更换表盘中"),
    STATE_CHANGE_WATCH_FACE_SUCCESS(25, "更换表盘成功"),
    STATE_CHANGE_WATCH_FACE_FAILURE(26, "更换表盘失败");


    @NotNull
    private final String description;
    private final int state;

    WatchState(int i, String str) {
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
