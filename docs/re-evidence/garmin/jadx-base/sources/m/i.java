package m;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i implements Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Window.Callback f115486a;

    public static class a {
        private a() {
        }

        public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i14) {
            return callback.onWindowStartingActionMode(callback2, i14);
        }
    }

    public static class b {
        private b() {
        }

        public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i14) {
            callback.onProvideKeyboardShortcuts(list, menu, i14);
        }
    }

    public static class c {
        private c() {
        }

        public static void a(Window.Callback callback, boolean z14) {
            callback.onPointerCaptureChanged(z14);
        }
    }

    public i(Window.Callback callback) {
        if (callback != null) {
            this.f115486a = callback;
        } else {
            vb.h.s("Window callback may not be null");
            throw null;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f115486a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f115486a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f115486a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f115486a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f115486a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f115486a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f115486a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f115486a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f115486a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f115486a.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i14, Menu menu) {
        return this.f115486a.onCreatePanelMenu(i14, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i14) {
        return this.f115486a.onCreatePanelView(i14);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f115486a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i14, MenuItem menuItem) {
        return this.f115486a.onMenuItemSelected(i14, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i14, Menu menu) {
        return this.f115486a.onMenuOpened(i14, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i14, Menu menu) {
        this.f115486a.onPanelClosed(i14, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z14) {
        c.a(this.f115486a, z14);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i14, View view2, Menu menu) {
        return this.f115486a.onPreparePanel(i14, view2, menu);
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i14) {
        b.a(this.f115486a, list, menu, i14);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return a.a(this.f115486a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f115486a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z14) {
        this.f115486a.onWindowFocusChanged(z14);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f115486a.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f115486a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i14) {
        return a.b(this.f115486a, callback, i14);
    }
}
