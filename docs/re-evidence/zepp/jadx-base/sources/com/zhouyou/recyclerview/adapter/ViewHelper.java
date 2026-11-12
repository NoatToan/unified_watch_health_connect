package com.zhouyou.recyclerview.adapter;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.Adapter;

/* JADX INFO: loaded from: classes22.dex */
public interface ViewHelper<VH> {

    public interface RecyclerView<VH extends BaseRecyclerViewHolder> {
        VH linkify(int i);

        VH setAdapter(int i, Adapter adapter);

        VH setAdapter(int i, androidx.recyclerview.widget.RecyclerView.Adapter adapter);

        VH setAlpha(int i, float f);

        VH setBackgroundColor(int i, int i2);

        VH setBackgroundColorRes(int i, int i2);

        VH setChecked(int i, boolean z);

        VH setImageBitmap(int i, Bitmap bitmap);

        VH setImageDrawable(int i, Drawable drawable);

        VH setImageDrawableRes(int i, int i2);

        VH setImageResource(int i, int i2);

        VH setImageUrl(int i, String str);

        VH setMax(int i, int i2);

        VH setProgress(int i, int i2);

        VH setProgress(int i, int i2, int i3);

        VH setRating(int i, float f);

        VH setRating(int i, float f, int i2);

        VH setTag(int i, int i2, Object obj);

        VH setTag(int i, Object obj);

        VH setText(int i, String str);

        VH setTextColor(int i, int i2);

        VH setTextColorRes(int i, int i2);

        VH setTypeface(int i, Typeface typeface);

        VH setTypeface(Typeface typeface, int... iArr);

        VH setVisible(int i, boolean z);
    }
}
