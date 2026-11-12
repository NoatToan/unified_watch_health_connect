package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes12.dex */
public class obm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f44052a = Build.VERSION.SDK_INT;

    public static boolean c(String str, Context context) {
        if (TextUtils.isEmpty(str) || context == null) {
            ocq.c("ContentValues", "Permission is empty or context is null");
            return false;
        }
        Hashtable hashtable = new Hashtable();
        if (f44052a < 23) {
            return true;
        }
        if (!hashtable.containsKey(str) || ((Integer) hashtable.get(str)).intValue() == -1) {
            hashtable.put(str, Integer.valueOf(context.checkSelfPermission(str)));
        }
        return ((Integer) hashtable.get(str)).intValue() == 0;
    }

    public static void a(Activity activity, String[] strArr, int i) {
        if (f44052a <= 23) {
            return;
        }
        a(strArr, activity, i);
    }

    public static void a(String[] strArr, Activity activity, int i) {
        ocq.e("ContentValues", "requestPermissions enter");
        if (activity == null) {
            ocq.c("ContentValues", "activity is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (activity.checkSelfPermission(str) != 0) {
                ocq.e("ContentValues", "needRequestPermissionList.add(permission)");
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            ocq.c("ContentValues", "needRequestPermissionList is empty");
        } else {
            activity.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), i);
        }
    }
}
