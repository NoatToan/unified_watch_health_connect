package com.xiaomi.hm.health.bt.profile.auth;

import com.xiaomi.hm.health.bt.gatt.GattUtils;

/* JADX INFO: loaded from: classes11.dex */
public class HMAuthState {
    public static final int AUTH_ERROR_CANCEL = 2;
    public static final int AUTH_ERROR_CMD_FAILED = 4;
    public static final int AUTH_ERROR_DENY = 6;
    public static final int AUTH_ERROR_GET_INFO_FAILED = 9;
    public static final int AUTH_ERROR_NOKNOCK = 3;
    public static final int AUTH_ERROR_NONE = 0;
    public static final int AUTH_ERROR_OTHER = 7;
    public static final int AUTH_ERROR_SET_TIME_FAILED = 8;
    public static final int AUTH_ERROR_SPORT_ONGOING = 10;
    public static final int AUTH_ERROR_TIMEOUT = 1;
    public static final int AUTH_ERROR_USING_BY_OTHER = 11;
    public static final int AUTH_ERROR_WRONG_KEY = 5;
    public static final int AUTH_STATE_DENY = 4;
    public static final int AUTH_STATE_FAILED = 1;
    public static final int AUTH_STATE_KNOCK = 2;
    public static final int AUTH_STATE_KNOCK_SUCCESS = 3;
    public static final int AUTH_STATE_SUCCESS = 0;
    private int a;
    private int b;
    private byte[] c;
    private int d;

    public HMAuthState(int state, int error) {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = 0;
        this.a = state;
        this.b = error;
    }

    public int getError() {
        return this.b;
    }

    public int getInternalState() {
        return this.d;
    }

    public int getRandomSimple() {
        byte[] bArr = this.c;
        if (bArr == null || bArr.length < 2) {
            return 0;
        }
        return ((bArr[1] & 15) << 8) | (bArr[0] & 255);
    }

    public byte[] getRandomValue() {
        return this.c;
    }

    public int getState() {
        return this.a;
    }

    public void setInternalState(int internalState) {
        this.d = internalState;
    }

    public void setRandomValue(byte[] randomValue) {
        this.c = randomValue;
    }

    public String toString() {
        return "HMAuthState{mState=" + this.a + ", mError=" + this.b + ", mRandomValue=" + GattUtils.bytesToHexString(this.c) + ", randomSimple=" + getRandomSimple() + ", internalState=" + this.d + '}';
    }

    public HMAuthState(int state, int error, int internalState) {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = 0;
        this.a = state;
        this.b = error;
        this.d = internalState;
    }

    public HMAuthState(int state) {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = 0;
        this.a = state;
    }

    public HMAuthState() {
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.d = 0;
    }
}
