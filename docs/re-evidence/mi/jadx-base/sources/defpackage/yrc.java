package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface yrc extends c23 {
    default void onConnectFailure(String str, String str2, int i, int i2) {
    }

    default void onConnectStart(@NotNull String str, String str2) {
    }

    default void onConnectSuccess(String str, String str2) {
    }

    default void onDisconnect(String str, String str2) {
    }

    default void onWearConnectFailure(int i, String str, int i2) {
    }

    default void onWearConnectStart() {
    }

    default void onWearConnectSuccess() {
    }

    default void onWearDisconnect() {
    }
}
