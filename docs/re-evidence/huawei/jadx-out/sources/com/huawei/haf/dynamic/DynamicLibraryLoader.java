package com.huawei.haf.dynamic;

import android.os.Build;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class DynamicLibraryLoader {
    private DynamicLibraryLoader() {
    }

    static void d(ClassLoader classLoader, File file) throws DynamicLoaderException {
        try {
            AndroidPlatformV25.e(classLoader, file);
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            try {
                LogUtil.d("HAF_LibraryLoader", "load v25 fail, try to fallback to V23, sdk=", Integer.valueOf(Build.VERSION.SDK_INT), ", ex=", LogUtil.c(e));
                AndroidPlatformV23.b(classLoader, file);
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
                throw new DynamicLoaderException("Failed to loadLibrary " + file + " for " + classLoader.getClass().getName(), e2);
            }
        }
    }

    private static List<File> b(Object obj, File file) throws IllegalAccessException, NoSuchFieldException {
        Object obj2 = ReflectionUtils.e(obj, "nativeLibraryDirectories").get(obj);
        List<File> list = obj2 instanceof List ? (List) obj2 : null;
        if (list != null) {
            Iterator<File> it = list.iterator();
            while (it.hasNext()) {
                if (file.equals(it.next())) {
                    it.remove();
                    break;
                }
            }
            list.add(0, file);
            return list;
        }
        return Collections.EMPTY_LIST;
    }

    private static List<File> b(Object obj) throws IllegalAccessException, NoSuchFieldException {
        Object obj2 = ReflectionUtils.e(obj, "systemNativeLibraryDirectories").get(obj);
        return obj2 instanceof List ? (List) obj2 : Collections.EMPTY_LIST;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<File> d(Object obj, File file) throws IllegalAccessException, NoSuchFieldException {
        List<File> listB = b(obj, file);
        List<File> listB2 = b(obj);
        ArrayList arrayList = new ArrayList(listB.size() + listB2.size());
        arrayList.addAll(listB);
        arrayList.addAll(listB2);
        return arrayList;
    }

    static final class AndroidPlatformV14 {
        private AndroidPlatformV14() {
        }
    }

    static final class AndroidPlatformV23 {
        private AndroidPlatformV23() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(ClassLoader classLoader, File file) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
            Object obj = ReflectionUtils.e(classLoader, "pathList").get(classLoader);
            List listD = DynamicLibraryLoader.d(obj, file);
            LogUtil.c("HAF_LibraryLoader", "V23 load ", Arrays.toString(listD.toArray()));
            Object objInvoke = ReflectionUtils.d(obj, "makePathElements", List.class, File.class, List.class).invoke(obj, listD, null, new ArrayList());
            if (objInvoke instanceof Object[]) {
                ReflectionUtils.e(obj, "nativeLibraryPathElements").set(obj, objInvoke);
            }
        }
    }

    static final class AndroidPlatformV25 {
        private AndroidPlatformV25() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void e(ClassLoader classLoader, File file) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
            Object obj = ReflectionUtils.e(classLoader, "pathList").get(classLoader);
            List listD = DynamicLibraryLoader.d(obj, file);
            LogUtil.c("HAF_LibraryLoader", "V25 load ", Arrays.toString(listD.toArray()));
            Object objInvoke = ReflectionUtils.d(obj, "makePathElements", List.class).invoke(obj, listD);
            if (objInvoke instanceof Object[]) {
                ReflectionUtils.e(obj, "nativeLibraryPathElements").set(obj, objInvoke);
            }
        }
    }
}
