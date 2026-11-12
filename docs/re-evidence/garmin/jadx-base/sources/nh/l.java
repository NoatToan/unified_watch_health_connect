package nh;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes7.dex */
public class l {
    public static BitmapDrawable a(Context context, String str) {
        ByteArrayInputStream byteArrayInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(ch.a.c(str));
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDensity = 480;
                options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(byteArrayInputStream, null, options));
                try {
                    byteArrayInputStream.close();
                } catch (Throwable unused) {
                }
                return bitmapDrawable;
            } catch (Throwable unused2) {
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable unused3) {
                    }
                }
                return null;
            }
        } catch (Throwable unused4) {
            byteArrayInputStream = null;
        }
    }
}
