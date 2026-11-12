package com.huami.watch.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.huami.watch.util.AndroidPermissions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class AndroidPermissions {
    private static final String a = "Util-AndroidPermissions";

    private static boolean b() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return false;
        }
        Log.d(a, "CurrentSDK : " + i, new Object[0]);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(Activity activity) {
        try {
            Cursor cursorQuery = activity.getContentResolver().query(Uri.parse("content://sms/"), null, null, null, null);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e) {
            Log.w(a, "ReadSmsErr", e, new Object[0]);
        }
    }

    public static boolean checkGranted(Context context, @NonNull String str) {
        if (b()) {
            return true;
        }
        boolean z = ContextCompat.checkSelfPermission(context, str) == 0;
        Log.d(a, "[" + str + "] granted : " + z, new Object[0]);
        return z;
    }

    public static boolean checkReadContacts(@NonNull Context context) {
        boolean z;
        try {
            context.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, new String[]{"display_name"}, null, null, "display_name ASC LIMIT 1");
            z = true;
        } catch (Exception e) {
            Log.w(a, "ReadContactsErr", e, new Object[0]);
            z = false;
        }
        Log.d(a, "Check ReadContacts : " + z, new Object[0]);
        return z;
    }

    public static boolean checkShowRequestTip(Activity activity, @NonNull String str) {
        return ActivityCompat.shouldShowRequestPermissionRationale(activity, str);
    }

    public static String[] getNotGranted(Context context, @NonNull String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!checkGranted(context, str)) {
                arrayList.add(str);
            }
        }
        return arrayList.size() > 0 ? (String[]) arrayList.toArray(new String[arrayList.size()]) : new String[0];
    }

    public static String[] getShowRequestTip(Activity activity, String[] strArr) {
        String[] strArr2 = new String[0];
        if (b()) {
            return strArr2;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (checkShowRequestTip(activity, str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() <= 0) {
            return strArr2;
        }
        String[] strArr3 = (String[]) arrayList.toArray(new String[arrayList.size()]);
        Log.d(a, "ShowRequestTip : " + Arrays.toString(strArr3), new Object[0]);
        return strArr3;
    }

    public static void request(Activity activity, @NonNull String str) {
        request(activity, new String[]{str}, 0);
    }

    public static void requestReadSmsPermission(@NonNull final Activity activity) {
        request(activity, "android.permission.READ_SMS");
        Rx.delayIo(new Runnable() { // from class: gg
            @Override // java.lang.Runnable
            public final void run() {
                AndroidPermissions.c(activity);
            }
        }, 1L, TimeUnit.SECONDS);
    }

    public static void request(Activity activity, @NonNull String[] strArr) {
        request(activity, strArr, 0);
    }

    public static void request(Activity activity, @NonNull String str, int i) {
        request(activity, new String[]{str}, i);
    }

    public static boolean checkGranted(Context context, @NonNull String[] strArr) {
        for (String str : strArr) {
            if (!checkGranted(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static void request(Activity activity, @NonNull String[] strArr, int i) {
        if (b()) {
            return;
        }
        String[] notGranted = getNotGranted(activity, strArr);
        if (notGranted.length > 0) {
            Log.d(a, "Request : " + Arrays.toString(notGranted), new Object[0]);
            ActivityCompat.requestPermissions(activity, notGranted, i);
            return;
        }
        Log.d(a, "Request None!!", new Object[0]);
    }

    @TargetApi(23)
    public static void request(Fragment fragment, @NonNull String[] strArr, int i) {
        if (b()) {
            return;
        }
        String[] notGranted = getNotGranted(fragment.getContext(), strArr);
        if (notGranted.length > 0) {
            Log.d(a, "Request : " + Arrays.toString(notGranted), new Object[0]);
            fragment.requestPermissions(notGranted, i);
            return;
        }
        Log.d(a, "Request None!!", new Object[0]);
    }
}
