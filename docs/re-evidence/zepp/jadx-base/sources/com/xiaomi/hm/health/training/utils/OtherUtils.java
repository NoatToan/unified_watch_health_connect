package com.xiaomi.hm.health.training.utils;

import android.content.Context;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.xiaomi.hm.health.imageload.DisplayConfig;
import com.xiaomi.hm.health.imageload.GlideCircleTransform;
import com.xiaomi.hm.health.imageload.GlideRoundTransform;
import com.xiaomi.hm.health.imageload.HMImageLoader;
import com.xiaomi.hm.health.imageload.HMLoadListener;
import com.xiaomi.hm.health.training.R;
import java.io.File;

/* JADX INFO: loaded from: classes22.dex */
public class OtherUtils {
    private static void a(ImageView imageView, String str, int i) {
        RequestOptions requestOptionsPlaceholder = new RequestOptions().placeholder(R.drawable.tr_placeholder_image);
        if (i > 0) {
            requestOptionsPlaceholder = requestOptionsPlaceholder.transform(new RoundedCorners(i));
        }
        Glide.with(imageView.getContext()).load(str).apply(requestOptionsPlaceholder).into(imageView);
    }

    public static void loadImageInRoundRect(ImageView imageView, String str, int i) {
        a(imageView, str, i);
    }

    public static void loadWithGlide(Context context, ImageView imageView, String str) {
        try {
            DisplayConfig.ConfigBuilder configBuilderDiskCacheStrategy = HMImageLoader.with(context).load(str).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL);
            int i = R.drawable.img_default_gray;
            configBuilderDiskCacheStrategy.placeholder(i).error(i).crossFade().centerCrop().into(imageView);
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

    public static void loadWithGlideNotCrop(Context context, ImageView imageView, String str) {
        try {
            DisplayConfig.ConfigBuilder configBuilderDiskCacheStrategy = HMImageLoader.with(context).load(str).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL);
            int i = R.drawable.img_default_gray;
            configBuilderDiskCacheStrategy.placeholder(i).error(i).crossFade().into(imageView);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loadWithGlidePressedDrawable(Context context, ImageView imageView, String str) {
        try {
            DisplayConfig.ConfigBuilder configBuilderDiskCacheStrategy = HMImageLoader.with(context).load(str).diskCacheStrategy(DisplayConfig.ConfigBuilder.DiskCacheStrategy.ALL);
            int i = R.drawable.img_default_gray;
            configBuilderDiskCacheStrategy.placeholder(i).error(i).crossFade().centerCrop().into(imageView);
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
