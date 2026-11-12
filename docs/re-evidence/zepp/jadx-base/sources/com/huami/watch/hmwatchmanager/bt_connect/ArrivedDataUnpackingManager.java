package com.huami.watch.hmwatchmanager.bt_connect;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.huami.watch.companion.bind.BindHelper;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.huami.watch.companion.initial.InitialState;
import com.huami.watch.companion.watchface.WatchFace;
import com.huami.watch.companion.watchface.WatchFaceManager;
import com.huami.watch.util.Log;
import com.huami.watch.util.RxBus;
import com.tekartik.sqflite.Constant;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes16.dex */
public class ArrivedDataUnpackingManager {
    public static final String ACTION_APPS_RECEIVER = "android.intent.action.APPReceiver";
    public static final String ACTION_STORAGE_STATUS_SEND = "com.huami.watch.storage";
    public static final String ACTION_VOICE_COMMUNICATE = "android.intent.action.Voice.Communicate";
    public static final String ACTION_WALL_RECEIVER = "android.intent.action.WallReceiver";
    private static final String a = "DataUnpackingManager";

    public static void saveStorageData(Context context, Bundle bundle) {
        DeviceManager manager = DeviceManager.getManager(context);
        Device currentDevice = manager.getCurrentDevice();
        if (currentDevice == null) {
            return;
        }
        currentDevice.info().setStorageAvailable(bundle.getLong("avaliable"));
        currentDevice.info().setStorageTotal(bundle.getLong("total"));
        manager.save(currentDevice);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d A[Catch: IOException -> 0x0069, PHI: r3
      0x005d: PHI (r3v6 java.io.ObjectInputStream) = (r3v5 java.io.ObjectInputStream), (r3v7 java.io.ObjectInputStream) binds: [B:33:0x0066, B:27:0x005b] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {IOException -> 0x0069, blocks: (B:11:0x003f, B:28:0x005d), top: B:43:0x003f }] */
    public static void setLocaleData(Context context, Bundle bundle) throws Throwable {
        int i = bundle.getInt("count");
        if (i == 0) {
            Toast.makeText(context.getApplicationContext(), "no locale received", 0).show();
        }
        for (int i2 = 1; i2 <= i; i2++) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bundle.getByteArray("local" + i2));
            ObjectInputStream objectInputStream = null;
            try {
                ObjectInputStream objectInputStream2 = new ObjectInputStream(byteArrayInputStream);
                try {
                    objectInputStream2.readObject();
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused) {
                    }
                    try {
                        objectInputStream2.close();
                    } catch (IOException unused2) {
                    }
                } catch (IOException unused3) {
                    objectInputStream = objectInputStream2;
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused4) {
                    }
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                } catch (ClassNotFoundException unused5) {
                    objectInputStream = objectInputStream2;
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused6) {
                    }
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    objectInputStream = objectInputStream2;
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException unused7) {
                    }
                    if (objectInputStream == null) {
                        throw th;
                    }
                    try {
                        objectInputStream.close();
                        throw th;
                    } catch (IOException unused8) {
                        throw th;
                    }
                }
            } catch (IOException unused9) {
            } catch (ClassNotFoundException unused10) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Log.v("yl", "get " + i + " locales", new Object[0]);
    }

    public static void unpacking(Context context, String str, Bundle bundle) {
        if (str == null) {
            return;
        }
        if (str.equals(ACTION_STORAGE_STATUS_SEND)) {
            saveStorageData(context, bundle);
        } else if (str.equals(ACTION_WALL_RECEIVER)) {
            watchFaceReceived(context, bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void watchFaceReceived(Context context, Bundle bundle) {
        boolean z;
        boolean z2;
        Log.v(a, "wallpaper message received", new Object[0]);
        String string = bundle.getString(Constant.h);
        if (string == null) {
            return;
        }
        Log.d(a, "CMD is : " + string, new Object[0]);
        if (BindHelper.getHelper().isBinding()) {
            return;
        }
        Device currentDevice = DeviceManager.getManager(context).getCurrentDevice();
        if (currentDevice == null) {
            Log.d(a, "CurrentDevice is null!! ", new Object[0]);
            return;
        }
        String cpuId = currentDevice.getCpuId();
        if (TextUtils.isEmpty(cpuId)) {
            Log.d(a, "CurrentDevice  model is null!! ", new Object[0]);
            return;
        }
        if (string.equalsIgnoreCase("set_reply")) {
            boolean z3 = bundle.getBoolean("iret");
            boolean z4 = bundle.getBoolean("fromuser", false);
            boolean zIsUserSavedWatchFaceSyncedToWatch = InitialState.isUserSavedWatchFaceSyncedToWatch();
            if (z3 && bundle.containsKey("packagename") && bundle.containsKey("servicename")) {
                if (z4 || zIsUserSavedWatchFaceSyncedToWatch) {
                    InitialState.setUserSavedWatchFaceSyncedToWatch(true);
                    WatchFaceManager.getManager().setSelectedWatchFace(context, bundle.getString("packagename"), bundle.getString("servicename"), cpuId);
                    return;
                }
                return;
            }
            return;
        }
        if (string.equalsIgnoreCase("query_reply_add")) {
            WatchFaceManager manager = WatchFaceManager.getManager();
            String string2 = bundle.containsKey("packagename") ? bundle.getString("packagename") : null;
            String string3 = bundle.containsKey("servicename") ? bundle.getString("servicename") : null;
            if (manager.has(string2, string3, cpuId)) {
                return;
            }
            String string4 = bundle.containsKey("title") ? bundle.getString("title") : null;
            byte[] byteArray = bundle.containsKey("icon_bytes") ? bundle.getByteArray("icon_bytes") : null;
            if (bundle.containsKey("hasSlpt")) {
                boolean z5 = bundle.getBoolean("hasSlpt", false);
                Log.d(a, "query_reply_add, Coming watch face has slpt: " + z5, new Object[0]);
                z2 = z5;
            } else {
                z2 = false;
            }
            long j = bundle.containsKey("lastModifyTime") ? bundle.getLong("lastModifyTime") / 1000 : 0L;
            int i = bundle.containsKey("internal") ? 1 ^ (bundle.getBoolean("internal") ? 1 : 0) : 0;
            if (string2 != null && string3 != null && string4 != null && byteArray != 0) {
                WatchFace watchFace = new WatchFace(string2, string3, string4, byteArray, z2, j);
                watchFace.setWatchFaceType(i);
                watchFace.setDeviceId(cpuId);
                if (manager.add(watchFace)) {
                    WatchFaceManager.getManager().clearCachedSelectedWatchFace();
                }
            }
            RxBus.get().postMainThread(new WatchFaceArrivingEvent("reply"));
            return;
        }
        if (!string.equalsIgnoreCase("query_reply")) {
            if (string.equalsIgnoreCase("query_reply_remove")) {
                WatchFaceManager manager2 = WatchFaceManager.getManager();
                String string5 = bundle.containsKey("packagename") ? bundle.getString("packagename") : null;
                String string6 = bundle.containsKey("servicename") ? bundle.getString("servicename") : null;
                if (manager2.has(string5, string6, cpuId)) {
                    manager2.delete(manager2.get(string5, string6, cpuId));
                    RxBus.get().postMainThread(new WatchFaceArrivingEvent("reply"));
                    return;
                }
                return;
            }
            if (string.equalsIgnoreCase("query_reply_fix")) {
                WatchFaceManager manager3 = WatchFaceManager.getManager();
                String string7 = bundle.containsKey("packagename") ? bundle.getString("packagename") : null;
                String string8 = bundle.containsKey("servicename") ? bundle.getString("servicename") : null;
                String string9 = bundle.containsKey("label") ? bundle.getString("label") : null;
                if (bundle.containsKey("hasSlpt")) {
                    z = bundle.getBoolean("hasSlpt", false);
                    Log.d(a, "query_reply_fix, Coming watch face has slpt: " + z, new Object[0]);
                } else {
                    z = false;
                }
                if (manager3.has(string7, string8, cpuId)) {
                    WatchFace watchFace2 = manager3.get(string7, string8, cpuId);
                    if (!TextUtils.isEmpty(watchFace2.label) && !watchFace2.label.equals(string9)) {
                        manager3.updateLabel(string7, string8, string9, cpuId);
                    }
                    if (watchFace2.hasSlpt == (!z)) {
                        Log.d(a, "Update has slpt info", new Object[0]);
                        manager3.updateSlpt(string7, string8, z, cpuId);
                    }
                    RxBus.get().postMainThread(new WatchFaceArrivingEvent("reply"));
                    return;
                }
                return;
            }
            return;
        }
        if (bundle.containsKey("ncount")) {
            int i2 = bundle.getInt("ncount");
            WatchFaceManager manager4 = WatchFaceManager.getManager();
            manager4.wipeAll();
            for (int i3 = 0; i3 < i2; i3++) {
                String string10 = bundle.containsKey("packagename" + i3) ? bundle.getString("packagename" + i3) : null;
                String string11 = bundle.containsKey("servicename" + i3) ? bundle.getString("servicename" + i3) : null;
                String string12 = bundle.containsKey("title" + i3) ? bundle.getString("title" + i3) : null;
                byte[] byteArray2 = bundle.containsKey("icon_bytes" + i3) ? bundle.getByteArray("icon_bytes" + i3) : null;
                long j2 = bundle.containsKey("lastModifyTime" + i3) ? bundle.getLong("lastModifyTime" + i3) / 1000 : 0L;
                StringBuilder sb = new StringBuilder();
                sb.append("internal");
                sb.append(i3);
                int i4 = bundle.containsKey(sb.toString()) ? !bundle.getBoolean("internal") ? 1 : 0 : 0;
                if (string10 != null && string11 != null && string12 != null && byteArray2 != null) {
                    WatchFace watchFace3 = new WatchFace(string10, string11, string12, byteArray2, j2);
                    watchFace3.setWatchFaceType(i4);
                    watchFace3.setDeviceId(cpuId);
                    manager4.add(watchFace3);
                }
            }
            RxBus.get().postMainThread(new WatchFaceArrivingEvent("reply"));
            boolean z6 = bundle.getBoolean("fromuser", false);
            boolean zIsUserSavedWatchFaceSyncedToWatch2 = InitialState.isUserSavedWatchFaceSyncedToWatch();
            if (bundle.containsKey("selectedpackagename") && bundle.containsKey("selectedservicename")) {
                if (z6 || zIsUserSavedWatchFaceSyncedToWatch2) {
                    InitialState.setUserSavedWatchFaceSyncedToWatch(true);
                    WatchFaceManager.getManager().setSelectedWatchFace(context, bundle.getString("selectedpackagename"), bundle.getString("selectedservicename"), cpuId);
                }
            }
        }
    }
}
