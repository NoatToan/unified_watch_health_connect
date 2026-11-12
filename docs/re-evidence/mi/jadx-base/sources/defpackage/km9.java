package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class km9 {
    public static Bitmap a(ConstraintLayout constraintLayout) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(constraintLayout.getWidth(), constraintLayout.getHeight(), Bitmap.Config.ARGB_8888);
        constraintLayout.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static String b(Context context) {
        return new File(c(context), "bodyReport.png").getPath();
    }

    public static String c(Context context) {
        String strD = d(context);
        if (strD == null) {
            return null;
        }
        File file = new File(strD);
        if (file.exists() || file.mkdirs()) {
            return strD;
        }
        return null;
    }

    public static String d(Context context) {
        return context.getExternalFilesDir(null).getAbsolutePath() + "/xiaomi/images/";
    }

    public static String e(Context context, Bitmap bitmap, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        File file = new File(d(context));
        if (!file.exists()) {
            file.mkdirs();
        }
        String str2 = d(context) + str.substring(str.lastIndexOf("/") + 1);
        File file2 = new File(str2);
        if (file2.exists()) {
            file2.delete();
        }
        if (!file2.exists()) {
            try {
                file2.createNewFile();
                fileOutputStream = new FileOutputStream(str2);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        return null;
                    }
                } catch (IOException unused2) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException unused4) {
                            return null;
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        }
        return str2;
    }
}
