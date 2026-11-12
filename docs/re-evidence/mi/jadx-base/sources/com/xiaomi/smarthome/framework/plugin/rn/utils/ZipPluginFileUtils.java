package com.xiaomi.smarthome.framework.plugin.rn.utils;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Stack;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public class ZipPluginFileUtils {
    private static final int BUFFER_SIZE = 4096;
    private static final int MAX_PLUGIN_CACHE_COUNT_DEFAULT = 5;
    private static final int MAX_PLUGIN_CACHE_COUNT_LIMIT = 15;
    private static final int MAX_RUNTIME_MEMORY_PERCENT_WHEN_REUSE_DEFAULT = 50;
    private static final String TAG = "RnPluginFileUtils";

    public static void appendContentToFile(String str, String str2) {
        File fileCreateFileIfNotExists;
        if (TextUtils.isEmpty(str2) || (fileCreateFileIfNotExists = createFileIfNotExists(str2)) == null) {
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(fileCreateFileIfNotExists, true));
            try {
                bufferedWriter2.write(str);
                bufferedWriter2.flush();
                bufferedWriter2.close();
            } catch (IOException e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                e.toString();
            }
        } catch (IOException e2) {
            e = e2;
        }
        if (bufferedWriter != null) {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e3) {
                e3.toString();
            }
        }
    }

    public static File createFileIfNotExists(String str) {
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException unused) {
        }
        return file;
    }

    public static boolean doUnzip(String str, String str2, String str3) {
        ZipFile zipFile = null;
        try {
            zipFile = getZipFile(str);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            byte[] bArr = new byte[4096];
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                if (!zipEntryNextElement.isDirectory()) {
                    String name = zipEntryNextElement.getName();
                    if (name != null && name.indexOf("\\") != -1) {
                        name = name.replaceAll("\\\\", File.separator);
                    }
                    String str4 = str2 + File.separator + name;
                    if (!verifyFileAbosolutePath(str2, str4)) {
                        throw new FileNotFoundException();
                    }
                    if (TextUtils.isEmpty(str3) || str4.indexOf(str3) != -1) {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(createFileIfNotExists(str4)));
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntryNextElement));
                        while (true) {
                            int i = bufferedInputStream.read(bArr, 0, 4096);
                            if (i == -1) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, i);
                        }
                        bufferedOutputStream.flush();
                        bufferedInputStream.close();
                        bufferedOutputStream.close();
                    }
                }
            }
            try {
                zipFile.close();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        } catch (FileNotFoundException unused) {
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return false;
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                return false;
            } finally {
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            }
        }
    }

    private static ZipFile getZipFile(String str) throws Exception {
        ZipFile zipFile = new ZipFile(str);
        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
        if (!enumerationEntries.hasMoreElements()) {
            return zipFile;
        }
        try {
            enumerationEntries.nextElement();
            zipFile.close();
            return new ZipFile(str);
        } catch (Exception unused) {
            return new ZipFile(str, Charset.forName("GBK"));
        }
    }

    public static boolean syncUnzip(String str, String str2) {
        return doUnzip(str, str2, null);
    }

    @Deprecated
    private static void syncUnzipOld(String str, String str2, UnzipLibraryRunnable.UnzipCallBack unzipCallBack) {
        new UnzipLibraryRunnable(str, str2, unzipCallBack).run();
    }

    @Deprecated
    private static void syncUnzipSingleFileOld(String str, String str2, String str3) {
        new UnzipLibraryRunnable(str, str2, str3, null).run();
    }

    public static boolean verifyFileAbosolutePath(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            RnPluginLog.e("VerifyFile   fileAbsolutePathName=" + str2);
            return false;
        }
        String[] strArrSplit = str2.split(File.separator);
        ArrayList arrayList = new ArrayList();
        for (String str3 : strArrSplit) {
            arrayList.add(str3);
        }
        Stack stack = new Stack();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if ("..".equals(arrayList.get(i))) {
                if (stack.size() <= 0) {
                    break;
                }
                stack.pop();
            } else if (!"".equals(arrayList.get(i))) {
                stack.push((String) arrayList.get(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        int size2 = stack.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (i2 == size2 - 1) {
                sb.append((String) stack.get(i2));
            } else {
                sb.append((String) stack.get(i2));
                sb.append(File.separator);
            }
        }
        int length = File.separator.length();
        while (str.startsWith(File.separator)) {
            try {
                str = str.substring(length, str.length());
            } catch (Exception unused) {
            }
        }
        boolean zStartsWith = sb.toString().startsWith(str);
        RnPluginLog.i("VerifyFile   fileAbsolutePathName=" + str2);
        RnPluginLog.i("VerifyFile   resultFilePathName=" + sb.toString());
        RnPluginLog.i("VerifyFile   result=" + zStartsWith);
        return zStartsWith;
    }

    public static boolean verifyFilePathName(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return verifyFileAbosolutePath(str, str + File.separator + str2);
    }

    @Deprecated
    private static void syncUnzipSingleFileOld(String str, String str2, String str3, UnzipLibraryRunnable.UnzipCallBack unzipCallBack) {
        new UnzipLibraryRunnable(str, str2, str3, unzipCallBack).run();
    }

    public static class UnzipLibraryRunnable implements Runnable {
        private String onlyUnzipFile;
        private String outputDirectory;
        private UnzipCallBack unzipCallBack;
        private String zipPath;

        public interface UnzipCallBack {
            void onSuccess();

            void onUnzipErr();
        }

        public UnzipLibraryRunnable(String str, String str2, String str3, UnzipCallBack unzipCallBack) {
            this.zipPath = str;
            this.outputDirectory = str2;
            this.onlyUnzipFile = str3;
            this.unzipCallBack = unzipCallBack;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ZipPluginFileUtils.doUnzip(this.zipPath, this.outputDirectory, this.onlyUnzipFile)) {
                UnzipCallBack unzipCallBack = this.unzipCallBack;
                if (unzipCallBack != null) {
                    unzipCallBack.onSuccess();
                    return;
                }
                return;
            }
            UnzipCallBack unzipCallBack2 = this.unzipCallBack;
            if (unzipCallBack2 != null) {
                unzipCallBack2.onUnzipErr();
            }
        }

        public UnzipLibraryRunnable(String str, String str2, UnzipCallBack unzipCallBack) {
            this(str, str2, null, unzipCallBack);
        }
    }
}
