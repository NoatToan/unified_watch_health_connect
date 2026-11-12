package com.xiaomi.smarthome.utils;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.example.statistics.export.OneTrackConstant;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class StatUtils {
    private static int BUFFER_SIZE = 4096;

    public static final String getDeveloperName(long j, long j2) {
        return "plugin." + j + "." + j2;
    }

    public static boolean isNetActiveAndAvailable() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) MiJiaEnvironment.getAppContext().getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isAvailable();
        } catch (Exception unused) {
            return false;
        }
    }

    private static void pipeAll(InputStream inputStream, OutputStream outputStream) throws IOException {
        int i = BUFFER_SIZE;
        byte[] bArr = new byte[i];
        while (true) {
            int i2 = inputStream.read(bArr, 0, i);
            if (i2 < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i2);
            }
        }
    }

    public static byte[] readAll(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        pipeAll(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
