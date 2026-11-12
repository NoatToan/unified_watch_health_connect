package com.hm.sport.player;

/* JADX INFO: loaded from: classes4.dex */
public interface IPlayObserver {
    void onCompletion(PlayCommand.CommandId commandId);

    boolean onError(int i, PlayCommand.CommandId commandId);

    void onPrepared(PlayCommand.CommandId commandId);
}
