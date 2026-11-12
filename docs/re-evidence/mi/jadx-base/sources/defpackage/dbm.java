package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class dbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile xam<?> f15345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile List<sam> f15346b;

    @RequiresApi(25)
    public static class a {
        public static String a(List<ShortcutInfo> list) {
            int rank = -1;
            String id = null;
            for (ShortcutInfo shortcutInfo : list) {
                if (shortcutInfo.getRank() > rank) {
                    id = shortcutInfo.getId();
                    rank = shortcutInfo.getRank();
                }
            }
            return id;
        }
    }

    @VisibleForTesting
    public static boolean a(Context context, wam wamVar) {
        Bitmap bitmapDecodeStream;
        IconCompat iconCompat = wamVar.h;
        if (iconCompat == null) {
            return false;
        }
        int i = iconCompat.f2073a;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream inputStreamQ = iconCompat.q(context);
        if (inputStreamQ == null || (bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamQ)) == null) {
            return false;
        }
        wamVar.h = i == 6 ? IconCompat.d(bitmapDecodeStream) : IconCompat.g(bitmapDecodeStream);
        return true;
    }

    public static int b(Context context) {
        g6i.g(context);
        return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
    }

    public static String c(List<wam> list) {
        int iC = -1;
        String strB = null;
        for (wam wamVar : list) {
            if (wamVar.c() > iC) {
                strB = wamVar.b();
                iC = wamVar.c();
            }
        }
        return strB;
    }

    public static List<sam> d(Context context) {
        Bundle bundle;
        String string;
        if (f15346b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((sam) Class.forName(string, false, dbm.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f15346b == null) {
                f15346b = arrayList;
            }
        }
        return f15346b;
    }

    public static xam<?> e(Context context) {
        if (f15345a == null) {
            try {
                f15345a = (xam) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, dbm.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f15345a == null) {
                f15345a = new xam.a();
            }
        }
        return f15345a;
    }

    public static boolean f(Context context, wam wamVar) {
        g6i.g(context);
        g6i.g(wamVar);
        int i = Build.VERSION.SDK_INT;
        if (i <= 32 && wamVar.d(1)) {
            Iterator<sam> it = d(context).iterator();
            while (it.hasNext()) {
                it.next().a(Collections.singletonList(wamVar));
            }
            return true;
        }
        int iB = b(context);
        if (iB == 0) {
            return false;
        }
        if (i <= 29) {
            a(context, wamVar);
        }
        if (i >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(wamVar.e());
        } else {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return false;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= iB) {
                shortcutManager.removeDynamicShortcuts(Arrays.asList(a.a(dynamicShortcuts)));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(wamVar.e()));
        }
        xam<?> xamVarE = e(context);
        try {
            List<wam> listB = xamVarE.b();
            if (listB.size() >= iB) {
                xamVarE.c(Arrays.asList(c(listB)));
            }
            xamVarE.a(Arrays.asList(wamVar));
            return true;
        } catch (Exception unused) {
            return false;
        } finally {
            Iterator<sam> it2 = d(context).iterator();
            while (it2.hasNext()) {
                it2.next().a(Collections.singletonList(wamVar));
            }
            g(context, wamVar.b());
        }
    }

    public static void g(Context context, String str) {
        g6i.g(context);
        g6i.g(str);
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        Iterator<sam> it = d(context).iterator();
        while (it.hasNext()) {
            it.next().b(Collections.singletonList(str));
        }
    }
}
