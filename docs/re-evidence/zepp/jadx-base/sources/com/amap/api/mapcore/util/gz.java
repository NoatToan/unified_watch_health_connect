package com.amap.api.mapcore.util;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes2.dex */
public final class gz {
    public static final String a = gu.c("SYmFja3Vwcw");
    public static final String b = gu.c("SLmFkaXU");
    public static final String c = gu.c("JIw");

    public static synchronized void a(Context context, String str, String str2) {
        FileChannel channel;
        RandomAccessFile randomAccessFile;
        String strA = a(context);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        String str3 = str + c + str2;
        File file = new File(strA + File.separator + a);
        File file2 = new File(file, b);
        FileLock fileLockTryLock = null;
        try {
            if (!file.exists() || file.isDirectory()) {
                file.mkdirs();
            }
            file2.createNewFile();
            randomAccessFile = new RandomAccessFile(file2, "rws");
            try {
                channel = randomAccessFile.getChannel();
                try {
                    fileLockTryLock = channel.tryLock();
                    if (fileLockTryLock != null) {
                        channel.write(ByteBuffer.wrap(str3.getBytes("UTF-8")));
                    }
                    if (fileLockTryLock != null) {
                        try {
                            fileLockTryLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    try {
                        channel.close();
                    } catch (IOException unused2) {
                    }
                    a(randomAccessFile);
                } catch (Throwable unused3) {
                    if (fileLockTryLock != null) {
                        try {
                            fileLockTryLock.release();
                        } catch (IOException unused4) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused5) {
                        }
                    }
                    a(randomAccessFile);
                }
            } catch (Throwable unused6) {
                channel = null;
            }
        } catch (Throwable unused7) {
            channel = null;
            randomAccessFile = null;
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    private static String a(Context context) {
        StorageManager storageManager = Build.VERSION.SDK_INT >= 9 ? (StorageManager) context.getSystemService("storage") : null;
        try {
            Class<?> cls = Class.forName(gu.c("SYW5kcm9pZC5vcy5zdG9yYWdlLlN0b3JhZ2VWb2x1bWU"));
            Method method = storageManager.getClass().getMethod(gu.c("FZ2V0Vm9sdW1lTGlzdA"), new Class[0]);
            Method method2 = cls.getMethod(gu.c("ZZ2V0UGF0aA"), new Class[0]);
            Method method3 = cls.getMethod(gu.c("AaXNSZW1vdmFibGUK"), new Class[0]);
            Object objInvoke = method.invoke(storageManager, new Object[0]);
            int length = Array.getLength(objInvoke);
            for (int i = 0; i < length; i++) {
                Object obj = Array.get(objInvoke, i);
                String str = (String) method2.invoke(obj, new Object[0]);
                if (!((Boolean) method3.invoke(obj, new Object[0])).booleanValue()) {
                    return str;
                }
            }
            return null;
        } catch (Throwable unused) {
            return Environment.getExternalStorageDirectory().getAbsolutePath();
        }
    }
}
