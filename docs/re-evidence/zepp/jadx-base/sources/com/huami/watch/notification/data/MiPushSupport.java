package com.huami.watch.notification.data;

import android.app.Notification;
import android.content.Context;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes16.dex */
public class MiPushSupport {
    private static final String a = "com.xiaomi.xmsf";

    public static boolean isFromMiPush(String str) {
        return "com.xiaomi.xmsf".equals(str);
    }

    public static Utils.BitmapExtender retrieveAppIcon(Context context, Notification notification) {
        String strRetrieveTargetPkgName;
        if (context == null || notification == null || (strRetrieveTargetPkgName = retrieveTargetPkgName(notification)) == null) {
            return null;
        }
        return Utils.retrieveAppIcon(context, strRetrieveTargetPkgName);
    }

    public static String retrieveTargetPkgName(Notification notification) {
        try {
            Object obj = notification.getClass().getField("extraNotification").get(notification);
            Field declaredField = obj.getClass().getDeclaredField("targetPkg");
            declaredField.setAccessible(true);
            return (String) declaredField.get(obj);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return null;
        } catch (Exception e3) {
            e3.printStackTrace();
            return null;
        }
    }
}
