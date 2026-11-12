package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.io.ByteArrayInputStream;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public class ou {
    public static Drawable b(String str, Context context) {
        return b(str, context, 480);
    }

    public static Drawable b(String str, Context context, int i) {
        ByteArrayInputStream byteArrayInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(ng.a(str));
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (i <= 0) {
                    i = 240;
                }
                options.inDensity = i;
                options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(byteArrayInputStream, null, options));
                d(byteArrayInputStream);
                return bitmapDrawable;
            } catch (Throwable unused) {
                d(byteArrayInputStream);
                return null;
            }
        } catch (Throwable unused2) {
            byteArrayInputStream = null;
        }
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
