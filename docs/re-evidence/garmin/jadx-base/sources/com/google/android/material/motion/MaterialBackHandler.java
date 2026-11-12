package com.google.android.material.motion;

import b.c;

/* JADX INFO: loaded from: classes14.dex */
public interface MaterialBackHandler {
    void cancelBackProgress();

    void handleBackInvoked();

    void startBackProgress(c cVar);

    void updateBackProgress(c cVar);
}
