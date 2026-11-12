package defpackage;

import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface ebm {
    /* JADX WARN: Multi-variable type inference failed */
    static boolean b(FragmentManager fragmentManager, int i, KeyEvent keyEvent) {
        for (Fragment fragment : fragmentManager.y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onKeyLongPress(i, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean f(FragmentManager fragmentManager, KeyEvent keyEvent) {
        for (Fragment fragment : fragmentManager.y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onKeyShortcutEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void g(FragmentManager fragmentManager, List<KeyboardShortcutGroup> list, Menu menu, int i) {
        for (Fragment fragment : fragmentManager.y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm)) {
                ((ebm) fragment).onProvideKeyboardShortcuts(list, menu, i);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean h(FragmentManager fragmentManager, MotionEvent motionEvent) {
        for (Fragment fragment : fragmentManager.y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onGenericMotionEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean j(FragmentManager fragmentManager, KeyEvent keyEvent) {
        for (Fragment fragment : fragmentManager.y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean k(FragmentManager fragmentManager, MotionEvent motionEvent) {
        for (Fragment fragment : fragmentManager.y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onTrackballEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean l(FragmentManager fragmentManager, int i, KeyEvent keyEvent) {
        for (Fragment fragment : fragmentManager.y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean n(FragmentManager fragmentManager, int i, int i2, KeyEvent keyEvent) {
        for (Fragment fragment : fragmentManager.y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onKeyMultiple(i, i2, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean o(FragmentManager fragmentManager, MotionEvent motionEvent) {
        for (Fragment fragment : fragmentManager.y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean r(FragmentManager fragmentManager, int i, KeyEvent keyEvent) {
        for (Fragment fragment : fragmentManager.y0()) {
            if (fragment.isAdded() && !fragment.isHidden() && fragment.isResumed() && (fragment instanceof ebm) && ((ebm) fragment).onKeyUp(i, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    default boolean onGenericMotionEvent(MotionEvent motionEvent) {
        return false;
    }

    default boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyEvent(KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyShortcutEvent(KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    default void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
    }

    default boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    default boolean onTrackballEvent(MotionEvent motionEvent) {
        return false;
    }
}
