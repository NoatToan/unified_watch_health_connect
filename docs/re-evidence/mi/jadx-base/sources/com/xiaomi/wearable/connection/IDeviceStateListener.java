package com.xiaomi.wearable.connection;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public interface IDeviceStateListener {
    default void onConnectFailure(String str, int i, int i2) {
    }

    default void onConnectStart(@NotNull String str) {
    }

    default void onConnectSuccess(String str) {
    }

    default void onDeviceFound(String str) {
    }

    default void onDeviceLost(String str) {
    }

    default void onDisconnect(String str) {
    }

    default void onSpecificDeviceConnectFailure(String str, String str2, int i) {
    }

    default void onSpecificDeviceConnectStart(String str, String str2) {
    }

    default void onSpecificDeviceConnectSuccess(String str, String str2) {
    }

    default void onSpecificDeviceDisconnected(String str, String str2) {
    }
}
