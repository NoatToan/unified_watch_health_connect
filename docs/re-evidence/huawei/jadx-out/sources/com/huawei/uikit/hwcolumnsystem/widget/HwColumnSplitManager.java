package com.huawei.uikit.hwcolumnsystem.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes20.dex */
public class HwColumnSplitManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HwColumnSplitManager f29341a = new HwColumnSplitManager();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SplitModeConfigListener f29342c;

    public interface SplitModeConfigListener {
        boolean isSplitMode(Context context);
    }

    private HwColumnSplitManager() {
    }

    public static HwColumnSplitManager e() {
        return f29341a;
    }

    public boolean b(Context context) {
        SplitModeConfigListener splitModeConfigListener = this.f29342c;
        if (splitModeConfigListener != null) {
            boolean zIsSplitMode = splitModeConfigListener.isSplitMode(context);
            Log.d("HwColumnSplitManager", "isConfigSplitMode: " + zIsSplitMode);
            return zIsSplitMode;
        }
        Activity activityE = e(context);
        if (activityE == null) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("com.huawei.android.app.IHwActivitySplitterImplEx");
            Object objInvoke = cls.getMethod("isSplitMode", new Class[0]).invoke(cls.getDeclaredConstructor(Activity.class, Boolean.TYPE).newInstance(activityE, Boolean.TRUE), new Object[0]);
            if (!(objInvoke instanceof Boolean)) {
                Log.w("HwColumnSplitManager", "isSplitMode: object is not Boolean");
                return false;
            }
            boolean zBooleanValue = ((Boolean) objInvoke).booleanValue();
            Log.d("HwColumnSplitManager", "isReflectSplitMode: " + zBooleanValue);
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            Log.w("HwColumnSplitManager", "isSplitMode: class not found");
        } catch (IllegalAccessException unused2) {
            Log.w("HwColumnSplitManager", "isSplitMode: illegal access exception");
        } catch (InstantiationException unused3) {
            Log.w("HwColumnSplitManager", "isSplitMode: instantiation exception");
        } catch (NoSuchMethodException unused4) {
            Log.w("HwColumnSplitManager", "isSplitMode: method not found");
        } catch (InvocationTargetException unused5) {
            Log.w("HwColumnSplitManager", "isSplitMode: invocation target exception");
        }
    }

    public boolean d(Activity activity) {
        return (activity == null || activity.getWindow() == null || activity.getWindow().getAttributes() == null) ? false : true;
    }

    public Activity e(Context context) {
        if (context == null) {
            return null;
        }
        Activity activity = null;
        while (activity == null && context != null) {
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        return activity;
    }
}
