package com.xiaomi.smarthome.library.common.imagecache;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class ImageCacheUtils {
    public static final int IO_BUFFER_SIZE = 8192;

    private ImageCacheUtils() {
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void disableConnectionReuseIfNecessary() {
        if (hasHttpConnectionBug()) {
            System.setProperty("http.keepAlive", "false");
        }
    }

    @SuppressLint({"NewApi"})
    public static int getBitmapSize(Bitmap bitmap) {
        return bitmap.getByteCount();
    }

    @SuppressLint({"NewApi"})
    public static File getExternalCacheDir(Context context) {
        File externalCacheDir;
        if (hasExternalCacheDir() && (externalCacheDir = context.getExternalCacheDir()) != null) {
            return externalCacheDir;
        }
        return new File(Environment.getExternalStorageDirectory().getPath() + ("/Android/data/" + context.getPackageName() + "/cache/"));
    }

    public static int getMemoryClass(Context context) {
        return ((ActivityManager) context.getSystemService(LifecycleConstantKt.TYPE_ACTIVITY)).getMemoryClass();
    }

    @SuppressLint({"NewApi"})
    public static long getUsableSpace(File file) {
        return file.getUsableSpace();
    }

    public static boolean hasExternalCacheDir() {
        return true;
    }

    public static boolean hasHttpConnectionBug() {
        return false;
    }

    @SuppressLint({"NewApi"})
    public static boolean isExternalStorageRemovable() {
        return Environment.isExternalStorageRemovable();
    }
}
