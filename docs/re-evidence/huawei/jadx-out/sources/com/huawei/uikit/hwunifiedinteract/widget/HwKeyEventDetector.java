package com.huawei.uikit.hwunifiedinteract.widget;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View$OnUnhandledKeyEventListener;

/* JADX INFO: loaded from: classes20.dex */
public class HwKeyEventDetector {
    private View d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OnEditEventListener f29798b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnSearchEventListener f29797a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnNextTabEventListener f29799c = null;
    private OnGlobalNextTabEventListener e = null;
    private View$OnUnhandledKeyEventListener i = null;

    public interface OnEditEventListener {
        boolean onCopy(int i, KeyEvent keyEvent);

        boolean onCut(int i, KeyEvent keyEvent);

        boolean onDelete(int i, KeyEvent keyEvent);

        boolean onPaste(int i, KeyEvent keyEvent);

        boolean onSelectAll(int i, KeyEvent keyEvent);

        boolean onUndo(int i, KeyEvent keyEvent);
    }

    public interface OnGlobalNextTabEventListener {
        boolean onGlobalNextTab(int i, KeyEvent keyEvent);
    }

    public interface OnNextTabEventListener {
        boolean onNextTab(int i, KeyEvent keyEvent);
    }

    public interface OnSearchEventListener {
        boolean onSearch(int i, KeyEvent keyEvent);
    }

    class b implements View$OnUnhandledKeyEventListener {
        b() {
        }

        public boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent) {
            return HwKeyEventDetector.this.e(view, keyEvent);
        }
    }

    public HwKeyEventDetector(Context context) {
    }

    private boolean c(int i, int i2, KeyEvent keyEvent) {
        OnEditEventListener onEditEventListener;
        if (i != 112 || (onEditEventListener = this.f29798b) == null) {
            return false;
        }
        return onEditEventListener.onDelete(i2, keyEvent);
    }

    public OnSearchEventListener a() {
        return this.f29797a;
    }

    public void a(OnSearchEventListener onSearchEventListener) {
        this.f29797a = onSearchEventListener;
    }

    public void b() {
        b(false);
    }

    public OnEditEventListener c() {
        return this.f29798b;
    }

    public void c(View view, OnGlobalNextTabEventListener onGlobalNextTabEventListener) {
        this.d = view;
        this.e = onGlobalNextTabEventListener;
        b(onGlobalNextTabEventListener != null);
    }

    public void c(OnNextTabEventListener onNextTabEventListener) {
        this.f29799c = onNextTabEventListener;
    }

    public void e(OnEditEventListener onEditEventListener) {
        this.f29798b = onEditEventListener;
    }

    public boolean e(int i, KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (!keyEvent.isCtrlPressed()) {
            return c(i, action, keyEvent);
        }
        if (d(i, action, keyEvent)) {
            return true;
        }
        OnNextTabEventListener onNextTabEventListener = this.f29799c;
        if (onNextTabEventListener != null && i == 61 && onNextTabEventListener.onNextTab(action, keyEvent)) {
            return true;
        }
        OnSearchEventListener onSearchEventListener = this.f29797a;
        return onSearchEventListener != null && i == 34 && onSearchEventListener.onSearch(action, keyEvent);
    }

    private void b(boolean z) {
        if (Build.VERSION.SDK_INT < 28) {
            Log.w("HwKeyEventDetector", "unhandledKeyEventListenerProc: need minimum sdk version 28.");
            return;
        }
        View view = this.d;
        if (view == null) {
            return;
        }
        if (z) {
            if (this.i == null) {
                b bVar = new b();
                this.i = bVar;
                this.d.addOnUnhandledKeyEventListener(bVar);
                return;
            }
            return;
        }
        View$OnUnhandledKeyEventListener view$OnUnhandledKeyEventListener = this.i;
        if (view$OnUnhandledKeyEventListener != null) {
            view.removeOnUnhandledKeyEventListener(view$OnUnhandledKeyEventListener);
            this.i = null;
        }
    }

    private boolean d(int i, int i2, KeyEvent keyEvent) {
        OnEditEventListener onEditEventListener = this.f29798b;
        if (onEditEventListener == null) {
            return false;
        }
        if (i != 29) {
            if (i != 31) {
                if (i != 50) {
                    if (i != 52) {
                        if (i == 54 && onEditEventListener.onUndo(i2, keyEvent)) {
                            return true;
                        }
                    } else if (onEditEventListener.onCut(i2, keyEvent)) {
                        return true;
                    }
                } else if (onEditEventListener.onPaste(i2, keyEvent)) {
                    return true;
                }
            } else if (onEditEventListener.onCopy(i2, keyEvent)) {
                return true;
            }
        } else if (onEditEventListener.onSelectAll(i2, keyEvent)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(View view, KeyEvent keyEvent) {
        return this.e != null && keyEvent.getKeyCode() == 61 && keyEvent.isCtrlPressed() && this.e.onGlobalNextTab(keyEvent.getAction(), keyEvent);
    }
}
