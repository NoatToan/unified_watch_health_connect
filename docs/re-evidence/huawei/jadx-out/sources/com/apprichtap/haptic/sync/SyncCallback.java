package com.apprichtap.haptic.sync;

/* JADX INFO: loaded from: classes4.dex */
public interface SyncCallback {
    int getCurrentPosition();

    default int getDuration() {
        return -1;
    }
}
