package com.miui.tsmclient.entity.eventbus;

/* JADX INFO: loaded from: classes6.dex */
public class SeActionEvent {
    private Action mAction;
    private int mResultCode;

    public enum Action {
        SAVE_APP_KEY
    }

    public SeActionEvent(Action action, int i) {
        this.mAction = action;
        this.mResultCode = i;
    }

    public Action getAction() {
        return this.mAction;
    }

    public int getResultCode() {
        return this.mResultCode;
    }
}
