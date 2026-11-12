package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.View;
import com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes20.dex */
public class xdx {
    public static void c(Context context, HwBottomNavigationView hwBottomNavigationView) {
        if (context == null || hwBottomNavigationView == null) {
            return;
        }
        Method methodC = xeh.c("getBoolean", new Class[]{Context.class, View.class, String.class, Boolean.TYPE}, "huawei.android.widget.HwPlume");
        if (methodC == null) {
            hwBottomNavigationView.setExtendedNextTabEnabled(true, true);
            hwBottomNavigationView.setExtendedNextTabEnabled(false, true);
            return;
        }
        Boolean bool = Boolean.TRUE;
        Object objC = xeh.c((Object) null, methodC, new Object[]{context, hwBottomNavigationView, "switchTabEnabled", bool});
        if (objC instanceof Boolean) {
            hwBottomNavigationView.setExtendedNextTabEnabled(true, ((Boolean) objC).booleanValue());
        } else {
            hwBottomNavigationView.setExtendedNextTabEnabled(true, true);
        }
        Object objC2 = xeh.c((Object) null, methodC, new Object[]{context, hwBottomNavigationView, "switchTabWhenFocusedEnabled", bool});
        if (objC2 instanceof Boolean) {
            hwBottomNavigationView.setExtendedNextTabEnabled(false, ((Boolean) objC2).booleanValue());
        } else {
            hwBottomNavigationView.setExtendedNextTabEnabled(false, true);
        }
    }

    public static void c(HwBottomNavigationView.BottomNavigationItemView bottomNavigationItemView, boolean z, boolean z2, HwBottomNavigationView.BottomNavListener bottomNavListener, Menu menu) {
        if (bottomNavigationItemView == null || menu == null) {
            return;
        }
        int itemIndex = bottomNavigationItemView.getItemIndex();
        boolean isChecked = bottomNavigationItemView.getIsChecked();
        if (z) {
            if (isChecked) {
                bottomNavigationItemView.setChecked(false, false);
                if (bottomNavListener != null) {
                    bottomNavListener.onBottomNavItemUnselected(menu.getItem(itemIndex), itemIndex);
                    return;
                }
                return;
            }
            bottomNavigationItemView.setChecked(true, false);
            if (bottomNavListener != null) {
                bottomNavListener.onBottomNavItemSelected(menu.getItem(itemIndex), itemIndex);
                return;
            }
            return;
        }
        if (z2) {
            bottomNavigationItemView.setChecked(true, false);
            if (isChecked || bottomNavListener == null) {
                return;
            }
            bottomNavListener.onBottomNavItemSelected(menu.getItem(itemIndex), itemIndex);
            return;
        }
        bottomNavigationItemView.setChecked(false, false);
        if (!isChecked || bottomNavListener == null) {
            return;
        }
        bottomNavListener.onBottomNavItemUnselected(menu.getItem(itemIndex), itemIndex);
    }
}
