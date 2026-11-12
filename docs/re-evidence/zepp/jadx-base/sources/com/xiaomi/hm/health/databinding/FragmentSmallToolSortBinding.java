package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.smalltool.ToolSortFragment;
import com.xiaomi.hm.health.smalltool.ToolViewModel;

/* JADX INFO: loaded from: classes20.dex */
public abstract class FragmentSmallToolSortBinding extends ViewDataBinding {

    @NonNull
    public final ImageButton btnBack;

    @NonNull
    public final TextView btnCancel;

    @NonNull
    public final TextView btnEdit;

    @NonNull
    public final TextView btnFinish;

    @NonNull
    public final View divider;

    @NonNull
    public final FrameLayout header;

    @Bindable
    public ToolSortFragment.MyHandler mHandler;

    @Bindable
    public ToolViewModel mViewmodel;

    @NonNull
    public final RecyclerView recyclerView;

    public FragmentSmallToolSortBinding(Object _bindingComponent, View _root, int _localFieldCount, ImageButton btnBack, TextView btnCancel, TextView btnEdit, TextView btnFinish, View divider, FrameLayout header, RecyclerView recyclerView) {
        super(_bindingComponent, _root, _localFieldCount);
        this.btnBack = btnBack;
        this.btnCancel = btnCancel;
        this.btnEdit = btnEdit;
        this.btnFinish = btnFinish;
        this.divider = divider;
        this.header = header;
        this.recyclerView = recyclerView;
    }

    public static FragmentSmallToolSortBinding bind(@NonNull View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    public static FragmentSmallToolSortBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Nullable
    public ToolSortFragment.MyHandler getHandler() {
        return this.mHandler;
    }

    @Nullable
    public ToolViewModel getViewmodel() {
        return this.mViewmodel;
    }

    public abstract void setHandler(@Nullable ToolSortFragment.MyHandler handler);

    public abstract void setViewmodel(@Nullable ToolViewModel viewmodel);

    @Deprecated
    public static FragmentSmallToolSortBinding bind(@NonNull View view, @Nullable Object component) {
        return (FragmentSmallToolSortBinding) ViewDataBinding.bind(component, view, R.layout.fragment_small_tool_sort);
    }

    @NonNull
    @Deprecated
    public static FragmentSmallToolSortBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
        return (FragmentSmallToolSortBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_small_tool_sort, root, attachToRoot, component);
    }

    @NonNull
    public static FragmentSmallToolSortBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @NonNull
    @Deprecated
    public static FragmentSmallToolSortBinding inflate(@NonNull LayoutInflater inflater, @Nullable Object component) {
        return (FragmentSmallToolSortBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_small_tool_sort, null, false, component);
    }
}
