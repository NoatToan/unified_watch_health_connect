package com.unionpay.util;

import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

/* JADX INFO: loaded from: classes18.dex */
public class UnionImageLoadUtils {
    public static void loadImage(ImageView imageView, String str, @DrawableRes int i) {
        loadImageInternal(imageView, str, 0, i);
    }

    public static void loadImageInternal(ImageView imageView, String str, int i, @DrawableRes int i2) {
        RequestOptions requestOptionsPlaceholder = new RequestOptions().placeholder(i2);
        if (i > 0) {
            requestOptionsPlaceholder = requestOptionsPlaceholder.transform(new RoundedCorners(i));
        }
        Glide.with(imageView.getContext()).load(str).apply(requestOptionsPlaceholder).into(imageView);
    }
}
