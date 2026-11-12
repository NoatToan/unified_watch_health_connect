package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/details/WorkoutDeviceDisconnectedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "deviceName", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDeviceName", "()Ljava/lang/String;", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkoutDeviceDisconnectedException extends Exception {
    public static final int $stable = 8;
    private final String deviceName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkoutDeviceDisconnectedException(String str, String str2) {
        super(str2);
        str2.getClass();
        this.deviceName = str;
    }

    public final String getDeviceName() {
        return this.deviceName;
    }
}
