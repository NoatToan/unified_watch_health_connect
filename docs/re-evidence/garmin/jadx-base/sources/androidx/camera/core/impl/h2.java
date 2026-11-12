package androidx.camera.core.impl;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class h2 implements p.a<Context, f2> {

    public static class a extends Service {
        private a() {
        }

        @Override // android.app.Service
        public final IBinder onBind(Intent intent) {
            throw new UnsupportedOperationException();
        }
    }

    public static f2 a(Context context, Bundle bundle) {
        boolean z14 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrB = b(context, "androidx.camera.core.quirks.FORCE_ENABLED", bundle);
        String[] strArrB2 = b(context, "androidx.camera.core.quirks.FORCE_DISABLED", bundle);
        Arrays.toString(strArrB);
        Arrays.toString(strArrB2);
        f2.b bVar = new f2.b();
        bVar.f5552a = z14;
        bVar.f5553b = new HashSet(c(strArrB));
        HashSet hashSet = new HashSet(c(strArrB2));
        bVar.f5554c = hashSet;
        return new f2(bVar.f5552a, bVar.f5553b, hashSet);
    }

    public static String[] b(Context context, String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i14 = bundle.getInt(str, -1);
        if (i14 == -1) {
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i14);
        } catch (Resources.NotFoundException unused) {
            return new String[0];
        }
    }

    public static HashSet c(String[] strArr) {
        Class<?> cls;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
                if (!e2.class.isAssignableFrom(cls)) {
                    cls = null;
                }
            } catch (ClassNotFoundException unused) {
            }
            if (cls != null) {
                hashSet.add(cls);
            }
        }
        return hashSet;
    }

    @Override // p.a, u03.f
    /* JADX INFO: renamed from: apply */
    public final Object mo330apply(Object obj) {
        Context context = (Context) obj;
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) a.class), 640).metaData;
            if (bundle == null) {
                return null;
            }
            return a(context, bundle);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
