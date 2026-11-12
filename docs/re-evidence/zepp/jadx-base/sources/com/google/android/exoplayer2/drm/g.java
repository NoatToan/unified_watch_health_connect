package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g {
    public static boolean a(DrmSession drmSession) {
        return false;
    }

    public static void b(@Nullable DrmSession previousSession, @Nullable DrmSession newSession) {
        if (previousSession == newSession) {
            return;
        }
        if (newSession != null) {
            newSession.acquire(null);
        }
        if (previousSession != null) {
            previousSession.release(null);
        }
    }
}
