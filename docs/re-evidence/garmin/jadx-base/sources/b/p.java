package b;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.k1;
import androidx.core.view.o1;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lb/p;", "Lb/o;", "<init>", "()V", "Lb/x;", "statusBarStyle", "navigationBarStyle", "Landroid/view/Window;", "window", "Landroid/view/View;", "view", "", "statusBarIsDark", "navigationBarIsDark", "", "b", "(Lb/x;Lb/x;Landroid/view/Window;Landroid/view/View;ZZ)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p extends o {
    @Override // b.n, b.k, b.q
    public void b(x statusBarStyle, x navigationBarStyle, Window window, View view2, boolean statusBarIsDark, boolean navigationBarIsDark) {
        statusBarStyle.getClass();
        navigationBarStyle.getClass();
        window.getClass();
        view2.getClass();
        k1.a(window, false);
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((attributes.flags & 256) != 0 || attributes.width != -2 || attributes.height != -2) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            int iA = statusBarStyle.a(statusBarIsDark);
            int iA2 = navigationBarStyle.a(navigationBarIsDark);
            ViewGroup viewGroup = (ViewGroup) view2;
            viewGroup.addView(new n7.e(viewGroup.getContext(), (List<n7.b>) p13.x.k(new n7.a(2, iA), new n7.a(1, iA2), new n7.a(4, iA2), new n7.a(8, iA2))));
        }
        window.setNavigationBarContrastEnforced(navigationBarStyle.f13836c == 0);
        o1 o1Var = new o1(window, view2);
        o1Var.b(!statusBarIsDark);
        o1Var.a(!navigationBarIsDark);
    }
}
