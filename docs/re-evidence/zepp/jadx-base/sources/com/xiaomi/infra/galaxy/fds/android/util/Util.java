package com.xiaomi.infra.galaxy.fds.android.util;

import android.webkit.MimeTypeMap;
import com.xiaomi.infra.galaxy.fds.android.exception.GalaxyFDSClientException;
import com.xiaomi.infra.galaxy.fds.android.model.FDSObject;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes22.dex */
public class Util {
    private static final int a = 4096;
    private static final ThreadLocal<SimpleDateFormat> b = new a();

    public static class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat;
        }
    }

    public static void downloadObjectToFile(FDSObject fDSObject, File file, boolean z) throws Throwable {
        File parentFile = file.getParentFile();
        if (!z && parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        byte[] bArr = new byte[4096];
        InputStream objectContent = fDSObject.getObjectContent();
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file, z));
            while (true) {
                try {
                    int i = objectContent.read(bArr, 0, 4096);
                    if (i == -1) {
                        try {
                            objectContent.close();
                            bufferedOutputStream2.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    bufferedOutputStream2.write(bArr, 0, i);
                } catch (IOException e) {
                    e = e;
                    bufferedOutputStream = bufferedOutputStream2;
                    throw new GalaxyFDSClientException("Unable to store object[" + fDSObject.getBucketName() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + fDSObject.getObjectName() + "] content to disk:" + e.getMessage(), e);
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    try {
                        objectContent.close();
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static String formatDateString(Date date) {
        return b.get().format(date);
    }

    public static String getMimeType(File file) {
        int i;
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(".");
        if (iLastIndexOf > 0 && (i = iLastIndexOf + 1) < name.length()) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(i));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return Consts.APPLICATION_OCTET_STREAM;
    }

    public static String getStackTrace(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        exc.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static Date parseDate(String str) throws ParseException {
        return b.get().parse(str);
    }
}
