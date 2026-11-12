package com.xiaomi.hm.health.calendar.adapter;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes20.dex */
public class CommonViewHolder extends RecyclerView.ViewHolder {
    private SparseArray<View> a;
    private View b;

    public CommonViewHolder(View view) {
        super(view);
        this.a = new SparseArray<>();
        this.b = view;
    }

    public <T extends View> T getView(@IdRes int i) {
        T t = (T) this.a.get(i);
        if (t == null) {
            t = (T) this.b.findViewById(i);
            if (t == null) {
                throw new IllegalArgumentException("can not find view by Id:" + i);
            }
            this.a.put(i, t);
        }
        return t;
    }

    public CommonViewHolder setBackground(@IdRes int i, Drawable drawable) {
        getView(i).setBackground(drawable);
        return this;
    }

    public CommonViewHolder setBackgroundColor(@IdRes int i, @ColorInt int i2) {
        getView(i).setBackgroundColor(i2);
        return this;
    }

    public CommonViewHolder setBackgroundResource(@IdRes int i, @DrawableRes int i2) {
        getView(i).setBackgroundResource(i2);
        return this;
    }

    public CommonViewHolder setChecked(@IdRes int i, boolean z) {
        ((CompoundButton) getView(i)).setChecked(z);
        return this;
    }

    public CommonViewHolder setImageBitmap(@IdRes int i, Bitmap bitmap) {
        ((ImageView) getView(i)).setImageBitmap(bitmap);
        return this;
    }

    public CommonViewHolder setImageDrawable(@IdRes int i, Drawable drawable) {
        ((ImageView) getView(i)).setImageDrawable(drawable);
        return this;
    }

    public CommonViewHolder setImageResource(@IdRes int i, @DrawableRes int i2) {
        ((ImageView) getView(i)).setImageResource(i2);
        return this;
    }

    public CommonViewHolder setRating(@IdRes int i, float f) {
        ((RatingBar) getView(i)).setRating(f);
        return this;
    }

    public CommonViewHolder setText(@IdRes int i, String str) {
        ((TextView) getView(i)).setText(str);
        return this;
    }

    public CommonViewHolder setTextColor(@IdRes int i, @ColorInt int i2) {
        ((TextView) getView(i)).setTextColor(i2);
        return this;
    }

    public CommonViewHolder setTextColorRes(@IdRes int i, @ColorRes int i2) {
        TextView textView = (TextView) getView(i);
        textView.setTextColor(ContextCompat.getColor(textView.getContext(), i2));
        return this;
    }

    public CommonViewHolder setVisibility(@IdRes int i, int i2) {
        getView(i).setVisibility(i2);
        return this;
    }
}
