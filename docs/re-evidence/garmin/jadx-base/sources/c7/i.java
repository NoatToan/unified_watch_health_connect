package c7;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class i extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class<?> f25201b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Constructor<?> f25202c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f25203d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f25204e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f25205f = false;

    public static boolean h(boolean z14, String str, int i14, Object obj) throws NoSuchMethodException {
        i();
        try {
            return ((Boolean) f25203d.invoke(obj, str, Integer.valueOf(i14), Boolean.valueOf(z14))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e4) {
            o2.c.p(e4);
            return false;
        }
    }

    public static void i() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f25205f) {
            return;
        }
        f25205f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        f25202c = constructor;
        f25201b = cls;
        f25203d = method2;
        f25204e = method;
    }

    @Override // c7.n
    public Typeface a(Context context, b7.e.b bVar, Resources resources, int i14) throws NoSuchMethodException {
        InputStream inputStreamOpenRawResource;
        i();
        try {
            Object objNewInstance = f25202c.newInstance(null);
            for (b7.e.c cVar : bVar.f16242a) {
                File fileC = p.c(context);
                if (fileC == null) {
                    return null;
                }
                try {
                    try {
                        inputStreamOpenRawResource = resources.openRawResource(cVar.f16248f);
                        try {
                            boolean zB = p.b(inputStreamOpenRawResource, fileC);
                            p.a(inputStreamOpenRawResource);
                            if (!zB) {
                                fileC.delete();
                                return null;
                            }
                            if (!h(cVar.f16245c, fileC.getPath(), cVar.f16244b, objNewInstance)) {
                                fileC.delete();
                                return null;
                            }
                            fileC.delete();
                        } catch (Throwable th3) {
                            th = th3;
                            p.a(inputStreamOpenRawResource);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        inputStreamOpenRawResource = null;
                    }
                } catch (RuntimeException unused) {
                    fileC.delete();
                    return null;
                } catch (Throwable th5) {
                    fileC.delete();
                    throw th5;
                }
            }
            i();
            try {
                Object objNewInstance2 = Array.newInstance(f25201b, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f25204e.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e4) {
                o2.c.p(e4);
                return null;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e14) {
            o2.c.p(e14);
            return null;
        }
    }

    @Override // c7.n
    public Typeface b(Context context, i7.l[] lVarArr, int i14) {
        File file;
        if (lVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(g(i14, lVarArr).f91937a, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th3) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceD = d(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceD;
                    } catch (Throwable th5) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
