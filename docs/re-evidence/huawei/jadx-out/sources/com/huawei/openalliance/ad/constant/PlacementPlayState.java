package com.huawei.openalliance.ad.constant;

import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class PlacementPlayState {
    private static final String TAG = "PlacementPlayState";
    private State currentState;
    private final byte[] lock;

    public enum State {
        SINGLE_INST,
        MAIN_VIEW,
        BACKUP_VIEW
    }

    public void switchToState(State state) {
        if (state == null) {
            return;
        }
        synchronized (this.lock) {
            hw.b(TAG, "switch to state: %s", state);
            this.currentState = state;
        }
    }

    public boolean isState(State state) {
        boolean z;
        synchronized (this.lock) {
            z = state == this.currentState;
        }
        return z;
    }

    public boolean isNotState(State state) {
        boolean zIsState;
        synchronized (this.lock) {
            zIsState = isState(state);
        }
        return !zIsState;
    }

    public State getCurrentState() {
        State state;
        synchronized (this.lock) {
            state = this.currentState;
        }
        return state;
    }

    public PlacementPlayState(State state) {
        State state2 = State.SINGLE_INST;
        this.lock = new byte[0];
        this.currentState = state;
    }

    public PlacementPlayState() {
        this.currentState = State.SINGLE_INST;
        this.lock = new byte[0];
    }
}
