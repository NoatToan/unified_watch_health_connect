package com.huami.wallet.ui.utils;

import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.huami.wallet.ui.R;

/* JADX INFO: loaded from: classes16.dex */
public class ImageLoadUtils {
    private static void a(ImageView imageView, String str, int i) {
        RequestOptions requestOptionsPlaceholder = new RequestOptions().placeholder(R.drawable.wl_placeholder_image);
        if (i > 0) {
            requestOptionsPlaceholder = requestOptionsPlaceholder.transform(new RoundedCorners(i));
        }
        Glide.with(imageView.getContext()).load(str).apply(requestOptionsPlaceholder).into(imageView);
    }

    public static void loadImage(ImageView imageView, String str) {
        a(imageView, str, 0);
    }

    public static void loadImageInRoundRect(ImageView imageView, String str, int i) {
        a(imageView, str, i);
    }
}
