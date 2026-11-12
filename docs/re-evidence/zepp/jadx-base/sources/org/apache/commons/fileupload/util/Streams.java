package org.apache.commons.fileupload.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.fileupload.InvalidFileNameException;
import org.apache.commons.io.IOUtils;

/* JADX INFO: loaded from: classes23.dex */
public final class Streams {
    private static final int a = 8192;

    private Streams() {
    }

    public static String asString(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream, true);
        return byteArrayOutputStream.toString();
    }

    public static String checkFileName(String str) {
        if (str != null) {
            if (str.indexOf(0) != -1) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt != 0) {
                        sb.append(cCharAt);
                    } else {
                        sb.append("\\0");
                    }
                }
                throw new InvalidFileNameException(str, "Invalid file name: " + ((Object) sb));
            }
        }
        return str;
    }

    public static long copy(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        return copy(inputStream, outputStream, z, new byte[8192]);
    }

    public static long copy(InputStream inputStream, OutputStream outputStream, boolean z, byte[] bArr) throws IOException {
        long j = 0;
        while (true) {
            try {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                if (i > 0) {
                    j += (long) i;
                    if (outputStream != null) {
                        outputStream.write(bArr, 0, i);
                    }
                }
            } catch (Throwable th) {
                IOUtils.closeQuietly(inputStream);
                if (z) {
                    IOUtils.closeQuietly(outputStream);
                }
                throw th;
            }
        }
        if (outputStream != null) {
            if (z) {
                outputStream.close();
            } else {
                outputStream.flush();
            }
            outputStream = null;
        }
        inputStream.close();
        IOUtils.closeQuietly((InputStream) null);
        if (z) {
            IOUtils.closeQuietly(outputStream);
        }
        return j;
    }

    public static String asString(InputStream inputStream, String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream, true);
        return byteArrayOutputStream.toString(str);
    }
}
