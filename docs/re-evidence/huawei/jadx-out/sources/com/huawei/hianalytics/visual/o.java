package com.huawei.hianalytics.visual;

import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public abstract class o {
    public static void a(String str) {
        File file;
        File[] fileArrListFiles;
        if (TextUtils.isEmpty(str) || (fileArrListFiles = (file = new File(str)).listFiles()) == null || fileArrListFiles.length == 0 || fileArrListFiles.length <= 10) {
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator() { // from class: com.huawei.hianalytics.visual.o$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return o.a((File) obj, (File) obj2);
            }
        });
        fileArrListFiles[0].delete();
        File[] fileArrListFiles2 = file.listFiles();
        if (fileArrListFiles2 == null || fileArrListFiles2.length == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (File file2 : fileArrListFiles2) {
            if (jCurrentTimeMillis - file2.lastModified() > 86400000) {
                file2.delete();
            }
        }
    }

    public static /* synthetic */ int a(File file, File file2) {
        if (file.lastModified() == file2.lastModified()) {
            return file.compareTo(file2);
        }
        return file.lastModified() - file2.lastModified() <= 0 ? -1 : 1;
    }

    public static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists() && !file.mkdirs()) {
                return "";
            }
            File file2 = new File(str, str2);
            StringBuilder sb = new StringBuilder();
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                    try {
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        long length = 0;
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line != null) {
                                    length += (long) line.length();
                                    if (length <= 1048576) {
                                        if (line.length() > 0) {
                                            sb.append(line);
                                        }
                                    } else {
                                        throw new IOException("read file failed. Cause: the input stream length is too long");
                                    }
                                } else {
                                    bufferedReader.close();
                                    inputStreamReader.close();
                                    fileInputStream.close();
                                    break;
                                }
                            } catch (Throwable th) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                            try {
                                inputStreamReader.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                            throw th;
                        }
                        return sb.toString().trim();
                    } catch (Throwable th4) {
                        inputStreamReader.close();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            } catch (IOException e) {
                HiLog.e("FileUtils", "read file failed. Cause: " + e.getMessage());
            }
        } else {
            return "";
        }
    }

    public static void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(str, str2), false), StandardCharsets.UTF_8));
                try {
                    bufferedWriter.write(str3);
                    bufferedWriter.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                HiLog.e("FileUtils", "write file failed. Cause: " + e.getMessage());
            }
        }
    }
}
