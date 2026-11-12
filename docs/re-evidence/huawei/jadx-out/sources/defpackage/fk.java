package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.ImageAssetDelegate;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class fk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f34123c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, ed> f34124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34125b;
    private final Context d;
    private ImageAssetDelegate e;

    public fk(Drawable.Callback callback, String str, ImageAssetDelegate imageAssetDelegate, Map<String, ed> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f34125b = str + '/';
        } else {
            this.f34125b = str;
        }
        this.f34124a = map;
        b(imageAssetDelegate);
        if (!(callback instanceof View)) {
            this.d = null;
        } else {
            this.d = ((View) callback).getContext().getApplicationContext();
        }
    }

    public void b(ImageAssetDelegate imageAssetDelegate) {
        this.e = imageAssetDelegate;
    }

    public Bitmap d(String str) {
        ed edVar = this.f34124a.get(str);
        if (edVar == null) {
            return null;
        }
        Bitmap bitmapA = edVar.a();
        if (bitmapA != null) {
            return bitmapA;
        }
        ImageAssetDelegate imageAssetDelegate = this.e;
        if (imageAssetDelegate != null) {
            Bitmap bitmapFetchBitmap = imageAssetDelegate.fetchBitmap(edVar);
            if (bitmapFetchBitmap != null) {
                a(str, bitmapFetchBitmap);
            }
            return bitmapFetchBitmap;
        }
        Context context = this.d;
        if (context == null) {
            return null;
        }
        String strD = edVar.d();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strD.startsWith("data:") && strD.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strD.substring(strD.indexOf(44) + 1), 0);
                return a(str, je.d(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), edVar.c(), edVar.e()));
            } catch (IllegalArgumentException e) {
                iy.b("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f34125b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f34125b + strD), null, options);
                if (bitmapDecodeStream == null) {
                    iy.d("Decoded image `" + str + "` is null.");
                    return null;
                }
                return a(str, je.d(bitmapDecodeStream, edVar.c(), edVar.e()));
            } catch (IllegalArgumentException e2) {
                iy.b("Unable to decode image `" + str + "`.", e2);
                return null;
            }
        } catch (IOException e3) {
            iy.b("Unable to open asset.", e3);
            return null;
        }
    }

    public boolean b(Context context) {
        if (this.d instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.d;
    }

    private Bitmap a(String str, Bitmap bitmap) {
        synchronized (f34123c) {
            this.f34124a.get(str).c(bitmap);
        }
        return bitmap;
    }
}
