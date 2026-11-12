package defpackage;

import android.Manifest;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.LocationManager;
import androidx.core.app.ActivityCompat;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.huawei.health.h5pro.core.a;
import com.huawei.health.h5pro.utils.LogUtil;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class exo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<String> f33643c = b();

    private exo() {
    }

    public static void a(Activity activity, Intent intent, int i) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = activity.getPackageManager();
        if (packageManager == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) == null) {
            return;
        }
        ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
        intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
        activity.startActivityForResult(intent, i);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001e  */
    public static boolean a(Context context, String str) {
        boolean z;
        synchronized (exo.class) {
            if (context == null) {
                z = false;
            } else if (ActivityCompat.checkSelfPermission(context, str) == 0 || (!f33643c.contains(str) && a(str))) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private static boolean a(String str) {
        synchronized (exo.class) {
            LogUtil.d("PermissionUtils", a.a("Permission not found: ", str));
        }
        return true;
    }

    private static Set<String> b() {
        HashSet hashSet = new HashSet();
        for (Field field : Manifest.permission.class.getFields()) {
            try {
                hashSet.add((String) field.get(""));
            } catch (IllegalAccessException unused) {
                LogUtil.e("PermissionUtils", "Could not access the field");
            }
        }
        return hashSet;
    }

    public static boolean c(Context context) {
        boolean zIsProviderEnabled;
        boolean zIsProviderEnabled2;
        if (context == null) {
            LogUtil.w("PermissionUtils", "context is null");
            return false;
        }
        Object systemService = context.getSystemService("location");
        if (systemService instanceof LocationManager) {
            LocationManager locationManager = (LocationManager) systemService;
            zIsProviderEnabled2 = locationManager.isProviderEnabled(GeocodeSearch.GPS);
            LogUtil.i("PermissionUtils", "isGPSLocationEnable:" + zIsProviderEnabled2);
            zIsProviderEnabled = locationManager.isProviderEnabled("network");
            LogUtil.i("PermissionUtils", "isNetWorkLocationEnable:" + zIsProviderEnabled);
        } else {
            zIsProviderEnabled = false;
            zIsProviderEnabled2 = false;
        }
        return zIsProviderEnabled2 || zIsProviderEnabled;
    }
}
