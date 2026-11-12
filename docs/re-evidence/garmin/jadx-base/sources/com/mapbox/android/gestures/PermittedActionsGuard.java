package com.mapbox.android.gestures;

/* JADX INFO: loaded from: classes2.dex */
class PermittedActionsGuard {
    private static final int BITS_PER_PERMITTED_ACTION = 8;
    private static final int NO_ACTION_PERMITTED = 255;
    private static final int PERMITTED_ACTION_MASK = 255;

    private long updatePermittedActions(int i14, int i15) {
        if (i15 == 0) {
            return 0L;
        }
        if (Math.abs(i14 - i15) > 1) {
            return 255L;
        }
        if (i14 > i15) {
            return 5L;
        }
        if (i14 < i15) {
            return 255L;
        }
        return ((i14 == 1 ? 1L : 6L) << 8) + 2;
    }

    public boolean isMissingActions(int i14, int i15, int i16) {
        long jUpdatePermittedActions = updatePermittedActions(i15, i16);
        long j8 = i14;
        if (j8 == jUpdatePermittedActions) {
            return false;
        }
        while (jUpdatePermittedActions != 0) {
            if (j8 == (255 & jUpdatePermittedActions)) {
                return false;
            }
            jUpdatePermittedActions >>= 8;
        }
        return true;
    }
}
