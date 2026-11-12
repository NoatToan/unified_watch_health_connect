package com.mipay.sdk.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class PermissionUtils {
    private static final String TAG = "MipayWeb_Utils";

    @TargetApi(23)
    public static List<String> getPermanentlyDeniedPermissions(Activity activity, String... strArr) {
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            for (String str : strArr) {
                if (!activity.shouldShowRequestPermissionRationale(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public static String[] getUngrantedPermissions(Context context, String... strArr) {
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!isPermissionGranted(context, str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean hasPermissions(Context context, String... strArr) {
        for (String str : strArr) {
            if (!isPermissionGranted(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAllGranted(int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPermissionGranted(Context context, String str) {
        boolean z = context.checkSelfPermission(str) == 0;
        StringBuilder sb = new StringBuilder();
        sb.append("isPermissionGranted: ");
        sb.append(str);
        sb.append(":");
        sb.append(z);
        return z;
    }
}
