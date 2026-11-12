package com.huawei.hms.feature.dynamic;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.common.util.ExtractNativeUtils;
import com.huawei.hms.common.util.FileUtils;
import com.huawei.hms.common.util.Logger;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class AssetLoadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13114a = "AssetLoadManager";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f13115b = "dynamic_modules";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f13116c = ".apk";
    private static final String d = "com.huawei.hms.feature.dynamic.descriptors.";
    private static final String e = ".AssetModuleDescriptor";

    public static Bundle getAssetModuleInfo(Context context, String str) throws Throwable {
        if (context == null || TextUtils.isEmpty(str)) {
            Logger.w(f13114a, "The context or moduleName is null.");
            return new Bundle();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(ModuleCopy.getProtectedPath(context));
            String str2 = File.separator;
            sb.append(str2);
            sb.append("dynamic_modules");
            sb.append(str2);
            sb.append(str);
            File file = new File(sb.toString());
            if (file.exists()) {
                Bundle bundleA = a(context, file, str);
                if (bundleA.getInt(b.m) > 0) {
                    Logger.i(f13114a, "Successfully get module info from decompressed asset path.");
                    return bundleA;
                }
            }
            Bundle bundleB = b(context, str);
            if (bundleB.getInt(b.m) > 0) {
                Logger.i(f13114a, "Successfully get module info from asset.");
                return bundleB;
            }
        } catch (Exception e2) {
            Logger.i(f13114a, "getDataModuleInfo failed.", e2);
        }
        return new Bundle();
    }

    private static Bundle b(Context context, String str) throws Throwable {
        try {
            String[] list = context.getAssets().list("dynamic_modules" + File.separator + str);
            if (list != null && list.length != 0) {
                String str2 = list[0];
                int iA = a(context, str);
                String strA = a(context, str, iA, str2);
                if (!TextUtils.isEmpty(strA) && new File(strA).exists()) {
                    if (!ExtractNativeUtils.a(context, strA) || ExtractNativeUtils.a(new File(strA), FileUtils.c(strA)) == 0) {
                        Bundle bundle = new Bundle();
                        bundle.putString("module_name", str);
                        bundle.putString("module_path", strA);
                        bundle.putInt(b.m, iA);
                        Logger.i(f13114a, "Get dynamic module info from asset success: ModuleName:" + str + ", ModuleVersion:" + iA + ", ModulePath:" + strA);
                        return bundle;
                    }
                    Logger.w(f13114a, "Extract native to current dir failed.");
                    return new Bundle();
                }
                Logger.w(f13114a, "Decompress module from assets failed.");
                return new Bundle();
            }
            Logger.w(f13114a, "No module apk in asset path.");
            return new Bundle();
        } catch (Exception e2) {
            Logger.i(f13114a, "getModuleFromAsset failed.", e2);
            return new Bundle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [int] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v3 */
    private static String a(Context context, String str, int i, String str2) throws Throwable {
        ?? r9;
        FileOutputStream fileOutputStream;
        BufferedInputStream bufferedInputStream;
        ?? r11;
        ?? r12;
        BufferedInputStream bufferedInputStream2 = null;
        ?? r2 = 0;
        try {
            try {
                AssetManager assets = context.getAssets();
                StringBuilder sb = new StringBuilder("dynamic_modules");
                String str3 = File.separator;
                sb.append(str3);
                sb.append(str);
                sb.append(str3);
                sb.append((String) str2);
                str2 = assets.open(sb.toString());
                try {
                    bufferedInputStream = new BufferedInputStream(str2);
                    try {
                        String str4 = ModuleCopy.getProtectedPath(context) + str3 + "dynamic_modules" + str3 + str + str3 + ((int) i);
                        if (!new File(str4).exists() && !new File(str4).mkdirs()) {
                            Logger.w(f13114a, "mkdirs local loaderPath failed.");
                            FileUtils.a(bufferedInputStream);
                            FileUtils.a((Closeable) null);
                            r12 = str2;
                            FileUtils.a((Closeable) r12);
                            return null;
                        }
                        String str5 = str4 + str3 + str + ".apk";
                        fileOutputStream = new FileOutputStream(str5);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i2 = bufferedInputStream.read(bArr, 0, 4096);
                                if (i2 == -1) {
                                    Logger.i(f13114a, "Decompress module:" + str + " from assets success.");
                                    FileUtils.a(bufferedInputStream);
                                    FileUtils.a(fileOutputStream);
                                    FileUtils.a((Closeable) str2);
                                    return str5;
                                }
                                fileOutputStream.write(bArr, 0, i2);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            Logger.w(f13114a, "Cannot find module:" + str + " in assets.", e);
                            FileUtils.a(bufferedInputStream);
                            FileUtils.a(fileOutputStream);
                            r12 = str2;
                            FileUtils.a((Closeable) r12);
                            return null;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        fileOutputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        r9 = r2;
                        bufferedInputStream2 = bufferedInputStream;
                        r11 = str2;
                        FileUtils.a(bufferedInputStream2);
                        FileUtils.a((Closeable) r9);
                        FileUtils.a((Closeable) r11);
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    fileOutputStream = null;
                    bufferedInputStream = null;
                    Logger.w(f13114a, "Cannot find module:" + str + " in assets.", e);
                    FileUtils.a(bufferedInputStream);
                    FileUtils.a(fileOutputStream);
                    r12 = str2;
                    FileUtils.a((Closeable) r12);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    r9 = 0;
                    r11 = str2;
                    FileUtils.a(bufferedInputStream2);
                    FileUtils.a((Closeable) r9);
                    FileUtils.a((Closeable) r11);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                r2 = i;
            }
        } catch (Exception e5) {
            e = e5;
            str2 = 0;
        } catch (Throwable th4) {
            th = th4;
            str2 = 0;
        }
    }

    private static Bundle a(Context context, File file, String str) {
        String[] list = file.list();
        if (list == null || list.length == 0) {
            Logger.w(f13114a, "No version in module path.");
            return new Bundle();
        }
        int iMax = 0;
        for (String str2 : list) {
            iMax = Math.max(Integer.parseInt(str2), iMax);
        }
        if (iMax == 0) {
            Logger.w(f13114a, "Cannot get module version path.");
            return new Bundle();
        }
        try {
            String canonicalPath = file.getCanonicalPath();
            ModuleCopy.clearLowVersionModule(iMax, canonicalPath, list, f13114a);
            if (a(context, str) > iMax) {
                Logger.i(f13114a, "There is a higher loader version in assets.");
                return new Bundle();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(canonicalPath);
            String str3 = File.separator;
            sb.append(str3);
            sb.append(iMax);
            sb.append(str3);
            sb.append(str);
            sb.append(".apk");
            String string = sb.toString();
            if (!new File(string).exists()) {
                Logger.w(f13114a, "Cannot find module apk in asset decompressed path.");
                return new Bundle();
            }
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            bundle.putString("module_path", string);
            bundle.putInt(b.m, iMax);
            Logger.i(f13114a, "Get module info from decompressed asset path success: ModuleName:" + str + ", ModuleVersion:" + iMax + ", ModulePath:" + string);
            return bundle;
        } catch (IOException e2) {
            Logger.w(f13114a, "request modulePath error: " + e2.getMessage());
            return new Bundle();
        }
    }

    private static int a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            Logger.e(f13114a, "Invalid context or moduleName.");
            return 0;
        }
        try {
            return context.getClassLoader().loadClass(d + str + e).getDeclaredField("MODULE_VERSION").getInt(null);
        } catch (ClassNotFoundException unused) {
            Logger.w(f13114a, "Cannot get the class of module descriptor for " + str);
            return 0;
        } catch (Exception e2) {
            Logger.w(f13114a, "Get local asset module info failed.", e2);
            return 0;
        }
    }
}
