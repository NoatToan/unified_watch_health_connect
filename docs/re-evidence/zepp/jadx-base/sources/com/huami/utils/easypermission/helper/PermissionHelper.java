package com.huami.utils.easypermission.helper;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.huami.utils.easypermission.EasyPermissions;
import com.huami.utils.easypermission.PermissionRationaleSpHelper;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public abstract class PermissionHelper<T> {
    private final T a;

    public PermissionHelper(@NonNull T t) {
        this.a = t;
    }

    private boolean a(Date date, Date date2) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTime(date);
        calendar2.setTime(date2);
        return calendar.get(0) == calendar2.get(0) && calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    private boolean b(@NonNull String... strArr) {
        for (String str : strArr) {
            if (shouldShowRequestPermissionRationale(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean c(String str) {
        Context context;
        T t = this.a;
        if (t instanceof Activity) {
            context = (Activity) t;
        } else {
            context = t instanceof Fragment ? ((Fragment) t).getContext() : null;
        }
        if (context == null) {
            return true;
        }
        return !a(new Date(PermissionRationaleSpHelper.getShowTime(str)), new Date());
    }

    private boolean d(String str) {
        return PermissionRationaleSpHelper.getShowTime(str) == 0;
    }

    @NonNull
    public static PermissionHelper<? extends Activity> newInstance(Activity activity) {
        if (Build.VERSION.SDK_INT < 23) {
            return new c(activity);
        }
        return activity instanceof AppCompatActivity ? new b((AppCompatActivity) activity) : new a(activity);
    }

    public abstract void directRequestPermissions(int i, @NonNull String... strArr);

    public abstract Context getContext();

    @NonNull
    public T getHost() {
        return this.a;
    }

    public boolean permissionPermanentlyDenied(@NonNull String str) {
        return !shouldShowRequestPermissionRationale(str);
    }

    public void requestPermissions(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i, int i2, @NonNull String... strArr) {
        showRequestPermissionRationale(false, str, str2, str3, i, null, i2, strArr);
    }

    public void requestPermissionsWithRationalOnceADay(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i, int i2, String str4, @NonNull String... strArr) {
        if (c(str4)) {
            showRequestPermissionRationale(true, str, str2, str3, i, str4, i2, strArr);
        } else {
            directRequestPermissions(i2, strArr);
        }
    }

    public void requestPermissionsWithRationalOnlyOnce(@NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i, int i2, String str4, @NonNull String... strArr) {
        if (d(str4)) {
            PermissionRationaleSpHelper.putRequestKey2Code(str4, i2);
            showRequestPermissionRationale(false, str, str2, str3, i, str4, i2, strArr);
            return;
        }
        int[] iArr = new int[strArr.length];
        for (int i3 = 0; i3 < strArr.length; i3++) {
            iArr[i3] = EasyPermissions.hasPermissions(getContext(), strArr[i3]) ? 0 : -1;
        }
        EasyPermissions.onRequestPermissionsResult(str4, i2, strArr, iArr, getHost());
    }

    public abstract boolean shouldShowRequestPermissionRationale(@NonNull String str);

    public abstract void showRequestPermissionRationale(boolean z, @NonNull String str, @NonNull String str2, @NonNull String str3, @StyleRes int i, String str4, int i2, @NonNull String... strArr);

    public boolean somePermissionDenied(@NonNull String... strArr) {
        return b(strArr);
    }

    public boolean somePermissionPermanentlyDenied(@NonNull List<String> list) {
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (permissionPermanentlyDenied(it2.next())) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public static PermissionHelper<Fragment> newInstance(Fragment fragment) {
        if (Build.VERSION.SDK_INT < 23) {
            return new c(fragment);
        }
        return new d(fragment);
    }
}
