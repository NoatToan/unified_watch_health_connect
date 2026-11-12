package com.airoha.android.lib.util.logger;

import android.os.Environment;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class AirorhaEngineerDbgLog {
    public static void clearLogFile(String str) {
        File file = new File(Environment.getExternalStorageDirectory() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + str);
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static void logToFile(String str, String str2) throws Throwable {
        IOException e;
        FileNotFoundException e2;
        ?? sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        sb.append(str);
        File file = new File(sb.toString());
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        try {
            try {
                try {
                    sb = new FileOutputStream(file, true);
                    try {
                        sb.write(str2.getBytes());
                        sb.flush();
                        sb.close();
                        sb.close();
                        sb = sb;
                    } catch (FileNotFoundException e4) {
                        e2 = e4;
                        e2.printStackTrace();
                        if (sb != 0) {
                            sb.close();
                            sb = sb;
                        }
                    } catch (IOException e5) {
                        e = e5;
                        e.printStackTrace();
                        if (sb != 0) {
                            sb.close();
                            sb = sb;
                        }
                    }
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            } catch (FileNotFoundException e7) {
                sb = 0;
                e2 = e7;
            } catch (IOException e8) {
                sb = 0;
                e = e8;
            } catch (Throwable th) {
                sb = 0;
                th = th;
                if (sb != 0) {
                    try {
                        sb.close();
                    } catch (IOException e9) {
                        e9.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
