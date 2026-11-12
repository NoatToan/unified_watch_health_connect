package com.xiaomi.fitness.feedback.history;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0016\u001a\u00020\u0005J\u0006\u0010\u0017\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/feedback/history/HistoryItem;", "", "<init>", "()V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "time", "", "getTime", "()J", "setTime", "(J)V", "status", "", "getStatus", "()I", "setStatus", "(I)V", "getTimeString", "getStatusString", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class HistoryItem {
    private long time;

    @NotNull
    private String title = "";
    private int status = -1;

    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final String getStatusString() {
        return "已提交";
    }

    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final String getTimeString() {
        return "2024/01/30 下午7:47";
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }
}
