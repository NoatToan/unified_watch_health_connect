package com.apprichtap.haptic.player;

import defpackage.pm;
import defpackage.po;

/* JADX INFO: loaded from: classes4.dex */
public interface IHapticEffectPerformer {
    public static final String TAG = "IHapticEffectPerformer";

    default void updateParameter(int i, int i2) {
        po.e.e(TAG, "default updateParameter(int, int)");
    }

    default void swapVibrationIndex(boolean z) {
        po.e.e(TAG, "default ");
    }

    default boolean supportRealtimeAdjustment() {
        po.e.e(TAG, "default supportRealtimeAdjustment()");
        return false;
    }

    default void stop() {
        po.e.e(TAG, "default stop()");
    }

    default void start(String str) {
        po.e.e(TAG, "default start(String)");
    }

    default void setSenderIdKey(String str) {
        po.e.e(TAG, "default setSenderId(int[])");
    }

    default void setGain(int i) {
        po.e.e(TAG, "default setGain");
    }

    default int getRichTapCoreMajorVersion() {
        po.e.e(TAG, "default getRichTapCoreMajorVersion");
        return -1;
    }

    static int[] convertHEStringToIntArray(String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        return pm.d(str, i, i2, i3, i4, i5, z);
    }
}
