package com.google.android.play.agesignals.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes14.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface AgeSignalsErrorCode {
    public static final int API_NOT_AVAILABLE = -1;
    public static final int APP_NOT_OWNED = -9;
    public static final int CANNOT_BIND_TO_SERVICE = -5;
    public static final int CLIENT_TRANSIENT_ERROR = -8;
    public static final int INTERNAL_ERROR = -100;
    public static final int NETWORK_ERROR = -3;
    public static final int NO_ERROR = 0;
    public static final int PLAY_SERVICES_NOT_FOUND = -4;
    public static final int PLAY_SERVICES_VERSION_OUTDATED = -7;
    public static final int PLAY_STORE_NOT_FOUND = -2;
    public static final int PLAY_STORE_VERSION_OUTDATED = -6;
    public static final int SDK_VERSION_OUTDATED = -10;
}
