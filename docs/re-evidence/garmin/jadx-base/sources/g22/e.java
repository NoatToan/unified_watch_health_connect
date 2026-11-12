package g22;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.view.View;
import android.widget.Toast;
import androidx.core.view.s;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.b0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.s2;
import com.garmin.android.apps.connectmobile.z1;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75560a;

        static {
            int[] iArr = new int[com.garmin.android.library.backgroundtaskmanagement.b.c.values().length];
            try {
                iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.SERVER_UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f75560a = iArr;
        }
    }

    public static final void a(Fragment fragment, fw.c cVar) {
        fragment.getClass();
        Context context = fragment.getContext();
        if (context == null || cVar == null || (cVar instanceof fw.h) || (cVar instanceof fw.o)) {
            return;
        }
        Toast.makeText(context, R.string.txt_error_occurred, 0).show();
    }

    public static final void b(Fragment fragment, lj0.b bVar) {
        fragment.getClass();
        bVar.getClass();
        Context context = fragment.getContext();
        if (context == null || bVar == lj0.b.f112951e) {
            return;
        }
        Toast.makeText(context, R.string.txt_error_occurred, 0).show();
    }

    public static /* synthetic */ void c(Fragment fragment) {
        lj0.b bVar = lj0.b.f112956j;
        bVar.getClass();
        b(fragment, bVar);
    }

    public static final void d(Fragment fragment, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        int i14;
        fragment.getClass();
        cVar.getClass();
        Context context = fragment.getContext();
        if (context == null || (i14 = a.f75560a[cVar.ordinal()]) == 1 || i14 == 2 || i14 == 3) {
            return;
        }
        Toast.makeText(context, R.string.txt_error_occurred, 0).show();
    }

    public static final boolean e(Fragment fragment) {
        fragment.getClass();
        if (fragment.getActivity() == null) {
            return false;
        }
        Object systemService = fragment.requireActivity().getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static final void f(Fragment fragment) {
        fragment.getClass();
        a7.e activity = fragment.getActivity();
        s2 s2Var = activity instanceof s2 ? (s2) activity : null;
        if (s2Var != null) {
            s2Var.hideProgressOverlay();
        }
    }

    public static final void g(Fragment fragment, String str) {
        fragment.getClass();
        str.getClass();
        androidx.fragment.app.m activity = fragment.getActivity();
        z1 z1Var = activity instanceof z1 ? (z1) activity : null;
        if (z1Var != null) {
            z1Var.initActionBar(true, str);
        }
    }

    public static final boolean h(Fragment fragment) {
        int i14;
        View rootView = fragment.requireActivity().getWindow().getDecorView().getRootView();
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        float f14 = fragment.getResources().getDisplayMetrics().density;
        Set<ne.a> set = ne.a.f125417f;
        float f15 = height / f14;
        set.getClass();
        int i15 = (int) (width / f14);
        int i16 = (int) f15;
        Set<ne.a> set2 = set;
        Iterator<T> it = set2.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            int i18 = ((ne.a) it.next()).f125419a;
            if (i18 <= i15 && i18 > i17) {
                i17 = i18;
            }
        }
        ne.a aVar = new ne.a(0, 0);
        for (ne.a aVar2 : set2) {
            if (aVar2.f125419a == i17 && (i14 = aVar2.f125420b) <= i16 && aVar.f125420b <= i14) {
                aVar = aVar2;
            }
        }
        return aVar.f125419a >= 600;
    }

    public static final void i(Fragment fragment, Uri uri) {
        fragment.getClass();
        uri.getClass();
        try {
            fragment.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException e4) {
            a2 a2Var = a2.GENERAL;
            String strJ = am.j.j(uri, "openExternalUrl ");
            i2.f36769a.getClass();
            i2.a.g(a2Var, strJ, e4);
            a(fragment, null);
        }
    }

    public static final void j(Fragment fragment, s sVar) {
        fragment.getClass();
        k(fragment, sVar, b0.b.RESUMED);
    }

    public static final void k(Fragment fragment, s sVar, b0.b bVar) {
        fragment.getClass();
        bVar.getClass();
        androidx.fragment.app.m mVarRequireActivity = fragment.requireActivity();
        mVarRequireActivity.getClass();
        mVarRequireActivity.addMenuProvider(sVar, fragment.getViewLifecycleOwner(), bVar);
    }

    public static final void l(Fragment fragment) {
        fragment.getClass();
        a7.e activity = fragment.getActivity();
        s2 s2Var = activity instanceof s2 ? (s2) activity : null;
        if (s2Var != null) {
            s2Var.showProgressOverlay();
        }
    }
}
