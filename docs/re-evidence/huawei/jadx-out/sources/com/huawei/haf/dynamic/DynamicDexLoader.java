package com.huawei.haf.dynamic;

import com.huawei.haf.common.utils.CommonConstant;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class DynamicDexLoader {
    private DynamicDexLoader() {
    }

    static Object[] e(ClassLoader classLoader, File file, List<File> list) throws DynamicLoaderException {
        if (list.isEmpty()) {
            return CommonConstant.f5921a;
        }
        try {
            return AndroidPlatformV23.c(classLoader, list, file);
        } catch (IOException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            throw new DynamicLoaderException("Failed to loadDex " + classLoader.getClass().getName(), e);
        }
    }

    static void c(ClassLoader classLoader, Object[] objArr) throws DynamicLoaderException {
        if (objArr.length == 0) {
            return;
        }
        try {
            ReflectionUtils.b(ReflectionUtils.e(classLoader, "pathList").get(classLoader), "dexElements", objArr);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new DynamicLoaderException("unloadDex fail.", e);
        }
    }

    static final class AndroidPlatformV23 {
        private AndroidPlatformV23() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Object[] c(ClassLoader classLoader, List<File> list, File file) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, IOException, InvocationTargetException {
            Object obj = ReflectionUtils.e(classLoader, "pathList").get(classLoader);
            ArrayList<IOException> arrayList = new ArrayList();
            Object[] objArrA = a(obj, new ArrayList(list), file, arrayList);
            if (!arrayList.isEmpty()) {
                for (IOException iOException : arrayList) {
                    LogUtil.d("HAF_DexLoader", "Exception in makePathElement ex=", LogUtil.c(iOException));
                    if (objArrA.length == 0) {
                        throw iOException;
                    }
                }
            }
            ReflectionUtils.c(obj, "dexElements", objArrA);
            return objArrA;
        }

        private static Object[] a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Method methodD;
            try {
                methodD = ReflectionUtils.d(obj, "makePathElements", List.class, File.class, List.class);
            } catch (NoSuchMethodException unused) {
                LogUtil.d("HAF_DexLoader", "NoSuchMethodException: makePathElements(List, File, List) failure");
                try {
                    methodD = ReflectionUtils.d(obj, "makePathElements", ArrayList.class, File.class, ArrayList.class);
                } catch (NoSuchMethodException unused2) {
                    LogUtil.d("HAF_DexLoader", "NoSuchMethodException: makeDexElements(ArrayList, File, ArrayList) failure");
                    try {
                        LogUtil.e("HAF_DexLoader", "NoSuchMethodException: try use v19 instead");
                        return AndroidPlatformV19.a(obj, arrayList, file, arrayList2);
                    } catch (NoSuchMethodException e) {
                        LogUtil.d("HAF_DexLoader", "NoSuchMethodException: makeDexElements(List, File, List) failure");
                        throw e;
                    }
                }
            }
            Object objInvoke = methodD.invoke(obj, arrayList, file, arrayList2);
            return objInvoke instanceof Object[] ? (Object[]) objInvoke : CommonConstant.f5921a;
        }
    }

    static final class AndroidPlatformV19 {
        private AndroidPlatformV19() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Object[] a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            Method methodD;
            try {
                methodD = ReflectionUtils.d(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class);
            } catch (NoSuchMethodException unused) {
                LogUtil.d("HAF_DexLoader", "NoSuchMethodException: makeDexElements(ArrayList, File, ArrayList) failure");
                try {
                    methodD = ReflectionUtils.d(obj, "makeDexElements", List.class, File.class, List.class);
                } catch (NoSuchMethodException e) {
                    LogUtil.d("HAF_DexLoader", "NoSuchMethodException: makeDexElements(List, File, List) failure");
                    throw e;
                }
            }
            Object objInvoke = methodD.invoke(obj, arrayList, file, arrayList2);
            return objInvoke instanceof Object[] ? (Object[]) objInvoke : CommonConstant.f5921a;
        }
    }
}
