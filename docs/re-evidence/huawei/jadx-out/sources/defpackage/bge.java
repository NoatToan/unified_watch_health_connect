package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes23.dex */
public class bge {
    public static void e(File file, String str, Bitmap bitmap) throws IOException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file.getCanonicalFile(), str));
            try {
                if (!bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream)) {
                    throw new IOException("compress bitmap failed");
                }
                fileOutputStream.close();
                return;
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            Log.e("FileUtils", "save bitmap failed, file name: " + str);
            throw e;
        }
        Log.e("FileUtils", "save bitmap failed, file name: " + str);
        throw e;
    }

    public static Bitmap e(File file, String str) throws IOException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            return (Bitmap) Optional.ofNullable(BitmapFactory.decodeFile(file.getCanonicalFile() + File.separator + str, options)).orElseThrow(new Supplier() { // from class: bgc
                @Override // java.util.function.Supplier
                public final Object get() {
                    return bge.b();
                }
            });
        } catch (IOException e) {
            Log.e("FileUtils", "load bitmap failed, file name: " + str);
            throw e;
        }
    }

    static /* synthetic */ IOException b() {
        return new IOException("image data could not be decoded");
    }
}
