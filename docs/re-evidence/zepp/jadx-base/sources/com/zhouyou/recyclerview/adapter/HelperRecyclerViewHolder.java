package com.zhouyou.recyclerview.adapter;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.text.util.Linkify;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes22.dex */
public class HelperRecyclerViewHolder extends BaseRecyclerViewHolder implements ViewHelper.RecyclerView<HelperRecyclerViewHolder> {
    public HelperRecyclerViewHolder(View view, int i) {
        super(view, i);
    }

    public HelperRecyclerViewHolder setOnClickListener(int i, View.OnClickListener onClickListener) {
        getView(i).setOnClickListener(onClickListener);
        return this;
    }

    public HelperRecyclerViewHolder setOnLongClickListener(int i, View.OnLongClickListener onLongClickListener) {
        getView(i).setOnLongClickListener(onLongClickListener);
        return this;
    }

    public HelperRecyclerViewHolder setOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        getView(i).setOnTouchListener(onTouchListener);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder linkify(int i) {
        Linkify.addLinks((TextView) getView(i), 15);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setAlpha(int i, float f) {
        if (Build.VERSION.SDK_INT >= 11) {
            getView(i).setAlpha(f);
        } else {
            AlphaAnimation alphaAnimation = new AlphaAnimation(f, f);
            alphaAnimation.setDuration(0L);
            alphaAnimation.setFillAfter(true);
            getView(i).startAnimation(alphaAnimation);
        }
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setBackgroundColor(int i, int i2) {
        getView(i).setBackgroundColor(i2);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setBackgroundColorRes(int i, int i2) {
        getView(i).setBackgroundResource(i2);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setChecked(int i, boolean z) {
        ((Checkable) getView(i)).setChecked(z);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setImageBitmap(int i, Bitmap bitmap) {
        ((ImageView) getView(i)).setImageBitmap(bitmap);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setImageDrawable(int i, Drawable drawable) {
        ((ImageView) getView(i)).setImageDrawable(drawable);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setImageDrawableRes(int i, int i2) {
        return setImageDrawable(i, this.itemView.getResources().getDrawable(i2));
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setImageResource(int i, int i2) {
        ((ImageView) getView(i)).setImageResource(i2);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setImageUrl(int i, String str) {
        ImageView imageView = (ImageView) getView(i);
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        imageView.setImageURI(Uri.parse(str));
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setMax(int i, int i2) {
        ((ProgressBar) getView(i)).setMax(i2);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setText(int i, String str) {
        ((TextView) getView(i)).setText(str);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setTextColor(int i, int i2) {
        ((TextView) getView(i)).setTextColor(i2);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setTextColorRes(int i, int i2) {
        ((TextView) getView(i)).setTextColor(this.itemView.getResources().getColor(i2));
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setVisible(int i, boolean z) {
        getView(i).setVisibility(z ? 0 : 8);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setAdapter(int i, Adapter adapter) {
        ((AdapterView) getView(i)).setAdapter(adapter);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setProgress(int i, int i2) {
        ((ProgressBar) getView(i)).setProgress(i2);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setRating(int i, float f) {
        ((RatingBar) getView(i)).setRating(f);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setTag(int i, Object obj) {
        getView(i).setTag(obj);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setTypeface(int i, Typeface typeface) {
        TextView textView = (TextView) getView(i);
        textView.setTypeface(typeface);
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setAdapter(int i, RecyclerView.Adapter adapter) {
        ((RecyclerView) getView(i)).setAdapter(adapter);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setProgress(int i, int i2, int i3) {
        ProgressBar progressBar = (ProgressBar) getView(i);
        progressBar.setMax(i3);
        progressBar.setProgress(i2);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setRating(int i, float f, int i2) {
        RatingBar ratingBar = (RatingBar) getView(i);
        ratingBar.setMax(i2);
        ratingBar.setRating(f);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setTag(int i, int i2, Object obj) {
        getView(i).setTag(i2, obj);
        return this;
    }

    @Override // com.zhouyou.recyclerview.adapter.ViewHelper.RecyclerView
    public HelperRecyclerViewHolder setTypeface(Typeface typeface, int... iArr) {
        for (int i : iArr) {
            TextView textView = (TextView) getView(i);
            textView.setTypeface(typeface);
            textView.setPaintFlags(textView.getPaintFlags() | 128);
        }
        return this;
    }
}
