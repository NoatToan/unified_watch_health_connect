package com.huawei.ui.main.stories.me.views.privacy;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes43.dex */
public class SystemBarHelper {

    interface OnDecorViewInstalledListener {
        void onDecorViewInstalled(View view);
    }

    public static void b(Window window) {
        if (window == null) {
            LogUtil.j("SystemBarHelper", "hideSystemBars window is null");
            return;
        }
        d(window, 5634);
        b(window, 5634);
        window.setNavigationBarColor(0);
        window.setStatusBarColor(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(View view, int i) {
        view.setSystemUiVisibility(i | view.getSystemUiVisibility());
    }

    private static void d(Window window, int i) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.systemUiVisibility = i | attributes.systemUiVisibility;
        window.setAttributes(attributes);
    }

    private static void b(Window window, final int i) {
        d(window, new OnDecorViewInstalledListener() { // from class: com.huawei.ui.main.stories.me.views.privacy.SystemBarHelper.2
            @Override // com.huawei.ui.main.stories.me.views.privacy.SystemBarHelper.OnDecorViewInstalledListener
            public void onDecorViewInstalled(View view) {
                SystemBarHelper.a(view, i);
            }
        });
    }

    private static void d(Window window, OnDecorViewInstalledListener onDecorViewInstalledListener) {
        new a().c(window, onDecorViewInstalledListener, 3);
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private OnDecorViewInstalledListener f28584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f28585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f28586c;
        private int d;
        private Window e;

        private a() {
            this.f28586c = new Handler();
            this.f28585b = new Runnable() { // from class: com.huawei.ui.main.stories.me.views.privacy.SystemBarHelper.a.3
                @Override // java.lang.Runnable
                public void run() {
                    View viewPeekDecorView = a.this.e.peekDecorView();
                    if (viewPeekDecorView != null) {
                        a.this.f28584a.onDecorViewInstalled(viewPeekDecorView);
                        return;
                    }
                    a.d(a.this);
                    if (a.this.d >= 0) {
                        a.this.f28586c.post(a.this.f28585b);
                    } else {
                        LogUtil.j("SystemBarHelper", "DecorViewFinder cannot get decor view of mWindow: ", a.this.e);
                    }
                }
            };
        }

        static /* synthetic */ int d(a aVar) {
            int i = aVar.d;
            aVar.d = i - 1;
            return i;
        }

        public void c(Window window, OnDecorViewInstalledListener onDecorViewInstalledListener, int i) {
            this.e = window;
            this.d = i;
            this.f28584a = onDecorViewInstalledListener;
            this.f28585b.run();
        }
    }
}
