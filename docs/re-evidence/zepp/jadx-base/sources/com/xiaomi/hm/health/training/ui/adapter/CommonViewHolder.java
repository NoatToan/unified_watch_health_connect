package com.xiaomi.hm.health.training.ui.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.PluralsRes;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.utils.OtherUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes21.dex */
public class CommonViewHolder extends RecyclerView.ViewHolder {
    private SparseArray<View> a;
    private View b;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

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

    public CommonViewHolder setCircleImageByUrl(@IdRes int i, String str) {
        ImageView imageView = (ImageView) getView(i);
        Context context = this.b.getContext();
        int i2 = R.drawable.icon_error_circle_avatar;
        OtherUtils.loadWithGlideCircle(context, imageView, str, i2, i2);
        return this;
    }

    public CommonViewHolder setImageBitmap(@IdRes int i, Bitmap bitmap) {
        ((ImageView) getView(i)).setImageBitmap(bitmap);
        return this;
    }

    public CommonViewHolder setImageByUrl(@IdRes int i, String str) {
        OtherUtils.loadWithGlide(this.b.getContext(), (ImageView) getView(i), str);
        return this;
    }

    public CommonViewHolder setImageByUrlWithPressedDrawable(@IdRes int i, String str) {
        OtherUtils.loadWithGlidePressedDrawable(this.b.getContext(), (ImageView) getView(i), str);
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

    public CommonViewHolder setLayoutWidth(@IdRes int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getView(i).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i2;
        }
        return this;
    }

    public CommonViewHolder setQuantityString(@IdRes int i, @PluralsRes int i2, int i3, Object obj) {
        TextView textView = (TextView) getView(i);
        textView.setText(textView.getContext().getResources().getQuantityString(i2, i3, obj));
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

    public CommonViewHolder(View view, boolean z) {
        super(view);
        this.a = new SparseArray<>();
        if (z) {
            this.b = view;
        }
    }
}
