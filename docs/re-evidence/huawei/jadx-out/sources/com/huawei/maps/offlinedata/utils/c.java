package com.huawei.maps.offlinedata.utils;

import java.io.File;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c {
    public static boolean a(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        return file.delete();
    }

    public static boolean b(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists()) {
            return false;
        }
        return (!file.isFile() && file.isDirectory() && ((fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0)) ? false : true;
    }

    public static void c(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            a(file);
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                a(file);
                return;
            }
            for (File file2 : fileArrListFiles) {
                c(file2);
            }
            a(file);
        }
    }
}
