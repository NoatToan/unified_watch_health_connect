package defpackage;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.miui.tsmclient.util.ResUtils;

/* JADX INFO: loaded from: classes9.dex */
public class w8q {
    public static void a(FragmentActivity fragmentActivity, int i, Fragment fragment, boolean z, boolean z2, boolean z3) {
        if (fragmentActivity == null) {
            return;
        }
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        if (z) {
            supportFragmentManager.g1();
        }
        k kVarO = supportFragmentManager.o();
        if (z3) {
            kVarO.A(ResUtils.getAnimatorIdentifier(fragmentActivity, "fragment_slide_left_enter"), ResUtils.getAnimatorIdentifier(fragmentActivity, "fragment_slide_left_exit"), ResUtils.getAnimatorIdentifier(fragmentActivity, "fragment_slide_right_enter"), ResUtils.getAnimatorIdentifier(fragmentActivity, "fragment_slide_right_exit"));
        }
        kVarO.x(i, fragment, fragment.getClass().getName());
        if (z2) {
            kVarO.j(null);
        }
        kVarO.m();
    }

    public static void b(FragmentActivity fragmentActivity, Fragment fragment, boolean z) {
        c(fragmentActivity, fragment, false, false, z);
    }

    public static void c(FragmentActivity fragmentActivity, Fragment fragment, boolean z, boolean z2, boolean z3) {
        a(fragmentActivity, R.id.content, fragment, z, z2, z3);
    }

    public static void d(Context context, View view, boolean z) {
        if (view == null) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (z) {
            inputMethodManager.showSoftInput(view, 1);
        } else {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
