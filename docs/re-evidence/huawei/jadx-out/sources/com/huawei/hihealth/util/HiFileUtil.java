package com.huawei.hihealth.util;

import android.content.Context;
import health.compact.a.util.LogUtil;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public class HiFileUtil {
    /* JADX WARN: Code duplicated, block: B:23:0x0046 A[ExcHandler: UnsupportedEncodingException -> 0x0046, PHI: r5
      0x0046: PHI (r5v2 java.io.FileOutputStream) = (r5v0 java.io.FileOutputStream), (r5v5 java.io.FileOutputStream) binds: [B:48:0x0011, B:53:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0058 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean b(Context context, String str, String str2) {
        if (str2 == null || str == null || context == null) {
            return false;
        }
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            fileOutputStreamOpenFileOutput = context.openFileOutput(str2, 0);
            fileOutputStreamOpenFileOutput.write(str.getBytes("UTF-8"));
            return true;
        } catch (UnsupportedEncodingException e) {
            LogUtil.d("Debug_HiFileUtil", "decode not support ", e.getMessage());
            return false;
        } catch (FileNotFoundException e2) {
            LogUtil.d("Debug_HiFileUtil", "writeDataToFile no file: ", e2.getMessage());
            return false;
        } catch (IOException unused) {
            return false;
        } finally {
            if (fileOutputStreamOpenFileOutput != null) {
                try {
                    fileOutputStreamOpenFileOutput.close();
                } catch (IOException e3) {
                    LogUtil.c("Debug_HiFileUtil", "writeDataToFile fout close error = ", e3.getMessage());
                }
            }
        }
    }

    public static String a(Context context, String str) {
        if (str == null || context == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        FileInputStream fileInputStreamOpenFileInput = null;
        try {
            try {
                fileInputStreamOpenFileInput = context.openFileInput(str);
                byte[] bArr = new byte[1024];
                int i = 0;
                while (true) {
                    int i2 = fileInputStreamOpenFileInput.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    i += i2;
                    if (i >= 52428800) {
                        LogUtil.d("Debug_HiFileUtil", "read too match ", Integer.valueOf(i));
                        break;
                    }
                    sb.append(new String(bArr, 0, i2, "UTF-8"));
                }
            } catch (IOException e) {
                LogUtil.c("Debug_HiFileUtil", "readFiletoData IOException = ", e.getMessage());
            }
            return sb.toString();
        } finally {
            if (fileInputStreamOpenFileInput != null) {
                try {
                    fileInputStreamOpenFileInput.close();
                } catch (IOException e2) {
                    LogUtil.c("Debug_HiFileUtil", "readFiletoData final IOException = ", e2.getMessage());
                }
            }
        }
    }
}
