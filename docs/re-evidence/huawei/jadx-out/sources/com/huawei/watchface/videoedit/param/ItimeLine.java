package com.huawei.watchface.videoedit.param;

/* JADX INFO: loaded from: classes20.dex */
public interface ItimeLine {
    long getCurrentTime();

    void pause();

    void reset();

    void resume();

    TimeLineImpl.TimeLineStatus seekCompleted();

    void seekTo(long j);

    void start();
}
