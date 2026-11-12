package com.xiaomi.smarthome.core.server.internal.plugin.util;

import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Stack;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes10.dex */
public class ZipFileUtils {
    private static final int BUFFER_SIZE = 4096;
    private static final String TAG = "ZipFileUtils";

    public interface TranslateName {
        String translateName(String str);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean doUnzip(String str, String str2, String str3, TranslateName translateName) {
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(str);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                byte[] bArr = new byte[4096];
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    if (!zipEntryNextElement.isDirectory()) {
                        String name = zipEntryNextElement.getName();
                        if (name != null && name.indexOf("\\") != -1) {
                            name = name.replaceAll("\\\\", File.separator);
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(File.separator);
                        if (translateName != null) {
                            name = translateName.translateName(name);
                        }
                        sb.append(name);
                        String string = sb.toString();
                        if (!verifyFileAbosolutePath(str2, string)) {
                            throw new FileNotFoundException();
                        }
                        if (TextUtils.isEmpty(str3) || string.indexOf(str3) != -1) {
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(createFileIfNotExists(string)));
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile2.getInputStream(zipEntryNextElement));
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
                    zipFile2.close();
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                    return true;
                }
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
                try {
                    MiJiaLog.writeLogOnAll(LogType.PLUGIN, TAG, Log.getStackTraceString(th));
                    return false;
                } finally {
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean syncUnzip(String str, String str2, TranslateName translateName) {
        return doUnzip(str, str2, null, translateName);
    }

    @Deprecated
    private static void syncUnzipOld(String str, String str2, UnzipLibraryRunnable.UnzipCallBack unzipCallBack) {
        new UnzipLibraryRunnable(str, str2, unzipCallBack).run();
    }

    public static boolean syncUnzipSingleFile(String str, String str2, String str3) {
        return doUnzip(str, str2, str3, null);
    }

    @Deprecated
    private static void syncUnzipSingleFileOld(String str, String str2, String str3) {
        new UnzipLibraryRunnable(str, str2, str3, null).run();
    }

    public static boolean syncUnzipWithFolder(ZipInputStream zipInputStream, String str) {
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    return true;
                }
                String name = nextEntry.getName();
                if (nextEntry.isDirectory()) {
                    new File(str + File.separator + name.substring(0, name.length() - 1)).mkdirs();
                } else {
                    File file = new File(str + File.separator + name);
                    if (!file.exists()) {
                        file.getParentFile().mkdirs();
                        file.createNewFile();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = zipInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i);
                        fileOutputStream.flush();
                    }
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    public static boolean verifyFileAbosolutePath(String str, String str2) {
        MiJiaLog.writeLogOnDebug(LogType.GENERAL, "verifyFile: ", "verifyFileAbosolutePath basePath: " + str + " fileAbsolutePathName: " + str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
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
        LogType logType = LogType.GENERAL;
        MiJiaLog.writeLogOnDebug(logType, "verifyFile: ", "fileAbsolutePathName=" + str2);
        MiJiaLog.writeLogOnDebug(logType, "verifyFile: ", "resultFilePathName= " + sb.toString());
        MiJiaLog.writeLogOnDebug(logType, "verifyFile: ", "result= " + zStartsWith);
        return zStartsWith;
    }

    public static boolean syncUnzip(String str, String str2) {
        return doUnzip(str, str2, null, null);
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
            if (ZipFileUtils.doUnzip(this.zipPath, this.outputDirectory, this.onlyUnzipFile, null)) {
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
