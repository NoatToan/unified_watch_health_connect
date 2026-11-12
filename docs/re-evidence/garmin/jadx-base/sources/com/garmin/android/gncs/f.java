package com.garmin.android.gncs;

import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements ToLongFunction {
    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return SmartNotificationsModule.lambda$synchronizeNotifications$2((GNCSParsedNotification) obj);
    }
}
