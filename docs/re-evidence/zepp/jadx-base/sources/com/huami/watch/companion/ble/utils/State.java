package com.huami.watch.companion.ble.utils;

import android.os.Message;

/* JADX INFO: loaded from: classes16.dex */
public class State implements IState {
    @Override // com.huami.watch.companion.ble.utils.IState
    public void enter() {
    }

    @Override // com.huami.watch.companion.ble.utils.IState
    public void exit() {
    }

    @Override // com.huami.watch.companion.ble.utils.IState
    public String getName() {
        String name = getClass().getName();
        return name.substring(name.lastIndexOf(36) + 1);
    }

    @Override // com.huami.watch.companion.ble.utils.IState
    public boolean processMessage(Message message) {
        return false;
    }
}
