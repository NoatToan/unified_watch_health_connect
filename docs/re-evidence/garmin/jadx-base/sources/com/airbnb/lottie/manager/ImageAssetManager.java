package com.airbnb.lottie.manager;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import ch.qos.logback.core.net.SyslogConstants;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ImageAssetManager {
    private static final Object bitmapHashLock = new Object();
    private final Context context;
    private ImageAssetDelegate delegate;
    private final Map<String, LottieImageAsset> imageAssets;
    private final String imagesFolder;

    public ImageAssetManager(Drawable.Callback callback, String str, ImageAssetDelegate imageAssetDelegate, Map<String, LottieImageAsset> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.imagesFolder = str;
        } else {
            this.imagesFolder = str.concat("/");
        }
        this.imageAssets = map;
        setDelegate(imageAssetDelegate);
        if (callback instanceof View) {
            this.context = ((View) callback).getContext().getApplicationContext();
        } else {
            this.context = null;
        }
    }

    private Bitmap putBitmap(String str, Bitmap bitmap) {
        synchronized (bitmapHashLock) {
            this.imageAssets.get(str).setBitmap(bitmap);
        }
        return bitmap;
    }

    public Bitmap bitmapForId(String str) {
        LottieImageAsset lottieImageAsset = this.imageAssets.get(str);
        if (lottieImageAsset == null) {
            return null;
        }
        Bitmap bitmap = lottieImageAsset.getBitmap();
        if (bitmap != null) {
            return bitmap;
        }
        ImageAssetDelegate imageAssetDelegate = this.delegate;
        if (imageAssetDelegate != null) {
            Bitmap bitmapFetchBitmap = imageAssetDelegate.fetchBitmap(lottieImageAsset);
            if (bitmapFetchBitmap != null) {
                putBitmap(str, bitmapFetchBitmap);
            }
            return bitmapFetchBitmap;
        }
        Context context = this.context;
        if (context == null) {
            return null;
        }
        String fileName = lottieImageAsset.getFileName();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = SyslogConstants.LOG_LOCAL4;
        if (fileName.startsWith("data:") && fileName.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(fileName.substring(fileName.indexOf(44) + 1), 0);
                try {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                    if (bitmapDecodeByteArray != null) {
                        return putBitmap(str, Utils.resizeBitmapIfNeeded(bitmapDecodeByteArray, lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
                    }
                    Logger.warning("Decoded image `" + str + "` is null.");
                    return null;
                } catch (IllegalArgumentException e4) {
                    Logger.warning("Unable to decode image `" + str + "`.", e4);
                    return null;
                }
            } catch (IllegalArgumentException e14) {
                Logger.warning("data URL did not have correct base64 format.", e14);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.imagesFolder)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.imagesFolder + fileName), null, options);
                if (bitmapDecodeStream != null) {
                    return putBitmap(str, Utils.resizeBitmapIfNeeded(bitmapDecodeStream, lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
                }
                Logger.warning("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e15) {
                Logger.warning("Unable to decode image `" + str + "`.", e15);
                return null;
            }
        } catch (IOException e16) {
            Logger.warning("Unable to open asset.", e16);
            return null;
        }
    }

    public LottieImageAsset getImageAssetById(String str) {
        return this.imageAssets.get(str);
    }

    public boolean hasSameContext(Context context) {
        Context context2 = this.context;
        if (context == null) {
            return context2 == null;
        }
        if (context2 instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.context;
    }

    public void setDelegate(ImageAssetDelegate imageAssetDelegate) {
        this.delegate = imageAssetDelegate;
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        Map<String, LottieImageAsset> map = this.imageAssets;
        if (bitmap != null) {
            Bitmap bitmap2 = map.get(str).getBitmap();
            putBitmap(str, bitmap);
            return bitmap2;
        }
        LottieImageAsset lottieImageAsset = map.get(str);
        Bitmap bitmap3 = lottieImageAsset.getBitmap();
        lottieImageAsset.setBitmap(null);
        return bitmap3;
    }
}
