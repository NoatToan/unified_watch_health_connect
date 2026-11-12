package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.a;
import defpackage.kn0;
import defpackage.ni4;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends ni4 {

    /* JADX INFO: renamed from: androidx.core.app.a$a, reason: collision with other inner class name */
    @RequiresApi(21)
    public static class C0023a {
        public static void a(Activity activity) {
            activity.finishAfterTransition();
        }

        public static void b(Activity activity) {
            activity.postponeEnterTransition();
        }

        public static void c(Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setEnterSharedElementCallback(sharedElementCallback);
        }

        public static void d(Activity activity, android.app.SharedElementCallback sharedElementCallback) {
            activity.setExitSharedElementCallback(sharedElementCallback);
        }

        public static void e(Activity activity) {
            activity.startPostponedEnterTransition();
        }
    }

    @RequiresApi(23)
    public static class b {
        public static void a(Object obj) {
            ((android.app.SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        public static void b(Activity activity, String[] strArr, int i) {
            activity.requestPermissions(strArr, i);
        }

        public static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    @RequiresApi(28)
    public static class c {
        public static <T> T a(Activity activity, int i) {
            return (T) activity.requireViewById(i);
        }
    }

    @RequiresApi(31)
    public static class d {
        public static boolean a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static boolean b(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    @RequiresApi(32)
    public static class e {
        public static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface f {
        void validateRequestPermissionsRequestCode(int i);
    }

    @RequiresApi(21)
    public static class g extends android.app.SharedElementCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SharedElementCallback f2067a;

        public g(SharedElementCallback sharedElementCallback) {
            this.f2067a = sharedElementCallback;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f2067a.b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f2067a.c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f2067a.d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f2067a.e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f2067a.f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f2067a.g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        @RequiresApi(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, final android.app.SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f2067a.h(list, list2, new SharedElementCallback.a() { // from class: bi0
                @Override // androidx.core.app.SharedElementCallback.a
                public final void a() {
                    a.b.a(onSharedElementsReadyListener);
                }
            });
        }
    }

    public static void A(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void B(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    public static void C(Activity activity) {
        C0023a.e(activity);
    }

    public static void q(Activity activity) {
        activity.finishAffinity();
    }

    public static void r(Activity activity) {
        C0023a.a(activity);
    }

    public static /* synthetic */ void s(Activity activity) {
        if (activity.isFinishing() || kn0.i(activity)) {
            return;
        }
        activity.recreate();
    }

    public static void t(Activity activity) {
        C0023a.b(activity);
    }

    public static void u(final Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: ai0
                @Override // java.lang.Runnable
                public final void run() {
                    a.s(activity);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void v(Activity activity, String[] strArr, @IntRange(from = 0) int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        if (activity instanceof f) {
            ((f) activity).validateRequestPermissionsRequestCode(i);
        }
        b.b(activity, strArr, i);
    }

    public static <T extends View> T w(Activity activity, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) c.a(activity, i);
        }
        T t = (T) activity.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void x(Activity activity, SharedElementCallback sharedElementCallback) {
        C0023a.c(activity, sharedElementCallback != null ? new g(sharedElementCallback) : null);
    }

    public static void y(Activity activity, SharedElementCallback sharedElementCallback) {
        C0023a.d(activity, sharedElementCallback != null ? new g(sharedElementCallback) : null);
    }

    public static boolean z(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i >= 32) {
            return e.a(activity, str);
        }
        return i == 31 ? d.b(activity, str) : b.c(activity, str);
    }
}
