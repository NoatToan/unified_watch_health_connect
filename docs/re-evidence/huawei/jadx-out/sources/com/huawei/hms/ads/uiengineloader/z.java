package com.huawei.hms.ads.uiengineloader;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.phoneservice.feedbackcommon.network.FeedbackWebConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes10.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f12954a = "z";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f12955b = "lib";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f12956c = "!";
    private static final String d = "armeabi-v7a";
    private static final String e = "armeabi";
    private static final Pattern f = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    private static ArrayList<String> b(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, a(context) ? Build.SUPPORTED_64_BIT_ABIS : Build.SUPPORTED_32_BIT_ABIS);
        return arrayList;
    }

    public static String b(Context context, String str) {
        for (String str2 : b(context)) {
            if (a(new File(str), str2)) {
                af.b(f12954a, "use the preferred abi:".concat(String.valueOf(str2)));
                return str + f12956c + File.separator + f12955b + File.separator + str2;
            }
        }
        af.c(f12954a, "cannot get a valid native path, return null.");
        return null;
    }

    private static boolean a(File file, String str) throws Throwable {
        ZipFile zipFile;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(file);
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        String name = enumerationEntries.nextElement().getName();
                        if (name.contains(FeedbackWebConstants.INVALID_FILE_NAME_PRE)) {
                            af.c(f12954a, "Unsafe zip name!");
                            aj.a(zipFile);
                            return false;
                        }
                        Matcher matcher = f.matcher(name);
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            if (TextUtils.equals(str, strGroup)) {
                                af.b(f12954a, "abiName:" + strGroup + " matched.");
                                aj.a(zipFile);
                                return true;
                            }
                        }
                    }
                    aj.a(zipFile);
                } catch (Exception e2) {
                    e = e2;
                    zipFile2 = zipFile;
                    af.c(f12954a, "isApkContainPrefAbi exception:" + e.getClass().getSimpleName());
                    aj.a(zipFile2);
                } catch (Throwable th) {
                    th = th;
                    aj.a(zipFile);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            zipFile = zipFile2;
        }
    }

    private static boolean a(Context context) {
        if (context == null) {
            af.d(f12954a, "Null context, please check it.");
            return false;
        }
        if (context.getApplicationContext() != null) {
            context.getApplicationContext();
        }
        return Process.is64Bit();
    }

    public static String a(Context context, String str) {
        for (String str2 : b(context)) {
            String str3 = str.substring(0, str.lastIndexOf(File.separator)) + File.separator + str2;
            if (new File(str3).exists()) {
                af.b(f12954a, "The so has been unzipped, abi:".concat(String.valueOf(str2)));
                return str3;
            }
        }
        return b(context, str);
    }
}
