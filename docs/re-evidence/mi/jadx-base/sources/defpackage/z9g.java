package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public final class z9g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<File> f41048a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f41049b = n(System.getProperty("java.vm.version"));

    public static final class a {
        public static void a(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException, IllegalArgumentException, InvocationTargetException {
            IOException[] iOExceptionArr;
            Object obj = z9g.g(classLoader, "pathList").get(classLoader);
            ArrayList<IOException> arrayList = new ArrayList();
            z9g.f(obj, "dexElements", b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                for (IOException iOException : arrayList) {
                }
                Field fieldG = z9g.g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) fieldG.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                fieldG.set(obj, iOExceptionArr);
                IOException iOException2 = new IOException("I/O exception during makeDexElement");
                iOException2.initCause((Throwable) arrayList.get(0));
                throw iOException2;
            }
        }

        public static Object[] b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return (Object[]) z9g.h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    public static void d(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing old secondary dex dir (");
            sb.append(file.getPath());
            sb.append(").");
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to list secondary dex dir content (");
                sb2.append(file.getPath());
                sb2.append(").");
                return;
            }
            for (File file2 : fileArrListFiles) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Trying to delete old file ");
                sb3.append(file2.getPath());
                sb3.append(" of size ");
                sb3.append(file2.length());
                if (file2.delete()) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Deleted old file ");
                    sb4.append(file2.getPath());
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Failed to delete old file ");
                    sb5.append(file2.getPath());
                }
            }
            if (file.delete()) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Deleted old secondary dex dir ");
                sb6.append(file.getPath());
            } else {
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Failed to delete secondary dex dir ");
                sb7.append(file.getPath());
            }
        }
    }

    public static void e(Context context, File file, File file2, String str, String str2, boolean z) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Set<File> set = f41048a;
        synchronized (set) {
            try {
                if (set.contains(file)) {
                    return;
                }
                set.add(file);
                int i = Build.VERSION.SDK_INT;
                StringBuilder sb = new StringBuilder();
                sb.append("MultiDex is not guaranteed to work in SDK version ");
                sb.append(i);
                sb.append(": SDK version higher than ");
                sb.append(20);
                sb.append(" should be backed by ");
                sb.append("runtime with built-in multidex capabilty but it's not the ");
                sb.append("case here: java.vm.version=\"");
                sb.append(System.getProperty("java.vm.version"));
                sb.append("\"");
                ClassLoader classLoaderJ = j(context);
                if (classLoaderJ == null) {
                    return;
                }
                try {
                    d(context);
                } catch (Throwable unused) {
                }
                File fileK = k(context, file2, str);
                aag aagVar = new aag(file, fileK);
                try {
                    try {
                        m(classLoaderJ, fileK, aagVar.o(context, str2, false));
                    } catch (IOException e) {
                        if (!z) {
                            throw e;
                        }
                        m(classLoaderJ, fileK, aagVar.o(context, str2, true));
                    }
                    try {
                        aagVar.close();
                        e = null;
                    } catch (IOException e2) {
                        e = e2;
                    }
                    if (e != null) {
                        throw e;
                    }
                } catch (Throwable th) {
                    try {
                        aagVar.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void f(Object obj, String str, Object[] objArr) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        Field fieldG = g(obj, str);
        Object[] objArr2 = (Object[]) fieldG.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        fieldG.set(obj, objArr3);
    }

    public static Field g(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    public static Method h(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException("Method " + str + " with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
    }

    public static ApplicationInfo i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static ClassLoader j(Context context) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                return classLoader;
            }
            return null;
        } catch (RuntimeException unused) {
        }
    }

    public static File k(Context context, File file, String str) throws IOException {
        File file2 = new File(file, "code_cache");
        try {
            o(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), "code_cache");
            o(file2);
        }
        File file3 = new File(file2, str);
        o(file3);
        return file3;
    }

    public static void l(Context context) {
        if (f41049b) {
            return;
        }
        try {
            ApplicationInfo applicationInfoI = i(context);
            if (applicationInfoI == null) {
                return;
            }
            e(context, new File(applicationInfoI.sourceDir), new File(applicationInfoI.dataDir), "secondary-dexes", "", true);
        } catch (Exception e) {
            throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
        }
    }

    public static void m(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InstantiationException, IOException, SecurityException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (list.isEmpty()) {
            return;
        }
        a.a(classLoader, list, file);
    }

    public static boolean n(String str) {
        boolean z = false;
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            String strNextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String strNextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (strNextToken != null && strNextToken2 != null) {
                try {
                    int i = Integer.parseInt(strNextToken);
                    int i2 = Integer.parseInt(strNextToken2);
                    if (i > 2 || (i == 2 && i2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("VM with version ");
        sb.append(str);
        sb.append(z ? " has multidex support" : " does not have multidex support");
        return z;
    }

    public static void o(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to create dir ");
            sb.append(file.getPath());
            sb.append(". Parent file is null.");
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to create dir ");
            sb2.append(file.getPath());
            sb2.append(". parent file is a dir ");
            sb2.append(parentFile.isDirectory());
            sb2.append(", a file ");
            sb2.append(parentFile.isFile());
            sb2.append(", exists ");
            sb2.append(parentFile.exists());
            sb2.append(", readable ");
            sb2.append(parentFile.canRead());
            sb2.append(", writable ");
            sb2.append(parentFile.canWrite());
        }
        throw new IOException("Failed to create directory " + file.getPath());
    }
}
