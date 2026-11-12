package com.huami.watchfacesstore.view.recycleview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.MovementMethod;
import android.text.util.Linkify;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public class ViewHolder extends RecyclerView.ViewHolder implements com.huami.watchfacesstore.view.recycleview.a<ViewHolder> {
    private final SparseArray<View> a;
    private final View b;
    private final Context c;

    @LayoutRes
    private int d;
    private Object e;
    private a f;

    public interface a {
        void onViewHolderInit(@NotNull View itemView, @LayoutRes int layoutRes);
    }

    private ViewHolder(View itemView, @LayoutRes int layoutRes, a listener) {
        super(itemView);
        this.b = itemView;
        this.d = layoutRes;
        this.c = itemView.getContext();
        this.a = new SparseArray<>();
        itemView.setTag(this);
        this.f = listener;
        if (listener != null) {
            listener.onViewHolderInit(itemView, this.d);
        }
    }

    public static ViewHolder a(View convertView, LayoutInflater inflater, ViewGroup parent, @LayoutRes int layoutRes, a listener) {
        if (convertView == null) {
            return b(inflater, parent, layoutRes, listener);
        }
        ViewHolder viewHolder = (ViewHolder) convertView.getTag();
        return viewHolder.d != layoutRes ? b(inflater, parent, layoutRes, listener) : viewHolder;
    }

    @NonNull
    private static ViewHolder b(LayoutInflater inflater, ViewGroup parent, @LayoutRes int layoutRes, a listener) {
        return new ViewHolder(inflater.inflate(layoutRes, parent, false), layoutRes, listener);
    }

    public Object getAssociatedObject() {
        return this.e;
    }

    @Override // com.huami.watchfacesstore.view.recycleview.a
    public View getConvertView() {
        return this.b;
    }

    @Override // com.huami.watchfacesstore.view.recycleview.a
    public <T extends View> T getView(@IdRes int i) {
        T t = (T) this.a.get(i);
        if (t != null) {
            return t;
        }
        T t2 = (T) this.b.findViewById(i);
        this.a.put(i, t2);
        return t2;
    }

    public void setAssociatedObject(Object associatedObject) {
        this.e = associatedObject;
    }

    public void setViewHolderListener(a viewHolderListener) {
        this.f = viewHolderListener;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder addLinks(@IdRes int viewId, int mask) {
        Linkify.addLinks((TextView) getView(viewId), mask);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder linkify(@IdRes int viewId) {
        Linkify.addLinks((TextView) getView(viewId), 15);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setAlpha(@IdRes int viewId, @FloatRange(from = 0.0d, to = 1.0d) float value) {
        getView(viewId).setAlpha(value);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setBackgroundColor(@IdRes int viewId, @ColorInt int color) {
        getView(viewId).setBackgroundColor(color);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setBackgroundDrawable(@IdRes int viewId, Drawable background) {
        ViewCompat.setBackground(getView(viewId), background);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setBackgroundRes(@IdRes int viewId, @DrawableRes int backgroundRes) {
        getView(viewId).setBackgroundResource(backgroundRes);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setChecked(@IdRes int viewId, boolean checked) {
        ((Checkable) getView(viewId)).setChecked(checked);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setCompoundDrawables(@DrawableRes int viewId, @DrawableRes int left, @DrawableRes int top, @DrawableRes int right, int bottom) {
        ((TextView) getView(viewId)).setCompoundDrawablesWithIntrinsicBounds(left, top, right, bottom);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setEnabled(@IdRes int viewId, boolean enabled) {
        getView(viewId).setEnabled(enabled);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setImageBitmap(@IdRes int viewId, @NonNull Bitmap bitmap) {
        ((ImageView) getView(viewId)).setImageBitmap(bitmap);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setImageDrawable(@IdRes int viewId, @Nullable Drawable drawable) {
        ((ImageView) getView(viewId)).setImageDrawable(drawable);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setImageResource(@IdRes int viewId, @DrawableRes int imageResId) {
        ((ImageView) getView(viewId)).setImageResource(imageResId);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setMax(@IdRes int viewId, int max) {
        ((ProgressBar) getView(viewId)).setMax(max);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setMaxLines(@IdRes int viewId, @IntRange(from = 1) int line) {
        ((TextView) getView(viewId)).setMaxLines(line);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setMovementMethod(@IdRes int viewId, MovementMethod method) {
        ((TextView) getView(viewId)).setMovementMethod(method);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setOnClickListener(@IdRes int viewId, View.OnClickListener listener) {
        getView(viewId).setOnClickListener(listener);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setOnItemClickListener(@IdRes int viewId, AdapterView.OnItemClickListener listener) {
        ((AdapterView) getView(viewId)).setOnItemClickListener(listener);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setOnItemLongClickListener(@IdRes int viewId, AdapterView.OnItemLongClickListener listener) {
        ((AdapterView) getView(viewId)).setOnItemLongClickListener(listener);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setOnItemSelectedListener(@IdRes int viewId, AdapterView.OnItemSelectedListener listener) {
        ((AdapterView) getView(viewId)).setOnItemSelectedListener(listener);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setOnLongClickListener(@IdRes int viewId, View.OnLongClickListener listener) {
        getView(viewId).setOnLongClickListener(listener);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setOnTouchListener(@IdRes int viewId, View.OnTouchListener listener) {
        getView(viewId).setOnTouchListener(listener);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setText(@IdRes int viewId, CharSequence text) {
        ((TextView) getView(viewId)).setText(text);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setVisible(@IdRes int viewId, boolean visible) {
        getView(viewId).setVisibility(visible ? 0 : 8);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public <T extends Adapter> ViewHolder setAdapter(int viewId, @NonNull T adapter) {
        ((AdapterView) getView(viewId)).setAdapter(adapter);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setColorFilter(@IdRes int viewId, ColorFilter colorFilter) {
        ((ImageView) getView(viewId)).setColorFilter(colorFilter);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setImageByUrl(@IdRes int viewId, String imageUrl) {
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setProgress(@IdRes int viewId, int progress) {
        ((ProgressBar) getView(viewId)).setProgress(progress);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setRating(@IdRes int viewId, float rating) {
        ((RatingBar) getView(viewId)).setRating(rating);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setTag(@IdRes int viewId, Object tag) {
        getView(viewId).setTag(tag);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setTextColor(@IdRes int viewId, @ColorInt int textColor) {
        ((TextView) getView(viewId)).setTextColor(textColor);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setTextColorRes(@IdRes int viewId, @ColorRes int textColorRes) {
        ((TextView) getView(viewId)).setTextColor(ContextCompat.getColor(this.c, textColorRes));
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setTypeface(@IdRes int viewId, Typeface typeface) {
        TextView textView = (TextView) getView(viewId);
        textView.setTypeface(typeface);
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setImageByUrl(@IdRes int viewId, @DrawableRes int defaultResId, String imageUrl) {
        return this;
    }

    public ViewHolder setText(@IdRes int viewId, @StringRes int resId) {
        ((TextView) getView(viewId)).setText(resId);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setAdapter(@IdRes int viewId, @NonNull RecyclerView.Adapter adapter) {
        ((RecyclerView) getView(viewId)).setAdapter(adapter);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setColorFilter(@IdRes int viewId, @ColorInt int color) {
        ((ImageView) getView(viewId)).setColorFilter(color);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setProgress(@IdRes int viewId, int progress, int max) {
        ProgressBar progressBar = (ProgressBar) getView(viewId);
        progressBar.setMax(max);
        progressBar.setProgress(progress);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setRating(@IdRes int viewId, float rating, int max) {
        RatingBar ratingBar = (RatingBar) getView(viewId);
        ratingBar.setMax(max);
        ratingBar.setRating(rating);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setTag(@IdRes int viewId, int key, Object tag) {
        if (tag != null) {
            getView(viewId).setTag(key, tag);
        }
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setTextColor(@IdRes int viewId, ColorStateList colorStateList) {
        ((TextView) getView(viewId)).setTextColor(colorStateList);
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    @RequiresApi(api = 23)
    public ViewHolder setTextColorRes(@IdRes int viewId, @ColorRes int textColorRes, @Nullable Resources.Theme theme) {
        ((TextView) getView(viewId)).setTextColor(this.c.getResources().getColor(textColorRes, null));
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.huami.watchfacesstore.view.recycleview.a
    public ViewHolder setTypeface(Typeface typeface, @IdRes int... viewIds) {
        for (int i : viewIds) {
            TextView textView = (TextView) getView(i);
            textView.setTypeface(typeface);
            textView.setPaintFlags(textView.getPaintFlags() | 128);
        }
        return this;
    }
}
