package com.xiaomi.fitness.nfc.widget;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import com.xiaomi.fitness.common.utils.DisplayUtil;

/* JADX INFO: loaded from: classes9.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f12694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f12695b;
    public boolean c = false;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f12696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Rect f12697b = new Rect();
        public final /* synthetic */ b c;

        public a(b bVar) {
            this.c = bVar;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            c.this.f12694a.getWindowVisibleDisplayFrame(this.f12697b);
            boolean z = c.this.f12694a.getRootView().getHeight() - this.f12697b.height() > DisplayUtil.dip2px(300.0f);
            if (z == this.f12696a) {
                return;
            }
            this.f12696a = z;
            b bVar = this.c;
            if (bVar != null) {
                bVar.onKeyboardVisibilityChanged(z);
            }
        }
    }

    public interface b {
        void onKeyboardVisibilityChanged(boolean z);
    }

    public c(View view) {
        this.f12694a = ((Activity) view.getContext()).getWindow().findViewById(R.id.content);
    }

    public final /* synthetic */ WindowInsets c(b bVar, View view, WindowInsets windowInsets) {
        boolean z = windowInsets.getInsets(WindowInsetsCompat.m.h()).bottom > 0;
        if (z != this.c) {
            this.c = z;
            if (bVar != null) {
                bVar.onKeyboardVisibilityChanged(z);
            }
        }
        return windowInsets;
    }

    public final void d() {
        View view = this.f12694a;
        if (view == null || this.f12695b == null) {
            return;
        }
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f12695b);
        this.f12695b = null;
    }

    public final void e(final b bVar) {
        if (this.f12694a == null) {
            return;
        }
        if (this.f12695b != null) {
            d();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.f12694a.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: y0e
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return this.f39646a.c(bVar, view, windowInsets);
                }
            });
        } else {
            this.f12695b = new a(bVar);
            this.f12694a.getViewTreeObserver().addOnGlobalLayoutListener(this.f12695b);
        }
    }
}
