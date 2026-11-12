package com.huami.watch.companion.sync.throttle;

import android.content.Context;
import com.huami.watch.companion.sync.throttle.bean.SyncTag;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class SyncThrottler {
    public static final String FROM_TIME_CHANGED = "TimeChanged";
    public static final String FROM_TRANS_CHANNEL_AVAILABLE = "TransChannelAvailable";
    public static final String SYNC_SYSTEM_TIME = "SyncSystemTime";
    public static final String SYNC_WATCHFACES = "SyncWatchFaces";
    public static final String TAG = "Sync-Throttler";
    private static final Map<String, a> a;
    public static Box b;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(SYNC_SYSTEM_TIME, new SyncSystemTimeThrottle(10000L, 20));
        map.put(SYNC_WATCHFACES, new SyncIntervalThrottle(60000L));
    }

    public static void clearSavedStates() {
        b.clear();
    }

    public static void init(Context context) {
        b = Box.getBox(context, TAG);
    }

    public static boolean isThrough(SyncTag syncTag) {
        boolean zIsThrough;
        String name = syncTag.getName();
        Map<String, a> map = a;
        if (map.get(name) == null) {
            throw new IllegalArgumentException("Sync-Throttler, UnknownName : " + name);
        }
        synchronized (map.get(name)) {
            try {
                zIsThrough = map.get(name).isThrough(syncTag);
            } catch (Exception e) {
                Log.e(TAG, "IsThrough Error!!", e, new Object[0]);
                zIsThrough = false;
            }
            Log.d(TAG, syncTag + ", IsThrough : " + zIsThrough, new Object[0]);
        }
        return zIsThrough;
    }

    public static void updateSyncTag(SyncTag syncTag) {
        String name = syncTag.getName();
        Map<String, a> map = a;
        if (map.get(name) == null) {
            throw new IllegalArgumentException("Sync-Throttler, UnknownName : " + name);
        }
        synchronized (map.get(name)) {
            Log.d(TAG, syncTag + ", Update SyncTag!!", new Object[0]);
            try {
                map.get(name).updateSyncTag(syncTag);
            } catch (Exception e) {
                Log.e(TAG, "UpdateSyncTag Error!!", e, new Object[0]);
            }
        }
    }

    public static void updateSyncTime(String str, long j) {
        Map<String, a> map = a;
        if (map.get(str) == null) {
            throw new IllegalArgumentException("Sync-Throttler, UnknownName : " + str);
        }
        synchronized (map.get(str)) {
            Log.d(TAG, str + ", Update SyncTime : " + TimeUtil.formatDateTime(j), new Object[0]);
            try {
                map.get(str).updateSyncTime(j);
            } catch (Exception e) {
                Log.e(TAG, "Update SyncTime Error!!", e, new Object[0]);
            }
        }
    }

    public static void updateSyncTime(String str) {
        updateSyncTime(str, System.currentTimeMillis());
    }

    public static boolean isThrough(String str, long j, String str2) {
        return isThrough(new SyncTag(str, j, str2));
    }

    public static boolean isThrough(String str) {
        return isThrough(new SyncTag(str, System.currentTimeMillis(), null));
    }
}
