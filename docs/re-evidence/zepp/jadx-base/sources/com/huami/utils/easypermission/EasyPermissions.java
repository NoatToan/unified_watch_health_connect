package com.huami.utils.easypermission;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.huami.utils.easypermission.helper.PermissionHelper;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class EasyPermissions {
    private static final String a = "EasyPermissions";

    public interface AppSettingDialogCallbacks {
        void onDetailClick(int i);
    }

    public interface PermissionCallbacks extends ActivityCompat.OnRequestPermissionsResultCallback {
        void onPermissionsDenied(int i, @NonNull List<String> list);

        void onPermissionsGranted(int i, @NonNull List<String> list);
    }

    public interface RationaleCallbacks {
        void onRationaleAccepted(int i);

        void onRationaleDenied(int i);
    }

    private static boolean a(@NonNull Object obj) {
        if (!obj.getClass().getSimpleName().endsWith("_")) {
            return false;
        }
        try {
            return Class.forName("org.androidannotations.api.view.HasViews").isInstance(obj);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static void b(@NonNull Object obj, int i, @NonNull String[] strArr) {
        int[] iArr = new int[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            iArr[i2] = 0;
        }
        onRequestPermissionsResult(i, strArr, iArr, obj);
    }

    private static void c(PermissionRequest permissionRequest) {
        if (hasPermissions(permissionRequest.getHelper().getContext(), permissionRequest.getPerms())) {
            b(permissionRequest.getHelper().getHost(), permissionRequest.getRequestCode(), permissionRequest.getPerms());
        } else {
            permissionRequest.getHelper().requestPermissionsWithRationalOnceADay(permissionRequest.getRationale(), permissionRequest.getPositiveButtonText(), permissionRequest.getNegativeButtonText(), permissionRequest.getTheme(), permissionRequest.getRequestCode(), permissionRequest.getRequestKey(), permissionRequest.getPerms());
        }
    }

    private static void d(PermissionRequest permissionRequest) {
        if (hasPermissions(permissionRequest.getHelper().getContext(), permissionRequest.getPerms())) {
            b(permissionRequest.getHelper().getHost(), permissionRequest.getRequestCode(), permissionRequest.getPerms());
        } else {
            permissionRequest.getHelper().requestPermissionsWithRationalOnlyOnce(permissionRequest.getRationale(), permissionRequest.getPositiveButtonText(), permissionRequest.getNegativeButtonText(), permissionRequest.getTheme(), permissionRequest.getRequestCode(), permissionRequest.getRequestKey(), permissionRequest.getPerms());
        }
    }

    public static void directRequestPermissions(@NonNull Activity activity, int i, @NonNull @Size(min = 1) String... strArr) {
        new PermissionRequest.Builder(activity, i, strArr).build().getHelper().directRequestPermissions(i, strArr);
    }

    private static void e(PermissionRequest permissionRequest) {
        if (hasPermissions(permissionRequest.getHelper().getContext(), permissionRequest.getPerms())) {
            b(permissionRequest.getHelper().getHost(), permissionRequest.getRequestCode(), permissionRequest.getPerms());
        } else {
            permissionRequest.getHelper().requestPermissions(permissionRequest.getRationale(), permissionRequest.getPositiveButtonText(), permissionRequest.getNegativeButtonText(), permissionRequest.getTheme(), permissionRequest.getRequestCode(), permissionRequest.getPerms());
        }
    }

    private static void f(@NonNull Object obj, int i) {
        Class<?> superclass = obj.getClass();
        if (a(obj)) {
            superclass = superclass.getSuperclass();
        }
        while (superclass != null) {
            for (Method method : superclass.getDeclaredMethods()) {
                AfterPermissionGranted afterPermissionGranted = (AfterPermissionGranted) method.getAnnotation(AfterPermissionGranted.class);
                if (afterPermissionGranted != null && afterPermissionGranted.value() == i) {
                    if (method.getParameterTypes().length > 0) {
                        throw new RuntimeException("Cannot execute method " + method.getName() + " because it is non-void method and/or has input parameters.");
                    }
                    try {
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(obj, new Object[0]);
                    } catch (IllegalAccessException e) {
                        Log.e(a, "runDefaultMethod:IllegalAccessException", e);
                    } catch (InvocationTargetException e2) {
                        Log.e(a, "runDefaultMethod:InvocationTargetException", e2);
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
    }

    public static boolean hasPermissions(@NonNull Context context, @NonNull @Size(min = 1) String... strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            Log.w(a, "hasPermissions: API version < M, returning true by default");
            return true;
        }
        for (String str : strArr) {
            if (ContextCompat.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr, @NonNull Object... objArr) {
        onRequestPermissionsResult(null, i, strArr, iArr, objArr);
    }

    public static boolean permissionPermanentlyDenied(@NonNull Activity activity, @NonNull String str) {
        return PermissionHelper.newInstance(activity).permissionPermanentlyDenied(str);
    }

    public static void requestPermissions(@NonNull Activity activity, @NonNull String str, int i, String str2, @NonNull @Size(min = 1) String... strArr) {
        c(new PermissionRequest.Builder(activity, i, strArr).setRationale(str).setRequestKey(str2).build());
    }

    public static void requestPermissionsWithRational(@NonNull Activity activity, @NonNull String str, int i, @NonNull @Size(min = 1) String... strArr) {
        e(new PermissionRequest.Builder(activity, i, strArr).setRationale(str).build());
    }

    public static boolean somePermissionDenied(@NonNull Activity activity, @NonNull String... strArr) {
        return PermissionHelper.newInstance(activity).somePermissionDenied(strArr);
    }

    public static boolean somePermissionPermanentlyDenied(@NonNull Activity activity, @NonNull List<String> list) {
        return PermissionHelper.newInstance(activity).somePermissionPermanentlyDenied(list);
    }

    public static void strictRequestPermissions(@NonNull Activity activity, @NonNull String str, int i, String str2, @NonNull @Size(min = 1) String... strArr) {
        d(new PermissionRequest.Builder(activity, i, strArr).setRationale(str).setRequestKey(str2).build());
    }

    public static void onRequestPermissionsResult(@Nullable String str, int i, @NonNull String[] strArr, @NonNull int[] iArr, @NonNull Object... objArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str2 = strArr[i2];
            if (iArr[i2] == 0) {
                arrayList.add(str2);
            } else {
                arrayList2.add(str2);
            }
        }
        for (Object obj : objArr) {
            if (!arrayList.isEmpty() && (obj instanceof PermissionCallbacks)) {
                ((PermissionCallbacks) obj).onPermissionsGranted(i, arrayList);
            }
            if (!arrayList2.isEmpty() && (obj instanceof PermissionCallbacks)) {
                ((PermissionCallbacks) obj).onPermissionsDenied(i, arrayList2);
            }
            if (!arrayList.isEmpty() && arrayList2.isEmpty()) {
                f(obj, i);
            }
        }
        if (!arrayList.isEmpty() && arrayList2.isEmpty()) {
            PermissionRationaleSpHelper.removeRequestKey2Code(str, i);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        PermissionRationaleSpHelper.onPermissionDenied(str, i);
    }

    public static boolean permissionPermanentlyDenied(@NonNull Fragment fragment, @NonNull String str) {
        return PermissionHelper.newInstance(fragment).permissionPermanentlyDenied(str);
    }

    public static boolean somePermissionDenied(@NonNull Fragment fragment, @NonNull String... strArr) {
        return PermissionHelper.newInstance(fragment).somePermissionDenied(strArr);
    }

    public static void directRequestPermissions(@NonNull Fragment fragment, int i, @NonNull @Size(min = 1) String... strArr) {
        new PermissionRequest.Builder(fragment, i, strArr).build().getHelper().directRequestPermissions(i, strArr);
    }

    public static boolean somePermissionPermanentlyDenied(@NonNull Fragment fragment, @NonNull List<String> list) {
        return PermissionHelper.newInstance(fragment).somePermissionPermanentlyDenied(list);
    }

    public static void requestPermissionsWithRational(@NonNull Fragment fragment, @NonNull String str, int i, @NonNull @Size(min = 1) String... strArr) {
        e(new PermissionRequest.Builder(fragment, i, strArr).setRationale(str).build());
    }

    public static void requestPermissions(@NonNull Fragment fragment, @NonNull String str, int i, String str2, @NonNull @Size(min = 1) String... strArr) {
        c(new PermissionRequest.Builder(fragment, i, strArr).setRationale(str).setRequestKey(str2).build());
    }

    public static void requestPermissions(boolean z, @NonNull Fragment fragment, @NonNull String str, int i, String str2, @NonNull @Size(min = 1) String... strArr) {
        if (z) {
            d(new PermissionRequest.Builder(fragment, i, strArr).setRationale(str).setRequestKey(str2).build());
        } else {
            c(new PermissionRequest.Builder(fragment, i, strArr).setRationale(str).setRequestKey(str2).build());
        }
    }
}
