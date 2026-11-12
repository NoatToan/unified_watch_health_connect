package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.smalltool.ToolViewModel;
import com.xiaomi.hm.health.smalltool.model.Tool;

/* JADX INFO: loaded from: classes20.dex */
public abstract class SmallToolGridItemBinding extends ViewDataBinding {

    @NonNull
    public final CardView bgCardView;

    @Bindable
    public Tool mItem;

    @Bindable
    public ToolViewModel mViewmodel;

    @NonNull
    public final ImageView toolIcon;

    @NonNull
    public final ShapeableImageView toolIconBk;

    @NonNull
    public final ImageView toolIconCard;

    @NonNull
    public final ShapeableImageView toolIconCardBk;

    @NonNull
    public final TextView toolName;

    @NonNull
    public final TextView toolNameCard;

    public SmallToolGridItemBinding(Object _bindingComponent, View _root, int _localFieldCount, CardView bgCardView, ImageView toolIcon, ShapeableImageView toolIconBk, ImageView toolIconCard, ShapeableImageView toolIconCardBk, TextView toolName, TextView toolNameCard) {
        super(_bindingComponent, _root, _localFieldCount);
        this.bgCardView = bgCardView;
        this.toolIcon = toolIcon;
        this.toolIconBk = toolIconBk;
        this.toolIconCard = toolIconCard;
        this.toolIconCardBk = toolIconCardBk;
        this.toolName = toolName;
        this.toolNameCard = toolNameCard;
    }

    public static SmallToolGridItemBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static SmallToolGridItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public Tool getItem() {
        return this.mItem;
    }

    @Nullable
    public ToolViewModel getViewmodel() {
        return this.mViewmodel;
    }

    public abstract void setItem(@Nullable Tool item);

    public abstract void setViewmodel(@Nullable ToolViewModel viewmodel);

    @Deprecated
    public static SmallToolGridItemBinding bind(@NonNull View view, @Nullable Object component) {
        return (SmallToolGridItemBinding) ViewDataBinding.bind(component, view, R.layout.small_tool_grid_item);
    }

    @NonNull
    @Deprecated
    public static SmallToolGridItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (SmallToolGridItemBinding) ViewDataBinding.inflateInternal(inflater, R.layout.small_tool_grid_item, root, attachToRoot, component);
    }

    @NonNull
    public static SmallToolGridItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static SmallToolGridItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (SmallToolGridItemBinding) ViewDataBinding.inflateInternal(inflater, R.layout.small_tool_grid_item, null, false, component);
    }
}
