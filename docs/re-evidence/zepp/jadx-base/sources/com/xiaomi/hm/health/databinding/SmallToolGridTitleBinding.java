package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public abstract class SmallToolGridTitleBinding extends ViewDataBinding {

    @Bindable
    public Integer mTitleResId;

    @NonNull
    public final TextView smallToolDragSortTip;

    @NonNull
    public final TextView smallToolTitle;

    public SmallToolGridTitleBinding(Object _bindingComponent, View _root, int _localFieldCount, TextView smallToolDragSortTip, TextView smallToolTitle) {
        super(_bindingComponent, _root, _localFieldCount);
        this.smallToolDragSortTip = smallToolDragSortTip;
        this.smallToolTitle = smallToolTitle;
    }

    public static SmallToolGridTitleBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static SmallToolGridTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public Integer getTitleResId() {
        return this.mTitleResId;
    }

    public abstract void setTitleResId(@Nullable Integer titleResId);

    @Deprecated
    public static SmallToolGridTitleBinding bind(@NonNull View view, @Nullable Object component) {
        return (SmallToolGridTitleBinding) ViewDataBinding.bind(component, view, R.layout.small_tool_grid_title);
    }

    @NonNull
    @Deprecated
    public static SmallToolGridTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (SmallToolGridTitleBinding) ViewDataBinding.inflateInternal(inflater, R.layout.small_tool_grid_title, root, attachToRoot, component);
    }

    @NonNull
    public static SmallToolGridTitleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static SmallToolGridTitleBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (SmallToolGridTitleBinding) ViewDataBinding.inflateInternal(inflater, R.layout.small_tool_grid_title, null, false, component);
    }
}
