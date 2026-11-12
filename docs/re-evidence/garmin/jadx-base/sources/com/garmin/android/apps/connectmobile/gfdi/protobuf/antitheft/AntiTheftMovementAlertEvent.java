package com.garmin.android.apps.connectmobile.gfdi.protobuf.antitheft;

import p005kotlin.Metadata;
import pi2.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/antitheft/AntiTheftMovementAlertEvent;", "Lpi2/f;", "", "alertNotificationKey", "<init>", "(Z)V", "Z", "getAlertNotificationKey", "()Z", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AntiTheftMovementAlertEvent extends f {
    public static final int $stable = 8;
    private final boolean alertNotificationKey;

    public AntiTheftMovementAlertEvent(boolean z14) {
        super("AntiTheftMovementAlertEvent", null, 0, 0L, 14, null);
        this.alertNotificationKey = z14;
    }

    public final boolean getAlertNotificationKey() {
        return this.alertNotificationKey;
    }
}
