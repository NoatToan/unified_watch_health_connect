package com.huami.watchfacesstore.view.recycleview;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes17.dex */
interface a<VH> {
    VH addLinks(@IdRes int viewId, int mask);

    View getConvertView();

    <T extends View> T getView(@IdRes int viewId);

    VH linkify(@IdRes int viewId);

    <T extends Adapter> VH setAdapter(@IdRes int viewId, @NonNull T adapter);

    <T extends RecyclerView.ViewHolder> VH setAdapter(@IdRes int viewId, @NonNull RecyclerView.Adapter<T> adapter);

    VH setAlpha(@IdRes int viewId, @FloatRange(from = 0.0d, to = 1.0d) float value);

    VH setBackgroundColor(@IdRes int viewId, @ColorInt int color);

    VH setBackgroundDrawable(@IdRes int viewId, Drawable background);

    VH setBackgroundRes(@IdRes int viewId, @DrawableRes int backgroundRes);

    VH setChecked(@IdRes int viewId, boolean checked);

    VH setColorFilter(@IdRes int viewId, @ColorInt int color);

    VH setColorFilter(@IdRes int viewId, ColorFilter colorFilter);

    VH setCompoundDrawables(@IdRes int viewId, @DrawableRes int left, @DrawableRes int top, @DrawableRes int right, @DrawableRes int bottom);

    VH setEnabled(@IdRes int viewId, boolean enabled);

    VH setImageBitmap(@IdRes int viewId, @NonNull Bitmap bitmap);

    VH setImageByUrl(@IdRes int viewId, @DrawableRes int defaultResId, String imageUrl);

    VH setImageByUrl(@IdRes int viewId, String imageUrl);

    VH setImageDrawable(@IdRes int viewId, @Nullable Drawable drawable);

    VH setImageResource(@IdRes int viewId, @DrawableRes int imageResId);

    VH setMax(@IdRes int viewId, int max);

    VH setMaxLines(@IdRes int viewId, @IntRange(from = 1) int line);

    VH setMovementMethod(int viewId, MovementMethod method);

    VH setOnClickListener(@IdRes int viewId, View.OnClickListener listener);

    VH setOnItemClickListener(@IdRes int viewId, AdapterView.OnItemClickListener listener);

    VH setOnItemLongClickListener(@IdRes int viewId, AdapterView.OnItemLongClickListener listener);

    VH setOnItemSelectedListener(@IdRes int viewId, AdapterView.OnItemSelectedListener listener);

    VH setOnLongClickListener(@IdRes int viewId, View.OnLongClickListener listener);

    VH setOnTouchListener(@IdRes int viewId, View.OnTouchListener listener);

    VH setProgress(@IdRes int viewId, int progress);

    VH setProgress(@IdRes int viewId, int progress, int max);

    VH setRating(@IdRes int viewId, float rating);

    VH setRating(@IdRes int viewId, float rating, int max);

    VH setTag(@IdRes int viewId, int key, Object tag);

    VH setTag(@IdRes int viewId, Object tag);

    VH setText(@IdRes int viewId, CharSequence text);

    VH setTextColor(@IdRes int viewId, @ColorInt int textColor);

    VH setTextColor(int viewId, ColorStateList colorStateList);

    VH setTextColorRes(@IdRes int viewId, @ColorRes int textColorRes);

    @TargetApi(23)
    VH setTextColorRes(@IdRes int viewId, @ColorRes int textColorRes, @Nullable Resources.Theme theme);

    VH setTypeface(@IdRes int viewId, Typeface typeface);

    VH setTypeface(Typeface typeface, @IdRes int... viewIds);

    VH setVisible(@IdRes int viewId, boolean visible);
}
