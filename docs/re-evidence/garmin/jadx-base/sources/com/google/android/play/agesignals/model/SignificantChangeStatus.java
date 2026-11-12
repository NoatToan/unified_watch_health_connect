package com.google.android.play.agesignals.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes14.dex */
@Retention(RetentionPolicy.SOURCE)
public @interface SignificantChangeStatus {
    public static final int APPROVED = 1;
    public static final int DECLINED = 3;
    public static final int PENDING = 2;
    public static final int UNSPECIFIED = 0;
}
