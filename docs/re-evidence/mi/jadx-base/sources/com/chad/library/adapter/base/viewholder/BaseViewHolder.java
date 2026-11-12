package com.chad.library.adapter.base.viewholder;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.onetrack.api.c;
import defpackage.sk5;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00100\u001a\u00020\u0006¢\u0006\u0004\b1\u00102J\u001b\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u0006*\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0010\u001a\u0004\u0018\u00010\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0013J#\u0010\u0015\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J#\u0010\u0017\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0013J#\u0010\u0019\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0013J#\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010\u0013J#\u0010$\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0013J!\u0010'\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010)\u001a\u00020%H\u0016¢\u0006\u0004\b*\u0010(J!\u0010,\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\b2\u0006\u0010+\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010(R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroidx/databinding/ViewDataBinding;", c.f13755a, "getBinding", "()Landroidx/databinding/ViewDataBinding;", "Landroid/view/View;", "T", "", "viewId", "getView", "(I)Landroid/view/View;", "getViewOrNull", "findView", "", "value", "setText", "(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "strId", "(II)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "color", "setTextColor", "colorRes", "setTextColorRes", "imageResId", "setImageResource", "Landroid/graphics/drawable/Drawable;", "drawable", "setImageDrawable", "(ILandroid/graphics/drawable/Drawable;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroid/graphics/Bitmap;", "bitmap", "setImageBitmap", "(ILandroid/graphics/Bitmap;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "setBackgroundColor", "backgroundRes", "setBackgroundResource", "", "isVisible", "setVisible", "(IZ)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "isGone", "setGone", "isEnabled", "setEnabled", "Landroid/util/SparseArray;", "views", "Landroid/util/SparseArray;", "view", "<init>", "(Landroid/view/View;)V", "com.github.CymChad.brvah"}, k = 1, mv = {1, 4, 0})
public class BaseViewHolder extends RecyclerView.d0 {
    private final SparseArray<View> views;

    public BaseViewHolder(@NotNull View view) {
        super(view);
        this.views = new SparseArray<>();
    }

    @Nullable
    public <T extends View> T findView(int i) {
        return (T) this.itemView.findViewById(i);
    }

    @Deprecated(message = "Please use BaseDataBindingHolder class", replaceWith = @ReplaceWith(expression = "DataBindingUtil.getBinding(itemView)", imports = {"androidx.databinding.DataBindingUtil"}))
    @Nullable
    public <B extends ViewDataBinding> B getBinding() {
        return (B) sk5.h(this.itemView);
    }

    @NotNull
    public <T extends View> T getView(int viewId) {
        T t = (T) getViewOrNull(viewId);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(("No view found with id " + viewId).toString());
    }

    @Nullable
    public <T extends View> T getViewOrNull(int viewId) {
        T t;
        T t2 = (T) this.views.get(viewId);
        if (t2 == null && (t = (T) this.itemView.findViewById(viewId)) != null) {
            this.views.put(viewId, t);
            return t;
        }
        if (t2 instanceof View) {
            return t2;
        }
        return null;
    }

    @NotNull
    public BaseViewHolder setBackgroundColor(int viewId, int color) {
        getView(viewId).setBackgroundColor(color);
        return this;
    }

    @NotNull
    public BaseViewHolder setBackgroundResource(int viewId, int backgroundRes) {
        getView(viewId).setBackgroundResource(backgroundRes);
        return this;
    }

    @NotNull
    public BaseViewHolder setEnabled(int viewId, boolean isEnabled) {
        getView(viewId).setEnabled(isEnabled);
        return this;
    }

    @NotNull
    public BaseViewHolder setGone(int viewId, boolean isGone) {
        getView(viewId).setVisibility(isGone ? 8 : 0);
        return this;
    }

    @NotNull
    public BaseViewHolder setImageBitmap(int viewId, @Nullable Bitmap bitmap) {
        ((ImageView) getView(viewId)).setImageBitmap(bitmap);
        return this;
    }

    @NotNull
    public BaseViewHolder setImageDrawable(int viewId, @Nullable Drawable drawable) {
        ((ImageView) getView(viewId)).setImageDrawable(drawable);
        return this;
    }

    @NotNull
    public BaseViewHolder setImageResource(int viewId, int imageResId) {
        ((ImageView) getView(viewId)).setImageResource(imageResId);
        return this;
    }

    @NotNull
    public BaseViewHolder setText(int viewId, @Nullable CharSequence value) {
        ((TextView) getView(viewId)).setText(value);
        return this;
    }

    @NotNull
    public BaseViewHolder setTextColor(int viewId, int color) {
        ((TextView) getView(viewId)).setTextColor(color);
        return this;
    }

    @NotNull
    public BaseViewHolder setTextColorRes(int viewId, int colorRes) {
        TextView textView = (TextView) getView(viewId);
        View itemView = this.itemView;
        Intrinsics.checkExpressionValueIsNotNull(itemView, "itemView");
        textView.setTextColor(itemView.getResources().getColor(colorRes));
        return this;
    }

    @NotNull
    public BaseViewHolder setVisible(int viewId, boolean isVisible) {
        getView(viewId).setVisibility(isVisible ? 0 : 4);
        return this;
    }

    @Nullable
    public BaseViewHolder setText(int viewId, int strId) {
        ((TextView) getView(viewId)).setText(strId);
        return this;
    }
}
