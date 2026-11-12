package com.huawei.haf.dynamic;

import android.content.Context;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.openalliance.ad.constant.ParamConstants;
import dalvik.system.DexClassLoader;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;
import java.io.File;
import java.io.FileDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamicDexOptimizer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Object f5935b;
    private static IBinder e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f5934a = c();
    private static boolean d = true;

    private DynamicDexOptimizer() {
    }

    public static boolean b(File file) {
        return new File(file, f5934a).exists();
    }

    public static boolean a(File file, File file2) {
        return a(file, file2, true);
    }

    public static boolean a(File file, File file2, boolean z) {
        return c(Arrays.asList(file.getAbsolutePath()), null, file2, "quicken", z);
    }

    public static boolean e(List<String> list, File file, File file2, boolean z) {
        return c(list, file, file2, "quicken", z);
    }

    private static boolean c(List<String> list, File file, File file2, String str, boolean z) {
        if (list.isEmpty()) {
            return true;
        }
        if (!z && Build.VERSION.SDK_INT > 29) {
            return false;
        }
        boolean z2 = z && d;
        File file3 = new File(file2, f5934a);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z2) {
            b(list, str, file3);
        } else {
            a(list, file, file2);
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        boolean zExists = file3.exists();
        LogUtil.b("HAF_DexOptimizer", "optimize ", zExists ? "success" : ParamConstants.CallbackMethod.ON_FAIL, ", isNewOpt=", Boolean.valueOf(z2), ", cost time:", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), "ms, size=", Integer.valueOf(list.size()));
        return zExists;
    }

    private static void a(List<String> list, File file, File file2) {
        try {
            new DexClassLoader(TextUtils.join(File.pathSeparator, list), file2.getAbsolutePath(), file == null ? null : file.getAbsolutePath(), DynamicDexOptimizer.class.getClassLoader());
        } catch (Throwable th) {
            LogUtil.e("HAF_DexOptimizer", "dex class loader ex=", LogUtil.c(th));
        }
    }

    private static void b(List<String> list, String str, File file) {
        synchronized (DynamicDexOptimizer.class) {
            Context contextB = BaseApplication.b();
            if (!c(contextB)) {
                LogUtil.e("HAF_DexOptimizer", "maybeInit fail.");
            } else if (c(contextB, list)) {
                e(contextB, str, file);
                a(contextB);
            }
        }
    }

    private static boolean c(Context context) {
        if (e != null) {
            return true;
        }
        Object objC = ReflectionUtils.c(context.getPackageManager(), "mPM");
        f5935b = objC;
        if (!(objC instanceof IInterface)) {
            return false;
        }
        IBinder iBinderAsBinder = ((IInterface) objC).asBinder();
        if (iBinderAsBinder != null) {
            e = iBinderAsBinder;
        }
        return e != null;
    }

    private static void e(Context context, String str, File file) {
        for (int i = 1; i <= 3; i++) {
            c(e(context, str));
            if (file.exists()) {
                return;
            }
        }
    }

    private static boolean c(Context context, List<String> list) {
        String packageName = context.getPackageName();
        if (Build.VERSION.SDK_INT >= 30) {
            return c(packageName, list);
        }
        return e(packageName, list);
    }

    private static boolean c(String str, List<String> list) {
        Method methodB = ReflectionUtils.b(f5935b.getClass(), "notifyDexLoad", (Class<?>[]) new Class[]{String.class, Map.class, String.class});
        if (methodB == null) {
            d = false;
            return false;
        }
        HashMap map = new HashMap(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            map.put(it.next(), "PCL[]");
        }
        ReflectionUtils.e(methodB, f5935b, str, map, f5934a);
        return true;
    }

    private static boolean e(String str, List<String> list) {
        Method methodB = ReflectionUtils.b(f5935b.getClass(), "notifyDexLoad", (Class<?>[]) new Class[]{String.class, List.class, List.class, String.class});
        if (methodB == null) {
            d = false;
            return false;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str2 : list) {
            arrayList.add("dalvik.system.DexClassLoader");
        }
        ReflectionUtils.e(methodB, f5935b, str, arrayList, list, f5934a);
        return true;
    }

    private static void a(Context context) {
        c(e(context));
    }

    private static void c(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        parcelObtain.writeFileDescriptor(FileDescriptor.in);
        parcelObtain.writeFileDescriptor(FileDescriptor.out);
        parcelObtain.writeFileDescriptor(FileDescriptor.err);
        parcelObtain.writeStringArray(strArr);
        parcelObtain.writeStrongBinder(null);
        new ResultReceiver(null).writeToParcel(parcelObtain, 0);
        try {
            e.transact(1598246212, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } catch (Throwable th) {
            try {
                LogUtil.e("HAF_DexOptimizer", "execCmd fail. ex=", LogUtil.c(th));
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        }
    }

    private static String[] e(Context context, String str) {
        return new String[]{"compile", "-m", str, "-f", "--secondary-dex", context.getPackageName()};
    }

    private static String[] e(Context context) {
        return new String[]{"reconcile-secondary-dex-files", context.getPackageName()};
    }

    private static String c() {
        Class<?> clsB = ReflectionUtils.b("dalvik.system.VMRuntime");
        if (clsB != null) {
            Object objE = ReflectionUtils.e(clsB, "getCurrentInstructionSet");
            if (objE instanceof String) {
                return (String) objE;
            }
            return "arm64";
        }
        return "arm64";
    }
}
