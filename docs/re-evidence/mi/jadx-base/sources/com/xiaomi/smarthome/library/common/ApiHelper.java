package com.xiaomi.smarthome.library.common;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.MediaStore;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class ApiHelper {
    public static final boolean HAS_ANDROID_ANIMATION;
    public static final boolean HAS_ANDROID_CLEAR_TASK;
    public static final boolean HAS_BLE_API;
    public static final boolean HAS_CHECKBOX_PADDING;
    public static final boolean HAS_EDITOR_APPLY;
    public static final boolean HAS_GET_CAMERA_DISABLED;
    public static final boolean HAS_MULTICORE_CHIPS;
    public static final boolean HAS_NEW_DISPLAY;
    public static final boolean HAS_NOTIFICATION_BUILDER;
    public static final boolean HAS_RELEASE_SURFACE_TEXTURE;
    public static final boolean HAS_SET_DEFALT_BUFFER_SIZE;
    public static final boolean HAS_SET_SYSTEM_UI_VISIBILITY;
    public static final boolean HAS_SHARED_MEMORY;
    public static final boolean HAS_SHORT_CUT_MANAGER;
    public static final boolean HAS_VIEW_SYSTEM_UI_FLAG_HIDE_NAVIGATION;
    public static final boolean HAS_VIEW_SYSTEM_UI_FLAG_LAYOUT_STABLE;
    public static final boolean IS_MARSHMALLOW;
    public static final boolean IS_NOUGAT;

    public interface VERSION_CODES {
        public static final int FROYO = 8;
        public static final int GINGERBREAD = 9;
        public static final int GINGERBREAD_MR1 = 10;
        public static final int HONEYCOMB = 11;
        public static final int HONEYCOMB_MR1 = 12;
        public static final int HONEYCOMB_MR2 = 13;
        public static final int ICE_CREAM_SANDWICH = 14;
        public static final int ICE_CREAM_SANDWICH_MR1 = 15;
        public static final int JELLY_BEAN = 16;
        public static final int JELLY_BEAN_MR1 = 17;
        public static final int JELLY_BEAN_MR2 = 18;
        public static final int MARSHMALLOW = 23;
        public static final int NOUGAT = 24;
    }

    static {
        int i = Build.VERSION.SDK_INT;
        HAS_ANDROID_ANIMATION = true;
        HAS_SHARED_MEMORY = i >= 27;
        HAS_SHORT_CUT_MANAGER = true;
        HAS_NOTIFICATION_BUILDER = true;
        IS_MARSHMALLOW = true;
        IS_NOUGAT = true;
        HAS_ANDROID_CLEAR_TASK = true;
        HAS_NEW_DISPLAY = true;
        HAS_CHECKBOX_PADDING = true;
        HAS_VIEW_SYSTEM_UI_FLAG_LAYOUT_STABLE = hasField(View.class, "SYSTEM_UI_FLAG_LAYOUT_STABLE");
        HAS_VIEW_SYSTEM_UI_FLAG_HIDE_NAVIGATION = hasField(MediaStore.MediaColumns.class, "WIDTH");
        Class cls = Integer.TYPE;
        HAS_SET_DEFALT_BUFFER_SIZE = hasMethod("android.graphics.SurfaceTexture", "setDefaultBufferSize", (Class<?>[]) new Class[]{cls, cls});
        HAS_RELEASE_SURFACE_TEXTURE = hasMethod("android.graphics.SurfaceTexture", "release", (Class<?>[]) new Class[0]);
        HAS_SET_SYSTEM_UI_VISIBILITY = hasMethod((Class<?>) View.class, "setSystemUiVisibility", (Class<?>[]) new Class[]{cls});
        HAS_EDITOR_APPLY = hasMethod((Class<?>) SharedPreferences.Editor.class, "apply", (Class<?>[]) null);
        HAS_GET_CAMERA_DISABLED = hasMethod((Class<?>) DevicePolicyManager.class, "getCameraDisabled", (Class<?>[]) new Class[]{ComponentName.class});
        HAS_MULTICORE_CHIPS = Runtime.getRuntime().availableProcessors() > 1;
        HAS_BLE_API = true;
    }

    public static int getIntFieldIfExists(Class<?> cls, String str, Class<?> cls2, int i) {
        try {
            return cls.getDeclaredField(str).getInt(cls2);
        } catch (Exception unused) {
            return i;
        }
    }

    private static boolean hasField(Class<?> cls, String str) {
        try {
            cls.getDeclaredField(str);
            return true;
        } catch (NoSuchFieldException unused) {
            return false;
        }
    }

    private static boolean hasMethod(String str, String str2, Class<?>... clsArr) {
        try {
            Class.forName(str).getDeclaredMethod(str2, clsArr);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean hasMethod(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            cls.getDeclaredMethod(str, clsArr);
            return true;
        } catch (NoSuchMethodException unused) {
            return false;
        }
    }
}
