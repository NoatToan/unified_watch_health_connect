package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class x3f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38644a;

    public x3f(Context context) {
        this.f38644a = context;
    }

    public static b0b c(String str) {
        Object objNewInstance;
        try {
            Class<?> cls = Class.forName(str);
            try {
                objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                d(cls, e);
                objNewInstance = null;
            } catch (InstantiationException e2) {
                d(cls, e2);
                objNewInstance = null;
            } catch (NoSuchMethodException e3) {
                d(cls, e3);
                objNewInstance = null;
            } catch (InvocationTargetException e4) {
                d(cls, e4);
                objNewInstance = null;
            }
            if (objNewInstance instanceof b0b) {
                return (b0b) objNewInstance;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void d(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public final ApplicationInfo a() throws PackageManager.NameNotFoundException {
        return this.f38644a.getPackageManager().getApplicationInfo(this.f38644a.getPackageName(), 128);
    }

    public List<b0b> b() {
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfoA = a();
            if (applicationInfoA != null && applicationInfoA.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Got app info metadata: ");
                    sb.append(applicationInfoA.metaData);
                }
                for (String str : applicationInfoA.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfoA.metaData.get(str))) {
                        arrayList.add(c(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Loaded Glide module: ");
                            sb2.append(str);
                        }
                    }
                }
                Log.isLoggable("ManifestParser", 3);
                return arrayList;
            }
            Log.isLoggable("ManifestParser", 3);
            return arrayList;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable("ManifestParser", 6);
        }
    }
}
