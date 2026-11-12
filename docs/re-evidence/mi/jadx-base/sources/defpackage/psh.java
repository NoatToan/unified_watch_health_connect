package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.permissionx.guolindev.PermissionMediator;

/* JADX INFO: loaded from: classes6.dex */
public class psh {
    public static PermissionMediator a(Fragment fragment) {
        return new PermissionMediator(fragment);
    }

    public static PermissionMediator b(FragmentActivity fragmentActivity) {
        return new PermissionMediator(fragmentActivity);
    }

    public static boolean c(Context context, String str) {
        return ni4.a(context, str) == 0;
    }
}
