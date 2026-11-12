package com.garmin.android.apps.connectmobile.gfdi.protobuf.antitheft;

import l73.k;
import p005kotlin.Metadata;
import pi2.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/antitheft/AntiTheftEventListener;", "Lpi2/c;", "<init>", "()V", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/antitheft/AntiTheftMovementAlertEvent;", "movementAlertEvent", "", "movementAlertNotificationReceived", "(Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/antitheft/AntiTheftMovementAlertEvent;)V", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/antitheft/AntiTheftSettingChangeRequestEvent;", "settingChangeRequestEvent", "settingChangeRequestReceived", "(Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/antitheft/AntiTheftSettingChangeRequestEvent;)V", "Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/antitheft/AntiTheftDisableRequestEvent;", "antiTheftDisableRequestEvent", "disableRequestReceived", "(Lcom/garmin/android/apps/connectmobile/gfdi/protobuf/antitheft/AntiTheftDisableRequestEvent;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class AntiTheftEventListener implements c {
    public static final int $stable = 0;

    @k
    public void disableRequestReceived(AntiTheftDisableRequestEvent antiTheftDisableRequestEvent) {
        antiTheftDisableRequestEvent.getClass();
    }

    @k
    public void movementAlertNotificationReceived(AntiTheftMovementAlertEvent movementAlertEvent) {
        movementAlertEvent.getClass();
    }

    @k
    public void settingChangeRequestReceived(AntiTheftSettingChangeRequestEvent settingChangeRequestEvent) {
        settingChangeRequestEvent.getClass();
    }
}
