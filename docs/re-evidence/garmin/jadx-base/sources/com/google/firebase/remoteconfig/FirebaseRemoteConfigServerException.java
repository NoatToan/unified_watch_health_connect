package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {
    private final int httpStatusCode;

    public FirebaseRemoteConfigServerException(String str, FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.httpStatusCode = -1;
    }

    public int getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public FirebaseRemoteConfigServerException(int i14, String str, Throwable th3) {
        super(str, th3);
        this.httpStatusCode = i14;
    }

    public FirebaseRemoteConfigServerException(int i14, String str) {
        super(str);
        this.httpStatusCode = i14;
    }

    public FirebaseRemoteConfigServerException(int i14, String str, FirebaseRemoteConfigException.Code code) {
        super(str, code);
        this.httpStatusCode = i14;
    }

    public FirebaseRemoteConfigServerException(String str, Throwable th3, FirebaseRemoteConfigException.Code code) {
        super(str, th3, code);
        this.httpStatusCode = -1;
    }

    public FirebaseRemoteConfigServerException(int i14, String str, Throwable th3, FirebaseRemoteConfigException.Code code) {
        super(str, th3, code);
        this.httpStatusCode = i14;
    }
}
