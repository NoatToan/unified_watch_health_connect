package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.os.Environment;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationManagerCompat;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.Permissions;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.OsType;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class ltd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ltd f40777c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40779b;
    private final Set<String> e = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<PermissionsResultAction> f40778a = new ArrayList(16);

    private ltd() {
    }

    public static ltd e() {
        ltd ltdVar;
        synchronized (ltd.class) {
            if (f40777c == null) {
                f40777c = new ltd();
            }
            ltdVar = f40777c;
        }
        return ltdVar;
    }

    private void d(String[] strArr, PermissionsResultAction permissionsResultAction) {
        synchronized (this) {
            if (permissionsResultAction == null) {
                return;
            }
            permissionsResultAction.registerPermissions(strArr);
            this.f40778a.add(permissionsResultAction);
        }
    }

    public void d(PermissionsResultAction permissionsResultAction) {
        synchronized (this) {
            Iterator<PermissionsResultAction> it = this.f40778a.iterator();
            while (it.hasNext()) {
                PermissionsResultAction next = it.next();
                if (next == permissionsResultAction || next == null) {
                    it.remove();
                }
            }
        }
    }

    public boolean e(Context context, String str) {
        synchronized (this) {
            if (PermissionUtil.f()) {
                if ("android.permission.MANAGE_EXTERNAL_STORAGE".equals(str)) {
                    return Environment.isExternalStorageManager();
                }
                if (Constants.POST_NOTIFICATIONS.equals(str)) {
                    return NotificationManagerCompat.from(context).areNotificationsEnabled();
                }
            }
            return context != null && (ActivityCompat.checkSelfPermission(context, str) == 0 || !b(context, str));
        }
    }

    private boolean b(Context context, String str) {
        PermissionInfo permissionInfo;
        try {
            permissionInfo = context.getApplicationContext().getPackageManager().getPermissionInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("PermissionsManager", "cannot found permission: ", str);
            permissionInfo = null;
        }
        if (permissionInfo == null) {
            return false;
        }
        LogUtil.b("PermissionsManager", "android res: ", Boolean.valueOf(OsType.ANDROID.equals(permissionInfo.packageName)), ",hwext res: ", Boolean.valueOf("androidhwext".equals(permissionInfo.packageName)), ",hnext res: ", Boolean.valueOf("androidhnext".equals(permissionInfo.packageName)));
        return OsType.ANDROID.equals(permissionInfo.packageName) || "androidhwext".equals(permissionInfo.packageName) || "androidhnext".equals(permissionInfo.packageName);
    }

    public void e(Activity activity, String[] strArr, PermissionsResultAction permissionsResultAction) {
        synchronized (this) {
            if (activity == null) {
                return;
            }
            try {
                d(strArr, permissionsResultAction);
                List<String> listB = b(activity, strArr, permissionsResultAction);
                if (listB.isEmpty()) {
                    d(permissionsResultAction);
                    return;
                }
                String[] strArr2 = (String[]) listB.toArray(new String[0]);
                this.e.addAll(listB);
                try {
                    b();
                    ActivityCompat.requestPermissions(activity, strArr2, 20192);
                    e(activity, strArr2, "com.huawei.health.action.ACTION_PERMISSION_REQUEST");
                } catch (ActivityNotFoundException e) {
                    LogUtil.d("PermissionsManager", "requestPermissionsIfNecessaryForResult ex: ", e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b() {
        PermissionUtil.f17225b = System.currentTimeMillis();
        LogUtil.b("PermissionsManager", "recordRequestStartTime sRequestStartTime: ", Long.valueOf(PermissionUtil.f17225b));
    }

    public void b(Activity activity, String[] strArr, PermissionsResultAction permissionsResultAction, int i) {
        synchronized (this) {
            if (activity == null) {
                return;
            }
            d(strArr, permissionsResultAction);
            List<String> listC = c(activity, strArr, permissionsResultAction);
            if (listC.isEmpty()) {
                d(permissionsResultAction);
            } else {
                String[] strArr2 = (String[]) listC.toArray(new String[0]);
                this.e.addAll(listC);
                ActivityCompat.requestPermissions(activity, strArr2, i);
                e(activity, strArr2, "com.huawei.health.action.ACTION_PERMISSION_REQUEST");
            }
        }
    }

    public void e(String[] strArr, int[] iArr) {
        int i;
        synchronized (this) {
            LogUtil.b("PermissionsManager", "notifyPermissionsChange");
            e((Activity) null, (String[]) null, "com.huawei.health.action.ACTION_PERMISSION_REQUEST_FINISH");
            if (strArr != null && iArr != null) {
                LogUtil.b("PermissionsManager", "notifyPermissionsChange myPermissions=", Arrays.toString(strArr), " myResults=", Arrays.toString(iArr));
                int length = strArr.length;
                if (iArr.length < length) {
                    length = iArr.length;
                }
                Iterator<PermissionsResultAction> it = this.f40778a.iterator();
                while (it.hasNext()) {
                    PermissionsResultAction next = it.next();
                    for (0; i < length; i + 1) {
                        i = (next == null || next.onResult(strArr[i], iArr[i])) ? 0 : i + 1;
                        it.remove();
                        break;
                    }
                }
                for (int i2 = 0; i2 < length; i2++) {
                    this.e.remove(strArr[i2]);
                }
            }
        }
    }

    public void e(boolean z) {
        this.f40779b = z;
    }

    private void e(Activity activity, String[] strArr, String str) {
        String className;
        if (this.f40779b) {
            LogUtil.b("PermissionsManager", "no need to send");
            return;
        }
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("Permissions", strArr);
        if (activity == null || activity.getComponentName() == null) {
            className = "";
        } else {
            className = activity.getComponentName().getClassName();
        }
        intent.putExtra("RequestClassName", className);
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    private List<String> c(Activity activity, String[] strArr, PermissionsResultAction permissionsResultAction) {
        if (strArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (b(activity, str)) {
                if (ActivityCompat.checkSelfPermission(activity, str) != 0) {
                    if (!this.e.contains(str)) {
                        arrayList.add(str);
                    }
                } else if (permissionsResultAction != null) {
                    permissionsResultAction.onResult(str, Permissions.GRANTED);
                }
            } else if (permissionsResultAction != null) {
                permissionsResultAction.onResult(str, Permissions.NOT_FOUND);
            }
        }
        return arrayList;
    }

    private List<String> b(Activity activity, String[] strArr, PermissionsResultAction permissionsResultAction) {
        if (strArr == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (b(activity, str)) {
                if (ActivityCompat.checkSelfPermission(activity, str) != 0) {
                    arrayList.add(str);
                } else if (permissionsResultAction != null) {
                    permissionsResultAction.onResult(str, Permissions.GRANTED);
                }
            } else if (permissionsResultAction != null) {
                permissionsResultAction.onResult(str, Permissions.NOT_FOUND);
            }
        }
        return arrayList;
    }

    public static void d() {
        synchronized (ltd.class) {
            if (f40777c != null) {
                f40777c = null;
            }
        }
    }
}
