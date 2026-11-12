package com.baseflow.permissionhandler;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class n implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    @Nullable
    private b a;

    @Nullable
    private Activity b;
    private Map<Integer, Integer> c;
    private boolean d = false;

    @FunctionalInterface
    public interface a {
        void onSuccess(int i);
    }

    @FunctionalInterface
    public interface b {
        void onSuccess(Map<Integer, Integer> map);
    }

    @FunctionalInterface
    public interface c {
        void onSuccess(boolean z);
    }

    private int a(Context context) {
        List<String> listA = PermissionUtils.a(context, 21);
        if (!(listA == null || listA.isEmpty())) {
            return 1;
        }
        Log.d(m.a, "Bluetooth permission missing in manifest");
        return 0;
    }

    private int b(Context context) {
        return NotificationManagerCompat.from(context).areNotificationsEnabled() ? 1 : 0;
    }

    private int d(int i, Context context) {
        if (i == 17) {
            return b(context);
        }
        if (i == 21) {
            return a(context);
        }
        List<String> listA = PermissionUtils.a(context, i);
        if (listA == null) {
            Log.d(m.a, "No android specific permissions needed for: " + i);
            return 1;
        }
        if (listA.size() == 0) {
            Log.d(m.a, "No permissions found in manifest for: " + listA + i);
            if (i != 16 || Build.VERSION.SDK_INT >= 23) {
                return (i != 22 || Build.VERSION.SDK_INT >= 30) ? 0 : 2;
            }
            return 2;
        }
        boolean z = context.getApplicationInfo().targetSdkVersion >= 23;
        for (String str : listA) {
            if (z) {
                if (i == 16) {
                    String packageName = context.getPackageName();
                    PowerManager powerManager = (PowerManager) context.getSystemService("power");
                    if (Build.VERSION.SDK_INT >= 23) {
                        return (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) ? 0 : 1;
                    }
                    return 2;
                }
                if (i == 22) {
                    if (Build.VERSION.SDK_INT < 30) {
                        return 2;
                    }
                    return Environment.isExternalStorageManager() ? 1 : 0;
                }
                if (i == 23 && Build.VERSION.SDK_INT >= 23) {
                    return Settings.canDrawOverlays(context) ? 1 : 0;
                }
                if (i == 24 && Build.VERSION.SDK_INT >= 26) {
                    return context.getPackageManager().canRequestPackageInstalls() ? 1 : 0;
                }
                if (i == 27 && Build.VERSION.SDK_INT >= 23) {
                    return ((NotificationManager) context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION)).isNotificationPolicyAccessGranted() ? 1 : 0;
                }
                if (ContextCompat.checkSelfPermission(context, str) != 0) {
                    return 0;
                }
            }
        }
        return 1;
    }

    private void e(String str, int i) {
        String packageName = this.b.getPackageName();
        Intent intent = new Intent();
        intent.setAction(str);
        intent.setData(Uri.parse("package:" + packageName));
        this.b.startActivityForResult(intent, i);
    }

    private void f(String str, int i) {
        this.b.startActivityForResult(new Intent(str), i);
    }

    public void c(int i, Context context, a aVar) {
        aVar.onSuccess(d(i, context));
    }

    public void g(List<Integer> list, Activity activity, b bVar, com.baseflow.permissionhandler.b bVar2) {
        if (this.d) {
            bVar2.onError("PermissionHandler.PermissionManager", "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).");
            return;
        }
        if (activity == null) {
            Log.d(m.a, "Unable to detect current Activity.");
            bVar2.onError("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        this.a = bVar;
        this.b = activity;
        this.c = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Integer num : list) {
            if (d(num.intValue(), activity) != 1) {
                List<String> listA = PermissionUtils.a(activity, num.intValue());
                if (listA != null && !listA.isEmpty()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23 && num.intValue() == 16) {
                        e("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", m.c);
                    } else if (i >= 30 && num.intValue() == 22) {
                        e("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", m.d);
                    } else if (i >= 23 && num.intValue() == 23) {
                        e("android.settings.action.MANAGE_OVERLAY_PERMISSION", 211);
                    } else if (i >= 26 && num.intValue() == 24) {
                        e("android.settings.MANAGE_UNKNOWN_APP_SOURCES", 212);
                    } else if (i < 23 || num.intValue() != 27) {
                        arrayList.addAll(listA);
                    } else {
                        f("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS", 213);
                    }
                } else if (!this.c.containsKey(num)) {
                    if (num.intValue() != 16 || Build.VERSION.SDK_INT >= 23) {
                        this.c.put(num, 0);
                    } else {
                        this.c.put(num, 2);
                    }
                    if (num.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                        this.c.put(num, 0);
                    } else {
                        this.c.put(num, 2);
                    }
                }
            } else if (!this.c.containsKey(num)) {
                this.c.put(num, 1);
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (arrayList.size() > 0) {
            this.d = true;
            ActivityCompat.requestPermissions(activity, strArr, 24);
        } else {
            this.d = false;
            if (this.c.size() > 0) {
                bVar.onSuccess(this.c);
            }
        }
    }

    public void h(int i, Activity activity, c cVar, com.baseflow.permissionhandler.b bVar) {
        if (activity == null) {
            Log.d(m.a, "Unable to detect current Activity.");
            bVar.onError("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        List<String> listA = PermissionUtils.a(activity, i);
        if (listA == null) {
            Log.d(m.a, "No android specific permissions needed for: " + i);
            cVar.onSuccess(false);
            return;
        }
        if (!listA.isEmpty()) {
            cVar.onSuccess(ActivityCompat.shouldShowRequestPermissionRationale(activity, listA.get(0)));
            return;
        }
        Log.d(m.a, "No permissions found in manifest for: " + i + " no need to show request rationale");
        cVar.onSuccess(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i, int i2, Intent intent) {
        int iIsNotificationPolicyAccessGranted;
        if (i != 209 && i != 210 && i != 211 && i != 212 && i != 213) {
            return false;
        }
        boolean z = i2 == -1;
        int i3 = 23;
        if (i == 209) {
            i3 = 16;
            iIsNotificationPolicyAccessGranted = z;
        } else if (i == 210) {
            i3 = 22;
            iIsNotificationPolicyAccessGranted = Environment.isExternalStorageManager();
        } else if (i == 211) {
            if (Build.VERSION.SDK_INT < 23) {
                return false;
            }
            iIsNotificationPolicyAccessGranted = Settings.canDrawOverlays(this.b);
        } else if (i == 212) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            i3 = 24;
            iIsNotificationPolicyAccessGranted = this.b.getPackageManager().canRequestPackageInstalls();
        } else {
            if (i != 213 || Build.VERSION.SDK_INT < 23) {
                return false;
            }
            i3 = 27;
            iIsNotificationPolicyAccessGranted = ((NotificationManager) this.b.getSystemService(SleepHomeActivity.FROM_NOTIFICATION)).isNotificationPolicyAccessGranted();
        }
        HashMap map = new HashMap();
        map.put(Integer.valueOf(i3), Integer.valueOf(iIsNotificationPolicyAccessGranted));
        this.a.onSuccess(map);
        return true;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 24) {
            this.d = false;
            return false;
        }
        if (this.c == null) {
            return false;
        }
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            int iD = PermissionUtils.d(str);
            if (iD != 20) {
                int i3 = iArr[i2];
                if (iD == 7) {
                    if (!this.c.containsKey(7)) {
                        this.c.put(7, Integer.valueOf(PermissionUtils.e(this.b, str, i3)));
                    }
                    if (!this.c.containsKey(14)) {
                        this.c.put(14, Integer.valueOf(PermissionUtils.e(this.b, str, i3)));
                    }
                } else if (iD == 4) {
                    int iE = PermissionUtils.e(this.b, str, i3);
                    if (!this.c.containsKey(4)) {
                        this.c.put(4, Integer.valueOf(iE));
                    }
                } else if (iD == 3) {
                    int iE2 = PermissionUtils.e(this.b, str, i3);
                    if (Build.VERSION.SDK_INT < 29 && !this.c.containsKey(4)) {
                        this.c.put(4, Integer.valueOf(iE2));
                    }
                    if (!this.c.containsKey(5)) {
                        this.c.put(5, Integer.valueOf(iE2));
                    }
                    this.c.put(Integer.valueOf(iD), Integer.valueOf(iE2));
                } else if (!this.c.containsKey(Integer.valueOf(iD))) {
                    this.c.put(Integer.valueOf(iD), Integer.valueOf(PermissionUtils.e(this.b, str, i3)));
                }
                PermissionUtils.f(this.b, iD);
            }
        }
        this.a.onSuccess(this.c);
        this.d = false;
        return true;
    }
}
