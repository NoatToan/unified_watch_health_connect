package zp0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzp0/e;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f206587a = new e();

    private e() {
    }

    public static void a(Context context, String str) {
        File[] fileArrListFiles;
        File dir = context.getDir(str, 0);
        if (dir.exists() && dir.isDirectory() && (fileArrListFiles = dir.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                file.delete();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    public static Bitmap b(Context context, String str, String str2) throws Throwable {
        FileInputStream fileInputStream;
        str2.getClass();
        context.getClass();
        File file = new File(context.getDir(str, 0), str2);
        ?? Exists = file.exists();
        ?? r14 = 0;
        try {
            if (Exists == 0) {
                a2 a2Var = a2.GENERAL;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "GCMImageStorage", "File doesn't exist");
                return null;
            }
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
                    fileInputStream.close();
                    return bitmapDecodeStream;
                } catch (Exception unused) {
                    a2 a2Var2 = a2.GENERAL;
                    i2.f36769a.getClass();
                    i2.a.b(a2Var2, "GCMImageStorage", "Error while loading image");
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                }
            } catch (Exception unused2) {
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                if (r14 != 0) {
                    r14.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            r14 = Exists;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.graphics.Bitmap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.FileOutputStream] */
    public static void c(Context context, Bitmap bitmap, String str, String str2) throws Throwable {
        Throwable th3;
        FileOutputStream fileOutputStream;
        Exception e4;
        bitmap.getClass();
        str2.getClass();
        File file = new File(context.getDir(str, 0), (String) str2);
        f206587a.getClass();
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    fileOutputStream.close();
                } catch (Exception e14) {
                    e4 = e14;
                    a2 a2Var = a2.GENERAL;
                    String strValueOf = String.valueOf(e4);
                    i2.f36769a.getClass();
                    i2.a.b(a2Var, "GCMImageStorage", strValueOf);
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
            } catch (Throwable th4) {
                th3 = th4;
                if (str2 != 0) {
                    str2.close();
                }
                throw th3;
            }
        } catch (Exception e15) {
            fileOutputStream = null;
            e4 = e15;
        } catch (Throwable th5) {
            str2 = 0;
            th3 = th5;
            if (str2 != 0) {
                str2.close();
            }
            throw th3;
        }
    }
}
