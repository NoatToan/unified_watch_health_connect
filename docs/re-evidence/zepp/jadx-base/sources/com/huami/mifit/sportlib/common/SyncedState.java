package com.huami.mifit.sportlib.common;

/* JADX INFO: loaded from: classes11.dex */
public enum SyncedState {
    SYNC_STATE_DEFAULT(-1),
    STATE_UNSYNCED(0),
    STATE_SYNCED_TO_SERVER(1),
    STATE_SYNCED_FROM_SERVER(2),
    STATE_SYNCED_FROM_SERVER_SUMMERY_DONE(3),
    STATE_TO_BE_DELETED(4),
    STATE_SYNC_AGAIN(5),
    STATE_UNKNOW(6),
    STATE_NONE(255);

    private int mState;

    SyncedState(int i) {
        this.mState = i;
    }

    public static boolean a(SyncedState syncedState) {
        return STATE_SYNCED_FROM_SERVER.equals(syncedState) || STATE_SYNCED_TO_SERVER.equals(syncedState) || STATE_UNSYNCED.equals(syncedState) || STATE_SYNCED_FROM_SERVER_SUMMERY_DONE.equals(syncedState) || STATE_TO_BE_DELETED.equals(syncedState);
    }

    public int getValue() {
        return this.mState;
    }
}
