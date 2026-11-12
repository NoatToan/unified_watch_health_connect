package com.facebook.react.views.modal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.view.c;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes4.dex */
public class TranslucentModalHostView extends ReactModalHostView {

    public class a implements View.OnApplyWindowInsetsListener {
        @Override // android.view.View.OnApplyWindowInsetsListener
        @TargetApi(21)
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            return windowInsetsOnApplyWindowInsets.replaceSystemWindowInsets(windowInsetsOnApplyWindowInsets.getSystemWindowInsetLeft(), 0, windowInsetsOnApplyWindowInsets.getSystemWindowInsetRight(), windowInsetsOnApplyWindowInsets.getSystemWindowInsetBottom());
        }
    }

    public TranslucentModalHostView(Context context) {
        super(context);
    }

    public static void h(Window window, int i) {
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(i);
    }

    public static void i(Window window, boolean z) {
        window.getDecorView().setSystemUiVisibility(z ? 8192 : 0);
    }

    public static void j(Window window, boolean z) {
        View decorView = window.getDecorView();
        if (z) {
            decorView.setOnApplyWindowInsetsListener(new a());
        } else {
            decorView.setOnApplyWindowInsetsListener(null);
        }
        c.n0(decorView);
    }

    @Override // com.facebook.react.views.modal.ReactModalHostView
    public void d() {
        super.d();
        Dialog dialog = getDialog();
        if (dialog != null) {
            j(dialog.getWindow(), true);
            h(dialog.getWindow(), 0);
            i(dialog.getWindow(), g());
        }
    }

    @TargetApi(23)
    public final boolean g() {
        Activity currentActivity = ((ReactContext) getContext()).getCurrentActivity();
        return currentActivity == null || (currentActivity.getWindow().getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // com.facebook.react.views.modal.ReactModalHostView
    public void setAnimationType(String str) {
        super.setAnimationType(str);
    }

    @Override // com.facebook.react.views.modal.ReactModalHostView
    public void setHardwareAccelerated(boolean z) {
        super.setHardwareAccelerated(z);
    }

    @Override // com.facebook.react.views.modal.ReactModalHostView
    public void setOnRequestCloseListener(ReactModalHostView.c cVar) {
        super.setOnRequestCloseListener(cVar);
    }

    @Override // com.facebook.react.views.modal.ReactModalHostView
    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        super.setOnShowListener(onShowListener);
    }

    @Override // com.facebook.react.views.modal.ReactModalHostView
    public void setTransparent(boolean z) {
        super.setTransparent(z);
    }
}
