package defpackage;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.huawei.hwidauth.ui.WebViewActivity;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes.dex */
public class qje {
    public static void a(Application application) {
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: qje.2
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostCreated(Activity activity, Bundle bundle) {
                qje.d(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Activity activity) {
        LogUtil.b("WindowInsetUtils", "applyWindowInset activity:", activity);
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
        if (viewGroup.getChildAt(0) == null) {
            LogUtil.b("WindowInsetUtils", "applyWindowInset no set contentView activity:", activity);
            return;
        }
        boolean zX = qrs.x(activity);
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(activity.getWindow(), activity.getWindow().getDecorView());
        if (a(activity)) {
            insetsController.setAppearanceLightStatusBars(!zX);
        }
        insetsController.setAppearanceLightNavigationBars(!zX);
        if (a(viewGroup)) {
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener(viewGroup, new AnonymousClass3(activity, viewGroup));
    }

    /* JADX INFO: renamed from: qje$3, reason: invalid class name */
    class AnonymousClass3 implements OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Boolean f46308c;
        final /* synthetic */ Activity d;
        final /* synthetic */ ViewGroup e;

        AnonymousClass3(Activity activity, ViewGroup viewGroup) {
            this.d = activity;
            this.e = viewGroup;
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            final Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
            LogUtil.b("WindowInsetUtils", "onApplyWindowInsets activity:", this.d, " insets:", insets);
            Boolean bool = this.f46308c;
            if (bool != null) {
                if (!bool.booleanValue()) {
                    a(insets);
                }
                return windowInsetsCompat;
            }
            final ViewGroup viewGroup = this.e;
            viewGroup.post(new Runnable() { // from class: qjc
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(insets, viewGroup);
                }
            });
            return windowInsetsCompat;
        }

        /* synthetic */ void d(Insets insets, ViewGroup viewGroup) {
            if (this.f46308c == null && (insets.bottom != 0 || insets.right != 0)) {
                this.f46308c = Boolean.valueOf(qje.a(viewGroup));
            }
            Boolean bool = this.f46308c;
            if (bool == null || bool.booleanValue()) {
                return;
            }
            a(insets);
        }

        private void a(Insets insets) {
            if (2 == this.e.getResources().getConfiguration().orientation) {
                this.e.setPadding(0, 0, insets.right, 0);
            } else {
                this.e.setPadding(0, 0, 0, insets.bottom);
            }
        }
    }

    private static boolean a(Activity activity) {
        return !(activity instanceof WebViewActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a(ViewGroup viewGroup) {
        Configuration configuration = viewGroup.getResources().getConfiguration();
        View childAt = viewGroup.getChildAt(0);
        if (2 == configuration.orientation) {
            if (viewGroup.getPaddingRight() != 0) {
                return true;
            }
            if (childAt != null && childAt.getPaddingRight() != 0) {
                return true;
            }
        } else {
            if (viewGroup.getPaddingBottom() != 0) {
                return true;
            }
            if (childAt != null && childAt.getPaddingBottom() != 0) {
                return true;
            }
        }
        return false;
    }
}
