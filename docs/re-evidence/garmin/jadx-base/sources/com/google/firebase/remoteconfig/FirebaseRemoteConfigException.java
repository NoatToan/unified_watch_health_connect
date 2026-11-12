package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseRemoteConfigException extends FirebaseException {
    private final Code code;

    public enum Code {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int value;

        Code(int i14) {
            this.value = i14;
        }

        public int value() {
            return this.value;
        }
    }

    public FirebaseRemoteConfigException(String str) {
        super(str);
        this.code = Code.UNKNOWN;
    }

    public Code getCode() {
        return this.code;
    }

    public FirebaseRemoteConfigException(String str, Throwable th3) {
        super(str, th3);
        this.code = Code.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Code code) {
        super(str);
        this.code = code;
    }

    public FirebaseRemoteConfigException(String str, Throwable th3, Code code) {
        super(str, th3);
        this.code = code;
    }
}
