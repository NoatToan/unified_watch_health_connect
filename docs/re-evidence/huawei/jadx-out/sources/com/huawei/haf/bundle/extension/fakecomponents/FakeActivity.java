package com.huawei.haf.bundle.extension.fakecomponents;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import health.compact.a.LogUtil;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class FakeActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        int iA = a(this);
        super.onCreate(bundle);
        a(this, iA);
        if (getIntent() != null) {
            setIntent(null);
        }
        finish();
    }

    private static int a(Activity activity) {
        int i = -1;
        if (Build.VERSION.SDK_INT == 26 && activity.getApplicationInfo().targetSdkVersion > 26 && b(activity) && e(activity)) {
            try {
                Object objD = d(activity);
                Field fieldD = d();
                int i2 = fieldD.getInt(objD);
                if (i2 == -1) {
                    return i2;
                }
                try {
                    fieldD.setInt(objD, -1);
                    return i2;
                } catch (IllegalAccessException | NoSuchFieldException e) {
                    e = e;
                    i = i2;
                    LogUtil.d("Bundle_FakeActivity", "releaseFixedOrientation:ex=", LogUtil.c(e));
                    return i;
                }
            } catch (IllegalAccessException e2) {
                e = e2;
            } catch (NoSuchFieldException e3) {
                e = e3;
            }
        }
        return i;
    }

    private static void a(Activity activity, int i) {
        if (i != -1 && Build.VERSION.SDK_INT == 26 && activity.getApplicationInfo().targetSdkVersion > 26 && b(activity) && !e(activity)) {
            try {
                Object objD = d(activity);
                Field fieldD = d();
                if (fieldD.getInt(objD) == -1) {
                    fieldD.setInt(objD, i);
                }
            } catch (IllegalAccessException | NoSuchFieldException e) {
                LogUtil.d("Bundle_FakeActivity", "fixedOrientation:ex=", LogUtil.c(e));
            }
        }
    }

    private static boolean b(Activity activity) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$styleable");
            Field declaredField = cls.getDeclaredField("Window");
            boolean z = true;
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("Window_windowIsTranslucent");
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("Window_windowSwipeToDismiss");
            declaredField3.setAccessible(true);
            Field declaredField4 = cls.getDeclaredField("Window_windowIsFloating");
            declaredField4.setAccessible(true);
            Object obj = declaredField.get(null);
            if (obj instanceof int[]) {
                TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes((int[]) obj);
                if (!a(typedArrayObtainStyledAttributes, declaredField4) && !d(typedArrayObtainStyledAttributes, declaredField2) && !d(typedArrayObtainStyledAttributes, declaredField3, declaredField2)) {
                    z = false;
                }
                typedArrayObtainStyledAttributes.recycle();
                return z;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e) {
            LogUtil.d("Bundle_FakeActivity", "isTranslucentOrFloating:ex=", LogUtil.c(e));
        }
        return false;
    }

    private static boolean a(TypedArray typedArray, Field field) throws IllegalAccessException {
        Object obj = field.get(null);
        if (obj instanceof Integer) {
            return typedArray.getBoolean(((Integer) obj).intValue(), false);
        }
        return false;
    }

    private static boolean d(TypedArray typedArray, Field field) throws IllegalAccessException {
        Object obj = field.get(null);
        if (obj instanceof Integer) {
            return typedArray.getBoolean(((Integer) obj).intValue(), false);
        }
        return false;
    }

    private static boolean d(TypedArray typedArray, Field field, Field field2) throws IllegalAccessException {
        Object obj = field.get(null);
        boolean z = obj instanceof Integer ? typedArray.getBoolean(((Integer) obj).intValue(), false) : false;
        Object obj2 = field2.get(null);
        if (obj2 instanceof Integer) {
            return !typedArray.hasValue(((Integer) obj2).intValue()) && z;
        }
        return z;
    }

    private static boolean e(Activity activity) {
        try {
            Object objD = d(activity);
            Method declaredMethod = ActivityInfo.class.getDeclaredMethod("isFixedOrientation", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(objD, new Object[0]);
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            LogUtil.d("Bundle_FakeActivity", "isFixedOrientation:ex=", LogUtil.c(e));
        }
        return false;
    }

    private static Object d(Activity activity) throws IllegalAccessException, NoSuchFieldException {
        Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
        declaredField.setAccessible(true);
        return declaredField.get(activity);
    }

    private static Field d() throws NoSuchFieldException {
        Field declaredField = ActivityInfo.class.getDeclaredField("screenOrientation");
        declaredField.setAccessible(true);
        return declaredField;
    }
}
