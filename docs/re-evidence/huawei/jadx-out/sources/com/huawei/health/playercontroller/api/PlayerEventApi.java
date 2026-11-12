package com.huawei.health.playercontroller.api;

import defpackage.gog;

/* JADX INFO: loaded from: classes8.dex */
public interface PlayerEventApi {
    void onPlayStatusChangeFromNotification(gog gogVar, int i);

    void onPlayerFinishedMediaEvent(gog gogVar, long j, int i, long j2);

    void onPlayerPauseEvent(gog gogVar, long j, int i, long j2);

    void onPlayerProgressChange(gog gogVar, long j, int i);

    void onPlayerStartPlayEvent(gog gogVar, long j, int i, long j2);

    void onPlayerStopEvent(gog gogVar, long j, int i, long j2, boolean z);
}
