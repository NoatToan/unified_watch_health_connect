package defpackage;

import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class m4i {

    @RequiresApi(23)
    public static class a {
        public static boolean a(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        public static int b(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        public static void c(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        public static void d(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    public static void a(PopupWindow popupWindow, boolean z) {
        a.c(popupWindow, z);
    }

    public static void b(PopupWindow popupWindow, int i) {
        a.d(popupWindow, i);
    }

    public static void c(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }
}
