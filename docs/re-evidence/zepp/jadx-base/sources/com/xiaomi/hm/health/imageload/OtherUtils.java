package com.xiaomi.hm.health.imageload;

import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: loaded from: classes21.dex */
@Deprecated
public class OtherUtils {
    private static int a;
    private static int b;

    static {
        int i = R.drawable.img_default_gray;
        a = i;
        b = i;
    }

    public static void loadWithGlide(Context context, ImageView imageView, String str) {
        try {
            HMImageLoader.with(context).load(str).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL).placeholder(a).error(b).crossFade().centerCrop().into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loadWithGlideCircle(Context context, ImageView imageView, String str, @DrawableRes int i, @DrawableRes int i2) {
        try {
            HMImageLoader.with(context).load(str).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL).placeholder(i).error(i2).crossFade().centerCrop().transform(new GlideCircleTransform()).into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loadWithGlideListener(Context context, ImageView imageView, String str, @DrawableRes int i, @DrawableRes int i2, HMLoadListener hMLoadListener) {
        try {
            HMImageLoader.with(context).load(str).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL).placeholder(i).error(i2).crossFade().fitCenter().listener(hMLoadListener).into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loadWithGlidePressedDrawable(Context context, ImageView imageView, String str) {
        try {
            HMImageLoader.with(context).load(str).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL).placeholder(a).error(b).crossFade().centerCrop().into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loadWithGlideRound(Context context, ImageView imageView, String str, int i, @DrawableRes int i2, @DrawableRes int i3) {
        try {
            HMImageLoader.with(context).load(str).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL).placeholder(i2).error(i3).crossFade().centerCrop().transform(new GlideRoundTransform(i)).into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setDefaultPlaceHolder(@Nullable @DrawableRes Integer num, @Nullable @DrawableRes Integer num2) {
        if (num != null) {
            a = num.intValue();
        }
        if (num2 != null) {
            b = num2.intValue();
        }
    }

    public static void loadWithGlide(Context context, ImageView imageView, String str, @DrawableRes int i, @DrawableRes int i2) {
        try {
            HMImageLoader.with(context).load(str).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL).placeholder(i).error(i2).crossFade().fitCenter().into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loadWithGlideCircle(Context context, ImageView imageView, String str) {
        try {
            HMImageLoader.with(context).load(str).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL).crossFade().centerCrop().transform(new GlideCircleTransform()).into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loadWithGlideCircle(Context context, ImageView imageView, File file) {
        try {
            HMImageLoader.with(context).load(file).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL).crossFade().centerCrop().transform(new GlideCircleTransform()).into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
