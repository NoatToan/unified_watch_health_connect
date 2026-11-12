package com.xiaomi.hm.health.bt.profile.auth;

import defpackage.tet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

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
    private int mError;
    private int mInternalState;
    private byte[] mRandomValue;
    private int mState;

    public HMAuthState(int i, int i2) {
        this.mRandomValue = null;
        this.mInternalState = 0;
        this.mState = i;
        this.mError = i2;
    }

    public int getError() {
        return this.mError;
    }

    public int getInternalState() {
        return this.mInternalState;
    }

    public int getRandomSimple() {
        byte[] bArr = this.mRandomValue;
        if (bArr == null || bArr.length < 2) {
            return 0;
        }
        return ((bArr[1] & 15) << 8) | (bArr[0] & 255);
    }

    public byte[] getRandomValue() {
        return this.mRandomValue;
    }

    public int getState() {
        return this.mState;
    }

    public void setInternalState(int i) {
        this.mInternalState = i;
    }

    public void setRandomValue(byte[] bArr) {
        this.mRandomValue = bArr;
    }

    public String toString() {
        return "HMAuthState{mState=" + this.mState + ", mError=" + this.mError + ", mRandomValue=" + tet.x(this.mRandomValue) + ", randomSimple=" + getRandomSimple() + ", internalState=" + this.mInternalState + AbstractJsonLexerKt.END_OBJ;
    }

    public HMAuthState(int i, int i2, int i3) {
        this.mRandomValue = null;
        this.mState = i;
        this.mError = i2;
        this.mInternalState = i3;
    }

    public HMAuthState(int i) {
        this.mError = 0;
        this.mRandomValue = null;
        this.mInternalState = 0;
        this.mState = i;
    }

    public HMAuthState() {
        this.mState = 0;
        this.mError = 0;
        this.mRandomValue = null;
        this.mInternalState = 0;
    }
}
