package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class t2d {
    public static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34231b;
    public final Map<String, mte> c;

    public t2d(Drawable.Callback callback, String str, s2d s2dVar, Map<String, mte> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f34231b = str;
        } else {
            this.f34231b = str + '/';
        }
        this.c = map;
        d(s2dVar);
        if (callback instanceof View) {
            this.f34230a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f34230a = null;
        }
    }

    public Bitmap a(String str) {
        mte mteVar = this.c.get(str);
        if (mteVar == null) {
            return null;
        }
        Bitmap bitmapA = mteVar.a();
        if (bitmapA != null) {
            return bitmapA;
        }
        Context context = this.f34230a;
        if (context == null) {
            return null;
        }
        String strB = mteVar.b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strB.startsWith("data:") && strB.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strB.substring(strB.indexOf(44) + 1), 0);
                return c(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException e) {
                rpe.d("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f34231b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f34231b + strB), null, options);
                if (bitmapDecodeStream != null) {
                    return c(str, emq.l(bitmapDecodeStream, mteVar.e(), mteVar.c()));
                }
                rpe.c("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e2) {
                rpe.d("Unable to decode image `" + str + "`.", e2);
                return null;
            }
        } catch (IOException e3) {
            rpe.d("Unable to open asset.", e3);
            return null;
        }
    }

    public boolean b(Context context) {
        return (context == null && this.f34230a == null) || this.f34230a.equals(context);
    }

    public final Bitmap c(String str, Bitmap bitmap) {
        synchronized (d) {
            this.c.get(str).f(bitmap);
        }
        return bitmap;
    }

    public void d(s2d s2dVar) {
    }
}
