package com.google.firebase.remoteconfig;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseRemoteConfigClientException extends FirebaseRemoteConfigException {
    public FirebaseRemoteConfigClientException(String str) {
        super(str);
    }

    public FirebaseRemoteConfigClientException(String str, Throwable th3) {
        super(str, th3);
    }

    public FirebaseRemoteConfigClientException(String str, FirebaseRemoteConfigException.Code code) {
        super(str, code);
    }

    public FirebaseRemoteConfigClientException(String str, Throwable th3, FirebaseRemoteConfigException.Code code) {
        super(str, th3, code);
    }
}
