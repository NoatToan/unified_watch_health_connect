package com.huami.thirdparty.support.statusbar;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;

/* JADX INFO: loaded from: classes14.dex */
public class SystemBarTintManager {
    private static final int d = -1728053248;
    private final SystemBarConfig a;
    private boolean b;
    private View c;

    public static class SystemBarConfig {
        private static final String b = "status_bar_height";
        private final int a;

        private SystemBarConfig(Activity activity) {
            this.a = a(activity.getResources(), b);
        }

        private int a(Resources resources, String str) {
            int identifier = resources.getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        public int getStatusBarHeight() {
            return this.a;
        }
    }

    @TargetApi(19)
    public SystemBarTintManager(Activity activity) {
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        if (Build.VERSION.SDK_INT >= 19) {
            TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(new int[]{R.attr.windowTranslucentStatus, R.attr.windowTranslucentNavigation});
            try {
                this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
                typedArrayObtainStyledAttributes.recycle();
                if ((window.getAttributes().flags & 67108864) != 0) {
                    this.b = true;
                }
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.a = new SystemBarConfig(activity);
        if (this.b) {
            f(activity, viewGroup);
        }
    }

    @TargetApi(11)
    private void a(float f) {
        if (!this.b || Build.VERSION.SDK_INT < 11) {
            return;
        }
        this.c.setAlpha(f);
    }

    private void c(Drawable drawable) {
        if (this.b) {
            this.c.setBackground(drawable);
        }
    }

    private void e(int i) {
        if (this.b) {
            this.c.setBackgroundResource(i);
        }
    }

    private void f(Context context, ViewGroup viewGroup) {
        this.c = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.a.getStatusBarHeight());
        layoutParams.gravity = 48;
        this.c.setLayoutParams(layoutParams);
        this.c.setBackgroundColor(-1728053248);
        this.c.setVisibility(8);
        viewGroup.addView(this.c);
    }

    public void b(@ColorInt int i) {
        if (this.b) {
            this.c.setBackgroundColor(i);
        }
    }

    public void d(boolean z) {
        if (this.b) {
            this.c.setVisibility(z ? 0 : 8);
        }
    }

    public SystemBarConfig getConfig() {
        return this.a;
    }

    public void setTintDrawable(Drawable drawable) {
        c(drawable);
    }
}
