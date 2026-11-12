package com.huawei.hms.common.util;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class FileUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13095a = "FileUtils";

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.w(f13095a, "the pathname is empty.");
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(File.separator);
        return iLastIndexOf <= 0 ? str : str.substring(0, iLastIndexOf);
    }

    public static boolean b(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "The Path is null.";
        } else {
            try {
                File file = new File(str);
                if (file.exists()) {
                    return true;
                }
                return file.mkdirs();
            } catch (SecurityException e) {
                str2 = "MakeDirectory exception: " + e.getClass().getSimpleName();
            }
        }
        Logger.e(f13095a, str2);
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056 A[RETURN] */
    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            Logger.w(f13095a, "No need to delete anything.");
            return true;
        }
        File file = new File(str);
        if (file.isDirectory() && file.list() != null) {
            boolean z = true;
            for (String str2 : file.list()) {
                if (z) {
                    if (a(str + File.separator + str2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            }
            if (z) {
                if (file.delete()) {
                    return true;
                }
            }
        } else if (file.delete()) {
            return true;
        }
        return false;
    }

    public static boolean a(File file) {
        String str;
        if (file == null) {
            str = "targetFile is null.";
        } else {
            try {
                return file.setReadOnly();
            } catch (SecurityException e) {
                str = "SecurityException occur, message: " + e.getMessage();
            }
        }
        Logger.e(f13095a, str);
        return false;
    }

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
            Logger.e(f13095a, "An exception occurred while closing the closeable.");
        }
    }
}
