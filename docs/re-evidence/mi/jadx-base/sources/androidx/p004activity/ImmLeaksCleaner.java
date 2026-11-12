package androidx.p004activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
final class ImmLeaksCleaner implements LifecycleEventObserver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f1371b;
    public static Field c;
    public static Field d;
    public static Field e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f1372a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a() {
        try {
            f1371b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            c = declaredField3;
            declaredField3.setAccessible(true);
            f1371b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f1371b == 0) {
            a();
        }
        if (f1371b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f1372a.getSystemService("input_method");
            try {
                Object obj = c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            try {
                                View view = (View) d.get(inputMethodManager);
                                if (view == null) {
                                    return;
                                }
                                if (view.isAttachedToWindow()) {
                                    return;
                                }
                                try {
                                    e.set(inputMethodManager, null);
                                    inputMethodManager.isActive();
                                } catch (IllegalAccessException unused) {
                                }
                            } catch (ClassCastException unused2) {
                            }
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
