package com.huawei.phoneservice.faq.base.util;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes13.dex */
public class FaqHwFrameworkUtil {

    public interface b {
        void a(int i);
    }

    class d implements View.OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f21578a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f21579c;

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            try {
                Class<?> cls = Class.forName("com.huawei.android.view.WindowManagerEx$LayoutParamsEx");
                Class<?> cls2 = Class.forName("com.huawei.android.view.DisplaySideRegionEx");
                Object objD = FaqRefectUtils.d(cls, this.f21578a.getWindow().getAttributes());
                if (objD != null) {
                    Object objInvoke = cls.getMethod("getDisplaySideRegion", WindowInsets.class).invoke(objD, windowInsets);
                    if (objInvoke == null) {
                        this.f21579c.a(1);
                    } else {
                        Rect rect = (Rect) cls2.getMethod("getSafeInsets", new Class[0]).invoke(objInvoke, new Object[0]);
                        if (rect.left > 0 && rect.right > 0) {
                            this.f21579c.a(3);
                        } else if (rect.top > 0) {
                            this.f21579c.a(2);
                        }
                    }
                }
            } catch (Throwable unused) {
                this.f21579c.a(1);
                g.c("setForRing", "Exception");
            }
            return view.onApplyWindowInsets(windowInsets);
        }

        d(Activity activity, b bVar) {
            this.f21578a = activity;
            this.f21579c = bVar;
        }
    }

    public static void b(Activity activity, int i) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            FaqRefectUtils.a("com.huawei.android.view.WindowManagerEx$LayoutParamsEx", "setDisplaySideMode", activity.getWindow().getAttributes(), new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(i)});
            g.c("FaqHwFrameworkUtil", "setDisplaySideMode,time:%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Throwable th) {
            g.a("FaqHwFrameworkUtil", th, "setDisplaySideMode error", new Object[0]);
        }
    }

    public static void a(Activity activity, b bVar) {
        activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new d(activity, bVar));
    }
}
