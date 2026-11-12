package com.huami.watch.companion.util;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.huami.watch.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes16.dex */
public class ImageLoader {
    private static final String a = "Util-ImageLoader";

    private static void a(RequestManager requestManager, String str, ImageView imageView, boolean z, int i, int i2) {
        Log.d(a, "Load : " + str + ", To : " + imageView + ", CropCircle : " + z + ", TargetSize : " + i2, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            requestManager.load(Integer.valueOf(i)).into(imageView);
            return;
        }
        try {
            requestManager.clear(imageView);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        RequestOptions requestOptionsDiskCacheStrategy = new RequestOptions().placeholder(i).skipMemoryCache(false).diskCacheStrategy(DiskCacheStrategy.RESOURCE);
        if (z) {
            requestOptionsDiskCacheStrategy = requestOptionsDiskCacheStrategy.optionalCircleCrop();
        }
        if (i2 > 0) {
            requestOptionsDiskCacheStrategy = requestOptionsDiskCacheStrategy.override(i2, i2);
        }
        requestManager.asBitmap().load(str).apply(requestOptionsDiskCacheStrategy).into(imageView);
    }

    public static void download(Context context, String str, Target<File> target) {
        Log.d(a, "Download : " + str, new Object[0]);
        Glide.with(context).downloadOnly().load(str).into(target);
    }

    public static void load(Fragment fragment, String str, ImageView imageView, boolean z, int i, int i2) {
        if (fragment == null || fragment.getActivity() == null || fragment.getActivity().isDestroyed() || imageView == null) {
            return;
        }
        try {
            a(Glide.with(fragment), str, imageView, z, i, i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void preload(Context context, String str) {
        Log.d(a, "Preload : " + str, new Object[0]);
        Glide.with(context).load(str).apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.ALL)).preload();
    }

    public static void load(Activity activity, String str, ImageView imageView, boolean z, int i, int i2) {
        if (activity == null || activity.isDestroyed() || imageView == null) {
            return;
        }
        try {
            a(Glide.with(activity), str, imageView, z, i, i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
