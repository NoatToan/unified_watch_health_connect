package com.garmin.android.gncs;

/* JADX INFO: loaded from: classes11.dex */
public interface GNCSNotificationListener {
    void onNotificationPosted(GNCSNotificationInfo gNCSNotificationInfo);

    void onNotificationRemoved(GNCSNotificationInfo gNCSNotificationInfo);

    void onNotificationUpdated(GNCSNotificationInfo gNCSNotificationInfo);
}
