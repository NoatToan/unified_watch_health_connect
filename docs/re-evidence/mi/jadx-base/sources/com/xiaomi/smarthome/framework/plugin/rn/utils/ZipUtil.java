package com.xiaomi.smarthome.framework.plugin.rn.utils;

import com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes2.dex */
public class ZipUtil {
    private static final String TAG = "ZipUtil";

    private static byte[] getBytes(FileInputStream fileInputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1000);
            byte[] bArr = new byte[1000];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    fileInputStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (FileNotFoundException e) {
            MRnLog.e(TAG, e.toString());
            return null;
        } catch (IOException e2) {
            MRnLog.e(TAG, e2.toString());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.zip.Inflater] */
    public static byte[] uncompress(File file) throws Throwable {
        byte[] byteArray = new byte[0];
        try {
            byteArray = getBytes(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ?? inflater = new Inflater();
        inflater.reset();
        inflater.setInput(byteArray, 0, byteArray.length);
        ?? r3 = 0;
        r3 = 0;
        r3 = 0;
        try {
            try {
                try {
                    ?? byteArrayOutputStream = new ByteArrayOutputStream(byteArray.length);
                    try {
                        ?? r4 = new byte[1024];
                        while (!inflater.finished()) {
                            int iInflate = inflater.inflate(r4);
                            byteArrayOutputStream.write(r4, 0, iInflate);
                            if (iInflate <= 0) {
                                StringBuilder sb = new StringBuilder();
                                r4 = "MIOTPersistModule inflater.inflate return is ";
                                sb.append("MIOTPersistModule inflater.inflate return is ");
                                sb.append(iInflate);
                                RnPluginLog.e(sb.toString());
                                break;
                            }
                        }
                        byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        r3 = r4;
                    } catch (Exception e2) {
                        e = e2;
                        r3 = byteArrayOutputStream;
                        MRnLog.e(TAG, e.toString());
                        if (r3 != 0) {
                            r3.close();
                            r3 = r3;
                        }
                        inflater.end();
                        return byteArray;
                    } catch (Throwable th) {
                        th = th;
                        r3 = byteArrayOutputStream;
                        if (r3 != 0) {
                            try {
                                r3.close();
                            } catch (IOException e3) {
                                MRnLog.e(TAG, e3.toString());
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (IOException e5) {
            MRnLog.e(TAG, e5.toString());
        }
        inflater.end();
        return byteArray;
    }
}
