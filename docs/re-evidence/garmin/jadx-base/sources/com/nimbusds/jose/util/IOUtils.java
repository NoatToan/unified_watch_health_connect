package com.nimbusds.jose.util;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public class IOUtils {
    private IOUtils() {
    }

    public static void closeSilently(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static String readFileToString(File file) {
        return readInputStreamToString(new FileInputStream(file));
    }

    public static String readInputStreamToString(InputStream inputStream, Charset charset) throws IOException {
        char[] cArr = new char[1024];
        StringBuilder sb3 = new StringBuilder();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        while (true) {
            try {
                int i14 = inputStreamReader.read(cArr, 0, 1024);
                if (i14 < 0) {
                    String string = sb3.toString();
                    inputStreamReader.close();
                    return string;
                }
                sb3.append(cArr, 0, i14);
            } catch (Throwable th3) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    public static String readFileToString(File file, Charset charset) {
        return readInputStreamToString(new FileInputStream(file), charset);
    }

    public static String readInputStreamToString(InputStream inputStream) {
        return readInputStreamToString(inputStream, StandardCharset.UTF_8);
    }
}
