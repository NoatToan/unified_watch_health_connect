package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.smalltool.ToolViewModel;
import com.xiaomi.hm.health.smalltool.model.Tool;

/* JADX INFO: loaded from: classes20.dex */
public abstract class MyToolsGridItemBinding extends ViewDataBinding {

    @Bindable
    public Tool mItem;

    @Bindable
    public ToolViewModel mViewmodel;

    @NonNull
    public final ImageView toolIcon;

    @NonNull
    public final ShapeableImageView toolIconBk;

    @NonNull
    public final TextView toolName;

    public MyToolsGridItemBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageView toolIcon, ShapeableImageView toolIconBk, TextView toolName) {
        super(_bindingComponent, _root, _localFieldCount);
        this.toolIcon = toolIcon;
        this.toolIconBk = toolIconBk;
        this.toolName = toolName;
    }

    public static MyToolsGridItemBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static MyToolsGridItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
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
    public static MyToolsGridItemBinding bind(@NonNull View view, @Nullable Object component) {
        return (MyToolsGridItemBinding) ViewDataBinding.bind(component, view, R.layout.my_tools_grid_item);
    }

    @NonNull
    @Deprecated
    public static MyToolsGridItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (MyToolsGridItemBinding) ViewDataBinding.inflateInternal(inflater, R.layout.my_tools_grid_item, root, attachToRoot, component);
    }

    @NonNull
    public static MyToolsGridItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static MyToolsGridItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (MyToolsGridItemBinding) ViewDataBinding.inflateInternal(inflater, R.layout.my_tools_grid_item, null, false, component);
    }
}
