package com.google.android.play.agesignals.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes14.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface AgeSignalsVerificationStatus {
    public static final int DECLARED = 5;
    public static final int SUPERVISED = 1;
    public static final int SUPERVISED_APPROVAL_DENIED = 3;
    public static final int SUPERVISED_APPROVAL_PENDING = 2;
    public static final int UNKNOWN = 4;
    public static final int VERIFIED = 0;
}
