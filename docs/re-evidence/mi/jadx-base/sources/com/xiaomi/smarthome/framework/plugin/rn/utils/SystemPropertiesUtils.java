package com.xiaomi.smarthome.framework.plugin.rn.utils;

import com.mi.health.course.export.data.CourseConfigModel;

/* JADX INFO: loaded from: classes2.dex */
public class SystemPropertiesUtils {
    public static String get(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static void set(String str, String str2) {
        try {
            Class.forName("android.os.SystemProperties").getMethod(CourseConfigModel.DevCmd.CMD_ACTION_SET, String.class, String.class).invoke(null, str, str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
