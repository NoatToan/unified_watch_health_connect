package com.hm.sport.algorithm.logger;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class FileOp {

    public static class FileNameSelector implements FilenameFilter {
        public String extension = "";

        public FileNameSelector(String str) {
            this.extension += str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(this.extension);
        }
    }

    private static File changeExtension(File file, String str) {
        String absolutePath = file.getAbsolutePath();
        return new File(absolutePath.substring(0, absolutePath.lastIndexOf("")) + "" + str);
    }

    public static void deleteFiles(ArrayList<File> arrayList) {
        for (File file : arrayList) {
            if (file.exists()) {
                file.delete();
            }
            File fileChangeExtension = changeExtension(file, "sbin");
            if (fileChangeExtension.exists()) {
                fileChangeExtension.delete();
            }
        }
    }

    public static ArrayList<File> zipFiles(String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file2 : file.listFiles(new FileNameSelector("sbin"))) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(file2);
            File fileChangeExtension = changeExtension(file2, "zip");
            ZipUtils.zipFiles(arrayList2, fileChangeExtension);
            arrayList.add(fileChangeExtension);
        }
        return arrayList;
    }
}
