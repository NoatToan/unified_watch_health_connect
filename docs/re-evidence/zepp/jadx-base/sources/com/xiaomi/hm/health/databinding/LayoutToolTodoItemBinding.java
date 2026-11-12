package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class LayoutToolTodoItemBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final AppCompatImageView toolTodoCheck;

    @NonNull
    public final AppCompatTextView toolTodoContent;

    @NonNull
    public final AppCompatTextView toolTodoSubtitle;

    private LayoutToolTodoItemBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatImageView toolTodoCheck, @NonNull AppCompatTextView toolTodoContent, @NonNull AppCompatTextView toolTodoSubtitle) {
        this.a = rootView;
        this.toolTodoCheck = toolTodoCheck;
        this.toolTodoContent = toolTodoContent;
        this.toolTodoSubtitle = toolTodoSubtitle;
    }

    @NonNull
    public static LayoutToolTodoItemBinding bind(@NonNull View rootView) {
        int i = R.id.tool_todo_check;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.tool_todo_check);
        if (appCompatImageView != null) {
            i = R.id.tool_todo_content;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_todo_content);
            if (appCompatTextView != null) {
                i = R.id.tool_todo_subtitle;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) ViewBindings.findChildViewById(rootView, R.id.tool_todo_subtitle);
                if (appCompatTextView2 != null) {
                    return new LayoutToolTodoItemBinding((ConstraintLayout) rootView, appCompatImageView, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutToolTodoItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutToolTodoItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_tool_todo_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
