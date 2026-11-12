package com.google.android.play.agesignals.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes14.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface AgeSignalsStatus {
    public static final int NOT_SHARED = 2;
    public static final int SHARED = 1;
    public static final int UNSPECIFIED = 0;
    public static final int VERIFICATION_REQUIRED = 3;
}
