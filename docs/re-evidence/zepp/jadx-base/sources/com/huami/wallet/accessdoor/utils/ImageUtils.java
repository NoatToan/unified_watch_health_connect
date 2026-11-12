package com.huami.wallet.accessdoor.utils;

import android.widget.ImageView;
import com.bumptech.glide.Glide;

/* JADX INFO: loaded from: classes10.dex */
public class ImageUtils {
    public static void loadImage(ImageView imageView, String str) {
        Glide.with(imageView.getContext()).load(str).into(imageView);
    }
}
